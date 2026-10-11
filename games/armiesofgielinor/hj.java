/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends com.ms.dll.Callback {
    private volatile int field_e;
    private volatile int field_d;
    private volatile boolean field_b;
    private boolean field_a;
    private int field_c;

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 <= 60) {
          this.field_b = false;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_e != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (param1 != 101024) {
            if (param1 == 1) {
              this.field_e = 0;
              this.field_b = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
          }
          if (!this.field_b) {
            stackIn_11_0 = 0;
          } else {
            stackIn_11_0 = this.field_c;
          }
          com.ms.win32.User32.SetCursor(stackIn_11_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (1 == var5Lifetime1) {
          if (!this.field_b) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = this.field_c;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 == 1) {
            this.field_e = 0;
            this.field_b = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
        }
        if (!this.field_b) {
          stackIn_26_0 = 0;
        } else {
          stackIn_26_0 = this.field_c;
        }
        com.ms.win32.User32.SetCursor(stackIn_26_0);
        return 0;
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_12_1 = false;
        boolean stackIn_24_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_e &&
          param1 == this.field_b) {
          return;
        }
        if (param0 <= 40) {
          return;
        }
        if (!this.field_a) {
          this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (var5 == this.field_e) {
          stackIn_12_1 = (param1);
          this.field_b = stackIn_12_1;
        } else {
          if (this.field_e != 0) {
            this.field_b = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_d);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_e = var5;
            this.field_d = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
          }
          stackIn_24_1 = (param1);
          this.field_b = stackIn_24_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    hj() {
        this.field_b = true;
    }
}
