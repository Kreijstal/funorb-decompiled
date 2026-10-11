/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rkb extends rqa {
    static int field_o;

    rkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, tv param1, faa param2, int param3) {
        int var4_int = 0;
        try {
          param2.h(24335, param3);
          param2.field_e = param2.field_e + 1;
          if (param0 != 0) {
            field_o = -13;
          }
          var4_int = param2.field_e;
          param2.q(-127);
          param1.b(param2, -112);
          param2.r(32712);
          param2.e(param2.field_e - var4_int, -129);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rkb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
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
          hba.field_o = param0[0].a(123);
          if (param1 >= -119) {
            field_o = 30;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rkb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var3_int = 0;
          var4 = nl.field_m;
          if (param1 != 3841) {
            field_o = -93;
          }
          while (var3_int < db.field_o.length) {
            var5 = aka.field_o[var3_int];
            if (var5 < 0) {
              var4 = var4 + whb.field_a;
            } else {
              var6 = lsa.a(db.field_o[var3_int], -118, true);
              var4 = var4 + pva.field_g;
              var7 = -(var6 >> 1) + alb.field_b;
              if (cta.a(var4, (ih.field_e << 1) + var6, (hwa.field_q << 1) + tba.field_o, param2, (byte) -65, -ih.field_e + var7, param0)) {
                stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (tba.field_o + pva.field_g + (hwa.field_q << 1));
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "rkb.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_o = 8;
    }
}
