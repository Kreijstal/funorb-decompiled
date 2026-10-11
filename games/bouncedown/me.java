/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends com.ms.dll.Callback {
    private volatile int field_c;
    private int field_b;
    private volatile boolean field_a;
    private boolean field_d;
    private volatile int field_e;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_c) {
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
          if (this.field_a) {
            stackIn_9_0 = this.field_b;
          } else {
            stackIn_9_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_9_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (this.field_a) {
            stackIn_18_0 = this.field_b;
          } else {
            stackIn_18_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_18_0);
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
        if (this.field_a) {
          stackIn_24_0 = this.field_b;
        } else {
          stackIn_24_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_24_0);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 90 % ((param1 + 83) / 33);
        com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_19_1 = false;
        boolean stackIn_32_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        if (param2 != 32512) {
          return;
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_c) {
          stackIn_6_0 = (this.field_a) ? 0 : 1;
          stackIn_9_1 = (param0) ? 0 : 1;
          if (stackIn_6_0 == stackIn_9_1) {
            return;
          }
        }
        if (!this.field_d) {
          this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_d = true;
        }
        if (var5 == this.field_c) {
          stackIn_19_1 = (param0);
          this.field_a = stackIn_19_1;
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
          stackIn_32_1 = (param0);
          this.field_a = stackIn_32_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
        return;
    }

    me() {
        this.field_a = true;
    }
}
