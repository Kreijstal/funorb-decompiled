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
        if (param0 != 45) {
            ge.b((byte) -53);
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (qb.a((byte) -111, param1, param3, param2)) {
              if (param0 > 7) {
                stackIn_7_0 = pf.a(255);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (hl[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ge.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
        int stackIn_7_0 = 0;
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
          this.a((byte) -70);
          if (uc.field_a != this) {
            if (dd.field_b == this) {
              return true;
            } else {
              L0: {
                if (this != pb.field_a) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
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
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
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
