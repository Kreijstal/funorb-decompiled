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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              var8 = (CharSequence) ((Object) param2);
              cf.field_c = kf.a(var8, (byte) 2);
              fm.field_d = param1;
              var7 = wa.a(param0, ad.field_q, (byte) -127, fj.field_d, rd.field_e);
              be.a((byte) 120, var7);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("vm.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static void a(cc param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -11) {
                break L1;
              } else {
                field_s = -57;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("vm.E(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int stackIn_10_0 = 0;
        int stackIn_45_0 = 0;
        var4 = 104 % ((3 - param0) / 61);
        if (kb.field_i == null) {
          if (!jg.field_i) {
            L0: {
              if (jh.field_h) {
                break L0;
              } else {
                if (-10 == (wh.field_c ^ -1)) {
                  break L0;
                } else {
                  if (-11 == (wh.field_c ^ -1)) {
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
                  stackIn_45_0 = 0;
                  break L2;
                } else {
                  stackIn_45_0 = 1;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var5 = stackIn_45_0;
                  if ((wh.field_c ^ -1) == -81) {
                    break L4;
                  } else {
                    if ((wh.field_c ^ -1) == -85) {
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
          if (13 != wh.field_c) {
            if (!jg.field_i) {
              if (!jh.field_h) {
                if (-10 != (wh.field_c ^ -1)) {
                  L6: {
                    if (-11 == (wh.field_c ^ -1)) {
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
                    stackIn_10_0 = 0;
                    break L8;
                  } else {
                    stackIn_10_0 = 1;
                    break L8;
                  }
                }
                var5 = stackIn_10_0;
                if ((wh.field_c ^ -1) != -81) {
                  if ((wh.field_c ^ -1) != -85) {
                    L9: {
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
                  }
                } else {
                  L11: {
                    jg.field_i = false;
                    var5 = 1;
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
          } else {
            kb.field_i = null;
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_p = null;
        if (param0 < 120) {
            field_r = -61;
            field_x = null;
            return;
        }
        field_x = null;
    }

    final static void a(int param0, ig param1) {
        try {
            ie.field_c.a(param1, -16834);
            int var2_int = 14 / ((55 - param0) / 49);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "vm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String c(int param0) {
        if (param0 != -30185) {
            field_s = 3;
            return hl.field_a;
        }
        return hl.field_a;
    }

    vm() {
    }

    static {
        field_x = "Name";
        field_p = "Withdraw invitation to <%0> to join this game";
        field_u = new tb();
    }
}
