/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl implements wo {
    private int field_c;
    private int field_n;
    private vc field_p;
    private int field_h;
    static int field_g;
    private int field_j;
    private int field_r;
    static int field_m;
    private int field_e;
    private int field_d;
    static dl[] field_i;
    static String field_f;
    private int field_o;
    static dl field_a;
    private int field_k;
    static String field_l;
    private int field_b;
    private int field_q;

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        of var11 = null;
        qm stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        qm stackOut_1_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof of)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (qm) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (qm) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (of) (Object) stackIn_3_0;
              if (var11 != null) {
                param4 = param4 & var11.field_x;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (!param1) {
                break L3;
              } else {
                field_g = 26;
                break L3;
              }
            }
            L4: {
              kh.f(param2 + param3.field_r, param3.field_j + param0, param3.field_g, param3.field_f, ((fl) this).field_b);
              if (!param4) {
                break L4;
              } else {
                var7 = 16777215;
                break L4;
              }
            }
            L5: {
              var8 = ((fl) this).field_r + param3.field_r + param2;
              var9 = ((fl) this).field_j + param3.field_j + param0;
              kh.b(var8, var9, ((fl) this).field_h, ((fl) this).field_d, 5592405);
              kh.f(var8, var9, ((fl) this).field_h, ((fl) this).field_d, var7);
              if (var11.field_A) {
                kh.e(var8, var9, var8 - -((fl) this).field_h, var9 + ((fl) this).field_d, 1);
                kh.e(((fl) this).field_h + var8, var9, var8, var9 - -((fl) this).field_d, 1);
                break L5;
              } else {
                break L5;
              }
            }
            if (null != ((fl) this).field_p) {
              var10 = ((fl) this).field_h + ((fl) this).field_r - -((fl) this).field_n;
              int discarded$1 = ((fl) this).field_p.a(param3.field_o, var10 + param2 - -param3.field_r, ((fl) this).field_o + (param0 - -param3.field_j), param3.field_g - var10 + -((fl) this).field_n, -(((fl) this).field_n << 1) + param3.field_f, ((fl) this).field_e, ((fl) this).field_c, ((fl) this).field_k, ((fl) this).field_q, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("fl.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param4 + 41);
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 1) {
          field_f = null;
          vk.a(param1 ^ -39, false, param0);
          return;
        } else {
          vk.a(param1 ^ -39, false, param0);
          return;
        }
    }

    final static String a(int param0, String param1, db param2, String param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!param2.a((byte) 102)) {
              stackOut_2_0 = (String) param1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 >= 36) {
                  break L1;
                } else {
                  var5 = null;
                  String discarded$2 = fl.a(-14, (String) null, (db) null, (String) null);
                  break L1;
                }
              }
              stackOut_6_0 = param3 + " - " + param2.b(3492) + "%";
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("fl.C(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_l = null;
        field_f = null;
        field_i = null;
        field_a = null;
    }

    fl(vc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((fl) this).field_k = 1;
        ((fl) this).field_q = 1;
        try {
            ((fl) this).field_b = param9;
            ((fl) this).field_h = param8;
            ((fl) this).field_c = param4;
            ((fl) this).field_r = param5;
            ((fl) this).field_n = param1;
            ((fl) this).field_p = param0;
            ((fl) this).field_d = param7;
            ((fl) this).field_o = param2;
            ((fl) this).field_e = param3;
            ((fl) this).field_j = param6;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "fl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
        field_f = "This is a bouncy ball.<br><br>Bouncy balls bounce back<br>and forth. Do not stand<br>in the way!<br><br>You can run up against a<br>bouncy ball safely, as long<br>as it does not run into<br>you.";
        field_l = "Not yet achieved";
    }
}
