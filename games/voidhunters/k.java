/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends rqa {
    static String field_p;
    static int field_r;
    static String field_q;
    static String field_o;

    public static void e(byte param0) {
        int var1 = 67 / ((36 - param0) / 39);
        field_q = null;
        field_o = null;
        field_p = null;
    }

    final static int a(byte param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          var4_int = -1;
          if (param0 != -69) {
            k.e((byte) -96);
          }
          for (var5 = param3; param1 > var5; var5++) {
            var4_int = var4_int >>> 8 ^ coa.field_d[255 & (var4_int ^ param2[var5])];
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("k.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new nc(oq.field_c);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("k.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    k(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, boolean param1, String param2, boolean param3, byte param4) {
        String stackIn_4_0 = null;
        String stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        boolean stackIn_26_2 = false;
        int stackIn_40_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = VoidHunters.field_G;
        try {
          wia.field_a = true;
          ft.field_t = param0;
          var11 = param2;
          if (param1) {
            stackIn_4_0 = era.field_q;
          } else {
            stackIn_4_0 = kg.field_s;
          }
          var6 = stackIn_4_0;
          if (ft.field_t == 0) {
            var7 = wva.a(480, rea.field_e, 0, var11, oja.field_p);
            var8 = 3 + var7;
            aka.field_o = new int[var8];
            db.field_o = new String[var8];
            for (var9 = 0; var8 > var9; var9++) {
              aka.field_o[var9] = -1;
            }
            kc.field_e = new int[2];
            for (var9 = 0; var9 < var7; var9++) {
              db.field_o[var9] = rea.field_e[var9];
            }
            db.field_o[-3 + var8] = "";
            db.field_o[var8 - 2] = var6;
            aka.field_o[var8 - 2] = 0;
            kc.field_e[0] = 1;
            db.field_o[var8 - 1] = wm.field_b;
            aka.field_o[-1 + var8] = 1;
            kc.field_e[1] = 2;
          } else {
            if (ft.field_t != 1) {
              throw new IllegalArgumentException();
            }
            var7 = wva.a(480, rea.field_e, 0, var11, oja.field_p);
            var8 = var7 + 2;
            aka.field_o = new int[var8];
            db.field_o = new String[var8];
            for (var9 = 0; var9 < var8; var9++) {
              aka.field_o[var9] = -1;
            }
            kc.field_e = new int[1];
            for (var9 = 0; var9 < var7; var9++) {
              db.field_o[var9] = rea.field_e[var9];
            }
            db.field_o[-2 + var8] = "";
            db.field_o[-1 + var8] = wm.field_b;
            aka.field_o[-1 + var8] = 0;
            kc.field_e[0] = 2;
          }
          ei.field_c.field_c = kc.field_e.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; var8Lifetime1 < db.field_o.length; var8Lifetime1++) {
            stackIn_25_0 = db.field_o[var8Lifetime1];
            stackIn_25_1 = -42;
            stackIn_26_2 = !(aka.field_o[var8Lifetime1] < 0);
            var9Lifetime1 = lsa.a(stackIn_25_0, stackIn_25_1, stackIn_26_2);
            if (aka.field_o[var8Lifetime1] != -1) {
              var9Lifetime1 = var9Lifetime1 + ih.field_e * 2;
            }
            if (var7Lifetime1 < var9Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          if (param4 < 11) {
            return;
          }
          mtb.field_p = -(var7Lifetime1 >> 1) + var7Lifetime1 + alb.field_b;
          mua.field_d = alb.field_b - (var7Lifetime1 >> 1);
          ot.field_b = (hwa.field_q + pva.field_g << 1) * ei.field_c.field_c;
          for (var8Lifetime2 = 0; db.field_o.length > var8Lifetime2; var8Lifetime2++) {
            stackIn_40_0 = ot.field_b;
            if (aka.field_o[var8Lifetime2] >= 0) {
              stackIn_41_1 = tba.field_o;
            } else {
              stackIn_41_1 = whb.field_a;
            }
            ot.field_b = stackIn_40_0 + stackIn_41_1;
          }
          nl.field_m = -(ot.field_b >> 1) + pba.field_r;
          ei.field_c.a(param3, -1, 0, rkb.a(uia.field_b, 3841, kc.field_b));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_46_0 = var5;
          stackIn_46_1 = new StringBuilder().append("k.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_p = "Rating";
        field_r = 250;
        field_q = "This game option is not available in rated games.";
        field_o = "Capture and Hold";
    }
}
