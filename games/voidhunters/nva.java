/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nva extends dqa implements oo {
    private htb field_x;
    private int field_y;
    boolean field_H;
    sha field_G;
    private htb field_A;
    tia field_w;
    static String field_D;
    static String field_I;
    no field_v;
    private int field_B;
    String field_E;
    private boolean field_z;

    final boolean h(int param0) {
        if (param0 != 0) {
            return true;
        }
        return ((nva) this).field_H;
    }

    private final void a(byte param0, String param1) {
        if (null == ((nva) this).field_w.field_L) {
            return;
        }
        int var3_int = this.a(param1.toLowerCase(), -68);
        if (!(var3_int != -1)) {
            return;
        }
        try {
            ((nva) this).field_w.field_H = var3_int;
            this.e(125);
            ((nva) this).field_E = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nva.P(" + 40 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        super.a(param3, param0, param4, 1, param1);
        ((nva) this).field_A.a(0, -20 + param0, ((nva) this).field_B, 1, 0);
        ((nva) this).field_x.a(-20 + param0, 20, ((nva) this).field_B, 1, 0);
        if (!(!((nva) this).field_H)) {
            ((nva) this).field_G.a(0, param0, -((nva) this).field_B + param4, 1, ((nva) this).field_B);
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          if (!((nva) this).h(0)) {
            break L0;
          } else {
            if (((nva) this).field_w.field_H == -1) {
              break L0;
            } else {
              if (null == ((nva) this).field_w.field_L) {
                break L0;
              } else {
                if (null != ((nva) this).field_G.field_B) {
                  var2 = ((nva) this).field_G.field_y.field_f;
                  var3 = ((nva) this).field_w.field_I;
                  var4 = -var2 + ((nva) this).field_w.field_f;
                  if (var4 <= 0) {
                    return;
                  } else {
                    L1: {
                      var5 = -93 / ((72 - param0) / 35);
                      var6 = var3 * ((nva) this).field_w.field_H;
                      var7 = var6 + ((nva) this).field_G.field_y.field_t.field_r;
                      var8 = var2 >> 2;
                      if (var7 >= var8) {
                        break L1;
                      } else {
                        L2: {
                          var9 = -(var8 + -var6 << 16) / var4;
                          if (var9 < 0) {
                            var9 = 0;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        ((nva) this).field_G.field_B.field_L = var9;
                        break L1;
                      }
                    }
                    L3: {
                      var8 = -var3 + (3 * var2 >> 2);
                      if (var8 < var7) {
                        L4: {
                          var9 = -(-var6 + var8 << 16) / var4;
                          if (var9 > 65536) {
                            var9 = 65536;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ((nva) this).field_G.field_B.field_L = var9;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
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
        int var2 = ((nva) this).field_w.e(4);
        int var3 = var2;
        int var4 = 0;
        if (((nva) this).field_y < var3) {
            var3 = ((nva) this).field_y;
            var4 = 1;
        }
        this.b(((nva) this).field_h, ((nva) this).field_r, -20, ((nva) this).field_g, ((nva) this).field_B - -var3);
        ((nva) this).field_w.a(0, ((nva) this).field_h, var2, 1, 0);
        ((nva) this).field_G = new sha(0, 0, 0, 0, (wwa) (Object) new nrb(), (shb) (Object) ((nva) this).field_w, (wwa) null);
        if (var4 != 0) {
            int discarded$0 = 0;
            ((nva) this).field_G.a(true, qe.a(), (byte) -99);
        }
        ((nva) this).field_G.a(0, ((nva) this).field_h, ((nva) this).field_f - ((nva) this).field_B, 1, ((nva) this).field_B);
        ((nva) this).field_H = true;
        ((nva) this).b(-18756, (shb) (Object) ((nva) this).field_G);
        this.e(121);
    }

    final void i(int param0) {
        if (param0 != 21694) {
            ((nva) this).field_H = false;
        }
        if (((nva) this).field_l instanceof aca) {
            ((aca) (Object) ((nva) this).field_l).a(-3, (nva) this);
        }
    }

    nva(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (wwa) null);
        ((nva) this).field_E = "";
        ((nva) this).field_v = loa.field_o;
        try {
            ((nva) this).field_w = new tia((nva) this, ((nva) this).field_v, param0, param1);
            ((nva) this).field_y = param2;
            ((nva) this).field_w.field_l = (sba) this;
            ((nva) this).field_H = false;
            ((nva) this).field_A = new htb("", (wwa) (Object) new bpa((nva) this), (sba) this);
            ((nva) this).field_x = new htb();
            ((nva) this).field_x.field_q = (wwa) (Object) new pbb();
            ((nva) this).field_x.field_l = (sba) this;
            ((nva) this).b(-18756, (shb) (Object) ((nva) this).field_A);
            ((nva) this).b(-18756, (shb) (Object) ((nva) this).field_x);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nva.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
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
            if (param0 == 11) {
              L1: {
                if (!((nva) this).h(0)) {
                  int discarded$5 = 20589;
                  this.d();
                  break L1;
                } else {
                  int discarded$6 = 5647;
                  this.g();
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("nva.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param4 + 41);
        }
    }

    public static void f() {
        field_D = null;
        field_I = null;
    }

    final boolean e(byte param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -120) {
            break L0;
          } else {
            var3 = null;
            boolean discarded$2 = ((nva) this).a(27, 77, (shb) null, 'ￔ');
            break L0;
          }
        }
        L1: {
          L2: {
            if (((nva) this).field_z) {
              break L2;
            } else {
              if (!super.e((byte) -120)) {
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

    private final void g() {
        if (!((nva) this).h(0)) {
            return;
        }
        this.b(((nva) this).field_h, ((nva) this).field_r, -20, ((nva) this).field_g, ((nva) this).field_B);
        ((nva) this).field_H = false;
        ((nva) this).field_G.b(-3846);
    }

    final void f(byte param0) {
        ((nva) this).field_z = false;
        super.f(param0);
    }

    final boolean a(int param0, shb param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              param1.f((byte) -34);
              if (param0 == 0) {
                break L1;
              } else {
                boolean discarded$2 = ((nva) this).a(-101, -112, (shb) null, '￭');
                break L1;
              }
            }
            L2: {
              ((nva) this).field_z = true;
              ((nva) this).field_E = "";
              if (null == ((nva) this).field_l) {
                break L2;
              } else {
                if (!(((nva) this).field_l instanceof dta)) {
                  break L2;
                } else {
                  ((dta) (Object) ((nva) this).field_l).a(((nva) this).field_z, (shb) this, true);
                  break L2;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("nva.A(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, int param1, int param2, shb param3) {
        try {
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nva.B(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final String d(byte param0) {
        if (!((nva) this).field_e) {
            return null;
        }
        if (((nva) this).h(0)) {
            if (((nva) this).field_G.field_e) {
                if (((nva) this).field_w.field_D != -1) {
                    return ((nva) this).field_w.field_L[((nva) this).field_w.field_D].toString();
                }
            }
        }
        if (!(null == ((nva) this).field_w.g((byte) 96))) {
            return ((nva) this).field_w.g((byte) 96).toString();
        }
        if (param0 != 125) {
            Object var3 = null;
            int discarded$0 = this.a((String) null, -80);
        }
        return super.d((byte) 125);
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param6 < -17) {
                break L1;
              } else {
                ((nva) this).field_v = null;
                break L1;
              }
            }
            stackOut_2_0 = super.a(param0, param1, param2, param3, param4, param5, (byte) -93);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("nva.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0;
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_23_0 = 0;
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
        int stackOut_44_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_22_0 = 0;
        boolean stackOut_60_0 = false;
        int stackOut_58_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (((nva) this).e((byte) -120)) {
              if (param0 == -15834) {
                L1: {
                  if (null == ((nva) this).field_w.field_L) {
                    break L1;
                  } else {
                    L2: {
                      var5_int = ((nva) this).field_w.field_L.length;
                      if (param1 == 99) {
                        break L2;
                      } else {
                        if (param1 == 98) {
                          break L2;
                        } else {
                          L3: {
                            if (param1 == 105) {
                              break L3;
                            } else {
                              if (param1 != 104) {
                                if (84 == param1) {
                                  L4: {
                                    if (((nva) this).field_H) {
                                      int discarded$5 = 5647;
                                      this.g();
                                      break L4;
                                    } else {
                                      int discarded$6 = 20589;
                                      this.d();
                                      break L4;
                                    }
                                  }
                                  stackOut_44_0 = 1;
                                  stackIn_45_0 = stackOut_44_0;
                                  return stackIn_45_0 != 0;
                                } else {
                                  if (85 == param1) {
                                    var6_int = ((nva) this).field_E.length();
                                    if (var6_int > 0) {
                                      ((nva) this).field_E = ((nva) this).field_E.substring(0, -1 + var6_int);
                                      stackOut_50_0 = 1;
                                      stackIn_51_0 = stackOut_50_0;
                                      return stackIn_51_0 != 0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    if (param3 < 32) {
                                      break L1;
                                    } else {
                                      if (param3 < 128) {
                                        var6 = ((nva) this).field_E + param3;
                                        this.a((byte) 40, var6);
                                        stackOut_55_0 = 1;
                                        stackIn_56_0 = stackOut_55_0;
                                        return stackIn_56_0 != 0;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          L5: {
                            if (((nva) this).h(0)) {
                              break L5;
                            } else {
                              int discarded$7 = 20589;
                              this.d();
                              break L5;
                            }
                          }
                          L6: {
                            var6_int = ((nva) this).field_G.field_y.field_f / ((nva) this).field_w.field_I;
                            if (param1 == 105) {
                              ((nva) this).field_w.field_H = ((nva) this).field_w.field_H + var6_int;
                              break L6;
                            } else {
                              ((nva) this).field_w.field_H = ((nva) this).field_w.field_H - var6_int;
                              break L6;
                            }
                          }
                          L7: {
                            if (0 <= ((nva) this).field_w.field_H) {
                              break L7;
                            } else {
                              ((nva) this).field_w.field_H = 0;
                              break L7;
                            }
                          }
                          L8: {
                            if (((nva) this).field_w.field_H >= var5_int) {
                              ((nva) this).field_w.field_H = -1 + var5_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          this.e(120);
                          stackOut_37_0 = 1;
                          stackIn_38_0 = stackOut_37_0;
                          return stackIn_38_0 != 0;
                        }
                      }
                    }
                    L9: {
                      if (((nva) this).h(0)) {
                        break L9;
                      } else {
                        int discarded$8 = 20589;
                        this.d();
                        break L9;
                      }
                    }
                    L10: {
                      if (param1 == 99) {
                        ((nva) this).field_w.field_H = ((nva) this).field_w.field_H + 1;
                        break L10;
                      } else {
                        ((nva) this).field_w.field_H = ((nva) this).field_w.field_H - 1;
                        break L10;
                      }
                    }
                    L11: {
                      if (((nva) this).field_w.field_H < 0) {
                        ((nva) this).field_w.field_H = 0;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (var5_int <= ((nva) this).field_w.field_H) {
                        ((nva) this).field_w.field_H = -1 + var5_int;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    this.e(115);
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  }
                }
                if (80 != param1) {
                  stackOut_60_0 = super.a(-15834, param1, param2, param3);
                  stackIn_61_0 = stackOut_60_0;
                  break L0;
                } else {
                  int discarded$9 = 5647;
                  this.g();
                  stackOut_58_0 = 0;
                  stackIn_59_0 = stackOut_58_0;
                  return stackIn_59_0 != 0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var5;
            stackOut_62_1 = new StringBuilder().append("nva.N(").append(param0).append(44).append(param1).append(44);
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param2 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L13;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L13;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + param3 + 41);
        }
        return stackIn_61_0;
    }

    private final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = -55 / ((45 - param1) / 53);
            param0 = param0.toLowerCase();
            var4 = 0;
            L1: while (true) {
              if (((nva) this).field_w.field_L.length <= var4) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var5 = ((nva) this).field_w.field_L[var4].toString().toLowerCase();
                if (var5.startsWith(param0)) {
                  stackOut_5_0 = var4;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("nva.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((nva) this).field_B = param2;
        if (param3 != 1) {
            ((nva) this).field_B = 17;
        }
        this.b(param1, param4, -20, param0, param2);
    }

    final int a(int param0) {
        if (param0 != 0) {
            ((nva) this).field_y = 67;
        }
        return ((nva) this).field_w.field_H;
    }

    final static String a(char param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        fda.field_o = param2;
        mb.field_j = param0;
        eqa.field_o = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_I = "Activate to confuse nearby missiles";
    }
}
