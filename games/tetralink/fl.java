/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fl implements Runnable {
    private OutputStream field_i;
    static int field_g;
    private java.net.Socket field_f;
    static String field_a;
    static int field_b;
    private int field_k;
    static kc field_o;
    private vl field_r;
    private int field_v;
    private ie field_d;
    private byte[] field_t;
    static ji field_n;
    private boolean field_m;
    static int field_q;
    static int[] field_c;
    private int field_l;
    static boolean field_s;
    static lk field_u;
    static String field_h;
    private boolean field_p;
    static String field_e;
    private InputStream field_j;

    public static void b(int param0) {
        field_c = null;
        field_o = null;
        field_e = null;
        field_a = null;
        field_u = null;
        if (param0 != -26787) {
          field_b = 24;
        }
        field_h = null;
        field_n = null;
    }

    final int c(int param0) throws IOException {
        if (param0 != 3) {
          fl.b(95);
        }
        if (this.field_m) {
          return 0;
        }
        return this.field_j.read();
    }

    final void d(int param0) {
        try {
          int var4 = 0;
          var4 = TetraLink.field_J;
          if (this.field_m) {
            return;
          }
          synchronized (this) {
            this.field_m = true;
            this.notifyAll();
            if (param0 != -15488) {
              this.finalize();
            }
          }
          if (null != this.field_r) {
            while (this.field_r.field_d == 0) {
              tb.a(false, 1L);
            }
            if (1 == this.field_r.field_d) {
              try {
                ((Thread) (this.field_r.field_f)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_r = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        this.d(-15488);
    }

    fl(java.net.Socket param0, ie param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TetraLink.field_J;
        try {
          if (this.field_m) {
            return;
          }
          if (param3 != 0) {
            field_u = (lk) null;
          }
          while (param1 > 0) {
            var5_int = this.field_j.read(param2, param0, param1);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param0 = param0 + var5_int;
            param1 = param1 - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fl.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0) throws IOException {
        if (this.field_m) {
          return;
        }
        if (this.field_p) {
          this.field_p = false;
          throw new IOException();
        }
        if (param0 != 100) {
          this.d(-94);
        }
    }

    final static hb e(int param0) {
        String var1 = sa.a((byte) -39);
        if (param0 != 1) {
          CharSequence var2 = (CharSequence) null;
          fl.a((byte) 60, (CharSequence) null);
        }
        if (var1 != null &&
          !(0 > var1.indexOf('@'))) {
          var1 = "";
        }
        return new hb(sa.a((byte) -113), pm.a(true));
    }

    final void a(boolean param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        try {
          if (this.field_m) {
            return;
          }
          if (this.field_p) {
            this.field_p = false;
            throw new IOException();
          }
          if (this.field_t == null) {
            this.field_t = new byte[this.field_k];
          }
          var5 = this;
          synchronized (var5) {
            var6 = 0;
            if (!param0) {
              field_s = false;
            }
            while (var6 < param1) {
              this.field_t[this.field_v] = param2[var6 + param3];
              this.field_v = (this.field_v + 1) % this.field_k;
              if ((this.field_k + this.field_l - 100) % this.field_k == this.field_v) {
                throw new IOException();
              }
              var6++;
            }
            if (null == this.field_r) {
              this.field_r = this.field_d.a((Runnable) (this), 88, 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("fl.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
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
          var6 = TetraLink.field_J;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_l == this.field_v) {
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
                  var2 = this.field_l;
                  if (this.field_v >= this.field_l) {
                    var1_int = this.field_v - this.field_l;
                  } else {
                    var1_int = -this.field_l + this.field_k;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_j != null) {
                    this.field_j.close();
                  }
                  if (this.field_i != null) {
                    this.field_i.close();
                  }
                  if (null != this.field_f) {
                    this.field_f.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_t = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_i.write(this.field_t, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_p = true;
              }
              this.field_l = (this.field_l + var1_int) % this.field_k;
              try {
                if (this.field_l == this.field_v) {
                  this.field_i.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_p = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            fk.a(-55, (Throwable) ((Object) var1_ref), (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 119) {
            fl.e(92);
          }
          stackIn_3_0 = ti.a(45, param1, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int f(int param0) throws IOException {
        if (param0 != 0) {
          this.field_i = (OutputStream) null;
        }
        if (this.field_m) {
          return 0;
        }
        return this.field_j.available();
    }

    private fl(java.net.Socket param0, ie param1, int param2) throws IOException {
        this.field_v = 0;
        this.field_m = false;
        this.field_l = 0;
        this.field_p = false;
        try {
          this.field_f = param0;
          this.field_d = param1;
          this.field_f.setSoTimeout(30000);
          this.field_f.setTcpNoDelay(true);
          this.field_j = this.field_f.getInputStream();
          this.field_i = this.field_f.getOutputStream();
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = new int[]{6000, 4500, 3000, 2250, 1500, 1000, 500};
        field_q = 0;
        field_a = "Waiting for extra data";
        field_s = false;
        field_e = "You are playing <%0>.";
        field_h = "You have declined the invitation.";
    }
}
