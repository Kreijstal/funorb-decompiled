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
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            Object var3 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    if (param1 <= -81) {
                      break L1;
                    } else {
                      var3 = null;
                      rk.a((java.applet.Applet) null, (byte) 125);
                      break L1;
                    }
                  }
                  int discarded$2 = -1;
                  param0.getAppletContext().showDocument(fh.a(param0, var2), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("rk.J(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, byte param1, int param2) {
        super.b(param0, param1, param2);
        vd.field_p.a(((rk) this).field_bb, param0 + (((rk) this).field_h >> 1), param2 - -103, 16777215, -1);
        if (((rk) this).field_db != null) {
            vj.d(20 + param0, -7 + param2 - -120, 260, 8421504);
            int discarded$0 = vd.field_p.a(((rk) this).field_db, 20 + param0, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, vd.field_p.field_s);
        }
    }

    final static void a(boolean param0, uf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (vc.field_a != param1) {
                  L2: {
                    param1.a(fe.field_a * 64 / 80);
                    if (!param0) {
                      break L2;
                    } else {
                      param1.c();
                      break L2;
                    }
                  }
                  L3: {
                    if (null != vc.field_a) {
                      sh.field_e.a((sf) (Object) vc.field_a);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  vc.field_a = param1;
                  sh.field_e.b((sf) (Object) vc.field_a);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("rk.HA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 0 + 41);
        }
    }

    final void a(String param0, boolean param1, float param2, byte param3) {
        try {
            if ((!((rk) this).field_cb ? 1 : 0) != (param1 ? 1 : 0)) {
            } else {
                ((rk) this).field_cb = param1 ? true : false;
                if (((rk) this).field_cb) {
                    ((rk) this).field_Y.a(0, 4210752, 8405024);
                    ((rk) this).field_Y.field_I = true;
                } else {
                    ((rk) this).field_Y.a(0, 4210752, 2113632);
                    if (!(!((rk) this).field_W)) {
                        ((rk) this).field_Y.field_I = false;
                    }
                }
            }
            ((rk) this).field_bb = param0;
            if (param3 != -63) {
                ((rk) this).field_W = false;
            }
            ((rk) this).field_Y.field_J = (int)(65536.0f * (param2 / 100.0f));
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "rk.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void c(boolean param0) {
        ((rk) this).field_W = param0 ? true : false;
        ((rk) this).field_Y.field_I = false;
    }

    rk(j param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((rk) this).field_db = param1;
            if (null != ((rk) this).field_db) {
                var3_int = vd.field_p.b(((rk) this).field_db, 260, vd.field_p.field_s);
                ((rk) this).a(var3_int + 150, 300, -1);
            }
            ((rk) this).field_Y = new ng(13, 50, 274, 30, 15, 2113632, 4210752);
            ((rk) this).field_W = false;
            ((rk) this).field_Y.field_I = true;
            ((rk) this).field_cb = false;
            ((rk) this).b((lk) (Object) ((rk) this).field_Y, (byte) 118);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "rk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void e() {
        field_fb = null;
        field_ab = null;
        int var1 = 71;
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
