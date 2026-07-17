/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static dd field_c;
    static String field_d;
    static ko field_b;
    static int field_a;
    static int field_e;

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        try {
          L0: {
            L1: {
              jo.field_J = jo.field_J + 1;
              if (param0 == 70) {
                break L1;
              } else {
                boolean discarded$1 = ue.a((byte) 11);
                break L1;
              }
            }
            L2: {
              if (ci.field_i != -1) {
                break L2;
              } else {
                if (-1 != gg.field_g) {
                  break L2;
                } else {
                  gg.field_g = gg.field_f;
                  ci.field_i = wn.field_i;
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (param1 == null) {
                  if (pj.field_I == null) {
                    break L4;
                  } else {
                    break L3;
                  }
                } else {
                  if (param1.equals((Object) (Object) pj.field_I)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (!nn.field_d) {
                  if (wp.field_c <= jo.field_J) {
                    if (jo.field_J < ji.field_d + wp.field_c) {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_18_0 = stackOut_15_0;
                      break L5;
                    }
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_18_0 = stackOut_13_0;
                    break L5;
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_18_0 = stackOut_11_0;
                  break L5;
                }
              }
              L6: {
                L7: {
                  var2_int = stackIn_18_0;
                  if (param1 == null) {
                    break L7;
                  } else {
                    if (nn.field_d) {
                      jo.field_J = wp.field_c;
                      break L6;
                    } else {
                      if (var2_int == 0) {
                        break L7;
                      } else {
                        jo.field_J = wp.field_c;
                        break L6;
                      }
                    }
                  }
                }
                jo.field_J = 0;
                break L6;
              }
              L8: {
                if (param1 == null) {
                  if (var2_int == 0) {
                    break L8;
                  } else {
                    nn.field_d = true;
                    break L8;
                  }
                } else {
                  nn.field_d = false;
                  break L8;
                }
              }
              id.field_b = ci.field_i;
              ne.field_n = gg.field_g;
              break L3;
            }
            L9: {
              pj.field_I = param1;
              if (nn.field_d) {
                break L9;
              } else {
                if (jo.field_J >= wp.field_c) {
                  break L9;
                } else {
                  if (!re.field_c) {
                    break L9;
                  } else {
                    ne.field_n = gg.field_g;
                    id.field_b = ci.field_i;
                    jo.field_J = 0;
                    break L9;
                  }
                }
              }
            }
            L10: {
              if (!nn.field_d) {
                break L10;
              } else {
                if (la.field_e != jo.field_J) {
                  break L10;
                } else {
                  nn.field_d = false;
                  jo.field_J = 0;
                  break L10;
                }
              }
            }
            ci.field_i = -1;
            gg.field_g = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("ue.D(").append(param0).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L11;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
    }

    final static void a(boolean param0) {
        if (!(wd.field_Ub == null)) {
            wd.field_Ub.h(11741);
        }
        if (null != of.field_Nb) {
            of.field_Nb.k(0);
            ja.a(true);
            return;
        }
        ja.a(true);
    }

    final static boolean a(int param0) {
        bi.field_f = true;
        ia.field_k = rl.a((byte) -110) - -15000L;
        return 11 == fk.field_ab ? true : false;
    }

    public static void b(boolean param0) {
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static boolean a(byte param0) {
        if (param0 <= -70) {
          if (sf.field_y >= 20) {
            if (gg.a(true)) {
              if (0 < no.field_l) {
                if (uc.a(-128)) {
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
            return true;
          }
        } else {
          field_e = -55;
          if (sf.field_y >= 20) {
            if (gg.a(true)) {
              if (0 < no.field_l) {
                if (uc.a(-128)) {
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
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Next";
        field_e = 2048;
        field_b = new ko();
    }
}
