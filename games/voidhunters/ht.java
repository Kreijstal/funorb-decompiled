/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ht extends f {
    static String field_h;
    ij field_k;
    private hbb field_i;
    qkb field_j;

    final f a() {
        fkb var1 = null;
        L0: while (true) {
          var1 = (fkb) ((Object) this.field_k.a((byte) 30));
          if (var1 != null) {
            if (null != var1.field_j) {
              return (f) ((Object) var1.field_j);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static float[] a(int param0, int param1, float[] param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_0_0 = null;
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
            var4 = new float[param0];
            var3 = var4;
            cua.a(param2, 0, var4, param1, param0);
            stackOut_0_0 = (float[]) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3_ref);
            stackOut_2_1 = new StringBuilder().append("ht.A(").append(param0).append(',').append(param1).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final f c() {
        fkb var1 = (fkb) ((Object) this.field_k.d(0));
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_j == null)) {
            return (f) ((Object) var1.field_j);
        }
        return this.a();
    }

    final int d() {
        return 0;
    }

    private final void a(fkb param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        hbb stackIn_6_0 = null;
        fkb stackIn_6_1 = null;
        hbb stackIn_7_0 = null;
        fkb stackIn_7_1 = null;
        hbb stackIn_8_0 = null;
        fkb stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        hbb stackOut_5_0 = null;
        fkb stackOut_5_1 = null;
        hbb stackOut_7_0 = null;
        fkb stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        hbb stackOut_6_0 = null;
        fkb stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if ((4 & this.field_i.field_v[param0.field_o]) == 0) {
                break L1;
              } else {
                if (-1 >= (param0.field_v ^ -1)) {
                  break L1;
                } else {
                  var4_int = this.field_i.field_l[param0.field_o] / vka.field_s;
                  var5 = (-param0.field_p + var4_int + 1048575) / var4_int;
                  param0.field_p = 1048575 & param0.field_p + param2 * var4_int;
                  if (param2 >= var5) {
                    L2: {
                      if (this.field_i.field_j[param0.field_o] == 0) {
                        param0.field_j = fga.b(param0.field_y, param0.field_j.k(), param0.field_j.f(), param0.field_j.h());
                        break L2;
                      } else {
                        L3: {
                          param0.field_j = fga.b(param0.field_y, param0.field_j.k(), 0, param0.field_j.h());
                          stackOut_5_0 = this.field_i;
                          stackOut_5_1 = (fkb) (param0);
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          if (-1 >= (param0.field_n.field_e[param0.field_x] ^ -1)) {
                            stackOut_7_0 = (hbb) ((Object) stackIn_7_0);
                            stackOut_7_1 = (fkb) ((Object) stackIn_7_1);
                            stackOut_7_2 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            break L3;
                          } else {
                            stackOut_6_0 = (hbb) ((Object) stackIn_6_0);
                            stackOut_6_1 = (fkb) ((Object) stackIn_6_1);
                            stackOut_6_2 = 1;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            break L3;
                          }
                        }
                        ((hbb) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2 != 0, true);
                        break L2;
                      }
                    }
                    L4: {
                      if ((param0.field_n.field_e[param0.field_x] ^ -1) > -1) {
                        param0.field_j.d(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param2 = param0.field_p / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            param0.field_j.a(param2);
            if (param1 == -1) {
              break L0;
            } else {
              field_h = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("ht.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        fkb var6 = null;
        int var7 = 0;
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
        var7 = VoidHunters.field_G;
        try {
          L0: {
            this.field_j.a(param0, param1, param2);
            var6 = (fkb) ((Object) this.field_k.d(0));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!this.field_i.a(var6, 0)) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_k) {
                        this.a(var4_int, var5 + var4_int, var6, param0, var5, (byte) 12);
                        var6.field_k = var6.field_k - var5;
                        break L2;
                      } else {
                        this.a(var4_int, var5 + var4_int, var6, param0, var6.field_k, (byte) 26);
                        var5 = var5 - var6.field_k;
                        var4_int = var4_int + var6.field_k;
                        if (this.field_i.a(var4_int, param0, var5, var6, (byte) -12)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (fkb) ((Object) this.field_k.a((byte) 103));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("ht.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, fkb param2, int[] param3, int param4, byte param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fga var11 = null;
        int var12 = 0;
        hbb stackIn_10_0 = null;
        fkb stackIn_10_1 = null;
        hbb stackIn_11_0 = null;
        fkb stackIn_11_1 = null;
        hbb stackIn_12_0 = null;
        fkb stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        hbb stackOut_9_0 = null;
        fkb stackOut_9_1 = null;
        hbb stackOut_11_0 = null;
        fkb stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        hbb stackOut_10_0 = null;
        fkb stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (0 == (this.field_i.field_v[param2.field_o] & 4)) {
                break L1;
              } else {
                if (param2.field_v >= 0) {
                  break L1;
                } else {
                  var7_int = this.field_i.field_l[param2.field_o] / vka.field_s;
                  L2: while (true) {
                    var8 = (1048575 + (var7_int - param2.field_p)) / var7_int;
                    if (param4 < var8) {
                      param2.field_p = param2.field_p + param4 * var7_int;
                      break L1;
                    } else {
                      L3: {
                        param2.field_j.a(param3, param0, var8);
                        param2.field_p = param2.field_p + (var7_int * var8 + -1048576);
                        param0 = param0 + var8;
                        param4 = param4 - var8;
                        var9 = vka.field_s / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param2.field_j;
                        if (this.field_i.field_j[param2.field_o] == 0) {
                          param2.field_j = fga.b(param2.field_y, var11.k(), var11.f(), var11.h());
                          break L4;
                        } else {
                          L5: {
                            param2.field_j = fga.b(param2.field_y, var11.k(), 0, var11.h());
                            stackOut_9_0 = this.field_i;
                            stackOut_9_1 = (fkb) (param2);
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (0 <= param2.field_n.field_e[param2.field_x]) {
                              stackOut_11_0 = (hbb) ((Object) stackIn_11_0);
                              stackOut_11_1 = (fkb) ((Object) stackIn_11_1);
                              stackOut_11_2 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              stackIn_12_2 = stackOut_11_2;
                              break L5;
                            } else {
                              stackOut_10_0 = (hbb) ((Object) stackIn_10_0);
                              stackOut_10_1 = (fkb) ((Object) stackIn_10_1);
                              stackOut_10_2 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              stackIn_12_1 = stackOut_10_1;
                              stackIn_12_2 = stackOut_10_2;
                              break L5;
                            }
                          }
                          ((hbb) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2 != 0, true);
                          param2.field_j.d(var9, var11.f());
                          break L4;
                        }
                      }
                      L6: {
                        if ((param2.field_n.field_e[param2.field_x] ^ -1) > -1) {
                          param2.field_j.d(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.f(var9);
                      var11.a(param3, param0, param1 - param0);
                      if (var11.g()) {
                        this.field_j.b(var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            param2.field_j.a(param3, param0, param4);
            if (param5 >= 11) {
              break L0;
            } else {
              this.field_j = (qkb) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var7);
            stackOut_24_1 = new StringBuilder().append("ht.C(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            return;
        }
        float[] var2 = (float[]) null;
        float[] discarded$0 = ht.a(-65, -20, (float[]) null);
    }

    final void a(int param0) {
        int var2 = 0;
        fkb var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        this.field_j.a(param0);
        var3 = (fkb) ((Object) this.field_k.d(0));
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (!this.field_i.a(var3, 0)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_k >= var2) {
                    this.a(var3, -1, var2);
                    var3.field_k = var3.field_k - var2;
                    break L1;
                  } else {
                    this.a(var3, -1, var3.field_k);
                    var2 = var2 - var3.field_k;
                    if (!this.field_i.a(0, (int[]) null, var2, var3, (byte) -68)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (fkb) ((Object) this.field_k.a((byte) 99));
            continue L0;
          } else {
            return;
          }
        }
    }

    ht(hbb param0) {
        this.field_k = new ij();
        this.field_j = new qkb();
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ht.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
