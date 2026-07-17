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
        ka[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var6 = new ka[param0.length];
                var3 = var6;
                if (param1 == -8829) {
                  break L1;
                } else {
                  field_f = null;
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                if (var6.length <= var4) {
                  stackOut_9_0 = (ka[]) var3;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var6[var4] = gb.a(param0[var4], param1 + 8957, param2);
                  var4++;
                  continue L2;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("tc.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
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
            throw tba.a((Throwable) (Object) runtimeException, "tc.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(boolean param0, int param1) {
        if (null == qda.field_b) {
          if (hka.field_b == null) {
            if (param1 != 0) {
              L0: {
                field_d = null;
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            } else {
              L1: {
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            }
          } else {
            hka.field_b.a(true, param0);
            if (param1 != 0) {
              L2: {
                field_d = null;
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            } else {
              L3: {
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            }
          }
        } else {
          hia.a(-107, qda.field_b);
          if (hka.field_b != null) {
            hka.field_b.a(true, param0);
            if (param1 == 0) {
              L4: {
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L4;
                } else {
                  break L4;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            } else {
              L5: {
                field_d = null;
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L5;
                } else {
                  break L5;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            }
          } else {
            if (param1 != 0) {
              L6: {
                field_d = null;
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L6;
                } else {
                  break L6;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            } else {
              L7: {
                jl.a((byte) -128, param0);
                if (null != fj.field_c) {
                  fj.field_c.b(param1 + 74, param0);
                  break L7;
                } else {
                  break L7;
                }
              }
              hs.a(param0, (byte) -91);
              return;
            }
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
            throw tba.a((Throwable) (Object) runtimeException, "tc.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
