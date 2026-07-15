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
        int var6 = 0;
        ig var7 = null;
        CharSequence var8 = null;
        if (!pc.a(param4, 2, param1, param2, param0)) {
          return false;
        } else {
          L0: {
            if (param4 == 1) {
              param4 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          ed.field_c = param2;
          pk.field_r = param4;
          var6 = -49 / ((-60 - param3) / 43);
          var8 = (CharSequence) (Object) param2;
          cf.field_c = kf.a(var8, (byte) 2);
          fm.field_d = param1;
          var7 = wa.a(param0, ad.field_q, (byte) -127, fj.field_d, rd.field_e);
          be.a((byte) 120, var7);
          return true;
        }
    }

    final static void a(cc param0, int param1, int param2, int param3) {
        if (param3 != -11) {
            field_s = -57;
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
          if (13 == wh.field_c) {
            kb.field_i = null;
            return true;
          } else {
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
                if ((wh.field_c ^ -1) == -81) {
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
                  if ((wh.field_c ^ -1) == -85) {
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
        if (param0 < 120) {
            field_r = -61;
            field_x = null;
            return;
        }
        field_x = null;
    }

    final static void a(int param0, ig param1) {
        ie.field_c.a((w) (Object) param1, -16834);
        int var2 = 14 / ((55 - param0) / 49);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Name";
        field_p = "Withdraw invitation to <%0> to join this game";
        field_u = new tb();
    }
}
