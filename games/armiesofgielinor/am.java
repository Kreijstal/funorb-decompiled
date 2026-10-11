/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends mn {
    private int field_J;
    private int field_E;
    static hi field_z;
    private int[] field_H;
    static wk field_A;
    static String field_y;
    static wk[] field_C;
    private int field_G;
    static sn[] field_v;
    static long[] field_I;
    static String field_F;
    static int[] field_D;
    static int field_x;
    static byte[] field_B;
    static int[] field_K;
    private int field_w;

    private final String a(String[] param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_z = (hi) null;
          }
          stackIn_3_0 = this.a(118, param0, "move");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("am.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_C = null;
        field_D = null;
        field_z = null;
        field_F = null;
        field_K = null;
        field_y = null;
        field_B = null;
        field_I = null;
        if (param0 != -1) {
          field_D = (int[]) null;
        }
        field_v = null;
        field_A = null;
    }

    private final bd a(jd param0, byte param1, ha param2) {
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_23_0 = null;
        bd stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        pe stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0.field_s) {
            this.a(-84, new String[]{"vine at ", ci.c(param0.field_J, param1 ^ 32, param0.field_w), " has already grown"}, "vine growth");
            stackIn_3_0 = null;
            return (bd) (stackIn_3_0);
          }
          if (this.field_H.length != 1) {
            this.a(-98, new String[]{"vine at ", ci.c(param0.field_J, param1 - 32, param0.field_w), " attempted to grow more than one step"}, "vine growth");
            stackIn_6_0 = null;
            return (bd) (stackIn_6_0);
          }
          var4_int = this.field_J;
          var5 = this.field_G;
          var6 = this.field_H[0];
          if (1 != var6) {
            if (0 == var6) {
              var4_int++;
            } else {
              if (var6 == 2) {
                var5++;
              } else {
                if (var6 == 3) {
                  var4_int--;
                }
              }
            }
          } else {
            var5--;
          }
          if (var4_int >= 0 &&
            var5 >= 0 &&
            var4_int < param2.field_v &&
            param2.field_db > var5) {
            if (param1 != 32) {
              stackIn_26_0 = (bd) null;
              return stackIn_26_0;
            }
            var6 = param2.field_Eb[var5 * param2.field_v + var4_int].field_h;
            if (2 != var6 &&
              4 != var6 &&
              var6 != 6) {
              stackIn_34_0 = new pe(var4_int, var5, this.field_J, this.field_G, param0.field_Y, this.field_p);
              return (bd) ((Object) stackIn_34_0);
            }
            this.a(120, new String[]{"vine at ", ci.c(param0.field_J, param1 - 32, param0.field_w), " attempted to grow onto ground type: ", Integer.toString(var6)}, "vine growth");
            stackIn_32_0 = null;
            return (bd) (stackIn_32_0);
          }
          this.a(127, new String[]{"vine at ", ci.c(param0.field_J, 0, param0.field_w), " attempted to escape the map"}, "vine growth");
          stackIn_23_0 = null;
          return (bd) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_37_0 = var4;
          stackIn_37_1 = new StringBuilder().append("am.H(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final bd a(int param0, ha param1) {
        String discarded$3 = null;
        String discarded$0 = null;
        String discarded$1 = null;
        String discarded$2 = null;
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        bd stackIn_13_0 = null;
        bd stackIn_16_0 = null;
        int stackIn_20_0 = 0;
        Object stackIn_52_0 = null;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_97_0 = 0;
        ld stackIn_114_0 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_118_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        jd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jd var16 = null;
        jd var17 = null;
        int var9Lifetime1;
        int var9Lifetime2;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          this.d(-107);
          var16 = param1.c(this.field_G, true, this.field_J);
          var17 = var16;
          if (var17 == null) {
            discarded$3 = this.a(new String[]{"no unit at ", ci.c(this.field_J, 0, this.field_G)}, 0);
            stackIn_3_0 = null;
            return (bd) (stackIn_3_0);
          }
          if (this.field_p != var17.field_O &&
            !this.field_u) {
            discarded$0 = this.a(new String[]{"unit at ", ci.c(this.field_J, 0, this.field_G), " not owned by this player"}, 0);
            stackIn_7_0 = null;
            return (bd) (stackIn_7_0);
          }
          if (var17.field_N != 51 && (!(this.field_o > -1) ||
            uc.field_d[this.field_o][5] != 24)) {
            if (var17.field_N == 39) {
              stackIn_16_0 = this.a(var17, (byte) 32, param1);
              return stackIn_16_0;
            }
            if (!var17.field_s) {
              stackIn_20_0 = 3 * bw.field_m[var16.field_N][3];
            } else {
              stackIn_20_0 = 0;
            }
            var4 = stackIn_20_0;
            if (0 != (param1.b(31, var17.field_w, var17.field_J, var17.field_O) & 4) &&
              null != this.field_H &&
              this.field_H.length > 0) {
              var4 = 0;
              discarded$1 = this.a(new String[]{"unit at ", ci.c(this.field_J, 0, this.field_G), "Moved when in range of cyclops"}, 0);
            }
            if (this.field_o > -1 &&
              uc.field_d[this.field_o][5] == 18) {
              var4 = var4 << 1;
            }
            if (7 == var17.field_P) {
              var4 = var4 >> 1;
            }
            if (var17.field_P == 8) {
              var4 = 0;
            }
            var5 = this.field_J;
            var6 = this.field_G;
            var7 = 0;
            while (this.field_H.length > var7 &&
              var4 > 0) {
              var8_int = param1.field_v * var6 + var5;
              var9 = this.field_H[var7];
              if (var9 == 1) {
                var6--;
              } else {
                if (0 != var9) {
                  if (var9 == 2) {
                    var6++;
                  } else {
                    if (3 == var9) {
                      var5--;
                    }
                  }
                } else {
                  var5++;
                }
              }
              if (0 <= var5 &&
                0 <= var6 &&
                param1.field_v > var5 &&
                param1.field_db > var6) {
                var9Lifetime2 = param1.a(var8_int, -16, var5 + param1.field_v * var6, var17.field_O, var17, true);
                if (var9Lifetime2 <= var4) {
                  var4 = var4 - var9Lifetime2;
                  var7++;
                  continue;
                }
                this.field_w = 0;
                this.field_E = 0;
              } else {
                discarded$2 = this.a(new String[]{"unit at ", ci.c(this.field_J, 0, this.field_G), " attempted to escape the map"}, 0);
                stackIn_52_0 = null;
                return (bd) (stackIn_52_0);
              }
              break;
            }
            if (var17.field_B == 0) {
              this.field_E = 0;
              this.field_w = 0;
            }
            var8 = param1.c(this.field_E + var6, true, var5 + this.field_w);
            if (var8 == null) {
              this.field_E = 0;
              this.field_w = 0;
            }
            stackIn_65_0 = (this.field_w >= 0) ? 1 : -1;
            var9Lifetime1 = stackIn_65_0;
            stackIn_68_0 = (0 <= this.field_E) ? 1 : -1;
            var10 = stackIn_68_0;
            var11 = var9Lifetime1 * this.field_w + this.field_E * var10;
            var12 = bw.field_m[var17.field_N][6];
            var13 = bw.field_m[var17.field_N][7];
            if (var17.field_W &&
              var17.field_N == 34) {
              var12 = 2;
              var13 = 7;
              if (var17.j(20640) == 3) {
                var13 = var13 + var17.d(1, 57);
              }
            }
            {
              if (81 != var17.field_N &&
                4 != var17.field_N && (var17.field_N != 74 ||
                3 != var17.j(20640))) {
                if (var17.g(0) == 3 &&
                  var17.j(20640) == 2) {
                  var13 = var13 + var17.d(1, -108);
                } else if (2 != var17.g(0)) {
                } else if (var17.j(20640) != 1) {
                } else {
                  var13 = var13 + var17.d(1, -87);
                }
              } else {
                var13 = var13 + var17.d(1, 118);
              }
            }
            if (param0 < 31) {
              field_I = (long[]) null;
            }
            boolean decompiledFrameRemainder0 = true;
            if (1 < var11 && (var12 > var11 ||
              var11 > var13)) {
              this.field_E = 0;
              this.field_w = 0;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (1 >= var11) {
                if (var11 == 1 &&
                  4 == var8.g(0) &&
                  !var17.j((byte) 78)) {
                  this.field_w = 0;
                  this.field_E = 0;
                }
              } else {
                stackIn_97_0 = (bw.field_m[var17.field_N][0] != 4) ? 0 : 1;
                var14 = stackIn_97_0;
                if (!param1.field_j.a(var6, this.field_w + var5, var5, var14 != 0, var13, this.field_E + var6, (byte) 81)) {
                  this.field_w = 0;
                  this.field_E = 0;
                }
                if ((param1.b(31, var6 + this.field_E, var5 + this.field_w, var17.field_O) & 2) != 0 ||
                  0 != (param1.b(31, var6, var5, var17.field_O) & 2)) {
                  this.field_w = 0;
                  this.field_E = 0;
                }
              }
            }
            if (var7 == 0 &&
              this.field_w == 0 &&
              0 == this.field_E) {
              return null;
            }
            stackIn_114_0 = new ld(this.field_J, this.field_G, this.field_H, var7, this.field_w, this.field_E, this.field_p, var17, param1.c(var6 + this.field_E, true, this.field_w + var5));
            return (bd) ((Object) stackIn_114_0);
          }
          stackIn_13_0 = this.a(param1, 0, var17);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_117_0 = var3;
          stackIn_117_1 = new StringBuilder().append("am.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_118_2 = "null";
          } else {
            stackIn_118_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_117_0), ((StringBuilder) (Object) stackIn_117_1).append(stackIn_118_2).append(')').toString());
        }
    }

    private final bd a(ha param0, int param1, jd param2) {
        Object stackIn_6_0 = null;
        Object stackIn_12_0 = null;
        ur stackIn_16_0 = null;
        ur stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          var4_int = this.field_J + this.field_w;
          var5 = this.field_G + this.field_E;
          if (var4_int >= 0 &&
            var5 >= 0 &&
            param0.field_v > var4_int &&
            param0.field_db > var5) {
            var6 = param0.field_Eb[var4_int + var5 * param0.field_v].field_h;
            if (var6 != 2 &&
              var6 != 4 &&
              var6 != 6) {
              if (param1 > ~this.field_o &&
                uc.field_d[this.field_o][5] == 24) {
                stackIn_16_0 = new ur(this.field_J, this.field_G, this.field_w, this.field_E, this.field_p, param2, false);
                return (bd) ((Object) stackIn_16_0);
              }
              stackIn_18_0 = new ur(this.field_J, this.field_G, this.field_w, this.field_E, this.field_p, param2, true);
              return (bd) ((Object) stackIn_18_0);
            }
            this.a(126, new String[]{"unit at ", ci.c(param2.field_J, 0, param2.field_w), " attempted to teleport onto ground type: ", Integer.toString(var6)}, "teleport");
            stackIn_12_0 = null;
            return (bd) (stackIn_12_0);
          }
          this.a(param1 + 124, new String[]{"unit at ", ci.c(param2.field_J, 0, param2.field_w), " attempted to teleport off the map"}, "teleport");
          stackIn_6_0 = null;
          return (bd) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("am.F(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    am(vh param0, int param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4Lifetime1;
        try {
          this.field_p = param1;
          var3_int = param0.e((byte) -104) & 8191;
          this.field_H = new int[var3_int];
          this.field_J = param0.k(0);
          this.field_G = param0.k(0);
          var4 = 0;
          for (var5 = 0; var3_int > var5; var5++) {
            if (0 == var5 % 4) {
              var4 = param0.k(0);
            }
            this.field_H[var5] = rn.a(3, var4);
            var4 = var4 >> 2;
          }
          var4Lifetime1 = param0.e((byte) -104);
          if (var4Lifetime1 != 0) {
            this.field_E = 255 & var4Lifetime1;
            this.field_w = var4Lifetime1 >> 8;
            this.field_E = (this.field_E ^ 128) - 128;
            this.field_w = -128 + (this.field_w ^ 128);
          } else {
            this.field_w = 0;
            this.field_E = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("am.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    am(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_H = param2;
          this.field_J = param3;
          this.field_E = param6;
          this.field_G = param4;
          this.field_w = param5;
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "am.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_y = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_I = new long[1000];
        field_B = new byte[]{(byte)2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_F = "You cannot add yourself!";
        field_K = new int[1024];
    }
}
