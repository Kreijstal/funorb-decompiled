/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static int[] field_h;
    static dl field_c;
    static km field_a;
    static String field_b;
    static String field_f;
    int field_d;
    static wg field_g;
    static String field_e;

    final static void b(byte param0) {
        me.field_b = me.field_b - 1;
        df.a(ph.field_l[me.field_b], kn.field_K[me.field_b], se.field_e[me.field_b]);
        if (param0 < 79) {
          return;
        } else {
          df.field_i = pb.field_i[me.field_b];
          df.field_k = m.field_i[me.field_b];
          df.field_g = ng.field_O[me.field_b];
          df.field_h = qe.field_h[me.field_b];
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(long param0, int param1, int param2, String param3, int[] param4) {
        oj var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (oa.a(28977, param3, param0, param1, param4)) {
              L1: {
                if (param1 == 1) {
                  param1 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                va.field_d = param3;
                sd.field_e = param1;
                if (param2 == -22557) {
                  break L2;
                } else {
                  field_c = (dl) null;
                  break L2;
                }
              }
              var7 = (CharSequence) ((Object) param3);
              d.field_Gb = c.a(var7, true);
              oc.field_n = param0;
              var6 = dl.a(dh.field_k, sd.field_a, 49, gk.field_e, param4);
              rk.a(var6, (byte) -27);
              stackIn_9_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6_ref);

            stackIn_12_1 = new StringBuilder().append("ul.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static void c(byte param0) {
        int var1 = 0;
        if ((ag.field_c ^ -1) <= -225) {
            qe.a((byte) 120, 256);
        } else {
            var1 = ag.field_c % 32;
            qe.a((byte) 59, -var1 + (ag.field_c + 32));
        }
        var1 = 32 % ((param0 - 23) / 39);
    }

    final static void a(int param0) {
        sa.a((byte) 120, ea.field_e, de.field_sb, true);
        if (param0 != 15429) {
            field_b = (String) null;
            p.field_f = true;
            return;
        }
        p.field_f = true;
    }

    ul(int param0) {
        this.field_d = param0;
    }

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_g = null;
        if (param0 >= -48) {
          return;
        } else {
          field_b = null;
          return;
        }
    }

    static {
        field_h = new int[8192];
        field_f = "Player names can be up to 12 letters, numbers and underscores";
        field_b = "Who can join";
        field_e = "Loading...";
        field_c = new dl();
    }
}
