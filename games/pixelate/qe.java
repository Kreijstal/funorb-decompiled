/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends lm {
    int[] field_D;
    static int[] field_v;
    String field_C;
    char[] field_x;
    static jl field_A;
    char[] field_t;
    static ll field_w;
    boolean field_y;
    static int field_u;
    int[] field_z;

    final void a(byte param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != 92) {
            return;
        }
        if (!(((qe) this).field_D == null)) {
            for (var2 = 0; var2 < ((qe) this).field_D.length; var2++) {
                ((qe) this).field_D[var2] = bq.a(((qe) this).field_D[var2], 32768);
            }
        }
        if (!(null == ((qe) this).field_z)) {
            var4 = 0;
            var2 = var4;
            while (var4 < ((qe) this).field_z.length) {
                ((qe) this).field_z[var4] = bq.a(((qe) this).field_z[var4], 32768);
                var4++;
            }
        }
    }

    public static void g() {
        field_A = null;
        int var1 = 33;
        field_w = null;
        field_v = null;
    }

    final void a(boolean param0, we param1) {
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
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var5 = null;
                this.a(113, 78, (we) null);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param1.f(255);
              if (0 == var3_int) {
                break L0;
              } else {
                this.a(var3_int, 3, param1);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("qe.B(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static eh a(String param0, int param1) {
        eg var3 = null;
        RuntimeException var3_ref = null;
        eg stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new eg();
            ((eh) (Object) var3).field_e = param1;
            ((eh) (Object) var3).field_b = param0;
            stackOut_0_0 = (eg) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("qe.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + 126 + ')');
        }
        return (eh) (Object) stackIn_1_0;
    }

    qe() {
        ((qe) this).field_y = false;
    }

    private final void a(int param0, int param1, we param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        char stackOut_17_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char stackOut_8_2 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != 1) {
                if (2 == param0) {
                  var4_int = param2.f(param1 + 252);
                  ((qe) this).field_x = new char[var4_int];
                  ((qe) this).field_z = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      L3: {
                        ((qe) this).field_z[var5] = param2.a((byte) -128);
                        var6 = param2.a(0);
                        stackOut_16_0 = ((qe) this).field_x;
                        stackOut_16_1 = var5;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (var6 == 0) {
                          stackOut_18_0 = (char[]) (Object) stackIn_18_0;
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          stackIn_19_2 = stackOut_18_2;
                          break L3;
                        } else {
                          int discarded$2 = 63;
                          stackOut_17_0 = (char[]) (Object) stackIn_17_0;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = cm.a((byte) var6);
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_19_1 = stackOut_17_1;
                          stackIn_19_2 = stackOut_17_2;
                          break L3;
                        }
                      }
                      stackIn_19_0[stackIn_19_1] = (char) stackIn_19_2;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (3 != param0) {
                    if (param0 == 4) {
                      ((qe) this).field_y = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param2.f(255);
                    ((qe) this).field_t = new char[var4_int];
                    ((qe) this).field_D = new int[var4_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L5: {
                          ((qe) this).field_D[var5] = param2.a((byte) -113);
                          var6 = param2.a(0);
                          stackOut_7_0 = ((qe) this).field_t;
                          stackOut_7_1 = var5;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          if (0 == var6) {
                            stackOut_9_0 = (char[]) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            break L5;
                          } else {
                            int discarded$3 = 63;
                            stackOut_8_0 = (char[]) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = cm.a((byte) var6);
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_10_2 = stackOut_8_2;
                            break L5;
                          }
                        }
                        stackIn_10_0[stackIn_10_1] = (char) stackIn_10_2;
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                ((qe) this).field_C = param2.h(param1 ^ 6);
                break L1;
              }
            }
            L6: {
              if (param1 == 3) {
                break L6;
              } else {
                var8 = null;
                ((qe) this).a(true, (we) null);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("qe.E(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new int[8192];
    }
}
