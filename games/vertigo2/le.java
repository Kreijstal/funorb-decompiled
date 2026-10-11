/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static th field_d;
    static String field_a;
    static r field_f;
    static String field_b;
    static String field_c;
    static String field_e;

    public static void a(byte param0) {
        field_d = null;
        if (param0 < -42) {
          field_c = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_f = null;
          return;
        }
        field_d = (th) null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final static void a(int param0) {
        vi.b((byte) -45);
        if (param0 != 468713154) {
          le.a(-53);
        }
    }

    final static void b(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        be var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ub var5_ref_ub = null;
        int[] var6 = null;
        int var8 = 0;
        mi var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 >= -80) {
            return;
          }
          var9 = id.field_f;
          var2 = var9.h(-11);
          var3 = var9.h(-11);
          if (var2 == 0) {
            var4 = (be) (mb.field_v.a((byte) 100));
            if (var4 == null) {
              rm.b((byte) -79);
              return;
            }
            var5 = -var9.field_u + ca.field_b;
            var11 = var4.field_o;
            var10 = var11;
            var6 = var10;
            if (var11.length << 2 < var5) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.h(-11) << b.a(768, var7 << 8));
            }
            var4.field_p = true;
            var4.c(2);
            return;
          }
          if (var2 != 1) {
            ke.a((Throwable) null, "LR1: " + or.a(119), 0);
            rm.b((byte) -30);
            return;
          }
          var4_int = var9.j(-3084);
          var5_ref_ub = (ub) (ob.field_Q.a((byte) 100));
          while (var5_ref_ub != null) {
            if (var5_ref_ub.field_u != var3 ||
              var4_int != var5_ref_ub.field_q) {
              var5_ref_ub = (ub) (ob.field_Q.b(82));
              continue;
            }
            break;
          }
          if (var5_ref_ub == null) {
            rm.b((byte) 83);
            return;
          }
          var5_ref_ub.c(2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "le.B(" + param0 + ')');
        }
    }

    static {
        field_a = "Target level:";
        field_c = "Email (Login):";
        field_b = "This game option is not available in rated games.";
        field_e = "Walk over the jetpack to pick it up. Press jump twice in quick succession to use it to fly high into the air! At the top of this level are some gluey blocks. While standing on these, you can't jump unless you use the second jetpack.";
    }
}
