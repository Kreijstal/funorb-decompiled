/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends gf {
    static int[][] field_m;
    private boolean field_n;
    static int field_l;
    static int[] field_o;
    private String field_r;
    static int[] field_p;
    static java.awt.Frame field_q;

    public static void c(byte param0) {
        field_p = null;
        if (param0 > -111) {
          String var2 = (String) null;
          il.a((String) null, (la) null, (String) null, (byte) 10);
        }
        field_o = null;
        field_m = (int[][]) null;
        field_q = null;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        dn var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = fd.a(0, var5);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (param0 != -121) {
            this.field_r = (String) null;
          }
          if (!param1.equals(this.field_r)) {
            var4 = he.a(1, param1);
            if (var4 == null) {
              return null;
            }
            if (var4.field_e != null) {
              stackIn_11_0 = null;
              return (String) (stackIn_11_0);
            }
            this.field_n = var4.field_b;
            this.field_r = param1;
          }
          if (this.field_n) {
            return rk.field_d;
          }
          stackIn_16_0 = s.field_u;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("il.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void e(int param0) {
        this.field_r = null;
        if (param0 >= -38) {
          il.a((byte) 36, 103);
        }
    }

    final static void a(byte param0, int param1) {
        ip.field_c = hc.field_d[param1];
        if (param0 != 52) {
          String var3 = (String) null;
          il.a((String) null, (la) null, (String) null, (byte) -45);
        }
        Torquing.field_w = in.field_a[param1];
        md.field_b = oc.field_a[param1];
    }

    il(tk param0) {
        super(param0);
        this.field_n = false;
    }

    final static String a(String param0, la param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 17 % ((-22 - param3) / 48);
          if (!param1.a(-12749)) {
            stackIn_3_0 = (String) (param0);
            return stackIn_3_0;
          }
          stackIn_5_0 = param2 + " - " + param1.a((byte) -32) + "%";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("il.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void f(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        bm var4_ref_bm = null;
        int var5 = 0;
        wc var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        df var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Torquing.field_u;
        try {
          if (param0 != -30593) {
            field_l = -4;
          }
          var27 = kj.field_d;
          var2 = var27.i((byte) -101);
          if (0 == var2) {
            var3 = var27.i(7088);
            var4_ref_bm = (bm) (gl.field_d.b(0));
            while (var4_ref_bm != null) {
              if (var4_ref_bm.field_s != var3) {
                var4_ref_bm = (bm) (gl.field_d.f(-24059));
                continue;
              }
              break;
            }
            if (var4_ref_bm == null) {
              ih.b(true);
              return;
            }
            var5 = var27.i((byte) -101);
            if (var5 != 0) {
              var6_int = var4_ref_bm.field_q;
              cb.field_m[0].field_c = null;
              cb.field_m[0].field_e = false;
              cb.field_m[0].field_d = re.field_e;
              var7 = var4_ref_bm.field_o;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                cb.field_m[var8_int].field_d = var27.h((byte) 124);
                cb.field_m[var8_int].field_e = false;
                if (var27.i((byte) -101) != 1) {
                  cb.field_m[var8_int].field_c = null;
                } else {
                  cb.field_m[var8_int].field_c = var27.h((byte) 123);
                }
              }
              dupTemp$0 = new String[3][var6_int];
              var4_ref_bm.field_p = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6_int];
              dupTemp$1 = new long[3][var6_int];
              var4_ref_bm.field_m = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6_int * var7];
              var4_ref_bm.field_n = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.i((byte) -101);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var27.i((byte) -101);
                  var21 = cb.field_m[var20].field_d;
                  var22 = var27.b(67);
                  var24 = var27.field_n;
                  if (var19 < var6_int) {
                    var8[0][var12] = var21;
                    var9[0][var12] = cb.field_m[var20].field_c;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.c((byte) -33);
                    }
                  }
                  if (var21 != null &&
                    bn.a(var21, -17310)) {
                    var8[1][var13] = re.field_e;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var27.field_n = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.c((byte) -76);
                    }
                  }
                  if (var6_int > var14 &&
                    !cb.field_m[var20].field_e) {
                    cb.field_m[var20].field_e = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = cb.field_m[var20].field_c;
                    var10[2][var14] = var22;
                    var14++;
                    var27.field_n = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.c((byte) -55);
                    }
                  }
                }
              }
            }
            var4_ref_bm.field_k = true;
            var4_ref_bm.f(param0 ^ -30593);
            return;
          }
          if (1 == var2) {
            var3Lifetime1 = var27.i(param0 + 37681);
            var4 = var27.b(68);
            var6 = (wc) (so.field_t.b(0));
            while (var6 != null) {
              if (var3Lifetime1 != var6.field_q) {
                var6 = (wc) (so.field_t.f(param0 + 6534));
                continue;
              }
              break;
            }
            if (var6 == null) {
              ih.b(true);
              return;
            }
            var6.field_l = var4;
            var6.f(0);
            return;
          }
          nn.a("HS1: " + me.a(-1), (Throwable) null, param0 ^ 20837);
          ih.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "il.D(" + param0 + ')');
        }
    }

    final cd a(int param0, String param1) {
        dn var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        cd stackIn_3_0 = null;
        cd stackIn_6_0 = null;
        cd stackIn_13_0 = null;
        cd stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!va.a(-21369, var4)) {
            stackIn_3_0 = so.field_u;
            return stackIn_3_0;
          }
          if (param0 <= 62) {
            stackIn_6_0 = (cd) null;
            return stackIn_6_0;
          }
          if (!param1.equals(this.field_r)) {
            var3 = he.a(1, param1);
            if (var3 != null &&
              null == var3.field_e) {
              this.field_n = var3.field_b;
              this.field_r = param1;
            } else {
              stackIn_13_0 = gn.field_h;
              return stackIn_13_0;
            }
          }
          if (this.field_n) {
            stackIn_18_0 = so.field_s;
          } else {
            stackIn_18_0 = so.field_u;
          }
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("il.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_m = new int[][]{new int[]{1766, 1968, 0}, new int[]{1877, 0, 0}};
        field_l = -1;
        field_p = new int[3];
    }
}
