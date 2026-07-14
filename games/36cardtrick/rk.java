/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends jc {
    private boolean field_cb;
    private String field_db;
    private String field_bb;
    static int field_X;
    static tk[] field_Z;
    private ng field_Y;
    private boolean field_W;
    static cc field_fb;
    static cc field_eb;
    static String field_ab;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                if (param1 > -81) {
                    java.applet.Applet var3 = (java.applet.Applet) null;
                    rk.a((java.applet.Applet) null, (byte) 125);
                }
                param0.getAppletContext().showDocument(fh.a(param0, var2, -1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, byte param1, int param2) {
        this.b(param0, param1, param2);
        vd.field_p.a(((rk) this).field_bb, param0 + (((rk) this).field_h >> -291920831), param2 - -103, 16777215, -1);
        if (((rk) this).field_db != null) {
            vj.d(20 + param0, -7 + param2 - -120, 260, 8421504);
            int discarded$0 = vd.field_p.a(((rk) this).field_db, 20 + param0, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, vd.field_p.field_s);
        }
    }

    final static void a(boolean param0, uf param1, boolean param2) {
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (vc.field_a != param1) {
              param1.a(fe.field_a * 64 / 80);
              if (!param0) {
                L1: {
                  if (null != vc.field_a) {
                    sh.field_e.a((sf) (Object) vc.field_a);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param2) {
                  return;
                } else {
                  vc.field_a = param1;
                  sh.field_e.b((sf) (Object) vc.field_a);
                  return;
                }
              } else {
                L2: {
                  param1.c();
                  if (null != vc.field_a) {
                    sh.field_e.a((sf) (Object) vc.field_a);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param2) {
                  return;
                } else {
                  vc.field_a = param1;
                  sh.field_e.b((sf) (Object) vc.field_a);
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void a(String param0, boolean param1, float param2, byte param3) {
        int stackIn_3_0 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          if (((rk) this).field_cb) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == (param1 ? 1 : 0)) {
          L1: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param1) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L1;
            }
          }
          ((rk) this).field_cb = stackIn_11_1 != 0;
          if (!((rk) this).field_cb) {
            ((rk) this).field_Y.a(0, 4210752, 2113632);
            if (((rk) this).field_W) {
              ((rk) this).field_Y.field_I = false;
              ((rk) this).field_bb = param0;
              if (param3 != -63) {
                ((rk) this).field_W = false;
                ((rk) this).field_Y.field_J = (int)(65536.0f * (param2 / 100.0f));
                return;
              } else {
                ((rk) this).field_Y.field_J = (int)(65536.0f * (param2 / 100.0f));
                return;
              }
            } else {
              ((rk) this).field_bb = param0;
              if (param3 != -63) {
                ((rk) this).field_W = false;
                ((rk) this).field_Y.field_J = (int)(65536.0f * (param2 / 100.0f));
                return;
              } else {
                ((rk) this).field_Y.field_J = (int)(65536.0f * (param2 / 100.0f));
                return;
              }
            }
          } else {
            ((rk) this).field_Y.a(0, 4210752, 8405024);
            ((rk) this).field_Y.field_I = true;
            ((rk) this).field_bb = param0;
            if (param3 == -63) {
              ((rk) this).field_Y.field_J = (int)(65536.0f * (param2 / 100.0f));
              return;
            } else {
              ((rk) this).field_W = false;
              ((rk) this).field_Y.field_J = (int)(65536.0f * (param2 / 100.0f));
              return;
            }
          }
        } else {
          ((rk) this).field_bb = param0;
          if (param3 == -63) {
            ((rk) this).field_Y.field_J = (int)(65536.0f * (param2 / 100.0f));
            return;
          } else {
            ((rk) this).field_W = false;
            ((rk) this).field_Y.field_J = (int)(65536.0f * (param2 / 100.0f));
            return;
          }
        }
    }

    final void c(boolean param0) {
        ((rk) this).field_W = param0 ? true : false;
        ((rk) this).field_Y.field_I = false;
    }

    rk(j param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((rk) this).field_db = param1;
        if (null != ((rk) this).field_db) {
            var3 = vd.field_p.b(((rk) this).field_db, 260, vd.field_p.field_s);
            ((rk) this).a(var3 + 150, 300, -1);
        }
        ((rk) this).field_Y = new ng(13, 50, 274, 30, 15, 2113632, 4210752);
        ((rk) this).field_W = false;
        ((rk) this).field_Y.field_I = true;
        ((rk) this).field_cb = false;
        ((rk) this).b((lk) (Object) ((rk) this).field_Y, (byte) 118);
    }

    public static void e(byte param0) {
        field_fb = null;
        field_ab = null;
        int var1 = -71 / ((param0 - 18) / 35);
        field_eb = null;
        field_Z = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = new cc();
        field_ab = null;
        field_eb = new cc();
    }
}
