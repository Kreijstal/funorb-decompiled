/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ej {
    static boolean field_l;
    static int field_p;
    private mf field_n;
    static int field_q;
    nc field_m;
    static da field_o;
    e field_r;
    static int field_s;

    final ej a() {
        hg var1 = (hg) ((Object) this.field_m.a((byte) 51));
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_w)) {
            return (ej) ((Object) var1.field_w);
        }
        return this.b();
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 42 % ((param1 - 47) / 54);
            var3 = param0.charAt(0);
            var4 = 1;
            L1: while (true) {
              if (param0.length() <= var4) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var3 == param0.charAt(var4)) {
                  var4++;
                  continue L1;
                } else {
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("lh.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hg var6 = null;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            this.field_r.a(param0, param1, param2);
            var6 = (hg) ((Object) this.field_m.a((byte) 51));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!this.field_n.b(var6, -1642423728)) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_t) {
                        this.a(param0, var5 + var4_int, var6, var4_int, var5, (byte) -117);
                        var6.field_t = var6.field_t - var5;
                        break L2;
                      } else {
                        this.a(param0, var5 + var4_int, var6, var4_int, var6.field_t, (byte) -117);
                        var5 = var5 - var6.field_t;
                        var4_int = var4_int + var6.field_t;
                        if (!this.field_n.a(var4_int, param0, var5, 100, var6)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (hg) ((Object) this.field_m.b(-51));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("lh.AA(");

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
          throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int d() {
        return 0;
    }

    public static void d(int param0) {
        if (param0 > -67) {
            return;
        }
        field_o = null;
    }

    private final void a(byte param0, hg param1, int param2) {
        mf stackIn_8_0 = null;
        hg stackIn_8_1 = null;
        mf stackIn_9_0 = null;
        hg stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (0 == (this.field_n.field_U[param1.field_z] & 4)) {
                break L1;
              } else {
                if (param1.field_k < 0) {
                  var4_int = this.field_n.field_J[param1.field_z] / gj.field_s;
                  var5 = (-param1.field_C + var4_int + 1048575) / var4_int;
                  param1.field_C = var4_int * param2 + param1.field_C & 1048575;
                  if (param2 >= var5) {
                    L2: {
                      if (this.field_n.field_z[param1.field_z] == 0) {
                        param1.field_w = qi.a(param1.field_u, param1.field_w.j(), param1.field_w.e(), param1.field_w.f());
                        break L2;
                      } else {
                        L3: {
                          param1.field_w = qi.a(param1.field_u, param1.field_w.j(), 0, param1.field_w.f());
                          stackIn_8_0 = this.field_n;

                          stackIn_8_1 = (hg) (param1);

                          if ((param1.field_p.field_s[param1.field_o] ^ -1) <= -1) {
                            stackIn_9_0 = (mf) ((Object) stackIn_8_0);
                            stackIn_9_1 = (hg) ((Object) stackIn_8_1);
                            stackIn_9_2 = 0;
                            break L3;
                          } else {
                            stackIn_9_0 = (mf) ((Object) stackIn_8_0);
                            stackIn_9_1 = (hg) ((Object) stackIn_8_1);
                            stackIn_9_2 = 1;
                            break L3;
                          }
                        }
                        ((mf) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2 != 0, false);
                        break L2;
                      }
                    }
                    L4: {
                      if ((param1.field_p.field_s[param1.field_o] ^ -1) <= -1) {
                        break L4;
                      } else {
                        param1.field_w.d(-1);
                        break L4;
                      }
                    }
                    param2 = param1.field_C / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            param1.field_w.a(param2);
            if (param0 < -43) {
              break L0;
            } else {
              field_q = 96;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("lh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    private final void a(int[] param0, int param1, hg param2, int param3, int param4, byte param5) {
        mf stackIn_12_0 = null;
        hg stackIn_12_1 = null;
        mf stackIn_13_0 = null;
        hg stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qi var11 = null;
        int var12 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & this.field_n.field_U[param2.field_z]) == 0) {
                break L1;
              } else {
                if (0 <= param2.field_k) {
                  break L1;
                } else {
                  var7_int = this.field_n.field_J[param2.field_z] / gj.field_s;
                  L2: while (true) {
                    var8 = (1048575 + (var7_int + -param2.field_C)) / var7_int;
                    if (param4 >= var8) {
                      L3: {
                        param2.field_w.a(param0, param3, var8);
                        param3 = param3 + var8;
                        param4 = param4 - var8;
                        param2.field_C = param2.field_C + (var8 * var7_int + -1048576);
                        var9 = gj.field_s / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param2.field_w;
                        if (0 != this.field_n.field_z[param2.field_z]) {
                          L5: {
                            param2.field_w = qi.a(param2.field_u, var11.j(), 0, var11.f());
                            stackIn_12_0 = this.field_n;

                            stackIn_12_1 = (hg) (param2);

                            if ((param2.field_p.field_s[param2.field_o] ^ -1) <= -1) {
                              stackIn_13_0 = (mf) ((Object) stackIn_12_0);
                              stackIn_13_1 = (hg) ((Object) stackIn_12_1);
                              stackIn_13_2 = 0;
                              break L5;
                            } else {
                              stackIn_13_0 = (mf) ((Object) stackIn_12_0);
                              stackIn_13_1 = (hg) ((Object) stackIn_12_1);
                              stackIn_13_2 = 1;
                              break L5;
                            }
                          }
                          ((mf) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2 != 0, false);
                          param2.field_w.e(var9, var11.e());
                          break L4;
                        } else {
                          param2.field_w = qi.a(param2.field_u, var11.j(), var11.e(), var11.f());
                          break L4;
                        }
                      }
                      L6: {
                        if (-1 >= (param2.field_p.field_s[param2.field_o] ^ -1)) {
                          break L6;
                        } else {
                          param2.field_w.d(-1);
                          break L6;
                        }
                      }
                      var11.e(var9);
                      var11.a(param0, param3, -param3 + param1);
                      if (!var11.h()) {
                        continue L2;
                      } else {
                        this.field_r.a(var11);
                        continue L2;
                      }
                    } else {
                      param2.field_C = param2.field_C + var7_int * param4;
                      break L1;
                    }
                  }
                }
              }
            }
            param2.field_w.a(param0, param3, param4);
            if (param5 == -117) {
              break L0;
            } else {
              this.field_m = (nc) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("lh.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final ej b() {
        hg var1;
        int var2;
        var2 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          var1 = (hg) ((Object) this.field_m.b(-60));
          if (var1 != null) {
            if (var1.field_w != null) {
              return (ej) ((Object) var1.field_w);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0) {
        int var2;
        hg var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = SolKnight.field_L ? 1 : 0;
        this.field_r.a(param0);
        var3 = (hg) ((Object) this.field_m.a((byte) 51));
        L0: while (true) {
          if (var3 != null) {
            stackIn_4_0 = this.field_n.b(var3, -1642423728);
            L1: {
              if (stackIn_4_0) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_t) {
                    this.a((byte) -107, var3, var2);
                    var3.field_t = var3.field_t - var2;
                    break L1;
                  } else {
                    this.a((byte) -126, var3, var3.field_t);
                    var2 = var2 - var3.field_t;
                    if (this.field_n.a(0, (int[]) null, var2, 100, var3)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (hg) ((Object) this.field_m.b(-126));
            continue L0;
          } else {
            return;
          }
        }
    }

    lh(mf param0) {
        this.field_m = new nc();
        this.field_r = new e();
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = true;
    }
}
