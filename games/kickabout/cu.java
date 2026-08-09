/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu {
    static tf field_a;
    static String[] field_f;
    static String field_g;
    static int field_c;
    static String field_b;
    static String[] field_d;
    static String[] field_e;

    final static cf a(boolean param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        cf stackIn_6_0 = null;
        cf stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cf stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        cf stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        cf stackIn_16_0 = null;
        cf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        cf stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        cf stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Object var6;
        cf var6_ref;
        iw var7;
        var6 = null;
        if (param1 != 0) {
          L0: {
            var7 = (iw) null;
            cu.a((byte) 95, (String) null, (iw) null);
            var6_ref = (cf) ((Object) field_a.b((byte) -32));
            if (var6_ref == null) {
              var6_ref = new cf();
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var6_ref.field_Ab = param2;
            var6_ref.field_yb = param3;
            stackIn_16_0 = (cf) (var6_ref);

            if (!param0) {
              stackIn_17_0 = (cf) ((Object) stackIn_16_0);
              stackIn_17_1 = 0;
              break L1;
            } else {
              stackIn_17_0 = (cf) ((Object) stackIn_16_0);
              stackIn_17_1 = 1;
              break L1;
            }
          }
          L2: {
            stackIn_17_0.field_Fb = stackIn_17_1 != 0;
            stackIn_19_0 = (cf) (var6_ref);

            stackIn_19_1 = new StringBuilder().append("");

            if (var6_ref.field_Fb) {
              stackIn_20_0 = (cf) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "=";
              break L2;
            } else {
              stackIn_20_0 = (cf) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = Integer.toString(param3 + 1);
              break L2;
            }
          }
          stackIn_20_0.field_Bb = stackIn_20_2;
          return var6_ref;
        } else {
          L3: {
            var6_ref = (cf) ((Object) field_a.b((byte) -32));
            if (var6_ref == null) {
              var6_ref = new cf();
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            var6_ref.field_Ab = param2;
            var6_ref.field_yb = param3;
            stackIn_6_0 = (cf) (var6_ref);

            if (!param0) {
              stackIn_7_0 = (cf) ((Object) stackIn_6_0);
              stackIn_7_1 = 0;
              break L4;
            } else {
              stackIn_7_0 = (cf) ((Object) stackIn_6_0);
              stackIn_7_1 = 1;
              break L4;
            }
          }
          L5: {
            stackIn_7_0.field_Fb = stackIn_7_1 != 0;
            stackIn_9_0 = (cf) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("");

            if (var6_ref.field_Fb) {
              stackIn_10_0 = (cf) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "=";
              break L5;
            } else {
              stackIn_10_0 = (cf) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = Integer.toString(param3 + 1);
              break L5;
            }
          }
          stackIn_10_0.field_Bb = stackIn_10_2;
          return var6_ref;
        }
    }

    final static boolean a(int param0, sj param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = param1.b(param2, -32669, param0);
            var4 = var5;
            if (param3 > 95) {
              if (var5 != null) {
                vo.a((byte) -77, var5);
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("cu.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_g = (String) null;
          field_a = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_d = null;
          field_g = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_d = null;
          field_g = null;
          return;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        hn var3 = new hn(3, new int[]{param1, param2});
        ii.a(var3, 106);
        if (!(25 != cq.field_h.field_c)) {
            ((b) ((Object) cq.field_h)).h((byte) 84);
        }
        int var4 = -22 / ((param0 - 36) / 39);
    }

    final static int a(byte param0, String param1, iw param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 104) {
                break L1;
              } else {
                field_a = (tf) null;
                break L1;
              }
            }
            var3_int = param2.field_n;
            var5 = (CharSequence) ((Object) param1);
            var4 = ok.a(var5, (byte) 106);
            param2.f(-53, var4.length);
            param2.field_n = param2.field_n + os.field_I.a(-1, var4.length, param2.field_n, param2.field_f, var4, 0);
            stackIn_3_0 = param2.field_n + -var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cu.E(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_f = new String[]{"By rating", "By win percentage"};
        field_a = new tf();
        field_c = 0;
        field_b = "Waiting for animations";
        field_g = "kick";
        field_e = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_d = new String[]{"Use the 'WASD' keys to move around.", "Use the arrow keys to move around."};
    }
}
