/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static String[] field_b;
    static String field_a;

    final static void b(int param0) {
        lk.g((byte) 89);
        ProxySocketConnector.a(2, wp.field_j[0].fullWidth, nj.field_h, DualLinkNode.field_o, jo.field_f, jk.field_f);
        if (param0 <= 31) {
          field_a = (String) null;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new PacketBuffer(param0);
          var3 = var9.readUnsignedByte(31365);
          var4 = var9.readInt(param1 ^ -1478490344);
          if (var4 >= 0 && (qo.field_u == 0 ||
            !(qo.field_u < var4))) {
            if (var3 == param1) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(0, param1 ^ -6351, var4, var13);
              stackIn_21_0 = var5;
              return stackIn_21_0;
            }
            var5_int = var9.readInt(-1478490344);
            if (0 <= var5_int && (0 == qo.field_u ||
              !(qo.field_u < var5_int))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 == 1) {
                Bzip2Decoder.a(var12, var5_int, param0, var4, 9);
              } else {
                var7 = ArmedHumanView.field_wb;
                synchronized (var7) {
                  ArmedHumanView.field_wb.decompress(var12, var9, param1 + 27);
                }
              }
              stackIn_19_0 = var6;
              return stackIn_19_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("hb.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          hb.b(87);
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0) {
        EmailAvailabilityValidator.field_s = new fe();
        wj.field_i.a((UiWidget) (EmailAvailabilityValidator.field_s), (byte) 121);
        if (param0 != 0) {
          field_a = (String) null;
        }
    }

    static {
        field_a = "";
    }
}
