/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class uf extends fg {
    private int field_g;
    private int field_j;
    static String field_c;
    private long[] field_i;
    static String field_k;
    static String field_e;
    private long field_d;
    private long field_h;
    private long field_f;

    public static void a() {
        field_e = null;
        field_c = null;
        field_k = null;
    }

    private final long b() {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 + -((uf) this).field_h;
        ((uf) this).field_h = var2;
        if (-5000000000L < var4) {
          if (var4 < 5000000000L) {
            ((uf) this).field_i[((uf) this).field_j] = var4;
            if (1 <= ((uf) this).field_g) {
              ((uf) this).field_j = (((uf) this).field_j - -1) % 10;
              var6 = 0L;
              var8 = 1;
              L0: while (true) {
                if (((uf) this).field_g < var8) {
                  return var6 / (long)((uf) this).field_g;
                } else {
                  var6 = var6 + ((uf) this).field_i[(-var8 + ((uf) this).field_j - -10) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              ((uf) this).field_g = ((uf) this).field_g + 1;
              ((uf) this).field_j = (((uf) this).field_j - -1) % 10;
              var6 = 0L;
              var8 = 1;
              L1: while (true) {
                if (((uf) this).field_g < var8) {
                  return var6 / (long)((uf) this).field_g;
                } else {
                  var6 = var6 + ((uf) this).field_i[(-var8 + ((uf) this).field_j - -10) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L2: while (true) {
              if (((uf) this).field_g < var8) {
                return var6 / (long)((uf) this).field_g;
              } else {
                var6 = var6 + ((uf) this).field_i[(-var8 + ((uf) this).field_j - -10) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = 1;
          L3: while (true) {
            if (((uf) this).field_g < var8) {
              return var6 / (long)((uf) this).field_g;
            } else {
              var6 = var6 + ((uf) this).field_i[(-var8 + ((uf) this).field_j - -10) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final long a(int param0) {
        int discarded$0 = 0;
        ((uf) this).field_d = ((uf) this).field_d + this.b();
        if (!(((uf) this).field_d >= ((uf) this).field_f)) {
            return (((uf) this).field_f - ((uf) this).field_d) / 1000000L;
        }
        int var2 = -90 % ((34 - param0) / 38);
        return 0L;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 1;
        int var4 = param2 >> 31 & -1 + param1;
        return var4 + (param2 - -(param2 >>> 31)) % param1;
    }

    final int a(long param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == 37) {
          if (~((uf) this).field_f >= ~((uf) this).field_d) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((uf) this).field_f = ((uf) this).field_f + param0;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (~((uf) this).field_d < ~((uf) this).field_f) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (((uf) this).field_f < ((uf) this).field_d) {
                ((uf) this).field_f = ((uf) this).field_d;
                return var4;
              } else {
                return var4;
              }
            }
          } else {
            ((uf) this).field_h = ((uf) this).field_h + (-((uf) this).field_d + ((uf) this).field_f);
            ((uf) this).field_d = ((uf) this).field_d + (-((uf) this).field_d + ((uf) this).field_f);
            ((uf) this).field_f = ((uf) this).field_f + param0;
            return 1;
          }
        } else {
          field_k = null;
          if (~((uf) this).field_f >= ~((uf) this).field_d) {
            var4 = 0;
            L2: while (true) {
              L3: {
                ((uf) this).field_f = ((uf) this).field_f + param0;
                var4++;
                if (var4 >= 10) {
                  break L3;
                } else {
                  if (~((uf) this).field_d < ~((uf) this).field_f) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (((uf) this).field_f >= ((uf) this).field_d) {
                return var4;
              } else {
                ((uf) this).field_f = ((uf) this).field_d;
                return var4;
              }
            }
          } else {
            ((uf) this).field_h = ((uf) this).field_h + (-((uf) this).field_d + ((uf) this).field_f);
            ((uf) this).field_d = ((uf) this).field_d + (-((uf) this).field_d + ((uf) this).field_f);
            ((uf) this).field_f = ((uf) this).field_f + param0;
            return 1;
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, byte param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_12_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_11_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var3 = null;
            if (param1 > 74) {
              L1: {
                if (e.field_c == null) {
                  break L1;
                } else {
                  if (!e.field_c.equals((Object) (Object) param0.getParameter("settings"))) {
                    var3 = (Object) (Object) e.field_c;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var4 = null;
                if (null == kd.field_e) {
                  break L2;
                } else {
                  if (!kd.field_e.equals((Object) (Object) param0.getParameter("session"))) {
                    var4 = (Object) (Object) kd.field_e;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_11_0 = fc.a((String) var3, param2, (String) var4, -1, 35);
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (java.net.URL) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_13_0 = var3;
            stackOut_13_1 = new StringBuilder().append("uf.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    final void a(boolean param0) {
        L0: {
          if (((uf) this).field_d < ((uf) this).field_f) {
            ((uf) this).field_d = ((uf) this).field_d + (-((uf) this).field_d + ((uf) this).field_f);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return;
        } else {
          ((uf) this).field_h = 0L;
          return;
        }
    }

    uf() {
        ((uf) this).field_g = 1;
        ((uf) this).field_h = 0L;
        ((uf) this).field_i = new long[10];
        ((uf) this).field_j = 0;
        ((uf) this).field_f = 0L;
        ((uf) this).field_d = 0L;
        ((uf) this).field_d = System.nanoTime();
        ((uf) this).field_f = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Cancel";
        field_e = "Not yet achieved";
        field_k = "To Customer Support";
    }
}
