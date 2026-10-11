/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class td {
    private byte[] field_b;
    static String field_q;
    private int field_a;
    static int[] field_m;
    private long[] field_p;
    private int field_g;
    private long[] field_k;
    private long[] field_l;
    static int field_e;
    static String[] field_c;
    static String field_i;
    static int[][] field_j;
    static ka field_o;
    private byte[] field_d;
    private long[] field_h;
    static int field_n;
    private long[] field_f;

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          this.field_b[this.field_a] = (byte)p.a((int) this.field_b[this.field_a], 128 >>> jh.a(this.field_g, 7));
          this.field_a = this.field_a + 1;
          if (this.field_a > 32) {
            while (this.field_a < 64) {
              fieldTemp$0 = this.field_a;
              this.field_a = this.field_a + 1;
              this.field_b[fieldTemp$0] = (byte) 0;
            }
            this.b(-109);
            this.field_a = 0;
          }
          if (param1 != -6) {
            return;
          }
          while (32 > this.field_a) {
            fieldTemp$1 = this.field_a;
            this.field_a = this.field_a + 1;
            this.field_b[fieldTemp$1] = (byte) 0;
          }
          he.a(this.field_d, 0, this.field_b, 32, 32);
          this.b(-106);
          var4_int = 0;
          var5 = param2;
          while (var4_int < 8) {
            var6 = this.field_l[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[var5 + 2] = (byte)(int)(var6 >>> 40);
            param0[3 + var5] = (byte)(int)(var6 >>> 32);
            param0[var5 + 4] = (byte)(int)(var6 >>> 24);
            param0[5 + var5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[7 + var5] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("td.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_i = null;
        field_c = null;
        field_m = null;
        if (param0 != 0) {
          td.b((byte) 9);
        }
        field_j = (int[][]) null;
        field_o = null;
    }

    final static void b(byte param0) {
        ka var1 = null;
        ka var2 = null;
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        try {
          var1 = new ka(540, 140);
          ad.a(-32, var1);
          oc.c();
          qg.b();
          jc.field_c = 0;
          ef.a(3);
          var2 = var1.c();
          for (var3 = 0; 15 > var3; var3++) {
            var2.a(-2, -2, 16777215);
            qg.d(4, 4, 0, 0, 540, 140);
          }
          ul.field_k.d();
          var1.f(0, 0);
          if (param0 < 105) {
            field_q = (String) null;
          }
          ie.b((byte) -9);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "td.A(" + param0 + ')');
        }
    }

    final void a(long param0, int param1, byte[] param2) {
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
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 7 & 8 - ((int)param0 & 7);
          var7 = this.field_g & 7;
          if (param1 != 19668) {
            return;
          }
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((255 & this.field_d[var11]) + (255 & (int)var9));
            this.field_d[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param0 > 8L) {
            var8 = param2[var5_int] << var6 & 255 | (param2[var5_int + 1] & 255) >>> 8 - var6;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_b[this.field_a] = (byte)p.a((int) this.field_b[this.field_a], var8 >>> var7);
              this.field_g = this.field_g + (-var7 + 8);
              this.field_a = this.field_a + 1;
              if (this.field_g == 512) {
                this.b(-124);
                this.field_g = 0;
                this.field_a = 0;
              }
              this.field_b[this.field_a] = (byte)jh.a(255, var8 << -var7 + 8);
              param0 = param0 - 8L;
              var5_int++;
              this.field_g = this.field_g + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param0 > 0L) {
            stackIn_17_0 = 255;
            stackIn_17_1 = param2[var5_int] << var6;
            var8Lifetime1 = stackIn_17_0 & stackIn_17_1;
            this.field_b[this.field_a] = (byte)p.a((int) this.field_b[this.field_a], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (param0 + (long)var7 >= 8L) {
            this.field_g = this.field_g + (-var7 + 8);
            param0 = param0 - (long)(8 - var7);
            this.field_a = this.field_a + 1;
            if (512 == this.field_g) {
              this.b(-127);
              this.field_g = 0;
              this.field_a = 0;
            }
            this.field_b[this.field_a] = (byte)jh.a(var8Lifetime1 << -var7 + 8, 255);
            this.field_g = this.field_g + (int)param0;
          } else {
            this.field_g = (int)((long)this.field_g + param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("td.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
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
        var6 = TorChallenge.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_k[var2] = d.a(ba.a((long)this.field_b[var3 + 7], 255L), d.a(d.a(ba.a((long)this.field_b[var3 + 5] << 16, 16711680L), d.a(ba.a((long)this.field_b[var3 + 4] << 24, 4278190080L), d.a(ba.a(1095216660480L, (long)this.field_b[var3 + 3] << 32), d.a(d.a(ba.a(255L, (long)this.field_b[1 + var3]) << 48, (long)this.field_b[var3] << 56), ba.a(255L, (long)this.field_b[var3 + 2]) << 40)))), ba.a(65280L, (long)this.field_b[var3 + 6] << 8)));
          var3 += 8;
          var2++;
        }
        if (param0 >= -103) {
          return;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_l[var2Lifetime1];
          arrayValue$1 = this.field_k[var2Lifetime1];
          this.field_h[var2Lifetime1] = dupTemp$0;
          this.field_p[var2Lifetime1] = d.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; 10 >= var2Lifetime2; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_f[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_f[var3Lifetime1] = d.a(this.field_f[var3Lifetime1], oh.field_b[var4][jh.a(255, (int)(this.field_h[jh.a(7, var3Lifetime1 - var4)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_h[var3Lifetime1Lifetime1] = this.field_f[var3Lifetime1Lifetime1];
          }
          this.field_h[0] = d.a(this.field_h[0], oh.field_f[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_f[var3Lifetime1Lifetime2] = this.field_h[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_f[var3Lifetime1Lifetime2] = d.a(this.field_f[var3Lifetime1Lifetime2], oh.field_b[var7][jh.a(255, (int)(this.field_p[jh.a(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1))]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.field_p[var3Lifetime1Lifetime3] = this.field_f[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_l[var2Lifetime3] = d.a(this.field_l[var2Lifetime3], d.a(this.field_k[var2Lifetime3], this.field_p[var2Lifetime3]));
        }
    }

    final static void a(String param0, Throwable param1, byte param2) {
        try {
          uj stackIn_16_0;
          java.net.URL stackIn_16_1;
          java.net.URL stackIn_16_2;
          java.net.URL stackIn_16_3;
          StringBuilder stackIn_16_4;
          java.net.URL stackIn_17_1;
          java.net.URL stackIn_17_2;
          String stackIn_17_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          mi var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          var6 = TorChallenge.field_F ? 1 : 0;
          try {
            var3 = "";
            if (param1 != null) {
              var3 = fk.a(param1, -1);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            cf.a(1, var3);
            var3 = kl.a(var3, "%3a", 0, ":");
            var3 = kl.a(var3, "%40", 0, "@");
            var3 = kl.a(var3, "%26", 0, "&");
            var7 = kl.a(var3, "%23", 0, "#");
            if (null == li.field_O) {
              return;
            }
            if (param2 >= -48) {
              td.c(-88);
            }
            stackIn_16_0 = u.field_a;
            stackIn_16_1 = null;
            stackIn_16_2 = null;
            stackIn_16_3 = li.field_O.getCodeBase();
            stackIn_16_4 = new StringBuilder().append("clienterror.ws?c=").append(ae.field_k).append("&u=");
            if (ch.field_d == null) {
              stackIn_17_1 = null;
              stackIn_17_2 = null;
              stackIn_17_5 = "" + je.field_a;
            } else {
              stackIn_17_1 = null;
              stackIn_17_2 = null;
              stackIn_17_5 = ch.field_d;
            }
            var4 = ((uj) (Object) stackIn_16_0).a(new java.net.URL(stackIn_16_3, ((StringBuilder) (Object) stackIn_16_4).append(stackIn_17_5).append("&v1=").append(uj.field_j).append("&v2=").append(uj.field_n).append("&e=").append(var7).toString()), -123);
            while (var4.field_d == 0) {
              c.a(51, 1L);
            }
            if (var4.field_d == 1) {
              var5 = (DataInputStream) (var4.field_g);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(long param0, byte param1) {
        cf.field_e.setTime(new Date(param0));
        int var3 = cf.field_e.get(7);
        int var4 = cf.field_e.get(5);
        int var5 = cf.field_e.get(2);
        int var6 = cf.field_e.get(1);
        int var7 = cf.field_e.get(11);
        if (param1 != -8) {
          field_n = -84;
        }
        int var8 = cf.field_e.get(12);
        int var9 = cf.field_e.get(13);
        return il.field_s[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + ui.field_h[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = TorChallenge.field_F ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_d[var2] = (byte) 0;
        }
        this.field_b[0] = (byte)param0;
        this.field_g = 0;
        this.field_a = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_l[var2Lifetime1] = 0L;
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 20422) {
          field_i = (String) null;
        }
        stackIn_6_0 = (qf.field_a != null) && (aj.field_c.b(668905488));
        return stackIn_6_0;
    }

    td() {
        this.field_a = 0;
        this.field_b = new byte[64];
        this.field_p = new long[8];
        this.field_l = new long[8];
        this.field_k = new long[8];
        this.field_g = 0;
        this.field_d = new byte[32];
        this.field_h = new long[8];
        this.field_f = new long[8];
    }

    static {
        field_e = 0;
        field_j = new int[][]{new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}};
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
