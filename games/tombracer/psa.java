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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
                    L4: {
                      if (var6 >= 16) {
                        stackOut_19_0 = var5;
                        stackIn_20_0 = stackOut_19_0;
                        break L4;
                      } else {
                        var7 = this.field_Q[var6];
                        stackOut_5_0 = var7;
                        stackIn_20_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var9 != 0) {
                          break L4;
                        } else {
                          L5: {
                            if (stackIn_6_0 == 0) {
                              break L5;
                            } else {
                              L6: {
                                this.field_T[var6] = this.field_T[var6] + var7 * param2;
                                var8 = this.field_R.field_c[var6];
                                if (-1 <= (var7 ^ -1)) {
                                  stackOut_9_0 = 0;
                                  stackIn_10_0 = stackOut_9_0;
                                  break L6;
                                } else {
                                  stackOut_8_0 = 1;
                                  stackIn_10_0 = stackOut_8_0;
                                  break L6;
                                }
                              }
                              L7: {
                                stackOut_10_0 = stackIn_10_0;
                                stackIn_12_0 = stackOut_10_0;
                                stackIn_11_0 = stackOut_10_0;
                                if (var8 <= this.field_T[var6] >> -745204436) {
                                  stackOut_12_0 = stackIn_12_0;
                                  stackOut_12_1 = 0;
                                  stackIn_13_0 = stackOut_12_0;
                                  stackIn_13_1 = stackOut_12_1;
                                  break L7;
                                } else {
                                  stackOut_11_0 = stackIn_11_0;
                                  stackOut_11_1 = 1;
                                  stackIn_13_0 = stackOut_11_0;
                                  stackIn_13_1 = stackOut_11_1;
                                  break L7;
                                }
                              }
                              L8: {
                                L9: {
                                  if ((stackIn_13_0 ^ stackIn_13_1) == 0) {
                                    break L9;
                                  } else {
                                    this.field_Q[var6] = 0;
                                    this.field_T[var6] = var8 << 320964460;
                                    if (var9 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var5 = 0;
                                break L8;
                              }
                              super.a((byte) -105, this.field_T[var6] >> 1908825036, var6);
                              break L5;
                            }
                          }
                          var6++;
                          continue L3;
                        }
                      }
                    }
                    if (stackIn_20_0 != 0) {
                      this.field_P = true;
                      break L2;
                    } else {
                      this.a(var4_int, 118);
                      break L1;
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
          L10: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("psa.D(");
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
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qua var9 = null;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        L0: {
          this.field_P = false;
          if (this.field_R == null) {
            this.field_R = new mp();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          this.field_R.field_c[param3] = param1;
          var5 = this.field_T[param3];
          var6 = (this.field_R.field_c[param3] << -1733763956) - var5;
          var7 = 0;
          var8 = 0;
          if (-1 >= (var6 ^ -1)) {
            break L1;
          } else {
            var8 = 1;
            var6 = -var6;
            break L1;
          }
        }
        L2: {
          if (var6 <= 0) {
            break L2;
          } else {
            var7 = (var6 + 1) / (1 + param2);
            break L2;
          }
        }
        L3: {
          stackOut_7_0 = this.field_Q;
          stackOut_7_1 = param3;
          stackIn_9_0 = stackOut_7_0;
          stackIn_9_1 = stackOut_7_1;
          stackIn_8_0 = stackOut_7_0;
          stackIn_8_1 = stackOut_7_1;
          if (var8 != 0) {
            stackOut_9_0 = (int[]) ((Object) stackIn_9_0);
            stackOut_9_1 = stackIn_9_1;
            stackOut_9_2 = -var7;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            stackIn_10_2 = stackOut_9_2;
            break L3;
          } else {
            stackOut_8_0 = (int[]) ((Object) stackIn_8_0);
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = var7;
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_10_2 = stackOut_8_2;
            break L3;
          }
        }
        stackIn_10_0[stackIn_10_1] = stackIn_10_2;
        if (param0 != -30515) {
          var9 = (qua) null;
          this.a(true, (qua) null, (byte) -65, false);
          return;
        } else {
          return;
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        if (0 == (param2 ^ -1)) {
          this.field_S = param1;
          return;
        } else {
          super.a(param0, param1, param2);
          this.field_T[param2] = param1 << -377538388;
          return;
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -377538388) {
          var2 = 0;
          L0: while (true) {
            if (16 > var2) {
              this.field_T[var2] = 1048576;
              var2++;
              if (var3 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              super.a((byte) -105, 256, -1);
              return;
            }
          }
        } else {
          this.field_P = true;
          var2 = 0;
          L1: while (true) {
            if (16 > var2) {
              this.field_T[var2] = 1048576;
              var2++;
              if (var3 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              super.a((byte) -105, 256, -1);
              return;
            }
          }
        }
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
