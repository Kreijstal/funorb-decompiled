/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static cg field_c;
    static qc field_a;
    static String field_b;
    static pb field_f;
    static int field_g;
    static int[] field_e;
    static boolean field_d;

    final static bm a(String param0, String param1, pf param2, pf param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        bm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.b(param1, (byte) -118);
          var6 = param3.a(var5_int, param0, (byte) -11);
          if (param4 != 63) {
            field_a = (qc) null;
          }
          stackIn_3_0 = dd.a(var5_int, (byte) 115, param3, param2, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("eh.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0) {
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
        hk var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        nf var6_ref_nf = null;
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
        ha var28 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = stellarshard.field_B;
        try {
          var28 = ae.field_N;
          var2 = var28.f(4);
          if (param0 == ~var2) {
            var3 = var28.c((byte) 26);
            var4 = (hk) (id.field_g.b(-114));
            while (var4 != null) {
              if (var4.field_t != var3) {
                var4 = (hk) (id.field_g.b((byte) 80));
                continue;
              }
              break;
            }
            if (var4 == null) {
              oj.c(-2290);
              return;
            }
            var5 = var28.f(4);
            if (var5 != 0) {
              var6 = var4.field_q;
              hi.field_e[0].field_e = wf.field_b;
              hi.field_e[0].field_d = null;
              var7 = var4.field_r;
              hi.field_e[0].field_a = false;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                hi.field_e[var8_int].field_e = var28.e((byte) 115);
                hi.field_e[var8_int].field_a = false;
                if (1 != var28.f(4)) {
                  hi.field_e[var8_int].field_d = null;
                } else {
                  hi.field_e[var8_int].field_d = var28.e((byte) 117);
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_u = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_w = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_o = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.f(4);
              if (0 < var18) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var28.f(4);
                  var21 = hi.field_e[var20].field_e;
                  var22 = var28.d(~param0);
                  var24 = var28.field_k;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = hi.field_e[var20].field_d;
                    var10[0][var12] = var22;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.b(false);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    hk.a(param0 + 101, var21)) {
                    var8[1][var13] = wf.field_b;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var28.field_k = var24;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.b(false);
                    }
                  }
                  if (var14 < var6 &&
                    !hi.field_e[var20].field_a) {
                    hi.field_e[var20].field_a = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = hi.field_e[var20].field_d;
                    var10[2][var14] = var22;
                    var14++;
                    var28.field_k = var24;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.b(false);
                    }
                  }
                }
              }
            }
            var4.field_s = true;
            var4.c(20);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var28.c((byte) 83);
            var4_long = var28.d(0);
            var6_ref_nf = (nf) (wb.field_f.b(-89));
            while (var6_ref_nf != null) {
              if (var6_ref_nf.field_u != var3Lifetime1) {
                var6_ref_nf = (nf) (wb.field_f.b((byte) -22));
                continue;
              }
              break;
            }
            if (var6_ref_nf == null) {
              oj.c(-2290);
              return;
            }
            var6_ref_nf.field_k = var4_long;
            var6_ref_nf.c(20);
            return;
          }
          qe.a(-121, "HS1: " + bh.b((byte) -106), (Throwable) null);
          oj.c(param0 ^ 2289);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "eh.D(" + param0 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (param0 > 65535) {
            param0 = param0 >> 16;
            var2 += 16;
          }
          if (param0 > 255) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (param0 > 15) {
            param0 = param0 >> 4;
            var2 += 4;
          }
          if (3 < param0) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        if (param1 > -33) {
          eh.a((byte) -13);
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (param0 < -256) {
          var2Lifetime1 += 8;
          param0 = param0 >> 8;
        }
        if (param0 < -16) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (param0 < -4) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (param0 < -2) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_f = null;
        field_a = null;
        if (param0 != 5) {
          return;
        }
        field_b = null;
    }

    static {
        field_c = new cg();
        field_b = "Sound          ";
    }
}
