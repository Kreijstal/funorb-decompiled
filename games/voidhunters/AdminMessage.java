/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AdminMessage implements DiffableState {
    int index;
    int value;

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        int var3_int = 0;
        AdminMessage var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 34 / ((param0 - 22) / 59);
          var4 = (AdminMessage) (param1);
          stackIn_5_0 = (this.index != var4.index) || (var4.value != this.value);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("be.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        AdminMessage var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -19) {
            return;
          }
          var3 = (AdminMessage) (other);
          var4 = 0;
          if (this.index != var3.index) {
            System.out.println("int index has changed. before=" + var3.index + ", now=" + this.index);
            var4 = 1;
          }
          if (var3.value != this.value) {
            var4 = 1;
            System.out.println("int value has changed. before=" + var3.value + ", now=" + this.value);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of AdminMessage has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("be.F(");
          if (other == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final String toString() {
        return this.index + " to " + this.value;
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        param0.writeBits(-632, this.index, 32);
        if (param1 >= -109) {
          return;
        }
        try {
          param0.writeBits(-632, this.value, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "be.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, MusicTrack param2) {
        try {
          if (param0 != 32) {
            MusicTrack var4 = (MusicTrack) null;
            AdminMessage.a(-122, false, (MusicTrack) null);
          }
          GetWeaponProjectileSpeedMultiply.a(param2, param1, 256, (byte) 97);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "be.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        RuntimeException var3 = null;
        AdminMessage var5 = null;
        AdminMessage var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (AdminMessage) (param1);
          var6 = var5;
          var6.value = this.value;
          var6.index = this.index;
          if (param0 >= 54) {
            return;
          }
          this.value = 35;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("be.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          if (param1) {
            MusicTrack var4 = (MusicTrack) null;
            AdminMessage.a(-84, true, (MusicTrack) null);
          }
          this.index = param0.readBits(0, 32);
          this.value = param0.readBits(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "be.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
