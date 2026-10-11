/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends com.ms.dll.Callback {
    private volatile boolean field_e;
    private volatile int field_b;
    private volatile int field_d;
    private boolean field_a;
    private int field_c;

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_16_1 = false;
        boolean stackIn_29_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_d == var5) {
          stackIn_4_0 = (this.field_e) ? 0 : 1;
          stackIn_7_1 = (param0) ? 0 : 1;
          if (stackIn_4_0 == stackIn_7_1) {
            return;
          }
        }
        if (!this.field_a) {
          this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (this.field_d == var5) {
          stackIn_16_1 = (param0);
          this.field_e = stackIn_16_1;
        } else {
          if (this.field_d != 0) {
            this.field_e = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_d, -4, this.field_b);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_d = var5;
            this.field_b = com.ms.win32.User32.SetWindowLong(this.field_d, -4, this);
          }
          stackIn_29_1 = (param0);
          this.field_e = stackIn_29_1;
        }
        com.ms.win32.User32.SendMessage(var5, param2, 0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_d) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
            }
            this.field_d = 0;
            this.field_e = true;
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          if (this.field_e) {
            stackIn_23_0 = this.field_c;
          } else {
            stackIn_23_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_23_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (!this.field_e) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = this.field_c;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          this.field_d = 0;
          this.field_e = true;
          return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
        }
        if (this.field_e) {
          stackIn_13_0 = this.field_c;
        } else {
          stackIn_13_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_13_0);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 101024) {
          return;
        }
        com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    be() {
        this.field_e = true;
    }
}
