/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    private int field_a;
    static String field_h;
    private long[] field_c;
    private long[] field_f;
    private byte[] field_k;
    static int[] field_j;
    private long[] field_l;
    private long[] field_d;
    private long[] field_i;
    static String field_e;
    private byte[] field_g;
    private int field_b;

    public static void a(boolean param0) {
        field_j = null;
        field_e = null;
        field_h = null;
        if (param0) {
          dd.a(false);
        }
    }

    final static byte[] a(CharSequence param0, byte param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Main.field_T;
        try {
          var2_int = param0.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((var5 <= 0 ||
                128 <= var5) && (160 > var5 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          if (param1 > -29) {
            field_e = (String) null;
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("dd.A(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(long param0, byte param1, byte[] param2) {
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
        var13 = Main.field_T;
        try {
          var5_int = 0;
          var6 = 8 - ((int)param0 & 7) & 7;
          var7 = this.field_b & 7;
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & (int)var9) + (this.field_g[var11] & 255));
            this.field_g[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          if (param1 <= 109) {
            this.field_k = (byte[]) null;
          }
          while (param0 > 8L) {
            var8 = param2[var5_int] << var6 & 255 | (255 & param2[var5_int + 1]) >>> 8 - var6;
            if (0 <= var8 &&
              256 > var8) {
              this.field_k[this.field_a] = (byte)fj.a((int) this.field_k[this.field_a], var8 >>> var7);
              this.field_b = this.field_b + (-var7 + 8);
              this.field_a = this.field_a + 1;
              if (512 == this.field_b) {
                this.a(-9);
                this.field_b = 0;
                this.field_a = 0;
              }
              this.field_k[this.field_a] = (byte)bc.a(var8 << 8 - var7, 255);
              var5_int++;
              param0 = param0 - 8L;
              this.field_b = this.field_b + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L >= param0) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = 255 & param2[var5_int] << var6;
            this.field_k[this.field_a] = (byte)fj.a((int) this.field_k[this.field_a], var8Lifetime1 >>> var7);
          }
          if ((long)var7 + param0 < 8L) {
            this.field_b = (int)((long)this.field_b + param0);
          } else {
            this.field_a = this.field_a + 1;
            param0 = param0 - (long)(-var7 + 8);
            this.field_b = this.field_b + (8 - var7);
            if (this.field_b == 512) {
              this.a(-9);
              this.field_b = 0;
              this.field_a = 0;
            }
            this.field_k[this.field_a] = (byte)bc.a(var8Lifetime1 << -var7 + 8, 255);
            this.field_b = this.field_b + (int)param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("dd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1, int param2) {
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
        var8 = Main.field_T;
        try {
          this.field_k[this.field_a] = (byte)fj.a((int) this.field_k[this.field_a], 128 >>> bc.a(this.field_b, 7));
          this.field_a = this.field_a + 1;
          if (this.field_a > 32) {
            while (this.field_a < 64) {
              fieldTemp$0 = this.field_a;
              this.field_a = this.field_a + 1;
              this.field_k[fieldTemp$0] = (byte) 0;
            }
            this.a(-9);
            this.field_a = 0;
          }
          while (this.field_a < 32) {
            fieldTemp$1 = this.field_a;
            this.field_a = this.field_a + 1;
            this.field_k[fieldTemp$1] = (byte) 0;
          }
          if (param0 != 5319) {
            this.field_a = 123;
          }
          og.a(this.field_g, 0, this.field_k, 32, 32);
          this.a(-9);
          var4_int = 0;
          var5 = param2;
          while (var4_int < 8) {
            var6 = this.field_f[var4_int];
            param1[var5] = (byte)(int)(var6 >>> 56);
            param1[var5 + 1] = (byte)(int)(var6 >>> 48);
            param1[2 + var5] = (byte)(int)(var6 >>> 40);
            param1[3 + var5] = (byte)(int)(var6 >>> 32);
            param1[var5 + 4] = (byte)(int)(var6 >>> 24);
            param1[var5 + 5] = (byte)(int)(var6 >>> 16);
            param1[var5 + 6] = (byte)(int)(var6 >>> 8);
            param1[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("dd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Main.field_T;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_g[var2] = (byte) 0;
        }
        this.field_b = 0;
        this.field_k[0] = (byte) 0;
        this.field_a = 0;
        if (param0 <= 20) {
          return;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_f[var2Lifetime1] = 0L;
        }
    }

    private final void a(int param0) {
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
        var6 = Main.field_T;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_d[var2] = ji.a(rl.a(255L, (long)this.field_k[var3 + 7]), ji.a(rl.a((long)this.field_k[6 + var3], 255L) << 8, ji.a(ji.a(rl.a(4278190080L, (long)this.field_k[var3 + 4] << 24), ji.a(ji.a(ji.a((long)this.field_k[var3] << 56, rl.a(71776119061217280L, (long)this.field_k[var3 + 1] << 48)), rl.a(255L, (long)this.field_k[var3 + 2]) << 40), rl.a(255L, (long)this.field_k[3 + var3]) << 32)), rl.a((long)this.field_k[var3 + 5] << 16, 16711680L))));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_f[var2Lifetime1];
          arrayValue$1 = this.field_d[var2Lifetime1];
          this.field_c[var2Lifetime1] = dupTemp$0;
          this.field_i[var2Lifetime1] = ji.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_l[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_l[var3Lifetime1] = ji.a(this.field_l[var3Lifetime1], hj.field_k[var4][bc.a((int)(this.field_c[bc.a(var3Lifetime1 - var4, 7)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_c[var3Lifetime1Lifetime1] = this.field_l[var3Lifetime1Lifetime1];
          }
          this.field_c[0] = ji.a(this.field_c[0], hj.field_o[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_l[var3Lifetime1Lifetime2] = this.field_c[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_l[var3Lifetime1Lifetime2] = ji.a(this.field_l[var3Lifetime1Lifetime2], hj.field_k[var7][bc.a((int)(this.field_i[bc.a(7, var3Lifetime1Lifetime2 - var7)] >>> var5Lifetime1), 255)]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_i[var3Lifetime1Lifetime3] = this.field_l[var3Lifetime1Lifetime3];
          }
        }
        if (param0 != -9) {
          this.a(-54);
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_f[var2Lifetime3] = ji.a(this.field_f[var2Lifetime3], ji.a(this.field_i[var2Lifetime3], this.field_d[var2Lifetime3]));
        }
    }

    dd() {
        this.field_f = new long[8];
        this.field_a = 0;
        this.field_k = new byte[64];
        this.field_d = new long[8];
        this.field_i = new long[8];
        this.field_c = new long[8];
        this.field_g = new byte[32];
        this.field_b = 0;
        this.field_l = new long[8];
    }

    static {
        field_h = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_e = "Login/Create Account";
    }
}
