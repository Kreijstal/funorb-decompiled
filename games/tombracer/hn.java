/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn extends kna {
    static String field_F;
    static String field_G;
    private int field_I;
    private int field_H;
    private int field_J;

    final boolean v(int param0) {
        fsa discarded$0 = null;
        if (param0 != 555277520) {
            la var3 = (la) null;
            discarded$0 = this.a(false, -3, (la) null);
            return true;
        }
        return true;
    }

    abstract boolean C(int param0);

    final boolean z(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            this.field_H = -72;
            return false;
        }
        return false;
    }

    void a(boolean param0, kh param1) {
        g discarded$3 = null;
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (!param0) {
                break L1;
              } else {
                discarded$3 = hn.b(88, -88);
                break L1;
              }
            }
            L2: {
              if (this.D(0)) {
                param1.a((byte) 107, this.field_I, 3);
                if (0 < this.field_I) {
                  param1.a((byte) -128, this.field_H, 2);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (this.C(1)) {
                param1.a((byte) 100, this.field_J, 2);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("hn.V(").append(param0).append(',');
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

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        vd var5 = null;
        fsa var6 = null;
        fsa stackIn_2_0 = null;
        fsa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_3_0 = null;
        fsa stackOut_1_0 = null;
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
            var6 = new fsa(param2, param0);
            if (param1 == 3) {
              var6.b((byte) -11, this.field_k, this.field_l);
              var6.a((byte) -3, 0);
              var6.b((byte) 17, true);
              var5 = new vd(param2, param0);
              var5.b((byte) 105, false);
              var5.a((byte) -128, this.a(param2, false, false));
              var5.a(this.a(5, false, param2), (byte) -94);
              var5.a(this.a(false, param2, (byte) -114), 2);
              var5.b(true, this.A(-1));
              var5.a(false, this.B(123));
              var6.a((byte) 83, (nv) (var5));
              stackOut_3_0 = (fsa) (var6);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (fsa) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("hn.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract fsa a(la param0, boolean param1, boolean param2);

    hn(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!this.D(0)) {
                break L1;
              } else {
                this.field_I = param2.b((byte) 44, 3);
                if ((this.field_I ^ -1) >= -1) {
                  break L1;
                } else {
                  this.field_H = param2.b((byte) 44, 2);
                  break L1;
                }
              }
            }
            L2: {
              if (!this.C(1)) {
                break L2;
              } else {
                this.field_J = param2.b((byte) 44, 2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("hn.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            this.field_I = 109;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        fsa discarded$0 = null;
        if (param0 != 8) {
            la var3 = (la) null;
            discarded$0 = this.a(true, 54, (la) null);
        }
        return 7;
    }

    private final fsa a(boolean param0, la param1, byte param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        ue var6 = null;
        int var7 = 0;
        dg var8 = null;
        fsa var9 = null;
        ue var10 = null;
        ue var11 = null;
        mfa var12 = null;
        fsa stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if ((this.field_I ^ -1) < -1) {
              L1: {
                L2: {
                  var9 = new fsa(param1, param0);
                  var5 = -31 % ((param2 - -48) / 57);
                  var9.b((byte) -11, 2097152, 2097152);
                  var9.b((byte) 17, false);
                  var7 = this.field_H;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    if (var7 != 1) {
                      break L2;
                    } else {
                      if (!TombRacer.field_G) {
                        var11 = new ue(param1, param0);
                        var11.a(0, false);
                        var6 = var11;
                        var9.a((byte) 83, (nv) (var11));
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var10 = new ue(param1, param0);
                var10.a(1, false);
                var6 = var10;
                var9.a((byte) 83, (nv) (var10));
                break L1;
              }
              var12 = rm.field_a;
              var8 = var12.a(var6, var9, -102);
              var9.a(var6, (byte) 124, var8);
              stackOut_9_0 = (fsa) (var9);
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("hn.GC(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    abstract boolean D(int param0);

    final static g b(int param0, int param1) {
        if (param0 != 0) {
            return (g) null;
        }
        return sja.field_i[param1];
    }

    abstract fsa a(int param0, boolean param1, la param2);

    private final int B(int param0) {
        if (param0 <= 92) {
            return 85;
        }
        return 0;
    }

    final static void c(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        jea var7_ref_jea = null;
        int var7 = 0;
        int var8 = 0;
        jea var8_ref_jea = null;
        int var9 = 0;
        tv var9_ref_tv = null;
        int var10 = 0;
        tv var10_ref_tv = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        jea stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        jea stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        jea stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_20_0 = 0;
        Object stackIn_32_0 = null;
        tv stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        tv stackIn_33_1 = null;
        Object stackIn_43_0 = null;
        tv stackIn_43_1 = null;
        int stackIn_58_0 = 0;
        tv stackIn_62_0 = null;
        Object stackIn_80_0 = null;
        int stackIn_81_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        jea stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        jea stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        jea stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_19_0 = 0;
        Object stackOut_31_0 = null;
        tv stackOut_31_1 = null;
        Object stackOut_32_0 = null;
        tv stackOut_32_1 = null;
        Object stackOut_42_0 = null;
        tv stackOut_42_1 = null;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_56_0 = 0;
        tv stackOut_61_0 = null;
        jea stackOut_79_0 = null;
        int stackOut_80_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ob.field_i = bea.field_g;
                        jqa.field_g = bea.field_a;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = fp.field_e;
                        stackIn_4_0 = stackOut_2_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = gt.field_a;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        dga.a(stackIn_4_0, 199);
                        rm.field_e.a(0, 0, param1 + 18, nra.field_c.field_G, -2 + nra.field_c.field_t + -40);
                        cea.field_a.a(lk.field_l.field_G, di.field_a, param1 ^ -23774, 0, 0);
                        stackOut_4_0 = uaa.field_b;
                        stackOut_4_1 = lk.field_l.field_G;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_6_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (!rca.field_p) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (jea) ((Object) stackIn_5_0);
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = 2 + (io.field_a + 40) - -2;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (jea) ((Object) stackIn_6_0);
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((jea) (Object) stackIn_7_0).a(stackIn_7_1 + -stackIn_7_2, 18, -23776, param1 + di.field_a, 0);
                        lda.field_F.a(42 - -io.field_a, 18, param1 + -23778, 2 + di.field_a, -io.field_a + lk.field_l.field_G - 42);
                        tn.field_n.a(lk.field_l.field_G, 2, (byte) 127, 0, io.field_a, lk.field_l.field_t - (di.field_a - -22), 20 + (2 + di.field_a));
                        bc.field_b.a(nra.field_c.field_G, 40, -23776, -40 + nra.field_c.field_t, 0);
                        wf.field_g.a(dka.field_b.field_G, 30, -23776, 0, 0);
                        dba.field_g.a(dka.field_b.field_G, dka.field_b.field_t - 72, -23776, 30, 0);
                        var2_int = 3 + fk.field_b;
                        if ((sg.field_u.length ^ -1) <= -3) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int--;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int--;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = (-5 + (-5 + (dba.field_g.field_t + -10) - -2 - -((var2_int + 1) / 2))) / (1 + var2_int) - 2;
                        if (var3 <= 30) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = 30;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4 = -5 + (dba.field_g.field_t - 5 + -(var2_int * (var3 + 2)));
                        if (var4 > 40) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4 = 40;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        qna.field_b.a(-5 + (dba.field_g.field_G - 5), var4, -23776, 5, 5);
                        var5 = 7 - -var4;
                        var6 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (fk.field_b + 4 <= var6) {
                            statePc = 79;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = var6;
                        stackIn_81_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var13 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 != 1) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (sg.field_u.length < 2) {
                            statePc = 77;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-4 != (var6 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-2 > (ws.field_r ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var13 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param0) {
                            statePc = 38;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var6 != 3) {
                            statePc = 38;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7_ref_jea = rb.field_p[var6];
                        rb.field_p[var6].field_t = 0;
                        var7_ref_jea.field_G = 0;
                        var8 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var8 >= bf.field_b[var6].length) {
                            statePc = 37;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = null;
                        stackOut_31_1 = bf.field_b[var6][var8];
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = stackIn_32_0;
                        stackOut_32_1 = (tv) ((Object) stackIn_32_1);
                        stackIn_43_0 = stackOut_32_0;
                        stackIn_43_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (var13 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 != stackIn_33_1) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9_ref_tv = bf.field_b[var6][var8];
                        bf.field_b[var6][var8].field_t = 0;
                        var9_ref_tv.field_G = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var13 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!param0) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var6 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var7_ref_jea = rb.field_p[var6];
                        rb.field_p[var6].field_t = 0;
                        var7_ref_jea.field_G = 0;
                        var8 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var8 >= bf.field_b[var6].length) {
                            statePc = 47;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = null;
                        stackOut_42_1 = bf.field_b[var6][var8];
                        stackIn_32_0 = stackOut_42_0;
                        stackIn_32_1 = stackOut_42_1;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        if (var13 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 != stackIn_43_1) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9_ref_tv = bf.field_b[var6][var8];
                        bf.field_b[var6][var8].field_t = 0;
                        var9_ref_tv.field_G = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var13 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (param0) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = 0;
                        stackIn_58_0 = stackOut_49_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var6 >= 4) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = 0;
                        stackIn_58_0 = stackOut_51_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (null != vba.field_u) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = 0;
                        stackIn_58_0 = stackOut_53_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (vba.field_u[var6 + -4]) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = 0;
                        stackIn_58_0 = stackOut_55_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = 1;
                        stackIn_58_0 = stackOut_56_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var7 = stackIn_58_0;
                        if (var7 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var8_ref_jea = rb.field_p[var6];
                        rb.field_p[var6].field_t = 0;
                        var8_ref_jea.field_G = 0;
                        var9 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var9 >= bf.field_b[var6].length) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = bf.field_b[var6][var9];
                        stackIn_80_0 = stackOut_61_0;
                        stackIn_62_0 = stackOut_61_0;
                        if (var13 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 != null) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var10_ref_tv = bf.field_b[var6][var9];
                        bf.field_b[var6][var9].field_t = 0;
                        var10_ref_tv.field_G = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var9++;
                        if (var13 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var13 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        rb.field_p[var6].a(103, var3, -23776, var5, 5);
                        var8 = 110;
                        if (param0) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (bf.field_b[var6][0] == null) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var9_ref_tv = bf.field_b[var6][0];
                        bf.field_b[var6][0].field_t = 0;
                        var9_ref_tv.field_G = 0;
                        if (var13 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        bf.field_b[var6][0].a(38, var8, pda.field_c, var3, 0, 2, var5);
                        var8 += 40;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var9 = -5 + dka.field_b.field_G - (var8 + -2);
                        var10 = bf.field_b[var6].length - 1;
                        var11 = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var10 <= var11) {
                            statePc = 76;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var12 = var11 * var9 / var10;
                        bf.field_b[var6][var11 + 1].a(var9 * (1 + var11) / var10 + -2 + -var12, var8 - -var12, pda.field_c, var3, param1 ^ 2, 2, var5);
                        var11++;
                        if (var13 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var5 = var5 + (2 + var3);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var6++;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var13 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        hf.field_a.a(360, -134 + (bea.field_a - 10), -23776, 10, bea.field_g + -360 >> -1367106463);
                        vca.field_e.a(hf.field_a.field_G, 24, -23776, 0, 0);
                        vs.field_R.a(hf.field_a.field_G, -24 + hf.field_a.field_t, -23776, 24, 0);
                        vs.field_R.field_w = hca.c(vs.field_R.field_t, 1, 3, 11579568, param1 ^ -116, 8421504);
                        rra.field_e.a(-10 + vs.field_R.field_G, -24 + vs.field_R.field_t - 12, -23776, 5, 5);
                        stackOut_79_0 = fsa.field_q;
                        stackIn_80_0 = stackOut_79_0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        ((jea) (Object) stackIn_80_0).a(80, 24, -23776, -5 + (vs.field_R.field_t + -24), (-80 + vs.field_R.field_G) / 2);
                        stackOut_80_0 = 0;
                        stackIn_81_0 = stackOut_80_0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        da.a(stackIn_81_0 != 0);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 83: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var2), "hn.CC(" + param0 + ',' + param1 + ')');
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    hn(la param0, int param1) {
        super(param0, param1);
    }

    private final int A(int param0) {
        if (param0 != -1) {
            field_F = (String) null;
        }
        return this.field_I;
    }

    public static void e(boolean param0) {
        field_G = null;
        field_F = null;
        if (param0) {
            hn.c(true, 116);
        }
    }

    static {
        field_G = "These blocks are unstable - they'll crumble into dust if you shoot them.";
        field_F = null;
    }
}
