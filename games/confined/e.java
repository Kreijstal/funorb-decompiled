/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    int field_e;
    static hb field_c;
    static od field_a;
    static String field_d;
    int field_b;

    final static void a(mn param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dc var3 = null;
        dc var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = 34 / ((-84 - param1) / 37);
            L1: while (true) {
              var3 = (dc) (Object) param0.a(false);
              if (var3 == null) {
                return;
              } else {
                var4 = (dc) (Object) param0.a((byte) 82);
                var5 = 1;
                L2: while (true) {
                  if (var4 == null) {
                    if (var5 == 0) {
                      var4 = (dc) (Object) param0.a(60);
                      var5 = 1;
                      var3 = (dc) (Object) param0.d(2123);
                      L3: while (true) {
                        if (var3 == null) {
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L0;
                          }
                        } else {
                          L4: {
                            if (var4.field_I > var3.field_I) {
                              ri.a((rk) (Object) var4, 0, (rk) (Object) var3);
                              var5 = 0;
                              break L4;
                            } else {
                              var4 = var3;
                              break L4;
                            }
                          }
                          var3 = (dc) (Object) param0.d(2123);
                          continue L3;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    L5: {
                      if (var4.field_I > var3.field_I) {
                        var5 = 0;
                        ri.a((rk) (Object) var4, 0, (rk) (Object) var3);
                        break L5;
                      } else {
                        var3 = var4;
                        break L5;
                      }
                    }
                    var4 = (dc) (Object) param0.a((byte) -52);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("e.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 52) {
            e.a(26);
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    e(int param0, int param1, int param2, int param3) {
        ((e) this).field_b = param3;
        ((e) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Score";
    }
}
