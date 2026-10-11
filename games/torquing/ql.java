/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends am {
    static ed field_u;
    static qd field_s;
    static boolean field_t;

    public static void b(int param0) {
        field_s = null;
        if (param0 != 16711935) {
          return;
        }
        field_u = null;
    }

    final int[][] a(int param0, int param1) {
        int var16 = 0;
        int[][] var3;
        int[] var7;
        int[] var8;
        int[] var9;
        int var17;
        int var18;
        int var19;
        int[][] var20;
        int[][] var21;
        int[][] var31;
        int[][] var50;
        int[][] var51;
        int[] var52;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var56;
        int[] var57;
        int[] var58;
        int[] var7Lifetime1;
        int[] var8Lifetime1;
        int[] var9Lifetime1;
        int[] var53Lifetime1;
        int[] var54Lifetime1;
        int[] var55Lifetime1;
        int[] var56Lifetime1;
        int[] var57Lifetime1;
        int[] var58Lifetime1;
        var19 = Torquing.field_u;
        var31 = this.field_r.a(15142, param1);
        var21 = var31;
        var20 = var21;
        var3 = var20;
        if (this.field_r.field_b) {
          var52 = this.b(0, 2, param1);
          var50 = this.c(24066, param1, 0);
          var51 = this.c(24066, param1, 1);
          var7 = var31[0];
          var8 = var31[1];
          var9 = var31[2];
          var53 = var50[0];
          var56 = var50[1];
          var57 = var50[2];
          var54 = var51[0];
          var55 = var51[1];
          var58 = var51[2];
          for (var16 = 0; ci.field_c > var16; var16++) {
            var17 = var52[var16];
            if (var17 == 4096) {
              var7Lifetime1 = var31[0];
              var8Lifetime1 = var31[1];
              var9Lifetime1 = var31[2];
              var53Lifetime1 = var50[0];
              var54Lifetime1 = var51[0];
              var55Lifetime1 = var51[1];
              var56Lifetime1 = var50[1];
              var57Lifetime1 = var50[2];
              var58Lifetime1 = var51[2];
              var7Lifetime1[var16] = var53Lifetime1[var16];
              var8Lifetime1[var16] = var56Lifetime1[var16];
              var9Lifetime1[var16] = var57Lifetime1[var16];
            } else {
              var7Lifetime1 = var31[0];
              var8Lifetime1 = var31[1];
              var9Lifetime1 = var31[2];
              var53Lifetime1 = var50[0];
              var54Lifetime1 = var51[0];
              var55Lifetime1 = var51[1];
              var56Lifetime1 = var50[1];
              var57Lifetime1 = var50[2];
              var58Lifetime1 = var51[2];
              if (0 == var17) {
                var7Lifetime1 = var31[0];
                var8Lifetime1 = var31[1];
                var9Lifetime1 = var31[2];
                var53Lifetime1 = var50[0];
                var54Lifetime1 = var51[0];
                var55Lifetime1 = var51[1];
                var56Lifetime1 = var50[1];
                var57Lifetime1 = var50[2];
                var58Lifetime1 = var51[2];
                var7Lifetime1[var16] = var54Lifetime1[var16];
                var8Lifetime1[var16] = var55Lifetime1[var16];
                var9Lifetime1[var16] = var58Lifetime1[var16];
              } else {
                var18 = -var17 + 4096;
                var7Lifetime1[var16] = var17 * var53Lifetime1[var16] + var18 * var54Lifetime1[var16] >> 12;
                var8Lifetime1[var16] = var18 * var55Lifetime1[var16] + var56Lifetime1[var16] * var17 >> 12;
                var9Lifetime1[var16] = var17 * var57Lifetime1[var16] + var58Lifetime1[var16] * var18 >> 12;
              }
            }
          }
        }
        if (param0 != -29116) {
          field_u = (ed) null;
        }
        return var3;
    }

    final void a(fj param0, int param1, int param2) {
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == 0) {
            stackIn_5_1 = (param0.i((byte) -101) == 1);
            this.field_p = stackIn_5_1;
          }
          if (param1 != 35) {
            field_u = (ed) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ql.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, uh param1, uh param2) {
        try {
          tb.field_l = param2;
          if (param0 != -1618866100) {
            field_u = (ed) null;
          }
          tb.field_l.b(Torquing.field_v);
          ti.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ql.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, t param2, int param3, int param4, byte param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = Torquing.field_u;
        try {
          var6_int = (param0 - param4 << 8) / param2.field_w;
          var7 = (param4 << 8) + var6_int * param2.field_v;
          param3 = param3 + param2.field_r;
          param1 = param1 + param2.field_v;
          var8 = param3 * ph.field_j + param1;
          var9 = 0;
          var10 = param2.field_t;
          var11 = param2.field_s;
          var12 = -var11 + ph.field_j;
          var13 = 0;
          if (ph.field_c > param3) {
            var14 = -param3 + ph.field_c;
            var10 = var10 - var14;
            var8 = var8 + var14 * ph.field_j;
            var9 = var9 + var14 * var11;
            param3 = ph.field_c;
          }
          if (param3 + var10 > ph.field_h) {
            var10 = var10 - (var10 + param3 - ph.field_h);
          }
          if (param1 < ph.field_k) {
            var14Lifetime1 = ph.field_k - param1;
            var11 = var11 - var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            param1 = ph.field_k;
            var9 = var9 + var14Lifetime1;
            var7 = var7 + var6_int * var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
          }
          if (param5 >= -43) {
            return;
          }
          if (param1 + var11 > ph.field_a) {
            var14Lifetime2 = var11 + param1 - ph.field_a;
            var12 = var12 + var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
          }
          if (var11 > 0 &&
            0 < var10) {
            for (param3 = -var10; 0 > param3; param3++) {
              var14Lifetime3 = var7;
              for (param1 = -var11; 0 > param1; param1++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = -var15 + 256;
                if (0 <= var15) {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param2.field_y[incrementValue$0];
                  if (var17 != 0) {
                    if (var15 <= 255) {
                      var18 = ph.field_e[var8];
                      var19 = 16711935 & var16 * (var18 & 16711935) + (var17 & 16711935) * var15 >> 8;
                      ph.field_e[var8] = var19 + (ie.a(var16 * ie.a(var18, 65280) + ie.a(65280, var17) * var15, 16711913) >> 8);
                    } else {
                      ph.field_e[var8] = var17;
                    }
                  }
                  var8++;
                } else {
                  var8++;
                  var9++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("ql.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public ql() {
        super(3, false);
    }

    final int[] a(byte param0, int param1) {
        int var7 = 0;
        int[] var3;
        int var8;
        int var9;
        int[] var13;
        int[] var14;
        int[] var15;
        var9 = Torquing.field_u;
        var3 = this.field_l.a(param1, 25657);
        if (param0 <= 86) {
          field_t = false;
        }
        if (this.field_l.field_b) {
          var14 = this.b(0, 0, param1);
          var15 = this.b(0, 1, param1);
          var13 = this.b(0, 2, param1);
          for (var7 = 0; var7 < ci.field_c; var7++) {
            var8 = var13[var7];
            if (var8 != 4096) {
              if (var8 != 0) {
                var3[var7] = var14[var7] * var8 + (4096 - var8) * var15[var7] >> 12;
              } else {
                var3[var7] = var15[var7];
              }
            } else {
              var3[var7] = var14[var7];
            }
          }
        }
        return var3;
    }

    static {
        field_u = new ed();
        field_s = new qd();
    }
}
