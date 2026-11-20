/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MicrosoftJvmCursorController extends com.ms.dll.Callback {
    private volatile boolean cursorVisible;
    private boolean initialized;
    private int defaultCursorHandle;
    private volatile int windowHandle;
    private volatile int previousWindowProcedure;

    final void movePointer(int param0, int param1, byte param2) {
        com.ms.win32.User32.SetCursorPos(param1, param0);
        if (param2 >= -30) {
          this.initialized = true;
        }
    }

    final void setCursorVisible(java.awt.Component param0, int param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_22_1 = false;
        boolean stackIn_28_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.windowHandle) {
          stackIn_3_0 = this.cursorVisible;
          stackIn_4_1 = (param2) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (param1 != -4) {
          return;
        }
        if (!this.initialized) {
          this.defaultCursorHandle = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.initialized = true;
        }
        if (var5 == this.windowHandle) {
          stackIn_28_1 = (param2);
          this.cursorVisible = stackIn_28_1;
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
          stackIn_22_1 = (param2);
          this.cursorVisible = stackIn_22_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.windowHandle) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (1 != param1) {
              return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, param0, param1, param2, param3);
            }
            this.windowHandle = 0;
            this.cursorVisible = true;
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, param0, param1, param2, param3);
          }
          if (!this.cursorVisible) {
            stackIn_9_0 = 0;
          } else {
            stackIn_9_0 = this.defaultCursorHandle;
          }
          com.ms.win32.User32.SetCursor(stackIn_9_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (var5Lifetime1 == 1) {
          if (!this.cursorVisible) {
            stackIn_18_0 = 0;
          } else {
            stackIn_18_0 = this.defaultCursorHandle;
          }
          com.ms.win32.User32.SetCursor(stackIn_18_0);
          return 0;
        }
        if (param1 != 101024) {
          if (1 != param1) {
            return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, param0, param1, param2, param3);
          }
          this.windowHandle = 0;
          this.cursorVisible = true;
          return com.ms.win32.User32.CallWindowProc(this.previousWindowProcedure, param0, param1, param2, param3);
        }
        if (!this.cursorVisible) {
          stackIn_24_0 = 0;
        } else {
          stackIn_24_0 = this.defaultCursorHandle;
        }
        com.ms.win32.User32.SetCursor(stackIn_24_0);
        return 0;
    }

    MicrosoftJvmCursorController() {
        this.cursorVisible = true;
    }
}
