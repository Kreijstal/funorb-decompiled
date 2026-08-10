/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends di {
    static String field_l;
    im field_k;
    static String[] field_n;
    private lj field_j;
    v field_m;

    final di a() {
        he var1 = (he) ((Object) this.field_k.b((byte) -75));
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_l == null)) {
            return (di) ((Object) var1.field_l);
        }
        return this.d();
    }

    private final void a(int param0, he param1, int param2) {
        lj stackIn_9_0 = null;
        he stackIn_9_1 = null;
        lj stackIn_10_0 = null;
        he stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (-1 == (this.field_j.field_o[param1.field_F] & 4 ^ -1)) {
                break L1;
              } else {
                if (0 > param1.field_n) {
                  var4_int = this.field_j.field_L[param1.field_F] / la.field_c;
                  var5 = (var4_int + (1048575 + -param1.field_i)) / var4_int;
                  param1.field_i = 1048575 & param0 * var4_int + param1.field_i;
                  if (var5 <= param0) {
                    L2: {
                      if (-1 != (this.field_j.field_D[param1.field_F] ^ -1)) {
                        L3: {
                          param1.field_l = bb.a(param1.field_D, param1.field_l.g(), 0, param1.field_l.l());
                          stackIn_9_0 = this.field_j;

                          stackIn_9_1 = (he) (param1);

                          if ((param1.field_g.field_m[param1.field_h] ^ -1) <= -1) {
                            stackIn_10_0 = (lj) ((Object) stackIn_9_0);
                            stackIn_10_1 = (he) ((Object) stackIn_9_1);
                            stackIn_10_2 = 0;
                            break L3;
                          } else {
                            stackIn_10_0 = (lj) ((Object) stackIn_9_0);
                            stackIn_10_1 = (he) ((Object) stackIn_9_1);
                            stackIn_10_2 = 1;
                            break L3;
                          }
                        }
                        ((lj) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2 != 0, param2 + 33816);
                        break L2;
                      } else {
                        param1.field_l = bb.a(param1.field_D, param1.field_l.g(), param1.field_l.j(), param1.field_l.l());
                        break L2;
                      }
                    }
                    L4: {
                      if (param1.field_g.field_m[param1.field_h] < 0) {
                        param1.field_l.d(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0 = param1.field_i / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L5: {
              if (param2 == -23887) {
                break L5;
              } else {
                this.d();
                break L5;
              }
            }
            param1.field_l.c(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("jg.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
    }

    final di d() {
        he var1;
        L0: while (true) {
          var1 = (he) ((Object) this.field_k.d(853));
          if (var1 != null) {
            if (var1.field_l != null) {
              return (di) ((Object) var1.field_l);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int[] param0, int param1, int param2, boolean param3, he param4, int param5) {
        lj stackIn_13_0 = null;
        he stackIn_13_1 = null;
        lj stackIn_14_0 = null;
        he stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bb var11 = null;
        int var12 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                this.field_j = (lj) null;
                break L1;
              }
            }
            L2: {
              if ((4 & this.field_j.field_o[param4.field_F]) == 0) {
                break L2;
              } else {
                if (param4.field_n >= 0) {
                  break L2;
                } else {
                  var7_int = this.field_j.field_L[param4.field_F] / la.field_c;
                  L3: while (true) {
                    var8 = (-param4.field_i + (1048575 + var7_int)) / var7_int;
                    if (var8 > param5) {
                      param4.field_i = param4.field_i + var7_int * param5;
                      break L2;
                    } else {
                      L4: {
                        param4.field_l.b(param0, param2, var8);
                        param4.field_i = param4.field_i + (-1048576 + var8 * var7_int);
                        param2 = param2 + var8;
                        param5 = param5 - var8;
                        var9 = la.field_c / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var11 = param4.field_l;
                        if (0 == this.field_j.field_D[param4.field_F]) {
                          param4.field_l = bb.a(param4.field_D, var11.g(), var11.j(), var11.l());
                          break L5;
                        } else {
                          L6: {
                            param4.field_l = bb.a(param4.field_D, var11.g(), 0, var11.l());
                            stackIn_13_0 = this.field_j;

                            stackIn_13_1 = (he) (param4);

                            if (param4.field_g.field_m[param4.field_h] >= 0) {
                              stackIn_14_0 = (lj) ((Object) stackIn_13_0);
                              stackIn_14_1 = (he) ((Object) stackIn_13_1);
                              stackIn_14_2 = 0;
                              break L6;
                            } else {
                              stackIn_14_0 = (lj) ((Object) stackIn_13_0);
                              stackIn_14_1 = (he) ((Object) stackIn_13_1);
                              stackIn_14_2 = 1;
                              break L6;
                            }
                          }
                          ((lj) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2 != 0, 9929);
                          param4.field_l.d(var9, var11.j());
                          break L5;
                        }
                      }
                      L7: {
                        if (param4.field_g.field_m[param4.field_h] < 0) {
                          param4.field_l.d(-1);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var11.f(var9);
                      var11.b(param0, param2, param1 + -param2);
                      if (var11.e()) {
                        this.field_m.a(var11);
                        continue L3;
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            param4.field_l.b(param0, param2, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var7);

            stackIn_27_1 = new StringBuilder().append("jg.I(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param5 + ')');
        }
    }

    final int c() {
        return 0;
    }

    final void c(int param0) {
        int var2;
        he var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = OrbDefence.field_D ? 1 : 0;
        this.field_m.c(param0);
        var3 = (he) ((Object) this.field_k.b((byte) 117));
        L0: while (true) {
          if (var3 != null) {
            stackIn_4_0 = this.field_j.a(var3, (byte) 90);
            L1: {
              if (stackIn_4_0) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_w >= var2) {
                    this.a(var2, var3, -23887);
                    var3.field_w = var3.field_w - var2;
                    break L1;
                  } else {
                    this.a(var3.field_w, var3, -23887);
                    var2 = var2 - var3.field_w;
                    if (this.field_j.a(4160, var3, 0, var2, (int[]) null)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (he) ((Object) this.field_k.d(853));
            continue L0;
          } else {
            return;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        he var6 = null;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            this.field_m.b(param0, param1, param2);
            var6 = (he) ((Object) this.field_k.b((byte) -96));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (this.field_j.a(var6, (byte) 98)) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_w >= var5) {
                        this.a(param0, var4_int + var5, var4_int, true, var6, var5);
                        var6.field_w = var6.field_w - var5;
                        break L2;
                      } else {
                        this.a(param0, var4_int + var5, var4_int, true, var6, var6.field_w);
                        var5 = var5 - var6.field_w;
                        var4_int = var4_int + var6.field_w;
                        if (!this.field_j.a(4160, var6, var4_int, var5, param0)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var6 = (he) ((Object) this.field_k.d(853));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("jg.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 < 34) {
            jg.d(-51);
            field_n = null;
            return;
        }
        field_n = null;
    }

    jg(lj param0) {
        this.field_k = new im();
        this.field_m = new v();
        try {
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "FAST BLAST";
    }
}
