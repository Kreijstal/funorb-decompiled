/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends com.ms.dll.Callback {
    private volatile boolean field_d;
    private volatile int field_b;
    private boolean field_e;
    private volatile int field_c;
    private int field_a;

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0 != -1340) {
          java.awt.Component var5 = (java.awt.Component) null;
          this.a((java.awt.Component) null, 25, true);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (101024 != param1) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
            }
            this.field_b = 0;
            this.field_d = true;
            return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
          }
          if (!this.field_d) {
            stackIn_8_0 = 0;
          } else {
            stackIn_8_0 = this.field_a;
          }
          com.ms.win32.User32.SetCursor(stackIn_8_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (1 == var5Lifetime1) {
          if (!this.field_d) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = this.field_a;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (101024 != param1) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
          }
          this.field_b = 0;
          this.field_d = true;
          return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
        }
        if (!this.field_d) {
          stackIn_22_0 = 0;
        } else {
          stackIn_22_0 = this.field_a;
        }
        com.ms.win32.User32.SetCursor(stackIn_22_0);
        return 0;
    }

    final void a(java.awt.Component param0, int param1, boolean param2) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Throwable var9 = null;
        com.ms.awt.WComponentPeer var10 = null;
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_13_1 = false;
        boolean stackIn_26_1 = false;
        Throwable decompiledCaughtException = null;
        var5 = -126 % ((-37 - param1) / 58);
        var10 = (com.ms.awt.WComponentPeer) null;
        var6 = var10.getTopHwnd();
        if (var6 == this.field_b) {
          stackIn_3_0 = param2;
          stackIn_4_1 = (this.field_d) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (!this.field_e) {
          this.field_a = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_e = true;
        }
        if (this.field_b == var6) {
          stackIn_13_1 = (param2);
          this.field_d = stackIn_13_1;
        } else {
          if (this.field_b != 0) {
            this.field_d = true;
            com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
            var7 = this;
            synchronized (var7) {
              com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_c);
            }
          }
          var7 = this;
          synchronized (var7) {
            this.field_b = var6;
            this.field_c = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
          }
          stackIn_26_1 = (param2);
          this.field_d = stackIn_26_1;
        }
        com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
    }

    ki() {
        this.field_d = true;
    }
}
