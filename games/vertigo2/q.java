/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends gp {
    static int field_y;
    int[] field_w;
    static int field_u;
    private int[][] field_A;
    static int field_x;
    private int[] field_C;
    static int field_v;
    static er[] field_z;
    private String[] field_t;

    public static void i(int param0) {
        field_z = null;
    }

    final String h(int param0) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 != 33) {
            field_v = -73;
        }
        if (!(((q) this).field_t != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((q) this).field_t[0]);
        for (var3 = 1; var3 < ((q) this).field_t.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((q) this).field_t[var3]);
        }
        return var2.toString();
    }

    final void a(ed param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
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
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -20) {
                break L1;
              } else {
                var5 = null;
                ((q) this).a((ed) null, 11);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.h(-11);
              if (var3_int == 0) {
                break L0;
              } else {
                this.a(param0, 19291, var3_int);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("q.E(");
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (((q) this).field_w != null) {
            for (var2 = 0; ((q) this).field_w.length > var2; var2++) {
                ((q) this).field_w[var2] = om.a(((q) this).field_w[var2], 32768);
            }
        }
        if (param0 != 93) {
            ((q) this).a((byte) 117);
        }
    }

    private final void a(ed param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ve var7 = null;
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
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != 1) {
                if (2 != param2) {
                  if (3 == param2) {
                    var4_int = param0.h(-11);
                    ((q) this).field_C = new int[var4_int];
                    ((q) this).field_A = new int[var4_int][];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param0.a((byte) -11);
                          var7 = li.a(var6, -72);
                          if (var7 == null) {
                            break L3;
                          } else {
                            ((q) this).field_C[var5] = var6;
                            ((q) this).field_A[var5] = new int[var7.field_c];
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_c) {
                                break L3;
                              } else {
                                ((q) this).field_A[var5][var8] = param0.a((byte) -11);
                                var8++;
                                continue L4;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (4 == param2) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  var4_int = param0.h(-11);
                  ((q) this).field_w = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      ((q) this).field_w[var5] = param0.a((byte) -11);
                      var5++;
                      continue L5;
                    }
                  }
                }
              } else {
                ((q) this).field_t = jr.a((byte) -9, '<', param0.f(128));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("q.D(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 19291 + ',' + param2 + ')');
        }
    }

    q() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 33;
        field_v = 0;
    }
}
