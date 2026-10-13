/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static String field_b;
    static String field_d;
    static String field_c;
    static jp[] field_a;

    final static String decodeCp1252(int length, int obfuscationGuard, byte[] data, int offset) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var4_int = 0;
        char[] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = 62 / ((obfuscationGuard + 48) / 54);
          var12 = new char[length];
          var11 = var12;
          var5 = var11;
          var6 = 0;
          for (var7 = 0; length > var7; var7++) {
            var8 = data[offset + var7] & 255;
            if (var8 != 0) {
              if (var8 >= 128 &&
                var8 < 160) {
                var9 = ai.cp1252Extensions[-128 + var8];
                if (var9 == 0) {
                  var9 = 63;
                }
                var8 = var9;
              }
              incrementValue$1 = var6;
              var6++;
              var5[incrementValue$1] = (char)var8;
            }
          }
          stackIn_15_0 = new String(var12, 0, var6);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("df.G(").append(length).append(',').append(obfuscationGuard).append(',');
          if (data == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(offset).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 112 / ((param0 + 36) / 63);
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1, int param2, boolean param3) {
        if (param0 != -27790) {
          df.a((byte) 15);
          return MovingBody.c((byte) 109);
        }
        return MovingBody.c((byte) 109);
    }

    final static Boolean a(int param0) {
        Boolean var1 = af.field_r;
        af.field_r = null;
        if (param0 != 0) {
          return (Boolean) null;
        }
        return var1;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = param2 >>> 31;
        if (param1 == 15) {
          return (param2 + var3) / param0 - var3;
        }
        field_c = (String) null;
        return (param2 + var3) / param0 - var3;
    }

    final static void a(e param0, int param1, int param2) {
        try {
          if (param2 != -161) {
            field_b = (String) null;
          }
          na.field_Q.addLast(param0, (byte) 3);
          ud.a(param1, param0, (byte) 119);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "df.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var4Lifetime1;
        if (param1 == 103) {
          tq.field_f.position = 0;
          tq.field_f.writeByte(-112, 12);
          tq.field_f.writeInt(ji.field_e.nextInt(), (byte) -79);
          tq.field_f.writeInt(ji.field_e.nextInt(), (byte) -79);
          tq.field_f.writeByte(-104, param2);
          tq.field_f.writeByte(50, param3);
          tq.field_f.writeShort((byte) 124, param0);
          tq.field_f.applyRsa(Ball.field_F, to.field_g, param1 + 19672);
          k.field_h.writeCipheredOpcode(param1 ^ -13316, 18);
          fieldTemp$0 = k.field_h.position + 1;
          k.field_h.position = k.field_h.position + 1;
          var4 = fieldTemp$0;
          k.field_h.writeBytes(tq.field_f.data, -1, 0, tq.field_f.position);
          k.field_h.backfillByteLength((byte) 125, k.field_h.position - var4);
          return;
        }
        field_c = (String) null;
        tq.field_f.position = 0;
        tq.field_f.writeByte(-112, 12);
        tq.field_f.writeInt(ji.field_e.nextInt(), (byte) -79);
        tq.field_f.writeInt(ji.field_e.nextInt(), (byte) -79);
        tq.field_f.writeByte(-104, param2);
        tq.field_f.writeByte(50, param3);
        tq.field_f.writeShort((byte) 124, param0);
        tq.field_f.applyRsa(Ball.field_F, to.field_g, param1 + 19672);
        k.field_h.writeCipheredOpcode(param1 ^ -13316, 18);
        int fieldTemp$1 = k.field_h.position + 1;
        k.field_h.position = k.field_h.position + 1;
        var4Lifetime1 = fieldTemp$1;
        k.field_h.writeBytes(tq.field_f.data, -1, 0, tq.field_f.position);
        k.field_h.backfillByteLength((byte) 125, k.field_h.position - var4Lifetime1);
    }

    static {
        field_b = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_d = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_c = "Unable to add name - system busy";
    }
}
