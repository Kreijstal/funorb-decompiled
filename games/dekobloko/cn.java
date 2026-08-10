/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends kf implements fi, vn {
    static int field_U;
    static String field_ab;
    private og field_Y;
    static String field_T;
    private ek field_S;
    static w field_X;
    static String field_V;
    private ek field_Z;
    df field_W;

    final static boolean f(byte param0) {
        if (param0 < 69) {
            return false;
        }
        return ph.field_Ab;
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(-85, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 != param1) {
                if (param1 == 99) {
                  stackIn_10_0 = this.a(32, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5_int = -60 / ((-22 - param0) / 49);
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a(param2, (byte) -113);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("cn.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    public final void a(int param0) {
        ((jm) ((Object) this.field_Y.a(-105))).a(true);
        if (param0 != 25) {
            ce var3 = (ce) null;
            this.a(79, 36, (ce) null, 'ﾻ');
        }
    }

    private final int a(int param0, String param1, ce param2, String param3, boolean param4, int param5, int param6) {
        RuntimeException var8 = null;
        pa var9 = null;
        de var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new de(20, param5, 120 + param6, 25, param2, param4, 120, 3, hh.field_e, 16777215, param3);
            this.b(var10, (byte) -55);
            var9 = new pa(((jl) ((Object) param2)).a(-126), param1, 126, param5 - -var10.field_y, param6 - -25, param0);
            var9.field_v = (kg) (this);
            this.b(var9, (byte) -55);
            stackIn_1_0 = var9.field_y + var10.field_y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("cn.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(String param0, int param1) {
        og var3 = null;
        String var4 = null;
        try {
            var3 = this.field_Y;
            var4 = param0;
            if (param1 != -28464) {
                field_ab = (String) null;
            }
            ((rk) ((Object) var3)).a(var4, (byte) 114, false);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "cn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int b(boolean param0) {
        ji stackIn_28_0 = null;
        ji stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        ji stackIn_51_0 = null;
        ji stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        if ((ca.field_vb ^ -1) > -3) {
          return 0;
        } else {
          if (kd.field_p == 0) {
            if (!sk.field_f.a((byte) 121)) {
              return 20;
            } else {
              if (!sk.field_f.a("commonui", (byte) -33)) {
                return 40;
              } else {
                if (rc.field_k.a((byte) 121)) {
                  if (!rc.field_k.a("commonui", (byte) 57)) {
                    return 60;
                  } else {
                    if (ph.field_Fb.a((byte) 121)) {
                      if (ph.field_Fb.a(false)) {
                        if (!param0) {
                          return -41;
                        } else {
                          return 100;
                        }
                      } else {
                        return 80;
                      }
                    } else {
                      return 70;
                    }
                  }
                } else {
                  return 50;
                }
              }
            }
          } else {
            if (null == vj.field_a) {
              if (sk.field_f.a((byte) 121)) {
                if (!sk.field_f.a("commonui", (byte) -114)) {
                  return 57;
                } else {
                  if (!rc.field_k.a((byte) 121)) {
                    return 71;
                  } else {
                    if (!rc.field_k.a("commonui", (byte) -125)) {
                      return 80;
                    } else {
                      if (!ph.field_Fb.a((byte) 121)) {
                        return 82;
                      } else {
                        L0: {
                          stackIn_51_0 = ph.field_Fb;

                          if (param0) {
                            stackIn_52_0 = (ji) ((Object) stackIn_51_0);
                            stackIn_52_1 = 0;
                            break L0;
                          } else {
                            stackIn_52_0 = (ji) ((Object) stackIn_51_0);
                            stackIn_52_1 = 1;
                            break L0;
                          }
                        }
                        if (((ji) (Object) stackIn_52_0).a(stackIn_52_1 != 0)) {
                          if (!param0) {
                            return -41;
                          } else {
                            return 100;
                          }
                        } else {
                          return 86;
                        }
                      }
                    }
                  }
                }
              } else {
                return 43;
              }
            } else {
              if (vj.field_a.a((byte) 121)) {
                if (!vj.field_a.a("", 0)) {
                  return 29;
                } else {
                  if (vj.field_a.a("", (byte) 63)) {
                    if (sk.field_f.a((byte) 121)) {
                      if (!sk.field_f.a("commonui", (byte) -114)) {
                        return 57;
                      } else {
                        if (!rc.field_k.a((byte) 121)) {
                          return 71;
                        } else {
                          if (!rc.field_k.a("commonui", (byte) -125)) {
                            return 80;
                          } else {
                            if (!ph.field_Fb.a((byte) 121)) {
                              return 82;
                            } else {
                              L1: {
                                stackIn_28_0 = ph.field_Fb;

                                if (param0) {
                                  stackIn_29_0 = (ji) ((Object) stackIn_28_0);
                                  stackIn_29_1 = 0;
                                  break L1;
                                } else {
                                  stackIn_29_0 = (ji) ((Object) stackIn_28_0);
                                  stackIn_29_1 = 1;
                                  break L1;
                                }
                              }
                              if (((ji) (Object) stackIn_29_0).a(stackIn_29_1 != 0)) {
                                if (!param0) {
                                  return -41;
                                } else {
                                  return 100;
                                }
                              } else {
                                return 86;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      return 43;
                    }
                  } else {
                    return 29;
                  }
                }
              } else {
                return 14;
              }
            }
          }
        }
    }

    private final int a(int param0, int param1, int param2, String param3, ce param4, String param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7_int = -109 % ((param2 - 16) / 54);
            stackIn_1_0 = this.a(35, param3, param4, param5, false, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("cn.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        RuntimeException var6 = null;
        ek var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 67) {
              break L0;
            } else {
              var7 = (ek) null;
              this.a((byte) 103, -75, (ek) null, 25, 38);
              break L0;
            }
          }
          if (this.field_S == param2) {
            vb.g((byte) 105);
            return;
          } else {
            if (this.field_Z == param2) {
              this.i(-14356);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("cn.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean a(jl param0, byte param1) {
        nb var3 = null;
        RuntimeException var3_ref = null;
        tb var4 = null;
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
            var3 = param0.a(-120);
            if (var3 != null) {
              L1: {
                if (param1 <= -28) {
                  break L1;
                } else {
                  cn.j(8);
                  break L1;
                }
              }
              L2: {
                var4 = var3.a(20350);
                if (var4 != dc.field_b) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
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
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("cn.L(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (hc.field_d != 11) {
                break L1;
              } else {
                bb.a((byte) -22);
                break L1;
              }
            }
            rf.a(12, tf.field_bb, cg.field_d, he.field_hb);
            mf.a(1, 0, 0, param1);
            if (param0) {
              break L0;
            } else {
              cn.b(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("cn.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public static void j(int param0) {
        field_T = null;
        if (param0 != 3) {
          field_V = (String) null;
          field_ab = null;
          field_X = null;
          field_V = null;
          return;
        } else {
          field_ab = null;
          field_X = null;
          field_V = null;
          return;
        }
    }

    final void a(ce param0, int param1, int param2, int param3) {
        try {
            if (param1 <= 38) {
                cn.f((byte) 40);
            }
            super.a(param0, 45, param2, param3);
            this.field_Z.field_I = this.g((byte) -29);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "cn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public cn() {
        super(0, 0, 496, 0, (gl) null);
        this.field_Y = new og("", (kg) null, 12);
        a var1 = new a(bj.field_f, 0, 0, 0, 0, 16777215, -1, 3, 0, hh.field_e.field_R, -1, 2147483647, true);
        ce var2 = new ce(field_V, var1, (kg) null);
        this.field_Z = new ek(gm.field_J, (kg) null);
        this.field_S = new ek(fc.field_g, (kg) null);
        this.field_Y.field_B = ea.field_C;
        this.field_Y.a(new jm(this.field_Y), -5362);
        this.field_Z.field_I = false;
        this.field_Z.field_p = (gl) ((Object) new fk());
        this.field_S.field_p = (gl) ((Object) new on());
        this.field_Y.field_p = (gl) ((Object) new di(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.b(50, 270, 20, var3, -16555);
        int var5 = 200;
        var3 += 50;
        this.b(var2, (byte) -55);
        var3 = var3 + (5 + this.a(var3, 170, -107, rg.field_e, this.field_Y, ij.field_b));
        this.field_Z.b(40, var5, -var5 + 496 >> 728917057, var3, -16555);
        this.field_S.b(40, 60, 3 + var4, var3 + 15, -16555);
        this.field_S.field_v = (kg) (this);
        this.field_Z.field_v = (kg) (this);
        this.b(this.field_Z, (byte) -55);
        this.b(this.field_S, (byte) -55);
        this.field_W = new df((fi) (this));
        this.field_W.b(150, -60 + -this.field_Y.field_t + this.field_t + -this.field_Y.field_u, 60 + (this.field_Y.field_t + this.field_Y.field_u), 20, -16555);
        this.b(this.field_W, (byte) -55);
        this.b(var4 + (var3 - -55), 496, 0, 0, -16555);
    }

    private final void i(int param0) {
        if (!(this.g((byte) -29))) {
            return;
        }
        gb.a(param0 + 14253, this.field_Y.field_E);
        if (param0 != -14356) {
            field_U = -2;
        }
    }

    private final boolean g(byte param0) {
        if (!(this.a((jl) (this.field_Y), (byte) -116))) {
            return false;
        }
        if (param0 != -29) {
            return false;
        }
        return true;
    }

    static {
        field_T = "YOU WIN!";
        field_V = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_ab = "Remove <%0> from friend list";
    }
}
