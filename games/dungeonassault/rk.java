/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk implements Runnable {
    private qg field_b;
    private int field_j;
    private boolean field_n;
    private int field_i;
    private InputStream field_g;
    private pn field_e;
    static String[] field_k;
    private OutputStream field_o;
    private boolean field_m;
    private java.net.Socket field_h;
    static String field_a;
    static long field_l;
    static String[] field_f;
    private byte[] field_c;
    private int field_d;

    public static void a(boolean param0) {
        if (param0) {
          field_a = null;
          field_k = null;
          field_f = null;
          return;
        }
        field_f = (String[]) null;
        field_a = null;
        field_k = null;
        field_f = null;
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = DungeonAssault.field_K;
        try {
          if (this.field_m) {
            return;
          }
          if (param1) {
            this.field_i = 17;
          }
          while (param2 > 0) {
            var5_int = this.field_g.read(param0, param3, param2);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param2 = param2 - var5_int;
            param3 = param3 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("rk.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected final void finalize() {
        this.c(-6624);
    }

    final int a(int param0) throws IOException {
        if (param0 != 0) {
          rk.a(false);
          if (this.field_m) {
            return 0;
          }
          return this.field_g.available();
        }
        if (this.field_m) {
          return 0;
        }
        return this.field_g.available();
    }

    final void b(int param0) throws IOException {
        int var2 = 117 / ((param0 + 9) / 51);
        if (this.field_m) {
          return;
        }
        if (!this.field_n) {
          return;
        }
        this.field_n = false;
        throw new IOException();
    }

    rk(java.net.Socket param0, qg param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void c(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          int var4 = 0;
          var4 = DungeonAssault.field_K;
          if (param0 != -6624) {
            this.field_o = (OutputStream) null;
          }
          if (this.field_m) {
            return;
          }
          var2 = this;
          synchronized (var2) {
            this.field_m = true;
            this.notifyAll();
          }
          if (this.field_e != null) {
            while (this.field_e.field_c == 0) {
              pj.a(param0 + 6624, 1L);
            }
            if (1 == this.field_e.field_c) {
              try {
                ((Thread) (this.field_e.field_f)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                this.field_e = null;
                return;
              }
            }
          }
          this.field_e = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) throws IOException {
        if (param0 != -108) {
          this.field_g = (InputStream) null;
          if (!this.field_m) {
            return this.field_g.read();
          }
          return 0;
        }
        if (!this.field_m) {
          return this.field_g.read();
        }
        return 0;
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
          var6 = DungeonAssault.field_K;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_i == this.field_d) {
                  if (this.field_m) {
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
                  var2 = this.field_d;
                  if (this.field_d <= this.field_i) {
                    var1_int = this.field_i - this.field_d;
                  } else {
                    var1_int = -this.field_d + this.field_j;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_g != null) {
                    this.field_g.close();
                  }
                  if (null != this.field_o) {
                    this.field_o.close();
                  }
                  if (null != this.field_h) {
                    this.field_h.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_c = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_o.write(this.field_c, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_n = true;
              }
              this.field_d = (this.field_d + var1_int) % this.field_j;
              try {
                if (this.field_i == this.field_d) {
                  this.field_o.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_n = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            sm.a((Throwable) ((Object) var1_ref), 1, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, cn param8) {
        int var9_int = param8.field_w - (-param5 - param2 + param6);
        int var10 = param5 + (param8.field_w - (-param2 - param0));
        int var11 = param4 + param8.field_A + (param8.field_v >> 1);
        if (param7 < 97) {
          return;
        }
        try {
          gf.a(var9_int, 0, var10, var11 + param3);
          param8.b(-1 + param5, -1 + param4, param1);
          param8.b(param5 - 1, param4 + 1, param1);
          gf.b(rp.field_e);
          gf.a(1 + var9_int, 0, var10 + 1, param3 + var11);
          param8.b(1 + param5, param4 - 1, param1);
          param8.b(1 + param5, 1 + param4, param1);
          gf.b(rp.field_e);
          var9_int = -param0 + (param5 + (param8.field_w + param8.field_y) - param2);
          var10 = param8.field_y + param8.field_w - (-param5 + param2) - param6;
          gf.a(var9_int, -param3 + var11, var10, 480);
          param8.b(-1 + param5, param4 - 1, param1);
          param8.b(param5 - 1, 1 + param4, param1);
          gf.b(rp.field_e);
          gf.a(var9_int + 1, var11 - param3, 1 + var10, 480);
          param8.b(1 + param5, param4 - 1, param1);
          param8.b(param5 + 1, 1 + param4, param1);
          gf.b(rp.field_e);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "rk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        cn var9 = null;
        var8 = DungeonAssault.field_K;
        try {
          if (this.field_m) {
            return;
          }
          if (this.field_n) {
            this.field_n = false;
            throw new IOException();
          }
          if (null == this.field_c) {
            this.field_c = new byte[this.field_j];
          }
          var5 = this;
          synchronized (var5) {
            if (param1) {
              var9 = (cn) null;
              rk.a(-80, 100, -128, -38, -21, -28, 61, -115, (cn) null);
            }
            for (var6 = 0; param3 > var6; var6++) {
              this.field_c[this.field_i] = param0[param2 + var6];
              this.field_i = (this.field_i + 1) % this.field_j;
              if ((-100 + this.field_j + this.field_d) % this.field_j == this.field_i) {
                throw new IOException();
              }
            }
            if (null == this.field_e) {
              this.field_e = this.field_b.a(-21432, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("rk.E(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private rk(java.net.Socket param0, qg param1, int param2) throws IOException {
        this.field_i = 0;
        this.field_n = false;
        this.field_m = false;
        this.field_d = 0;
        try {
          this.field_b = param1;
          this.field_h = param0;
          this.field_h.setSoTimeout(30000);
          this.field_h.setTcpNoDelay(true);
          this.field_g = this.field_h.getInputStream();
          this.field_o = this.field_h.getOutputStream();
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "rk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Snare";
        field_f = new String[]{"Toughness", "Any lethal blow becomes <col=FF0000>Defence -1</col>."};
        field_k = new String[]{null, "<%highlight>It's generally best to attack a player close to you in the table.</col> Players much higher than you are likely to be better defended, with more ferocious <%monsters> and devious <%traps>. Players far beneath you may be easier to assault, but the potential gains will be low."};
    }
}
