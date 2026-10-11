/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fr extends ma {
    static nl field_o;
    static String field_m;
    static int field_n;
    long field_p;
    byte[] field_l;
    static int field_s;
    static String field_q;
    int field_r;
    static int field_u;
    static int field_t;

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (0 < param1) {
          var2 = 1;
          if (param1 > 65535) {
            param1 = param1 >> 16;
            var2 += 16;
          }
          if (param1 > 255) {
            var2 += 8;
            param1 = param1 >> 8;
          }
          if (param1 > 15) {
            param1 = param1 >> 4;
            var2 += 4;
          }
          if (param1 > 3) {
            var2 += 2;
            param1 = param1 >> 2;
          }
          if (param1 > 1) {
            var2++;
            param1 = param1 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (-65536 > param1) {
          var2Lifetime1 += 16;
          param1 = param1 >> 16;
        }
        if (param0 != 16) {
          fr.c((byte) -52);
        }
        if (-256 > param1) {
          param1 = param1 >> 8;
          var2Lifetime1 += 8;
        }
        if (param1 < -16) {
          param1 = param1 >> 4;
          var2Lifetime1 += 4;
        }
        if (param1 < -4) {
          var2Lifetime1 += 2;
          param1 = param1 >> 2;
        }
        if (param1 < -2) {
          var2Lifetime1++;
          param1 = param1 >> 1;
        }
        return var2Lifetime1;
    }

    final static void a(int param0, kg param1, int param2) {
        oq var6 = null;
        int var4 = 0;
        try {
          var6 = ej.field_j;
          oq var3 = var6;
          var6.b(false, param2);
          var6.field_v = var6.field_v + 1;
          var4 = var6.field_v;
          var6.a(1, false);
          if (null != param1.field_p) {
            var6.a(param1.field_p.length, false);
            var6.a(param1.field_p, (byte) 0, 0, param1.field_p.length);
          } else {
            var6.a(0, false);
          }
          int var5 = 48 / ((param0 - 52) / 40);
          var6.d(-1, var4);
          var6.field_v = var6.field_v - 4;
          param1.field_o = var6.b(true);
          var6.b(-var4 + var6.field_v, true);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fr.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var2 = (-640 + field_s) / 2;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param0 <= -21) {
          var3 = ir.field_h * ir.field_h;
          var4 = var3 - param1 * param1;
          so.field_k.b(90, 2147483647, var2 - 199 * var4 / var3, 199, -90 + (-4 + (-120 + qh.field_f)));
          uq.field_f.b(0, 2147483647, 202 + (var2 + 438 * var4 / var3), 438, -120 + qh.field_f - 4);
          return;
        }
        field_s = -62;
        var3Lifetime1 = ir.field_h * ir.field_h;
        var4Lifetime1 = var3Lifetime1 - param1 * param1;
        so.field_k.b(90, 2147483647, var2 - 199 * var4Lifetime1 / var3Lifetime1, 199, -90 + (-4 + (-120 + qh.field_f)));
        uq.field_f.b(0, 2147483647, 202 + (var2 + 438 * var4Lifetime1 / var3Lifetime1), 438, -120 + qh.field_f - 4);
    }

    public static void c(byte param0) {
        field_m = null;
        field_q = null;
        field_o = null;
        if (param0 < 39) {
          fr.a(-16, 120);
        }
    }

    fr(long param0, int param1, byte[] param2) {
        try {
          this.field_p = param0;
          this.field_l = param2;
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fr.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Please check if address is correct";
        field_o = new nl();
        field_q = "Who can join";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$e9dea5688aa5(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var2 = (-640 + field_s) / 2;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param0 <= -21) {
          var3 = ir.field_h * ir.field_h;
          var4 = var3 - param1 * param1;
          so.field_k.b(90, 2147483647, var2 - 199 * var4 / var3, 199, -90 + (-4 + (-120 + qh.field_f)));
          uq.field_f.b(0, 2147483647, 202 + (var2 + 438 * var4 / var3), 438, -120 + qh.field_f - 4);
          return;
        }
        field_s = -62;
        var3Lifetime1 = ir.field_h * ir.field_h;
        var4Lifetime1 = var3Lifetime1 - param1 * param1;
        so.field_k.b(90, 2147483647, var2 - 199 * var4Lifetime1 / var3Lifetime1, 199, -90 + (-4 + (-120 + qh.field_f)));
        uq.field_f.b(0, 2147483647, 202 + (var2 + 438 * var4Lifetime1 / var3Lifetime1), 438, -120 + qh.field_f - 4);
    }
}
