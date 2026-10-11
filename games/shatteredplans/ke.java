/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ke implements Runnable {
    private int field_a;
    private pb field_p;
    private qb field_m;
    static int[] field_q;
    private java.net.Socket field_o;
    private int field_g;
    private boolean field_d;
    static long[][] field_l;
    private int field_b;
    private byte[] field_e;
    static boolean field_j;
    private boolean field_c;
    static long[] field_k;
    private OutputStream field_n;
    static bi field_i;
    private InputStream field_f;
    static String field_h;

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_c) {
            return;
          }
          if (this.field_d) {
            this.field_d = false;
            throw new IOException();
          }
          if (this.field_e == null) {
            this.field_e = new byte[this.field_g];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; var6 < param0; var6++) {
              this.field_e[this.field_b] = param2[param1 + var6];
              this.field_b = (this.field_b + 1) % this.field_g;
              if (this.field_b == (-100 + this.field_g + this.field_a) % this.field_g) {
                throw new IOException();
              }
            }
            if (null == this.field_p) {
              this.field_p = this.field_m.a(true, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          if (param3 != -13976) {
            this.field_f = (InputStream) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("ke.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0) {
        try {
          int var4 = 0;
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          if (this.field_c) {
            return;
          }
          synchronized (this) {
            this.field_c = true;
            this.notifyAll();
          }
          if (this.field_p != null) {
            while (this.field_p.field_d == 0) {
              jb.a((byte) -111, 1L);
            }
            if (this.field_p.field_d == 1) {
              try {
                ((Thread) (this.field_p.field_e)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_p = null;
          if (param0 < 83) {
            ke.a(52, 12, -47, -94, 64);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_l = (long[][]) null;
        field_h = null;
        field_k = null;
        if (param0 > -124) {
          field_k = (long[]) null;
        }
        field_q = null;
        field_i = null;
    }

    final int a(byte param0) throws IOException {
        if (this.field_c) {
          return 0;
        }
        if (param0 <= 120) {
          this.field_a = -122;
        }
        return this.field_f.read();
    }

    final void a(boolean param0) throws IOException {
        if (this.field_c) {
          return;
        }
        if (param0) {
          this.finalize();
        }
        if (this.field_d) {
          this.field_d = false;
          throw new IOException();
        }
    }

    protected final void finalize() {
        this.b(104);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        wh.a(false);
        if (param0 != -6187) {
          ke.b((byte) 13);
        }
        gf.i(param4, param3, param1, param2);
    }

    final int a(int param0) throws IOException {
        if (this.field_c) {
          return 0;
        }
        if (param0 != -1) {
          field_h = (String) null;
        }
        return this.field_f.available();
    }

    public final void run() {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          Exception var1_ref = null;
          int var2 = 0;
          Object var3 = null;
          IOException var3_ref = null;
          InterruptedException var4 = null;
          int var6 = 0;
          String var7 = null;
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_b == this.field_a) {
                  if (this.field_c) {
                    decompiledRegionSelector0 = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4 = (InterruptedException) (Object) decompiledCaughtException;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (this.field_a > this.field_b) {
                    var1_int = -this.field_a + this.field_g;
                  } else {
                    var1_int = this.field_b - this.field_a;
                  }
                  var2 = this.field_a;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_f != null) {
                    this.field_f.close();
                  }
                  if (null != this.field_n) {
                    this.field_n.close();
                  }
                  if (null != this.field_o) {
                    this.field_o.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_e = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_n.write(this.field_e, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_d = true;
              }
              this.field_a = (var1_int + this.field_a) % this.field_g;
              try {
                if (this.field_b == this.field_a) {
                  this.field_n.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_d = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            jq.a(-29901, (Throwable) ((Object) var1_ref), (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = 26 / ((param3 - 64) / 40);
          if (this.field_c) {
            return;
          }
          while (0 < param1) {
            var6 = this.field_f.read(param0, param2, param1);
            if (var6 <= 0) {
              throw new EOFException();
            }
            param2 = param2 + var6;
            param1 = param1 - var6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ke.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ke(java.net.Socket param0, qb param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void a(int param0, si param1) {
        try {
          param1.field_s = new char[]{(char)63};
          if (param0 >= -39) {
            field_h = (String) null;
          }
          param1.field_x = new int[]{-1};
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ke.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ke(java.net.Socket param0, qb param1, int param2) throws IOException {
        this.field_a = 0;
        this.field_b = 0;
        this.field_d = false;
        this.field_c = false;
        try {
          this.field_m = param1;
          this.field_o = param0;
          this.field_o.setSoTimeout(30000);
          this.field_o.setTcpNoDelay(true);
          this.field_f = this.field_o.getInputStream();
          this.field_n = this.field_o.getOutputStream();
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ke.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        int var14 = 0;
        long stackIn_5_0 = 0L;
        int var0;
        int var1;
        long var2;
        long var4;
        long var6;
        long var8;
        long var10;
        long var12;
        field_l = new long[8][256];
        field_q = new int[5];
        field_k = new long[11];
        var0 = 0;
        L0: while (256 > var0) {
          var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
          if ((var0 & 1) == 0) {
            stackIn_5_0 = (long)(var1 >>> 8);
          } else {
            stackIn_5_0 = (long)(255 & var1);
          }
          var2 = stackIn_5_0;
          var4 = var2 << 1;
          if (var4 >= 256L) {
            var4 = var4 ^ 285L;
          }
          var6 = var4 << 1;
          if (256L <= var6) {
            var6 = var6 ^ 285L;
          }
          var8 = var2 ^ var6;
          var10 = var6 << 1;
          if (var10 >= 256L) {
            var10 = var10 ^ 285L;
          }
          var12 = var10 ^ var2;
          field_l[0][var0] = ff.a(var12, ff.a(ff.a(var8 << 16, ff.a(var10 << 24, ff.a(var2 << 32, ff.a(ff.a(var2 << 56, var2 << 48), var6 << 40)))), var4 << 8));
          for (var14 = 1; var14 < 8; var14++) {
            field_l[var14][var0] = ff.a(field_l[-1 + var14][var0] >>> 8, field_l[-1 + var14][var0] << 56);
          }
          var0++;
        }
        field_k[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
          var1 = (var0 - 1) * 8;
          field_k[var0] = bg.a(bg.a(co.a(65280L, field_l[6][var1 + 6]), bg.a(bg.a(co.a(4278190080L, field_l[4][var1 + 4]), bg.a(co.a(1095216660480L, field_l[3][var1 + 3]), bg.a(co.a(field_l[2][2 + var1], 280375465082880L), bg.a(co.a(field_l[1][var1 + 1], 71776119061217280L), co.a(field_l[0][var1], -72057594037927936L))))), co.a(field_l[5][var1 + 5], 16711680L))), co.a(field_l[7][var1 + 7], 255L));
        }
    }
}
