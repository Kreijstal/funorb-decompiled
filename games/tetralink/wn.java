/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends eb {
    private g field_r;
    je field_u;
    static String field_v;
    static uh field_t;
    fg field_s;

    final eb c() {
        oc var1_ref = null;
        int var2 = TetraLink.field_J;
        do {
            var1_ref = (oc) (Object) ((wn) this).field_u.a((byte) -70);
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_I == null);
        return (eb) (Object) var1_ref.field_I;
    }

    final eb b() {
        oc var1 = null;
        var1 = (oc) (Object) ((wn) this).field_u.c(false);
        if (var1 != null) {
          if (var1.field_I != null) {
            return (eb) (Object) var1.field_I;
          } else {
            return ((wn) this).c();
          }
        } else {
          return null;
        }
    }

    private final void a(boolean param0, int param1, oc param2) {
        int var4 = 0;
        int var5 = 0;
        g stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        oc stackIn_10_2 = null;
        g stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        oc stackIn_11_2 = null;
        g stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        oc stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        g stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        oc stackOut_9_2 = null;
        g stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        oc stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        g stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        oc stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        if (!param0) {
          if ((((wn) this).field_r.field_I[param2.field_n] & 4) != 0) {
            if (0 > param2.field_v) {
              var4 = ((wn) this).field_r.field_T[param2.field_n] / nk.field_k;
              var5 = (1048575 + var4 - param2.field_F) / var4;
              param2.field_F = param2.field_F - -(var4 * param1) & 1048575;
              if (var5 <= param1) {
                if (-1 == (((wn) this).field_r.field_G[param2.field_n] ^ -1)) {
                  param2.field_I = ee.a(param2.field_y, param2.field_I.i(), param2.field_I.k(), param2.field_I.j());
                  if (0 <= param2.field_B.field_o[param2.field_E]) {
                    param1 = param2.field_F / var4;
                    param2.field_I.a(param1);
                    return;
                  } else {
                    param2.field_I.c(-1);
                    param1 = param2.field_F / var4;
                    param2.field_I.a(param1);
                    return;
                  }
                } else {
                  L0: {
                    param2.field_I = ee.a(param2.field_y, param2.field_I.i(), 0, param2.field_I.j());
                    stackOut_9_0 = ((wn) this).field_r;
                    stackOut_9_1 = 0;
                    stackOut_9_2 = (oc) param2;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    if ((param2.field_B.field_o[param2.field_E] ^ -1) <= -1) {
                      stackOut_11_0 = (g) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = (oc) (Object) stackIn_11_2;
                      stackOut_11_3 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      break L0;
                    } else {
                      stackOut_10_0 = (g) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = (oc) (Object) stackIn_10_2;
                      stackOut_10_3 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      break L0;
                    }
                  }
                  ((g) (Object) stackIn_12_0).a(stackIn_12_1 != 0, stackIn_12_2, stackIn_12_3 != 0);
                  if (0 <= param2.field_B.field_o[param2.field_E]) {
                    param1 = param2.field_F / var4;
                    param2.field_I.a(param1);
                    return;
                  } else {
                    param2.field_I.c(-1);
                    param1 = param2.field_F / var4;
                    param2.field_I.a(param1);
                    return;
                  }
                }
              } else {
                param2.field_I.a(param1);
                return;
              }
            } else {
              param2.field_I.a(param1);
              return;
            }
          } else {
            param2.field_I.a(param1);
            return;
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_v = null;
        if (param0 != 20406) {
            field_t = null;
            field_t = null;
            return;
        }
        field_t = null;
    }

    final static qa a(boolean param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        qa var2 = null;
        qa stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        qa stackOut_5_0 = null;
        try {
          L0: {
            if (!param0) {
              break L0;
            } else {
              field_t = null;
              break L0;
            }
          }
          var1_int = 0;
          L1: while (true) {
            var2 = n.field_U.a(var1_int, true);
            if (var2.field_w) {
              stackOut_5_0 = (qa) var2;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              var1_int++;
              continue L1;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    private final void a(oc param0, int[] param1, int param2, int param3, boolean param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ee var11 = null;
        int var12 = 0;
        g stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        oc stackIn_17_2 = null;
        g stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        oc stackIn_18_2 = null;
        g stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        oc stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        g stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        oc stackOut_16_2 = null;
        g stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        oc stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        g stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        oc stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        var12 = TetraLink.field_J;
        if ((((wn) this).field_r.field_I[param0.field_n] & 4) != 0) {
          if ((param0.field_v ^ -1) > -1) {
            var7 = ((wn) this).field_r.field_T[param0.field_n] / nk.field_k;
            L0: while (true) {
              var8 = (-param0.field_F + (var7 + 1048575)) / var7;
              if (param3 < var8) {
                param0.field_F = param0.field_F + var7 * param3;
                if (param4) {
                  return;
                } else {
                  param0.field_I.b(param1, param2, param3);
                  return;
                }
              } else {
                L1: {
                  param0.field_I.b(param1, param2, var8);
                  param2 = param2 + var8;
                  param0.field_F = param0.field_F + (var8 * var7 - 1048576);
                  param3 = param3 - var8;
                  var9 = nk.field_k / 100;
                  var10 = 262144 / var7;
                  if (var10 >= var9) {
                    break L1;
                  } else {
                    var9 = var10;
                    break L1;
                  }
                }
                L2: {
                  var11 = param0.field_I;
                  if (((wn) this).field_r.field_G[param0.field_n] != 0) {
                    L3: {
                      param0.field_I = ee.a(param0.field_y, var11.i(), 0, var11.j());
                      stackOut_16_0 = ((wn) this).field_r;
                      stackOut_16_1 = 0;
                      stackOut_16_2 = (oc) param0;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      if (param0.field_B.field_o[param0.field_E] >= 0) {
                        stackOut_18_0 = (g) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = (oc) (Object) stackIn_18_2;
                        stackOut_18_3 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        stackIn_19_3 = stackOut_18_3;
                        break L3;
                      } else {
                        stackOut_17_0 = (g) (Object) stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = (oc) (Object) stackIn_17_2;
                        stackOut_17_3 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        stackIn_19_3 = stackOut_17_3;
                        break L3;
                      }
                    }
                    ((g) (Object) stackIn_19_0).a(stackIn_19_1 != 0, stackIn_19_2, stackIn_19_3 != 0);
                    param0.field_I.b(var9, var11.k());
                    break L2;
                  } else {
                    param0.field_I = ee.a(param0.field_y, var11.i(), var11.k(), var11.j());
                    break L2;
                  }
                }
                L4: {
                  if (0 > param0.field_B.field_o[param0.field_E]) {
                    param0.field_I.c(-1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var11.g(var9);
                var11.b(param1, param2, param5 + -param2);
                if (var11.g()) {
                  ((wn) this).field_s.a((eb) (Object) var11);
                  continue L0;
                } else {
                  continue L0;
                }
              }
            }
          } else {
            if (param4) {
              return;
            } else {
              param0.field_I.b(param1, param2, param3);
              return;
            }
          }
        } else {
          if (param4) {
            return;
          } else {
            param0.field_I.b(param1, param2, param3);
            return;
          }
        }
    }

    final int a() {
        return 0;
    }

    final void a(int param0) {
        int var2 = 0;
        oc var3 = null;
        int var4 = 0;
        var4 = TetraLink.field_J;
        ((wn) this).field_s.a(param0);
        var3 = (oc) (Object) ((wn) this).field_u.c(false);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((wn) this).field_r.b((byte) 108, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_s) {
                    this.a(false, var2, var3);
                    var3.field_s = var3.field_s - var2;
                    break L1;
                  } else {
                    this.a(false, var3.field_s, var3);
                    var2 = var2 - var3.field_s;
                    if (((wn) this).field_r.a(0, (int[]) null, var2, var3, 21107)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (oc) (Object) ((wn) this).field_u.a((byte) -70);
            continue L0;
          } else {
            return;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        oc var6 = null;
        int var7 = 0;
        var7 = TetraLink.field_J;
        ((wn) this).field_s.b(param0, param1, param2);
        var6 = (oc) (Object) ((wn) this).field_u.c(false);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (((wn) this).field_r.b((byte) 127, var6)) {
                break L1;
              } else {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var6.field_s >= var5) {
                    this.a(var6, param0, var4, var5, false, var5 + var4);
                    var6.field_s = var6.field_s - var5;
                    break L1;
                  } else {
                    this.a(var6, param0, var4, var6.field_s, false, var4 - -var5);
                    var5 = var5 - var6.field_s;
                    var4 = var4 + var6.field_s;
                    if (((wn) this).field_r.a(var4, param0, var5, var6, 21107)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var6 = (oc) (Object) ((wn) this).field_u.a((byte) -70);
            continue L0;
          } else {
            return;
          }
        }
    }

    wn(g param0) {
        ((wn) this).field_u = new je();
        ((wn) this).field_s = new fg();
        ((wn) this).field_r = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
