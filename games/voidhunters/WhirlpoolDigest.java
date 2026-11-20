/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolDigest {
    static String field_a;
    private long[] state;
    private byte[] buffer;
    private long[] scratch;
    private byte[] bitCount;
    private long[] block;
    private long[] hash;
    private long[] roundKey;
    static int field_b;
    private int bufferBits;
    static String field_c;
    private int bufferPosition;

    final static void closeQuickChatIfOpen(int param0) {
        if (param0 != 18444) {
          return;
        }
        if (LegacyOpenGlTurbulenceEffect.field_d) {
          GetUseExtraBackground.closeQuickChatMenu(-1);
        }
    }

    final void writeDigest(byte[] param0, int param1, byte param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          this.buffer[this.bufferPosition] = (byte)SetAngularForceDownshift.orBits((int) this.buffer[this.bufferPosition], 128 >>> MenuBackgroundBattle.andBits(this.bufferBits, 7));
          this.bufferPosition = this.bufferPosition + 1;
          if (param2 <= 37) {
            WhirlpoolDigest.closeQuickChatIfOpen(-1);
          }
          if (32 < this.bufferPosition) {
            while (this.bufferPosition < 64) {
              fieldTemp$0 = this.bufferPosition;
              this.bufferPosition = this.bufferPosition + 1;
              this.buffer[fieldTemp$0] = (byte) 0;
            }
            this.processBlock((byte) 66);
            this.bufferPosition = 0;
          }
          while (this.bufferPosition < 32) {
            fieldTemp$1 = this.bufferPosition;
            this.bufferPosition = this.bufferPosition + 1;
            this.buffer[fieldTemp$1] = (byte) 0;
          }
          ArrayOperations.copy(this.bitCount, 0, this.buffer, 32, 32);
          this.processBlock((byte) 66);
          var4_int = 0;
          var5 = param1;
          while (var4_int < 8) {
            var6 = this.hash[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[var5 + 4] = (byte)(int)(var6 >>> 24);
            param0[var5 + 5] = (byte)(int)(var6 >>> 16);
            param0[6 + var5] = (byte)(int)(var6 >>> 8);
            param0[7 + var5] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("fj.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void reset(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        int var2Lifetime1;
        if (param0 != -88) {
          this.bitCount = (byte[]) null;
        }
        for (var2 = 0; var2 < 32; var2++) {
          this.bitCount[var2] = (byte) 0;
        }
        this.bufferPosition = 0;
        this.bufferBits = 0;
        this.buffer[0] = (byte) 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.hash[var2Lifetime1] = 0L;
        }
    }

    private final void processBlock(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = VoidHunters.field_G;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.block[var2] = SpecialOrderStatus.xorLong(SpecialOrderStatus.xorLong(SetExplosionProjectileDamage.andBits(255L, (long)this.buffer[6 + var3]) << 8, SpecialOrderStatus.xorLong(SetExplosionProjectileDamage.andBits(255L, (long)this.buffer[5 + var3]) << 16, SpecialOrderStatus.xorLong(SetExplosionProjectileDamage.andBits(255L, (long)this.buffer[4 + var3]) << 24, SpecialOrderStatus.xorLong(SetExplosionProjectileDamage.andBits(255L, (long)this.buffer[3 + var3]) << 32, SpecialOrderStatus.xorLong(SetExplosionProjectileDamage.andBits(280375465082880L, (long)this.buffer[var3 + 2] << 40), SpecialOrderStatus.xorLong(SetExplosionProjectileDamage.andBits((long)this.buffer[1 + var3], 255L) << 48, (long)this.buffer[var3] << 56)))))), SetExplosionProjectileDamage.andBits((long)this.buffer[var3 + 7], 255L));
          var2++;
          var3 += 8;
        }
        if (param0 != 66) {
          this.processBlock((byte) -86);
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.hash[var2Lifetime1];
          arrayValue$1 = this.block[var2Lifetime1];
          this.roundKey[var2Lifetime1] = dupTemp$0;
          this.state[var2Lifetime1] = SpecialOrderStatus.xorLong(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.scratch[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.scratch[var3Lifetime1] = SpecialOrderStatus.xorLong(this.scratch[var3Lifetime1], GetShieldsDirectionalArcParticleLife.whirlpoolTables[var4][MenuBackgroundBattle.andBits(255, (int)(this.roundKey[MenuBackgroundBattle.andBits(-var4 + var3Lifetime1, 7)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.roundKey[var3Lifetime1Lifetime1] = this.scratch[var3Lifetime1Lifetime1];
          }
          this.roundKey[0] = SpecialOrderStatus.xorLong(this.roundKey[0], GetShieldsDirectionalArcParticleLife.whirlpoolRoundConstants[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; 8 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
            this.scratch[var3Lifetime1Lifetime2] = this.roundKey[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.scratch[var3Lifetime1Lifetime2] = SpecialOrderStatus.xorLong(this.scratch[var3Lifetime1Lifetime2], GetShieldsDirectionalArcParticleLife.whirlpoolTables[var7][MenuBackgroundBattle.andBits(255, (int)(this.state[MenuBackgroundBattle.andBits(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.state[var3Lifetime1Lifetime3] = this.scratch[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.hash[var2Lifetime3] = SpecialOrderStatus.xorLong(this.hash[var2Lifetime3], SpecialOrderStatus.xorLong(this.block[var2Lifetime3], this.state[var2Lifetime3]));
        }
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != 0) {
          WhirlpoolDigest.clearSharedReferences(-54);
        }
        field_c = null;
    }

    final void updateBits(byte[] param0, int param1, long param2) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        var13 = VoidHunters.field_G;
        try {
          var5_int = 0;
          var6 = 7 & 8 - (7 & (int)param2);
          var7 = this.bufferBits & 7;
          var9 = param2;
          var11 = 31;
          if (param1 != -7) {
            field_b = 81;
          }
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & this.bitCount[var11]) + (255 & (int)var9));
            this.bitCount[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param2 > 8L) {
            var8 = 255 & param0[var5_int] << var6 | (255 & param0[1 + var5_int]) >>> 8 - var6;
            if (var8 >= 0 &&
              var8 < 256) {
              this.buffer[this.bufferPosition] = (byte)SetAngularForceDownshift.orBits((int) this.buffer[this.bufferPosition], var8 >>> var7);
              this.bufferPosition = this.bufferPosition + 1;
              this.bufferBits = this.bufferBits + (8 - var7);
              if (this.bufferBits == 512) {
                this.processBlock((byte) 66);
                this.bufferBits = 0;
                this.bufferPosition = 0;
              }
              this.buffer[this.bufferPosition] = (byte)MenuBackgroundBattle.andBits(var8 << -var7 + 8, 255);
              this.bufferBits = this.bufferBits + var7;
              var5_int++;
              param2 = param2 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 > 0L) {
            stackIn_18_0 = param0[var5_int] << var6;
            stackIn_18_1 = 255;
            var8Lifetime1 = stackIn_18_0 & stackIn_18_1;
            this.buffer[this.bufferPosition] = (byte)SetAngularForceDownshift.orBits((int) this.buffer[this.bufferPosition], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (param2 + (long)var7 >= 8L) {
            param2 = param2 - (long)(-var7 + 8);
            this.bufferBits = this.bufferBits + (8 - var7);
            this.bufferPosition = this.bufferPosition + 1;
            if (this.bufferBits == 512) {
              this.processBlock((byte) 66);
              this.bufferPosition = 0;
              this.bufferBits = 0;
            }
            this.buffer[this.bufferPosition] = (byte)MenuBackgroundBattle.andBits(255, var8Lifetime1 << 8 - var7);
            this.bufferBits = this.bufferBits + (int)param2;
          } else {
            this.bufferBits = (int)((long)this.bufferBits + param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("fj.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    WhirlpoolDigest() {
        this.state = new long[8];
        this.hash = new long[8];
        this.roundKey = new long[8];
        this.scratch = new long[8];
        this.bufferPosition = 0;
        this.bitCount = new byte[32];
        this.buffer = new byte[64];
        this.bufferBits = 0;
        this.block = new long[8];
    }

    static {
        field_a = "Email: ";
        field_b = 1;
        field_c = "Add map zone";
    }
}
