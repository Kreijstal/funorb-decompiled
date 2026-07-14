/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class q extends ib implements ga {
    static uj field_h;
    static double field_f;
    private dj field_g;

    final static void a(byte param0, boolean param1) {
        if (param0 < 102) {
            return;
        }
        b.a(false, param1, false);
    }

    final lh e(int param0) {
        if (param0 != 32) {
            return null;
        }
        return ((q) this).a(-257, ((q) this).field_g.field_s);
    }

    public final boolean a(int param0) {
        Object var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -26556) {
          if (((q) this).field_g.field_s != null) {
            if (((q) this).field_g.field_s.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var3 = null;
          String discarded$4 = ((q) this).b(-33, (String) null);
          if (((q) this).field_g.field_s == null) {
            return true;
          } else {
            L0: {
              if (((q) this).field_g.field_s.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final void a(dj param0, int param1) {
        if (param1 != -18649) {
            ((q) this).field_g = null;
        }
    }

    abstract String b(int param0, String param1);

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (!pf.a(-123, param0)) {
            if (param0 != 45) {
              if (param0 != 160) {
                if (32 != param0) {
                  if (param0 != 95) {
                    if (param1 <= 88) {
                      return false;
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
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, d param5, String param6, int param7, int param8) {
        ag.field_l = param7;
        bm.field_u = param3;
        gh.field_z = param6;
        hc.field_T = param0;
        pc.field_C = param1;
        vg.field_a = param2;
        ph.field_i = param5;
        if (param4 != -23949) {
          field_f = -0.8279321027589008;
          ij.field_W = param8;
          wg.field_i = (ji) (Object) new kk();
          cl.field_c = new uf(param5);
          gb.field_b = new em(wg.field_i, cl.field_c);
          return;
        } else {
          ij.field_W = param8;
          wg.field_i = (ji) (Object) new kk();
          cl.field_c = new uf(param5);
          gb.field_b = new em(wg.field_i, cl.field_c);
          return;
        }
    }

    public final void a(dj param0, byte param1) {
        if (param1 != 74) {
            boolean discarded$0 = ((q) this).a(-117);
            ((q) this).b(-28133);
            return;
        }
        ((q) this).b(-28133);
    }

    final static void a(byte param0, int param1, String param2) {
        int var3 = 0;
        Object var4 = null;
        va.field_d = false;
        ii.field_a = false;
        if (null != Geoblox.field_y) {
          if (Geoblox.field_y.field_I) {
            L0: {
              if (8 == param1) {
                L1: {
                  param1 = 2;
                  if (!cf.field_i) {
                    param2 = mi.field_E;
                    break L1;
                  } else {
                    param2 = rc.field_f;
                    break L1;
                  }
                }
                ml.field_t.a(b.field_a, 0);
                break L0;
              } else {
                break L0;
              }
            }
            L2: {
              var3 = 1;
              if ((param1 ^ -1) == -11) {
                n.c((byte) -4);
                var3 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var3 == 0) {
                break L3;
              } else {
                L4: {
                  if (!ii.field_a) {
                    break L4;
                  } else {
                    param2 = wj.a(mi.field_R, new String[1], (byte) -25);
                    break L4;
                  }
                }
                L5: {
                  if (!mi.field_I) {
                    break L5;
                  } else {
                    param2 = kf.field_b;
                    break L5;
                  }
                }
                Geoblox.field_y.a(param1, param0 + 19686, param2);
                break L3;
              }
            }
            L6: {
              if ((param1 ^ -1) == -257) {
                break L6;
              } else {
                if ((param1 ^ -1) != -11) {
                  if (!cf.field_i) {
                    ml.field_t.i(-119);
                    break L6;
                  } else {
                    if (param0 != 124) {
                      var4 = null;
                      q.a(-94, -21, 56, -5, 62, (d) null, (String) null, -54, -101);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param0 != 124) {
                    var4 = null;
                    q.a(-94, -21, 56, -5, 62, (d) null, (String) null, -54, -101);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 != 124) {
              var4 = null;
              q.a(-94, -21, 56, -5, 62, (d) null, (String) null, -54, -101);
              return;
            } else {
              return;
            }
          } else {
            if (param0 == 124) {
              return;
            } else {
              var4 = null;
              q.a(-94, -21, 56, -5, 62, (d) null, (String) null, -54, -101);
              return;
            }
          }
        } else {
          if (param0 != 124) {
            var4 = null;
            q.a(-94, -21, 56, -5, 62, (d) null, (String) null, -54, -101);
            return;
          } else {
            return;
          }
        }
    }

    final static qd a(rh param0, int param1, String param2, String param3, rh param4) {
        if (param1 != 1) {
            Object var7 = null;
            q.a((byte) 108, 111, (String) null);
        }
        int var5 = param4.a((byte) 126, param3);
        int var6 = param4.a(param2, param1 + -69, var5);
        return ea.a(param4, (byte) -127, param0, var6, var5);
    }

    abstract lh a(int param0, String param1);

    final String b(byte param0) {
        if (param0 != -103) {
          ((q) this).field_g = null;
          return ((q) this).b(422, ((q) this).field_g.field_s);
        } else {
          return ((q) this).b(422, ((q) this).field_g.field_s);
        }
    }

    public static void f(int param0) {
        field_h = null;
        if (param0 != 1) {
            field_h = null;
        }
    }

    q(dj param0) {
        ((q) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new uj();
        field_f = Math.atan2(1.0, 0.0);
    }
}
