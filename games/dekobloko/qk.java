/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk implements Runnable {
    private fd field_j;
    static int field_d;
    private InputStream field_o;
    private boolean field_g;
    static int field_a;
    private int field_r;
    private mh field_p;
    static int field_n;
    static int field_m;
    private java.net.Socket field_l;
    private int field_q;
    private boolean field_c;
    private OutputStream field_b;
    static String[] field_s;
    static int field_i;
    private byte[] field_h;
    static int field_k;
    static String[] field_e;
    private int field_f;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          if (this.field_g) {
            return;
          }
          if (param2 != 1) {
            field_s = (String[]) null;
          }
          if (this.field_c) {
            this.field_c = false;
            throw new IOException();
          }
          if (this.field_h == null) {
            this.field_h = new byte[this.field_r];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; var6 < param1; var6++) {
              this.field_h[this.field_f] = param3[param0 + var6];
              this.field_f = (1 + this.field_f) % this.field_r;
              if (this.field_f == (this.field_r + this.field_q - 100) % this.field_r) {
                throw new IOException();
              }
            }
            if (null == this.field_p) {
              this.field_p = this.field_j.a((byte) -45, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("qk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final int c(byte param0) throws IOException {
        if (this.field_g) {
          return 0;
        }
        int var2 = -99 % ((-44 - param0) / 41);
        return this.field_o.read();
    }

    final static String d(byte param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = client.field_A ? 1 : 0;
        var6 = "(" + lg.field_U + " " + bb.field_d + " " + kf.field_L + ") " + bh.field_k;
        var1 = var6;
        if (param0 < 14) {
          return (String) null;
        }
        if (sm.field_e > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < sm.field_e; var2++) {
            var7 = var1 + ' ';
            var3 = de.field_V.field_r[var2] & 255;
            var4 = var3 >> 4;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            var3 = var3 & 15;
            var8 = var7 + (char)var4;
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    final void a(int param0) {
        try {
          int var4 = 0;
          var4 = client.field_A ? 1 : 0;
          if (this.field_g) {
            return;
          }
          synchronized (this) {
            this.field_g = true;
            this.notifyAll();
          }
          if (param0 != 0) {
            return;
          }
          if (null != this.field_p) {
            while (this.field_p.field_c == 0) {
              ua.a(1L, param0 ^ -128);
            }
            if (1 == this.field_p.field_c) {
              try {
                ((Thread) (this.field_p.field_b)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_p = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          var6 = client.field_A ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_f == this.field_q) {
                  if (this.field_g) {
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
                  var2 = this.field_q;
                  if (this.field_q > this.field_f) {
                    var1_int = this.field_r - this.field_q;
                  } else {
                    var1_int = this.field_f - this.field_q;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_o) {
                    this.field_o.close();
                  }
                  if (null != this.field_b) {
                    this.field_b.close();
                  }
                  if (null != this.field_l) {
                    this.field_l.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_h = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_b.write(this.field_h, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_c = true;
              }
              this.field_q = (var1_int + this.field_q) % this.field_r;
              try {
                if (this.field_f == this.field_q) {
                  this.field_b.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_c = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            qb.a((Throwable) ((Object) var1_ref), 16408, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        this.a(0);
    }

    final static Object a(byte[] param0, int param1, boolean param2) {
        fn var3 = null;
        RuntimeException var3_ref = null;
        fn stackIn_6_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (136 < param0.length) {
            var3 = new fn();
            ((mk) ((Object) var3)).a(param0, true);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param1 != -1389597532) {
            field_i = 67;
          }
          if (!param2) {
            stackIn_13_0 = (byte[]) (param0);
            return stackIn_13_0;
          }
          stackIn_11_0 = jd.a(0, param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("qk.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int b(int param0) throws IOException {
        if (this.field_g) {
          return 0;
        }
        if (param0 != 0) {
          return -106;
        }
        return this.field_o.available();
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 != -11657) {
          return;
        }
        field_s = null;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          if (this.field_g) {
            return;
          }
          while (param0 > 0) {
            var5_int = this.field_o.read(param3, param1, param0);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            param1 = param1 + var5_int;
            param0 = param0 - var5_int;
          }
          if (param2 != 17) {
            this.a(31);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("qk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void b(byte param0) throws IOException {
        if (this.field_g) {
          return;
        }
        if (param0 > -21) {
          return;
        }
        if (this.field_c) {
          this.field_c = false;
          throw new IOException();
        }
    }

    qk(java.net.Socket param0, fd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void a(byte param0) {
        dj.field_ab.setLength(0);
        pk.field_r = 0;
        if (param0 != 94) {
          field_d = -4;
        }
    }

    private qk(java.net.Socket param0, fd param1, int param2) throws IOException {
        this.field_g = false;
        this.field_c = false;
        this.field_q = 0;
        this.field_f = 0;
        try {
          this.field_j = param1;
          this.field_l = param0;
          this.field_l.setSoTimeout(30000);
          this.field_l.setTcpNoDelay(true);
          this.field_o = this.field_l.getInputStream();
          this.field_b = this.field_l.getOutputStream();
          this.field_r = param2;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_s = new String[]{"Deko Bloko", "Double Deko", "Triple Deko", "Mega Deko", "Double Bloko", "Triple Bloko", "Mini Bombo", "Maxi Bombo", "Tower Bloko", "Massive Attako", "Clean Sweepo", "Uh-Oh Bloko", "Floral Bloko", "Urban Bloko", "Retro Bloko", "Bronze Blokker", "Silver Blokker", "Gold Blokker", "Blok of Beginning", "Blok of Victory", "Blok of Supremacy", "Deko Pwnage", "Ultimate Pwnage", "Quick Deko", "Safe Deko", "Deko Modo", "Shape Mover", "Shape Sender", "Shape Dispatcher", "Shape Consigner", "Shape Shifter"};
        field_e = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
