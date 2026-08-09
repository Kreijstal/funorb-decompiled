/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static ro field_a;
    static qr field_b;
    static int[] field_c;

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        if (param0 > 14) {
          L0: {
            L1: {
              if (this == ti.field_d) {
                break L1;
              } else {
                if (sh.field_c == this) {
                  break L1;
                } else {
                  if (this != ih.field_f) {
                    stackIn_8_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_8_0 = 1;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ro a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6_ref_String = null;
        int var6 = 0;
        ro var7 = null;
        int var8 = 0;
        ro stackIn_4_0 = null;
        ro stackIn_7_0 = null;
        ro stackIn_11_0 = null;
        ro stackIn_17_0 = null;
        ro stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 == (var2_int ^ -1)) {
              stackIn_4_0 = (ro) (field_a);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) >= -256) {
                var3 = so.a(param0, '.', -92);
                if ((var3.length ^ -1) > -3) {
                  stackIn_11_0 = (ro) (field_a);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      var6 = 15 / ((55 - param1) / 53);
                      stackIn_20_0 = oq.a(var3[var3.length - 1], false);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6_ref_String = var4[var5];
                      var7 = w.a((byte) -94, var6_ref_String);
                      if (var7 != null) {
                        stackIn_17_0 = (ro) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                stackIn_7_0 = cm.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("fg.A(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 < 123) {
            field_b = (qr) null;
        }
    }

    static {
        field_a = new ro();
    }
}
