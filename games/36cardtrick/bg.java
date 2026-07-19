/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends af implements qh {
    private boolean field_sb;
    static int field_rb;
    static qj field_tb;
    private kl field_vb;
    private boolean field_ub;

    final void f(byte param0) {
        this.a(nc.a(248, 0, pa.field_N), true, (byte) 117);
        if (param0 != -42) {
            java.awt.Canvas var3 = (java.awt.Canvas) null;
            bg.a((java.awt.Canvas) null, (byte) 92);
        }
    }

    final static String a(byte param0, CharSequence[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -70 / ((-65 - param0) / 59);
            stackOut_0_0 = rl.a(param1, 0, param1.length, true);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("bg.HB(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        if (!(!this.field_ub)) {
            nf.a(false, (byte) -2, true);
            return;
        }
        try {
            int var6_int = -69 / ((param1 - -62) / 32);
            rg.a((byte) 120);
            this.s(116);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "bg.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void a(nk param0, boolean param1, byte param2) {
        hl discarded$2 = null;
        hl discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        ui var5 = null;
        int var6 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              this.field_sb = true;
              if (param0.field_b) {
                var4_ref = bk.field_e;
                break L1;
              } else {
                if (null == param0.field_c) {
                  var4_ref = param0.field_d;
                  if ((param0.field_g ^ -1) != -249) {
                    break L1;
                  } else {
                    if (param1) {
                      this.field_ub = true;
                      var4_ref = pa.field_N;
                      break L1;
                    } else {
                      qb.a((byte) 18);
                      this.field_ub = true;
                      var4_ref = pa.field_N;
                      break L1;
                    }
                  }
                } else {
                  var4_ref = ui.field_K;
                  if (null == this.field_vb) {
                    break L1;
                  } else {
                    this.field_vb.a(true);
                    break L1;
                  }
                }
              }
            }
            L2: {
              var5 = new ui((af) (this), vd.field_p, var4_ref);
              if (param2 == 117) {
                break L2;
              } else {
                field_tb = (qj) null;
                break L2;
              }
            }
            L3: {
              if (param0.field_b) {
                if (param0.field_e) {
                  this.c(new qe((bg) (this)), (byte) 33);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  discarded$2 = var5.a((pl) (this), true, bj.field_b);
                  break L3;
                }
              } else {
                L4: {
                  if (!this.field_ub) {
                    if ((param0.field_g ^ -1) != -6) {
                      var5.a(uc.field_r, -1, param2 ^ -121);
                      break L4;
                    } else {
                      var5.a(na.field_p, 11, -14);
                      var5.a(pg.field_f, 17, -14);
                      break L4;
                    }
                  } else {
                    discarded$3 = var5.a((pl) (this), true, bj.field_b);
                    break L4;
                  }
                }
                if (3 != param0.field_g) {
                  if (-7 != (param0.field_g ^ -1)) {
                    break L3;
                  } else {
                    var5.a(jh.field_a, 9, -14);
                    break L3;
                  }
                } else {
                  var5.a(sk.field_a, 7, -14);
                  break L3;
                }
              }
            }
            this.c(var5, (byte) 92);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("bg.LB(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    bg(j param0, kl param1) {
        super(param0, vd.field_p, jc.field_R, false, false);
        try {
            this.field_vb = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "bg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void u(int param0) {
        if (param0 != -2113) {
            field_rb = -75;
            field_tb = null;
            return;
        }
        field_tb = null;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            pk.a((byte) -107, (java.awt.Component) ((Object) param0));
            d.a((java.awt.Component) ((Object) param0), 0);
            if (param1 < -52) {
              L1: {
                if (Main.field_V == null) {
                  break L1;
                } else {
                  Main.field_V.a((java.awt.Component) ((Object) param0), true);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("bg.DB(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        nk var2 = null;
        if (param0) {
          if (this.field_E) {
            if (!this.field_sb) {
              var2 = qd.b(-86);
              if (var2 == null) {
                return super.a(true);
              } else {
                this.a(var2, false, (byte) 117);
                return super.a(true);
              }
            } else {
              return super.a(true);
            }
          } else {
            return super.a(true);
          }
        } else {
          this.field_ub = true;
          if (this.field_E) {
            if (!this.field_sb) {
              var2 = qd.b(-86);
              if (var2 == null) {
                return super.a(true);
              } else {
                this.a(var2, false, (byte) 117);
                return super.a(true);
              }
            } else {
              return super.a(true);
            }
          } else {
            return super.a(true);
          }
        }
    }

    final static de[] v(int param0) {
        int var1 = 5 / ((param0 - 40) / 58);
        return new de[]{uh.field_n, eb.field_l, c.field_k, kg.field_b, qe.field_H, qe.field_J, nf.field_d, qi.field_A, rc.field_g, lh.field_a, ra.field_a, vk.field_e, dg.field_G, jl.field_g};
    }

    final static int a(int param0, int param1, hg param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
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
            if ((param0 ^ -1) >= -1) {
              throw new IllegalArgumentException();
            } else {
              if (ng.a(param0, (byte) -128)) {
                stackOut_5_0 = (int)((long)param0 * ((long)param2.b(-1427) & 4294967295L) >> 72575520);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var3_int = -(int)(4294967296L % (long)param0) + param1;
                L1: while (true) {
                  var4 = param2.b(-1427);
                  if (var4 < var3_int) {
                    stackOut_10_0 = sk.a(124, param0, var4);
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("bg.MB(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
        }
    }

    static {
        field_rb = 0;
    }
}
