/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile int field_d;
    private volatile boolean field_c;
    private int field_e;
    private boolean field_a;

    final void a(int param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_23_1 = false;
        boolean stackIn_29_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_d == var5) {
          stackIn_3_0 = param2;
          stackIn_4_1 = (this.field_c) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (!this.field_a) {
          this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (this.field_d == var5) {
          stackIn_29_1 = (param2);
          this.field_c = stackIn_29_1;
        } else {
          if (this.field_d != 0) {
            this.field_c = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_d, -4, this.field_b);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_d = var5;
            this.field_b = com.ms.win32.User32.SetWindowLong(this.field_d, -4, this);
          }
          stackIn_23_1 = (param2);
          this.field_c = stackIn_23_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, param0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_d != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (101024 != param1) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
            }
            this.field_d = 0;
            this.field_c = true;
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          if (this.field_c) {
            stackIn_9_0 = this.field_e;
          } else {
            stackIn_9_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_9_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (var5Lifetime1 == 1) {
          if (this.field_c) {
            stackIn_18_0 = this.field_e;
          } else {
            stackIn_18_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_18_0);
          return 0;
        }
        if (101024 != param1) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          this.field_d = 0;
          this.field_c = true;
          return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
        }
        if (this.field_c) {
          stackIn_24_0 = this.field_e;
        } else {
          stackIn_24_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_24_0);
        return 0;
    }

    final void a(boolean param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0) {
          this.a(true, 69, -117);
        }
    }

    ue() {
        this.field_c = true;
    }
}
