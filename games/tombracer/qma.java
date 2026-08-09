/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qma implements d {
    private int field_a;
    static boolean field_c;
    private dw[] field_b;
    static String field_f;
    private pea field_e;
    private cn field_d;
    private cn field_g;

    public static void a(byte param0) {
        field_f = null;
        if (param0 < 10) {
            java.awt.Component var2 = (java.awt.Component) null;
            qma.a((java.awt.Component) null, 70);
        }
    }

    public boolean a(int param0, byte param1) {
        km var3;
        int stackIn_6_0 = 0;
        if (param1 >= 10) {
          L0: {
            L1: {
              var3 = this.a(param0, 0);
              if (var3 == null) {
                break L1;
              } else {
                if (!var3.a(this.field_d, (d) (this), 0)) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public final int a(int param0) {
        if (param0 != -15061) {
            return 75;
        }
        return this.field_a;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.setFocusTraversalKeysEnabled(false);
        param0.addKeyListener(nfa.field_n);
        if (param1 > -4) {
            return;
        }
        try {
            param0.addFocusListener(nfa.field_n);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qma.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final dw a(byte param0, int param1) {
        int var3 = -28 % ((55 - param0) / 41);
        return this.field_b[param1];
    }

    public final int[] a(int param0, int param1, boolean param2, int param3, float param4, int param5) {
        if (param0 != 14907) {
            this.field_d = (cn) null;
        }
        return this.a(param1, 0).a(param5, this.field_d, param2, (double)param4, (d) (this), (byte) 104, param3, this.field_b[param1].field_e);
    }

    private final km a(int param0, int param1) {
        od var3 = this.field_e.a(param1 + param1, (long)param0);
        if (!(var3 == null)) {
            return (km) ((Object) var3);
        }
        byte[] var4 = this.field_g.f(param0, -109);
        if (var4 == null) {
            return null;
        }
        km var5 = new km(new uia(var4));
        this.field_e.a(var5, (byte) 96, (long)param0);
        return var5;
    }

    public final float[] a(int param0, int param1, int param2, int param3, float param4, boolean param5) {
        if (param0 <= 114) {
            field_f = (String) null;
        }
        return this.a(param3, 0).a((d) (this), (byte) -127, param1, param2, this.field_b[param3].field_e, this.field_d);
    }

    qma(cn param0, cn param1, cn param2) {
        dw stackIn_11_0 = null;
        dw stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        dw stackIn_19_0 = null;
        dw stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        dw stackIn_27_0 = null;
        dw stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        dw stackIn_70_0 = null;
        dw stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        dw stackIn_78_0 = null;
        dw stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        dw stackIn_91_0 = null;
        dw stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        dw stackIn_99_0 = null;
        dw stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        dw stackIn_107_0 = null;
        dw stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        StringBuilder stackIn_131_1 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_132_2 = null;
        StringBuilder stackIn_134_1 = null;
        StringBuilder stackIn_135_1 = null;
        String stackIn_135_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        uia var7 = null;
        this.field_e = new pea(256);
        try {
          L0: {
            this.field_d = param2;
            this.field_g = param1;
            var7 = new uia(param0.a(false, 0, 0));
            this.field_a = var7.d(123);
            this.field_b = new dw[this.field_a];
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_a) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= this.field_a) {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= this.field_a) {
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= this.field_a) {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= this.field_a) {
                                var5 = 0;
                                L6: while (true) {
                                  if (var5 >= this.field_a) {
                                    var5 = 0;
                                    L7: while (true) {
                                      if (var5 >= this.field_a) {
                                        var5 = 0;
                                        L8: while (true) {
                                          if (var5 >= this.field_a) {
                                            var5 = 0;
                                            L9: while (true) {
                                              if (var5 >= this.field_a) {
                                                var5 = 0;
                                                L10: while (true) {
                                                  if (var5 >= this.field_a) {
                                                    var5 = 0;
                                                    L11: while (true) {
                                                      if (var5 >= this.field_a) {
                                                        var5 = 0;
                                                        L12: while (true) {
                                                          if (this.field_a <= var5) {
                                                            var5 = 0;
                                                            L13: while (true) {
                                                              if (var5 >= this.field_a) {
                                                                var5 = 0;
                                                                L14: while (true) {
                                                                  if (this.field_a <= var5) {
                                                                    var5 = 0;
                                                                    L15: while (true) {
                                                                      if (var5 >= this.field_a) {
                                                                        var5 = 0;
                                                                        L16: while (true) {
                                                                          if (var5 >= this.field_a) {
                                                                            var5 = 0;
                                                                            L17: while (true) {
                                                                              if (this.field_a <= var5) {
                                                                                var5 = 0;
                                                                                L18: while (true) {
                                                                                  if (var5 >= this.field_a) {
                                                                                    var5 = 0;
                                                                                    L19: while (true) {
                                                                                      if (var5 >= this.field_a) {
                                                                                        var5 = 0;
                                                                                        L20: while (true) {
                                                                                          if (this.field_a <= var5) {
                                                                                            break L0;
                                                                                          } else {
                                                                                            L21: {
                                                                                              if (this.field_b[var5] == null) {
                                                                                                break L21;
                                                                                              } else {
                                                                                                this.field_b[var5].field_d = var7.h(255);
                                                                                                break L21;
                                                                                              }
                                                                                            }
                                                                                            var5++;
                                                                                            continue L20;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L22: {
                                                                                          if (this.field_b[var5] == null) {
                                                                                            break L22;
                                                                                          } else {
                                                                                            this.field_b[var5].field_t = var7.e(-106);
                                                                                            break L22;
                                                                                          }
                                                                                        }
                                                                                        var5++;
                                                                                        continue L19;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L23: {
                                                                                      if (this.field_b[var5] == null) {
                                                                                        break L23;
                                                                                      } else {
                                                                                        this.field_b[var5].field_q = var7.h(255);
                                                                                        break L23;
                                                                                      }
                                                                                    }
                                                                                    var5++;
                                                                                    continue L18;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L24: {
                                                                                  if (this.field_b[var5] == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    L25: {
                                                                                      stackIn_107_0 = this.field_b[var5];

                                                                                      if (1 != var7.h(255)) {
                                                                                        stackIn_108_0 = (dw) ((Object) stackIn_107_0);
                                                                                        stackIn_108_1 = 0;
                                                                                        break L25;
                                                                                      } else {
                                                                                        stackIn_108_0 = (dw) ((Object) stackIn_107_0);
                                                                                        stackIn_108_1 = 1;
                                                                                        break L25;
                                                                                      }
                                                                                    }
                                                                                    stackIn_108_0.field_l = stackIn_108_1 != 0;
                                                                                    break L24;
                                                                                  }
                                                                                }
                                                                                var5++;
                                                                                continue L17;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L26: {
                                                                              if (this.field_b[var5] == null) {
                                                                                break L26;
                                                                              } else {
                                                                                L27: {
                                                                                  stackIn_99_0 = this.field_b[var5];

                                                                                  if ((var7.h(255) ^ -1) != -2) {
                                                                                    stackIn_100_0 = (dw) ((Object) stackIn_99_0);
                                                                                    stackIn_100_1 = 0;
                                                                                    break L27;
                                                                                  } else {
                                                                                    stackIn_100_0 = (dw) ((Object) stackIn_99_0);
                                                                                    stackIn_100_1 = 1;
                                                                                    break L27;
                                                                                  }
                                                                                }
                                                                                stackIn_100_0.field_n = stackIn_100_1 != 0;
                                                                                break L26;
                                                                              }
                                                                            }
                                                                            var5++;
                                                                            continue L16;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L28: {
                                                                          if (this.field_b[var5] == null) {
                                                                            break L28;
                                                                          } else {
                                                                            L29: {
                                                                              stackIn_91_0 = this.field_b[var5];

                                                                              if (var7.h(255) != 1) {
                                                                                stackIn_92_0 = (dw) ((Object) stackIn_91_0);
                                                                                stackIn_92_1 = 0;
                                                                                break L29;
                                                                              } else {
                                                                                stackIn_92_0 = (dw) ((Object) stackIn_91_0);
                                                                                stackIn_92_1 = 1;
                                                                                break L29;
                                                                              }
                                                                            }
                                                                            stackIn_92_0.field_b = stackIn_92_1 != 0;
                                                                            break L28;
                                                                          }
                                                                        }
                                                                        var5++;
                                                                        continue L15;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L30: {
                                                                      if (null == this.field_b[var5]) {
                                                                        break L30;
                                                                      } else {
                                                                        this.field_b[var5].field_r = var7.c((byte) 39);
                                                                        break L30;
                                                                      }
                                                                    }
                                                                    var5++;
                                                                    continue L14;
                                                                  }
                                                                }
                                                              } else {
                                                                L31: {
                                                                  if (this.field_b[var5] == null) {
                                                                    break L31;
                                                                  } else {
                                                                    L32: {
                                                                      stackIn_78_0 = this.field_b[var5];

                                                                      if (-2 != (var7.h(255) ^ -1)) {
                                                                        stackIn_79_0 = (dw) ((Object) stackIn_78_0);
                                                                        stackIn_79_1 = 0;
                                                                        break L32;
                                                                      } else {
                                                                        stackIn_79_0 = (dw) ((Object) stackIn_78_0);
                                                                        stackIn_79_1 = 1;
                                                                        break L32;
                                                                      }
                                                                    }
                                                                    stackIn_79_0.field_e = stackIn_79_1 != 0;
                                                                    break L31;
                                                                  }
                                                                }
                                                                var5++;
                                                                continue L13;
                                                              }
                                                            }
                                                          } else {
                                                            L33: {
                                                              if (this.field_b[var5] == null) {
                                                                break L33;
                                                              } else {
                                                                L34: {
                                                                  stackIn_70_0 = this.field_b[var5];

                                                                  if (var7.h(255) != 1) {
                                                                    stackIn_71_0 = (dw) ((Object) stackIn_70_0);
                                                                    stackIn_71_1 = 0;
                                                                    break L34;
                                                                  } else {
                                                                    stackIn_71_0 = (dw) ((Object) stackIn_70_0);
                                                                    stackIn_71_1 = 1;
                                                                    break L34;
                                                                  }
                                                                }
                                                                stackIn_71_0.field_k = stackIn_71_1 != 0;
                                                                break L33;
                                                              }
                                                            }
                                                            var5++;
                                                            continue L12;
                                                          }
                                                        }
                                                      } else {
                                                        L35: {
                                                          if (null == this.field_b[var5]) {
                                                            break L35;
                                                          } else {
                                                            this.field_b[var5].field_o = var7.c((byte) 70);
                                                            break L35;
                                                          }
                                                        }
                                                        var5++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    L36: {
                                                      if (null == this.field_b[var5]) {
                                                        break L36;
                                                      } else {
                                                        this.field_b[var5].field_s = var7.c((byte) 45);
                                                        break L36;
                                                      }
                                                    }
                                                    var5++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                L37: {
                                                  if (null == this.field_b[var5]) {
                                                    break L37;
                                                  } else {
                                                    this.field_b[var5].field_m = (short)var7.d(124);
                                                    break L37;
                                                  }
                                                }
                                                var5++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            L38: {
                                              if (null == this.field_b[var5]) {
                                                break L38;
                                              } else {
                                                this.field_b[var5].field_a = var7.c((byte) 126);
                                                break L38;
                                              }
                                            }
                                            var5++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        L39: {
                                          if (this.field_b[var5] == null) {
                                            break L39;
                                          } else {
                                            this.field_b[var5].field_h = var7.c((byte) 85);
                                            break L39;
                                          }
                                        }
                                        var5++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    L40: {
                                      if (null == this.field_b[var5]) {
                                        break L40;
                                      } else {
                                        this.field_b[var5].field_c = var7.c((byte) 91);
                                        break L40;
                                      }
                                    }
                                    var5++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L41: {
                                  if (this.field_b[var5] == null) {
                                    break L41;
                                  } else {
                                    this.field_b[var5].field_i = var7.c((byte) 90);
                                    break L41;
                                  }
                                }
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            L42: {
                              if (null == this.field_b[var5]) {
                                break L42;
                              } else {
                                L43: {
                                  stackIn_27_0 = this.field_b[var5];

                                  if (var7.h(255) != 1) {
                                    stackIn_28_0 = (dw) ((Object) stackIn_27_0);
                                    stackIn_28_1 = 0;
                                    break L43;
                                  } else {
                                    stackIn_28_0 = (dw) ((Object) stackIn_27_0);
                                    stackIn_28_1 = 1;
                                    break L43;
                                  }
                                }
                                stackIn_28_0.field_f = stackIn_28_1 != 0;
                                break L42;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L44: {
                          if (null == this.field_b[var5]) {
                            break L44;
                          } else {
                            L45: {
                              stackIn_19_0 = this.field_b[var5];

                              if (-2 != (var7.h(255) ^ -1)) {
                                stackIn_20_0 = (dw) ((Object) stackIn_19_0);
                                stackIn_20_1 = 0;
                                break L45;
                              } else {
                                stackIn_20_0 = (dw) ((Object) stackIn_19_0);
                                stackIn_20_1 = 1;
                                break L45;
                              }
                            }
                            stackIn_20_0.field_g = stackIn_20_1 != 0;
                            break L44;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L46: {
                      if (null == this.field_b[var5]) {
                        break L46;
                      } else {
                        L47: {
                          stackIn_11_0 = this.field_b[var5];

                          if (var7.h(255) != 0) {
                            stackIn_12_0 = (dw) ((Object) stackIn_11_0);
                            stackIn_12_1 = 0;
                            break L47;
                          } else {
                            stackIn_12_0 = (dw) ((Object) stackIn_11_0);
                            stackIn_12_1 = 1;
                            break L47;
                          }
                        }
                        stackIn_12_0.field_p = stackIn_12_1 != 0;
                        break L46;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                L48: {
                  if (var7.h(255) != 1) {
                    break L48;
                  } else {
                    this.field_b[var5] = new dw();
                    break L48;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L49: {
            var4 = decompiledCaughtException;
            stackIn_128_0 = (RuntimeException) (var4);

            stackIn_128_1 = new StringBuilder().append("qma.<init>(");

            if (param0 == null) {
              stackIn_129_0 = (RuntimeException) ((Object) stackIn_128_0);
              stackIn_129_1 = (StringBuilder) ((Object) stackIn_128_1);
              stackIn_129_2 = "null";
              break L49;
            } else {
              stackIn_129_0 = (RuntimeException) ((Object) stackIn_128_0);
              stackIn_129_1 = (StringBuilder) ((Object) stackIn_128_1);
              stackIn_129_2 = "{...}";
              break L49;
            }
          }
          L50: {


            stackIn_131_1 = ((StringBuilder) (Object) stackIn_129_1).append(stackIn_129_2).append(',');

            if (param1 == null) {
              stackIn_129_0 = (RuntimeException) ((Object) stackIn_129_0);
              stackIn_132_1 = (StringBuilder) ((Object) stackIn_131_1);
              stackIn_132_2 = "null";
              break L50;
            } else {
              stackIn_129_0 = (RuntimeException) ((Object) stackIn_129_0);
              stackIn_132_1 = (StringBuilder) ((Object) stackIn_131_1);
              stackIn_132_2 = "{...}";
              break L50;
            }
          }
          L51: {


            stackIn_134_1 = ((StringBuilder) (Object) stackIn_132_1).append(stackIn_132_2).append(',');

            if (param2 == null) {
              stackIn_129_0 = (RuntimeException) ((Object) stackIn_129_0);
              stackIn_135_1 = (StringBuilder) ((Object) stackIn_134_1);
              stackIn_135_2 = "null";
              break L51;
            } else {
              stackIn_129_0 = (RuntimeException) ((Object) stackIn_129_0);
              stackIn_135_1 = (StringBuilder) ((Object) stackIn_134_1);
              stackIn_135_2 = "{...}";
              break L51;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_129_0), stackIn_135_2 + ')');
        }
    }

    public final int[] a(byte param0, int param1, float param2, int param3, boolean param4, int param5) {
        if (param0 != 40) {
            qma.a((byte) 28, 0.7337705479498259);
        }
        return this.a(param3, 0).a(param1, this.field_b[param3].field_e, param5, (double)param2, this.field_d, (d) (this), false);
    }

    final static int a(byte param0, double param1) {
        if (param0 != 123) {
            field_f = (String) null;
        }
        if (0.0 >= param1) {
            if (0.0 > param1) {
                return (int)(param1 - 0.5);
            }
            return 0;
        }
        return (int)(0.5 + param1);
    }

    static {
        field_c = false;
        field_f = "That name is not available";
    }
}
