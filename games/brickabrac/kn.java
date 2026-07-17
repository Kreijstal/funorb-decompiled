/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends tk {
    boolean field_A;
    int[] field_x;
    static int field_z;
    static String[] field_E;
    String field_D;
    static int field_y;
    char[] field_u;
    static volatile boolean field_C;
    int[] field_v;
    char[] field_w;

    private final void a(int param0, wq param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char stackOut_15_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char stackOut_8_2 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 59) {
                break L1;
              } else {
                field_z = -79;
                break L1;
              }
            }
            L2: {
              if (1 == param2) {
                ((kn) this).field_D = param1.d(-1);
                break L2;
              } else {
                if (param2 != 2) {
                  if (param2 != 3) {
                    if (param2 != 4) {
                      break L2;
                    } else {
                      ((kn) this).field_A = true;
                      break L2;
                    }
                  } else {
                    var4_int = param1.l(255);
                    ((kn) this).field_u = new char[var4_int];
                    ((kn) this).field_v = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L2;
                      } else {
                        L4: {
                          ((kn) this).field_v[var5] = param1.i(65280);
                          var6 = param1.b(true);
                          stackOut_14_0 = ((kn) this).field_u;
                          stackOut_14_1 = var5;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          if (0 == var6) {
                            stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            stackIn_17_2 = stackOut_16_2;
                            break L4;
                          } else {
                            stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = cq.a((byte) -11, (byte) var6);
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            stackIn_17_2 = stackOut_15_2;
                            break L4;
                          }
                        }
                        stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var4_int = param1.l(255);
                  ((kn) this).field_x = new int[var4_int];
                  ((kn) this).field_w = new char[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= var4_int) {
                      break L2;
                    } else {
                      L6: {
                        ((kn) this).field_x[var5] = param1.i(65280);
                        var6 = param1.b(true);
                        stackOut_7_0 = ((kn) this).field_w;
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
                          break L6;
                        } else {
                          stackOut_8_0 = (char[]) (Object) stackIn_8_0;
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = cq.a((byte) -112, (byte) var6);
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          break L6;
                        }
                      }
                      stackIn_10_0[stackIn_10_1] = (char) stackIn_10_2;
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
          L7: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("kn.D(").append(param0).append(44);
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
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param2 + 41);
        }
    }

    public static void a(byte param0) {
        field_E = null;
        if (param0 <= 44) {
            kn.a((byte) -32);
        }
    }

    final void a(wq param0, int param1) {
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
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -29539) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.l(255);
              if (0 != var3_int) {
                this.a(104, param0, var3_int);
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
            stackOut_7_1 = new StringBuilder().append("kn.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        try {
            if (11 == i.field_j) {
                mk.a(-1);
            }
            if (!param0) {
                kn.a((byte) -116);
            }
            bf.a(ri.field_N, 8192, ep.field_a, vq.field_C);
            ck.a(param1, 0, 14209, 0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "kn.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var5 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 >= -86) {
            Object var4 = null;
            kn.a(false, (java.awt.Canvas) null);
        }
        if (null != ((kn) this).field_v) {
            for (var2 = 0; var2 < ((kn) this).field_v.length; var2++) {
                ((kn) this).field_v[var2] = ud.d(((kn) this).field_v[var2], 32768);
            }
        }
        if (((kn) this).field_x != null) {
            var5 = 0;
            var2 = var5;
            while (var5 < ((kn) this).field_x.length) {
                ((kn) this).field_x[var5] = ud.d(((kn) this).field_x[var5], 32768);
                var5++;
            }
        }
    }

    kn() {
        ((kn) this).field_A = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = false;
    }
}
