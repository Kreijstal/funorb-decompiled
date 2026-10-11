/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends com.ms.dll.Callback {
    private int field_b;
    private volatile int field_e;
    private boolean field_d;
    private volatile int field_c;
    private volatile boolean field_a;

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param0, param2);
        if (param1 != -4) {
          this.callback(-126, -112, 29, -80);
        }
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_22_1 = false;
        boolean stackIn_28_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_c == var5) {
          stackIn_3_0 = param0;
          stackIn_4_1 = (this.field_a) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (!this.field_d) {
          this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_d = true;
        }
        if (var5 == this.field_c) {
          stackIn_28_1 = (param0);
          this.field_a = stackIn_28_1;
        } else {
          if (this.field_c != 0) {
            this.field_a = true;
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
          stackIn_22_1 = (param0);
          this.field_a = stackIn_22_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, param2);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_c != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
            }
            this.field_c = 0;
            this.field_a = true;
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          if (!this.field_a) {
            stackIn_21_0 = 0;
          } else {
            stackIn_21_0 = this.field_b;
          }
          com.ms.win32.User32.SetCursor(stackIn_21_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (1 == var5Lifetime1) {
          if (this.field_a) {
            stackIn_7_0 = this.field_b;
          } else {
            stackIn_7_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          this.field_c = 0;
          this.field_a = true;
          return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
        }
        if (!this.field_a) {
          stackIn_12_0 = 0;
        } else {
          stackIn_12_0 = this.field_b;
        }
        com.ms.win32.User32.SetCursor(stackIn_12_0);
        return 0;
    }

    pp() {
        this.field_a = true;
    }
}
