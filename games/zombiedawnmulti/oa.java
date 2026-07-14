/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa {
    static ao field_a;
    static String field_b;

    final static fq a(ga param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = param0.d((byte) 69);
        if (param1 != 14) {
          field_a = null;
          var3 = param0.g(31365);
          var4 = param0.d((byte) 69);
          return new fq(var2, var3, var4);
        } else {
          var3 = param0.g(31365);
          var4 = param0.d((byte) 69);
          return new fq(var2, var3, var4);
        }
    }

    final static int b(byte param0) {
        if (param0 > -11) {
          field_a = null;
          return new Date().getYear() + 1900;
        } else {
          return new Date().getYear() + 1900;
        }
    }

    final static void a(int param0) {
        ki.a(26);
        hh.b(param0);
    }

    final static boolean a(int param0, int[] param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == -9) {
          var2 = 0;
          L0: while (true) {
            if (-9 > var2) {
              if (param1[var2] == 0) {
                var2++;
                continue L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          oa.a(-15);
          var2 = 0;
          L1: while (true) {
            if (-9 < var2) {
              if (param1[var2] == 0) {
                var2++;
                continue L1;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static int a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (he.field_a) {
          return 0;
        } else {
          var1 = 0;
          if (param0 <= 4) {
            L0: {
              var6 = null;
              boolean discarded$1 = oa.a(114, (int[]) null);
              var2 = 0;
              if (op.field_m.field_z.length <= var2) {
                break L0;
              } else {
                L1: {
                  var3 = op.field_m.field_z[var2];
                  if (var3 <= 0) {
                    var2++;
                    break L1;
                  } else {
                    L2: {
                      var4 = -var3 + op.field_m.a((byte) 32, var2, 750);
                      if (var4 > 50) {
                        var4 = var3;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      stackOut_22_0 = var1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      if (fb.field_e.field_M != var2) {
                        stackOut_24_0 = stackIn_24_0;
                        stackOut_24_1 = var4 / 20;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        break L3;
                      } else {
                        stackOut_23_0 = stackIn_23_0;
                        stackOut_23_1 = var4 / 40;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        break L3;
                      }
                    }
                    var1 = stackIn_25_0 + stackIn_25_1;
                    break L1;
                  }
                }
                var2++;
                var2++;
                var2++;
                break L0;
              }
            }
            return var1;
          } else {
            var2 = 0;
            L4: while (true) {
              if (op.field_m.field_z.length <= var2) {
                return var1;
              } else {
                var3 = op.field_m.field_z[var2];
                if (var3 > 0) {
                  L5: {
                    var4 = -var3 + op.field_m.a((byte) 32, var2, 750);
                    if (var4 > 50) {
                      var4 = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    stackOut_11_0 = var1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (fb.field_e.field_M != var2) {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = var4 / 20;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L6;
                    } else {
                      stackOut_12_0 = stackIn_12_0;
                      stackOut_12_1 = var4 / 40;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L6;
                    }
                  }
                  var1 = stackIn_14_0 + stackIn_14_1;
                  var2++;
                  var2++;
                  continue L4;
                } else {
                  var2++;
                  var2++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 3732) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ao(14, 0, 4, 1);
        field_b = "<%0> has been removed.";
    }
}
