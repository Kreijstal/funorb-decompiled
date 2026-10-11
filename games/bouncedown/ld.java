/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends ai {
    static pk field_l;
    boolean field_g;
    int field_k;
    static tg[] field_h;
    int[] field_i;
    static int[] field_j;

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        gf var4_ref_gf = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        bi var8 = null;
        ii var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          var9 = jc.field_g;
          if (param0 <= 36) {
            return;
          }
          var2 = var9.d((byte) -125);
          if (0 == var2) {
            var8 = (bi) (kk.field_n.a((byte) -123));
            if (var8 == null) {
              kc.a((byte) 18);
              return;
            }
            var4 = var9.d((byte) -124);
            if (0 != var4) {
              var13 = new byte[var4];
              var9.a((byte) 124, var4, var13, 0);
            } else {
              var5 = null;
            }
            var9.field_h = var9.field_h + 4;
            if (var9.h(-19)) {
              var8.c(2);
              return;
            }
            kc.a((byte) 18);
            return;
          }
          if (var2 != 1) {
            ti.a((Throwable) null, (byte) 100, "A1: " + la.a(-119));
            kc.a((byte) 18);
            return;
          }
          var3 = var9.j(-3);
          var4_ref_gf = (gf) (ud.field_k.a((byte) -92));
          while (var4_ref_gf != null) {
            if (var3 != var4_ref_gf.field_i) {
              var4_ref_gf = (gf) (ud.field_k.d((byte) -73));
              continue;
            }
            break;
          }
          if (var4_ref_gf != null) {
            var4_ref_gf.c(2);
            return;
          }
          kc.a((byte) 18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "ld.C(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          ld.a(false);
          field_j = null;
          field_h = null;
          field_l = null;
          return;
        }
        field_j = null;
        field_h = null;
        field_l = null;
    }

    ld() {
        this.field_g = false;
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param1) {
          var4++;
          if (param0 >= 36) {
            return tb.field_r[var4];
          }
          return (String) null;
        }
        if (param0 >= 36) {
          return tb.field_r[var4];
        }
        return (String) null;
    }

    static {
        field_j = new int[8192];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$c7de0d339b2a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param1) {
          var4++;
          if (param0 >= 36) {
            return tb.field_r[var4];
          }
          return (String) null;
        }
        if (param0 >= 36) {
          return tb.field_r[var4];
        }
        return (String) null;
    }
}
