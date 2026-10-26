/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends lg {
    private byte[] field_w;
    static ResourceArchive musicTrackArchive;
    static String field_v;

    final static id a(String param0, int param1) {
        String stackIn_7_2 = null;
        try {
          if (param1 < 55) {
            od.d((byte) 64);
          }
          id stackIn_3_0 = new id(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("od.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, uk param2) {
        CipherPacketBuffer var5 = q.outgoingPacket;
        var5.writeCipheredOpcode(71, param0);
        var5.position = var5.position + 1;
        if (param1 >= -43) {
          return;
        }
        try {
          int var4 = var5.position;
          var5.writeByte(-1336879960, 1);
          var5.writeByte(-1336879960, param2.field_i);
          var5.b(true, param2.field_m);
          var5.writeInt((byte) 71, param2.field_l);
          var5.writeInt((byte) 59, param2.field_h);
          var5.writeInt((byte) 104, param2.field_k);
          var5.writeInt((byte) 24, param2.field_n);
          var5.appendCrc32(var4, 89);
          var5.patchByteLength(-var4 + var5.position, (byte) 117);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "od.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, byte param2) {
        int var4 = 2 * param0;
        if (param1 == -1) {
          int var5 = param2 & 255;
          int incrementValue$0 = var4;
          var4++;
          this.field_w[incrementValue$0] = (byte)(var5 * 3 >> 5);
          this.field_w[var4] = (byte)(3 * var5 >> 5);
          return;
        }
        field_v = (String) null;
        int var5Lifetime1 = param2 & 255;
        int incrementValue$1 = var4;
        var4++;
        this.field_w[incrementValue$1] = (byte)(var5Lifetime1 * 3 >> 5);
        this.field_w[var4] = (byte)(3 * var5Lifetime1 >> 5);
    }

    public static void d(byte param0) {
        field_v = null;
        musicTrackArchive = null;
        if (param0 != -96) {
          String var2 = (String) null;
          od.a((String) null, -124);
        }
    }

    od() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final static String a(CharSequence[] param0, int param1) {
        String stackIn_8_2 = null;
        try {
          if (param1 == 3) {
            String stackIn_4_0 = gq.a(param0.length, param0, 21530, 0);
            return stackIn_4_0;
          }
          String stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var2;
          StringBuilder stackIn_7_1 = new StringBuilder().append("od.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1, int param2, int param3) {
        this.field_w = new byte[param2 * (param1 * param3 * 2)];
        this.a(true, param3, param1, param2);
        if (param0 == -959081435) {
          return this.field_w;
        }
        return (byte[]) null;
    }

    static {
        field_v = "Highscores";
    }
}
