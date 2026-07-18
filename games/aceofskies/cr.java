/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr extends tf {
    private int field_g;
    private long field_f;
    private long field_e;
    private int field_h;
    private long[] field_d;
    private long field_c;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              param1 = lm.a('_', param2 + -172, param1, "");
              var3 = ph.a(param0, 0);
              if (param2 == 52) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = cr.a((String) null, (String) null, (byte) -22);
                break L1;
              }
            }
            L2: {
              L3: {
                if (-1 != param1.indexOf(param0)) {
                  break L3;
                } else {
                  if (param1.indexOf(var3) == -1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("cr.E(");
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final long a(boolean param0) {
        ((cr) this).field_c = ((cr) this).field_c + this.b(-89);
        if (!(((cr) this).field_e <= ((cr) this).field_c)) {
            return (-((cr) this).field_c + ((cr) this).field_e) / 1000000L;
        }
        if (param0) {
            ((cr) this).a(6);
        }
        return 0L;
    }

    final void a(int param0) {
        if (!(((cr) this).field_c >= ((cr) this).field_e)) {
            ((cr) this).field_c = ((cr) this).field_c + (-((cr) this).field_c + ((cr) this).field_e);
        }
        ((cr) this).field_f = (long)param0;
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param1 == 0) {
          if (((cr) this).field_c < ((cr) this).field_e) {
            ((cr) this).field_f = ((cr) this).field_f + (((cr) this).field_e + -((cr) this).field_c);
            ((cr) this).field_c = ((cr) this).field_c + (((cr) this).field_e + -((cr) this).field_c);
            ((cr) this).field_e = ((cr) this).field_e + param0;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((cr) this).field_e = ((cr) this).field_e + param0;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (~((cr) this).field_e > ~((cr) this).field_c) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (~((cr) this).field_c < ~((cr) this).field_e) {
                  ((cr) this).field_e = ((cr) this).field_c;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          }
        } else {
          return -42;
        }
    }

    private final long b(int param0) {
        int var8 = 0;
        int var9 = AceOfSkies.field_G ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - ((cr) this).field_f;
        ((cr) this).field_f = var2;
        if (-5000000000L < var4) {
            if (var4 < 5000000000L) {
                ((cr) this).field_d[((cr) this).field_h] = var4;
                if (((cr) this).field_g < 1) {
                    ((cr) this).field_g = ((cr) this).field_g + 1;
                }
                ((cr) this).field_h = (1 + ((cr) this).field_h) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((cr) this).field_g; var8++) {
            var6 = var6 + ((cr) this).field_d[(10 + ((cr) this).field_h - var8) % 10];
        }
        return var6 / (long)((cr) this).field_g;
    }

    cr() {
        ((cr) this).field_e = 0L;
        ((cr) this).field_g = 1;
        ((cr) this).field_d = new long[10];
        ((cr) this).field_f = 0L;
        ((cr) this).field_h = 0;
        ((cr) this).field_c = 0L;
        ((cr) this).field_c = System.nanoTime();
        ((cr) this).field_e = System.nanoTime();
    }

    static {
    }
}
