/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CarouselSlotStateDump extends IntrusiveNode implements SerializableGameState {
    byte[] serializedState;
    static String field_e;
    static int field_f;
    static int field_g;
    static int field_i;
    private CarouselSlot decodedState;

    final CarouselSlot getDecodedState(int param0) {
        if (null != this.decodedState) {
          return this.decodedState;
        }
        IsaacPacketBuffer var2 = new IsaacPacketBuffer(this.serializedState.length - 4);
        var2.writeBytes(4, this.serializedState, -1, -4 + this.serializedState.length);
        var2.position = param0;
        CarouselSlot var3 = (CarouselSlot) (ConsoleEvaluationException.field_a.create((byte) -128));
        var2.beginBitRead(-23497);
        if (!(var3 instanceof CompactGameState)) {
          var3.readState(var2, false);
          var2.endBitRead((byte) -116);
          this.decodedState = var3;
          return var3;
        }
        ((CompactGameState) ((Object) var3)).readCompactState(var2, 32);
        var2.endBitRead((byte) -116);
        this.decodedState = var3;
        return var3;
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          if (param1 > -109) {
            IsaacPacketBuffer var4 = (IsaacPacketBuffer) null;
            this.writeState((IsaacPacketBuffer) null, -44);
          }
          param0.endBitWrite(32712);
          param0.writeInt(this.serializedState.length, 332614536);
          param0.writeBytes(0, this.serializedState, -1, this.serializedState.length);
          param0.beginBitWrite(-81);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bhb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    CarouselSlotStateDump(int param0, IsaacPacketBuffer param1) {
        this(param0, param1.payload, param1.position);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 32) {
          return;
        }
        field_e = null;
    }

    final int getSnapshotTick(int param0) {
        int var2 = 23 / ((param0 - 26) / 60);
        return ((this.serializedState[2] & 255) << 8) + (((this.serializedState[1] & 255) << 16) + (this.serializedState[0] << 24 & -16777216)) + (this.serializedState[3] & 255);
    }

    final void reportDifferences(SerializableGameState param0, boolean param1) {
        try {
          if (!param1) {
            field_g = -106;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bhb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        CarouselSlotStateDump var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (CarouselSlotStateDump) (param1);
          if (null == this.serializedState) {
            var3.serializedState = null;
          } else {
            if (null == var3.serializedState ||
              this.serializedState.length != var3.serializedState.length) {
              var3.serializedState = new byte[this.serializedState.length];
            }
            ArrayOperations.copy(this.serializedState, 0, var3.serializedState, 0, this.serializedState.length);
          }
          if (param0 > 54) {
            return;
          }
          this.decodedState = (CarouselSlot) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("bhb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 10 / ((param0 - 22) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("bhb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    CarouselSlotStateDump() {
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        int var3_int = 0;
        try {
          param0.endBitRead((byte) -100);
          if (param1) {
            field_e = (String) null;
          }
          var3_int = param0.readInt(49);
          this.serializedState = new byte[var3_int];
          param0.readBytes(0, this.serializedState, (byte) -59, var3_int);
          param0.beginBitRead(-23497);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bhb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private CarouselSlotStateDump(int param0, byte[] param1, int param2) {
        try {
          this.serializedState = new byte[param2 + 4];
          this.serializedState[2] = (byte)(param0 >> 8);
          this.serializedState[3] = (byte)param0;
          this.serializedState[1] = (byte)(param0 >> 16);
          this.serializedState[0] = (byte)(param0 >> 24);
          ArrayOperations.copy(param1, 0, this.serializedState, 4, param2);
          this.decodedState = null;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bhb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Hold the left mouse button to shoot";
        field_i = 131072;
        field_g = 32;
    }
}
