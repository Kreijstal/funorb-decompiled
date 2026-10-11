/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vd implements Runnable {
    private byte[] field_m;
    static si field_c;
    private int field_g;
    private int field_b;
    private int field_k;
    private df field_i;
    private boolean field_f;
    private bc field_h;
    private OutputStream field_d;
    private boolean field_a;
    private InputStream field_j;
    private java.net.Socket field_e;
    static String field_l;

    public static void c(int param0) {
        field_c = null;
        field_l = null;
        if (param0 >= 51) {
          return;
        }
        field_l = (String) null;
    }

    protected final void finalize() {
        this.a(1);
    }

    final int a(byte param0) throws IOException {
        if (this.field_f) {
          return 0;
        }
        if (param0 == -5) {
          return this.field_j.read();
        }
        this.field_d = (OutputStream) null;
        return this.field_j.read();
    }

    final int c(byte param0) throws IOException {
        if (this.field_f) {
          return 0;
        }
        int var2 = -60 / ((-11 - param0) / 39);
        return this.field_j.available();
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
          var6 = Confined.field_J ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_b == this.field_k) {
                  if (this.field_f) {
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
                  if (this.field_k > this.field_b) {
                    var1_int = this.field_g - this.field_k;
                  } else {
                    var1_int = -this.field_k + this.field_b;
                  }
                  var2 = this.field_k;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_j != null) {
                    this.field_j.close();
                  }
                  if (this.field_d != null) {
                    this.field_d.close();
                  }
                  if (null != this.field_e) {
                    this.field_e.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_m = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_d.write(this.field_m, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_a = true;
              }
              this.field_k = (var1_int + this.field_k) % this.field_g;
              try {
                if (this.field_b == this.field_k) {
                  this.field_d.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_a = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            mb.a((String) null, true, (Throwable) ((Object) var1_ref));
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    vd(java.net.Socket param0, df param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, boolean param1, byte[] param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        try {
          if (this.field_f) {
            return;
          }
          if (this.field_a) {
            this.field_a = false;
            throw new IOException();
          }
          if (null == this.field_m) {
            this.field_m = new byte[this.field_g];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; param0 > var6; var6++) {
              this.field_m[this.field_b] = param2[var6 + param3];
              this.field_b = (this.field_b + 1) % this.field_g;
              if (this.field_b == (-100 + this.field_k + this.field_g) % this.field_g) {
                throw new IOException();
              }
            }
            if (null == this.field_h) {
              this.field_h = this.field_i.a((byte) 48, (Runnable) (this), 3);
            }
            if (param1) {
              return;
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_29_0 = var5_ref;
          stackIn_29_1 = new StringBuilder().append("vd.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String d(int param0) {
        String var1 = "";
        if (null != om.field_p) {
          var1 = om.field_p.j(-102);
        }
        if (param0 > 21) {
          if (var1.length() == 0) {
            var1 = di.a(true);
          }
          if (var1.length() == 0) {
            var1 = an.field_o;
          }
          return var1;
        }
        field_c = (si) null;
        if (var1.length() == 0) {
          var1 = di.a(true);
        }
        if (var1.length() == 0) {
          var1 = an.field_o;
        }
        return var1;
    }

    final void a(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          int var4 = 0;
          var4 = Confined.field_J ? 1 : 0;
          if (this.field_f) {
            return;
          }
          var2 = this;
          synchronized (var2) {
            this.field_f = true;
            this.notifyAll();
          }
          if (this.field_h != null) {
            while (this.field_h.field_g == 0) {
              jd.a(1, 1L);
            }
            if (this.field_h.field_g == 1) {
              try {
                ((Thread) (this.field_h.field_f)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                this.field_h = null;
                if (param0 == 1) {
                  return;
                }
                this.field_k = -52;
                return;
              }
            }
          }
          this.field_h = null;
          if (param0 == 1) {
            return;
          }
          this.field_k = -52;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          var5_int = -108 % ((param1 + 19) / 46);
          if (this.field_f) {
            return;
          }
          while (param2 > 0) {
            var6 = this.field_j.read(param0, param3, param2);
            if (var6 <= 0) {
              throw new EOFException();
            }
            param3 = param3 + var6;
            param2 = param2 - var6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("vd.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0) throws IOException {
        if (this.field_f) {
          return;
        }
        int var2 = -78 / ((16 - param0) / 55);
        if (!this.field_a) {
          return;
        }
        this.field_a = false;
        throw new IOException();
    }

    final static void b(byte param0) {
        int var1 = 0;
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        var1 = -87 % ((param0 + 42) / 60);
        if (tf.field_a == null) {
          return;
        }
        var2 = tf.field_a;
        synchronized (var2) {
          tf.field_a = null;
        }
        return;
    }

    private vd(java.net.Socket param0, df param1, int param2) throws IOException {
        this.field_f = false;
        this.field_b = 0;
        this.field_k = 0;
        this.field_a = false;
        try {
          this.field_i = param1;
          this.field_e = param0;
          this.field_e.setSoTimeout(30000);
          this.field_e.setTcpNoDelay(true);
          this.field_j = this.field_e.getInputStream();
          this.field_d = this.field_e.getOutputStream();
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = new si(0);
        field_l = "Try the arrow keys.";
    }
}
