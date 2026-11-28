/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundCache {
    private ResourceArchive field_b;
    static int field_a;
    static String field_g;
    static long field_c;
    private uk field_d;
    static java.awt.Frame field_h;
    static int field_f;
    private ResourceArchive field_i;
    private uk field_e;

    final PcmSample loadSoundEffectById(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b.getGroupCapacity(true) == 1) {
            stackIn_3_0 = this.loadSoundEffect(param1, 0, param2, (byte) -61);
            return stackIn_3_0;
          }
          if (param0 != 25910) {
            SoundCache.clearStaticReferences(-63);
          }
          if (1 != this.field_b.getFileCapacity((byte) 47, param1)) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.loadSoundEffect(0, param1, param2, (byte) -66);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("i.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        field_h = null;
        field_g = null;
        int var1 = 48 % ((param0 - 59) / 57);
    }

    final static void a(java.awt.Canvas param0, int param1) {
        try {
          if (ContentTransitionDialog.field_U == 11) {
            lj.clearStaticReferences((byte) -50);
          }
          NodeHashTableIterator.a(ProxyAuthenticationRequiredException.field_a, ea.field_c, DisplayNameSelectionPanel.field_I, -608757616);
          qi.a(param0, 0, param1, param1 - 25971);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "i.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final PcmSample loadMusicSample(int[] param0, int param1, int param2, int param3) {
        PcmSample discarded$0 = null;
        PcmSample stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        PcmSample stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        VorbisSample var9 = null;
        int[] var10 = null;
        PcmSample var8Lifetime1;
        try {
          var5_int = param1 ^ (param2 >>> 12 | 65532 & param2 << 4);
          var5_int = var5_int | param2 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (PcmSample) (this.field_e.a(param3 ^ -1911228517, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_6_0 = null;
            return (PcmSample) (stackIn_6_0);
          }
          if (param3 != -1911228444) {
            var10 = (int[]) null;
            discarded$0 = this.loadMusicSample((int[]) null, -26, -39, -29);
          }
          var9 = (VorbisSample) (this.field_d.a(50, var6));
          if (var9 == null) {
            var9 = VorbisSample.load(this.field_i, param2, param1);
            if (var9 == null) {
              return null;
            }
            this.field_d.a(var6, 120, var9);
          }
          var8Lifetime1 = var9.decodeToPcm(param0);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.unlink(2);
          this.field_e.a(var6, param3 + 1911228564, var8Lifetime1);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("i.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final PcmSample loadSoundEffect(int param0, int param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        long var7 = 0L;
        PcmSample var9 = null;
        SynthesizedSoundEffect var10 = null;
        PcmSample var11 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSample var9Lifetime1;
        try {
          var5_int = ((-805302273 & param1) << 4 | param1 >>> 12) ^ param0;
          var5_int = var5_int | param1 << 16;
          var6 = -109 % ((param3 - 18) / 61);
          var7 = (long)var5_int;
          var9 = (PcmSample) (this.field_e.a(45, var7));
          if (var9 != null) {
            stackIn_2_0 = var9;
            return stackIn_2_0;
          }
          if (param2 != null &&
            0 >= param2[0]) {
            return null;
          }
          var10 = SynthesizedSoundEffect.load(this.field_b, param1, param0);
          if (var10 == null) {
            return null;
          }
          var11 = var10.toPcmSample();
          var9Lifetime1 = var11;
          this.field_e.a(var7, 115, var9Lifetime1);
          if (param2 != null) {
            param2[0] = param2[0] - var11.field_h.length;
          }
          stackIn_13_0 = var9Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("i.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final PcmSample loadMusicSampleById(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_5_0 = null;
        PcmSample stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_i.getGroupCapacity(true) == 1) {
            stackIn_2_0 = this.loadMusicSample(param0, param2, 0, -1911228444);
            return stackIn_2_0;
          }
          if (param1 != 0) {
            stackIn_5_0 = (PcmSample) null;
            return stackIn_5_0;
          }
          if (this.field_i.getFileCapacity((byte) 47, param2) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.loadMusicSample(param0, 0, param2, -1911228444);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("i.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    SoundCache(ResourceArchive param0, ResourceArchive param1) {
        this.field_d = new uk(256);
        this.field_e = new uk(256);
        try {
          this.field_b = param0;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "i.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Quit to website";
        field_f = -1;
    }
}
