/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends com.ms.dll.Callback {
    private volatile boolean field_c;
    private volatile int field_a;
    private volatile int field_e;
    private int field_d;
    private boolean field_b;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_e != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
            }
            this.field_e = 0;
            this.field_c = true;
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          if (this.field_c) {
            stackIn_8_0 = this.field_d;
          } else {
            stackIn_8_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_8_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (var5Lifetime1 == 1) {
          if (!this.field_c) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = this.field_d;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          this.field_e = 0;
          this.field_c = true;
          return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
        }
        if (this.field_c) {
          stackIn_22_0 = this.field_d;
        } else {
          stackIn_22_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_22_0);
        return 0;
    }

    final void a(boolean param0, int param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_12_1 = false;
        boolean stackIn_25_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_e == var5) {
          stackIn_3_0 = param0;
          stackIn_4_1 = (this.field_c) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (!this.field_b) {
          this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_b = true;
        }
        if (var5 == this.field_e) {
          stackIn_12_1 = (param0);
          this.field_c = stackIn_12_1;
        } else {
          if (0 != this.field_e) {
            this.field_c = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_a);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_e = var5;
            this.field_a = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
          }
          stackIn_25_1 = (param0);
          this.field_c = stackIn_25_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, param1);
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 101024) {
          this.field_d = 0;
          com.ms.win32.User32.SetCursorPos(param0, param2);
          return;
        }
        com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    t() {
        this.field_c = true;
    }
}
