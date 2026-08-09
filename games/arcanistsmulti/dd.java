/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static int[] field_f;
    static int field_g;
    static int field_d;
    static kc field_b;
    static String field_e;
    static int field_j;
    static volatile int field_i;
    static String field_a;
    static dn field_h;
    static hb field_c;

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!ko.a(63, param1)) {
              if (!e.b(-12055, param1)) {
                if (bd.a((byte) -117, param1)) {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param2.length() == 0) {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (hm.a(param1, param2, param0 + -100)) {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param0 == 99) {
                        if (!sm.a(22230, param1, param2)) {
                          if (w.a(param2, param1, 0)) {
                            stackIn_27_0 = 0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return true;
                          }
                        } else {
                          stackIn_23_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_20_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("dd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L1;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L2;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0 != 0;
                    } else {
                      return stackIn_27_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_f = null;
        if (param0 != -5451) {
          dd.a(-95);
          field_b = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1, qb[] param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = ArcanistsMulti.field_G ? 1 : 0;
        if (param2 == null || param3 <= 0) {
            return;
        }
        try {
            var5_int = param2[0].field_n;
            var6 = param2[param0].field_n;
            var7 = param2[1].field_n;
            param2[0].c(param4, param1);
            param2[2].c(param3 + (param4 - var6), param1);
            de.a(sl.field_H);
            de.a(param4 - -var5_int, param1, -var6 + (param4 - -param3), param2[1].field_w + param1);
            var8 = param4 + var5_int;
            var9 = -var6 + param3 + param4;
            for (param4 = var8; var9 > param4; param4 = param4 + var7) {
                param2[1].c(param4, param1);
            }
            de.b(sl.field_H);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "dd.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param0.length;
            var3 = new byte[var2_int];
            sf.a(param0, param1, var3, 0, var2_int);
            stackIn_1_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("dd.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_f = new int[]{72, 132, 73, 133, 74, 134, 75, 135, 77, 137, 76, 136, 0, 7, 1, 8, 2, 9, 3, 10, 4, 11, 5, 6, 36, 43, 37, 44, 38, 45, 39, 46, 40, 47, 41, 42, 24, 31, 25, 32, 26, 33, 27, 34, 28, 35, 29, 30, 12, 19, 13, 20, 14, 21, 15, 22, 16, 23, 17, 18, 48, 55, 49, 56, 50, 57, 51, 58, 52, 59, 53, 54, 71, 67, 61, 68, 62, 69, 63, 70, 64, 60, 65, 66, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 138, 139, 140, 141, 142, 143, 78, 79, 12, 89, 81, 82, 24, 92, 93, 94, 83, 49, 74, 25, 33, 71, 55, 80, 88, 90, 138, 139, 140, 141, 142, 143, 130, 131, 128, 129, 84, 85, 127, 126, 130, 131};
        field_d = 20;
        field_e = "Close";
        field_a = "Unable to connect to the data server. Please check any firewall you are using.";
        field_i = -1;
    }
}
