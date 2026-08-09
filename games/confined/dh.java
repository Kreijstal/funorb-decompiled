/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends sj implements el {
    static ja field_vb;
    private boolean field_zb;
    static double field_sb;
    private boolean field_tb;
    static int field_Ab;
    private boolean field_yb;
    private boolean field_ub;
    private ib field_wb;
    private ok field_xb;

    final static nf a(boolean param0, String param1, String param2, mi param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        nf stackIn_2_0 = null;
        nf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              var4_int = param3.a(-37, param2);
              var5 = param3.a(var4_int, param1, -127);
              stackIn_4_0 = ci.a(var4_int, param3, var5, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("dh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void i(byte param0) {
        jn var2;
        this.field_wb.a(2121792, false, 4210752);
        var2 = new jn((dh) (this), this.field_xb, ne.field_d);
        if (param0 < 73) {
          return;
        } else {
          var2.a(0, tn.field_C, 15);
          this.a((fj) (var2), (byte) -72);
          return;
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-14 != (param2 ^ -1)) {
              var5_int = -48 % ((param1 - 47) / 43);
              stackIn_4_0 = super.a(param0, (byte) -2, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.n(10);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("dh.Q(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, qn param1, int param2) {
        hb var3 = vh.field_a;
        var3.b(true, param0);
        var3.f(118, 5);
        var3.f(115, 0);
        var3.c(param1.field_w, 8);
        var3.f(param2 ^ 21840, param1.field_o);
        if (param2 != 21821) {
            return;
        }
        try {
            var3.f(120, param1.field_s);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    dh(sh param0, ok param1, String param2, boolean param3, boolean param4) {
        super(param0, new jn((dh) null, param1, param2), 77, 10, 10);
        try {
            this.field_xb = param1;
            this.field_yb = false;
            this.field_zb = param3 ? true : false;
            this.field_tb = false;
            this.field_ub = param4 ? true : false;
            this.field_wb = new ib(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_wb.field_N = true;
            this.b(this.field_wb, 10);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, boolean param2) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        jn stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        jn stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jn var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        jn var6 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (!this.field_tb) {
              L1: {
                this.field_tb = true;
                stackIn_5_0 = this;

                if (256 != param1) {
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
                ((dh) (this)).field_yb = stackIn_6_1 != 0;
                this.field_wb.a(8405024, param2, 4210752);
                var6 = new jn((dh) (this), this.field_xb, param0);
                var4 = var6;
                if (5 != param1) {
                  if (256 == param1) {
                    var6.a(aa.field_a, (uk) (this), false);
                    break L2;
                  } else {
                    L3: {
                      stackIn_11_0 = (jn) (var6);

                      stackIn_11_1 = 0;

                      if (this.field_zb) {
                        stackIn_12_0 = (jn) ((Object) stackIn_11_0);
                        stackIn_12_1 = stackIn_11_1;
                        stackIn_12_2 = aa.field_a;
                        break L3;
                      } else {
                        stackIn_12_0 = (jn) ((Object) stackIn_11_0);
                        stackIn_12_1 = stackIn_11_1;
                        stackIn_12_2 = te.field_i;
                        break L3;
                      }
                    }
                    ((jn) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2, -1);
                    break L2;
                  }
                } else {
                  var6.a(0, ei.field_nb, 11);
                  var6.a(0, al.field_c, 17);
                  break L2;
                }
              }
              L4: {
                if (3 == param1) {
                  var6.a(0, ui.field_d, 7);
                  break L4;
                } else {
                  if ((param1 ^ -1) == -5) {
                    var6.a(0, mm.field_hb, 8);
                    break L4;
                  } else {
                    if (-7 == (param1 ^ -1)) {
                      var6.a(0, tn.field_y, 9);
                      break L4;
                    } else {
                      if (param1 != 9) {
                        break L4;
                      } else {
                        var6.a(ai.field_g, (uk) (this), param2);
                        break L4;
                      }
                    }
                  }
                }
              }
              this.a((fj) (var6), (byte) -72);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4_ref);

            stackIn_26_1 = new StringBuilder().append("dh.E(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void n(int param0) {
        if (!this.field_H) {
          return;
        } else {
          if (param0 == 10) {
            this.field_H = false;
            if (!this.field_zb) {
              if (this.field_ub) {
                un.c(-18997);
                return;
              } else {
                return;
              }
            } else {
              bh.b(2);
              return;
            }
          } else {
            return;
          }
        }
    }

    public void a(int param0, int param1, int param2, rg param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 68) {
              if (this.field_yb) {
                vf.a((byte) -119, 3);
                this.n(10);
                return;
              } else {
                li.a(ii.b(false), 109, "tochangedisplayname.ws");
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("dh.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            qn var2 = (qn) null;
            dh.a(-49, (qn) null, 59);
            field_vb = null;
            return;
        }
        field_vb = null;
    }

    static {
    }
}
