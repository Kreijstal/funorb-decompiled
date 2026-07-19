/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    short[] field_I;
    short[] field_j;
    int field_v;
    short[] field_h;
    short[] field_P;
    short[] field_e;
    byte field_N;
    short[] field_d;
    int[] field_C;
    private boolean field_f;
    int[] field_y;
    short field_H;
    int[] field_o;
    short[] field_c;
    int[] field_u;
    int field_m;
    int[] field_r;
    short[] field_a;
    short field_w;
    short[] field_B;
    short field_A;
    short[] field_b;
    byte[] field_J;
    short[] field_q;
    short[] field_s;
    static ab field_n;
    short[] field_g;
    short[] field_k;
    int field_G;
    int[] field_p;
    int field_F;
    int[] field_t;
    short[] field_z;
    short[] field_E;
    int[] field_l;
    int field_M;
    static String field_D;
    int[] field_i;
    short[] field_x;
    short[] field_K;
    int field_O;

    public static void a(int param0) {
        if (param0 != 15569) {
          pk.a(-101, 70, -94, -69, -87);
          field_D = null;
          field_n = null;
          return;
        } else {
          field_D = null;
          field_n = null;
          return;
        }
    }

    final void a(byte param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ab var13 = null;
        int var14 = 0;
        int var15 = 0;
        var12 = Lexicominos.field_L ? 1 : 0;
        if (!this.field_f) {
          this.field_f = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var8 >= this.field_w) {
                  break L2;
                } else {
                  var9 = this.field_h[var8];
                  var10 = this.field_I[var8];
                  var15 = var6;
                  var14 = var10;
                  if (var12 != 0) {
                    if (var14 != var15) {
                      break L1;
                    } else {
                      this.field_M = var3;
                      this.field_O = var4;
                      return;
                    }
                  } else {
                    L3: {
                      if (var14 <= var15) {
                        break L3;
                      } else {
                        var6 = var10;
                        break L3;
                      }
                    }
                    L4: {
                      if (var9 < var2) {
                        var2 = var9;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 < var9) {
                        var5 = var9;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (var10 >= var3) {
                        break L6;
                      } else {
                        var3 = var10;
                        break L6;
                      }
                    }
                    L7: {
                      var11 = this.field_g[var8];
                      if (var11 > var7) {
                        var7 = var11;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 > var11) {
                        var4 = var11;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var8++;
                    if (var12 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_F = var7;
              this.field_m = var2;
              this.field_v = var5;
              this.field_G = var6;
              if (param0 != -50) {
                break L1;
              } else {
                this.field_M = var3;
                this.field_O = var4;
                return;
              }
            }
            var13 = (ab) null;
            discarded$1 = pk.a((ab) null, 77);
            this.field_M = var3;
            this.field_O = var4;
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0) {
        this.field_f = false;
        if (param0 != 2933) {
            this.field_q = (short[]) null;
        }
    }

    final static boolean a(ab param0, int param1) {
        RuntimeException var2 = null;
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
              if (param1 < -74) {
                break L1;
              } else {
                pk.a(-91);
                break L1;
              }
            }
            stackOut_2_0 = param0.b(0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("pk.B(");
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

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= this.field_w) {
            if (!param2) {
              this.b(2933);
              return;
            } else {
              this.a(-72, 18, true, -78);
              this.b(2933);
              return;
            }
          } else {
            this.field_h[var5] = (short)(this.field_h[var5] + param3);
            this.field_I[var5] = (short)(this.field_I[var5] + param1);
            this.field_g[var5] = (short)(this.field_g[var5] + param0);
            var5++;
            if (var6 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2 + param4;
              if (param3 == 1) {
                break L1;
              } else {
                field_n = (ab) null;
                break L1;
              }
            }
            L2: {
              var6 = param1 + param0;
              if (lf.field_g < param2) {
                stackOut_5_0 = param2;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = lf.field_g;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_6_0;
              if (lf.field_c >= param1) {
                stackOut_8_0 = lf.field_c;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = param1;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var8 = stackIn_9_0;
              if (var5_int >= lf.field_e) {
                stackOut_11_0 = lf.field_e;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = var5_int;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_12_0;
              if (lf.field_h > var6) {
                stackOut_14_0 = var6;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = lf.field_h;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              L7: {
                L8: {
                  L9: {
                    var10 = stackIn_15_0;
                    if (param2 < lf.field_g) {
                      break L9;
                    } else {
                      if (lf.field_e <= param2) {
                        break L9;
                      } else {
                        var11 = var8 * lf.field_f - -param2;
                        var12 = 1 + var10 + -var8 >> 1982519169;
                        L10: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L9;
                          } else {
                            lf.field_b[var11] = 16777215;
                            var11 = var11 + 2 * lf.field_f;
                            if (var13 != 0) {
                              break L8;
                            } else {
                              if (var13 == 0) {
                                continue L10;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param1 < lf.field_c) {
                    break L8;
                  } else {
                    if (lf.field_h <= var6) {
                      break L8;
                    } else {
                      var11 = var7 + lf.field_f * param1;
                      var12 = 1 - (-var9 - -var7) >> 1216263329;
                      L11: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L8;
                        } else {
                          lf.field_b[var11] = 16777215;
                          var11 += 2;
                          if (var13 != 0) {
                            break L7;
                          } else {
                            if (var13 == 0) {
                              continue L11;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (lf.field_g > var5_int) {
                  break L7;
                } else {
                  if (lf.field_e <= var5_int) {
                    break L7;
                  } else {
                    var11 = var5_int + lf.field_f * (var8 + (var5_int + -param2 & 1));
                    var12 = -var8 + (var10 + 1) >> 882822273;
                    L12: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L7;
                      } else {
                        lf.field_b[var11] = 16777215;
                        var11 = var11 + lf.field_f * 2;
                        if (var13 != 0) {
                          break L6;
                        } else {
                          if (var13 == 0) {
                            continue L12;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (param1 < lf.field_c) {
                break L6;
              } else {
                if (lf.field_h > var6) {
                  var11 = var7 + lf.field_f * var6 - -(1 & -param1 + var6);
                  var12 = 1 + var9 - var7 >> 1444582337;
                  L13: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L6;
                    } else {
                      lf.field_b[var11] = 16777215;
                      var11 += 2;
                      if (var13 == 0) {
                        continue L13;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var5), "pk.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (this.field_w <= var6) {
            this.b(2933);
            if (param2 > 44) {
              return;
            } else {
              pk.a(-33);
              return;
            }
          } else {
            this.field_h[var6] = (short)(param4 * this.field_h[var6] / param3);
            this.field_I[var6] = (short)(this.field_I[var6] * param1 / param3);
            this.field_g[var6] = (short)(this.field_g[var6] * param0 / param3);
            var6++;
            if (var7 != 0) {
              if (param2 <= 44) {
                pk.a(-33);
                return;
              } else {
                return;
              }
            } else {
              if (var7 == 0) {
                continue L0;
              } else {
                this.b(2933);
                if (param2 > 44) {
                  return;
                } else {
                  pk.a(-33);
                  return;
                }
              }
            }
          }
        }
    }

    pk() {
        this.field_N = (byte) 0;
        this.field_f = false;
    }

    static {
        field_D = "Longer words score many more points than shorter words.";
    }
}
