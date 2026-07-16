/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.util.Vector;

final class ul extends um {
    private int field_h;
    private int field_i;
    static mk field_j;
    static int field_g;
    static vm field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        if (param0) {
          ul.b(true);
          ((ul) this).field_i = ((ul) this).field_i + 1;
          ((ul) this).field_h = ((ul) this).field_h + param3;
          return (f) (Object) new jo(bm.field_g, 1);
        } else {
          ((ul) this).field_i = ((ul) this).field_i + 1;
          ((ul) this).field_h = ((ul) this).field_h + param3;
          return (f) (Object) new jo(bm.field_g, 1);
        }
    }

    final static void a(mj param0, boolean param1, f[][] param2, byte param3) {
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        L0: while (true) {
          param0.a(120);
          if (param2[param0.field_c][param0.field_b].a(false, param2, param0)) {
            param2[param0.field_c][param0.field_b] = param2[param0.field_c][param0.field_b].a(param0, (byte) -119, param1, param2);
            continue L0;
          } else {
            if (param3 < 18) {
              ul.a((mj) null, true, (f[][]) null, (byte) 24);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(byte param0) {
        tb.field_d.a(jj.field_a, 100, ((ul) this).field_i * (48 * gi.field_m), ((ul) this).field_h / ((ul) this).field_i);
        int var2 = -101 % ((29 - param0) / 42);
        ((ul) this).field_i = 0;
        ((ul) this).field_h = 0;
    }

    final static boolean a(boolean param0) {
        Vector[] stackIn_2_0 = null;
        Vector[] stackIn_3_0 = null;
        Vector[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        Vector[] stackIn_19_0 = null;
        Vector[] stackIn_20_0 = null;
        Vector[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_29_0 = 0;
        Vector[] stackOut_18_0 = null;
        Vector[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Vector[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        Vector[] stackOut_1_0 = null;
        Vector[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Vector[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param0) {
          L0: {
            stackOut_18_0 = ol.field_z;
            stackIn_20_0 = stackOut_18_0;
            stackIn_19_0 = stackOut_18_0;
            if (0 < mo.field_l) {
              stackOut_20_0 = (Vector[]) (Object) stackIn_20_0;
              stackOut_20_1 = 2;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              break L0;
            } else {
              stackOut_19_0 = (Vector[]) (Object) stackIn_19_0;
              stackOut_19_1 = 1;
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              break L0;
            }
          }
          if (stackIn_21_0[stackIn_21_1] != null) {
            if (!jc.field_b) {
              if (!rc.a(-82)) {
                return false;
              } else {
                return true;
              }
            } else {
              if (!gh.field_y) {
                L1: {
                  if (!rc.a(-82)) {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L1;
                  } else {
                    stackOut_27_0 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    break L1;
                  }
                }
                return stackIn_29_0 != 0;
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          L2: {
            ul.b(false);
            stackOut_1_0 = ol.field_z;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (0 < mo.field_l) {
              stackOut_3_0 = (Vector[]) (Object) stackIn_3_0;
              stackOut_3_1 = 2;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L2;
            } else {
              stackOut_2_0 = (Vector[]) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L2;
            }
          }
          if (stackIn_4_0[stackIn_4_1] != null) {
            if (jc.field_b) {
              if (gh.field_y) {
                return true;
              } else {
                L3: {
                  if (!rc.a(-82)) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                return stackIn_15_0 != 0;
              }
            } else {
              L4: {
                if (!rc.a(-82)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    ul() {
        ((ul) this).field_h = 0;
        ((ul) this).field_i = 0;
    }

    final pb b(byte param0) {
        if (param0 > -127) {
            ((ul) this).field_h = 60;
            return (pb) (Object) new tc();
        }
        return (pb) (Object) new tc();
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_k = null;
            field_j = null;
            field_k = null;
            return;
        }
        field_j = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new mk();
    }
}
