/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends rg {
    static int field_y;
    char[] field_w;
    static String field_z;
    static eg field_E;
    int[] field_D;
    char[] field_A;
    boolean field_C;
    static String field_x;
    static wc field_B;
    int[] field_F;
    String field_G;

    public static void e(int param0) {
        field_E = null;
        field_z = null;
        field_x = null;
        if (param0 > -73) {
            field_E = null;
        }
        field_B = null;
    }

    private final void a(int param0, ge param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        char stackOut_17_2 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        char stackOut_11_2 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param2 != 1) {
                if (param2 == 2) {
                  var4_int = param1.g(-90);
                  ((sf) this).field_w = new char[var4_int];
                  ((sf) this).field_F = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      L3: {
                        ((sf) this).field_F[var5] = param1.d(-1034);
                        var6 = param1.e((byte) 105);
                        stackOut_15_0 = ((sf) this).field_w;
                        stackOut_15_1 = var5;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (var6 != 0) {
                          stackOut_17_0 = (char[]) (Object) stackIn_17_0;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = s.a((byte) var6, 8);
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
                } else {
                  if (param2 == 3) {
                    var4_int = param1.g(-106);
                    ((sf) this).field_A = new char[var4_int];
                    ((sf) this).field_D = new int[var4_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L5: {
                          ((sf) this).field_D[var5] = param1.d(-1034);
                          var6 = param1.e((byte) 105);
                          stackOut_9_0 = ((sf) this).field_A;
                          stackOut_9_1 = var5;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          if (var6 != 0) {
                            stackOut_11_0 = (char[]) (Object) stackIn_11_0;
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = s.a((byte) var6, 8);
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            break L5;
                          } else {
                            stackOut_10_0 = (char[]) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 0;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            break L5;
                          }
                        }
                        stackIn_12_0[stackIn_12_1] = (char) stackIn_12_2;
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if (param2 != 4) {
                      break L1;
                    } else {
                      ((sf) this).field_C = true;
                      break L1;
                    }
                  }
                }
              } else {
                ((sf) this).field_G = param1.j(-119);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("sf.D(").append(-121).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ')');
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var5 = 0;
        int var3 = Pool.field_O;
        if (((sf) this).field_D != null) {
            for (var2 = 0; var2 < ((sf) this).field_D.length; var2++) {
                ((sf) this).field_D[var2] = md.a(((sf) this).field_D[var2], 32768);
            }
        }
        if (!(null == ((sf) this).field_F)) {
            var5 = 0;
            var2 = var5;
            while (((sf) this).field_F.length > var5) {
                ((sf) this).field_F[var5] = md.a(((sf) this).field_F[var5], 32768);
                var5++;
            }
        }
        if (param0 != 0) {
            Object var4 = null;
            ((sf) this).a((byte) -86, (ge) null);
        }
    }

    final void a(byte param0, ge param1) {
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
        var4 = Pool.field_O;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.g(param0 ^ 1);
              if (var3_int != 0) {
                this.a(-121, param1, var3_int);
                continue L1;
              } else {
                L2: {
                  if (param0 == -123) {
                    break L2;
                  } else {
                    ((sf) this).field_w = null;
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("sf.C(").append(param0).append(',');
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
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final static void b(byte param0, ge param1) {
        int var2_int = 0;
        try {
            wi.field_a = param1.d(-1034) << 5;
            var2_int = param1.g(-74);
            jj.field_F = (var2_int & 7) << 18;
            wi.field_a = wi.field_a + (var2_int >> 3);
            jj.field_F = jj.field_F + (param1.d(-1034) << 2);
            var2_int = param1.g(-115);
            vd.field_n = (63 & var2_int) << 15;
            jj.field_F = jj.field_F + (var2_int >> 6);
            vd.field_n = vd.field_n + (param1.g(-75) << 7);
            var2_int = param1.g(-61);
            vd.field_n = vd.field_n + (var2_int >> 1);
            vb.field_f = (var2_int & 1) << 16;
            vb.field_f = vb.field_f + param1.d(-1034);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "sf.B(" + 125 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    sf() {
        ((sf) this).field_C = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "The '<%0>' setting needs to be changed.";
        field_z = "<img=0> Click on the cue ball to take your shot.";
    }
}
