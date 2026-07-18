/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tc extends lu {
    private String field_e;
    private long field_g;
    static af field_d;
    static String field_f;

    final static ka[] a(oc[] param0, int param1, ha param2) {
        ka[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ka[] var6 = null;
        ka[] stackIn_8_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        ka[] stackOut_7_0 = null;
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var6 = new ka[param0.length];
              var3 = var6;
              var4 = 0;
              L1: while (true) {
                if (var6.length <= var4) {
                  stackOut_7_0 = (ka[]) var3;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var6[var4] = gb.a(param0[var4], 128, param2);
                  var4++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("tc.G(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(-8829).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    public static void b(int param0) {
        field_d = null;
        field_f = null;
    }

    final void a(uia param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            param0.a(1736565456, ((tc) this).field_g);
            param0.a(((tc) this).field_e, -124);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (null == qda.field_b) {
          if (hka.field_b != null) {
            L0: {
              hka.field_b.a(true, param0);
              field_d = null;
              jl.a((byte) -128, param0);
              if (null != fj.field_c) {
                fj.field_c.b(74, param0);
                break L0;
              } else {
                break L0;
              }
            }
            hs.a(param0, (byte) -91);
            return;
          } else {
            L1: {
              field_d = null;
              jl.a((byte) -128, param0);
              if (null != fj.field_c) {
                fj.field_c.b(74, param0);
                break L1;
              } else {
                break L1;
              }
            }
            hs.a(param0, (byte) -91);
            return;
          }
        } else {
          hia.a(-107, qda.field_b);
          if (hka.field_b == null) {
            L2: {
              field_d = null;
              jl.a((byte) -128, param0);
              if (null != fj.field_c) {
                fj.field_c.b(74, param0);
                break L2;
              } else {
                break L2;
              }
            }
            hs.a(param0, (byte) -91);
            return;
          } else {
            L3: {
              hka.field_b.a(true, param0);
              field_d = null;
              jl.a((byte) -128, param0);
              if (null != fj.field_c) {
                fj.field_c.b(74, param0);
                break L3;
              } else {
                break L3;
              }
            }
            hs.a(param0, (byte) -91);
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        int discarded$0 = rl.r(-93);
    }

    tc(long param0, String param1) {
        try {
            ((tc) this).field_e = param1;
            ((tc) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    pl a(byte param0) {
        if (param0 != 113) {
            return null;
        }
        return vm.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create a free account to store achievements, submit your best times and play online against friends! Without signing in, no progress will be saved!";
    }
}
