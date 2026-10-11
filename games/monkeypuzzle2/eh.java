/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile boolean field_c;
    private int field_e;
    private volatile int field_a;
    private boolean field_d;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_b) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
            }
            this.field_b = 0;
            this.field_c = true;
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          if (!this.field_c) {
            stackIn_9_0 = 0;
          } else {
            stackIn_9_0 = this.field_e;
          }
          com.ms.win32.User32.SetCursor(stackIn_9_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (var5Lifetime1 == 1) {
          if (this.field_c) {
            stackIn_18_0 = this.field_e;
          } else {
            stackIn_18_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_18_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          this.field_b = 0;
          this.field_c = true;
          return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
        }
        if (!this.field_c) {
          stackIn_24_0 = 0;
        } else {
          stackIn_24_0 = this.field_e;
        }
        com.ms.win32.User32.SetCursor(stackIn_24_0);
        return 0;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != 121) {
          this.field_d = false;
          com.ms.win32.User32.SetCursorPos(param1, param2);
          return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    final void a(boolean param0, byte param1, java.awt.Component param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_16_1 = false;
        boolean stackIn_32_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_b == var5) {
          stackIn_4_0 = (param0) ? 0 : 1;
          stackIn_7_1 = (this.field_c) ? 0 : 1;
          if (stackIn_4_0 == stackIn_7_1) {
            return;
          }
        }
        if (!this.field_d) {
          this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_d = true;
        }
        if (this.field_b == var5) {
          stackIn_16_1 = (param0);
          this.field_c = stackIn_16_1;
        } else {
          if (this.field_b != 0) {
            this.field_c = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_a);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_b = var5;
            this.field_a = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
          }
          stackIn_32_1 = (param0);
          this.field_c = stackIn_32_1;
        }
        if (param1 != 90) {
          this.field_b = 69;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    eh() {
        this.field_c = true;
    }
}
