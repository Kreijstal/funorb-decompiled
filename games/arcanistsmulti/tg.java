/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_g;
    static hg field_e;
    static String field_a;
    static int[] field_f;
    private tf field_h;
    static int field_d;
    private tf field_c;
    static ll[] field_b;

    final void a(tf param0, int param1) {
        try {
          if (param0.field_i != null) {
            param0.a((byte) 88);
          }
          param0.field_l = this.field_h;
          param0.field_i = this.field_h.field_i;
          param0.field_i.field_l = param0;
          if (param1 != 15893) {
            this.a((byte) -116);
          }
          param0.field_l.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tg.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean d(int param0) {
        int var2 = -79 / ((param0 - 63) / 45);
        return this.field_h == this.field_h.field_l ? true : false;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param1 >= 22) {
          return rg.a(param0, param2, 13, param3);
        }
        tg.a(101, false, -57, -39);
        return rg.a(param0, param2, 13, param3);
    }

    final tf e(int param0) {
        tf var2 = this.field_c;
        if (this.field_h != var2) {
          this.field_c = var2.field_l;
          int var3 = -86 % ((65 - param0) / 55);
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final tf a(byte param0) {
        tf var2 = null;
        tf var2Lifetime1;
        if (param0 < 115) {
          this.a(-116);
          var2 = this.field_h.field_l;
          if (var2 != this.field_h) {
            var2.a((byte) 88);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_h.field_l;
        if (var2Lifetime1 != this.field_h) {
          var2Lifetime1.a((byte) 88);
          return var2Lifetime1;
        }
        return null;
    }

    final int b(byte param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = 0;
        tf var3 = this.field_h.field_l;
        while (this.field_h != var3) {
          var2++;
          var3 = var3.field_l;
        }
        if (param0 < -64) {
          return var2;
        }
        this.a((byte) 126);
        return var2;
    }

    final void a(int param0) {
        tf var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        while (true) {
          var2 = this.field_h.field_l;
          if (var2 != this.field_h) {
            var2.a((byte) 88);
            continue;
          }
          break;
        }
        if (param0 == 17) {
          this.field_c = null;
          return;
        }
        this.b(100);
        this.field_c = null;
        return;
    }

    public static void c(int param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        field_a = null;
        if (param0 >= -44) {
          return;
        }
        field_g = null;
    }

    final tf b(int param0) {
        if (param0 < 23) {
          return (tf) null;
        }
        tf var2 = this.field_h.field_l;
        if (this.field_h == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_l;
        return var2;
    }

    public tg() {
        this.field_h = new tf();
        this.field_h.field_i = this.field_h;
        this.field_h.field_l = this.field_h;
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param3 != 17) {
          return -27;
        }
        return le.h(-1993);
    }

    static {
        field_g = " turn left";
        field_a = "Connection timed out. Please try using a different server.";
        field_f = new int[17];
    }
}
