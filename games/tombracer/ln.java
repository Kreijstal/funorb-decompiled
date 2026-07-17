/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends kna {
    private int field_G;
    static ica field_F;
    static long field_H;

    public static void B(int param0) {
        field_F = null;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -128, ((ln) this).field_G, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ln.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return false;
        }
        return false;
    }

    final static void a(vg param0, vg param1, byte param2) {
        try {
            if (null != param1.field_e) {
                param1.p(63);
            }
            param1.field_e = param0.field_e;
            int var3_int = -97 % ((-39 - param2) / 63);
            param1.field_a = param0;
            param1.field_e.field_a = param1;
            param1.field_a.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ln.VB(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void A(int param0) {
        ij.j((byte) -116);
        int var1 = -6 / ((-10 - param0) / 45);
    }

    final static mg b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = param0;
        if (var2 != 0) {
          if (1 == var2) {
            return new mg(new int[2]);
          } else {
            if (var2 != 2) {
              if (3 != var2) {
                if (var2 != 4) {
                  if (var2 == 5) {
                    return new mg(new int[6]);
                  } else {
                    if (var2 != 6) {
                      if (var2 == 7) {
                        return new mg(new int[12]);
                      } else {
                        if (var2 == 8) {
                          return new mg(new int[12]);
                        } else {
                          return new mg(new int[0]);
                        }
                      }
                    } else {
                      return new mg(new int[6]);
                    }
                  }
                } else {
                  return new mg(new int[4]);
                }
              } else {
                return new mg(new int[2]);
              }
            } else {
              return new mg(new int[2]);
            }
          }
        } else {
          return new mg(new int[0]);
        }
    }

    ln(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        try {
            ((ln) this).field_G = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ln.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    ln(la param0, int param1) {
        super(param0, param1);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return false;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_F = null;
            return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        lpa var5 = null;
        mfa var6 = null;
        ce var7 = null;
        fsa stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_4_0 = null;
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
              var4 = new fsa(param2, param0);
              var4.b((byte) -11, ((ln) this).field_k, ((ln) this).field_l);
              var5 = new lpa(param2, false);
              var5.b(-5, ((ln) this).field_G);
              var4.a((byte) 83, (nv) (Object) var5);
              var6 = rm.field_a;
              if (param1 == 3) {
                break L1;
              } else {
                int discarded$2 = ((ln) this).t(49);
                break L1;
              }
            }
            L2: {
              if (60 == ((ln) this).field_m) {
                break L2;
              } else {
                var7 = (ce) (Object) var6.a(17, param1 ^ 93);
                var7.b(2, (byte) 23);
                var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
                break L2;
              }
            }
            stackOut_4_0 = (fsa) var4;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref;
            stackOut_6_1 = new StringBuilder().append("ln.AC(").append(param0).append(44).append(param1).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
            boolean discarded$0 = ((ln) this).z(45);
            return 3;
        }
        return 3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new ica();
    }
}
