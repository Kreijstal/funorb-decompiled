/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wb implements Runnable {
    private InputStream field_b;
    static qe field_p;
    static String[] field_n;
    private uj field_c;
    static String field_m;
    private boolean field_k;
    private boolean field_e;
    private java.net.Socket field_i;
    private int field_a;
    static int field_d;
    private OutputStream field_f;
    private int field_l;
    private byte[] field_o;
    private mi field_h;
    private int field_g;
    static String field_q;
    static int field_j;

    public static void a(boolean param0) {
        if (param0) {
          field_q = null;
          field_p = null;
          field_n = null;
          field_m = null;
          return;
        }
        field_d = -75;
        field_q = null;
        field_p = null;
        field_n = null;
        field_m = null;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != -1) {
            return;
          }
          if (this.field_k) {
            return;
          }
          while (param2 > 0) {
            var5_int = this.field_b.read(param3, param1, param2);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param1 = param1 + var5_int;
            param2 = param2 - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("wb.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        ee.a(param0, 1, false);
        if (param1 <= -66) {
          return;
        }
        field_q = (String) null;
    }

    protected final void finalize() {
        this.a((byte) -90);
    }

    final static void b(byte param0) {
        kd var1 = (kd) (mc.field_k.d((byte) -119));
        if (var1 == null) {
          var1 = new kd();
        }
        var1.a(qg.field_g, qg.field_a, qg.field_i, qg.field_f, (byte) -8, qg.field_l, qg.field_c, qg.field_k);
        rf.field_db.a(var1, -84);
        int var2 = 126 / ((param0 + 23) / 54);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_k) {
            return;
          }
          if (this.field_e) {
            this.field_e = false;
            throw new IOException();
          }
          if (this.field_o == null) {
            this.field_o = new byte[this.field_g];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; param0 > var6; var6++) {
              this.field_o[this.field_l] = param3[param1 + var6];
              this.field_l = (this.field_l + 1) % this.field_g;
              if (~this.field_l == ~((-100 + this.field_a + this.field_g) % this.field_g)) {
                throw new IOException();
              }
            }
            if (null == this.field_h) {
              this.field_h = this.field_c.a((Runnable) (this), true, 3);
            }
            this.notifyAll();
            if (param2 < 57) {
              wb.a(true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_29_0 = var5_ref;
          stackIn_29_1 = new StringBuilder().append("wb.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    wb(java.net.Socket param0, uj param1) throws IOException {
        this(param0, param1, 5000);
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
          var6 = TorChallenge.field_F ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_a == this.field_l) {
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
                  if (this.field_l < this.field_a) {
                    var1_int = this.field_g - this.field_a;
                  } else {
                    var1_int = this.field_l - this.field_a;
                  }
                  var2 = this.field_a;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_b != null) {
                    this.field_b.close();
                  }
                  if (null != this.field_f) {
                    this.field_f.close();
                  }
                  if (this.field_i != null) {
                    this.field_i.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_o = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_f.write(this.field_o, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_e = true;
              }
              this.field_a = (var1_int + this.field_a) % this.field_g;
              try {
                if (this.field_l == this.field_a) {
                  this.field_f.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_e = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            td.a((String) null, (Throwable) ((Object) var1_ref), (byte) -84);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(int param0) throws IOException {
        if (param0 != 0) {
          wb.b((byte) 122);
          if (!this.field_k) {
            return this.field_b.read();
          }
          return 0;
        }
        if (!this.field_k) {
          return this.field_b.read();
        }
        return 0;
    }

    final void b(int param0) throws IOException {
        if (this.field_k) {
          return;
        }
        int var2 = 113 / ((67 - param0) / 58);
        if (this.field_e) {
          this.field_e = false;
          throw new IOException();
        }
    }

    final void a(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          Object var3 = null;
          InterruptedException var3_ref = null;
          int var5 = 0;
          var5 = TorChallenge.field_F ? 1 : 0;
          if (this.field_k) {
            return;
          }
          var2 = -85 / ((23 - param0) / 56);
          var3 = this;
          synchronized (var3) {
            this.field_k = true;
            this.notifyAll();
          }
          if (this.field_h != null) {
            while (this.field_h.field_d == 0) {
              c.a(115, 1L);
            }
            if (this.field_h.field_d == 1) {
              try {
                ((Thread) (this.field_h.field_g)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (InterruptedException) (Object) decompiledCaughtException;
                this.field_h = null;
                return;
              }
            }
          }
          this.field_h = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private wb(java.net.Socket param0, uj param1, int param2) throws IOException {
        this.field_l = 0;
        this.field_a = 0;
        this.field_e = false;
        this.field_k = false;
        try {
          this.field_c = param1;
          this.field_i = param0;
          this.field_i.setSoTimeout(30000);
          this.field_i.setTcpNoDelay(true);
          this.field_b = this.field_i.getInputStream();
          this.field_f = this.field_i.getOutputStream();
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "wb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0) throws IOException {
        if (this.field_k) {
          return 0;
        }
        if (param0 != 0) {
          wb.a(false, (byte) 115);
          return this.field_b.available();
        }
        return this.field_b.available();
    }

    static {
        field_n = new String[]{"Coin Collector", "Master of War", "Jade Collector", "Jade Expert", "Jade Master", "Bonus Walker", "Bonus Runner", "Bonus Sprinter", "Trainee Monk", "Enlightened Monk", "Master Monk", "Wise, Aged Master Monk", "Seal Collector", "Seal Expert", "Seal Master", "Agility Master", "Skilled Skuller"};
        field_m = "Loading...";
        field_q = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
