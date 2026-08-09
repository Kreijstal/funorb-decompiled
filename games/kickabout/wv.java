/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wv extends mu implements vh {
    static int field_ib;
    private boolean field_db;
    private boolean field_cb;
    private boolean field_gb;
    private ou field_jb;
    private boolean field_hb;
    static r field_fb;
    private hu field_eb;
    static String field_bb;

    final static void a(byte param0, int param1, tf param2, java.awt.Point[] param3) {
        int var4_int = 0;
        java.awt.Point var5 = null;
        java.awt.Point var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= param3.length) {
                L2: {
                  if (param0 == -108) {
                    break L2;
                  } else {
                    field_bb = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = param3[var4_int];
                var6 = param3[(var4_int - -1) % param3.length];
                nm.a(var6.x, param1, var6.y, var5.y, var5.x, param2, (byte) -109);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("wv.TB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
    }

    public static void j(byte param0) {
        field_bb = null;
        field_fb = null;
        int var1 = -48 % ((-50 - param0) / 51);
    }

    final void q(int param0) {
        if (!(this.field_C)) {
            return;
        }
        this.field_C = false;
        if (this.field_gb || this.field_db) {
            uj.b(true);
        }
        if (param0 >= -75) {
            field_ib = -91;
        }
    }

    public void a(int param0, wi param1, int param2, byte param3, int param4) {
        wi var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param3 > 64) {
                break L1;
              } else {
                var7 = (wi) null;
                this.a(-123, (wi) null, 56, (byte) 64, 43);
                break L1;
              }
            }
            L2: {
              if (!this.field_cb) {
                im.a(so.a(-79), 126, "tochangedisplayname.ws");
                break L2;
              } else {
                qd.b(38, 3);
                this.q(-97);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("wv.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void r(int param0) {
        this.field_jb.a((byte) 21, 4210752, param0);
        qp var2 = new qp((wv) (this), this.field_eb, ii.field_m);
        var2.a((byte) 99, 15, ta.field_E);
        this.a((byte) -124, (fd) (var2));
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -60) {
                break L1;
              } else {
                wv.j((byte) 84);
                break L1;
              }
            }
            if ((param3 ^ -1) == -14) {
              this.q(-115);
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = super.a(param0, (byte) -94, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("wv.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(int param0, int param1, String param2) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        qp stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        qp stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        String stackIn_11_3;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        java.awt.Point[] var6 = null;
        qp var7 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (!this.field_hb) {
              L1: {
                stackIn_5_0 = this;

                if (param0 != 256) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((wv) (this)).field_cb = stackIn_6_1 != 0;
                this.field_hb = true;
                this.field_jb.a((byte) 21, 4210752, 8405024);
                var7 = new qp((wv) (this), this.field_eb, param2);
                var4 = var7;
                if (param0 == 5) {
                  var7.a((byte) 72, 11, ql.field_d);
                  var7.a((byte) 104, 17, bv.field_o);
                  break L2;
                } else {
                  if (-257 == (param0 ^ -1)) {
                    var7.a(bt.field_d, (jv) (this), (byte) 79);
                    break L2;
                  } else {
                    L3: {
                      stackIn_10_0 = (qp) (var7);

                      stackIn_10_1 = 111;

                      stackIn_10_2 = -1;

                      if (this.field_gb) {
                        stackIn_11_0 = (qp) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = stackIn_10_2;
                        stackIn_11_3 = bt.field_d;
                        break L3;
                      } else {
                        stackIn_11_0 = (qp) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = stackIn_10_2;
                        stackIn_11_3 = is.field_f;
                        break L3;
                      }
                    }
                    ((qp) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_11_2, stackIn_11_3);
                    break L2;
                  }
                }
              }
              L4: {
                if ((param0 ^ -1) != -4) {
                  if ((param0 ^ -1) == -5) {
                    var7.a((byte) 96, 8, ra.field_O);
                    break L4;
                  } else {
                    if ((param0 ^ -1) == -7) {
                      var7.a((byte) 92, 9, bv.field_p);
                      break L4;
                    } else {
                      if (9 != param0) {
                        break L4;
                      } else {
                        var7.a(ir.field_C, (jv) (this), (byte) 79);
                        break L4;
                      }
                    }
                  }
                } else {
                  var7.a((byte) 54, 7, ha.field_J);
                  break L4;
                }
              }
              L5: {
                if (param1 >= 96) {
                  break L5;
                } else {
                  var6 = (java.awt.Point[]) null;
                  wv.a((byte) -60, 109, (tf) null, (java.awt.Point[]) null);
                  break L5;
                }
              }
              this.a((byte) -120, (fd) (var7));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var4_ref);

            stackIn_28_1 = new StringBuilder().append("wv.SB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    wv(se param0, hu param1, String param2, boolean param3, boolean param4) {
        super(param0, new qp((wv) null, param1, param2), 77, 10, 10);
        try {
            this.field_cb = false;
            this.field_eb = param1;
            this.field_hb = false;
            this.field_db = param4 ? true : false;
            this.field_gb = param3 ? true : false;
            this.field_jb = new ou(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_jb.field_w = true;
            this.a(-42, this.field_jb);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_bb = "This game option has not yet been unlocked for use.";
        field_fb = new r();
    }
}
