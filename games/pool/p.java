/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p implements eb {
    short field_o;
    static String field_k;
    short field_p;
    static String field_n;
    static String field_b;
    static int[] field_c;
    private nc field_j;
    short field_f;
    short field_h;
    short field_m;
    short field_a;
    static vh field_i;
    private byte field_e;
    int[] field_l;
    static String field_g;
    private byte field_d;

    public final int b(int[] param0, int param1) {
        RuntimeException var3 = null;
        int[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -27) {
            var4 = (int[]) null;
            this.b(121, (int[]) null);
          }
          stackIn_3_0 = param0[9] * (this.field_l[0] - param0[0]) + ((-param0[1] + this.field_l[1]) * param0[10] + param0[11] * (this.field_l[2] - param0[2]));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("p.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (null != sa.field_f &&
          sa.field_f.b((byte) -52, param0)) {
          sa.field_f = null;
        }
        int var2 = 20 / ((param1 + 42) / 48);
    }

    final static String a(int param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        char[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        char[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_23_2 = 0;
        int var5;
        char[] var6;
        String var7;
        char[] var8;
        char[] var9;
        int var5Lifetime1;
        int var5Lifetime2;
        var7 = new String(jk.field_k);
        if (param2 != 45) {
          return (String) null;
        }
        var5 = var7.indexOf("hh");
        var9 = var7.toCharArray();
        var8 = var9;
        var6 = var8;
        if (param3 > 100) {
          incrementValue$0 = var5;
          var5++;
          var6[incrementValue$0] = (char)58;
          incrementValue$1 = var5;
          var5++;
          var6[incrementValue$1] = (char)40;
        } else {
          incrementValue$2 = var5;
          var5++;
          stackIn_5_0 = var6;
          stackIn_5_1 = incrementValue$2;
          if (param3 < 0) {
            stackIn_6_2 = 45;
          } else {
            stackIn_6_2 = param3 / 10 + 48;
          }
          stackIn_5_0[stackIn_5_1] = (char)stackIn_6_2;
          incrementValue$3 = var5;
          var5++;
          stackIn_8_0 = var6;
          stackIn_8_1 = incrementValue$3;
          if (0 <= param3) {
            stackIn_9_2 = 48 + param3 % 10;
          } else {
            stackIn_9_2 = 45;
          }
          stackIn_8_0[stackIn_8_1] = (char)stackIn_9_2;
        }
        var5Lifetime1 = var7.indexOf("mm");
        incrementValue$4 = var5Lifetime1;
        var5Lifetime1++;
        stackIn_13_0 = var6;
        stackIn_13_1 = incrementValue$4;
        if (0 <= param0) {
          stackIn_14_2 = 48 + param0 / 10;
        } else {
          stackIn_14_2 = 45;
        }
        stackIn_13_0[stackIn_13_1] = (char)stackIn_14_2;
        incrementValue$5 = var5Lifetime1;
        var5Lifetime1++;
        stackIn_16_0 = var6;
        stackIn_16_1 = incrementValue$5;
        if (param0 >= 0) {
          stackIn_17_2 = param0 % 10 + 48;
        } else {
          stackIn_17_2 = 45;
        }
        stackIn_16_0[stackIn_16_1] = (char)stackIn_17_2;
        var5Lifetime2 = var7.indexOf("ss");
        incrementValue$6 = var5Lifetime2;
        var5Lifetime2++;
        stackIn_19_0 = var6;
        stackIn_19_1 = incrementValue$6;
        if (param1 < 0) {
          stackIn_20_2 = 45;
        } else {
          stackIn_20_2 = param1 / 10 + 48;
        }
        stackIn_19_0[stackIn_19_1] = (char)stackIn_20_2;
        incrementValue$7 = var5Lifetime2;
        var5Lifetime2++;
        stackIn_22_0 = var6;
        stackIn_22_1 = incrementValue$7;
        if (param1 >= 0) {
          stackIn_23_2 = 48 + param1 % 10;
        } else {
          stackIn_23_2 = 45;
        }
        stackIn_22_0[stackIn_22_1] = (char)stackIn_23_2;
        return new String(var9);
    }

    public final void a(int[] param0, int param1) {
        try {
          this.field_j.b(param0, this.field_l);
          if (param1 != -32215) {
            this.field_m = (short) -26;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "p.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_e = (byte)(-param1 > this.field_l[0] ? 1 : this.field_l[0] <= param1 ? 0 : -1);
        this.field_d = (byte)(this.field_l[1] < -param0 ? 1 : this.field_l[1] <= param0 ? 0 : -1);
        if (param2 > -71) {
          this.field_e = (byte) 71;
        }
    }

    final int b(int param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_l[0] - param1[0];
          var4 = -param1[1] + this.field_l[1];
          if (param0 != -13025) {
            stackIn_2_0 = 3;
            return stackIn_2_0;
          }
          var5 = this.field_l[2] - param1[2];
          stackIn_4_0 = var3_int * var3_int + (var4 * var4 + var5 * var5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("p.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int[] var3 = null;
        if (null == this.field_l) {
          this.field_l = pn.field_r;
        } else {
          if (this.field_l.length < 12) {
            var2 = 0;
            var3 = this.field_l;
            this.field_l = new int[12];
            while (var2 < var3.length) {
              this.field_l[var2] = var3[var2];
              var2++;
            }
            while (var2 < this.field_l.length) {
              this.field_l[var2] = pn.field_r[var2];
              var2++;
            }
          }
        }
        if (param0 < 118) {
          int[] var4 = (int[]) null;
          this.a(-115, (String) null, (int[]) null);
        }
    }

    final static java.net.URL a(byte param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        int var5 = 0;
        java.net.URL stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = 50 / ((param0 - 20) / 37);
          var3 = null;
          var4 = null;
          if (null != ar.field_g &&
            !ar.field_g.equals(param2.getParameter("settings"))) {
            var3 = ar.field_g;
            var4 = var3;
            var4 = var3;
          }
          if (null != om.field_y &&
            !om.field_y.equals(param2.getParameter("session"))) {
            var4 = om.field_y;
          }
          stackIn_7_0 = pr.a(-1, param1, (String) (var3), (byte) 63, (String) (var4));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("p.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) (stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(int param0, String param1, int[] param2) {
        float[] var5 = null;
        float[] var6 = null;
        try {
          var5 = new float[]{(float)(this.field_h + this.field_p) / 2.0f, (float)(this.field_m + this.field_a) / 2.0f, (float)(this.field_o + this.field_f) / 2.0f};
          var6 = var5;
          ag.a(param2, var6, 9);
          if (param0 <= 20) {
            this.a(-74, 99, 4);
          }
          sa.field_h.b(param1, (int)(0.5f + var5[0]), (int)(0.5f + var5[1]), 16764142, 1);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "p.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_k = null;
        field_c = null;
        if (param0 < 20) {
          field_c = (int[]) null;
        }
        field_n = null;
        field_g = null;
        field_i = null;
        field_b = null;
    }

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (1 > var3_int) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = hq.a(param1 ^ -12, param0);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!qd.a(0, var4.charAt(0)) &&
              !qd.a(0, var4.charAt(var4.length() - 1))) {
              var5 = 0;
              for (var6 = 0; var6 < param0.length(); var6++) {
                var7 = param0.charAt(var6);
                if (!qd.a(param1 + 113, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (param1 != -113) {
                field_n = (String) null;
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("p.G(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void c(int param0, int[] param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_j.a() << 1 > nc.field_Y.length) {
            this.a(6710886, param1);
            this.a(112, "Model too big - radixsize:" + (this.field_j.a() << 1) + " maxmodelsize:" + nc.field_Y.length, param1);
          } else {
            this.field_j.a(param1, this.field_l);
          }
          if (param0 != 6710886) {
            field_k = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("p.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, int[] param1) {
        RuntimeException var3 = null;
        int[] var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (int[]) null;
            this.a((int[]) null, 86);
          }
          stackIn_5_0 = !(0 >= this.field_e * (this.field_l[0] - param1[0]) + this.field_d * (-param1[1] + this.field_l[1]));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("p.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(int param0) {
        int var6 = 0;
        int var7 = 0;
        int var2;
        int var3;
        int var4;
        int[][] var5;
        short dupTemp$0 = (short)this.field_l[1];
        this.field_m = dupTemp$0;
        this.field_a = dupTemp$0;
        short dupTemp$1 = (short)this.field_l[2];
        this.field_f = dupTemp$1;
        this.field_o = dupTemp$1;
        short dupTemp$2 = (short)this.field_l[0];
        this.field_p = dupTemp$2;
        this.field_h = dupTemp$2;
        var5 = new int[][]{this.field_j.field_j, this.field_j.field_T, this.field_j.field_R};
        for (var6 = 0; this.field_j.field_P > var6; var6++) {
          if (null == this.field_j.field_J ||
            -2 != this.field_j.field_J[var6]) {
            for (var7 = 0; var7 < 3; var7++) {
              var2 = (this.field_l[5] * this.field_j.field_D[var5[var7][var6]] + this.field_l[4] * this.field_j.field_Q[var5[var7][var6]] + this.field_j.field_t[var5[var7][var6]] * this.field_l[3] >> 16) + this.field_l[0];
              var4 = this.field_l[2] + (this.field_l[11] * this.field_j.field_D[var5[var7][var6]] + (this.field_j.field_t[var5[var7][var6]] * this.field_l[9] + this.field_l[10] * this.field_j.field_Q[var5[var7][var6]]) >> 16);
              var3 = (this.field_l[8] * this.field_j.field_D[var5[var7][var6]] + (this.field_j.field_t[var5[var7][var6]] * this.field_l[6] + this.field_l[7] * this.field_j.field_Q[var5[var7][var6]]) >> 16) + this.field_l[1];
              if (var4 >= this.field_o) {
                if (this.field_f < var4) {
                  this.field_f = (short)var4;
                }
              } else {
                this.field_o = (short)var4;
              }
              if (this.field_h <= var2) {
                if (var2 > this.field_p) {
                  this.field_p = (short)var2;
                }
              } else {
                this.field_h = (short)var2;
              }
              if (var3 < this.field_a) {
                this.field_a = (short)var3;
              } else {
                if (var3 > this.field_m) {
                  this.field_m = (short)var3;
                }
              }
            }
          }
        }
        if (param0 != 16775) {
          this.field_p = (short) 97;
        }
    }

    private final void a(int param0, int[] param1) {
        try {
          bb.a((int) this.field_a, param1, (int) this.field_h, -28361, 6697779, (int) this.field_p, (int) this.field_a, (int) this.field_o, (int) this.field_o);
          bb.a((int) this.field_a, param1, (int) this.field_h, -28361, param0, (int) this.field_p, (int) this.field_a, (int) this.field_f, (int) this.field_f);
          bb.a((int) this.field_m, param1, (int) this.field_h, -28361, 6710886, (int) this.field_p, (int) this.field_m, (int) this.field_o, (int) this.field_o);
          bb.a((int) this.field_m, param1, (int) this.field_h, -28361, 6710886, (int) this.field_p, (int) this.field_m, (int) this.field_f, (int) this.field_f);
          bb.a((int) this.field_m, param1, (int) this.field_h, -28361, 3368499, (int) this.field_h, (int) this.field_a, (int) this.field_o, (int) this.field_o);
          bb.a((int) this.field_m, param1, (int) this.field_h, -28361, 6710886, (int) this.field_h, (int) this.field_a, (int) this.field_f, (int) this.field_f);
          bb.a((int) this.field_m, param1, (int) this.field_p, -28361, 6710886, (int) this.field_p, (int) this.field_a, (int) this.field_o, (int) this.field_o);
          bb.a((int) this.field_m, param1, (int) this.field_p, param0 - 6739247, 6710886, (int) this.field_p, (int) this.field_a, (int) this.field_f, (int) this.field_f);
          bb.a((int) this.field_a, param1, (int) this.field_h, -28361, 3355494, (int) this.field_h, (int) this.field_a, (int) this.field_o, (int) this.field_f);
          bb.a((int) this.field_m, param1, (int) this.field_h, param0 ^ -6686895, 6710886, (int) this.field_h, (int) this.field_m, (int) this.field_o, (int) this.field_f);
          bb.a((int) this.field_a, param1, (int) this.field_p, -28361, 6710886, (int) this.field_p, (int) this.field_a, (int) this.field_o, (int) this.field_f);
          bb.a((int) this.field_m, param1, (int) this.field_p, -28361, 6710886, (int) this.field_p, (int) this.field_m, (int) this.field_o, (int) this.field_f);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "p.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    p(nc param0, int[] param1) {
        this.field_l = new int[]{0, 0, 0};
        try {
          this.field_j = param0;
          this.field_l = param1;
          this.c(126);
          this.a(16775);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "p.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "<%0> is offering a rematch.";
        field_b = "Real-life threats";
        field_n = "Time: <%0>";
        field_g = "Invalid name";
    }
}
