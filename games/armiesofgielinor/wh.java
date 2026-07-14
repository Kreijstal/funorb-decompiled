/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static int field_a;
    static String field_b;
    static String field_h;
    static String field_e;
    static je field_g;
    static boolean field_f;
    static String field_d;
    static at field_c;

    final static boolean a(kl param0, byte param1, kl param2, kl param3) {
        Object var5 = null;
        int stackIn_14_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        if (param1 == 127) {
          if (param0.a((byte) 82)) {
            if (param0.a(28979, "commonui")) {
              if (param3.a((byte) 82)) {
                if (!param3.a(28979, "commonui")) {
                  return false;
                } else {
                  L0: {
                    L1: {
                      if (!param2.a((byte) 82)) {
                        break L1;
                      } else {
                        if (!param2.a(param1 ^ 29004, "button.gif")) {
                          break L1;
                        } else {
                          stackOut_27_0 = 1;
                          stackIn_29_0 = stackOut_27_0;
                          break L0;
                        }
                      }
                    }
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  }
                  return stackIn_29_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          var5 = null;
          boolean discarded$1 = wh.a((kl) null, (byte) 105, (kl) null, (kl) null);
          if (param0.a((byte) 82)) {
            if (param0.a(28979, "commonui")) {
              if (param3.a((byte) 82)) {
                if (param3.a(28979, "commonui")) {
                  if (!param2.a((byte) 82)) {
                    return false;
                  } else {
                    L2: {
                      if (!param2.a(param1 ^ 29004, "button.gif")) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L2;
                      } else {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        break L2;
                      }
                    }
                    return stackIn_14_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(kl param0, int param1) {
        if (param1 != -27701) {
            return false;
        }
        return param0.d(-27927);
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        field_d = null;
        if (param0 != 0) {
          field_a = 83;
          field_c = null;
          field_e = null;
          field_h = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_h = null;
          return;
        }
    }

    final static String[][][] a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        String[][][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 77 / ((param0 - -24) / 63);
        var1 = fd.field_n.length;
        var3 = fd.field_n[0].length;
        var4 = new String[var1][var3][];
        var5 = 0;
        L0: while (true) {
          if (var1 <= var5) {
            return var4;
          } else {
            var6 = 0;
            L1: while (true) {
              if (var3 <= var6) {
                var9 = 0;
                var6 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    var5++;
                    continue L0;
                  } else {
                    var10 = var4[var5][var9][0];
                    var4[var5][var9][0] = jf.a(var4[var5], var9, var10, var5, (byte) 15);
                    var11 = var4[var5][var9][0];
                    var4[var5][var9] = od.a(-16399, var11);
                    if (null == var4[var5][var9]) {
                      var4[var5][var9] = new String[1];
                      var4[var5][var9][0] = var11;
                      var9++;
                      var9++;
                      continue L2;
                    } else {
                      var9++;
                      var9++;
                      continue L2;
                    }
                  }
                }
              } else {
                var7 = fd.field_n[var5][var6];
                var4[var5][var6] = new String[1];
                var4[var5][var6][0] = var7;
                var6++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Your request to join has been declined.";
        field_a = -1;
        field_b = "Message lobby";
        field_e = "Plate armour helps to protect against melee damage.";
        field_f = false;
        field_d = "Your ignore list is full. Max of 100 hit.";
    }
}
