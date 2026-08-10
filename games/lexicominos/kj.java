/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends lk {
    ng field_n;
    static long[] field_q;
    private hl field_l;
    static String field_p;
    static boolean field_o;
    hk field_m;

    final lk b() {
        cb var1;
        int var2;
        var2 = Lexicominos.field_L ? 1 : 0;
        L0: while (true) {
          var1 = (cb) ((Object) this.field_n.f(2));
          if (var1 != null) {
            if (null != var1.field_C) {
              return (lk) ((Object) var1.field_C);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int param0, cb param1, int param2) {
        hl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cb stackIn_8_2 = null;
        hl stackIn_9_0;
        int stackIn_9_1;
        cb stackIn_9_2;
        int stackIn_9_3;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.field_m = (hk) null;
                break L1;
              }
            }
            L2: {
              if (-1 == (this.field_l.field_q[param1.field_z] & 4 ^ -1)) {
                break L2;
              } else {
                if (0 <= param1.field_h) {
                  break L2;
                } else {
                  var4_int = this.field_l.field_O[param1.field_z] / b.field_r;
                  var5 = (-param1.field_E + (1048575 + var4_int)) / var4_int;
                  param1.field_E = param0 * var4_int + param1.field_E & 1048575;
                  if (var5 > param0) {
                    break L2;
                  } else {
                    L3: {
                      if (0 == this.field_l.field_u[param1.field_z]) {
                        param1.field_C = cc.a(param1.field_w, param1.field_C.l(), param1.field_C.j(), param1.field_C.k());
                        break L3;
                      } else {
                        L4: {
                          param1.field_C = cc.a(param1.field_w, param1.field_C.l(), 0, param1.field_C.k());
                          stackIn_8_0 = this.field_l;

                          stackIn_8_1 = 92;

                          stackIn_8_2 = (cb) (param1);

                          if (param1.field_p.field_k[param1.field_q] >= 0) {
                            stackIn_9_0 = (hl) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (cb) ((Object) stackIn_8_2);
                            stackIn_9_3 = 0;
                            break L4;
                          } else {
                            stackIn_9_0 = (hl) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (cb) ((Object) stackIn_8_2);
                            stackIn_9_3 = 1;
                            break L4;
                          }
                        }
                        ((hl) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                        break L3;
                      }
                    }
                    L5: {
                      if (0 <= param1.field_p.field_k[param1.field_q]) {
                        break L5;
                      } else {
                        param1.field_C.e(-1);
                        break L5;
                      }
                    }
                    param0 = param1.field_E / var4_int;
                    break L2;
                  }
                }
              }
            }
            param1.field_C.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("kj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, cb param3, int[] param4, int param5) {
        hl stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        cb stackIn_11_2 = null;
        hl stackIn_12_0;
        int stackIn_12_1;
        cb stackIn_12_2;
        int stackIn_12_3;
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
        cc var11 = null;
        int var12 = 0;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & this.field_l.field_q[param3.field_z]) == 0) {
                break L1;
              } else {
                if (param3.field_h >= 0) {
                  break L1;
                } else {
                  var7_int = this.field_l.field_O[param3.field_z] / b.field_r;
                  L2: while (true) {
                    var8 = (var7_int + 1048575 - param3.field_E) / var7_int;
                    if (var8 <= param5) {
                      L3: {
                        param3.field_C.b(param4, param0, var8);
                        param3.field_E = param3.field_E + (var8 * var7_int + -1048576);
                        param0 = param0 + var8;
                        param5 = param5 - var8;
                        var9 = b.field_r / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param3.field_C;
                        if (this.field_l.field_u[param3.field_z] == 0) {
                          param3.field_C = cc.a(param3.field_w, var11.l(), var11.j(), var11.k());
                          break L4;
                        } else {
                          L5: {
                            param3.field_C = cc.a(param3.field_w, var11.l(), 0, var11.k());
                            stackIn_11_0 = this.field_l;

                            stackIn_11_1 = 92;

                            stackIn_11_2 = (cb) (param3);

                            if (-1 >= (param3.field_p.field_k[param3.field_q] ^ -1)) {
                              stackIn_12_0 = (hl) ((Object) stackIn_11_0);
                              stackIn_12_1 = stackIn_11_1;
                              stackIn_12_2 = (cb) ((Object) stackIn_11_2);
                              stackIn_12_3 = 0;
                              break L5;
                            } else {
                              stackIn_12_0 = (hl) ((Object) stackIn_11_0);
                              stackIn_12_1 = stackIn_11_1;
                              stackIn_12_2 = (cb) ((Object) stackIn_11_2);
                              stackIn_12_3 = 1;
                              break L5;
                            }
                          }
                          ((hl) (Object) stackIn_12_0).a((byte) stackIn_12_1, stackIn_12_2, stackIn_12_3 != 0);
                          param3.field_C.b(var9, var11.j());
                          break L4;
                        }
                      }
                      L6: {
                        if (param3.field_p.field_k[param3.field_q] < 0) {
                          param3.field_C.e(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.h(var9);
                      var11.b(param4, param0, param1 - param0);
                      if (!var11.h()) {
                        continue L2;
                      } else {
                        this.field_m.a(var11);
                        continue L2;
                      }
                    } else {
                      param3.field_E = param3.field_E + var7_int * param5;
                      break L1;
                    }
                  }
                }
              }
            }
            param3.field_C.b(param4, param0, param5);
            if (param2 == 100) {
              break L0;
            } else {
              field_o = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("kj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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

            if (param4 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        int var2;
        cb var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        this.field_m.a(param0);
        var3 = (cb) ((Object) this.field_n.a(true));
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!this.field_l.b(var3, 0)) {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_m) {
                    this.a(var2, var3, 0);
                    var3.field_m = var3.field_m - var2;
                    break L1;
                  } else {
                    this.a(var3.field_m, var3, 0);
                    var2 = var2 - var3.field_m;
                    if (!this.field_l.a((int[]) null, 0, var3, var2, 120)) {
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
            var3 = (cb) ((Object) this.field_n.f(2));
            continue L0;
          }
        }
    }

    final int a() {
        return 0;
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        cb var6 = null;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            this.field_m.b(param0, param1, param2);
            var6 = (cb) ((Object) this.field_n.a(true));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!this.field_l.b(var6, 0)) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_m) {
                        this.a(var4_int, var4_int - -var5, 100, var6, param0, var5);
                        var6.field_m = var6.field_m - var5;
                        break L2;
                      } else {
                        this.a(var4_int, var4_int - -var5, 100, var6, param0, var6.field_m);
                        var5 = var5 - var6.field_m;
                        var4_int = var4_int + var6.field_m;
                        if (!this.field_l.a(param0, var4_int, var6, var5, 82)) {
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
                var6 = (cb) ((Object) this.field_n.f(2));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("kj.I(");

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
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 != 37) {
            return;
        }
        field_p = null;
        field_q = null;
    }

    final static void c(boolean param0) {
        if (!param0) {
            return;
        }
        qf.f(-28390);
    }

    final static void a(byte param0) {
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!cg.a(75)) {
              L1: {
                if (null == ff.field_b) {
                  break L1;
                } else {
                  if (ff.field_b.field_d) {
                    af.a(-98);
                    ti.field_L.a(-14579, new ii(ti.field_L, qg.field_a));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 22) {
                ti.field_L.a(ha.field_d, true, wc.field_a, (byte) 124);
                ti.field_L.f(true);
                L2: while (true) {
                  if (!ji.a((byte) -72)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    ti.field_L.a((byte) 86, pe.field_b, da.field_b);
                    continue L2;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "kj.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final lk d() {
        cb var1;
        var1 = (cb) ((Object) this.field_n.a(true));
        if (var1 != null) {
          if (var1.field_C != null) {
            return (lk) ((Object) var1.field_C);
          } else {
            return this.b();
          }
        } else {
          return null;
        }
    }

    kj(hl param0) {
        this.field_n = new ng();
        this.field_m = new hk();
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Loading sound effects";
        field_q = new long[32];
    }
}
