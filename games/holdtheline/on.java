/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends ln {
    int[] field_o;
    static hj field_t;
    static boolean field_s;
    static int[][] field_v;
    private int[][] field_q;
    private String[] field_u;
    static String field_p;
    static int field_r;
    private int[] field_w;

    final void g(int param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        if (param0 > -54) {
            ((on) this).g(85);
        }
        if (((on) this).field_o != null) {
            for (var2 = 0; var2 < ((on) this).field_o.length; var2++) {
                ((on) this).field_o[var2] = kc.a(((on) this).field_o[var2], 32768);
            }
        }
    }

    final void a(int param0, th param1) {
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
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 >= 90) {
                break L1;
              } else {
                field_r = -69;
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param1.f((byte) -70);
              if (var3_int != 0) {
                this.a(109, param1, var3_int);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("on.B(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    private final void a(int param0, th param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        e var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
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
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 >= 93) {
                break L1;
              } else {
                var10 = null;
                this.a(53, (th) null, -28);
                break L1;
              }
            }
            L2: {
              if (param2 == 1) {
                ((on) this).field_u = fl.a(param1.j(-1231), (byte) -29, '<');
                break L2;
              } else {
                if (param2 != 2) {
                  if (param2 == 3) {
                    var4_int = param1.f((byte) -95);
                    ((on) this).field_w = new int[var4_int];
                    ((on) this).field_q = new int[var4_int][];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L2;
                      } else {
                        L4: {
                          var6 = param1.k(120);
                          var7 = ln.a(var6, (byte) -96);
                          if (var7 == null) {
                            break L4;
                          } else {
                            ((on) this).field_w[var5] = var6;
                            ((on) this).field_q[var5] = new int[var7.field_c];
                            var8 = 0;
                            L5: while (true) {
                              if (var8 >= var7.field_c) {
                                break L4;
                              } else {
                                ((on) this).field_q[var5][var8] = param1.k(98);
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
                    if (param2 == 4) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  var4_int = param1.f((byte) -111);
                  ((on) this).field_o = new int[var4_int];
                  var5 = 0;
                  L6: while (true) {
                    if (var5 >= var4_int) {
                      break L2;
                    } else {
                      ((on) this).field_o[var5] = param1.k(72);
                      var5++;
                      continue L6;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("on.E(").append(param0).append(',');
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
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        field_p = null;
        field_t = null;
        field_v = null;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = param1 >> 16;
        int var5 = 65535 & param1;
        int var6 = param0 >> 16;
        int var7 = 65535 & param0;
        return (var7 * var5 >> 16) + (param0 * var4 - -(var6 * var5));
    }

    on() {
    }

    final String f(int param0) {
        int var4 = HoldTheLine.field_D;
        StringBuilder var6 = new StringBuilder(80);
        var6 = var6;
        if (null == ((on) this).field_u) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(((on) this).field_u[0]);
        int var3 = 1;
        if (param0 != 245197136) {
            ((on) this).field_w = null;
        }
        while (((on) this).field_u.length > var3) {
            StringBuilder discarded$1 = var6.append("...");
            StringBuilder discarded$2 = var6.append(((on) this).field_u[var3]);
            var3++;
        }
        return var6.toString();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "<col=2>--</col>";
    }
}
