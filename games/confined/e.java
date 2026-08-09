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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = 34 / ((-84 - param1) / 37);
            L1: while (true) {
              var3 = (dc) ((Object) param0.a(false));
              if (var3 == null) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var4 = (dc) ((Object) param0.a((byte) 82));
                var5 = 1;
                L2: while (true) {
                  if (var4 == null) {
                    if (var5 == 0) {
                      var4 = (dc) ((Object) param0.a(60));
                      var5 = 1;
                      var3 = (dc) ((Object) param0.d(2123));
                      L3: while (true) {
                        if (var3 == null) {
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          L4: {
                            if (var4.field_I > var3.field_I) {
                              ri.a(var4, 0, var3);
                              var5 = 0;
                              break L4;
                            } else {
                              var4 = var3;
                              break L4;
                            }
                          }
                          var3 = (dc) ((Object) param0.d(2123));
                          continue L3;
                        }
                      }
                    } else {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    L5: {
                      if (var4.field_I > var3.field_I) {
                        var5 = 0;
                        ri.a(var4, 0, var3);
                        break L5;
                      } else {
                        var3 = var4;
                        break L5;
                      }
                    }
                    var4 = (dc) ((Object) param0.a((byte) -52));
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
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("e.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
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
        this.field_b = param3;
        this.field_e = param0;
    }

    static {
        field_d = "Score";
    }
}
