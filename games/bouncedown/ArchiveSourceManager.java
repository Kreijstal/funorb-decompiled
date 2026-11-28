/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveSourceManager {
    private ce[] field_h;
    private java.math.BigInteger field_e;
    private ArchiveNetworkClient field_d;
    private PacketBuffer field_f;
    static double field_c;
    private DiskCacheWorker field_a;
    private NetworkArchiveRequest field_g;
    private java.math.BigInteger field_b;

    final ce getOrCreateArchiveSource(boolean param0, SectorCacheStore param1, SectorCacheStore param2, int param3, int param4) {
        ce stackIn_10_0 = null;
        ce stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ce var9 = null;
        byte[] var13 = null;
        try {
          if (this.field_f == null) {
            throw new RuntimeException();
          }
          if (0 <= param3 &&
            this.field_h.length > param3) {
            if (null != this.field_h[param3]) {
              stackIn_10_0 = this.field_h[param3];
              return stackIn_10_0;
            }
            if (param4 != -18023) {
              this.field_d = (ArchiveNetworkClient) null;
            }
            this.field_f.position = 6 + 72 * param3;
            var6_int = this.field_f.readInt(-3);
            var7 = this.field_f.readInt(-3);
            var13 = new byte[64];
            this.field_f.readBytes((byte) 125, 64, var13, 0);
            var9 = new ce(param3, param1, param2, this.field_d, this.field_a, var6_int, var13, var7, param0);
            this.field_h[param3] = var9;
            stackIn_14_0 = var9;
            return stackIn_14_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("oj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void pollArchiveSources(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Bounce.field_N;
        if (this.field_h == null) {
          return;
        }
        for (var2 = 0; var2 < this.field_h.length; var2++) {
          if (null != this.field_h[var2]) {
            this.field_h[var2].d(param0 + 19188);
          }
        }
        if (param0 != -16840) {
          this.field_b = (java.math.BigInteger) null;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_h.length; var2Lifetime1++) {
          if (null != this.field_h[var2Lifetime1]) {
            this.field_h[var2Lifetime1].c(98);
          }
        }
    }

    ArchiveSourceManager(ArchiveNetworkClient param0, DiskCacheWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean loadMasterIndex(int param0) {
        int var8 = 0;
        int var2;
        PacketBuffer var3;
        int var4;
        byte[] var5;
        byte[] var6;
        java.math.BigInteger var8_ref_java_math_BigInteger;
        int var9;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var9 = Bounce.field_N;
        var2 = 67 / ((-16 - param0) / 55);
        if (null != this.field_f) {
          return true;
        }
        if (this.field_g == null) {
          if (this.field_d.isPriorityQueueFull(false)) {
            return false;
          }
          this.field_g = this.field_d.enqueueRequest(255, (byte) 0, -93, true, 255);
        }
        if (this.field_g.field_n) {
          return false;
        }
        var3 = new PacketBuffer(this.field_g.getData((byte) -116));
        var3.position = 5;
        var4 = var3.readUnsignedByte((byte) -119);
        var3.position = var3.position + 72 * var4;
        var13 = new byte[var3.payload.length - var3.position];
        var11 = var13;
        var5 = var11;
        var3.readBytes((byte) 126, var13.length, var13, 0);
        if (null != this.field_e &&
          null != this.field_b) {
          var12 = new java.math.BigInteger(var13);
          var8_ref_java_math_BigInteger = var12.modPow(this.field_e, this.field_b);
          var6 = var8_ref_java_math_BigInteger.toByteArray();
        } else {
          var6 = var5;
        }
        if (var6.length != 65) {
          throw new RuntimeException();
        }
        var15 = DefaultTextWidgetRenderer.a(var3.payload, 5, -5 + (var3.position - var13.length), 0);
        for (var8 = 0; var8 < 64; var8++) {
          if (var15[var8] != var6[var8 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_h = new ce[var4];
        this.field_f = var3;
        return true;
    }

    final static int a(GameClient param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 15 % ((param1 + 69) / 48);
          stackIn_1_0 = param0.pollAccountUiActions(-1, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("oj.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private ArchiveSourceManager(ArchiveNetworkClient param0, DiskCacheWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_a = param1;
          this.field_d = param0;
          this.field_e = param2;
          this.field_b = param3;
          if (!this.field_d.isPriorityQueueFull(false)) {
            this.field_g = this.field_d.enqueueRequest(255, (byte) 0, 112, true, 255);
          }
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "oj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0.0;
    }
}
