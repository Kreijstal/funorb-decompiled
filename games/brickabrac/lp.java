/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lp extends fe implements en {
    static vl field_wb;
    private boolean field_Bb;
    private boolean field_vb;
    private boolean field_tb;
    private cr field_qb;
    private boolean field_zb;
    static jp[] field_yb;
    static mh field_Ab;
    static qh field_xb;
    private dh field_sb;
    static gf field_rb;
    static tg field_ub;

    final boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (13 == param0) {
              this.m(param1 ^ 127);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 110) {
                  break L1;
                } else {
                  field_rb = (gf) null;
                  break L1;
                }
              }
              stackOut_6_0 = super.a(param0, (byte) 110, param2, param3);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("lp.T(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    final static boolean n(int param0) {
        if (param0 == -5) {
          if (mj.a((byte) -80)) {
            if (0 != (de.field_x & 8)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_yb = (jp[]) null;
          if (mj.a((byte) -80)) {
            if (0 != (de.field_x & 8)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void i(byte param0) {
        ec var2 = null;
        this.field_qb.b(2121792, 4210752, 2);
        var2 = new ec((lp) (this), this.field_sb, qb.field_t);
        if (param0 >= -11) {
          return;
        } else {
          var2.a(false, pj.field_e, 15);
          this.b((byte) 110, var2);
          return;
        }
    }

    public void a(int param0, int param1, byte param2, int param3, d param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_Bb) {
                kf.a("tochangedisplayname.ws", (byte) -113, uc.e((byte) -103));
                break L1;
              } else {
                bd.a(3, true);
                this.m(17);
                break L1;
              }
            }
            if (param2 < -22) {
              break L0;
            } else {
              lp.o(-11);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var6);
            stackOut_6_1 = new StringBuilder().append("lp.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(int param0, boolean param1, String param2) {
        d discarded$2 = null;
        d discarded$3 = null;
        RuntimeException var4 = null;
        ec var4_ref = null;
        int var5 = 0;
        ec var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ec stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ec stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ec stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ec stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ec stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        ec stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (this.field_zb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (256 != param0) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              L2: {
                ((lp) (this)).field_Bb = stackIn_7_1 != 0;
                this.field_zb = true;
                this.field_qb.b(8405024, 4210752, 2);
                if (!param1) {
                  break L2;
                } else {
                  this.m(6);
                  break L2;
                }
              }
              L3: {
                var6 = new ec((lp) (this), this.field_sb, param2);
                var4_ref = var6;
                if (param0 != 5) {
                  if (param0 == 256) {
                    discarded$2 = var6.a((byte) -78, oa.field_Tb, (uh) (this));
                    break L3;
                  } else {
                    L4: {
                      stackOut_12_0 = (ec) (var6);
                      stackOut_12_1 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (this.field_vb) {
                        stackOut_14_0 = (ec) ((Object) stackIn_14_0);
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = oa.field_Tb;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        break L4;
                      } else {
                        stackOut_13_0 = (ec) ((Object) stackIn_13_0);
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = dp.field_s;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        break L4;
                      }
                    }
                    ((ec) (Object) stackIn_15_0).a(stackIn_15_1 != 0, stackIn_15_2, -1);
                    break L3;
                  }
                } else {
                  var6.a(param1, ec.field_L, 11);
                  var6.a(false, wc.field_a, 17);
                  break L3;
                }
              }
              L5: {
                if (param0 != 3) {
                  if ((param0 ^ -1) != -5) {
                    if ((param0 ^ -1) == -7) {
                      var6.a(false, cb.field_p, 9);
                      break L5;
                    } else {
                      if (9 != param0) {
                        break L5;
                      } else {
                        discarded$3 = var6.a((byte) 126, BrickABrac.field_G, (uh) (this));
                        break L5;
                      }
                    }
                  } else {
                    var6.a(param1, ue.field_f, 8);
                    break L5;
                  }
                } else {
                  var6.a(false, vn.field_H, 7);
                  break L5;
                }
              }
              this.b((byte) 125, var6);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("lp.R(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    lp(cp param0, dh param1, String param2, boolean param3, boolean param4) {
        super(param0, new ec((lp) null, param1, param2), 77, 10, 10);
        try {
            this.field_tb = param4 ? true : false;
            this.field_vb = param3 ? true : false;
            this.field_zb = false;
            this.field_Bb = false;
            this.field_sb = param1;
            this.field_qb = new cr(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_qb.field_J = true;
            this.a(this.field_qb, true);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "lp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void m(int param0) {
        if (param0 == 17) {
          if (!this.field_N) {
            return;
          } else {
            this.field_N = false;
            if (!this.field_vb) {
              if (!this.field_tb) {
                return;
              } else {
                s.a((byte) -30);
                return;
              }
            } else {
              cb.e((byte) -46);
              return;
            }
          }
        } else {
          this.field_vb = false;
          if (!this.field_N) {
            return;
          } else {
            this.field_N = false;
            if (!this.field_vb) {
              if (!this.field_tb) {
                return;
              } else {
                s.a((byte) -30);
                return;
              }
            } else {
              cb.e((byte) -46);
              return;
            }
          }
        }
    }

    public static void o(int param0) {
        field_wb = null;
        field_ub = null;
        field_rb = null;
        field_Ab = null;
        if (param0 != 50) {
          lp.o(29);
          field_xb = null;
          field_yb = null;
          return;
        } else {
          field_xb = null;
          field_yb = null;
          return;
        }
    }

    static {
        field_wb = new vl();
        field_xb = new qh();
    }
}
