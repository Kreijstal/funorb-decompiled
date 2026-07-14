/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends t {
    static boolean field_J;
    static String field_E;
    private int field_G;
    static int field_D;
    static le[] field_C;
    int field_B;
    private oi field_I;
    int field_F;

    final static boolean a(String param0, boolean param1, String param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            qj.a(-18);
            break L0;
          }
        }
        L1: {
          var3 = ki.a((byte) 43, param2);
          if (-1 != param0.indexOf(param2)) {
            break L1;
          } else {
            if (0 != (param0.indexOf(var3) ^ -1)) {
              break L1;
            } else {
              L2: {
                L3: {
                  if (param0.startsWith(param2)) {
                    break L3;
                  } else {
                    if (param0.startsWith(var3)) {
                      break L3;
                    } else {
                      if (param0.endsWith(param2)) {
                        break L3;
                      } else {
                        if (!param0.endsWith(var3)) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
              return stackIn_13_0 != 0;
            }
          }
        }
        return true;
    }

    final static aj l(int param0) {
        int var1 = -66 % ((param0 - 51) / 60);
        return new aj(pl.a((byte) -69), bb.a((byte) -121));
    }

    final int a(boolean param0) {
        if (!param0) {
            return -126;
        }
        return ((qj) this).field_I.b(-1);
    }

    final int k(int param0) {
        int var2 = -80 % ((param0 - -20) / 39);
        return ((qj) this).field_G;
    }

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!super.a(param0, param1, param2, param3 + 0, param4, param5, param6)) {
          L0: {
            if (param3 == -1625) {
              break L0;
            } else {
              aj discarded$1 = qj.l(78);
              break L0;
            }
          }
          return false;
        } else {
          L1: {
            var8 = -param6 + (param1 - ((qj) this).field_B);
            var9 = -(((qj) this).field_B * 2) + ((qj) this).field_l;
            if (var9 >= var8) {
              break L1;
            } else {
              var8 = var9;
              break L1;
            }
          }
          L2: {
            if ((var8 ^ -1) > -1) {
              var8 = 0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var8 = ((qj) this).field_G * var8 / var9;
            if ((param2 ^ -1) != -2) {
              if (param2 == 2) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L4: while (true) {
                  if (var12 >= ((qj) this).field_I.b(param3 ^ 1624)) {
                    if (0 <= var11) {
                      ((qj) this).field_I.a((byte) 107, var11);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var13 = ((qj) this).field_I.d(-22544, var12) + -var8;
                    var13 = var13 * var13;
                    if (var13 < var10) {
                      var11 = var12;
                      var10 = var13;
                      var12++;
                      continue L4;
                    } else {
                      var12++;
                      continue L4;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              ((qj) this).field_I.b(var8, -105);
              break L3;
            }
          }
          return true;
        }
    }

    public static void a(int param0) {
        field_E = null;
        field_C = null;
        if (param0 != 4201) {
            field_C = null;
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 >= 0) {
            // if_icmple L19
        } else {
            return -1;
        }
        if (param0) {
            Object var4 = null;
            boolean discarded$0 = qj.a((String) null, false, (String) null);
        }
        return ((qj) this).field_I.d(-22544, param1);
    }

    private qj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Instructions";
    }
}
