/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private long[] field_k;
    private long[] field_b;
    private byte[] field_h;
    static int[] field_j;
    private long[] field_f;
    private int field_d;
    private byte[] field_i;
    static int[] field_e;
    private int field_g;
    static int field_a;
    private long[] field_m;
    private long[] field_n;
    static int field_c;
    static pj field_l;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 32) {
            this.field_g = 0;
            this.field_h[0] = (byte)param0;
            this.field_d = 0;
            var2 = 0;
            L1: while (true) {
              if (-9 < (var2 ^ -1)) {
                this.field_k[var2] = 0L;
                var2++;
                if (var3 == 0) {
                  continue L1;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            this.field_i[var2] = (byte) 0;
            var2++;
            if (var3 != 0) {
              var2 = 0;
              L2: while (true) {
                if (-9 < (var2 ^ -1)) {
                  this.field_k[var2] = 0L;
                  var2++;
                  if (var3 == 0) {
                    continue L2;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              continue L0;
            }
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void b(int param0) {
        sj discarded$2 = null;
        hb var2 = null;
        field_j = null;
        if (param0 != 8) {
          var2 = (hb) null;
          discarded$2 = gi.a(-67, (hb) null);
          field_e = null;
          field_l = null;
          return;
        } else {
          field_e = null;
          field_l = null;
          return;
        }
    }

    final static sj a(int param0, hb param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        sj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sj stackIn_5_0 = null;
        sj stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_30_0 = null;
        sj stackOut_4_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.f(8, 8);
            if (0 >= var2_int) {
              if (param0 <= -43) {
                L1: {
                  var3 = vg.a(89, param1) ? 1 : 0;
                  var4 = vg.a(91, param1) ? 1 : 0;
                  var5 = new sj();
                  var5.field_e = (short)param1.f(8, 16);
                  var5.field_O = nf.a(false, param1, 16, var5.field_O);
                  var5.field_M = nf.a(false, param1, 16, var5.field_M);
                  var5.field_z = nf.a(false, param1, 16, var5.field_z);
                  var5.field_k = (short)param1.f(8, 16);
                  var5.field_u = nf.a(false, param1, 16, var5.field_u);
                  var5.field_L = nf.a(false, param1, 16, var5.field_L);
                  var5.field_C = nf.a(false, param1, 16, var5.field_C);
                  if (var3 != 0) {
                    var5.field_r = (short)param1.f(8, 16);
                    var5.field_y = nf.a(false, param1, 16, var5.field_y);
                    var5.field_p = nf.a(false, param1, 16, var5.field_p);
                    var5.field_K = nf.a(false, param1, 16, var5.field_K);
                    var5.field_d = nf.a(false, param1, 16, var5.field_d);
                    var5.field_n = nf.a(false, param1, 16, var5.field_n);
                    var5.field_A = nf.a(false, param1, 16, var5.field_A);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var4 != 0) {
                    discarded$1 = param1.f(8, 16);
                    var5.field_m = nf.a(false, param1, 16, var5.field_m);
                    var5.field_h = nf.a(false, param1, 16, var5.field_h);
                    var5.field_a = nf.a(false, param1, 16, var5.field_a);
                    var5.field_I = nf.a(false, param1, 16, var5.field_I);
                    var5.field_l = nf.a(false, param1, 16, var5.field_l);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!vg.a(74, param1)) {
                    break L3;
                  } else {
                    var5.field_c = nf.a(false, param1, 16, var5.field_c);
                    break L3;
                  }
                }
                L4: {
                  if (!vg.a(75, param1)) {
                    break L4;
                  } else {
                    var5.field_N = kk.a(16, param1, var5.field_N, (byte) 99);
                    var6 = 0;
                    var7 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var5.field_N.length <= var7) {
                            break L7;
                          } else {
                            var10 = var5.field_N[var7] & 255 ^ -1;
                            var9 = var6 ^ -1;
                            if (var8 != 0) {
                              if (var9 == var10) {
                                var5.field_N = null;
                                break L4;
                              } else {
                                break L6;
                              }
                            } else {
                              L8: {
                                if (var9 <= var10) {
                                  break L8;
                                } else {
                                  var6 = 255 & var5.field_N[var7];
                                  break L8;
                                }
                              }
                              var7++;
                              if (var8 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (-1 == (var6 ^ -1)) {
                          var5.field_N = null;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                      var5.field_D = (byte)(var6 + 1);
                      if (var8 == 0) {
                        break L4;
                      } else {
                        var5.field_N = null;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_30_0 = (sj) (var5);
                stackIn_31_0 = stackOut_30_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (sj) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var2);
            stackOut_32_1 = new StringBuilder().append("gi.G(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_31_0;
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], 128 >>> ch.a(this.field_g, 7));
              this.field_d = this.field_d + 1;
              if (this.field_d > 32) {
                L2: while (true) {
                  if (-65 >= (this.field_d ^ -1)) {
                    this.a(16);
                    this.field_d = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_d;
                    this.field_d = this.field_d + 1;
                    this.field_h[fieldTemp$2] = (byte) 0;
                    if (var8 != 0) {
                      this.field_d = 0;
                      break L1;
                    } else {
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        this.a(16);
                        this.field_d = 0;
                        break L1;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (32 <= this.field_d) {
                    break L5;
                  } else {
                    fieldTemp$3 = this.field_d;
                    this.field_d = this.field_d + 1;
                    this.field_h[fieldTemp$3] = (byte) 0;
                    if (var8 != 0) {
                      break L4;
                    } else {
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                gl.a(this.field_i, 0, this.field_h, 32, 32);
                this.a(16);
                break L4;
              }
              var4_int = 0;
              if (param1 == -70) {
                var5 = param0;
                L6: while (true) {
                  if (-9 >= (var4_int ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var6 = this.field_k[var4_int];
                    param2[var5] = (byte)(int)(var6 >>> 2035938616);
                    param2[1 + var5] = (byte)(int)(var6 >>> -1782182928);
                    param2[2 + var5] = (byte)(int)(var6 >>> 955900712);
                    param2[var5 + 3] = (byte)(int)(var6 >>> 2141970336);
                    param2[4 + var5] = (byte)(int)(var6 >>> -1439427048);
                    param2[var5 - -5] = (byte)(int)(var6 >>> 1621561616);
                    param2[var5 - -6] = (byte)(int)(var6 >>> 1119480776);
                    param2[var5 - -7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    if (var8 == 0) {
                      continue L6;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("gi.B(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, String param1, String param2) {
        sj discarded$2 = null;
        RuntimeException runtimeException = null;
        hb var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ff.a(false, -109, param2, param1);
              if (param0 >= 35) {
                break L1;
              } else {
                var4 = (hb) null;
                discarded$2 = gi.a(-117, (hb) null);
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
            stackOut_3_1 = new StringBuilder().append("gi.C(").append(param0).append(',');
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
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(long param0, int param1, byte[] param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 8 + -((int)param0 & 7) & 7;
            var7 = 7 & this.field_g;
            if (param1 < -51) {
              var9 = param0;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          if (-1 < (var11 ^ -1)) {
                            break L6;
                          } else {
                            var12 = var12 + ((this.field_i[var11] & 255) - -(255 & (int)var9));
                            this.field_i[var11] = (byte)var12;
                            var12 = var12 >>> 8;
                            var9 = var9 >>> 8;
                            var11--;
                            if (var13 != 0) {
                              break L5;
                            } else {
                              if (var13 == 0) {
                                continue L1;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L7: while (true) {
                          if (8L >= param0) {
                            break L5;
                          } else {
                            var8 = param2[var5_int] << var6 & 255 | (param2[var5_int - -1] & 255) >>> -var6 + 8;
                            var15 = var8;
                            var14 = 0;
                            if (var13 != 0) {
                              if (var14 != var15) {
                                break L3;
                              } else {
                                break L4;
                              }
                            } else {
                              L8: {
                                if (var14 > var15) {
                                  break L8;
                                } else {
                                  if (var8 >= 256) {
                                    break L8;
                                  } else {
                                    L9: {
                                      this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], var8 >>> var7);
                                      this.field_d = this.field_d + 1;
                                      this.field_g = this.field_g + (8 - var7);
                                      if (512 == this.field_g) {
                                        this.a(16);
                                        this.field_d = 0;
                                        this.field_g = 0;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    this.field_h[this.field_d] = (byte)ch.a(var8 << -var7 + 8, 255);
                                    param0 = param0 - 8L;
                                    var5_int++;
                                    this.field_g = this.field_g + var7;
                                    if (var13 == 0) {
                                      continue L7;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              throw new RuntimeException("LOGIC ERROR");
                            }
                          }
                        }
                      }
                      L10: {
                        L11: {
                          if ((param0 ^ -1L) >= -1L) {
                            break L11;
                          } else {
                            var8 = param2[var5_int] << var6 & 255;
                            this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], var8 >>> var7);
                            if (var13 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var8 = 0;
                        break L10;
                      }
                      L12: {
                        if ((param0 + (long)var7 ^ -1L) <= -9L) {
                          break L12;
                        } else {
                          this.field_g = (int)((long)this.field_g + param0);
                          if (var13 == 0) {
                            break L2;
                          } else {
                            break L12;
                          }
                        }
                      }
                      this.field_g = this.field_g + (-var7 + 8);
                      param0 = param0 - (long)(8 - var7);
                      this.field_d = this.field_d + 1;
                      if (-513 != (this.field_g ^ -1)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    this.a(16);
                    this.field_g = 0;
                    this.field_d = 0;
                    break L3;
                  }
                  this.field_h[this.field_d] = (byte)ch.a(var8 << 8 + -var7, 255);
                  this.field_g = this.field_g + (int)param0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var5);
            stackOut_31_1 = new StringBuilder().append("gi.E(").append(param0).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L13;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L13;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0) {
        sj discarded$2 = null;
        sj discarded$3 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hb var7 = null;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_102_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if ((var2 ^ -1) <= -9) {
              var2 = 0;
              break L1;
            } else {
              this.field_n[var2] = hd.a(hd.a(hd.a(sk.a((long)this.field_h[var3 - -5], 255L) << -1933703344, hd.a(hd.a(sk.a((long)this.field_h[3 + var3] << -1861031328, 1095216660480L), hd.a(hd.a(sk.a((long)this.field_h[1 + var3] << 804360944, 71776119061217280L), (long)this.field_h[var3] << 744230520), sk.a((long)this.field_h[var3 + 2] << 867267688, 280375465082880L))), sk.a((long)this.field_h[var3 + 4], 255L) << 925766488)), sk.a((long)this.field_h[var3 - -6], 255L) << 1475049800), sk.a((long)this.field_h[var3 + 7], 255L));
              var3 += 8;
              var2++;
              if (var6 != 0) {
                break L1;
              } else {
                if (var6 == 0) {
                  continue L0;
                } else {
                  var2 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if ((var2 ^ -1) <= -9) {
                          break L4;
                        } else {
                          this.field_f[var2] = this.field_k[var2];
                          this.field_m[var2] = hd.a(this.field_n[var2], this.field_k[var2]);
                          var2++;
                          if (var6 != 0) {
                            break L3;
                          } else {
                            if (var6 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var2 = 1;
                      break L3;
                    }
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (-11 > (var2 ^ -1)) {
                            break L7;
                          } else {
                            stackOut_11_0 = 0;
                            stackIn_49_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (var6 != 0) {
                              break L6;
                            } else {
                              var3 = stackIn_12_0;
                              L8: while (true) {
                                L9: {
                                  L10: {
                                    if (-9 >= (var3 ^ -1)) {
                                      break L10;
                                    } else {
                                      this.field_b[var3] = 0L;
                                      var4 = 0;
                                      stackOut_14_0 = 56;
                                      stackIn_23_0 = stackOut_14_0;
                                      stackIn_15_0 = stackOut_14_0;
                                      if (var6 != 0) {
                                        break L9;
                                      } else {
                                        var5 = stackIn_15_0;
                                        L11: while (true) {
                                          L12: {
                                            L13: {
                                              if (-9 >= (var4 ^ -1)) {
                                                break L13;
                                              } else {
                                                this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a((int)(this.field_f[ch.a(var3 + -var4, 7)] >>> var5), 255)]);
                                                var4++;
                                                var5 -= 8;
                                                if (var6 != 0) {
                                                  break L12;
                                                } else {
                                                  if (var6 == 0) {
                                                    continue L11;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                            }
                                            var3++;
                                            break L12;
                                          }
                                          if (var6 == 0) {
                                            continue L8;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_22_0 = 0;
                                  stackIn_23_0 = stackOut_22_0;
                                  break L9;
                                }
                                var3 = stackIn_23_0;
                                L14: while (true) {
                                  L15: {
                                    if (-9 >= (var3 ^ -1)) {
                                      this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                                      break L15;
                                    } else {
                                      this.field_f[var3] = this.field_b[var3];
                                      var3++;
                                      if (var6 != 0) {
                                        break L15;
                                      } else {
                                        if (var6 == 0) {
                                          continue L14;
                                        } else {
                                          this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                  var3 = 0;
                                  L16: while (true) {
                                    L17: {
                                      L18: {
                                        if (-9 >= (var3 ^ -1)) {
                                          break L18;
                                        } else {
                                          this.field_b[var3] = this.field_f[var3];
                                          var4 = 0;
                                          stackOut_32_0 = 56;
                                          stackIn_41_0 = stackOut_32_0;
                                          stackIn_33_0 = stackOut_32_0;
                                          if (var6 != 0) {
                                            break L17;
                                          } else {
                                            var5 = stackIn_33_0;
                                            L19: while (true) {
                                              L20: {
                                                L21: {
                                                  if ((var4 ^ -1) <= -9) {
                                                    break L21;
                                                  } else {
                                                    this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a(255, (int)(this.field_m[ch.a(7, var3 - var4)] >>> var5))]);
                                                    var4++;
                                                    var5 -= 8;
                                                    if (var6 != 0) {
                                                      break L20;
                                                    } else {
                                                      if (var6 == 0) {
                                                        continue L19;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                }
                                                var3++;
                                                break L20;
                                              }
                                              if (var6 == 0) {
                                                continue L16;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_40_0 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      break L17;
                                    }
                                    var3 = stackIn_41_0;
                                    L22: while (true) {
                                      L23: {
                                        L24: {
                                          if (-9 >= (var3 ^ -1)) {
                                            break L24;
                                          } else {
                                            this.field_m[var3] = this.field_b[var3];
                                            var3++;
                                            if (var6 != 0) {
                                              break L23;
                                            } else {
                                              if (var6 == 0) {
                                                continue L22;
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                        }
                                        var2++;
                                        break L23;
                                      }
                                      if (var6 == 0) {
                                        continue L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_48_0 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        break L6;
                      }
                      var2 = stackIn_49_0;
                      L25: while (true) {
                        if (var2 < 8) {
                          this.field_k[var2] = hd.a(this.field_k[var2], hd.a(this.field_n[var2], this.field_m[var2]));
                          var2++;
                          if (var6 == 0) {
                            continue L25;
                          } else {
                            return;
                          }
                        } else {
                          L26: {
                            if (param0 == 16) {
                              break L26;
                            } else {
                              var7 = (hb) null;
                              discarded$2 = gi.a(-34, (hb) null);
                              break L26;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L27: while (true) {
            L28: {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                break L28;
              } else {
                this.field_f[var2] = this.field_k[var2];
                this.field_m[var2] = hd.a(this.field_n[var2], this.field_k[var2]);
                var2++;
                if (var6 != 0) {
                  break L28;
                } else {
                  continue L27;
                }
              }
            }
            L29: while (true) {
              L30: {
                L31: {
                  if (-11 > (var2 ^ -1)) {
                    break L31;
                  } else {
                    stackOut_65_0 = 0;
                    stackIn_103_0 = stackOut_65_0;
                    stackIn_66_0 = stackOut_65_0;
                    if (var6 != 0) {
                      break L30;
                    } else {
                      var3 = stackIn_66_0;
                      L32: while (true) {
                        L33: {
                          L34: {
                            if (-9 >= (var3 ^ -1)) {
                              break L34;
                            } else {
                              this.field_b[var3] = 0L;
                              var4 = 0;
                              stackOut_68_0 = 56;
                              stackIn_77_0 = stackOut_68_0;
                              stackIn_69_0 = stackOut_68_0;
                              if (var6 != 0) {
                                break L33;
                              } else {
                                var5 = stackIn_69_0;
                                L35: while (true) {
                                  L36: {
                                    L37: {
                                      if (-9 >= (var4 ^ -1)) {
                                        break L37;
                                      } else {
                                        this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a((int)(this.field_f[ch.a(var3 + -var4, 7)] >>> var5), 255)]);
                                        var4++;
                                        var5 -= 8;
                                        if (var6 != 0) {
                                          break L36;
                                        } else {
                                          if (var6 == 0) {
                                            continue L35;
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                    }
                                    var3++;
                                    break L36;
                                  }
                                  if (var6 == 0) {
                                    continue L32;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_76_0 = 0;
                          stackIn_77_0 = stackOut_76_0;
                          break L33;
                        }
                        var3 = stackIn_77_0;
                        L38: while (true) {
                          L39: {
                            if (-9 >= (var3 ^ -1)) {
                              this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                              break L39;
                            } else {
                              this.field_f[var3] = this.field_b[var3];
                              var3++;
                              if (var6 != 0) {
                                break L39;
                              } else {
                                if (var6 == 0) {
                                  continue L38;
                                } else {
                                  this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                                  break L39;
                                }
                              }
                            }
                          }
                          var3 = 0;
                          L40: while (true) {
                            L41: {
                              L42: {
                                if (-9 >= (var3 ^ -1)) {
                                  break L42;
                                } else {
                                  this.field_b[var3] = this.field_f[var3];
                                  var4 = 0;
                                  stackOut_86_0 = 56;
                                  stackIn_95_0 = stackOut_86_0;
                                  stackIn_87_0 = stackOut_86_0;
                                  if (var6 != 0) {
                                    break L41;
                                  } else {
                                    var5 = stackIn_87_0;
                                    L43: while (true) {
                                      L44: {
                                        L45: {
                                          if ((var4 ^ -1) <= -9) {
                                            break L45;
                                          } else {
                                            this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a(255, (int)(this.field_m[ch.a(7, var3 - var4)] >>> var5))]);
                                            var4++;
                                            var5 -= 8;
                                            if (var6 != 0) {
                                              break L44;
                                            } else {
                                              if (var6 == 0) {
                                                continue L43;
                                              } else {
                                                break L45;
                                              }
                                            }
                                          }
                                        }
                                        var3++;
                                        break L44;
                                      }
                                      if (var6 == 0) {
                                        continue L40;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_94_0 = 0;
                              stackIn_95_0 = stackOut_94_0;
                              break L41;
                            }
                            var3 = stackIn_95_0;
                            L46: while (true) {
                              L47: {
                                L48: {
                                  if (-9 >= (var3 ^ -1)) {
                                    break L48;
                                  } else {
                                    this.field_m[var3] = this.field_b[var3];
                                    var3++;
                                    if (var6 != 0) {
                                      break L47;
                                    } else {
                                      if (var6 == 0) {
                                        continue L46;
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                }
                                var2++;
                                break L47;
                              }
                              if (var6 == 0) {
                                continue L29;
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_102_0 = 0;
                stackIn_103_0 = stackOut_102_0;
                break L30;
              }
              var2 = stackIn_103_0;
              L49: while (true) {
                if (var2 >= 8) {
                  if (param0 == 16) {
                    return;
                  } else {
                    var7 = (hb) null;
                    discarded$3 = gi.a(-34, (hb) null);
                    return;
                  }
                } else {
                  this.field_k[var2] = hd.a(this.field_k[var2], hd.a(this.field_n[var2], this.field_m[var2]));
                  var2++;
                  if (var6 == 0) {
                    continue L49;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    gi() {
        this.field_k = new long[8];
        this.field_f = new long[8];
        this.field_i = new byte[32];
        this.field_b = new long[8];
        this.field_d = 0;
        this.field_n = new long[8];
        this.field_h = new byte[64];
        this.field_m = new long[8];
        this.field_g = 0;
    }

    static {
        field_j = new int[8192];
        field_l = new pj();
    }
}
