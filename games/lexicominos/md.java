/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends w {
    private int field_x;
    static db[] field_A;
    private int field_E;
    private int field_y;
    int field_K;
    private db field_z;
    private db[] field_F;
    static String field_L;
    private int field_C;
    static String field_B;
    private db field_D;
    private int field_M;
    private int field_I;
    boolean field_G;
    private db field_H;

    private final db a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        db var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        var13 = Lexicominos.field_L ? 1 : 0;
        var14 = new db(this.field_I * 2, this.field_v);
        de.a(var14, 6);
        var5 = this.field_v >> 344066273;
        if (param2 > -38) {
          return (db) null;
        } else {
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (this.field_v <= var6) {
                  break L2;
                } else {
                  var7 = (var6 >> 561276993) * (2 * this.field_I - 1) % (2 * this.field_I);
                  var8 = 16711935 & param1;
                  var9 = param1 & 65280;
                  var10 = -var5 + var6;
                  var11 = 128 - -(int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
                  stackOut_3_0 = var11;
                  stackIn_12_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var13 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_4_0 >= 256) {
                        stackOut_6_0 = var8 | var9;
                        stackIn_7_0 = stackOut_6_0;
                        break L3;
                      } else {
                        stackOut_5_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> -1584727736;
                        stackIn_7_0 = stackOut_5_0;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_7_0;
                      lf.a(var7, var6, this.field_I, var12);
                      lf.a(var7 - this.field_I * 2, var6, this.field_I, var12);
                      var9 = param0 & 65280;
                      var8 = param0 & 16711935;
                      if ((var11 ^ -1) > -257) {
                        stackOut_9_0 = (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> -1867272600;
                        stackIn_10_0 = stackOut_9_0;
                        break L4;
                      } else {
                        stackOut_8_0 = var9 | var8;
                        stackIn_10_0 = stackOut_8_0;
                        break L4;
                      }
                    }
                    var12 = stackIn_10_0;
                    lf.a(this.field_I + var7, var6, this.field_I, var12);
                    lf.a(-this.field_I + var7, var6, this.field_I, var12);
                    var6++;
                    if (var13 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_11_0 = -22949;
              stackIn_12_0 = stackOut_11_0;
              break L1;
            }
            pd.a(stackIn_12_0);
            return var14;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        this.field_E = param0;
        this.field_C = (16711422 & param0) >> -2039515423;
        this.field_M = (16711422 & param1) >> -959690047;
        if (param2 <= 68) {
          this.field_H = (db) null;
          this.field_x = param1;
          this.f(-90);
          return;
        } else {
          this.field_x = param1;
          this.f(-90);
          return;
        }
    }

    md(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -363799263 & 8355711, param6 >> 796309793 & 8355711);
    }

    private final db d(boolean param0) {
        int var2 = 0;
        db var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        w var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_14_0 = false;
        var9 = Lexicominos.field_L ? 1 : 0;
        var2 = this.field_v >> 1875780257;
        var3 = new db(var2, this.field_v);
        de.a(var3, 6);
        var4 = 0;
        L0: while (true) {
          stackOut_1_0 = var4;
          stackIn_2_0 = stackOut_1_0;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 >= this.field_v) {
                  break L3;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_15_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L2;
                  } else {
                    var5 = stackIn_4_0;
                    L4: while (true) {
                      if (var2 <= var5) {
                        var4++;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      } else {
                        var6 = (double)var5 * (double)var5 / (double)((this.field_v + -var4) * var4);
                        var8 = 1;
                        stackOut_6_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                        stackIn_2_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var9 != 0) {
                          continue L1;
                        } else {
                          L5: {
                            if (stackIn_7_0 >= 0) {
                              break L5;
                            } else {
                              L6: {
                                var6 = Math.sqrt(1.0 - var6);
                                if (1.0 > var6) {
                                  stackOut_10_0 = (int)(var6 * 255.0);
                                  stackIn_11_0 = stackOut_10_0;
                                  break L6;
                                } else {
                                  stackOut_9_0 = 255;
                                  stackIn_11_0 = stackOut_9_0;
                                  break L6;
                                }
                              }
                              var8 = stackIn_11_0;
                              break L5;
                            }
                          }
                          lf.a(var5, var4, var8 << 1252259600 | (var8 << -1444140344 | var8));
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
              pd.a(-22949);
              stackOut_14_0 = param0;
              stackIn_15_0 = stackOut_14_0 ? 1 : 0;
              break L2;
            }
            if (stackIn_15_0 != 0) {
              var10 = (w) null;
              this.a((byte) 4, (w) null, -98, 94);
              return var3;
            } else {
              return var3;
            }
          }
        }
    }

    public static void e(int param0) {
        boolean discarded$2 = false;
        String var2 = null;
        if (param0 != 344066273) {
          var2 = (String) null;
          discarded$2 = md.a((String) null, 98);
          field_L = null;
          field_B = null;
          field_A = null;
          return;
        } else {
          field_L = null;
          field_B = null;
          field_A = null;
          return;
        }
    }

    final void a(byte param0, w param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_G) {
                break L1;
              } else {
                this.field_y = this.field_y + 1;
                if (this.field_y > 2 * this.field_I) {
                  this.field_y = this.field_y - 2 * this.field_I;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == -119) {
              break L0;
            } else {
              this.b(94, -94, -98);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("md.FA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -86) {
                break L1;
              } else {
                md.e(-86);
                break L1;
              }
            }
            var3 = (CharSequence) ((Object) param0);
            stackOut_2_0 = cb.field_t.equals(ck.a(var3, (byte) -48));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("md.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (-1 != (param3 ^ -1)) {
          return;
        } else {
          var5 = this.field_t + param2;
          var6 = param1 + this.field_o;
          this.a(this.field_F[0], var6, 16711935, var5);
          if (this.field_K >= 65536) {
            if (param0 != -115) {
              this.b(-108, -108, -95);
              return;
            } else {
              return;
            }
          } else {
            ca.a(var5 + this.field_j, var6, var5 - -(this.field_K * this.field_j >> 2069378928), var6 + this.field_v, false);
            this.a(this.field_F[1], var6, param0 + 16712050, var5);
            pd.a(param0 ^ 22998);
            if (param0 == -115) {
              return;
            } else {
              this.b(-108, -108, -95);
              return;
            }
          }
        }
    }

    private final void f(int param0) {
        db discarded$1 = null;
        this.field_F = new db[]{this.a(this.field_E, this.field_x, (byte) -50), this.a(this.field_C, this.field_M, (byte) -98)};
        if (param0 >= -59) {
          discarded$1 = this.d(false);
          this.field_H = this.d(false);
          this.field_z = this.field_H.g();
          this.field_D = new db(this.field_v >> 953499905, this.field_v);
          return;
        } else {
          this.field_H = this.d(false);
          this.field_z = this.field_H.g();
          this.field_D = new db(this.field_v >> 953499905, this.field_v);
          return;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f(-72);
    }

    private final void a(db param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = param3 + this.field_j;
            ca.a(-this.field_H.field_p + var5_int, param1, this.field_H.field_p + param3, this.field_v + param1, false);
            var6 = -this.field_y + param3;
            L1: while (true) {
              L2: {
                if (var5_int <= var6) {
                  pd.a(-22949);
                  break L2;
                } else {
                  param0.d(var6, param1);
                  var6 = var6 + param0.field_p;
                  if (var8 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                if (lf.field_g <= param3 + this.field_H.field_p) {
                  de.a(this.field_D, param2 + -16711929);
                  param0.d(-this.field_y, 0);
                  param0.d(-this.field_y + 2 * this.field_I, 0);
                  this.field_z.e(0, 0);
                  pd.a(-22949);
                  this.field_D.d(param3, param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (lf.field_e >= var5_int - this.field_H.field_p) {
                  de.a(this.field_D, 6);
                  var7 = this.field_j + -this.field_H.field_p + this.field_y;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (2 * this.field_I >= var7) {
                          break L7;
                        } else {
                          var7 = var7 - 2 * this.field_I;
                          if (var8 != 0) {
                            break L6;
                          } else {
                            if (var8 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      param0.d(-var7, 0);
                      param0.d(2 * this.field_I - var7, 0);
                      this.field_H.e(0, 0);
                      pd.a(-22949);
                      break L6;
                    }
                    this.field_D.d(var5_int + -this.field_H.field_p, param1);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              if (param2 == 16711935) {
                break L0;
              } else {
                this.field_K = -126;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("md.F(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private md(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_x = param5;
        this.field_E = param6;
        this.field_C = param8;
        this.field_I = param4;
        this.field_M = param7;
        this.a(param3, param2, true, param1, param0);
    }

    static {
        field_B = "Reload game";
        field_L = "LONGER";
    }
}
