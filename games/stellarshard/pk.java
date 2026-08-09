/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static int field_c;
    static int field_g;
    static String field_f;
    static int field_h;
    static int[] field_j;
    static int[] field_i;
    static String[] field_d;
    static eb field_e;
    static String field_b;
    static qc field_a;

    final static boolean a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        if ((param1 ^ -1) != 0) {
          if (param0 != -12663) {
            L0: {
              field_f = (String) null;
              if (-1 == (pl.field_U & 1 << param1 ^ -1)) {
                stackIn_10_0 = 0;
                break L0;
              } else {
                stackIn_10_0 = 1;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              if (-1 == (pl.field_U & 1 << param1 ^ -1)) {
                stackIn_6_0 = 0;
                break L1;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static void a(String param0, String[] param1, int param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = stellarshard.field_B;
        try {
          o.field_l = ta.field_m;
          var4_int = 63 / ((-39 - param3) / 62);
          if (255 != param2) {
            if (-101 < (param2 ^ -1)) {
              hi.field_d = fb.a(param2, true, param0);
              return;
            } else {
              if (105 >= param2) {
                hi.field_d = gj.a(true, param1);
                return;
              } else {
                hi.field_d = fb.a(param2, true, param0);
                return;
              }
            }
          } else {
            L0: {
              if (u.field_k >= 13) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            hi.field_d = dg.a(stackIn_5_0 != 0, 0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("pk.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        if (10 == eg.field_d) {
          ki.f(107);
          eg.field_d = 11;
          if (param0 == 4) {
            b.field_v = true;
            return;
          } else {
            pk.a(105, -118);
            b.field_v = true;
            return;
          }
        } else {
          if (!fa.a(-72)) {
            ki.f(107);
            eg.field_d = 11;
            if (param0 != 4) {
              pk.a(105, -118);
              b.field_v = true;
              return;
            } else {
              b.field_v = true;
              return;
            }
          } else {
            if (param0 == 4) {
              b.field_v = true;
              return;
            } else {
              pk.a(105, -118);
              b.field_v = true;
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_j = null;
        field_b = null;
        field_i = null;
        if (param0 <= 25) {
          pk.a(75);
          field_a = null;
          field_f = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_d = null;
          return;
        }
    }

    static {
        field_f = "Passwords can only contain letters and numbers";
        field_h = 100;
        field_i = new int[4];
        field_e = new eb();
    }
}
