/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    boolean field_c;
    static dg field_d;
    static String field_h;
    static String field_f;
    static int field_g;
    static bd[] field_j;
    int field_a;
    static String field_i;
    boolean field_b;
    String field_l;
    static fd field_k;
    String[] field_e;

    final static void a(byte param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -112) {
              L1: {
                if (ik.field_d != null) {
                  ik.field_d.field_J.a(param1, (byte) -118);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (null == te.field_M) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                te.field_M.field_I.a(param1, (byte) 127);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("jj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static double a(p param0, int param1, p param2) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double stackIn_3_0 = 0.0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_double = (double)(-param2.field_j.field_e) + ((double)param0.field_j.field_e + param0.field_l.field_f) - param2.field_l.field_f;
              var5 = (double)(-param2.field_j.field_g) + ((double)param0.field_j.field_g + param0.field_l.field_a) - param2.field_l.field_a;
              if (param1 == 1) {
                break L1;
              } else {
                field_d = (dg) null;
                break L1;
              }
            }
            stackIn_3_0 = var5 * var5 + var3_double * var3_double;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jj.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, oj param1) {
        try {
            if (uj.field_l == 1 && ej.d((byte) 90)) {
                eh.field_c.a(lm.field_A[17], 100, uh.field_i / 2);
            }
            jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
            jn.field_F[ib.field_c].field_j.a((byte) 46, param1.field_j);
            jn.field_F[ib.field_c].field_l.a(param1.field_l, -28860);
            jn.field_F[ib.field_c].field_e = 0;
            jn.field_F[ib.field_c].field_h = 1;
            jn.field_F[ib.field_c].field_i = 12;
            ib.field_c = ib.field_c + 1;
            hg.a((byte) 64, param1);
            u.a(-1, param1.field_j, true, param0, param1.field_l, 31);
            param1.field_i = -1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "jj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        int var1 = -8 % ((86 - param0) / 32);
        field_j = null;
        field_h = null;
        field_i = null;
        field_f = null;
        field_k = null;
        field_d = null;
    }

    jj(boolean param0) {
        this.field_b = param0 ? true : false;
    }

    static {
        field_g = 0;
        field_f = "Weapons will have no effect against that monster. I might be able to find another way to kill it...";
        field_i = "Logging in...";
        field_h = "The lift should be active now.";
    }
}
