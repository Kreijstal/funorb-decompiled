/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pt extends wda {
    private int field_o;
    static bb field_p;
    static String field_q;

    final void a(int param0, fsa param1) {
        try {
            if (param0 < 35) {
                ((pt) this).field_o = 28;
            }
            super.a(89, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pt.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
          field_p = null;
          param1 = fs.a((byte) 61, param1, ((pt) this).field_o);
          return param1;
        } else {
          param1 = fs.a((byte) 61, param1, ((pt) this).field_o);
          return param1;
        }
    }

    final void b(int param0) {
        if (param0 == 1) {
            return;
        }
        upa discarded$0 = pt.a(-81, 90, 108, 113);
    }

    final int c(int param0) {
        if (param0 != 1) {
            return -52;
        }
        return 7;
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var3 = 0;
          if ((458752 & param1) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == 0 | mg.a((byte) -53, param2, param1)) {
          if (so.a(param1, (byte) 90, param2)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          return stackIn_6_0 != 0;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        hca var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var2 = 93 / ((-69 - param0) / 42);
        var3 = ((pt) this).field_n.H(-122);
        if (!var3.u(-25561)) {
          var4 = var3.d(3) - ((pt) this).field_n.d(3);
          var5 = var3.e(9648) - ((pt) this).field_n.e(9648);
          var6 = qva.a((byte) -118, var5, var4);
          var7 = -((pt) this).field_n.g(-25787) + var6;
          if (0 >= ((pt) this).field_o) {
            ((pt) this).field_n.c(false, var7);
            return;
          } else {
            L0: while (true) {
              if (var7 >= -4096) {
                L1: while (true) {
                  if (var7 <= 4096) {
                    if (var7 <= ((pt) this).field_o) {
                      if (var7 < -((pt) this).field_o) {
                        var7 = -((pt) this).field_o;
                        ((pt) this).field_n.c(false, var7);
                        return;
                      } else {
                        ((pt) this).field_n.c(false, var7);
                        return;
                      }
                    } else {
                      var7 = ((pt) this).field_o;
                      ((pt) this).field_n.c(false, var7);
                      return;
                    }
                  } else {
                    var7 -= 8192;
                    continue L1;
                  }
                }
              } else {
                var7 += 8192;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
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
            var4 = new byte[param1];
            var3 = var4;
            lua.a(param0, 0, var4, 0, param1);
            stackOut_0_0 = (byte[]) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("pt.M(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + 4096 + 41);
        }
        return stackIn_1_0;
    }

    final void a(int param0, byte param1) {
        if (param1 < 123) {
            Object var4 = null;
            ((pt) this).a(101, (fsa) null);
            ((pt) this).field_o = param0;
            return;
        }
        ((pt) this).field_o = param0;
    }

    final static void b(int param0, byte param1) {
        ub.field_b = sra.field_u[param0];
        hra.field_c = wha.field_K[param0];
        voa.field_s = nl.field_e[param0];
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != 0) {
            field_p = null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    pt(la param0, boolean param1) {
        super(param0, param1);
        try {
            ((pt) this).field_o = 16;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pt.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    pt(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((pt) this).field_o = bla.a(true, 12, param1.b((byte) 44, 12));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pt.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(kh param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) -124);
              param0.a((byte) 37, dqa.a(true, ((pt) this).field_o, 12), 12);
              if (param1 <= -78) {
                break L1;
              } else {
                upa discarded$2 = pt.a(-12, 90, -68, 66);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pt.R(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static upa a(int param0, int param1, int param2, int param3) {
        Object var4 = null;
        upa var4_ref = null;
        int var5 = 0;
        var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 == 22578) {
          var4_ref = (upa) (Object) ina.field_d.f(-80);
          L0: while (true) {
            if (var4_ref != null) {
              if (param3 != var4_ref.field_n) {
                var4_ref = (upa) (Object) ina.field_d.e(param0 + -22454);
                continue L0;
              } else {
                return var4_ref;
              }
            } else {
              var4_ref = new upa();
              var4_ref.field_n = param3;
              var4_ref.field_k = param2;
              ina.field_d.b((byte) -49, (vg) (Object) var4_ref);
              int discarded$2 = 2147;
              ip.a(var4_ref, param1);
              return var4_ref;
            }
          }
        } else {
          field_p = null;
          var4_ref = (upa) (Object) ina.field_d.f(-80);
          L1: while (true) {
            if (var4_ref != null) {
              if (param3 != var4_ref.field_n) {
                var4_ref = (upa) (Object) ina.field_d.e(param0 + -22454);
                continue L1;
              } else {
                return var4_ref;
              }
            } else {
              var4_ref = new upa();
              var4_ref.field_n = param3;
              var4_ref.field_k = param2;
              ina.field_d.b((byte) -49, (vg) (Object) var4_ref);
              int discarded$3 = 2147;
              ip.a(var4_ref, param1);
              return var4_ref;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Hans";
        field_p = null;
    }
}
