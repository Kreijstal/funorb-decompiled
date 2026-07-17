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
          if (var2 <= 1) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= ((j) this).field_e.length) {
                return;
              } else {
                if (((j) this).field_e[var2] != null) {
                  ((j) this).field_e[var2].field_t = var2;
                  ((j) this).field_e[var2].field_g = var2 * 32 + ((j) this).field_d;
                  if ((Object) (Object) ((j) this).field_e[var2].field_k == this) {
                    ((j) this).field_e[var2].field_s = var2;
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            int incrementValue$4 = var2;
            var2--;
            int discarded$5 = 0;
            var3 = li.a(incrementValue$4, o.field_o);
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
        RuntimeException var6 = null;
        int[][] var6_array = null;
        int var7 = 0;
        int[] var8 = null;
        sj[] var9 = null;
        int var10 = 0;
        sj var11 = null;
        int var12 = 0;
        int[][] var13 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              sb.a(nc.field_p);
              if (param2 == 3) {
                break L1;
              } else {
                ((j) this).a(false);
                break L1;
              }
            }
            var13 = param3;
            var6_array = var13;
            var7 = 0;
            L2: while (true) {
              if (var13.length <= var7) {
                break L0;
              } else {
                var8 = var13[var7];
                sb.g(var8[0], var8[1], var8[2], var8[3]);
                var9 = ((j) this).field_e;
                var10 = 0;
                L3: while (true) {
                  if (var9.length <= var10) {
                    sb.b(nc.field_p);
                    var7++;
                    continue L2;
                  } else {
                    L4: {
                      var11 = var9[var10];
                      if (var11 == null) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("j.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 41);
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
