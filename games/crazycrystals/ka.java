/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends od {
    static boolean field_j;
    static int field_n;
    static db field_m;
    wb field_k;
    private wg field_o;
    tj field_l;

    final od a() {
        pl var1;
        int var2;
        var2 = CrazyCrystals.field_B;
        L0: while (true) {
          var1 = (pl) ((Object) this.field_k.a(false));
          if (var1 != null) {
            if (null != var1.field_v) {
              return (od) ((Object) var1.field_v);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(pl param0, int param1, byte param2) {
        wg stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        pl stackIn_8_2 = null;
        wg stackIn_9_0;
        int stackIn_9_1;
        pl stackIn_9_2;
        int stackIn_9_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            if (param2 < -79) {
              L1: {
                if ((this.field_o.field_E[param0.field_i] & 4) == 0) {
                  break L1;
                } else {
                  if (param0.field_l >= 0) {
                    break L1;
                  } else {
                    var4_int = this.field_o.field_G[param0.field_i] / id.field_m;
                    var5 = (var4_int + 1048575 + -param0.field_j) / var4_int;
                    param0.field_j = var4_int * param1 + param0.field_j & 1048575;
                    if (var5 > param1) {
                      break L1;
                    } else {
                      L2: {
                        if (this.field_o.field_v[param0.field_i] == 0) {
                          param0.field_v = kg.b(param0.field_t, param0.field_v.f(), param0.field_v.j(), param0.field_v.k());
                          break L2;
                        } else {
                          L3: {
                            param0.field_v = kg.b(param0.field_t, param0.field_v.f(), 0, param0.field_v.k());
                            stackIn_8_0 = this.field_o;

                            stackIn_8_1 = 2;

                            stackIn_8_2 = (pl) (param0);

                            if (-1 >= (param0.field_A.field_n[param0.field_y] ^ -1)) {
                              stackIn_9_0 = (wg) ((Object) stackIn_8_0);
                              stackIn_9_1 = stackIn_8_1;
                              stackIn_9_2 = (pl) ((Object) stackIn_8_2);
                              stackIn_9_3 = 0;
                              break L3;
                            } else {
                              stackIn_9_0 = (wg) ((Object) stackIn_8_0);
                              stackIn_9_1 = stackIn_8_1;
                              stackIn_9_2 = (pl) ((Object) stackIn_8_2);
                              stackIn_9_3 = 1;
                              break L3;
                            }
                          }
                          ((wg) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                          break L2;
                        }
                      }
                      L4: {
                        if (0 > param0.field_A.field_n[param0.field_y]) {
                          param0.field_v.f(-1);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      param1 = param0.field_j / var4_int;
                      break L1;
                    }
                  }
                }
              }
              param0.field_v.a(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ka.D(");

            if (param0 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int c() {
        return 0;
    }

    final od d() {
        pl var1;
        var1 = (pl) ((Object) this.field_k.g(32073));
        if (var1 != null) {
          if (var1.field_v != null) {
            return (od) ((Object) var1.field_v);
          } else {
            return this.a();
          }
        } else {
          return null;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pl var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            this.field_l.a(param0, param1, param2);
            var6 = (pl) ((Object) this.field_k.g(32073));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (this.field_o.a(var6, (byte) 100)) {
                  var6 = (pl) ((Object) this.field_k.a(false));
                  continue L1;
                } else {
                  var4_int = param1;
                  var5 = param2;
                  L2: while (true) {
                    if (var5 <= var6.field_k) {
                      this.a(param0, var6, var4_int, -1048576, var5, var5 + var4_int);
                      var6.field_k = var6.field_k - var5;
                      var6 = (pl) ((Object) this.field_k.a(false));
                      continue L1;
                    } else {
                      this.a(param0, var6, var4_int, -1048576, var6.field_k, var5 + var4_int);
                      var5 = var5 - var6.field_k;
                      var4_int = var4_int + var6.field_k;
                      if (!this.field_o.a(var5, var4_int, param0, var6, (byte) 98)) {
                        continue L2;
                      } else {
                        var6 = (pl) ((Object) this.field_k.a(false));
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ka.N(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -91 % ((47 - param0) / 56);
        field_m = null;
    }

    private final void a(int[] param0, pl param1, int param2, int param3, int param4, int param5) {
        wg stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pl stackIn_14_2 = null;
        wg stackIn_15_0;
        int stackIn_15_1;
        pl stackIn_15_2;
        int stackIn_15_3;
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
        kg var11 = null;
        int var12 = 0;
        var12 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param3 == -1048576) {
                break L1;
              } else {
                this.a();
                break L1;
              }
            }
            L2: {
              if (0 == (4 & this.field_o.field_E[param1.field_i])) {
                break L2;
              } else {
                if (-1 < (param1.field_l ^ -1)) {
                  var7_int = this.field_o.field_G[param1.field_i] / id.field_m;
                  L3: while (true) {
                    var8 = (-param1.field_j + var7_int + 1048575) / var7_int;
                    if (var8 > param4) {
                      param1.field_j = param1.field_j + var7_int * param4;
                      break L2;
                    } else {
                      L4: {
                        param1.field_v.a(param0, param2, var8);
                        param4 = param4 - var8;
                        param2 = param2 + var8;
                        param1.field_j = param1.field_j + (-1048576 + var7_int * var8);
                        var9 = id.field_m / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L4;
                        } else {
                          var9 = var10;
                          break L4;
                        }
                      }
                      L5: {
                        var11 = param1.field_v;
                        if (this.field_o.field_v[param1.field_i] != 0) {
                          L6: {
                            param1.field_v = kg.b(param1.field_t, var11.f(), 0, var11.k());
                            stackIn_14_0 = this.field_o;

                            stackIn_14_1 = 2;

                            stackIn_14_2 = (pl) (param1);

                            if ((param1.field_A.field_n[param1.field_y] ^ -1) <= -1) {
                              stackIn_15_0 = (wg) ((Object) stackIn_14_0);
                              stackIn_15_1 = stackIn_14_1;
                              stackIn_15_2 = (pl) ((Object) stackIn_14_2);
                              stackIn_15_3 = 0;
                              break L6;
                            } else {
                              stackIn_15_0 = (wg) ((Object) stackIn_14_0);
                              stackIn_15_1 = stackIn_14_1;
                              stackIn_15_2 = (pl) ((Object) stackIn_14_2);
                              stackIn_15_3 = 1;
                              break L6;
                            }
                          }
                          ((wg) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                          param1.field_v.b(var9, var11.j());
                          break L5;
                        } else {
                          param1.field_v = kg.b(param1.field_t, var11.f(), var11.j(), var11.k());
                          break L5;
                        }
                      }
                      L7: {
                        if (param1.field_A.field_n[param1.field_y] >= 0) {
                          break L7;
                        } else {
                          param1.field_v.f(-1);
                          break L7;
                        }
                      }
                      var11.d(var9);
                      var11.a(param0, param2, param5 + -param2);
                      if (!var11.e()) {
                        continue L3;
                      } else {
                        this.field_l.b(var11);
                        continue L3;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            param1.field_v.a(param0, param2, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("ka.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        pl var3;
        int var4;
        int var2;
        var4 = CrazyCrystals.field_B;
        this.field_l.a(param0);
        var3 = (pl) ((Object) this.field_k.g(32073));
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            if (!this.field_o.a(var3, (byte) 113)) {
              var2 = param0;
              L1: while (true) {
                if (var3.field_k >= var2) {
                  this.a(var3, var2, (byte) -101);
                  var3.field_k = var3.field_k - var2;
                  var3 = (pl) ((Object) this.field_k.a(false));
                  continue L0;
                } else {
                  this.a(var3, var3.field_k, (byte) -116);
                  var2 = var2 - var3.field_k;
                  if (!this.field_o.a(var2, 0, (int[]) null, var3, (byte) 94)) {
                    continue L1;
                  } else {
                    var3 = (pl) ((Object) this.field_k.a(false));
                    continue L0;
                  }
                }
              }
            } else {
              var3 = (pl) ((Object) this.field_k.a(false));
              continue L0;
            }
          }
        }
    }

    ka(wg param0) {
        this.field_k = new wb();
        this.field_l = new tj();
        try {
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = 128;
    }
}
