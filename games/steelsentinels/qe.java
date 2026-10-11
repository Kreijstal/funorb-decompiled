/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static int field_e;
    static String field_c;
    static java.math.BigInteger field_d;
    static String field_f;
    static int[] field_a;
    static RgbSprite field_g;
    static String field_b;

    final static void a(java.awt.Component param0, int param1) {
        try {
          if (param1 != -30418) {
            field_f = (String) null;
          }
          param0.removeKeyListener(wc.field_i);
          param0.removeFocusListener(wc.field_i);
          qj.field_h = -1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qe.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(ak param0, int param1, int param2, int param3) {
        try {
          if (param3 != 3) {
            qe.a(16, 30, -14);
          }
          tk.field_p = param0;
          on.field_n = param2;
          ug.field_I = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qe.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_g = null;
        field_a = null;
        field_c = null;
        if (param0 != -31914) {
          String var2 = (String) null;
          qe.a((RgbSprite) null, (byte) 27, (String) null);
        }
        field_b = null;
    }

    final static IndexedSprite a(RgbSprite param0, byte param1, String param2) {
        int var8_int = 0;
        int var11 = 0;
        IndexedSprite stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        IndexedSprite var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var3_intLifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        var12 = SteelSentinels.obfuscationControl;
        try {
          for (var3_int = 0; param0.field_E.length > var3_int; var3_int++) {
            param0.field_E[var3_int] = 0;
          }
          param0.d();
          ff.field_lb.a(param2, param0.field_z / 2, param0.field_B - 10, 10790052, -1);
          sb.field_bb.b((byte) 125);
          var3_intLifetime1 = param0.field_z;
          var4 = param0.field_B;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          if (param1 != -93) {
            qe.a(-36, 56, 41);
          }
          for (var8_int = 0; param0.field_B > var8_int; var8_int++) {
            for (var9 = 0; param0.field_z > var9; var9++) {
              if (param0.field_E[var9 + var7] != 0) {
                if (var3_intLifetime1 > var9) {
                  var3_intLifetime1 = var9;
                }
                if (var9 > var6) {
                  var6 = var9;
                }
                if (var8_int < var4) {
                  var4 = var8_int;
                }
                if (var8_int > var5) {
                  var5 = var8_int;
                }
              }
            }
            var7 = var7 + param0.field_z;
          }
          var6++;
          var5++;
          var8 = new IndexedSprite(8 + (var6 - var3_intLifetime1), 8 + var5 - var4, 3);
          var8.field_o[0] = 0;
          var8.field_o[2] = 5789784;
          var8.field_o[1] = 10790052;
          var7Lifetime1 = var3_intLifetime1 + param0.field_z * var4;
          var9Lifetime1 = 4 + var8.field_g * 4;
          for (var10 = 0; -var4 + var5 > var10; var10++) {
            for (var11 = 0; var11 < -var3_intLifetime1 + var6; var11++) {
              if (0 != param0.field_E[var7Lifetime1 + var11]) {
                var8.field_p[var9Lifetime1 + var11] = (byte) 1;
              }
            }
            var9Lifetime1 = var9Lifetime1 + var8.field_g;
            var7Lifetime1 = var7Lifetime1 + param0.field_z;
          }
          var9Lifetime2 = var8.field_g * (var8.field_d - 1);
          for (var10Lifetime1 = 0; var8.field_g > var10Lifetime1; var10Lifetime1++) {
            var8.field_p[var10Lifetime1] = (byte)2;
            var8.field_p[var10Lifetime1 + var9Lifetime2] = (byte)2;
          }
          var9Lifetime3 = 0;
          for (var10Lifetime2 = 0; var10Lifetime2 < var8.field_d; var10Lifetime2++) {
            var8.field_p[0 + var9Lifetime3] = (byte)2;
            var8.field_p[-1 + var9Lifetime3 + (0 + var8.field_g)] = (byte)2;
            var9Lifetime3 = var9Lifetime3 + var8.field_g;
          }
          stackIn_42_0 = var8;
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("qe.C(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 >= -66) {
          return 55;
        }
        if (param1 < 2) {
          if (param0 >= 5) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    static {
        field_e = 3;
        field_c = "Login: ";
        field_a = new int[128];
        field_f = "w";
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_b = "Quit to website";
    }
}
