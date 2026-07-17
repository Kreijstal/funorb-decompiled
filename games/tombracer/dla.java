/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dla {
    int field_d;
    int field_l;
    int[] field_f;
    private int[][] field_m;
    int[] field_k;
    pla[] field_e;
    pla field_b;
    int[][] field_n;
    private int field_o;
    int[] field_p;
    int[] field_c;
    int[] field_j;
    private byte[] field_i;
    private int[] field_g;
    int field_a;
    byte[][] field_h;

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
        uia var17 = null;
        byte[] var21 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var17 = new uia(sua.a(param1, -106));
            if (param0 == -23918) {
              L1: {
                var4 = var17.h(255);
                if (5 > var4) {
                  break L1;
                } else {
                  if (var4 <= 7) {
                    L2: {
                      if (6 <= var4) {
                        ((dla) this).field_a = var17.e(param0 ^ 23871);
                        break L2;
                      } else {
                        ((dla) this).field_a = 0;
                        break L2;
                      }
                    }
                    L3: {
                      var5 = var17.h(255);
                      if (0 == (1 & var5)) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var6 = stackIn_13_0;
                      if (0 == (2 & var5)) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var7 = stackIn_16_0;
                      if (var4 < 7) {
                        ((dla) this).field_o = var17.d(127);
                        break L5;
                      } else {
                        ((dla) this).field_o = var17.g(-48);
                        break L5;
                      }
                    }
                    L6: {
                      var8 = 0;
                      var9 = -1;
                      ((dla) this).field_k = new int[((dla) this).field_o];
                      if (7 > var4) {
                        var10 = 0;
                        L7: while (true) {
                          if (var10 >= ((dla) this).field_o) {
                            break L6;
                          } else {
                            L8: {
                              int dupTemp$4 = var8 + var17.d(125);
                              var8 = dupTemp$4;
                              ((dla) this).field_k[var10] = dupTemp$4;
                              if (((dla) this).field_k[var10] > var9) {
                                var9 = ((dla) this).field_k[var10];
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
                          if (((dla) this).field_o <= var10) {
                            break L6;
                          } else {
                            L10: {
                              int dupTemp$5 = var8 + var17.g(-48);
                              var8 = dupTemp$5;
                              ((dla) this).field_k[var10] = dupTemp$5;
                              if (var9 < ((dla) this).field_k[var10]) {
                                var9 = ((dla) this).field_k[var10];
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
                      ((dla) this).field_l = var9 - -1;
                      ((dla) this).field_f = new int[((dla) this).field_l];
                      if (var7 != 0) {
                        ((dla) this).field_h = new byte[((dla) this).field_l][];
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      ((dla) this).field_c = new int[((dla) this).field_l];
                      ((dla) this).field_p = new int[((dla) this).field_l];
                      ((dla) this).field_n = new int[((dla) this).field_l][];
                      ((dla) this).field_j = new int[((dla) this).field_l];
                      if (var6 != 0) {
                        ((dla) this).field_g = new int[((dla) this).field_l];
                        var10 = 0;
                        L13: while (true) {
                          if (var10 >= ((dla) this).field_l) {
                            var10 = 0;
                            L14: while (true) {
                              if (((dla) this).field_o <= var10) {
                                ((dla) this).field_b = new pla(((dla) this).field_g);
                                break L12;
                              } else {
                                ((dla) this).field_g[((dla) this).field_k[var10]] = var17.e(119);
                                var10++;
                                continue L14;
                              }
                            }
                          } else {
                            ((dla) this).field_g[var10] = -1;
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
                      if (((dla) this).field_o <= var10) {
                        L16: {
                          if (var7 != 0) {
                            var10 = 0;
                            L17: while (true) {
                              if (((dla) this).field_o <= var10) {
                                var10 = 0;
                                L18: while (true) {
                                  if (((dla) this).field_o <= var10) {
                                    break L16;
                                  } else {
                                    ((dla) this).field_f[((dla) this).field_k[var10]] = var17.e(95);
                                    var10++;
                                    continue L18;
                                  }
                                }
                              } else {
                                var21 = new byte[64];
                                var17.a(var21, 0, -106, 64);
                                ((dla) this).field_h[((dla) this).field_k[var10]] = var21;
                                var10++;
                                continue L17;
                              }
                            }
                          } else {
                            var10 = 0;
                            L19: while (true) {
                              if (((dla) this).field_o <= var10) {
                                break L16;
                              } else {
                                ((dla) this).field_f[((dla) this).field_k[var10]] = var17.e(95);
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
                              if (((dla) this).field_o <= var10) {
                                var10 = 0;
                                L22: while (true) {
                                  if (((dla) this).field_o <= var10) {
                                    break L20;
                                  } else {
                                    var11 = ((dla) this).field_k[var10];
                                    var8 = 0;
                                    var12 = ((dla) this).field_c[var11];
                                    var13 = -1;
                                    ((dla) this).field_n[var11] = new int[var12];
                                    var14 = 0;
                                    L23: while (true) {
                                      if (var14 >= var12) {
                                        L24: {
                                          ((dla) this).field_p[var11] = var13 + 1;
                                          if (1 + var13 != var12) {
                                            break L24;
                                          } else {
                                            ((dla) this).field_n[var11] = null;
                                            break L24;
                                          }
                                        }
                                        var10++;
                                        continue L22;
                                      } else {
                                        L25: {
                                          int dupTemp$6 = var8 + var17.g(-48);
                                          var8 = dupTemp$6;
                                          ((dla) this).field_n[var11][var14] = dupTemp$6;
                                          var15 = dupTemp$6;
                                          if (var15 <= var13) {
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
                                ((dla) this).field_c[((dla) this).field_k[var10]] = var17.g(-48);
                                var10++;
                                continue L21;
                              }
                            }
                          } else {
                            var10 = 0;
                            L26: while (true) {
                              if (((dla) this).field_o <= var10) {
                                var10 = 0;
                                L27: while (true) {
                                  if (((dla) this).field_o <= var10) {
                                    break L20;
                                  } else {
                                    var11 = ((dla) this).field_k[var10];
                                    var12 = ((dla) this).field_c[var11];
                                    var8 = 0;
                                    var13 = -1;
                                    ((dla) this).field_n[var11] = new int[var12];
                                    var14 = 0;
                                    L28: while (true) {
                                      if (var12 <= var14) {
                                        L29: {
                                          ((dla) this).field_p[var11] = var13 + 1;
                                          if (var12 == 1 + var13) {
                                            ((dla) this).field_n[var11] = null;
                                            break L29;
                                          } else {
                                            break L29;
                                          }
                                        }
                                        var10++;
                                        continue L27;
                                      } else {
                                        L30: {
                                          int dupTemp$7 = var8 + var17.d(123);
                                          var8 = dupTemp$7;
                                          ((dla) this).field_n[var11][var14] = dupTemp$7;
                                          var15 = dupTemp$7;
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
                                ((dla) this).field_c[((dla) this).field_k[var10]] = var17.d(123);
                                var10++;
                                continue L26;
                              }
                            }
                          }
                        }
                        L31: {
                          if (var6 != 0) {
                            ((dla) this).field_e = new pla[var9 - -1];
                            ((dla) this).field_m = new int[1 + var9][];
                            var10 = 0;
                            L32: while (true) {
                              if (var10 >= ((dla) this).field_o) {
                                break L31;
                              } else {
                                var11 = ((dla) this).field_k[var10];
                                var12 = ((dla) this).field_c[var11];
                                ((dla) this).field_m[var11] = new int[((dla) this).field_p[var11]];
                                var13 = 0;
                                L33: while (true) {
                                  if (((dla) this).field_p[var11] <= var13) {
                                    var13 = 0;
                                    L34: while (true) {
                                      if (var13 >= var12) {
                                        ((dla) this).field_e[var11] = new pla(((dla) this).field_m[var11]);
                                        var10++;
                                        continue L32;
                                      } else {
                                        L35: {
                                          if (null == ((dla) this).field_n[var11]) {
                                            var14 = var13;
                                            break L35;
                                          } else {
                                            var14 = ((dla) this).field_n[var11][var13];
                                            break L35;
                                          }
                                        }
                                        ((dla) this).field_m[var11][var14] = var17.e(kha.b(param0, 23927));
                                        var13++;
                                        continue L34;
                                      }
                                    }
                                  } else {
                                    ((dla) this).field_m[var11][var13] = -1;
                                    var13++;
                                    continue L33;
                                  }
                                }
                              }
                            }
                          } else {
                            break L31;
                          }
                        }
                        break L0;
                      } else {
                        ((dla) this).field_j[((dla) this).field_k[var10]] = var17.e(-69);
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var3 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) var3;
            stackOut_100_1 = new StringBuilder().append("dla.A(").append(param0).append(44);
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param1 == null) {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L36;
            } else {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L36;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_103_0, stackIn_103_2 + 41);
        }
    }

    final static int a(int param0) {
        if (cga.field_f < 2) {
          return 0;
        } else {
          L0: {
            if (bg.field_t == 0) {
              if (!tk.field_b.b(-100)) {
                return 20;
              } else {
                if (tk.field_b.c("commonui", param0 ^ -122)) {
                  if (!hm.field_n.b(param0 + -100)) {
                    return 50;
                  } else {
                    if (hm.field_n.c("commonui", -126)) {
                      if (!vc.field_p.b(param0 ^ -123)) {
                        return 70;
                      } else {
                        if (!vc.field_p.a(0)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      return 60;
                    }
                  }
                } else {
                  return 40;
                }
              }
            } else {
              L1: {
                if (nja.field_J != null) {
                  if (nja.field_J.b(-37)) {
                    if (nja.field_J.a("", 127)) {
                      if (nja.field_J.c("", -127)) {
                        break L1;
                      } else {
                        return 29;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (tk.field_b.b(param0 + -130)) {
                if (tk.field_b.c("commonui", -128)) {
                  if (hm.field_n.b(param0 + -42)) {
                    if (hm.field_n.c("commonui", -124)) {
                      if (vc.field_p.b(-128)) {
                        if (vc.field_p.a(0)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            }
          }
          if (param0 == 7) {
            return 100;
          } else {
            return 91;
          }
        }
    }

    final static void b(int param0) {
        if (!(!vo.field_b)) {
            bea.d(bea.field_b, bea.field_h, bea.field_d + -bea.field_b, bea.field_k + -bea.field_h);
            rua.field_gb.b(36, false);
        }
    }

    dla(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((dla) this).field_d = sq.a(param0.length, param0, (byte) -124);
            if (param1 != ((dla) this).field_d) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((dla) this).field_i = fja.a(param0.length, param0, 0, 8);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((dla) this).field_i[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(-23918, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dla.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
