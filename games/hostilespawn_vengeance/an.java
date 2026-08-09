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
        int var2;
        int stackIn_7_0 = 0;
        var2 = -81 / ((38 - param0) / 53);
        if (9 == ha.field_t) {
          this.field_k[0].a((byte) -46);
          this.field_k[1].a((byte) -46);
          return false;
        } else {
          L0: {
            L1: {
              if (tb.field_N != 0) {
                break L1;
              } else {
                if (this.field_o) {
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_7_0 = 0;
            break L0;
          }
          return stackIn_7_0 != 0;
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var3 = -74 / ((param0 - -48) / 38);
        var2 = 0;
        L0: while (true) {
          if (var2 >= 2) {
            return;
          } else {
            L1: {
              if (this.field_p[var2].field_l <= 0) {
                break L1;
              } else {
                L2: {
                  if (this.field_p[var2].a((byte) -87)) {
                    break L2;
                  } else {
                    if (!ln.field_a.field_e[this.field_m[var2].b(-4)]) {
                      this.field_p[var2].field_l = -1;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!ln.field_a.field_e[this.field_m[var2].b(-4)]) {
                  break L1;
                } else {
                  if (mm.field_m[0].field_j.field_g > this.field_m[var2].field_g - -1) {
                    this.field_p[var2].field_l = -1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (0 < this.field_i[var2].field_l) {
              if (-1 == (tb.field_N ^ -1)) {
                if (!this.field_o) {
                  if (!this.field_i[var2].a((byte) -54)) {
                    this.field_i[var2].field_l = -1;
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
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        double stackIn_27_0 = 0.0;
        double stackIn_28_0 = 0.0;
        int stackIn_28_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9_int;
        oc var9;
        int var10;
        int var11;
        oj var12;
        L0: {
          var11 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            this.field_g = (oc) null;
            break L0;
          }
        }
        var12 = mm.field_m[0];
        var3 = 0;
        L1: while (true) {
          L2: {
            if ((var3 ^ -1) <= -3) {
              break L2;
            } else {
              if (0 == this.field_p[var3].field_l) {
                var4 = this.field_m[var3].b(param0 + -3);
                if (ln.field_a.field_e[var4]) {
                  this.field_p[var3].field_l = -100 + 24 * this.field_m[var3].field_e;
                  this.field_p[var3].field_d = 48 + this.field_m[var3].field_g * 24;
                  this.field_p[-var3 + 1].field_l = -1;
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
            L4: {
              if (9 == ha.field_t) {
                var3 = 0;
                L5: while (true) {
                  if (2 <= var3) {
                    break L4;
                  } else {
                    stackIn_18_0 = this.field_e[var3].field_e;

                    if (stackIn_18_0 >= 0) {
                      var4 = ih.a(var12.field_j, (byte) -78, this.field_e[var3]);
                      if (-3 < (var4 ^ -1)) {
                        L6: {
                          if ((this.field_e[1 + -var3].field_e ^ -1) <= -1) {
                            stackIn_25_0 = 0;
                            break L6;
                          } else {
                            stackIn_25_0 = 1;
                            break L6;
                          }
                        }
                        L7: {
                          var5 = stackIn_25_0;
                          stackIn_27_0 = (double)(this.field_e[var3].field_e - -1);

                          if (var5 == 0) {
                            stackIn_28_0 = stackIn_27_0;
                            stackIn_28_1 = 0;
                            break L7;
                          } else {
                            stackIn_28_0 = stackIn_27_0;
                            stackIn_28_1 = 1;
                            break L7;
                          }
                        }
                        ca.a(stackIn_28_0, stackIn_28_1, (double)this.field_e[var3].field_g + 0.5, true, 0);
                        this.field_e[var3].field_e = -1;
                        this.field_o = true;
                        var6 = this.field_h[var3].b(param0 ^ 3);
                        ln.field_a.field_c[var6 - -ln.field_a.field_d] = 4;
                        ln.field_a.field_c[-ln.field_a.field_d + var6] = 4;
                        ln.field_a.field_c[var6] = 4;
                        kd.a(0, 1);
                        nh.field_E.a((byte) 46, this.field_g);
                        this.field_i[var3].field_l = 24 * var12.field_j.field_e - 100;
                        this.field_i[var3].field_d = var12.field_j.field_g * 24 + -98;
                        if (var3 == 0) {
                          var7 = this.field_h[2].b(-4) + -(ln.field_a.field_d * 2);
                          var8 = -(ln.field_a.field_d * 2) + var6;
                          var9_int = -2;
                          L8: while (true) {
                            if (var9_int > 1) {
                              var9 = new oc(this.field_h[var3]);
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
                              continue L5;
                            } else {
                              var10 = -6;
                              L9: while (true) {
                                if ((var10 ^ -1) < -5) {
                                  var8 = var8 + ln.field_a.field_d;
                                  var7 = var7 + ln.field_a.field_d;
                                  var9_int++;
                                  continue L8;
                                } else {
                                  ln.field_a.field_c[var8 - -var10] = ln.field_a.field_c[var7 - -var10];
                                  ln.field_a.field_y[var10 + var8] = ln.field_a.field_y[var7 - -var10];
                                  ln.field_a.field_B[var8 - -var10] = ln.field_a.field_B[var7 + var10];
                                  ln.field_a.field_e[var8 - -var10] = ln.field_a.field_e[var10 + var7];
                                  ln.field_a.field_o[var10 + var8] = ln.field_a.field_o[var7 + var10];
                                  var10++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        } else {
                          ln.field_a.field_c[ln.field_a.field_d + var6] = 4;
                          ln.field_a.field_c[-ln.field_a.field_d + var6] = 4;
                          vj.field_w[dk.field_o] = new qm(ln.field_a, this.field_h[var3], 147, rl.field_c, 0, false);
                          dk.field_o = dk.field_o + 1;
                          var3++;
                          continue L5;
                        }
                      } else {
                        var3++;
                        continue L5;
                      }
                    } else {
                      var3++;
                      continue L5;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            if (!this.field_o) {
              break L3;
            } else {
              if (dn.field_i == of.field_d) {
                break L3;
              } else {
                this.field_o = false;
                tb.field_N = 150;
                break L3;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (jj) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("an.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        this.field_g = new oc(ln.field_a.field_v[param0], ln.field_a.field_v[1]);
        this.field_e = new oc[2];
        this.field_e[0] = new oc(ln.field_a.field_v[2], ln.field_a.field_v[3]);
        this.field_e[1] = new oc(ln.field_a.field_v[4], ln.field_a.field_v[5]);
        this.field_k[0] = new we(this.field_e[0]);
        this.field_k[1] = new we(this.field_e[1]);
        this.field_h = new oc[3];
        this.field_h[0] = new oc(ln.field_a.field_v[6], ln.field_a.field_v[7]);
        this.field_h[1] = new oc(ln.field_a.field_v[8], ln.field_a.field_v[9]);
        this.field_h[2] = new oc(ln.field_a.field_v[14], ln.field_a.field_v[15]);
        this.field_m = new oc[2];
        this.field_m[0] = new oc(ln.field_a.field_v[10], ln.field_a.field_v[11]);
        this.field_m[1] = new oc(ln.field_a.field_v[12], ln.field_a.field_v[13]);
        this.field_p = new v[2];
        for (var2 = 0; (var2 ^ -1) > -3; var2++) {
            this.field_p[var2] = new v(eg.field_l, 0, 0, 200, false);
            this.field_p[var2].field_l = 0;
        }
        this.field_i = new v[2];
        for (var2 = 0; -3 < (var2 ^ -1); var2++) {
            this.field_i[var2] = new v(ra.field_f, 0, 0, 200, false);
        }
        kd.a(9, 1);
        nh.field_E.a(-1, 8360, -1);
        this.field_o = false;
    }

    final String a(boolean param0) {
        if (param0) {
            return (String) null;
        }
        int var2 = ha.field_t;
        if (-10 == (var2 ^ -1) || var2 != 0) {
            return ih.field_u;
        }
        return q.field_a;
    }

    final void c(int param0) {
        if (!(wk.field_h)) {
            ti.a(232, (byte) -123, 23);
        }
        if (param0 != 0) {
            String var3 = (String) null;
            an.a(84, -101, (String) null);
        }
    }

    public static void g(int param0) {
        field_j = null;
        field_d = null;
        if (param0 != 2) {
            field_q = -117;
        }
        field_l = null;
        field_f = null;
        field_r = null;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (-2 <= (param2 ^ -1)) {
                if (param0 >= 97) {
                  if ((param2 ^ -1) == -2) {
                    stackIn_12_0 = var3_int * param1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return var3_int;
                  }
                } else {
                  stackIn_8_0 = 73;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
          throw wg.a((Throwable) ((Object) var3), "an.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_12_0;
        }
    }

    public an() {
        this.field_k = new we[2];
    }

    static {
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
