/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveSourceManager {
    private NetworkArchiveRequest field_e;
    private ee[] field_a;
    private java.math.BigInteger field_h;
    private PacketBuffer field_i;
    static String field_f;
    private DiskCacheWorker field_d;
    private java.math.BigInteger field_g;
    static int field_c;
    private ArchiveNetworkClient field_b;

    public static void clearStaticReferences(int param0) {
        int var1 = -69 / ((46 - param0) / 43);
        field_f = null;
    }

    final void pollArchiveSources(boolean param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = CrazyCrystals.field_B;
        if (this.field_a == null) {
          return;
        }
        for (var2 = 0; var2 < this.field_a.length; var2++) {
          if (null != this.field_a[var2]) {
            this.field_a[var2].c(117);
          }
        }
        for (var2Lifetime1 = 0; this.field_a.length > var2Lifetime1; var2Lifetime1++) {
          if (null != this.field_a[var2Lifetime1]) {
            this.field_a[var2Lifetime1].e(26);
          }
        }
        if (!param0) {
          this.field_d = (DiskCacheWorker) null;
        }
    }

    final ee getOrCreateArchiveSource(int param0, SectorCacheStore param1, boolean param2, int param3, SectorCacheStore param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ee var9 = null;
        byte[] var13 = null;
        ee stackIn_9_0 = null;
        ee stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_i == null) {
            throw new RuntimeException();
          }
          if (param3 >= 0 &&
            param3 < this.field_a.length) {
            if (this.field_a[param3] != null) {
              stackIn_9_0 = this.field_a[param3];
              return stackIn_9_0;
            }
            this.field_i.position = 72 * param3 + 6;
            var6_int = this.field_i.readInt((byte) 127);
            var7 = this.field_i.readInt((byte) 126);
            var13 = new byte[param0];
            this.field_i.readBytes(64, var13, (byte) 94, 0);
            var9 = new ee(param3, param4, param1, this.field_b, this.field_d, var6_int, var13, var7, param2);
            this.field_a[param3] = var9;
            stackIn_11_0 = var9;
            return stackIn_11_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("pk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -56) {
          field_f = (String) null;
        }
        return GrowableIntArray.field_d.loadMasterIndex(true);
    }

    ArchiveSourceManager(ArchiveNetworkClient param0, DiskCacheWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(int param0, pp param1, byte param2) {
        CipherPacketBuffer var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = tp.field_f;
          var3.writeCipheredByte(8, param0);
          var3.writeByte(true, 2);
          var3.writeByte(true, 0);
          var3.writeByte(true, param1.field_f);
          if (param2 != 113) {
            field_f = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("pk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qp var4_ref_qp = null;
        Object var5 = null;
        int var6 = 0;
        w var8 = null;
        CipherPacketBuffer var9 = null;
        byte[] var13 = null;
        var6 = CrazyCrystals.field_B;
        try {
          if (param0 >= -97) {
            return;
          }
          var9 = ConfirmedEmailAvailabilityValidator.field_n;
          var2 = var9.readUnsignedByte(255);
          if (var2 == 0) {
            var8 = (w) (je.field_a.beginForward(32073));
            if (var8 == null) {
              jj.a(4);
              return;
            }
            var4 = var9.readUnsignedByte(255);
            if (0 != var4) {
              var13 = new byte[var4];
              var9.readBytes(var4, var13, (byte) -120, 0);
            } else {
              var5 = null;
            }
            var9.position = var9.position + 4;
            if (!var9.verifyCrc32(-99)) {
              jj.a(4);
              return;
            }
            var8.unlink(false);
          } else {
            if (var2 == 1) {
              var3 = var9.readInt((byte) -114);
              var4_ref_qp = (qp) (oi.field_a.beginForward(32073));
              while (var4_ref_qp != null) {
                if (var3 != var4_ref_qp.field_h) {
                  var4_ref_qp = (qp) (oi.field_a.nextForward(false));
                  continue;
                }
                break;
              }
              if (var4_ref_qp == null) {
                jj.a(4);
                return;
              }
              var4_ref_qp.unlink(false);
              return;
            }
            wp.a((Throwable) null, "A1: " + IntrusiveNodeHashTable.a(-1815), 21862);
            jj.a(4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.wrapClientException((Throwable) ((Object) var1), "pk.D(" + param0 + ')');
        }
    }

    private final boolean loadMasterIndex(boolean param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        PacketBuffer var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = CrazyCrystals.field_B;
        if (this.field_i != null) {
          return true;
        }
        if (null == this.field_e) {
          if (this.field_b.isPriorityQueueFull((byte) -64)) {
            return false;
          }
          this.field_e = this.field_b.enqueueRequest(true, 18303, 255, 255, (byte) 0);
        }
        if (this.field_e.field_n) {
          return false;
        }
        var10 = new PacketBuffer(this.field_e.getData(113));
        var10.position = 5;
        var3 = var10.readUnsignedByte(255);
        var10.position = var10.position + var3 * 72;
        var13 = new byte[-var10.position + var10.payload.length];
        var11 = var13;
        var4 = var11;
        var10.readBytes(var13.length, var13, (byte) 87, 0);
        if (this.field_g != null &&
          null != this.field_h) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_h);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        if (!param0) {
          return false;
        }
        var15 = ac.a(var10.payload, 5, -5 + (-var13.length + var10.position), (byte) -127);
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_a = new ee[var3];
        this.field_i = var10;
        return true;
    }

    private ArchiveSourceManager(ArchiveNetworkClient param0, DiskCacheWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_g = param2;
          this.field_h = param3;
          this.field_d = param1;
          this.field_b = param0;
          if (!this.field_b.isPriorityQueueFull((byte) -69)) {
            this.field_e = this.field_b.enqueueRequest(true, 18303, 255, 255, (byte) 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pk.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_f = "Passwords must be between 5 and 20 letters and numbers";
        field_c = 480;
    }
}
