/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static String field_a;
    static String field_c;
    static String field_d;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -10) {
          field_c = (String) null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static Object a(int param0, boolean param1, byte[] param2) {
        sa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        sa stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length > param0) {
                var3 = new sa();
                ((i) ((Object) var3)).a(param2, (byte) -122);
                stackIn_6_0 = (sa) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1) {
                  stackIn_11_0 = cl.a(0, param2);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = (byte[]) (param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ch.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4;
        L0: {
          var4 = param3;
          if (param1) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2) {
          L1: {
            var4 += 2;
            if (param0) {
              var4++;
              break L1;
            } else {
              break L1;
            }
          }
          return td.field_c[var4];
        } else {
          L2: {
            if (param0) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return td.field_c[var4];
        }
    }

    static {
        field_a = "Fullscreen";
        field_c = "to over <%0> great games";
        field_d = "Sound Off";
        field_b = "More suggestions";
    }
}
