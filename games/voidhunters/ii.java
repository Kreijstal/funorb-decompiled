/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii implements d {
    static String field_g;
    static dja field_d;
    private opa[] field_b;
    private ehb field_f;
    private asb field_e;
    private asb field_c;
    static boolean field_h;
    private int field_i;
    static String field_a;

    public final float[] a(float param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 121 / ((param4 - 31) / 41);
        return this.b(-2, param2).a(2, param3, (d) (this), this.field_b[param2].field_e, this.field_e, param1);
    }

    public final int a(int param0) {
        if (param0 != 11316) {
            this.a(51, 52);
        }
        return this.field_i;
    }

    public final int[] a(int param0, int param1, int param2, boolean param3, int param4, float param5) {
        if (param0 <= 78) {
            this.field_e = (asb) null;
        }
        return this.b(-2, param4).a(param1, false, param2, this.field_b[param4].field_e, this.field_e, (d) (this), (double)param5);
    }

    public final opa a(int param0, int param1) {
        if (param0 != -20292) {
            this.field_c = (asb) null;
        }
        return this.field_b[param1];
    }

    private final lra b(int param0, int param1) {
        fh var3 = this.field_f.a((long)param1, 77);
        if (param0 != -2) {
            this.a(-32, (byte) 119);
        }
        if (var3 != null) {
            return (lra) ((Object) var3);
        }
        byte[] var4 = this.field_c.c((byte) 9, param1);
        if (var4 == null) {
            return null;
        }
        lra var5 = new lra(new ds(var4));
        this.field_f.a((long)param1, (byte) -22, var5);
        return var5;
    }

    public final boolean a(int param0, byte param1) {
        lra var3;
        int stackIn_6_0 = 0;
        var3 = this.b(-2, param0);
        if (param1 <= -30) {
          L0: {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (!var3.a(0, this.field_e, (d) (this))) {
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
          return false;
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_g = null;
        if (param0 != 25498) {
            ii.b(116);
        }
    }

    public final int[] a(int param0, float param1, boolean param2, int param3, int param4, boolean param5) {
        if (!param2) {
            field_h = true;
        }
        return this.b(-2, param3).a(param5, (d) (this), this.field_e, 0, this.field_b[param3].field_e, param4, (double)param1, param0);
    }

    ii(asb param0, asb param1, asb param2) {
        opa stackIn_11_0 = null;
        opa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        opa stackIn_19_0 = null;
        opa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        opa stackIn_27_0 = null;
        opa stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        opa stackIn_70_0 = null;
        opa stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        opa stackIn_78_0 = null;
        opa stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        opa stackIn_91_0 = null;
        opa stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        opa stackIn_99_0 = null;
        opa stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        opa stackIn_107_0 = null;
        opa stackIn_108_0 = null;
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
        ds var7 = null;
        this.field_f = new ehb(256);
        try {
          L0: {
            this.field_e = param2;
            this.field_c = param1;
            var7 = new ds(param0.a(0, 0, (byte) 13));
            this.field_i = var7.e(1869);
            this.field_b = new opa[this.field_i];
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_i) {
                var5 = 0;
                L2: while (true) {
                  if (this.field_i <= var5) {
                    var5 = 0;
                    L3: while (true) {
                      if (this.field_i <= var5) {
                        var5 = 0;
                        L4: while (true) {
                          if (this.field_i <= var5) {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= this.field_i) {
                                var5 = 0;
                                L6: while (true) {
                                  if (var5 >= this.field_i) {
                                    var5 = 0;
                                    L7: while (true) {
                                      if (var5 >= this.field_i) {
                                        var5 = 0;
                                        L8: while (true) {
                                          if (this.field_i <= var5) {
                                            var5 = 0;
                                            L9: while (true) {
                                              if (var5 >= this.field_i) {
                                                var5 = 0;
                                                L10: while (true) {
                                                  if (this.field_i <= var5) {
                                                    var5 = 0;
                                                    L11: while (true) {
                                                      if (this.field_i <= var5) {
                                                        var5 = 0;
                                                        L12: while (true) {
                                                          if (var5 >= this.field_i) {
                                                            var5 = 0;
                                                            L13: while (true) {
                                                              if (var5 >= this.field_i) {
                                                                var5 = 0;
                                                                L14: while (true) {
                                                                  if (this.field_i <= var5) {
                                                                    var5 = 0;
                                                                    L15: while (true) {
                                                                      if (this.field_i <= var5) {
                                                                        var5 = 0;
                                                                        L16: while (true) {
                                                                          if (this.field_i <= var5) {
                                                                            var5 = 0;
                                                                            L17: while (true) {
                                                                              if (var5 >= this.field_i) {
                                                                                var5 = 0;
                                                                                L18: while (true) {
                                                                                  if (var5 >= this.field_i) {
                                                                                    var5 = 0;
                                                                                    L19: while (true) {
                                                                                      if (var5 >= this.field_i) {
                                                                                        var5 = 0;
                                                                                        L20: while (true) {
                                                                                          if (var5 >= this.field_i) {
                                                                                            break L0;
                                                                                          } else {
                                                                                            L21: {
                                                                                              if (null == this.field_b[var5]) {
                                                                                                break L21;
                                                                                              } else {
                                                                                                this.field_b[var5].field_q = var7.e((byte) -98);
                                                                                                break L21;
                                                                                              }
                                                                                            }
                                                                                            var5++;
                                                                                            continue L20;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L22: {
                                                                                          if (null == this.field_b[var5]) {
                                                                                            break L22;
                                                                                          } else {
                                                                                            this.field_b[var5].field_o = var7.h(36);
                                                                                            break L22;
                                                                                          }
                                                                                        }
                                                                                        var5++;
                                                                                        continue L19;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L23: {
                                                                                      if (null == this.field_b[var5]) {
                                                                                        break L23;
                                                                                      } else {
                                                                                        this.field_b[var5].field_f = var7.e((byte) -101);
                                                                                        break L23;
                                                                                      }
                                                                                    }
                                                                                    var5++;
                                                                                    continue L18;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L24: {
                                                                                  if (null == this.field_b[var5]) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    L25: {
                                                                                      stackIn_107_0 = this.field_b[var5];

                                                                                      if (1 != var7.e((byte) -115)) {
                                                                                        stackIn_108_0 = (opa) ((Object) stackIn_107_0);
                                                                                        stackIn_108_1 = 0;
                                                                                        break L25;
                                                                                      } else {
                                                                                        stackIn_108_0 = (opa) ((Object) stackIn_107_0);
                                                                                        stackIn_108_1 = 1;
                                                                                        break L25;
                                                                                      }
                                                                                    }
                                                                                    stackIn_108_0.field_i = stackIn_108_1 != 0;
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

                                                                                  if ((var7.e((byte) -121) ^ -1) != -2) {
                                                                                    stackIn_100_0 = (opa) ((Object) stackIn_99_0);
                                                                                    stackIn_100_1 = 0;
                                                                                    break L27;
                                                                                  } else {
                                                                                    stackIn_100_0 = (opa) ((Object) stackIn_99_0);
                                                                                    stackIn_100_1 = 1;
                                                                                    break L27;
                                                                                  }
                                                                                }
                                                                                stackIn_100_0.field_s = stackIn_100_1 != 0;
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

                                                                              if ((var7.e((byte) -95) ^ -1) != -2) {
                                                                                stackIn_92_0 = (opa) ((Object) stackIn_91_0);
                                                                                stackIn_92_1 = 0;
                                                                                break L29;
                                                                              } else {
                                                                                stackIn_92_0 = (opa) ((Object) stackIn_91_0);
                                                                                stackIn_92_1 = 1;
                                                                                break L29;
                                                                              }
                                                                            }
                                                                            stackIn_92_0.field_k = stackIn_92_1 != 0;
                                                                            break L28;
                                                                          }
                                                                        }
                                                                        var5++;
                                                                        continue L15;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L30: {
                                                                      if (this.field_b[var5] == null) {
                                                                        break L30;
                                                                      } else {
                                                                        this.field_b[var5].field_j = var7.d((byte) -114);
                                                                        break L30;
                                                                      }
                                                                    }
                                                                    var5++;
                                                                    continue L14;
                                                                  }
                                                                }
                                                              } else {
                                                                L31: {
                                                                  if (null == this.field_b[var5]) {
                                                                    break L31;
                                                                  } else {
                                                                    L32: {
                                                                      stackIn_78_0 = this.field_b[var5];

                                                                      if ((var7.e((byte) -87) ^ -1) != -2) {
                                                                        stackIn_79_0 = (opa) ((Object) stackIn_78_0);
                                                                        stackIn_79_1 = 0;
                                                                        break L32;
                                                                      } else {
                                                                        stackIn_79_0 = (opa) ((Object) stackIn_78_0);
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
                                                              if (null == this.field_b[var5]) {
                                                                break L33;
                                                              } else {
                                                                L34: {
                                                                  stackIn_70_0 = this.field_b[var5];

                                                                  if ((var7.e((byte) -122) ^ -1) != -2) {
                                                                    stackIn_71_0 = (opa) ((Object) stackIn_70_0);
                                                                    stackIn_71_1 = 0;
                                                                    break L34;
                                                                  } else {
                                                                    stackIn_71_0 = (opa) ((Object) stackIn_70_0);
                                                                    stackIn_71_1 = 1;
                                                                    break L34;
                                                                  }
                                                                }
                                                                stackIn_71_0.field_a = stackIn_71_1 != 0;
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
                                                            this.field_b[var5].field_d = var7.d((byte) -114);
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
                                                        this.field_b[var5].field_p = var7.d((byte) -114);
                                                        break L36;
                                                      }
                                                    }
                                                    var5++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                L37: {
                                                  if (this.field_b[var5] == null) {
                                                    break L37;
                                                  } else {
                                                    this.field_b[var5].field_l = (short)var7.e(1869);
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
                                                this.field_b[var5].field_n = var7.d((byte) -114);
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
                                            this.field_b[var5].field_c = var7.d((byte) -114);
                                            break L39;
                                          }
                                        }
                                        var5++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    L40: {
                                      if (this.field_b[var5] == null) {
                                        break L40;
                                      } else {
                                        this.field_b[var5].field_b = var7.d((byte) -114);
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
                                    this.field_b[var5].field_g = var7.d((byte) -114);
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

                                  if (1 != var7.e((byte) -87)) {
                                    stackIn_28_0 = (opa) ((Object) stackIn_27_0);
                                    stackIn_28_1 = 0;
                                    break L43;
                                  } else {
                                    stackIn_28_0 = (opa) ((Object) stackIn_27_0);
                                    stackIn_28_1 = 1;
                                    break L43;
                                  }
                                }
                                stackIn_28_0.field_m = stackIn_28_1 != 0;
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

                              if (-2 != (var7.e((byte) -123) ^ -1)) {
                                stackIn_20_0 = (opa) ((Object) stackIn_19_0);
                                stackIn_20_1 = 0;
                                break L45;
                              } else {
                                stackIn_20_0 = (opa) ((Object) stackIn_19_0);
                                stackIn_20_1 = 1;
                                break L45;
                              }
                            }
                            stackIn_20_0.field_h = stackIn_20_1 != 0;
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

                          if (0 != var7.e((byte) -119)) {
                            stackIn_12_0 = (opa) ((Object) stackIn_11_0);
                            stackIn_12_1 = 0;
                            break L47;
                          } else {
                            stackIn_12_0 = (opa) ((Object) stackIn_11_0);
                            stackIn_12_1 = 1;
                            break L47;
                          }
                        }
                        stackIn_12_0.field_r = stackIn_12_1 != 0;
                        break L46;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                L48: {
                  if (var7.e((byte) -99) != 1) {
                    break L48;
                  } else {
                    this.field_b[var5] = new opa();
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

            stackIn_128_1 = new StringBuilder().append("ii.<init>(");

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
          throw rta.a((Throwable) ((Object) stackIn_129_0), stackIn_135_2 + ')');
        }
    }

    static {
        field_g = "Next event";
        field_d = (dja) ((Object) new upa());
        field_a = "Assault";
    }
}
