/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends com.ms.dll.Callback {
    private boolean field_a;
    private int field_b;
    private volatile boolean field_d;
    private volatile int field_e;
    private volatile int field_c;

    final void a(int param0, int param1, int param2) {
        if (param2 == -11154) {
          com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        }
        java.awt.Component var5 = (java.awt.Component) null;
        this.a((java.awt.Component) null, true, (byte) 3);
        com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    final void a(java.awt.Component param0, boolean param1, byte param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_20_1 = false;
        boolean stackIn_26_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (param2 < 84) {
          return;
        }
        if (var5 == this.field_c &&
          this.field_d == param1) {
          return;
        }
        if (!this.field_a) {
          this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (this.field_c == var5) {
          stackIn_26_1 = (param1);
          this.field_d = stackIn_26_1;
        } else {
          if (this.field_c != 0) {
            this.field_d = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_e);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_c = var5;
            this.field_e = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
          }
          stackIn_20_1 = (param1);
          this.field_d = stackIn_20_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
            }
            this.field_c = 0;
            this.field_d = true;
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          if (!this.field_d) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = this.field_b;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (!this.field_d) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = this.field_b;
          }
          com.ms.win32.User32.SetCursor(stackIn_16_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          this.field_c = 0;
          this.field_d = true;
          return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
        }
        if (!this.field_d) {
          stackIn_21_0 = 0;
        } else {
          stackIn_21_0 = this.field_b;
        }
        com.ms.win32.User32.SetCursor(stackIn_21_0);
        return 0;
    }

    fb() {
        this.field_d = true;
    }
}
