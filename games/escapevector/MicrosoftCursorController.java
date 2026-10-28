/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MicrosoftCursorController extends com.ms.dll.Callback {
    private boolean callbackInstalled;
    private int arrowCursor;
    private volatile boolean cursorVisible;
    private volatile int previousWindowProc;
    private volatile int windowHandle;

    final void movePointer(int y, int x, int guard) {
        if (guard == -11154) {
          com.ms.win32.User32.SetCursorPos(x, y);
          return;
        }
        java.awt.Component var5 = (java.awt.Component) null;
        this.setCursorVisible((java.awt.Component) null, true, (byte) 3);
        com.ms.win32.User32.SetCursorPos(x, y);
    }

    final void setCursorVisible(java.awt.Component component, boolean visible, byte guard) {
        Object var6 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        com.ms.awt.WComponentPeer var9 = (com.ms.awt.WComponentPeer) null;
        int var5 = var9.getTopHwnd();
        if (guard < 84) {
          return;
        }
        if (var5 == this.windowHandle &&
          this.cursorVisible == visible) {
          return;
        }
        if (!this.callbackInstalled) {
          this.arrowCursor = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.callbackInstalled = true;
        }
        if (this.windowHandle == var5) {
          boolean stackIn_26_1 = (visible);
          this.cursorVisible = stackIn_26_1;
        } else {
          if (this.windowHandle != 0) {
            this.cursorVisible = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.windowHandle, -4, this.previousWindowProc);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.windowHandle = var5;
            this.previousWindowProc = com.ms.win32.User32.SetWindowLong(this.windowHandle, -4, this);
          }
          boolean stackIn_20_1 = (visible);
          this.cursorVisible = stackIn_20_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        if (param0 != this.windowHandle) {
          int var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.previousWindowProc, param0, param1, param2, param3);
            }
            this.windowHandle = 0;
            this.cursorVisible = true;
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProc, param0, param1, param2, param3);
          }
          if (!this.cursorVisible) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = this.arrowCursor;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        int var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (!this.cursorVisible) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = this.arrowCursor;
          }
          com.ms.win32.User32.SetCursor(stackIn_16_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProc, param0, param1, param2, param3);
          }
          this.windowHandle = 0;
          this.cursorVisible = true;
          return com.ms.win32.User32.CallWindowProc(this.previousWindowProc, param0, param1, param2, param3);
        }
        if (!this.cursorVisible) {
          stackIn_21_0 = 0;
        } else {
          stackIn_21_0 = this.arrowCursor;
        }
        com.ms.win32.User32.SetCursor(stackIn_21_0);
        return 0;
    }

    MicrosoftCursorController() {
        this.cursorVisible = true;
    }
}
