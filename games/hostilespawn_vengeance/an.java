/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends ql {
    private v[] field_i;
    static int field_q;
    private we[] field_k;
    static bd field_d;
    private boolean field_o;
    static bd field_l;
    static int[] field_r;
    private oc[] field_m;
    private oc[] field_e;
    private oc[] field_h;
    private v[] field_p;
    static String field_f;
    static bd field_j;
    static float field_n;
    private oc field_g;

    final boolean b(int param0) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        var2 = -81 / ((38 - param0) / 53);
        if (9 == ha.field_t) {
          ((an) this).field_k[0].a((byte) -46);
          ((an) this).field_k[1].a((byte) -46);
          return false;
        } else {
          L0: {
            L1: {
              if (tb.field_N != 0) {
                break L1;
              } else {
                if (((an) this).field_o) {
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var3 = -74 / ((param0 - -48) / 38);
        var2 = 0;
        L0: while (true) {
          if (var2 >= 2) {
            return;
          } else {
            L1: {
              if (((an) this).field_p[var2].field_l <= 0) {
                break L1;
              } else {
                L2: {
                  if (((an) this).field_p[var2].a((byte) -87)) {
                    break L2;
                  } else {
                    if (!ln.field_a.field_e[((an) this).field_m[var2].b(-4)]) {
                      ((an) this).field_p[var2].field_l = -1;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!ln.field_a.field_e[((an) this).field_m[var2].b(-4)]) {
                  break L1;
                } else {
                  if (mm.field_m[0].field_j.field_g > ((an) this).field_m[var2].field_g - -1) {
                    ((an) this).field_p[var2].field_l = -1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (0 < ((an) this).field_i[var2].field_l) {
              if (tb.field_N == 0) {
                if (!((an) this).field_o) {
                  if (!((an) this).field_i[var2].a((byte) -54)) {
                    ((an) this).field_i[var2].field_l = -1;
                    var2++;
                    continue L0;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final void d(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        oc var9 = null;
        int var10 = 0;
        int var11 = 0;
        oj var12 = null;
        int stackIn_21_0 = 0;
        double stackIn_22_0 = 0.0;
        double stackIn_23_0 = 0.0;
        double stackIn_24_0 = 0.0;
        int stackIn_24_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        double stackOut_21_0 = 0.0;
        double stackOut_23_0 = 0.0;
        int stackOut_23_1 = 0;
        double stackOut_22_0 = 0.0;
        int stackOut_22_1 = 0;
        L0: {
          var11 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            ((an) this).field_g = null;
            break L0;
          }
        }
        var12 = mm.field_m[0];
        var3 = 0;
        L1: while (true) {
          L2: {
            if (var3 >= 2) {
              break L2;
            } else {
              if (0 == ((an) this).field_p[var3].field_l) {
                var4 = ((an) this).field_m[var3].b(param0 + -3);
                if (ln.field_a.field_e[var4]) {
                  ((an) this).field_p[var3].field_l = -100 + 24 * ((an) this).field_m[var3].field_e;
                  ((an) this).field_p[var3].field_d = 48 + ((an) this).field_m[var3].field_g * 24;
                  ((an) this).field_p[-var3 + 1].field_l = -1;
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
          L3: {
            if (9 == ha.field_t) {
              var3 = 0;
              L4: while (true) {
                if (2 <= var3) {
                  break L3;
                } else {
                  if (((an) this).field_e[var3].field_e >= 0) {
                    var4 = ih.a(var12.field_j, (byte) -78, ((an) this).field_e[var3]);
                    if (var4 < 2) {
                      L5: {
                        if (((an) this).field_e[1 + -var3].field_e >= 0) {
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          break L5;
                        } else {
                          stackOut_19_0 = 1;
                          stackIn_21_0 = stackOut_19_0;
                          break L5;
                        }
                      }
                      L6: {
                        var5 = stackIn_21_0;
                        stackOut_21_0 = (double)(((an) this).field_e[var3].field_e - -1);
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var5 == 0) {
                          stackOut_23_0 = stackIn_23_0;
                          stackOut_23_1 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          break L6;
                        } else {
                          stackOut_22_0 = stackIn_22_0;
                          stackOut_22_1 = 1;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_24_1 = stackOut_22_1;
                          break L6;
                        }
                      }
                      ca.a(stackIn_24_0, stackIn_24_1, (double)((an) this).field_e[var3].field_g + 0.5, true, 0);
                      ((an) this).field_e[var3].field_e = -1;
                      ((an) this).field_o = true;
                      var6 = ((an) this).field_h[var3].b(param0 ^ 3);
                      ln.field_a.field_c[var6 - -ln.field_a.field_d] = 4;
                      ln.field_a.field_c[-ln.field_a.field_d + var6] = 4;
                      ln.field_a.field_c[var6] = 4;
                      kd.a(0, 1);
                      nh.field_E.a((byte) 46, ((an) this).field_g);
                      ((an) this).field_i[var3].field_l = 24 * var12.field_j.field_e - 100;
                      ((an) this).field_i[var3].field_d = var12.field_j.field_g * 24 + -98;
                      if (var3 == 0) {
                        var7 = ((an) this).field_h[2].b(-4) + -(ln.field_a.field_d * 2);
                        var8 = -(ln.field_a.field_d * 2) + var6;
                        var9_int = -2;
                        L7: while (true) {
                          if (var9_int > 1) {
                            var9 = new oc(((an) this).field_h[var3]);
                            mm.field_m[el.field_j] = new oj(var9, 2, rl.field_c);
                            var9.field_g = var9.field_g - 1;
                            var9.field_e = var9.field_e - 1;
                            el.field_j = el.field_j + 1;
                            mm.field_m[el.field_j] = new oj(var9, 2, rl.field_c);
                            var9.field_e = var9.field_e + 2;
                            el.field_j = el.field_j + 1;
                            var9.field_g = var9.field_g - 1;
                            mm.field_m[el.field_j] = new oj(var9, 2, rl.field_c);
                            var9.field_g = var9.field_g + 3;
                            var9.field_e = var9.field_e - 3;
                            el.field_j = el.field_j + 1;
                            mm.field_m[el.field_j] = new oj(var9, 2, rl.field_c);
                            el.field_j = el.field_j + 1;
                            var3++;
                            continue L4;
                          } else {
                            var10 = -6;
                            L8: while (true) {
                              if (var10 > 4) {
                                var8 = var8 + ln.field_a.field_d;
                                var7 = var7 + ln.field_a.field_d;
                                var9_int++;
                                continue L7;
                              } else {
                                ln.field_a.field_c[var8 - -var10] = ln.field_a.field_c[var7 - -var10];
                                ln.field_a.field_y[var10 + var8] = ln.field_a.field_y[var7 - -var10];
                                ln.field_a.field_B[var8 - -var10] = ln.field_a.field_B[var7 + var10];
                                ln.field_a.field_e[var8 - -var10] = ln.field_a.field_e[var10 + var7];
                                ln.field_a.field_o[var10 + var8] = ln.field_a.field_o[var7 + var10];
                                var10++;
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        ln.field_a.field_c[ln.field_a.field_d + var6] = 4;
                        ln.field_a.field_c[-ln.field_a.field_d + var6] = 4;
                        vj.field_w[dk.field_o] = new qm(ln.field_a, ((an) this).field_h[var3], 147, rl.field_c, 0, false);
                        dk.field_o = dk.field_o + 1;
                        var3++;
                        continue L4;
                      }
                    } else {
                      var3++;
                      continue L4;
                    }
                  } else {
                    var3++;
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          L9: {
            if (!((an) this).field_o) {
              break L9;
            } else {
              if (dn.field_i == of.field_d) {
                break L9;
              } else {
                ((an) this).field_o = false;
                tb.field_N = 150;
                break L9;
              }
            }
          }
          L10: {
            if (0 != ha.field_t) {
              break L10;
            } else {
              super.d(-1);
              break L10;
            }
          }
          return;
        }
    }

    final static jj a(int param0, int param1, String param2) {
        jj var3 = null;
        RuntimeException var3_ref = null;
        jj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new jj(false);
              if (param1 == -10) {
                break L1;
              } else {
                field_n = -0.3971230387687683f;
                break L1;
              }
            }
            var3.field_l = param2;
            var3.field_a = param0;
            stackOut_2_0 = (jj) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("an.A(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        ((an) this).field_g = new oc(ln.field_a.field_v[param0], ln.field_a.field_v[1]);
        ((an) this).field_e = new oc[2];
        ((an) this).field_e[0] = new oc(ln.field_a.field_v[2], ln.field_a.field_v[3]);
        ((an) this).field_e[1] = new oc(ln.field_a.field_v[4], ln.field_a.field_v[5]);
        ((an) this).field_k[0] = new we(((an) this).field_e[0]);
        ((an) this).field_k[1] = new we(((an) this).field_e[1]);
        ((an) this).field_h = new oc[3];
        ((an) this).field_h[0] = new oc(ln.field_a.field_v[6], ln.field_a.field_v[7]);
        ((an) this).field_h[1] = new oc(ln.field_a.field_v[8], ln.field_a.field_v[9]);
        ((an) this).field_h[2] = new oc(ln.field_a.field_v[14], ln.field_a.field_v[15]);
        ((an) this).field_m = new oc[2];
        ((an) this).field_m[0] = new oc(ln.field_a.field_v[10], ln.field_a.field_v[11]);
        ((an) this).field_m[1] = new oc(ln.field_a.field_v[12], ln.field_a.field_v[13]);
        ((an) this).field_p = new v[2];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 2) {
            ((an) this).field_i = new v[2];
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                kd.a(9, 1);
                nh.field_E.a(-1, 8360, -1);
                ((an) this).field_o = false;
                return;
              } else {
                ((an) this).field_i[var2] = new v(ra.field_f, 0, 0, 200, false);
                var2++;
                continue L1;
              }
            }
          } else {
            ((an) this).field_p[var2] = new v(eg.field_l, 0, 0, 200, false);
            ((an) this).field_p[var2].field_l = 0;
            var2++;
            continue L0;
          }
        }
    }

    final String a(boolean param0) {
        int var2 = 0;
        if (!param0) {
          var2 = ha.field_t;
          if (var2 == 9) {
            return ih.field_u;
          } else {
            if (var2 == 0) {
              return q.field_a;
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void c(int param0) {
        if (!(wk.field_h)) {
            ti.a(232, (byte) -123, 23);
        }
        if (param0 != 0) {
            Object var3 = null;
            jj discarded$0 = an.a(84, -101, (String) null);
        }
    }

    public static void g() {
        field_j = null;
        field_d = null;
        field_l = null;
        field_f = null;
        field_r = null;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param2 <= 1) {
                if (param2 == 1) {
                  stackOut_11_0 = var3_int * param1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                L2: {
                  if (0 == (param2 & 1)) {
                    break L2;
                  } else {
                    var3_int = var3_int * param1;
                    break L2;
                  }
                }
                param2 = param2 >> 1;
                param1 = param1 * param1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "an.B(" + 121 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    public an() {
        ((an) this).field_k = new we[2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0.0f;
        field_q = 20;
        field_r = new int[8];
        field_f = "to return to the normal view.";
        field_r[6] = 2;
        field_r[5] = 3;
        field_r[3] = 1;
        field_r[0] = -1;
        field_r[7] = 3;
        field_r[2] = 0;
        field_r[4] = 2;
        field_r[1] = 0;
    }
}
