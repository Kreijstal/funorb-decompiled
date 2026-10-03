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
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_22_1 = false;
        boolean stackIn_28_1 = false;
        Throwable decompiledCaughtException = null;
        if (methodGuard != 12758) {
          this.callbackRootAllocated = true;
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.windowHandle == var5) {
          stackIn_6_0 = (this.cursorVisible) ? 0 : 1;
          if (stackIn_6_0 != (visible ? 1 : 0)) {
            return;
          }
        }
        if (!this.callbackRootAllocated) {
          this.arrowCursorHandle = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.callbackRootAllocated = true;
        }
        if (var5 == this.windowHandle) {
          if (!visible) {
            stackIn_28_1 = false;
          } else {
            stackIn_28_1 = true;
          }
          ((WindowsCursorController) (this)).cursorVisible = stackIn_28_1;
        } else {
          if (0 != this.windowHandle) {
            this.cursorVisible = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.windowHandle, -4, this.previousWindowProcedure);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.windowHandle = var5;
            this.previousWindowProcedure = com.ms.win32.User32.SetWindowLong(this.windowHandle, -4, this);
          }
          if (!visible) {
            stackIn_22_1 = false;
          } else {
            stackIn_22_1 = true;
          }
          ((WindowsCursorController) (this)).cursorVisible = stackIn_22_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void moveCursor(int methodGuard, int y, int x) {
        com.ms.win32.User32.SetCursorPos(x, y);
        if (methodGuard > -45) {
            java.awt.Component var5 = (java.awt.Component) null;
            this.setCursorVisible(74, true, (java.awt.Component) null);
        }
    }

    final synchronized int callback(int windowHandle, int messageId, int wParam, int lParam) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        if (this.windowHandle != windowHandle) {
          var5 = com.ms.win32.User32.GetWindowLong(windowHandle, -4);
          return com.ms.win32.User32.CallWindowProc(var5, windowHandle, messageId, wParam, lParam);
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
            stackIn_7_0 = this.arrowCursorHandle;
          } else {
            stackIn_7_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        var5 = 65535 & lParam;
        if (var5 == 1) {
          if (!this.cursorVisible) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = this.arrowCursorHandle;
          }
          com.ms.win32.User32.SetCursor(stackIn_16_0);
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
          stackIn_21_0 = this.arrowCursorHandle;
        } else {
          stackIn_21_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_21_0);
        return 0;
    }

    WindowsCursorController() {
        this.cursorVisible = true;
    }
}
