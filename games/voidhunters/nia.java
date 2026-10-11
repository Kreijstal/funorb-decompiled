/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nia extends rqa {
    static int field_p;
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(150, 62, param0[0].a(127));
          if (param1 <= -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nia.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static uca a(int param0, kda param1, faa param2, byte param3) {
        int var11_int = 0;
        uca stackIn_3_0 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        faa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int var10 = 0;
        uca var11 = null;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        int var10Lifetime1;
        int var12Lifetime1;
        var13 = VoidHunters.field_G;
        try {
          if (param3 < 96) {
            stackIn_3_0 = (uca) null;
            return stackIn_3_0;
          }
          var16 = param1.b(param2, 1000);
          var15 = var16;
          var14 = var15;
          var4 = var14;
          if (var14 == null) {
            return null;
          }
          var5 = wl.a(9, var16);
          var6 = var5.e((byte) -95);
          var7 = var5.h(23);
          stackIn_9_0 = (var5.e((byte) -101) == 0) ? 0 : 1;
          var8 = stackIn_9_0;
          var9 = new String[var5.e((byte) -105)];
          for (var11_int = 0; var9.length > var11_int; var11_int++) {
            stackIn_14_0 = (var5.e((byte) -114) != 1) ? 0 : 1;
            var12 = stackIn_14_0;
            if (var12 != 0) {
              var9[var11_int] = var5.g(-1609246200);
            }
          }
          var10 = -2;
          var10Lifetime1 = var5.d((byte) -114);
          if (-1 == var10Lifetime1) {
            var10Lifetime1 = -2;
          }
          var11 = new uca(true, var9, var10Lifetime1, var8 != 0, var6, var7, false);
          stackIn_25_0 = (var5.e((byte) -116) != 1) ? 0 : 1;
          var12Lifetime1 = stackIn_25_0;
          if (var12Lifetime1 != 0) {
            var5.p(-23497);
            var11.field_m.a(-62, var5);
            var5.f((byte) -81);
            param1.a(0, idb.field_o, var11.field_m.field_l);
          }
          var11.field_m.field_j = param1.a(true, -13027);
          if (!param1.b((byte) 85)) {
            return var11;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_34_0 = var4_ref;
          stackIn_34_1 = new StringBuilder().append("nia.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param3).append(')').toString());
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -95) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var2_int = param0.length;
          var3 = new byte[var2_int];
          cua.a(param0, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("nia.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    nia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
