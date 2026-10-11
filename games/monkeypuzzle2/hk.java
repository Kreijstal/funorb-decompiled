/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends ug {
    li field_g;
    int field_j;
    ug field_h;
    static byte[][] field_f;
    static int field_l;
    static ad field_k;
    static java.awt.Frame field_e;
    static le[] field_i;

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        int var34 = 0;
        int var35 = 0;
        int var42 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var33 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (0 <= param4 &&
            ig.field_a > param12) {
            if (param10 < 0 &&
              0 > param11 &&
              0 > param8) {
              return;
            }
            if (ig.field_c <= param10 &&
              param11 >= ig.field_c &&
              param8 >= ig.field_c) {
              return;
            }
            if (param16 != -972948528) {
              field_l = -2;
            }
            var34 = param4 - param12;
            if (param13 != param12) {
              var26 = param3 << 16;
              var25 = param3 << 16;
              var22 = param15 << 16;
              var21 = param15 << 16;
              var30 = param9 << 16;
              var29 = param9 << 16;
              var18 = param10 << 16;
              var17_int = param10 << 16;
              var35 = -param12 + param13;
              var20 = (param8 - param10 << 16) / var34;
              var19 = (param11 - param10 << 16) / var35;
              if (var20 <= var19) {
                var28 = (param0 - param3 << 16) / var35;
                var27 = (-param3 + param1 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var31 = (-param9 + param6 << 16) / var34;
                var23 = (-param15 + param14 << 16) / var34;
                var32 = (-param9 + param5 << 16) / var35;
                var24 = (param7 - param15 << 16) / var35;
                var33 = 1;
              } else {
                var23 = (param7 - param15 << 16) / var35;
                var24 = (param14 - param15 << 16) / var34;
                var31 = (-param9 + param5 << 16) / var35;
                var27 = (-param3 + param0 << 16) / var35;
                var33 = 0;
                var32 = (param6 - param9 << 16) / var34;
                var28 = (param1 - param3 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param12 < 0) {
                if (0 > param13) {
                  param12 = -param12 + param13;
                  var18 = var18 + var20 * param12;
                  var25 = var25 + param12 * var27;
                  var30 = var30 + var32 * param12;
                  var26 = var26 + param12 * var28;
                  var22 = var22 + var24 * param12;
                  var29 = var29 + param12 * var31;
                  var21 = var21 + param12 * var23;
                  var17_int = var17_int + var19 * param12;
                  param12 = param13;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param12 = -param12;
                  var30 = var30 + param12 * var32;
                  var26 = var26 + param12 * var28;
                  var21 = var21 + var23 * param12;
                  var17_int = var17_int + var19 * param12;
                  var22 = var22 + param12 * var24;
                  var29 = var29 + param12 * var31;
                  var25 = var25 + param12 * var27;
                  var18 = var18 + param12 * var20;
                  param12 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = ig.field_i[param12];
                while (param12 < param13) {
                  var37 = var17_int >> 16;
                  if (ig.field_c > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (0 != var38) {
                      var39 = (var22 - var21) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (var30 - var29) / var38;
                      if (var37 + var38 >= ig.field_c) {
                        var38 = -1 + ig.field_c - var37;
                      }
                      if (var37 < 0) {
                        nd.a(var36Lifetime2, var38 + var37, var41, param2, var39, -23487, var29 - var41 * var37, var40, -(var40 * var37) + var25, -(var39 * var37) + var21);
                      } else {
                        nd.a(var37 + var36Lifetime2, var38, var41, param2, var39, -23487, var29, var40, var25, var21);
                      }
                    } else {
                      if (0 <= var37 &&
                        var37 < ig.field_c) {
                        nd.a(var37 + var36Lifetime2, var38, 0, param2, 0, -23487, var29, 0, var25, var21);
                      }
                    }
                  }
                  param12++;
                  if (param12 >= ig.field_a) {
                    return;
                  }
                  var26 = var26 + var28;
                  var17_int = var17_int + var19;
                  var21 = var21 + var23;
                  var30 = var30 + var32;
                  var25 = var25 + var27;
                  var22 = var22 + var24;
                  var18 = var18 + var20;
                  var36Lifetime2 = var36Lifetime2 + ge.field_h;
                  var29 = var29 + var31;
                }
              }
              var36Lifetime3 = param4 - param13;
              if (var36Lifetime3 != 0) {
                var37Lifetime2 = param8 << 16;
                var38Lifetime2 = param14 << 16;
                var39Lifetime2 = param1 << 16;
                if (var33 == 0) {
                  var25 = param0 << 16;
                  var21 = param7 << 16;
                  var29 = param5 << 16;
                  var17_int = param11 << 16;
                } else {
                  var26 = param0 << 16;
                  var18 = param11 << 16;
                  var22 = param7 << 16;
                  var30 = param5 << 16;
                }
                var40Lifetime2 = param6 << 16;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
              } else {
                var31 = 0;
                var23 = 0;
                var24 = 0;
                var27 = 0;
                var28 = 0;
                var32 = 0;
                var19 = 0;
                var20 = 0;
              }
            } else {
              if (param12 == param4) {
                var31 = 0;
                var25 = param3;
                var17_int = param10 << 16;
                var19 = 0;
                var18 = param11 << 16;
                var27 = 0;
                var28 = 0;
                var20 = 0;
                var24 = 0;
                var26 = param0;
                var22 = param7;
                var21 = param15;
                var30 = param5;
                var29 = param9;
                var23 = 0;
                var32 = 0;
              } else {
                var35 = param4 - param13;
                if (param11 > param10) {
                  var31 = (-param9 + param6 << 16) / var34;
                  var17_int = param10 << 16;
                  var29 = param9 << 16;
                  var21 = param15 << 16;
                  var18 = param11 << 16;
                  var28 = (-param0 + param1 << 16) / var35;
                  var25 = param3 << 16;
                  var30 = param5 << 16;
                  var32 = (-param5 + param6 << 16) / var35;
                  var27 = (param1 - param3 << 16) / var34;
                  var24 = (param14 - param7 << 16) / var35;
                  var19 = (-param10 + param8 << 16) / var34;
                  var23 = (-param15 + param14 << 16) / var34;
                  var20 = (param8 - param11 << 16) / var35;
                  var26 = param0 << 16;
                  var22 = param7 << 16;
                } else {
                  var23 = (-param7 + param14 << 16) / var35;
                  var31 = (param6 - param5 << 16) / var35;
                  var17_int = param11 << 16;
                  var27 = (-param0 + param1 << 16) / var35;
                  var28 = (-param3 + param1 << 16) / var34;
                  var18 = param10 << 16;
                  var26 = param3 << 16;
                  var19 = (param8 - param11 << 16) / var35;
                  var20 = (param8 - param10 << 16) / var34;
                  var22 = param15 << 16;
                  var21 = param7 << 16;
                  var24 = (param14 - param15 << 16) / var34;
                  var30 = param9 << 16;
                  var29 = param5 << 16;
                  var25 = param0 << 16;
                  var32 = (param6 - param9 << 16) / var34;
                }
              }
              var33 = 0;
              if (param12 < 0) {
                param12 = Math.min(-param12, -param12 + param13);
                var18 = var18 + param12 * var20;
                var22 = var22 + var24 * param12;
                var26 = var26 + param12 * var28;
                var17_int = var17_int + param12 * var19;
                var29 = var29 + var31 * param12;
                var30 = var30 + var32 * param12;
                var25 = var25 + param12 * var27;
                var21 = var21 + param12 * var23;
                param12 = 0;
              }
            }
            if (param12 < 0) {
              param12 = -param12;
              var25 = var25 + param12 * var27;
              var26 = var26 + var28 * param12;
              var22 = var22 + var24 * param12;
              var21 = var21 + var23 * param12;
              var29 = var29 + param12 * var31;
              var30 = var30 + var32 * param12;
              var18 = var18 + var20 * param12;
              var17_int = var17_int + param12 * var19;
              param12 = 0;
            }
            var35Lifetime1 = ig.field_i[param12];
            while (param4 > param12) {
              var36Lifetime1 = var17_int >> 16;
              if (ig.field_c > var36Lifetime1) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 == 0) {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < ig.field_c) {
                    nd.a(var35Lifetime1 + var36Lifetime1, var37Lifetime1, 0, param2, 0, -23487, var29, 0, var25, var21);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (ig.field_c <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -1 + (ig.field_c - var36Lifetime1);
                  }
                  if (var36Lifetime1 < 0) {
                    nd.a(var35Lifetime1, var37Lifetime1 + var36Lifetime1, var40Lifetime1, param2, var38Lifetime1, param16 ^ 972971921, var29 - var36Lifetime1 * var40Lifetime1, var39Lifetime1, -(var39Lifetime1 * var36Lifetime1) + var25, var21 - var38Lifetime1 * var36Lifetime1);
                  } else {
                    nd.a(var35Lifetime1 + var36Lifetime1, var37Lifetime1, var40Lifetime1, param2, var38Lifetime1, -23487, var29, var39Lifetime1, var25, var21);
                  }
                }
              }
              param12++;
              if (ig.field_a <= param12) {
                return;
              }
              var29 = var29 + var31;
              var35Lifetime1 = var35Lifetime1 + ge.field_h;
              var26 = var26 + var28;
              var25 = var25 + var27;
              var21 = var21 + var23;
              var22 = var22 + var24;
              var18 = var18 + var20;
              var30 = var30 + var32;
              var17_int = var17_int + var19;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_75_0 = var17;
          stackIn_75_1 = new StringBuilder().append("hk.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var5_int = param3 + param0;
          var6 = param1 + param4;
          if (ge.field_a < param0) {
            stackIn_4_0 = param0;
          } else {
            stackIn_4_0 = ge.field_a;
          }
          var7 = stackIn_4_0;
          if (ge.field_f >= param1) {
            stackIn_7_0 = ge.field_f;
          } else {
            stackIn_7_0 = param1;
          }
          var8 = stackIn_7_0;
          if (ge.field_j > var5_int) {
            stackIn_10_0 = var5_int;
          } else {
            stackIn_10_0 = ge.field_j;
          }
          var9 = stackIn_10_0;
          if (var6 >= ge.field_k) {
            stackIn_13_0 = ge.field_k;
          } else {
            stackIn_13_0 = var6;
          }
          var10 = stackIn_13_0;
          if (ge.field_a <= param0 &&
            param0 < ge.field_j) {
            var11 = ge.field_h * var8 + param0;
            var12 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              ge.field_i[var11] = 16777215;
              var11 = var11 + ge.field_h * 2;
            }
          }
          if (param2 < 1) {
            return;
          }
          if (ge.field_f <= param1 &&
            ge.field_k > var6) {
            var11Lifetime1 = ge.field_h * param1 + var7;
            var12Lifetime1 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              ge.field_i[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= ge.field_a &&
            var5_int < ge.field_j) {
            var11Lifetime2 = ((1 & var5_int - param0) + var8) * ge.field_h + var5_int;
            var12Lifetime2 = -var8 + (1 + var10) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              ge.field_i[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + ge.field_h * 2;
            }
          }
          if (param1 >= ge.field_f &&
            ge.field_k > var6) {
            var11Lifetime3 = var7 + (var6 * ge.field_h + (1 & -param1 + var6));
            var12Lifetime3 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              ge.field_i[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var5), "hk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static ai[] a(byte param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        ai[] var1 = new ai[eg.field_c];
        if (param0 != 1) {
          return (ai[]) null;
        }
        for (var2 = 0; eg.field_c > var2; var2++) {
          var1[var2] = new ai(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], cb.field_b[var2], fk.field_d);
        }
        gb.a(-119);
        return var1;
    }

    public static void b(byte param0) {
        field_k = null;
        if (param0 != 85) {
          field_k = (ad) null;
        }
        field_i = null;
        field_f = (byte[][]) null;
        field_e = null;
    }

    final static void a(gk param0, md param1, int param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_39_0 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          StringBuilder stackIn_42_1 = null;
          String stackIn_43_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var7 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          i var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            var18 = new i();
            var18.field_e = param0.a((byte) 114);
            var18.field_l = param0.e(param2 ^ 80);
            var18.field_g = new int[var18.field_e];
            var18.field_k = new ic[var18.field_e];
            var18.field_f = new byte[var18.field_e][][];
            if (param2 != -1) {
              hk.a(-56, 123, -43, -34, -46);
            }
            var18.field_o = new int[var18.field_e];
            var18.field_q = new int[var18.field_e];
            var18.field_s = new ic[var18.field_e];
            for (var5 = 0; var5 < var18.field_e; var5++) {
              try {
                var6_int = param0.a((byte) 114);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  2 != var6_int) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param0.f(param2 + 0);
                    var21 = param0.f(-1);
                    var9 = param0.a((byte) 114);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param0.f(-1);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param0.e(126);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param0.a(var22[var12_int], var13, -127, 0);
                      }
                    }
                    var18.field_q[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = di.a(var10[var17], -112);
                      var17++;
                    }
                    var18.field_s[var5] = param1.a(102, var12, di.a(var20, -63), var21);
                    var18.field_f[var5] = var22;
                  }
                } else {
                  var15 = param0.f(param2 ^ 0);
                  var7 = var15;
                  var16 = param0.f(param2 ^ 0);
                  var8 = var16;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param0.e(param2 ^ -127);
                  }
                  var18.field_q[var5] = var6_int;
                  var18.field_g[var5] = var9;
                  var18.field_k[var5] = param1.a(false, di.a(var15, param2 - 64), var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_o[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_o[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_o[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_o[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_o[var5] = -5;
              }
            }
            ua.field_v.a(-8212, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_39_0 = var4;
            stackIn_39_1 = new StringBuilder().append("hk.C(");
            if (param0 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
            if (param1 == null) {
              stackIn_43_2 = "null";
            } else {
              stackIn_43_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    hk(li param0, ug param1) {
        try {
          this.field_g = param0;
          this.field_j = param0.f();
          this.field_h = param1;
          this.field_g.g(re.field_e * this.field_j / 256);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "hk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = -1;
        field_f = new byte[250][];
    }
}
