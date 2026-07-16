/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends ec {
    static String field_g;
    static int field_f;

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, boolean param2) {
        Object var3 = null;
        Object var4 = null;
        Object var5 = null;
        if (!param2) {
          var3 = null;
          var4 = null;
          if (null != field_g) {
            if (field_g.equals((Object) (Object) param0.getParameter("settings"))) {
              L0: {
                if (null == sa.field_P) {
                  break L0;
                } else {
                  if (sa.field_P.equals((Object) (Object) param0.getParameter("session"))) {
                    break L0;
                  } else {
                    var4 = (Object) (Object) sa.field_P;
                    break L0;
                  }
                }
              }
              return ue.a(param1, 56, (String) var3, -1, (String) var4);
            } else {
              L1: {
                var3 = (Object) (Object) field_g;
                var4 = var3;
                var4 = var3;
                if (null == sa.field_P) {
                  break L1;
                } else {
                  if (sa.field_P.equals((Object) (Object) param0.getParameter("session"))) {
                    break L1;
                  } else {
                    var4 = (Object) (Object) sa.field_P;
                    break L1;
                  }
                }
              }
              return ue.a(param1, 56, (String) var3, -1, (String) var4);
            }
          } else {
            L2: {
              if (null == sa.field_P) {
                break L2;
              } else {
                if (sa.field_P.equals((Object) (Object) param0.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = (Object) (Object) sa.field_P;
                  break L2;
                }
              }
            }
            return ue.a(param1, 56, (String) var3, -1, (String) var4);
          }
        } else {
          var5 = null;
          of.a(-79, (java.applet.Applet) null);
          var3 = null;
          var4 = null;
          if (null == field_g) {
            L3: {
              if (null == sa.field_P) {
                break L3;
              } else {
                if (sa.field_P.equals((Object) (Object) param0.getParameter("session"))) {
                  break L3;
                } else {
                  var4 = (Object) (Object) sa.field_P;
                  break L3;
                }
              }
            }
            return ue.a(param1, 56, (String) var3, -1, (String) var4);
          } else {
            L4: {
              if (!field_g.equals((Object) (Object) param0.getParameter("settings"))) {
                var3 = (Object) (Object) field_g;
                var4 = var3;
                var4 = var3;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == sa.field_P) {
                break L5;
              } else {
                if (sa.field_P.equals((Object) (Object) param0.getParameter("session"))) {
                  break L5;
                } else {
                  var4 = (Object) (Object) sa.field_P;
                  break L5;
                }
              }
            }
            return ue.a(param1, 56, (String) var3, -1, (String) var4);
          }
        }
    }

    final static void c(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) hd.field_p;
        synchronized (var1) {
          L0: {
            L1: {
              rj.field_a = db.field_bb;
              pa.field_a = pa.field_a + 1;
              if (param0 == 66) {
                break L1;
              } else {
                var3 = null;
                java.net.URL discarded$3 = of.a((java.applet.Applet) null, (java.net.URL) null, false);
                break L1;
              }
            }
            kf.field_b = la.field_s;
            fg.field_a = wi.field_a;
            mg.field_a = hd.field_q;
            hd.field_q = false;
            uk.field_a = wf.field_d;
            db.field_X = sa.field_M;
            wg.field_e = ch.field_x;
            wf.field_d = 0;
            break L0;
          }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_g = null;
    }

    of(long param0, String param1) {
        super(param0, param1);
    }

    final nh a(boolean param0) {
        if (param0) {
            of.c((byte) 60);
            return be.field_m;
        }
        return be.field_m;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                param1.getAppletContext().showDocument(of.a(param1, var2, false), "_top");
                int var3 = 10 % ((27 - param0) / 32);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
