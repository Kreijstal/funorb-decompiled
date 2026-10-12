/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static RgbSprite field_c;
    static NodeDeque field_a;
    static NodeDeque field_e;
    static int field_d;
    static String field_b;

    final static void a(int param0, int param1, on param2) {
        CipherPacketBuffer var3 = null;
        try {
          var3 = vl.outgoingPacket;
          var3.writeCipheredOpcode(32161, param1);
          var3.writeByte(1, 2);
          var3.writeByte(1, 0);
          if (param0 <= 125) {
            field_b = (String) null;
          }
          var3.writeByte(1, param2.field_l);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "s.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(boolean param0, String param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_33_0 = null;
        String stackIn_37_0 = null;
        String stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param2 == 1) {
            stackIn_2_0 = fo.a(4800, GrowthEvent.field_B, new String[]{param1});
            return stackIn_2_0;
          }
          if (2 == param2) {
            stackIn_6_0 = fo.a(4800, ea.field_d, new String[]{param1});
            return stackIn_6_0;
          }
          if (param2 == 3) {
            stackIn_9_0 = fo.a(4800, m.field_b, new String[]{param1});
            return stackIn_9_0;
          }
          if (param2 == 4) {
            stackIn_13_0 = fo.a(4800, pp.field_X, new String[]{param1});
            return stackIn_13_0;
          }
          if (param2 == 5) {
            stackIn_16_0 = fo.a(4800, ot.field_H, new String[]{param1});
            return stackIn_16_0;
          }
          if (param2 == 6) {
            stackIn_20_0 = fo.a(4800, di.field_j, new String[]{param1});
            return stackIn_20_0;
          }
          if (param2 == 7) {
            stackIn_24_0 = fo.a(4800, bh.field_I, new String[]{param1});
            return stackIn_24_0;
          }
          if (param2 == 8) {
            stackIn_27_0 = fo.a(4800, oc.field_Nb, new String[]{param1});
            return stackIn_27_0;
          }
          if (param0) {
            stackIn_30_0 = (String) null;
            return stackIn_30_0;
          }
          if (param2 == 11) {
            stackIn_33_0 = fo.a(4800, Spell.field_a, new String[]{param1});
            return stackIn_33_0;
          }
          if (param2 == 12) {
            stackIn_37_0 = fo.a(4800, DirectByteStorage.field_i, new String[]{param1});
            return stackIn_37_0;
          }
          if (param2 != 13) {
            return null;
          }
          stackIn_41_0 = fo.a(4800, cp.field_f, new String[]{param1});
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("s.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        int var1 = -122 / ((param0 + 19) / 34);
        field_b = null;
    }

    static {
        field_a = new NodeDeque();
        field_e = new NodeDeque();
        field_b = "Achievements";
    }
}
