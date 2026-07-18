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

    public static void b() {
        field_j = null;
        field_l = null;
    }

    final static void a() {
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
              il.field_d = null;
              if (null == nk.field_a) {
                break L2;
              } else {
                nk.field_a.e(117);
                nk.field_a = null;
                break L2;
              }
            }
            L3: {
              dg.field_f = null;
              if (null != wi.field_a) {
                wi.field_a.e(126);
                wi.field_a = null;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              eh.field_f = null;
              if (il.field_d == null) {
                break L4;
              } else {
                var3 = (uj) (Object) il.field_d.a(-109);
                L5: while (true) {
                  if (var3 == null) {
                    il.field_d = null;
                    break L4;
                  } else {
                    var3.e(17);
                    var3 = (uj) (Object) il.field_d.a((byte) 50);
                    continue L5;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "kj.C(" + 23949 + ')');
        }
    }

    final static boolean a(char param0) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
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
              if (param0 != 0) {
                var6 = jg.field_I;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param0) {
                      var3++;
                      continue L4;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    }
                  }
                }
              } else {
                return false;
              }
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "kj.F(" + param0 + ',' + 111 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final void a(int param0, byte[] param1) {
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
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var16 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              int discarded$5 = 0;
              var17 = new we(la.a(param1));
              var4 = var17.f(255);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (var4 >= 6) {
                      ((kj) this).field_c = var17.k(0);
                      break L2;
                    } else {
                      ((kj) this).field_c = 0;
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
                      ((kj) this).field_m = var17.i(9997);
                      break L4;
                    } else {
                      ((kj) this).field_m = var17.a((byte) -119);
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
                    ((kj) this).field_f = new int[((kj) this).field_m];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (((kj) this).field_m <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$6 = var8 + var17.a((byte) -111);
                            var8 = dupTemp$6;
                            ((kj) this).field_f[var10] = dupTemp$6;
                            if (((kj) this).field_f[var10] > var9) {
                              var9 = ((kj) this).field_f[var10];
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
                        if (((kj) this).field_m <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$7 = var8 + var17.i(9997);
                            var8 = dupTemp$7;
                            ((kj) this).field_f[var10] = dupTemp$7;
                            if (var9 < ((kj) this).field_f[var10]) {
                              var9 = ((kj) this).field_f[var10];
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
                    ((kj) this).field_b = 1 + var9;
                    ((kj) this).field_h = new int[((kj) this).field_b];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((kj) this).field_d = new byte[((kj) this).field_b][];
                      break L11;
                    }
                  }
                  L12: {
                    ((kj) this).field_a = new int[((kj) this).field_b];
                    ((kj) this).field_r = new int[((kj) this).field_b][];
                    ((kj) this).field_k = new int[((kj) this).field_b];
                    ((kj) this).field_i = new int[((kj) this).field_b];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((kj) this).field_n = new int[((kj) this).field_b];
                      var10 = 0;
                      L13: while (true) {
                        if (((kj) this).field_b <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((kj) this).field_m) {
                              ((kj) this).field_g = new ap(((kj) this).field_n);
                              break L12;
                            } else {
                              ((kj) this).field_n[((kj) this).field_f[var10]] = var17.k(0);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((kj) this).field_n[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((kj) this).field_m <= var10) {
                      L16: {
                        var11 = -1;
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (((kj) this).field_m <= var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (((kj) this).field_m <= var10) {
                                  break L16;
                                } else {
                                  ((kj) this).field_a[((kj) this).field_f[var10]] = var17.k(0);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(var21, 0, -128, 64);
                              ((kj) this).field_d[((kj) this).field_f[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (((kj) this).field_m <= var10) {
                              break L16;
                            } else {
                              ((kj) this).field_a[((kj) this).field_f[var10]] = var17.k(0);
                              var10++;
                              continue L19;
                            }
                          }
                        }
                      }
                      L20: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L21: while (true) {
                            if (((kj) this).field_m <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (((kj) this).field_m <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((kj) this).field_f[var10];
                                  var12 = ((kj) this).field_h[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((kj) this).field_r[var11] = new int[var12];
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var14 >= var12) {
                                      L24: {
                                        ((kj) this).field_i[var11] = 1 + var13;
                                        if (1 + var13 == var12) {
                                          ((kj) this).field_r[var11] = null;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        int dupTemp$8 = var8 + var17.i(9997);
                                        var8 = dupTemp$8;
                                        ((kj) this).field_r[var11][var14] = dupTemp$8;
                                        var15 = dupTemp$8;
                                        if (var13 >= var15) {
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var14++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((kj) this).field_h[((kj) this).field_f[var10]] = var17.i(9997);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (((kj) this).field_m <= var10) {
                              var10 = 0;
                              L27: while (true) {
                                if (((kj) this).field_m <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((kj) this).field_f[var10];
                                  var12 = ((kj) this).field_h[var11];
                                  var8 = 0;
                                  ((kj) this).field_r[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L28: while (true) {
                                    if (var14 >= var12) {
                                      L29: {
                                        ((kj) this).field_i[var11] = var13 - -1;
                                        if (1 + var13 == var12) {
                                          ((kj) this).field_r[var11] = null;
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      L30: {
                                        int dupTemp$9 = var8 + var17.a((byte) -119);
                                        var8 = dupTemp$9;
                                        ((kj) this).field_r[var11][var14] = dupTemp$9;
                                        var15 = dupTemp$9;
                                        if (var13 >= var15) {
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      var14++;
                                      continue L28;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((kj) this).field_h[((kj) this).field_f[var10]] = var17.a((byte) -123);
                              var10++;
                              continue L26;
                            }
                          }
                        }
                      }
                      L31: {
                        if (var6 == 0) {
                          break L31;
                        } else {
                          ((kj) this).field_p = new int[var9 - -1][];
                          ((kj) this).field_q = new ap[var9 + 1];
                          var10 = 0;
                          L32: while (true) {
                            if (((kj) this).field_m <= var10) {
                              break L31;
                            } else {
                              var11 = ((kj) this).field_f[var10];
                              var12 = ((kj) this).field_h[var11];
                              ((kj) this).field_p[var11] = new int[((kj) this).field_i[var11]];
                              var13 = 0;
                              L33: while (true) {
                                if (var13 >= ((kj) this).field_i[var11]) {
                                  var13 = 0;
                                  L34: while (true) {
                                    if (var13 >= var12) {
                                      ((kj) this).field_q[var11] = new ap(((kj) this).field_p[var11]);
                                      var10++;
                                      continue L32;
                                    } else {
                                      L35: {
                                        if (((kj) this).field_r[var11] != null) {
                                          var14 = ((kj) this).field_r[var11][var13];
                                          break L35;
                                        } else {
                                          var14 = var13;
                                          break L35;
                                        }
                                      }
                                      ((kj) this).field_p[var11][var14] = var17.k(0);
                                      var13++;
                                      continue L34;
                                    }
                                  }
                                } else {
                                  ((kj) this).field_p[var11][var13] = -1;
                                  var13++;
                                  continue L33;
                                }
                              }
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
                      ((kj) this).field_k[((kj) this).field_f[var10]] = var17.k(0);
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
          L36: {
            var3 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) var3;
            stackOut_96_1 = new StringBuilder().append("kj.A(").append(-89).append(',');
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param1 == null) {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L36;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L36;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        oa.field_j = 1;
        un.field_j = gd.field_e[param0];
        un.field_j.b(false);
        if (param1 < 124) {
            Object var3 = null;
            kj.a(-60, (tf) null, 85, -59, 28, 57);
        }
    }

    final static void a(int param0, tf param1, int param2, int param3, int param4, int param5) {
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
              var7 = (-param5 + param0 << 8) / param1.field_A;
              param4 = param4 + param1.field_y;
              param2 = param2 + param1.field_D;
              var8 = (param5 << 8) + param1.field_D * var7;
              var9 = param2 + param4 * t.field_j;
              var10 = 0;
              var11 = param1.field_E;
              var12 = param1.field_F;
              var13 = -var12 + t.field_j;
              var14 = 0;
              if (~t.field_f >= ~param4) {
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
              if (~(param4 - -var11) >= ~t.field_a) {
                break L2;
              } else {
                var11 = var11 - (var11 + (param4 - t.field_a));
                break L2;
              }
            }
            L3: {
              if (~t.field_e < ~param2) {
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
              if (~t.field_h > ~(var12 + param2)) {
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
                if (var11 > 0) {
                  param4 = -var11;
                  L6: while (true) {
                    if (0 <= param4) {
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
                            var16 = var15 >> 8;
                            var17 = -var16 + 256;
                            var15 = var15 + var7;
                            if (var16 < 0) {
                              var9++;
                              var10++;
                              break L8;
                            } else {
                              L9: {
                                int incrementValue$1 = var10;
                                var10++;
                                var18 = param1.field_G[incrementValue$1];
                                if (var18 == 0) {
                                  break L9;
                                } else {
                                  if (var16 > 255) {
                                    t.field_k[var9] = var18;
                                    break L9;
                                  } else {
                                    var19 = t.field_k[var9];
                                    var20 = 16711935 & (var19 & 16711935) * var17 - -((16711935 & var18) * var16) >> 8;
                                    t.field_k[var9] = var20 + (cm.a(var17 * cm.a(65280, var19) - -(var16 * cm.a(65280, var18)), 16711874) >> 8);
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
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("kj.D(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    kj(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((kj) this).field_o = wg.a(param0, 125, param0.length);
            if (param1 != ((kj) this).field_o) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((kj) this).field_e = db.a(param0, 0, 1761872464, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != ((kj) this).field_e[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(-89, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "kj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
