/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_a;
    static int[][] field_b;

    public static void a() {
        field_b = null;
    }

    final static void a(ci param0, ci param1) {
        try {
            if (!(param0.field_I != null)) {
                param0.field_I = new jc();
            }
            if (param1.field_I == null) {
                param1.field_I = new jc();
            }
            if (null == bf.field_M) {
                bf.field_M = new dk(64);
            }
            if (r.field_Ib == null) {
                r.field_Ib = new dk(64);
            }
            me.field_e = param0.field_I;
            cl.field_e = param1.field_I;
            int discarded$0 = -42;
            ab.d();
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "il.B(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 15 + 41);
        }
    }

    final static km[] a(int param0, int param1, int param2, boolean param3, boolean param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        km var9 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        km var13 = null;
        km var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = wb.field_d;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = wb.field_h;
          var8 = wb.field_c;
          var9 = new km(16, param2);
          var9.e();
          wb.c(0, 0, 16, param2, param5, param1);
          var10 = null;
          if (param3) {
            var13 = var9.c();
            var10 = (Object) (Object) var13;
            var13.e();
            wb.a(0, 0, 5, 0);
            wb.a(0, 1, 3, 0);
            wb.a(0, 2, 2, 0);
            wb.a(0, 3, 1, 0);
            wb.a(0, 4, 1, 0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var11 = null;
          if (!param4) {
            break L1;
          } else {
            var14 = var9.c();
            var11 = (Object) (Object) var14;
            var14.e();
            wb.a(11, 0, 5, 0);
            wb.a(13, 1, 3, 0);
            wb.a(14, 2, 2, 0);
            wb.a(15, 3, 1, 0);
            wb.a(15, 4, 1, 0);
            break L1;
          }
        }
        wb.a(var18, var7, var8);
        return new km[]{null, null, null, (km) var10, var9, (km) var11, null, null, null};
    }

    static {
    }
}
