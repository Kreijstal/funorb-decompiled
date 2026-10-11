/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    int[] field_g;
    int field_q;
    int field_b;
    private byte[] field_n;
    int[] field_j;
    int[] field_i;
    private int[][] field_a;
    dl field_l;
    int[][] field_k;
    int[] field_c;
    byte[][] field_p;
    int[] field_d;
    private int[] field_r;
    static hl field_f;
    static int field_e;
    int field_m;
    static int field_h;
    dl[] field_s;
    private int field_o;

    public static void a(byte param0) {
        field_f = null;
        int var1 = -101 / ((param0 - 41) / 44);
    }

    private final void a(byte[] param0, int param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        rb var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = StarCannon.field_A;
        try {
          var17 = new rb(hc.a((byte) 51, param0));
          var4 = var17.j(7909);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_q = 0;
            } else {
              this.field_q = var17.f((byte) -84);
            }
            var5 = var17.j(7909);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 < 7) {
              this.field_o = var17.i(-1174051992);
            } else {
              this.field_o = var17.e(113);
            }
            stackIn_17_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            if (param1 >= -84) {
              ak.a((byte) -37);
            }
            this.field_g = new int[this.field_o];
            var9 = -1;
            if (7 > var4) {
              for (var10 = 0; this.field_o > var10; var10++) {
                dupTemp$0 = var8 + var17.i(-1174051992);
                var8 = dupTemp$0;
                this.field_g[var10] = dupTemp$0;
                if (var9 < this.field_g[var10]) {
                  var9 = this.field_g[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_o; var10++) {
                dupTemp$1 = var8 + var17.e(90);
                var8 = dupTemp$1;
                this.field_g[var10] = dupTemp$1;
                if (this.field_g[var10] > var9) {
                  var9 = this.field_g[var10];
                }
              }
            }
            this.field_m = var9 + 1;
            this.field_c = new int[this.field_m];
            this.field_d = new int[this.field_m];
            this.field_i = new int[this.field_m];
            if (var7 != 0) {
              this.field_p = new byte[this.field_m][];
            }
            this.field_k = new int[this.field_m][];
            this.field_j = new int[this.field_m];
            if (var6 != 0) {
              this.field_r = new int[this.field_m];
              for (var10Lifetime1 = 0; this.field_m > var10Lifetime1; var10Lifetime1++) {
                this.field_r[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_o > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_r[this.field_g[var10Lifetime1Lifetime1]] = var17.f((byte) -109);
              }
              this.field_l = new dl(this.field_r);
            }
            for (var10Lifetime2 = 0; this.field_o > var10Lifetime2; var10Lifetime2++) {
              this.field_c[this.field_g[var10Lifetime2]] = var17.f((byte) -107);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_o > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(64, (byte) 88, var21, 0);
                this.field_p[this.field_g[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_o; var10Lifetime4++) {
              this.field_d[this.field_g[var10Lifetime4]] = var17.f((byte) -115);
            }
            if (7 > var4) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_o; var10Lifetime5++) {
                this.field_i[this.field_g[var10Lifetime5]] = var17.i(-1174051992);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_o; var10Lifetime5++) {
                var11 = this.field_g[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_i[var11];
                array$2 = new int[var12];
                this.field_k[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.i(-1174051992);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_k[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_j[var11] = 1 + var13;
                if (var12 == var13 + 1) {
                  this.field_k[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_o; var10Lifetime5++) {
                this.field_i[this.field_g[var10Lifetime5]] = var17.e(-116);
              }
              for (var10Lifetime5 = 0; this.field_o > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_g[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_i[var11];
                var13 = -1;
                array$5 = new int[var12];
                this.field_k[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.e(74);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_k[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_j[var11] = 1 + var13;
                if (1 + var13 == var12) {
                  this.field_k[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_s = new dl[var9 + 1];
              this.field_a = new int[var9 + 1][];
              for (var10Lifetime6 = 0; this.field_o > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_g[var10Lifetime6];
                var12Lifetime1 = this.field_i[var11Lifetime1];
                array$8 = new int[this.field_j[var11Lifetime1]];
                this.field_a[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_j[var11Lifetime1]; var13Lifetime1++) {
                  this.field_a[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.field_k[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_k[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_a[var11Lifetime1][var14Lifetime1] = var17.f((byte) -108);
                }
                this.field_s[var11Lifetime1] = new dl(this.field_a[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("ak.C(");
          if (param0 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var9_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var20 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        ia var2 = null;
        int var3 = 0;
        int var4 = 0;
        vc var5 = null;
        long var5_long = 0L;
        int var6 = 0;
        int var7 = 0;
        re var7_ref_re = null;
        int var8 = 0;
        String[][] var9 = null;
        String[][] var10 = null;
        long[][] var11 = null;
        int[][] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        String var22 = null;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var4Lifetime1;
        int var26Lifetime1;
        int var26Lifetime2;
        var27 = StarCannon.field_A;
        try {
          var1_int = -2 % ((param0 + 38) / 55);
          var2 = se.field_p;
          var3 = var2.j(7909);
          if (var3 == 0) {
            var4 = var2.i(-1174051992);
            var5 = (vc) (ne.field_c.c(-3905));
            while (var5 != null) {
              if (var4 != var5.field_i) {
                var5 = (vc) (ne.field_c.a(-16913));
                continue;
              }
              break;
            }
            if (var5 == null) {
              ec.a((byte) 27);
              return;
            }
            var6 = var2.j(7909);
            if (var6 != 0) {
              var7 = var5.field_h;
              ok.field_rb[0].field_f = null;
              ok.field_rb[0].field_a = we.field_i;
              var8 = var5.field_l;
              ok.field_rb[0].field_e = false;
              for (var9_int = 1; var6 > var9_int; var9_int++) {
                ok.field_rb[var9_int].field_a = var2.a(-24);
                ok.field_rb[var9_int].field_e = false;
                if (1 != var2.j(7909)) {
                  ok.field_rb[var9_int].field_f = null;
                } else {
                  ok.field_rb[var9_int].field_f = var2.a(-33);
                }
              }
              dupTemp$0 = new String[3][var7];
              var5.field_n = dupTemp$0;
              var9 = dupTemp$0;
              var10 = new String[3][var7];
              dupTemp$1 = new long[3][var7];
              var5.field_g = dupTemp$1;
              var11 = dupTemp$1;
              dupTemp$2 = new int[3][var8 * var7];
              var5.field_o = dupTemp$2;
              var12 = dupTemp$2;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = 0;
              var19 = var2.j(7909);
              if (var19 > 0) {
                for (var20 = 0; var19 > var20; var20++) {
                  var21 = var2.j(7909);
                  var22 = ok.field_rb[var21].field_a;
                  var23 = var2.c((byte) 5);
                  var25 = var2.field_g;
                  if (var7 > var20) {
                    var9[0][var13] = var22;
                    var10[0][var13] = ok.field_rb[var21].field_f;
                    var11[0][var13] = var23;
                    var13++;
                    for (var26 = 0; var8 > var26; var26++) {
                      incrementValue$3 = var16;
                      var16++;
                      var12[0][incrementValue$3] = var2.f((byte) -101);
                    }
                  }
                  if (var22 != null &&
                    mc.a(var22, 0)) {
                    var9[1][var14] = we.field_i;
                    var10[1][var14] = null;
                    var11[1][var14] = var23;
                    var2.field_g = var25;
                    var14++;
                    for (var26Lifetime1 = 0; var8 > var26Lifetime1; var26Lifetime1++) {
                      incrementValue$4 = var17;
                      var17++;
                      var12[1][incrementValue$4] = var2.f((byte) -94);
                    }
                  }
                  if (var15 < var7 &&
                    !ok.field_rb[var21].field_e) {
                    ok.field_rb[var21].field_e = true;
                    var9[2][var15] = var22;
                    var10[2][var15] = ok.field_rb[var21].field_f;
                    var11[2][var15] = var23;
                    var15++;
                    var2.field_g = var25;
                    for (var26Lifetime2 = 0; var26Lifetime2 < var8; var26Lifetime2++) {
                      incrementValue$5 = var18;
                      var18++;
                      var12[2][incrementValue$5] = var2.f((byte) -99);
                    }
                  }
                }
              }
            }
            var5.field_j = true;
            var5.b(4);
            return;
          }
          if (var3 == 1) {
            var4Lifetime1 = var2.i(-1174051992);
            var5_long = var2.c((byte) 5);
            var7_ref_re = (re) (s.field_e.c(-3905));
            while (var7_ref_re != null) {
              if (var7_ref_re.field_g != var4Lifetime1) {
                var7_ref_re = (re) (s.field_e.a(-16913));
                continue;
              }
              break;
            }
            if (var7_ref_re == null) {
              ec.a((byte) 27);
              return;
            }
            var7_ref_re.field_k = var5_long;
            var7_ref_re.b(4);
            return;
          }
          hc.a((Throwable) null, "HS1: " + oe.a(-109), (byte) 70);
          ec.a((byte) 27);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "ak.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
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
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var41Lifetime1;
        int var37Lifetime2;
        int var37Lifetime3;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        int var41Lifetime2;
        var43 = StarCannon.field_A;
        try {
          if (param2 >= 0 &&
            param0 < gl.field_a) {
            if (param1 < 0 &&
              param13 < 0 &&
              param12 < 0) {
              return;
            }
            if (gl.field_f <= param1 &&
              gl.field_f <= param13 &&
              gl.field_f <= param12) {
              return;
            }
            var35 = 3 % ((2 - param5) / 40);
            var34 = param2 - param0;
            if (param0 == param4) {
              if (param2 == param0) {
                var18 = param13 << 16;
                var28 = 0;
                var29 = param8;
                var20 = 0;
                var24 = 0;
                var31 = 0;
                var17_int = param1 << 16;
                var26 = param10;
                var25 = param9;
                var23 = 0;
                var27 = 0;
                var30 = param7;
                var32 = 0;
                var19 = 0;
                var22 = param11;
                var21 = param15;
              } else {
                var36 = -param4 + param2;
                if (param1 >= param13) {
                  var21 = param11 << 16;
                  var22 = param15 << 16;
                  var30 = param8 << 16;
                  var19 = (-param13 + param12 << 16) / var36;
                  var23 = (param16 - param11 << 16) / var36;
                  var29 = param7 << 16;
                  var18 = param1 << 16;
                  var26 = param9 << 16;
                  var27 = (-param10 + param14 << 16) / var36;
                  var24 = (param16 - param15 << 16) / var34;
                  var28 = (-param9 + param14 << 16) / var34;
                  var17_int = param13 << 16;
                  var25 = param10 << 16;
                  var31 = (-param7 + param3 << 16) / var36;
                  var20 = (-param1 + param12 << 16) / var34;
                  var32 = (-param8 + param3 << 16) / var34;
                } else {
                  var23 = (-param15 + param16 << 16) / var34;
                  var28 = (-param10 + param14 << 16) / var36;
                  var30 = param7 << 16;
                  var24 = (param16 - param11 << 16) / var36;
                  var26 = param10 << 16;
                  var17_int = param1 << 16;
                  var25 = param9 << 16;
                  var29 = param8 << 16;
                  var19 = (param12 - param1 << 16) / var34;
                  var32 = (param3 - param7 << 16) / var36;
                  var18 = param13 << 16;
                  var22 = param11 << 16;
                  var27 = (param14 - param9 << 16) / var34;
                  var31 = (-param8 + param3 << 16) / var34;
                  var21 = param15 << 16;
                  var20 = (param12 - param13 << 16) / var36;
                }
              }
              var33 = 0;
              if (0 > param0) {
                param0 = Math.min(-param0, param4 - param0);
                var30 = var30 + var32 * param0;
                var18 = var18 + param0 * var20;
                var17_int = var17_int + var19 * param0;
                var22 = var22 + param0 * var24;
                var21 = var21 + var23 * param0;
                var26 = var26 + var28 * param0;
                var29 = var29 + param0 * var31;
                var25 = var25 + param0 * var27;
                param0 = 0;
              }
            } else {
              var18 = param1 << 16;
              var17_int = param1 << 16;
              var22 = param15 << 16;
              var21 = param15 << 16;
              var26 = param9 << 16;
              var25 = param9 << 16;
              var30 = param8 << 16;
              var29 = param8 << 16;
              var36 = -param0 + param4;
              var19 = (param13 - param1 << 16) / var36;
              var20 = (-param1 + param12 << 16) / var34;
              if (var19 >= var20) {
                var23 = (-param15 + param16 << 16) / var34;
                var33 = 1;
                var24 = (-param15 + param11 << 16) / var36;
                var32 = (-param8 + param7 << 16) / var36;
                var31 = (-param8 + param3 << 16) / var34;
                var37 = var19;
                var19 = var20;
                var20 = var37;
                var28 = (-param9 + param10 << 16) / var36;
                var27 = (-param9 + param14 << 16) / var34;
              } else {
                var32 = (-param8 + param3 << 16) / var34;
                var31 = (-param8 + param7 << 16) / var36;
                var27 = (-param9 + param10 << 16) / var36;
                var24 = (param16 - param15 << 16) / var34;
                var28 = (-param9 + param14 << 16) / var34;
                var23 = (param11 - param15 << 16) / var36;
                var33 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param0 < 0) {
                if (param4 < 0) {
                  param0 = param4 - param0;
                  var26 = var26 + var28 * param0;
                  var17_int = var17_int + var19 * param0;
                  var30 = var30 + param0 * var32;
                  var25 = var25 + var27 * param0;
                  var29 = var29 + var31 * param0;
                  var18 = var18 + var20 * param0;
                  var22 = var22 + param0 * var24;
                  var21 = var21 + var23 * param0;
                  param0 = param4;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param0 = -param0;
                  var17_int = var17_int + var19 * param0;
                  var18 = var18 + var20 * param0;
                  var21 = var21 + var23 * param0;
                  var26 = var26 + var28 * param0;
                  var25 = var25 + var27 * param0;
                  var22 = var22 + param0 * var24;
                  var29 = var29 + var31 * param0;
                  var30 = var30 + param0 * var32;
                  param0 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var37Lifetime2 = gl.field_c[param0];
                while (param0 < param4) {
                  var38 = var17_int >> 16;
                  if (gl.field_f > var38) {
                    var39 = -(var17_int >> 16) + (var18 >> 16);
                    if (var39 == 0) {
                      if (var38 >= 0 &&
                        var38 < gl.field_f) {
                        hb.a(0, var38 + var37Lifetime2, 0, var29, var25, 68, var39, param6, var21, 0);
                      }
                    } else {
                      var40 = (-var21 + var22) / var39;
                      var41 = (-var25 + var26) / var39;
                      var42 = (-var29 + var30) / var39;
                      if (gl.field_f <= var39 + var38) {
                        var39 = gl.field_f - var38 - 1;
                      }
                      if (var38 >= 0) {
                        hb.a(var42, var37Lifetime2 + var38, var40, var29, var25, -18, var39, param6, var21, var41);
                      } else {
                        hb.a(var42, var37Lifetime2, var40, var29 - var42 * var38, -(var38 * var41) + var25, -39, var38 + var39, param6, var21 - var38 * var40, var41);
                      }
                    }
                  }
                  param0++;
                  if (param0 >= gl.field_a) {
                    return;
                  }
                  var29 = var29 + var31;
                  var22 = var22 + var24;
                  var37Lifetime2 = var37Lifetime2 + ki.field_j;
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                  var30 = var30 + var32;
                  var26 = var26 + var28;
                  var17_int = var17_int + var19;
                  var18 = var18 + var20;
                }
              }
              var37Lifetime3 = -param4 + param2;
              if (var37Lifetime3 != 0) {
                var38Lifetime2 = param12 << 16;
                var39Lifetime2 = param16 << 16;
                var40Lifetime2 = param14 << 16;
                if (var33 == 0) {
                  var25 = param10 << 16;
                  var29 = param7 << 16;
                  var17_int = param13 << 16;
                  var21 = param11 << 16;
                } else {
                  var22 = param11 << 16;
                  var30 = param7 << 16;
                  var26 = param10 << 16;
                  var18 = param13 << 16;
                }
                var41Lifetime2 = param3 << 16;
                var24 = (var39Lifetime2 - var22) / var37Lifetime3;
                var28 = (-var26 + var40Lifetime2) / var37Lifetime3;
                var23 = (var39Lifetime2 - var21) / var37Lifetime3;
                var27 = (-var25 + var40Lifetime2) / var37Lifetime3;
                var19 = (-var17_int + var38Lifetime2) / var37Lifetime3;
                var32 = (var41Lifetime2 - var30) / var37Lifetime3;
                var20 = (var38Lifetime2 - var18) / var37Lifetime3;
                var31 = (var41Lifetime2 - var29) / var37Lifetime3;
              } else {
                var28 = 0;
                var23 = 0;
                var20 = 0;
                var31 = 0;
                var27 = 0;
                var32 = 0;
                var24 = 0;
                var19 = 0;
              }
            }
            if (0 > param0) {
              param0 = -param0;
              var22 = var22 + param0 * var24;
              var17_int = var17_int + param0 * var19;
              var26 = var26 + var28 * param0;
              var21 = var21 + var23 * param0;
              var25 = var25 + var27 * param0;
              var29 = var29 + var31 * param0;
              var30 = var30 + param0 * var32;
              var18 = var18 + var20 * param0;
              param0 = 0;
            }
            var36Lifetime1 = gl.field_c[param0];
            while (param0 < param2) {
              var37Lifetime1 = var17_int >> 16;
              if (gl.field_f > var37Lifetime1) {
                var38Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var38Lifetime1 == 0) {
                  if (var37Lifetime1 >= 0 &&
                    gl.field_f > var37Lifetime1) {
                    hb.a(0, var37Lifetime1 + var36Lifetime1, 0, var29, var25, 77, var38Lifetime1, param6, var21, 0);
                  }
                } else {
                  var39Lifetime1 = (var22 - var21) / var38Lifetime1;
                  var40Lifetime1 = (-var25 + var26) / var38Lifetime1;
                  var41Lifetime1 = (-var29 + var30) / var38Lifetime1;
                  if (var37Lifetime1 + var38Lifetime1 >= gl.field_f) {
                    var38Lifetime1 = gl.field_f - var37Lifetime1 - 1;
                  }
                  if (var37Lifetime1 >= 0) {
                    hb.a(var41Lifetime1, var36Lifetime1 + var37Lifetime1, var39Lifetime1, var29, var25, -22, var38Lifetime1, param6, var21, var40Lifetime1);
                  } else {
                    hb.a(var41Lifetime1, var36Lifetime1, var39Lifetime1, -(var37Lifetime1 * var41Lifetime1) + var29, var25 - var40Lifetime1 * var37Lifetime1, -58, var38Lifetime1 + var37Lifetime1, param6, -(var37Lifetime1 * var39Lifetime1) + var21, var40Lifetime1);
                  }
                }
              }
              param0++;
              if (param0 >= gl.field_a) {
                return;
              }
              var36Lifetime1 = var36Lifetime1 + ki.field_j;
              var21 = var21 + var23;
              var18 = var18 + var20;
              var26 = var26 + var28;
              var22 = var22 + var24;
              var25 = var25 + var27;
              var29 = var29 + var31;
              var30 = var30 + var32;
              var17_int = var17_int + var19;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_76_0 = var17;
          stackIn_76_1 = new StringBuilder().append("ak.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    ak(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_b = mg.a(param0.length, param0, (byte) -67);
          if (param1 != this.field_b) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_n = bd.a(param0.length, param0, (byte) 70, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_n[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, -111);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new hl(270, 70);
        field_h = 480;
    }
}
