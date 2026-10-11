/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends com.ms.dll.Callback {
    private volatile int field_a;
    private volatile int field_e;
    private boolean field_c;
    private int field_d;
    private volatile boolean field_b;

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
        if (32 != param1) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
            }
            this.field_e = 0;
            this.field_b = true;
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          if (!this.field_b) {
            stackIn_8_0 = 0;
          } else {
            stackIn_8_0 = this.field_d;
          }
          com.ms.win32.User32.SetCursor(stackIn_8_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (1 == var5Lifetime1) {
          if (this.field_b) {
            stackIn_17_0 = this.field_d;
          } else {
            stackIn_17_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          this.field_e = 0;
          this.field_b = true;
          return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
        }
        if (!this.field_b) {
          stackIn_22_0 = 0;
        } else {
          stackIn_22_0 = this.field_d;
        }
        com.ms.win32.User32.SetCursor(stackIn_22_0);
        return 0;
    }

    final void a(boolean param0, java.awt.Component param1, byte param2) {
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_23_1 = false;
        boolean stackIn_29_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        int var6 = 0;
        Object var6_ref_Object = null;
        com.ms.awt.WComponentPeer var9 = null;
        int var6Lifetime1;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_e) {
          stackIn_3_0 = this.field_b;
          stackIn_4_1 = (param0) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (!this.field_c) {
          this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (var5 == this.field_e) {
          stackIn_29_1 = (param0);
          this.field_b = stackIn_29_1;
          var6 = 126 / ((28 - param2) / 47);
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
        if (0 != this.field_e) {
          this.field_b = true;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          var6_ref_Object = this;
          synchronized (var6_ref_Object) {
            com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_a);
          }
        }
        var6_ref_Object = this;
        synchronized (var6_ref_Object) {
          this.field_e = var5;
          this.field_a = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
        }
        stackIn_23_1 = (param0);
        this.field_b = stackIn_23_1;
        var6Lifetime1 = 126 / ((28 - param2) / 47);
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, int param1, byte param2) {
        com.ms.win32.User32.SetCursorPos(param0, param1);
        if (param2 != -98) {
          java.awt.Component var5 = (java.awt.Component) null;
          this.a(false, (java.awt.Component) null, (byte) -80);
        }
    }

    ae() {
        this.field_b = true;
    }
}
