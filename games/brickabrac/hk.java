/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends ib implements hf, en {
    static String field_L;
    static jp field_Q;
    private String field_N;
    static boolean field_R;
    private d field_M;
    private d field_O;
    private boolean field_V;
    private boolean field_K;
    private d field_U;
    static jp field_I;
    private vb field_P;
    static int field_W;
    static String field_J;
    private boolean field_S;
    private vb field_T;

    final static void a(byte param0) {
        if (ld.field_t != -rn.field_i + 0) {
            if (-rn.field_i + 250 != ld.field_t) {
            }
        }
        ld.field_t = ld.field_t + 1;
        int var1 = -127 / ((29 - param0) / 32);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int discarded$0 = 0;
        if (this.field_N != null) {
            discarded$0 = a.field_u.a(this.field_N, this.field_o + (param1 - -20), param0 - (-this.field_w + -15), -40 + this.field_t, this.field_s, 16777215, -1, 1, 0, a.field_u.field_F);
        }
        if (!(null == this.field_O)) {
            lb.c(param1 - -10, param0 - -134, this.field_t + -20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 == param0) {
                stackOut_6_0 = this.b(param2, (byte) -78);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 == 99) {
                  stackOut_10_0 = this.a(param2, (byte) -122);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("hk.T(").append(param0).append(',').append(param1).append(',');
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
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final static void a(dh param0, byte param1, mf param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        kn var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        dh var10 = null;
        int[] var14 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = cd.field_e;
            wd.field_w = new mh(0L, (mh) null);
            if (param2 != null) {
              param2.field_l = 0;
              param2.field_b = false;
              pj.field_c = new so(var3_int, param2, param2);
              nh.field_c = new rg(var3_int, param2, param2, new rm());
              var4 = gj.b(0);
              if (var4 == null) {
                rk.a("QC2", (Throwable) null, param1 + -14);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                hb.a(var4, false);
                var10 = (dh) null;
                ko.field_j = ug.a(1513239, 1127256, (byte) 123, 65793, 4020342, 5138823, 65793, 1513239, (dh) null, 0, 65793, 2245737, 8947848);
                nb.field_e = ug.a(0, 0, (byte) 122, 0, 0, 0, 0, 0, param0, 16764006, 0, 0, 0);
                cp.field_K = ug.a(0, 0, (byte) 113, 0, 0, 0, 0, 0, param0, 16777215, 0, 0, 0);
                var5 = lb.field_c;
                var6 = lb.field_d;
                var14 = lb.field_l;
                uf.field_e = new jp(10, 14);
                uf.field_e.g();
                var8 = 2;
                L1: while (true) {
                  if (7 <= var8) {
                    L2: {
                      if (param1 == 90) {
                        break L2;
                      } else {
                        hk.i((byte) 86);
                        break L2;
                      }
                    }
                    lb.a(var14, var5, var6);
                    fe.field_kb = e.a(nb.field_e, ko.field_j, var4, 4, cp.field_K);
                    wd.field_w.field_bb = new vl();
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    lb.g(var8, var8 - -1, 14 - (var8 << -2024081311), 16777215);
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              rk.a("QC1", (Throwable) null, param1 ^ 118);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("hk.F(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
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

    public final void a(vb param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
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
              if (this.field_P != param0) {
                break L1;
              } else {
                discarded$2 = this.field_T.a(true, (oc) (this));
                break L1;
              }
            }
            L2: {
              if (param0 != this.field_T) {
                break L2;
              } else {
                this.a(25);
                break L2;
              }
            }
            L3: {
              if (param1 == -40) {
                break L3;
              } else {
                this.a(-38, -29, -91, (byte) 20);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("hk.H(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final String j(byte param0) {
        String var3 = null;
        L0: {
          if (param0 == -76) {
            break L0;
          } else {
            var3 = (String) null;
            this.a(113, (String) null);
            break L0;
          }
        }
        if (null == this.field_P.field_A) {
          return "";
        } else {
          return this.field_P.field_A;
        }
    }

    final void a(int param0, String param1) {
        vb var3 = null;
        String var4 = null;
        try {
            var3 = this.field_P;
            var4 = param1;
            if (param0 < 53) {
                this.h(-119);
            }
            var3.a(var4, -12592, false);
            this.field_T.c(false);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "hk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, mf param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            pg.field_k = new km[22];
            wg.a(-74, new rp());
            wg.a(-68, cf.a(1, -2635));
            wg.a(-90, cf.a(2, -2635));
            wg.a(-111, cf.a(3, -2635));
            wg.a(-109, cf.a(4, -2635));
            wg.a(-93, new ah());
            wg.a(-114, new lf());
            wg.a(-114, new md());
            wg.a(-104, new bl());
            wg.a(-66, new cc());
            wg.a(-55, new hq());
            wg.a(-75, new uk());
            wg.a(-63, new de(param1));
            wg.a(-60, new ud(13, 0));
            wg.a(-105, new fp());
            wg.a(-69, new ud(15, 1));
            wg.a(-71, new ol());
            wg.a(-54, cf.a(17, -2635));
            wg.a(-70, new vq());
            wg.a(-63, new gn());
            wg.a(-91, new ab());
            var2_int = -5 / ((param0 - 70) / 42);
            wg.a(-73, new vp());
            si.field_k = rd.a(0, (byte) 19);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("hk.E(").append(param0).append(',');
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
          throw qb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
    }

    public final void a(vb param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -39) {
                break L1;
              } else {
                this.h(68);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("hk.I(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        kd.field_c = tf.field_f[param0];
        int var2 = -14 % ((param1 - -33) / 34);
        wn.field_a = ua.field_b[param0];
        d.field_C = he.field_L[param0];
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= -22) {
                break L1;
              } else {
                this.field_O = (d) null;
                break L1;
              }
            }
            L2: {
              if (this.field_U != param4) {
                if (this.field_O != param4) {
                  if (param4 == this.field_M) {
                    if (!this.field_K) {
                      if (this.field_S) {
                        ln.a(-107);
                        break L2;
                      } else {
                        hb.g(29);
                        break L2;
                      }
                    } else {
                      dg.a(true);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  fr.d(-1);
                  break L2;
                }
              } else {
                this.a(25);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var6);
            stackOut_15_1 = new StringBuilder().append("hk.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final static void h(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 4) {
          return;
        } else {
          L0: {
            var1 = nn.field_g.c(ag.field_D[20]);
            var2 = nn.field_g.c(ag.field_D[21]);
            if (var2 < var1) {
              stackOut_3_0 = var1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = var2;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          dg.field_d = stackIn_4_0 + 4;
          og.field_Zb = og.field_Zb + (dg.field_d - -120);
          return;
        }
    }

    hk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ub) null);
        ma dupTemp$2 = null;
        ma dupTemp$3 = null;
        RuntimeException var6 = null;
        hi var6_ref = null;
        dh var7 = null;
        String var8 = null;
        me var9 = null;
        ma var12 = null;
        ma var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        d stackIn_17_1 = null;
        d stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        d stackIn_18_1 = null;
        d stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        d stackIn_19_1 = null;
        d stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_16_0 = null;
        d stackOut_16_1 = null;
        d stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        d stackOut_18_1 = null;
        d stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        d stackOut_17_1 = null;
        d stackOut_17_2 = null;
        String stackOut_17_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((hk) (this)).field_S = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((hk) (this)).field_V = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((hk) (this)).field_K = stackIn_10_1 != 0;
              this.field_N = param1;
              if (!this.field_K) {
                break L4;
              } else {
                L5: {
                  if (this.field_V) {
                    break L5;
                  } else {
                    if (!this.field_S) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              this.field_P = (vb) ((Object) new sf(param0, (uh) (this), 100));
              this.field_T = (vb) ((Object) new sf("", (uh) (this), 20));
              if (!this.field_K) {
                L7: {
                  this.field_U = new d(ok.field_a, (uh) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!this.field_S) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = dp.field_s;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = nd.field_d;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((hk) (this)).field_M = new d(stackIn_19_3, (uh) null);
                if (!this.field_V) {
                  break L6;
                } else {
                  this.field_O = new d(bd.field_a, (uh) (this));
                  break L6;
                }
              } else {
                this.field_U = new d(oa.field_Tb, (uh) null);
                this.field_M = new d(wc.field_a, (uh) null);
                this.field_P.field_J = false;
                break L6;
              }
            }
            L8: {
              this.field_P.field_l = (ub) ((Object) new r(10000536));
              this.field_T.field_l = (ub) ((Object) new ob(10000536));
              var6_ref = new hi();
              this.field_U.field_l = (ub) ((Object) var6_ref);
              if (null == this.field_M) {
                break L8;
              } else {
                this.field_M.field_l = (ub) ((Object) var6_ref);
                break L8;
              }
            }
            L9: {
              if (this.field_O == null) {
                break L9;
              } else {
                this.field_O.field_l = (ub) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              this.field_P.field_z = sf.field_X;
              if (this.field_O == null) {
                break L10;
              } else {
                this.field_O.field_z = ie.field_q;
                break L10;
              }
            }
            L11: {
              if (this.field_K) {
                this.field_M.field_z = pn.field_o;
                break L11;
              } else {
                if (this.field_S) {
                  this.field_M.field_z = wp.field_i;
                  this.field_M.field_l = (ub) ((Object) new bb());
                  break L11;
                } else {
                  this.field_M.field_l = (ub) ((Object) new bb());
                  break L11;
                }
              }
            }
            L12: {
              this.field_w = 15;
              var7 = a.field_u;
              if (this.field_N == null) {
                break L12;
              } else {
                this.field_w = this.field_w + (5 + var7.b(this.field_N, -40 + this.field_t, var7.field_F));
                break L12;
              }
            }
            L13: {
              var8 = p.field_p;
              var9 = qi.a(uc.e((byte) -115), -28432);
              if (uc.field_k == var9) {
                var8 = sq.field_a;
                break L13;
              } else {
                if (ll.field_d != var9) {
                  break L13;
                } else {
                  var8 = fc.field_c;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$2 = new ma(10, this.field_w, this.field_t + -20, 25, this.field_P, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.a(dupTemp$2, true);
              this.field_w = this.field_w + (5 + ((oc) ((Object) var12)).field_s);
              dupTemp$3 = new ma(10, this.field_w, this.field_t + -20, 25, this.field_T, false, 80, 3, var7, 16777215, wc.field_c);
              var13 = dupTemp$3;
              this.a(dupTemp$3, true);
              this.field_U.field_i = (uh) (this);
              this.field_w = this.field_w + (5 + ((oc) ((Object) var13)).field_s);
              if (null == this.field_O) {
                break L14;
              } else {
                this.field_O.field_i = (uh) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_M == null) {
                break L15;
              } else {
                this.field_M.field_i = (uh) (this);
                break L15;
              }
            }
            L16: {
              if (null == this.field_O) {
                this.field_U.a(30, 8, this.field_w, (byte) -119, this.field_t + -16);
                this.field_w = this.field_w + 35;
                break L16;
              } else {
                this.field_U.a(30, 85, this.field_w, (byte) -119, -95 + this.field_t);
                this.field_w = this.field_w + 60;
                break L16;
              }
            }
            L17: {
              if (null == this.field_O) {
                break L17;
              } else {
                this.field_O.a(30, 8, this.field_w, (byte) -119, -6 + this.field_t + -10);
                this.field_w = this.field_w + 35;
                break L17;
              }
            }
            L18: {
              if (null == this.field_M) {
                break L18;
              } else {
                L19: {
                  if (this.field_K) {
                    break L19;
                  } else {
                    if (this.field_S) {
                      break L19;
                    } else {
                      this.field_M.a(20, 8, this.field_w, (byte) -119, 40);
                      this.field_w = this.field_w + 25;
                      break L18;
                    }
                  }
                }
                this.field_M.a(30, 8, this.field_w, (byte) -119, -10 + (this.field_t + -6));
                this.field_w = this.field_w + 35;
                break L18;
              }
            }
            L20: {
              this.a(this.field_w - -3, 0, 0, (byte) -119, this.field_t);
              this.a(this.field_U, true);
              if (null == this.field_O) {
                break L20;
              } else {
                this.a(this.field_O, true);
                break L20;
              }
            }
            L21: {
              if (this.field_M == null) {
                break L21;
              } else {
                this.a(this.field_M, true);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var6);
            stackOut_57_1 = new StringBuilder().append("hk.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void i(byte param0) {
        field_J = null;
        if (param0 != 88) {
            return;
        }
        field_I = null;
        field_Q = null;
        field_L = null;
    }

    private final void a(int param0) {
        L0: {
          L1: {
            if (fr.a((byte) 114)) {
              break L1;
            } else {
              if ((this.field_P.field_A.length() ^ -1) >= -1) {
                break L0;
              } else {
                if (0 < this.field_T.field_A.length()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          ah.a(this.field_P.field_A, 11455, this.field_T.field_A);
          break L0;
        }
        L2: {
          if (param0 == 25) {
            break L2;
          } else {
            this.field_O = (d) null;
            break L2;
          }
        }
    }

    final void h(int param0) {
        if (param0 >= -101) {
            d var3 = (d) null;
            this.a(64, -27, (byte) 58, 71, (d) null);
        }
        this.field_P.c(false);
        this.field_T.c(false);
    }

    static {
        field_L = "Options";
        field_J = "Add friend";
        field_W = 0;
    }
}
