/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends da {
    int field_B;
    int field_t;
    int field_J;
    int field_i;
    static int[] field_s;
    int field_u;
    nc field_K;
    int field_F;
    fb field_q;
    int field_w;
    static java.awt.Color field_l;
    int field_p;
    static eg field_H;
    fe field_k;
    int field_y;
    int field_m;
    int field_G;
    int field_o;
    int field_D;
    int field_z;
    int field_v;
    static int[] field_n;
    int field_A;
    ab field_I;
    int field_x;
    static boolean[][] field_r;
    static ka field_j;
    static int[][] field_C;
    static String field_E;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int[] param12, int param13, int param14, int param15, int param16) {
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
        int var42 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
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
        var42 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param15 >= 0 &&
            oc.field_e > param7) {
            if (param1 < 0 &&
              param5 < 0 &&
              0 > param4) {
              return;
            }
            if (oc.field_d <= param1 &&
              oc.field_d <= param5 &&
              oc.field_d <= param4) {
              return;
            }
            if (param13 != 1047574608) {
              return;
            }
            var34 = param15 - param7;
            if (param14 != param7) {
              var18 = param1 << 16;
              var17_int = param1 << 16;
              var30 = param2 << 16;
              var29 = param2 << 16;
              var22 = param8 << 16;
              var21 = param8 << 16;
              var26 = param0 << 16;
              var25 = param0 << 16;
              var35 = param14 - param7;
              var20 = (param4 - param1 << 16) / var34;
              var19 = (-param1 + param5 << 16) / var35;
              if (var19 < var20) {
                var32 = (-param2 + param3 << 16) / var34;
                var28 = (param10 - param0 << 16) / var34;
                var24 = (param6 - param8 << 16) / var34;
                var31 = (-param2 + param16 << 16) / var35;
                var27 = (param11 - param0 << 16) / var35;
                var33 = 0;
                var23 = (-param8 + param9 << 16) / var35;
              } else {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var31 = (-param2 + param3 << 16) / var34;
                var23 = (param6 - param8 << 16) / var34;
                var28 = (param11 - param0 << 16) / var35;
                var24 = (-param8 + param9 << 16) / var35;
                var27 = (param10 - param0 << 16) / var34;
                var32 = (-param2 + param16 << 16) / var35;
                var33 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param7 < 0) {
                if (param14 < 0) {
                  param7 = param14 - param7;
                  var29 = var29 + param7 * var31;
                  var18 = var18 + param7 * var20;
                  var17_int = var17_int + param7 * var19;
                  var25 = var25 + param7 * var27;
                  var22 = var22 + var24 * param7;
                  var21 = var21 + var23 * param7;
                  var26 = var26 + var28 * param7;
                  var30 = var30 + var32 * param7;
                  param7 = param14;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param7 = -param7;
                  var21 = var21 + var23 * param7;
                  var29 = var29 + param7 * var31;
                  var22 = var22 + var24 * param7;
                  var26 = var26 + var28 * param7;
                  var18 = var18 + var20 * param7;
                  var25 = var25 + param7 * var27;
                  var17_int = var17_int + param7 * var19;
                  var30 = var30 + param7 * var32;
                  param7 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = oc.field_b[param7];
                while (param7 < param14) {
                  var37 = var17_int >> 16;
                  if (oc.field_d > var37) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        var37 < oc.field_d) {
                        ug.a(var25, (byte) -27, param12, 0, 0, var38, var36Lifetime2 + var37, 0, var21, var29);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (oc.field_d <= var37 + var38) {
                        var38 = -var37 + (oc.field_d - 1);
                      }
                      if (var37 < 0) {
                        ug.a(var25 - var37 * var40, (byte) -61, param12, var39, var40, var38 + var37, var36Lifetime2, var41, -(var37 * var39) + var21, -(var37 * var41) + var29);
                      } else {
                        ug.a(var25, (byte) -44, param12, var39, var40, var38, var37 + var36Lifetime2, var41, var21, var29);
                      }
                    }
                  }
                  param7++;
                  if (param7 >= oc.field_e) {
                    return;
                  }
                  var21 = var21 + var23;
                  var25 = var25 + var27;
                  var36Lifetime2 = var36Lifetime2 + qg.field_g;
                  var22 = var22 + var24;
                  var29 = var29 + var31;
                  var26 = var26 + var28;
                  var17_int = var17_int + var19;
                  var30 = var30 + var32;
                  var18 = var18 + var20;
                }
              }
              var36Lifetime3 = param15 - param14;
              if (0 != var36Lifetime3) {
                var37Lifetime2 = param4 << 16;
                var38Lifetime2 = param6 << 16;
                var39Lifetime2 = param10 << 16;
                var40Lifetime2 = param3 << 16;
                if (var33 != 0) {
                  var18 = param5 << 16;
                  var30 = param16 << 16;
                  var26 = param11 << 16;
                  var22 = param9 << 16;
                } else {
                  var29 = param16 << 16;
                  var25 = param11 << 16;
                  var21 = param9 << 16;
                  var17_int = param5 << 16;
                }
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
              } else {
                var24 = 0;
                var31 = 0;
                var28 = 0;
                var23 = 0;
                var20 = 0;
                var19 = 0;
                var32 = 0;
                var27 = 0;
              }
            } else {
              if (param7 != param15) {
                var35 = param15 - param14;
                if (param5 > param1) {
                  var20 = (-param5 + param4 << 16) / var35;
                  var28 = (param10 - param11 << 16) / var35;
                  var24 = (-param9 + param6 << 16) / var35;
                  var30 = param16 << 16;
                  var18 = param5 << 16;
                  var27 = (param10 - param0 << 16) / var34;
                  var31 = (param3 - param2 << 16) / var34;
                  var32 = (-param16 + param3 << 16) / var35;
                  var23 = (-param8 + param6 << 16) / var34;
                  var29 = param2 << 16;
                  var19 = (param4 - param1 << 16) / var34;
                  var25 = param0 << 16;
                  var26 = param11 << 16;
                  var22 = param9 << 16;
                  var17_int = param1 << 16;
                  var21 = param8 << 16;
                } else {
                  var30 = param2 << 16;
                  var23 = (-param9 + param6 << 16) / var35;
                  var18 = param1 << 16;
                  var22 = param8 << 16;
                  var31 = (param3 - param16 << 16) / var35;
                  var29 = param16 << 16;
                  var21 = param9 << 16;
                  var32 = (param3 - param2 << 16) / var34;
                  var27 = (param10 - param11 << 16) / var35;
                  var25 = param11 << 16;
                  var24 = (-param8 + param6 << 16) / var34;
                  var19 = (param4 - param5 << 16) / var35;
                  var28 = (param10 - param0 << 16) / var34;
                  var26 = param0 << 16;
                  var20 = (param4 - param1 << 16) / var34;
                  var17_int = param5 << 16;
                }
              } else {
                var28 = 0;
                var17_int = param1 << 16;
                var19 = 0;
                var30 = param16;
                var26 = param11;
                var20 = 0;
                var27 = 0;
                var25 = param0;
                var18 = param5 << 16;
                var23 = 0;
                var21 = param8;
                var24 = 0;
                var31 = 0;
                var29 = param2;
                var22 = param9;
                var32 = 0;
              }
              if (param7 < 0) {
                param7 = Math.min(-param7, -param7 + param14);
                var25 = var25 + var27 * param7;
                var30 = var30 + var32 * param7;
                var26 = var26 + var28 * param7;
                var17_int = var17_int + param7 * var19;
                var22 = var22 + var24 * param7;
                var21 = var21 + param7 * var23;
                var29 = var29 + var31 * param7;
                var18 = var18 + var20 * param7;
                param7 = 0;
              }
              var33 = 0;
            }
            if (0 > param7) {
              param7 = -param7;
              var21 = var21 + var23 * param7;
              var29 = var29 + var31 * param7;
              var18 = var18 + param7 * var20;
              var30 = var30 + var32 * param7;
              var26 = var26 + var28 * param7;
              var25 = var25 + var27 * param7;
              var17_int = var17_int + var19 * param7;
              var22 = var22 + var24 * param7;
              param7 = 0;
            }
            var35Lifetime1 = oc.field_b[param7];
            while (param15 > param7) {
              var36Lifetime1 = var17_int >> 16;
              if (oc.field_d > var36Lifetime1) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 == 0) {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < oc.field_d) {
                    ug.a(var25, (byte) -55, param12, 0, 0, var37Lifetime1, var35Lifetime1 + var36Lifetime1, 0, var21, var29);
                  }
                } else {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (oc.field_d <= var36Lifetime1 + var37Lifetime1) {
                    var37Lifetime1 = oc.field_d + (-var36Lifetime1 - 1);
                  }
                  if (0 <= var36Lifetime1) {
                    ug.a(var25, (byte) -118, param12, var38Lifetime1, var39Lifetime1, var37Lifetime1, var35Lifetime1 + var36Lifetime1, var40Lifetime1, var21, var29);
                  } else {
                    ug.a(var25 - var36Lifetime1 * var39Lifetime1, (byte) -118, param12, var38Lifetime1, var39Lifetime1, var37Lifetime1 + var36Lifetime1, var35Lifetime1, var40Lifetime1, var21 - var38Lifetime1 * var36Lifetime1, -(var40Lifetime1 * var36Lifetime1) + var29);
                  }
                }
              }
              param7++;
              if (param7 >= oc.field_e) {
                return;
              }
              var30 = var30 + var32;
              var35Lifetime1 = var35Lifetime1 + qg.field_g;
              var17_int = var17_int + var19;
              var18 = var18 + var20;
              var29 = var29 + var31;
              var21 = var21 + var23;
              var26 = var26 + var28;
              var22 = var22 + var24;
              var25 = var25 + var27;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_80_0 = var17;
          stackIn_80_1 = new StringBuilder().append("dl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_I = null;
        this.field_K = null;
        this.field_q = null;
        if (param0 != 1047574608) {
          this.field_F = -19;
        }
        this.field_k = null;
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_4_0 = ji.field_r.a(-2, param0, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("dl.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String[] a(String param0, char param1, int param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param2 >= -17) {
            stackIn_3_0 = (String[]) null;
            return stackIn_3_0;
          }
          var10 = (CharSequence) ((Object) param0);
          var3_int = w.a(-15, var10, param1);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param0.charAt(var8) != param1; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("dl.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          field_H = (eg) null;
        }
        field_C = (int[][]) null;
        field_j = null;
        field_l = null;
        field_n = null;
        field_H = null;
        field_s = null;
        field_E = null;
        field_r = (boolean[][]) null;
    }

    dl() {
    }

    static {
        field_n = new int[3];
        field_l = new java.awt.Color(10040319);
        field_C = new int[][]{new int[]{2, 3, 4}, new int[]{3, 4, 5}, new int[]{6, 8, 10}, new int[]{2, 3, 4}, new int[]{2, 5, 8}, new int[]{3, 6, 9}, new int[]{1, 1, 1}, new int[]{1, 1, 1}, new int[]{1}, new int[]{1}};
        field_r = new boolean[][]{new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{false, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true}, new boolean[]{true}};
        field_E = "Tor Challenge";
    }
}
