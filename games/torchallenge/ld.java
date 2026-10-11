/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends com.ms.dll.Callback {
    private volatile int field_d;
    private boolean field_c;
    private volatile int field_e;
    private int field_a;
    private volatile boolean field_b;

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param0, param2);
        int var4 = 38 % ((param1 + 23) / 46);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_d != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (param1 != 101024) {
            if (param1 == 1) {
              this.field_d = 0;
              this.field_b = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          if (!this.field_b) {
            stackIn_12_0 = 0;
          } else {
            stackIn_12_0 = this.field_a;
          }
          com.ms.win32.User32.SetCursor(stackIn_12_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (var5Lifetime1 == 1) {
          if (this.field_b) {
            stackIn_18_0 = this.field_a;
          } else {
            stackIn_18_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_18_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 == 1) {
            this.field_d = 0;
            this.field_b = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
        }
        if (!this.field_b) {
          stackIn_27_0 = 0;
        } else {
          stackIn_27_0 = this.field_a;
        }
        com.ms.win32.User32.SetCursor(stackIn_27_0);
        return 0;
    }

    final void a(java.awt.Component param0, boolean param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_12_1 = false;
        boolean stackIn_25_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_d) {
          stackIn_4_0 = (this.field_b) ? 0 : 1;
          if (stackIn_4_0 != (param1 ? 1 : 0)) {
            return;
          }
        }
        if (!this.field_c) {
          this.field_a = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (this.field_d == var5) {
          stackIn_12_1 = (param1);
          this.field_b = stackIn_12_1;
        } else {
          if (this.field_d != 0) {
            this.field_b = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_d, -4, this.field_e);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_d = var5;
            this.field_e = com.ms.win32.User32.SetWindowLong(this.field_d, -4, this);
          }
          stackIn_25_1 = (param1);
          this.field_b = stackIn_25_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, param2);
    }

    ld() {
        this.field_b = true;
    }
}
