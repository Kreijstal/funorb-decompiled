/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static int field_a;
    static int[] field_i;
    static int field_b;
    static String field_f;
    static int field_h;
    static IndexedSprite[] field_e;
    static int field_g;
    static String field_d;
    static kc field_c;

    final static byte[] a(int param0, CipherPacketBuffer param1, int param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var4_int = param1.readBits(28089, param2);
          if (0 == var4_int) {
            return null;
          }
          if (param3 == null ||
            var4_int != param3.length) {
            param3 = new byte[var4_int];
          }
          var5 = param1.readBits(28089, param0);
          var6 = (byte)param1.readBits(param0 + 28086, 8);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (byte)(var6 + param1.readBits(MouseWheelHandler.a(param0, 28090), var5));
            }
          }
          stackIn_16_0 = (byte[]) (param3);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ub.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        CipherPacketBuffer var2 = he.field_e;
        if (param1) {
          return;
        }
        var2.writeOpcode((byte) -115, param0);
        var2.writeByte(2, (byte) -128);
        var2.writeByte(4, (byte) -43);
        var2.writeByte(qn.k((byte) -14), (byte) -57);
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 > -63) {
          ub.releaseStatics(-21);
        }
        field_d = null;
        field_e = null;
        field_i = null;
        field_c = null;
    }

    final static void a(byte param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        cm var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 < 109) {
            field_f = (String) null;
          }
          var4 = (cm) (cc.field_e.first(12623));
          while (var4 != null) {
            hb.a(var4, param1, (byte) 93);
            var4 = (cm) (cc.field_e.next(0));
          }
          var2 = i.field_e.first(12623);
          while (var2 != null) {
            gb.a(param1, true);
            var2 = i.field_e.next(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2_ref), "ub.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = 0;
        field_i = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_a = 0;
        field_h = 3;
        field_f = "Only two targets left!";
        field_d = "Now, shoot the arrows as you shot the other spells, by holding the mouse button down to build up velocity and releasing to fire.";
    }
}
