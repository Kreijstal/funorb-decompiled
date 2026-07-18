/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ge {
    static int[] field_c;
    static hl field_b;
    static String field_a;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static void b(int param0) {
        cg.field_j[47] = 73;
        cg.field_j[46] = 72;
        cg.field_j[222] = 58;
        cg.field_j[192] = 28;
        cg.field_j[520] = 59;
        cg.field_j[44] = 71;
        cg.field_j[45] = 26;
        cg.field_j[92] = 74;
        cg.field_j[91] = 42;
        cg.field_j[61] = 27;
        cg.field_j[93] = 43;
        cg.field_j[59] = 57;
    }

    final static hl[] a(int param0, int param1, ue param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        hl[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (qb.a((byte) -111, param1, param3, param2)) {
              stackOut_4_0 = pf.a(255);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hl[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ge.F(").append(9).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 11) {
          if ((Object) (Object) uc.field_a != this) {
            if ((Object) (Object) dd.field_b != this) {
              if (this == (Object) (Object) pb.field_a) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$6 = ((ge) this).a((byte) -70);
          if ((Object) (Object) uc.field_a != this) {
            if ((Object) (Object) dd.field_b == this) {
              return true;
            } else {
              L0: {
                if (this != (Object) (Object) pb.field_a) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static mj[] b(byte param0) {
        return new mj[]{p.field_a, bh.field_b, ih.field_c};
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(byte param0, long param1) {
        ha.field_b.setTime(new Date(param1));
        int var3 = ha.field_b.get(7);
        int var4 = ha.field_b.get(5);
        int var5 = ha.field_b.get(2);
        int var6 = ha.field_b.get(1);
        int var7 = ha.field_b.get(11);
        int var8 = ha.field_b.get(12);
        int var9 = ha.field_b.get(13);
        return eb.field_d[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + kg.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{0, 0};
        field_a = "Creating your account";
    }
}
