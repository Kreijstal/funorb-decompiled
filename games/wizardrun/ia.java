/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends md {
    static le[] field_f;
    static o[] field_i;
    private long field_h;
    static String[] field_p;
    static int field_n;
    private int field_l;
    private long field_m;
    static int field_j;
    private int field_o;
    private long[] field_k;
    private long field_g;

    final void a(int param0) {
        ((ia) this).field_g = 0L;
        if (((ia) this).field_m < ((ia) this).field_h) {
            ((ia) this).field_m = ((ia) this).field_m + (-((ia) this).field_m + ((ia) this).field_h);
        }
        if (param0 != 5) {
            ((ia) this).field_k = null;
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_i = null;
        field_p = null;
    }

    final static void a(int param0, wc param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
        var5 = wizardrun.field_H;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (3 <= var2_int) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= ca.field_e) {
                    int dupTemp$4 = param1.a((byte) 102);
                    hj.field_b[dupTemp$4] = hj.field_b[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (ca.field_e <= var3) {
                        ca.field_e = var2_int;
                        int fieldTemp$5 = ca.field_e;
                        ca.field_e = ca.field_e + 1;
                        mi.field_B[fieldTemp$5] = param1;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (mi.field_B[var3].field_i != param1.field_i) {
                              break L5;
                            } else {
                              var4 = mi.field_B[var3].a((byte) 102);
                              if (qh.field_j < hj.field_b[var4]) {
                                hj.field_b[var4] = hj.field_b[var4] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          mi.field_B[incrementValue$6] = mi.field_B[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (param1.field_i != mi.field_B[var2_int].field_i) {
                        break L6;
                      } else {
                        int dupTemp$7 = mi.field_B[var2_int].a((byte) 102);
                        hj.field_b[dupTemp$7] = hj.field_b[dupTemp$7] + 1;
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                hj.field_b[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ia.I(").append(0).append(',');
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
          throw bd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final long b(byte param0) {
        int discarded$0 = 1;
        ((ia) this).field_m = ((ia) this).field_m + this.a();
        if (param0 != 66) {
            return -28L;
        }
        if (!(((ia) this).field_m >= ((ia) this).field_h)) {
            return (-((ia) this).field_m + ((ia) this).field_h) / 1000000L;
        }
        return 0L;
    }

    final static void b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            var1_int = id.field_b[0];
            var2 = 1;
            L1: while (true) {
              if (var2 >= id.field_b.length) {
                break L0;
              } else {
                var3 = id.field_b[var2];
                g.a(cb.field_e, var2 << 4, cb.field_e, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "ia.J(" + 0 + ')');
        }
    }

    final int a(long param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = wizardrun.field_H;
          if (param1) {
            break L0;
          } else {
            ((ia) this).field_l = -1;
            break L0;
          }
        }
        if (~((ia) this).field_h < ~((ia) this).field_m) {
          ((ia) this).field_g = ((ia) this).field_g + (((ia) this).field_h + -((ia) this).field_m);
          ((ia) this).field_m = ((ia) this).field_m + (-((ia) this).field_m + ((ia) this).field_h);
          ((ia) this).field_h = ((ia) this).field_h + param0;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            L2: {
              ((ia) this).field_h = ((ia) this).field_h + param0;
              var4++;
              if (var4 >= 10) {
                break L2;
              } else {
                if (~((ia) this).field_h > ~((ia) this).field_m) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((ia) this).field_h >= ((ia) this).field_m) {
                break L3;
              } else {
                ((ia) this).field_h = ((ia) this).field_m;
                break L3;
              }
            }
            return var4;
          }
        }
    }

    private final long a() {
        int var8 = 0;
        int var9 = wizardrun.field_H;
        long var2 = System.nanoTime();
        long var4 = -((ia) this).field_g + var2;
        ((ia) this).field_g = var2;
        if (var4 > -5000000000L) {
            if (var4 < 5000000000L) {
                ((ia) this).field_k[((ia) this).field_l] = var4;
                ((ia) this).field_l = (1 + ((ia) this).field_l) % 10;
                if (((ia) this).field_o < 1) {
                    ((ia) this).field_o = ((ia) this).field_o + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((ia) this).field_o; var8++) {
            var6 = var6 + ((ia) this).field_k[(((ia) this).field_l + (-var8 + 10)) % 10];
        }
        return var6 / (long)((ia) this).field_o;
    }

    ia() {
        ((ia) this).field_h = 0L;
        ((ia) this).field_m = 0L;
        ((ia) this).field_l = 0;
        ((ia) this).field_o = 1;
        ((ia) this).field_k = new long[10];
        ((ia) this).field_g = 0L;
        ((ia) this).field_m = System.nanoTime();
        ((ia) this).field_h = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
