/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static pf field_a;
    boolean field_h;
    boolean field_b;
    String[] field_d;
    static String field_e;
    static bi[] field_f;
    int field_c;
    static String field_i;
    String field_g;

    final static vr a(byte param0, ob param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        vr stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.j(-109);
              var3 = param1.j(-66);
              if ((var3 & 1) == 0) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              var4 = stackIn_3_0;
              if ((2 & var3) == 0) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_6_0;
              if ((var3 & 4) == 0) {
                stackIn_9_0 = 0;
                break L3;
              } else {
                stackIn_9_0 = 1;
                break L3;
              }
            }
            L4: {
              var6 = stackIn_9_0;
              if ((8 & var3) == 0) {
                stackIn_12_0 = 0;
                break L4;
              } else {
                stackIn_12_0 = 1;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_12_0;
              var9 = 72 / ((param0 - -12) / 62);
              if (0 == (var3 & 16)) {
                stackIn_15_0 = 0;
                break L5;
              } else {
                stackIn_15_0 = 1;
                break L5;
              }
            }
            L6: {
              var8 = stackIn_15_0;
              if ((var3 & 32) == 0) {
                stackIn_18_0 = 0;
                break L6;
              } else {
                stackIn_18_0 = 1;
                break L6;
              }
            }
            L7: {
              var10 = stackIn_18_0;
              if (0 == (64 & var3)) {
                stackIn_21_0 = 0;
                break L7;
              } else {
                stackIn_21_0 = 1;
                break L7;
              }
            }
            var11 = stackIn_21_0;
            stackIn_22_0 = new vr(var4 != 0, var5 != 0, var6 != 0, var7 != 0, var8 != 0, var10 != 0, var11 != 0, var2_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("kj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        return stackIn_22_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        if (param0 != 1) {
          kj.a(-84);
          field_e = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          return;
        }
    }

    kj(boolean param0) {
        this.field_h = param0 ? true : false;
    }

    static {
        field_i = "Orb points: ";
        field_e = "Resource output";
    }
}
