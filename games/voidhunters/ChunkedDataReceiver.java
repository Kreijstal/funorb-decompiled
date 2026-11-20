/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChunkedDataReceiver {
    private byte[] data;
    static int[] field_c;
    private boolean complete;
    private int receivedBytes;

    final byte[] takeCompletedData(int param0) {
        byte[] var3 = null;
        if (this.complete) {
          var3 = this.data;
          byte[] var2 = var3;
          this.data = null;
          return var3;
        }
        if (param0 != -30223) {
          this.data = (byte[]) null;
          return null;
        }
        return null;
    }

    final void receiveChunk(PacketBuffer param0, int param1, boolean param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          var4_int = param0.readInt(90);
          if (param2) {
            System.out.println("data_len received: " + var4_int + " (hex " + Integer.toHexString(var4_int) + ")");
          }
          if (this.complete ||
            null == this.data ||
            this.data.length != var4_int) {
            if (param2) {
              System.out.println("allocating new buffer");
            }
            this.receivedBytes = 0;
            this.complete = false;
            this.data = new byte[var4_int];
          }
          var5 = param0.readInt(90);
          if (param2) {
            System.out.println("offset received: " + var5 + " (hex " + Integer.toHexString(var5) + ")");
          }
          if (param2 &&
            this.receivedBytes != var5) {
            throw new IllegalStateException("had received " + this.receivedBytes + ", got offset " + var5 + " total len: " + var4_int);
          }
          var6 = param0.readUnsignedShort(1869);
          if (param2) {
            System.out.println("Receiving: " + var6);
          }
          param0.readBytes(var5, this.data, (byte) -59, var6);
          this.receivedBytes = this.receivedBytes + var6;
          if (this.data.length <= this.receivedBytes) {
            this.complete = true;
          }
          if (param2 &&
            this.complete) {
            System.out.println("Ready!");
          }
          if (param1 > 68) {
            return;
          }
          field_c = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("um.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 100) {
          return;
        }
        field_c = null;
    }

    final int getProgressPercent(int param0) {
        if (param0 != 0) {
          return -31;
        }
        if (this.complete) {
          return 0;
        }
        if (null != this.data) {
          return this.receivedBytes * 100 / this.data.length;
        }
        return 0;
    }

    static {
        field_c = new int[8192];
    }
}
