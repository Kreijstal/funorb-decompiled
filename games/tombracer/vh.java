/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private long[] field_m;
    private long[] field_j;
    private long[] field_f;
    private byte[] field_d;
    private int field_a;
    static String field_c;
    private long[] field_i;
    static int field_g;
    private long[] field_l;
    static String field_b;
    private int field_k;
    private byte[] field_e;
    static float[] field_h;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_51_0 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          if (!param0) {
            break L0;
          } else {
            this.a(false);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var2 ^ -1) <= -9) {
                break L3;
              } else {
                this.field_m[var2] = oo.a(oo.a(oo.a(oo.a(vi.a((long)this.field_e[4 + var3] << -1477755624, 4278190080L), oo.a(vi.a(255L, (long)this.field_e[3 + var3]) << -695232672, oo.a(oo.a((long)this.field_e[var3] << -1281742984, vi.a((long)this.field_e[1 + var3] << 659222064, 71776119061217280L)), vi.a(280375465082880L, (long)this.field_e[var3 - -2] << -1133955800)))), vi.a((long)this.field_e[5 + var3], 255L) << -319200432), vi.a(255L, (long)this.field_e[6 + var3]) << -856835576), vi.a((long)this.field_e[7 + var3], 255L));
                var2++;
                var3 += 8;
                if (var6 != 0) {
                  break L2;
                } else {
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var2 = 0;
            break L2;
          }
          L4: while (true) {
            L5: {
              L6: {
                if (8 <= var2) {
                  break L6;
                } else {
                  this.field_i[var2] = this.field_l[var2];
                  this.field_f[var2] = oo.a(this.field_m[var2], this.field_l[var2]);
                  var2++;
                  if (var6 != 0) {
                    break L5;
                  } else {
                    if (var6 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var2 = 1;
              break L5;
            }
            L7: while (true) {
              L8: {
                L9: {
                  if ((var2 ^ -1) < -11) {
                    break L9;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_52_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var6 != 0) {
                      break L8;
                    } else {
                      var3 = stackIn_15_0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (8 <= var3) {
                              break L12;
                            } else {
                              this.field_j[var3] = 0L;
                              var4 = 0;
                              stackOut_17_0 = 56;
                              stackIn_26_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (var6 != 0) {
                                break L11;
                              } else {
                                var5 = stackIn_18_0;
                                L13: while (true) {
                                  L14: {
                                    L15: {
                                      if ((var4 ^ -1) <= -9) {
                                        break L15;
                                      } else {
                                        this.field_j[var3] = oo.a(this.field_j[var3], vka.field_I[var4][sea.c(255, (int)(this.field_i[sea.c(-var4 + var3, 7)] >>> var5))]);
                                        var5 -= 8;
                                        var4++;
                                        if (var6 != 0) {
                                          break L14;
                                        } else {
                                          if (var6 == 0) {
                                            continue L13;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    var3++;
                                    break L14;
                                  }
                                  if (var6 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          break L11;
                        }
                        var3 = stackIn_26_0;
                        L16: while (true) {
                          L17: {
                            if (-9 >= (var3 ^ -1)) {
                              this.field_i[0] = oo.a(this.field_i[0], vka.field_H[var2]);
                              break L17;
                            } else {
                              this.field_i[var3] = this.field_j[var3];
                              var3++;
                              if (var6 != 0) {
                                break L17;
                              } else {
                                if (var6 == 0) {
                                  continue L16;
                                } else {
                                  this.field_i[0] = oo.a(this.field_i[0], vka.field_H[var2]);
                                  break L17;
                                }
                              }
                            }
                          }
                          var3 = 0;
                          L18: while (true) {
                            L19: {
                              L20: {
                                if (8 <= var3) {
                                  break L20;
                                } else {
                                  this.field_j[var3] = this.field_i[var3];
                                  var4 = 0;
                                  stackOut_35_0 = 56;
                                  stackIn_44_0 = stackOut_35_0;
                                  stackIn_36_0 = stackOut_35_0;
                                  if (var6 != 0) {
                                    break L19;
                                  } else {
                                    var5 = stackIn_36_0;
                                    L21: while (true) {
                                      L22: {
                                        L23: {
                                          if (8 <= var4) {
                                            break L23;
                                          } else {
                                            this.field_j[var3] = oo.a(this.field_j[var3], vka.field_I[var4][sea.c(255, (int)(this.field_f[sea.c(var3 - var4, 7)] >>> var5))]);
                                            var4++;
                                            var5 -= 8;
                                            if (var6 != 0) {
                                              break L22;
                                            } else {
                                              if (var6 == 0) {
                                                continue L21;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                        }
                                        var3++;
                                        break L22;
                                      }
                                      if (var6 == 0) {
                                        continue L18;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L19;
                            }
                            var3 = stackIn_44_0;
                            L24: while (true) {
                              L25: {
                                L26: {
                                  if (-9 >= (var3 ^ -1)) {
                                    break L26;
                                  } else {
                                    this.field_f[var3] = this.field_j[var3];
                                    var3++;
                                    if (var6 != 0) {
                                      break L25;
                                    } else {
                                      if (var6 == 0) {
                                        continue L24;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                                var2++;
                                break L25;
                              }
                              if (var6 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_51_0 = 0;
                stackIn_52_0 = stackOut_51_0;
                break L8;
              }
              var2 = stackIn_52_0;
              L27: while (true) {
                if (8 > var2) {
                  this.field_l[var2] = oo.a(this.field_l[var2], oo.a(this.field_m[var2], this.field_f[var2]));
                  var2++;
                  if (var6 == 0) {
                    continue L27;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(byte[] param0, long param1, byte param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -59) {
                break L1;
              } else {
                this.field_m = (long[]) null;
                break L1;
              }
            }
            var5_int = 0;
            var6 = -((int)param1 & 7) + 8 & 7;
            var7 = 7 & this.field_a;
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      if (-1 < (var11 ^ -1)) {
                        break L6;
                      } else {
                        var12 = var12 + ((255 & this.field_d[var11]) - -((int)var9 & 255));
                        this.field_d[var11] = (byte)var12;
                        var9 = var9 >>> 8;
                        var12 = var12 >>> 8;
                        var11--;
                        if (var13 != 0) {
                          break L5;
                        } else {
                          if (var13 == 0) {
                            continue L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: while (true) {
                      if ((param1 ^ -1L) >= -9L) {
                        break L5;
                      } else {
                        var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
                        stackOut_9_0 = -1;
                        stackOut_9_1 = var8 ^ -1;
                        stackIn_21_0 = stackOut_9_0;
                        stackIn_21_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var13 != 0) {
                          break L4;
                        } else {
                          L8: {
                            if (stackIn_10_0 < stackIn_10_1) {
                              break L8;
                            } else {
                              if (-257 < (var8 ^ -1)) {
                                L9: {
                                  this.field_e[this.field_k] = (byte)fh.a((int) this.field_e[this.field_k], var8 >>> var7);
                                  this.field_a = this.field_a + (8 - var7);
                                  this.field_k = this.field_k + 1;
                                  if ((this.field_a ^ -1) == -513) {
                                    this.a(false);
                                    this.field_k = 0;
                                    this.field_a = 0;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                this.field_e[this.field_k] = (byte)sea.c(255, var8 << 8 + -var7);
                                var5_int++;
                                this.field_a = this.field_a + var7;
                                param1 = param1 - 8L;
                                if (var13 == 0) {
                                  continue L7;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                          throw new RuntimeException("LOGIC ERROR");
                        }
                      }
                    }
                  }
                  L10: {
                    if (-1L > (param1 ^ -1L)) {
                      break L10;
                    } else {
                      var8 = 0;
                      if (var13 == 0) {
                        break L3;
                      } else {
                        break L10;
                      }
                    }
                  }
                  stackOut_20_0 = param0[var5_int] << var6;
                  stackOut_20_1 = 255;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L4;
                }
                var8 = stackIn_21_0 & stackIn_21_1;
                this.field_e[this.field_k] = (byte)fh.a((int) this.field_e[this.field_k], var8 >>> var7);
                break L3;
              }
              L11: {
                L12: {
                  if (-9L >= (param1 + (long)var7 ^ -1L)) {
                    break L12;
                  } else {
                    this.field_a = (int)((long)this.field_a + param1);
                    if (var13 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  this.field_a = this.field_a + (8 + -var7);
                  param1 = param1 - (long)(-var7 + 8);
                  this.field_k = this.field_k + 1;
                  if (-513 != (this.field_a ^ -1)) {
                    break L13;
                  } else {
                    this.a(false);
                    this.field_a = 0;
                    this.field_k = 0;
                    break L13;
                  }
                }
                this.field_e[this.field_k] = (byte)sea.c(255, var8 << 8 + -var7);
                this.field_a = this.field_a + (int)param1;
                break L11;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var5);
            stackOut_29_1 = new StringBuilder().append("vh.F(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L14;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        String[][] dupTemp$2 = null;
        int[][] dupTemp$3 = null;
        RuntimeException var1 = null;
        int var2 = 0;
        upa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        kh var13 = null;
        kh var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        boolean stackIn_36_0 = false;
        int stackIn_41_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_40_0 = 0;
        boolean stackOut_35_0 = false;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var13 = vc.field_q;
            var14 = var13;
            var2 = var14.h(255);
            var3 = (upa) ((Object) ina.field_d.f(param0 ^ 100));
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var3.field_n;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != var2) {
                          break L4;
                        } else {
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3 = (upa) ((Object) ina.field_d.e(117));
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var3 == null) {
                  stackOut_10_0 = 60;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  L5: {
                    var4 = var14.h(255);
                    if (param0 == -44) {
                      break L5;
                    } else {
                      vh.a((byte) 81);
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (-1 != (var4 ^ -1)) {
                        bra.field_M[0] = fna.field_k;
                        var5 = var3.field_k;
                        var6_int = 1;
                        L8: while (true) {
                          L9: {
                            if (var6_int >= var4) {
                              dc.a(var4, var5, (byte) 47);
                              break L9;
                            } else {
                              bra.field_M[var6_int] = var13.e((byte) -76);
                              var6_int++;
                              if (var12 != 0) {
                                break L9;
                              } else {
                                continue L8;
                              }
                            }
                          }
                          var6_int = 0;
                          L10: while (true) {
                            L11: {
                              if (var6_int >= var4) {
                                stackOut_32_0 = var5;
                                stackIn_33_0 = stackOut_32_0;
                                break L11;
                              } else {
                                dga.a(var14, 0);
                                stackOut_25_0 = var6_int;
                                stackIn_33_0 = stackOut_25_0;
                                stackIn_26_0 = stackOut_25_0;
                                if (var12 != 0) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (stackIn_26_0 != 0) {
                                      qt.a(kc.field_b, vd.field_p, ir.field_a, var6_int, tna.field_f, (byte) -90);
                                      break L12;
                                    } else {
                                      var3.field_g = ir.field_a;
                                      var3.field_f = kc.field_b;
                                      var3.field_l = tna.field_f;
                                      var3.field_j = vd.field_p;
                                      qt.a(kc.field_b, vd.field_p, ir.field_a, var6_int, tna.field_f, (byte) -97);
                                      if (var12 == 0) {
                                        break L12;
                                      } else {
                                        qt.a(kc.field_b, vd.field_p, ir.field_a, var6_int, tna.field_f, (byte) -90);
                                        break L12;
                                      }
                                    }
                                  }
                                  var6_int++;
                                  continue L10;
                                }
                              }
                            }
                            ri.a(stackIn_33_0, (byte) 29);
                            dupTemp$2 = new String[2][var5];
                            var3.field_h = dupTemp$2;
                            var6 = dupTemp$2;
                            dupTemp$3 = new int[2][4 * var5];
                            var3.field_m = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = ola.field_Eb;
                            var9 = 0;
                            var10 = 0;
                            L13: while (true) {
                              L14: {
                                if (var8 <= var9) {
                                  var9 = 0;
                                  stackOut_40_0 = 0;
                                  stackIn_41_0 = stackOut_40_0;
                                  break L14;
                                } else {
                                  var11 = boa.field_n[var9];
                                  var6[0][var10] = bra.field_M[var11];
                                  var7[0][4 * var10] = jk.field_h[var11];
                                  var7[0][1 + 4 * var10] = cu.field_o[var11];
                                  var7[0][2 + 4 * var10] = bq.field_h[var11];
                                  var7[0][var10 * 4 + 3] = im.field_o[var11];
                                  stackOut_35_0 = ue.a(bra.field_M[var11], 0);
                                  stackIn_41_0 = stackOut_35_0 ? 1 : 0;
                                  stackIn_36_0 = stackOut_35_0;
                                  if (var12 != 0) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (!stackIn_36_0) {
                                        break L15;
                                      } else {
                                        if (-1 != (im.field_o[var11] + cu.field_o[var11] + bq.field_h[var11] ^ -1)) {
                                          break L15;
                                        } else {
                                          var6[0][var10] = null;
                                          var10--;
                                          break L15;
                                        }
                                      }
                                    }
                                    var9++;
                                    var10++;
                                    continue L13;
                                  }
                                }
                              }
                              var10 = stackIn_41_0;
                              L16: while (true) {
                                if (var8 <= var9) {
                                  break L7;
                                } else {
                                  var11 = boa.field_n[var5 - -var9];
                                  var6[1][var10] = bra.field_M[var11];
                                  var7[1][4 * var10] = jk.field_h[var11];
                                  var7[1][1 + var10 * 4] = cu.field_o[var11];
                                  var7[1][4 * var10 - -2] = bq.field_h[var11];
                                  var7[1][3 + 4 * var10] = im.field_o[var11];
                                  if (var12 != 0) {
                                    break L6;
                                  } else {
                                    L17: {
                                      if (ue.a(bra.field_M[var11], param0 + 44)) {
                                        if (0 != im.field_o[var11] + (bq.field_h[var11] + cu.field_o[var11])) {
                                          break L17;
                                        } else {
                                          var6[1][var10] = null;
                                          var10--;
                                          break L17;
                                        }
                                      } else {
                                        break L17;
                                      }
                                    }
                                    var10++;
                                    var9++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    var3.field_i = true;
                    var3.p(7);
                    break L6;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              dea.a(stackIn_11_0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "vh.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -33) {
            this.field_a = 0;
            this.field_k = 0;
            this.field_e[0] = (byte) 0;
            var2 = 0;
            var3 = 115 / ((param0 - 58) / 35);
            L1: while (true) {
              if (8 > var2) {
                this.field_l[var2] = 0L;
                var2++;
                if (var4 == 0) {
                  continue L1;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            this.field_d[var2] = (byte) 0;
            var2++;
            if (var4 != 0) {
              var3 = 115 / ((param0 - 58) / 35);
              L2: while (true) {
                if (8 > var2) {
                  this.field_l[var2] = 0L;
                  var2++;
                  if (var4 == 0) {
                    continue L2;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (var4 == 0) {
                continue L0;
              } else {
                this.field_a = 0;
                this.field_k = 0;
                this.field_e[0] = (byte) 0;
                var2 = 0;
                var3 = 115 / ((param0 - 58) / 35);
                L3: while (true) {
                  if (8 > var2) {
                    this.field_l[var2] = 0L;
                    var2++;
                    if (var4 == 0) {
                      continue L3;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 >= -15) {
            return;
        }
        field_c = null;
    }

    final void a(int param0, int param1, byte[] param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_e[this.field_k] = (byte)fh.a((int) this.field_e[this.field_k], 128 >>> sea.c(this.field_a, 7));
              this.field_k = this.field_k + 1;
              if (this.field_k <= param1) {
                break L1;
              } else {
                L2: while (true) {
                  if (-65 >= (this.field_k ^ -1)) {
                    this.a(false);
                    this.field_k = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_k;
                    this.field_k = this.field_k + 1;
                    this.field_e[fieldTemp$2] = (byte) 0;
                    if (var8 != 0) {
                      this.field_k = 0;
                      break L1;
                    } else {
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        this.a(false);
                        this.field_k = 0;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (this.field_k >= 32) {
                    break L5;
                  } else {
                    fieldTemp$3 = this.field_k;
                    this.field_k = this.field_k + 1;
                    this.field_e[fieldTemp$3] = (byte) 0;
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
                lua.a(this.field_d, 0, this.field_e, 32, 32);
                this.a(false);
                break L4;
              }
              var4_int = 0;
              var5 = param0;
              L6: while (true) {
                L7: {
                  if (-9 >= (var4_int ^ -1)) {
                    break L7;
                  } else {
                    var6 = this.field_l[var4_int];
                    param2[var5] = (byte)(int)(var6 >>> -1463451784);
                    param2[var5 + 1] = (byte)(int)(var6 >>> -827882896);
                    param2[var5 + 2] = (byte)(int)(var6 >>> -1783396312);
                    param2[var5 - -3] = (byte)(int)(var6 >>> -791915424);
                    param2[var5 + 4] = (byte)(int)(var6 >>> 311221400);
                    param2[var5 - -5] = (byte)(int)(var6 >>> -622824880);
                    param2[6 + var5] = (byte)(int)(var6 >>> -747024504);
                    param2[var5 - -7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    if (var8 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      if (var8 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("vh.B(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, boolean param1, int param2, lj param3) {
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
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
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
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
            L1: {
              if (param2 == -27201) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            if (!param1) {
              L2: {
                if (param0 != param3.n(31974).field_d) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L3: {
                if (param3.i((byte) 84).field_d != param0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L3;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("vh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    vh() {
        this.field_m = new long[8];
        this.field_a = 0;
        this.field_j = new long[8];
        this.field_f = new long[8];
        this.field_i = new long[8];
        this.field_d = new byte[32];
        this.field_l = new long[8];
        this.field_e = new byte[64];
        this.field_k = 0;
    }

    static {
        field_c = "Some objects in the game can be pushed or pulled. Walk into them holding <img=8><img=9>";
        field_h = new float[4];
        field_b = "3rd";
    }
}
