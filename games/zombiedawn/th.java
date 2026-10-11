/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends com.ms.dll.Callback {
    private volatile int field_a;
    private int field_d;
    private volatile boolean field_b;
    private volatile int field_e;
    private boolean field_c;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
            }
            this.field_a = 0;
            this.field_b = true;
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          if (!this.field_b) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = this.field_d;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (var5Lifetime1 == 1) {
          if (!this.field_b) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = this.field_d;
          }
          com.ms.win32.User32.SetCursor(stackIn_16_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          this.field_a = 0;
          this.field_b = true;
          return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
        }
        if (!this.field_b) {
          stackIn_21_0 = 0;
        } else {
          stackIn_21_0 = this.field_d;
        }
        com.ms.win32.User32.SetCursor(stackIn_21_0);
        return 0;
    }

    final void a(java.awt.Component param0, boolean param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_23_1 = false;
        boolean stackIn_29_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_a) {
          stackIn_4_0 = (param2) ? 0 : 1;
          if (stackIn_4_0 != (this.field_b ? 1 : 0)) {
            return;
          }
        }
        if (!this.field_c) {
          this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (!param1) {
          return;
        }
        if (this.field_a == var5) {
          stackIn_29_1 = (param2);
          this.field_b = stackIn_29_1;
        } else {
          if (this.field_a != 0) {
            this.field_b = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_e);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_a = var5;
            this.field_e = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
          }
          stackIn_23_1 = (param2);
          this.field_b = stackIn_23_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != -70) {
          return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    th() {
        this.field_b = true;
    }
}
