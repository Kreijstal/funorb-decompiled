/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ServerTick extends IntrusiveNode implements DiffableState {
    static Widget field_d;
    int field_g;
    boolean field_e;
    int field_f;

    public static void clearSharedReferences(int param0) {
        if (param0 != 16214) {
          ServerTick.clearSharedReferences(-109);
          field_d = null;
          return;
        }
        field_d = null;
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        ServerTick var5 = null;
        boolean stackIn_7_0 = false;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (ServerTick) (other);
          var4 = 0;
          if (var5.field_f != this.field_f) {
            GetSniperCannonAimarc.a(-6940, "int servertick has changed. before=" + var5.field_f + ", now=" + this.field_f);
            var4 = 1;
          }
          if (var5.field_g != this.field_g) {
            GetSniperCannonAimarc.a(-6940, "int statecrc has changed. before=" + var5.field_g + ", now=" + this.field_g);
            var4 = 1;
          }
          stackIn_7_0 = this.field_e;
          if (var5.field_e) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if ((stackIn_7_0 ? 1 : 0) == stackIn_8_1) {
            var4 = 1;
            GetSniperCannonAimarc.a(-6940, "boolean client_should_catchup has changed. ");
          }
          if (obfuscationGuard > -19) {
            this.field_e = true;
          }
          if (var4 == 0) {
            return;
          }
          SetDebrisGrabbingRange.a((byte) -82, "This instance of ServerTick has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("umb.F(");
          if (other == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          param0.writeBits(-632, this.field_f, 32);
          param0.writeBits(-632, this.field_g, 32);
          if (param1 > -109) {
            field_d = (Widget) null;
          }
          vq.writeBoolean(param0, 43, this.field_e);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "umb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        ServerTick var3 = null;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = -52 / ((22 - param0) / 59);
          var3 = (ServerTick) (param1);
          if (var3.field_f == this.field_f &&
            var3.field_g == this.field_g) {
            stackIn_4_0 = var3.field_e;
            if (this.field_e) {
              stackIn_5_1 = 0;
            } else {
              stackIn_5_1 = 1;
            }
            if ((stackIn_4_0 ? 1 : 0) != stackIn_5_1) {
              stackIn_8_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_8_0 = true;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("umb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        ServerTick var4 = (ServerTick) (param1);
        ServerTick var3 = var4;
        var4.field_f = this.field_f;
        if (param0 < 54) {
          return;
        }
        try {
          var4.field_g = this.field_g;
          var4.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "umb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          this.field_f = param0.readBits(0, 32);
          this.field_g = param0.readBits(0, 32);
          this.field_e = kv.readBoolean(param1, param0);
          if (param1) {
            SerializableGameState var4 = (SerializableGameState) null;
            this.reportDifferences((SerializableGameState) null, 89);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "umb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ServerTick() {
    }

    static {
    }
}
