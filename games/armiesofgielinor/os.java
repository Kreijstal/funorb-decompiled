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
        int var4 = 0;
        int var5 = 0;
        mi var6 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((os) this).field_s.b(param0, param1, param2);
        var6 = (mi) (Object) ((os) this).field_p.e((byte) 94);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (!((os) this).field_r.c((byte) -109, var6)) {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var6.field_w >= var5) {
                    this.a(var4, var4 - -var5, param0, -1, var6, var5);
                    var6.field_w = var6.field_w - var5;
                    break L1;
                  } else {
                    this.a(var4, var5 + var4, param0, -1, var6, var6.field_w);
                    var5 = var5 - var6.field_w;
                    var4 = var4 + var6.field_w;
                    if (((os) this).field_r.a(var5, var4, var6, (byte) 116, param0)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var6 = (mi) (Object) ((os) this).field_p.a((byte) 123);
            continue L0;
          } else {
            return;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 >>> 1589591487;
        if (param2 != 1589591487) {
            return 83;
        }
        return (param1 - -var3) / param0 - var3;
    }

    final static boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            int discarded$12 = os.a(-56, 74, 21);
            if (vi.field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (vi.field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int g(int param0) {
        if (param0 != 4) {
            return 68;
        }
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
        int var4 = 0;
        int var5 = 0;
        ih stackIn_14_0 = null;
        ih stackIn_15_0 = null;
        ih stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ih stackOut_13_0 = null;
        ih stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ih stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        if ((((os) this).field_r.field_o[param0.field_m] & 4) != 0) {
          if (0 > param0.field_x) {
            L0: {
              var4 = ((os) this).field_r.field_s[param0.field_m] / rc.field_d;
              var5 = (1048575 + var4 + -param0.field_B) / var4;
              param0.field_B = var4 * param2 + param0.field_B & 1048575;
              if (param2 < var5) {
                break L0;
              } else {
                L1: {
                  if (0 != ((os) this).field_r.field_W[param0.field_m]) {
                    L2: {
                      param0.field_K = aa.b(param0.field_q, param0.field_K.h(), 0, param0.field_K.k());
                      stackOut_13_0 = ((os) this).field_r;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (0 <= param0.field_H.field_r[param0.field_D]) {
                        stackOut_15_0 = (ih) (Object) stackIn_15_0;
                        stackOut_15_1 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L2;
                      } else {
                        stackOut_14_0 = (ih) (Object) stackIn_14_0;
                        stackOut_14_1 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L2;
                      }
                    }
                    ((ih) (Object) stackIn_16_0).a(stackIn_16_1 != 0, param0, 16);
                    break L1;
                  } else {
                    param0.field_K = aa.b(param0.field_q, param0.field_K.h(), param0.field_K.l(), param0.field_K.k());
                    break L1;
                  }
                }
                if (0 <= param0.field_H.field_r[param0.field_D]) {
                  param2 = param0.field_B / var4;
                  break L0;
                } else {
                  param0.field_K.f(-1);
                  param2 = param0.field_B / var4;
                  if (param1 == 16) {
                    param0.field_K.a(param2);
                    return;
                  } else {
                    os.f(119);
                    param0.field_K.a(param2);
                    return;
                  }
                }
              }
            }
            if (param1 == 16) {
              param0.field_K.a(param2);
              return;
            } else {
              os.f(119);
              param0.field_K.a(param2);
              return;
            }
          } else {
            if (param1 == 16) {
              param0.field_K.a(param2);
              return;
            } else {
              os.f(119);
              param0.field_K.a(param2);
              return;
            }
          }
        } else {
          if (param1 == 16) {
            param0.field_K.a(param2);
            return;
          } else {
            os.f(119);
            param0.field_K.a(param2);
            return;
          }
        }
    }

    final int c() {
        return 0;
    }

    os(ih param0) {
        ((os) this).field_p = new at();
        ((os) this).field_s = new uv();
        ((os) this).field_r = param0;
    }

    private final void a(int param0, int param1, int[] param2, int param3, mi param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        aa var11 = null;
        int var12 = 0;
        ih stackIn_11_0 = null;
        ih stackIn_12_0 = null;
        ih stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ih stackOut_10_0 = null;
        ih stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ih stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 == (((os) this).field_r.field_o[param4.field_m] & 4)) {
          param4.field_K.b(param2, param0, param5);
          return;
        } else {
          if (-1 > param4.field_x) {
            var7 = ((os) this).field_r.field_s[param4.field_m] / rc.field_d;
            L0: while (true) {
              var8 = (-param4.field_B + (var7 + 1048575)) / var7;
              if (param5 >= var8) {
                L1: {
                  param4.field_K.b(param2, param0, var8);
                  param0 = param0 + var8;
                  param5 = param5 - var8;
                  param4.field_B = param4.field_B + (-1048576 + var7 * var8);
                  var9 = rc.field_d / 100;
                  var10 = 262144 / var7;
                  if (var9 > var10) {
                    var9 = var10;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var11 = param4.field_K;
                  if (((os) this).field_r.field_W[param4.field_m] == 0) {
                    param4.field_K = aa.b(param4.field_q, var11.h(), var11.l(), var11.k());
                    break L2;
                  } else {
                    L3: {
                      param4.field_K = aa.b(param4.field_q, var11.h(), 0, var11.k());
                      stackOut_10_0 = ((os) this).field_r;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if ((param4.field_H.field_r[param4.field_D] ^ -1) <= -1) {
                        stackOut_12_0 = (ih) (Object) stackIn_12_0;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L3;
                      } else {
                        stackOut_11_0 = (ih) (Object) stackIn_11_0;
                        stackOut_11_1 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L3;
                      }
                    }
                    ((ih) (Object) stackIn_13_0).a(stackIn_13_1 != 0, param4, 16);
                    param4.field_K.d(var9, var11.l());
                    break L2;
                  }
                }
                L4: {
                  if (-1 >= (param4.field_H.field_r[param4.field_D] ^ -1)) {
                    break L4;
                  } else {
                    param4.field_K.f(-1);
                    break L4;
                  }
                }
                var11.h(var9);
                var11.b(param2, param0, -param0 + param1);
                if (!var11.e()) {
                  continue L0;
                } else {
                  ((os) this).field_s.a((hn) (Object) var11);
                  continue L0;
                }
              } else {
                param4.field_B = param4.field_B + param5 * var7;
                param4.field_K.b(param2, param0, param5);
                return;
              }
            }
          } else {
            param4.field_K.b(param2, param0, param5);
            return;
          }
        }
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 == 1048575) {
            return;
        }
        field_o = 68;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
