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
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -31) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (!param1.c((byte) 121)) {
            stackIn_6_0 = (String) (param3);
            return stackIn_6_0;
          }
          stackIn_8_0 = param0 + " - " + param1.c(param2, -77) + "%";
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("sc.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
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
        if (param0 == -26862) {
          field_h = null;
          return;
        }
        sc.a('ﾸ', 103);
        field_h = null;
    }

    final static km[] a(int param0, int param1, int param2, int param3, int param4) {
        km dupTemp$0 = null;
        km dupTemp$1 = null;
        km[] var6 = new km[9];
        km[] var5 = var6;
        if (param1 >= 120) {
          dupTemp$0 = rd.a(param3, param2, 14727);
          var6[6] = dupTemp$0;
          var5[3] = dupTemp$0;
          var5[2] = dupTemp$0;
          var5[1] = dupTemp$0;
          var5[0] = dupTemp$0;
          dupTemp$1 = rd.a(param3, param0, 14727);
          var6[8] = dupTemp$1;
          var5[7] = dupTemp$1;
          var5[5] = dupTemp$1;
          if (0 != param4) {
            var6[4] = rd.a(64, param4, 14727);
          }
          return var5;
        }
        field_e = -99;
        km dupTemp$2 = rd.a(param3, param2, 14727);
        var6[6] = dupTemp$2;
        var5[3] = dupTemp$2;
        var5[2] = dupTemp$2;
        var5[1] = dupTemp$2;
        var5[0] = dupTemp$2;
        km dupTemp$3 = rd.a(param3, param0, 14727);
        var6[8] = dupTemp$3;
        var5[7] = dupTemp$3;
        var5[5] = dupTemp$3;
        if (0 != param4) {
          var6[4] = rd.a(64, param4, 14727);
        }
        return var5;
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
          if (param0 >= -112) {
            var4 = (String) null;
            sc.a((String) null, (um) null, 101, (String) null, (byte) 55);
          }
          var5 = (hh) (eh.field_R.g(-18110));
          while (var5 != null) {
            ue.a(param1, var5, (byte) 126);
            var5 = (hh) (eh.field_R.a((byte) -128));
          }
          return;
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
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new aj(false);
          var4 = -56 % ((param2 - 42) / 46);
          var3.field_g = param1;
          var3.field_e = param0;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("sc.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_i = 0;
        field_b = "Enter name of player to delete from list";
        field_g = "Waiting for sound effects";
        field_e = 15;
    }
}
