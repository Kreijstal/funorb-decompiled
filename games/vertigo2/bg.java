/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bg {
    byte field_d;
    static boolean field_c;
    static nj field_b;
    static String[] field_e;
    static String field_a;

    int a(boolean param0) {
        if (!param0) {
          field_e = (String[]) null;
          return 0;
        }
        return 0;
    }

    abstract void a(boolean param0, int[] param1, boolean param2, boolean param3);

    fc a(lg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= -85) {
            return null;
          }
          this.a(false);
          stackIn_3_0 = null;
          return (fc) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("bg.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    abstract int a(int param0);

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        if (param0 != 9) {
          field_e = (String[]) null;
        }
    }

    final static boolean a(String param0, int param1, String param2, boolean param3, String param4, byte param5, mk param6) {
        oe var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        oe var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (l.field_a != un.field_Hb) {
            return false;
          }
          var8 = -4 % ((3 - param5) / 42);
          var9 = new oe(ch.field_e, param6);
          var7 = var9;
          ch.field_e.b(var9, 0);
          if (ko.e((byte) -94)) {
            var9.o(16614);
            return true;
          }
          un.field_Hb = bf.field_b;
          af.field_H = param4;
          ea.field_e = param1;
          wn.field_d = param0;
          ab.field_b = param3;
          mp.field_f = null;
          mk.field_S = param2;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("bg.P(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    abstract void a(int param0, int[] param1, boolean param2, byte[] param3, boolean param4);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var6_int = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          var6_int = 39 % ((param1 + 35) / 40);
          for (var7 = param3; param5 >= var7; var7++) {
            ki.a(-123, param4, vl.field_e[var7], param2, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var6), "bg.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    bg() {
        this.field_d = (byte) 0;
    }

    static {
        field_c = false;
        field_e = new String[]{"Paint Pot", "Coin", "Dynamite", "1-Up", "Jetpack", "Save Star", "Compass"};
        field_b = new nj();
        field_a = "Press any key to close";
    }
}
