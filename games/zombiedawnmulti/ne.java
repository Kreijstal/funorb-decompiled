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
        gn discarded$2 = null;
        gn discarded$3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wd var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        wd stackIn_11_0 = null;
        wd stackIn_12_0 = null;
        wd stackIn_13_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        wd stackOut_10_0 = null;
        wd stackOut_12_0 = null;
        String stackOut_12_1 = null;
        wd stackOut_11_0 = null;
        String stackOut_11_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!this.field_ub) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (-257 != (param2 ^ -1)) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  ((ne) (this)).field_yb = stackIn_6_1 != 0;
                  this.field_ub = true;
                  this.field_Bb.a(4210752, 8405024, (byte) -31);
                  var7 = new wd((ne) (this), this.field_zb, param0);
                  if (5 != param2) {
                    break L3;
                  } else {
                    var7.a(lc.field_g, 11, true);
                    var7.a(oe.field_b, 17, true);
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if ((param2 ^ -1) == -257) {
                    break L4;
                  } else {
                    L5: {
                      stackOut_10_0 = (wd) (var7);
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (!this.field_wb) {
                        stackOut_12_0 = (wd) ((Object) stackIn_12_0);
                        stackOut_12_1 = sn.field_Zb;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L5;
                      } else {
                        stackOut_11_0 = (wd) ((Object) stackIn_11_0);
                        stackOut_11_1 = ci.field_g;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L5;
                      }
                    }
                    ((wd) (Object) stackIn_13_0).a(stackIn_13_1, -1, true);
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                discarded$2 = var7.a(ci.field_g, -76, (bj) (this));
                break L2;
              }
              L6: {
                L7: {
                  if (3 != param2) {
                    break L7;
                  } else {
                    var7.a(od.field_zb, 7, true);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if ((param2 ^ -1) == -5) {
                    break L8;
                  } else {
                    L9: {
                      if (6 != param2) {
                        break L9;
                      } else {
                        var7.a(wm.field_S, 9, true);
                        if (var6 == 0) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (param2 == 9) {
                      discarded$3 = var7.a(il.field_l, -74, (bj) (this));
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L8;
                      }
                    } else {
                      this.a((cf) (var7), (byte) 119);
                      var5 = -3 % ((-15 - param1) / 46);
                      return;
                    }
                  }
                }
                var7.a(bc.field_c, 8, true);
                break L6;
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
          L10: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("ne.P(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ')');
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
                if (!ZombieDawnMulti.field_E) {
                  return;
                } else {
                  lb.a(9047);
                  return;
                }
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
        wd var2 = null;
        wd stackIn_3_0 = null;
        String stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        wd stackOut_1_0 = null;
        String stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        this.field_Bb.a(4210752, 2121792, (byte) 116);
        var2 = new wd((ne) (this), this.field_zb, lq.field_c);
        if (param0) {
          return;
        } else {
          stackOut_1_0 = (wd) (var2);
          stackOut_1_1 = og.field_T;
          stackOut_1_2 = 15;
          stackOut_1_3 = 1;
          stackIn_3_0 = stackOut_1_0;
          stackIn_3_1 = stackOut_1_1;
          stackIn_3_2 = stackOut_1_2;
          stackIn_3_3 = stackOut_1_3;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_yb) {
                  break L2;
                } else {
                  ic.a(jl.b(0), "tochangedisplayname.ws", 114);
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              fb.a(3, 118);
              this.m(-7435);
              break L1;
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
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6);
            stackOut_7_1 = new StringBuilder().append("ne.E(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
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
            if (param0 == 13) {
              this.m(-7435);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
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
              stackOut_6_0 = super.a(param0, param1, param2, -6208);
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
            stackOut_8_1 = new StringBuilder().append("ne.CA(").append(param0).append(',').append(param1).append(',');
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
