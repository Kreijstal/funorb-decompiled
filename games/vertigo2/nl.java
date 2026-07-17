/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends ug {
    private long[] field_l;
    private long field_h;
    static int field_d;
    private int field_i;
    private long field_f;
    static int[] field_e;
    private long field_j;
    private int field_g;
    static int field_k;

    final static er[] a(int param0, int param1, r param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (hq.a(124, param1, param0, param2)) {
            int discarded$2 = 76;
            return vd.a();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("nl.K(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 13416 + 41);
        }
    }

    private final long d(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 + -((nl) this).field_f;
        ((nl) this).field_f = var2;
        if (param0 == -9830) {
          if (var4 > -5000000000L) {
            if (5000000000L > var4) {
              ((nl) this).field_l[((nl) this).field_g] = var4;
              ((nl) this).field_g = (1 + ((nl) this).field_g) % 10;
              if (((nl) this).field_i < 1) {
                ((nl) this).field_i = ((nl) this).field_i + 1;
                var6 = 0L;
                var8 = 1;
                L0: while (true) {
                  if (((nl) this).field_i < var8) {
                    return var6 / (long)((nl) this).field_i;
                  } else {
                    var6 = var6 + ((nl) this).field_l[(-var8 + (((nl) this).field_g - -10)) % 10];
                    var8++;
                    continue L0;
                  }
                }
              } else {
                var6 = 0L;
                var8 = 1;
                L1: while (true) {
                  if (((nl) this).field_i < var8) {
                    return var6 / (long)((nl) this).field_i;
                  } else {
                    var6 = var6 + ((nl) this).field_l[(-var8 + (((nl) this).field_g - -10)) % 10];
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              var6 = 0L;
              var8 = 1;
              L2: while (true) {
                if (((nl) this).field_i < var8) {
                  return var6 / (long)((nl) this).field_i;
                } else {
                  var6 = var6 + ((nl) this).field_l[(-var8 + (((nl) this).field_g - -10)) % 10];
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L3: while (true) {
              if (((nl) this).field_i < var8) {
                return var6 / (long)((nl) this).field_i;
              } else {
                var6 = var6 + ((nl) this).field_l[(-var8 + (((nl) this).field_g - -10)) % 10];
                var8++;
                continue L3;
              }
            }
          }
        } else {
          return -86L;
        }
    }

    final long a(int param0) {
        ((nl) this).field_h = ((nl) this).field_h + this.d(-9830);
        int var2 = -114 / ((param0 - 8) / 62);
        if (!(((nl) this).field_j <= ((nl) this).field_h)) {
            return (-((nl) this).field_h + ((nl) this).field_j) / 1000000L;
        }
        return 0L;
    }

    final void b(int param0) {
        L0: {
          if (((nl) this).field_j > ((nl) this).field_h) {
            ((nl) this).field_h = ((nl) this).field_h + (-((nl) this).field_h + ((nl) this).field_j);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -1) {
          return;
        } else {
          ((nl) this).field_f = 0L;
          return;
        }
    }

    final static boolean a() {
        return 250 < hm.field_F;
    }

    public static void e() {
        int var1 = 0;
        field_e = null;
    }

    final int a(boolean param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            break L0;
          }
        }
        if (~((nl) this).field_j < ~((nl) this).field_h) {
          ((nl) this).field_f = ((nl) this).field_f + (((nl) this).field_j - ((nl) this).field_h);
          ((nl) this).field_h = ((nl) this).field_h + (((nl) this).field_j - ((nl) this).field_h);
          ((nl) this).field_j = ((nl) this).field_j + param1;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            L2: {
              ((nl) this).field_j = ((nl) this).field_j + param1;
              var4++;
              if (var4 >= 10) {
                break L2;
              } else {
                if (~((nl) this).field_j > ~((nl) this).field_h) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (~((nl) this).field_h < ~((nl) this).field_j) {
                ((nl) this).field_j = ((nl) this).field_h;
                break L3;
              } else {
                break L3;
              }
            }
            return var4;
          }
        }
    }

    nl() {
        ((nl) this).field_i = 1;
        ((nl) this).field_h = 0L;
        ((nl) this).field_l = new long[10];
        ((nl) this).field_f = 0L;
        ((nl) this).field_j = 0L;
        ((nl) this).field_g = 0;
        ((nl) this).field_h = System.nanoTime();
        ((nl) this).field_j = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{14, 15, 16, 36, 7};
    }
}
