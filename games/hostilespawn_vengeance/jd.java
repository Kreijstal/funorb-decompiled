/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends am {
    int field_u;
    int field_p;
    static bd field_h;
    int field_t;
    static String field_x;
    static bd[] field_o;
    static int field_l;
    static int field_q;
    int field_r;
    static vm field_s;
    int field_j;
    static String[] field_v;
    int field_m;
    int[] field_w;
    static String field_i;
    long field_k;
    int field_n;

    final static int[] a(int param0, int param1, byte param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var3 = ni.a(param1, param2 ^ -8114);
        var4 = of.a((byte) 75, param1);
        var5 = ni.a(param0, 8191);
        var6 = of.a((byte) -81, param0);
        if (param2 != -79) {
          field_l = -78;
          var7 = (int)((long)var5 * (long)var3 >> -1919457136);
          var8 = (int)((long)var6 * (long)var3 >> -321886960);
          var9 = (int)((long)var5 * (long)var4 >> 1745029456);
          var10 = (int)((long)var6 * (long)var4 >> 881464016);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var7 = (int)((long)var5 * (long)var3 >> -1919457136);
          var8 = (int)((long)var6 * (long)var3 >> -321886960);
          var9 = (int)((long)var5 * (long)var4 >> 1745029456);
          var10 = (int)((long)var6 * (long)var4 >> 881464016);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    final static void a(int param0, int param1) {
        am var2 = null;
        int var3 = 0;
        String var4 = null;
        m var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5 = (m) ((Object) wk.field_g.g(-107));
            L1: while (true) {
              if (var5 == null) {
                L2: {
                  if (param1 == 65535) {
                    break L2;
                  } else {
                    var4 = (String) null;
                    jd.a((byte) 125, (String) null, (gb) null, (String) null);
                    break L2;
                  }
                }
                var2 = ve.field_b.g(-68);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    pe.a((byte) 51, param0);
                    var2 = ve.field_b.a(param1 ^ 52851);
                    continue L3;
                  }
                }
              } else {
                fj.a(param0, var5, true);
                var5 = (m) ((Object) wk.field_g.a(12684));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2_ref), "jd.D(" + param0 + ',' + param1 + ')');
        }
    }

    jd(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_n = param3;
            this.field_t = param0;
            this.field_r = param2;
            this.field_j = param1;
            this.field_m = param5;
            this.field_w = param6;
            this.field_p = param4;
            fieldTemp$0 = tf.field_c;
            tf.field_c = tf.field_c + 1;
            this.field_u = 65535 & fieldTemp$0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "jd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static bd[] a(byte param0, String param1, gb param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bd[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 33) {
                break L1;
              } else {
                jd.c(45);
                break L1;
              }
            }
            var4_int = param2.a((byte) -2, param1);
            var5 = param2.a(var4_int, param3, -1);
            stackIn_3_0 = mg.a(param2, var4_int, var5, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("jd.C(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(int param0) {
        field_i = null;
        field_h = null;
        field_x = null;
        field_s = null;
        field_o = null;
        if (param0 != 0) {
          field_q = -13;
          field_v = null;
          return;
        } else {
          field_v = null;
          return;
        }
    }

    static {
        field_i = "Mouse over an icon for details";
        field_x = "CLICK TO SKIP";
    }
}
