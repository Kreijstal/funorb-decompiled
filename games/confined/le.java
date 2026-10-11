/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile boolean field_d;
    private boolean field_a;
    private int field_c;
    private volatile int field_e;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (this.field_e != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 == 101024) {
            com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_c);
            return 0;
          }
          if (param1 == 1) {
            this.field_e = 0;
            this.field_d = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          com.ms.win32.User32.SetCursor(this.field_d ? this.field_c : 0);
          return 0;
        }
        if (param1 == 101024) {
          com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_c);
          return 0;
        }
        if (param1 == 1) {
          this.field_e = 0;
          this.field_d = true;
        }
        return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
    }

    final void a(byte param0, java.awt.Component param1, boolean param2) {
        int stackIn_4_0 = 0;
        boolean stackIn_16_1 = false;
        boolean stackIn_31_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_e == var5) {
          stackIn_4_0 = (param2) ? 0 : 1;
          if (stackIn_4_0 != (this.field_d ? 1 : 0)) {
            return;
          }
        }
        if (!this.field_a) {
          this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (var5 == this.field_e) {
          if (param0 >= -62) {
            this.field_c = -104;
          }
          stackIn_16_1 = (param2);
          this.field_d = stackIn_16_1;
        } else {
          if (this.field_e != 0) {
            this.field_d = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_b);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_e = var5;
            this.field_b = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
          }
          if (param0 >= -62) {
            this.field_c = -104;
          }
          stackIn_31_1 = (param2);
          this.field_d = stackIn_31_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(byte param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param2);
        int var4 = -121 / ((param0 + 50) / 38);
    }

    le() {
        this.field_d = true;
    }
}
