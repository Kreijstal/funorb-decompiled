/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ec {
    private int[][] field_q;
    static String field_o;
    static String field_r;
    private String[] field_p;
    static String[] field_s;
    int[] field_n;
    private int[] field_m;

    final void a(gb param0, boolean param1) {
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
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ba.f(1);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.j(255);
              if (var3_int == 0) {
                break L0;
              } else {
                this.a(var3_int, param0, 0);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ba.C(");
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
          throw fc.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, gb param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ff var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 == param0) {
                ((ba) this).field_p = b.a(param1.h(72), '<', true);
                break L1;
              } else {
                if (param0 != 2) {
                  if (param0 != 3) {
                    if (param0 == 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param1.j(255);
                    ((ba) this).field_q = new int[var4_int][];
                    ((ba) this).field_m = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param1.i(38);
                          var7 = uf.a(var6, (byte) -121);
                          if (var7 == null) {
                            break L3;
                          } else {
                            ((ba) this).field_m[var5] = var6;
                            ((ba) this).field_q[var5] = new int[var7.field_c];
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_c) {
                                break L3;
                              } else {
                                ((ba) this).field_q[var5][var8] = param1.i(-122);
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
                  }
                } else {
                  var4_int = param1.j(255);
                  ((ba) this).field_n = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      ((ba) this).field_n[var5] = param1.i(-108);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("ba.D(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 0 + ')');
        }
    }

    final String a(byte param0) {
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 < 93) {
            ((ba) this).g(41);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((ba) this).field_p) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((ba) this).field_p[0]);
        for (var3 = 1; ((ba) this).field_p.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((ba) this).field_p[var3]);
        }
        return var2.toString();
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = SolKnight.field_L ? 1 : 0;
        if (param0 <= 33) {
            return;
        }
        if (((ba) this).field_n != null) {
            for (var2 = 0; var2 < ((ba) this).field_n.length; var2++) {
                ((ba) this).field_n[var2] = qk.a(((ba) this).field_n[var2], 32768);
            }
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 < 6) {
            field_o = null;
        }
        field_r = null;
        field_s = null;
    }

    ba() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = null;
        field_r = "You are not currently logged in to the<nbsp>game.";
    }
}
