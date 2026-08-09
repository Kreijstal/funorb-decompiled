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
        this.c(-30515, param1, var5, param0);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = this.b((byte) 125);
                this.a(this.field_S * var4_int >> -1243146616, -81);
                super.b(param0, param1, param2);
                if (!this.field_P) {
                  var5 = 1;
                  var6 = 0;
                  L3: while (true) {
                    if (var6 >= 16) {
                      if (var5 != 0) {
                        this.field_P = true;
                        break L2;
                      } else {
                        this.a(var4_int, 118);
                        break L1;
                      }
                    } else {
                      var7 = this.field_Q[var6];
                      if (var7 != 0) {
                        L4: {
                          this.field_T[var6] = this.field_T[var6] + var7 * param2;
                          var8 = this.field_R.field_c[var6];
                          if (-1 <= (var7 ^ -1)) {
                            stackIn_10_0 = 0;
                            break L4;
                          } else {
                            stackIn_10_0 = 1;
                            break L4;
                          }
                        }
                        L5: {


                          if (var8 <= this.field_T[var6] >> -745204436) {

                            stackIn_13_1 = 0;
                            break L5;
                          } else {

                            stackIn_13_1 = 1;
                            break L5;
                          }
                        }
                        L6: {
                          if ((stackIn_10_0 ^ stackIn_13_1) == 0) {
                            var5 = 0;
                            break L6;
                          } else {
                            this.field_Q[var6] = 0;
                            this.field_T[var6] = var8 << 320964460;
                            break L6;
                          }
                        }
                        super.a((byte) -105, this.field_T[var6] >> 1908825036, var6);
                        var6++;
                        continue L3;
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              this.a(var4_int, 118);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("psa.D(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(boolean param0, qua param1, byte param2, boolean param3) {
        try {
            this.f(-377538388);
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "psa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    psa(l param0) {
        super(param0);
        this.field_Q = new int[16];
        this.field_T = new int[16];
        this.field_S = 256;
        try {
            this.f(-377538388);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "psa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void c(int param0, int param1, int param2, int param3) {
        this.field_P = false;
        if (!(this.field_R != null)) {
            this.field_R = new mp();
        }
        this.field_R.field_c[param3] = param1;
        int var5 = this.field_T[param3];
        int var6 = (this.field_R.field_c[param3] << -1733763956) - var5;
        int var7 = 0;
        int var8 = 0;
        if (-1 < (var6 ^ -1)) {
            var8 = 1;
            var6 = -var6;
        }
        if (var6 > 0) {
            var7 = (var6 + 1) / (1 + param2);
        }
        this.field_Q[param3] = var8 == 0 ? var7 : -var7;
        if (param0 != -30515) {
            qua var9 = (qua) null;
            this.a(true, (qua) null, (byte) -65, false);
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        if (0 == (param2 ^ -1)) {
            this.field_S = param1;
            return;
        }
        super.a(param0, param1, param2);
        this.field_T[param2] = param1 << -377538388;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != -377538388) {
            this.field_P = true;
        }
        for (var2 = 0; 16 > var2; var2++) {
            this.field_T[var2] = 1048576;
        }
        super.a((byte) -105, 256, -1);
    }

    public psa() {
        this.field_Q = new int[16];
        this.field_T = new int[16];
        this.field_S = 256;
        this.f(-377538388);
    }

    static {
    }
}
