/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends ug {
    float[] field_f;
    float[] field_e;
    float[] field_i;
    static pj field_k;
    static int field_h;
    static le field_g;
    static kj field_j;

    final static void a(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int var4 = 0;
        float[] var5 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1_int = sb.field_r.field_C + sb.field_r.field_D;
          for (var2 = 0; 5 > var2; var2++) {
            fd.field_o[var2] = false;
            m.field_e[var2] = 272;
            th.field_o[var2] = 30 + (var1_int + (pl.field_e.field_D + pl.field_e.field_C) * pl.field_e.a(th.field_n[var2], -57 + m.field_e[var2]));
            if (th.field_o[var2] < 137) {
              th.field_o[var2] = 137;
            }
            sl.field_k[var2] = -(m.field_e[var2] / 2) + 320;
            si.field_v[var2] = 240 - th.field_o[var2] / 2;
            vh.field_E[var2] = new le(m.field_e[var2], th.field_o[var2]);
            vh.field_E[var2].e();
            lb.a(0, m.field_e[var2], (byte) -128, wc.field_e, 0, th.field_o[var2]);
            pl.field_e.a(th.field_n[var2], 57, 15, m.field_e[var2] - 72, th.field_o[var2] - 30, 1, -1, 0, 0, pl.field_e.field_C + pl.field_e.field_D);
            sb.field_r.b(lb.field_A, 57, th.field_o[var2] - 15, 1, 6579300);
            var3 = var2;
            if (0 != var3) {
              if (3 != var3) {
                if (var3 == 4) {
                  qi.field_K[1].d(15, 15, 32, 32);
                  qi.field_K[2].d(15, 47, 32, 32);
                  qi.field_K[3].d(15, 79, 32, 32);
                } else {
                  if (var3 == 1) {
                    ak.field_t[1].c(15, 15);
                    ak.field_t[2].c(15, 47);
                    tl.field_b.c(15, 79);
                  } else {
                    if (var3 == 2) {
                      ge.h(15, 15, 42, 106);
                      wc.field_h.c(15, 15);
                      hb.field_m[4][0].c(15, 47);
                      ak.field_t[4].c(15, 79);
                    }
                  }
                }
              } else {
                qi.field_K[0].d(15, 15, 32, 32);
                qi.field_K[0].d(15, 47, 32, 32);
                qi.field_K[0].d(15, 79, 32, 32);
              }
            } else {
              nh.field_f[0][0][0].c(15, 15);
              ak.field_t[0].c(15, 47);
              ak.field_t[0].c(15, 79);
            }
          }
          ac.field_a.a((byte) 118);
          if (param0 >= -78) {
            var5 = (float[]) null;
            wg.a((float[]) null, (byte) -105);
          }
          ck.field_b = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "wg.A(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1, ad param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -3) {
            field_g = (le) null;
          }
          var5 = param2.b(255, param1, param0);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          ol.a(var5, -83);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("wg.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static float a(float[] param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 113) {
            var3 = (CharSequence) null;
            wg.a(false, (CharSequence) null, 26);
          }
          stackIn_3_0 = param0[1] * param0[1] + param0[0] * param0[0];
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wg.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, java.applet.Applet param1, String param2, int param3, long param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          ad var8 = null;
          String var9 = null;
          String var10 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var9 = param1.getParameter("cookiehost");
              var7 = var9;
              var7Lifetime1 = var9;
              var10 = param0 + "=" + param2 + "; version=1; path=/; domain=" + var9;
              var7Lifetime2 = var10;
              var7Lifetime3 = var10;
              if (param4 >= 0L) {
                var7Lifetime4 = var10 + "; Expires=" + ha.a((byte) 126, 1000L * param4 + pf.a(0)) + "; Max-Age=" + param4;
              } else {
                var7Lifetime4 = var10 + "; Discard;";
              }
              mf.a(true, param1, "document.cookie=\"" + var7Lifetime4 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            if (param3 != -26372) {
              var8 = (ad) null;
              wg.a(-106, -61, (ad) null, -79);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("wg.D(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param2 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        jh.field_C.c((byte) 73, new lb());
        if (param0 != -1) {
          float[] var2 = (float[]) null;
          wg.a((float[]) null, (byte) -21);
        }
    }

    final void e(int param0) {
        float var2 = this.field_e[0];
        float var3 = this.field_e[1];
        wj.a(this.field_e, -110, vj.a(uh.a(this.field_f, 0.00009999999747378752f, (byte) 40), (byte) -2, ac.a(this.field_i, 117, this.field_e)));
        this.field_i[0] = var2;
        this.field_i[1] = var3;
        if (param0 >= -81) {
          field_h = 28;
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var4 = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var3 = pc.a((byte) -123, param0, param1);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          for (var4 = 0; param1.length() > var4; var4++) {
            if (!vb.a((byte) 110, param1.charAt(var4))) {
              stackIn_9_0 = kd.field_b;
              return stackIn_9_0;
            }
          }
          if (param2 == 17212) {
            return null;
          }
          stackIn_14_0 = (String) null;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("wg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(boolean param0, CharSequence param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param1.length();
          if (param0) {
            stackIn_3_0 = 16;
            return stackIn_3_0;
          }
          for (var5 = 0; var5 < var4; var5++) {
            if (param2 == param1.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_k = null;
        field_g = null;
        field_j = null;
    }

    wg(float param0, float param1) {
        this.field_e = new float[2];
        this.field_f = new float[2];
        this.field_i = new float[2];
        this.field_i[0] = param0;
        this.field_e[0] = param0;
        this.field_i[1] = param1;
        this.field_e[1] = param1;
    }

    static {
        field_k = new pj();
    }
}
