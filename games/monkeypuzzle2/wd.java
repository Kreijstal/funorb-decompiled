/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    int[][] field_a;
    int[] field_m;
    int[] field_r;
    ie[] field_t;
    private byte[] field_c;
    int[] field_p;
    private int[] field_q;
    int field_e;
    static boolean field_g;
    int[] field_f;
    static pj field_h;
    int field_d;
    private int field_k;
    byte[][] field_n;
    int[] field_j;
    static ud field_i;
    int field_l;
    private int[][] field_o;
    ie field_b;
    static String field_s;

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
        gk var17 = null;
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
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new gk(rc.a(param1, 115));
              var4 = var17.a((byte) 114);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      ((wd) this).field_l = var17.e(param0 ^ 16076);
                      break L2;
                    } else {
                      ((wd) this).field_l = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.a((byte) 114);
                    if ((var5 & 1) == 0) {
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
                    if (7 > var4) {
                      ((wd) this).field_k = var17.j(17277);
                      break L4;
                    } else {
                      ((wd) this).field_k = var17.m(param0 + -41191);
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
                    if (param0 == 16050) {
                      break L6;
                    } else {
                      ((wd) this).field_j = null;
                      break L6;
                    }
                  }
                  L7: {
                    var8 = 0;
                    ((wd) this).field_f = new int[((wd) this).field_k];
                    var9 = -1;
                    if (7 <= var4) {
                      var10 = 0;
                      L8: while (true) {
                        if (var10 >= ((wd) this).field_k) {
                          break L7;
                        } else {
                          L9: {
                            int dupTemp$4 = var8 + var17.m(gi.a(param0, -23687));
                            var8 = dupTemp$4;
                            ((wd) this).field_f[var10] = dupTemp$4;
                            if (((wd) this).field_f[var10] > var9) {
                              var9 = ((wd) this).field_f[var10];
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10++;
                          continue L8;
                        }
                      }
                    } else {
                      var10 = 0;
                      L10: while (true) {
                        if (var10 >= ((wd) this).field_k) {
                          break L7;
                        } else {
                          L11: {
                            int dupTemp$5 = var8 + var17.j(gi.a(param0, 32207));
                            var8 = dupTemp$5;
                            ((wd) this).field_f[var10] = dupTemp$5;
                            if (((wd) this).field_f[var10] <= var9) {
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var10++;
                          continue L10;
                        }
                      }
                    }
                  }
                  L12: {
                    ((wd) this).field_e = 1 + var9;
                    if (var7 == 0) {
                      break L12;
                    } else {
                      ((wd) this).field_n = new byte[((wd) this).field_e][];
                      break L12;
                    }
                  }
                  L13: {
                    ((wd) this).field_j = new int[((wd) this).field_e];
                    ((wd) this).field_r = new int[((wd) this).field_e];
                    ((wd) this).field_m = new int[((wd) this).field_e];
                    ((wd) this).field_p = new int[((wd) this).field_e];
                    ((wd) this).field_a = new int[((wd) this).field_e][];
                    if (var6 != 0) {
                      ((wd) this).field_q = new int[((wd) this).field_e];
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((wd) this).field_e) {
                          var10 = 0;
                          L15: while (true) {
                            if (var10 >= ((wd) this).field_k) {
                              ((wd) this).field_b = new ie(((wd) this).field_q);
                              break L13;
                            } else {
                              ((wd) this).field_q[((wd) this).field_f[var10]] = var17.e(127);
                              var10++;
                              continue L15;
                            }
                          }
                        } else {
                          ((wd) this).field_q[var10] = -1;
                          var10++;
                          continue L14;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (var10 >= ((wd) this).field_k) {
                      L17: {
                        if (var7 == 0) {
                          break L17;
                        } else {
                          var10 = 0;
                          L18: while (true) {
                            if (((wd) this).field_k <= var10) {
                              break L17;
                            } else {
                              var21 = new byte[64];
                              var17.a(var21, 64, -91, 0);
                              ((wd) this).field_n[((wd) this).field_f[var10]] = var21;
                              var10++;
                              continue L18;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L19: while (true) {
                        if (var10 >= ((wd) this).field_k) {
                          L20: {
                            if (7 <= var4) {
                              var10 = 0;
                              L21: while (true) {
                                if (var10 >= ((wd) this).field_k) {
                                  var10 = 0;
                                  L22: while (true) {
                                    if (var10 >= ((wd) this).field_k) {
                                      break L20;
                                    } else {
                                      var11 = ((wd) this).field_f[var10];
                                      var12 = ((wd) this).field_m[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((wd) this).field_a[var11] = new int[var12];
                                      var14 = 0;
                                      L23: while (true) {
                                        if (var12 <= var14) {
                                          L24: {
                                            ((wd) this).field_r[var11] = var13 + 1;
                                            if (var13 - -1 != var12) {
                                              break L24;
                                            } else {
                                              ((wd) this).field_a[var11] = null;
                                              break L24;
                                            }
                                          }
                                          var10++;
                                          continue L22;
                                        } else {
                                          L25: {
                                            int dupTemp$6 = var8 + var17.m(-25141);
                                            var8 = dupTemp$6;
                                            ((wd) this).field_a[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var13 < var15) {
                                              var13 = var15;
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
                                  ((wd) this).field_m[((wd) this).field_f[var10]] = var17.m(-25141);
                                  var10++;
                                  continue L21;
                                }
                              }
                            } else {
                              var10 = 0;
                              L26: while (true) {
                                if (((wd) this).field_k <= var10) {
                                  var10 = 0;
                                  L27: while (true) {
                                    if (((wd) this).field_k <= var10) {
                                      break L20;
                                    } else {
                                      var11 = ((wd) this).field_f[var10];
                                      var8 = 0;
                                      var12 = ((wd) this).field_m[var11];
                                      ((wd) this).field_a[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L28: while (true) {
                                        if (var12 <= var14) {
                                          L29: {
                                            ((wd) this).field_r[var11] = 1 + var13;
                                            if (var13 - -1 == var12) {
                                              ((wd) this).field_a[var11] = null;
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          var10++;
                                          continue L27;
                                        } else {
                                          L30: {
                                            int dupTemp$7 = var8 + var17.j(17277);
                                            var8 = dupTemp$7;
                                            ((wd) this).field_a[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (var13 < var15) {
                                              var13 = var15;
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
                                  ((wd) this).field_m[((wd) this).field_f[var10]] = var17.j(param0 + 1227);
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
                              ((wd) this).field_o = new int[1 + var9][];
                              ((wd) this).field_t = new ie[var9 + 1];
                              var10 = 0;
                              L32: while (true) {
                                if (var10 >= ((wd) this).field_k) {
                                  break L31;
                                } else {
                                  var11 = ((wd) this).field_f[var10];
                                  var12 = ((wd) this).field_m[var11];
                                  ((wd) this).field_o[var11] = new int[((wd) this).field_r[var11]];
                                  var13 = 0;
                                  L33: while (true) {
                                    if (((wd) this).field_r[var11] <= var13) {
                                      var13 = 0;
                                      L34: while (true) {
                                        if (var13 >= var12) {
                                          ((wd) this).field_t[var11] = new ie(((wd) this).field_o[var11]);
                                          var10++;
                                          continue L32;
                                        } else {
                                          L35: {
                                            if (null != ((wd) this).field_a[var11]) {
                                              var14 = ((wd) this).field_a[var11][var13];
                                              break L35;
                                            } else {
                                              var14 = var13;
                                              break L35;
                                            }
                                          }
                                          ((wd) this).field_o[var11][var14] = var17.e(-99);
                                          var13++;
                                          continue L34;
                                        }
                                      }
                                    } else {
                                      ((wd) this).field_o[var11][var13] = -1;
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
                          ((wd) this).field_p[((wd) this).field_f[var10]] = var17.e(-31);
                          var10++;
                          continue L19;
                        }
                      }
                    } else {
                      ((wd) this).field_j[((wd) this).field_f[var10]] = var17.e(-36);
                      var10++;
                      continue L16;
                    }
                  }
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
            stackOut_96_1 = new StringBuilder().append("wd.B(").append(param0).append(44);
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
          throw la.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + 41);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_i = null;
        field_s = null;
    }

    final static void a(int param0, boolean param1) {
        ug var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        mk var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (mk) (Object) eb.field_C.a((byte) -117);
            L1: while (true) {
              if (var4 == null) {
                var2 = t.field_v.a((byte) -117);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    lf.a(25197, param0);
                    var2 = t.field_v.d((byte) 63);
                    continue L2;
                  }
                }
              } else {
                fc.a(var4, (byte) 108, param0);
                var4 = (mk) (Object) eb.field_C.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2_ref, "wd.C(" + param0 + 44 + 1 + 41);
        }
    }

    wd(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((wd) this).field_d = w.a(param0.length, param0, -18694);
            if (param1 != ((wd) this).field_d) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != param2.length) {
                    throw new RuntimeException();
                }
                ((wd) this).field_c = ie.a(-106, param0, param0.length, 0);
                for (var4_int = 0; -65 > var4_int; var4_int++) {
                    if (param2[var4_int] != ((wd) this).field_c[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(16050, param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "wd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = false;
        field_h = new pj();
        field_s = "Create your own free Jagex account";
    }
}
