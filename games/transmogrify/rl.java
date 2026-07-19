/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private byte[] field_c;
    private long[] field_b;
    private byte[] field_j;
    private int field_h;
    static String field_i;
    static int[] field_d;
    private long[] field_f;
    private long[] field_g;
    private long[] field_e;
    private long[] field_k;
    private int field_a;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_102_0 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 <= -86) {
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            L1: {
              if (-9 >= (var2 ^ -1)) {
                var2 = 0;
                break L1;
              } else {
                this.field_b[var2] = aj.a(ej.a(255L, (long)this.field_j[7 + var3]), aj.a(aj.a(ej.a((long)this.field_j[5 + var3], 255L) << -640331824, aj.a(ej.a(4278190080L, (long)this.field_j[var3 - -4] << 212529752), aj.a(aj.a(ej.a(280375465082880L, (long)this.field_j[var3 + 2] << 861818856), aj.a((long)this.field_j[var3] << -1322827016, ej.a((long)this.field_j[1 + var3] << 73813488, 71776119061217280L))), ej.a(255L, (long)this.field_j[var3 - -3]) << -1053287136))), ej.a((long)this.field_j[6 + var3] << -1986427384, 65280L)));
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
                          if (-9 >= (var2 ^ -1)) {
                            break L4;
                          } else {
                            this.field_f[var2] = this.field_e[var2];
                            this.field_g[var2] = aj.a(this.field_b[var2], this.field_e[var2]);
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
                            if (10 < var2) {
                              break L7;
                            } else {
                              stackOut_13_0 = 0;
                              stackIn_51_0 = stackOut_13_0;
                              stackIn_14_0 = stackOut_13_0;
                              if (var6 != 0) {
                                break L6;
                              } else {
                                var3 = stackIn_14_0;
                                L8: while (true) {
                                  L9: {
                                    L10: {
                                      if ((var3 ^ -1) <= -9) {
                                        break L10;
                                      } else {
                                        this.field_k[var3] = 0L;
                                        var4 = 0;
                                        stackOut_16_0 = 56;
                                        stackIn_25_0 = stackOut_16_0;
                                        stackIn_17_0 = stackOut_16_0;
                                        if (var6 != 0) {
                                          break L9;
                                        } else {
                                          var5 = stackIn_17_0;
                                          L11: while (true) {
                                            L12: {
                                              if (var4 >= 8) {
                                                var3++;
                                                break L12;
                                              } else {
                                                this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c((int)(this.field_f[vg.c(var3 + -var4, 7)] >>> var5), 255)]);
                                                var5 -= 8;
                                                var4++;
                                                if (var6 != 0) {
                                                  break L12;
                                                } else {
                                                  continue L11;
                                                }
                                              }
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
                                    stackOut_24_0 = 0;
                                    stackIn_25_0 = stackOut_24_0;
                                    break L9;
                                  }
                                  var3 = stackIn_25_0;
                                  L13: while (true) {
                                    L14: {
                                      if (8 <= var3) {
                                        this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2]);
                                        break L14;
                                      } else {
                                        this.field_f[var3] = this.field_k[var3];
                                        var3++;
                                        if (var6 != 0) {
                                          break L14;
                                        } else {
                                          if (var6 == 0) {
                                            continue L13;
                                          } else {
                                            this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2]);
                                            break L14;
                                          }
                                        }
                                      }
                                    }
                                    var3 = 0;
                                    L15: while (true) {
                                      L16: {
                                        L17: {
                                          if (8 <= var3) {
                                            break L17;
                                          } else {
                                            this.field_k[var3] = this.field_f[var3];
                                            var4 = 0;
                                            stackOut_34_0 = 56;
                                            stackIn_43_0 = stackOut_34_0;
                                            stackIn_35_0 = stackOut_34_0;
                                            if (var6 != 0) {
                                              break L16;
                                            } else {
                                              var5 = stackIn_35_0;
                                              L18: while (true) {
                                                L19: {
                                                  L20: {
                                                    if (-9 >= (var4 ^ -1)) {
                                                      break L20;
                                                    } else {
                                                      this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c(255, (int)(this.field_g[vg.c(-var4 + var3, 7)] >>> var5))]);
                                                      var5 -= 8;
                                                      var4++;
                                                      if (var6 != 0) {
                                                        break L19;
                                                      } else {
                                                        if (var6 == 0) {
                                                          continue L18;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var3++;
                                                  break L19;
                                                }
                                                if (var6 == 0) {
                                                  continue L15;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_42_0 = 0;
                                        stackIn_43_0 = stackOut_42_0;
                                        break L16;
                                      }
                                      var3 = stackIn_43_0;
                                      L21: while (true) {
                                        L22: {
                                          if (var3 >= 8) {
                                            var2++;
                                            break L22;
                                          } else {
                                            this.field_g[var3] = this.field_k[var3];
                                            var3++;
                                            if (var6 != 0) {
                                              break L22;
                                            } else {
                                              continue L21;
                                            }
                                          }
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
                          stackOut_50_0 = 0;
                          stackIn_51_0 = stackOut_50_0;
                          break L6;
                        }
                        var2 = stackIn_51_0;
                        L23: while (true) {
                          if (-9 < (var2 ^ -1)) {
                            this.field_e[var2] = aj.a(this.field_e[var2], aj.a(this.field_g[var2], this.field_b[var2]));
                            var2++;
                            if (var6 == 0) {
                              continue L23;
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
            }
            L24: while (true) {
              L25: {
                if (-9 >= (var2 ^ -1)) {
                  var2 = 1;
                  break L25;
                } else {
                  this.field_f[var2] = this.field_e[var2];
                  this.field_g[var2] = aj.a(this.field_b[var2], this.field_e[var2]);
                  var2++;
                  if (var6 != 0) {
                    break L25;
                  } else {
                    continue L24;
                  }
                }
              }
              L26: while (true) {
                L27: {
                  L28: {
                    if (10 < var2) {
                      break L28;
                    } else {
                      stackOut_65_0 = 0;
                      stackIn_103_0 = stackOut_65_0;
                      stackIn_66_0 = stackOut_65_0;
                      if (var6 != 0) {
                        break L27;
                      } else {
                        var3 = stackIn_66_0;
                        L29: while (true) {
                          L30: {
                            if ((var3 ^ -1) <= -9) {
                              stackOut_76_0 = 0;
                              stackIn_77_0 = stackOut_76_0;
                              break L30;
                            } else {
                              this.field_k[var3] = 0L;
                              var4 = 0;
                              stackOut_68_0 = 56;
                              stackIn_77_0 = stackOut_68_0;
                              stackIn_69_0 = stackOut_68_0;
                              if (var6 != 0) {
                                break L30;
                              } else {
                                var5 = stackIn_69_0;
                                L31: while (true) {
                                  L32: {
                                    if (var4 >= 8) {
                                      var3++;
                                      break L32;
                                    } else {
                                      this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c((int)(this.field_f[vg.c(var3 + -var4, 7)] >>> var5), 255)]);
                                      var5 -= 8;
                                      var4++;
                                      if (var6 != 0) {
                                        break L32;
                                      } else {
                                        continue L31;
                                      }
                                    }
                                  }
                                  continue L29;
                                }
                              }
                            }
                          }
                          var3 = stackIn_77_0;
                          L33: while (true) {
                            L34: {
                              if (8 <= var3) {
                                this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2]);
                                break L34;
                              } else {
                                this.field_f[var3] = this.field_k[var3];
                                var3++;
                                if (var6 != 0) {
                                  break L34;
                                } else {
                                  continue L33;
                                }
                              }
                            }
                            var3 = 0;
                            L35: while (true) {
                              L36: {
                                L37: {
                                  if (8 <= var3) {
                                    break L37;
                                  } else {
                                    this.field_k[var3] = this.field_f[var3];
                                    var4 = 0;
                                    stackOut_86_0 = 56;
                                    stackIn_95_0 = stackOut_86_0;
                                    stackIn_87_0 = stackOut_86_0;
                                    if (var6 != 0) {
                                      break L36;
                                    } else {
                                      var5 = stackIn_87_0;
                                      L38: while (true) {
                                        L39: {
                                          L40: {
                                            if (-9 >= (var4 ^ -1)) {
                                              break L40;
                                            } else {
                                              this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c(255, (int)(this.field_g[vg.c(-var4 + var3, 7)] >>> var5))]);
                                              var5 -= 8;
                                              var4++;
                                              if (var6 != 0) {
                                                break L39;
                                              } else {
                                                if (var6 == 0) {
                                                  continue L38;
                                                } else {
                                                  break L40;
                                                }
                                              }
                                            }
                                          }
                                          var3++;
                                          break L39;
                                        }
                                        if (var6 == 0) {
                                          continue L35;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_94_0 = 0;
                                stackIn_95_0 = stackOut_94_0;
                                break L36;
                              }
                              var3 = stackIn_95_0;
                              L41: while (true) {
                                L42: {
                                  if (var3 >= 8) {
                                    var2++;
                                    break L42;
                                  } else {
                                    this.field_g[var3] = this.field_k[var3];
                                    var3++;
                                    if (var6 != 0) {
                                      break L42;
                                    } else {
                                      continue L41;
                                    }
                                  }
                                }
                                if (var6 == 0) {
                                  continue L26;
                                } else {
                                  break L28;
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
                  break L27;
                }
                var2 = stackIn_103_0;
                L43: while (true) {
                  if (-9 < (var2 ^ -1)) {
                    this.field_e[var2] = aj.a(this.field_e[var2], aj.a(this.field_g[var2], this.field_b[var2]));
                    var2++;
                    if (var6 == 0) {
                      continue L43;
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
        } else {
          return;
        }
    }

    final static int b(byte param0) {
        if (param0 != -6) {
            return 92;
        }
        we.field_j.a(false);
        if (!oh.field_h.c((byte) 124)) {
            return ai.a(2);
        }
        return 0;
    }

    final static boolean a(int param0, int param1, int param2, ci param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var5 = param3.a((byte) -93, param0, param2);
            var4 = var5;
            if (var5 == null) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 0) {
                kf.a(var5, param1 ^ 108);
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4_ref);
            stackOut_9_1 = new StringBuilder().append("rl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0 != 0;
          }
        }
    }

    public static void b(int param0) {
        field_i = null;
        if (param0 != 7) {
            field_d = (int[]) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(int param0, long param1, byte[] param2) {
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
        int stackIn_18_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 14027) {
              var5_int = 0;
              var6 = 7 & 8 + -(7 & (int)param1);
              var7 = 7 & this.field_h;
              var9 = param1;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (var11 < 0) {
                        break L4;
                      } else {
                        var12 = var12 + ((this.field_c[var11] & 255) - -(255 & (int)var9));
                        this.field_c[var11] = (byte)var12;
                        var9 = var9 >>> 8;
                        var12 = var12 >>> 8;
                        var11--;
                        if (var13 != 0) {
                          break L3;
                        } else {
                          if (var13 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: while (true) {
                      if (-9L <= (param1 ^ -1L)) {
                        break L3;
                      } else {
                        var8 = 255 & param2[var5_int] << var6 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
                        stackOut_9_0 = var8;
                        stackIn_18_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var13 != 0) {
                          break L2;
                        } else {
                          L6: {
                            if (stackIn_10_0 < 0) {
                              break L6;
                            } else {
                              if (256 > var8) {
                                L7: {
                                  this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], var8 >>> var7);
                                  this.field_h = this.field_h + (-var7 + 8);
                                  this.field_a = this.field_a + 1;
                                  if (-513 != (this.field_h ^ -1)) {
                                    break L7;
                                  } else {
                                    this.a((byte) -97);
                                    this.field_h = 0;
                                    this.field_a = 0;
                                    break L7;
                                  }
                                }
                                this.field_j[this.field_a] = (byte)vg.c(var8 << 8 + -var7, 255);
                                var5_int++;
                                param1 = param1 - 8L;
                                this.field_h = this.field_h + var7;
                                if (var13 == 0) {
                                  continue L5;
                                } else {
                                  break L3;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                          throw new RuntimeException("LOGIC ERROR");
                        }
                      }
                    }
                  }
                  stackOut_17_0 = (param1 < 0L ? -1 : (param1 == 0L ? 0 : 1));
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                }
                L8: {
                  L9: {
                    if (stackIn_18_0 > 0) {
                      break L9;
                    } else {
                      var8 = 0;
                      if (var13 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var8 = param2[var5_int] << var6 & 255;
                  this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], var8 >>> var7);
                  break L8;
                }
                L10: {
                  L11: {
                    if (8L <= param1 + (long)var7) {
                      break L11;
                    } else {
                      this.field_h = (int)((long)this.field_h + param1);
                      if (var13 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    param1 = param1 - (long)(-var7 + 8);
                    this.field_h = this.field_h + (-var7 + 8);
                    this.field_a = this.field_a + 1;
                    if (this.field_h == 512) {
                      this.a((byte) -94);
                      this.field_a = 0;
                      this.field_h = 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  this.field_j[this.field_a] = (byte)vg.c(255, var8 << -var7 + 8);
                  this.field_h = this.field_h + (int)param1;
                  break L10;
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
            stackOut_29_0 = (RuntimeException) (var5);
            stackOut_29_1 = new StringBuilder().append("rl.F(").append(param0).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L13;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L13;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], 128 >>> vg.c(this.field_h, 7));
              this.field_a = this.field_a + 1;
              if (-33 <= (this.field_a ^ -1)) {
                break L1;
              } else {
                L2: while (true) {
                  if (this.field_a >= 64) {
                    this.a((byte) -87);
                    this.field_a = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_a;
                    this.field_a = this.field_a + 1;
                    this.field_j[fieldTemp$2] = (byte) 0;
                    if (var8 != 0) {
                      this.field_a = 0;
                      break L1;
                    } else {
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        this.a((byte) -87);
                        this.field_a = 0;
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
                  if (-33 >= (this.field_a ^ -1)) {
                    break L5;
                  } else {
                    fieldTemp$3 = this.field_a;
                    this.field_a = this.field_a + 1;
                    this.field_j[fieldTemp$3] = (byte) 0;
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
                ji.a(this.field_c, 0, this.field_j, 32, 32);
                this.a((byte) -119);
                break L4;
              }
              var4_int = 0;
              var5 = param2;
              if (param1 > 51) {
                L6: while (true) {
                  if ((var4_int ^ -1) <= -9) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var6 = this.field_e[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 764252024);
                    param0[1 + var5] = (byte)(int)(var6 >>> -740567376);
                    param0[2 + var5] = (byte)(int)(var6 >>> 1386401128);
                    param0[var5 + 3] = (byte)(int)(var6 >>> -2042330144);
                    param0[4 + var5] = (byte)(int)(var6 >>> 682001624);
                    param0[5 + var5] = (byte)(int)(var6 >>> -230296944);
                    param0[6 + var5] = (byte)(int)(var6 >>> -1223563576);
                    param0[7 + var5] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
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
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("rl.C(");
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
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    rl() {
        this.field_h = 0;
        this.field_b = new long[8];
        this.field_f = new long[8];
        this.field_j = new byte[64];
        this.field_e = new long[8];
        this.field_g = new long[8];
        this.field_k = new long[8];
        this.field_c = new byte[32];
        this.field_a = 0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -33) {
            this.field_a = 0;
            this.field_h = 0;
            this.field_j[0] = (byte) 0;
            if (param0 != 15298) {
              this.field_g = (long[]) null;
              var2 = 0;
              L1: while (true) {
                if (-9 < (var2 ^ -1)) {
                  this.field_e[var2] = 0L;
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
              var2 = 0;
              L2: while (true) {
                if (-9 < (var2 ^ -1)) {
                  this.field_e[var2] = 0L;
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
            }
          } else {
            this.field_c[var2] = (byte) 0;
            var2++;
            if (var3 != 0) {
              if (param0 == 15298) {
                var2 = 0;
                L3: while (true) {
                  if (-9 < (var2 ^ -1)) {
                    this.field_e[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                      continue L3;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                this.field_g = (long[]) null;
                var2 = 0;
                L4: while (true) {
                  if (-9 < (var2 ^ -1)) {
                    this.field_e[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                      continue L4;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (var3 == 0) {
                continue L0;
              } else {
                this.field_a = 0;
                this.field_h = 0;
                this.field_j[0] = (byte) 0;
                if (param0 != 15298) {
                  this.field_g = (long[]) null;
                  var2 = 0;
                  L5: while (true) {
                    if (-9 < (var2 ^ -1)) {
                      this.field_e[var2] = 0L;
                      var2++;
                      if (var3 == 0) {
                        continue L5;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  var2 = 0;
                  L6: while (true) {
                    if (-9 < (var2 ^ -1)) {
                      this.field_e[var2] = 0L;
                      var2++;
                      if (var3 == 0) {
                        continue L6;
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
    }

    static {
        field_i = "Achieved";
        field_d = new int[8192];
    }
}
