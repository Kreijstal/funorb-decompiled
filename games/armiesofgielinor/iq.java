/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class iq {
    private int field_c;
    private String field_d;
    private int field_f;
    static Random field_e;
    int field_i;
    static long field_h;
    static int[] field_g;
    static String field_b;
    static pu[] field_a;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (-2 != (param1.length() ^ -1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 30) {
                  break L1;
                } else {
                  iq.c(70);
                  break L1;
                }
              }
              var2_int = param1.charAt(0);
              if (!Character.isLowerCase((char) var2_int)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("iq.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final void a(int param0) {
        if (wg.a(-33, db.a(true, this.field_f), db.a(true, this.field_f + this.field_i), u.a(this.field_c, (byte) 94), u.a(30 + this.field_c, (byte) 94))) {
          fe.a(db.a(true, this.field_f), u.a(this.field_c, (byte) 94), this.field_i, 30, il.field_s, ci.field_e, 0, 0);
          if (ArmiesOfGielinor.field_M) {
            fe.a(db.a(true, this.field_f), u.a(this.field_c, (byte) 94), this.field_i, 30, il.field_s, nd.field_b, 0, 0);
            fe.c(this.field_d, db.a(true, this.field_i / 2 + this.field_f), u.a(this.field_c - -30, (byte) 94), param0, true);
            return;
          } else {
            fe.c(this.field_d, db.a(true, this.field_i / 2 + this.field_f), u.a(this.field_c - -30, (byte) 94), param0, true);
            return;
          }
        } else {
          fe.a(db.a(true, this.field_f), u.a(this.field_c, (byte) 94), this.field_i, 30, il.field_s, nd.field_b, 0, 0);
          fe.c(this.field_d, db.a(true, this.field_i / 2 + this.field_f), u.a(this.field_c - -30, (byte) 94), param0, true);
          return;
        }
    }

    final static void b(int param0) {
        if (bl.field_b) {
          it.field_b = true;
          if (param0 != -20267) {
            iq.c(56);
            wc.a(false, -49);
            p.field_b = 0;
            return;
          } else {
            wc.a(false, -49);
            p.field_b = 0;
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 != 0) {
          field_e = (Random) null;
          field_a = null;
          field_g = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          field_b = null;
          return;
        }
    }

    iq(String param0, int param1, int param2, int param3) {
        try {
            this.field_c = param2;
            this.field_f = param1;
            this.field_i = param3;
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "iq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = -106 / ((param0 - 17) / 39);
        return wg.a(-33, db.a(true, this.field_f), db.a(true, this.field_f - -this.field_i), u.a(this.field_c, (byte) 94), u.a(this.field_c + 30, (byte) 94));
    }

    static {
        field_e = new Random();
        field_b = "Owned";
    }
}
