/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class tu extends eha {
    static String field_e;
    static volatile int field_h;
    private vna field_c;
    static float field_g;
    ff field_f;
    static String field_d;

    private final boolean a(la param0, byte param1, int param2) {
        return !((tu) this).field_f.b(param2, 0) && kq.a(-44, param0.q((byte) -82)).field_d;
    }

    void a(int param0, hca param1, int param2, la param3, int param4, int param5) {
        RuntimeException var7 = null;
        qw var7_ref = null;
        int var8 = 0;
        Object var9 = null;
        String var9_ref = null;
        jha var10 = null;
        Object var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
              if (ab.field_n == null) {
                break L1;
              } else {
                ab.field_n.field_y.a((byte) -105, 77, -1);
                break L1;
              }
            }
            L2: {
              var7_ref = new qw(param1, param3, param2, param5, param4);
              ((tu) this).field_c.b((byte) -88, (vg) (Object) var7_ref);
              var9 = null;
              if (1 != param5) {
                var8 = -10;
                var9_ref = gl.a((byte) 104, uta.field_n, new String[1]);
                break L2;
              } else {
                var8 = -5;
                var9_ref = gl.a((byte) 107, rf.field_a, new String[1]);
                break L2;
              }
            }
            L3: {
              param1.h(param0 + -15, var8);
              ((tu) this).field_f.field_D.a(param5, param1.A(0), param0 + -19);
              if (!((tu) this).field_f.j(-1878)) {
                break L3;
              } else {
                if (((tu) this).field_f.d(-67)) {
                  break L3;
                } else {
                  if (var9_ref != null) {
                    var10 = ab.a(-48, var9_ref);
                    iqa.field_c.a(3, param0 + -15, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (param0 == 15) {
                break L4;
              } else {
                var11 = null;
                ((tu) this).a(77, (hca) null, 88, (la) null, -63, 81);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var7;
            stackOut_13_1 = new StringBuilder().append("tu.G(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, hca param2, fsa param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        hr var6 = null;
        hr var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
            if (param0 == -1) {
              return;
            } else {
              L1: {
                var5_int = param0;
                if (var5_int == 0) {
                  var6 = param2.f((byte) 121).a(param2.d(3), param2.e(9648), (byte) 100, 3145728 + param2.g((byte) 115));
                  var6.a(false, 128, 15, 128, 50);
                  var6.a(131072, 0, -107, 0);
                  break L1;
                } else {
                  if (1 != var5_int) {
                    if (2 == var5_int) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var7 = param2.f((byte) -109).a(param2.d(3), param2.e(9648), (byte) 100, param2.g((byte) 115) + 3145728);
                    var7.a(false, 128, 16, 128, 50);
                    var7.a(131072, 0, -89, 0);
                    break L1;
                  }
                }
              }
              L2: {
                if (param1 == 15818) {
                  break L2;
                } else {
                  field_e = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("tu.E(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_d = null;
    }

    final void a(int param0, la param1) {
        if (param0 <= 12) {
            Object var4 = null;
            ((tu) this).a((hca) null, (la) null, false);
        }
        if (null != ab.field_n) {
            ab.field_n.field_y.a((byte) -105, 256, -1);
        }
        if (!(null != ((tu) this).field_f)) {
            return;
        }
        try {
            ((tu) this).field_f.a(true, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tu.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(fsa param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        hca var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3_int = param0.w(17825792);
            if (var3_int != -1) {
              var4 = param0.f((byte) -65).u(-90);
              if (param1 == 1) {
                L1: {
                  var5 = var3_int;
                  if (var5 == 0) {
                    ((tu) this).field_f.field_D.d(1, 72, var4.A(0));
                    break L1;
                  } else {
                    break L1;
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("tu.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    void a(int param0, hca param1, la param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        fsa[] var5 = null;
        fsa[] var6 = null;
        int var7 = 0;
        fsa var8 = null;
        int var9 = 0;
        Object var10 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((tu) this).field_f.k(-25319)) {
                break L1;
              } else {
                if (param2 == null) {
                  break L1;
                } else {
                  if (param2.field_u != null) {
                    L2: {
                      L3: {
                        var4_int = param2.u(-2).A(param0 + 2);
                        if (!param2.j(0)) {
                          break L3;
                        } else {
                          if (!((tu) this).field_f.j(param0 + -1876)) {
                            qb.a(var4_int, 5);
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      li.b(var4_int, (byte) 116);
                      break L2;
                    }
                    ff.d(param0 ^ -2, var4_int);
                    var5 = param2.n(16);
                    var6 = var5;
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var6.length) {
                        break L1;
                      } else {
                        L5: {
                          var8 = var6[var7];
                          if (var8.E((byte) 3) != 1) {
                            break L5;
                          } else {
                            qw.a((byte) -32, var4_int);
                            break L5;
                          }
                        }
                        L6: {
                          if (2 != var8.E((byte) 3)) {
                            break L6;
                          } else {
                            mka.a(13, var4_int);
                            break L6;
                          }
                        }
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            L7: {
              if (param0 == -2) {
                break L7;
              } else {
                var10 = null;
                ((tu) this).a(84, (hca) null, 71, (la) null, -32, -21);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("tu.M(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final qw b(byte param0) {
        int var2 = -114 / ((59 - param0) / 50);
        if (((tu) this).field_c.d((byte) 14)) {
            return null;
        }
        return (qw) (Object) ((tu) this).field_c.c(73);
    }

    void a(hca param0, la param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jha var9_ref_jha = null;
        int var10 = 0;
        int var11 = 0;
        jha var12 = null;
        int var13 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = kq.a(105, param1.q((byte) -82)).field_h;
              var4_int = var4_int * 2;
              var5 = param1.p((byte) 83);
              if (!param2) {
                break L1;
              } else {
                ((tu) this).field_f = null;
                break L1;
              }
            }
            L2: {
              var6 = 50;
              var7 = 0;
              if (var4_int > var5) {
                var7 = (-var5 + var4_int) * 5 / 50;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              param0.h(0, param0.F(-7991) + (var7 + var6));
              var8 = param0.A(0);
              ((tu) this).field_f.field_F[var8] = (long)var5;
              ((tu) this).field_f.field_g[var8] = param1.q((byte) -82);
              if (((tu) this).field_f.k(-25319)) {
                break L3;
              } else {
                if (((tu) this).field_f.j(-1878)) {
                  break L3;
                } else {
                  if (((tu) this).field_f.field_x == null) {
                    break L3;
                  } else {
                    if (this.a(param1, (byte) 74, var8)) {
                      break L3;
                    } else {
                      var9 = ll.a(param1.q((byte) -82), 0);
                      if (var9 < 0) {
                        break L3;
                      } else {
                        ((tu) this).field_f.field_x[var8].set(var9);
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            L4: {
              if (!((tu) this).field_f.j(-1878)) {
                break L4;
              } else {
                if (!((tu) this).field_f.d(-127)) {
                  L5: {
                    if (0 != var7) {
                      var9_ref_jha = ab.a(-89, gl.a((byte) 112, wpa.field_J, new String[2]));
                      break L5;
                    } else {
                      var9_ref_jha = ab.a(-66, gl.a((byte) 92, gla.field_q, new String[1]));
                      break L5;
                    }
                  }
                  L6: {
                    iqa.field_c.a(0, var9_ref_jha);
                    var10 = param0.F(-7991);
                    if (var10 > 0) {
                      jha dupTemp$1 = ab.a(-96, gl.a((byte) 82, bca.field_c, new String[1]));
                      var12 = dupTemp$1;
                      var9_ref_jha = dupTemp$1;
                      iqa.field_c.a(3, 0, var12);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((tu) this).field_f.field_I[var8] = true;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L7: {
              if (((tu) this).field_f.j(-1878)) {
                break L7;
              } else {
                var13 = 0;
                var9 = var13;
                L8: while (true) {
                  if (var13 >= 3) {
                    break L7;
                  } else {
                    ((tu) this).field_f.field_D.b(param0.A(0), 65408, gp.field_i[var13] * param0.a(393216, var13));
                    var13++;
                    continue L8;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("tu.H(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param2 + ')');
        }
    }

    tu(ff param0) {
        try {
            ((tu) this).field_f = param0;
            ((tu) this).field_c = new vna();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has entered a game.";
        field_d = "White light beams";
        field_h = 0;
    }
}
