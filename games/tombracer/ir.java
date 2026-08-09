/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir {
    static String field_b;
    static String field_c;
    int field_f;
    static int field_a;
    int field_d;
    static String field_e;

    public static void a(byte param0) {
        if (param0 <= 96) {
            return;
        }
        field_c = null;
        field_e = null;
        field_b = null;
    }

    public final String toString() {
        return "(" + this.field_f + "," + this.field_d + ")";
    }

    final static boolean a(int param0, int param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param2 >= -69) {
          L0: {
            ir.a((byte) 123);
            if ((33 & param0) == 0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((33 & param0) == 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static byte[] a(Object param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        qu var4 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 == 13588) {
                  break L1;
                } else {
                  field_c = (String) null;
                  break L1;
                }
              }
              if (!(param0 instanceof byte[])) {
                if (param0 instanceof qu) {
                  var4 = (qu) (param0);
                  stackIn_14_0 = var4.a(false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                var3 = (byte[]) (param0);
                if (!param2) {
                  stackIn_10_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_8_0 = lh.a(var3, 6711);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("ir.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public ir() {
    }

    ir(int param0, int param1) {
        this.field_f = param0;
        this.field_d = param1;
    }

    static {
        field_b = "Wall Shadows: ";
        field_c = "I think the ceiling has a crush on you. Stay still too long, and you'll find yourself in a jam.";
        field_e = "All players have left <%0>'s game.";
    }
}
