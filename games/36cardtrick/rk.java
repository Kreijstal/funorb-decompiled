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
            java.applet.Applet var3 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    if (param1 <= -81) {
                      break L1;
                    } else {
                      var3 = (java.applet.Applet) null;
                      rk.a((java.applet.Applet) null, (byte) 125);
                      break L1;
                    }
                  }
                  param0.getAppletContext().showDocument(fh.a(param0, var2, -1), "_top");
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
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("rk.J(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, byte param1, int param2) {
        super.b(param0, param1, param2);
        vd.field_p.a(this.field_bb, param0 + (this.field_h >> -291920831), param2 - -103, 16777215, -1);
        if (this.field_db != null) {
            vj.d(20 + param0, -7 + param2 - -120, 260, 8421504);
            vd.field_p.a(this.field_db, 20 + param0, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, vd.field_p.field_s);
        }
    }

    final static void a(boolean param0, uf param1, boolean param2) {
        if (param1 == null || vc.field_a == param1) {
            return;
        }
        param1.a(fe.field_a * 64 / 80);
        if (param0) {
            param1.c();
        }
        if (!(null == vc.field_a)) {
            sh.field_e.a(vc.field_a);
        }
        if (param2) {
            return;
        }
        try {
            vc.field_a = param1;
            sh.field_e.b(vc.field_a);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "rk.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(String param0, boolean param1, float param2, byte param3) {
        try {
            if ((!this.field_cb ? 1 : 0) != (param1 ? 1 : 0)) {
            } else {
                this.field_cb = param1 ? true : false;
                if (this.field_cb) {
                    this.field_Y.a(0, 4210752, 8405024);
                    this.field_Y.field_I = true;
                } else {
                    this.field_Y.a(0, 4210752, 2113632);
                    if (!(!this.field_W)) {
                        this.field_Y.field_I = false;
                    }
                }
            }
            this.field_bb = param0;
            if (param3 != -63) {
                this.field_W = false;
            }
            this.field_Y.field_J = (int)(65536.0f * (param2 / 100.0f));
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "rk.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(boolean param0) {
        this.field_W = param0 ? true : false;
        this.field_Y.field_I = false;
    }

    rk(j param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_db = param1;
            if (null != this.field_db) {
                var3_int = vd.field_p.b(this.field_db, 260, vd.field_p.field_s);
                this.a(var3_int + 150, 300, -1);
            }
            this.field_Y = new ng(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_W = false;
            this.field_Y.field_I = true;
            this.field_cb = false;
            this.b(this.field_Y, (byte) 118);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "rk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_fb = null;
        field_ab = null;
        int var1 = -71 / ((param0 - 18) / 35);
        field_eb = null;
        field_Z = null;
    }

    static {
        field_fb = new cc();
        field_ab = null;
        field_eb = new cc();
    }
}
