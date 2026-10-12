/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static ClientUiComponent[] field_g;
    int field_d;
    String field_j;
    static String field_h;
    static byte[] field_a;
    String field_b;
    ResourceArchive field_c;
    static ClientUiComponent field_f;
    static String field_i;
    String field_e;

    public static void a(byte param0) {
        if (param0 == 120) {
          field_g = null;
          field_f = null;
          field_h = null;
          field_i = null;
          field_a = null;
          return;
        }
        we.decodeSingleByteCharacter(2, (byte) 125);
        field_g = null;
        field_f = null;
        field_h = null;
        field_i = null;
        field_a = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static AnimationFrameSet a(int param0, boolean param1) {
        fd var2;
        int var3;
        NodeDeque stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        if (null == bk.field_e) {
          return null;
        }
        stackIn_5_0 = bk.field_e;
        stackIn_6_1 = (param1) ? false : true;
        if (((NodeDeque) (Object) stackIn_5_0).size(stackIn_6_1) == 0) {
          return null;
        }
        if (!param1) {
          return (AnimationFrameSet) null;
        }
        var2 = (fd) (bk.field_e.first((byte) 109));
        while (var2 != null) {
          var3 = var2.field_k;
          if (var3 == param0) {
            return var2.field_p;
          }
          var2 = (fd) (bk.field_e.next((byte) 123));
        }
        return null;
    }

    final static SoundPlaybackHandle playSoundAtVolume(int obfuscationGuard, int volume, PcmSample sample) {
        RuntimeException failure = null;
        SoundPlaybackHandle rejectedHandle = null;
        SoundPlaybackHandle registeredHandle = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String sampleDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard == 100) {
            registeredHandle = MapTile.playRawSound(obfuscationGuard - 145, RawPcmStream.createAtRate(sample, 100, volume));
            return registeredHandle;
          }
          rejectedHandle = (SoundPlaybackHandle) null;
          return rejectedHandle;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("we.A(").append(obfuscationGuard).append(',').append(volume).append(',');
          if (sample == null) {
            sampleDescription = "null";
          } else {
            sampleDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(sampleDescription).append(')').toString());
        }
    }

    final static char decodeSingleByteCharacter(int obfuscationGuard, byte encodedByte) {
        int var3 = 0;
        int var2 = 255 & encodedByte;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (obfuscationGuard > -115) {
          return 'ﾍ';
        }
        if (var2 < 128) {
          return (char)var2;
        }
        if (var2 < 160) {
          var3 = MapRepository.field_a[var2 - 128];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
          return (char)var2;
        }
        return (char)var2;
    }

    private we() throws Throwable {
        throw new Error();
    }

    static {
        field_a = new byte[]{(byte)65, (byte)79, (byte)71, (byte)2};
        field_h = "Toughest unit";
        field_i = "Suggested names: ";
    }
}
