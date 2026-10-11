/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tf implements Runnable {
    private int field_e;
    private he field_h;
    private java.net.Socket field_a;
    private InputStream field_b;
    private boolean field_l;
    private boolean field_g;
    private int field_f;
    private byte[] field_m;
    private OutputStream field_c;
    static o field_d;
    private mf field_i;
    static int field_k;
    private int field_j;

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        try {
          if (this.field_g) {
            return;
          }
          if (this.field_l) {
            this.field_l = false;
            throw new IOException();
          }
          if (null == this.field_m) {
            this.field_m = new byte[this.field_f];
          }
          if (param2 != -97) {
            this.a((byte) -76);
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; param0 > var6; var6++) {
              this.field_m[this.field_e] = param3[param1 + var6];
              this.field_e = (1 + this.field_e) % this.field_f;
              if (this.field_e == (this.field_j + (this.field_f - 100)) % this.field_f) {
                throw new IOException();
              }
            }
            if (null == this.field_i) {
              this.field_i = this.field_h.a((Runnable) (this), (byte) -21, 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("tf.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final int a(int param0) throws IOException {
        if (this.field_g) {
          return 0;
        }
        if (param0 != 0) {
          this.field_l = false;
          return this.field_b.available();
        }
        return this.field_b.available();
    }

    tf(java.net.Socket param0, he param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0) {
        try {
          int var2 = 0;
          InterruptedException var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref_Object = null;
          var4 = Terraphoenix.field_V;
          if (this.field_g) {
            return;
          }
          var2_ref_Object = this;
          synchronized (var2_ref_Object) {
            this.field_g = true;
            this.notifyAll();
          }
          var2 = -36 % ((-82 - param0) / 40);
          if (this.field_i != null) {
            while (0 == this.field_i.field_d) {
              gi.a((byte) -26, 1L);
            }
            if (this.field_i.field_d == 1) {
              try {
                ((Thread) (this.field_i.field_e)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                this.field_i = null;
                return;
              }
            }
          }
          this.field_i = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) throws IOException {
        if (param0 != 10509) {
          this.finalize();
          if (this.field_g) {
            return;
          }
          if (!this.field_l) {
            return;
          }
          this.field_l = false;
          throw new IOException();
        }
        if (this.field_g) {
          return;
        }
        if (!this.field_l) {
          return;
        }
        this.field_l = false;
        throw new IOException();
    }

    protected final void finalize() {
        this.a((byte) 37);
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
          var6 = Terraphoenix.field_V;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_e == this.field_j) {
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
                  if (this.field_j > this.field_e) {
                    var1_int = this.field_f - this.field_j;
                  } else {
                    var1_int = this.field_e - this.field_j;
                  }
                  var2 = this.field_j;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_b) {
                    this.field_b.close();
                  }
                  if (null != this.field_c) {
                    this.field_c.close();
                  }
                  if (null != this.field_a) {
                    this.field_a.close();
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
                this.field_c.write(this.field_m, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_l = true;
              }
              this.field_j = (this.field_j + var1_int) % this.field_f;
              try {
                if (this.field_j == this.field_e) {
                  this.field_c.flush();
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
            bd.a((Throwable) ((Object) var1_ref), (String) null, -99);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_d = null;
        if (param0 > 94) {
          return;
        }
        field_k = 18;
    }

    final static boolean a(int param0, byte param1, int param2, int param3, boolean param4, int param5) {
        int var6 = 72 / ((-25 - param1) / 34);
        if (param3 > ef.field_j) {
          return false;
        }
        if (param3 + param0 <= ef.field_j) {
          return false;
        }
        if (jb.field_b < param2) {
          return false;
        }
        if (param2 + param5 <= jb.field_b) {
          return false;
        }
        if (param4) {
          l.d(param3, param2, param0, param5, 16777215, 128);
          return true;
        }
        return true;
    }

    private tf(java.net.Socket param0, he param1, int param2) throws IOException {
        this.field_e = 0;
        this.field_g = false;
        this.field_l = false;
        this.field_j = 0;
        try {
          this.field_h = param1;
          this.field_a = param0;
          this.field_a.setSoTimeout(30000);
          this.field_a.setTcpNoDelay(true);
          this.field_b = this.field_a.getInputStream();
          this.field_c = this.field_a.getOutputStream();
          this.field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          if (this.field_g) {
            return;
          }
          while (param1 > 0) {
            var5_int = this.field_b.read(param0, param2, param1);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param2 = param2 + var5_int;
            param1 = param1 - var5_int;
          }
          if (param3 >= 96) {
            return;
          }
          field_k = -40;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("tf.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int b(int param0) throws IOException {
        if (param0 != 0) {
          this.field_m = (byte[]) null;
          if (this.field_g) {
            return 0;
          }
          return this.field_b.read();
        }
        if (this.field_g) {
          return 0;
        }
        return this.field_b.read();
    }

    static {
        field_k = -1;
        field_d = new o();
    }
}
