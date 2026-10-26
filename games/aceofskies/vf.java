/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vf implements Runnable {
    private int field_f;
    static String[] field_l;
    private InputStream field_g;
    private int field_h;
    private boolean field_i;
    private OutputStream field_j;
    private boolean field_k;
    private en field_a;
    private rk field_e;
    private int field_c;
    private byte[] field_b;
    private java.net.Socket field_d;

    protected final void finalize() {
        this.a(1);
    }

    public static void c(byte param0) {
        field_l = null;
        if (param0 <= -123) {
          return;
        }
        field_l = (String[]) null;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        int var6Lifetime1;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.field_k) {
            return;
          }
          if (this.field_i) {
            this.field_i = false;
            throw new IOException();
          }
          if (null == this.field_b) {
            this.field_b = new byte[this.field_c];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; param0 > var6; var6++) {
              this.field_b[this.field_h] = param3[var6 + param1];
              this.field_h = (this.field_h + 1) % this.field_c;
              if (~this.field_h == ~((this.field_f + this.field_c - 100) % this.field_c)) {
                throw new IOException();
              }
            }
            if (null == this.field_a) {
              this.field_a = this.field_e.a(3, 1048576, (Runnable) (this));
            }
            this.notifyAll();
            var6Lifetime1 = 44 / ((param2 + 35) / 56);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("vf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
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
          var6 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_f == this.field_h) {
                  if (this.field_k) {
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
                  if (this.field_f <= this.field_h) {
                    var1_int = -this.field_f + this.field_h;
                  } else {
                    var1_int = this.field_c - this.field_f;
                  }
                  var2 = this.field_f;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_g) {
                    this.field_g.close();
                  }
                  if (this.field_j != null) {
                    this.field_j.close();
                  }
                  if (this.field_d != null) {
                    this.field_d.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_b = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_j.write(this.field_b, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_i = true;
              }
              this.field_f = (var1_int + this.field_f) % this.field_c;
              try {
                if (this.field_h == this.field_f) {
                  this.field_j.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_i = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            v.a((String) null, (byte) -52, (Throwable) ((Object) var1_ref));
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (0L >= param0) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        if (param1 == 28304) {
          var3 = 0;
          var4 = param0;
          while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
          }
          var6 = new StringBuilder(var3);
          while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = ou.field_n[(int)(var7 - param0 * 37L)];
            if (var9 == 95) {
              var10 = -1 + var6.length();
              var9 = 160;
              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            discarded$0 = var6.append((char) var9);
          }
          var6.reverse();
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        return (String) null;
    }

    final int a(byte param0) throws IOException {
        if (this.field_k) {
          return 0;
        }
        int var2 = 60 / ((param0 - 26) / 55);
        return this.field_g.read();
    }

    final int b(int param0) throws IOException {
        if (this.field_k) {
          return 0;
        }
        if (param0 >= -110) {
          this.finalize();
          return this.field_g.available();
        }
        return this.field_g.available();
    }

    final void b(byte param0) throws IOException {
        if (this.field_k) {
          return;
        }
        if (this.field_i) {
          this.field_i = false;
          throw new IOException();
        }
        if (param0 <= 56) {
          this.run();
          return;
        }
    }

    vf(java.net.Socket param0, rk param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) {
        try {
          InterruptedException var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = AceOfSkies.obfuscationControl ? 1 : 0;
          if (this.field_k) {
            return;
          }
          var2_ref = this;
          synchronized (var2_ref) {
            this.field_k = true;
            this.notifyAll();
          }
          if (null != this.field_a) {
            while (this.field_a.field_a == 0) {
              IntrusiveNode.a(1L, false);
            }
            if (1 == this.field_a.field_a) {
              try {
                ((Thread) (this.field_a.field_f)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (InterruptedException) (Object) decompiledCaughtException;
                this.field_a = null;
                if (param0 == 1) {
                  return;
                }
                vf.c((byte) -69);
                return;
              }
            }
          }
          this.field_a = null;
          if (param0 == 1) {
            return;
          }
          vf.c((byte) -69);
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, boolean param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!param3) {
            this.field_k = false;
          }
          if (this.field_k) {
            return;
          }
          while (0 < param1) {
            var5_int = this.field_g.read(param2, param0, param1);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param1 = param1 - var5_int;
            param0 = param0 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("vf.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private vf(java.net.Socket param0, rk param1, int param2) throws IOException {
        this.field_i = false;
        this.field_k = false;
        this.field_f = 0;
        this.field_h = 0;
        try {
          this.field_e = param1;
          this.field_d = param0;
          this.field_d.setSoTimeout(30000);
          this.field_d.setTcpNoDelay(true);
          this.field_g = this.field_d.getInputStream();
          this.field_j = this.field_d.getOutputStream();
          this.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_l = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
