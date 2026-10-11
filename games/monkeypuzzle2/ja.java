/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends ua implements u, ql {
    private jj field_z;
    private jg field_C;
    static te field_B;
    private t field_D;
    static boolean field_F;
    static int[][] field_A;

    private final String d(byte param0) {
        if (param0 <= 93) {
          field_A = (int[][]) null;
        }
        return "</col></u>";
    }

    final static rb a(String param0, int param1) {
        String var2 = null;
        rb var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_3_0 = null;
        rb stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (null == ah.field_b) {
            stackIn_3_0 = null;
            return (rb) (stackIn_3_0);
          }
          var7 = (CharSequence) ((Object) param0);
          var2 = pl.a((byte) 119, var7);
          if (var2 == null) {
            var2 = param0;
          }
          if (param1 != -1684349368) {
            var6 = (String) null;
            ja.a((String) null, -90);
          }
          var3 = (rb) (ah.field_b.a((long)var2.hashCode(), false));
          while (var3 != null) {
            var8 = (CharSequence) ((Object) var3.field_db);
            var4 = pl.a((byte) 108, var8);
            if (var4 == null) {
              var4 = var3.field_db;
            }
            if (var4.equals(var2)) {
              stackIn_17_0 = var3;
              return stackIn_17_0;
            }
            var3 = (rb) (ah.field_b.b(param1 + 1684349273));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("ja.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, int param1, jj param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        jj var7 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param0 == 0) {
            wc.a("terms.ws", false);
          } else {
            if (param0 != 1) {
              if (param0 == 2) {
                wc.a("conduct.ws", false);
              }
            } else {
              wc.a("privacy.ws", false);
            }
          }
          if (param1 != -21099) {
            var7 = (jj) null;
            this.a(-11, 111, (jj) null, -70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ja.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final String a(int param0) {
        if (param0 != 1971849544) {
          jj var3 = (jj) null;
          this.a(-97, -69, (jj) null, 108);
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        jj var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_D == param4) {
            ud.a(108);
            this.field_C.g((byte) -75);
          }
          if (param3 != 7) {
            var7 = (jj) null;
            this.a(-73, -74, (jj) null, -4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ja.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    ja(jg param0) {
        super(0, 0, 288, 0, (ml) null);
        String var7 = null;
        int var3 = 0;
        a var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_C = param0;
          this.field_D = new t(pi.field_i, (of) null);
          this.field_D.field_h = (ml) ((Object) new hd());
          var7 = gg.a(new String[]{this.a(1971849544), this.d((byte) 106)}, oi.field_i, true);
          var3 = 20;
          var4 = new a(t.field_z, 0, 0, 0, 0, 16777215, -1, 3, 0, t.field_z.field_C, -1, 2147483647, true);
          this.field_z = new jj(var7, var4);
          this.field_z.field_m = "";
          this.field_z.a(false, 0, kg.field_a);
          this.field_z.a(false, 1, kg.field_a);
          this.field_z.field_o = (of) (this);
          this.field_z.field_l = this.field_l - 40;
          this.field_z.c(26, var3, -40 + this.field_l, -1);
          var3 = var3 + (15 + this.field_z.field_p);
          this.b((byte) -41, this.field_z);
          var5 = 4;
          var6 = 200;
          this.field_D.a(40, 13361, -var6 + 300 >> 1, var6, var3);
          this.field_D.field_o = (of) (this);
          this.b((byte) -111, this.field_D);
          this.a(var3 - (-55 - var5), 13361, 0, 300, 0);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, -80)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_5_0 = this.a((byte) 109, param0);
            return stackIn_5_0;
          }
          if (param2 == 99) {
            stackIn_9_0 = this.b(param0, false);
            return stackIn_9_0;
          }
          var5_int = -4 % ((37 - param3) / 50);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ja.V(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, sj param5, int param6, int param7) {
        int stackIn_14_0 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        ed stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ed var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        sj var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var45 = param5;
          if (null != var45.field_N &&
            var45.field_D > 1) {
            var61 = var45.field_N;
            gg.a(cl.field_g, 0, var61, 0, 115);
          } else {
            bb.a(121);
          }
          var55 = new int[param5.field_r];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param5.field_r];
          var64 = gj.field_c;
          var63 = vd.field_a;
          var62 = rc.field_j;
          for (var13 = 0; var13 < param5.field_r; var13++) {
            var14 = var62[var13] * param1 + (param4 * var63[var13] + param7 * var64[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (0 <= var14) {
              if (var14 >= 128) {
                stackIn_14_0 = 256;
              } else {
                stackIn_14_0 = 128 + var14;
              }
            } else {
              stackIn_14_0 = 128;
            }
            var14Lifetime2 = stackIn_14_0;
            var15 = param0 * var62[var13] + param6 * var64[var13] + var63[var13] * param3 >> 8;
            stackIn_16_0 = r.field_a;
            if (var15 >= 0) {
              stackIn_17_1 = var15;
            } else {
              stackIn_17_1 = -var15;
            }
            var15Lifetime2 = stackIn_16_0[stackIn_17_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          if (param2 <= 15) {
            return;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (var44 < s.field_R) {
            var14Lifetime1 = dj.field_c[var44];
            var15Lifetime1 = param5.field_u[var14Lifetime1];
            var16 = param5.field_L[var14Lifetime1];
            var17 = param5.field_C[var14Lifetime1];
            if (gj.field_c.length > param5.field_d[var14Lifetime1]) {
              stackIn_25_0 = param5.field_d[var14Lifetime1];
            } else {
              stackIn_25_0 = -1;
            }
            var18 = stackIn_25_0;
            if (gj.field_c.length <= param5.field_n[var14Lifetime1]) {
              stackIn_28_0 = -1;
            } else {
              stackIn_28_0 = param5.field_n[var14Lifetime1];
            }
            var19 = stackIn_28_0;
            if (gj.field_c.length <= param5.field_A[var14Lifetime1]) {
              stackIn_31_0 = -1;
            } else {
              stackIn_31_0 = param5.field_A[var14Lifetime1];
            }
            var20 = stackIn_31_0;
            if (ri.field_c != null &&
              param5.field_c != null &&
              param5.field_c.length > var14Lifetime1 &&
              param5.field_c[var14Lifetime1] != -1 &&
              ri.field_c.length > param5.field_c[var14Lifetime1]) {
              stackIn_39_0 = ri.field_c[param5.field_c[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = bg.field_L[var15Lifetime1];
            var23 = sb.field_l[var15Lifetime1];
            var24 = bg.field_L[var16];
            var25 = sb.field_l[var16];
            var26 = bg.field_L[var17];
            var27 = sb.field_l[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 == null) {
                stackIn_49_0 = 8355711;
              } else {
                stackIn_49_0 = var21.field_e;
              }
              var30 = stackIn_49_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = var28 * var32 >>> 8 & -117375232 | -2097217281 & var28 * var31 >>> 8;
              var33 = var33 + 65793 * var29;
              ma.a(var26, var23, var25, var24, 4, var22, var27, (var33 & 16711422) >> 1);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 != null) {
                stackIn_45_0 = var21.field_e;
              } else {
                stackIn_45_0 = 8355711;
              }
              var34 = stackIn_45_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = (-16711821 & var28 * var35) >>> 8 | (var28 * var36 & 16711856) >>> 8;
              var38 = (var36 * var29 & 16711823) >>> 8 | -83951361 & var35 * var29 >>> 8;
              var37 = var37 + var31 * 65793;
              var39 = (-16711934 & var30 * var35) >>> 8 | (16711726 & var30 * var36) >>> 8;
              var38 = var38 + var32 * 65793;
              var39 = var39 + 65793 * var33;
              oi.a(var27, 255 & var38 >> 8, var25, 255 & var37 >> 8, (byte) 92, var23, var26, var39 & 255, var24, var22, 255 & var37, var39 >> 8 & 255, var38 >> 16, 255 & var38, var39 >> 16, var37 >> 16);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("ja.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          ja.b(false);
        }
        field_A = (int[][]) null;
        field_B = null;
    }

    final static void a(ug param0, ug param1, int param2) {
        if (param1.field_c != null) {
          param1.c(-19822);
        }
        if (param2 > -97) {
          return;
        }
        try {
          param1.field_c = param0.field_c;
          param1.field_d = param0;
          param1.field_c.field_d = param1;
          param1.field_d.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ja.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_B = new te(7, 0, 1, 1);
        field_F = false;
    }
}
