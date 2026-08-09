/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    int field_c;
    static cn field_j;
    int field_b;
    static fd field_p;
    static cn[] field_q;
    int field_e;
    static int field_l;
    byte[] field_o;
    int field_h;
    int field_i;
    static cn field_f;
    int field_m;
    byte[] field_n;
    static String field_d;
    static boolean field_k;
    static r field_g;
    int field_a;

    final static void a(ec param0, java.math.BigInteger param1, java.math.BigInteger param2, byte param3, ec param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              cb.a(param1, param4.field_o, param4.field_m, param0, 5471, param2, 0);
              if (param3 <= -110) {
                break L1;
              } else {
                field_k = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("of.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        try {
            if (param0 > -74) {
                field_g = (r) null;
            }
            jh.c();
            if (!(im.field_e != null)) {
                im.field_e = new cn(268, 268);
                im.field_e.field_w = -8;
                im.field_e.field_A = -8;
            }
            im.field_e.e();
            gf.a();
            var1_int = 0;
            for (var2 = 0; -8 < (var2 ^ -1); var2++) {
                for (var3 = 0; var3 < 7; var3++) {
                    jm.a(12 + var2 * 36, var1_int, 3, 36 * var3 - -12);
                    var1_int++;
                }
            }
            gf.d(2, 2, 0, 0, im.field_e.field_y, im.field_e.field_v);
            jh.b();
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "of.B(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 44) {
            field_p = (fd) null;
        }
        field_q = null;
        field_j = null;
        field_p = null;
        field_g = null;
        field_f = null;
        field_d = null;
    }

    static {
        field_p = new fd(0);
        field_g = new r();
    }
}
