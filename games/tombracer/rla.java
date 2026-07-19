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
        L0: {
          if (param4 < gca.field_d) {
            break L0;
          } else {
            if (hc.field_h < param4) {
              break L0;
            } else {
              param1 = rp.a(ss.field_c, -16226, pka.field_b, param1);
              param0 = rp.a(ss.field_c, param2 ^ 16224, pka.field_b, param0);
              uea.a(param0, param3, param4, param1, false);
              break L0;
            }
          }
        }
        if (param2 != -2) {
          rla.a(-75, 34, (byte) 59, 71, -47);
          return;
        } else {
          return;
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
          L0: {
            this.a((byte) -97);
            this.field_E.a((byte) -31, 20, this.field_C, -20 + param4, 0);
            if (this.field_G) {
              this.field_F.a((byte) -31, param4, -this.field_C + param0, 0, this.field_C);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            this.field_E.a((byte) -31, 20, this.field_C, -20 + param4, 0);
            if (this.field_G) {
              this.field_F.a((byte) -31, param4, -this.field_C + param0, 0, this.field_C);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -34) {
          if (!this.field_B) {
            if (super.b((byte) -34)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          this.field_w = (String) null;
          if (this.field_B) {
            return true;
          } else {
            L0: {
              if (!super.b((byte) -34)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 >= 70) {
              stackOut_3_0 = super.a(107, param1, param2, param3, param4, param5, param6);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("rla.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (this.j((byte) -73)) {
                this.a((byte) 119);
                if (!TombRacer.field_G) {
                  break L1;
                } else {
                  this.d(-21088);
                  break L1;
                }
              } else {
                this.d(-21088);
                break L1;
              }
            }
            if (param4 >= 44) {
              break L0;
            } else {
              this.field_G = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6);
            stackOut_8_1 = new StringBuilder().append("rla.M(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.j((byte) 106)) {
          if (-1 != this.field_z.field_G) {
            if (this.field_z.field_I != null) {
              if (this.field_F.field_x != null) {
                var2 = this.field_F.field_A.field_p;
                var3 = this.field_z.field_K;
                var4 = this.field_z.field_p + -var2;
                if (-1 > (var4 ^ -1)) {
                  var5 = var3 * this.field_z.field_G;
                  var6 = this.field_F.field_A.field_x.field_n + var5;
                  if (param0 <= 35) {
                    return;
                  } else {
                    L0: {
                      var7 = var2 >> -1086752894;
                      if (var7 > var6) {
                        L1: {
                          var8 = -(-var5 + var7 << 774006480) / var4;
                          if ((var8 ^ -1) <= -1) {
                            break L1;
                          } else {
                            var8 = 0;
                            break L1;
                          }
                        }
                        this.field_F.field_x.field_O = var8;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    L2: {
                      var7 = (3 * var2 >> -1283527774) - var3;
                      if (var7 < var6) {
                        L3: {
                          var8 = -(var7 + -var5 << 1275572080) / var4;
                          if (var8 > 65536) {
                            var8 = 65536;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        this.field_F.field_x.field_O = var8;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = this.field_z.c(23112);
        var3 = var2;
        var4 = 0;
        if (param0 != -21088) {
          L0: {
            this.field_C = -126;
            if (var3 <= this.field_A) {
              break L0;
            } else {
              var4 = 1;
              var3 = this.field_A;
              break L0;
            }
          }
          L1: {
            this.a(this.field_C + var3, this.field_n, this.field_i, false, this.field_m);
            this.field_z.a((byte) -31, this.field_m, var2, 0, 0);
            this.field_F = new cca(0, 0, 0, 0, new pu(), this.field_z, (isa) null);
            if (var4 != 0) {
              this.field_F.a(1, st.b(-5412), true);
              break L1;
            } else {
              break L1;
            }
          }
          this.field_F.a((byte) -31, this.field_m, this.field_p - this.field_C, 0, this.field_C);
          this.field_G = true;
          this.a(this.field_F, -1);
          this.c(43);
          return;
        } else {
          L2: {
            if (var3 <= this.field_A) {
              break L2;
            } else {
              var4 = 1;
              var3 = this.field_A;
              break L2;
            }
          }
          L3: {
            this.a(this.field_C + var3, this.field_n, this.field_i, false, this.field_m);
            this.field_z.a((byte) -31, this.field_m, var2, 0, 0);
            this.field_F = new cca(0, 0, 0, 0, new pu(), this.field_z, (isa) null);
            if (var4 != 0) {
              this.field_F.a(1, st.b(-5412), true);
              break L3;
            } else {
              break L3;
            }
          }
          this.field_F.a((byte) -31, this.field_m, this.field_p - this.field_C, 0, this.field_C);
          this.field_G = true;
          this.a(this.field_F, -1);
          this.c(43);
          return;
        }
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
            field_y = null;
            return;
        }
        field_y = null;
    }

    final void a(int param0) {
        boolean discarded$2 = false;
        L0: {
          if (this.field_h instanceof eaa) {
            ((eaa) ((Object) this.field_h)).a(-3, (rla) (this));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 99) {
          discarded$2 = this.b((byte) -17);
          return;
        } else {
          return;
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
        int var2 = 0;
        var2 = 70 / ((-58 - param0) / 60);
        if (this.field_f) {
          if (this.j((byte) -46)) {
            if (this.field_F.field_f) {
              if (-1 == this.field_z.field_H) {
                if (this.field_z.d(117) != null) {
                  return this.field_z.d(121).toString();
                } else {
                  return super.d((byte) 79);
                }
              } else {
                return this.field_z.field_I[this.field_z.field_H].toString();
              }
            } else {
              if (this.field_z.d(117) != null) {
                return this.field_z.d(121).toString();
              } else {
                return super.d((byte) 79);
              }
            }
          } else {
            if (this.field_z.d(117) != null) {
              return this.field_z.d(121).toString();
            } else {
              return super.d((byte) 79);
            }
          }
        } else {
          return null;
        }
    }

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("rla.S(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        boolean stackIn_65_0 = false;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_24_0 = 0;
        boolean stackOut_64_0 = false;
        int stackOut_62_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.b((byte) -34)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
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
                                    if (var7 == 0) {
                                      break L5;
                                    } else {
                                      this.a((byte) 122);
                                      break L5;
                                    }
                                  }
                                }
                                stackOut_48_0 = 1;
                                stackIn_49_0 = stackOut_48_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (-86 == (param2 ^ -1)) {
                                  var6_int = this.field_w.length();
                                  if (var6_int > 0) {
                                    this.field_w = this.field_w.substring(0, -1 + var6_int);
                                    stackOut_54_0 = 1;
                                    stackIn_55_0 = stackOut_54_0;
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
                                      stackOut_59_0 = 1;
                                      stackIn_60_0 = stackOut_59_0;
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
                          L8: {
                            var6_int = this.field_F.field_A.field_p / this.field_z.field_K;
                            if (105 == param2) {
                              break L8;
                            } else {
                              this.field_z.field_G = this.field_z.field_G - var6_int;
                              if (var7 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          this.field_z.field_G = this.field_z.field_G + var6_int;
                          break L7;
                        }
                        L9: {
                          if (this.field_z.field_G >= 0) {
                            break L9;
                          } else {
                            this.field_z.field_G = 0;
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_z.field_G < var5_int) {
                            break L10;
                          } else {
                            this.field_z.field_G = var5_int + -1;
                            break L10;
                          }
                        }
                        this.c(46);
                        stackOut_39_0 = 1;
                        stackIn_40_0 = stackOut_39_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L11: {
                    if (!this.j((byte) 101)) {
                      this.d(-21088);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    L13: {
                      if (param2 == 99) {
                        break L13;
                      } else {
                        this.field_z.field_G = this.field_z.field_G - 1;
                        if (var7 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    this.field_z.field_G = this.field_z.field_G + 1;
                    break L12;
                  }
                  L14: {
                    if (0 > this.field_z.field_G) {
                      this.field_z.field_G = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (this.field_z.field_G >= var5_int) {
                      this.field_z.field_G = var5_int + -1;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  this.c(84);
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              if ((param2 ^ -1) != -81) {
                stackOut_64_0 = super.a(param0, param1, param2, true);
                stackIn_65_0 = stackOut_64_0;
                decompiledRegionSelector0 = 7;
                break L0;
              } else {
                this.a((byte) 125);
                stackOut_62_0 = 0;
                stackIn_63_0 = stackOut_62_0;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) (var5);
            stackOut_66_1 = new StringBuilder().append("rla.P(").append(param0).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L16;
            } else {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L16;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_40_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_49_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_55_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_60_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_63_0 != 0;
                    } else {
                      return stackIn_65_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final int a(byte param0, String param1) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        boolean stackIn_6_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param1 = param1.toLowerCase();
              if (param0 >= 116) {
                break L1;
              } else {
                var6 = (String) null;
                discarded$2 = this.a((byte) 25, (String) null);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3_int >= this.field_z.field_I.length) {
                    break L4;
                  } else {
                    var4 = this.field_z.field_I[var3_int].toString().toLowerCase();
                    stackOut_5_0 = var4.startsWith(param1);
                    stackIn_11_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        var3_int++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        stackOut_7_0 = var3_int;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_10_0 = -1;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("rla.U(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
        field_y = "Year";
    }
}
