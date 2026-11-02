/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MicrosoftCursorController extends com.ms.dll.Callback {
    private volatile int windowHandle;
    private volatile int previousWindowProcedure;
    private volatile boolean cursorVisible;
    private boolean callbackAllocated;
    private int arrowCursor;

    final void movePointer(int y, int obfuscationGuard, int x) {
        com.ms.win32.User32.SetCursorPos(x, y);
        if (obfuscationGuard <= 60) {
          this.cursorVisible = false;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.windowHandle != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (param1 != 101024) {
            if (param1 == 1) {
              this.windowHandle = 0;
              this.cursorVisible = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, param0, param1, param2, param3);
          }
          if (!this.cursorVisible) {
            stackIn_11_0 = 0;
          } else {
            stackIn_11_0 = this.arrowCursor;
          }
          com.ms.win32.User32.SetCursor(stackIn_11_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (1 == var5Lifetime1) {
          if (!this.cursorVisible) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = this.arrowCursor;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 == 1) {
            this.windowHandle = 0;
            this.cursorVisible = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, param0, param1, param2, param3);
        }
        if (!this.cursorVisible) {
          stackIn_26_0 = 0;
        } else {
          stackIn_26_0 = this.arrowCursor;
        }
        com.ms.win32.User32.SetCursor(stackIn_26_0);
        return 0;
    }

    final void setCursorVisible(int obfuscationGuard, boolean visible, java.awt.Component component) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_12_1 = false;
        boolean stackIn_24_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.windowHandle &&
          visible == this.cursorVisible) {
          return;
        }
        if (obfuscationGuard <= 40) {
          return;
        }
        if (!this.callbackAllocated) {
          this.arrowCursor = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.callbackAllocated = true;
        }
        if (var5 == this.windowHandle) {
          stackIn_12_1 = (visible);
          this.cursorVisible = stackIn_12_1;
        } else {
          if (this.windowHandle != 0) {
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
          stackIn_24_1 = (visible);
          this.cursorVisible = stackIn_24_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    MicrosoftCursorController() {
        this.cursorVisible = true;
    }
}
