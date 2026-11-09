/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MicrosoftCursorCallback extends com.ms.dll.Callback {
    private int defaultCursor;
    private volatile boolean cursorVisible;
    private volatile int previousWindowProcedure;
    private boolean rooted;
    private volatile int windowHandle;

    final void setCursorVisible(boolean guard, boolean visible, java.awt.Component component) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_16_1 = false;
        boolean stackIn_28_1 = false;
        Throwable decompiledCaughtException = null;
        if (guard) {
          return;
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.windowHandle) {
          stackIn_6_0 = (visible) ? 0 : 1;
          if (stackIn_6_0 != (this.cursorVisible ? 1 : 0)) {
            return;
          }
        }
        if (!this.rooted) {
          this.defaultCursor = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.rooted = true;
        }
        if (var5 == this.windowHandle) {
          stackIn_16_1 = (visible);
          this.cursorVisible = stackIn_16_1;
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
          stackIn_28_1 = (visible);
          this.cursorVisible = stackIn_28_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final synchronized int callback(int window, int message, int wParam, int lParam) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.windowHandle != window) {
          var5 = com.ms.win32.User32.GetWindowLong(window, -4);
          return com.ms.win32.User32.CallWindowProc(var5, window, message, wParam, lParam);
        }
        if (32 != message) {
          if (message != 101024) {
            if (message != 1) {
              return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, window, message, wParam, lParam);
            }
            this.windowHandle = 0;
            this.cursorVisible = true;
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, window, message, wParam, lParam);
          }
          if (!this.cursorVisible) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = this.defaultCursor;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        var5Lifetime1 = lParam & 65535;
        if (var5Lifetime1 == 1) {
          if (this.cursorVisible) {
            stackIn_16_0 = this.defaultCursor;
          } else {
            stackIn_16_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_16_0);
          return 0;
        }
        if (message != 101024) {
          if (message != 1) {
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, window, message, wParam, lParam);
          }
          this.windowHandle = 0;
          this.cursorVisible = true;
          return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, window, message, wParam, lParam);
        }
        if (!this.cursorVisible) {
          stackIn_21_0 = 0;
        } else {
          stackIn_21_0 = this.defaultCursor;
        }
        com.ms.win32.User32.SetCursor(stackIn_21_0);
        return 0;
    }

    final void movePointer(int y, int x, byte guard) {
        if (guard <= 53) {
          return;
        }
        com.ms.win32.User32.SetCursorPos(x, y);
    }

    MicrosoftCursorCallback() {
        this.cursorVisible = true;
    }
}
