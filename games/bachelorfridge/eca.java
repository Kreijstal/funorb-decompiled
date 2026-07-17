/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class eca extends bi {
    private po field_k;

    final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param1 == 40) {
          var3 = param0;
          if (0 != var3) {
            if (1 != var3) {
              if (var3 != -3) {
                if (-4 == var3) {
                  return 600;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                return 450;
              }
            } else {
              return 225;
            }
          } else {
            return 140;
          }
        } else {
          ((eca) this).field_k = null;
          var3 = param0;
          if (0 != var3) {
            if (1 != var3) {
              if (var3 != -3) {
                if (-4 == var3) {
                  return 600;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                return 450;
              }
            } else {
              return 225;
            }
          } else {
            return 140;
          }
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param1) {
          var3 = param0;
          if (var3 != 0) {
            if (var3 != 1) {
              if (2 != var3) {
                if (3 != var3) {
                  throw new IllegalArgumentException();
                } else {
                  return 475;
                }
              } else {
                return 260;
              }
            } else {
              return 145;
            }
          } else {
            return 60;
          }
        } else {
          this.p(97);
          var3 = param0;
          if (var3 != 0) {
            if (var3 != 1) {
              if (2 != var3) {
                if (3 != var3) {
                  throw new IllegalArgumentException();
                } else {
                  return 475;
                }
              } else {
                return 260;
              }
            } else {
              return 145;
            }
          } else {
            return 60;
          }
        }
    }

    public eca() {
        super(5);
        ((eca) this).field_k = (po) (Object) jha.field_g;
    }

    final void b(boolean param0, int param1, int param2) {
        int var5 = 0;
        String var6 = null;
        pia var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kv var11 = null;
        kv var12 = null;
        String var13 = null;
        kv var14 = null;
        String var15 = null;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param2 == 0) {
          L0: {
            var14 = ((eca) this).b(param1, (byte) 81);
            var5 = ((eca) this).d(param1, 26891) ? 1 : 0;
            var15 = ((eca) this).d(false, pj.field_b[((eca) this).field_b][param1]);
            var7 = fn.field_n;
            if (var5 == 0) {
              stackOut_14_0 = 8;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              if (!param0) {
                stackOut_13_0 = 9;
                stackIn_15_0 = stackOut_13_0;
                break L0;
              } else {
                stackOut_12_0 = 10;
                stackIn_15_0 = stackOut_12_0;
                break L0;
              }
            }
          }
          var8 = stackIn_15_0;
          var9 = ((eca) this).a(param1, true) - -((eca) this).b(param1, 40) >> 1;
          var10 = ((eca) this).a(param1, (byte) -74) + (((eca) this).a(param2 + -119, param1) >> 1);
          if (var5 == 0) {
            var14.b(var9 - (var14.field_n >> 1), var10 + -22, 128);
            ((po) (Object) var7).a(var15, var9, var10 + 6, var8, -1);
            return;
          } else {
            var14.e(-(var14.field_n >> 1) + var9, var10 + -22);
            ((po) (Object) var7).a(var15, var9, var10 + 6, var8, -1);
            return;
          }
        } else {
          L1: {
            ((eca) this).field_k = null;
            var12 = ((eca) this).b(param1, (byte) 81);
            var11 = var12;
            var5 = ((eca) this).d(param1, 26891) ? 1 : 0;
            var13 = ((eca) this).d(false, pj.field_b[((eca) this).field_b][param1]);
            var6 = var13;
            var7 = fn.field_n;
            if (var5 == 0) {
              stackOut_5_0 = 8;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (!param0) {
                stackOut_4_0 = 9;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 10;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          var8 = stackIn_6_0;
          var9 = ((eca) this).a(param1, true) - -((eca) this).b(param1, 40) >> 1;
          var10 = ((eca) this).a(param1, (byte) -74) + (((eca) this).a(param2 + -119, param1) >> 1);
          if (var5 == 0) {
            var12.b(var9 - (var12.field_n >> 1), var10 + -22, 128);
            ((po) (Object) var7).a(var13, var9, var10 + 6, var8, -1);
            return;
          } else {
            var12.e(-(var12.field_n >> 1) + var9, var10 + -22);
            ((po) (Object) var7).a(var13, var9, var10 + 6, var8, -1);
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, String param3, byte param4) {
        int var6_int = 0;
        try {
            if (param4 <= 71) {
                this.q(-87);
            }
            var6_int = oja.field_a[param2] + oja.field_a[1 + param2] >> 1;
            ((eca) this).field_k.a(param3, var6_int, param0, param1, -1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "eca.UA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    private final String e(byte param0) {
        int var2 = 0;
        String[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_24_0 = null;
        String stackIn_29_0 = null;
        String stackIn_33_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        String stackOut_28_0 = null;
        String stackOut_27_0 = null;
        String stackOut_23_0 = null;
        String stackOut_22_0 = null;
        String stackOut_18_0 = null;
        String stackOut_17_0 = null;
        String stackOut_13_0 = null;
        String stackOut_12_0 = null;
        var10 = BachelorFridge.field_y;
        var2 = 0;
        var3 = ri.field_b.field_k[ks.field_i];
        var4 = ri.field_b.field_g[ks.field_i];
        var5 = ((eca) this).field_k.field_u + 108;
        this.a(0, od.field_z, 0);
        var6 = 0;
        this.a(1, hea.field_q, 0);
        this.a(2, aj.field_b, 0);
        this.a(3, ej.field_n, 0);
        this.a(4, es.field_h, 0);
        this.a(5, eg.field_q, 0);
        var7 = 0;
        L0: while (true) {
          if (var7 >= 10) {
            if (var6 == 0) {
              if (ri.field_b.field_f == 0) {
                if (ri.field_b.field_h == 0) {
                  if (ri.field_b.field_l == 0) {
                    L1: {
                      if (var2 == 0) {
                        stackOut_32_0 = gea.field_g;
                        stackIn_33_0 = stackOut_32_0;
                        break L1;
                      } else {
                        stackOut_31_0 = "";
                        stackIn_33_0 = stackOut_31_0;
                        break L1;
                      }
                    }
                    return stackIn_33_0;
                  } else {
                    L2: {
                      var7 = 3518976;
                      this.a(cha.field_l, var5, ri.field_b.field_l, 22442, ri.field_b.field_j, ri.field_b.field_f, ri.field_b.field_h, var7, -1);
                      var2 = 1;
                      if (var2 == 0) {
                        stackOut_28_0 = gea.field_g;
                        stackIn_29_0 = stackOut_28_0;
                        break L2;
                      } else {
                        stackOut_27_0 = "";
                        stackIn_29_0 = stackOut_27_0;
                        break L2;
                      }
                    }
                    return stackIn_29_0;
                  }
                } else {
                  L3: {
                    var7 = 3518976;
                    this.a(cha.field_l, var5, ri.field_b.field_l, 22442, ri.field_b.field_j, ri.field_b.field_f, ri.field_b.field_h, var7, -1);
                    var2 = 1;
                    if (var2 == 0) {
                      stackOut_23_0 = gea.field_g;
                      stackIn_24_0 = stackOut_23_0;
                      break L3;
                    } else {
                      stackOut_22_0 = "";
                      stackIn_24_0 = stackOut_22_0;
                      break L3;
                    }
                  }
                  return stackIn_24_0;
                }
              } else {
                L4: {
                  var7 = 3518976;
                  this.a(cha.field_l, var5, ri.field_b.field_l, 22442, ri.field_b.field_j, ri.field_b.field_f, ri.field_b.field_h, var7, -1);
                  var2 = 1;
                  if (var2 == 0) {
                    stackOut_18_0 = gea.field_g;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = "";
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                return stackIn_19_0;
              }
            } else {
              L5: {
                if (var2 == 0) {
                  stackOut_13_0 = gea.field_g;
                  stackIn_14_0 = stackOut_13_0;
                  break L5;
                } else {
                  stackOut_12_0 = "";
                  stackIn_14_0 = stackOut_12_0;
                  break L5;
                }
              }
              return stackIn_14_0;
            }
          } else {
            if (null != var3[var7]) {
              if (!var3[var7].equals((Object) (Object) "")) {
                L6: {
                  var8 = 16777215;
                  var9 = var3[var7];
                  if (!wb.a((byte) 52, var9)) {
                    break L6;
                  } else {
                    var8 = 16760864;
                    var6 = 1;
                    break L6;
                  }
                }
                var2 = 1;
                this.a(var9, var5, var4[3 + 4 * var7], 22442, var4[var7 * 4], var4[var7 * 4 + 1], var4[2 + var7 * 4], var8, var7);
                var5 += 23;
                var7++;
                continue L0;
              } else {
                var5 += 23;
                var7++;
                continue L0;
              }
            } else {
              var5 += 23;
              var7++;
              continue L0;
            }
          }
        }
    }

    private final void q(int param0) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        L0: {
          var4 = BachelorFridge.field_y;
          if (ri.field_b == null) {
            ri.field_b = au.a(7, 16757, 0, 10);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 1) {
          if (ri.field_b.field_p) {
            if (null != ri.field_b.field_k) {
              var9 = this.e((byte) 9);
              var3 = 95 - -((eca) this).field_k.field_u - -253;
              ((eca) this).field_k.a(var9, 320, var3, 3518976, -1);
              return;
            } else {
              var10 = qe.field_d;
              var3 = 95 - -((eca) this).field_k.field_u - -253;
              ((eca) this).field_k.a(var10, 320, var3, 3518976, -1);
              return;
            }
          } else {
            var8 = fo.field_b;
            var3 = 95 - -((eca) this).field_k.field_u - -253;
            ((eca) this).field_k.a(var8, 320, var3, 3518976, -1);
            return;
          }
        } else {
          ((eca) this).field_k = null;
          if (ri.field_b.field_p) {
            if (null != ri.field_b.field_k) {
              var6 = this.e((byte) 9);
              var3 = 95 - -((eca) this).field_k.field_u - -253;
              ((eca) this).field_k.a(var6, 320, var3, 3518976, -1);
              return;
            } else {
              var7 = qe.field_d;
              var3 = 95 - -((eca) this).field_k.field_u - -253;
              ((eca) this).field_k.a(var7, 320, var3, 3518976, -1);
              return;
            }
          } else {
            var5 = fo.field_b;
            var3 = 95 - -((eca) this).field_k.field_u - -253;
            ((eca) this).field_k.a(var5, 320, var3, 3518976, -1);
            return;
          }
        }
    }

    final void l(int param0) {
        ((eca) this).i(-12988);
        j.a(wa.field_l, 40, 16760896, true, 320, false);
        dg.a(40, 60, 560, 335, 20, 0, 80);
        if (param0 == 9) {
          if (bp.e(param0 + -29928)) {
            this.p(-118);
            ((eca) this).c(true);
            return;
          } else {
            this.q(1);
            ((eca) this).c(true);
            return;
          }
        } else {
          ((eca) this).field_k = null;
          if (bp.e(param0 + -29928)) {
            this.p(-118);
            ((eca) this).c(true);
            return;
          } else {
            this.q(1);
            ((eca) this).c(true);
            return;
          }
        }
    }

    final kv b(int param0, byte param1) {
        int var3 = 0;
        if (param1 >= 62) {
          var3 = param0;
          if (var3 != 3) {
            if (var3 == 2) {
              return jt.field_g;
            } else {
              return ana.field_r;
            }
          } else {
            return gj.field_F;
          }
        } else {
          return null;
        }
    }

    private final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10_int = 0;
        RuntimeException var10 = null;
        String var11 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var10_int = param2 + param5 + param6;
              if (param3 == 22442) {
                break L1;
              } else {
                ((eca) this).field_k = null;
                break L1;
              }
            }
            L2: {
              if (param8 != -1) {
                ((eca) this).field_k.b(param8 + 1 + ". ", 70, param1, param7, -1);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (0 != var10_int) {
                param6 = (param6 * 200 - -var10_int) / (2 * var10_int);
                param2 = (var10_int + 200 * param2) / (var10_int * 2);
                param5 = (param5 * 200 + var10_int) / (2 * var10_int);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ((eca) this).field_k.c(param0, 80, param1, param7, -1);
              if (var10_int >= 50) {
                stackOut_10_0 = "50+";
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = Integer.toString(var10_int);
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            }
            var11 = stackIn_11_0;
            this.a(param1, param7, 1, Integer.toString(param4), (byte) 119);
            this.a(param1, param7, 2, var11, (byte) 109);
            this.a(param1, param7, 3, param5 + "%", (byte) 81);
            this.a(param1, param7, 4, param2 + "%", (byte) 73);
            this.a(param1, param7, 5, param6 + "%", (byte) 121);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var10;
            stackOut_13_1 = new StringBuilder().append("eca.L(");
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
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    private final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        pia var5 = null;
        try {
            if (param2 != param0) {
                dg.b(oja.field_a[param0], 80, 276, 0, 64);
            }
            var4_int = oja.field_a[1 + param0] + oja.field_a[param0] >> 1;
            var5 = fn.field_n;
            ((po) (Object) var5).a(param1, var4_int, 100, 10, -1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "eca.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final int a(int param0, int param1) {
        int var3 = 114 % ((param0 - -64) / 38);
        return 40;
    }

    final int a(int param0, byte param1) {
        if (param1 >= -38) {
            return -97;
        }
        return 418;
    }

    final boolean c(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 == 19950) {
          if (bp.e(param1 ^ -14641)) {
            L0: {
              if (param0 < 2) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              if (param0 == 2) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    private final void p(int param0) {
        ((eca) this).field_k.a(d.field_E, 320, ((eca) this).field_k.field_u + 364, 3518976, -1);
        if (param0 >= -113) {
            this.a((String) null, -62, 37, -6, 83, 78, 31, -18, -51);
        }
    }

    static {
    }
}
