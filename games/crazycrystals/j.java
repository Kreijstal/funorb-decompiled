/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j implements Runnable {
    private InputStream field_n;
    private int field_d;
    private boolean field_m;
    private int field_g;
    private byte[] field_a;
    private java.net.Socket field_c;
    static int field_j;
    private int field_f;
    private un field_b;
    static String field_h;
    private OutputStream field_e;
    private gb field_l;
    private boolean field_k;
    static int[] field_i;

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          if (this.field_k) {
            return;
          }
          if (this.field_m) {
            this.field_m = false;
            throw new IOException();
          }
          if (this.field_a == null) {
            this.field_a = new byte[this.field_d];
          }
          if (param1 < 85) {
            j.c((byte) -1);
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; param3 > var6; var6++) {
              this.field_a[this.field_g] = param2[var6 + param0];
              this.field_g = (this.field_g + 1) % this.field_d;
              if ((-100 + (this.field_d + this.field_f)) % this.field_d == this.field_g) {
                throw new IOException();
              }
            }
            if (null == this.field_l) {
              this.field_l = this.field_b.a((Runnable) (this), 2, 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("j.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(ak param0, int param1, boolean param2) {
        md var3 = tp.field_f;
        if (param2) {
          return;
        }
        try {
          var3.d(8, param1);
          var3.a(true, 5);
          var3.a(!param2 ? true : false, 0);
          var3.c(-161478600, param0.field_g);
          var3.a(true, param0.field_h);
          var3.a(!param2 ? true : false, param0.field_j);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "j.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0) throws IOException {
        if (param0 != 5) {
          this.field_m = true;
          if (!this.field_k) {
            return this.field_n.read();
          }
          return 0;
        }
        if (!this.field_k) {
          return this.field_n.read();
        }
        return 0;
    }

    j(java.net.Socket param0, un param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) throws IOException {
        int var2 = 0 % ((param0 + 23) / 37);
        if (this.field_k) {
          return;
        }
        if (!this.field_m) {
          return;
        }
        this.field_m = false;
        throw new IOException();
    }

    final void b(byte param0) {
        try {
          InterruptedException var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = CrazyCrystals.field_B;
          if (this.field_k) {
            return;
          }
          var2_ref = this;
          synchronized (var2_ref) {
            this.field_k = true;
            this.notifyAll();
            if (param0 != -118) {
              this.field_g = -44;
            }
          }
          if (null != this.field_l) {
            while (this.field_l.field_a == 0) {
              fh.a(true, 1L);
            }
            if (this.field_l.field_a == 1) {
              try {
                ((Thread) (this.field_l.field_b)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (InterruptedException) (Object) decompiledCaughtException;
                this.field_l = null;
                return;
              }
            }
          }
          this.field_l = null;
          return;
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
          var6 = CrazyCrystals.field_B;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_g == this.field_f) {
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
                  if (this.field_f <= this.field_g) {
                    var1_int = this.field_g - this.field_f;
                  } else {
                    var1_int = -this.field_f + this.field_d;
                  }
                  var2 = this.field_f;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_n != null) {
                    this.field_n.close();
                  }
                  if (null != this.field_e) {
                    this.field_e.close();
                  }
                  if (null != this.field_c) {
                    this.field_c.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_a = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_e.write(this.field_a, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_m = true;
              }
              this.field_f = (this.field_f + var1_int) % this.field_d;
              try {
                if (this.field_f == this.field_g) {
                  this.field_e.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_m = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            wp.a((Throwable) ((Object) var1_ref), (String) null, 21862);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        this.b((byte) -118);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          if (this.field_k) {
            return;
          }
          while (param1 > 0) {
            var5_int = this.field_n.read(param0, param3, param1);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param3 = param3 + var5_int;
            param1 = param1 - var5_int;
          }
          if (param2 == 2034) {
            return;
          }
          this.field_f = -31;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("j.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        if (param0 == 45) {
          return;
        }
        field_h = (String) null;
    }

    final int c(int param0) throws IOException {
        if (this.field_k) {
          return 0;
        }
        if (param0 != 0) {
          return -14;
        }
        return this.field_n.available();
    }

    private j(java.net.Socket param0, un param1, int param2) throws IOException {
        this.field_f = 0;
        this.field_g = 0;
        this.field_k = false;
        this.field_m = false;
        try {
          this.field_b = param1;
          this.field_c = param0;
          this.field_c.setSoTimeout(30000);
          this.field_c.setTcpNoDelay(true);
          this.field_n = this.field_c.getInputStream();
          this.field_e = this.field_c.getOutputStream();
          this.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "j.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean c(byte param0) {
        ka.field_j = true;
        if (param0 == -23) {
          ee.field_e = lo.a((byte) 81) + 15000L;
          return hp.field_s == 11 ? true : false;
        }
        return false;
    }

    static {
        field_h = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
