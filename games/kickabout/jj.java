/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends lq {
    private int[][] field_j;
    private qm[] field_p;
    static String field_m;
    ru[] field_k;
    int[] field_n;
    private int[] field_l;
    int field_o;
    private int[] field_i;

    final int d() {
        return 2;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        L0: {
          if (param2 == -85) {
            break L0;
          } else {
            ((jj) this).field_l = null;
            break L0;
          }
        }
        L1: {
          if (param0 < 0) {
            break L1;
          } else {
            if (((jj) this).field_o <= param0) {
              break L1;
            } else {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (256 >= param1) {
                    ((jj) this).field_l[param0] = param1;
                    return;
                  } else {
                    break L2;
                  }
                }
              }
              throw new IllegalArgumentException("Illegal volume: " + param1);
            }
          }
        }
        throw new IllegalArgumentException("Illegal midiplayer: " + param0);
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            var4_int = 1;
            var5 = 0;
            L1: while (true) {
              if (((jj) this).field_l.length <= var5) {
                if (var4_int == 0) {
                  var5 = 0;
                  var6_int = 0;
                  L2: while (true) {
                    if (var6_int >= ((jj) this).field_p.length) {
                      var12 = 0;
                      var6_int = var12;
                      L3: while (true) {
                        if (var12 >= ((jj) this).field_n.length) {
                          var16 = new int[((jj) this).field_o];
                          var15 = var16;
                          var14 = var15;
                          var13 = var14;
                          var6 = var13;
                          var7 = 0;
                          L4: while (true) {
                            if (var7 >= var16.length) {
                              if (var5 != 0) {
                                L5: {
                                  if (!uh.field_o) {
                                    stackOut_34_0 = param2;
                                    stackIn_35_0 = stackOut_34_0;
                                    break L5;
                                  } else {
                                    stackOut_33_0 = param2 << 1;
                                    stackIn_35_0 = stackOut_33_0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  L7: {
                                    var7 = stackIn_35_0;
                                    if (((jj) this).field_j[0] == null) {
                                      break L7;
                                    } else {
                                      if (var7 <= ((jj) this).field_j[0].length) {
                                        var8 = 0;
                                        L8: while (true) {
                                          if (((jj) this).field_j.length <= var8) {
                                            break L6;
                                          } else {
                                            dv.a(((jj) this).field_j[var8], 0, var7);
                                            var8++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var8 = 0;
                                  L9: while (true) {
                                    if (var8 >= ((jj) this).field_j.length) {
                                      break L6;
                                    } else {
                                      ((jj) this).field_j[var8] = new int[var7];
                                      var8++;
                                      continue L9;
                                    }
                                  }
                                }
                                var8 = 0;
                                L10: while (true) {
                                  if (var8 >= ((jj) this).field_p.length) {
                                    L11: {
                                      if (uh.field_o) {
                                        param1 = param1 << 1;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var8 >= var7) {
                                        break L0;
                                      } else {
                                        var9 = 0;
                                        var10 = 0;
                                        L13: while (true) {
                                          if (((jj) this).field_j.length <= var10) {
                                            param0[var8 + param1] = param0[var8 + param1] + (var9 >> 8);
                                            var8++;
                                            continue L12;
                                          } else {
                                            L14: {
                                              if (null != ((jj) this).field_p[var10]) {
                                                var9 = var9 + ((jj) this).field_j[var10][var8] * var16[var10];
                                                break L14;
                                              } else {
                                                break L14;
                                              }
                                            }
                                            var10++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L15: {
                                      if (((jj) this).field_p[var8] == null) {
                                        break L15;
                                      } else {
                                        ((jj) this).field_k[var8].a(((jj) this).field_j[var8], param1, param2);
                                        break L15;
                                      }
                                    }
                                    var8++;
                                    continue L10;
                                  }
                                }
                              } else {
                                return;
                              }
                            } else {
                              var6[var7] = (((jj) this).field_i[var7] >> 12) * ((jj) this).field_l[var7] / 256;
                              var7++;
                              continue L4;
                            }
                          }
                        } else {
                          L16: {
                            if (((jj) this).field_n[var12] != 0) {
                              L17: {
                                ((jj) this).field_i[var12] = ((jj) this).field_i[var12] + ((jj) this).field_n[var12] * param2;
                                if (((jj) this).field_i[var12] >= 1048576) {
                                  ((jj) this).field_i[var12] = 1048576;
                                  ((jj) this).field_n[var12] = 0;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              if (((jj) this).field_i[var12] <= 0) {
                                L18: {
                                  ((jj) this).field_i[var12] = 0;
                                  ((jj) this).field_n[var12] = 0;
                                  if (((jj) this).field_p[var12] == null) {
                                    break L18;
                                  } else {
                                    ((jj) this).field_k[var12].b(21404);
                                    break L18;
                                  }
                                }
                                ((jj) this).field_p[var12] = null;
                                break L16;
                              } else {
                                break L16;
                              }
                            } else {
                              break L16;
                            }
                          }
                          var12++;
                          continue L3;
                        }
                      }
                    } else {
                      L19: {
                        if (((jj) this).field_p[var6_int] == null) {
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      var6_int++;
                      continue L2;
                    }
                  }
                } else {
                  ((jj) this).a(param2);
                  return;
                }
              } else {
                L20: {
                  if (((jj) this).field_l[var5] == 0) {
                    break L20;
                  } else {
                    break L20;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var4 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var4;
            stackOut_62_1 = new StringBuilder().append("jj.E(");
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param0 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L21;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L21;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final lq b() {
        return null;
    }

    final void a(boolean param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param4 < 0) {
                break L1;
              } else {
                if (((jj) this).field_o <= param4) {
                  break L1;
                } else {
                  L2: {
                    if (null != ((jj) this).field_p[param4]) {
                      ((jj) this).field_k[param4].b(21404);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    ((jj) this).field_p[param4] = param2;
                    if (param2 != null) {
                      ((jj) this).field_n[param4] = param5;
                      ((jj) this).field_k[param4].d(-1, -1, param6);
                      ((jj) this).field_k[param4].a(param0, 19134, param2);
                      ((jj) this).field_k[param4].c(param1, 107342216);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (param3 == -9017) {
                      break L4;
                    } else {
                      field_m = null;
                      break L4;
                    }
                  }
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("Illegal midiplayer: " + param4);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("jj.D(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        for (var4 = param0; ((jj) this).field_k.length > var4; var4++) {
            ((jj) this).field_k[var4].b(param2, param1, (byte) -73);
        }
    }

    final static byte[] a(int param0, byte[] param1, byte param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        m var6 = null;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var5 = 34 / ((param2 - -65) / 52);
              if (param3 <= 0) {
                var4 = param1;
                break L1;
              } else {
                var9 = new byte[param0];
                var4 = var9;
                var6_int = 0;
                L2: while (true) {
                  if (param0 <= var6_int) {
                    break L1;
                  } else {
                    var9[var6_int] = param1[param3 + var6_int];
                    var6_int++;
                    continue L2;
                  }
                }
              }
            }
            var6 = new m();
            var6.a(true);
            var6.a((byte) 126, (long)(param0 * 8), var4);
            var7 = new byte[64];
            var6.a(var7, 21024, 0);
            stackOut_6_0 = (byte[]) var7;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("jj.A(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    final void a(int param0) {
        int var2_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var4 = Kickabout.field_G;
        var2_int = 0;
        L0: while (true) {
          if (((jj) this).field_k.length <= var2_int) {
            var10 = new int[((jj) this).field_o];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var5 = var7;
            var2 = var5;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var10.length) {
                var6 = 0;
                var3 = var6;
                L2: while (true) {
                  if (((jj) this).field_n.length <= var6) {
                    return;
                  } else {
                    if (0 != ((jj) this).field_n[var6]) {
                      L3: {
                        ((jj) this).field_i[var6] = ((jj) this).field_i[var6] + param0 * ((jj) this).field_n[var6];
                        if (((jj) this).field_i[var6] >= 1048576) {
                          ((jj) this).field_i[var6] = 1048576;
                          ((jj) this).field_n[var6] = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (((jj) this).field_i[var6] <= 0) {
                        L4: {
                          ((jj) this).field_i[var6] = 0;
                          ((jj) this).field_n[var6] = 0;
                          if (((jj) this).field_p[var6] == null) {
                            break L4;
                          } else {
                            ((jj) this).field_k[var6].b(21404);
                            break L4;
                          }
                        }
                        ((jj) this).field_p[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                var5[var3] = (((jj) this).field_i[var3] >> 12) * ((jj) this).field_l[var3] / 256;
                var3++;
                continue L1;
              }
            }
          } else {
            if (null != ((jj) this).field_p[var2_int]) {
              ((jj) this).field_k[var2_int].a(param0);
              var2_int++;
              continue L0;
            } else {
              var2_int++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
    }

    final lq c() {
        return null;
    }

    jj(int param0) {
        int var2 = 0;
        ((jj) this).field_o = 3;
        ((jj) this).field_o = param0;
        ((jj) this).field_l = new int[param0];
        for (var2 = 0; var2 < ((jj) this).field_l.length; var2++) {
            ((jj) this).field_l[var2] = 256;
        }
        ((jj) this).field_i = new int[((jj) this).field_o];
        ((jj) this).field_j = new int[((jj) this).field_o][];
        ((jj) this).field_k = new ru[((jj) this).field_o];
        ((jj) this).field_n = new int[((jj) this).field_o];
        ((jj) this).field_p = new qm[((jj) this).field_o];
        int var4 = 0;
        var2 = var4;
        while (var4 < ((jj) this).field_k.length) {
            if (var4 == 0) {
                ((jj) this).field_k[var4] = new ru();
            } else {
                ((jj) this).field_k[var4] = new ru(((jj) this).field_k[-1 + var4]);
            }
            ((jj) this).field_i[var4] = 1048576;
            var4++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "<%0> has left the lobby.";
    }
}
