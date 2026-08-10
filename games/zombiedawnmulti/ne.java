/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ne extends ie implements in {
    private boolean field_wb;
    private boolean field_xb;
    static ja[] field_Ab;
    private boolean field_ub;
    private boolean field_yb;
    private le field_Bb;
    private fm field_zb;
    static String field_vb;
    static int field_tb;

    final void a(String param0, int param1, int param2) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        wd stackIn_11_0 = null;
        wd stackIn_12_0 = null;
        String stackIn_12_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wd var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!this.field_ub) {
              L1: {
                stackIn_5_0 = this;

                if (-257 != (param2 ^ -1)) {
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
                ((ne) (this)).field_yb = stackIn_6_1 != 0;
                this.field_ub = true;
                this.field_Bb.a(4210752, 8405024, (byte) -31);
                var7 = new wd((ne) (this), this.field_zb, param0);
                if (5 != param2) {
                  if ((param2 ^ -1) == -257) {
                    var7.a(ci.field_g, -76, (bj) (this));
                    break L2;
                  } else {
                    L3: {
                      stackIn_11_0 = (wd) (var7);

                      if (!this.field_wb) {
                        stackIn_12_0 = (wd) ((Object) stackIn_11_0);
                        stackIn_12_1 = sn.field_Zb;
                        break L3;
                      } else {
                        stackIn_12_0 = (wd) ((Object) stackIn_11_0);
                        stackIn_12_1 = ci.field_g;
                        break L3;
                      }
                    }
                    ((wd) (Object) stackIn_12_0).a(stackIn_12_1, -1, true);
                    break L2;
                  }
                } else {
                  var7.a(lc.field_g, 11, true);
                  var7.a(oe.field_b, 17, true);
                  break L2;
                }
              }
              L4: {
                if (3 != param2) {
                  if ((param2 ^ -1) == -5) {
                    var7.a(bc.field_c, 8, true);
                    break L4;
                  } else {
                    if (6 != param2) {
                      if (param2 == 9) {
                        var7.a(il.field_l, -74, (bj) (this));
                        break L4;
                      } else {
                        this.a((cf) (var7), (byte) 119);
                        var5 = -3 % ((-15 - param1) / 46);
                        return;
                      }
                    } else {
                      var7.a(wm.field_S, 9, true);
                      break L4;
                    }
                  }
                } else {
                  var7.a(od.field_zb, 7, true);
                  break L4;
                }
              }
              this.a((cf) (var7), (byte) 119);
              var5 = -3 % ((-15 - param1) / 46);
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
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("ne.P(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void m(int param0) {
        if (this.field_R) {
          this.field_R = false;
          if (param0 == -7435) {
            if (!this.field_wb) {
              if (this.field_xb) {
                ce.c((byte) -123);
                return;
              } else {
                return;
              }
            } else {
              lb.a(9047);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 20341) {
          field_Ab = (ja[]) null;
          mg.field_H = param0;
          dq.field_l = param2;
          tk.field_n = param4;
          po.field_n = param3;
          return;
        } else {
          mg.field_H = param0;
          dq.field_l = param2;
          tk.field_n = param4;
          po.field_n = param3;
          return;
        }
    }

    public static void n(int param0) {
        field_Ab = null;
        field_vb = null;
        if (param0 != 10) {
            ne.c(10, -105, -88, -20, 64);
        }
    }

    final void c(boolean param0) {
        wd var2;
        wd stackIn_3_0 = null;
        String stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        this.field_Bb.a(4210752, 2121792, (byte) 116);
        var2 = new wd((ne) (this), this.field_zb, lq.field_c);
        if (param0) {
          return;
        } else {
          stackIn_3_0 = (wd) (var2);
          stackIn_3_1 = og.field_T;
          stackIn_3_2 = 15;
          stackIn_3_3 = 1;
          ((wd) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0);
          this.a((cf) (var2), (byte) -18);
          return;
        }
    }

    public void a(int param0, int param1, gn param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_yb) {
                fb.a(3, 118);
                this.m(-7435);
                break L1;
              } else {
                ic.a(jl.b(0), "tochangedisplayname.ws", 114);
                break L1;
              }
            }
            if (param3 < -83) {
              break L0;
            } else {
              this.field_yb = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("ne.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    ne(vk param0, fm param1, String param2, boolean param3, boolean param4) {
        super(param0, new wd((ne) null, param1, param2), 77, 10, 10);
        try {
            this.field_yb = false;
            this.field_wb = param3 ? true : false;
            this.field_ub = false;
            this.field_xb = param4 ? true : false;
            this.field_zb = param1;
            this.field_Bb = new le(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_Bb.field_L = true;
            this.b((byte) 104, this.field_Bb);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        gn var6 = null;
        int stackIn_3_0 = 0;
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
            if (param0 == 13) {
              this.m(-7435);
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3 == -6208) {
                  break L1;
                } else {
                  var6 = (gn) null;
                  this.a(110, 74, (gn) null, -12, 106);
                  break L1;
                }
              }
              stackIn_7_0 = super.a(param0, param1, param2, -6208);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("ne.CA(").append(param0).append(',').append(param1).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_vb = "Lobby";
    }
}
