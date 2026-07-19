/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends tj {
    int[] field_t;
    private int[] field_s;
    private int[] field_L;
    static String field_q;
    private id field_w;
    private int[] field_A;
    private int[] field_m;
    private int field_G;
    private int[] field_z;
    static int field_F;
    static int field_H;
    private int[] field_u;
    private int[] field_M;
    private og field_p;
    int[] field_o;
    static int[] field_T;
    private ck[][] field_r;
    private int[] field_C;
    private int[] field_P;
    private int[] field_J;
    static ef field_U;
    private int[] field_I;
    private int[] field_B;
    private ck[][] field_R;
    private int field_O;
    private int[] field_W;
    int[] field_S;
    private bl field_x;
    private long field_v;
    private boolean field_K;
    private int field_X;
    private long field_n;
    private int field_Q;
    private int field_V;
    private vi field_y;
    private boolean field_E;

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        var3 = param1 & 240;
        if ((var3 ^ -1) != -129) {
          L0: {
            if ((var3 ^ -1) == -145) {
              var4 = 15 & param1;
              var5 = 127 & param1 >> 1532670312;
              var6 = (8371051 & param1) >> -1586025488;
              if (-1 <= (var6 ^ -1)) {
                this.b(var5, 64, var4, 26410);
                return;
              } else {
                this.a(var6, var4, var5, (byte) 108);
                break L0;
              }
            } else {
              if ((var3 ^ -1) != -161) {
                if (-177 != (var3 ^ -1)) {
                  if (192 == var3) {
                    var4 = param1 & 15;
                    var5 = 127 & param1 >> -1067588952;
                    this.b(param0 + 14189, var5 + this.field_C[var4], var4);
                    return;
                  } else {
                    if (var3 == 208) {
                      var4 = 15 & param1;
                      var5 = param1 >> 218746312 & 127;
                      this.a(param0 ^ 14287, var5, var4);
                      return;
                    } else {
                      if (var3 != 224) {
                        if (param0 == -14238) {
                          var3 = param1 & 255;
                          if (var3 != 255) {
                            return;
                          } else {
                            this.b(16, true);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        var4 = 15 & param1;
                        var5 = ((param1 & 8323286) >> 1707624585) + ((param1 & 32634) >> 1339037928);
                        this.a(var5, var4, (byte) -116);
                        return;
                      }
                    }
                  }
                } else {
                  L1: {
                    var4 = param1 & 15;
                    var5 = (32552 & param1) >> -1521572568;
                    var6 = 127 & param1 >> -1574702992;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      this.field_C[var4] = pk.a(-2080769, this.field_C[var4]) + (var6 << -922643186);
                      break L1;
                    }
                  }
                  L2: {
                    if (32 != var5) {
                      break L2;
                    } else {
                      this.field_C[var4] = (var6 << 281872327) + pk.a(this.field_C[var4], -16257);
                      break L2;
                    }
                  }
                  L3: {
                    if (1 != var5) {
                      break L3;
                    } else {
                      this.field_M[var4] = pk.a(-16257, this.field_M[var4]) + (var6 << -740540057);
                      break L3;
                    }
                  }
                  L4: {
                    if (33 != var5) {
                      break L4;
                    } else {
                      this.field_M[var4] = var6 + pk.a(-128, this.field_M[var4]);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 ^ -1) != -6) {
                      break L5;
                    } else {
                      this.field_P[var4] = pk.a(this.field_P[var4], -16257) + (var6 << -891931513);
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) != -38) {
                      break L6;
                    } else {
                      this.field_P[var4] = pk.a(-128, this.field_P[var4]) + var6;
                      break L6;
                    }
                  }
                  L7: {
                    if (7 == var5) {
                      this.field_W[var4] = pk.a(this.field_W[var4], -16257) + (var6 << 1646329575);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 39) {
                      break L8;
                    } else {
                      this.field_W[var4] = var6 + pk.a(-128, this.field_W[var4]);
                      break L8;
                    }
                  }
                  L9: {
                    if ((var5 ^ -1) != -11) {
                      break L9;
                    } else {
                      this.field_L[var4] = (var6 << 2027200967) + pk.a(-16257, this.field_L[var4]);
                      break L9;
                    }
                  }
                  L10: {
                    if (42 != var5) {
                      break L10;
                    } else {
                      this.field_L[var4] = var6 + pk.a(this.field_L[var4], -128);
                      break L10;
                    }
                  }
                  L11: {
                    if (-12 == (var5 ^ -1)) {
                      this.field_m[var4] = pk.a(-16257, this.field_m[var4]) + (var6 << -725409657);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((var5 ^ -1) != -44) {
                      break L12;
                    } else {
                      this.field_m[var4] = var6 + pk.a(-128, this.field_m[var4]);
                      break L12;
                    }
                  }
                  L13: {
                    if (-65 == (var5 ^ -1)) {
                      if (-65 < (var6 ^ -1)) {
                        this.field_o[var4] = pk.a(this.field_o[var4], -2);
                        break L13;
                      } else {
                        this.field_o[var4] = kc.a(this.field_o[var4], 1);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-66 != (var5 ^ -1)) {
                      break L14;
                    } else {
                      if (var6 >= 64) {
                        this.field_o[var4] = kc.a(this.field_o[var4], 2);
                        break L14;
                      } else {
                        this.c(var4, 2097152);
                        this.field_o[var4] = pk.a(this.field_o[var4], -3);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if ((var5 ^ -1) != -100) {
                      break L15;
                    } else {
                      this.field_J[var4] = (var6 << 2044122503) + pk.a(127, this.field_J[var4]);
                      break L15;
                    }
                  }
                  L16: {
                    if ((var5 ^ -1) == -99) {
                      this.field_J[var4] = pk.a(this.field_J[var4], 16256) - -var6;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 == 101) {
                      this.field_J[var4] = 16384 + pk.a(127, this.field_J[var4]) - -(var6 << 1987111783);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((var5 ^ -1) == -101) {
                      this.field_J[var4] = 16384 + (pk.a(16256, this.field_J[var4]) - -var6);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (-121 == (var5 ^ -1)) {
                      this.b(var4, (byte) -120);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (-122 == (var5 ^ -1)) {
                      this.a(var4, (byte) -33);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (123 != var5) {
                      break L21;
                    } else {
                      this.a(var4, 95);
                      break L21;
                    }
                  }
                  L22: {
                    if ((var5 ^ -1) != -7) {
                      break L22;
                    } else {
                      var7 = this.field_J[var4];
                      if (-16385 == (var7 ^ -1)) {
                        this.field_A[var4] = pk.a(this.field_A[var4], -16257) - -(var6 << 47765991);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (38 == var5) {
                      var7 = this.field_J[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L23;
                      } else {
                        this.field_A[var4] = pk.a(this.field_A[var4], -128) - -var6;
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (var5 == 16) {
                      this.field_S[var4] = pk.a(-16257, this.field_S[var4]) - -(var6 << 1209408359);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (-49 == (var5 ^ -1)) {
                      this.field_S[var4] = pk.a(this.field_S[var4], -128) + var6;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (81 == var5) {
                      if (64 > var6) {
                        this.a((byte) 91, var4);
                        this.field_o[var4] = pk.a(this.field_o[var4], -5);
                        break L26;
                      } else {
                        this.field_o[var4] = kc.a(this.field_o[var4], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (-18 == (var5 ^ -1)) {
                      this.e(param0 ^ 14237, var4, (-16257 & this.field_I[var4]) - -(var6 << -1895987833));
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if ((var5 ^ -1) != -50) {
                    break L0;
                  } else {
                    this.e(-1, var4, var6 + (this.field_I[var4] & -128));
                    return;
                  }
                }
              } else {
                var4 = param1 & 15;
                var5 = 127 & param1 >> -593551768;
                var6 = 127 & param1 >> -1449671632;
                this.a(var5, var6, param0 ^ -14275, var4);
                return;
              }
            }
          }
          return;
        } else {
          var4 = param1 & 15;
          var5 = (param1 & 32716) >> 1190901288;
          var6 = (param1 & 8325097) >> 1678677936;
          this.b(var5, var6, var4, 26410);
          return;
        }
    }

    final synchronized void a(int param0, boolean param1) {
        String discarded$0 = null;
        this.field_G = param0;
        if (param1) {
            CharSequence var4 = (CharSequence) null;
            discarded$0 = kf.a((CharSequence) null, (byte) -9);
        }
    }

    final synchronized void e(int param0) {
        int var3 = HoldTheLine.field_D;
        ch var4 = (ch) ((Object) this.field_p.a(param0));
        while (var4 != null) {
            var4.e(-8346);
            var4 = (ch) ((Object) this.field_p.b(-1));
        }
    }

    final synchronized tj b() {
        return null;
    }

    private final void b(int param0, byte param1) {
        ck var3 = null;
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param1 < -111) {
            break L0;
          } else {
            field_F = 43;
            break L0;
          }
        }
        var3 = (ck) ((Object) this.field_x.field_q.b((byte) 101));
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (-1 < (param0 ^ -1)) {
                  break L3;
                } else {
                  if (var3.field_p != param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var3.field_t != null) {
                  L5: {
                    var3.field_t.f(lo.field_l / 100);
                    if (!var3.field_t.g()) {
                      break L5;
                    } else {
                      this.field_x.field_p.a(var3.field_t);
                      break L5;
                    }
                  }
                  var3.b((byte) -110);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if ((var3.field_z ^ -1) > -1) {
                  this.field_R[var3.field_p][var3.field_u] = null;
                  break L6;
                } else {
                  break L6;
                }
              }
              var3.d(0);
              break L2;
            }
            var3 = (ck) ((Object) this.field_x.field_q.c((byte) -52));
            continue L1;
          }
        }
    }

    final synchronized boolean a(int param0, ld param1, vi param2, boolean param3, gn param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        be var8 = null;
        int var9 = 0;
        int var11 = 0;
        ch var12 = null;
        ch var13 = null;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              param2.a();
              if (!param3) {
                break L1;
              } else {
                this.field_v = 89L;
                break L1;
              }
            }
            L2: {
              var6_int = 1;
              var7 = null;
              if (0 < param0) {
                var7 = new int[]{param0};
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (be) ((Object) param2.field_i.a(0));
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int != 0) {
                    param2.b();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_21_0 = var6_int;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var9 = (int)var8.field_f;
                    var12 = (ch) ((Object) this.field_p.a((byte) 124, (long)var9));
                    if (var12 == null) {
                      var13 = vd.a(param4, 65535, var9);
                      if (var13 == null) {
                        var6_int = 0;
                        break L5;
                      } else {
                        this.field_p.a(var13, (long)var9, param3);
                        if (!var13.a(90, (int[]) (var7), var8.field_k, param1)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      if (!var12.a(90, (int[]) (var7), var8.field_k, param1)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var6_int = 0;
                  break L5;
                }
                var8 = (be) ((Object) param2.field_i.b(-1));
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var6);
            stackOut_23_1 = new StringBuilder().append("kf.QA(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param3).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final synchronized boolean c(byte param0) {
        int var2 = -76 % ((-64 - param0) / 62);
        return this.field_w.e();
    }

    private final int b(boolean param0, ck param1) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        ck var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
              if (!param0) {
                break L1;
              } else {
                var4 = (ck) null;
                discarded$2 = this.a((ck) null, 88);
                break L1;
              }
            }
            var3_int = this.field_L[param1.field_p];
            if (8192 <= var3_int) {
              stackOut_5_0 = 16384 + -(32 + (-param1.field_y + 128) * (16384 - var3_int) >> 731885350);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = var3_int * param1.field_y - -32 >> -1238308890;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("kf.D(").append(param0).append(',');
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
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        if (param0 != -49) {
            return;
        }
        if (param1 != this.field_u[param2]) {
            this.field_u[param2] = param1;
            for (var4 = 0; 128 > var4; var4++) {
                this.field_r[param2][var4] = null;
            }
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_w.e()) {
                  break L2;
                } else {
                  var4_int = this.field_O * this.field_w.field_a / lo.field_l;
                  L3: while (true) {
                    var5 = (long)var4_int * (long)param2 + this.field_n;
                    if (-1L < (this.field_v + -var5 ^ -1L)) {
                      var7 = (int)((this.field_v + (-this.field_n + (long)var4_int + -1L)) / (long)var4_int);
                      this.field_n = this.field_n + (long)var4_int * (long)var7;
                      this.field_x.b(param0, param1, var7);
                      param2 = param2 - var7;
                      param1 = param1 + var7;
                      this.b((byte) 9);
                      if (this.field_w.e()) {
                        continue L3;
                      } else {
                        this.field_x.b(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      this.field_n = var5;
                      break L2;
                    }
                  }
                }
              }
              this.field_x.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("kf.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 > -54) {
            this.b(117, -92, -50, -101);
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param2 != 128) {
            return;
        }
        this.field_z[param1] = param0;
        this.field_C[param1] = pk.a(param0, -128);
        this.b(param2 ^ -177, param0, param1);
    }

    private final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (param0 < 0) {
          param0 = 0;
          L0: while (true) {
            if (-17 >= (param0 ^ -1)) {
              return;
            } else {
              this.a(param0, (byte) -33);
              param0++;
              continue L0;
            }
          }
        } else {
          this.field_W[param0] = 12800;
          this.field_L[param0] = 8192;
          this.field_m[param0] = 16383;
          this.field_B[param0] = 8192;
          this.field_M[param0] = 0;
          this.field_P[param0] = 8192;
          this.c(param0, 2097152);
          this.a((byte) 91, param0);
          if (param1 == -33) {
            this.field_o[param0] = 0;
            this.field_J[param0] = 32767;
            this.field_A[param0] = 256;
            this.field_S[param0] = 0;
            this.e(-1, param0, 8192);
            return;
          } else {
            return;
          }
        }
    }

    final synchronized int c() {
        return 0;
    }

    public static void a(byte param0) {
        if (param0 != -104) {
            return;
        }
        field_U = null;
        field_T = null;
        field_q = null;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HoldTheLine.field_D;
          if (!this.field_w.e()) {
            break L0;
          } else {
            var2 = this.field_w.field_a * this.field_O / lo.field_l;
            L1: while (true) {
              var3 = this.field_n - -((long)param0 * (long)var2);
              if ((this.field_v + -var3 ^ -1L) > -1L) {
                var5 = (int)(((long)var2 + (-this.field_n + this.field_v + -1L)) / (long)var2);
                this.field_n = this.field_n + (long)var2 * (long)var5;
                param0 = param0 - var5;
                this.field_x.a(var5);
                this.b((byte) 9);
                if (!this.field_w.e()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                this.field_n = var3;
                break L0;
              }
            }
          }
        }
        this.field_x.a(param0);
    }

    final boolean a(boolean param0, ck param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0) {
              if (param1.field_t == null) {
                L1: {
                  if ((param1.field_z ^ -1) > -1) {
                    break L1;
                  } else {
                    param1.d(0);
                    if (-1 <= (param1.field_k ^ -1)) {
                      break L1;
                    } else {
                      if (param1 != this.field_r[param1.field_p][param1.field_k]) {
                        break L1;
                      } else {
                        this.field_r[param1.field_p][param1.field_k] = null;
                        return true;
                      }
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("kf.DA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HoldTheLine.field_D;
          var2 = this.field_Q;
          var3 = this.field_X;
          var4 = this.field_v;
          if (this.field_y == null) {
            break L0;
          } else {
            if (this.field_V == var3) {
              this.a(this.field_y, this.field_K, this.field_E, 57);
              this.b((byte) 9);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (this.field_X != var3) {
            L2: {
              this.field_Q = var2;
              if (param0 == 9) {
                break L2;
              } else {
                this.field_G = -73;
                break L2;
              }
            }
            L3: {
              this.field_X = var3;
              this.field_v = var4;
              if (this.field_y == null) {
                break L3;
              } else {
                if (var3 <= this.field_V) {
                  break L3;
                } else {
                  this.field_Q = -1;
                  this.field_X = this.field_V;
                  this.field_v = this.field_w.a(this.field_X);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != this.field_w.field_c[var2]) {
                  break L5;
                } else {
                  this.field_w.e(var2);
                  var6 = this.field_w.b(var2);
                  if (1 != var6) {
                    L6: {
                      if (-1 == (var6 & 128 ^ -1)) {
                        break L6;
                      } else {
                        this.d(param0 ^ -14229, var6);
                        break L6;
                      }
                    }
                    this.field_w.c(var2);
                    this.field_w.d(var2);
                    continue L4;
                  } else {
                    this.field_w.c();
                    this.field_w.d(var2);
                    if (this.field_w.g()) {
                      if (this.field_y == null) {
                        L7: {
                          if (!this.field_K) {
                            break L7;
                          } else {
                            if (-1 != (var3 ^ -1)) {
                              this.field_w.a(var4);
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.b(16, true);
                        this.field_w.b();
                        return;
                      } else {
                        this.a(-2128027000, this.field_y, this.field_K);
                        this.b((byte) 9);
                        return;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var2 = this.field_w.f();
              var3 = this.field_w.field_c[var2];
              var4 = this.field_w.a(var3);
              continue L1;
            }
          }
        }
    }

    final synchronized void f(int param0) {
        if (param0 > -123) {
            this.d(-107, -6);
        }
        this.a(false, true);
    }

    private final void e(int param0, int param1, int param2) {
        if (param0 != -1) {
            this.a(44, -22, (byte) 103);
        }
        this.field_I[param1] = param2;
        this.field_t[param1] = (int)(0.5 + Math.pow(2.0, (double)param2 * 0.00054931640625) * 2097152.0);
    }

    final synchronized void b(int param0, int param1) {
        this.field_O = param0;
        if (param1 != 2) {
            this.field_w = (id) null;
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        this.c(param0, param2, 128);
        if (param1 != -13549) {
            field_H = -43;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        this.field_B[param1] = param0;
        int var4 = 99 / ((6 - param2) / 58);
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        if (param1) {
            this.b(-1, (byte) -112);
        } else {
            this.a(-1, param0 + -91);
        }
        this.a(-1, (byte) -33);
        for (var3 = 0; (var3 ^ -1) > -17; var3++) {
            this.field_u[var3] = this.field_z[var3];
        }
        if (param0 != 16) {
            this.b(31, 118, -86);
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            this.field_C[var5] = pk.a(this.field_z[var5], -128);
            var5++;
        }
    }

    final synchronized void a(int param0, vi param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param1, param2, true, 79);
              if (param0 == -2128027000) {
                break L1;
              } else {
                this.field_E = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("kf.HA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final synchronized tj a() {
        return (tj) ((Object) this.field_x);
    }

    private final void a(byte param0, int param1) {
        ck var3 = null;
        int var4 = HoldTheLine.field_D;
        if (param0 != 91) {
            return;
        }
        if (!(0 == (4 & this.field_o[param1]))) {
            var3 = (ck) ((Object) this.field_x.field_q.b((byte) 99));
            while (var3 != null) {
                if (param1 == var3.field_p) {
                    var3.field_v = 0;
                }
                var3 = (ck) ((Object) this.field_x.field_q.c((byte) -47));
            }
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        ck var4 = null;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        var3 = 2 / ((-7 - param1) / 40);
        var4 = (ck) ((Object) this.field_x.field_q.b((byte) 106));
        L0: while (true) {
          if (var4 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (-1 < (param0 ^ -1)) {
                  break L2;
                } else {
                  if (param0 != var4.field_p) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 >= (var4.field_z ^ -1)) {
                break L1;
              } else {
                this.field_R[var4.field_p][var4.field_u] = null;
                var4.field_z = 0;
                break L1;
              }
            }
            var4 = (ck) ((Object) this.field_x.field_q.c((byte) 91));
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        ck var5 = null;
        el var6 = null;
        int var6_int = 0;
        ck var7 = null;
        ck var8 = null;
        int var9 = 0;
        ch var10 = null;
        ch var11 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ck stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ck stackIn_19_2 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ck stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ck stackOut_17_2 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ck stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ck stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        L0: {
          var9 = HoldTheLine.field_D;
          this.b(param2, 64, param1, 26410);
          if (param3 >= 94) {
            break L0;
          } else {
            this.field_C = (int[]) null;
            break L0;
          }
        }
        L1: {
          if ((2 & this.field_o[param1]) == 0) {
            break L1;
          } else {
            var5 = (ck) ((Object) this.field_x.field_q.d((byte) 124));
            L2: while (true) {
              if (var5 == null) {
                break L1;
              } else {
                L3: {
                  if (var5.field_p != param1) {
                    break L3;
                  } else {
                    if (var5.field_z < 0) {
                      this.field_R[param1][var5.field_u] = null;
                      this.field_R[param1][param2] = var5;
                      var6_int = (var5.field_n * var5.field_B >> -917037492) + var5.field_x;
                      var5.field_x = var5.field_x + (param2 - var5.field_u << 972103848);
                      var5.field_u = param2;
                      var5.field_n = 4096;
                      var5.field_B = -var5.field_x + var6_int;
                      return;
                    } else {
                      break L3;
                    }
                  }
                }
                var5 = (ck) ((Object) this.field_x.field_q.c(-4140));
                continue L2;
              }
            }
          }
        }
        var10 = (ch) ((Object) this.field_p.a((byte) 115, (long)this.field_u[param1]));
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_s[param2];
          if (var6 == null) {
            return;
          } else {
            L4: {
              var7 = new ck();
              var7.field_s = var6;
              var7.field_o = var11;
              var7.field_p = param1;
              var7.field_C = var10.field_o[param2];
              var7.field_k = var10.field_v[param2];
              var7.field_u = param2;
              var7.field_i = param0 * (param0 * var11.field_j * var10.field_k[param2]) + 1024 >> -362113077;
              var7.field_y = 255 & var10.field_l[param2];
              var7.field_x = (param2 << -2128027000) - (var10.field_q[param2] & 32767);
              var7.field_A = 0;
              var7.field_q = 0;
              var7.field_w = 0;
              var7.field_l = 0;
              var7.field_z = -1;
              if (this.field_S[param1] == 0) {
                var7.field_t = db.b(var6, this.a(var7, (byte) -121), this.a(var7, -78), this.b(false, var7));
                break L4;
              } else {
                L5: {
                  var7.field_t = db.b(var6, this.a(var7, (byte) 26), 0, this.b(false, var7));
                  stackOut_17_0 = this;
                  stackOut_17_1 = 2;
                  stackOut_17_2 = (ck) (var7);
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  if (0 <= var10.field_q[param2]) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = (ck) ((Object) stackIn_19_2);
                    stackOut_19_3 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    stackIn_20_3 = stackOut_19_3;
                    break L5;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = (ck) ((Object) stackIn_18_2);
                    stackOut_18_3 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    stackIn_20_3 = stackOut_18_3;
                    break L5;
                  }
                }
                this.a(stackIn_20_1, stackIn_20_2, stackIn_20_3 != 0);
                break L4;
              }
            }
            L6: {
              if (-1 >= (var10.field_q[param2] ^ -1)) {
                break L6;
              } else {
                var7.field_t.g(-1);
                break L6;
              }
            }
            L7: {
              if (-1 < (var7.field_k ^ -1)) {
                break L7;
              } else {
                L8: {
                  var8 = this.field_r[param1][var7.field_k];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if (-1 < (var8.field_z ^ -1)) {
                      this.field_R[param1][var8.field_u] = null;
                      var8.field_z = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                this.field_r[param1][var7.field_k] = var7;
                break L7;
              }
            }
            this.field_x.field_q.a((byte) -128, var7);
            this.field_R[param1][param2] = var7;
            return;
          }
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        this.field_w.b();
        this.field_y = null;
        if (param0) {
            this.field_R = (ck[][]) null;
        }
        this.b(16, param1);
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        if (0 <= param1) {
            this.field_s[param1] = param2;
        } else {
            for (var4 = 0; -17 < (var4 ^ -1); var4++) {
                this.field_s[var4] = param2;
            }
        }
        var4 = -113 % ((param0 - -18) / 60);
    }

    final boolean a(int[] param0, ck param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ik var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              param1.field_r = lo.field_l / 100;
              if (0 > param1.field_z) {
                break L1;
              } else {
                L2: {
                  if (param1.field_t == null) {
                    break L2;
                  } else {
                    if (param1.field_t.e()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param1.b((byte) -95);
                  param1.d(0);
                  if (0 >= param1.field_k) {
                    break L3;
                  } else {
                    if (param1 == this.field_r[param1.field_p][param1.field_k]) {
                      this.field_r[param1.field_p][param1.field_k] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param1.field_n;
              if (param3 < -41) {
                break L4;
              } else {
                this.field_t = (int[]) null;
                break L4;
              }
            }
            L5: {
              if (0 < var6_int) {
                L6: {
                  var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_P[param1.field_p]));
                  if (0 <= var6_int) {
                    break L6;
                  } else {
                    var6_int = 0;
                    break L6;
                  }
                }
                param1.field_n = var6_int;
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              param1.field_t.h(this.a(param1, (byte) -127));
              var7 = param1.field_C;
              param1.field_j = param1.field_j + var7.field_m;
              param1.field_m = param1.field_m + 1;
              var8 = 0;
              var9 = (double)((param1.field_B * param1.field_n >> -1085535860) + (param1.field_u + -60 << 124320680)) * 0.000005086263020833333;
              if ((var7.field_b ^ -1) < -1) {
                L8: {
                  if (0 >= var7.field_c) {
                    param1.field_w = param1.field_w + 128;
                    break L8;
                  } else {
                    param1.field_w = param1.field_w + (int)(128.0 * Math.pow(2.0, (double)var7.field_c * var9) + 0.5);
                    break L8;
                  }
                }
                if (819200 <= param1.field_w * var7.field_b) {
                  var8 = 1;
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L9: {
              if (var7.field_l != null) {
                L10: {
                  if (0 < var7.field_d) {
                    param1.field_A = param1.field_A + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_d) + 0.5);
                    break L10;
                  } else {
                    param1.field_A = param1.field_A + 128;
                    break L10;
                  }
                }
                L11: while (true) {
                  L12: {
                    if (var7.field_l.length + -2 <= param1.field_l) {
                      break L12;
                    } else {
                      if ((var7.field_l[param1.field_l + 2] << 607377992 & 65280) >= param1.field_A) {
                        break L12;
                      } else {
                        param1.field_l = param1.field_l + 2;
                        continue L11;
                      }
                    }
                  }
                  if (-2 + var7.field_l.length != param1.field_l) {
                    break L9;
                  } else {
                    if (-1 == (var7.field_l[1 + param1.field_l] ^ -1)) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            L13: {
              if (0 > param1.field_z) {
                break L13;
              } else {
                if (var7.field_g == null) {
                  break L13;
                } else {
                  if ((1 & this.field_o[param1.field_p]) == 0) {
                    L14: {
                      if (param1.field_k < 0) {
                        break L14;
                      } else {
                        if (this.field_r[param1.field_p][param1.field_k] != param1) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (0 >= var7.field_n) {
                        param1.field_z = param1.field_z + 128;
                        break L15;
                      } else {
                        param1.field_z = param1.field_z + (int)(128.0 * Math.pow(2.0, (double)var7.field_n * var9) + 0.5);
                        break L15;
                      }
                    }
                    L16: while (true) {
                      L17: {
                        if (-2 + var7.field_g.length <= param1.field_q) {
                          break L17;
                        } else {
                          if (param1.field_z <= (var7.field_g[param1.field_q - -2] << -330149304 & 65280)) {
                            break L17;
                          } else {
                            param1.field_q = param1.field_q + 2;
                            continue L16;
                          }
                        }
                      }
                      if (param1.field_q == var7.field_g.length + -2) {
                        var8 = 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
            }
            if (var8 != 0) {
              L18: {
                param1.field_t.f(param1.field_r);
                if (param0 == null) {
                  param1.field_t.a(param2);
                  break L18;
                } else {
                  param1.field_t.b(param0, param4, param2);
                  break L18;
                }
              }
              L19: {
                if (!param1.field_t.g()) {
                  break L19;
                } else {
                  this.field_x.field_p.a(param1.field_t);
                  break L19;
                }
              }
              L20: {
                param1.b((byte) -92);
                if (param1.field_z < 0) {
                  break L20;
                } else {
                  param1.d(0);
                  if ((param1.field_k ^ -1) >= -1) {
                    break L20;
                  } else {
                    if (this.field_r[param1.field_p][param1.field_k] != param1) {
                      break L20;
                    } else {
                      this.field_r[param1.field_p][param1.field_k] = null;
                      break L20;
                    }
                  }
                }
              }
              stackOut_65_0 = 1;
              stackIn_66_0 = stackOut_65_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param1.field_t.a(param1.field_r, this.a(param1, 72), this.b(false, param1));
              stackOut_67_0 = 0;
              stackIn_68_0 = stackOut_67_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var6);
            stackOut_69_1 = new StringBuilder().append("kf.BA(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L21;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L21;
            }
          }
          L22: {
            stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param1 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L22;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L22;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_66_0 != 0;
          } else {
            return stackIn_68_0 != 0;
          }
        }
    }

    private final int a(ck param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ik var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_x - -(param0.field_n * param0.field_B >> 99466348);
              var3_int = var3_int + (this.field_A[param0.field_p] * (-8192 + this.field_B[param0.field_p]) >> -1869538964);
              var4 = param0.field_C;
              var5 = 37 / ((param1 - -58) / 60);
              if (-1 <= (var4.field_m ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (-1 > (var4.field_h ^ -1)) {
                    break L2;
                  } else {
                    if (-1 <= (this.field_M[param0.field_p] ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = var4.field_h << 111294562;
                  var7 = var4.field_j << 1873915041;
                  if (param0.field_m < var7) {
                    var6 = var6 * param0.field_m / var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6 = var6 + (this.field_M[param0.field_p] >> -1283426009);
                var8 = Math.sin((double)(param0.field_j & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)((double)var6 * var8);
                break L1;
              }
            }
            L4: {
              var6 = (int)(0.5 + (double)(256 * param0.field_s.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)lo.field_l);
              if ((var6 ^ -1) > -2) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = var6;
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("kf.AA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final static String a(CharSequence param0, byte param1) {
        StringBuilder discarded$2 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!ag.a(-2821, param0.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                var4 = 106 % ((param1 - 45) / 45);
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!ag.a(-2821, param0.charAt(var3 - 1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var5 = var3 - var2_int;
                  if (1 <= var5) {
                    if ((var5 ^ -1) >= -13) {
                      var6 = new StringBuilder(var5);
                      var7 = var2_int;
                      L5: while (true) {
                        if (var3 <= var7) {
                          if (var6.length() != 0) {
                            return var6.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L6: {
                            var8 = param0.charAt(var7);
                            if (!sd.a((char) var8, (byte) -116)) {
                              break L6;
                            } else {
                              var9 = ba.a(true, (char) var8);
                              if (0 == var9) {
                                break L6;
                              } else {
                                discarded$2 = var6.append((char) var9);
                                break L6;
                              }
                            }
                          }
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var2);
            stackOut_27_1 = new StringBuilder().append("kf.IA(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        return (String) ((Object) stackIn_16_0);
    }

    private final void c(int param0, int param1) {
        ck var3 = null;
        int var4 = HoldTheLine.field_D;
        if (param1 != 2097152) {
            this.b(121, 39, -127);
        }
        if (!(0 == (2 & this.field_o[param0]))) {
            var3 = (ck) ((Object) this.field_x.field_q.b((byte) 100));
            while (var3 != null) {
                if (param0 == var3.field_p) {
                    if (this.field_R[param0][var3.field_u] == null) {
                        if (0 > var3.field_z) {
                            var3.field_z = 0;
                        }
                    }
                }
                var3 = (ck) ((Object) this.field_x.field_q.c((byte) -38));
            }
        }
    }

    final void a(int param0, ck param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param1.field_s.field_n.length;
                if (!param2) {
                  break L2;
                } else {
                  if (param1.field_s.field_k) {
                    var6 = var4_int - -var4_int + -param1.field_s.field_m;
                    var5 = (int)((long)this.field_S[param1.field_p] * (long)var6 >> 270854854);
                    var4_int = var4_int << 8;
                    if (var4_int > var5) {
                      break L1;
                    } else {
                      var5 = -var5 + var4_int + var4_int - 1;
                      param1.field_t.a(true);
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)this.field_S[param1.field_p] >> 176685766);
              break L1;
            }
            L3: {
              if (param0 == 2) {
                break L3;
              } else {
                this.a((byte) -59, 8);
                break L3;
              }
            }
            param1.field_t.k(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("kf.K(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    private final int a(ck param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ik var10 = null;
        ik var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (this.field_s[param0.field_p] != 0) {
              L1: {
                var10 = param0.field_C;
                var11 = var10;
                var4 = this.field_W[param0.field_p] * this.field_m[param0.field_p] + 4096 >> 784750349;
                var4 = 16384 + var4 * var4 >> -364234769;
                var4 = var4 * param0.field_i + 16384 >> -1656029521;
                var5 = -91 / ((-16 - param1) / 51);
                var4 = this.field_G * var4 - -128 >> 153535272;
                var4 = this.field_s[param0.field_p] * var4 - -128 >> -1323759000;
                if (0 >= var11.field_b) {
                  break L1;
                } else {
                  var4 = (int)((double)var4 * Math.pow(0.5, (double)var11.field_b * ((double)param0.field_w * 0.00001953125)) + 0.5);
                  break L1;
                }
              }
              L2: {
                if (var11.field_l != null) {
                  L3: {
                    var6 = param0.field_A;
                    var7 = var11.field_l[param0.field_l - -1];
                    if (param0.field_l >= var11.field_l.length + -2) {
                      break L3;
                    } else {
                      var8 = var10.field_l[param0.field_l] << 1778230056 & 65280;
                      var9 = 65280 & var11.field_l[2 + param0.field_l] << 1769436168;
                      var7 = var7 + (-var8 + var6) * (-var7 + var11.field_l[param0.field_l + 3]) / (var9 + -var8);
                      break L3;
                    }
                  }
                  var4 = var4 * var7 - -32 >> 1420505702;
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if ((param0.field_z ^ -1) >= -1) {
                  break L4;
                } else {
                  if (var11.field_g == null) {
                    break L4;
                  } else {
                    L5: {
                      var6 = param0.field_z;
                      var7 = var11.field_g[1 + param0.field_q];
                      if (param0.field_q >= var11.field_g.length - 2) {
                        break L5;
                      } else {
                        var8 = (var10.field_g[param0.field_q] & 255) << 1111398120;
                        var9 = (var11.field_g[param0.field_q + 2] & 255) << 935947560;
                        var7 = var7 + (-var8 + var6) * (var11.field_g[3 + param0.field_q] - var7) / (-var8 + var9);
                        break L5;
                      }
                    }
                    var4 = 32 + var7 * var4 >> 81570054;
                    break L4;
                  }
                }
              }
              stackOut_15_0 = var4;
              stackIn_16_0 = stackOut_15_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("kf.L(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_16_0;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        ck var6 = null;
        int var7 = 0;
        ck var8 = null;
        var7 = HoldTheLine.field_D;
        var8 = this.field_R[param2][param0];
        if (var8 != null) {
          L0: {
            if (param3 == 26410) {
              break L0;
            } else {
              this.a(82, 108, -74);
              break L0;
            }
          }
          L1: {
            this.field_R[param2][param0] = null;
            if (0 == (this.field_o[param2] & 2)) {
              var8.field_z = 0;
              break L1;
            } else {
              var6 = (ck) ((Object) this.field_x.field_q.b((byte) 117));
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  L3: {
                    if (var8.field_p != var6.field_p) {
                      break L3;
                    } else {
                      if ((var6.field_z ^ -1) <= -1) {
                        break L3;
                      } else {
                        if (var8 != var6) {
                          var8.field_z = 0;
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var6 = (ck) ((Object) this.field_x.field_q.c((byte) 122));
                  continue L2;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final synchronized void a(vi param0, boolean param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        try {
            if (param3 < 39) {
                this.field_S = (int[]) null;
            }
            this.a(false, param2);
            this.field_w.a(param0.field_j);
            this.field_K = param1 ? true : false;
            this.field_n = 0L;
            var5_int = this.field_w.a();
            for (var6 = 0; var6 < var5_int; var6++) {
                this.field_w.e(var6);
                this.field_w.c(var6);
                this.field_w.d(var6);
            }
            this.field_Q = this.field_w.f();
            this.field_X = this.field_w.field_c[this.field_Q];
            this.field_v = this.field_w.a(this.field_X);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "kf.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param2 < 59) {
            this.field_r = (ck[][]) null;
        }
    }

    public kf() {
        this.field_t = new int[16];
        this.field_A = new int[16];
        this.field_L = new int[16];
        this.field_m = new int[16];
        this.field_s = new int[16];
        this.field_u = new int[16];
        this.field_z = new int[16];
        this.field_M = new int[16];
        this.field_o = new int[16];
        this.field_P = new int[16];
        this.field_I = new int[16];
        this.field_C = new int[16];
        this.field_B = new int[16];
        this.field_G = 256;
        this.field_r = new ck[16][128];
        this.field_R = new ck[16][128];
        this.field_O = 1000000;
        this.field_S = new int[16];
        this.field_J = new int[16];
        this.field_W = new int[16];
        this.field_w = new id();
        this.field_x = new bl((kf) (this));
        this.field_p = new og(128);
        this.a((byte) 99, -1, 256);
        this.b(16, true);
    }

    kf(kf param0) {
        this.field_t = new int[16];
        this.field_A = new int[16];
        this.field_L = new int[16];
        this.field_m = new int[16];
        this.field_s = new int[16];
        this.field_u = new int[16];
        this.field_z = new int[16];
        this.field_M = new int[16];
        this.field_o = new int[16];
        this.field_P = new int[16];
        this.field_I = new int[16];
        this.field_C = new int[16];
        this.field_B = new int[16];
        this.field_G = 256;
        this.field_r = new ck[16][128];
        this.field_R = new ck[16][128];
        this.field_O = 1000000;
        this.field_S = new int[16];
        this.field_J = new int[16];
        this.field_W = new int[16];
        this.field_w = new id();
        this.field_x = new bl((kf) (this));
        try {
            this.field_p = param0.field_p;
            this.a((byte) 91, -1, 256);
            this.b(16, true);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "kf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = new int[8192];
        field_F = 0;
    }
}
