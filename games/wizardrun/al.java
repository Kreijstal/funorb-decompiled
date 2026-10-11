/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends com.ms.dll.Callback {
    private int field_d;
    private volatile int field_e;
    private volatile boolean field_b;
    private boolean field_c;
    private volatile int field_a;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (1 == param1) {
              this.field_a = 0;
              this.field_b = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          if (this.field_b) {
            stackIn_12_0 = this.field_d;
          } else {
            stackIn_12_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_12_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (1 == var5Lifetime1) {
          if (!this.field_b) {
            stackIn_18_0 = 0;
          } else {
            stackIn_18_0 = this.field_d;
          }
          com.ms.win32.User32.SetCursor(stackIn_18_0);
          return 0;
        }
        if (param1 != 101024) {
          if (1 == param1) {
            this.field_a = 0;
            this.field_b = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
        }
        if (this.field_b) {
          stackIn_27_0 = this.field_d;
        } else {
          stackIn_27_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_27_0);
        return 0;
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_26_1 = false;
        boolean stackIn_32_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_a == var5) {
          stackIn_4_0 = (this.field_b) ? 0 : 1;
          stackIn_7_1 = (param1) ? 0 : 1;
          if (stackIn_4_0 == stackIn_7_1) {
            return;
          }
        }
        if (!this.field_c) {
          this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (var5 == this.field_a) {
          stackIn_32_1 = (param1);
          this.field_b = stackIn_32_1;
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
          stackIn_26_1 = (param1);
          this.field_b = stackIn_26_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, param0);
    }

    al() {
        this.field_b = true;
    }

    final void a(int param0, int param1, byte param2) {
        com.ms.win32.User32.SetCursorPos(param0, param1);
        if (param2 != 116) {
          this.a(-41, -9, (byte) 0);
        }
    }
}
