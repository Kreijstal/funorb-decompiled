/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi {
    static kl field_f;
    static String field_d;
    java.awt.Image field_h;
    static String field_c;
    int[] field_b;
    int field_a;
    static String field_e;
    int field_g;

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static og a(byte param0, mt param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        og stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        og stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            int fieldTemp$4 = param1.field_c - 1;
            param1.field_c = param1.field_c - 1;
            var2_int = fieldTemp$4;
            var3 = new StringBuilder();
            L1: while (true) {
              L2: {
                if (param1.a((byte) 16)) {
                  break L2;
                } else {
                  L3: {
                    var4 = param1.b(-1);
                    if (Character.isWhitespace((char) var4)) {
                      break L3;
                    } else {
                      if (var4 == 44) {
                        break L3;
                      } else {
                        if (var4 == 40) {
                          break L3;
                        } else {
                          if (var4 != 41) {
                            StringBuilder discarded$5 = var3.append((char) var4);
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  param1.field_c = param1.field_c - 1;
                  break L2;
                }
              }
              L4: {
                L5: {
                  var5 = var3.toString();
                  if (var5.equals((Object) (Object) "true")) {
                    break L5;
                  } else {
                    if (var5.equals((Object) (Object) "false")) {
                      break L5;
                    } else {
                      L6: {
                        if (var5.charAt(0) == 45) {
                          break L6;
                        } else {
                          if (!Character.isDigit(var5.charAt(0))) {
                            var4 = rn.field_c;
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var4 = gg.field_G;
                      break L4;
                    }
                  }
                }
                var4 = gb.field_z;
                break L4;
              }
              stackOut_20_0 = new og(var4, var2_int, var5);
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("bi.J(").append(-118).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final void a(int param0) {
        if (param0 != 5605) {
          field_f = null;
          qn.a(((bi) this).field_b, ((bi) this).field_a, ((bi) this).field_g);
          return;
        } else {
          qn.a(((bi) this).field_b, ((bi) this).field_a, ((bi) this).field_g);
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_f = null;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        if (param0 < 48) {
          if (param0 < 65) {
            L0: {
              if (param0 < 97) {
                break L0;
              } else {
                if (param0 > 122) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return false;
          } else {
            if (param0 <= 90) {
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              return stackIn_28_0 != 0;
            } else {
              L1: {
                L2: {
                  if (param0 < 97) {
                    break L2;
                  } else {
                    if (param0 > 122) {
                      break L2;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L1;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L1;
              }
              return stackIn_25_0 != 0;
            }
          }
        } else {
          if (param0 > 57) {
            if (param0 >= 65) {
              if (param0 > 90) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!param0) {
          if (0 <= param4) {
            if (0 <= param5) {
              if (ks.field_y > param4) {
                if (ef.field_c <= param5) {
                  return;
                } else {
                  var6 = param4 + param5 * ks.field_y;
                  var7 = a.a(16711680, param5, var6, param4);
                  var8 = 255 - (var7 >>> 24 & 220487423);
                  var7 = var7 & 16777215;
                  mq.a(param2, var7, var6, param4, param1, var8, -116, param5);
                  pk.a(param1, param5, param4, var6, var7, -29403, var8, param2);
                  if (param3 <= 71) {
                    return;
                  } else {
                    L0: {
                      if (!jd.field_L) {
                        break L0;
                      } else {
                        oh.field_I.g(param2, param1);
                        break L0;
                      }
                    }
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Playing";
        field_c = "Armies of Gielinor Members' Expansion";
        field_e = "To play through the single-player campaigns, please log in or create a free account.";
    }
}
