/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends rqa {
    static String field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          si.a(77, 62, param0[0].a(40));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("fb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    fb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        faa var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ea var11 = null;
        iea var12 = null;
        faa var13 = null;
        iea var14 = null;
        var8 = VoidHunters.field_G;
        try {
          var13 = qga.field_b;
          var2 = var13.e((byte) -89);
          if (var2 == param0) {
            var10 = oea.f((byte) -85);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var13;
            var6 = ((ds) ((Object) var5)).e((byte) -89);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((ds) ((Object) var5)).h(92);
            }
            var14 = (iea) (klb.field_q.d(0));
            if (var14 != null) {
              var14.b(param0 ^ -3846);
              return;
            }
            ifb.l(-121);
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              gna.a((Throwable) null, "A1: " + hm.e(-13514), 0);
              ifb.l(param0 - 117);
            } else {
              var12 = (iea) (klb.field_q.d(0));
              if (var12 == null) {
                ifb.l(-119);
                return;
              }
              oea.f((byte) -80);
              var12.b(-3846);
            }
          } else {
            var11 = (ea) (oaa.field_k.d(0));
            if (var11 == null) {
              ifb.l(-125);
              return;
            }
            var11.b(-3846);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "fb.C(" + param0 + ')');
        }
    }

    final static String a(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -116) {
            stackIn_4_0 = ac.a(1, param0.length, 0, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("fb.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 != 42) {
          fb.e((byte) -19);
        }
        field_p = null;
    }

    static {
        field_p = "Spawn asteroid at mouse";
    }
}
