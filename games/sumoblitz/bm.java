/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends com.ms.dll.Callback {
    private int field_e;
    private volatile boolean field_d;
    private volatile int field_c;
    private boolean field_b;
    private volatile int field_a;

    final void a(boolean param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_16_1 = false;
        boolean stackIn_28_1 = false;
        Throwable decompiledCaughtException = null;
        if (param0) {
          return;
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_a) {
          stackIn_6_0 = (param1) ? 0 : 1;
          if (stackIn_6_0 != (this.field_d ? 1 : 0)) {
            return;
          }
        }
        if (!this.field_b) {
          this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_b = true;
        }
        if (var5 == this.field_a) {
          stackIn_16_1 = (param1);
          this.field_d = stackIn_16_1;
        } else {
          if (0 != this.field_a) {
            this.field_d = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_c);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_a = var5;
            this.field_c = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
          }
          stackIn_28_1 = (param1);
          this.field_d = stackIn_28_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_a != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
            }
            this.field_a = 0;
            this.field_d = true;
            return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
          }
          if (!this.field_d) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = this.field_e;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (this.field_d) {
            stackIn_16_0 = this.field_e;
          } else {
            stackIn_16_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_16_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
          }
          this.field_a = 0;
          this.field_d = true;
          return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
        }
        if (!this.field_d) {
          stackIn_21_0 = 0;
        } else {
          stackIn_21_0 = this.field_e;
        }
        com.ms.win32.User32.SetCursor(stackIn_21_0);
        return 0;
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 <= 53) {
          return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    bm() {
        this.field_d = true;
    }
}
