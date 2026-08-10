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
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ba.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, gb param1, int param2) {
        int[] array$0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ff var7 = null;
        int var8 = 0;
        int var9 = 0;
        gb var10 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 == param0) {
                this.field_p = b.a(param1.h(72), '<', true);
                break L1;
              } else {
                if (param0 != 2) {
                  if ((param0 ^ -1) != -4) {
                    if ((param0 ^ -1) == -5) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param1.j(param2 + 255);
                    this.field_q = new int[var4_int][];
                    this.field_m = new int[var4_int];
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
                            this.field_m[var5] = var6;
                            array$0 = new int[var7.field_c];
                            this.field_q[var5] = array$0;
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_c) {
                                break L3;
                              } else {
                                this.field_q[var5][var8] = param1.i(-122);
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
                  this.field_n = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      this.field_n[var5] = param1.i(-108);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            L6: {
              if (param2 == 0) {
                break L6;
              } else {
                var10 = (gb) null;
                this.a((gb) null, true);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("ba.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
    }

    final String a(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 < 93) {
            this.g(41);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_p) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_p[0]);
        for (var3 = 1; this.field_p.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_p[var3]);
        }
        return var2.toString();
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = SolKnight.field_L ? 1 : 0;
        if (param0 <= 33) {
            return;
        }
        if (this.field_n != null) {
            for (var2 = 0; var2 < this.field_n.length; var2++) {
                this.field_n[var2] = qk.a(this.field_n[var2], 32768);
            }
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 < 6) {
            field_o = (String) null;
        }
        field_r = null;
        field_s = null;
    }

    ba() {
    }

    static {
        field_o = null;
        field_r = "You are not currently logged in to the<nbsp>game.";
    }
}
