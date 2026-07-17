/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends gp {
    int[] field_C;
    char[] field_u;
    boolean field_y;
    static String field_E;
    int[] field_z;
    static cr field_A;
    static String field_w;
    static String field_t;
    String field_D;
    static cr field_x;
    char[] field_v;

    private final void a(int param0, int param1, ed param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        char[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        char stackOut_19_2 = 0;
        char[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        char[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        char stackOut_12_2 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 6267) {
              L1: {
                if (param1 != 1) {
                  if (param1 == 2) {
                    var4_int = param2.h(-11);
                    ((ud) this).field_v = new char[var4_int];
                    ((ud) this).field_C = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          ((ud) this).field_C[var5] = param2.a((byte) -11);
                          var6 = param2.g(88);
                          stackOut_17_0 = ((ud) this).field_v;
                          stackOut_17_1 = var5;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_19_1 = stackOut_17_1;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          if (var6 != 0) {
                            stackOut_19_0 = (char[]) (Object) stackIn_19_0;
                            stackOut_19_1 = stackIn_19_1;
                            stackOut_19_2 = mn.a((byte) var6, 93);
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            stackIn_20_2 = stackOut_19_2;
                            break L3;
                          } else {
                            stackOut_18_0 = (char[]) (Object) stackIn_18_0;
                            stackOut_18_1 = stackIn_18_1;
                            stackOut_18_2 = 0;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            stackIn_20_2 = stackOut_18_2;
                            break L3;
                          }
                        }
                        stackIn_20_0[stackIn_20_1] = (char) stackIn_20_2;
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (param1 == 3) {
                      var4_int = param2.h(-11);
                      ((ud) this).field_z = new int[var4_int];
                      ((ud) this).field_u = new char[var4_int];
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var4_int) {
                          break L1;
                        } else {
                          L5: {
                            ((ud) this).field_z[var5] = param2.a((byte) -11);
                            var6 = param2.g(112);
                            stackOut_11_0 = ((ud) this).field_u;
                            stackOut_11_1 = var5;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            if (var6 == 0) {
                              stackOut_13_0 = (char[]) (Object) stackIn_13_0;
                              stackOut_13_1 = stackIn_13_1;
                              stackOut_13_2 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              stackIn_14_2 = stackOut_13_2;
                              break L5;
                            } else {
                              stackOut_12_0 = (char[]) (Object) stackIn_12_0;
                              stackOut_12_1 = stackIn_12_1;
                              stackOut_12_2 = mn.a((byte) var6, -48);
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              stackIn_14_2 = stackOut_12_2;
                              break L5;
                            }
                          }
                          stackIn_14_0[stackIn_14_1] = (char) stackIn_14_2;
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      if (4 != param1) {
                        break L1;
                      } else {
                        ((ud) this).field_y = true;
                        break L1;
                      }
                    }
                  }
                } else {
                  ((ud) this).field_D = param2.f(param0 ^ 6395);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("ud.C(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final void a(ed param0, int param1) {
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
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                ud.b((byte) -4);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.h(-11);
              if (0 != var3_int) {
                this.a(6267, var3_int, param0);
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
            stackOut_7_1 = new StringBuilder().append("ud.A(");
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
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    public static void b(byte param0) {
        field_w = null;
        field_E = null;
        field_t = null;
        field_A = null;
        field_x = null;
        if (param0 != -37) {
            ud.b((byte) -106);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 89) {
            ud.b((byte) -113);
        }
        if (!(((ud) this).field_z == null)) {
            for (var2 = 0; ((ud) this).field_z.length > var2; var2++) {
                ((ud) this).field_z[var2] = om.a(((ud) this).field_z[var2], 32768);
            }
        }
        if (!(((ud) this).field_C == null)) {
            var4 = 0;
            var2 = var4;
            while (((ud) this).field_C.length > var4) {
                ((ud) this).field_C[var4] = om.a(((ud) this).field_C[var4], 32768);
                var4++;
            }
        }
    }

    ud() {
        ((ud) this).field_y = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Names can only contain letters, numbers, spaces and underscores";
        field_t = "<%0> would need a rating of <%1> to play with the current options.";
        field_E = "Show all private chat";
    }
}
