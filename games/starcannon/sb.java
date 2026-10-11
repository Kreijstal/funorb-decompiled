/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sb implements Runnable {
    private InputStream field_d;
    private ka field_k;
    private OutputStream field_q;
    private boolean field_i;
    private int field_r;
    private bk field_b;
    private boolean field_l;
    static p field_n;
    static String field_o;
    static String field_f;
    static String field_p;
    private int field_a;
    private java.net.Socket field_j;
    static int field_m;
    private int field_h;
    static kh field_g;
    static int field_c;
    private byte[] field_e;

    final void b(byte param0) {
        try {
          if (this.field_i) {
            return;
          }
          synchronized (this) {
            this.field_i = true;
            this.notifyAll();
          }
          if (this.field_b != null) {
            while (this.field_b.field_b == 0) {
              uc.a(-113, 1L);
            }
            if (this.field_b.field_b == 1) {
              try {
                ((Thread) (this.field_b.field_f)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_b = null;
          if (param0 > -20) {
            this.field_r = 0;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 < 13) {
          field_m = -57;
        }
        field_n = null;
        field_o = null;
        field_p = null;
        field_f = null;
        field_g = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var12 = 0;
        int var16 = 0;
        int incrementValue$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        try {
          var8_int = 0;
          var9 = 65536 / param7;
          if (ki.field_l > param6) {
            param1 = param1 - (ki.field_l - param6);
            param6 = ki.field_l;
          }
          if (param4 < ki.field_e) {
            param7 = param7 - (-param4 + ki.field_e);
            var8_int = var8_int + var9 * (ki.field_e - param4);
            param4 = ki.field_e;
          }
          if (param1 + param6 > ki.field_g) {
            param1 = ki.field_g - param6;
          }
          if (param4 + param7 > ki.field_i) {
            param7 = ki.field_i - param4;
          }
          var10 = -param1 + ki.field_j;
          var11 = param6 + param4 * ki.field_j;
          if (!param0) {
            return;
          }
          for (var12 = -param7; var12 < 0; var12++) {
            var13 = 65536 - var8_int >> 8;
            var14 = var8_int >> 8;
            var15 = ((param2 & 16711935) * var13 + (16711935 & param3) * var14 & -16711936) + (16711680 & (param2 & 65280) * var13 + (param3 & 65280) * var14) >>> 8;
            for (var16 = -param1; 0 > var16; var16++) {
              if (param5 != ki.field_a[var11]) {
                var11++;
              } else {
                incrementValue$0 = var11;
                var11++;
                ki.field_a[incrementValue$0] = var15;
              }
            }
            var8_int = var8_int + var9;
            var11 = var11 + var10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var8), "sb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    sb(java.net.Socket param0, ka param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0) throws IOException {
        if (this.field_i) {
          return;
        }
        if (this.field_l) {
          this.field_l = false;
          throw new IOException();
        }
        int var2 = 69 % ((param0 - 67) / 58);
    }

    final int a(int param0) throws IOException {
        if (param0 != 488852616) {
          this.field_e = (byte[]) null;
        }
        if (this.field_i) {
          return 0;
        }
        return this.field_d.read();
    }

    final static kl[] a(ia param0, byte param1) {
        int var5 = 0;
        kl[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        kl[] var4 = null;
        kl var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = StarCannon.field_A;
        try {
          var2_int = param0.e(8, 8);
          if (0 < var2_int) {
            return null;
          }
          var3 = param0.e(param1 - 99, 12);
          var4 = new kl[var3];
          if (param1 != 107) {
            field_o = (String) null;
          }
          for (var5 = 0; var3 > var5; var5++) {
            if (od.a(-2, param0)) {
              var6 = new kl();
              param0.e(8, 24);
              param0.e(8, 24);
              var6.field_e = param0.e(8, 24);
              param0.e(param1 ^ 99, 9);
              param0.e(8, 12);
              param0.e(8, 12);
              param0.e(param1 ^ 99, 12);
              var4[var5] = var6;
            } else {
              var6_int = param0.e(8, wg.a(false, -1 + var5));
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_13_0 = var4;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("sb.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
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
          var6 = StarCannon.field_A;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_h == this.field_r) {
                  if (this.field_i) {
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
                  var2 = this.field_h;
                  if (this.field_h > this.field_r) {
                    var1_int = this.field_a - this.field_h;
                  } else {
                    var1_int = this.field_r - this.field_h;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_d != null) {
                    this.field_d.close();
                  }
                  if (this.field_q != null) {
                    this.field_q.close();
                  }
                  if (this.field_j != null) {
                    this.field_j.close();
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
                this.field_q.write(this.field_e, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_l = true;
              }
              this.field_h = (this.field_h + var1_int) % this.field_a;
              try {
                if (this.field_h == this.field_r) {
                  this.field_q.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_l = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            hc.a((Throwable) ((Object) var1_ref), (String) null, (byte) 126);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_i) {
            return;
          }
          while (param2 > 0) {
            var5_int = this.field_d.read(param3, param0, param2);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param2 = param2 - var5_int;
            param0 = param0 + var5_int;
          }
          if (param1 != 32498) {
            this.field_i = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("sb.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, hb param2) {
        try {
          hi.field_f.b(105, param2);
          hb.a(-114, param0, param2);
          if (param1 != -41) {
            field_o = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 < 93) {
          field_f = (String) null;
        }
        qa.field_a.a(param0, false);
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        try {
          if (this.field_i) {
            return;
          }
          if (this.field_l) {
            this.field_l = false;
            throw new IOException();
          }
          if (this.field_e == null) {
            this.field_e = new byte[this.field_a];
          }
          var5 = this;
          synchronized (var5) {
            if (param2 != 87) {
              return;
            }
            for (var6 = 0; var6 < param3; var6++) {
              this.field_e[this.field_r] = param1[param0 + var6];
              this.field_r = (this.field_r + 1) % this.field_a;
              if ((-100 + this.field_h + this.field_a) % this.field_a == this.field_r) {
                throw new IOException();
              }
            }
            if (this.field_b == null) {
              this.field_b = this.field_k.a(3, 115, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("sb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected final void finalize() {
        this.b((byte) -113);
    }

    final int c(int param0) throws IOException {
        if (this.field_i) {
          return 0;
        }
        if (param0 < 45) {
          sb.a(false, 123, -100, 77, -90, -56, 113, -109);
        }
        return this.field_d.available();
    }

    final static ue a(int param0, boolean param1, boolean param2, int param3, byte param4) {
        if (param4 < 100) {
          field_g = (kh) null;
        }
        return ri.a(true, param2, param0, param3, false, param1);
    }

    private sb(java.net.Socket param0, ka param1, int param2) throws IOException {
        this.field_i = false;
        this.field_l = false;
        this.field_r = 0;
        this.field_h = 0;
        try {
          this.field_k = param1;
          this.field_j = param0;
          this.field_j.setSoTimeout(30000);
          this.field_j.setTcpNoDelay(true);
          this.field_d = this.field_j.getInputStream();
          this.field_q = this.field_j.getOutputStream();
          this.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_o = "<br><br><br>Become a member of Funorb to continue humanity's<br>fight against the Paragulans";
        field_f = "Visit the Account Management section on the main site to view.";
        field_p = "STORY:";
        field_n = new p();
        field_c = 10;
    }
}
