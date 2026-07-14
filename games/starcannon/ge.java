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
            mj[] discarded$0 = ge.b((byte) -53);
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
          field_c = null;
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
        if (!qb.a((byte) -111, param1, param3, param2)) {
            return null;
        }
        if (param0 <= 7) {
            return null;
        }
        return pf.a(255);
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
        if (param0 != 35) {
          return null;
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
          field_a = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{0, 0};
        field_a = "Creating your account";
    }
}
