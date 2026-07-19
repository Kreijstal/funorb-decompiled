/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private int field_m;
    static int field_s;
    int field_o;
    int[] field_k;
    static Boolean field_j;
    int field_c;
    private int[][] field_p;
    static ak field_l;
    private int[] field_n;
    int field_b;
    int[] field_a;
    int[][] field_r;
    int[] field_h;
    private byte[] field_e;
    ap[] field_q;
    int[] field_i;
    int[] field_f;
    byte[][] field_d;
    ap field_g;

    public static void b(int param0) {
        if (param0 <= 47) {
            return;
        }
        field_j = null;
        field_l = null;
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        int var2 = 0;
        uj var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              rl.field_r = false;
              io.field_c = null;
              bn.field_S = null;
              if (null == i.field_n) {
                break L1;
              } else {
                i.field_n.e(-123);
                i.field_n = null;
                break L1;
              }
            }
            L2: {
              if (param0 == 23949) {
                break L2;
              } else {
                field_s = 72;
                break L2;
              }
            }
            L3: {
              il.field_d = null;
              if (null == nk.field_a) {
                break L3;
              } else {
                nk.field_a.e(117);
                nk.field_a = null;
                break L3;
              }
            }
            L4: {
              dg.field_f = null;
              if (null != wi.field_a) {
                wi.field_a.e(126);
                wi.field_a = null;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              eh.field_f = null;
              if (il.field_d == null) {
                break L5;
              } else {
                var3 = (uj) ((Object) il.field_d.a(-109));
                L6: while (true) {
                  if (var3 == null) {
                    il.field_d = null;
                    break L5;
                  } else {
                    var3.e(17);
                    var3 = (uj) ((Object) il.field_d.a((byte) 50));
                    continue L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "kj.C(" + param0 + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_7_0 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 <= 0) {
                  break L2;
                } else {
                  if (param0 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 < 160) {
                  break L3;
                } else {
                  if (param0 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1 >= 89) {
                  break L4;
                } else {
                  field_j = (Boolean) null;
                  break L4;
                }
              }
              if (param0 != 0) {
                var6 = jg.field_I;
                var2 = var6;
                var3 = 0;
                L5: while (true) {
                  if (var6.length <= var3) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param0) {
                      var3++;
                      continue L5;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              } else {
                return false;
              }
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "kj.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    private final void a(int param0, byte[] param1) {
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int[] array$9 = null;
        int dupTemp$10 = 0;
        int[] array$11 = null;
        int dupTemp$12 = 0;
        int[] array$13 = null;
        RuntimeException var3 = null;
        int var4 = 0;
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
        int var16 = 0;
        we var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var16 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new we(la.a(param1, 0));
              var4 = var17.f(255);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (-7 >= (var4 ^ -1)) {
                      this.field_c = var17.k(0);
                      break L2;
                    } else {
                      this.field_c = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.f(255);
                    if ((1 & var5) == 0) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (var4 >= 7) {
                      this.field_m = var17.i(9997);
                      break L4;
                    } else {
                      this.field_m = var17.a((byte) -119);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 & 2) == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    var9 = -1;
                    this.field_f = new int[this.field_m];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_m <= var10) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$7 = var8 + var17.a((byte) -111);
                            var8 = dupTemp$7;
                            this.field_f[var10] = dupTemp$7;
                            if (this.field_f[var10] > var9) {
                              var9 = this.field_f[var10];
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (this.field_m <= var10) {
                          break L6;
                        } else {
                          L10: {
                            dupTemp$8 = var8 + var17.i(9997);
                            var8 = dupTemp$8;
                            this.field_f[var10] = dupTemp$8;
                            if (var9 < this.field_f[var10]) {
                              var9 = this.field_f[var10];
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    this.field_b = 1 + var9;
                    this.field_h = new int[this.field_b];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      this.field_d = new byte[this.field_b][];
                      break L11;
                    }
                  }
                  L12: {
                    this.field_a = new int[this.field_b];
                    this.field_r = new int[this.field_b][];
                    this.field_k = new int[this.field_b];
                    this.field_i = new int[this.field_b];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      this.field_n = new int[this.field_b];
                      var10 = 0;
                      L13: while (true) {
                        if (this.field_b <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= this.field_m) {
                              this.field_g = new ap(this.field_n);
                              break L12;
                            } else {
                              this.field_n[this.field_f[var10]] = var17.k(0);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          this.field_n[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (this.field_m <= var10) {
                      L16: {
                        var11 = -79 % ((param0 - 0) / 44);
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (this.field_m <= var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(var21, 0, -128, 64);
                              this.field_d[this.field_f[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (this.field_m <= var10) {
                          L19: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (this.field_m <= var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (this.field_m <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_f[var10];
                                      var12 = this.field_h[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      array$9 = new int[var12];
                                      this.field_r[var11] = array$9;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var14 >= var12) {
                                          L23: {
                                            this.field_i[var11] = 1 + var13;
                                            if (1 + var13 == var12) {
                                              this.field_r[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          dupTemp$10 = var8 + var17.i(9997);
                                          var8 = dupTemp$10;
                                          this.field_r[var11][var14] = dupTemp$10;
                                          var15 = dupTemp$10;
                                          if (var13 < var15) {
                                            var13 = var15;
                                            var14++;
                                            continue L22;
                                          } else {
                                            var14++;
                                            continue L22;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_h[this.field_f[var10]] = var17.i(9997);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L24: while (true) {
                                if (this.field_m <= var10) {
                                  var10 = 0;
                                  L25: while (true) {
                                    if (this.field_m <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_f[var10];
                                      var12 = this.field_h[var11];
                                      var8 = 0;
                                      array$11 = new int[var12];
                                      this.field_r[var11] = array$11;
                                      var13 = -1;
                                      var14 = 0;
                                      L26: while (true) {
                                        if (var14 >= var12) {
                                          L27: {
                                            this.field_i[var11] = var13 - -1;
                                            if (1 + var13 == var12) {
                                              this.field_r[var11] = null;
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var10++;
                                          continue L25;
                                        } else {
                                          dupTemp$12 = var8 + var17.a((byte) -119);
                                          var8 = dupTemp$12;
                                          this.field_r[var11][var14] = dupTemp$12;
                                          var15 = dupTemp$12;
                                          if (var13 < var15) {
                                            var13 = var15;
                                            var14++;
                                            continue L26;
                                          } else {
                                            var14++;
                                            continue L26;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_h[this.field_f[var10]] = var17.a((byte) -123);
                                  var10++;
                                  continue L24;
                                }
                              }
                            }
                          }
                          L28: {
                            if (var6 == 0) {
                              break L28;
                            } else {
                              this.field_p = new int[var9 - -1][];
                              this.field_q = new ap[var9 + 1];
                              var10 = 0;
                              L29: while (true) {
                                if (this.field_m <= var10) {
                                  break L28;
                                } else {
                                  var11 = this.field_f[var10];
                                  var12 = this.field_h[var11];
                                  array$13 = new int[this.field_i[var11]];
                                  this.field_p[var11] = array$13;
                                  var13 = 0;
                                  L30: while (true) {
                                    if (var13 >= this.field_i[var11]) {
                                      var13 = 0;
                                      L31: while (true) {
                                        if (var13 >= var12) {
                                          this.field_q[var11] = new ap(this.field_p[var11]);
                                          var10++;
                                          continue L29;
                                        } else {
                                          L32: {
                                            if (this.field_r[var11] != null) {
                                              var14 = this.field_r[var11][var13];
                                              break L32;
                                            } else {
                                              var14 = var13;
                                              break L32;
                                            }
                                          }
                                          this.field_p[var11][var14] = var17.k(0);
                                          var13++;
                                          continue L31;
                                        }
                                      }
                                    } else {
                                      this.field_p[var11][var13] = -1;
                                      var13++;
                                      continue L30;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L0;
                        } else {
                          this.field_a[this.field_f[var10]] = var17.k(0);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      this.field_k[this.field_f[var10]] = var17.k(0);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var3 = decompiledCaughtException;
            stackOut_94_0 = (RuntimeException) (var3);
            stackOut_94_1 = new StringBuilder().append("kj.A(").append(param0).append(',');
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param1 == null) {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L33;
            } else {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L33;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_97_0), stackIn_97_2 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        oa.field_j = 1;
        un.field_j = gd.field_e[param0];
        un.field_j.b(false);
        if (param1 < 124) {
            tf var3 = (tf) null;
            kj.a(-60, (tf) null, 85, -59, 28, 57);
        }
    }

    final static void a(int param0, tf param1, int param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
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
        var21 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = -91 % ((param3 - 37) / 51);
              var7 = (-param5 + param0 << 2069295144) / param1.field_A;
              param4 = param4 + param1.field_y;
              param2 = param2 + param1.field_D;
              var8 = (param5 << -2062015032) + param1.field_D * var7;
              var9 = param2 + param4 * t.field_j;
              var10 = 0;
              var11 = param1.field_E;
              var12 = param1.field_F;
              var13 = -var12 + t.field_j;
              var14 = 0;
              if (t.field_f <= param4) {
                break L1;
              } else {
                var15 = -param4 + t.field_f;
                var9 = var9 + t.field_j * var15;
                var11 = var11 - var15;
                var10 = var10 + var15 * var12;
                param4 = t.field_f;
                break L1;
              }
            }
            L2: {
              if (param4 - -var11 <= t.field_a) {
                break L2;
              } else {
                var11 = var11 - (var11 + (param4 - t.field_a));
                break L2;
              }
            }
            L3: {
              if (t.field_e > param2) {
                var15 = -param2 + t.field_e;
                var10 = var10 + var15;
                var13 = var13 + var15;
                var9 = var9 + var15;
                var8 = var8 + var7 * var15;
                var12 = var12 - var15;
                param2 = t.field_e;
                var14 = var14 + var15;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (t.field_h < var12 + param2) {
                var15 = param2 + (var12 - t.field_h);
                var13 = var13 + var15;
                var14 = var14 + var15;
                var12 = var12 - var15;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var12 <= 0) {
                break L5;
              } else {
                if ((var11 ^ -1) < -1) {
                  param4 = -var11;
                  L6: while (true) {
                    if (0 <= param4) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var15 = var8;
                      param2 = -var12;
                      L7: while (true) {
                        if (0 <= param2) {
                          var9 = var9 + var13;
                          var10 = var10 + var14;
                          param4++;
                          continue L6;
                        } else {
                          L8: {
                            var16 = var15 >> 1753203496;
                            var17 = -var16 + 256;
                            var15 = var15 + var7;
                            if ((var16 ^ -1) > -1) {
                              var9++;
                              var10++;
                              break L8;
                            } else {
                              L9: {
                                incrementValue$1 = var10;
                                var10++;
                                var18 = param1.field_G[incrementValue$1];
                                if (-1 == (var18 ^ -1)) {
                                  break L9;
                                } else {
                                  if ((var16 ^ -1) < -256) {
                                    t.field_k[var9] = var18;
                                    break L9;
                                  } else {
                                    var19 = t.field_k[var9];
                                    var20 = 16711935 & (var19 & 16711935) * var17 - -((16711935 & var18) * var16) >> 815827592;
                                    t.field_k[var9] = var20 + (cm.a(var17 * cm.a(65280, var19) - -(var16 * cm.a(65280, var18)), 16711874) >> 446495528);
                                    break L9;
                                  }
                                }
                              }
                              var9++;
                              break L8;
                            }
                          }
                          param2++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var6);
            stackOut_30_1 = new StringBuilder().append("kj.D(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    kj(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_o = wg.a(param0, 125, param0.length);
            if (param1 != this.field_o) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != (param2.length ^ -1)) {
                    throw new RuntimeException();
                }
                this.field_e = db.a(param0, 0, 1761872464, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != this.field_e[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(-89, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
