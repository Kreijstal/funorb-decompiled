/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends ci {
    static String field_Ob;
    private ci field_Kb;
    static String field_Jb;
    static int field_Tb;
    static ln field_Rb;
    static jc field_Sb;
    private ci field_Ib;
    static volatile int field_Eb;
    private ci field_Hb;
    private ci field_Qb;
    private int field_Pb;
    static int field_Fb;
    static long[] field_Nb;
    static un field_Lb;
    private ci field_Mb;
    private ci field_Gb;

    final static boolean a(byte param0, ve param1, ve param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            if (param0 == -15) {
              L1: {
                var3_int = -param2.field_Ib + param1.field_Ib;
                if (f.field_a == param1.field_Lb) {
                  var3_int -= 200;
                  break L1;
                } else {
                  if (null != param1.field_Lb) {
                    break L1;
                  } else {
                    var3_int += 200;
                    break L1;
                  }
                }
              }
              L2: {
                if (param2.field_Lb == f.field_a) {
                  var3_int += 200;
                  break L2;
                } else {
                  if (null != param2.field_Lb) {
                    break L2;
                  } else {
                    var3_int -= 200;
                    break L2;
                  }
                }
              }
              L3: {
                if (var3_int <= 0) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("pd.L(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    final static boolean a(String param0, byte param1) {
        boolean discarded$2 = false;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            L1: {
              var2_int = param0.charAt(0);
              if (param1 >= 81) {
                break L1;
              } else {
                var5 = (String) null;
                discarded$2 = pd.a((String) null, (byte) -8);
                break L1;
              }
            }
            var3 = 1;
            L2: while (true) {
              if (param0.length() <= var3) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(var3) == var2_int) {
                  var3++;
                  continue L2;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("pd.M(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static void b(int param0, int param1) {
        boolean discarded$2 = false;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          L0: {
            dc.a(nj.field_t, param0, true, (byte) -123, bj.field_gb, ed.field_b, 0);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= ed.field_b) {
                L2: {
                  dc.a(bh.field_F, param0 + param0, false, (byte) -118, eb.field_y, ed.field_b + param0, param0);
                  if (param1 < -102) {
                    break L2;
                  } else {
                    discarded$2 = pd.a(-89, -57, 110);
                    break L2;
                  }
                }
                L3: {
                  if (ed.field_b <= param0) {
                    break L3;
                  } else {
                    ed.field_b = param0;
                    break L3;
                  }
                }
                break L0;
              } else {
                vn.field_Ab[var2_int + param0] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "pd.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        this.field_M = param7;
        this.field_V = param5;
        this.field_mb = param4;
        this.field_pb = param0;
        this.a(true, param3, param2, param1);
        if (param6 > -32) {
            field_Lb = (un) null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = ib.field_d != null ? 1 : 0;
        if (9 == vg.field_a) {
            if (ph.a(hn.field_s, (byte) -43, v.field_b, a.field_f, ca.field_i)) {
                if ((hn.field_s ^ -1) != -3) {
                    if (var3 != 0) {
                        return false;
                    }
                }
                return fl.a(ca.field_i, a.field_f, hn.field_s, v.field_b, (byte) 105);
            }
        }
        if (!((vg.field_a ^ -1) != -11)) {
            if (!(var3 == 0)) {
                return false;
            }
            sh.a(false);
            return true;
        }
        if (vg.field_a == 11) {
            if (!(!dc.field_m)) {
                if (vg.field_f == 2) {
                    if (!(kn.a(hd.field_e, tj.field_m, 29712))) {
                        return false;
                    }
                }
                if (vg.field_f != 2) {
                    if (!(var3 == 0)) {
                        return false;
                    }
                }
                if (dk.c(false)) {
                    ke.a(param0 ^ -17303, vg.field_f, hd.field_e, param1, ja.field_i, (String) null);
                }
                return true;
            }
        }
        if (param0 != -26057) {
            field_Fb = 32;
            return false;
        }
        return false;
    }

    public static void n(int param0) {
        field_Ob = null;
        field_Lb = null;
        field_Nb = null;
        field_Jb = null;
        field_Sb = null;
        if (param0 != 0) {
            return;
        }
        field_Rb = null;
    }

    final boolean o(int param0) {
        if (param0 != 25708) {
            return true;
        }
        if (!(0 == this.field_Kb.field_L)) {
            this.field_Pb = 20;
            return true;
        }
        if (this.field_Kb.field_kb != 0) {
            if (!(this.field_Pb <= 0)) {
                this.field_Pb = this.field_Pb - 1;
            }
            if (this.field_Pb == 0) {
                if (rf.field_b < this.field_Qb.field_wb - -this.field_Qb.field_vb) {
                    this.field_Pb = 3;
                    return true;
                }
            }
        }
        return false;
    }

    final boolean m(int param0) {
        boolean discarded$0 = false;
        if (param0 != 2) {
            discarded$0 = this.m(12);
        }
        return this.field_Qb.field_kb != 0 ? true : false;
    }

    pd(long param0, pd param1) {
        this(param0, param1.field_Hb, param1.field_Ib, param1.field_Kb, param1.field_Qb);
    }

    final boolean l(int param0) {
        if (this.field_Mb.field_L != 0) {
            this.field_Pb = 20;
            return true;
        }
        if (this.field_Mb.field_kb == param0) {
            return false;
        }
        if ((this.field_Pb ^ -1) < -1) {
            this.field_Pb = this.field_Pb - 1;
        }
        if (this.field_Pb == 0) {
            if (this.field_Qb.field_pb + this.field_Qb.field_vb + (this.field_Qb.field_wb - -this.field_Qb.field_N) <= rf.field_b) {
                this.field_Pb = 3;
                return true;
            }
        }
        return false;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ci var14 = null;
        ci var15 = null;
        ci var16 = null;
        ci var17 = null;
        ci var18 = null;
        ci var19 = null;
        ci stackIn_13_0 = null;
        ci stackIn_13_1 = null;
        ci stackIn_13_2 = null;
        ci stackIn_14_0 = null;
        ci stackIn_14_1 = null;
        ci stackIn_14_2 = null;
        ci stackIn_15_0 = null;
        ci stackIn_15_1 = null;
        ci stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        ci stackOut_12_0 = null;
        ci stackOut_12_1 = null;
        ci stackOut_12_2 = null;
        ci stackOut_14_0 = null;
        ci stackOut_14_1 = null;
        ci stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        ci stackOut_13_0 = null;
        ci stackOut_13_1 = null;
        ci stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        L0: {
          if (this.field_M * 2 > this.field_pb) {
            var6 = this.field_pb / 2;
            var5 = this.field_pb / 2;
            break L0;
          } else {
            var6 = this.field_pb + -this.field_M;
            var5 = this.field_M;
            break L0;
          }
        }
        L1: {
          var7 = -var5 + var6;
          var8 = var7;
          if (0 < param3) {
            L2: {
              var8 = var8 * param1 / param3;
              if (var8 < this.field_M) {
                var8 = this.field_M;
                break L2;
              } else {
                break L2;
              }
            }
            if (var7 >= var8) {
              break L1;
            } else {
              var8 = var7;
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          var9 = -param1 + param3;
          var10 = -var8 + var7;
          var11 = 0;
          if ((var9 ^ -1) >= -1) {
            break L3;
          } else {
            var11 = (var9 / 2 + var10 * param2) / var9;
            break L3;
          }
        }
        L4: {
          var12 = var11 - -(var8 / 2);
          var14 = this.field_Hb;
          var14.field_V = 0;
          var14.field_M = this.field_M;
          var14.field_mb = 0;
          var14.field_pb = var5;
          var15 = this.field_Ib;
          var15.field_M = this.field_M;
          var15.field_V = var6;
          var15.field_mb = 0;
          var15.field_pb = -var6 + this.field_pb;
          var16 = this.field_Gb;
          var16.field_M = this.field_M;
          var16.field_mb = 0;
          var16.field_pb = var7;
          var16.field_V = var5;
          var17 = this.field_Kb;
          var17.field_M = this.field_M;
          var17.field_mb = 0;
          var17.field_V = 0;
          var17.field_pb = var12;
          var18 = this.field_Mb;
          var18.field_mb = 0;
          var18.field_V = var12;
          var18.field_pb = -var12 + var7;
          var18.field_M = this.field_M;
          var19 = this.field_Qb;
          var19.field_M = this.field_M;
          var19.field_pb = var8;
          stackOut_12_0 = this.field_Hb;
          stackOut_12_1 = this.field_Ib;
          stackOut_12_2 = this.field_Gb;
          stackIn_14_0 = stackOut_12_0;
          stackIn_14_1 = stackOut_12_1;
          stackIn_14_2 = stackOut_12_2;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          stackIn_13_2 = stackOut_12_2;
          if (param3 <= param1) {
            stackOut_14_0 = (ci) ((Object) stackIn_14_0);
            stackOut_14_1 = (ci) ((Object) stackIn_14_1);
            stackOut_14_2 = (ci) ((Object) stackIn_14_2);
            stackOut_14_3 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            stackIn_15_2 = stackOut_14_2;
            stackIn_15_3 = stackOut_14_3;
            break L4;
          } else {
            stackOut_13_0 = (ci) ((Object) stackIn_13_0);
            stackOut_13_1 = (ci) ((Object) stackIn_13_1);
            stackOut_13_2 = (ci) ((Object) stackIn_13_2);
            stackOut_13_3 = 1;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_15_2 = stackOut_13_2;
            stackIn_15_3 = stackOut_13_3;
            break L4;
          }
        }
        L5: {
          stackIn_15_2.field_tb = stackIn_15_3 != 0;
          stackIn_15_1.field_tb = stackIn_15_3 != 0;
          stackIn_15_0.field_tb = stackIn_15_3 != 0;
          var19.field_V = var11;
          if (param0) {
            break L5;
          } else {
            this.field_Gb = (ci) null;
            break L5;
          }
        }
        var19.field_mb = 0;
    }

    final boolean k(int param0) {
        if (param0 != 3384) {
            return true;
        }
        if (!(0 == this.field_Hb.field_L)) {
            this.field_Pb = 20;
            return true;
        }
        if (0 == this.field_Hb.field_kb) {
            return false;
        }
        if (-1 > (this.field_Pb ^ -1)) {
            this.field_Pb = this.field_Pb - 1;
        }
        if (this.field_Pb == 0) {
            this.field_Pb = 3;
            return true;
        }
        return false;
    }

    pd(long param0, ci param1, ci param2, ci param3, ci param4) {
        super(param0, (ci) null);
        RuntimeException var7 = null;
        ci var9 = null;
        ci var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            this.field_Hb = new ci(0L, param1);
            this.field_Ib = new ci(0L, param2);
            this.a((byte) 127, this.field_Hb);
            this.a((byte) 123, this.field_Ib);
            this.field_Gb = new ci(0L, (ci) null);
            this.a((byte) 124, this.field_Gb);
            this.field_Kb = new ci(0L, param3);
            this.field_Mb = new ci(0L, param3);
            this.field_Mb.field_w = true;
            var9 = this.field_Kb;
            var10 = var9;
            var10.field_w = true;
            this.field_Gb.a((byte) 127, this.field_Kb);
            this.field_Gb.a((byte) 124, this.field_Mb);
            this.field_Qb = new ci(0L, param4);
            this.field_Qb.field_rb = true;
            this.field_Gb.a((byte) 124, this.field_Qb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var7);
            stackOut_3_1 = new StringBuilder().append("pd.<init>(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final int b(int param0, int param1, boolean param2, int param3) {
        boolean discarded$2 = false;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = 0;
          var6 = -this.field_Qb.field_pb + this.field_Gb.field_pb;
          if (0 >= var6) {
            break L0;
          } else {
            var7 = this.field_Qb.field_V;
            var8 = -param3 + param1;
            var5 = (var8 * var7 - -(var6 / 2)) / var6;
            break L0;
          }
        }
        L1: {
          if (param0 == -1) {
            break L1;
          } else {
            discarded$2 = this.m(52);
            break L1;
          }
        }
        L2: {
          if (param2) {
            L3: {
              if ((var5 ^ -1) > -1) {
                var5 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            if (var5 > param1 + -param3) {
              var5 = param1 + -param3;
              break L2;
            } else {
              break L2;
            }
          } else {
            L4: {
              if (var5 <= -param3 + param1) {
                break L4;
              } else {
                var5 = -param3 + param1;
                break L4;
              }
            }
            if (var5 >= 0) {
              break L2;
            } else {
              var5 = 0;
              break L2;
            }
          }
        }
        return var5;
    }

    final boolean f(byte param0) {
        if (0 != this.field_Ib.field_L) {
            this.field_Pb = 20;
            return true;
        }
        if (!(0 == this.field_Ib.field_kb)) {
            if (0 < this.field_Pb) {
                this.field_Pb = this.field_Pb - 1;
            }
            if (this.field_Pb == 0) {
                this.field_Pb = 3;
                return true;
            }
        }
        if (param0 != -38) {
            this.field_Ib = (ci) null;
            return false;
        }
        return false;
    }

    static {
        field_Ob = "Orb points: ";
        field_Tb = 9;
        field_Jb = "Invite only";
        field_Eb = 0;
        field_Nb = new long[1000];
    }
}
