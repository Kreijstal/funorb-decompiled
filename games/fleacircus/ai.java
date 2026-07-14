/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends r {
    static dd[] field_n;
    static String field_o;

    final wd a(int param0, String param1) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 == 160) {
          L0: {
            if (pd.a(-94, param1) != null) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          var3 = stackIn_11_0;
          if (var3 == 0) {
            return ml.field_K;
          } else {
            return hm.field_b;
          }
        } else {
          L1: {
            field_o = null;
            if (pd.a(-94, param1) != null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          if (var3 == 0) {
            return ml.field_K;
          } else {
            return hm.field_b;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 != -10) {
            field_n = null;
            field_n = null;
            field_o = null;
            return;
        }
        field_n = null;
        field_o = null;
    }

    final static void a(int param0, int param1, qc param2, boolean param3) {
        mk.field_d = param2;
        bb.field_C = param0;
        q.field_d = param1;
        if (param3) {
            ai.c((byte) 109);
        }
    }

    ai(c param0) {
        super(param0);
    }

    final String a(byte param0, String param1) {
        if (((ai) this).a(160, param1) == ml.field_K) {
            return bg.field_a;
        }
        int var3 = -7 % ((param0 - 24) / 46);
        return ha.field_j;
    }

    final static void e(int param0) {
        pd var1 = null;
        int var2 = 0;
        var2 = fleas.field_A ? 1 : 0;
        db.field_J.a();
        tg.field_i.a();
        gg.field_g = gg.field_g - 1;
        if (param0 == -20846) {
          if (-1 == (gg.field_g ^ -1)) {
            gg.field_g = 200;
            var1 = (pd) (Object) bk.field_d.c((byte) 47);
            L0: while (true) {
              if (var1 == null) {
                if (jc.field_c != null) {
                  var1 = (pd) (Object) jc.field_c.c((byte) 47);
                  L1: while (true) {
                    if (var1 == null) {
                      L2: {
                        if (gg.field_h == null) {
                          break L2;
                        } else {
                          if (!gg.field_h.d(31499)) {
                            ae.field_b = null;
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      L3: {
                        if (!var1.field_n.b((byte) -54)) {
                          var1.c(-1);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var1 = (pd) (Object) jc.field_c.b((byte) -105);
                      continue L1;
                    }
                  }
                } else {
                  L4: {
                    if (gg.field_h == null) {
                      break L4;
                    } else {
                      if (!gg.field_h.d(31499)) {
                        ae.field_b = null;
                        break L4;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                L5: {
                  if (var1.field_n.b((byte) -54)) {
                    break L5;
                  } else {
                    var1.c(param0 + 20845);
                    break L5;
                  }
                }
                var1 = (pd) (Object) bk.field_d.b((byte) -105);
                continue L0;
              }
            }
          } else {
            L6: {
              if (gg.field_h == null) {
                break L6;
              } else {
                if (!gg.field_h.d(31499)) {
                  ae.field_b = null;
                  break L6;
                } else {
                  return;
                }
              }
            }
            return;
          }
        } else {
          ai.c((byte) -57);
          if (-1 == (gg.field_g ^ -1)) {
            gg.field_g = 200;
            var1 = (pd) (Object) bk.field_d.c((byte) 47);
            L7: while (true) {
              if (var1 == null) {
                if (jc.field_c != null) {
                  var1 = (pd) (Object) jc.field_c.c((byte) 47);
                  L8: while (true) {
                    if (var1 != null) {
                      L9: {
                        if (!var1.field_n.b((byte) -54)) {
                          var1.c(-1);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var1 = (pd) (Object) jc.field_c.b((byte) -105);
                      continue L8;
                    } else {
                      L10: {
                        if (gg.field_h == null) {
                          break L10;
                        } else {
                          if (!gg.field_h.d(31499)) {
                            ae.field_b = null;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (gg.field_h == null) {
                    return;
                  } else {
                    L11: {
                      if (!gg.field_h.d(31499)) {
                        ae.field_b = null;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    return;
                  }
                }
              } else {
                L12: {
                  if (var1.field_n.b((byte) -54)) {
                    break L12;
                  } else {
                    var1.c(param0 + 20845);
                    break L12;
                  }
                }
                var1 = (pd) (Object) bk.field_d.b((byte) -105);
                continue L7;
              }
            }
          } else {
            if (gg.field_h == null) {
              return;
            } else {
              L13: {
                if (!gg.field_h.d(31499)) {
                  ae.field_b = null;
                  break L13;
                } else {
                  break L13;
                }
              }
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Have fun!";
    }
}
