/*
 * Decompiled by CFR-JS 0.4.0.
 */
class KeyedLoginCredentials extends LoginCredentials {
    private long field_g;
    private String field_i;
    static String field_h;
    static Sprite field_f;

    final static void writeBlobSubmission(byte param0, int param1, BlobSubmission param2) {
        CipherPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        BlobSubmission var5 = null;
        CipherPacketBuffer var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = FootballerAiOverlaySupport.field_d;
          var3 = var6;
          var6.b(param1, (byte) 113);
          var6.field_n = var6.field_n + 1;
          var4 = var6.field_n;
          var6.writeByte(116, 1);
          if (null == param2.payload) {
            var6.writeByte(102, 0);
          } else {
            var6.writeByte(111, param2.payload.length);
            var6.writeBytes(0, param2.payload.length, 1991220144, param2.payload);
          }
          var6.appendCrc32(var4, false);
          var6.field_n = var6.field_n - 4;
          param2.requestCrc = var6.readInt(4);
          var6.backpatchByteLength(param0 ^ 42, -var4 + var6.field_n);
          if (param0 == 20) {
            return;
          }
          var5 = (BlobSubmission) null;
          KeyedLoginCredentials.writeBlobSubmission((byte) -56, 113, (BlobSubmission) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("aa.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void writeCredentials(PacketBuffer param0, int param1) {
        try {
          param0.writeLong(this.field_g, -1781890008);
          param0.writeBase38Password((byte) -85, this.field_i);
          if (param1 != 17053) {
            BlobSubmission var4 = (BlobSubmission) null;
            KeyedLoginCredentials.writeBlobSubmission((byte) 56, -49, (BlobSubmission) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "aa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -101) {
          field_f = (Sprite) null;
          field_h = null;
          field_f = null;
          return;
        }
        field_h = null;
        field_f = null;
    }

    final static long millisSinceSessionStart(int param0) {
        if (param0 != 29680) {
          KeyedLoginCredentials.millisSinceSessionStart(42);
          return MonotonicClock.monotonicMillis(108) - IterableDualLinkDeque.field_c;
        }
        return MonotonicClock.monotonicMillis(108) - IterableDualLinkDeque.field_c;
    }

    LoginKind getLoginKind(byte param0) {
        if (param0 > -77) {
          return (LoginKind) null;
        }
        return MatchScreen.field_w;
    }

    KeyedLoginCredentials(long param0, String param1) {
        try {
          this.field_i = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "aa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "There are no auctions in progress.";
    }
}
