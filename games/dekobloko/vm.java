/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends bh {
    static String field_p;
    int field_v;
    static String field_x;
    static int field_s;
    int field_n;
    int field_t;
    static int field_w;
    int field_o;
    int field_y;
    static tb field_u;
    static int field_r;
    rf field_q;

    final static boolean a(int[] param0, long param1, String param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        ig var7 = null;
        CharSequence var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (pc.a(param4, 2, param1, param2, param0)) {
              L1: {
                if (param4 == 1) {
                  param4 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              ed.field_c = param2;
              pk.field_r = param4;
              var6_int = -49 / ((-60 - param3) / 43);
              var8 = (CharSequence) (Object) param2;
              cf.field_c = kf.a(var8, (byte) 2);
              fm.field_d = param1;
              var7 = wa.a(param0, ad.field_q, (byte) -127, fj.field_d, rd.field_e);
              be.a((byte) 120, var7);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("vm.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final static void a(cc param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("vm.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + -11 + 41);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var4 = 104 % ((3 - param0) / 61);
        if (kb.field_i == null) {
          if (!jg.field_i) {
            L0: {
              if (jh.field_h) {
                break L0;
              } else {
                if (wh.field_c == 9) {
                  break L0;
                } else {
                  if (wh.field_c == 10) {
                    break L0;
                  } else {
                    if (wh.field_c == 11) {
                      break L0;
                    } else {
                      L1: {
                        if (wh.field_c != 80) {
                          break L1;
                        } else {
                          if (!ql.a(2)) {
                            break L1;
                          } else {
                            jg.field_i = true;
                            return true;
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
              }
            }
            return tl.b(param1, 102, param3);
          } else {
            if (!ql.a(2)) {
              return false;
            } else {
              L2: {
                if (!nm.a(param2, 1, param3)) {
                  stackOut_42_0 = 0;
                  stackIn_43_0 = stackOut_42_0;
                  break L2;
                } else {
                  stackOut_41_0 = 1;
                  stackIn_43_0 = stackOut_41_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var5 = stackIn_43_0;
                  if (wh.field_c == 80) {
                    break L4;
                  } else {
                    if (wh.field_c == 84) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                jg.field_i = false;
                var5 = 1;
                break L3;
              }
              L5: {
                if (13 == wh.field_c) {
                  qk.a((byte) 94);
                  jg.field_i = false;
                  var5 = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              return var5 != 0;
            }
          }
        } else {
          if (13 == wh.field_c) {
            kb.field_i = null;
            return true;
          } else {
            if (!jg.field_i) {
              if (!jh.field_h) {
                if (wh.field_c != 9) {
                  L6: {
                    if (wh.field_c == 10) {
                      break L6;
                    } else {
                      if (wh.field_c == 11) {
                        break L6;
                      } else {
                        L7: {
                          if (wh.field_c != 80) {
                            break L7;
                          } else {
                            if (!ql.a(2)) {
                              break L7;
                            } else {
                              jg.field_i = true;
                              return true;
                            }
                          }
                        }
                        return false;
                      }
                    }
                  }
                  return tl.b(param1, 102, param3);
                } else {
                  return tl.b(param1, 102, param3);
                }
              } else {
                return tl.b(param1, 102, param3);
              }
            } else {
              if (!ql.a(2)) {
                return false;
              } else {
                L8: {
                  if (!nm.a(param2, 1, param3)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L8;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L8;
                  }
                }
                var5 = stackIn_9_0;
                if (wh.field_c == 80) {
                  L9: {
                    jg.field_i = false;
                    var5 = 1;
                    if (13 == wh.field_c) {
                      qk.a((byte) 94);
                      jg.field_i = false;
                      var5 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return var5 != 0;
                } else {
                  if (wh.field_c == 84) {
                    L10: {
                      jg.field_i = false;
                      var5 = 1;
                      if (13 == wh.field_c) {
                        qk.a((byte) 94);
                        jg.field_i = false;
                        var5 = 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return var5 != 0;
                  } else {
                    L11: {
                      if (13 == wh.field_c) {
                        qk.a((byte) 94);
                        jg.field_i = false;
                        var5 = 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    return var5 != 0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_p = null;
        field_x = null;
    }

    final static void a(int param0, ig param1) {
        try {
            ie.field_c.a((w) (Object) param1, -16834);
            int var2_int = 14 / ((55 - param0) / 49);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "vm.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static String c(int param0) {
        return hl.field_a;
    }

    vm() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Name";
        field_p = "Withdraw invitation to <%0> to join this game";
        field_u = new tb();
    }
}
