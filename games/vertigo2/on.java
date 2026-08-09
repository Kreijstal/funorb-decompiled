/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static ae[][] field_b;
    static int[] field_e;
    static String field_d;
    static fc field_a;
    static int field_c;

    final static boolean a(byte param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        if (-1 == param1) {
          return true;
        } else {
          if (param0 > -68) {
            L0: {
              on.a((byte) 50, 2);
              if (-1 == (to.field_c & 1 << param1 ^ -1)) {
                stackIn_11_0 = 0;
                break L0;
              } else {
                stackIn_11_0 = 1;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              if (-1 == (to.field_c & 1 << param1 ^ -1)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                stackIn_7_0 = 1;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final static void a(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, mp param7, mp param8, int param9, byte param10, int param11, mp param12, int param13, int param14, cc param15, int param16, int param17, int param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          L0: {
            L1: {
              if (param10 == 24) {
                break L1;
              } else {
                on.a((byte) 31, -11);
                break L1;
              }
            }
            hd.field_f = param0;
            oc.field_s = param15;
            t.a(param17, param3, param4, param18, (byte) 89);
            aq.a(param12, (byte) -122, param19, param9);
            ni.a((byte) 107, param6, param2, param1, param7, param8);
            af.a(param11, param16, (byte) 122);
            ug.a((byte) -113, param5, param14, param13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var20 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var20);

            stackIn_6_1 = new StringBuilder().append("on.B(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param13).append(',').append(param14).append(',');

            if (param15 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ')');
        }
    }

    public static void a(boolean param0) {
        cc var2;
        field_e = null;
        field_b = (ae[][]) null;
        if (!param0) {
          var2 = (cc) null;
          on.a((cc) null, -20, -80, 55, -39, 122, -59, (mp) null, (mp) null, 108, (byte) -25, -117, (mp) null, 111, 97, (cc) null, 20, -31, 110, 20);
          field_a = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static s a(int param0, int param1, int param2, byte param3, int param4) {
        s var5;
        int var6;
        s var7;
        var6 = Vertigo2.field_L ? 1 : 0;
        var5 = (s) ((Object) wg.field_i.a((byte) 100));
        L0: while (true) {
          if (var5 == null) {
            var7 = new s();
            var5 = var7;
            var7.field_q = param2;
            if (param3 <= 70) {
              return (s) null;
            } else {
              var5.field_o = param0;
              var5.field_p = param4;
              wg.field_i.a(var5, false);
              mm.a(param1, var5, (byte) 108);
              return var5;
            }
          } else {
            if (var5.field_p != param4) {
              var5 = (s) ((Object) wg.field_i.b(99));
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    final static void a(int param0) {
        if (!pm.field_a) {
          if (param0 != 9110) {
            field_e = (int[]) null;
            return;
          } else {
            return;
          }
        } else {
          bm.g(0);
          if (param0 == 9110) {
            return;
          } else {
            field_e = (int[]) null;
            return;
          }
        }
    }

    static {
        field_d = "Hide lobby chat";
        field_b = new ae[30][1];
        field_a = new fc(4096, 4096, 4096, false, true, false, false, 0, 0);
        field_c = 0;
    }
}
