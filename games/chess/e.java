/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends ma implements mj {
    private int[] field_K;
    private lh field_R;
    private fb[] field_S;
    static double field_L;
    static ci field_M;
    private vn field_N;
    private String field_P;
    private int field_Q;
    static int field_O;
    static String field_T;

    private final void a(int param0, int param1) {
        fb[] var3;
        int[] var4;
        int var5;
        int var6;
        fb[] var7;
        var6 = Chess.field_G;
        if (this.field_Q < param1) {
          var7 = new fb[param1];
          var3 = var7;
          var4 = new int[param1];
          if (param0 != 2116) {
            return;
          } else {
            var5 = 0;
            L0: while (true) {
              if (this.field_Q <= var5) {
                this.field_S = var3;
                this.field_Q = param1;
                this.field_K = var4;
                return;
              } else {
                var7[var5] = this.field_S[var5];
                var4[var5] = this.field_K[var5];
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, -117, param3);
        this.field_R.a(this.field_P, 14 + (param3 + this.field_u), param0 - (-this.field_r + -10), -28 + this.field_y, this.field_C, 16777215, -1, 0, 0, this.field_R.field_C);
        if (param2 >= -80) {
            this.field_S = (fb[]) null;
        }
    }

    final static void h(byte param0) {
        cf.field_Jb = ud.a(2);
        s.field_K = 0;
        if (param0 != -120) {
            field_T = (String) null;
        }
    }

    public static void a(int param0) {
        field_M = null;
        if (param0 <= 39) {
            e.i((byte) -58);
            field_T = null;
            return;
        }
        field_T = null;
    }

    final fb a(byte param0, rg param1, String param2) {
        fb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fb stackIn_2_0 = null;
        fb stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new fb(param2, param1);
            var4.field_n = (jm) ((Object) new sf());
            if (param0 == -114) {
              var5 = this.field_C - 2;
              this.a(0, 34, 34 + this.field_C, this.field_y, 0);
              var4.a(var5, 34, 30, -14 + this.field_y, 7);
              this.b(var4, 95);
              stackIn_4_0 = (fb) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (fb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("e.A(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void g(byte param0) {
        int var1;
        int var2;
        int var3;
        ci stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        ci stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        int stackIn_6_4;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_10_0 = 0;
        ci stackIn_16_0;
        int stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_16_4;
        ci stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_19_4;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        int stackIn_23_0 = 0;
        vi.field_d = wb.field_h;
        fn.field_c = wb.field_c;
        tf.a(90);
        wf.field_W.a(ql.field_d.field_M, 0, 0, -2 + (ql.field_d.field_pb + -40), true);
        fe.field_h.a(0, dc.field_q.field_M, -2147483648, fe.field_g, 0);
        if (param0 > -124) {
          L0: {
            field_M = (ci) null;
            var1 = fe.field_g - -2;
            stackIn_16_0 = bh.field_G;

            stackIn_16_1 = 0;

            stackIn_16_2 = dc.field_q.field_M;

            stackIn_16_3 = -2147483648;

            stackIn_16_4 = dc.field_q.field_pb;

            if (!bo.field_c) {
              stackIn_17_0 = (ci) ((Object) stackIn_16_0);
              stackIn_17_1 = stackIn_16_1;
              stackIn_17_2 = stackIn_16_2;
              stackIn_17_3 = stackIn_16_3;
              stackIn_17_4 = stackIn_16_4;
              stackIn_17_5 = 0;
              break L0;
            } else {
              stackIn_17_0 = (ci) ((Object) stackIn_16_0);
              stackIn_17_1 = stackIn_16_1;
              stackIn_17_2 = stackIn_16_2;
              stackIn_17_3 = stackIn_16_3;
              stackIn_17_4 = stackIn_16_4;
              stackIn_17_5 = var1;
              break L0;
            }
          }
          L1: {








            stackIn_19_4 = stackIn_17_4 - stackIn_17_5;

            if (!bo.field_c) {
              stackIn_17_0 = (ci) ((Object) stackIn_17_0);



              stackIn_20_4 = stackIn_19_4;
              stackIn_20_5 = 0;
              break L1;
            } else {
              stackIn_17_0 = (ci) ((Object) stackIn_17_0);



              stackIn_20_4 = stackIn_19_4;
              stackIn_20_5 = var1;
              break L1;
            }
          }
          L2: {
            ((ci) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_20_4, stackIn_20_5);
            dj.g(2);
            ln.field_cc.a(0, ql.field_d.field_M, -2147483648, 40, ql.field_d.field_pb - 40);
            he.field_Hb.a(0, rb.field_c.field_M, -2147483648, 30, 0);
            oh.field_a.a(0, rb.field_c.field_M, -2147483648, -42 + rb.field_c.field_pb - 30, 30);
            ue.field_d.a(5, 68, -2147483648, 30, 5);
            in.field_b.a(75, 78, -2147483648, 30, 5);
            ca.field_g.a(155, 48, -2147483648, 30, 5);
            kh.field_l.a(205, 48, -2147483648, 30, 5);
            if (bo.field_c) {
              stackIn_23_0 = 250;
              break L2;
            } else {
              stackIn_23_0 = 200;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_23_0;
            lg.field_c.a(5 + var2, -var2 + 363, -2147483648, 30, 5);
            vk.field_i.a(370, -5 + rb.field_c.field_M - 370, -2147483648, 30, 5);
            ci.field_zb.a(2, -5 + (oh.field_a.field_pb - 37), 37, -3, sc.field_e, 5, -5 + (-5 + oh.field_a.field_M));
            var3 = (2 + rb.field_c.field_M) / 2;
            si.field_l.a(0, -2 + var3, -2147483648, 40, rb.field_c.field_pb - 40);
            if (!bo.field_c) {
              var3 = 0;
              break L3;
            } else {
              break L3;
            }
          }
          wj.field_g.a(var3, -var3 + rb.field_c.field_M, -2147483648, 40, rb.field_c.field_pb + -40);
          return;
        } else {
          L4: {
            var1 = fe.field_g - -2;
            stackIn_3_0 = bh.field_G;

            stackIn_3_1 = 0;

            stackIn_3_2 = dc.field_q.field_M;

            stackIn_3_3 = -2147483648;

            stackIn_3_4 = dc.field_q.field_pb;

            if (!bo.field_c) {
              stackIn_4_0 = (ci) ((Object) stackIn_3_0);
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = stackIn_3_2;
              stackIn_4_3 = stackIn_3_3;
              stackIn_4_4 = stackIn_3_4;
              stackIn_4_5 = 0;
              break L4;
            } else {
              stackIn_4_0 = (ci) ((Object) stackIn_3_0);
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = stackIn_3_2;
              stackIn_4_3 = stackIn_3_3;
              stackIn_4_4 = stackIn_3_4;
              stackIn_4_5 = var1;
              break L4;
            }
          }
          L5: {








            stackIn_6_4 = stackIn_4_4 - stackIn_4_5;

            if (!bo.field_c) {
              stackIn_4_0 = (ci) ((Object) stackIn_4_0);



              stackIn_7_4 = stackIn_6_4;
              stackIn_7_5 = 0;
              break L5;
            } else {
              stackIn_4_0 = (ci) ((Object) stackIn_4_0);



              stackIn_7_4 = stackIn_6_4;
              stackIn_7_5 = var1;
              break L5;
            }
          }
          L6: {
            ((ci) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_7_4, stackIn_7_5);
            dj.g(2);
            ln.field_cc.a(0, ql.field_d.field_M, -2147483648, 40, ql.field_d.field_pb - 40);
            he.field_Hb.a(0, rb.field_c.field_M, -2147483648, 30, 0);
            oh.field_a.a(0, rb.field_c.field_M, -2147483648, -42 + rb.field_c.field_pb - 30, 30);
            ue.field_d.a(5, 68, -2147483648, 30, 5);
            in.field_b.a(75, 78, -2147483648, 30, 5);
            ca.field_g.a(155, 48, -2147483648, 30, 5);
            kh.field_l.a(205, 48, -2147483648, 30, 5);
            if (bo.field_c) {
              stackIn_10_0 = 250;
              break L6;
            } else {
              stackIn_10_0 = 200;
              break L6;
            }
          }
          L7: {
            var2 = stackIn_10_0;
            lg.field_c.a(5 + var2, -var2 + 363, -2147483648, 30, 5);
            vk.field_i.a(370, -5 + rb.field_c.field_M - 370, -2147483648, 30, 5);
            ci.field_zb.a(2, -5 + (oh.field_a.field_pb - 37), 37, -3, sc.field_e, 5, -5 + (-5 + oh.field_a.field_M));
            var3 = (2 + rb.field_c.field_M) / 2;
            si.field_l.a(0, -2 + var3, -2147483648, 40, rb.field_c.field_pb - 40);
            if (!bo.field_c) {
              var3 = 0;
              break L7;
            } else {
              break L7;
            }
          }
          wj.field_g.a(var3, -var3 + rb.field_c.field_M, -2147483648, 40, rb.field_c.field_pb + -40);
          return;
        }
    }

    final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        try {
            if (param1 < 26) {
                this.field_N = (vn) null;
            }
            var4_int = this.field_Q;
            this.a(2116, var4_int - -1);
            this.field_S[var4_int] = this.a((byte) -114, (rg) (this), param2);
            this.field_K[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "e.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    e(vn param0, lh param1, String param2) {
        super(0, 0, 288, 0, (jm) null);
        int var4_int = 0;
        this.field_Q = 0;
        try {
            this.field_N = param0;
            this.field_P = param2;
            this.field_R = param1;
            var4_int = this.field_P != null ? this.field_R.b(this.field_P, 260, this.field_R.field_C) : 0;
            this.a(0, 34, 22 + var4_int, 288, 0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void i(byte param0) {
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Chess.field_G;
        try {
          L0: {
            if (mk.b(110)) {
              ji.field_V.a(-126, hn.field_m, tj.field_o, true);
              if (param0 >= 109) {
                ji.field_V.f((byte) 64);
                L1: while (true) {
                  if (!kf.d(18954)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    ji.field_V.a(d.field_Ib, -110, vg.field_a);
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L2: {
                if (rm.field_R == null) {
                  break L2;
                } else {
                  if (rm.field_R.field_b) {
                    b.a(true);
                    ji.field_V.b(new ge(ji.field_V, kh.field_k), (byte) -86);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "e.J(" + param0 + ')');
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

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (this.field_Q <= var6_int) {
                  break L2;
                } else {
                  if (param0 == this.field_S[var6_int]) {
                    var7 = this.field_K[var6_int];
                    if (0 == (var7 ^ -1)) {
                      this.field_N.k((byte) -114);
                      break L2;
                    } else {
                      uk.a(false, this.field_K[var6_int]);
                      break L2;
                    }
                  } else {
                    var6_int++;
                    continue L1;
                  }
                }
              }
              if (param4 == -24221) {
                break L0;
              } else {
                field_O = -87;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("e.DA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_L = Math.atan2(1.0, 0.0);
        field_O = 480;
    }
}
