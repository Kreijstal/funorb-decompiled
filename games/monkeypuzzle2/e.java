/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static String field_c;
    static int[] field_b;
    static ki[] field_a;

    final static boolean a(boolean param0, int param1, int param2, byte param3) {
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param0) {
          if (gi.field_e[param2] < gi.field_e[param1]) {
            return true;
          }
          if (gi.field_e[param1] < gi.field_e[param2]) {
            return false;
          }
          if (cj.field_c[param1] > cj.field_c[param2]) {
            return true;
          }
          if (cj.field_c[param1] < cj.field_c[param2]) {
            return false;
          }
          var4 = rb.field_fb[param2] + jc.field_a[param2] + hf.field_c[param2];
          var6 = -70 / ((param3 - 51) / 41);
          var5 = jc.field_a[param1] - (-hf.field_c[param1] - rb.field_fb[param1]);
          if (var4 < var5) {
            return true;
          }
          if (var5 < var4) {
            return false;
          }
          return !(param2 >= param1);
        }
        if (cj.field_c[param1] > cj.field_c[param2]) {
          return true;
        }
        if (cj.field_c[param1] < cj.field_c[param2]) {
          return false;
        }
        if (gi.field_e[param1] > gi.field_e[param2]) {
          return true;
        }
        if (gi.field_e[param2] > gi.field_e[param1]) {
          return false;
        }
        var4Lifetime1 = rb.field_fb[param2] + jc.field_a[param2] + hf.field_c[param2];
        var6Lifetime1 = -70 / ((param3 - 51) / 41);
        var5Lifetime1 = jc.field_a[param1] - (-hf.field_c[param1] - rb.field_fb[param1]);
        if (var4Lifetime1 < var5Lifetime1) {
          return true;
        }
        if (var5Lifetime1 < var4Lifetime1) {
          return false;
        }
        if (param2 >= param1) {
          return false;
        }
        return true;
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, byte param2, gk param3, gk param4) {
        try {
          int var5_int = 123 / ((param2 - 0) / 41);
          be.a(param3, param1, -101, 0, param4.field_h, param0, param4.field_g);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "e.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 1 << param2;
        if ((kg.field_c & var3) != 0) {
          return;
        }
        int var4 = param2;
        int var5 = (1 << var4 & bh.field_g) != 0 ? 1 : 0;
        if (var5 == 0) {
          bh.field_g = bh.field_g | 1 << var4;
          b.field_m = b.field_m - (1 << var4);
          hf.field_f.field_P = hf.field_f.field_P + 1;
          fg.field_b = fg.field_b | var3;
          kg.field_c = kg.field_c | var3;
          if (param1 == 40) {
            var4 = mb.field_e.e(11253) ? 1 : 0;
            mb.field_e.a(param1 - 8252, new he(param2));
            if (var4 == 0) {
              em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
              return;
            }
            ke.b(8192);
            em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
            return;
          }
          field_a = (ki[]) null;
          var4 = mb.field_e.e(11253) ? 1 : 0;
          mb.field_e.a(param1 - 8252, new he(param2));
          if (var4 == 0) {
            em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
            return;
          }
          ke.b(8192);
          em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
          return;
        }
        hf.field_f.field_P = hf.field_f.field_P + 1;
        fg.field_b = fg.field_b | var3;
        kg.field_c = kg.field_c | var3;
        if (param1 != 40) {
          field_a = (ki[]) null;
          var4 = mb.field_e.e(11253) ? 1 : 0;
          mb.field_e.a(param1 - 8252, new he(param2));
          if (var4 == 0) {
            em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
            return;
          }
          ke.b(8192);
          em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
          return;
        }
        var4 = mb.field_e.e(11253) ? 1 : 0;
        mb.field_e.a(param1 - 8252, new he(param2));
        if (var4 == 0) {
          em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
          return;
        }
        ke.b(8192);
        em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
    }

    final static void b(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ki var7_ref_ki = null;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          j.field_c.a(0, 0);
          var1_int = -290 + m.field_h;
          if (var1_int < 0) {
            var1_int = 0;
          }
          var1_int = var1_int * 16;
          var2 = -m.field_h + 50;
          if (var2 < -50) {
            var2 = -50;
          } else {
            if (var2 > 0) {
              var2 = 0;
            }
          }
          var3 = -(-(m.field_h * 16) + 1700);
          if (var3 > 0) {
            var3 = 0;
          }
          var4 = -(wg.field_g.field_n >> 1) + (240 + var1_int);
          wg.field_g.c(var2 + (320 - (wg.field_g.field_m >> 1)), var4);
          uk.field_n.c(500, var3 + (30 + var4));
          var5 = -330 + m.field_h;
          if (0 > var5) {
            var5 = 0;
          }
          var5 = var5 * 14;
          var6 = 240 - (wg.field_g.field_n >> 1) + var5;
          if (param0 != 117) {
            return;
          }
          we.field_f[mg.field_q].c(var2 + (-(we.field_f[mg.field_q].field_m >> 1) + 320), var6 - (we.field_f[mg.field_q].field_n - 40));
          var7_ref_ki = (ki) (bd.field_b.a((byte) -117));
          while (var7_ref_ki != null) {
            var7_ref_ki.field_q = var7_ref_ki.field_q + (float)var1_int;
            var7_ref_ki.field_B = var7_ref_ki.field_B + (float)var2;
            var7_ref_ki.a((byte) -65);
            var7_ref_ki = (ki) (bd.field_b.d((byte) 63));
          }
          for (var7 = 0; ii.field_E > var7; var7++) {
            if (ii.field_U[var7] >= 0) {
              w.field_b[ii.field_U[var7]].c((int)((float)(-(w.field_b[0].field_m >> 1)) + jc.field_f[var7][0]) + var2, (int)((float)(-(w.field_b[0].field_n >> 1)) + jc.field_f[var7][1] + (float)var1_int));
            }
          }
          f.a(m.field_h - 374, (byte) 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "e.F(" + param0 + ')');
        }
    }

    final static void a(gg param0, int param1, int param2, int param3, int param4, gg param5) {
        try {
          mg.field_u = param5;
          vf.field_b = param3;
          pl.field_h = param2;
          ud.field_a = param1;
          de.field_j = param0;
          if (param4 != -1) {
            field_b = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "e.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 31) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        field_a = new ki[1000];
        field_b = new int[4];
    }
}
