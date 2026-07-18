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
        fb[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        fb[] var7 = null;
        var6 = Chess.field_G;
        if (((e) this).field_Q >= param1) {
          return;
        } else {
          var7 = new fb[param1];
          var3 = var7;
          var4 = new int[param1];
          var5 = 0;
          L0: while (true) {
            if (((e) this).field_Q <= var5) {
              ((e) this).field_S = var3;
              ((e) this).field_Q = param1;
              ((e) this).field_K = var4;
              return;
            } else {
              var7[var5] = ((e) this).field_S[var5];
              var4[var5] = ((e) this).field_K[var5];
              var5++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, -117, param3);
        int discarded$32 = ((e) this).field_R.a(((e) this).field_P, 14 + (param3 + ((e) this).field_u), param0 - (-((e) this).field_r + -10), -28 + ((e) this).field_y, ((e) this).field_C, 16777215, -1, 0, 0, ((e) this).field_R.field_C);
        if (param2 >= -80) {
            ((e) this).field_S = null;
        }
    }

    final static void h() {
        cf.field_Jb = ud.a(2);
        s.field_K = 0;
    }

    public static void a() {
        field_M = null;
        field_T = null;
    }

    final fb a(byte param0, rg param1, String param2) {
        fb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        fb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        fb stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var4 = new fb(param2, param1);
            var4.field_n = (jm) (Object) new sf();
            if (param0 == -114) {
              var5 = ((e) this).field_C - 2;
              ((e) this).a(0, 34, 34 + ((e) this).field_C, ((e) this).field_y, 0);
              var4.a(var5, 34, 30, -14 + ((e) this).field_y, 7);
              ((e) this).b((mf) (Object) var4, 95);
              stackOut_3_0 = (fb) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("e.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void g(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        ci stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int stackIn_2_4 = 0;
        ci stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        ci stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        ci stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        ci stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        ci stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_10_0 = 0;
        ci stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        ci stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        ci stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        ci stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        ci stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        ci stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        int stackIn_23_0 = 0;
        ci stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        ci stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        ci stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        ci stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        ci stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        ci stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        int stackOut_18_5 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        ci stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        ci stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        ci stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        int stackOut_2_5 = 0;
        ci stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        ci stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        ci stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        vi.field_d = wb.field_h;
        fn.field_c = wb.field_c;
        int discarded$1 = 90;
        tf.a();
        wf.field_W.a(ql.field_d.field_M, 0, 0, -2 + (ql.field_d.field_pb + -40), true);
        fe.field_h.a(0, dc.field_q.field_M, -2147483648, fe.field_g, 0);
        if (param0 > -124) {
          L0: {
            field_M = null;
            var1 = fe.field_g - -2;
            stackOut_14_0 = bh.field_G;
            stackOut_14_1 = 0;
            stackOut_14_2 = dc.field_q.field_M;
            stackOut_14_3 = -2147483648;
            stackOut_14_4 = dc.field_q.field_pb;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_16_2 = stackOut_14_2;
            stackIn_16_3 = stackOut_14_3;
            stackIn_16_4 = stackOut_14_4;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            stackIn_15_2 = stackOut_14_2;
            stackIn_15_3 = stackOut_14_3;
            stackIn_15_4 = stackOut_14_4;
            if (!bo.field_c) {
              stackOut_16_0 = (ci) (Object) stackIn_16_0;
              stackOut_16_1 = stackIn_16_1;
              stackOut_16_2 = stackIn_16_2;
              stackOut_16_3 = stackIn_16_3;
              stackOut_16_4 = stackIn_16_4;
              stackOut_16_5 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              stackIn_17_3 = stackOut_16_3;
              stackIn_17_4 = stackOut_16_4;
              stackIn_17_5 = stackOut_16_5;
              break L0;
            } else {
              stackOut_15_0 = (ci) (Object) stackIn_15_0;
              stackOut_15_1 = stackIn_15_1;
              stackOut_15_2 = stackIn_15_2;
              stackOut_15_3 = stackIn_15_3;
              stackOut_15_4 = stackIn_15_4;
              stackOut_15_5 = var1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_17_3 = stackOut_15_3;
              stackIn_17_4 = stackOut_15_4;
              stackIn_17_5 = stackOut_15_5;
              break L0;
            }
          }
          L1: {
            stackOut_17_0 = (ci) (Object) stackIn_17_0;
            stackOut_17_1 = stackIn_17_1;
            stackOut_17_2 = stackIn_17_2;
            stackOut_17_3 = stackIn_17_3;
            stackOut_17_4 = stackIn_17_4 - stackIn_17_5;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_19_2 = stackOut_17_2;
            stackIn_19_3 = stackOut_17_3;
            stackIn_19_4 = stackOut_17_4;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            stackIn_18_3 = stackOut_17_3;
            stackIn_18_4 = stackOut_17_4;
            if (!bo.field_c) {
              stackOut_19_0 = (ci) (Object) stackIn_19_0;
              stackOut_19_1 = stackIn_19_1;
              stackOut_19_2 = stackIn_19_2;
              stackOut_19_3 = stackIn_19_3;
              stackOut_19_4 = stackIn_19_4;
              stackOut_19_5 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              stackIn_20_3 = stackOut_19_3;
              stackIn_20_4 = stackOut_19_4;
              stackIn_20_5 = stackOut_19_5;
              break L1;
            } else {
              stackOut_18_0 = (ci) (Object) stackIn_18_0;
              stackOut_18_1 = stackIn_18_1;
              stackOut_18_2 = stackIn_18_2;
              stackOut_18_3 = stackIn_18_3;
              stackOut_18_4 = stackIn_18_4;
              stackOut_18_5 = var1;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              stackIn_20_3 = stackOut_18_3;
              stackIn_20_4 = stackOut_18_4;
              stackIn_20_5 = stackOut_18_5;
              break L1;
            }
          }
          L2: {
            ((ci) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_20_2, stackIn_20_3, stackIn_20_4, stackIn_20_5);
            dj.g(2);
            ln.field_cc.a(0, ql.field_d.field_M, -2147483648, 40, ql.field_d.field_pb - 40);
            he.field_Hb.a(0, rb.field_c.field_M, -2147483648, 30, 0);
            oh.field_a.a(0, rb.field_c.field_M, -2147483648, -42 + rb.field_c.field_pb - 30, 30);
            ue.field_d.a(5, 68, -2147483648, 30, 5);
            in.field_b.a(75, 78, -2147483648, 30, 5);
            ca.field_g.a(155, 48, -2147483648, 30, 5);
            kh.field_l.a(205, 48, -2147483648, 30, 5);
            if (bo.field_c) {
              stackOut_22_0 = 250;
              stackIn_23_0 = stackOut_22_0;
              break L2;
            } else {
              stackOut_21_0 = 200;
              stackIn_23_0 = stackOut_21_0;
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
            stackOut_1_0 = bh.field_G;
            stackOut_1_1 = 0;
            stackOut_1_2 = dc.field_q.field_M;
            stackOut_1_3 = -2147483648;
            stackOut_1_4 = dc.field_q.field_pb;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            stackIn_2_3 = stackOut_1_3;
            stackIn_2_4 = stackOut_1_4;
            if (!bo.field_c) {
              stackOut_3_0 = (ci) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = stackIn_3_3;
              stackOut_3_4 = stackIn_3_4;
              stackOut_3_5 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              stackIn_4_4 = stackOut_3_4;
              stackIn_4_5 = stackOut_3_5;
              break L4;
            } else {
              stackOut_2_0 = (ci) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = stackIn_2_2;
              stackOut_2_3 = stackIn_2_3;
              stackOut_2_4 = stackIn_2_4;
              stackOut_2_5 = var1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              stackIn_4_4 = stackOut_2_4;
              stackIn_4_5 = stackOut_2_5;
              break L4;
            }
          }
          L5: {
            stackOut_4_0 = (ci) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = stackIn_4_4 - stackIn_4_5;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            if (!bo.field_c) {
              stackOut_6_0 = (ci) (Object) stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = stackIn_6_3;
              stackOut_6_4 = stackIn_6_4;
              stackOut_6_5 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              stackIn_7_5 = stackOut_6_5;
              break L5;
            } else {
              stackOut_5_0 = (ci) (Object) stackIn_5_0;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = stackIn_5_2;
              stackOut_5_3 = stackIn_5_3;
              stackOut_5_4 = stackIn_5_4;
              stackOut_5_5 = var1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_7_4 = stackOut_5_4;
              stackIn_7_5 = stackOut_5_5;
              break L5;
            }
          }
          L6: {
            ((ci) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5);
            dj.g(2);
            ln.field_cc.a(0, ql.field_d.field_M, -2147483648, 40, ql.field_d.field_pb - 40);
            he.field_Hb.a(0, rb.field_c.field_M, -2147483648, 30, 0);
            oh.field_a.a(0, rb.field_c.field_M, -2147483648, -42 + rb.field_c.field_pb - 30, 30);
            ue.field_d.a(5, 68, -2147483648, 30, 5);
            in.field_b.a(75, 78, -2147483648, 30, 5);
            ca.field_g.a(155, 48, -2147483648, 30, 5);
            kh.field_l.a(205, 48, -2147483648, 30, 5);
            if (bo.field_c) {
              stackOut_9_0 = 250;
              stackIn_10_0 = stackOut_9_0;
              break L6;
            } else {
              stackOut_8_0 = 200;
              stackIn_10_0 = stackOut_8_0;
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
                ((e) this).field_N = null;
            }
            var4_int = ((e) this).field_Q;
            this.a(2116, var4_int - -1);
            ((e) this).field_S[var4_int] = ((e) this).a((byte) -114, (rg) this, param2);
            ((e) this).field_K[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "e.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    e(vn param0, lh param1, String param2) {
        super(0, 0, 288, 0, (jm) null);
        int var4_int = 0;
        ((e) this).field_Q = 0;
        try {
            ((e) this).field_N = param0;
            ((e) this).field_P = param2;
            ((e) this).field_R = param1;
            var4_int = ((e) this).field_P != null ? ((e) this).field_R.b(((e) this).field_P, 260, ((e) this).field_R.field_C) : 0;
            ((e) this).a(0, 34, 22 + var4_int, 288, 0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void i() {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Chess.field_G;
        try {
          L0: {
            int discarded$19 = 110;
            if (mk.b()) {
              boolean discarded$20 = ji.field_V.a(-126, hn.field_m, tj.field_o, true);
              ji.field_V.f((byte) 64);
              L1: while (true) {
                int discarded$21 = 18954;
                if (!kf.d()) {
                  break L0;
                } else {
                  boolean discarded$22 = ji.field_V.a(d.field_Ib, -110, vg.field_a);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (rm.field_R == null) {
                  break L2;
                } else {
                  if (rm.field_R.field_b) {
                    b.a(true);
                    ji.field_V.b((mf) (Object) new ge(ji.field_V, kh.field_k), (byte) -86);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "e.J(" + 114 + ')');
        }
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (((e) this).field_Q <= var6_int) {
                  break L2;
                } else {
                  if (param0 == ((e) this).field_S[var6_int]) {
                    var7 = ((e) this).field_K[var6_int];
                    if (var7 == -1) {
                      ((e) this).field_N.k((byte) -114);
                      break L2;
                    } else {
                      uk.a(false, ((e) this).field_K[var6_int]);
                      break L2;
                    }
                  } else {
                    var6_int++;
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
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("e.DA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = Math.atan2(1.0, 0.0);
        field_O = 480;
    }
}
