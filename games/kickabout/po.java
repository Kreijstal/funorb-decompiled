/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po {
    static ut field_e;
    static ut field_h;
    static String field_b;
    static String[] field_a;
    static String field_d;
    static boolean field_f;
    static String field_g;
    static String field_c;

    public static void a(int param0) {
        if (param0 == 0) {
          field_g = null;
          field_b = null;
          field_a = null;
          field_h = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
        po.a(23);
        field_g = null;
        field_b = null;
        field_a = null;
        field_h = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static boolean a(gg param0, byte param1, gg param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var3_int = param2.field_Cb - param0.field_Cb;
          if (param1 != -21) {
            return true;
          }
          if (param2.field_zb != bh.field_h) {
            if (null == param2.field_zb) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (bh.field_h == param0.field_zb) {
            var3_int += 200;
          } else {
            if (null == param0.field_zb) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("po.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static int a(js param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0.field_c == 23) {
            stackIn_3_0 = 680;
            return stackIn_3_0;
          }
          if (24 == param0.field_c) {
            stackIn_7_0 = 440;
            return stackIn_7_0;
          }
          if (param0.field_c == 25) {
            stackIn_10_0 = 680;
            return stackIn_10_0;
          }
          if (param0.field_c == 16) {
            stackIn_14_0 = 680;
            return stackIn_14_0;
          }
          if (param0.field_c == 18) {
            stackIn_18_0 = 680;
            return stackIn_18_0;
          }
          if (param0.field_c == -5) {
            stackIn_21_0 = 680;
            return stackIn_21_0;
          }
          if (param0.field_c == param1) {
            stackIn_24_0 = 680;
            return stackIn_24_0;
          }
          if (param0.field_c == 19) {
            stackIn_27_0 = 680;
            return stackIn_27_0;
          }
          if (20 == param0.field_c) {
            stackIn_31_0 = 680;
            return stackIn_31_0;
          }
          if (param0.field_c == 21) {
            stackIn_35_0 = 680;
            return stackIn_35_0;
          }
          if (param0.field_c == 22) {
            stackIn_39_0 = 680;
            return stackIn_39_0;
          }
          if (param0.field_c != -1 &&
            -3 != param0.field_c &&
            param0.field_c != -2) {
            if (param0.field_c == 26) {
              return 0;
            }
            stackIn_48_0 = 423;
            return stackIn_48_0;
          }
          stackIn_46_0 = 0;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_51_0 = var2;
          stackIn_51_1 = new StringBuilder().append("po.B(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        js var3 = null;
        js var3Lifetime1;
        js var3Lifetime2;
        if (fb.field_J == null) {
          if (param0 == -27) {
            return;
          }
          var3 = (js) null;
          po.a((js) null, 65);
          return;
        }
        if (!fb.field_J.a((byte) -122, param1)) {
          if (param0 == -27) {
            return;
          }
          var3Lifetime1 = (js) null;
          po.a((js) null, 65);
          return;
        }
        fb.field_J = null;
        if (param0 == -27) {
          return;
        }
        var3Lifetime2 = (js) null;
        po.a((js) null, 65);
    }

    static {
        field_b = "Invite players";
        field_d = "Orb coins: ";
        field_a = new String[]{"Detach", "Zoom"};
        field_g = "Your player sold successfully! The Auction House takes 10% of your bid of <%0>, giving you <%1>.";
        field_c = "The following settings need to be changed:  ";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$a$d1a766881558(gg param0, int param1, gg param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var3_int = param2.field_Cb - param0.field_Cb;
          if (param1 != -21) {
            return true;
          }
          if (param2.field_zb != bh.field_h) {
            if (null == param2.field_zb) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (bh.field_h == param0.field_zb) {
            var3_int += 200;
          } else {
            if (null == param0.field_zb) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("po.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }
}
