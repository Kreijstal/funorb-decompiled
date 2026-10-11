/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends com.ms.dll.Callback {
    private volatile boolean field_a;
    private int field_d;
    private volatile int field_e;
    private volatile int field_b;
    private boolean field_c;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_b) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
            }
            this.field_b = 0;
            this.field_a = true;
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          if (this.field_a) {
            stackIn_7_0 = this.field_d;
          } else {
            stackIn_7_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (1 == var5Lifetime1) {
          if (this.field_a) {
            stackIn_16_0 = this.field_d;
          } else {
            stackIn_16_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_16_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          this.field_b = 0;
          this.field_a = true;
          return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
        }
        if (this.field_a) {
          stackIn_21_0 = this.field_d;
        } else {
          stackIn_21_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_21_0);
        return 0;
    }

    final void a(java.awt.Component param0, boolean param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_5_0 = false;
        int stackIn_6_1 = 0;
        boolean stackIn_22_1 = false;
        boolean stackIn_28_1 = false;
        Throwable decompiledCaughtException = null;
        if (param2) {
          return;
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_b) {
          stackIn_5_0 = this.field_a;
          stackIn_6_1 = (param1) ? 0 : 1;
          if ((stackIn_5_0 ? 1 : 0) != stackIn_6_1) {
            return;
          }
        }
        if (!this.field_c) {
          this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (this.field_b == var5) {
          stackIn_28_1 = (param1);
          this.field_a = stackIn_28_1;
        } else {
          if (this.field_b != 0) {
            this.field_a = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_e);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_b = var5;
            this.field_e = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
          }
          stackIn_22_1 = (param1);
          this.field_a = stackIn_22_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    cp() {
        this.field_a = true;
    }

    final void a(int param0, int param1, byte param2) {
        com.ms.win32.User32.SetCursorPos(param0, param1);
        if (param2 <= 98) {
          this.callback(-91, 12, 96, -5);
        }
    }
}
