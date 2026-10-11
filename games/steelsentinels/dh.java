/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends DualNode {
    static RgbSprite[] field_y;
    static int field_D;
    static SceneWidget field_E;
    static int field_B;
    static int field_F;
    static byte[][] field_A;
    static int[][][] field_C;
    static cm field_z;

    final static String a(String param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 3) {
            stackIn_3_0 = nh.field_n;
            return stackIn_3_0;
          }
          var3_int = -26 % ((param1 - 3) / 46);
          if (6 == param2) {
            stackIn_7_0 = qh.field_Vb;
            return stackIn_7_0;
          }
          if (7 == param2) {
            stackIn_11_0 = li.field_C;
            return stackIn_11_0;
          }
          if (8 == param2) {
            stackIn_15_0 = lb.field_kc;
            return stackIn_15_0;
          }
          if (param2 == 9) {
            stackIn_19_0 = ik.field_i;
            return stackIn_19_0;
          }
          if (param2 == 10) {
            stackIn_23_0 = te.field_d;
            return stackIn_23_0;
          }
          if (param2 == 11) {
            stackIn_27_0 = ef.field_a;
            return stackIn_27_0;
          }
          if (param2 != 14) {
            return null;
          }
          stackIn_31_0 = db.a(k.field_Kb, -107, new String[]{param0});
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("dh.PA(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        cm var3 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = qe.a(di.field_h, NodeDeque.field_d, -126);
          if (1 == var2_int) {
            param1 = "<img=0>" + param1;
          }
          if (param0 != -27905) {
            var3 = (cm) null;
            dh.a(78, -81, (cm) null, (byte) 87, (cm) null);
          }
          if (var2_int == 2) {
            param1 = "<img=1>" + param1;
          }
          stackIn_7_0 = (String) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("dh.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        try {
          if (param1 < 116) {
            String var3 = (String) null;
            dh.a((String) null, (byte) -27);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "dh.SA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static cm a(int param0, int param1) {
        int var2 = 88 % ((4 - param0) / 44);
        return rf.a(true, 1, (byte) -127, false, false, param1);
    }

    public static void c(byte param0) {
        field_E = null;
        field_z = null;
        field_A = (byte[][]) null;
        field_C = (int[][][]) null;
        field_y = null;
        int var1 = 2 % ((param0 - 12) / 54);
    }

    dh() {
    }

    final static fh a(int param0, int param1, cm param2, byte param3, cm param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        fh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wa.a((byte) 30, param1, param0, param2)) {
            return null;
          }
          var5_int = -18 % ((param3 - 56) / 45);
          stackIn_4_0 = sn.a(param4.a(param0, (byte) 79, param1), 103);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("dh.RA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_F = 0;
        field_C = new int[][][]{new int[][]{new int[]{0, 1, 2, 4, 5, 8, 16, 9}, new int[]{24, 25, 26, 27, 28, 29, 30, 31}, new int[]{32, 6, 33, 34, 35, 36, 37}}, new int[][]{new int[]{17, 18, 19, 20, 21, 22, 23}, new int[]{3, 7, 10, 11, 12, 13, 15, 14}, new int[]{38}}};
        field_A = new byte[1000][];
    }
}
