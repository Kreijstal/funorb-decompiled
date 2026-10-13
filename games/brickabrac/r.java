/*
 * Decompiled by CFR-JS 0.4.0.
 */
class r extends um {
    static int field_z;
    static String field_B;
    static int field_w;
    static int field_x;
    static boolean field_A;
    static String field_y;
    static String field_v;
    static int[] field_C;

    public static void d(byte param0) {
        field_C = null;
        field_v = null;
        field_y = null;
        field_B = null;
        if (param0 < 50) {
          field_v = (String) null;
        }
    }

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 72) {
            r.a((byte) 33, 79);
          }
          var2_int = qp.a(kb.field_Yb, gh.field_f, (byte) -22);
          if (var2_int == 1) {
            param1 = "<img=0>" + param1;
          }
          if (var2_int == 2) {
            param1 = "<img=1>" + param1;
          }
          stackIn_8_0 = (String) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("r.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    r(int param0) {
        this(a.field_u, param0);
    }

    final static boolean c(byte param0) {
        if (param0 >= -80) {
          r.c((byte) 16);
          if (qg.field_A < 20) {
            return true;
          }
          if (!kb.i(7457)) {
            return true;
          }
          if (OptionsScreen.field_x <= 0) {
            return false;
          }
          if (!am.i(0)) {
            return true;
          }
          return false;
        }
        if (qg.field_A < 20) {
          return true;
        }
        if (!kb.i(7457)) {
          return true;
        }
        if (OptionsScreen.field_x <= 0) {
          return false;
        }
        if (!am.i(0)) {
          return true;
        }
        return false;
    }

    r(dh param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_F, -1, 2147483647, false);
    }

    final static int a(byte param0, int param1) {
        int var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        if (param0 == -82) {
          var2 = var2 | var2 >>> 2;
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return ~var2 & param1;
        }
        field_B = (String) null;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return ~var2 & param1;
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        if (param1 != -20618) {
          return;
        }
        try {
          if (param0) {
            ig.b(param3.field_s, param3.field_o + param2, param3.field_t, param4 + param3.field_w, -17634);
          }
          super.a(param0, param1 ^ 0, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "r.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_z = -1;
        field_w = 480;
        field_y = "You are invited to <%0>'s game.";
        field_v = "Options";
        field_C = new int[5];
        field_B = "Report abuse";
    }
}
