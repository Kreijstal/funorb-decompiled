/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jja extends tda {
    eaa field_k;
    private jp field_l;
    hn field_j;
    static String field_m;

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        fh var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            ((jja) this).field_j.a(param0, param1, param2);
            var6 = (fh) (Object) ((jja) this).field_k.b((byte) 90);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (!((jja) this).field_l.a(var6, (byte) 95)) {
                  var4_int = param1;
                  var5 = param2;
                  L2: while (true) {
                    if (var6.field_r >= var5) {
                      int discarded$2 = 12;
                      this.a(var5, param0, var4_int, var4_int + var5, var6);
                      var6.field_r = var6.field_r - var5;
                      var6 = (fh) (Object) ((jja) this).field_k.c(0);
                      continue L1;
                    } else {
                      int discarded$3 = 12;
                      this.a(var6.field_r, param0, var4_int, var5 + var4_int, var6);
                      var5 = var5 - var6.field_r;
                      var4_int = var4_int + var6.field_r;
                      if (!((jja) this).field_l.a(var4_int, var6, param0, var5, false)) {
                        continue L2;
                      } else {
                        var6 = (fh) (Object) ((jja) this).field_k.c(0);
                        continue L1;
                      }
                    }
                  }
                } else {
                  var6 = (fh) (Object) ((jja) this).field_k.c(0);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("jja.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int[] param1, int param2, int param3, fh param4) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        je var11 = null;
        int var12 = 0;
        jp stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        fh stackIn_12_2 = null;
        jp stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        fh stackIn_13_2 = null;
        jp stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        fh stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        fh stackOut_11_2 = null;
        jp stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        fh stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        jp stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        fh stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if ((((jja) this).field_l.field_u[param4.field_n] & 4) == 0) {
                break L1;
              } else {
                if (param4.field_p < 0) {
                  var7_int = ((jja) this).field_l.field_M[param4.field_n] / pb.field_j;
                  L2: while (true) {
                    var8 = (-param4.field_t + (var7_int + 1048575)) / var7_int;
                    if (var8 <= param0) {
                      L3: {
                        param4.field_z.a(param1, param2, var8);
                        param0 = param0 - var8;
                        param4.field_t = param4.field_t + (-1048576 + var8 * var7_int);
                        param2 = param2 + var8;
                        var9 = pb.field_j / 100;
                        var10 = 262144 / var7_int;
                        if (var9 <= var10) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param4.field_z;
                        if (((jja) this).field_l.field_y[param4.field_n] != 0) {
                          L5: {
                            param4.field_z = je.a(param4.field_f, var11.f(), 0, var11.i());
                            stackOut_11_0 = ((jja) this).field_l;
                            stackOut_11_1 = 809594182;
                            stackOut_11_2 = (fh) param4;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            if (0 <= param4.field_j.field_n[param4.field_h]) {
                              stackOut_13_0 = (jp) (Object) stackIn_13_0;
                              stackOut_13_1 = stackIn_13_1;
                              stackOut_13_2 = (fh) (Object) stackIn_13_2;
                              stackOut_13_3 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              stackIn_14_2 = stackOut_13_2;
                              stackIn_14_3 = stackOut_13_3;
                              break L5;
                            } else {
                              stackOut_12_0 = (jp) (Object) stackIn_12_0;
                              stackOut_12_1 = stackIn_12_1;
                              stackOut_12_2 = (fh) (Object) stackIn_12_2;
                              stackOut_12_3 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              stackIn_14_2 = stackOut_12_2;
                              stackIn_14_3 = stackOut_12_3;
                              break L5;
                            }
                          }
                          ((jp) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_14_3 != 0);
                          param4.field_z.a(var9, var11.g());
                          break L4;
                        } else {
                          param4.field_z = je.a(param4.field_f, var11.f(), var11.g(), var11.i());
                          break L4;
                        }
                      }
                      L6: {
                        if (param4.field_j.field_n[param4.field_h] < 0) {
                          param4.field_z.d(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.c(var9);
                      var11.a(param1, param2, param3 + -param2);
                      if (var11.e()) {
                        ((jja) this).field_j.a((tda) (Object) var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    } else {
                      param4.field_t = param4.field_t + var7_int * param0;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            param4.field_z.a(param1, param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var7;
            stackOut_25_1 = new StringBuilder().append("jja.H(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + 12 + ')');
        }
    }

    final int d() {
        return 0;
    }

    final tda b() {
        fh var1 = (fh) (Object) ((jja) this).field_k.b((byte) 90);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_z == null)) {
            return (tda) (Object) var1.field_z;
        }
        return ((jja) this).a();
    }

    final static void d(byte param0) {
        kka.field_l.e((wj) (Object) new dka(), 33);
    }

    final void a(int param0) {
        int var2 = 0;
        fh var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        ((jja) this).field_j.a(param0);
        var3 = (fh) (Object) ((jja) this).field_k.b((byte) 90);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            if (!((jja) this).field_l.a(var3, (byte) 95)) {
              var2 = param0;
              L1: while (true) {
                if (var2 <= var3.field_r) {
                  this.a(var2, 53, var3);
                  var3.field_r = var3.field_r - var2;
                  var3 = (fh) (Object) ((jja) this).field_k.c(0);
                  continue L0;
                } else {
                  this.a(var3.field_r, 91, var3);
                  var2 = var2 - var3.field_r;
                  if (!((jja) this).field_l.a(0, var3, (int[]) null, var2, false)) {
                    continue L1;
                  } else {
                    var3 = (fh) (Object) ((jja) this).field_k.c(0);
                    continue L0;
                  }
                }
              }
            } else {
              var3 = (fh) (Object) ((jja) this).field_k.c(0);
              continue L0;
            }
          }
        }
    }

    final static void c(int param0) {
        int discarded$0 = 1;
        lq.g();
    }

    final static void b(int param0) {
        cha.field_l = ig.field_m.g(76);
        CharSequence var2 = (CharSequence) (Object) cha.field_l;
        tca.field_a = fq.a(0, var2);
    }

    public static void c(byte param0) {
        field_m = null;
    }

    final tda a() {
        fh var1 = null;
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        L0: while (true) {
          var1 = (fh) (Object) ((jja) this).field_k.c(0);
          if (var1 != null) {
            if (var1.field_z != null) {
              return (tda) (Object) var1.field_z;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        cq discarded$0 = ic.a(param0, rt.field_a[param2], -31855);
    }

    private final void a(int param0, int param1, fh param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jp stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        fh stackIn_6_2 = null;
        jp stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        fh stackIn_7_2 = null;
        jp stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        fh stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        fh stackOut_5_2 = null;
        jp stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        fh stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        jp stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        fh stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (0 == (((jja) this).field_l.field_u[param2.field_n] & 4)) {
                break L1;
              } else {
                if (param2.field_p >= 0) {
                  break L1;
                } else {
                  var4_int = ((jja) this).field_l.field_M[param2.field_n] / pb.field_j;
                  var5 = (-param2.field_t + 1048575 - -var4_int) / var4_int;
                  param2.field_t = var4_int * param0 + param2.field_t & 1048575;
                  if (param0 >= var5) {
                    L2: {
                      if (((jja) this).field_l.field_y[param2.field_n] == 0) {
                        param2.field_z = je.a(param2.field_f, param2.field_z.f(), param2.field_z.g(), param2.field_z.i());
                        break L2;
                      } else {
                        L3: {
                          param2.field_z = je.a(param2.field_f, param2.field_z.f(), 0, param2.field_z.i());
                          stackOut_5_0 = ((jja) this).field_l;
                          stackOut_5_1 = 809594182;
                          stackOut_5_2 = (fh) param2;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_7_2 = stackOut_5_2;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          stackIn_6_2 = stackOut_5_2;
                          if (param2.field_j.field_n[param2.field_h] >= 0) {
                            stackOut_7_0 = (jp) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (fh) (Object) stackIn_7_2;
                            stackOut_7_3 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            stackIn_8_3 = stackOut_7_3;
                            break L3;
                          } else {
                            stackOut_6_0 = (jp) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = (fh) (Object) stackIn_6_2;
                            stackOut_6_3 = 1;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            stackIn_8_3 = stackOut_6_3;
                            break L3;
                          }
                        }
                        ((jp) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if (param2.field_j.field_n[param2.field_h] >= 0) {
                        break L4;
                      } else {
                        param2.field_z.d(-1);
                        break L4;
                      }
                    }
                    param0 = param2.field_t / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            param2.field_z.a(param0);
            if (param1 >= 18) {
              break L0;
            } else {
              ((jja) this).field_l = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("jja.N(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    jja(jp param0) {
        ((jja) this).field_k = new eaa();
        ((jja) this).field_j = new hn();
        try {
            ((jja) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
