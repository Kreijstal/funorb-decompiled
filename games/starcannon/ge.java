/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ge {
    static int[] field_c;
    static hl field_b;
    static String field_a;

    public static void a(int param0) {
        mj[] discarded$0 = null;
        field_c = null;
        if (param0 != 45) {
            discarded$0 = ge.b((byte) -53);
            field_a = null;
            field_b = null;
            return;
        }
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
        if (param0 != 4039) {
          field_c = (int[]) null;
          cg.field_j[93] = 43;
          cg.field_j[59] = 57;
          return;
        } else {
          cg.field_j[93] = 43;
          cg.field_j[59] = 57;
          return;
        }
    }

    final static hl[] a(int param0, int param1, ue param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        hl[] stackIn_5_0 = null;
        hl[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hl[] stackOut_6_0 = null;
        hl[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (qb.a((byte) -111, param1, param3, param2)) {
              if (param0 > 7) {
                stackOut_6_0 = pf.a(255);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (hl[]) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ge.F(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hl[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final boolean a(byte param0) {
        boolean discarded$6 = false;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 11) {
          if (uc.field_a != this) {
            if (dd.field_b != this) {
              if (this == pb.field_a) {
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
          discarded$6 = this.a((byte) -70);
          if (uc.field_a != this) {
            if (dd.field_b == this) {
              return true;
            } else {
              L0: {
                if (this != pb.field_a) {
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
        if (param0 != 35) {
          return (mj[]) null;
        } else {
          return new mj[]{p.field_a, bh.field_b, ih.field_c};
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(byte param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ha.field_b.setTime(new Date(param1));
        var3 = ha.field_b.get(7);
        var4 = ha.field_b.get(5);
        var5 = ha.field_b.get(2);
        if (param0 != -36) {
          field_a = (String) null;
          var6 = ha.field_b.get(1);
          var7 = ha.field_b.get(11);
          var8 = ha.field_b.get(12);
          var9 = ha.field_b.get(13);
          return eb.field_d[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + kg.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var6 = ha.field_b.get(1);
          var7 = ha.field_b.get(11);
          var8 = ha.field_b.get(12);
          var9 = ha.field_b.get(13);
          return eb.field_d[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + kg.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    static {
        field_c = new int[]{0, 0};
        field_a = "Creating your account";
    }
}
