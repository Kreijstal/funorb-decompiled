/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gaa extends lg {
    static String field_l;
    static ma[] field_i;
    static int field_k;
    boolean field_j;
    private jfa field_h;

    final static void a(po param0, vr param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        jc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = kt.field_k;
            fo.field_a = new sna(0L, (sna) null);
            if (param1 != null) {
              param1.field_g = false;
              param1.field_e = 0;
              bga.field_l = new cc(var3_int, param1, param1);
              cea.field_h = new wk(var3_int, param1, param1, (so) (Object) new oe());
              var4 = kn.a(128);
              if (var4 != null) {
                nh.a(0, var4);
                var12 = null;
                mj.field_k = qla.a(1513239, 1513239, 0, 1127256, 65793, 8947848, -24, (po) null, 4020342, 2245737, 5138823, 65793, 65793);
                tga.field_p = qla.a(0, 0, 16764006, 0, 0, 0, -24, param0, 0, 0, 0, 0, 0);
                jv.field_i = qla.a(0, 0, 16777215, 0, 0, 0, -24, param0, 0, 0, 0, 0, 0);
                var5 = dg.field_i;
                var6 = dg.field_c;
                var16 = dg.field_e;
                kga.field_a = new kv(10, 14);
                kga.field_a.b();
                var8 = 2;
                L1: while (true) {
                  if (7 <= var8) {
                    dg.a(var16, var5, var6);
                    int discarded$1 = 0;
                    sc.field_m = ad.a(mj.field_k, var4, tga.field_p, jv.field_i);
                    fo.field_a.field_z = new eaa();
                    break L0;
                  } else {
                    dg.f(var8, var8 + 1, 14 + -(var8 << 1), 16777215);
                    var8++;
                    continue L1;
                  }
                }
              } else {
                var11 = null;
                cv.a(1, "QC2", (Throwable) null);
                return;
              }
            } else {
              var10 = null;
              cv.a(1, "QC1", (Throwable) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("gaa.B(");
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
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + -95 + 41);
        }
    }

    final static void a(sna param0, sna param1, byte param2, sna param3, sna param4) {
        RuntimeException var5 = null;
        String var5_ref = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            if (lna.field_C == null) {
              L1: {
                lna.field_q = false;
                if (hl.field_I) {
                  var5_ref = kna.field_h;
                  break L1;
                } else {
                  if (!sea.field_j) {
                    var5_ref = qg.field_a;
                    break L1;
                  } else {
                    var5_ref = uda.field_eb;
                    break L1;
                  }
                }
              }
              var7 = null;
              pp.a(vq.field_w, 5, var5_ref, 0, (String) null);
              jba.field_A.field_G = (8355711 & uc.field_l.field_G >> 1) + vq.field_w + -((vq.field_w & 16711422) >> 1);
              jba.field_A.field_ab = ((uc.field_l.field_ab & 16711423) >> 1) + -(8355711 & vq.field_w >> 1) + vq.field_w;
              jba.field_A.field_w = ((uc.field_l.field_w & 16711423) >> 1) + (-((vq.field_w & 16711423) >> 1) + vq.field_w);
              lna.field_C = jba.field_A;
              qk.field_q = ts.field_r;
              bi.field_h = new sna(0L, param4);
              qc.field_b = new sna(0L, param3);
              tga.field_m = new sna(0L, (sna) null);
              aja.field_p = new sna(0L, param1);
              jba.field_A = new sna(0L, param0);
              jba.field_A.field_jb = dc.field_r;
              aja.field_p.a(-1, jba.field_A);
              ts.field_r = new sna(0L, qk.field_q);
              aja.field_p.a(-1, ts.field_r);
              ub.field_k = new sna(0L, uc.field_l, nw.field_s);
              qq.field_k = new sna(0L, uc.field_l);
              bi.field_h.a(-1, qc.field_b);
              bi.field_h.a(-1, tga.field_m);
              tga.field_m.a(-1, aja.field_p);
              tga.field_m.a(-1, ub.field_k);
              tga.field_m.a(-1, qq.field_k);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("gaa.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(55).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
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
              int discarded$2 = 92;
              gja.a(param0);
              uv.a(false, oc.field_m, false);
              if (param1 <= -81) {
                break L1;
              } else {
                var3 = null;
                gaa.a((String) null, -56);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gaa.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    private final void a() {
        int var2 = 0;
        ((gaa) this).field_a.field_z = null;
        ((gaa) this).a(qga.field_s, 40, -4586, 72, 334, 260);
        ((gaa) this).a(hea.field_s, 40, -4586, 72, 334, 366);
    }

    public static void d() {
        field_l = null;
        field_i = null;
    }

    gaa(int param0, int param1, int param2, int param3, boolean param4, jfa param5) {
        super(param0, param1, param2, param3, 0, (String) null);
        try {
            ((gaa) this).field_j = param4 ? true : false;
            ((gaa) this).field_h = param5;
            int discarded$0 = 82;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gaa.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final void e(int param0) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        ew.field_r.e(((gaa) this).field_g, ((gaa) this).field_f);
        dg.a(((gaa) this).field_g - -40, ((gaa) this).field_f + 20, ((gaa) this).field_d - 110, ((gaa) this).field_c - 30, 20, 65793, 64);
        ((gaa) this).field_h.field_v.a(false, false, 2048, 2048, param0, -28, 256, 230, 150);
        if (!((gaa) this).field_j) {
          L0: {
            wq.a(1, 14, 300, 16777215, ((gaa) this).field_f + 16, 300, 65793, true, tba.field_r, 0, ((gaa) this).field_g + 54);
            int discarded$6 = 65793;
            laa.a(284, (byte) -95, 310, 16777215, us.field_a);
            ana.field_r.e(244, 330);
            stackOut_5_0 = 356;
            stackOut_5_1 = -111;
            stackOut_5_2 = 298;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            if (((gaa) this).field_j) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = 16777215;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              break L0;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = 8421504;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              break L0;
            }
          }
          int discarded$7 = 65793;
          laa.a(stackIn_8_0, (byte) stackIn_8_1, stackIn_8_2, stackIn_8_3, qga.field_s);
          ana.field_r.e(350, 330);
          int discarded$8 = 65793;
          laa.a(356, (byte) -65, 402, 16777215, hea.field_s);
          return;
        } else {
          L1: {
            wq.a(1, 14, 300, 16777215, ((gaa) this).field_f + 10, 300, 65793, true, qi.field_a, 0, ((gaa) this).field_g + 54);
            int discarded$9 = 65793;
            laa.a(284, (byte) -56, 310, 16777215, lga.a(true, new String[1], he.field_o));
            ana.field_r.e(244, 330);
            stackOut_1_0 = 356;
            stackOut_1_1 = -111;
            stackOut_1_2 = 298;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            if (((gaa) this).field_j) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = 16777215;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = stackIn_2_2;
              stackOut_2_3 = 8421504;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              break L1;
            }
          }
          int discarded$10 = 65793;
          laa.a(stackIn_4_0, (byte) stackIn_4_1, stackIn_4_2, stackIn_4_3, qga.field_s);
          ana.field_r.e(350, 330);
          int discarded$11 = 65793;
          laa.a(356, (byte) -65, 402, 16777215, hea.field_s);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "You";
    }
}
