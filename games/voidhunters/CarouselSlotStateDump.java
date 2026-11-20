/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CarouselSlotStateDump extends IntrusiveNode implements SerializableGameState {
    byte[] field_d;
    static String field_e;
    static int field_f;
    static int field_g;
    static int field_i;
    private CarouselSlot field_h;

    final CarouselSlot d(int param0) {
        if (null != this.field_h) {
          return this.field_h;
        }
        IsaacPacketBuffer var2 = new IsaacPacketBuffer(this.field_d.length - 4);
        var2.writeBytes(4, this.field_d, -1, -4 + this.field_d.length);
        var2.position = param0;
        CarouselSlot var3 = (CarouselSlot) (ConsoleEvaluationException.field_a.create((byte) -128));
        var2.beginBitRead(-23497);
        if (!(var3 instanceof CompactGameState)) {
          var3.readState(var2, false);
          var2.endBitRead((byte) -116);
          this.field_h = var3;
          return var3;
        }
        ((CompactGameState) ((Object) var3)).readCompactState(var2, 32);
        var2.endBitRead((byte) -116);
        this.field_h = var3;
        return var3;
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          if (param1 > -109) {
            IsaacPacketBuffer var4 = (IsaacPacketBuffer) null;
            this.writeState((IsaacPacketBuffer) null, -44);
          }
          param0.endBitWrite(32712);
          param0.writeInt(this.field_d.length, 332614536);
          param0.writeBytes(0, this.field_d, -1, this.field_d.length);
          param0.beginBitWrite(-81);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bhb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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

    final int c(int param0) {
        int var2 = 23 / ((param0 - 26) / 60);
        return ((this.field_d[2] & 255) << 8) + (((this.field_d[1] & 255) << 16) + (this.field_d[0] << 24 & -16777216)) + (this.field_d[3] & 255);
    }

    final void a(SerializableGameState param0, boolean param1) {
        try {
          if (!param1) {
            field_g = -106;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bhb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
          if (null == this.field_d) {
            var3.field_d = null;
          } else {
            if (null == var3.field_d ||
              this.field_d.length != var3.field_d.length) {
              var3.field_d = new byte[this.field_d.length];
            }
            ArrayOperations.copy(this.field_d, 0, var3.field_d, 0, this.field_d.length);
          }
          if (param0 > 54) {
            return;
          }
          this.field_h = (CarouselSlot) null;
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
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
          this.field_d = new byte[var3_int];
          param0.readBytes(0, this.field_d, (byte) -59, var3_int);
          param0.beginBitRead(-23497);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bhb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private CarouselSlotStateDump(int param0, byte[] param1, int param2) {
        try {
          this.field_d = new byte[param2 + 4];
          this.field_d[2] = (byte)(param0 >> 8);
          this.field_d[3] = (byte)param0;
          this.field_d[1] = (byte)(param0 >> 16);
          this.field_d[0] = (byte)(param0 >> 24);
          ArrayOperations.copy(param1, 0, this.field_d, 4, param2);
          this.field_h = null;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bhb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Hold the left mouse button to shoot";
        field_i = 131072;
        field_g = 32;
    }
}
