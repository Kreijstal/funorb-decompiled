/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends gd {
    private nk field_m;
    static int[] field_i;
    static long field_l;
    static float[] field_k;
    static int field_j;

    final static void a(ei param0, vj param1, int param2, int param3, int param4, vj param5, int param6, ei param7) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        float var10 = 0.0f;
        int var10_int = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        lb var14 = null;
        lb var15 = null;
        Object var16 = null;
        Object var17 = null;
        gj var17_ref = null;
        Object var18 = null;
        gj var18_ref = null;
        Object var19 = null;
        gj var19_ref = null;
        lb var20 = null;
        var18 = null;
        var17 = null;
        var19 = null;
        var16 = null;
        var13 = HoldTheLine.field_D;
        try {
          if (param1.field_k - param5.field_k <= 1 &&
            param1.field_k - param5.field_k >= -1) {
            if (param1 instanceof lb) {
              var15 = (lb) (param1);
              if (param5 instanceof lb) {
                var20 = (lb) (param5);
                if (th.a(-1, var15, var20)) {
                  var10 = mm.field_d + (float)param4;
                  var11 = (float)param6 + lk.field_b;
                  oe.a(var11, param2, param7, (byte) 63, var10, param0);
                }
              } else {
                var19_ref = (gj) (param5);
                var10_int = ba.a(var15, 0, var19_ref);
                if (var10_int >= 1) {
                  var11 = (float)param4 + mm.field_d;
                  var12 = (float)param6 + var19_ref.b(lk.field_b, param3 ^ 7518);
                  oe.a(var12, param2, param7, (byte) 113, var11, param0);
                }
                if (var10_int == 2) {
                  var11 = rb.field_g + (float)param4;
                  var12 = var19_ref.b(cj.field_G, -7517) + (float)param6;
                  oe.a(var12, param2, param7, (byte) 127, var11, param0);
                }
              }
            } else {
              var18_ref = (gj) (param1);
              if (param5 instanceof lb) {
                var14 = (lb) (param5);
                var10_int = ba.a(var14, 0, var18_ref);
                if (var10_int >= 1) {
                  var11 = (float)param4 + var18_ref.b(lk.field_b, -7517);
                  var12 = mm.field_d + (float)param6;
                  oe.a(var12, param2, param7, (byte) 62, var11, param0);
                }
                if (var10_int == 2) {
                  var11 = var18_ref.b(cj.field_G, -7517) + (float)param4;
                  var12 = rb.field_g + (float)param6;
                  oe.a(var12, param2, param7, (byte) 78, var11, param0);
                }
              } else {
                var17_ref = (gj) (param5);
                var10_int = i.a(var17_ref, var18_ref, -6218);
                if (var10_int >= 1) {
                  var11 = var18_ref.b(mm.field_d, -7517) + (float)param4;
                  var12 = var17_ref.b(lk.field_b, param3 ^ 7518) + (float)param6;
                  oe.a(var12, param2, param7, (byte) 110, var11, param0);
                }
                if (var10_int == 2) {
                  var11 = (float)param4 + var18_ref.b(rb.field_g, param3 ^ 7518);
                  var12 = (float)param6 + var17_ref.b(cj.field_G, param3 ^ 7518);
                  oe.a(var12, param2, param7, (byte) 91, var11, param0);
                }
              }
            }
            if (param3 != -3) {
              field_i = (int[]) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_30_0 = var8;
          stackIn_30_1 = new StringBuilder().append("qf.BA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    qf(nk param0, nk param1) {
        super(param0);
        try {
          this.field_m = param1;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        if (!pj.b((byte) 80)) {
          wm.a(param3, false, param0);
          return;
        }
        ej.field_b = param0;
        if (ej.field_b == dg.field_c) {
          return;
        }
        lm.field_a = dg.field_c;
        if (param2 != 3865) {
          field_j = 35;
          if (dg.field_c != 13) {
            if (dg.field_c != -1) {
              ((ti) (l.field_a[dg.field_c])).i(param2 ^ 3923);
            }
            vg.field_G = 1;
            gg.field_L = param1 ? true : false;
            return;
          }
          ((ec) (l.field_a[dg.field_c])).d((byte) -126);
          vg.field_G = 1;
          gg.field_L = param1 ? true : false;
          return;
        }
        if (dg.field_c == 13) {
          ((ec) (l.field_a[dg.field_c])).d((byte) -126);
          vg.field_G = 1;
          gg.field_L = param1 ? true : false;
          return;
        }
        if (dg.field_c == -1) {
          vg.field_G = 1;
          gg.field_L = param1 ? true : false;
          return;
        }
        ((ti) (l.field_a[dg.field_c])).i(param2 ^ 3923);
        vg.field_G = 1;
        gg.field_L = param1 ? true : false;
    }

    final static void a(int param0, int param1, byte[] param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5Lifetime1;
        var6 = HoldTheLine.field_D;
        try {
          var3_int = 256;
          var4 = new int[256];
          for (var5 = 0; var5 < 256; var5++) {
            incrementValue$1 = var3_int;
            var3_int++;
            var4[var5] = pk.a((int) param2[incrementValue$1], 255);
          }
          var3_int += 256;
          var7 = param0;
          var5Lifetime1 = var7;
          while (var7 < 256) {
            param2[var3_int] = (byte)(param2[var3_int] - param1);
            var3_int = var3_int + var4[var7];
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qf.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final fd a(String param0, byte param1) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        fd stackIn_8_0 = null;
        fd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 52) {
            field_k = (float[]) null;
          }
          if (this.field_m instanceof wk) {
            var3 = ((wk) ((Object) this.field_m)).a(1);
            if (var3 != null &&
              var3.b(-7447) != tg.field_d) {
              stackIn_8_0 = g.field_k;
              return stackIn_8_0;
            }
          }
          if (!param0.equals(this.field_m.field_q)) {
            stackIn_12_0 = g.field_k;
          } else {
            stackIn_12_0 = tg.field_d;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("qf.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        ja.a(-1848651292, en.a(95));
        if (!param0) {
          qf.g(33);
        }
    }

    public static void g(int param0) {
        field_k = null;
        if (param0 != -14) {
          return;
        }
        field_i = null;
    }

    final static ui a(int param0, el param1) {
        RuntimeException var2 = null;
        ui stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 293) {
            field_i = (int[]) null;
          }
          stackIn_3_0 = lg.a(db.a(param1, 100, 96), (byte) -68);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qf.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, ee param1, ee param2) {
        boolean stackIn_19_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_27_0 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param1.field_z) {
            return false;
          }
          if (!param2.field_z) {
            return false;
          }
          if (param0 >= -60) {
            return false;
          }
          if (param1.field_q - param2.field_q <= 1 &&
            param1.field_q - param2.field_q >= -1) {
            if ((param2.field_A.field_f - param1.field_A.field_f) * (param2.field_A.field_f - param1.field_A.field_f) + (-param1.field_A.field_h + param2.field_A.field_h) * (-param1.field_A.field_h + param2.field_A.field_h) > (param2.field_B + param1.field_B) * (param2.field_B + param1.field_B)) {
              return false;
            }
            if (param1.field_p &&
              param2.field_p) {
              stackIn_19_0 = jf.a(param1.field_w, param1.field_A, param2.field_i, param1.field_k, param2.field_w, param2.field_k, param1.field_i, param2.field_A, 7527);
              return stackIn_19_0;
            }
            if (param1.field_p) {
              stackIn_27_0 = ck.a(param2.field_B, true, param1.field_i, param2.field_A, param1.field_A, param1.field_k, param1.field_w);
              return stackIn_27_0;
            }
            if (!param2.field_p) {
              return true;
            }
            stackIn_23_0 = ca.a(param1.field_A, param2.field_i, param2.field_A, param1.field_B, param2.field_w, param2.field_k, 110);
            return stackIn_23_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("qf.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final String a(String param0, boolean param1) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m instanceof wk) {
            var3 = ((wk) ((Object) this.field_m)).a(1);
            if (var3 != null) {
              if (var3.b(-7447) == tg.field_d &&
                !param0.equals(this.field_m.field_q)) {
                stackIn_6_0 = jd.field_L;
                return stackIn_6_0;
              }
              stackIn_8_0 = var3.b((byte) -59);
              return stackIn_8_0;
            }
          }
          if (!param0.equals(this.field_m.field_q)) {
            stackIn_12_0 = jd.field_L;
            return stackIn_12_0;
          }
          if (param1) {
            return null;
          }
          field_l = 24L;
          stackIn_16_0 = null;
          return (String) (stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("qf.L(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_k = new float[]{1.5f, 1.25f, 1.0f};
    }
}
