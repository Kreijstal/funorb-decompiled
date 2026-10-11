/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uk {
    private int field_b;
    int[] field_f;
    static String field_a;
    byte[] field_i;
    private boolean[] field_n;
    static boolean field_e;
    int field_l;
    static ci field_c;
    int field_k;
    byte[] field_g;
    int field_m;
    int field_j;
    boolean[] field_d;
    int field_o;
    oj[] field_h;

    final static void a(int param0, boolean param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          qk.field_h = param3;
          pg.field_s = param0;
          nc.field_T = 0;
          if (param2 != 28333) {
            uk.c(-83);
          }
          if (qk.field_h == 0) {
            pg.field_s = qk.field_h;
            ma.field_D = false;
          }
          if (da.a(qk.field_h, true)) {
            var4_int = 0;
            ae.field_e[qk.field_h].a((byte) 123, param1, var4_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var4), "uk.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        oj[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h.length <= this.field_o) {
            var5 = new oj[this.field_o + 8];
            ne.a(this.field_h, 0, var5, 0, this.field_h.length);
            this.field_h = var5;
          }
          this.field_h[this.field_o] = new oj(param2, param0, param3);
          this.field_o = this.field_o + 1;
          if (param1 != 0) {
            this.d(-125, 44);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) runtimeException), "uk.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_a = null;
          if (param0 != -1) {
            field_e = true;
          }
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "uk.AB(" + param0 + ')');
        }
    }

    final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_j = 58;
          }
          stackIn_4_0 = this.field_m;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "uk.BB(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        try {
          rn.field_a = param1;
          if (param0) {
            uk.a(83, false, 26, 15);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "uk.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(un param0, p param1, boolean param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Chess.field_G;
        try {
          var4_int = param1.i(-124);
          if (3 < var4_int) {
            throw new RuntimeException("Version number too recent");
          }
          if (!param2) {
            return;
          }
          if (var4_int == 0) {
            throw new RuntimeException("Version number too old");
          }
          if (var4_int == 1) {
            throw new RuntimeException("Version number too old");
          }
          if (var4_int != 2) {
            if (var4_int == 3) {
              var5 = param1.c(param2);
              var6 = param1.d((byte) 118);
              var8 = param1.d((byte) 118);
              var10 = param1.g(0);
              if (param0 != null) {
                param0.field_e = (int)(50L * (var6 / 1000L));
                param0.field_B.field_f = var10;
                param0.field_v = (int)(var8 / 1000L * 50L);
              }
              var11 = 0;
              while (var11 < var5) {
                var12 = param1.i(-123);
                var13 = param1.i(-103);
                var14 = param1.i(-97);
                this.a((byte) 19, var14, var12, var13);
                var11++;
                if (var15 != 0) {
                  return;
                }
              }
              if (var15 == 0) {
                return;
              }
            } else {
              return;
            }
          }
          throw new RuntimeException("Version number too old");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("uk.IA(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        boolean[] var5 = null;
        int var6 = 0;
        int var10 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var10 = Chess.field_G;
        try {
          var4_int = this.field_m;
          if (param2 != -12) {
            return true;
          }
          var5 = new boolean[this.field_d.length];
          ne.a(this.field_d, 0, var5, 0, var5.length);
          var6 = this.field_f[param1];
          if (var6 != 0) {
            var7 = var6 & 16773120;
            if (param0 == var7) {
              this.a(param1, true, -1);
              var8 = 0;
              var9 = 63;
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (var9 >= 0) {
                  stackOut_12_0 = this.field_d[var9];
                  stackIn_21_0 = stackOut_12_0 ? 1 : 0;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledFrameRemainder0 = (var10 == 0);
                  if (decompiledFrameRemainder0) {
                    if (stackIn_13_0) {
                      var8 = 1;
                    } else {
                      var9--;
                      continue;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_21_0 = var8;
                }
                if (stackIn_21_0 == 0) {
                  break;
                }
                this.a(2, var5, var4_int);
                return true;
              }
            }
          }
          this.a(2, var5, var4_int);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var4), "uk.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean e(int param0, int param1) {
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var11 = Chess.field_G;
        try {
          var3_int = -1;
          var4 = 63;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var4 >= 0) {
              var5_int = this.field_f[var4];
              stackIn_19_0 = 0;
              stackIn_19_1 = var5_int;
              if (var11 != 0) {
                break L1;
              }
              if (stackIn_19_0 != stackIn_19_1) {
                var6 = 16773120 & var5_int;
                var7 = -16773121 & var5_int;
                if (~param0 == ~var6 &&
                  6 == var7) {
                  var3_int = var4;
                  decompiledFrameRemainder0 = false;
                }
              }
              if (decompiledFrameRemainder0) {
                var4--;
                continue;
              }
            }
            stackIn_19_0 = var3_int;
            stackIn_19_1 = -1;
            break;
          }
          if ((stackIn_19_0 ^ stackIn_19_1) == 0) {
            return true;
          }
          var4Lifetime1 = this.field_m;
          if (param1 < 49) {
            return true;
          }
          var5 = new boolean[this.field_d.length];
          ne.a(this.field_d, 0, var5, 0, var5.length);
          var6Lifetime1 = 0;
          var7Lifetime1 = 63;
          L5: while (true) {
            if (var7Lifetime1 >= 0) {
              stackIn_41_0 = var6Lifetime1;
              if (var11 != 0) {
                break L5;
              }
              if (stackIn_41_0 == 0) {
                var8 = this.field_f[var7Lifetime1];
                if (var8 != 0) {
                  var9 = 16773120 & var8;
                  if (param0 != var9) {
                    this.a(var7Lifetime1, false, -1);
                    var10 = this.field_d[var3_int] ? 1 : 0;
                    if (var10 != 0) {
                      var6Lifetime1 = 1;
                    }
                  }
                }
                var7Lifetime1--;
                continue;
              }
            }
            this.a(2, var5, var4Lifetime1);
            stackIn_41_0 = var6Lifetime1;
            break;
          }
          return stackIn_41_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "uk.WA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = Chess.field_G;
        try {
          var5_int = this.field_f[param2];
          var6 = 16773120 & var5_int;
          var7 = var5_int & -16773121;
          var8 = param2 / 8;
          var9 = param2 % 8;
          var10 = param3 / 8;
          var11 = param3 % 8;
          var12 = var9 - var11;
          var13 = this.field_f[param3];
          if (param0 != 19) {
            return;
          }
          var14 = var13 & 16773120;
          if (var7 != 1 &&
            var13 == 0) {
            if (var6 != 0 &&
              var6 != 4096) {
            }
          } else {
            if (var6 != 0 &&
              var6 != 4096) {
            }
          }
          var15 = -16773121 & var13;
          if (var15 == 4) {
            if (var14 != 4096) {
              if (7 == var11) {
                this.field_n[0] = false;
              }
              if (var11 == 0) {
                this.field_n[1] = false;
                if (var17 != 0) {
                  this.field_n[3] = false;
                  if (var11 == 7) {
                    this.field_n[2] = false;
                  }
                }
              }
            } else {
              if (var11 == 0) {
                this.field_n[3] = false;
              }
              if (var11 == 7) {
                this.field_n[2] = false;
              }
            }
          }
          if (var6 == 4096) {
            this.field_k = -1;
            switch (var7) {
              case 1:
                if (var8 == 6 &&
                  var10 == 4) {
                  this.field_l = var9;
                }
                if (var10 == 0) {
                  var5_int = var6 | param1;
                }
                if (this.field_b == param3) {
                  var16 = 8 + param3;
                  var13 = this.field_f[var16];
                  this.field_f[var16] = 0;
                }
                break;
              case 4:
                if (var9 == 0) {
                  this.field_n[3] = false;
                }
                if (var9 == 7) {
                  this.field_n[2] = false;
                }
                break;
              case 6:
                this.field_n[2] = false;
                this.field_n[3] = false;
                if (var12 == 2) {
                  this.field_f[(param2 + param3) / 2] = this.field_f[56];
                  this.field_f[56] = 0;
                  if (var17 == 0) {
                    break;
                  }
                }
                if (var12 == -2) {
                  this.field_f[(param2 + param3) / 2] = this.field_f[63];
                  this.field_f[63] = 0;
                }
                break;
              default:
                break;
            }
          }
          if (0 == var6) {
            this.field_l = -1;
            switch (var7) {
              case 1:
                if (7 == var10) {
                  var5_int = param1 | var6;
                }
                if (var8 == 1 &&
                  var10 == 3) {
                  this.field_k = var9;
                }
                if (~this.field_b == ~param3) {
                  var16 = param3 - 8;
                  var13 = this.field_f[var16];
                  this.field_f[var16] = 0;
                }
                break;
              case 4:
                if (var9 == 7) {
                  this.field_n[0] = false;
                }
                if (var9 == 0) {
                  this.field_n[1] = false;
                }
                break;
              case 6:
                this.field_n[1] = false;
                this.field_n[0] = false;
                if (2 != var12) {
                  if (var12 != -2) {
                    break;
                  }
                  this.field_f[(param3 + param2) / 2] = this.field_f[7];
                  this.field_f[7] = 0;
                  if (var17 == 0) {
                    break;
                  }
                }
                this.field_f[(param2 + param3) / 2] = this.field_f[0];
                this.field_f[0] = 0;
                break;
              default:
                break;
            }
          }
          this.field_b = -1;
          this.field_f[param3] = var5_int;
          this.field_f[param2] = 0;
          this.d(3, var13);
          this.a(param3, 0, param2, param1);
          this.a(-1, false, -1);
          t.field_Q = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var5), "uk.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int stackIn_47_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_172_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_200_1 = 0;
        int stackIn_227_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_229_1 = 0;
        int stackIn_275_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var9Lifetime2;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12Lifetime2;
        int var13Lifetime2;
        int var14Lifetime2;
        int var15Lifetime2;
        int var27Lifetime2;
        int var15Lifetime1Lifetime1;
        var29 = Chess.field_G;
        try {
          var4_int = -1 + this.field_d.length;
          do {
            if (0 > var4_int) {
              this.field_m = param0;
              break;
            }
            this.field_d[var4_int] = false;
            var4_int--;
          } while (var29 == 0);
          if (this.field_m >= 0 &&
            this.field_m <= this.field_f.length) {
            var4_int = this.field_f[this.field_m];
            if (var4_int == 0) {
              return;
            }
            boolean decompiledFrameRemainder5 = true;
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            var5 = var4_int & 16773120;
            var6 = -16773121 & var4_int;
            var7 = this.field_m % 8;
            var8 = this.field_m / 8;
            var15 = 1;
            var16 = new int[]{1, 1, -1, -1};
            var17 = new int[]{var8, var7, var8, var7};
            var18 = new int[]{1, 1, -1, -1};
            var19 = new int[]{1, -1, 1, -1};
            var20 = new int[]{2, 2, 1, -1, -2, -2, -1, 1};
            var21 = new int[]{param2, 1, 2, 2, 1, -1, -2, -2};
            var27 = var6;
            if ((var27 != 1) &&
              (decompiledFrameRemainder0 = (4 != var27)) &&
              (decompiledFrameRemainder1 = (var27 != 2)) &&
              (decompiledFrameRemainder2 = (var27 != 3)) &&
              (decompiledFrameRemainder3 = (var27 != 5 ||
              var29 != 0))) {
              if (var27 != 6) {
                return;
              }
              decompiledFrameRemainder5 = (var29 != 0);
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              stackIn_47_0 = (var5 == 0) ? 1 : -1;
              var22 = stackIn_47_0;
              var11 = var8 + var22;
              var23 = 1;
              var27 = -1;
              L14: while (true) {
                if (var27 <= 1) {
                  var10 = var7 + var27;
                  stackIn_77_0 = -1;
                  stackIn_77_1 = ~var10;
                  if (var29 == 0) {
                    boolean decompiledFrameRemainder4 = true;
                    if (stackIn_77_0 >= stackIn_77_1 &&
                      var10 < 8) {
                      var9 = var10 + var11 * 8;
                      var12 = this.field_f[var9];
                      var14 = -16773121 & var12;
                      var13 = 16773120 & var12;
                      if (var27 != 0) {
                        if (((var12 != 0)) &&
                          ((~var13 != ~var5))) {
                          this.a(-1, var9, param1);
                        }
                        decompiledFrameRemainder4 = false;
                      }
                      else {
                        if (0 != var12) {
                          var23 = 0;
                        } else {
                          this.a(param2 + 0, var9, param1);
                        }
                      }
                    }
                    var27++;
                    continue;
                  }
                } else {
                  if (var23 == 0) {
                    break L14;
                  }
                  stackIn_77_0 = var8;
                  stackIn_77_1 = 1;
                }
                if (stackIn_77_0 != stackIn_77_1 ||
                  var5 != 0) {
                  if (var8 != 6) {
                    break L14;
                  }
                  if (4096 != var5) {
                    break L14;
                  }
                }
                var11 = 2 * var22 + var8;
                var9 = var11 * 8 + var7;
                var12 = this.field_f[var9];
                var14 = -16773121 & var12;
                var13 = 16773120 & var12;
                if (0 == var12) {
                  this.a(param2 ^ 0, var9, param1);
                }
                break;
              }
              var24 = -1;
              if (0 == var5) {
                var24 = this.field_l;
              }
              if (0 != var5 ||
                var29 != 0) {
                var24 = this.field_k;
              }
              if (-1 == var24) {
                return;
              }
              var27 = var7 - var24;
              if (1 == var27 ||
                var27 == -1) {
                if (var5 == 4096 &&
                  3 == var8) {
                  var11 = var8 - 1;
                  var9 = 8 * var11 + var24;
                  this.field_b = var9;
                  this.a(param2 + 0, var9, param1);
                }
                if (var5 == 0 &&
                  4 == var8) {
                  var11 = var8 + 1;
                  var9 = var11 * 8 + var24;
                  this.field_b = var9;
                  this.a(-1, var9, param1);
                }
              }
              if (var29 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              var27 = 0;
              while (true) {
                stackIn_113_0 = 4;
                stackIn_113_1 = var27;
                if (stackIn_113_0 > stackIn_113_1) {
                  var15 = 1;
                  if (var29 != 0) {
                    return;
                  }
                  var28 = var17[var27];
                  L31: while (true) {
                    if (0 <= var28) {
                      stackIn_113_0 = ~var28;
                      stackIn_113_1 = -9;
                      if (stackIn_113_0 > stackIn_113_1 &&
                        var15 != 0) {
                        if (var27 == 0 ||
                          2 == var27) {
                          var9 = var7 + var28 * 8;
                        } else {
                          var9 = var28 + 8 * var8;
                        }
                        if (var9 != this.field_m ||
                          var29 != 0) {
                          var12 = this.field_f[var9];
                          var14 = -16773121 & var12;
                          var13 = var12 & 16773120;
                          if (var12 != 0) {
                            if (var13 == var5 &&
                              var29 == 0) {
                              break L31;
                            }
                            var15 = 0;
                          }
                          this.a(param2 + 0, var9, param1);
                        }
                        var28 = var28 + var16[var27];
                        continue;
                      }
                    }
                    break;
                  }
                  var27++;
                  continue;
                }
                break;
              }
              if (var29 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2)) {
              var27 = 0;
              while (8 > var27) {
                var11 = var20[var27] + var8;
                var10 = var7 + var21[var27];
                if (var29 != 0) {
                  return;
                }
                if (var11 >= 0 &&
                  8 > var11 &&
                  var10 >= 0 &&
                  8 > var10) {
                  var9 = 8 * var11 + var10;
                  var12 = this.field_f[var9];
                  var14 = -16773121 & var12;
                  var13 = 16773120 & var12;
                  if (var14 == 0 ||
                    var5 != var13) {
                    this.a(param2 + 0, var9, param1);
                  }
                }
                var27++;
              }
              if (var29 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder3)) {
              var27 = 0;
              while (true) {
                stackIn_172_0 = 4;
                if (stackIn_172_0 > var27) {
                  var11 = var18[var27] + var8;
                  var10 = var7 + var19[var27];
                  if (var29 != 0) {
                    return;
                  }
                  var15Lifetime2 = 1;
                  L47: while (true) {
                    if (var15Lifetime2 != 0) {
                      stackIn_172_0 = var11;
                      if (stackIn_172_0 >= 0 &&
                        var11 < 8 &&
                        var10 >= 0 &&
                        8 > var10) {
                        var9 = var11 * 8 + var10;
                        var12 = this.field_f[var9];
                        var14 = -16773121 & var12;
                        var13 = var12 & 16773120;
                        if (var12 != 0) {
                          if (var5 == var13 &&
                            var29 == 0) {
                            break L47;
                          }
                          var15Lifetime2 = 0;
                        }
                        this.a(-1, var9, param1);
                        var10 = var10 + var19[var27];
                        var11 = var11 + var18[var27];
                        continue;
                      }
                    }
                    break;
                  }
                  var27++;
                  continue;
                }
                break;
              }
              if (var29 == 0) {
                return;
              }
            }
            if (decompiledFrameRemainder5) {
              var27Lifetime2 = 0;
              while (true) {
                stackIn_200_0 = ~var27Lifetime2;
                stackIn_200_1 = -5;
                L52: {
                  if (stackIn_200_0 > stackIn_200_1) {
                    var15Lifetime1 = 1;
                    stackIn_227_0 = var17[var27Lifetime2];
                    if (var29 != 0) {
                      break L52;
                    }
                    var28Lifetime1 = stackIn_227_0;
                    L55: while (true) {
                      if (var28Lifetime1 >= 0) {
                        stackIn_200_0 = ~var28Lifetime1;
                        stackIn_200_1 = -9;
                        if (stackIn_200_0 > stackIn_200_1 &&
                          var15Lifetime1 != 0) {
                          if (0 == var27Lifetime2 ||
                            var27Lifetime2 == 2) {
                            var9Lifetime2 = var7 + var28Lifetime1 * 8;
                          } else {
                            var9Lifetime2 = 8 * var8 + var28Lifetime1;
                          }
                          if (~this.field_m != ~var9Lifetime2) {
                            var12Lifetime2 = this.field_f[var9Lifetime2];
                            var13Lifetime2 = 16773120 & var12Lifetime2;
                            var14Lifetime2 = var12Lifetime2 & -16773121;
                            if (var12Lifetime2 != 0) {
                              if (~var5 == ~var13Lifetime2) {
                                break L55;
                              }
                              var15Lifetime1 = 0;
                            }
                            this.a(-1, var9Lifetime2, param1);
                          }
                          var28Lifetime1 = var28Lifetime1 + var16[var27Lifetime2];
                          continue;
                        }
                      }
                      break;
                    }
                    var27Lifetime2++;
                    continue;
                  }
                  stackIn_227_0 = 0;
                }
                var27Lifetime2 = stackIn_227_0;
                while (true) {
                  stackIn_229_0 = ~var27Lifetime2;
                  stackIn_229_1 = -5;
                  if (stackIn_229_0 > stackIn_229_1) {
                    var10Lifetime2 = var19[var27Lifetime2] + var7;
                    var11Lifetime2 = var18[var27Lifetime2] + var8;
                    if (var29 != 0) {
                      return;
                    }
                    var15Lifetime1Lifetime1 = 1;
                    L65: while (true) {
                      if (var15Lifetime1Lifetime1 != 0) {
                        stackIn_229_0 = ~var11Lifetime2;
                        stackIn_229_1 = -1;
                        if (stackIn_229_0 <= stackIn_229_1 &&
                          var11Lifetime2 < 8 &&
                          var10Lifetime2 >= 0 &&
                          var10Lifetime2 < 8) {
                          var9Lifetime2 = 8 * var11Lifetime2 + var10Lifetime2;
                          var12Lifetime2 = this.field_f[var9Lifetime2];
                          var14Lifetime2 = var12Lifetime2 & -16773121;
                          var13Lifetime2 = var12Lifetime2 & 16773120;
                          if (0 != var12Lifetime2) {
                            if (var13Lifetime2 == var5) {
                              break L65;
                            }
                            var15Lifetime1Lifetime1 = 0;
                          }
                          this.a(-1, var9Lifetime2, param1);
                          var10Lifetime2 = var10Lifetime2 + var19[var27Lifetime2];
                          var11Lifetime2 = var11Lifetime2 + var18[var27Lifetime2];
                          continue;
                        }
                      }
                      break;
                    }
                    var27Lifetime2++;
                    continue;
                  }
                  break;
                }
                if (var29 == 0) {
                  return;
                }
                break;
              }
            }
            var26 = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
            var25 = new int[]{1, 1, 1, 0, -1, -1, -1, 0};
            var27Lifetime1 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var27Lifetime1 >= 8))) {
              var10Lifetime1 = var26[var27Lifetime1] + var7;
              var11Lifetime1 = var25[var27Lifetime1] + var8;
              stackIn_275_0 = var11Lifetime1;
              if (var29 == 0) {
                if (stackIn_275_0 >= 0 &&
                  var11Lifetime1 < 8 &&
                  var10Lifetime1 >= 0 &&
                  var10Lifetime1 < 8) {
                  var9Lifetime1 = var10Lifetime1 + var11Lifetime1 * 8;
                  var12Lifetime1 = this.field_f[var9Lifetime1];
                  var14Lifetime1 = var12Lifetime1 & -16773121;
                  var13Lifetime1 = 16773120 & var12Lifetime1;
                  if (var14Lifetime1 == 0 ||
                    var13Lifetime1 != var5) {
                    this.a(-1, var9Lifetime1, param1);
                  }
                }
                var27Lifetime1++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_275_0 = 4096;
            }
            if (stackIn_275_0 == var5 &&
              param1 &&
              !this.e(4096, 52)) {
              if (this.field_n[3] &&
                this.field_d[-1 + this.field_m] &&
                this.field_f[this.field_m - 2] == 0 &&
                0 == this.field_f[this.field_m - 3]) {
                this.a(param2 + 0, -2 + this.field_m, param1);
              }
              if (this.field_n[2] &&
                this.field_d[this.field_m + 1] &&
                this.field_f[this.field_m + 2] == 0) {
                this.a(-1, 2 + this.field_m, param1);
              }
            }
            if (0 != var5) {
              return;
            }
            if (!param1) {
              return;
            }
            if (this.e(0, 82)) {
              return;
            }
            if (this.field_n[1] &&
              this.field_d[-1 + this.field_m] &&
              this.field_f[this.field_m - 2] == 0 &&
              this.field_f[this.field_m - 3] == 0) {
              this.a(-1, this.field_m - 2, param1);
            }
            if (!this.field_n[0]) {
              return;
            }
            if (!this.field_d[this.field_m + 1]) {
              return;
            }
            if (this.field_f[this.field_m + 2] != 0) {
              return;
            }
            this.a(-1, 2 + this.field_m, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var4), "uk.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        boolean[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          if (param0 != -1) {
            this.a(94, -75, 79, -71);
          }
          var4_int = this.field_m;
          if (var4_int >= 0 &&
            var4_int < 64 &&
            param1 >= 0 &&
            param1 < 64) {
            if (param2) {
              var5 = 16773120 & this.field_f[var4_int];
              var6 = this.field_f[param1];
              this.field_f[param1] = this.field_f[var4_int];
              this.field_f[var4_int] = 0;
              var7 = this.e(var5, param0 + 105) ? 1 : 0;
              this.field_f[var4_int] = this.field_f[param1];
              this.field_f[param1] = var6;
              stackIn_20_0 = this.field_d;
              stackIn_20_1 = param1;
              stackIn_21_2 = (var7 == 0);
              stackIn_20_0[stackIn_20_1] = stackIn_21_2;
              if (Chess.field_G == 0) {
                return;
              }
            }
            this.field_d[param1] = true;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var4), "uk.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          if (param1 == 0) {
            return;
          }
          var3_int = 16773120 & param1;
          var4 = param1 & -16773121;
          if (var3_int == 4096) {
            stackIn_7_0 = this.field_g;
          } else {
            stackIn_7_0 = this.field_i;
          }
          var5 = stackIn_7_0;
          var6 = 0;
          while (var5[var6] != 0) {
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          if (param0 != 3) {
            this.a(-43, 1, false);
          }
          var5[var6] = (byte)var4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) runtimeException), "uk.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean[] param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = param2;
          this.field_d = param1;
          if (param0 != 2) {
            uk.a(true, 82);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("uk.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -105) {
            return true;
          }
          if (!this.e(param1, 97) &&
            !this.c(param1, -105)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "uk.OA(" + param0 + ',' + param1 + ')');
        }
    }

    final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 9550) {
            field_a = (String) null;
          }
          stackIn_4_0 = this.field_f[param0];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "uk.NA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean c(int param0, int param1) {
        int var3_int = 0;
        boolean[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        RuntimeException var3 = null;
        var6 = Chess.field_G;
        try {
          var3_int = this.field_m;
          var4 = new boolean[this.field_d.length];
          ne.a(this.field_d, 0, var4, 0, var4.length);
          var5 = 63;
          if (param1 > -103) {
            uk.c(-10);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 < 0))) {
            stackOut_5_0 = this.a(param0, var5, (byte) -12);
            stackIn_14_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var6 == 0) {
              if (stackIn_6_0) {
                return true;
              }
              var5--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.a(2, var4, var3_int);
            stackIn_14_0 = false;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "uk.MA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        int stackIn_54_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = Chess.field_G;
        try {
          if (0 <= this.field_m &&
            this.field_m < 64) {
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            var2_int = this.field_f[this.field_m];
            var3 = 16773120 & var2_int;
            var4 = var2_int & -16773121;
            var5 = this.field_m % 8;
            var6 = this.field_m / param0;
            if (var4 == 1) {
              if (0 == var3 &&
                var6 == 6) {
                var7 = -1;
                while (var7 <= 1) {
                  var8 = var6 + 1;
                  var9 = var5 + var7;
                  stackIn_54_0 = 0;
                  if (var11 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_54_0 <= var9 && (8 > var9 ||
                    var11 != 0)) {
                    var10 = var8 * 8 + var9;
                    if (this.field_d[var10]) {
                      return true;
                    }
                  }
                  var7++;
                }
              }
              if ((decompiledFrameCompleted1) && (0 != var3 ||
                var6 != 6 || var11 != 0) && (var3 == 4096 &&
                var6 == 1)) {
                var7Lifetime1 = -1;
                while (var7Lifetime1 <= 1) {
                  var8Lifetime1 = -1 + var6;
                  var9Lifetime1 = var5 + var7Lifetime1;
                  stackIn_54_0 = ~var9Lifetime1;
                  if (var11 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_54_0 <= -1 && (var9Lifetime1 < 8 ||
                    var11 != 0)) {
                    var10Lifetime1 = var8Lifetime1 * 8 + var9Lifetime1;
                    if (this.field_d[var10Lifetime1]) {
                      return true;
                    }
                  }
                  var7Lifetime1++;
                }
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              stackIn_54_0 = 0;
            }
            return stackIn_54_0 != 0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "uk.UA(" + param0 + ')');
        }
    }

    final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          if (param0 >= -89) {
            stackIn_3_0 = -120;
            return stackIn_3_0;
          }
          var2_int = 0;
          if (this.field_h.length == 0) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          while (var2_int < this.field_h.length) {
            if (null != this.field_h[var2_int]) {
              var2_int++;
              if (var3 == 0) {
                continue;
              }
            }
            break;
          }
          stackIn_13_0 = var2_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "uk.PA(" + param0 + ')');
        }
    }

    final boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 61) {
            uk.a(true, -111);
          }
          if (this.e(param1, 97) &&
            !this.c(param1, -111)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "uk.TA(" + param0 + ',' + param1 + ')');
        }
    }

    uk() {
        this.field_b = -1;
        this.field_i = new byte[16];
        this.field_l = -1;
        this.field_k = -1;
        this.field_n = new boolean[]{true, true, true, true};
        this.field_g = new byte[16];
        this.field_f = new int[df.field_i.length];
        this.field_m = -1;
        this.field_d = new boolean[64];
        this.field_j = -1;
        this.field_o = 0;
        this.field_h = new oj[]{};
        try {
          ne.a(df.field_i, 0, this.field_f, 0, df.field_i.length);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "uk.<init>()");
        }
    }

    static {
        field_e = false;
    }
}
