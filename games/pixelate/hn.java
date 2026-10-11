/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn implements ml {
    static int field_a;
    private long field_c;
    static int field_d;
    static fm field_e;
    static tf field_b;
    static long field_f;

    final static int a(boolean param0, String param1, we param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param2.field_m;
          var5 = (CharSequence) ((Object) param1);
          var4 = gk.b(var5, 353);
          param2.a((byte) 81, var4.length);
          param2.field_m = param2.field_m + kp.field_v.a(param2.field_m, var4.length, param2.field_k, 0, var4, param0);
          stackIn_1_0 = -var3_int + param2.field_m;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("hn.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(fm param0, int param1, fm param2, fm param3, boolean param4) {
        an.field_e = ii.a((byte) 122, "");
        an.field_e.a(param1 - 27848, false);
        nn.a(param1 + 4740151, param3, param2, param0);
        ql.b(false);
        if (param1 != 27848) {
          return;
        }
        try {
          qo.field_n = wm.field_a;
          tm.field_X = wm.field_a;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "hn.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, String[] param1, int param2, String param3) {
        int var5 = 0;
        String var6 = null;
        String[] var7 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          qo.field_n = h.field_N;
          if (param2 != 255) {
            if (param2 >= 100 &&
              param2 <= 105) {
              var7 = param1;
              ro.a(var7, 2);
              jc.field_f = fk.a((byte) -65, param1);
            } else {
              jc.field_f = pa.a(param2, param3, (byte) -97);
            }
          } else {
            stackIn_5_0 = !(um.field_r >= 13);
            jc.field_f = pk.a(stackIn_5_0, 5731);
            ro.a((String[]) null, param0 ^ -99);
          }
          if (param0 != -97) {
            var6 = (String) null;
            hn.a((byte) -92, (String[]) null, -31, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("hn.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract dj a(boolean param0);

    final static boolean a(byte param0, im param1, im param2) {
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = -param2.field_Kb + param1.field_Kb;
          if (param1.field_Nb == qp.field_L) {
            var3_int -= 200;
          } else {
            if (param1.field_Nb == null) {
              var3_int += 200;
            }
          }
          if (qp.field_L != param2.field_Nb) {
            if (param2.field_Nb == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          var4 = 27 % ((-11 - param0) / 51);
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("hn.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        ak stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_8_4;
        int stackIn_9_5 = 0;
        Object stackIn_32_0 = null;
        lo stackIn_32_1 = null;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        ak var8_ref_ak = null;
        lo var9 = null;
        int var9_int = 0;
        lo var10 = null;
        int var10_int = 0;
        int var12 = 0;
        int var13 = 0;
        im var14 = null;
        ak var15 = null;
        ak var16 = null;
        int var17 = 0;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          ni.field_q = t.field_j;
          wg.field_b = t.field_d;
          if (param0 != 32) {
            var14 = (im) null;
            hn.a((byte) -25, (im) null, (im) null);
          }
          if (!param1) {
            stackIn_6_0 = h.field_W;
          } else {
            stackIn_6_0 = vn.field_g;
          }
          cm.b(stackIn_6_0, 4740);
          nd.field_b.a(ff.field_h.field_K, -42 + ff.field_h.field_nb, 0, 0, param0 ^ 37);
          qo.field_q.a(0, fq.field_q, 0, 256, vd.field_a.field_K);
          stackIn_8_0 = le.field_h;
          stackIn_8_1 = 2 + fq.field_q;
          stackIn_8_2 = 18;
          stackIn_8_3 = 0;
          stackIn_8_4 = 256;
          if (f.field_n) {
            stackIn_9_5 = 40 + hk.field_b + 4;
          } else {
            stackIn_9_5 = 0;
          }
          ((ak) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, -stackIn_9_5 + vd.field_a.field_K);
          wa.field_g.a(2 + fq.field_q, 18, -40 + vd.field_a.field_K - (hk.field_b + 2), 256, 42 + hk.field_b);
          ae.field_c.a(0, 2, (byte) 90, vd.field_a.field_K, fq.field_q + 22, -22 + (-fq.field_q + vd.field_a.field_nb), hk.field_b);
          gk.field_kb.a(ff.field_h.field_nb - 40, 40, 0, 256, ff.field_h.field_K);
          vp.field_Qb.a(0, 30, 0, 256, ai.field_A.field_K);
          dc.field_a.a(30, -40 + (ai.field_A.field_nb - 2 - 30), 0, 256, ai.field_A.field_K);
          var2_int = 3 + fj.field_b;
          if (ia.field_a.length < 2) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = -2 + (-10 + (dc.field_a.field_nb - 10 + 2) + (1 + var2_int) / 2) / (1 + var2_int);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -5 + dc.field_a.field_nb - 5 - var2_int * (var3 + 2);
          if (40 < var4) {
            var4 = 40;
          }
          sm.field_m.a(5, var4, 5, param0 ^ 288, dc.field_a.field_K - 5 - 5);
          var5 = 2 + var4 + 5;
          for (var6 = 0; fj.field_b + 4 > var6; var6++) {
            if ((1 != var6 ||
              !(2 > ia.field_a.length)) && (var6 != 3 ||
              !(1 >= ff.field_i))) {
              if (!param1 &&
                3 == var6) {
                var15 = dh.field_b[var6];
                dh.field_b[var6].field_nb = 0;
                var15.field_K = 0;
                for (var8 = 0; hc.field_L[var6].length > var8; var8++) {
                  stackIn_32_0 = null;
                  stackIn_32_1 = hc.field_L[var6][var8];
                  if (stackIn_32_0 != stackIn_32_1) {
                    var9 = hc.field_L[var6][var8];
                    hc.field_L[var6][var8].field_nb = 0;
                    var9.field_K = 0;
                  }
                }
              } else if (param1 &&
                var6 == 0) {
                var16 = dh.field_b[var6];
                dh.field_b[var6].field_nb = 0;
                var16.field_K = 0;
                for (var8 = 0; hc.field_L[var6].length > var8; var8++) {
                  if (null != hc.field_L[var6][var8]) {
                    var9 = hc.field_L[var6][var8];
                    hc.field_L[var6][var8].field_nb = 0;
                    var9.field_K = 0;
                  }
                }
              } else {
                if (param1) {
                  if (4 <= var6) {
                    if (ni.field_o != null) {
                      stackIn_50_0 = (ni.field_o[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_50_0 = 0;
                    }
                  } else {
                    stackIn_50_0 = 0;
                  }
                } else {
                  stackIn_50_0 = 0;
                }
                var7 = stackIn_50_0;
                if (var7 != 0) {
                  var8_ref_ak = dh.field_b[var6];
                  dh.field_b[var6].field_nb = 0;
                  var8_ref_ak.field_K = 0;
                  var17 = 0;
                  var9_int = var17;
                  while (hc.field_L[var6].length > var17) {
                    if (hc.field_L[var6][var17] != null) {
                      var10 = hc.field_L[var6][var17];
                      hc.field_L[var6][var17].field_nb = 0;
                      var10.field_K = 0;
                    }
                    var17++;
                  }
                } else {
                  dh.field_b[var6].a(var5, var3, 5, 256, 103);
                  var8 = 110;
                  if (!param1) {
                    if (hc.field_L[var6][0] != null) {
                      var9 = hc.field_L[var6][0];
                      hc.field_L[var6][0].field_nb = 0;
                      var9.field_K = 0;
                    }
                  } else {
                    hc.field_L[var6][0].a(var3, 2, hd.field_q, var5, var8, 38, param0 ^ -2147483616);
                    var8 += 40;
                  }
                  var9_int = -var8 + (ai.field_A.field_K - 3);
                  var10_int = hc.field_L[var6].length - 1;
                  for (var11 = 0; var11 < var10_int; var11++) {
                    var12 = var9_int * var11 / var10_int;
                    hc.field_L[var6][var11 + 1].a(var3, 2, hd.field_q, var5, var8 + var12, var9_int * (var11 + 1) / var10_int + (-2 - var12), param0 ^ -2147483616);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          ra.field_e.a(10, -10 + (-10 + (-4 + (-120 + t.field_d))), t.field_j - 360 >> 1, 256, 360);
          ih.field_g.a(0, 24, 0, 256, ra.field_e.field_K);
          kh.field_a.a(24, -24 + ra.field_e.field_nb, 0, 256, ra.field_e.field_K);
          kh.field_a.field_zb = op.a(8421504, param0 ^ 48, 11579568, kh.field_a.field_nb, 1, 3);
          oc.field_O.a(5, -2 + kh.field_a.field_nb - 10 - 24, 5, param0 + 224, kh.field_a.field_K - 10);
          hb.field_eb.a(-24 + kh.field_a.field_nb - 5, 24, (-80 + kh.field_a.field_K) / 2, 256, 80);
          mi.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "hn.V(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        int var1 = -88 / ((-1 - param0) / 35);
        field_e = null;
        field_b = null;
    }

    public final dj a(byte param0) {
        if (param0 < 57) {
          field_d = -88;
        }
        if (this.a(-22265)) {
          return wh.field_o;
        }
        if (!((350L + this.field_c) <= hm.a(64))) {
          return uo.field_b;
        }
        return this.a(true);
    }

    public final void b(int param0) {
        this.field_c = hm.a(64);
        if (param0 != 2048) {
          field_d = 74;
        }
    }

    public final String b(byte param0) {
        if (this.a(-22265)) {
          return null;
        }
        if (hm.a(64) < (350L + this.field_c)) {
          return null;
        }
        if (param0 != -7) {
          String var3 = (String) null;
          hn.a((byte) -36, (String[]) null, 126, (String) null);
        }
        return this.c(param0 + 6);
    }

    abstract String c(int param0);

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 0) {
          return true;
        }
        int var3 = bn.field_S != null ? 1 : 0;
        if (9 == ke.field_a &&
          cf.a(vi.field_F, up.field_h, um.field_o, hm.field_b, 500)) {
          if (hm.field_b != 2 &&
            var3 != 0) {
            return false;
          }
          return tg.a(um.field_o, vi.field_F, hm.field_b, param2 ^ -2, up.field_h);
        }
        if (ke.field_a == 10) {
          if (var3 != 0) {
            return false;
          }
          ak.c(true);
          return true;
        }
        if (11 == ke.field_a &&
          jo.field_r) {
          if (2 == kk.field_a &&
            !qp.a(true, ej.field_a, ck.field_g)) {
            return false;
          }
          if (kk.field_a != 2 &&
            var3 != 0) {
            return false;
          }
          if (!ma.a(true)) {
            return true;
          }
          String var4 = (String) null;
          dg.a(true, kk.field_a, ih.field_f, (String) null, ck.field_g, param1);
          return true;
        }
        return false;
    }

    static {
        field_d = 0;
    }
}
