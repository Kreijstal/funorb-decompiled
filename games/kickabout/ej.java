/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends hd {
    private int field_Bb;
    static String[] field_zb;
    static String field_Ab;
    static String field_yb;

    final void a(boolean param0, int param1) {
        Object var4 = null;
        if (((ej) this).field_sb == 1) {
          if (pt.field_e == ((ej) this).field_Bb) {
            pt.field_e = -1;
            if (!((ej) this).field_gb) {
              if (param1 >= -5) {
                var4 = null;
                ej.a((java.awt.Component) null, -51);
                return;
              } else {
                return;
              }
            } else {
              ob.field_C = ((ej) this).field_Bb;
              if (param1 >= -5) {
                var4 = null;
                ej.a((java.awt.Component) null, -51);
                return;
              } else {
                return;
              }
            }
          } else {
            pt.field_e = ((ej) this).field_Bb;
            if (!((ej) this).field_gb) {
              if (param1 >= -5) {
                var4 = null;
                ej.a((java.awt.Component) null, -51);
                return;
              } else {
                return;
              }
            } else {
              ob.field_C = ((ej) this).field_Bb;
              if (param1 >= -5) {
                var4 = null;
                ej.a((java.awt.Component) null, -51);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (((ej) this).field_gb) {
            ob.field_C = ((ej) this).field_Bb;
            if (param1 < -5) {
              return;
            } else {
              var4 = null;
              ej.a((java.awt.Component) null, -51);
              return;
            }
          } else {
            if (param1 < -5) {
              return;
            } else {
              var4 = null;
              ej.a((java.awt.Component) null, -51);
              return;
            }
          }
        }
    }

    final static void b(int param0, int param1, int param2, int param3) {
        nl var4 = et.field_d.b((byte) -96);
        var4.field_O = false;
        var4.field_x = param0;
        var4.field_P = param2;
        var4.field_z = param3;
        int var5 = var4.d(5339);
        int var6 = uv.a(true, param2, param0);
        int var7 = pq.b(170, var6 ^ var5) > 1 ? 1 : 0;
        var4.field_h = var6;
        var4.a((byte) -31, 2);
        var4.a(var4.field_h, 26214);
        if (!(var7 == 0)) {
            var4.field_L = var4.field_L + 16;
        }
        var4.field_L = var4.field_L + param3;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            int var2_int = 2 % ((-26 - param1) / 58);
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) nr.field_q);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) nr.field_q);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ej.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void c(boolean param0) {
        int var3 = 0;
        var3 = Kickabout.field_G;
        if (pt.field_e == ((ej) this).field_Bb) {
          on.a(-4 + ((ej) this).field_F, ((ej) this).field_T + -4, 40, 40, 2, 65793, 128);
          on.f(((ej) this).field_F + -4, -4 + ((ej) this).field_T, 40, 40, 2, 6710886);
          if (param0) {
            if (!c.a(((ej) this).field_Bb, 0, bh.field_f)) {
              if (!pc.field_e) {
                if (((ej) this).field_Bb == 32) {
                  if (jd.f(-1)) {
                    ra.field_L.g(((ej) this).field_F, ((ej) this).field_T);
                    return;
                  } else {
                    pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                    return;
                  }
                } else {
                  pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                  return;
                }
              } else {
                qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
                return;
              }
            } else {
              qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
              return;
            }
          } else {
            ((ej) this).c(true);
            if (!c.a(((ej) this).field_Bb, 0, bh.field_f)) {
              L0: {
                if (!pc.field_e) {
                  if (((ej) this).field_Bb != 32) {
                    pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                    break L0;
                  } else {
                    if (!jd.f(-1)) {
                      pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                      return;
                    } else {
                      ra.field_L.g(((ej) this).field_F, ((ej) this).field_T);
                      return;
                    }
                  }
                } else {
                  qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
                  break L0;
                }
              }
              return;
            } else {
              qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
              return;
            }
          }
        } else {
          if (((ej) this).field_Bb == ob.field_C) {
            on.a(((ej) this).field_F + -4, -4 + ((ej) this).field_T, 40, 40, 2, 65793, 32);
            on.f(((ej) this).field_F - 4, -4 + ((ej) this).field_T, 40, 40, 2, 6710886);
            if (param0) {
              if (!c.a(((ej) this).field_Bb, 0, bh.field_f)) {
                if (!pc.field_e) {
                  if (((ej) this).field_Bb == 32) {
                    if (!jd.f(-1)) {
                      pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                      return;
                    } else {
                      ra.field_L.g(((ej) this).field_F, ((ej) this).field_T);
                      return;
                    }
                  } else {
                    pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                    return;
                  }
                } else {
                  qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
                  return;
                }
              } else {
                qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
                return;
              }
            } else {
              ((ej) this).c(true);
              if (!c.a(((ej) this).field_Bb, 0, bh.field_f)) {
                L1: {
                  if (!pc.field_e) {
                    if (((ej) this).field_Bb != 32) {
                      pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                      break L1;
                    } else {
                      if (!jd.f(-1)) {
                        pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                        return;
                      } else {
                        ra.field_L.g(((ej) this).field_F, ((ej) this).field_T);
                        return;
                      }
                    }
                  } else {
                    qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
                    break L1;
                  }
                }
                return;
              } else {
                qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
                return;
              }
            }
          } else {
            if (param0) {
              if (!c.a(((ej) this).field_Bb, 0, bh.field_f)) {
                if (!pc.field_e) {
                  if (((ej) this).field_Bb == 32) {
                    if (!jd.f(-1)) {
                      pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                      return;
                    } else {
                      ra.field_L.g(((ej) this).field_F, ((ej) this).field_T);
                      return;
                    }
                  } else {
                    pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                    return;
                  }
                } else {
                  qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
                  return;
                }
              } else {
                qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
                return;
              }
            } else {
              ((ej) this).c(true);
              if (!c.a(((ej) this).field_Bb, 0, bh.field_f)) {
                L2: {
                  if (!pc.field_e) {
                    if (((ej) this).field_Bb != 32) {
                      pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                      break L2;
                    } else {
                      if (!jd.f(-1)) {
                        pn.field_w.g(((ej) this).field_F, ((ej) this).field_T);
                        return;
                      } else {
                        ra.field_L.g(((ej) this).field_F, ((ej) this).field_T);
                        return;
                      }
                    }
                  } else {
                    qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
                    break L2;
                  }
                }
                return;
              } else {
                qe.field_i[iw.field_e[((ej) this).field_Bb]].g(((ej) this).field_F, ((ej) this).field_T);
                return;
              }
            }
          }
        }
    }

    public static void h(byte param0) {
        if (param0 <= 102) {
          ej.h((byte) 120);
          field_zb = null;
          field_Ab = null;
          field_yb = null;
          return;
        } else {
          field_zb = null;
          field_Ab = null;
          field_yb = null;
          return;
        }
    }

    ej(int param0) {
        ((ej) this).field_Bb = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ab = "Spectate <%0>'s game";
        field_zb = new String[]{"park", "beach", "street"};
        field_yb = "Waiting for music";
    }
}
