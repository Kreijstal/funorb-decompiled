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
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var16 = TombRacer.field_G ? 1 : 0;
        var17 = new uia(sua.a(param1, -106));
        if (param0 == -23918) {
          L0: {
            var4 = var17.h(255);
            if (5 > var4) {
              break L0;
            } else {
              if (var4 <= 7) {
                L1: {
                  if (6 <= var4) {
                    ((dla) this).field_a = var17.e(param0 ^ 23871);
                    break L1;
                  } else {
                    ((dla) this).field_a = 0;
                    break L1;
                  }
                }
                L2: {
                  var5 = var17.h(255);
                  if (0 == (1 & var5)) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var6 = stackIn_12_0;
                  if (0 == (2 & var5)) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_15_0;
                  if (-8 < (var4 ^ -1)) {
                    ((dla) this).field_o = var17.d(127);
                    break L4;
                  } else {
                    ((dla) this).field_o = var17.g(-48);
                    break L4;
                  }
                }
                L5: {
                  var8 = 0;
                  var9 = -1;
                  ((dla) this).field_k = new int[((dla) this).field_o];
                  if (7 > var4) {
                    var10 = 0;
                    L6: while (true) {
                      if (var10 >= ((dla) this).field_o) {
                        break L5;
                      } else {
                        var8 = var8 + var17.d(125);
                        ((dla) this).field_k[var10] = var8 + var17.d(125);
                        if (((dla) this).field_k[var10] > var9) {
                          var9 = ((dla) this).field_k[var10];
                          var10++;
                          continue L6;
                        } else {
                          var10++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var10 = 0;
                    L7: while (true) {
                      if (((dla) this).field_o <= var10) {
                        break L5;
                      } else {
                        var8 = var8 + var17.g(-48);
                        ((dla) this).field_k[var10] = var8 + var17.g(-48);
                        if (var9 < ((dla) this).field_k[var10]) {
                          var9 = ((dla) this).field_k[var10];
                          var10++;
                          continue L7;
                        } else {
                          var10++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                L8: {
                  ((dla) this).field_l = var9 - -1;
                  ((dla) this).field_f = new int[((dla) this).field_l];
                  if (var7 != 0) {
                    ((dla) this).field_h = new byte[((dla) this).field_l][];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  ((dla) this).field_c = new int[((dla) this).field_l];
                  ((dla) this).field_p = new int[((dla) this).field_l];
                  ((dla) this).field_n = new int[((dla) this).field_l][];
                  ((dla) this).field_j = new int[((dla) this).field_l];
                  if (var6 != 0) {
                    ((dla) this).field_g = new int[((dla) this).field_l];
                    var10 = 0;
                    L10: while (true) {
                      if (var10 >= ((dla) this).field_l) {
                        var10 = 0;
                        L11: while (true) {
                          if (((dla) this).field_o <= var10) {
                            ((dla) this).field_b = new pla(((dla) this).field_g);
                            break L9;
                          } else {
                            ((dla) this).field_g[((dla) this).field_k[var10]] = var17.e(119);
                            var10++;
                            continue L11;
                          }
                        }
                      } else {
                        ((dla) this).field_g[var10] = -1;
                        var10++;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                var10 = 0;
                L12: while (true) {
                  if (((dla) this).field_o <= var10) {
                    L13: {
                      if (var7 != 0) {
                        var10 = 0;
                        L14: while (true) {
                          if (((dla) this).field_o <= var10) {
                            var10 = 0;
                            L15: while (true) {
                              if (((dla) this).field_o <= var10) {
                                break L13;
                              } else {
                                ((dla) this).field_f[((dla) this).field_k[var10]] = var17.e(95);
                                var10++;
                                continue L15;
                              }
                            }
                          } else {
                            var21 = new byte[64];
                            var17.a(var21, 0, -106, 64);
                            ((dla) this).field_h[((dla) this).field_k[var10]] = var21;
                            var10++;
                            continue L14;
                          }
                        }
                      } else {
                        var10 = 0;
                        L16: while (true) {
                          if (((dla) this).field_o <= var10) {
                            break L13;
                          } else {
                            ((dla) this).field_f[((dla) this).field_k[var10]] = var17.e(95);
                            var10++;
                            continue L16;
                          }
                        }
                      }
                    }
                    L17: {
                      if ((var4 ^ -1) <= -8) {
                        var10 = 0;
                        L18: while (true) {
                          if (((dla) this).field_o <= var10) {
                            var10 = 0;
                            L19: while (true) {
                              if (((dla) this).field_o <= var10) {
                                break L17;
                              } else {
                                var11 = ((dla) this).field_k[var10];
                                var8 = 0;
                                var12 = ((dla) this).field_c[var11];
                                var13 = -1;
                                ((dla) this).field_n[var11] = new int[var12];
                                var14 = 0;
                                L20: while (true) {
                                  if (var14 >= var12) {
                                    ((dla) this).field_p[var11] = var13 + 1;
                                    if (1 + var13 == var12) {
                                      ((dla) this).field_n[var11] = null;
                                      var10++;
                                      continue L19;
                                    } else {
                                      var10++;
                                      continue L19;
                                    }
                                  } else {
                                    var8 = var8 + var17.g(-48);
                                    ((dla) this).field_n[var11][var14] = var8 + var17.g(-48);
                                    var15 = var8 + var17.g(-48);
                                    if (var15 > var13) {
                                      var13 = var15;
                                      var14++;
                                      continue L20;
                                    } else {
                                      var14++;
                                      continue L20;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            ((dla) this).field_c[((dla) this).field_k[var10]] = var17.g(-48);
                            var10++;
                            continue L18;
                          }
                        }
                      } else {
                        var10 = 0;
                        L21: while (true) {
                          if (((dla) this).field_o <= var10) {
                            var10 = 0;
                            L22: while (true) {
                              if (((dla) this).field_o <= var10) {
                                break L17;
                              } else {
                                var11 = ((dla) this).field_k[var10];
                                var12 = ((dla) this).field_c[var11];
                                var8 = 0;
                                var13 = -1;
                                ((dla) this).field_n[var11] = new int[var12];
                                var14 = 0;
                                L23: while (true) {
                                  if (var12 <= var14) {
                                    ((dla) this).field_p[var11] = var13 + 1;
                                    if (var12 == 1 + var13) {
                                      ((dla) this).field_n[var11] = null;
                                      var10++;
                                      continue L22;
                                    } else {
                                      var10++;
                                      continue L22;
                                    }
                                  } else {
                                    var8 = var8 + var17.d(123);
                                    ((dla) this).field_n[var11][var14] = var8 + var17.d(123);
                                    var15 = var8 + var17.d(123);
                                    if (var13 < var15) {
                                      var13 = var15;
                                      var14++;
                                      continue L23;
                                    } else {
                                      var14++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            ((dla) this).field_c[((dla) this).field_k[var10]] = var17.d(123);
                            var10++;
                            continue L21;
                          }
                        }
                      }
                    }
                    L24: {
                      if (var6 != 0) {
                        ((dla) this).field_e = new pla[var9 - -1];
                        ((dla) this).field_m = new int[1 + var9][];
                        var10 = 0;
                        L25: while (true) {
                          if (var10 >= ((dla) this).field_o) {
                            break L24;
                          } else {
                            var11 = ((dla) this).field_k[var10];
                            var12 = ((dla) this).field_c[var11];
                            ((dla) this).field_m[var11] = new int[((dla) this).field_p[var11]];
                            var13 = 0;
                            L26: while (true) {
                              if (((dla) this).field_p[var11] <= var13) {
                                var13 = 0;
                                L27: while (true) {
                                  if (var13 >= var12) {
                                    ((dla) this).field_e[var11] = new pla(((dla) this).field_m[var11]);
                                    var10++;
                                    continue L25;
                                  } else {
                                    L28: {
                                      if (null == ((dla) this).field_n[var11]) {
                                        var14 = var13;
                                        break L28;
                                      } else {
                                        var14 = ((dla) this).field_n[var11][var13];
                                        break L28;
                                      }
                                    }
                                    ((dla) this).field_m[var11][var14] = var17.e(kha.b(param0, 23927));
                                    var13++;
                                    continue L27;
                                  }
                                }
                              } else {
                                ((dla) this).field_m[var11][var13] = -1;
                                var13++;
                                continue L26;
                              }
                            }
                          }
                        }
                      } else {
                        break L24;
                      }
                    }
                    return;
                  } else {
                    ((dla) this).field_j[((dla) this).field_k[var10]] = var17.e(-69);
                    var10++;
                    continue L12;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          throw new RuntimeException();
        } else {
          return;
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
        if (param0 != 23713) {
            int discarded$0 = dla.a(120);
        }
    }

    dla(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((dla) this).field_d = sq.a(param0.length, param0, (byte) -124);
        if (param1 != ((dla) this).field_d) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if ((param2.length ^ -1) != -65) {
                throw new RuntimeException();
            }
            ((dla) this).field_i = fja.a(param0.length, param0, 0, 8);
            for (var4 = 0; -65 < (var4 ^ -1); var4++) {
                if (((dla) this).field_i[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(-23918, param0);
    }

    static {
    }
}
