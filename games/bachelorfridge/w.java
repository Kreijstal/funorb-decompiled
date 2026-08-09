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
        eo var3 = this.field_a.a(param1 ^ -23159, (long)param0);
        if (var3 != null) {
            return (on) ((Object) var3);
        }
        byte[] var4 = this.field_d.b(param0, 0);
        if (var4 == null) {
            return null;
        }
        on var5 = new on(new lu(var4));
        this.field_a.a(var5, (long)param0, 97);
        if (param1 != -23060) {
            field_h = (int[][]) null;
        }
        return var5;
    }

    public final gma c(int param0, int param1) {
        if (param1 != 0) {
            return (gma) null;
        }
        return this.field_c[param0];
    }

    final static void a(boolean param0) {
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        lda stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        lda var9 = null;
        int var10 = 0;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                w.a(true);
                break L1;
              }
            }
            var1_int = dfa.field_b + -rs.field_a;
            rs.field_a = sd.field_a - (var1_int >> -1451153727);
            vka.field_q = -(ula.field_f >> 477840577) + jfa.field_w;
            dfa.field_b = var1_int + rs.field_a;
            var2 = vka.field_q;
            var3 = 0;
            L2: while (true) {
              if (pt.field_a.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = gn.field_l[var3];
                  if (var4 >= 0) {
                    if (var4 != fw.field_i.field_g) {
                      var5 = mt.field_v;
                      break L3;
                    } else {
                      var5 = ru.field_c;
                      break L3;
                    }
                  } else {
                    var5 = wk.field_f;
                    break L3;
                  }
                }
                L4: {
                  var6 = pt.field_a[var3];
                  stackIn_12_0 = 1;

                  if (var4 < 0) {
                    stackIn_13_0 = stackIn_12_0;
                    stackIn_13_1 = 0;
                    break L4;
                  } else {
                    stackIn_13_0 = stackIn_12_0;
                    stackIn_13_1 = 1;
                    break L4;
                  }
                }
                L5: {
                  var7 = hka.a(stackIn_13_0 != 0, stackIn_13_1 != 0, var6);
                  var8 = -(var7 >> -111540223) + sd.field_a;
                  if (var4 >= 0) {
                    L6: {
                      if (fw.field_i.field_g == var4) {
                        stackIn_18_0 = nj.field_j;
                        break L6;
                      } else {
                        stackIn_18_0 = aka.field_x;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_18_0;
                      var2 = var2 + raa.field_J;
                      if (var9 != null) {
                        var9.a(jo.field_t + (pba.field_r << -690463999), 28, -hna.field_k + var8, var2, var7 - -(hna.field_k << 1369786433));
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2 = var2 + pba.field_r;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if (0 <= var4) {
                    lha.field_b.c(var6, var8, var2 + mha.field_g, var5, -1);
                    var2 = var2 + (pba.field_r + (raa.field_J + jo.field_t));
                    break L8;
                  } else {
                    qm.field_a.c(var6, var8, ah.field_l + var2, var5, -1);
                    var2 = var2 + un.field_i;
                    break L8;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "w.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_h = (int[][]) null;
        if (param0 <= 29) {
            w.a(true);
        }
    }

    w(vr param0, vr param1, vr param2) {
        gma stackIn_11_0 = null;
        gma stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        gma stackIn_19_0 = null;
        gma stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        gma stackIn_72_0 = null;
        gma stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        StringBuilder stackIn_116_1 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        StringBuilder stackIn_119_1 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        lu var7 = null;
        this.field_a = new vi(256);
        try {
          L0: {
            this.field_d = param1;
            this.field_b = param2;
            var7 = new lu(param0.b(-38, 0, 0));
            this.field_f = var7.e((byte) 103);
            this.field_c = new gma[this.field_f];
            var5 = 0;
            L1: while (true) {
              if (this.field_f <= var5) {
                var5 = 0;
                L2: while (true) {
                  if (this.field_f <= var5) {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= this.field_f) {
                        var5 = 0;
                        L4: while (true) {
                          if (this.field_f <= var5) {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= this.field_f) {
                                var5 = 0;
                                L6: while (true) {
                                  if (var5 >= this.field_f) {
                                    var5 = 0;
                                    L7: while (true) {
                                      if (this.field_f <= var5) {
                                        var5 = 0;
                                        L8: while (true) {
                                          if (this.field_f <= var5) {
                                            var5 = 0;
                                            L9: while (true) {
                                              if (var5 >= this.field_f) {
                                                var5 = 0;
                                                L10: while (true) {
                                                  if (this.field_f <= var5) {
                                                    var5 = 0;
                                                    L11: while (true) {
                                                      if (var5 >= this.field_f) {
                                                        var5 = 0;
                                                        L12: while (true) {
                                                          if (this.field_f <= var5) {
                                                            var5 = 0;
                                                            L13: while (true) {
                                                              if (var5 >= this.field_f) {
                                                                var5 = 0;
                                                                L14: while (true) {
                                                                  if (var5 >= this.field_f) {
                                                                    var5 = 0;
                                                                    L15: while (true) {
                                                                      if (var5 >= this.field_f) {
                                                                        var5 = 0;
                                                                        L16: while (true) {
                                                                          if (var5 >= this.field_f) {
                                                                            var5 = 0;
                                                                            L17: while (true) {
                                                                              if (var5 >= this.field_f) {
                                                                                var5 = 0;
                                                                                L18: while (true) {
                                                                                  if (var5 >= this.field_f) {
                                                                                    var5 = 0;
                                                                                    L19: while (true) {
                                                                                      if (var5 >= this.field_f) {
                                                                                        var5 = 0;
                                                                                        L20: while (true) {
                                                                                          if (this.field_f <= var5) {
                                                                                            break L0;
                                                                                          } else {
                                                                                            L21: {
                                                                                              if (null == this.field_c[var5]) {
                                                                                                break L21;
                                                                                              } else {
                                                                                                this.field_c[var5].field_b = var7.b(16711935);
                                                                                                break L21;
                                                                                              }
                                                                                            }
                                                                                            var5++;
                                                                                            continue L20;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L22: {
                                                                                          if (null == this.field_c[var5]) {
                                                                                            break L22;
                                                                                          } else {
                                                                                            var7.f(57);
                                                                                            break L22;
                                                                                          }
                                                                                        }
                                                                                        var5++;
                                                                                        continue L19;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L23: {
                                                                                      if (this.field_c[var5] == null) {
                                                                                        break L23;
                                                                                      } else {
                                                                                        var7.b(16711935);
                                                                                        break L23;
                                                                                      }
                                                                                    }
                                                                                    var5++;
                                                                                    continue L18;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L24: {
                                                                                  if (null == this.field_c[var5]) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var7.b(16711935);
                                                                                    break L24;
                                                                                  }
                                                                                }
                                                                                var5++;
                                                                                continue L17;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L25: {
                                                                              if (this.field_c[var5] == null) {
                                                                                break L25;
                                                                              } else {
                                                                                var7.b(16711935);
                                                                                break L25;
                                                                              }
                                                                            }
                                                                            var5++;
                                                                            continue L16;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L26: {
                                                                          if (null == this.field_c[var5]) {
                                                                            break L26;
                                                                          } else {
                                                                            var7.b(16711935);
                                                                            break L26;
                                                                          }
                                                                        }
                                                                        var5++;
                                                                        continue L15;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L27: {
                                                                      if (this.field_c[var5] == null) {
                                                                        break L27;
                                                                      } else {
                                                                        var7.b(true);
                                                                        break L27;
                                                                      }
                                                                    }
                                                                    var5++;
                                                                    continue L14;
                                                                  }
                                                                }
                                                              } else {
                                                                L28: {
                                                                  if (this.field_c[var5] == null) {
                                                                    break L28;
                                                                  } else {
                                                                    L29: {
                                                                      stackIn_72_0 = this.field_c[var5];

                                                                      if (-2 != (var7.b(16711935) ^ -1)) {
                                                                        stackIn_73_0 = (gma) ((Object) stackIn_72_0);
                                                                        stackIn_73_1 = 0;
                                                                        break L29;
                                                                      } else {
                                                                        stackIn_73_0 = (gma) ((Object) stackIn_72_0);
                                                                        stackIn_73_1 = 1;
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
                                                              if (null == this.field_c[var5]) {
                                                                break L30;
                                                              } else {
                                                                var7.b(16711935);
                                                                break L30;
                                                              }
                                                            }
                                                            var5++;
                                                            continue L12;
                                                          }
                                                        }
                                                      } else {
                                                        L31: {
                                                          if (null == this.field_c[var5]) {
                                                            break L31;
                                                          } else {
                                                            var7.b(true);
                                                            break L31;
                                                          }
                                                        }
                                                        var5++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    L32: {
                                                      if (null == this.field_c[var5]) {
                                                        break L32;
                                                      } else {
                                                        var7.b(true);
                                                        break L32;
                                                      }
                                                    }
                                                    var5++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                L33: {
                                                  if (this.field_c[var5] == null) {
                                                    break L33;
                                                  } else {
                                                    this.field_c[var5].field_g = (short)var7.e((byte) 77);
                                                    break L33;
                                                  }
                                                }
                                                var5++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            L34: {
                                              if (this.field_c[var5] == null) {
                                                break L34;
                                              } else {
                                                var7.b(true);
                                                break L34;
                                              }
                                            }
                                            var5++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        L35: {
                                          if (null == this.field_c[var5]) {
                                            break L35;
                                          } else {
                                            var7.b(true);
                                            break L35;
                                          }
                                        }
                                        var5++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    L36: {
                                      if (this.field_c[var5] == null) {
                                        break L36;
                                      } else {
                                        var7.b(true);
                                        break L36;
                                      }
                                    }
                                    var5++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L37: {
                                  if (this.field_c[var5] == null) {
                                    break L37;
                                  } else {
                                    var7.b(true);
                                    break L37;
                                  }
                                }
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            L38: {
                              if (null == this.field_c[var5]) {
                                break L38;
                              } else {
                                var7.b(16711935);
                                break L38;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L39: {
                          if (null == this.field_c[var5]) {
                            break L39;
                          } else {
                            L40: {
                              stackIn_19_0 = this.field_c[var5];

                              if (var7.b(16711935) != 1) {
                                stackIn_20_0 = (gma) ((Object) stackIn_19_0);
                                stackIn_20_1 = 0;
                                break L40;
                              } else {
                                stackIn_20_0 = (gma) ((Object) stackIn_19_0);
                                stackIn_20_1 = 1;
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
                      if (this.field_c[var5] == null) {
                        break L41;
                      } else {
                        L42: {
                          stackIn_11_0 = this.field_c[var5];

                          if (var7.b(16711935) != 0) {
                            stackIn_12_0 = (gma) ((Object) stackIn_11_0);
                            stackIn_12_1 = 0;
                            break L42;
                          } else {
                            stackIn_12_0 = (gma) ((Object) stackIn_11_0);
                            stackIn_12_1 = 1;
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
                    this.field_c[var5] = new gma();
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
            stackIn_113_0 = (RuntimeException) (var4);

            stackIn_113_1 = new StringBuilder().append("w.<init>(");

            if (param0 == null) {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackIn_114_2 = "null";
              break L44;
            } else {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackIn_114_2 = "{...}";
              break L44;
            }
          }
          L45: {


            stackIn_116_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',');

            if (param1 == null) {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_114_0);
              stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackIn_117_2 = "null";
              break L45;
            } else {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_114_0);
              stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackIn_117_2 = "{...}";
              break L45;
            }
          }
          L46: {


            stackIn_119_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(',');

            if (param2 == null) {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_114_0);
              stackIn_120_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackIn_120_2 = "null";
              break L46;
            } else {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_114_0);
              stackIn_120_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackIn_120_2 = "{...}";
              break L46;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_114_0), stackIn_120_2 + ')');
        }
    }

    public final int[] a(int param0, boolean param1, int param2, float param3, int param4, int param5) {
        if (param0 != 0) {
            return (int[]) null;
        }
        return this.d(param4, param0 ^ -23060).a((double)param3, this.field_c[param4].field_a, (q) (this), param5, param2, this.field_b, param1, -1);
    }

    public final boolean c(byte param0, int param1) {
        on var3;
        int stackIn_6_0 = 0;
        L0: {
          var3 = this.d(param1, -23060);
          if (param0 < -45) {
            break L0;
          } else {
            this.c(-79, 92);
            break L0;
          }
        }
        L1: {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (!var3.a((q) (this), this.field_b, -63)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
    }
}
