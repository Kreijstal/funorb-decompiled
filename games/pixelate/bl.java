/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static int[] field_a;
    static String field_e;
    static String field_g;
    static ak field_d;
    static String field_f;
    static int field_c;
    static int field_b;

    final static void a(int param0, boolean param1) {
        int var2;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_15_3;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        L0: {
          if (param0 < -22) {
            break L0;
          } else {
            bl.b(-59);
            break L0;
          }
        }
        L1: {
          nm.c(-1);
          if (null != io.field_c) {
            if (kn.a(true, io.field_c.field_mc)) {
              stackIn_8_0 = 1;
              break L1;
            } else {
              stackIn_8_0 = 0;
              break L1;
            }
          } else {
            stackIn_8_0 = 0;
            break L1;
          }
        }
        L2: {
          L3: {
            var2 = stackIn_8_0;
            stackIn_11_0 = 15;

            stackIn_11_1 = 14;

            if (md.field_Y) {
              break L3;
            } else {




              if (!oa.field_i) {
                stackIn_13_0 = stackIn_11_0;
                stackIn_13_1 = stackIn_11_1;
                stackIn_13_2 = 0;
                break L2;
              } else {


                break L3;
              }
            }
          }
          stackIn_13_0 = stackIn_11_0;
          stackIn_13_1 = stackIn_11_1;
          stackIn_13_2 = 1;
          break L2;
        }
        L4: {






          stackIn_15_3 = var2;

          if (50 >= ce.field_g) {



            stackIn_16_3 = stackIn_15_3;
            stackIn_16_4 = 0;
            break L4;
          } else {



            stackIn_16_3 = stackIn_15_3;
            stackIn_16_4 = 1;
            break L4;
          }
        }
        L5: {
          wk.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0, stackIn_16_3 != 0, stackIn_16_4 != 0, param1, (byte) 116, true, 0, 13, 11, lp.field_i);
          if (of.field_c) {
            aa.field_f.g(57, 15514);
            of.field_c = false;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (fc.field_a) {
            aa.field_f.g(10, 15514);
            fc.field_a = false;
            break L6;
          } else {
            break L6;
          }
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_d = null;
        if (param0 != -46342) {
            return;
        }
        field_a = null;
        field_e = null;
        field_g = null;
    }

    final static int a(boolean param0) {
        if (!param0) {
            bl.b(-26);
        }
        return wb.field_b;
    }

    final static v a(int param0) {
        try {
            Throwable var1 = null;
            v stackIn_2_0 = null;
            v stackIn_4_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 >= 27) {
                  stackIn_4_0 = (v) (Class.forName("wj").newInstance());
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_2_0 = (v) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, tf param1, String param2) {
        try {
            if (param0 != 11833) {
                field_g = (String) null;
            }
            qf.field_c = param1;
            fa.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "bl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_a = new int[98304];
        for (var0 = 92682; (var0 ^ -1) <= -46342; var0--) {
            var4 = (long)(-1 + (var0 << 1400346465));
            var6 = (long)(1 + (var0 << 1777501953));
            var2 = (int)((var4 * var4 >> -427546094) + -32768L);
            var3 = (int)(-32768L + (var6 * var6 >> -1929501102));
            if (!(var3 < field_a.length)) {
                var3 = field_a.length - 1;
            }
            for (var1 = -1 < (var2 ^ -1) ? 0 : var2; var1 <= var3; var1++) {
                field_a[var1] = var0;
            }
        }
        field_f = "Unnamed Skin";
    }
}
