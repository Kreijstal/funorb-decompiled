/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String field_c;
    static String field_g;
    static String field_d;
    static int field_e;
    static ga field_f;
    static km field_a;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        if (param0 != 113) {
            return;
        }
        field_d = null;
        field_a = null;
        field_g = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        hg var2 = gk.field_g;
        var2.g(param1, 8);
        var2.field_l = var2.field_l + 1;
        int var3 = var2.field_l;
        var2.a(5, 122);
        var2.a(wl.field_d.field_vc, 101);
        int var4 = (wl.field_d.field_lc << -279921594) + wl.field_d.field_fc;
        var2.a(var4, param0 ^ -74);
        var2.a(wl.field_d.field_Pb, wl.field_d.field_Pb.length, param0, (byte) -126);
        var2.b(-var3 + var2.field_l, -1);
    }

    final static boolean a(int param0) {
        if (param0 != -11532) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            sd.a(119, (java.applet.Applet) null);
            return kb.field_c;
        }
        return kb.field_c;
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        int var4 = 0;
        var4 = -72 / ((param3 - -13) / 32);
        if (0 == param2) {
          if (param0 != ca.field_D) {
            L0: {
              ad.field_l = true;
              ca.field_D = param0;
              sh.a((byte) -112, param1);
              if (param2 != 1) {
                break L0;
              } else {
                if (qe.field_m == param0) {
                  break L0;
                } else {
                  qe.field_m = param0;
                  ad.field_l = true;
                  sh.a((byte) -112, param1);
                  if (param2 == 2) {
                    if (param0 == el.field_t) {
                      return;
                    } else {
                      el.field_t = param0;
                      ad.field_l = true;
                      sh.a((byte) -112, param1);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (param2 == 2) {
              if (param0 != el.field_t) {
                el.field_t = param0;
                ad.field_l = true;
                sh.a((byte) -112, param1);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L1: {
              if (param2 != 1) {
                break L1;
              } else {
                if (qe.field_m == param0) {
                  break L1;
                } else {
                  qe.field_m = param0;
                  ad.field_l = true;
                  sh.a((byte) -112, param1);
                  if (param2 == 2) {
                    if (param0 != el.field_t) {
                      el.field_t = param0;
                      ad.field_l = true;
                      sh.a((byte) -112, param1);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (param2 == 2) {
              if (param0 != el.field_t) {
                el.field_t = param0;
                ad.field_l = true;
                sh.a((byte) -112, param1);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (param2 == 1) {
            if (qe.field_m != param0) {
              qe.field_m = param0;
              ad.field_l = true;
              sh.a((byte) -112, param1);
              if (param2 == 2) {
                if (param0 == el.field_t) {
                  return;
                } else {
                  el.field_t = param0;
                  ad.field_l = true;
                  sh.a((byte) -112, param1);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (param2 == 2) {
                if (param0 != el.field_t) {
                  el.field_t = param0;
                  ad.field_l = true;
                  sh.a((byte) -112, param1);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (param2 == 2) {
              if (param0 == el.field_t) {
                return;
              } else {
                el.field_t = param0;
                ad.field_l = true;
                sh.a((byte) -112, param1);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            qk.a("", param1, -1);
            if (param0 != 5) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                sd.a(99, (java.applet.Applet) null);
            }
            dc.a(-11670, param1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_e = 0;
        field_d = "Music: ";
        field_g = "Quick Chat game";
        field_b = "2D";
    }
}
