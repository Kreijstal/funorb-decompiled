/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends wb {
    static int field_s;
    static String field_u;
    char[] field_p;
    String field_v;
    static ml field_t;
    boolean field_o;
    char[] field_r;
    int[] field_w;
    static int[] field_q;
    int[] field_x;

    final void d(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = Virogrid.field_F ? 1 : 0;
        if (null != ((u) this).field_w) {
            for (var2 = 0; ((u) this).field_w.length > var2; var2++) {
                ((u) this).field_w[var2] = oh.a(((u) this).field_w[var2], 32768);
            }
        }
        if (((u) this).field_x != null) {
            var4 = 0;
            var2 = var4;
            while (((u) this).field_x.length > var4) {
                ((u) this).field_x[var4] = oh.a(((u) this).field_x[var4], 32768);
                var4++;
            }
        }
        if (param0 != 3818) {
            u.b((byte) 57);
        }
    }

    public static void b(byte param0) {
        field_q = null;
        field_u = null;
        if (param0 != -11) {
            u.b((byte) -54);
        }
        field_t = null;
    }

    private final void a(int param0, jc param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        char stackOut_17_2 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        char stackOut_9_2 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != 1) {
                if (param2 != 2) {
                  if (param2 != 3) {
                    if (param2 != 4) {
                      break L1;
                    } else {
                      ((u) this).field_o = true;
                      break L1;
                    }
                  } else {
                    var4_int = param1.g(11132);
                    ((u) this).field_w = new int[var4_int];
                    ((u) this).field_r = new char[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L3: {
                          ((u) this).field_w[var5] = param1.c((byte) -88);
                          var6 = param1.a((byte) 47);
                          stackOut_15_0 = ((u) this).field_r;
                          stackOut_15_1 = var5;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if (0 != var6) {
                            stackOut_17_0 = (char[]) (Object) stackIn_17_0;
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = mm.a(93, (byte) var6);
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            stackIn_18_2 = stackOut_17_2;
                            break L3;
                          } else {
                            stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = 0;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            break L3;
                          }
                        }
                        stackIn_18_0[stackIn_18_1] = (char) stackIn_18_2;
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var4_int = param1.g(11132);
                  ((u) this).field_x = new int[var4_int];
                  ((u) this).field_p = new char[var4_int];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      L5: {
                        ((u) this).field_x[var5] = param1.c((byte) 125);
                        var6 = param1.a((byte) 77);
                        stackOut_8_0 = ((u) this).field_p;
                        stackOut_8_1 = var5;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var6 == 0) {
                          stackOut_10_0 = (char[]) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L5;
                        } else {
                          stackOut_9_0 = (char[]) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = mm.a(100, (byte) var6);
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L5;
                        }
                      }
                      stackIn_11_0[stackIn_11_1] = (char) stackIn_11_2;
                      var5++;
                      continue L4;
                    }
                  }
                }
              } else {
                ((u) this).field_v = param1.h(-125);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("u.B(").append(-4).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, jc param1) {
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
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 11693) {
              L1: while (true) {
                var3_int = param1.g(param0 + -561);
                if (var3_int == 0) {
                  break L0;
                } else {
                  this.a(-4, param1, var3_int);
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
            stackOut_6_1 = new StringBuilder().append("u.D(").append(param0).append(',');
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
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    u() {
        ((u) this).field_o = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[8192];
        field_u = "You are offering an unrated rematch.";
    }
}
