/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class psa extends l {
    private int field_S;
    private int[] field_Q;
    private boolean field_P;
    private int[] field_T;
    private mp field_R;

    final synchronized void a(int param0, int param1, byte param2, int param3) {
        int var5 = param3 * kta.field_d / 1000;
        if (param2 != -4) {
            return;
        }
        ((psa) this).c(-30515, param1, var5, param0);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = ((psa) this).b((byte) 125);
                ((psa) this).a(((psa) this).field_S * var4_int >> 8, -81);
                super.b(param0, param1, param2);
                if (!((psa) this).field_P) {
                  var5 = 1;
                  var6 = 0;
                  L3: while (true) {
                    if (var6 >= 16) {
                      if (var5 != 0) {
                        ((psa) this).field_P = true;
                        break L2;
                      } else {
                        ((psa) this).a(var4_int, 118);
                        break L1;
                      }
                    } else {
                      L4: {
                        var7 = ((psa) this).field_Q[var6];
                        if (var7 == 0) {
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var6++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              ((psa) this).a(var4_int, 118);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("psa.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(boolean param0, qua param1, byte param2, boolean param3) {
        try {
            this.f(-377538388);
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "psa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    psa(l param0) {
        super(param0);
        ((psa) this).field_Q = new int[16];
        ((psa) this).field_T = new int[16];
        ((psa) this).field_S = 256;
        try {
            this.f(-377538388);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "psa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void c(int param0, int param1, int param2, int param3) {
        ((psa) this).field_P = false;
        if (!(((psa) this).field_R != null)) {
            ((psa) this).field_R = new mp();
        }
        ((psa) this).field_R.field_c[param3] = param1;
        int var5 = ((psa) this).field_T[param3];
        int var6 = (((psa) this).field_R.field_c[param3] << 12) - var5;
        int var7 = 0;
        int var8 = 0;
        if (var6 < 0) {
            var8 = 1;
            var6 = -var6;
        }
        if (var6 > 0) {
            var7 = (var6 + 1) / (1 + param2);
        }
        ((psa) this).field_Q[param3] = var8 == 0 ? var7 : -var7;
        if (param0 != -30515) {
            Object var9 = null;
            ((psa) this).a(true, (qua) null, (byte) -65, false);
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        if (param2 == -1) {
            ((psa) this).field_S = param1;
            return;
        }
        super.a(param0, param1, param2);
        ((psa) this).field_T[param2] = param1 << 12;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; 16 > var2; var2++) {
            ((psa) this).field_T[var2] = 1048576;
        }
        super.a((byte) -105, 256, -1);
    }

    public psa() {
        ((psa) this).field_Q = new int[16];
        ((psa) this).field_T = new int[16];
        ((psa) this).field_S = 256;
        this.f(-377538388);
    }

    static {
    }
}
