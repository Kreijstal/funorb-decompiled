/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends sp implements ai {
    private wp field_I;
    boolean field_A;
    private int field_M;
    private int field_H;
    mc field_J;
    private boolean field_K;
    hd field_B;
    private wp field_O;
    static ri[] field_F;
    static int field_D;
    String field_L;
    vn field_G;
    static int field_C;
    static bw field_N;

    private final void j(int param0) {
        int var2 = this.field_B.e((byte) -128);
        int var3 = var2;
        int var4 = 0;
        if (var3 > this.field_H) {
            var3 = this.field_H;
            var4 = 1;
        }
        this.c(this.field_r, this.field_q, 8725, this.field_v, var3 + this.field_M);
        this.field_B.a(114, 0, 0, var2, this.field_q);
        this.field_J = new mc(0, 0, 0, 0, new tm(), this.field_B, (mh) null);
        if (var4 != 0) {
            this.field_J.a(1332, true, hb.a((byte) 35));
        }
        this.field_J.a(-126, 0, this.field_M, this.field_p + -this.field_M, this.field_q);
        this.field_A = true;
        int var5 = 32 % ((param0 - -71) / 49);
        this.a(this.field_J, 72);
        this.k(-1);
    }

    final String c(int param0) {
        if (this.field_k) {
          L0: {
            if (param0 == -6696) {
              break L0;
            } else {
              this.field_L = (String) null;
              break L0;
            }
          }
          L1: {
            if (!this.i(param0 ^ -6708)) {
              break L1;
            } else {
              if (!this.field_J.field_k) {
                break L1;
              } else {
                if ((this.field_B.field_N ^ -1) != 0) {
                  return this.field_B.field_K[this.field_B.field_N].toString();
                } else {
                  break L1;
                }
              }
            }
          }
          if (this.field_B.a(-47) != null) {
            return this.field_B.a(param0 ^ 6783).toString();
          } else {
            return super.c(-6696);
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_M = param3;
        this.c(param1, param4, 8725, param2, param3);
        int var6 = 101 % ((28 - param0) / 63);
    }

    final boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 61) {
              L1: {
                param0.c((byte) 115);
                this.field_K = true;
                this.field_L = "";
                if (null == this.field_o) {
                  break L1;
                } else {
                  if (this.field_o instanceof fc) {
                    ((fc) ((Object) this.field_o)).a(this.field_K, (pk) (this), -90);
                    break L1;
                  } else {
                    return true;
                  }
                }
              }
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ld.Q(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -42) {
                break L1;
              } else {
                this.field_J = (mc) null;
                break L1;
              }
            }
            stackIn_3_0 = super.a(param0, -54, param2, param3, param4, param5, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ld.R(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final void c(byte param0) {
        int var2 = 4 / ((param0 - 64) / 51);
        this.field_K = false;
        super.c((byte) 116);
    }

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.h(24);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_K) {
              break L2;
            } else {
              if (!super.d(-1)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void a(byte param0) {
        field_F = null;
        int var1 = -53 / ((-1 - param0) / 59);
        field_N = null;
    }

    final void a(int param0, int param1, pk param2, int param3) {
        try {
            int var5_int = -76 % ((-25 - param1) / 45);
            super.a(param0, 85, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ld.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void e(byte param0) {
        if (!this.i(20)) {
            return;
        }
        this.c(this.field_r, this.field_q, 8725, this.field_v, this.field_M);
        this.field_A = false;
        if (param0 != 65) {
            return;
        }
        this.field_J.b(false);
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 8725) {
            this.a(-95, -108, -69, 98, 124);
        }
        super.a(-108, param0, param3, param4, param1);
        this.field_O.a(98, 0, 0, this.field_M, param1 + -20);
        this.field_I.a(99, param1 + -20, 0, this.field_M, 20);
        if (!(!this.field_A)) {
            this.field_J.a(-91, 0, this.field_M, -this.field_M + param4, param1);
        }
    }

    final void h(int param0) {
        if (param0 != 0) {
            this.e((byte) 67);
        }
        if (this.field_o instanceof hs) {
            ((hs) ((Object) this.field_o)).a((byte) -13, (ld) (this));
        }
    }

    private final void k(int param0) {
        int var8 = 0;
        if (!this.i(param0 + 21) || this.field_B.field_L == -1 || this.field_B.field_K == null || null == this.field_J.field_B) {
            return;
        }
        int var2 = this.field_J.field_D.field_p;
        int var3 = this.field_B.field_J;
        int var4 = -var2 + this.field_B.field_p;
        if (param0 != -1) {
            return;
        }
        if (var4 <= 0) {
            return;
        }
        int var5 = this.field_B.field_L * var3;
        int var6 = this.field_J.field_D.field_y.field_v + var5;
        int var7 = var2 >> 422830658;
        if (!(var7 <= var6)) {
            var8 = -(-var5 + var7 << 580280272) / var4;
            if (!(0 <= var8)) {
                var8 = 0;
            }
            this.field_J.field_B.field_D = var8;
        }
        var7 = (var2 * 3 >> 1983003714) + -var3;
        if (var6 > var7) {
            var8 = -(var7 + -var5 << -1708218512) / var4;
            if (var8 > 65536) {
                var8 = 65536;
            }
            this.field_J.field_B.field_D = var8;
        }
    }

    final static void a(String param0, byte param1) {
        try {
            rj.a((byte) -94, param0);
            if (param1 != -47) {
                field_C = 74;
            }
            oc.a(us.field_m, false, (byte) -89);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ld.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean i(int param0) {
        if (param0 != 20) {
            field_C = -95;
        }
        return this.field_A;
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_61_0 = false;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.d(-1)) {
              L1: {
                if (null != this.field_B.field_K) {
                  L2: {
                    var5_int = this.field_B.field_K.length;
                    if (param3 == 99) {
                      break L2;
                    } else {
                      if ((param3 ^ -1) == -99) {
                        break L2;
                      } else {
                        L3: {
                          if (105 == param3) {
                            break L3;
                          } else {
                            if (-105 != (param3 ^ -1)) {
                              if (84 != param3) {
                                if (param3 == 85) {
                                  var6_int = this.field_L.length();
                                  if (0 < var6_int) {
                                    this.field_L = this.field_L.substring(0, var6_int + -1);
                                    stackIn_48_0 = 1;
                                    decompiledRegionSelector0 = 4;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  if (32 > param1) {
                                    break L1;
                                  } else {
                                    if (param1 < 128) {
                                      var6 = this.field_L + param1;
                                      this.a(false, var6);
                                      stackIn_53_0 = 1;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                L4: {
                                  if (this.field_A) {
                                    this.e((byte) 65);
                                    break L4;
                                  } else {
                                    this.j(-120);
                                    break L4;
                                  }
                                }
                                stackIn_42_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          if (this.i(20)) {
                            break L5;
                          } else {
                            this.j(-126);
                            break L5;
                          }
                        }
                        L6: {
                          var6_int = this.field_J.field_D.field_p / this.field_B.field_J;
                          if (param3 == 105) {
                            this.field_B.field_L = this.field_B.field_L + var6_int;
                            break L6;
                          } else {
                            this.field_B.field_L = this.field_B.field_L - var6_int;
                            break L6;
                          }
                        }
                        L7: {
                          if (-1 >= (this.field_B.field_L ^ -1)) {
                            break L7;
                          } else {
                            this.field_B.field_L = 0;
                            break L7;
                          }
                        }
                        L8: {
                          if (var5_int <= this.field_B.field_L) {
                            this.field_B.field_L = var5_int + -1;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        this.k(-1);
                        stackIn_36_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  L9: {
                    if (!this.i(20)) {
                      this.j(-122);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param3 != 99) {
                      this.field_B.field_L = this.field_B.field_L - 1;
                      break L10;
                    } else {
                      this.field_B.field_L = this.field_B.field_L + 1;
                      break L10;
                    }
                  }
                  L11: {
                    if (0 > this.field_B.field_L) {
                      this.field_B.field_L = 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var5_int > this.field_B.field_L) {
                      break L12;
                    } else {
                      this.field_B.field_L = var5_int + -1;
                      break L12;
                    }
                  }
                  this.k(-1);
                  stackIn_21_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
              if (param2 >= 9) {
                if (-81 != (param3 ^ -1)) {
                  stackIn_61_0 = super.a(param0, param1, (byte) 102, param3);
                  decompiledRegionSelector0 = 8;
                  break L0;
                } else {
                  this.e((byte) 65);
                  stackIn_59_0 = 0;
                  decompiledRegionSelector0 = 7;
                  break L0;
                }
              } else {
                stackIn_56_0 = 0;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackIn_64_0 = (RuntimeException) (var5);

            stackIn_64_1 = new StringBuilder().append("ld.KA(");

            if (param0 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L13;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L13;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_36_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_42_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_48_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_53_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_56_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_59_0 != 0;
                      } else {
                        return stackIn_61_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param1 == 710) {
                break L1;
              } else {
                field_C = -21;
                break L1;
              }
            }
            L2: {
              if (!this.i(20)) {
                this.j(119);
                break L2;
              } else {
                this.e((byte) 65);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("ld.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    ld(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (mh) null);
        this.field_G = kw.field_b;
        this.field_L = "";
        try {
            this.field_B = new hd((ld) (this), this.field_G, param0, param1);
            this.field_H = param2;
            this.field_A = false;
            this.field_B.field_o = (qm) (this);
            this.field_O = new wp("", new dv((ld) (this)), (qm) (this));
            this.field_I = new wp();
            this.field_I.field_w = (mh) ((Object) new fm());
            this.field_I.field_o = (qm) (this);
            this.a(this.field_O, 125);
            this.a(this.field_I, 74);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param0 = param0.toLowerCase();
              if (param1 == -2860) {
                break L1;
              } else {
                field_N = (bw) null;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= this.field_B.field_K.length) {
                stackIn_11_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = this.field_B.field_K[var3_int].toString().toLowerCase();
                if (var4.startsWith(param0)) {
                  stackIn_8_0 = var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ld.AA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_11_0;
        }
    }

    final int g(int param0) {
        int var2 = -105 / ((param0 - -37) / 54);
        return this.field_B.field_L;
    }

    private final void a(boolean param0, String param1) {
        if (this.field_B.field_K == null) {
            return;
        }
        int var3_int = this.a(param1.toLowerCase(), -2860);
        if ((var3_int ^ -1) == 0) {
            return;
        }
        try {
            this.field_B.field_L = var3_int;
            if (param0) {
                String var4 = (String) null;
                ld.a((String) null, (byte) -13);
            }
            this.k(-1);
            this.field_L = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ld.LA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
