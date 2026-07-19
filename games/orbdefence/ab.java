/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab implements td {
    private int field_m;
    private int field_d;
    private int field_b;
    private kc field_k;
    private int field_c;
    private int field_a;
    private int field_i;
    static ml field_j;
    private int field_e;
    static im field_h;
    static hj[] field_g;
    static int field_f;
    static int field_l;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        pj var14 = null;
        bj var15 = null;
        pj stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        pj stackOut_1_0 = null;
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
              if (!(param2 instanceof bj)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (pj) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (pj) (param2);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var15 = (bj) ((Object) stackIn_3_0);
              ul.h(param2.field_s + param1, param0 - -param2.field_n, param2.field_m, param2.field_r, this.field_a);
              if (var15 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = var15.field_H + param1 + param2.field_s;
              var8 = param2.field_n + param0 - -var15.field_K;
              ul.f(var7, var8, var15.field_G, this.field_d);
              if (var15.field_L == -1) {
                break L3;
              } else {
                var9 = 2.0 * ((double)var15.field_L * 3.141592653589793) / (double)var15.field_I;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
                var12 = (int)(Math.cos(var9) * (double)var15.field_G);
                ul.f(var7 - -var11, var12 + var8, 1, this.field_i);
                break L3;
              }
            }
            L4: {
              ul.f(var7, var8, 2, 1);
              var9 = 2.0 * (3.141592653589793 * (double)var15.field_J) / (double)var15.field_I;
              var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
              if (param3 == -4394) {
                break L4;
              } else {
                var14 = (pj) null;
                this.a(19, 76, (pj) null, 43, true);
                break L4;
              }
            }
            L5: {
              var12 = (int)(Math.cos(var9) * (double)var15.field_G);
              ul.b(var7, var8, var7 - -var11, var12 + var8, 1);
              if (null == this.field_k) {
                break L5;
              } else {
                var13 = this.field_m + (var15.field_H + var15.field_G);
                discarded$1 = this.field_k.a(param2.field_l, param2.field_s + (param1 + var13), param0 - -param2.field_n - -this.field_b, param2.field_m - (var13 - -this.field_m), param2.field_r - (this.field_m << -839238015), this.field_e, this.field_c, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("ab.A(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
            field_h = (im) null;
            field_g = null;
            field_h = null;
            return;
        }
        field_g = null;
        field_h = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        Object var2 = null;
        int var3 = 0;
        Throwable var4 = null;
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          var1_int = -43 % ((-78 - param0) / 46);
          var2 = ad.field_b;
          synchronized (var2) {
            L0: {
              L1: {
                L2: {
                  L3: {
                    md.field_g = pk.field_H;
                    ji.field_c = ji.field_c + 1;
                    if ((wg.field_p ^ -1) <= -1) {
                      break L3;
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (112 <= var3) {
                              break L6;
                            } else {
                              ek.field_a[var3] = false;
                              var3++;
                              if (var5 != 0) {
                                break L5;
                              } else {
                                if (var5 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          wg.field_p = al.field_b;
                          break L5;
                        }
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L7: while (true) {
                    if (al.field_b == wg.field_p) {
                      break L2;
                    } else {
                      var3 = gl.field_i[al.field_b];
                      al.field_b = al.field_b + 1 & 127;
                      stackOut_12_0 = 0;
                      stackIn_19_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L8: {
                          L9: {
                            if (stackIn_13_0 <= var3) {
                              break L9;
                            } else {
                              ek.field_a[var3 ^ -1] = false;
                              if (var5 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          ek.field_a[var3] = true;
                          break L8;
                        }
                        if (var5 == 0) {
                          continue L7;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_18_0 = uf.field_a;
                stackIn_19_0 = stackOut_18_0;
                break L1;
              }
              pk.field_H = stackIn_19_0;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "ab.B(" + param0 + ')');
        }
    }

    ab(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_d = param5;
            this.field_c = param4;
            this.field_k = param0;
            this.field_b = param2;
            this.field_e = param3;
            this.field_m = param1;
            this.field_i = param6;
            this.field_a = param7;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_j = new ml(1);
        field_h = new im();
        field_l = -1;
    }
}
