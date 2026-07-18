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
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        char[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        char stackOut_13_2 = 0;
        char[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char stackOut_6_2 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 == param2) {
                ((kn) this).field_D = param1.d(-1);
                break L1;
              } else {
                if (param2 != 2) {
                  if (param2 != 3) {
                    if (param2 != 4) {
                      break L1;
                    } else {
                      ((kn) this).field_A = true;
                      break L1;
                    }
                  } else {
                    var4_int = param1.l(255);
                    ((kn) this).field_u = new char[var4_int];
                    ((kn) this).field_v = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L3: {
                          ((kn) this).field_v[var5] = param1.i(65280);
                          var6 = param1.b(true);
                          stackOut_12_0 = ((kn) this).field_u;
                          stackOut_12_1 = var5;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (0 == var6) {
                            stackOut_14_0 = (char[]) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            break L3;
                          } else {
                            stackOut_13_0 = (char[]) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = cq.a((byte) -11, (byte) var6);
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            break L3;
                          }
                        }
                        stackIn_15_0[stackIn_15_1] = (char) stackIn_15_2;
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var4_int = param1.l(255);
                  ((kn) this).field_x = new int[var4_int];
                  ((kn) this).field_w = new char[var4_int];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      L5: {
                        ((kn) this).field_x[var5] = param1.i(65280);
                        var6 = param1.b(true);
                        stackOut_5_0 = ((kn) this).field_w;
                        stackOut_5_1 = var5;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (0 == var6) {
                          stackOut_7_0 = (char[]) (Object) stackIn_7_0;
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          stackIn_8_2 = stackOut_7_2;
                          break L5;
                        } else {
                          stackOut_6_0 = (char[]) (Object) stackIn_6_0;
                          stackOut_6_1 = stackIn_6_1;
                          stackOut_6_2 = cq.a((byte) -112, (byte) var6);
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_8_2 = stackOut_6_2;
                          break L5;
                        }
                      }
                      stackIn_8_0[stackIn_8_1] = (char) stackIn_8_2;
                      var5++;
                      continue L4;
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
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("kn.D(").append(104).append(',');
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
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ')');
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
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        try {
            if (11 == i.field_j) {
                int discarded$0 = -1;
                mk.a();
            }
            if (!param0) {
                kn.a((byte) -116);
            }
            bf.a(ri.field_N, 8192, ep.field_a, vq.field_C);
            int discarded$1 = 0;
            int discarded$2 = 14209;
            int discarded$3 = 0;
            ck.a(param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "kn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
