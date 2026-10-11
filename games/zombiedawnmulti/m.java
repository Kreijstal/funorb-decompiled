/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends tb {
    static cj field_B;
    static cj field_x;
    static String field_A;
    static fm field_C;
    static int field_z;
    static int field_y;
    static ja field_w;

    final static void a(boolean param0, int param1, int param2) {
        int var3;
        Object var4;
        Object var5;
        go var6;
        String var7;
        CharSequence var8;
        CharSequence var9;
        int var3Lifetime1;
        Object var4Lifetime1;
        Object var5Lifetime1;
        String var7Lifetime1;
        Object var5Lifetime2;
        Object var5Lifetime1Lifetime1;
        if (param1 == 0) {
          if (gi.field_i == null) {
            return;
          }
          var3 = gi.field_i.a((byte) 113, param0);
          if (var3 == 0) {
            return;
          }
          if (var3 != 2) {
            gi.field_i = null;
            ic.field_e = -1;
            return;
          }
          if (null == gi.field_i.field_wb) {
            gi.field_i = null;
            ic.field_e = -1;
            return;
          }
          if (gi.field_i.field_wb.equals("")) {
            gi.field_i = null;
            ic.field_e = -1;
            return;
          }
          if (gi.field_i.field_wb.charAt(0) != 91) {
            var9 = (CharSequence) ((Object) gi.field_i.field_wb);
            var4 = tg.a(var9, false);
            var5 = var4;
            var5 = var4;
          } else {
            var4 = gi.field_i.field_wb;
          }
          var5Lifetime2 = null;
          if (0 == ic.field_e) {
            var5Lifetime2 = ii.a((String) (var4), (byte) 116, param2);
          }
          if (1 == ic.field_e) {
            var5Lifetime2 = gn.a((String) (var4), 103, param2);
          }
          if (ic.field_e == 2) {
            var5Lifetime2 = sf.a(param1 - 86, param2, (String) (var4));
          }
          if (ic.field_e == 3) {
            var5Lifetime2 = ng.a((String) (var4), (String) (var4), param1 - 25, param2);
          }
          if (var5Lifetime2 == null) {
            gi.field_i = null;
            ic.field_e = -1;
            return;
          }
          var7 = (String) null;
          vm.a((String) (var4), 0, (String) null, (String) (var5Lifetime2), 2, 0);
          gi.field_i = null;
          ic.field_e = -1;
          return;
        }
        var6 = (go) null;
        m.a(-30, (go) null, 112, 17, -89, 48);
        if (gi.field_i == null) {
          return;
        }
        var3Lifetime1 = gi.field_i.a((byte) 113, param0);
        if (var3Lifetime1 == 0) {
          return;
        }
        if (var3Lifetime1 == 2 &&
          null != gi.field_i.field_wb &&
          !gi.field_i.field_wb.equals("")) {
          if (gi.field_i.field_wb.charAt(0) != 91) {
            var8 = (CharSequence) ((Object) gi.field_i.field_wb);
            var4Lifetime1 = tg.a(var8, false);
            var5Lifetime1 = var4Lifetime1;
            var4Lifetime1 = var5Lifetime1;
            var5Lifetime1 = var4Lifetime1;
          } else {
            var4Lifetime1 = gi.field_i.field_wb;
          }
          var5Lifetime1Lifetime1 = null;
          if (0 == ic.field_e) {
            var5Lifetime1Lifetime1 = ii.a((String) (var4Lifetime1), (byte) 116, param2);
          }
          if (1 == ic.field_e) {
            var5Lifetime1Lifetime1 = gn.a((String) (var4Lifetime1), 103, param2);
          }
          if (ic.field_e == 2) {
            var5Lifetime1Lifetime1 = sf.a(param1 - 86, param2, (String) (var4Lifetime1));
          }
          if (ic.field_e == 3) {
            var5Lifetime1Lifetime1 = ng.a((String) (var4Lifetime1), (String) (var4Lifetime1), param1 - 25, param2);
            var4Lifetime1 = var5Lifetime1Lifetime1;
            var5Lifetime1Lifetime1 = var4Lifetime1;
            var4Lifetime1 = var5Lifetime1Lifetime1;
          }
          if (var5Lifetime1Lifetime1 != null) {
            var7Lifetime1 = (String) null;
            vm.a((String) (var4Lifetime1), 0, (String) null, (String) (var5Lifetime1Lifetime1), 2, 0);
          }
        }
        gi.field_i = null;
        ic.field_e = -1;
        return;
    }

    private m(fm param0, int param1) {
        super(param0, param1);
    }

    final String d(cf param0, int param1) {
        RuntimeException var3 = null;
        go var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9327) {
            var4 = (go) null;
            m.a(-33, (go) null, 73, 31, -76, 61);
          }
          stackIn_3_0 = hg.a(40, '*', param0.field_j.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("m.BA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_A = null;
        field_C = null;
        field_x = null;
        if (!param0) {
          field_w = null;
          field_B = null;
          return;
        }
        field_A = (String) null;
        field_w = null;
        field_B = null;
    }

    final static void c(int param0) {
        il var1 = (il) (db.field_a.a(true));
        if (var1 == null) {
          var1 = new il();
        }
        var1.a(oo.field_e, oo.field_d, oo.field_g, (byte) -120, oo.field_i, oo.field_f, oo.field_b, oo.field_l);
        if (param0 == 540) {
          mo.field_Fb.a(var1, false);
          return;
        }
    }

    final static java.awt.Frame a(int param0, go param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        sm[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        sm[] var10 = null;
        di var11 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!param1.a(-96)) {
            return null;
          }
          if (param3 == 0) {
            var10 = jg.a(-123, param1);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (param0 == var10[var8].field_e &&
                param4 == var10[var8].field_a && ((param2 == 0 ||
                param2 == var10[var8].field_d) &&
                (var7_int == 0 ||
                !(param3 >= var10[var8].field_c)))) {
                var7_int = 1;
                param3 = var10[var8].field_c;
              }
            }
            if (var7_int == 0) {
              stackIn_25_0 = null;
              return (java.awt.Frame) (stackIn_25_0);
            }
          }
          var11 = param1.a(param0, (byte) 126, param2, param3, param4);
          while (var11.field_f == 0) {
            vd.a(false, 10L);
          }
          if (param5 <= 85) {
            field_x = (cj) null;
          }
          var7 = (java.awt.Frame) (var11.field_d);
          if (var7 == null) {
            stackIn_33_0 = null;
            return (java.awt.Frame) (stackIn_33_0);
          }
          if (2 != var11.field_f) {
            stackIn_38_0 = var7;
            return stackIn_38_0;
          }
          sp.a(param1, 1, var7);
          stackIn_36_0 = null;
          return (java.awt.Frame) (stackIn_36_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_41_0 = var6_ref;
          stackIn_41_1 = new StringBuilder().append("m.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    m(int param0) {
        this(ke.field_h, param0);
    }

    static {
        field_A = "Waiting for music";
        field_w = new ja(540, 140);
    }
}
