/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sua extends kna {
    private int field_F;
    static double field_J;
    static vna field_H;
    static int field_L;
    static fta field_G;
    static jea field_K;
    static int field_I;

    public static void B(int param0) {
        if (param0 <= 19) {
          sua.r((byte) 98);
          field_G = null;
          field_K = null;
          field_H = null;
          return;
        } else {
          field_G = null;
          field_K = null;
          field_H = null;
          return;
        }
    }

    final void a(la param0, int param1) {
        try {
            super.a(param0, param1);
            this.field_F = -this.field_F;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sua.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(-113, 2097152, 2097152);
        this.a((byte) 89, new mka[]{new mka(0, 0, 2097152, 0, 8)});
    }

    final static void r(byte param0) {
        goa discarded$4 = null;
        goa discarded$5 = null;
        int var1 = 0;
        L0: {
          if ((ot.field_v ^ -1) <= -225) {
            break L0;
          } else {
            var1 = ot.field_v % 32;
            mp.a(2, -var1 + (ot.field_v + 32));
            if (!TombRacer.field_G) {
              if (param0 != 63) {
                discarded$4 = sua.A(63);
                return;
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        mp.a(2, 256);
        if (param0 == 63) {
          return;
        } else {
          discarded$5 = sua.A(63);
          return;
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_K = (jea) null;
            return true;
        }
        return true;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -38, dqa.a(!param0 ? true : false, this.field_F, 5), 5);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sua.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        spa var5 = null;
        mfa var6 = null;
        nq var7 = null;
        fsa var8 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var8 = new fsa(param2, param0);
            var8.b((byte) -11, this.field_k, this.field_l);
            var8.h(param1, 0);
            var8.a(1, (byte) -12, true);
            var8.a((byte) -3, 6);
            var8.b((byte) 17, false);
            var8.g(param1 ^ 109, 2);
            var8.a((byte) 83, (nv) (new eq(param2, param0)));
            var5 = new spa(param2, param0);
            var5.a((byte) -124, this.field_F * 8);
            var8.a(var5, 0);
            var6 = rm.field_a;
            var7 = (nq) ((Object) var6.a(16, 124));
            var7.b(8022, 2);
            var8.a(var5, (byte) 124, var7);
            stackOut_0_0 = (fsa) (var8);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("sua.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    sua(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        this.field_F = 4;
        try {
            this.field_F = bla.a(true, 5, param2.b((byte) 44, 5));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_H = (vna) null;
            return false;
        }
        return false;
    }

    final static byte[] a(byte[] param0, int param1) {
        goa discarded$2 = null;
        int discarded$3 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        uia var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_22_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_23_0 = null;
        byte[] stackOut_21_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              var9 = new uia(param0);
              var3 = var9.h(255);
              var4 = var9.e(124);
              if (param1 <= -99) {
                break L1;
              } else {
                discarded$2 = sua.A(-108);
                break L1;
              }
            }
            L2: {
              if ((var4 ^ -1) > -1) {
                break L2;
              } else {
                L3: {
                  if (0 == oma.field_H) {
                    break L3;
                  } else {
                    if (oma.field_H >= var4) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (-1 == (var3 ^ -1)) {
                  var13 = new byte[var4];
                  var11 = var13;
                  var5 = var11;
                  var9.a(var13, 0, -86, var4);
                  stackOut_23_0 = (byte[]) (var5);
                  stackIn_24_0 = stackOut_23_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var5_int = var9.e(-127);
                    if (var5_int < 0) {
                      break L4;
                    } else {
                      L5: {
                        if (oma.field_H == 0) {
                          break L5;
                        } else {
                          if (var5_int > oma.field_H) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          var12 = new byte[var5_int];
                          var10 = var12;
                          var6 = var10;
                          if (-2 == (var3 ^ -1)) {
                            break L7;
                          } else {
                            var7 = sma.field_e;
                            synchronized (var7) {
                              L8: {
                                sma.field_e.a((byte) -34, var12, var9);
                                break L8;
                              }
                            }
                            if (!TombRacer.field_G) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        discarded$3 = kr.a(var12, var5_int, param0, var4, 9);
                        break L6;
                      }
                      stackOut_21_0 = (byte[]) (var6);
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("sua.UB(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0;
        } else {
          return stackIn_24_0;
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            la var3 = (la) null;
            this.a((la) null, -35);
            return 7;
        }
        return 7;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return false;
    }

    sua(la param0, int param1) {
        super(param0, param1);
        this.field_F = 4;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return true;
    }

    final static goa A(int param0) {
        String var1 = null;
        var1 = cs.a((byte) -112);
        if (param0 >= 46) {
          if (var1 != null) {
            if (-1 < (var1.indexOf('@') ^ -1)) {
              return new goa(cs.a((byte) 94), npa.a(32));
            } else {
              var1 = "";
              return new goa(cs.a((byte) 94), npa.a(32));
            }
          } else {
            return new goa(cs.a((byte) 94), npa.a(32));
          }
        } else {
          return (goa) null;
        }
    }

    static {
        field_J = 0.0;
        field_H = new vna();
        field_G = new fta();
    }
}
