/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends li {
    int field_p;
    long field_r;
    int field_A;
    int field_t;
    int field_u;
    private static long[] field_z;
    int field_v;
    int[] field_o;
    int field_y;
    int field_q;
    static tj field_D;
    static int[] field_w;
    static String field_s;
    static int[][] field_C;
    static r field_n;
    static String field_x;
    static String field_B;

    final static void b() {
        if (null != ch.field_e) {
            ch.field_e.h(0);
        }
        if (null != bb.field_F) {
            bb.field_F.c(true);
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, jj param6, int param7) {
        il.field_h = param5;
        try {
            rf.field_q = param7;
            md.field_D = param1;
            qi.field_a = param0;
            lm.field_H = param3;
            or.field_f = param6;
            rf.field_l = param2;
            od.field_Kb = param4;
            kb.field_e = (tk) (Object) new eg();
            ap.field_a = new t(param6);
            pd.field_c = new kr(kb.field_e, ap.field_a);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "vi.C(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + 112 + 41);
        }
    }

    final static String a(byte param0, boolean param1) {
        int var4 = 0;
        if (!(!param1)) {
            var4 += 4;
        }
        var4 += 2;
        var4++;
        return eh.field_d[var4];
    }

    public static void a() {
        field_D = null;
        field_x = null;
        field_B = null;
        field_C = null;
        field_s = null;
        field_n = null;
        field_w = null;
        field_z = null;
    }

    vi(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((vi) this).field_q = param4;
            ((vi) this).field_y = param1;
            int fieldTemp$0 = br.field_X;
            br.field_X = br.field_X + 1;
            ((vi) this).field_u = 65535 & fieldTemp$0;
            ((vi) this).field_A = param5;
            ((vi) this).field_p = param3;
            ((vi) this).field_t = param2;
            ((vi) this).field_v = param0;
            ((vi) this).field_o = param6;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "vi.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_z = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_D = new tj();
            field_B = "Detail: ";
            field_x = "Continue";
            field_s = "Kick <%0> from this game";
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_z[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
