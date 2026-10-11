/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends com.ms.dll.Callback {
    private volatile int field_c;
    private volatile int field_a;
    private int field_d;
    private boolean field_b;
    private volatile boolean field_e;

    final void a(java.awt.Component param0, int param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_12_1 = false;
        boolean stackIn_24_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_a) {
          stackIn_3_0 = param2;
          stackIn_4_1 = (this.field_e) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (!this.field_b) {
          this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_b = true;
        }
        if (var5 == this.field_a) {
          stackIn_12_1 = (param2);
          this.field_e = stackIn_12_1;
        } else {
          if (0 != this.field_a) {
            this.field_e = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_c);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_a = var5;
            this.field_c = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
          }
          stackIn_24_1 = (param2);
          this.field_e = stackIn_24_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, param1);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (101024 != param1) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
            }
            this.field_a = 0;
            this.field_e = true;
            return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
          }
          if (!this.field_e) {
            stackIn_9_0 = 0;
          } else {
            stackIn_9_0 = this.field_d;
          }
          com.ms.win32.User32.SetCursor(stackIn_9_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (1 == var5Lifetime1) {
          if (this.field_e) {
            stackIn_18_0 = this.field_d;
          } else {
            stackIn_18_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_18_0);
          return 0;
        }
        if (101024 != param1) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
          }
          this.field_a = 0;
          this.field_e = true;
          return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
        }
        if (!this.field_e) {
          stackIn_24_0 = 0;
        } else {
          stackIn_24_0 = this.field_d;
        }
        com.ms.win32.User32.SetCursor(stackIn_24_0);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 != -4) {
          this.field_b = true;
        }
    }

    uk() {
        this.field_e = true;
    }
}
