/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static qj field_a;
    static volatile long field_c;
    static Sprite[] field_d;
    static int field_b;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          field_d = null;
          return;
        }
        java.math.BigInteger var2 = (java.math.BigInteger) null;
        bn.a(-123, (PacketBuffer) null, (PacketBuffer) null, (java.math.BigInteger) null, (java.math.BigInteger) null);
        field_d = null;
    }

    final static void a(int param0, PacketBuffer param1, PacketBuffer param2, java.math.BigInteger param3, java.math.BigInteger param4) {
        try {
          gb.a(param4, false, param3, param2.payload, param1, param2.position, param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bn.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(Sprite[] param0, int param1) {
        String stackIn_11_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (jb.field_l == null) {
            return;
          }
          ci[] var8 = jb.field_l;
          ci[] var2 = var8;
          for (int var3 = param1; var8.length > var3; var3++) {
            ci var4 = var8[var3];
            int var5 = var4.field_b;
            Sprite var6 = param0[var5];
            var4.field_e = var6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var2_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("bn.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new qj(0, 0);
        field_c = 0L;
        field_b = 0;
    }
}
