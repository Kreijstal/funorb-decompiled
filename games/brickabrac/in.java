/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends com.ms.dll.Callback {
    private volatile boolean field_a;
    private volatile int field_e;
    private volatile int field_b;
    private boolean field_c;
    private int field_d;

    final void a(int param0, int param1, int param2) {
        if (param1 != -4) {
          this.field_c = false;
          com.ms.win32.User32.SetCursorPos(param2, param0);
          return;
        }
        com.ms.win32.User32.SetCursorPos(param2, param0);
    }

    final void a(java.awt.Component param0, int param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_20_1 = false;
        boolean stackIn_26_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_e == var5 &&
          this.field_a == param2) {
          return;
        }
        if (!this.field_c) {
          this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (this.field_e == var5) {
          stackIn_26_1 = (param2);
          this.field_a = stackIn_26_1;
        } else {
          if (this.field_e != 0) {
            this.field_a = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_b);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_e = var5;
            this.field_b = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
          }
          stackIn_20_1 = (param2);
          this.field_a = stackIn_20_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, param1, 0);
    }

    in() {
        this.field_a = true;
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_e) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
            }
            this.field_e = 0;
            this.field_a = true;
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          if (!this.field_a) {
            stackIn_8_0 = 0;
          } else {
            stackIn_8_0 = this.field_d;
          }
          com.ms.win32.User32.SetCursor(stackIn_8_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (1 == var5Lifetime1) {
          if (this.field_a) {
            stackIn_17_0 = this.field_d;
          } else {
            stackIn_17_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          this.field_e = 0;
          this.field_a = true;
          return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
        }
        if (!this.field_a) {
          stackIn_22_0 = 0;
        } else {
          stackIn_22_0 = this.field_d;
        }
        com.ms.win32.User32.SetCursor(stackIn_22_0);
        return 0;
    }
}
