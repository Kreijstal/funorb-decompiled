/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class k implements Runnable {
    private int field_s;
    private dl field_h;
    static kc field_d;
    static ch field_q;
    private boolean field_g;
    static String field_f;
    private boolean field_l;
    private byte[] field_b;
    private InputStream field_i;
    private java.net.Socket field_e;
    private int field_n;
    private OutputStream field_r;
    private og field_a;
    static String field_p;
    private int field_j;
    static String[] field_k;
    static volatile boolean field_c;
    static int[] field_m;
    static int field_o;

    final void a(boolean param0) throws IOException {
        if (param0) {
          return;
        }
        if (this.field_g) {
          return;
        }
        if (this.field_l) {
          this.field_l = false;
          throw new IOException();
        }
    }

    final static void a(le param0, boolean param1) {
        try {
          if (!param1) {
            le var3 = (le) null;
            k.a((le) null, false);
          }
          rk.field_O = param0.field_V;
          qn.field_ob = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "k.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_k = null;
        field_f = null;
        field_p = null;
        if (param0 != 11138) {
          return;
        }
        field_d = null;
        field_m = null;
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_g) {
            return;
          }
          while (param3 > 0) {
            var5_int = this.field_i.read(param0, param2, param3);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param2 = param2 + var5_int;
            param3 = param3 - var5_int;
          }
          if (param1 >= -122) {
            this.field_a = (og) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("k.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_g) {
            return;
          }
          if (this.field_l) {
            this.field_l = false;
            throw new IOException();
          }
          if (this.field_b == null) {
            this.field_b = new byte[this.field_n];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; var6 < param0; var6++) {
              this.field_b[this.field_s] = param3[param1 + var6];
              this.field_s = (1 + this.field_s) % this.field_n;
              if (~this.field_s == ~((this.field_j - (-this.field_n + 100)) % this.field_n)) {
                throw new IOException();
              }
            }
            if (this.field_a == null) {
              this.field_a = this.field_h.a(124, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          if (param2 <= 114) {
            this.field_r = (OutputStream) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("k.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void d(int param0) {
        try {
          int var4 = 0;
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 != -23482) {
            field_f = (String) null;
          }
          if (this.field_g) {
            return;
          }
          synchronized (this) {
            this.field_g = true;
            this.notifyAll();
          }
          if (null != this.field_a) {
            while (this.field_a.field_e == 0) {
              ao.a(1L, 1);
            }
            if (this.field_a.field_e == 1) {
              try {
                ((Thread) (this.field_a.field_g)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_a = null;
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
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_j == this.field_s) {
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
                  var2 = this.field_j;
                  if (this.field_j <= this.field_s) {
                    var1_int = -this.field_j + this.field_s;
                  } else {
                    var1_int = this.field_n - this.field_j;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_i != null) {
                    this.field_i.close();
                  }
                  if (this.field_r != null) {
                    this.field_r.close();
                  }
                  if (null != this.field_e) {
                    this.field_e.close();
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
                this.field_r.write(this.field_b, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_l = true;
              }
              this.field_j = (var1_int + this.field_j) % this.field_n;
              try {
                if (this.field_s == this.field_j) {
                  this.field_r.flush();
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
            jh.a((Throwable) ((Object) var1_ref), (String) null, (byte) 20);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    k(java.net.Socket param0, dl param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static String a(int param0) {
        if (in.field_Gb == sk.field_a) {
          return on.field_d;
        }
        if (param0 != 0) {
          field_k = (String[]) null;
        }
        if (!wn.field_z.a((byte) -106)) {
          return wn.field_z.a(true);
        }
        if (hb.field_Gb == sk.field_a) {
          return wn.field_z.a(true);
        }
        return ge.field_g;
    }

    protected final void finalize() {
        this.d(-23482);
    }

    final int b(int param0) throws IOException {
        if (param0 != 0) {
          this.field_s = -21;
        }
        if (this.field_g) {
          return 0;
        }
        return this.field_i.available();
    }

    final int a(byte param0) throws IOException {
        if (this.field_g) {
          return 0;
        }
        if (param0 != 120) {
          this.d(-9);
        }
        return this.field_i.read();
    }

    private k(java.net.Socket param0, dl param1, int param2) throws IOException {
        this.field_s = 0;
        this.field_l = false;
        this.field_g = false;
        this.field_j = 0;
        try {
          this.field_e = param0;
          this.field_h = param1;
          this.field_e.setSoTimeout(30000);
          this.field_e.setTcpNoDelay(true);
          this.field_i = this.field_e.getInputStream();
          this.field_r = this.field_e.getOutputStream();
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = "<%0> is not on your ignore list.";
        field_p = "You";
        field_q = new ch(3);
        field_k = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_m = new int[8192];
        field_o = 0;
        field_c = true;
    }
}
