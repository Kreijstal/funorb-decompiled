/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class os extends hn {
    at field_p;
    private ih field_r;
    static int field_o;
    uv field_s;
    static String field_q;

    final hn b() {
        mi var1_ref = null;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        do {
            var1_ref = (mi) (Object) ((os) this).field_p.a((byte) 123);
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_K);
        return (hn) (Object) var1_ref.field_K;
    }

    final hn a() {
        mi var1 = (mi) (Object) ((os) this).field_p.e((byte) 99);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_K)) {
            return (hn) (Object) var1.field_K;
        }
        return ((os) this).b();
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        mi var6 = null;
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
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((os) this).field_s.b(param0, param1, param2);
            var6 = (mi) (Object) ((os) this).field_p.e((byte) 94);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((os) this).field_r.c((byte) -109, var6)) {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_w >= var5) {
                        this.a(var4_int, var4_int - -var5, param0, -1, var6, var5);
                        var6.field_w = var6.field_w - var5;
                        break L2;
                      } else {
                        this.a(var4_int, var5 + var4_int, param0, -1, var6, var6.field_w);
                        var5 = var5 - var6.field_w;
                        var4_int = var4_int + var6.field_w;
                        if (((os) this).field_r.a(var5, var4_int, var6, (byte) 116, param0)) {
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
                var6 = (mi) (Object) ((os) this).field_p.a((byte) 123);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("os.E(");
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 >>> 31;
        return (param1 - -var3) / param0 - var3;
    }

    final static boolean e() {
        return !vi.field_d;
    }

    final static int g() {
        return av.field_a;
    }

    final void a(int param0) {
        int var2 = 0;
        mi var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((os) this).field_s.a(param0);
        var3 = (mi) (Object) ((os) this).field_p.e((byte) 103);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (!((os) this).field_r.c((byte) -97, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_w >= var2) {
                    this.a(var3, (byte) 16, var2);
                    var3.field_w = var3.field_w - var2;
                    break L1;
                  } else {
                    this.a(var3, (byte) 16, var3.field_w);
                    var2 = var2 - var3.field_w;
                    if (!((os) this).field_r.a(var2, 0, var3, (byte) 78, (int[]) null)) {
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
            var3 = (mi) (Object) ((os) this).field_p.a((byte) 123);
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void a(mi param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ih stackIn_6_0 = null;
        ih stackIn_7_0 = null;
        ih stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ih stackOut_5_0 = null;
        ih stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ih stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if ((((os) this).field_r.field_o[param0.field_m] & 4) == 0) {
                break L1;
              } else {
                if (0 <= param0.field_x) {
                  break L1;
                } else {
                  var4_int = ((os) this).field_r.field_s[param0.field_m] / rc.field_d;
                  var5 = (1048575 + var4_int + -param0.field_B) / var4_int;
                  param0.field_B = var4_int * param2 + param0.field_B & 1048575;
                  if (param2 < var5) {
                    break L1;
                  } else {
                    L2: {
                      if (0 != ((os) this).field_r.field_W[param0.field_m]) {
                        L3: {
                          param0.field_K = aa.b(param0.field_q, param0.field_K.h(), 0, param0.field_K.k());
                          stackOut_5_0 = ((os) this).field_r;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          if (0 <= param0.field_H.field_r[param0.field_D]) {
                            stackOut_7_0 = (ih) (Object) stackIn_7_0;
                            stackOut_7_1 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            break L3;
                          } else {
                            stackOut_6_0 = (ih) (Object) stackIn_6_0;
                            stackOut_6_1 = 1;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            break L3;
                          }
                        }
                        ((ih) (Object) stackIn_8_0).a(stackIn_8_1 != 0, param0, 16);
                        break L2;
                      } else {
                        param0.field_K = aa.b(param0.field_q, param0.field_K.h(), param0.field_K.l(), param0.field_K.k());
                        break L2;
                      }
                    }
                    L4: {
                      if (0 <= param0.field_H.field_r[param0.field_D]) {
                        break L4;
                      } else {
                        param0.field_K.f(-1);
                        break L4;
                      }
                    }
                    param2 = param0.field_B / var4_int;
                    break L1;
                  }
                }
              }
            }
            param0.field_K.a(param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("os.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 16 + ',' + param2 + ')');
        }
    }

    final int c() {
        return 0;
    }

    os(ih param0) {
        ((os) this).field_p = new at();
        ((os) this).field_s = new uv();
        try {
            ((os) this).field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "os.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int[] param2, int param3, mi param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        aa var11 = null;
        int var12 = 0;
        ih stackIn_12_0 = null;
        ih stackIn_13_0 = null;
        ih stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        ih stackOut_11_0 = null;
        ih stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ih stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 == (((os) this).field_r.field_o[param4.field_m] & 4)) {
                break L1;
              } else {
                if (-1 > param4.field_x) {
                  var7_int = ((os) this).field_r.field_s[param4.field_m] / rc.field_d;
                  L2: while (true) {
                    var8 = (-param4.field_B + (var7_int + 1048575)) / var7_int;
                    if (param5 >= var8) {
                      L3: {
                        param4.field_K.b(param2, param0, var8);
                        param0 = param0 + var8;
                        param5 = param5 - var8;
                        param4.field_B = param4.field_B + (-1048576 + var7_int * var8);
                        var9 = rc.field_d / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param4.field_K;
                        if (((os) this).field_r.field_W[param4.field_m] == 0) {
                          param4.field_K = aa.b(param4.field_q, var11.h(), var11.l(), var11.k());
                          break L4;
                        } else {
                          L5: {
                            param4.field_K = aa.b(param4.field_q, var11.h(), 0, var11.k());
                            stackOut_11_0 = ((os) this).field_r;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (param4.field_H.field_r[param4.field_D] >= 0) {
                              stackOut_13_0 = (ih) (Object) stackIn_13_0;
                              stackOut_13_1 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              break L5;
                            } else {
                              stackOut_12_0 = (ih) (Object) stackIn_12_0;
                              stackOut_12_1 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              break L5;
                            }
                          }
                          ((ih) (Object) stackIn_14_0).a(stackIn_14_1 != 0, param4, 16);
                          param4.field_K.d(var9, var11.l());
                          break L4;
                        }
                      }
                      L6: {
                        if (param4.field_H.field_r[param4.field_D] >= 0) {
                          break L6;
                        } else {
                          param4.field_K.f(-1);
                          break L6;
                        }
                      }
                      var11.h(var9);
                      var11.b(param2, param0, -param0 + param1);
                      if (!var11.e()) {
                        continue L2;
                      } else {
                        ((os) this).field_s.a((hn) (Object) var11);
                        continue L2;
                      }
                    } else {
                      param4.field_B = param4.field_B + param5 * var7_int;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            param4.field_K.b(param2, param0, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("os.H(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(-1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param5 + ')');
        }
    }

    public static void f() {
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
