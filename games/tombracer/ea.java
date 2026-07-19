/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends vg implements bo {
    static String[] field_k;
    static int field_j;
    private int[] field_g;
    private int field_h;
    private int field_f;
    private int field_m;
    static oc[] field_l;
    static ur field_i;

    final static void a(int param0) {
        pva discarded$3 = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        cka var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            cq.field_a.a(108);
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var1_int ^ -1) <= -33) {
                    break L3;
                  } else {
                    eia.field_r[var1_int] = 0L;
                    var1_int++;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == -33) {
                  break L2;
                } else {
                  var3 = (cka) null;
                  discarded$3 = ea.a(70, -25, (String) null, (cka) null);
                  break L2;
                }
              }
              var1_int = 0;
              L4: while (true) {
                L5: {
                  if (var1_int >= 32) {
                    mt.field_a = 0;
                    break L5;
                  } else {
                    bv.field_xb[var1_int] = 0L;
                    var1_int++;
                    if (var2 != 0) {
                      break L5;
                    } else {
                      continue L4;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "ea.C(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param0 != -2767) {
            return;
        }
        this.field_f = param1;
    }

    final void a(int param0, byte param1) {
        if (param1 != -113) {
            return;
        }
        this.field_m = param0;
    }

    public static void b(int param0) {
        field_i = null;
        if (param0 != 0) {
            field_j = -23;
            field_k = null;
            field_l = null;
            return;
        }
        field_k = null;
        field_l = null;
    }

    final void b(int param0, int param1) {
        if (param0 != 8469) {
            this.a(-55, 80);
            this.field_h = param1;
            return;
        }
        this.field_h = param1;
    }

    public final void a(int param0, kh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param1.i(param0 + -192);
            param1.a((byte) 90, this.field_m, 5);
            param1.a((byte) -128, this.field_f, 8);
            param1.a((byte) 30, this.field_h, 8);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_g.length <= var3_int) {
                    break L3;
                  } else {
                    param1.a((byte) 3, uja.a(-113, this.field_g[var3_int]), 7);
                    var3_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 != 200) {
                  ea.b(-52);
                  param1.k(-1826190686);
                  break L2;
                } else {
                  param1.k(-1826190686);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("ea.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final static void a(byte param0, int param1, uia param2, int param3, int param4) {
        try {
            param2.i(12, 0);
            param2.f(-1477662136, 17);
            param2.f(-1477662136, param3);
            param2.f(-1477662136, param4);
            int var5_int = 33 % ((-57 - param0) / 48);
            param2.i(param1, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ea.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final String toString() {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var1 = "C2SActionPacket hash:" + this.field_f + " round:" + this.field_m;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_g.length <= var2) {
                break L2;
              } else {
                stackOut_2_0 = var1 + " " + this.field_g[var2];
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  var1 = stackIn_3_0;
                  var2++;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_4_0 = (String) (var1);
            stackIn_5_0 = stackOut_4_0;
            break L1;
          }
          return stackIn_5_0;
        }
    }

    final static void a(boolean param0, int param1) {
        ada var2 = null;
        if (param1 == -16838) {
          era.field_e.b(param1 ^ -16792, param0);
          var2 = apa.field_c;
          if (var2 != null) {
            var2.b(-31, era.field_e.field_A, era.field_e.field_q);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static pva a(int param0, int param1, String param2, cka param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pva stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        pva stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        pva stackOut_7_0 = null;
        pva stackOut_1_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param0 == 17) {
              var4_int = jaggl.OpenGL.glGenProgramARB();
              jaggl.OpenGL.glBindProgramARB(param1, var4_int);
              jaggl.OpenGL.glProgramStringARB(param1, 34933, param2);
              jaggl.OpenGL.glGetIntegerv(34379, vf.field_b, 0);
              if (-1 != vf.field_b[0]) {
                jaggl.OpenGL.glBindProgramARB(param1, 0);
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                jaggl.OpenGL.glBindProgramARB(param1, 0);
                stackOut_7_0 = new pva(param3, param1, var4_int);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = (pva) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("ea.H(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          L2: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (pva) ((Object) stackIn_6_0);
          } else {
            return stackIn_8_0;
          }
        }
    }

    public final void a(kh param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param0.h((byte) 119);
            this.field_m = param0.b((byte) 44, 5);
            this.field_f = param0.b((byte) 44, 8);
            this.field_h = param0.b((byte) 44, 8);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_g.length <= var3_int) {
                    break L3;
                  } else {
                    this.field_g[var3_int] = vp.a(param0.b((byte) 44, 7), -6487);
                    var3_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 != -19) {
                  field_l = (oc[]) null;
                  param0.i((byte) 98);
                  break L2;
                } else {
                  param0.i((byte) 98);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("ea.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_g[param1] = param2;
        if (param0 != 17) {
            kh var5 = (kh) null;
            this.a((kh) null, (byte) 24);
        }
    }

    ea() {
        this.field_g = new int[8];
    }

    static {
        field_j = -1;
        field_i = new ur(5);
    }
}
