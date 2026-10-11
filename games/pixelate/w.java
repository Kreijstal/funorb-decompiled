/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends uc {
    static pm field_v;
    static wm field_w;
    static String field_t;
    static int field_s;
    private lf field_x;
    static il field_y;
    static int[][] field_z;
    private lf[] field_r;
    static String field_u;
    static int field_q;

    w(w param0, boolean param1) {
        this();
        try {
          param0.a(this, true, param1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final lf a(int param0, int param1) {
        if (param1 != 7177) {
          w var4 = (w) null;
          this.a((w) null, true, true);
        }
        lf dupTemp$0 = new lf();
        this.field_r[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final static void a(byte param0, eq param1) {
        eq var2 = null;
        int var3 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          param1.c(2779);
          if (param0 != -48) {
            return;
          }
          var2 = (eq) (nk.field_a.c(1504642273));
          while (var2 != null) {
            if (var2.a((byte) 110, param1)) {
              var2 = (eq) (nk.field_a.f(1504642273));
              continue;
            }
            break;
          }
          if (var2 == null) {
            nk.field_a.a(22125, param1);
          } else {
            stackIn_9_0 = -4;
            jj.$cfr$intArgs$a$2d0b7bdf67eb(stackIn_9_0, var2, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("w.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_t = null;
        int var1 = 43 % ((param0 - 8) / 48);
        field_u = null;
        field_v = null;
        field_y = null;
        field_z = (int[][]) null;
        field_w = null;
    }

    public w() {
        this.field_r = new lf[6];
        this.field_x = new lf();
        lf dupTemp$0 = new lf();
        this.field_r[0] = dupTemp$0;
        lf var1 = dupTemp$0;
        var1.a(true);
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        ng stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        lf var7 = null;
        lf var9 = null;
        eq var10 = null;
        qm var11 = null;
        lf var12 = null;
        lf var13 = null;
        lf var14 = null;
        lf var15 = null;
        try {
          if (param0 instanceof qm) {
            stackIn_3_0 = (ng) (param0);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (qm) (stackIn_3_0);
          if (param1 != -124) {
            var10 = (eq) null;
            w.a((byte) 95, (eq) null);
          }
          hp.a(param3 + param0.field_z, param0.field_p + param2 + param0.field_C, param0.field_E + param0.field_z + param3, (byte) -120, param0.field_p + param2);
          if (var11 != null) {
            param4 = param4 & var11.field_H;
          }
          var7 = this.field_r[0];
          this.field_x.a(true);
          var7.a(this.field_x, param3, this, (byte) 62, param2, param0);
          if (var11 != null) {
            if (var11.field_M) {
              var12 = this.field_r[1];
              if (var12 != null) {
                var12.a(this.field_x, param3, this, (byte) 71, param2, param0);
              }
            }
            if (var11.field_D) {
              var13 = this.field_r[3];
              if (0 != var11.field_k &&
                var13 != null) {
                var13.a(this.field_x, param3, this, (byte) -100, param2, param0);
              } else {
                var9 = this.field_r[2];
                if (var9 != null) {
                  var9.a(this.field_x, param3, this, (byte) -101, param2, param0);
                }
              }
            }
          }
          if (param0.b(true)) {
            var14 = this.field_r[5];
            if (var14 != null) {
              var14.a(this.field_x, param3, this, (byte) -67, param2, param0);
            }
          }
          if (!param4) {
            var15 = this.field_r[4];
            if (var15 != null) {
              var15.a(this.field_x, param3, this, (byte) -118, param2, param0);
            }
          }
          this.field_x.a(param2, param3, param0, (byte) 122, this);
          ia.a((byte) 92);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("w.A(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          var4_int = param0.length();
          var5 = param3.length();
          if (param1 >= -35) {
            field_w = (wm) null;
          }
          var6 = param2.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = var6 - var5;
          if (var8 != 0) {
            var9_int = 0;
            while (true) {
              var9_int = param0.indexOf(param3, var9_int);
              if (0 > var9_int) {
                break;
              }
              var9_int = var9_int + var5;
              var7 = var7 + var8;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param0.indexOf(param3, var10);
            if (var11 < 0) {
              discarded$2 = var9.append(param0.substring(var10));
              stackIn_15_0 = var9.toString();
              return stackIn_15_0;
            }
            discarded$0 = var9.append(param0.substring(var10, var11));
            var10 = var11 + var5;
            discarded$1 = var9.append(param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("w.J(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, ae param2, int param3, ae param4, ae param5, ae param6, int param7, byte param8, int param9) {
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        int var19Lifetime1;
        var20 = Pixelate.field_H ? 1 : 0;
        try {
          var10_int = param7 + (param0 * param2.field_h >> 16);
          var11 = (param2.field_g * param0 >> 16) + param9;
          var12 = param7 + (param6.field_h * param0 >> 16);
          var13 = (param0 * param6.field_g >> 16) + param9;
          var14 = param7 + (param0 * param5.field_h >> 16);
          var15 = (param5.field_g * param0 >> 16) + param9;
          var16 = param7 + (param0 * param4.field_h >> 16);
          var17 = param9 + (param4.field_g * param0 >> 16);
          if (param8 > -27) {
            return;
          }
          var18 = new int[]{var10_int, var11, var12, var13, var14, var15, var16, var17};
          ta.a(var18, 12632256);
          for (var19 = 0; var19 <= param1; var19++) {
            el.a((var17 - var11) * var19 / param1 + var11, var19 * (var14 - var12) / param1 + var12, 8421504, -20, var10_int + (-var10_int + var16) * var19 / param1, (-var13 + var15) * var19 / param1 + var13, 3.0f);
          }
          for (var19Lifetime1 = 0; param3 >= var19Lifetime1; var19Lifetime1++) {
            el.a(var11 + var19Lifetime1 * (var13 - var11) / param3, var19Lifetime1 * (var14 - var16) / param3 + var16, 8421504, -79, (-var10_int + var12) * var19Lifetime1 / param3 + var10_int, var19Lifetime1 * (var15 - var17) / param3 + var17, 3.0f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("w.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param6 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final void a(int param0, int param1, tf[] param2) {
        int var4_int = 0;
        try {
          if (param0 <= 88) {
            eq var5 = (eq) null;
            w.a((byte) 34, (eq) null);
          }
          var4_int = param1;
          if (this.field_r[var4_int] == null) {
            this.field_r[var4_int] = new lf();
          }
          this.field_r[param1].field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "w.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(w param0, boolean param1, boolean param2) {
        int var4_int = 0;
        lf dupTemp$0 = null;
        lf stackIn_10_0 = null;
        lf stackIn_11_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        lf var5 = null;
        lf var6 = null;
        int var7 = 0;
        ae var8 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (!param1) {
            var8 = (ae) null;
            w.a(-78, 30, (ae) null, 86, (ae) null, (ae) null, (ae) null, -17, (byte) 54, -98);
          }
          super.a(param0, (byte) 126);
          if (param2) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_r[var4_int];
              if (var5 == null) {
                param0.field_r[var4_int] = null;
              } else {
                var6 = param0.field_r[var4_int];
                stackIn_10_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new lf();
                  param0.field_r[var4_int] = dupTemp$0;
                  stackIn_11_1 = dupTemp$0;
                } else {
                  stackIn_11_1 = var6;
                }
                ((lf) (Object) stackIn_10_0).a(stackIn_11_1, (byte) 89);
              }
            }
            return;
          }
          qb.a(this.field_r, 0, param0.field_r, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("w.I(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, tf[] param1) {
        int var4 = 0;
        lf[] var3 = null;
        lf var5 = null;
        int var6 = 0;
        lf[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var7 = this.field_r;
          var3 = var7;
          for (var4 = param0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_k = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("w.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, tf param1) {
        lf[] var7 = null;
        int var4 = 0;
        lf var5_ref_lf = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        try {
          var7 = this.field_r;
          lf[] var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5_ref_lf = var7[var4];
            if (var5_ref_lf != null) {
              var5_ref_lf.field_j = param1;
            }
          }
          int var5 = -110 / ((-69 - param0) / 40);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "w.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = "Unrated game";
        field_u = "Seriously offensive language";
        field_w = new wm(2, 4, 4, 0);
    }
}
