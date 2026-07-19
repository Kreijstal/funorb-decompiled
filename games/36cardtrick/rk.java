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
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("rk.J(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
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
        int discarded$0 = 0;
        super.b(param0, param1, param2);
        vd.field_p.a(this.field_bb, param0 + (this.field_h >> -291920831), param2 - -103, 16777215, -1);
        if (this.field_db != null) {
            vj.d(20 + param0, -7 + param2 - -120, 260, 8421504);
            discarded$0 = vd.field_p.a(this.field_db, 20 + param0, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, vd.field_p.field_s);
        }
    }

    final static void a(boolean param0, uf param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
                      sh.field_e.a(vc.field_a);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (!param2) {
                    vc.field_a = param1;
                    sh.field_e.b(vc.field_a);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("rk.HA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
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
