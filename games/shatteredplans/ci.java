/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    int[] field_q;
    cm[] field_i;
    static boolean field_o;
    int[] field_n;
    private byte[] field_u;
    int[][] field_k;
    int[] field_m;
    static bi field_p;
    int field_c;
    static String field_d;
    private int[][] field_t;
    static String field_g;
    static bi field_r;
    private int[] field_s;
    cm field_b;
    byte[][] field_j;
    private int field_l;
    int[] field_v;
    static int[][] field_h;
    int[] field_f;
    int field_a;
    int field_e;

    public static void a(boolean param0) {
        field_d = null;
        field_g = null;
        field_h = null;
        field_r = null;
        field_p = null;
    }

    private final void a(byte[] param0, byte param1) {
        RuntimeException var3 = null;
        ob var3_ref = null;
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
        ob var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new ob(pa.a(param0, 200));
              var3_ref = var17;
              var4 = var17.j(-89);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      ((ci) this).field_e = 0;
                      break L2;
                    } else {
                      ((ci) this).field_e = var17.a(16711680);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.j(-57);
                    if (0 == (1 & var5)) {
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
                    if (var4 < 7) {
                      ((ci) this).field_l = var17.f(-20976);
                      break L4;
                    } else {
                      ((ci) this).field_l = var17.d(true);
                      break L4;
                    }
                  }
                  L5: {
                    if ((2 & var5) == 0) {
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
                    ((ci) this).field_q = new int[((ci) this).field_l];
                    var9 = -1;
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (((ci) this).field_l <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.f(-20976);
                            var8 = dupTemp$4;
                            ((ci) this).field_q[var10] = dupTemp$4;
                            if (((ci) this).field_q[var10] > var9) {
                              var9 = ((ci) this).field_q[var10];
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
                        if (((ci) this).field_l <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.d(true);
                            var8 = dupTemp$5;
                            ((ci) this).field_q[var10] = dupTemp$5;
                            if (((ci) this).field_q[var10] <= var9) {
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
                    ((ci) this).field_a = 1 + var9;
                    ((ci) this).field_k = new int[((ci) this).field_a][];
                    ((ci) this).field_n = new int[((ci) this).field_a];
                    ((ci) this).field_m = new int[((ci) this).field_a];
                    ((ci) this).field_f = new int[((ci) this).field_a];
                    if (var7 != 0) {
                      ((ci) this).field_j = new byte[((ci) this).field_a][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((ci) this).field_v = new int[((ci) this).field_a];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((ci) this).field_s = new int[((ci) this).field_a];
                      var10 = 0;
                      L13: while (true) {
                        if (((ci) this).field_a <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((ci) this).field_l) {
                              ((ci) this).field_b = new cm(((ci) this).field_s);
                              break L12;
                            } else {
                              ((ci) this).field_s[((ci) this).field_q[var10]] = var17.a(16711680);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((ci) this).field_s[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((ci) this).field_l <= var10) {
                      if (var7 != 0) {
                        var10 = 0;
                        L16: while (true) {
                          if (((ci) this).field_l <= var10) {
                            return;
                          } else {
                            var21 = new byte[64];
                            var17.a(64, 0, 17469032, var21);
                            ((ci) this).field_j[((ci) this).field_q[var10]] = var21;
                            var10++;
                            continue L16;
                          }
                        }
                      } else {
                        var10 = 0;
                        L17: while (true) {
                          if (var10 >= ((ci) this).field_l) {
                            L18: {
                              if (var4 < 7) {
                                var10 = 0;
                                L19: while (true) {
                                  if (var10 >= ((ci) this).field_l) {
                                    var10 = 0;
                                    L20: while (true) {
                                      if (var10 >= ((ci) this).field_l) {
                                        break L18;
                                      } else {
                                        var11 = ((ci) this).field_q[var10];
                                        var8 = 0;
                                        var12 = ((ci) this).field_n[var11];
                                        var13 = -1;
                                        ((ci) this).field_k[var11] = new int[var12];
                                        var14 = 0;
                                        L21: while (true) {
                                          if (var12 <= var14) {
                                            L22: {
                                              ((ci) this).field_m[var11] = 1 + var13;
                                              if (var13 - -1 == var12) {
                                                ((ci) this).field_k[var11] = null;
                                                break L22;
                                              } else {
                                                break L22;
                                              }
                                            }
                                            var10++;
                                            continue L20;
                                          } else {
                                            L23: {
                                              int dupTemp$6 = var8 + var17.f(-20976);
                                              var8 = dupTemp$6;
                                              ((ci) this).field_k[var11][var14] = dupTemp$6;
                                              var15 = dupTemp$6;
                                              if (var13 < var15) {
                                                var13 = var15;
                                                break L23;
                                              } else {
                                                break L23;
                                              }
                                            }
                                            var14++;
                                            continue L21;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    ((ci) this).field_n[((ci) this).field_q[var10]] = var17.f(-20976);
                                    var10++;
                                    continue L19;
                                  }
                                }
                              } else {
                                var10 = 0;
                                L24: while (true) {
                                  if (((ci) this).field_l <= var10) {
                                    var10 = 0;
                                    L25: while (true) {
                                      if (var10 >= ((ci) this).field_l) {
                                        break L18;
                                      } else {
                                        var11 = ((ci) this).field_q[var10];
                                        var12 = ((ci) this).field_n[var11];
                                        var8 = 0;
                                        ((ci) this).field_k[var11] = new int[var12];
                                        var13 = -1;
                                        var14 = 0;
                                        L26: while (true) {
                                          if (var12 <= var14) {
                                            L27: {
                                              ((ci) this).field_m[var11] = var13 + 1;
                                              if (var12 == 1 + var13) {
                                                ((ci) this).field_k[var11] = null;
                                                break L27;
                                              } else {
                                                break L27;
                                              }
                                            }
                                            var10++;
                                            continue L25;
                                          } else {
                                            L28: {
                                              int dupTemp$7 = var8 + var17.d(true);
                                              var8 = dupTemp$7;
                                              ((ci) this).field_k[var11][var14] = dupTemp$7;
                                              var15 = dupTemp$7;
                                              if (var15 > var13) {
                                                var13 = var15;
                                                break L28;
                                              } else {
                                                break L28;
                                              }
                                            }
                                            var14++;
                                            continue L26;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    ((ci) this).field_n[((ci) this).field_q[var10]] = var17.d(true);
                                    var10++;
                                    continue L24;
                                  }
                                }
                              }
                            }
                            L29: {
                              if (var6 == 0) {
                                break L29;
                              } else {
                                ((ci) this).field_t = new int[1 + var9][];
                                ((ci) this).field_i = new cm[var9 - -1];
                                var10 = 0;
                                L30: while (true) {
                                  if (((ci) this).field_l <= var10) {
                                    break L29;
                                  } else {
                                    var11 = ((ci) this).field_q[var10];
                                    var12 = ((ci) this).field_n[var11];
                                    ((ci) this).field_t[var11] = new int[((ci) this).field_m[var11]];
                                    var13 = 0;
                                    L31: while (true) {
                                      if (((ci) this).field_m[var11] <= var13) {
                                        var13 = 0;
                                        L32: while (true) {
                                          if (var13 >= var12) {
                                            ((ci) this).field_i[var11] = new cm(((ci) this).field_t[var11]);
                                            var10++;
                                            continue L30;
                                          } else {
                                            L33: {
                                              if (((ci) this).field_k[var11] == null) {
                                                var14 = var13;
                                                break L33;
                                              } else {
                                                var14 = ((ci) this).field_k[var11][var13];
                                                break L33;
                                              }
                                            }
                                            ((ci) this).field_t[var11][var14] = var17.a(16711680);
                                            var13++;
                                            continue L32;
                                          }
                                        }
                                      } else {
                                        ((ci) this).field_t[var11][var13] = -1;
                                        var13++;
                                        continue L31;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            break L0;
                          } else {
                            ((ci) this).field_v[((ci) this).field_q[var10]] = var17.a(16711680);
                            var10++;
                            continue L17;
                          }
                        }
                      }
                    } else {
                      ((ci) this).field_f[((ci) this).field_q[var10]] = var17.a(16711680);
                      var10++;
                      continue L15;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var3 = decompiledCaughtException;
            stackOut_97_0 = (RuntimeException) var3;
            stackOut_97_1 = new StringBuilder().append("ci.B(");
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param0 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L34;
            } else {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L34;
            }
          }
          throw r.a((Throwable) (Object) stackIn_100_0, stackIn_100_2 + 44 + 86 + 41);
        }
    }

    ci(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((ci) this).field_c = me.a(62, param0, param0.length);
            if (((ci) this).field_c != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((ci) this).field_u = dp.a(param0, param0.length, -26131, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((ci) this).field_u[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, (byte) 86);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ci.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Solicitation";
    }
}
