/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static ci field_f;
    static ci field_d;
    static int field_i;
    static um field_c;
    static ci field_h;
    static String field_g;
    static String field_b;
    static int field_e;
    static lh field_a;

    final static String a(String param0, um param1, int param2, String param3, byte param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 <= -31) {
              if (!param1.c((byte) 121)) {
                stackIn_6_0 = (String) (param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_8_0 = param0 + " - " + param1.c(param2, -77) + "%";
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("sc.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final static String a(char param0, int param1) {
        if (param1 <= 117) {
            sc.a(28);
            return String.valueOf(param0);
        }
        return String.valueOf(param0);
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_f = null;
        field_g = null;
        field_d = null;
        if (param0 != -26862) {
          sc.a('ﾸ', 103);
          field_h = null;
          return;
        } else {
          field_h = null;
          return;
        }
    }

    final static km[] a(int param0, int param1, int param2, int param3, int param4) {
        km dupTemp$4 = null;
        km dupTemp$5 = null;
        km dupTemp$6 = null;
        km dupTemp$7 = null;
        km[] var5;
        km[] var6;
        var6 = new km[9];
        var5 = var6;
        if (param1 < 120) {
          L0: {
            field_e = -99;
            dupTemp$4 = rd.a(param3, param2, 14727);
            var6[6] = dupTemp$4;
            var5[3] = dupTemp$4;
            var5[2] = dupTemp$4;
            var5[1] = dupTemp$4;
            var5[0] = dupTemp$4;
            dupTemp$5 = rd.a(param3, param0, 14727);
            var6[8] = dupTemp$5;
            var5[7] = dupTemp$5;
            var5[5] = dupTemp$5;
            if (0 != param4) {
              var6[4] = rd.a(64, param4, 14727);
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        } else {
          L1: {
            dupTemp$6 = rd.a(param3, param2, 14727);
            var6[6] = dupTemp$6;
            var5[3] = dupTemp$6;
            var5[2] = dupTemp$6;
            var5[1] = dupTemp$6;
            var5[0] = dupTemp$6;
            dupTemp$7 = rd.a(param3, param0, 14727);
            var6[8] = dupTemp$7;
            var5[7] = dupTemp$7;
            var5[5] = dupTemp$7;
            if (0 != param4) {
              var6[4] = rd.a(64, param4, 14727);
              break L1;
            } else {
              break L1;
            }
          }
          return var5;
        }
    }

    final static void a(int param0, boolean param1) {
        ob.field_z = wm.field_n[param0];
        uk.field_a = bi.field_c[param0];
        if (param1) {
            return;
        }
        e.field_T = rh.field_e[param0];
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        String var4 = null;
        hh var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param0 < -112) {
                break L1;
              } else {
                var4 = (String) null;
                sc.a((String) null, (um) null, 101, (String) null, (byte) 55);
                break L1;
              }
            }
            var5 = (hh) ((Object) eh.field_R.g(-18110));
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                ue.a(param1, var5, (byte) 126);
                var5 = (hh) ((Object) eh.field_R.a((byte) -128));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "sc.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static aj a(String param0, int param1, byte param2) {
        aj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        aj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new aj(false);
            var4 = -56 % ((param2 - 42) / 46);
            var3.field_g = param1;
            var3.field_e = param0;
            stackIn_1_0 = (aj) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("sc.F(");

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
          throw fk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_i = 0;
        field_b = "Enter name of player to delete from list";
        field_g = "Waiting for sound effects";
        field_e = 15;
    }
}
