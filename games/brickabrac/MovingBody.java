/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MovingBody extends IntrusiveNode {
    int x256;
    int velocityX256;
    int velocityY256;
    int stateWord;
    int y256;
    int typeId;
    static String field_n;

    final static void shuffleValues(int obfuscationGuard, int[] values, int passes, IsaacGenerator random) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = 0;
          var5 = 29 / ((-52 - obfuscationGuard) / 49);
          while (var4_int < passes) {
            for (var6 = 0; values.length > var6; var6++) {
              var7 = random.nextBoundedInt(-37880252, values.length);
              var8 = values[var7];
              values[var7] = values[var6];
              values[var6] = var8;
            }
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("vi.G(").append(obfuscationGuard).append(',');
          if (values == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(passes).append(',');
          if (random == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    MovingBody(int x256, int y256, int velocityX256, int velocityY256, int typeId) {
        this.x256 = x256;
        this.velocityY256 = velocityY256;
        this.y256 = y256;
        this.velocityX256 = velocityX256;
        this.typeId = typeId;
    }

    void readBodySnapshot(int obfuscationGuard, PacketBuffer packet) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int header = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int gridColumn = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          header = packet.readUnsignedByte(255);
          if (0 != (128 & header)) {
            var4 = packet.readUnsignedByte(255);
            var5 = (header & 7) << 3;
            var5 = var5 | (224 & var4) >> 5;
            gridColumn = 31 & var4;
            this.x256 = gridColumn * 34 << 8;
            this.y256 = var5 * 16 << 8;
          } else {
            var4 = header & 12;
            var5 = header & 3;
            this.x256 = var4 << 14 | packet.readUnsignedShort(65280);
            this.y256 = var5 << 16 | packet.readUnsignedShort(65280);
          }
          if ((64 & header) == 0) {
            this.velocityX256 = 0;
            this.velocityY256 = 0;
          } else {
            this.velocityX256 = packet.readShort(127);
            this.velocityY256 = packet.readShort(127);
          }
          if ((header & 32) == 0) {
            this.stateWord = 0;
          } else {
            this.stateWord = packet.readUnsignedByte(255);
          }
          if (obfuscationGuard < 89) {
            return;
          }
          if ((header & 16) != 0) {
            this.typeId = packet.readUnsignedByte(255);
          } else {
            this.typeId = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("vi.L(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static int c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          mf.field_f.a(v.field_e, DualLinkNode.field_r, -114, true);
          mf.field_f.i(79);
          while (jl.a((byte) 5)) {
            mf.field_f.a(go.field_b, dc.field_b, true);
          }
          var1_int = -30 % ((55 - param0) / 43);
          if (ch.field_b != -1) {
            var2 = ch.field_b;
            bd.a(-1, true);
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          if (t.field_g) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (ka.field_l == jm.field_f) {
            stackIn_15_0 = 1;
            return stackIn_15_0;
          }
          if (!ma.field_I.b(96)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (ik.field_g != jm.field_f) {
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_21_0 = 2;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "vi.J(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 >= -81) {
          field_n = (String) null;
        }
        nl.field_b.drawTransparent((640 - nl.field_b.canvasWidth) / 2, 19);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int[] param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
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
        var42 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param15 >= 0 &&
            param2 < mg.field_b) {
            if (0 > param7 &&
              0 > param4 &&
              param1 < 0) {
              return;
            }
            if (mg.field_e <= param7 &&
              param4 >= mg.field_e &&
              mg.field_e <= param1) {
              return;
            }
            if (param3 != -111) {
              field_n = (String) null;
            }
            var34 = -param2 + param15;
            if (param2 == param14) {
              if (param2 == param15) {
                var23 = 0;
                var28 = 0;
                var21 = param16;
                var31 = 0;
                var26 = param6;
                var30 = param13;
                var24 = 0;
                var29 = param0;
                var18 = param4 << 16;
                var19 = 0;
                var22 = param10;
                var32 = 0;
                var27 = 0;
                var17_int = param7 << 16;
                var25 = param5;
                var20 = 0;
              } else {
                var35 = param15 - param14;
                if (param7 >= param4) {
                  var31 = (param11 - param13 << 16) / var35;
                  var28 = (param12 - param5 << 16) / var34;
                  var18 = param7 << 16;
                  var20 = (-param7 + param1 << 16) / var34;
                  var23 = (-param10 + param8 << 16) / var35;
                  var24 = (-param16 + param8 << 16) / var34;
                  var22 = param16 << 16;
                  var19 = (-param4 + param1 << 16) / var35;
                  var21 = param10 << 16;
                  var32 = (-param0 + param11 << 16) / var34;
                  var27 = (-param6 + param12 << 16) / var35;
                  var17_int = param4 << 16;
                  var25 = param6 << 16;
                  var30 = param0 << 16;
                  var29 = param13 << 16;
                  var26 = param5 << 16;
                } else {
                  var24 = (param8 - param10 << 16) / var35;
                  var31 = (-param0 + param11 << 16) / var34;
                  var30 = param13 << 16;
                  var20 = (param1 - param4 << 16) / var35;
                  var32 = (-param13 + param11 << 16) / var35;
                  var22 = param10 << 16;
                  var25 = param5 << 16;
                  var23 = (-param16 + param8 << 16) / var34;
                  var28 = (-param6 + param12 << 16) / var35;
                  var26 = param6 << 16;
                  var18 = param4 << 16;
                  var19 = (param1 - param7 << 16) / var34;
                  var29 = param0 << 16;
                  var21 = param16 << 16;
                  var27 = (param12 - param5 << 16) / var34;
                  var17_int = param7 << 16;
                }
              }
              if (param2 < 0) {
                param2 = Math.min(-param2, -param2 + param14);
                var25 = var25 + var27 * param2;
                var22 = var22 + param2 * var24;
                var26 = var26 + param2 * var28;
                var18 = var18 + var20 * param2;
                var30 = var30 + param2 * var32;
                var29 = var29 + var31 * param2;
                var17_int = var17_int + param2 * var19;
                var21 = var21 + var23 * param2;
                param2 = 0;
              }
              var33 = 0;
            } else {
              var22 = param16 << 16;
              var21 = param16 << 16;
              var18 = param7 << 16;
              var17_int = param7 << 16;
              var26 = param5 << 16;
              var25 = param5 << 16;
              var30 = param0 << 16;
              var29 = param0 << 16;
              var35 = param14 - param2;
              var19 = (-param7 + param4 << 16) / var35;
              var20 = (param1 - param7 << 16) / var34;
              if (var19 < var20) {
                var28 = (param12 - param5 << 16) / var34;
                var27 = (-param5 + param6 << 16) / var35;
                var33 = 0;
                var31 = (param13 - param0 << 16) / var35;
                var24 = (param8 - param16 << 16) / var34;
                var32 = (-param0 + param11 << 16) / var34;
                var23 = (param10 - param16 << 16) / var35;
              } else {
                var23 = (param8 - param16 << 16) / var34;
                var32 = (-param0 + param13 << 16) / var35;
                var28 = (-param5 + param6 << 16) / var35;
                var33 = 1;
                var31 = (-param0 + param11 << 16) / var34;
                var24 = (param10 - param16 << 16) / var35;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var27 = (param12 - param5 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param2 < 0) {
                if (param14 < 0) {
                  param2 = -param2 + param14;
                  var18 = var18 + var20 * param2;
                  var22 = var22 + param2 * var24;
                  var29 = var29 + param2 * var31;
                  var30 = var30 + param2 * var32;
                  var21 = var21 + var23 * param2;
                  var26 = var26 + param2 * var28;
                  var17_int = var17_int + var19 * param2;
                  var25 = var25 + param2 * var27;
                  param2 = param14;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param2 = -param2;
                  var18 = var18 + param2 * var20;
                  var29 = var29 + param2 * var31;
                  var17_int = var17_int + param2 * var19;
                  var26 = var26 + var28 * param2;
                  var22 = var22 + var24 * param2;
                  var21 = var21 + var23 * param2;
                  var30 = var30 + param2 * var32;
                  var25 = var25 + var27 * param2;
                  param2 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = mg.field_g[param2];
                while (param2 < param14) {
                  var37 = var17_int >> 16;
                  if (mg.field_e > var37) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (0 == var38) {
                      if (var37 >= 0 &&
                        var37 < mg.field_e) {
                        MainMenuScreen.a((byte) 127, var29, 0, 0, 0, var36Lifetime2 + var37, var38, var21, param9, var25);
                      }
                    } else {
                      var39 = (var22 - var21) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (mg.field_e <= var38 + var37) {
                        var38 = -1 + (-var37 + mg.field_e);
                      }
                      if (var37 < 0) {
                        MainMenuScreen.a((byte) 121, var29 - var41 * var37, var41, var39, var40, var36Lifetime2, var38 + var37, var21 - var37 * var39, param9, -(var40 * var37) + var25);
                      } else {
                        MainMenuScreen.a((byte) 117, var29, var41, var39, var40, var36Lifetime2 + var37, var38, var21, param9, var25);
                      }
                    }
                  }
                  param2++;
                  if (mg.field_b <= param2) {
                    return;
                  }
                  var22 = var22 + var24;
                  var36Lifetime2 = var36Lifetime2 + Rasterizer2D.width;
                  var26 = var26 + var28;
                  var18 = var18 + var20;
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                  var29 = var29 + var31;
                  var17_int = var17_int + var19;
                  var30 = var30 + var32;
                }
              }
              var36Lifetime3 = -param14 + param15;
              if (var36Lifetime3 != 0) {
                var37Lifetime2 = param1 << 16;
                var38Lifetime2 = param8 << 16;
                var39Lifetime2 = param12 << 16;
                if (var33 == 0) {
                  var21 = param10 << 16;
                  var29 = param13 << 16;
                  var17_int = param4 << 16;
                  var25 = param6 << 16;
                } else {
                  var26 = param6 << 16;
                  var22 = param10 << 16;
                  var30 = param13 << 16;
                  var18 = param4 << 16;
                }
                var40Lifetime2 = param11 << 16;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
              } else {
                var24 = 0;
                var19 = 0;
                var27 = 0;
                var32 = 0;
                var23 = 0;
                var20 = 0;
                var28 = 0;
                var31 = 0;
              }
            }
            if (param2 < 0) {
              param2 = -param2;
              var22 = var22 + param2 * var24;
              var30 = var30 + param2 * var32;
              var21 = var21 + param2 * var23;
              var26 = var26 + var28 * param2;
              var29 = var29 + var31 * param2;
              var25 = var25 + param2 * var27;
              var17_int = var17_int + var19 * param2;
              var18 = var18 + param2 * var20;
              param2 = 0;
            }
            var35Lifetime1 = mg.field_g[param2];
            while (param15 > param2) {
              var36Lifetime1 = var17_int >> 16;
              if (mg.field_e > var36Lifetime1) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 == 0) {
                  if (var36Lifetime1 >= 0 &&
                    mg.field_e > var36Lifetime1) {
                    MainMenuScreen.a((byte) 127, var29, 0, 0, 0, var36Lifetime1 + var35Lifetime1, var37Lifetime1, var21, param9, var25);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (var36Lifetime1 + var37Lifetime1 >= mg.field_e) {
                    var37Lifetime1 = mg.field_e - (var36Lifetime1 + 1);
                  }
                  if (0 <= var36Lifetime1) {
                    MainMenuScreen.a((byte) 125, var29, var40Lifetime1, var38Lifetime1, var39Lifetime1, var35Lifetime1 + var36Lifetime1, var37Lifetime1, var21, param9, var25);
                  } else {
                    MainMenuScreen.a((byte) 117, var29 - var40Lifetime1 * var36Lifetime1, var40Lifetime1, var38Lifetime1, var39Lifetime1, var35Lifetime1, var37Lifetime1 + var36Lifetime1, var21 - var38Lifetime1 * var36Lifetime1, param9, var25 - var36Lifetime1 * var39Lifetime1);
                  }
                }
              }
              param2++;
              if (mg.field_b <= param2) {
                return;
              }
              var17_int = var17_int + var19;
              var26 = var26 + var28;
              var22 = var22 + var24;
              var25 = var25 + var27;
              var35Lifetime1 = var35Lifetime1 + Rasterizer2D.width;
              var18 = var18 + var20;
              var21 = var21 + var23;
              var30 = var30 + var32;
              var29 = var29 + var31;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_78_0 = var17;
          stackIn_78_1 = new StringBuilder().append("vi.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 79) {
            MovingBody.a((byte) 80);
          }
          stackIn_3_0 = (11 * this.stateWord + 666 << 23 | 3 * (this.typeId + 5) << 7) ^ (this.y256 * 17 + 10855845 << 3 ^ this.x256 * 31 + 15790320) + (58339 + 11 * this.velocityX256 | 29 * this.velocityY256 << 13);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vi.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 != 34) {
          int[] var2 = (int[]) null;
          MovingBody.a(-84, 122, -97, (byte) 68, 30, 8, -62, -26, -113, (int[]) null, 112, -31, -33, -94, -22, -100, 90);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        jf.d(-99);
        Rasterizer2D.intersectClip(param2, param3, param1, param4);
        if (param0 < 68) {
          field_n = (String) null;
        }
    }

    static {
        field_n = "Waiting for sound effects";
    }
}
