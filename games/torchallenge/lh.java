/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends w {
    static int field_s;
    int[] field_x;
    static int[] field_C;
    static int[] field_q;
    private int[] field_t;
    private String[] field_z;
    static long field_u;
    static int[] field_p;
    private int[][] field_A;
    static int[][][][][] field_r;
    static int[] field_B;
    static k field_w;
    static ka field_v;
    static String field_y;

    final static int e(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_13_0 = 0;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            boolean discarded$12 = t.field_b.a(lk.field_g, false, nd.field_g, true);
            t.field_b.j(-91);
            L1: while (true) {
              if (!kj.e((byte) -39)) {
                if (-1 != ri.field_i) {
                  var1_int = ri.field_i;
                  fk.a(true, -1);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (hl.field_e) {
                    stackOut_10_0 = 3;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    if (eh.field_p != qc.field_i) {
                      if (!ji.field_k.b(0)) {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        if (qc.field_i != gj.field_a) {
                          stackOut_22_0 = -1;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          stackOut_20_0 = 2;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      }
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  }
                }
              } else {
                boolean discarded$13 = t.field_b.a(di.field_m, b.field_J, 104);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "lh.F(" + 0 + 41);
        }
        return stackIn_23_0;
    }

    public static void g(int param0) {
        field_r = null;
        field_y = null;
        field_q = null;
        field_C = null;
        field_p = null;
        field_v = null;
        field_w = null;
        if (param0 < 112) {
            return;
        }
        field_B = null;
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = TorChallenge.field_F ? 1 : 0;
        if (null != ((lh) this).field_x) {
            for (var2 = 0; ((lh) this).field_x.length > var2; var2++) {
                ((lh) this).field_x[var2] = p.a(((lh) this).field_x[var2], 32768);
            }
        }
        if (param0 != 0) {
            ((lh) this).field_z = null;
        }
    }

    final String b(boolean param0) {
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (!param0) {
            lh.g(-86);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((lh) this).field_z) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((lh) this).field_z[0]);
        for (var3 = 1; var3 < ((lh) this).field_z.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((lh) this).field_z[var3]);
        }
        return var2.toString();
    }

    lh() {
    }

    private final void a(int param0, uf param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        k var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param0) {
                L2: {
                  if (param0 != 2) {
                    if (param0 == 3) {
                      var4_int = param1.j(-87);
                      ((lh) this).field_t = new int[var4_int];
                      ((lh) this).field_A = new int[var4_int][];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4_int) {
                          break L2;
                        } else {
                          L4: {
                            var6 = param1.c(false);
                            var7 = oh.a((byte) 123, var6);
                            if (var7 == null) {
                              break L4;
                            } else {
                              ((lh) this).field_t[var5] = var6;
                              ((lh) this).field_A[var5] = new int[var7.field_j];
                              var8 = 0;
                              L5: while (true) {
                                if (~var7.field_j >= ~var8) {
                                  break L4;
                                } else {
                                  ((lh) this).field_A[var5][var8] = param1.c(false);
                                  var8++;
                                  continue L5;
                                }
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (param0 == 4) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    var4_int = param1.j(-95);
                    ((lh) this).field_x = new int[var4_int];
                    var5 = 0;
                    L6: while (true) {
                      if (var5 >= var4_int) {
                        break L2;
                      } else {
                        ((lh) this).field_x[var5] = param1.c(false);
                        var5++;
                        continue L6;
                      }
                    }
                  }
                }
                break L1;
              } else {
                ((lh) this).field_z = dl.a(param1.b(false), '<', -33);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("lh.G(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + -817 + 41);
        }
    }

    final static void f(int param0) {
        o var1 = (o) (Object) ve.field_c.c((byte) 116);
        if (var1 == null) {
            ob.b(-103);
            return;
        }
        pa var2 = id.field_b;
        int discarded$0 = var2.i(67);
        int discarded$1 = var2.i(54);
        int discarded$2 = var2.i(65);
        int discarded$3 = var2.i(56);
        var1.a(true);
    }

    final void a(uf param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 < -97) {
              L1: while (true) {
                var3_int = param0.j(-118);
                if (0 != var3_int) {
                  this.a(var3_int, param0, -817);
                  continue L1;
                } else {
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("lh.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = -1;
        field_C = new int[]{192, 192, 256};
        field_q = new int[]{192, 192, 256};
        field_B = new int[]{96, 96, 128};
        field_p = new int[]{128, 128, 144};
        field_y = "Please wait...";
        field_r = new int[][][][][]{new int[7][][][], new int[7][][][], new int[7][][][]};
        field_w = new k(4, 1, 1, 1);
    }
}
