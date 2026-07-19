/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static ba[] field_h;
    static re[] field_c;
    static String field_b;
    static bg field_e;
    static boolean field_a;
    static String field_f;
    static o field_g;
    static String field_d;

    final static boolean b(int param0) {
        dc var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 255) {
            break L0;
          } else {
            var2 = (dc) null;
            od.a((dc) null, (byte) -95);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ig.field_e == null) {
              break L2;
            } else {
              if (!mh.field_a.a(true)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(dc param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0.field_h == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (param0.field_f != 0) {
                    break L2;
                  } else {
                    if (param0.field_j == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= am.field_J) {
                    break L1;
                  } else {
                    L4: {
                      var3 = ra.field_i[var2_int];
                      if ((var3.field_l ^ -1) != -3) {
                        break L4;
                      } else {
                        if (var3.field_f != param0.field_f) {
                          break L4;
                        } else {
                          if (var3.field_j != param0.field_j) {
                            break L4;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param0.field_i != null) {
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (param1 <= -92) {
                  break L6;
                } else {
                  field_b = (String) null;
                  break L6;
                }
              }
              jd.a(param0, (byte) -119);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("od.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
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

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_e = null;
        field_b = null;
        field_f = null;
        field_d = null;
        field_g = null;
        field_h = null;
        if (param0 != 21) {
            discarded$0 = od.b(-64);
        }
        field_c = null;
    }

    static {
        int var0 = 0;
        field_c = new re[21];
        field_b = "Waiting for music";
        field_h = new ba[255];
        for (var0 = 0; field_h.length > var0; var0++) {
            field_h[var0] = new ba();
        }
        field_f = "Start the mission";
        field_g = new o();
        field_d = "Close minimap";
    }
}
