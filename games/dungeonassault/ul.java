/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static String field_b;
    static String field_a;
    static String field_d;
    static char[] field_c;

    final static void a(la param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= ud.field_x) {
                    int dupTemp$4 = param0.b((byte) 107);
                    nn.field_j[dupTemp$4] = nn.field_j[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ud.field_x) {
                        ud.field_x = var2_int;
                        int fieldTemp$5 = ud.field_x;
                        ud.field_x = ud.field_x + 1;
                        nb.field_a[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (nb.field_a[var3].field_n != param0.field_n) {
                              break L5;
                            } else {
                              var4 = nb.field_a[var3].b((byte) 104);
                              if (nn.field_j[var4] > co.field_H) {
                                nn.field_j[var4] = nn.field_j[var4] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          nb.field_a[incrementValue$6] = nb.field_a[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (param0.field_n == nb.field_a[var2_int].field_n) {
                        int dupTemp$7 = nb.field_a[var2_int].b((byte) 115);
                        nn.field_j[dupTemp$7] = nn.field_j[dupTemp$7] + 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                nn.field_j[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("ul.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + -440 + 41);
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = "A room full of large, maggot-like creatures; their bile can burn through raiders' armour in seconds, inflicting permanent injury.<br><br>Defeated raiders permanently lose 1 <%attack>.";
        field_c = new char[]{'[', ']', '#'};
    }
}
