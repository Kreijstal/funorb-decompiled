/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j {
    static int field_b;
    static String field_a;
    int field_c;
    int field_d;
    sj[] field_e;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -117) {
            j.a((byte) 18);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        sj var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param0 == -10874) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var2 = ((j) this).field_e.length;
        L1: while (true) {
          if ((var2 ^ -1) >= -2) {
            var6 = 0;
            var2 = var6;
            L2: while (true) {
              if (var6 >= ((j) this).field_e.length) {
                return;
              } else {
                if (((j) this).field_e[var6] != null) {
                  ((j) this).field_e[var6].field_t = var6;
                  ((j) this).field_e[var6].field_g = var6 * 32 + ((j) this).field_d;
                  if ((Object) (Object) ((j) this).field_e[var6].field_k == this) {
                    ((j) this).field_e[var6].field_s = var6;
                    var6++;
                    continue L2;
                  } else {
                    var6++;
                    continue L2;
                  }
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          } else {
            var2--;
            var3 = li.a(var2, o.field_o, false);
            var4 = ((j) this).field_e[var3];
            ((j) this).field_e[var3] = ((j) this).field_e[var2];
            ((j) this).field_e[var2] = var4;
            continue L1;
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          var2 = 0;
          if (param0) {
            break L0;
          } else {
            ((j) this).a(false);
            break L0;
          }
        }
        L1: while (true) {
          if (((j) this).field_e.length <= var2) {
            return;
          } else {
            if (((j) this).field_e[var2] != null) {
              ((j) this).field_e[var2].d(1);
              ((j) this).field_e[var2] = null;
              var2++;
              continue L1;
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int[][] param3, int param4) {
        int[][] var6 = null;
        int var7 = 0;
        int[] var8 = null;
        sj[] var9 = null;
        int var10 = 0;
        sj var11 = null;
        int var12 = 0;
        int[][] var13 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_12_1 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_9_0 = false;
        boolean stackOut_10_0 = false;
        int stackOut_10_1 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_11_1 = 0;
        L0: {
          var12 = Transmogrify.field_A ? 1 : 0;
          sb.a(nc.field_p);
          if (param2 == 3) {
            break L0;
          } else {
            ((j) this).a(false);
            break L0;
          }
        }
        var13 = param3;
        var6 = var13;
        var7 = 0;
        L1: while (true) {
          if (var13.length <= var7) {
            return;
          } else {
            var8 = var13[var7];
            sb.g(var8[0], var8[1], var8[2], var8[3]);
            var9 = ((j) this).field_e;
            var10 = 0;
            L2: while (true) {
              if (var9.length <= var10) {
                sb.b(nc.field_p);
                var7++;
                continue L1;
              } else {
                var11 = var9[var10];
                if (var11 != null) {
                  L3: {
                    L4: {
                      stackOut_8_0 = param0;
                      stackIn_11_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var11.field_g != var11.field_j) {
                        break L4;
                      } else {
                        stackOut_9_0 = stackIn_9_0;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11.field_q != var11.field_p) {
                          break L4;
                        } else {
                          stackOut_10_0 = stackIn_10_0;
                          stackOut_10_1 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          break L3;
                        }
                      }
                    }
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L3;
                  }
                  if (stackIn_12_0 ^ stackIn_12_1 != 0) {
                    var11.a(param1, param4, param2 + -2, 0);
                    var10++;
                    continue L2;
                  } else {
                    var10++;
                    continue L2;
                  }
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    j(int param0, int param1, int param2) {
        ((j) this).field_c = param2;
        ((j) this).field_d = param1;
        ((j) this).field_e = new sj[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "Loading...";
    }
}
