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

    private final void a(String param0) {
        if (!(((rla) this).field_z.field_I != null)) {
            return;
        }
        int var3_int = this.a((byte) 126, param0.toLowerCase());
        if (!(var3_int != -1)) {
            return;
        }
        try {
            ((rla) this).field_z.field_G = var3_int;
            this.c(101);
            ((rla) this).field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rla.O(" + (param0 != null ? "{...}" : "null") + ',' + 106 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param4 >= gca.field_d) {
            if (hc.field_h >= param4) {
                param1 = rp.a(ss.field_c, -16226, pka.field_b, param1);
                param0 = rp.a(ss.field_c, param2 ^ 16224, pka.field_b, param0);
                int discarded$0 = 0;
                uea.a(param0, param3, param4, param1);
            }
        }
        if (param2 != -2) {
            rla.a(-75, 34, (byte) 59, 71, -47);
        }
    }

    rla(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (isa) null);
        ((rla) this).field_H = mj.field_J;
        ((rla) this).field_w = "";
        try {
            ((rla) this).field_z = new je((rla) this, ((rla) this).field_H, param0, param1);
            ((rla) this).field_z.field_h = (qc) this;
            ((rla) this).field_G = false;
            ((rla) this).field_A = param2;
            ((rla) this).field_I = new rj("", (isa) (Object) new fua((rla) this), (qc) this);
            ((rla) this).field_E = new rj();
            ((rla) this).field_E.field_r = (isa) (Object) new ema();
            ((rla) this).field_E.field_h = (qc) this;
            ((rla) this).a((ae) (Object) ((rla) this).field_I, -1);
            ((rla) this).a((ae) (Object) ((rla) this).field_E, -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a((byte) -31, param4, param0, param2, param1);
        ((rla) this).field_I.a((byte) -31, param4 - 20, ((rla) this).field_C, 0, 0);
        ((rla) this).field_E.a((byte) -31, 20, ((rla) this).field_C, -20 + param4, 0);
        if (!(!((rla) this).field_G)) {
            ((rla) this).field_F.a((byte) -31, param4, -((rla) this).field_C + param0, 0, ((rla) this).field_C);
        }
    }

    final boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -34) {
            break L0;
          } else {
            ((rla) this).field_w = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((rla) this).field_B) {
              break L2;
            } else {
              if (!super.b((byte) -34)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void a(byte param0) {
        if (!(((rla) this).j((byte) -82))) {
            return;
        }
        this.a(((rla) this).field_C, ((rla) this).field_n, ((rla) this).field_i, false, ((rla) this).field_m);
        ((rla) this).field_G = false;
        ((rla) this).field_F.p(76);
        if (param0 < 82) {
            field_y = null;
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rla.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
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
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("rla.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param6 + ')');
        }
        return stackIn_4_0;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((rla) this).j((byte) -73)) {
                int discarded$2 = -21088;
                this.d();
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
                ((rla) this).field_G = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("rla.M(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
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
        L0: {
          if (!((rla) this).j((byte) 106)) {
            break L0;
          } else {
            if (-1 == ((rla) this).field_z.field_G) {
              break L0;
            } else {
              if (((rla) this).field_z.field_I == null) {
                break L0;
              } else {
                if (((rla) this).field_F.field_x != null) {
                  var2 = ((rla) this).field_F.field_A.field_p;
                  var3 = ((rla) this).field_z.field_K;
                  var4 = ((rla) this).field_z.field_p + -var2;
                  if (var4 > 0) {
                    var5 = var3 * ((rla) this).field_z.field_G;
                    var6 = ((rla) this).field_F.field_A.field_x.field_n + var5;
                    if (param0 > 35) {
                      L1: {
                        var7 = var2 >> 2;
                        if (var7 > var6) {
                          L2: {
                            var8 = -(-var5 + var7 << 16) / var4;
                            if (var8 >= 0) {
                              break L2;
                            } else {
                              var8 = 0;
                              break L2;
                            }
                          }
                          ((rla) this).field_F.field_x.field_O = var8;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L3: {
                        var7 = (3 * var2 >> 2) - var3;
                        if (var7 < var6) {
                          L4: {
                            var8 = -(var7 + -var5 << 16) / var4;
                            if (var8 > 65536) {
                              var8 = 65536;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((rla) this).field_F.field_x.field_O = var8;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    private final void d() {
        int var2 = ((rla) this).field_z.c(23112);
        int var3 = var2;
        int var4 = 0;
        if (var3 > ((rla) this).field_A) {
            var4 = 1;
            var3 = ((rla) this).field_A;
        }
        this.a(((rla) this).field_C + var3, ((rla) this).field_n, ((rla) this).field_i, false, ((rla) this).field_m);
        ((rla) this).field_z.a((byte) -31, ((rla) this).field_m, var2, 0, 0);
        ((rla) this).field_F = new cca(0, 0, 0, 0, (isa) (Object) new pu(), (ae) (Object) ((rla) this).field_z, (isa) null);
        if (!(var4 == 0)) {
            int discarded$0 = -5412;
            ((rla) this).field_F.a(1, st.b(), true);
        }
        ((rla) this).field_F.a((byte) -31, ((rla) this).field_m, ((rla) this).field_p - ((rla) this).field_C, 0, ((rla) this).field_C);
        ((rla) this).field_G = true;
        ((rla) this).a((ae) (Object) ((rla) this).field_F, -1);
        this.c(43);
    }

    final boolean j(byte param0) {
        int var2 = 56 % ((param0 - 11) / 53);
        return ((rla) this).field_G;
    }

    public static void b() {
        field_x = null;
        field_D = null;
        field_y = null;
    }

    final void a(int param0) {
        if (!(!(((rla) this).field_h instanceof eaa))) {
            ((eaa) (Object) ((rla) this).field_h).a(-3, (rla) this);
        }
        if (param0 != 99) {
            boolean discarded$0 = ((rla) this).b((byte) -17);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        ((rla) this).field_C = param2;
        if (param0 != -31) {
            return;
        }
        this.a(param2, param4, param3, false, param1);
    }

    final int i(byte param0) {
        if (param0 <= 9) {
            return -96;
        }
        return ((rla) this).field_z.field_G;
    }

    final void f(byte param0) {
        int var2 = 1 / ((-38 - param0) / 60);
        ((rla) this).field_B = false;
        super.f((byte) 41);
    }

    final String d(byte param0) {
        int var2 = 70 / ((-58 - param0) / 60);
        if (!((rla) this).field_f) {
            return null;
        }
        if (((rla) this).j((byte) -46)) {
            if (((rla) this).field_F.field_f) {
                if (-1 != ((rla) this).field_z.field_H) {
                    return ((rla) this).field_z.field_I[((rla) this).field_z.field_H].toString();
                }
            }
        }
        if (((rla) this).field_z.d(117) != null) {
            return ((rla) this).field_z.d(121).toString();
        }
        return super.d((byte) 79);
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
                ((rla) this).field_w = null;
                break L1;
              }
            }
            L2: {
              ((rla) this).field_B = true;
              ((rla) this).field_w = "";
              if (((rla) this).field_h == null) {
                break L2;
              } else {
                if (((rla) this).field_h instanceof vfa) {
                  ((vfa) (Object) ((rla) this).field_h).a((ae) this, (byte) -75, ((rla) this).field_B);
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
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("rla.S(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
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
        int stackIn_24_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_61_0 = false;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_23_0 = 0;
        boolean stackOut_60_0 = false;
        int stackOut_58_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!((rla) this).b((byte) -34)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param3) {
                  break L1;
                } else {
                  ((rla) this).a((byte) 94, -22, -43, -18, -59);
                  break L1;
                }
              }
              L2: {
                if (null == ((rla) this).field_z.field_I) {
                  break L2;
                } else {
                  L3: {
                    var5_int = ((rla) this).field_z.field_I.length;
                    if (param2 == 99) {
                      break L3;
                    } else {
                      if (param2 != 98) {
                        L4: {
                          if (105 == param2) {
                            break L4;
                          } else {
                            if (param2 == 104) {
                              break L4;
                            } else {
                              if (param2 == 84) {
                                L5: {
                                  if (((rla) this).field_G) {
                                    this.a((byte) 122);
                                    break L5;
                                  } else {
                                    int discarded$4 = -21088;
                                    this.d();
                                    break L5;
                                  }
                                }
                                stackOut_44_0 = 1;
                                stackIn_45_0 = stackOut_44_0;
                                return stackIn_45_0 != 0;
                              } else {
                                if (param2 == 85) {
                                  var6_int = ((rla) this).field_w.length();
                                  if (var6_int > 0) {
                                    ((rla) this).field_w = ((rla) this).field_w.substring(0, -1 + var6_int);
                                    stackOut_50_0 = 1;
                                    stackIn_51_0 = stackOut_50_0;
                                    return stackIn_51_0 != 0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  if (param0 < 32) {
                                    break L2;
                                  } else {
                                    if (param0 < 128) {
                                      var6 = ((rla) this).field_w + param0;
                                      int discarded$5 = 106;
                                      this.a(var6);
                                      stackOut_55_0 = 1;
                                      stackIn_56_0 = stackOut_55_0;
                                      return stackIn_56_0 != 0;
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
                          if (((rla) this).j((byte) 88)) {
                            break L6;
                          } else {
                            int discarded$6 = -21088;
                            this.d();
                            break L6;
                          }
                        }
                        L7: {
                          var6_int = ((rla) this).field_F.field_A.field_p / ((rla) this).field_z.field_K;
                          if (105 == param2) {
                            ((rla) this).field_z.field_G = ((rla) this).field_z.field_G + var6_int;
                            break L7;
                          } else {
                            ((rla) this).field_z.field_G = ((rla) this).field_z.field_G - var6_int;
                            break L7;
                          }
                        }
                        L8: {
                          if (((rla) this).field_z.field_G >= 0) {
                            break L8;
                          } else {
                            ((rla) this).field_z.field_G = 0;
                            break L8;
                          }
                        }
                        L9: {
                          if (((rla) this).field_z.field_G < var5_int) {
                            break L9;
                          } else {
                            ((rla) this).field_z.field_G = var5_int + -1;
                            break L9;
                          }
                        }
                        this.c(46);
                        stackOut_37_0 = 1;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L10: {
                    if (!((rla) this).j((byte) 101)) {
                      int discarded$7 = -21088;
                      this.d();
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param2 == 99) {
                      ((rla) this).field_z.field_G = ((rla) this).field_z.field_G + 1;
                      break L11;
                    } else {
                      ((rla) this).field_z.field_G = ((rla) this).field_z.field_G - 1;
                      break L11;
                    }
                  }
                  L12: {
                    if (0 > ((rla) this).field_z.field_G) {
                      ((rla) this).field_z.field_G = 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (((rla) this).field_z.field_G >= var5_int) {
                      ((rla) this).field_z.field_G = var5_int + -1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  this.c(84);
                  stackOut_23_0 = 1;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0 != 0;
                }
              }
              if (param2 != 80) {
                stackOut_60_0 = super.a(param0, param1, param2, true);
                stackIn_61_0 = stackOut_60_0;
                break L0;
              } else {
                this.a((byte) 125);
                stackOut_58_0 = 0;
                stackIn_59_0 = stackOut_58_0;
                return stackIn_59_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var5;
            stackOut_62_1 = new StringBuilder().append("rla.P(").append(param0).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L14;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L14;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_61_0;
    }

    private final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param1 = param1.toLowerCase();
              if (param0 >= 116) {
                break L1;
              } else {
                var6 = null;
                int discarded$2 = this.a((byte) 25, (String) null);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= ((rla) this).field_z.field_I.length) {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var4 = ((rla) this).field_z.field_I[var3_int].toString().toLowerCase();
                if (!var4.startsWith(param1)) {
                  var3_int++;
                  continue L2;
                } else {
                  stackOut_6_0 = var3_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("rla.U(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Year";
    }
}
