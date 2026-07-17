/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    private boolean field_q;
    private int field_p;
    private int field_m;
    static boolean field_o;
    private int field_e;
    private int field_f;
    private boolean field_i;
    private fj field_n;
    private int field_g;
    private int field_c;
    static int field_b;
    private int field_h;
    private int field_l;
    private dta field_d;
    private int field_k;
    private int field_j;
    private qh field_a;

    final boolean c(int param0) {
        if (param0 != 1727002282) {
            return true;
        }
        return ((qa) this).field_q;
    }

    final static int a(boolean param0, mi[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param1.length - 1 <= var3_int) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    field_b = -62;
                    break L2;
                  }
                }
                stackOut_9_0 = param1.length + -1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (param1[var3_int - -1].field_h <= param2 + -1) {
                  var3_int++;
                  continue L1;
                } else {
                  stackOut_4_0 = var3_int;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("qa.G(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param2 == param0) {
          return param0;
        } else {
          L0: {
            var4 = -param2 + param0;
            var5 = ua.a(var4, 14);
            if (var4 <= param1) {
              var6 = -1;
              break L0;
            } else {
              var6 = 1;
              break L0;
            }
          }
          if (((qa) this).field_h > var5) {
            return var6 + param2;
          } else {
            return var4 / ((qa) this).field_h + param2;
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 < 26) {
          ((qa) this).a((byte) -94);
          ((qa) this).field_g = ((qa) this).field_g + param2;
          ((qa) this).field_m = ((qa) this).field_m + param2;
          ((qa) this).field_j = ((qa) this).field_j + param0;
          ((qa) this).field_f = ((qa) this).field_f + param0;
          ((qa) this).field_h = 16;
          return;
        } else {
          ((qa) this).field_g = ((qa) this).field_g + param2;
          ((qa) this).field_m = ((qa) this).field_m + param2;
          ((qa) this).field_j = ((qa) this).field_j + param0;
          ((qa) this).field_f = ((qa) this).field_f + param0;
          ((qa) this).field_h = 16;
          return;
        }
    }

    final void b(int param0) {
        Object var3 = null;
        if (!this.a(0)) {
          return;
        } else {
          ((qa) this).field_n.a(((qa) this).field_e, ((qa) this).field_p, ((qa) this).field_k, ((qa) this).field_c, ((qa) this).field_l, ((qa) this).field_a, 51);
          if (param0 == 23479) {
            if (!((qa) this).field_a.f((byte) 33)) {
              if (!((qa) this).field_a.field_A) {
                ((qa) this).field_d.a(((qa) this).field_p, ((qa) this).field_k, ((qa) this).field_e, -88, ((qa) this).field_a, ((qa) this).field_c, ((qa) this).field_l);
                if (((qa) this).field_a.field_D) {
                  tra.a(0, bm.field_f, (byte) -72, ((qa) this).field_p, tga.field_a, ((qa) this).field_k - ((qa) this).field_p, 1, -((qa) this).field_c + ((qa) this).field_l, ((qa) this).field_c, -16777216 | wga.field_a[((qa) this).field_e]);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            var3 = null;
            int discarded$1 = qa.a(true, (mi[]) null, 44);
            if (!((qa) this).field_a.f((byte) 33)) {
              if (!((qa) this).field_a.field_A) {
                ((qa) this).field_d.a(((qa) this).field_p, ((qa) this).field_k, ((qa) this).field_e, -88, ((qa) this).field_a, ((qa) this).field_c, ((qa) this).field_l);
                if (!((qa) this).field_a.field_D) {
                  return;
                } else {
                  tra.a(0, bm.field_f, (byte) -72, ((qa) this).field_p, tga.field_a, ((qa) this).field_k - ((qa) this).field_p, 1, -((qa) this).field_c + ((qa) this).field_l, ((qa) this).field_c, -16777216 | wga.field_a[((qa) this).field_e]);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, wm param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 == -20186) {
              var4_int = aaa.a(false) - koa.b(0) / 2;
              var5 = koa.b(0) / 2;
              if (mf.field_d != param1) {
                if (param1 == dp.field_j) {
                  this.a(0, 0, param2 + 20194, var4_int, koa.b(param2 ^ -20186));
                  return;
                } else {
                  if (qu.field_e == param1) {
                    this.a(var4_int, 0, 8, aaa.a(false), var5 << 1);
                    return;
                  } else {
                    if (param1 != mma.field_c) {
                      break L0;
                    } else {
                      this.a(var4_int, param0 * var5, 8, aaa.a(false), (param0 - -1) * var5);
                      return;
                    }
                  }
                }
              } else {
                this.a(0, 0, 8, aaa.a(false), koa.b(0));
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("qa.K(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
    }

    private final boolean a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 == 59) {
          if (param0 >= ((qa) this).field_p) {
            if (param2 >= ((qa) this).field_c) {
              if (param3 <= ((qa) this).field_k) {
                if (((qa) this).field_l < 0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((qa) this).field_g = -31;
          if (param0 >= ((qa) this).field_p) {
            if (param2 >= ((qa) this).field_c) {
              if (param3 <= ((qa) this).field_k) {
                if (((qa) this).field_l < 0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, boolean param1) {
        ((qa) this).field_q = param1 ? true : false;
        if (param0 > 26) {
            return;
        }
        ((qa) this).field_p = -104;
    }

    final void a(byte param0) {
        if (!((qa) this).field_i) {
          ((qa) this).field_p = this.a(((qa) this).field_g, 0, ((qa) this).field_p);
          ((qa) this).field_c = this.a(((qa) this).field_f, 0, ((qa) this).field_c);
          ((qa) this).field_k = this.a(((qa) this).field_m, 0, ((qa) this).field_k);
          ((qa) this).field_l = this.a(((qa) this).field_j, 0, ((qa) this).field_l);
          ((qa) this).field_n.a(-8);
          if (param0 < 77) {
            return;
          } else {
            ((qa) this).field_d.a((byte) -21);
            return;
          }
        } else {
          ((qa) this).field_i = false;
          ((qa) this).field_p = ((qa) this).field_g;
          ((qa) this).field_l = ((qa) this).field_j;
          ((qa) this).field_k = ((qa) this).field_m;
          ((qa) this).field_c = ((qa) this).field_f;
          return;
        }
    }

    private final boolean a(int param0) {
        return this.a(aaa.a(false), (byte) 59, koa.b(0), 0, 0);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        ((qa) this).field_f = param1;
        ((qa) this).field_c = param1;
        ((qa) this).field_g = param0;
        ((qa) this).field_j = param4;
        ((qa) this).field_m = param3;
        ((qa) this).field_h = param2;
        ((qa) this).field_p = param0;
        ((qa) this).field_k = param3;
        ((qa) this).field_l = param4;
    }

    final void a(byte param0, int param1) {
        int var3 = 81 % ((-76 - param0) / 39);
        ((qa) this).field_n.a(0, param1);
    }

    final static void a(int param0, int param1, byte param2, int param3, nh[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = aq.field_a[0].a();
            param1 = (var6_int / 2 + param1) / var6_int * var6_int;
            var7 = aq.field_a[0].c();
            param4[0].a(param3, param5);
            param0 = (param0 + var7 / 2) / var7 * var7;
            param4[2].a(-var6_int + param1 + param3, param5);
            param4[6].a(param3, -var7 + param0 + param5);
            param4[8].a(-var6_int + (param3 + param1), param5 - -param0 - var7);
            var8 = var6_int + param3;
            L1: while (true) {
              if (param3 - (-param1 + var6_int * 2) < var8) {
                var8 = param5 + var7;
                L2: while (true) {
                  if (var8 > -(var7 * 2) + param0 + param5) {
                    var8 = var6_int + param3;
                    L3: while (true) {
                      if (var8 > param1 + param3 + -(2 * var6_int)) {
                        if (param2 > 64) {
                          break L0;
                        } else {
                          var11 = null;
                          qa.a(110, 85, (byte) -45, -18, (nh[]) null, -3);
                          return;
                        }
                      } else {
                        var9 = param5 + var7;
                        L4: while (true) {
                          if (param5 + (param0 - var7 * 2) < var9) {
                            var8 = var8 + var6_int;
                            continue L3;
                          } else {
                            param4[4].a(var8, var9);
                            var9 = var9 + var7;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    param4[3].a(param3, var8);
                    param4[5].a(param1 + (param3 - var6_int), var8);
                    var8 = var8 + var7;
                    continue L2;
                  }
                }
              } else {
                param4[1].a(var8, param5);
                param4[7].a(var8, param0 + (param5 - var7));
                var8 = var8 + var6_int;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("qa.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param5 + 41);
        }
    }

    qa(qh param0, int param1) {
        ((qa) this).field_i = true;
        ((qa) this).field_h = 8;
        try {
            ((qa) this).field_a = param0;
            ((qa) this).field_e = param1;
            ((qa) this).field_n = new fj();
            ((qa) this).field_d = new dta();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 1727002282;
    }
}
