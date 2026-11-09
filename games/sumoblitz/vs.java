/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static LoginCredentialType ALTERNATE_USERNAME_CREDENTIALS;
    static int field_b;

    final static int a(byte param0, CharSequence param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 0;
          if (param0 > -111) {
            field_b = 12;
          }
          var4 = param1.length();
          for (var5 = 0; var5 < var4; var5++) {
            if (param2 == param1.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("vs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -68) {
          return;
        }
        ALTERNATE_USERNAME_CREDENTIALS = null;
    }

    final static boolean isGuestSession(byte guard) {
        if (guard != 9) {
          vs.releaseStatics((byte) 108);
        }
        return IntrusiveNode.field_a;
    }

    final static boolean a(int[] param0, int param1) {
        int var6_int = 0;
        int var7 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        DelayedInboundPacket var5_ref_ub = null;
        int var5 = 0;
        DelayedInboundPacket var6 = null;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (TextCaretLayout.accountPhase != LegacyOpenGlUnderwaterEffect.CONNECTED) {
            return false;
          }
          var4 = 96 / ((param1 + 72) / 53);
          var2_long = wq.monotonicTimeMillis(-45);
          if (0 != ByteArrayPool.field_c &&
            lq.field_b < 0) {
            var5_ref_ub = (DelayedInboundPacket) (ScoreMultiplierTable.field_b.first(-99));
            if (var5_ref_ub != null &&
              var2_long > var5_ref_ub.deliveryTimeMillis) {
              var5_ref_ub.unlink(false);
              HardwareBufferSet.field_d = var5_ref_ub.payload.length;
              NativeLibraryExtractor.field_a.position = 0;
              for (var6_int = 0; var6_int < HardwareBufferSet.field_d; var6_int++) {
                NativeLibraryExtractor.field_a.payload[var6_int] = var5_ref_ub.payload[var6_int];
              }
              ToolkitImageProducerBuffer.field_r = RotarySelectorWidget.field_I;
              RotarySelectorWidget.field_I = ContentTransitionDialog.field_Q;
              ContentTransitionDialog.field_Q = TextureFormat.field_a;
              TextureFormat.field_a = var5_ref_ub.opcode;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("vs.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
        stackIn_17_0 = lq.field_b;
        try {
          while (true) {
            if (stackIn_17_0 < 0) {
              NativeLibraryExtractor.field_a.position = 0;
              if (!OpenGlIndexBuffer.b(-1, 1)) {
                return false;
              }
              lq.field_b = NativeLibraryExtractor.field_a.readCipherByte(255);
              NativeLibraryExtractor.field_a.position = 0;
              HardwareBufferSet.field_d = param0[lq.field_b];
            }
            if (!lt.a((byte) 119)) {
              return false;
            }
            if (ByteArrayPool.field_c == 0) {
              ToolkitImageProducerBuffer.field_r = RotarySelectorWidget.field_I;
              RotarySelectorWidget.field_I = ContentTransitionDialog.field_Q;
              ContentTransitionDialog.field_Q = TextureFormat.field_a;
              TextureFormat.field_a = lq.field_b;
              lq.field_b = -1;
              return true;
            }
            var5 = ByteArrayPool.field_c;
            if (0.0 != LegacyOpenGlReflectionEffect.field_k) {
              var5 = (int)((double)var5 + NanoTickClock.field_d.nextGaussian() * LegacyOpenGlReflectionEffect.field_k);
              if (var5 < 0) {
                var5 = 0;
              }
            }
            var6 = new DelayedInboundPacket((long)var5 + var2_long, lq.field_b, new byte[HardwareBufferSet.field_d]);
            for (var7 = 0; HardwareBufferSet.field_d > var7; var7++) {
              var6.payload[var7] = NativeLibraryExtractor.field_a.payload[var7];
            }
            ScoreMultiplierTable.field_b.addLast((IntrusiveNode) (var6), (byte) 39);
            lq.field_b = -1;
            stackIn_17_0 = lq.field_b;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("vs.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        ALTERNATE_USERNAME_CREDENTIALS = new LoginCredentialType(0);
    }
}
