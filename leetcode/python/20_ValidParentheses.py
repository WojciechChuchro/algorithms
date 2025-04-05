class Solution:
    def isValid(self, s: str) -> bool:
      closeToOpen = {')': '(', '}': '{', ']': '['}
      stack = []
      if len(s) == 0:
        return True

      for c in s:
        if c in closeToOpen:
          if not stack:
            return False
          if stack.pop() != closeToOpen[c]:
            return False
        else:
          stack.append(c)

      if not stack:
        return True

      return False
        
