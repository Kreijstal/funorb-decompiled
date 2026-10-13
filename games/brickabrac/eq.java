/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    static String field_b;
    private int field_c;
    private byte[] field_h;
    private long[] field_k;
    private long[] field_l;
    private long[] field_e;
    private long[] field_f;
    private byte[] field_d;
    private int field_j;
    private long[] field_a;
    static String field_i;
    static BufferedSocket gameTransport;
    static SecondaryHashTable field_m;

    final static void a(int param0) {
        cr.f((byte) -45);
        if (param0 != 7) {
          gameTransport = (BufferedSocket) null;
        }
        SecondaryNodeQueue.d(125);
        CircleBody.field_p = null;
        rd.a(param0 - 8);
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; 32 > var2; var2++) {
          this.field_d[var2] = (byte) 0;
        }
        if (param0 != 99) {
          this.a((byte[]) null, -112, 22L);
        }
        this.field_j = 0;
        this.field_h[0] = (byte) 0;
        this.field_c = 0;
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          this.field_a[var2Lifetime1] = 0L;
        }
    }

    final static String c(byte param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 >= -58) {
          eq.c((byte) -29);
        }
        var6 = "(" + r.thirdPreviousPacketOpcode + " " + we.secondPreviousPacketOpcode + " " + mh.previousPacketOpcode + ") " + IntrusiveHashTable.currentPacketOpcode;
        var1 = var6;
        if (ga.incomingPacketLength > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < ga.incomingPacketLength; var2++) {
            var7 = var1 + ' ';
            var3 = 255 & jl.incomingPackets.data[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            if (10 > var3) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    private final void a(byte param0) {
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
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        if (param0 <= 19) {
          this.field_l = (long[]) null;
        }
        while (var2 < 8) {
          this.field_e[var2] = qf.a(qf.a(qf.a(qf.a(qf.a(ch.a(255L, (long)this.field_h[var3 + 3]) << 32, qf.a(ch.a((long)this.field_h[2 + var3], 255L) << 40, qf.a(ch.a((long)this.field_h[1 + var3], 255L) << 48, (long)this.field_h[var3] << 56))), ch.a((long)this.field_h[var3 + 4], 255L) << 24), ch.a((long)this.field_h[var3 + 5], 255L) << 16), ch.a(65280L, (long)this.field_h[6 + var3] << 8)), ch.a((long)this.field_h[var3 + 7], 255L));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_a[var2Lifetime1];
          arrayValue$1 = this.field_e[var2Lifetime1];
          this.field_f[var2Lifetime1] = dupTemp$0;
          this.field_k[var2Lifetime1] = qf.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_l[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_l[var3Lifetime1] = qf.a(this.field_l[var3Lifetime1], oa.field_Wb[var4][ik.a((int)(this.field_f[ik.a(var3Lifetime1 - var4, 7)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_f[var3Lifetime1Lifetime1] = this.field_l[var3Lifetime1Lifetime1];
          }
          this.field_f[0] = qf.a(this.field_f[0], oa.field_Xb[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_l[var3Lifetime1Lifetime2] = this.field_f[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_l[var3Lifetime1Lifetime2] = qf.a(this.field_l[var3Lifetime1Lifetime2], oa.field_Wb[var7][ik.a(255, (int)(this.field_k[ik.a(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1))]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_k[var3Lifetime1Lifetime3] = this.field_l[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_a[var2Lifetime3] = qf.a(this.field_a[var2Lifetime3], qf.a(this.field_k[var2Lifetime3], this.field_e[var2Lifetime3]));
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          this.field_h[this.field_c] = (byte)LevelSelectScreen.d((int) this.field_h[this.field_c], 128 >>> ik.a(7, this.field_j));
          var4_int = -48 % ((-28 - param1) / 38);
          this.field_c = this.field_c + 1;
          if (this.field_c > 32) {
            while (this.field_c < 64) {
              fieldTemp$0 = this.field_c;
              this.field_c = this.field_c + 1;
              this.field_h[fieldTemp$0] = (byte) 0;
            }
            this.a((byte) 109);
            this.field_c = 0;
          }
          while (this.field_c < 32) {
            fieldTemp$1 = this.field_c;
            this.field_c = this.field_c + 1;
            this.field_h[fieldTemp$1] = (byte) 0;
          }
          pm.a(this.field_d, 0, this.field_h, 32, 32);
          this.a((byte) 47);
          var5 = 0;
          var6 = param2;
          while (var5 < 8) {
            var7 = this.field_a[var5];
            param0[var6] = (byte)(int)(var7 >>> 56);
            param0[var6 + 1] = (byte)(int)(var7 >>> 48);
            param0[2 + var6] = (byte)(int)(var7 >>> 40);
            param0[3 + var6] = (byte)(int)(var7 >>> 32);
            param0[var6 + 4] = (byte)(int)(var7 >>> 24);
            param0[5 + var6] = (byte)(int)(var7 >>> 16);
            param0[var6 + 6] = (byte)(int)(var7 >>> 8);
            param0[7 + var6] = (byte)(int)var7;
            var5++;
            var6 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("eq.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1, long param2) {
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
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 8 - ((int)param2 & 7) & 7;
          var7 = this.field_j & 7;
          if (param1 != 540) {
            this.a((byte) -98);
          }
          var9 = param2;
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((255 & (int)var9) + (255 & this.field_d[var11]));
            this.field_d[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (8L < param2) {
            var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
            if (var8 >= 0 &&
              256 > var8) {
              this.field_h[this.field_c] = (byte)LevelSelectScreen.d((int) this.field_h[this.field_c], var8 >>> var7);
              this.field_c = this.field_c + 1;
              this.field_j = this.field_j + (-var7 + 8);
              if (this.field_j == 512) {
                this.a((byte) 38);
                this.field_j = 0;
                this.field_c = 0;
              }
              this.field_h[this.field_c] = (byte)ik.a(255, var8 << 8 - var7);
              this.field_j = this.field_j + var7;
              var5_int++;
              param2 = param2 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = 255 & param0[var5_int] << var6;
            this.field_h[this.field_c] = (byte)LevelSelectScreen.d((int) this.field_h[this.field_c], var8Lifetime1 >>> var7);
          }
          if ((long)var7 + param2 >= 8L) {
            param2 = param2 - (long)(8 - var7);
            this.field_c = this.field_c + 1;
            this.field_j = this.field_j + (8 - var7);
            if (this.field_j == 512) {
              this.a((byte) 41);
              this.field_j = 0;
              this.field_c = 0;
            }
            this.field_h[this.field_c] = (byte)ik.a(255, var8Lifetime1 << 8 - var7);
            this.field_j = this.field_j + (int)param2;
          } else {
            this.field_j = (int)((long)this.field_j + param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("eq.D(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_b = null;
        gameTransport = null;
        field_i = null;
        if (param0 != -1) {
          field_m = (SecondaryHashTable) null;
        }
    }

    eq() {
        this.field_e = new long[8];
        this.field_h = new byte[64];
        this.field_d = new byte[32];
        this.field_f = new long[8];
        this.field_l = new long[8];
        this.field_k = new long[8];
        this.field_c = 0;
        this.field_j = 0;
        this.field_a = new long[8];
    }

    static {
        field_b = "The game options are not all set.";
        field_i = "This password contains repeated characters, and would be easy to guess";
    }
}
