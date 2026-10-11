/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hta extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_o = -94;
          }
          stackIn_3_0 = new nc(frb.a(70, 121));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hta.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int[] a(String param0, boolean param1, boolean param2) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_10_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        int var4_int = 0;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var7 = 0;
        String var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        int[] var11 = null;
        byte[] var12 = null;
        int[] var13 = null;
        var7 = VoidHunters.field_G;
        try {
          var12 = ps.a(param0, 1);
          var10 = var12;
          var9 = var10;
          var3 = var9;
          if (var9 == null) {
            return null;
          }
          if (!param2) {
            var8 = (String) null;
            hta.a((String) null, false, false);
          }
          if (!param1) {
            var4 = new int[var12.length];
            for (var5 = 0; var5 < var12.length; var5++) {
              var4[var5] = var12[var5];
            }
            stackIn_23_0 = var4;
            return stackIn_23_0;
          }
          if (var12.length < 1) {
            stackIn_10_0 = null;
            return (int[]) (stackIn_10_0);
          }
          var4_int = var12[0];
          if (var4_int > tcb.field_p) {
            return null;
          }
          var13 = new int[-1 + var12.length];
          var11 = var13;
          var5_ref_int__ = var11;
          for (var6 = 0; var6 < var13.length; var6++) {
            var5_ref_int__[var6] = var9[1 + var6];
          }
          stackIn_18_0 = var5_ref_int__;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("hta.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    hta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = 51;
    }
}
