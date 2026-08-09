/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rla extends b implements tsa {
    cca field_F;
    private rj field_I;
    private boolean field_B;
    private rj field_E;
    static bna field_D;
    boolean field_G;
    String field_w;
    static java.awt.Frame field_x;
    je field_z;
    private int field_C;
    private int field_A;
    il field_H;
    static String field_y;

    private final void a(String param0, byte param1) {
        if (param1 != 106) {
            ae var4 = (ae) null;
            this.a(36, -37, (ae) null, 57);
        }
        if (!(this.field_z.field_I != null)) {
            return;
        }
        int var3_int = this.a((byte) 126, param0.toLowerCase());
        if (!((var3_int ^ -1) != 0)) {
            return;
        }
        try {
            this.field_z.field_G = var3_int;
            this.c(101);
            this.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rla.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param4 >= gca.field_d && hc.field_h >= param4) {
            param1 = rp.a(ss.field_c, -16226, pka.field_b, param1);
            param0 = rp.a(ss.field_c, param2 ^ 16224, pka.field_b, param0);
            uea.a(param0, param3, param4, param1, false);
        }
        if (param2 != -2) {
            rla.a(-75, 34, (byte) 59, 71, -47);
        }
    }

    rla(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (isa) null);
        this.field_H = mj.field_J;
        this.field_w = "";
        try {
            this.field_z = new je((rla) (this), this.field_H, param0, param1);
            this.field_z.field_h = (qc) (this);
            this.field_G = false;
            this.field_A = param2;
            this.field_I = new rj("", new fua((rla) (this)), (qc) (this));
            this.field_E = new rj();
            this.field_E.field_r = (isa) ((Object) new ema());
            this.field_E.field_h = (qc) (this);
            this.a(this.field_I, -1);
            this.a(this.field_E, -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a((byte) -31, param4, param0, param2, param1);
        this.field_I.a((byte) -31, param4 - 20, this.field_C, 0, 0);
        if (param3) {
            this.a((byte) -97);
        }
        this.field_E.a((byte) -31, 20, this.field_C, -20 + param4, 0);
        if (!(!this.field_G)) {
            this.field_F.a((byte) -31, param4, -this.field_C + param0, 0, this.field_C);
        }
    }

    final boolean b(byte param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == -34) {
            break L0;
          } else {
            this.field_w = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_B) {
              break L2;
            } else {
              if (!super.b((byte) -34)) {
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

    private final void a(byte param0) {
        if (!(this.j((byte) -82))) {
            return;
        }
        this.a(this.field_C, this.field_n, this.field_i, false, this.field_m);
        this.field_G = false;
        this.field_F.p(76);
        if (param0 < 82) {
            field_y = (String) null;
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rla.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 70) {
              stackIn_4_0 = super.a(107, param1, param2, param3, param4, param5, param6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("rla.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
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
              if (!this.j((byte) -73)) {
                this.d(-21088);
                break L1;
              } else {
                this.a((byte) 119);
                break L1;
              }
            }
            L2: {
              if (param4 >= 44) {
                break L2;
              } else {
                this.field_G = false;
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

            stackIn_8_1 = new StringBuilder().append("rla.M(").append(param0).append(',').append(param1).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void c(int param0) {
        int var8 = 0;
        if (!this.j((byte) 106) || -1 == this.field_z.field_G || this.field_z.field_I == null || this.field_F.field_x == null) {
            return;
        }
        int var2 = this.field_F.field_A.field_p;
        int var3 = this.field_z.field_K;
        int var4 = this.field_z.field_p + -var2;
        if (-1 <= (var4 ^ -1)) {
            return;
        }
        int var5 = var3 * this.field_z.field_G;
        int var6 = this.field_F.field_A.field_x.field_n + var5;
        if (param0 <= 35) {
            return;
        }
        int var7 = var2 >> -1086752894;
        if (!(var7 <= var6)) {
            var8 = -(-var5 + var7 << 774006480) / var4;
            if ((var8 ^ -1) > -1) {
                var8 = 0;
            }
            this.field_F.field_x.field_O = var8;
        }
        var7 = (3 * var2 >> -1283527774) - var3;
        if (!(var7 >= var6)) {
            var8 = -(var7 + -var5 << 1275572080) / var4;
            if (!(var8 <= 65536)) {
                var8 = 65536;
            }
            this.field_F.field_x.field_O = var8;
        }
    }

    private final void d(int param0) {
        int var2 = this.field_z.c(23112);
        int var3 = var2;
        int var4 = 0;
        if (param0 != -21088) {
            this.field_C = -126;
        }
        if (var3 > this.field_A) {
            var4 = 1;
            var3 = this.field_A;
        }
        this.a(this.field_C + var3, this.field_n, this.field_i, false, this.field_m);
        this.field_z.a((byte) -31, this.field_m, var2, 0, 0);
        this.field_F = new cca(0, 0, 0, 0, new pu(), this.field_z, (isa) null);
        if (!(var4 == 0)) {
            this.field_F.a(1, st.b(-5412), true);
        }
        this.field_F.a((byte) -31, this.field_m, this.field_p - this.field_C, 0, this.field_C);
        this.field_G = true;
        this.a(this.field_F, -1);
        this.c(43);
    }

    final boolean j(byte param0) {
        int var2 = 56 % ((param0 - 11) / 53);
        return this.field_G;
    }

    public static void b(boolean param0) {
        field_x = null;
        field_D = null;
        if (!param0) {
            field_y = (String) null;
        }
        field_y = null;
    }

    final void a(int param0) {
        if (!(!(this.field_h instanceof eaa))) {
            ((eaa) ((Object) this.field_h)).a(-3, (rla) (this));
        }
        if (param0 != 99) {
            this.b((byte) -17);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        this.field_C = param2;
        if (param0 != -31) {
            return;
        }
        this.a(param2, param4, param3, false, param1);
    }

    final int i(byte param0) {
        if (param0 <= 9) {
            return -96;
        }
        return this.field_z.field_G;
    }

    final void f(byte param0) {
        int var2 = 1 / ((-38 - param0) / 60);
        this.field_B = false;
        super.f((byte) 41);
    }

    final String d(byte param0) {
        int var2 = 70 / ((-58 - param0) / 60);
        if (!this.field_f) {
            return null;
        }
        if (this.j((byte) -46) && this.field_F.field_f && -1 != this.field_z.field_H) {
            return this.field_z.field_I[this.field_z.field_H].toString();
        }
        if (this.field_z.d(117) != null) {
            return this.field_z.d(121).toString();
        }
        return super.d((byte) 79);
    }

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.f((byte) -120);
              if (!param1) {
                break L1;
              } else {
                this.field_w = (String) null;
                break L1;
              }
            }
            L2: {
              this.field_B = true;
              this.field_w = "";
              if (this.field_h == null) {
                break L2;
              } else {
                if (this.field_h instanceof vfa) {
                  ((vfa) ((Object) this.field_h)).a((ae) (this), (byte) -75, this.field_B);
                  break L2;
                } else {
                  return true;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("rla.S(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int stackIn_4_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
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
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.b((byte) -34)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3) {
                  break L1;
                } else {
                  this.a((byte) 94, -22, -43, -18, -59);
                  break L1;
                }
              }
              L2: {
                if (null == this.field_z.field_I) {
                  break L2;
                } else {
                  L3: {
                    var5_int = this.field_z.field_I.length;
                    if (param2 == 99) {
                      break L3;
                    } else {
                      if (-99 != (param2 ^ -1)) {
                        L4: {
                          if (105 == param2) {
                            break L4;
                          } else {
                            if (-105 == (param2 ^ -1)) {
                              break L4;
                            } else {
                              if (param2 == 84) {
                                L5: {
                                  if (this.field_G) {
                                    this.a((byte) 122);
                                    break L5;
                                  } else {
                                    this.d(-21088);
                                    break L5;
                                  }
                                }
                                stackIn_45_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (-86 == (param2 ^ -1)) {
                                  var6_int = this.field_w.length();
                                  if (var6_int > 0) {
                                    this.field_w = this.field_w.substring(0, -1 + var6_int);
                                    stackIn_51_0 = 1;
                                    decompiledRegionSelector0 = 4;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  if (param0 < 32) {
                                    break L2;
                                  } else {
                                    if (param0 < 128) {
                                      var6 = this.field_w + param0;
                                      this.a(var6, (byte) 106);
                                      stackIn_56_0 = 1;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L6: {
                          if (this.j((byte) 88)) {
                            break L6;
                          } else {
                            this.d(-21088);
                            break L6;
                          }
                        }
                        L7: {
                          var6_int = this.field_F.field_A.field_p / this.field_z.field_K;
                          if (105 == param2) {
                            this.field_z.field_G = this.field_z.field_G + var6_int;
                            break L7;
                          } else {
                            this.field_z.field_G = this.field_z.field_G - var6_int;
                            break L7;
                          }
                        }
                        L8: {
                          if (this.field_z.field_G >= 0) {
                            break L8;
                          } else {
                            this.field_z.field_G = 0;
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_z.field_G < var5_int) {
                            break L9;
                          } else {
                            this.field_z.field_G = var5_int + -1;
                            break L9;
                          }
                        }
                        this.c(46);
                        stackIn_38_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L10: {
                    if (!this.j((byte) 101)) {
                      this.d(-21088);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param2 == 99) {
                      this.field_z.field_G = this.field_z.field_G + 1;
                      break L11;
                    } else {
                      this.field_z.field_G = this.field_z.field_G - 1;
                      break L11;
                    }
                  }
                  L12: {
                    if (0 > this.field_z.field_G) {
                      this.field_z.field_G = 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (this.field_z.field_G >= var5_int) {
                      this.field_z.field_G = var5_int + -1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  this.c(84);
                  stackIn_24_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              if ((param2 ^ -1) != -81) {
                stackIn_61_0 = super.a(param0, param1, param2, true);
                decompiledRegionSelector0 = 7;
                break L0;
              } else {
                this.a((byte) 125);
                stackIn_59_0 = 0;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackIn_64_0 = (RuntimeException) (var5);

            stackIn_64_1 = new StringBuilder().append("rla.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L14;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_24_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_45_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_51_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_56_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
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

    private final int a(byte param0, String param1) {
        int discarded$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param1 = param1.toLowerCase();
              if (param0 >= 116) {
                break L1;
              } else {
                var6 = (String) null;
                discarded$1 = this.a((byte) 25, (String) null);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= this.field_z.field_I.length) {
                stackIn_10_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = this.field_z.field_I[var3_int].toString().toLowerCase();
                if (!var4.startsWith(param1)) {
                  var3_int++;
                  continue L2;
                } else {
                  stackIn_7_0 = var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("rla.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_y = "Year";
    }
}
