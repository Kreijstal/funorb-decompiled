/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    private java.math.BigInteger field_g;
    static String field_d;
    static String[] field_f;
    private java.math.BigInteger field_i;
    private CachedArchiveSource[] field_k;
    private PacketBuffer field_b;
    static String field_e;
    private ArchiveFetchClient field_a;
    private ArchiveNetworkRequest field_c;
    private CacheIoWorker field_h;
    static AlphaFont field_j;

    final void a(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (null == this.field_k) {
          return;
        }
        if (param0 <= 42) {
          this.field_i = (java.math.BigInteger) null;
        }
        for (var2 = 0; this.field_k.length > var2; var2++) {
          if (null != this.field_k[var2]) {
            this.field_k[var2].processQueuedGroups(20312);
          }
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_k.length; var2Lifetime1++) {
          if (null != this.field_k[var2Lifetime1]) {
            this.field_k[var2Lifetime1].maintainGroups(1);
          }
        }
    }

    co(ArchiveFetchClient param0, CacheIoWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        FileCacheStore var9;
        PacketBuffer var11;
        byte[] var12;
        java.math.BigInteger var13;
        byte[] var14;
        byte[] var16;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (null != this.field_b) {
          return true;
        }
        if (null == this.field_c) {
          if (this.field_a.isPriorityQueueFull(2)) {
            return false;
          }
          this.field_c = this.field_a.request(-952050528, 255, (byte) 0, 255, true);
        }
        if (this.field_c.pending) {
          return false;
        }
        var11 = new PacketBuffer(this.field_c.getData((byte) 56));
        var11.position = 5;
        var3 = var11.readUnsignedByte(255);
        var11.position = var11.position + 72 * var3;
        var14 = new byte[var11.data.length - var11.position];
        var12 = var14;
        var4 = var12;
        var11.readBytes(0, var4, 127, var14.length);
        if (null != this.field_i &&
          null != this.field_g) {
          var13 = new java.math.BigInteger(var14);
          var7_ref_java_math_BigInteger = var13.modPow(this.field_i, this.field_g);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var16 = jd.a(var11.data, 5, -14970, var11.position - var14.length - 5);
        for (var7 = 0; 64 > var7; var7++) {
          if (var16[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_b = var11;
        if (param0) {
          var9 = (FileCacheStore) null;
          this.a(34, true, (FileCacheStore) null, -60, (FileCacheStore) null);
        }
        this.field_k = new CachedArchiveSource[var3];
        return true;
    }

    final static void a(int param0, boolean param1) {
        int var2 = (-640 + kp.field_a) / 2;
        int var3 = ScrollPaneWithFooter.field_Yb * ScrollPaneWithFooter.field_Yb;
        int var4 = -(param0 * param0) + var3;
        NinjaBackground.field_w.setBounds(Rasterizer2D.height - 120 - 4 - 90, 90, var2 - var4 * 199 / var3, 199, (byte) 64);
        MultiplayerMatch.field_d.setBounds(-4 + (Rasterizer2D.height - 120), 0, 438 * var4 / var3 + (202 + var2), 438, (byte) 64);
        if (param1) {
          field_e = (String) null;
        }
    }

    public static void b(int param0) {
        field_e = null;
        int var1 = -35 % ((param0 - 34) / 39);
        field_j = null;
        field_d = null;
        field_f = null;
    }

    final CachedArchiveSource a(int param0, boolean param1, FileCacheStore param2, int param3, FileCacheStore param4) {
        CachedArchiveSource stackIn_9_0 = null;
        CachedArchiveSource stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        CachedArchiveSource var10 = null;
        byte[] var14 = null;
        try {
          if (null == this.field_b) {
            throw new RuntimeException();
          }
          if (param3 >= 0 &&
            param3 < this.field_k.length) {
            if (null != this.field_k[param3]) {
              stackIn_9_0 = this.field_k[param3];
              return stackIn_9_0;
            }
            this.field_b.position = param3 * 72 + 6;
            var6_int = -124 / ((param0 + 71) / 38);
            var7 = this.field_b.readInt(255);
            var8 = this.field_b.readInt(255);
            var14 = new byte[64];
            this.field_b.readBytes(0, var14, 122, 64);
            var10 = new CachedArchiveSource(param3, param4, param2, this.field_a, this.field_h, var7, var14, var8, param1);
            this.field_k[param3] = var10;
            stackIn_11_0 = var10;
            return stackIn_11_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("co.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private co(ArchiveFetchClient param0, CacheIoWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_g = param3;
          this.field_i = param2;
          this.field_h = param1;
          this.field_a = param0;
          if (!this.field_a.isPriorityQueueFull(2)) {
            this.field_c = this.field_a.request(-952050528, 255, (byte) 0, 255, true);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "co.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, MusicTrack param1) {
        try {
          IsaacGenerator.a(param1, 0);
          if (param0 >= -74) {
            field_d = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "co.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0) {
        if (param0 != -53) {
          field_j = (AlphaFont) null;
        }
        return MusicVoiceMixer.field_p - LevelPack.field_k;
    }

    static {
        field_e = "Hide lobby chat";
        field_d = "Hide players in <%0>'s game";
    }
}
