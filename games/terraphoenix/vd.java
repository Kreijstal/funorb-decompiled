/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends lj {
    static String field_p;
    static String field_o;
    private wl field_q;
    static jj field_l;
    jj field_n;
    vg field_m;

    final lj c() {
        sh var1;
        var1 = (sh) ((Object) this.field_n.d(9272));
        if (var1 != null) {
          if (var1.field_k != null) {
            return (lj) ((Object) var1.field_k);
          } else {
            return this.a();
          }
        } else {
          return null;
        }
    }

    final static int b(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1673262433;
        param0 = param0 | param0 >>> -1605520766;
        if (param1 != 17603) {
          return 26;
        } else {
          param0 = param0 | param0 >>> -1365761180;
          param0 = param0 | param0 >>> -1187105400;
          param0 = param0 | param0 >>> 1032618544;
          return param0 - -1;
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_p = null;
        field_l = null;
        if (param0 == 41) {
            return;
        }
        field_p = (String) null;
    }

    final lj a() {
        sh var1;
        L0: while (true) {
          var1 = (sh) ((Object) this.field_n.e((byte) -119));
          if (var1 != null) {
            if (var1.field_k != null) {
              return (lj) ((Object) var1.field_k);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        sh var6 = null;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            this.field_m.a(param0, param1, param2);
            var6 = (sh) ((Object) this.field_n.d(9272));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                stackIn_4_0 = this.field_q.a(var6, 16384);
                L2: {
                  if (stackIn_4_0) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_y >= var5) {
                        this.a(var6, param0, var5 + var4_int, var5, var4_int, (byte) 13);
                        var6.field_y = var6.field_y - var5;
                        break L2;
                      } else {
                        this.a(var6, param0, var4_int + var5, var6.field_y, var4_int, (byte) 3);
                        var4_int = var4_int + var6.field_y;
                        var5 = var5 - var6.field_y;
                        if (this.field_q.a((byte) 101, param0, var5, var6, var4_int)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (sh) ((Object) this.field_n.e((byte) -119));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("vd.D(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2;
        sh var3;
        int var4;
        var4 = Terraphoenix.field_V;
        this.field_m.a(param0);
        var3 = (sh) ((Object) this.field_n.d(9272));
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (this.field_q.a(var3, 16384)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_y) {
                    this.a(var2, 10756, var3);
                    var3.field_y = var3.field_y - var2;
                    break L1;
                  } else {
                    this.a(var3.field_y, 10756, var3);
                    var2 = var2 - var3.field_y;
                    if (!this.field_q.a((byte) 77, (int[]) null, var2, var3, 0)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (sh) ((Object) this.field_n.e((byte) -119));
            continue L0;
          } else {
            return;
          }
        }
    }

    final int d() {
        return 0;
    }

    private final void a(sh param0, int[] param1, int param2, int param3, int param4, byte param5) {
        wl stackIn_13_0 = null;
        wl stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        lh var11 = null;
        int var12 = 0;
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if ((this.field_q.field_q[param0.field_v] & 4) == 0) {
                break L1;
              } else {
                if (-1 < (param0.field_h ^ -1)) {
                  var7_int = this.field_q.field_D[param0.field_v] / nk.field_u;
                  L2: while (true) {
                    var8 = (1048575 - -var7_int - param0.field_A) / var7_int;
                    if (var8 <= param3) {
                      L3: {
                        param0.field_k.a(param1, param4, var8);
                        param3 = param3 - var8;
                        param0.field_A = param0.field_A + (var7_int * var8 - 1048576);
                        param4 = param4 + var8;
                        var9 = nk.field_u / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param0.field_k;
                        if (-1 != (this.field_q.field_S[param0.field_v] ^ -1)) {
                          L5: {
                            param0.field_k = lh.a(param0.field_F, var11.l(), 0, var11.g());
                            stackIn_13_0 = this.field_q;

                            if ((param0.field_B.field_p[param0.field_w] ^ -1) <= -1) {
                              stackIn_14_0 = (wl) ((Object) stackIn_13_0);
                              stackIn_14_1 = 0;
                              break L5;
                            } else {
                              stackIn_14_0 = (wl) ((Object) stackIn_13_0);
                              stackIn_14_1 = 1;
                              break L5;
                            }
                          }
                          ((wl) (Object) stackIn_14_0).a(stackIn_14_1 != 0, param0, 109);
                          param0.field_k.e(var9, var11.h());
                          break L4;
                        } else {
                          param0.field_k = lh.a(param0.field_F, var11.l(), var11.h(), var11.g());
                          break L4;
                        }
                      }
                      L6: {
                        if (0 > param0.field_B.field_p[param0.field_w]) {
                          param0.field_k.g(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.c(var9);
                      var11.a(param1, param4, param2 - param4);
                      if (!var11.k()) {
                        continue L2;
                      } else {
                        this.field_m.a(var11);
                        continue L2;
                      }
                    } else {
                      param0.field_A = param0.field_A + param3 * var7_int;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var7_int = -8 % ((-49 - param5) / 44);
            param0.field_k.a(param1, param4, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("vd.I(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, sh param2) {
        wl stackIn_9_0 = null;
        wl stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 10756) {
                break L1;
              } else {
                this.field_q = (wl) null;
                break L1;
              }
            }
            L2: {
              if (-1 == (4 & this.field_q.field_q[param2.field_v] ^ -1)) {
                break L2;
              } else {
                if (-1 < (param2.field_h ^ -1)) {
                  var4_int = this.field_q.field_D[param2.field_v] / nk.field_u;
                  var5 = (1048575 + (var4_int - param2.field_A)) / var4_int;
                  param2.field_A = 1048575 & var4_int * param0 + param2.field_A;
                  if (var5 > param0) {
                    break L2;
                  } else {
                    L3: {
                      if (this.field_q.field_S[param2.field_v] == 0) {
                        param2.field_k = lh.a(param2.field_F, param2.field_k.l(), param2.field_k.h(), param2.field_k.g());
                        break L3;
                      } else {
                        L4: {
                          param2.field_k = lh.a(param2.field_F, param2.field_k.l(), 0, param2.field_k.g());
                          stackIn_9_0 = this.field_q;

                          if (param2.field_B.field_p[param2.field_w] >= 0) {
                            stackIn_10_0 = (wl) ((Object) stackIn_9_0);
                            stackIn_10_1 = 0;
                            break L4;
                          } else {
                            stackIn_10_0 = (wl) ((Object) stackIn_9_0);
                            stackIn_10_1 = 1;
                            break L4;
                          }
                        }
                        ((wl) (Object) stackIn_10_0).a(stackIn_10_1 != 0, param2, 100);
                        break L3;
                      }
                    }
                    L5: {
                      if (param2.field_B.field_p[param2.field_w] < 0) {
                        param2.field_k.g(-1);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param0 = param2.field_A / var4_int;
                    break L2;
                  }
                } else {
                  param2.field_k.a(param0);
                  return;
                }
              }
            }
            param2.field_k.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("vd.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    vd(wl param0) {
        this.field_n = new jj();
        this.field_m = new vg();
        try {
            this.field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "vd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Email is valid";
        field_o = "Please wait...";
        field_l = new jj();
    }
}
