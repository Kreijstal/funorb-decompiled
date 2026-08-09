/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mqa extends rqa {
    static int field_s;
    static gl field_r;
    static String field_p;
    static float field_o;
    static int field_q;

    mqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static lkb a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        lkb stackIn_4_0 = null;
        lkb stackIn_8_0 = null;
        lkb stackIn_18_0 = null;
        lkb stackIn_22_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = param1.length();
            if (-1 == (var2_int ^ -1)) {
              stackIn_4_0 = br.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) < -64) {
                stackIn_8_0 = qw.field_j;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L1: while (true) {
                  if (var2_int <= var3) {
                    if (param0 != -23150) {
                      var6 = (String) null;
                      mqa.a(-101, (String) null);
                      stackIn_29_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 != 45) {
                        if (tea.field_a.indexOf(var4) == -1) {
                          stackIn_22_0 = ira.field_b;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      } else {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (var3 == var2_int - 1) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_18_0 = ira.field_b;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("mqa.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L4;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0;
              } else {
                return (lkb) ((Object) stackIn_29_0);
              }
            }
          }
        }
    }

    public static void a(int param0) {
        String var2;
        if (param0 > -6) {
          var2 = (String) null;
          mqa.a(105, (String) null);
          field_p = null;
          field_r = null;
          return;
        } else {
          field_p = null;
          field_r = null;
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              si.a(33, 62, param0[0].a(29));
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, -71);
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("mqa.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_s = 131072;
        field_r = new gl(1);
        field_o = 1.0f;
        field_p = "Remove selected event";
    }
}
