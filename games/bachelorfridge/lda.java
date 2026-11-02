/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lda {
    static String field_d;
    static String field_b;
    static int field_a;
    private Sprite[] field_c;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 > 8) {
          hp.a(param4, param2, (byte) 108, param0, this.field_c, param3);
          return;
        }
        String var7 = (String) null;
        lda.a(26, 32, (String) null);
        hp.a(param4, param2, (byte) 108, param0, this.field_c, param3);
    }

    final static SocketConnector a(String param0, int param1, byte param2) {
        ProxySocketConnector var3 = null;
        RuntimeException var3_ref = null;
        ProxySocketConnector stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ProxySocketConnector();
          if (param2 >= -111) {
            field_a = -15;
          }
          ((SocketConnector) ((Object) var3)).host = param0;
          ((SocketConnector) ((Object) var3)).port = param1;
          stackIn_3_0 = var3;
          return (SocketConnector) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("lda.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -15) {
          return -52;
        }
        return param0 & 255;
    }

    final static String a(int param0, int param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        BitPacketBuffer var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param2);
          if (!HazmatSpecial.a(0, var6)) {
            stackIn_2_0 = mk.field_f;
            return stackIn_2_0;
          }
          if (um.field_c != 2) {
            stackIn_5_0 = ama.field_l;
            return stackIn_5_0;
          }
          if (wb.a((byte) 52, param2)) {
            stackIn_8_0 = cea.field_a;
            return stackIn_8_0;
          }
          if (gl.a(3, param2)) {
            stackIn_12_0 = lga.a(true, new String[]{param2}, rt.field_c);
            return stackIn_12_0;
          }
          if (SuperSpeedAnimation.field_v >= 100 &&
            0 >= ProxySocketConnector.field_f) {
            stackIn_16_0 = he.field_m;
            return stackIn_16_0;
          }
          if (param0 != -26181) {
            field_d = (String) null;
          }
          if (SuperSpeedAnimation.field_v >= 200) {
            stackIn_22_0 = he.field_m;
            return stackIn_22_0;
          }
          if (DisableAnimation.a((byte) 5, param2)) {
            stackIn_25_0 = lga.a(true, new String[]{param2}, bda.field_p);
            return stackIn_25_0;
          }
          var5 = sja.field_fb;
          var5.writeCipheredByte(param1, (byte) 116);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(0, 0);
          var5.writeString((byte) -50, param2);
          var5.writeLengthByte((byte) 124, -var4 + var5.position);
          stackIn_27_0 = null;
          return (String) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("lda.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        int var1 = 90 % ((-75 - param0) / 49);
        field_d = null;
        field_b = null;
    }

    lda(Sprite[] param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lda.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Unfortunately you are not eligible to create an account.";
        field_d = "You have entered another game.";
    }
}
