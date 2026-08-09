/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nn extends ae {
    private int field_P;
    private long field_bb;
    static int[] field_S;
    static boolean field_X;
    static boolean field_R;
    private boolean field_Z;
    static ah field_T;
    private int field_ab;
    static int field_cb;
    private boolean field_W;
    private int field_Q;
    static byte[] field_Y;
    private int field_V;
    private long field_U;

    private final void m(int param0) {
        if (!(!(this.field_s instanceof ih))) {
            ((ih) ((Object) this.field_s)).a((nn) (this), (byte) 101);
        }
        if (param0 != 82) {
            String var3 = (String) null;
            this.a((String) null, false);
        }
    }

    nn(String param0, dn param1, int param2) {
        super(param0, param1);
        this.field_Z = false;
        this.field_ab = -1;
        this.field_U = 0L;
        try {
            this.field_P = param2;
            this.field_H = dh.field_q.field_r;
            this.a(true, 103, param0);
            this.field_W = true;
            this.field_bb = k.a(0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "nn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, param2, param3, param4 + 0, param5, param6)) {
                break L1;
              } else {
                if (this.field_H instanceof jh) {
                  L2: {
                    var8_int = ((jh) ((Object) this.field_H)).a(param3, param1, a.field_a, aa.field_Nb, (na) (this), (byte) -34);
                    stackIn_5_0 = this;

                    stackIn_5_1 = 81;

                    if ((var8_int ^ -1) == 0) {
                      stackIn_6_0 = this;
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 0;
                      break L2;
                    } else {
                      stackIn_6_0 = this;
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = var8_int;
                      break L2;
                    }
                  }
                  L3: {
                    this.c(stackIn_6_1, stackIn_6_2);
                    var8_long = k.a(0);
                    stackIn_8_0 = this;

                    if ((-this.field_U + var8_long ^ -1L) <= -251L) {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 0;
                      break L3;
                    } else {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    ((nn) (this)).field_Z = stackIn_9_1 != 0;
                    if (this.field_Z) {
                      L5: {
                        this.field_Q = this.n(-33);
                        this.field_V = this.d(false);
                        if (0 >= this.field_V) {
                          break L5;
                        } else {
                          if (this.field_A.charAt(-1 + this.field_V) == 32) {
                            this.field_V = this.field_V - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_ab = this.field_V;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_U = var8_long;
                  stackIn_17_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param4 == -32738) {
              stackIn_22_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_20_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var8);

            stackIn_25_1 = new StringBuilder().append("nn.PA(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0 != 0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    private final void c(int param0, int param1) {
        this.field_V = param1;
        if (!sn.field_a[param0]) {
            this.field_Q = this.field_V;
        }
    }

    public static void e(boolean param0) {
        field_T = null;
        field_S = null;
        field_Y = null;
        if (!param0) {
            nn.g((byte) 45);
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 > 11) {
                break L1;
              } else {
                nn.g((byte) -70);
                break L1;
              }
            }
            L2: {
              if (param2 == null) {
                param2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.field_A = param2;
              var4_int = param2.length();
              if ((this.field_P ^ -1) == 0) {
                break L3;
              } else {
                if (this.field_P < var4_int) {
                  this.field_A = this.field_A.substring(0, this.field_P);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$2 = this.field_A.length();
              this.field_Q = dupTemp$2;
              this.field_V = dupTemp$2;
              if (!param0) {
                this.j(-12956);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("nn.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            var3 = wg.a(param0, -3, param1);
            if (var3 != null) {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (var4 >= param0.length()) {
                  if (param2 != 82) {
                    field_X = true;
                    stackIn_14_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  if (om.a(param0.charAt(var4), false)) {
                    var4++;
                    continue L1;
                  } else {
                    stackIn_9_0 = tc.field_t;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("nn.R(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return (String) ((Object) stackIn_14_0);
          }
        }
    }

    void a(na param0, int param1, int param2, boolean param3) {
        jh var5 = null;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.h((byte) -85);
              if (this.field_x == 1) {
                L2: {
                  if (this.field_H instanceof jh) {
                    var5 = (jh) ((Object) this.field_H);
                    var6 = var5.a(param2, param1, a.field_a, aa.field_Nb, (na) (this), (byte) -34);
                    if (0 != (var6 ^ -1)) {
                      L3: {
                        if (!this.field_Z) {
                          break L3;
                        } else {
                          if (var6 >= this.field_ab) {
                            break L3;
                          } else {
                            if (var6 <= this.field_Q) {
                              break L3;
                            } else {
                              var6 = this.field_ab;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_V = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                this.field_bb = k.a(0);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5_ref);

            stackIn_15_1 = new StringBuilder().append("nn.MA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String g(int param0) {
        int var2 = this.field_V <= this.field_Q ? this.field_V : this.field_Q;
        if (param0 < 43) {
            return (String) null;
        }
        int var3 = this.field_Q >= this.field_V ? this.field_Q : this.field_V;
        return this.field_A.substring(var2, var3);
    }

    final void k(int param0) {
        this.field_A = "";
        this.field_Q = 0;
        this.field_V = param0;
        this.j(-12956);
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_V != this.field_Q) {
            var2 = this.field_V > this.field_Q ? this.field_Q : this.field_V;
            var3 = this.field_Q >= this.field_V ? this.field_Q : this.field_V;
            this.field_Q = var2;
            this.field_V = var2;
            this.field_A = this.field_A.substring(0, var2) + this.field_A.substring(var3, this.field_A.length());
            this.j(-12956);
        }
        if (param0 != 1) {
            String var4 = (String) null;
            this.a(false, -8, (String) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        jh var8 = null;
        long var6 = 0L;
        if (param0 != 0) {
            return;
        }
        if (this.field_H != null) {
            if (!(0 != param3)) {
                this.field_H.a((na) (this), param1, param2, true, this.field_K);
                if (this.field_H instanceof jh) {
                    var8 = (jh) ((Object) this.field_H);
                    if (this.field_Q != this.field_V) {
                        var8.a(this.field_Q, 18985, this.field_V, param1, param2, (na) (this));
                    }
                    var6 = k.a(param0 ^ 0);
                    if (((var6 - this.field_bb) % 1000L ^ -1L) > -501L) {
                        var8.a((na) (this), param2, this.field_V, 0, param1);
                    }
                }
            }
        }
    }

    final static int f(byte param0) {
        if (param0 >= -43) {
            nn.f((byte) -110);
        }
        return -ja.field_j + hd.field_q;
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        int dupTemp$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_64_0 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_bb = k.a(param2 + -1);
              if (param2 == 1) {
                break L1;
              } else {
                nn.i(88);
                break L1;
              }
            }
            L2: {
              if (param1 == 60) {
                break L2;
              } else {
                if (param1 == 62) {
                  break L2;
                } else {
                  L3: {
                    if (param1 < 32) {
                      break L3;
                    } else {
                      if (126 < param1) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_V == this.field_Q) {
                            break L4;
                          } else {
                            this.h(param2 ^ 0);
                            break L4;
                          }
                        }
                        L5: {
                          if ((this.field_P ^ -1) == 0) {
                            break L5;
                          } else {
                            if (this.field_A.length() < this.field_P) {
                              break L5;
                            } else {
                              return true;
                            }
                          }
                        }
                        L6: {
                          if (this.field_V >= this.field_A.length()) {
                            this.field_A = this.field_A + param1;
                            dupTemp$0 = this.field_A.length();
                            this.field_V = dupTemp$0;
                            this.field_Q = dupTemp$0;
                            break L6;
                          } else {
                            this.field_A = this.field_A.substring(0, this.field_V) + param1 + this.field_A.substring(this.field_V, this.field_A.length());
                            this.field_V = this.field_V + 1;
                            this.field_Q = this.field_V;
                            break L6;
                          }
                        }
                        this.j(param2 + -12957);
                        stackIn_18_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L7: {
                    if (-86 != (param0 ^ -1)) {
                      if (101 != param0) {
                        if ((param0 ^ -1) == -14) {
                          this.k(0);
                          stackIn_72_0 = 1;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        } else {
                          if (96 == param0) {
                            if (this.field_V <= 0) {
                              break L7;
                            } else {
                              L8: {
                                stackIn_68_0 = this;

                                stackIn_68_1 = 81;

                                if (!sn.field_a[82]) {
                                  stackIn_69_0 = this;
                                  stackIn_69_1 = stackIn_68_1;
                                  stackIn_69_2 = this.field_V + -1;
                                  break L8;
                                } else {
                                  stackIn_69_0 = this;
                                  stackIn_69_1 = stackIn_68_1;
                                  stackIn_69_2 = this.n(param2 ^ -34);
                                  break L8;
                                }
                              }
                              this.c(stackIn_69_1, stackIn_69_2);
                              stackIn_70_0 = 1;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            }
                          } else {
                            if (param0 == 97) {
                              if (this.field_V < this.field_A.length()) {
                                L9: {
                                  stackIn_62_0 = this;

                                  stackIn_62_1 = 81;

                                  if (!sn.field_a[82]) {
                                    stackIn_63_0 = this;
                                    stackIn_63_1 = stackIn_62_1;
                                    stackIn_63_2 = this.field_V - -1;
                                    break L9;
                                  } else {
                                    stackIn_63_0 = this;
                                    stackIn_63_1 = stackIn_62_1;
                                    stackIn_63_2 = this.d(false);
                                    break L9;
                                  }
                                }
                                this.c(stackIn_63_1, stackIn_63_2);
                                stackIn_64_0 = 1;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              } else {
                                break L7;
                              }
                            } else {
                              if (-103 != (param0 ^ -1)) {
                                if ((param0 ^ -1) != -104) {
                                  if ((param0 ^ -1) == -85) {
                                    this.m(param2 ^ 83);
                                    stackIn_57_0 = 1;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    L10: {
                                      if (!sn.field_a[82]) {
                                        break L10;
                                      } else {
                                        if ((param0 ^ -1) == -66) {
                                          this.f(true);
                                          stackIn_55_0 = 1;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!sn.field_a[82]) {
                                        break L11;
                                      } else {
                                        if (-67 != (param0 ^ -1)) {
                                          break L11;
                                        } else {
                                          this.l(83);
                                          stackIn_49_0 = 1;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!sn.field_a[82]) {
                                      break L7;
                                    } else {
                                      if (67 != param0) {
                                        break L7;
                                      } else {
                                        this.e((byte) 77);
                                        stackIn_53_0 = 1;
                                        decompiledRegionSelector0 = 9;
                                        break L0;
                                      }
                                    }
                                  }
                                } else {
                                  this.c(param2 + 80, this.field_A.length());
                                  stackIn_41_0 = 1;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                }
                              } else {
                                this.c(81, 0);
                                stackIn_38_0 = 1;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_V != this.field_Q) {
                          this.h(1);
                          stackIn_32_0 = 1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (this.field_V >= this.field_A.length()) {
                            break L7;
                          } else {
                            this.field_Q = 1 + this.field_V;
                            this.h(1);
                            stackIn_30_0 = 1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      }
                    } else {
                      if (this.field_V != this.field_Q) {
                        this.h(1);
                        stackIn_25_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (this.field_V <= 0) {
                          break L7;
                        } else {
                          this.field_Q = this.field_V - 1;
                          this.h(1);
                          stackIn_23_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_74_0 = 0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var5);

            stackIn_77_1 = new StringBuilder().append("nn.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L12;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L12;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_38_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_41_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_49_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_53_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_55_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_57_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_64_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_70_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_72_0 != 0;
                                    } else {
                                      return stackIn_74_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void f(boolean param0) {
        this.l(93);
        if (!param0) {
            this.j(95);
        }
        this.h(1);
    }

    private final int n(int param0) {
        int var2;
        int var3;
        var3 = TetraLink.field_J;
        if (this.field_V != 0) {
          L0: {
            if (param0 == -33) {
              break L0;
            } else {
              field_Y = (byte[]) null;
              break L0;
            }
          }
          var2 = this.field_V - 1;
          L1: while (true) {
            L2: {
              if ((var2 ^ -1) >= -1) {
                break L2;
              } else {
                if (this.field_A.charAt(-1 + var2) == 32) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        } else {
          return this.field_V;
        }
    }

    final static void g(byte param0) {
        int var1_int = 0;
        int var2 = TetraLink.field_J;
        try {
            var1_int = 0;
            if (param0 >= -73) {
                CharSequence var3 = (CharSequence) null;
                nn.a((CharSequence) null, true, 124);
            }
            while (pl.field_d > var1_int) {
                n.field_L[var1_int] = null;
                var1_int++;
            }
            pl.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "nn.O(" + param0 + ')');
        }
    }

    void j(int param0) {
        if (this.field_s instanceof ih) {
            ((ih) ((Object) this.field_s)).a((byte) 73, (nn) (this));
        }
        if (param0 != -12956) {
            this.e((byte) 22);
        }
    }

    final static int i(int param0) {
        if (param0 < 66) {
            field_T = (ah) null;
        }
        return ea.field_a;
    }

    private final void h(byte param0) {
        hi var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        jh var10;
        var9 = TetraLink.field_J;
        if (this.field_W) {
          if (this.field_H instanceof jh) {
            var10 = (jh) ((Object) this.field_H);
            var5 = -2 % ((72 - param0) / 39);
            var3 = var10.a((na) (this), false);
            var4 = var3.b((byte) 66);
            var6 = var10.b((na) (this), 92);
            var7 = var10.a(true) >> 1539103425;
            if (var4 >= var6 - var7) {
              L0: {
                var8 = this.field_E + var3.a(this.field_V, true);
                if (var8 > -var7 + var6) {
                  this.field_E = -var7 - -var6 - (var8 - this.field_E);
                  break L0;
                } else {
                  if (var7 > var8) {
                    this.field_E = this.field_E + (-var8 + var7);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L1: {
                if (this.field_E > 0) {
                  this.field_E = 0;
                  break L1;
                } else {
                  if (-var6 - -var7 > this.field_E) {
                    this.field_E = -var6 - -var7;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              this.field_o = 0;
              this.field_E = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_o = 0;
          this.field_E = 0;
          return;
        }
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        if (!(this.field_P == -1)) {
            var3_int = this.field_P + -this.field_A.length();
            if (0 <= var3_int) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (!param1) {
            return;
        }
        try {
            if (this.field_V == this.field_A.length()) {
                this.field_A = this.field_A + param0;
            } else {
                this.field_A = this.field_A.substring(0, this.field_V) + param0 + this.field_A.substring(this.field_V, this.field_A.length());
            }
            this.field_V = this.field_V + param0.length();
            this.field_Q = this.field_V;
            this.j(-12956);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "nn.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void e(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                L1: {
                  var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                  this.h(1);
                  this.a(var2, true);
                  if (param0 >= 29) {
                    break L1;
                  } else {
                    this.field_P = -31;
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void l(int param0) {
        String var2 = this.g(46);
        if (param0 <= 26) {
            return;
        }
        if (!((var2.length() ^ -1) >= -1)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.g(71))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final int d(boolean param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = TetraLink.field_J;
          if (!param0) {
            break L0;
          } else {
            field_cb = -17;
            break L0;
          }
        }
        var2 = this.field_A.length();
        if (this.field_V != var2) {
          var3 = 1 + this.field_V;
          L1: while (true) {
            L2: {
              if (var2 <= var3) {
                break L2;
              } else {
                if (this.field_A.charAt(var3 + -1) == 32) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        } else {
          return this.field_V;
        }
    }

    final static void a(String param0, float param1, int param2, boolean param3) {
        try {
            if (nl.field_a == null) {
                nl.field_a = new ug(mf.field_s, wg.field_b);
                mf.field_s.a(nl.field_a, false);
            }
            nl.field_a.a(param0, (byte) -122, param1, param3);
            ra.a();
            i.b(true, 122);
            int var4_int = -4 % ((param2 - -53) / 62);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "nn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_cb = 0;
    }
}
