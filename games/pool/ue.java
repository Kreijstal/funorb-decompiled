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
        int stackIn_16_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            L1: {
              jo.field_J = jo.field_J + 1;
              if (ci.field_i != -1) {
                break L1;
              } else {
                if (-1 != gg.field_g) {
                  break L1;
                } else {
                  gg.field_g = gg.field_f;
                  ci.field_i = wn.field_i;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  if (pj.field_I == null) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (param1.equals((Object) (Object) pj.field_I)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!nn.field_d) {
                  if (wp.field_c <= jo.field_J) {
                    if (jo.field_J < ji.field_d + wp.field_c) {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_16_0 = stackOut_11_0;
                    break L4;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_16_0 = stackOut_9_0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var2_int = stackIn_16_0;
                  if (param1 == null) {
                    break L6;
                  } else {
                    if (nn.field_d) {
                      jo.field_J = wp.field_c;
                      break L5;
                    } else {
                      if (var2_int == 0) {
                        break L6;
                      } else {
                        jo.field_J = wp.field_c;
                        break L5;
                      }
                    }
                  }
                }
                jo.field_J = 0;
                break L5;
              }
              L7: {
                if (param1 == null) {
                  if (var2_int == 0) {
                    break L7;
                  } else {
                    nn.field_d = true;
                    break L7;
                  }
                } else {
                  nn.field_d = false;
                  break L7;
                }
              }
              id.field_b = ci.field_i;
              ne.field_n = gg.field_g;
              break L2;
            }
            L8: {
              pj.field_I = param1;
              if (nn.field_d) {
                break L8;
              } else {
                if (jo.field_J >= wp.field_c) {
                  break L8;
                } else {
                  if (!re.field_c) {
                    break L8;
                  } else {
                    ne.field_n = gg.field_g;
                    id.field_b = ci.field_i;
                    jo.field_J = 0;
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (!nn.field_d) {
                break L9;
              } else {
                if (la.field_e != jo.field_J) {
                  break L9;
                } else {
                  nn.field_d = false;
                  jo.field_J = 0;
                  break L9;
                }
              }
            }
            ci.field_i = -1;
            gg.field_g = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("ue.D(").append(70).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L10;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
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
