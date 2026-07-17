/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w implements q {
    private vi field_a;
    private vr field_b;
    static long field_g;
    static int[][] field_h;
    static boolean field_e;
    private gma[] field_c;
    private vr field_d;
    private int field_f;

    on d(int param0, int param1) {
        eo var3 = ((w) this).field_a.a(param1 ^ -23159, (long)param0);
        if (var3 != null) {
            return (on) (Object) var3;
        }
        byte[] var4 = ((w) this).field_d.b(param0, 0);
        if (var4 == null) {
            return null;
        }
        on var5 = new on(new lu(var4));
        ((w) this).field_a.a((eo) (Object) var5, (long)param0, 97);
        if (param1 != -23060) {
            field_h = null;
        }
        return var5;
    }

    public final gma c(int param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return ((w) this).field_c[param0];
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        lda var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        lda stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        lda stackOut_15_0 = null;
        lda stackOut_14_0 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var1_int = dfa.field_b + -rs.field_a;
            rs.field_a = sd.field_a - (var1_int >> 1);
            vka.field_q = -(ula.field_f >> 1) + jfa.field_w;
            dfa.field_b = var1_int + rs.field_a;
            var2 = vka.field_q;
            var3 = 0;
            L1: while (true) {
              if (pt.field_a.length <= var3) {
                break L0;
              } else {
                L2: {
                  var4 = gn.field_l[var3];
                  if (var4 >= 0) {
                    if (var4 != fw.field_i.field_g) {
                      var5 = mt.field_v;
                      break L2;
                    } else {
                      var5 = ru.field_c;
                      break L2;
                    }
                  } else {
                    var5 = wk.field_f;
                    break L2;
                  }
                }
                L3: {
                  var6 = pt.field_a[var3];
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var4 < 0) {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L3;
                  } else {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L3;
                  }
                }
                L4: {
                  var7 = hka.a(stackIn_11_0 != 0, stackIn_11_1 != 0, var6);
                  var8 = -(var7 >> 1) + sd.field_a;
                  if (var4 >= 0) {
                    L5: {
                      if (fw.field_i.field_g == var4) {
                        stackOut_15_0 = nj.field_j;
                        stackIn_16_0 = stackOut_15_0;
                        break L5;
                      } else {
                        stackOut_14_0 = aka.field_x;
                        stackIn_16_0 = stackOut_14_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_16_0;
                      var2 = var2 + raa.field_J;
                      if (var9 != null) {
                        var9.a(jo.field_t + (pba.field_r << 1), 28, -hna.field_k + var8, var2, var7 - -(hna.field_k << 1));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2 = var2 + pba.field_r;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (0 <= var4) {
                    lha.field_b.c(var6, var8, var2 + mha.field_g, var5, -1);
                    var2 = var2 + (pba.field_r + (raa.field_J + jo.field_t));
                    break L7;
                  } else {
                    qm.field_a.c(var6, var8, ah.field_l + var2, var5, -1);
                    var2 = var2 + un.field_i;
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "w.F(" + 1 + 41);
        }
    }

    public static void a() {
        field_h = null;
    }

    w(vr param0, vr param1, vr param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        lu var7 = null;
        gma stackIn_10_0 = null;
        gma stackIn_11_0 = null;
        gma stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        gma stackIn_18_0 = null;
        gma stackIn_19_0 = null;
        gma stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        gma stackIn_71_0 = null;
        gma stackIn_72_0 = null;
        gma stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        gma stackOut_70_0 = null;
        gma stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        gma stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        gma stackOut_17_0 = null;
        gma stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        gma stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        gma stackOut_9_0 = null;
        gma stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        gma stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        ((w) this).field_a = new vi(256);
        try {
          L0: {
            ((w) this).field_d = param1;
            ((w) this).field_b = param2;
            var7 = new lu(param0.b(-38, 0, 0));
            ((w) this).field_f = var7.e((byte) 103);
            ((w) this).field_c = new gma[((w) this).field_f];
            var5 = 0;
            L1: while (true) {
              if (((w) this).field_f <= var5) {
                var5 = 0;
                L2: while (true) {
                  if (((w) this).field_f <= var5) {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((w) this).field_f) {
                        var5 = 0;
                        L4: while (true) {
                          if (((w) this).field_f <= var5) {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= ((w) this).field_f) {
                                var5 = 0;
                                L6: while (true) {
                                  if (var5 >= ((w) this).field_f) {
                                    var5 = 0;
                                    L7: while (true) {
                                      if (((w) this).field_f <= var5) {
                                        var5 = 0;
                                        L8: while (true) {
                                          if (((w) this).field_f <= var5) {
                                            var5 = 0;
                                            L9: while (true) {
                                              if (var5 >= ((w) this).field_f) {
                                                var5 = 0;
                                                L10: while (true) {
                                                  if (((w) this).field_f <= var5) {
                                                    var5 = 0;
                                                    L11: while (true) {
                                                      if (var5 >= ((w) this).field_f) {
                                                        var5 = 0;
                                                        L12: while (true) {
                                                          if (((w) this).field_f <= var5) {
                                                            var5 = 0;
                                                            L13: while (true) {
                                                              if (var5 >= ((w) this).field_f) {
                                                                var5 = 0;
                                                                L14: while (true) {
                                                                  if (var5 >= ((w) this).field_f) {
                                                                    var5 = 0;
                                                                    L15: while (true) {
                                                                      if (var5 >= ((w) this).field_f) {
                                                                        var5 = 0;
                                                                        L16: while (true) {
                                                                          if (var5 >= ((w) this).field_f) {
                                                                            var5 = 0;
                                                                            L17: while (true) {
                                                                              if (var5 >= ((w) this).field_f) {
                                                                                var5 = 0;
                                                                                L18: while (true) {
                                                                                  if (var5 >= ((w) this).field_f) {
                                                                                    var5 = 0;
                                                                                    L19: while (true) {
                                                                                      if (var5 >= ((w) this).field_f) {
                                                                                        var5 = 0;
                                                                                        L20: while (true) {
                                                                                          if (((w) this).field_f <= var5) {
                                                                                            break L0;
                                                                                          } else {
                                                                                            L21: {
                                                                                              if (null == ((w) this).field_c[var5]) {
                                                                                                break L21;
                                                                                              } else {
                                                                                                ((w) this).field_c[var5].field_b = var7.b(16711935);
                                                                                                break L21;
                                                                                              }
                                                                                            }
                                                                                            var5++;
                                                                                            continue L20;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L22: {
                                                                                          if (null == ((w) this).field_c[var5]) {
                                                                                            break L22;
                                                                                          } else {
                                                                                            int discarded$14 = var7.f(57);
                                                                                            break L22;
                                                                                          }
                                                                                        }
                                                                                        var5++;
                                                                                        continue L19;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L23: {
                                                                                      if (((w) this).field_c[var5] == null) {
                                                                                        break L23;
                                                                                      } else {
                                                                                        int discarded$15 = var7.b(16711935);
                                                                                        break L23;
                                                                                      }
                                                                                    }
                                                                                    var5++;
                                                                                    continue L18;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L24: {
                                                                                  if (null == ((w) this).field_c[var5]) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    int discarded$16 = var7.b(16711935);
                                                                                    break L24;
                                                                                  }
                                                                                }
                                                                                var5++;
                                                                                continue L17;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L25: {
                                                                              if (((w) this).field_c[var5] == null) {
                                                                                break L25;
                                                                              } else {
                                                                                int discarded$17 = var7.b(16711935);
                                                                                break L25;
                                                                              }
                                                                            }
                                                                            var5++;
                                                                            continue L16;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L26: {
                                                                          if (null == ((w) this).field_c[var5]) {
                                                                            break L26;
                                                                          } else {
                                                                            int discarded$18 = var7.b(16711935);
                                                                            break L26;
                                                                          }
                                                                        }
                                                                        var5++;
                                                                        continue L15;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L27: {
                                                                      if (((w) this).field_c[var5] == null) {
                                                                        break L27;
                                                                      } else {
                                                                        byte discarded$19 = var7.b(true);
                                                                        break L27;
                                                                      }
                                                                    }
                                                                    var5++;
                                                                    continue L14;
                                                                  }
                                                                }
                                                              } else {
                                                                L28: {
                                                                  if (((w) this).field_c[var5] == null) {
                                                                    break L28;
                                                                  } else {
                                                                    L29: {
                                                                      stackOut_70_0 = ((w) this).field_c[var5];
                                                                      stackIn_72_0 = stackOut_70_0;
                                                                      stackIn_71_0 = stackOut_70_0;
                                                                      if (var7.b(16711935) != 1) {
                                                                        stackOut_72_0 = (gma) (Object) stackIn_72_0;
                                                                        stackOut_72_1 = 0;
                                                                        stackIn_73_0 = stackOut_72_0;
                                                                        stackIn_73_1 = stackOut_72_1;
                                                                        break L29;
                                                                      } else {
                                                                        stackOut_71_0 = (gma) (Object) stackIn_71_0;
                                                                        stackOut_71_1 = 1;
                                                                        stackIn_73_0 = stackOut_71_0;
                                                                        stackIn_73_1 = stackOut_71_1;
                                                                        break L29;
                                                                      }
                                                                    }
                                                                    stackIn_73_0.field_a = stackIn_73_1 != 0;
                                                                    break L28;
                                                                  }
                                                                }
                                                                var5++;
                                                                continue L13;
                                                              }
                                                            }
                                                          } else {
                                                            L30: {
                                                              if (null == ((w) this).field_c[var5]) {
                                                                break L30;
                                                              } else {
                                                                int discarded$20 = var7.b(16711935);
                                                                break L30;
                                                              }
                                                            }
                                                            var5++;
                                                            continue L12;
                                                          }
                                                        }
                                                      } else {
                                                        L31: {
                                                          if (null == ((w) this).field_c[var5]) {
                                                            break L31;
                                                          } else {
                                                            byte discarded$21 = var7.b(true);
                                                            break L31;
                                                          }
                                                        }
                                                        var5++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    L32: {
                                                      if (null == ((w) this).field_c[var5]) {
                                                        break L32;
                                                      } else {
                                                        byte discarded$22 = var7.b(true);
                                                        break L32;
                                                      }
                                                    }
                                                    var5++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                L33: {
                                                  if (((w) this).field_c[var5] == null) {
                                                    break L33;
                                                  } else {
                                                    ((w) this).field_c[var5].field_g = (short)var7.e((byte) 77);
                                                    break L33;
                                                  }
                                                }
                                                var5++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            L34: {
                                              if (((w) this).field_c[var5] == null) {
                                                break L34;
                                              } else {
                                                byte discarded$23 = var7.b(true);
                                                break L34;
                                              }
                                            }
                                            var5++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        L35: {
                                          if (null == ((w) this).field_c[var5]) {
                                            break L35;
                                          } else {
                                            byte discarded$24 = var7.b(true);
                                            break L35;
                                          }
                                        }
                                        var5++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    L36: {
                                      if (((w) this).field_c[var5] == null) {
                                        break L36;
                                      } else {
                                        byte discarded$25 = var7.b(true);
                                        break L36;
                                      }
                                    }
                                    var5++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L37: {
                                  if (((w) this).field_c[var5] == null) {
                                    break L37;
                                  } else {
                                    byte discarded$26 = var7.b(true);
                                    break L37;
                                  }
                                }
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            L38: {
                              if (null == ((w) this).field_c[var5]) {
                                break L38;
                              } else {
                                int discarded$27 = var7.b(16711935);
                                break L38;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L39: {
                          if (null == ((w) this).field_c[var5]) {
                            break L39;
                          } else {
                            L40: {
                              stackOut_17_0 = ((w) this).field_c[var5];
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (var7.b(16711935) != 1) {
                                stackOut_19_0 = (gma) (Object) stackIn_19_0;
                                stackOut_19_1 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                break L40;
                              } else {
                                stackOut_18_0 = (gma) (Object) stackIn_18_0;
                                stackOut_18_1 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                break L40;
                              }
                            }
                            stackIn_20_0.field_d = stackIn_20_1 != 0;
                            break L39;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L41: {
                      if (((w) this).field_c[var5] == null) {
                        break L41;
                      } else {
                        L42: {
                          stackOut_9_0 = ((w) this).field_c[var5];
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var7.b(16711935) != 0) {
                            stackOut_11_0 = (gma) (Object) stackIn_11_0;
                            stackOut_11_1 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            break L42;
                          } else {
                            stackOut_10_0 = (gma) (Object) stackIn_10_0;
                            stackOut_10_1 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            break L42;
                          }
                        }
                        stackIn_12_0.field_f = stackIn_12_1 != 0;
                        break L41;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                L43: {
                  if (var7.b(16711935) != 1) {
                    break L43;
                  } else {
                    ((w) this).field_c[var5] = new gma();
                    break L43;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L44: {
            var4 = decompiledCaughtException;
            stackOut_111_0 = (RuntimeException) var4;
            stackOut_111_1 = new StringBuilder().append("w.<init>(");
            stackIn_113_0 = stackOut_111_0;
            stackIn_113_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param0 == null) {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L44;
            } else {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "{...}";
              stackIn_114_0 = stackOut_112_0;
              stackIn_114_1 = stackOut_112_1;
              stackIn_114_2 = stackOut_112_2;
              break L44;
            }
          }
          L45: {
            stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
            stackOut_114_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(44);
            stackIn_116_0 = stackOut_114_0;
            stackIn_116_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param1 == null) {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L45;
            } else {
              stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
              stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
              stackOut_115_2 = "{...}";
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              break L45;
            }
          }
          L46: {
            stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
            stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(44);
            stackIn_119_0 = stackOut_117_0;
            stackIn_119_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param2 == null) {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L46;
            } else {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "{...}";
              stackIn_120_0 = stackOut_118_0;
              stackIn_120_1 = stackOut_118_1;
              stackIn_120_2 = stackOut_118_2;
              break L46;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_120_0, stackIn_120_2 + 41);
        }
    }

    public final int[] a(int param0, boolean param1, int param2, float param3, int param4, int param5) {
        if (param0 != 0) {
            return null;
        }
        return ((w) this).d(param4, param0 ^ -23060).a((double)param3, ((w) this).field_c[param4].field_a, (q) this, param5, param2, ((w) this).field_b, param1, -1);
    }

    public final boolean c(byte param0, int param1) {
        on var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var3 = ((w) this).d(param1, -23060);
          if (param0 < -45) {
            break L0;
          } else {
            gma discarded$2 = ((w) this).c(-79, 92);
            break L0;
          }
        }
        L1: {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (!var3.a((q) this, ((w) this).field_b, -63)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
    }
}
