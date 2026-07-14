/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends f implements pl {
    private qh field_tb;
    private boolean field_vb;
    static String field_sb;
    private boolean field_wb;
    static int field_ub;

    public static void r(int param0) {
        int var1 = -70 / ((param0 - 27) / 48);
        field_sb = null;
    }

    final static void a(String param0, byte param1, boolean param2, String param3) {
        b.field_a = param0;
        hg.field_d = param3;
        int var4 = -62 % ((13 - param1) / 62);
        fa.a(rj.field_g, 480, param2);
    }

    private final void a(boolean param0, sl param1, byte param2) {
        String var4 = null;
        ni var5 = null;
        int var6 = 0;
        L0: {
          var6 = Geoblox.field_C;
          ((r) this).field_wb = true;
          if (param2 <= -21) {
            break L0;
          } else {
            field_sb = null;
            break L0;
          }
        }
        L1: {
          if (!param1.field_g) {
            if (null == param1.field_a) {
              var4 = param1.field_e;
              if (param1.field_j != 248) {
                break L1;
              } else {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    cf.h(-65);
                    break L2;
                  }
                }
                ((r) this).field_vb = true;
                var4 = hi.field_I;
                break L1;
              }
            } else {
              var4 = rh.field_j;
              if (null == ((r) this).field_tb) {
                break L1;
              } else {
                ((r) this).field_tb.a((byte) 83);
                break L1;
              }
            }
          } else {
            var4 = lh.field_c;
            break L1;
          }
        }
        L3: {
          var5 = new ni((f) this, hh.field_c, var4);
          if (param1.field_g) {
            if (param1.field_d) {
              ((r) this).b((el) (Object) new s((r) this), -111);
              return;
            } else {
              hk discarded$2 = var5.a(-2, cl.field_d, (bb) this);
              break L3;
            }
          } else {
            L4: {
              if (!((r) this).field_vb) {
                if (param1.field_j == 5) {
                  var5.a(nf.field_E, 1, 11);
                  var5.a(rj.field_e, 1, 17);
                  break L4;
                } else {
                  var5.a(ll.field_b, 1, -1);
                  break L4;
                }
              } else {
                hk discarded$3 = var5.a(-2, cl.field_d, (bb) this);
                break L4;
              }
            }
            if (-4 == (param1.field_j ^ -1)) {
              var5.a(ee.field_y, 1, 7);
              break L3;
            } else {
              if (6 != param1.field_j) {
                break L3;
              } else {
                var5.a(jc.field_c, 1, 9);
                break L3;
              }
            }
          }
        }
        ((r) this).b((el) (Object) var5, -36);
    }

    r(ng param0, qh param1) {
        super(param0, hh.field_c, se.field_i, false, false);
        ((r) this).field_tb = param1;
    }

    final static nd a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var6 = Geoblox.field_C;
        var2 = param0.length();
        if (-1 == var2) {
          return pj.field_f;
        } else {
          if (-65 < var2) {
            return hk.field_x;
          } else {
            if (34 != param0.charAt(0)) {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var4 >= var2) {
                  if (!param1) {
                    field_sb = null;
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  var5 = param0.charAt(var4);
                  if (var5 == 46) {
                    L1: {
                      if (0 == var4) {
                        break L1;
                      } else {
                        if (var4 == -1 + var2) {
                          break L1;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    return ii.field_h;
                  } else {
                    if (0 == (rd.field_w.indexOf(var5) ^ -1)) {
                      return ii.field_h;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  }
                }
              }
            } else {
              if (-35 != (param0.charAt(var2 + -1) ^ -1)) {
                return ii.field_h;
              } else {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (var4 < -1 + var2) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L3: {
                        if (var3 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L3;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L3;
                        }
                      }
                      var3 = stackIn_18_0;
                      var4++;
                      continue L2;
                    } else {
                      if (var5 != 34) {
                        var3 = 0;
                        var4++;
                        continue L2;
                      } else {
                        if (var3 == 0) {
                          return ii.field_h;
                        } else {
                          var3 = 0;
                          var4++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        }
    }

    final void q(int param0) {
        this.a(true, ig.a(hi.field_I, 248, false), (byte) -57);
        if (param0 != 12086) {
            ((r) this).field_wb = false;
        }
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        if (!(!((r) this).field_vb)) {
            b.a(true, false, false);
            return;
        }
        if (param1 != -20) {
            return;
        }
        ki.a(-112);
        ((r) this).h((byte) -104);
    }

    final boolean f(int param0) {
        sl var2 = null;
        if (param0 != -1) {
            field_sb = null;
        }
        if (((r) this).field_I) {
            if (!(((r) this).field_wb)) {
                var2 = n.d((byte) 93);
                if (!(var2 == null)) {
                    this.a(false, var2, (byte) -69);
                }
            }
        }
        return super.f(-1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_sb = "You are not currently logged in to this service. To store your score, progress and any Achievements, you must log in or create an account.";
    }
}
