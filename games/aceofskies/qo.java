/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo {
    static SteeringMode field_e;
    static int field_c;
    static int field_d;
    static eg field_a;
    static BitmapFont field_b;

    public static void c(byte param0) {
        field_e = null;
        int var1 = -27 % ((param0 + 24) / 37);
        field_b = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(String param0, String param1, ResourceArchive param2, int param3, String param4) {
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        try {
          if (!param2.b((byte) -105)) {
            String stackIn_3_0 = (String) (param0);
            return stackIn_3_0;
          }
          if (param3 == 13525) {
            String stackIn_8_0 = param4 + " - " + param2.a(param1, (byte) -79) + "%";
            return stackIn_8_0;
          }
          String stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("qo.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          CipherPacketBuffer var10 = IntKeyLookup.incomingPacket;
          if (param0 != -26) {
            return;
          }
          int var2 = var10.readUnsignedByte(104);
          int var3 = var10.readUnsignedByte(-75);
          if (0 == var2) {
            oh var4_ref_oh = (oh) (fg.field_r.first(268435455));
            if (var4_ref_oh == null) {
              te.b(true);
              return;
            }
            int var5_int = ag.field_s - var10.position;
            int[] var12 = var4_ref_oh.field_f;
            int[] var11 = var12;
            int[] var6 = var11;
            if (var5_int > var12.length << 2) {
              var5_int = var12.length << 2;
            }
            for (int var7 = 0; var7 < var5_int; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.readUnsignedByte(-100) << pg.a(var7 << 8, 768));
            }
            var4_ref_oh.unlink(-124);
            return;
          }
          if (1 == var2) {
            int var4 = var10.readSignedSmart((byte) 127);
            uk var5 = (uk) (v.field_b.first(268435455));
            while (var5 != null) {
              if (var3 != var5.field_i ||
                var5.field_m != var4) {
                var5 = (uk) (v.field_b.next((byte) 103));
                continue;
              }
              break;
            }
            if (var5 != null) {
              var5.unlink(-125);
              return;
            }
            te.b(true);
            return;
          }
          v.a("LR1: " + CipherPacketBuffer.k((byte) 65), (byte) -52, (Throwable) null);
          te.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "qo.D(" + param0 + ')');
        }
    }

    final boolean b(byte param0) {
        if (param0 != -92) {
          field_c = 87;
        }
        return ((aj.field_v == this ? 1 : 0) | (this == nj.field_f ? 1 : 0)) != 0;
    }

    static {
        field_e = new SteeringMode();
        field_a = new eg();
    }
}
