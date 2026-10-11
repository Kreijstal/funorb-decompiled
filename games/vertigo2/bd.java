/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    private int field_m;
    private long[] field_c;
    private long[] field_h;
    private int field_i;
    private long[] field_k;
    private byte[] field_j;
    private byte[] field_a;
    private long[] field_l;
    static char[] field_d;
    private long[] field_b;
    static ve field_e;
    static String field_g;
    static int field_f;

    final void a(byte[] param0, int param1, int param2) {
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
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          this.field_a[this.field_m] = (byte)om.a((int) this.field_a[this.field_m], 128 >>> b.a(this.field_i, 7));
          this.field_m = this.field_m + 1;
          if (this.field_m > 32) {
            while (this.field_m < 64) {
              fieldTemp$0 = this.field_m;
              this.field_m = this.field_m + 1;
              this.field_a[fieldTemp$0] = (byte) 0;
            }
            this.b(120);
            this.field_m = 0;
          }
          while (32 > this.field_m) {
            fieldTemp$1 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_a[fieldTemp$1] = (byte) 0;
          }
          qq.a(this.field_j, 0, this.field_a, 32, 32);
          this.b(120);
          var4_int = 0;
          var5 = param2;
          while (var4_int < 8) {
            var6 = this.field_l[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[var5 + 1] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[var5 + 5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[var5 + 7] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          if (param1 <= 83) {
            this.a((byte[]) null, 114L, 12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("bd.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; 32 > var2; var2++) {
          this.field_j[var2] = (byte) 0;
        }
        this.field_a[0] = (byte) 0;
        this.field_m = 0;
        this.field_i = 0;
        var2Lifetime1 = 0;
        if (param0 != 8) {
          field_d = (char[]) null;
        }
        while (var2Lifetime1 < 8) {
          this.field_l[var2Lifetime1] = 0L;
          var2Lifetime1++;
        }
    }

    public static void c(int param0) {
        if (param0 != 4) {
          field_d = (char[]) null;
        }
        field_e = null;
        field_d = null;
        field_g = null;
    }

    final void a(byte[] param0, long param1, int param2) {
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
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 7 & 8 - (7 & (int)param1);
          var7 = 7 & this.field_i;
          var9 = param1;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + (((int)var9 & 255) + (255 & this.field_j[var11]));
            this.field_j[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param1 > 8L) {
            var8 = 255 & param0[var5_int] << var6 | (param0[1 + var5_int] & 255) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_a[this.field_m] = (byte)om.a((int) this.field_a[this.field_m], var8 >>> var7);
              this.field_i = this.field_i + (8 - var7);
              this.field_m = this.field_m + 1;
              if (this.field_i == 512) {
                this.b(120);
                this.field_i = 0;
                this.field_m = 0;
              }
              this.field_a[this.field_m] = (byte)b.a(255, var8 << 8 - var7);
              param1 = param1 - 8L;
              this.field_i = this.field_i + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param1 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = param0[var5_int] << var6 & 255;
            this.field_a[this.field_m] = (byte)om.a((int) this.field_a[this.field_m], var8Lifetime1 >>> var7);
          }
          if (param2 <= 93) {
            field_f = 119;
          }
          if (param1 + (long)var7 < 8L) {
            this.field_i = (int)((long)this.field_i + param1);
          } else {
            this.field_m = this.field_m + 1;
            this.field_i = this.field_i + (-var7 + 8);
            param1 = param1 - (long)(8 - var7);
            if (this.field_i == 512) {
              this.b(120);
              this.field_i = 0;
              this.field_m = 0;
            }
            this.field_a[this.field_m] = (byte)b.a(255, var8Lifetime1 << -var7 + 8);
            this.field_i = this.field_i + (int)param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("bd.E(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
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
        var6 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_c[var2] = og.a(j.a((long)this.field_a[var3 + 7], 255L), og.a(og.a(j.a((long)this.field_a[5 + var3], 255L) << 16, og.a(j.a(4278190080L, (long)this.field_a[4 + var3] << 24), og.a(j.a((long)this.field_a[var3 + 3] << 32, 1095216660480L), og.a(og.a(j.a(71776119061217280L, (long)this.field_a[1 + var3] << 48), (long)this.field_a[var3] << 56), j.a((long)this.field_a[var3 + 2], 255L) << 40)))), j.a(255L, (long)this.field_a[var3 + 6]) << 8));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_l[var2Lifetime1];
          arrayValue$1 = this.field_c[var2Lifetime1];
          this.field_h[var2Lifetime1] = dupTemp$0;
          this.field_k[var2Lifetime1] = og.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_b[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_b[var3Lifetime1] = og.a(this.field_b[var3Lifetime1], ro.field_h[var4][b.a(255, (int)(this.field_h[b.a(7, -var4 + var3Lifetime1)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_h[var3Lifetime1Lifetime1] = this.field_b[var3Lifetime1Lifetime1];
          }
          this.field_h[0] = og.a(this.field_h[0], ro.field_d[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_b[var3Lifetime1Lifetime2] = this.field_h[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_b[var3Lifetime1Lifetime2] = og.a(this.field_b[var3Lifetime1Lifetime2], ro.field_h[var7][b.a(255, (int)(this.field_k[b.a(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1))]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_k[var3Lifetime1Lifetime3] = this.field_b[var3Lifetime1Lifetime3];
          }
        }
        if (param0 != 120) {
          this.b(66);
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_l[var2Lifetime3] = og.a(this.field_l[var2Lifetime3], og.a(this.field_c[var2Lifetime3], this.field_k[var2Lifetime3]));
        }
    }

    bd() {
        this.field_m = 0;
        this.field_c = new long[8];
        this.field_k = new long[8];
        this.field_i = 0;
        this.field_a = new byte[64];
        this.field_j = new byte[32];
        this.field_b = new long[8];
        this.field_h = new long[8];
        this.field_l = new long[8];
    }

    static {
        field_d = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_g = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_e = new ve(9, 0, 4, 1);
        field_f = 0;
    }
}
