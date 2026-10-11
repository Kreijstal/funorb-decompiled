/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends com.ms.dll.Callback {
    private volatile boolean field_d;
    private int field_c;
    private boolean field_a;
    private volatile int field_e;
    private volatile int field_b;

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Throwable var9 = null;
        com.ms.awt.WComponentPeer var10 = null;
        boolean stackIn_19_1 = false;
        boolean stackIn_25_1 = false;
        Throwable decompiledCaughtException = null;
        var10 = (com.ms.awt.WComponentPeer) null;
        var5 = -83 / ((0 - param2) / 49);
        var6 = var10.getTopHwnd();
        if (var6 == this.field_e &&
          this.field_d == param0) {
          return;
        }
        if (!this.field_a) {
          this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (this.field_e == var6) {
          stackIn_25_1 = (param0);
          this.field_d = stackIn_25_1;
        } else {
          if (this.field_e != 0) {
            this.field_d = true;
            com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
            var7 = this;
            synchronized (var7) {
              com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_b);
            }
          }
          var7 = this;
          synchronized (var7) {
            this.field_e = var6;
            this.field_b = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
          }
          stackIn_19_1 = (param0);
          this.field_d = stackIn_19_1;
        }
        com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
    }

    final void a(int param0, boolean param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param0);
        if (!param1) {
          this.field_b = 108;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_e != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (1 != param1) {
              return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
            }
            this.field_e = 0;
            this.field_d = true;
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          if (!this.field_d) {
            stackIn_8_0 = 0;
          } else {
            stackIn_8_0 = this.field_c;
          }
          com.ms.win32.User32.SetCursor(stackIn_8_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (this.field_d) {
            stackIn_17_0 = this.field_c;
          } else {
            stackIn_17_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (param1 != 101024) {
          if (1 != param1) {
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          this.field_e = 0;
          this.field_d = true;
          return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
        }
        if (!this.field_d) {
          stackIn_23_0 = 0;
        } else {
          stackIn_23_0 = this.field_c;
        }
        com.ms.win32.User32.SetCursor(stackIn_23_0);
        return 0;
    }

    sc() {
        this.field_d = true;
    }
}
