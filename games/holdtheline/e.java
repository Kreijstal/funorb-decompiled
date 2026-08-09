/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    int field_c;
    static e field_a;
    int field_f;
    static int[] field_d;
    static float[] field_e;
    static String field_b;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 >= -35) {
            field_b = (String) null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    e(int param0, int param1, int param2, int param3) {
        this.field_c = param3;
        this.field_f = param0;
    }

    final static String[] a(String[] args, int param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        tn var7 = null;
        String[] stackIn_8_0 = null;
        String[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var7 = ta.a((byte) 72);
            var4 = param1;
            var5 = fk.a(25, '[') + param2 + ']';
            L1: while (true) {
              L2: {
                if (var4 >= args.length) {
                  break L2;
                } else {
                  if (args[var4].trim().equalsIgnoreCase(var5)) {
                    break L2;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
              var4++;
              if (var4 >= args.length) {
                stackIn_8_0 = new String[]{};
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L3: while (true) {
                  L4: {
                    if (args.length <= var4) {
                      break L4;
                    } else {
                      if (args[var4].trim().charAt(0) == 91) {
                        break L4;
                      } else {
                        var7.a((byte) 112, args[var4].trim());
                        var4++;
                        continue L3;
                      }
                    }
                  }
                  stackIn_13_0 = var7.c(param1 ^ 3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("e.B(");

            if (args == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_13_0;
        }
    }

    static {
        field_a = new e(7, 0, 1, 1);
        field_e = new float[]{1.5f, 1.375f, 1.25f, 1.125f, 1.0f};
        field_d = new int[]{0, 1, 2, 4, 3, 5, 6, 7, 14, 13, 8, 10, 9, 11, 12, 15};
        field_b = "Friends can be added in multiplayer<nbsp>games";
    }
}
