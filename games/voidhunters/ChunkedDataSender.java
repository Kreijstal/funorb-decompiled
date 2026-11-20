/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChunkedDataSender {
    private int sendDelay;
    private byte[] data;
    private int packetOpcode;
    private int outputReserve;
    private int offset;
    private int sendInterval;

    final boolean isIdle(int param0) {
        if (param0 == 0) {
          return this.data == null ? true : false;
        }
        byte[] var3 = (byte[]) null;
        this.setData((byte[]) null, 29);
        return this.data == null ? true : false;
    }

    final void setData(byte[] param0, int param1) {
        try {
          this.data = param0;
          this.offset = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ova.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void sendNextChunk(IsaacPacketBuffer param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          if (null == this.data) {
            return;
          }
          fieldTemp$0 = this.sendDelay - 1;
          this.sendDelay = this.sendDelay - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.sendDelay = this.sendDelay + this.sendInterval;
          if (param1) {
            System.out.println("updating datasender, total " + this.data.length);
          }
          var4_int = param0.payload.length - param0.position;
          if (param2 <= 121) {
            this.packetOpcode = 8;
          }
          var5 = -this.outputReserve + var4_int;
          if (param1) {
            System.out.println("sendable_now " + var5);
          }
          if (var5 <= 0) {
            return;
          }
          param0.writeIsaacByte(24335, this.packetOpcode);
          param0.position = param0.position + 2;
          var6 = param0.position;
          param0.writeInt(this.data.length, 332614536);
          param0.writeInt(this.offset, 332614536);
          if (var5 > this.data.length - this.offset) {
            var5 = -this.offset + this.data.length;
          }
          param0.writeShort(var5, true);
          param0.writeBytes(this.offset, this.data, -1, var5);
          param0.writeLengthShort(param0.position - var6, -124);
          this.offset = this.offset + var5;
          if (this.offset >= this.data.length) {
            this.data = null;
            if (!param1) {
              return;
            }
            System.out.println("done sending this data.");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ova.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ChunkedDataSender(int param0) {
        this.outputReserve = 1024;
        this.sendInterval = 8;
        this.sendDelay = 0;
        this.packetOpcode = param0;
    }

    static {
    }
}
