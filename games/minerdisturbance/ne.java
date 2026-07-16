/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends hc {
    static ea[] field_O;
    private aa field_I;
    private int field_N;
    static String[] field_K;
    static String[] field_R;
    static bj field_L;
    int field_J;
    static long field_Q;
    static String field_M;
    int field_P;

    public static void a(int param0) {
        field_K = null;
        field_O = null;
        field_R = null;
        field_L = null;
        field_M = null;
        if (param0 != 2) {
            boolean discarded$0 = ne.a((byte) 76, -30);
        }
    }

    final static int a(boolean param0) {
        if (param0) {
            field_R = null;
            return -1422590333 ^ pj.field_b;
        }
        return -1422590333 ^ pj.field_b;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            try {
                var2 = param0.getDocumentBase().getFile();
                var3 = var2.indexOf('?');
                if (param1 != 30433) {
                    int discarded$0 = ne.a(false);
                }
                var4 = "reload.ws";
                if (!(-1 < (var3 ^ -1))) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(nn.a(param1 + -30307, param0, var5), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) {
        if (param0 != -84) {
            ne.a(-91);
            return ((ne) this).field_N;
        }
        return ((ne) this).field_N;
    }

    final static void a(int param0, int param1) {
        od.a(128, param0, oc.field_f, 4);
        int var2 = 45 % ((-17 - param1) / 46);
    }

    final int m(int param0) {
        Object var3 = null;
        if (param0 != 22302) {
          var3 = null;
          ne.a((java.applet.Applet) null, 18);
          return ((ne) this).field_I.b(5717);
        } else {
          return ((ne) this).field_I.b(5717);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        var14 = MinerDisturbance.field_ab;
        if (super.a(param0, param1, param2 + param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -((ne) this).field_J + param0 - param6;
            var9 = ((ne) this).field_v - 2 * ((ne) this).field_J;
            if (var8 > var9) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var8 < 0) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var8 = var8 * ((ne) this).field_N / var9;
            if (param4 != 1) {
              break L2;
            } else {
              ((ne) this).field_I.d(6524, var8);
              if (var14 != 0) {
                break L2;
              } else {
                return true;
              }
            }
          }
          if (2 == param4) {
            L3: {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              if (((ne) this).field_I.b(5717) <= var12) {
                break L3;
              } else {
                var13 = ((ne) this).field_I.a(var12, (byte) 7) + -var8;
                var13 = var13 * var13;
                stackOut_15_0 = var10;
                stackOut_15_1 = var13;
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (var14 != 0) {
                  if (stackIn_18_0 < stackIn_18_1) {
                    return true;
                  } else {
                    ((ne) this).field_I.c(var11, 0);
                    return true;
                  }
                } else {
                  L4: {
                    if (stackIn_16_0 > stackIn_16_1) {
                      var10 = var13;
                      var11 = var12;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var12++;
                  break L3;
                }
              }
            }
            if (-1 < (var11 ^ -1)) {
              return true;
            } else {
              ((ne) this).field_I.c(var11, 0);
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, char[] param1, sb param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var6 = MinerDisturbance.field_ab;
        if (param0 == param1[0]) {
          var4 = param2.field_o;
          var5 = 1;
          L0: while (true) {
            L1: {
              if (param1.length <= var5) {
                break L1;
              } else {
                stackOut_4_0 = param2.field_o;
                stackOut_4_1 = param2.field_u.length;
                stackIn_8_0 = stackOut_4_0;
                stackIn_8_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (var6 != 0) {
                  if (stackIn_8_0 >= stackIn_8_1) {
                    int discarded$4 = ne.a(false);
                    param2.field_o = var4;
                    return true;
                  } else {
                    param2.field_o = var4;
                    return true;
                  }
                } else {
                  if (stackIn_5_0 != stackIn_5_1) {
                    if (param2.m(4) == param1[var5]) {
                      var5++;
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    } else {
                      param2.field_o = var4;
                      return false;
                    }
                  } else {
                    param2.field_o = var4;
                    return false;
                  }
                }
              }
            }
            if (param3 >= -3) {
              int discarded$5 = ne.a(false);
              param2.field_o = var4;
              return true;
            } else {
              param2.field_o = var4;
              return true;
            }
          }
        } else {
          return false;
        }
    }

    private ne() throws Throwable {
        throw new Error();
    }

    final static boolean a(byte param0, int param1) {
        if (sj.field_d == null) {
            return false;
        }
        if (param0 != 10) {
            return false;
        }
        return nm.a(param1, sj.field_d, -827843803);
    }

    final int a(int param0, boolean param1) {
        if (0 <= param0) {
          if (((ne) this).field_I.b(5717) > param0) {
            if (!param1) {
              return -40;
            } else {
              return ((ne) this).field_I.a(param0, (byte) -119);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new ea[4];
        field_R = new String[]{"Welcome to the Miner Market - the last stop before the volcano. You have 500 gold to spend and you'll have to spend it all before we let you go any further. Less experienced miners should opt to buy the basic kit by clicking the above button. Once you're done, click Start Game to get on with it. We hope you fare better than the last lot.", "Welcome to the Miner Market - the last stop before the Super Volcano. You have 600 gold to spend and you'll have to spend it all before we let you go any further. Less experienced miners should opt to buy the basic kit by clicking the above button. Once you're done, click Start Game to get on with it. We hope you fare better than the last lot."};
        field_M = "Gold: <%0>";
    }
}
