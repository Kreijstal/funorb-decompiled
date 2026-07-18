/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends gb {
    static int[] field_x;
    static int field_u;
    private int[] field_y;
    private int[][] field_z;
    static String field_t;
    int[] field_v;
    private String[] field_w;

    public static void f() {
        field_x = null;
        field_t = null;
    }

    private final void a(int param0, int param1, bh param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        db var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            if (param1 < -38) {
              L1: {
                if (1 != param0) {
                  if (param0 == 2) {
                    var4_int = param2.d((byte) -99);
                    ((j) this).field_v = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        ((j) this).field_v[var5] = param2.e(127);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (param0 == 3) {
                      var4_int = param2.d((byte) -99);
                      ((j) this).field_y = new int[var4_int];
                      ((j) this).field_z = new int[var4_int][];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4_int) {
                          break L1;
                        } else {
                          L4: {
                            var6 = param2.e(127);
                            var7 = bj.a(0, var6);
                            if (var7 == null) {
                              break L4;
                            } else {
                              ((j) this).field_y[var5] = var6;
                              ((j) this).field_z[var5] = new int[var7.field_c];
                              var8 = 0;
                              L5: while (true) {
                                if (var8 >= var7.field_c) {
                                  break L4;
                                } else {
                                  ((j) this).field_z[var5][var8] = param2.e(127);
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
                      if (4 == param0) {
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  ((j) this).field_w = hi.a(param2.g((byte) 81), '<', 783);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("j.A(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final void a(bh param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            if (param1 == 15067) {
              L1: while (true) {
                var3_int = param0.d((byte) -99);
                if (var3_int == 0) {
                  break L0;
                } else {
                  this.a(var3_int, -85, param0);
                  continue L1;
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
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("j.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final String h(int param0) {
        int var3 = 0;
        int var4 = TetraLink.field_J;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((j) this).field_w == null) {
            return "";
        }
        StringBuilder discarded$7 = var5.append(((j) this).field_w[0]);
        if (param0 > -10) {
            return null;
        }
        for (var3 = 1; ((j) this).field_w.length > var3; var3++) {
            StringBuilder discarded$8 = var2.append("...");
            StringBuilder discarded$9 = var5.append(((j) this).field_w[var3]);
        }
        return var2.toString();
    }

    j() {
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        if (param0 != 25271) {
            Object var4 = null;
            this.a(0, 67, (bh) null);
        }
        if (null != ((j) this).field_v) {
            for (var2 = 0; ((j) this).field_v.length > var2; var2++) {
                ((j) this).field_v[var2] = mc.a(((j) this).field_v[var2], 32768);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Offline";
    }
}
