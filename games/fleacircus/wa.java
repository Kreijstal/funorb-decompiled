/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private int field_a;
    private long[] field_e;
    static uj field_g;
    static int field_m;
    private byte[] field_n;
    static dd[] field_k;
    static String field_p;
    private long[] field_i;
    private long[] field_j;
    private int field_o;
    static float field_l;
    static String field_q;
    private long[] field_b;
    private byte[] field_c;
    static String[] field_f;
    static String field_d;
    private long[] field_h;

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 32) {
            this.field_a = 0;
            this.field_o = 0;
            this.field_c[0] = (byte) 0;
            var2 = 0;
            if (param0 > -91) {
              wa.a(89);
              L1: while (true) {
                if (var2 < 8) {
                  this.field_j[var2] = 0L;
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
              L2: while (true) {
                if (var2 < 8) {
                  this.field_j[var2] = 0L;
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
            this.field_n[var2] = (byte) 0;
            var2++;
            if (var3 != 0) {
              if (param0 > -91) {
                wa.a(89);
                L3: while (true) {
                  if (var2 < 8) {
                    this.field_j[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                      if (var3 == 0) {
                        continue L3;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L4: while (true) {
                  if (var2 < 8) {
                    this.field_j[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                      if (var3 == 0) {
                        continue L4;
                      } else {
                        return;
                      }
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
                this.field_o = 0;
                this.field_c[0] = (byte) 0;
                var2 = 0;
                if (param0 > -91) {
                  wa.a(89);
                  L5: while (true) {
                    if (var2 < 8) {
                      this.field_j[var2] = 0L;
                      var2++;
                      if (var3 == 0) {
                        if (var3 == 0) {
                          continue L5;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    if (var2 < 8) {
                      this.field_j[var2] = 0L;
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

    final static String a(boolean param0) {
        int var1 = 0;
        String var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        String stackOut_12_0 = null;
        String stackOut_11_0 = null;
        String stackOut_6_0 = null;
        String stackOut_5_0 = null;
        L0: {
          var1 = em.field_b;
          if (var1 < 0) {
            var1 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        var1 = var1 / 50;
        if (param0) {
          L1: {
            wa.a(false, false, -70);
            if (0 != (1 & ni.field_j * 2 / 50)) {
              stackOut_12_0 = "<col=<%0>>:</col>";
              stackIn_13_0 = stackOut_12_0;
              break L1;
            } else {
              stackOut_11_0 = ":";
              stackIn_13_0 = stackOut_11_0;
              break L1;
            }
          }
          L2: {
            var4 = stackIn_13_0;
            var3 = var4;
            var3 = var4;
            var2 = var4;
            var3 = var2;
            var3 = var2;
            var3 = Integer.toString(var1 % 60);
            if (1 != var3.length()) {
              break L2;
            } else {
              var3 = 0 + var3;
              break L2;
            }
          }
          return var1 / 60 + var4 + var3;
        } else {
          L3: {
            if (0 != (1 & ni.field_j * 2 / 50)) {
              stackOut_6_0 = "<col=<%0>>:</col>";
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = ":";
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          L4: {
            var5 = stackIn_7_0;
            var3 = var5;
            var3 = var5;
            var2 = var5;
            var3 = var2;
            var3 = var2;
            var3 = Integer.toString(var1 % 60);
            if (1 != var3.length()) {
              break L4;
            } else {
              var3 = 0 + var3;
              break L4;
            }
          }
          return var1 / 60 + var5 + var3;
        }
    }

    final void a(byte param0, long param1, byte[] param2) {
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var13 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & -(7 & (int)param1) + 8;
            if (param0 < -92) {
              var7 = 7 & this.field_o;
              var9 = param1;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            if (0 > var11) {
                              break L7;
                            } else {
                              var12 = var12 + (((int)var9 & 255) + (255 & this.field_n[var11]));
                              this.field_n[var11] = (byte)var12;
                              var9 = var9 >>> 8;
                              var12 = var12 >>> 8;
                              var11--;
                              if (var13 != 0) {
                                break L6;
                              } else {
                                if (var13 == 0) {
                                  continue L1;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          L8: while (true) {
                            if ((param1 ^ -1L) >= -9L) {
                              break L6;
                            } else {
                              var8 = param2[var5_int] << var6 & 255 | (param2[1 + var5_int] & 255) >>> -var6 + 8;
                              var15 = -1;
                              var14 = var8 ^ -1;
                              if (var13 != 0) {
                                if (var14 == var15) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              } else {
                                L9: {
                                  if (var14 > var15) {
                                    break L9;
                                  } else {
                                    if (var8 >= 256) {
                                      break L9;
                                    } else {
                                      L10: {
                                        this.field_c[this.field_a] = (byte)ne.a((int) this.field_c[this.field_a], var8 >>> var7);
                                        this.field_a = this.field_a + 1;
                                        this.field_o = this.field_o + (8 + -var7);
                                        if ((this.field_o ^ -1) != -513) {
                                          break L10;
                                        } else {
                                          this.a((byte) -125);
                                          this.field_a = 0;
                                          this.field_o = 0;
                                          break L10;
                                        }
                                      }
                                      this.field_c[this.field_a] = (byte)sc.a(var8 << -var7 + 8, 255);
                                      param1 = param1 - 8L;
                                      this.field_o = this.field_o + var7;
                                      var5_int++;
                                      if (var13 == 0) {
                                        continue L8;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                throw new RuntimeException("LOGIC ERROR");
                              }
                            }
                          }
                        }
                        L11: {
                          L12: {
                            if (param1 <= 0L) {
                              break L12;
                            } else {
                              var8 = 255 & param2[var5_int] << var6;
                              this.field_c[this.field_a] = (byte)ne.a((int) this.field_c[this.field_a], var8 >>> var7);
                              if (var13 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var8 = 0;
                          break L11;
                        }
                        if (8L > param1 + (long)var7) {
                          break L3;
                        } else {
                          this.field_o = this.field_o + (-var7 + 8);
                          param1 = param1 - (long)(8 + -var7);
                          this.field_a = this.field_a + 1;
                          if (512 == this.field_o) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      this.a((byte) -128);
                      this.field_a = 0;
                      this.field_o = 0;
                      break L4;
                    }
                    this.field_c[this.field_a] = (byte)sc.a(var8 << -var7 + 8, 255);
                    this.field_o = this.field_o + (int)param1;
                    if (var13 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  this.field_o = (int)((long)this.field_o + param1);
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
            stackOut_30_0 = (RuntimeException) (var5);
            stackOut_30_1 = new StringBuilder().append("wa.E(").append(param0).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L13;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L13;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_p = null;
        field_d = null;
        if (param0 != -1731) {
            return;
        }
        field_f = null;
        field_g = null;
        field_q = null;
    }

    final void a(byte[] param0, int param1, byte param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_c[this.field_a] = (byte)ne.a((int) this.field_c[this.field_a], 128 >>> sc.a(7, this.field_o));
              this.field_a = this.field_a + 1;
              if ((this.field_a ^ -1) < -33) {
                L2: while (true) {
                  L3: {
                    L4: {
                      if (-65 >= (this.field_a ^ -1)) {
                        break L4;
                      } else {
                        fieldTemp$2 = this.field_a;
                        this.field_a = this.field_a + 1;
                        this.field_c[fieldTemp$2] = (byte) 0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    this.a((byte) -115);
                    break L3;
                  }
                  this.field_a = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (param2 == -85) {
                break L5;
              } else {
                this.field_h = (long[]) null;
                break L5;
              }
            }
            L6: while (true) {
              L7: {
                L8: {
                  if (32 <= this.field_a) {
                    break L8;
                  } else {
                    fieldTemp$3 = this.field_a;
                    this.field_a = this.field_a + 1;
                    this.field_c[fieldTemp$3] = (byte) 0;
                    if (var8 != 0) {
                      break L7;
                    } else {
                      if (var8 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                dm.a(this.field_n, 0, this.field_c, 32, 32);
                this.a((byte) -117);
                break L7;
              }
              var4_int = 0;
              var5 = param1;
              L9: while (true) {
                if (-9 >= (var4_int ^ -1)) {
                  break L0;
                } else {
                  var6 = this.field_j[var4_int];
                  param0[var5] = (byte)(int)(var6 >>> 538960760);
                  param0[1 + var5] = (byte)(int)(var6 >>> 1954047344);
                  param0[var5 + 2] = (byte)(int)(var6 >>> -1796767512);
                  param0[var5 - -3] = (byte)(int)(var6 >>> 636793824);
                  param0[4 + var5] = (byte)(int)(var6 >>> 757218776);
                  param0[var5 - -5] = (byte)(int)(var6 >>> -1341704880);
                  param0[6 + var5] = (byte)(int)(var6 >>> -850735352);
                  param0[7 + var5] = (byte)(int)var6;
                  var4_int++;
                  var5 += 8;
                  if (var8 == 0) {
                    continue L9;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var4);
            stackOut_23_1 = new StringBuilder().append("wa.F(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = -32 / ((-43 - param2) / 32);
        String var4 = (String) null;
        fl.a(param1, param0, (String) null, -22175);
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int stackOut_40_0 = 0;
        int stackOut_32_0 = 0;
        byte stackOut_48_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_86_0 = 0;
        byte stackOut_102_0 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (-9 >= (var2 ^ -1)) {
              var2 = 0;
              break L1;
            } else {
              this.field_i[var2] = ik.a(ik.a(re.a((long)this.field_c[6 + var3], 255L) << -591758840, ik.a(re.a((long)this.field_c[var3 + 5] << 290890832, 16711680L), ik.a(ik.a(re.a(255L, (long)this.field_c[3 + var3]) << 1641855392, ik.a(ik.a(re.a((long)this.field_c[1 + var3], 255L) << -1955081744, (long)this.field_c[var3] << -2134972424), re.a(255L, (long)this.field_c[2 + var3]) << -638846808)), re.a(255L, (long)this.field_c[4 + var3]) << 2080686232))), re.a((long)this.field_c[7 + var3], 255L));
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
                          this.field_b[var2] = this.field_j[var2];
                          this.field_h[var2] = ik.a(this.field_i[var2], this.field_j[var2]);
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
                                    if ((var3 ^ -1) <= -9) {
                                      break L10;
                                    } else {
                                      this.field_e[var3] = 0L;
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
                                              if ((var4 ^ -1) <= -9) {
                                                break L13;
                                              } else {
                                                this.field_e[var3] = ik.a(this.field_e[var3], td.field_f[var4][sc.a(255, (int)(this.field_b[sc.a(var3 + -var4, 7)] >>> var5))]);
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
                                    if (var3 >= 8) {
                                      this.field_b[0] = ik.a(this.field_b[0], td.field_c[var2]);
                                      break L15;
                                    } else {
                                      this.field_b[var3] = this.field_e[var3];
                                      var3++;
                                      if (var6 != 0) {
                                        break L15;
                                      } else {
                                        continue L14;
                                      }
                                    }
                                  }
                                  var3 = 0;
                                  L16: while (true) {
                                    L17: {
                                      if (var3 >= 8) {
                                        stackOut_40_0 = 0;
                                        stackIn_41_0 = stackOut_40_0;
                                        break L17;
                                      } else {
                                        this.field_e[var3] = this.field_b[var3];
                                        var4 = 0;
                                        stackOut_32_0 = 56;
                                        stackIn_41_0 = stackOut_32_0;
                                        stackIn_33_0 = stackOut_32_0;
                                        if (var6 != 0) {
                                          break L17;
                                        } else {
                                          var5 = stackIn_33_0;
                                          L18: while (true) {
                                            L19: {
                                              if (var4 >= 8) {
                                                var3++;
                                                break L19;
                                              } else {
                                                this.field_e[var3] = ik.a(this.field_e[var3], td.field_f[var4][sc.a((int)(this.field_h[sc.a(var3 + -var4, 7)] >>> var5), 255)]);
                                                var5 -= 8;
                                                var4++;
                                                if (var6 != 0) {
                                                  break L19;
                                                } else {
                                                  continue L18;
                                                }
                                              }
                                            }
                                            continue L16;
                                          }
                                        }
                                      }
                                    }
                                    var3 = stackIn_41_0;
                                    L20: while (true) {
                                      L21: {
                                        if (var3 >= 8) {
                                          var2++;
                                          break L21;
                                        } else {
                                          this.field_h[var3] = this.field_e[var3];
                                          var3++;
                                          if (var6 != 0) {
                                            break L21;
                                          } else {
                                            continue L20;
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
                        stackOut_48_0 = param0;
                        stackIn_49_0 = stackOut_48_0;
                        break L6;
                      }
                      L22: {
                        if (stackIn_49_0 < -86) {
                          break L22;
                        } else {
                          wa.a(31);
                          break L22;
                        }
                      }
                      var2 = 0;
                      L23: while (true) {
                        if (8 > var2) {
                          this.field_j[var2] = ik.a(this.field_j[var2], ik.a(this.field_h[var2], this.field_i[var2]));
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
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                break L25;
              } else {
                this.field_b[var2] = this.field_j[var2];
                this.field_h[var2] = ik.a(this.field_i[var2], this.field_j[var2]);
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
                            this.field_e[var3] = 0L;
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
                                  if ((var4 ^ -1) <= -9) {
                                    var3++;
                                    break L32;
                                  } else {
                                    this.field_e[var3] = ik.a(this.field_e[var3], td.field_f[var4][sc.a(255, (int)(this.field_b[sc.a(var3 + -var4, 7)] >>> var5))]);
                                    var4++;
                                    var5 -= 8;
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
                            if (var3 >= 8) {
                              this.field_b[0] = ik.a(this.field_b[0], td.field_c[var2]);
                              break L34;
                            } else {
                              this.field_b[var3] = this.field_e[var3];
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
                              if (var3 >= 8) {
                                stackOut_94_0 = 0;
                                stackIn_95_0 = stackOut_94_0;
                                break L36;
                              } else {
                                this.field_e[var3] = this.field_b[var3];
                                var4 = 0;
                                stackOut_86_0 = 56;
                                stackIn_95_0 = stackOut_86_0;
                                stackIn_87_0 = stackOut_86_0;
                                if (var6 != 0) {
                                  break L36;
                                } else {
                                  var5 = stackIn_87_0;
                                  L37: while (true) {
                                    L38: {
                                      if (var4 >= 8) {
                                        var3++;
                                        break L38;
                                      } else {
                                        this.field_e[var3] = ik.a(this.field_e[var3], td.field_f[var4][sc.a((int)(this.field_h[sc.a(var3 + -var4, 7)] >>> var5), 255)]);
                                        var5 -= 8;
                                        var4++;
                                        if (var6 != 0) {
                                          break L38;
                                        } else {
                                          continue L37;
                                        }
                                      }
                                    }
                                    continue L35;
                                  }
                                }
                              }
                            }
                            var3 = stackIn_95_0;
                            L39: while (true) {
                              L40: {
                                if (var3 >= 8) {
                                  var2++;
                                  break L40;
                                } else {
                                  this.field_h[var3] = this.field_e[var3];
                                  var3++;
                                  if (var6 != 0) {
                                    break L40;
                                  } else {
                                    continue L39;
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
                stackOut_102_0 = param0;
                stackIn_103_0 = stackOut_102_0;
                break L27;
              }
              if (stackIn_103_0 < -86) {
                var2 = 0;
                L41: while (true) {
                  if (8 > var2) {
                    this.field_j[var2] = ik.a(this.field_j[var2], ik.a(this.field_h[var2], this.field_i[var2]));
                    var2++;
                    if (var6 == 0) {
                      continue L41;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                wa.a(31);
                var2 = 0;
                L42: while (true) {
                  if (8 > var2) {
                    this.field_j[var2] = ik.a(this.field_j[var2], ik.a(this.field_h[var2], this.field_i[var2]));
                    var2++;
                    if (var6 == 0) {
                      continue L42;
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

    wa() {
        this.field_a = 0;
        this.field_n = new byte[32];
        this.field_i = new long[8];
        this.field_j = new long[8];
        this.field_e = new long[8];
        this.field_c = new byte[64];
        this.field_h = new long[8];
        this.field_b = new long[8];
        this.field_o = 0;
    }

    static {
        field_g = new uj(3);
        field_p = "<%0>One-touch wall:<%1> Acts like a normal wall, but are destroyed after being touched once, from the side, by a flea.";
        field_f = new String[]{"Flea to the Circus", "Circus Performer", "Circus Act", "Circus Master", "Golden Fleas", "Master Flea", "Flea while you still can", "Lord of the Fleas", "Flea Lunch", "Fleadom", "Flea over troubled waters", "Frequent flea-er", "Sensi-flea", "Thought-flea", "Flea thinker", "Philoso-flea"};
        field_q = "If you do nothing the game will revert to normal view in <%0> second.";
        field_d = "Blocks can be used to bridge gaps or to block ways you don't want the fleas to go. Slopes can be chained together to help fleas reach new areas of the level. Fleas are very tough, and don't die if they fall too far. Be careful however: there are many ways for a flea to die!";
    }
}
