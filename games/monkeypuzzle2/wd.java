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
                      ((wd) this).field_l = var17.e(126);
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
                      ((wd) this).field_k = var17.m(-25141);
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
                    ((wd) this).field_f = new int[((wd) this).field_k];
                    var9 = -1;
                    if (7 <= var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((wd) this).field_k) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.m(gi.a(16050, -23687));
                            var8 = dupTemp$4;
                            ((wd) this).field_f[var10] = dupTemp$4;
                            if (((wd) this).field_f[var10] > var9) {
                              var9 = ((wd) this).field_f[var10];
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
                        if (var10 >= ((wd) this).field_k) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.j(gi.a(16050, 32207));
                            var8 = dupTemp$5;
                            ((wd) this).field_f[var10] = dupTemp$5;
                            if (((wd) this).field_f[var10] <= var9) {
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
                    ((wd) this).field_e = 1 + var9;
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((wd) this).field_n = new byte[((wd) this).field_e][];
                      break L11;
                    }
                  }
                  L12: {
                    ((wd) this).field_j = new int[((wd) this).field_e];
                    ((wd) this).field_r = new int[((wd) this).field_e];
                    ((wd) this).field_m = new int[((wd) this).field_e];
                    ((wd) this).field_p = new int[((wd) this).field_e];
                    ((wd) this).field_a = new int[((wd) this).field_e][];
                    if (var6 != 0) {
                      ((wd) this).field_q = new int[((wd) this).field_e];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((wd) this).field_e) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((wd) this).field_k) {
                              ((wd) this).field_b = new ie(((wd) this).field_q);
                              break L12;
                            } else {
                              ((wd) this).field_q[((wd) this).field_f[var10]] = var17.e(127);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((wd) this).field_q[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= ((wd) this).field_k) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (((wd) this).field_k <= var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(var21, 64, -91, 0);
                              ((wd) this).field_n[((wd) this).field_f[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((wd) this).field_k) {
                          L19: {
                            if (7 <= var4) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= ((wd) this).field_k) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= ((wd) this).field_k) {
                                      break L19;
                                    } else {
                                      var11 = ((wd) this).field_f[var10];
                                      var12 = ((wd) this).field_m[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((wd) this).field_a[var11] = new int[var12];
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            ((wd) this).field_r[var11] = var13 + 1;
                                            if (var13 - -1 != var12) {
                                              break L23;
                                            } else {
                                              ((wd) this).field_a[var11] = null;
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.m(-25141);
                                            var8 = dupTemp$6;
                                            ((wd) this).field_a[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var13 < var15) {
                                              var13 = var15;
                                              break L24;
                                            } else {
                                              break L24;
                                            }
                                          }
                                          var14++;
                                          continue L22;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((wd) this).field_m[((wd) this).field_f[var10]] = var17.m(-25141);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (((wd) this).field_k <= var10) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (((wd) this).field_k <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((wd) this).field_f[var10];
                                      var8 = 0;
                                      var12 = ((wd) this).field_m[var11];
                                      ((wd) this).field_a[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var12 <= var14) {
                                          L28: {
                                            ((wd) this).field_r[var11] = 1 + var13;
                                            if (var13 - -1 == var12) {
                                              ((wd) this).field_a[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.j(17277);
                                            var8 = dupTemp$7;
                                            ((wd) this).field_a[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (var13 < var15) {
                                              var13 = var15;
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          var14++;
                                          continue L27;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((wd) this).field_m[((wd) this).field_f[var10]] = var17.j(17277);
                                  var10++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 == 0) {
                              break L30;
                            } else {
                              ((wd) this).field_o = new int[1 + var9][];
                              ((wd) this).field_t = new ie[var9 + 1];
                              var10 = 0;
                              L31: while (true) {
                                if (var10 >= ((wd) this).field_k) {
                                  break L30;
                                } else {
                                  var11 = ((wd) this).field_f[var10];
                                  var12 = ((wd) this).field_m[var11];
                                  ((wd) this).field_o[var11] = new int[((wd) this).field_r[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (((wd) this).field_r[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var13 >= var12) {
                                          ((wd) this).field_t[var11] = new ie(((wd) this).field_o[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null != ((wd) this).field_a[var11]) {
                                              var14 = ((wd) this).field_a[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((wd) this).field_o[var11][var14] = var17.e(-99);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((wd) this).field_o[var11][var13] = -1;
                                      var13++;
                                      continue L32;
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
                          continue L18;
                        }
                      }
                    } else {
                      ((wd) this).field_j[((wd) this).field_f[var10]] = var17.e(-36);
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
          L35: {
            var3 = decompiledCaughtException;
            stackOut_94_0 = (RuntimeException) var3;
            stackOut_94_1 = new StringBuilder().append("wd.B(").append(16050).append(',');
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param1 == null) {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L35;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L35;
            }
          }
          throw la.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + ')');
        }
    }

    public static void a() {
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
                    lf.a(25197, 6);
                    var2 = t.field_v.d((byte) 63);
                    continue L2;
                  }
                }
              } else {
                fc.a(var4, (byte) 108, 6);
                var4 = (mk) (Object) eb.field_C.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2_ref, "wd.C(" + 6 + ',' + true + ')');
        }
    }

    wd(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            int discarded$0 = -18694;
            ((wd) this).field_d = w.a(param0.length, param0);
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
            throw la.a((Throwable) (Object) runtimeException, "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
