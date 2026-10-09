/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WindowsCursorController extends com.ms.dll.Callback {
    private volatile boolean cursorVisible;
    private int arrowCursorHandle;
    private boolean callbackRootAllocated;
    private volatile int windowHandle;
    private volatile int previousWindowProcedure;

    final void setCursorVisible(int methodGuard, boolean visible, java.awt.Component component) {
        int targetWindowHandle = 0;
        Object cursorControllerMonitor = null;
        Throwable unusedCursorThrowable = null;
        com.ms.awt.WComponentPeer windowComponentPeer = null;
        int invertedCurrentVisibilityBit = 0;
        boolean replacementWindowVisibilitySnapshot = false;
        boolean sameWindowVisibilitySnapshot = false;
        Throwable unusedCaughtCursorThrowable = null;
        if (methodGuard != 12758) {
          this.callbackRootAllocated = true;
        }
        windowComponentPeer = (com.ms.awt.WComponentPeer) null;
        targetWindowHandle = windowComponentPeer.getTopHwnd();
        if (this.windowHandle == targetWindowHandle) {
          invertedCurrentVisibilityBit = (this.cursorVisible) ? 0 : 1;
          if (invertedCurrentVisibilityBit != (visible ? 1 : 0)) {
            return;
          }
        }
        if (!this.callbackRootAllocated) {
          this.arrowCursorHandle = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.callbackRootAllocated = true;
        }
        if (targetWindowHandle == this.windowHandle) {
          sameWindowVisibilitySnapshot = !(!visible);
          this.cursorVisible = sameWindowVisibilitySnapshot;
        } else {
          if (0 != this.windowHandle) {
            this.cursorVisible = true;
            com.ms.win32.User32.SendMessage(targetWindowHandle, 101024, 0, 0);
            cursorControllerMonitor = this;
            synchronized (cursorControllerMonitor) {
              com.ms.win32.User32.SetWindowLong(this.windowHandle, -4, this.previousWindowProcedure);
            }
          }
          cursorControllerMonitor = this;
          synchronized (cursorControllerMonitor) {
            this.windowHandle = targetWindowHandle;
            this.previousWindowProcedure = com.ms.win32.User32.SetWindowLong(this.windowHandle, -4, this);
          }
          replacementWindowVisibilitySnapshot = !(!visible);
          this.cursorVisible = replacementWindowVisibilitySnapshot;
        }
        com.ms.win32.User32.SendMessage(targetWindowHandle, 101024, 0, 0);
    }

    final void moveCursor(int methodGuard, int y, int x) {
        com.ms.win32.User32.SetCursorPos(x, y);
        if (methodGuard > -45) {
            java.awt.Component nullComponentForInvalidGuard = (java.awt.Component) null;
            this.setCursorVisible(74, true, (java.awt.Component) null);
        }
    }

    final synchronized int callback(int windowHandle, int messageId, int wParam, int lParam) {
        int cursorHandleForPrivateMessage = 0;
        int cursorHandleForClientHitTest = 0;
        int cursorHandleForFallbackMessage = 0;
        int previousProcedureOrHitTestCode;
        int hitTestCode;
        if (this.windowHandle != windowHandle) {
          previousProcedureOrHitTestCode = com.ms.win32.User32.GetWindowLong(windowHandle, -4);
          return com.ms.win32.User32.CallWindowProc(previousProcedureOrHitTestCode, windowHandle, messageId, wParam, lParam);
        }
        if (32 != messageId) {
          if (messageId != 101024) {
            if (1 != messageId) {
              return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, windowHandle, messageId, wParam, lParam);
            }
            this.windowHandle = 0;
            this.cursorVisible = true;
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, windowHandle, messageId, wParam, lParam);
          }
          if (this.cursorVisible) {
            cursorHandleForPrivateMessage = this.arrowCursorHandle;
          } else {
            cursorHandleForPrivateMessage = 0;
          }
          com.ms.win32.User32.SetCursor(cursorHandleForPrivateMessage);
          return 0;
        }
        hitTestCode = 65535 & lParam;
        if (hitTestCode == 1) {
          if (!this.cursorVisible) {
            cursorHandleForClientHitTest = 0;
          } else {
            cursorHandleForClientHitTest = this.arrowCursorHandle;
          }
          com.ms.win32.User32.SetCursor(cursorHandleForClientHitTest);
          return 0;
        }
        if (messageId != 101024) {
          if (1 != messageId) {
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, windowHandle, messageId, wParam, lParam);
          }
          this.windowHandle = 0;
          this.cursorVisible = true;
          return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, windowHandle, messageId, wParam, lParam);
        }
        if (this.cursorVisible) {
          cursorHandleForFallbackMessage = this.arrowCursorHandle;
        } else {
          cursorHandleForFallbackMessage = 0;
        }
        com.ms.win32.User32.SetCursor(cursorHandleForFallbackMessage);
        return 0;
    }

    WindowsCursorController() {
        this.cursorVisible = true;
    }
}
