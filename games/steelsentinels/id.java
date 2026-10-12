/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends SceneWidget {
    static int[] field_cc;
    private SceneWidget field_Yb;
    static String field_Sb;
    static String field_Wb;
    static String field_Tb;
    private SceneWidget field_Vb;
    static String field_Ub;
    static int field_ac;
    static String field_Zb;
    static String field_Xb;
    static ResourceArchive field_bc;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.a(0, param0, param5, param4, param1);
        int var7 = 36 / ((param3 + 7) / 47);
        this.a(false, param2);
    }

    private final void a(boolean param0, int param1) {
        if (param0) {
          return;
        }
        this.field_Yb.a(0, 0, this.field_Lb, 0, this.field_Yb.g(-2147483648));
        int var3 = this.field_Yb.field_zb + param1;
        this.field_Vb.a(0, 0, this.field_Lb, var3, this.field_zb - var3);
    }

    public static void j(int param0) {
        field_Wb = null;
        field_Ub = null;
        field_Zb = null;
        field_Xb = null;
        field_bc = null;
        field_Sb = null;
        field_cc = null;
        if (param0 < 106) {
          field_Sb = (String) null;
        }
        field_Tb = null;
    }

    final int c(int param0, int param1) {
        if (param0 > -46) {
          return 30;
        }
        return param1 + this.field_Yb.g(-2147483648) + this.field_Vb.g(-2147483648);
    }

    id(long param0, id param1, String param2) {
        this(param0, param1.field_Yb, param1.field_Vb, param2);
    }

    final static void d(byte param0) {
        ci.field_a.c(new pd(), -22908735);
        int var1 = -48 % ((param0 + 48) / 47);
    }

    id(long param0, RgbSprite param1, RgbSprite param2, int param3, SceneWidget param4, String param5) {
        this(param0, (SceneWidget) null, param4, param5);
        try {
          this.field_Yb.field_Fb = param3;
          this.field_Yb.field_Pb = param2;
          this.field_Yb.field_Hb = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "id.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(String param0, int param1, String param2, int param3, String param4, boolean param5, int param6) {
        ik var7 = null;
        RuntimeException var7_ref = null;
        ik var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            stackIn_2_0 = -108;
            return stackIn_2_0;
          }
          var7 = new ik(param2);
          var8 = new ik(param4);
          stackIn_4_0 = ka.a(param0, param5, param6, (byte) -124, param3, var7, var8);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("id.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private id(long param0, SceneWidget param1, SceneWidget param2, String param3) {
        super(param0, (SceneWidget) null);
        try {
          this.field_Yb = new SceneWidget(0L, param1);
          this.field_Vb = new SceneWidget(0L, param2);
          this.field_Vb.field_S = param3;
          this.a(this.field_Yb, 127);
          this.a(this.field_Vb, 127);
          this.h(46);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "id.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(String param0, int param1) {
        int var6 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        int stackIn_4_0 = 0;
        String stackIn_6_0 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != null) {
            stackIn_4_0 = param0.length();
          } else {
            stackIn_4_0 = 0;
          }
          var2_int = stackIn_4_0;
          if (var2_int == 0) {
            stackIn_6_0 = (String) (param0);
            return stackIn_6_0;
          }
          var9 = new char[var2_int];
          var8 = var9;
          var3 = var8;
          var4 = param1;
          var5 = 0;
          for (var6 = 0; var6 < var2_int; var6++) {
            var3[var6] = param0.charAt(var6);
            if (60 != var9[var6]) {
              if (var9[var6] == 62 &&
                var4 > 0) {
                var4--;
              } else {
                if (0 == var4 &&
                  var5 == 0 &&
                  !Character.isWhitespace(var9[var6])) {
                  var5 = 1;
                  var3[var6] = Character.toUpperCase(var9[var6]);
                }
              }
            } else {
              var4++;
            }
          }
          stackIn_21_0 = new String(var9);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("id.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_Sb = "No";
        field_Wb = null;
        field_Tb = "Log in or create a free account to save your progress.";
        field_Ub = "Security";
        field_Xb = "Mute this player for 48 hours";
        field_cc = new int[]{40, 33, 46, 7};
        field_Zb = "DROP";
    }
}
