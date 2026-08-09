/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static String field_b;
    static String field_a;
    static String field_d;
    static char[] field_c;

    final static void a(la param0, int param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = 0;
            if (param1 == -440) {
              L1: while (true) {
                if (-4 >= (var2_int ^ -1)) {
                  var2_int = 0;
                  L2: while (true) {
                    if (var2_int >= ud.field_x) {
                      dupTemp$0 = param0.b((byte) 107);
                      nn.field_j[dupTemp$0] = nn.field_j[dupTemp$0] + 1;
                      var2_int = 0;
                      var3 = 0;
                      L3: while (true) {
                        if (var3 >= ud.field_x) {
                          ud.field_x = var2_int;
                          fieldTemp$1 = ud.field_x;
                          ud.field_x = ud.field_x + 1;
                          nb.field_a[fieldTemp$1] = param0;
                          decompiledRegionSelector0 = 1;
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
                            incrementValue$2 = var2_int;
                            var2_int++;
                            nb.field_a[incrementValue$2] = nb.field_a[var3];
                            break L4;
                          }
                          var3++;
                          continue L3;
                        }
                      }
                    } else {
                      L6: {
                        if (param0.field_n == nb.field_a[var2_int].field_n) {
                          dupTemp$3 = nb.field_a[var2_int].b((byte) 115);
                          nn.field_j[dupTemp$3] = nn.field_j[dupTemp$3] + 1;
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("ul.A(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            return;
        }
        field_d = null;
        field_c = null;
    }

    static {
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = "A room full of large, maggot-like creatures; their bile can burn through raiders' armour in seconds, inflicting permanent injury.<br><br>Defeated raiders permanently lose 1 <%attack>.";
        field_c = new char[]{(char)91, (char)93, (char)35};
    }
}
