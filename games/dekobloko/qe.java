/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static String field_b;
    private long[] field_f;
    static String field_h;
    private byte[] field_d;
    static String field_c;
    private byte[] field_l;
    static int[] field_k;
    private long[] field_a;
    private int field_o;
    private long[] field_g;
    private long[] field_n;
    static String field_j;
    private long[] field_i;
    static String field_e;
    private int field_m;

    final void b(byte param0) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_l[var2] = (byte) 0;
        }
        this.field_o = 0;
        this.field_m = 0;
        this.field_d[0] = (byte) 0;
        var2Lifetime1 = 0;
        if (param0 >= -32) {
          return;
        }
        while (var2Lifetime1 < 8) {
          this.field_g[var2Lifetime1] = 0L;
          var2Lifetime1++;
        }
    }

    private final void b(int param0) {
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
        var6 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_f[var2] = pj.a(pj.a(jg.a((long)this.field_d[var3 + 6], 255L) << 8, pj.a(jg.a((long)this.field_d[var3 + 5] << 16, 16711680L), pj.a(jg.a(4278190080L, (long)this.field_d[var3 + 4] << 24), pj.a(jg.a((long)this.field_d[3 + var3] << 32, 1095216660480L), pj.a(pj.a((long)this.field_d[var3] << 56, jg.a((long)this.field_d[var3 + 1] << 48, 71776119061217280L)), jg.a(280375465082880L, (long)this.field_d[2 + var3] << 40)))))), jg.a(255L, (long)this.field_d[7 + var3]));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_g[var2Lifetime1];
          arrayValue$1 = this.field_f[var2Lifetime1];
          this.field_a[var2Lifetime1] = dupTemp$0;
          this.field_n[var2Lifetime1] = pj.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_i[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_i[var3Lifetime1] = pj.a(this.field_i[var3Lifetime1], uk.field_s[var4][lb.a((int)(this.field_a[lb.a(7, -var4 + var3Lifetime1)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_a[var3Lifetime1Lifetime1] = this.field_i[var3Lifetime1Lifetime1];
          }
          this.field_a[0] = pj.a(this.field_a[0], uk.field_x[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_i[var3Lifetime1Lifetime2] = this.field_a[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_i[var3Lifetime1Lifetime2] = pj.a(this.field_i[var3Lifetime1Lifetime2], uk.field_s[var7][lb.a((int)(this.field_n[lb.a(7, var3Lifetime1Lifetime2 - var7)] >>> var5Lifetime1), 255)]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_n[var3Lifetime1Lifetime3] = this.field_i[var3Lifetime1Lifetime3];
          }
        }
        if (param0 > -24) {
          this.field_l = (byte[]) null;
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_g[var2Lifetime3] = pj.a(this.field_g[var2Lifetime3], pj.a(this.field_f[var2Lifetime3], this.field_n[var2Lifetime3]));
        }
    }

    final void a(int param0, byte[] param1, long param2) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
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
        var13 = client.field_A ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 7 & 8 - ((int)param2 & 7);
          if (param0 != 255) {
            qe.a((byte) 13);
          }
          var7 = 7 & this.field_o;
          var9 = param2;
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((this.field_l[var11] & 255) + (255 & (int)var9));
            this.field_l[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param2 > 8L) {
            var8 = 255 & param1[var5_int] << var6 | (param1[1 + var5_int] & 255) >>> 8 - var6;
            if (0 <= var8 &&
              var8 < 256) {
              this.field_d[this.field_m] = (byte)de.b((int) this.field_d[this.field_m], var8 >>> var7);
              this.field_o = this.field_o + (-var7 + 8);
              this.field_m = this.field_m + 1;
              if (this.field_o == 512) {
                this.b(-63);
                this.field_o = 0;
                this.field_m = 0;
              }
              this.field_d[this.field_m] = (byte)lb.a(255, var8 << 8 - var7);
              param2 = param2 - 8L;
              var5_int++;
              this.field_o = this.field_o + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 > 0L) {
            stackIn_17_0 = param1[var5_int] << var6;
            stackIn_17_1 = 255;
            var8Lifetime1 = stackIn_17_0 & stackIn_17_1;
            this.field_d[this.field_m] = (byte)de.b((int) this.field_d[this.field_m], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (param2 + (long)var7 >= 8L) {
            this.field_o = this.field_o + (-var7 + 8);
            this.field_m = this.field_m + 1;
            param2 = param2 - (long)(8 - var7);
            if (this.field_o == 512) {
              this.b(-26);
              this.field_m = 0;
              this.field_o = 0;
            }
            this.field_d[this.field_m] = (byte)lb.a(255, var8Lifetime1 << 8 - var7);
            this.field_o = this.field_o + (int)param2;
          } else {
            this.field_o = (int)((long)this.field_o + param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("qe.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            field_k = (int[]) null;
          }
          stackIn_5_0 = (null != ed.a(param0, (byte) -108));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("qe.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          this.field_d[this.field_m] = (byte)de.b((int) this.field_d[this.field_m], 128 >>> lb.a(this.field_o, 7));
          this.field_m = this.field_m + 1;
          if (this.field_m > 32) {
            while (this.field_m < 64) {
              fieldTemp$0 = this.field_m;
              this.field_m = this.field_m + 1;
              this.field_d[fieldTemp$0] = (byte) 0;
            }
            this.b(-115);
            this.field_m = 0;
          }
          while (32 > this.field_m) {
            fieldTemp$1 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_d[fieldTemp$1] = (byte) 0;
          }
          an.a(this.field_l, 0, this.field_d, 32, 32);
          this.b(-76);
          var4_int = 0;
          var5 = param1;
          while (var4_int < 8) {
            var6 = this.field_g[var4_int];
            param2[var5] = (byte)(int)(var6 >>> 56);
            param2[var5 + 1] = (byte)(int)(var6 >>> 48);
            param2[2 + var5] = (byte)(int)(var6 >>> 40);
            param2[3 + var5] = (byte)(int)(var6 >>> 32);
            param2[var5 + 4] = (byte)(int)(var6 >>> 24);
            param2[5 + var5] = (byte)(int)(var6 >>> 16);
            param2[6 + var5] = (byte)(int)(var6 >>> 8);
            param2[7 + var5] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          if (param0 != 64767752) {
            this.field_m = -86;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("qe.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static String a(byte param0) {
        String var1 = "";
        if (param0 < 85) {
          return (String) null;
        }
        if (dm.field_c != null) {
          var1 = dm.field_c.j(80);
        }
        if (var1.length() == 0) {
          var1 = db.b((byte) 122);
        }
        if (var1.length() == 0) {
          var1 = wh.field_e;
        }
        return var1;
    }

    final static ck[] a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        ck var13 = null;
        ck var14 = null;
        if (param5 != -26198) {
          field_j = (String) null;
        }
        int[] var16 = hk.field_l;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = hk.field_j;
        int var8 = hk.field_i;
        ck var9 = new ck(16, param1);
        var9.a();
        hk.d(0, 0, 16, param1, param3, param4);
        Object var10 = null;
        if (param2) {
          var13 = var9.c();
          var10 = var13;
          var13.a();
          hk.a(0, 0, 5, 0);
          hk.a(0, 1, 3, 0);
          hk.a(0, 2, 2, 0);
          hk.a(0, 3, 1, 0);
          hk.a(0, 4, 1, 0);
        }
        Object var11 = null;
        if (param0) {
          var14 = var9.c();
          var11 = var14;
          var14.a();
          hk.a(11, 0, 5, 0);
          hk.a(13, 1, 3, 0);
          hk.a(14, 2, 2, 0);
          hk.a(15, 3, 1, 0);
          hk.a(15, 4, 1, 0);
        }
        hk.a(var16, var7, var8);
        return new ck[]{null, null, null, (ck) (var10), var9, (ck) (var11), null, null, null};
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        field_k = null;
        field_b = null;
        field_j = null;
        if (param0 != -20007) {
          field_c = (String) null;
        }
    }

    final static void a(long param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          if (param1 >= -100) {
            return;
          }
          try {
            Thread.sleep(param0);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    qe() {
        this.field_d = new byte[64];
        this.field_f = new long[8];
        this.field_o = 0;
        this.field_g = new long[8];
        this.field_l = new byte[32];
        this.field_i = new long[8];
        this.field_n = new long[8];
        this.field_m = 0;
        this.field_a = new long[8];
    }

    static {
        field_k = new int[8];
        field_h = "Unable to add name - system busy";
        field_j = "To activate a special item, pop a shape next to it.";
        field_b = "Asking to join <%0>'s game...";
        field_e = "Age:";
        field_c = "Play rated game";
    }
}
