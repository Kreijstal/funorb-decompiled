/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ge implements Runnable {
    private int field_a;
    private InputStream field_b;
    private int field_i;
    private int field_k;
    private ab field_d;
    private byte[] field_f;
    private java.net.Socket field_g;
    private ei field_c;
    private boolean field_l;
    private OutputStream field_h;
    private boolean field_j;
    static String field_e;

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          if (this.field_l) {
            return;
          }
          while (0 < param2) {
            var5_int = this.field_b.read(param0, param3, param2);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param3 = param3 + var5_int;
            param2 = param2 - var5_int;
          }
          if (param1 != -109) {
            field_e = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ge.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected final void finalize() {
        this.b(58);
    }

    ge(java.net.Socket param0, ab param1) throws IOException {
        this(param0, param1, 5000);
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -59) {
          field_e = (String) null;
        }
    }

    final static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        f var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        th var13 = null;
        int var14 = 0;
        th var15 = null;
        int[][] var19 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          var13 = ig.field_a;
          var15 = var13;
          var2 = var15.d(true);
          if (param0 <= 105) {
            ge.f(-123);
          }
          var3 = (f) (dj.field_c.a(true));
          while (var3 != null) {
            if (var3.field_k != var2) {
              var3 = (f) (dj.field_c.f(2));
              continue;
            }
            break;
          }
          if (var3 == null) {
            ck.$cfr$intArgs$b$e683eeaaf5b5(-47);
            return;
          }
          var4 = var15.d(true);
          if (var4 != 0) {
            var5 = var3.field_j;
            ph.field_a[0] = og.field_c;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              ph.field_a[var6_int] = var13.c(false);
            }
            fb.a((byte) -107, var5, var4);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              lh.a(var15, -95);
              if (var6_intLifetime1 == 0) {
                ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_intLifetime1, ki.field_g);
              } else {
                ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_intLifetime1, ki.field_g);
              }
            }
            bh.b((byte) 83, var5);
            var6 = new String[2][var5];
            var19 = new int[2][4 * var5];
            var8 = pf.field_o;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = ff.field_a[var9];
              var6[0][var10] = ph.field_a[var11];
              var19[0][4 * var10] = we.field_g[var11];
              var19[0][1 + 4 * var10] = l.field_D[var11];
              var19[0][2 + var10 * 4] = oc.field_a[var11];
              var19[0][var10 * 4 + 3] = hl.field_N[var11];
              if (md.a(ph.field_a[var11], -113) &&
                oc.field_a[var11] + (l.field_D[var11] + hl.field_N[var11]) == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = ff.field_a[var5 + var9Lifetime1];
              var6[1][var14] = ph.field_a[var11Lifetime1];
              var19[1][var14 * 4] = we.field_g[var11Lifetime1];
              var19[1][1 + 4 * var14] = l.field_D[var11Lifetime1];
              var19[1][2 + 4 * var14] = oc.field_a[var11Lifetime1];
              var19[1][var14 * 4 + 3] = hl.field_N[var11Lifetime1];
              if (md.a(ph.field_a[var11Lifetime1], -101) &&
                0 == hl.field_N[var11Lifetime1] + oc.field_a[var11Lifetime1] + l.field_D[var11Lifetime1]) {
                var6[1][var14] = null;
                var14--;
              }
              var14++;
              var9Lifetime1++;
            }
            var3.b((byte) -127);
            return;
          }
          var3.b((byte) -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "ge.K(" + param0 + ')');
        }
    }

    final static void a(byte param0, int param1, wf param2, ab param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_39_0 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          StringBuilder stackIn_42_1 = null;
          String stackIn_43_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var7 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          pd var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = Lexicominos.field_L ? 1 : 0;
          try {
            var18 = new pd();
            var18.field_p = param2.d(true);
            var18.field_j = param2.d((byte) 19);
            var18.field_n = new int[var18.field_p];
            var18.field_h = new int[var18.field_p];
            if (param0 > -120) {
              ge.a((byte) -107);
            }
            var18.field_i = new ei[var18.field_p];
            var18.field_k = new ei[var18.field_p];
            var18.field_m = new int[var18.field_p];
            var18.field_o = new byte[var18.field_p][][];
            for (var5 = 0; var18.field_p > var5; var5++) {
              try {
                var6_int = param2.d(true);
                if (0 != var6_int &&
                  1 != var6_int &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param2.c(false);
                    var8 = param2.c(false);
                    var9 = param2.d(true);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param2.c(false);
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param2.d((byte) 19);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param2.a(116, var13, 0, var21[var12_int]);
                      }
                    }
                    var18.field_m[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = qf.a(-4174, var10[var17]);
                      var17++;
                    }
                    var18.field_i[var5] = param3.a(var8, qf.a(-4174, var20), var12, (byte) 113);
                    var18.field_o[var5] = var21;
                  }
                } else {
                  var16 = param2.c(false);
                  var7 = var16;
                  var15 = param2.c(false);
                  var8 = var15;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param2.d((byte) 19);
                  }
                  var18.field_m[var5] = var6_int;
                  var18.field_h[var5] = var9;
                  var18.field_k[var5] = param3.a(var15, 2, qf.a(-4174, var16));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_n[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_n[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_n[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_n[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_n[var5] = -5;
              }
            }
            al.field_C.b(124, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_39_0 = var4;
            stackIn_39_1 = new StringBuilder().append("ge.H(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
            if (param3 == null) {
              stackIn_43_2 = "null";
            } else {
              stackIn_43_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(int param0) throws IOException {
        if (this.field_l) {
          return 0;
        }
        if (param0 != -6448) {
          this.field_k = 100;
        }
        return this.field_b.available();
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param0 != 0) {
                return;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(gf.a(3, var2, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("ge.J(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
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
          var6 = Lexicominos.field_L ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_k == this.field_i) {
                  if (this.field_l) {
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
                  var2 = this.field_k;
                  if (this.field_k <= this.field_i) {
                    var1_int = this.field_i - this.field_k;
                  } else {
                    var1_int = this.field_a - this.field_k;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_b) {
                    this.field_b.close();
                  }
                  if (this.field_h != null) {
                    this.field_h.close();
                  }
                  if (null != this.field_g) {
                    this.field_g.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_f = null;
                break;
              }
              if (0 >= var1_int) {
                continue;
              }
              try {
                this.field_h.write(this.field_f, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_j = true;
              }
              this.field_k = (this.field_k + var1_int) % this.field_a;
              try {
                if (this.field_k == this.field_i) {
                  this.field_h.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_j = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            uj.a((String) null, (Throwable) ((Object) var1_ref), 1);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        int var1 = hc.f(-1980);
        if (param0 < 55) {
          field_e = (String) null;
        }
        int var2 = eb.d((byte) -6);
        ki.field_a.a(rf.field_c - id.field_v, (id.field_v << 1) + var2, var1 + (wh.field_f << 1), me.field_v - wh.field_f, -1160208572);
        hi.b(0);
    }

    final int e(int param0) throws IOException {
        if (param0 != 291208897) {
          return -65;
        }
        if (this.field_l) {
          return 0;
        }
        return this.field_b.read();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          if (this.field_l) {
            return;
          }
          if (this.field_j) {
            this.field_j = false;
            throw new IOException();
          }
          var5_int = 120 / ((param2 + 44) / 56);
          if (null == this.field_f) {
            this.field_f = new byte[this.field_a];
          }
          var6 = this;
          synchronized (var6) {
            for (var7 = 0; param1 > var7; var7++) {
              this.field_f[this.field_i] = param0[param3 + var7];
              this.field_i = (this.field_i + 1) % this.field_a;
              if (this.field_i == (this.field_a + (this.field_k - 100)) % this.field_a) {
                throw new IOException();
              }
            }
            if (this.field_c == null) {
              this.field_c = this.field_d.a((Runnable) (this), false, 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("ge.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0) {
        try {
          int var4 = 0;
          var4 = Lexicominos.field_L ? 1 : 0;
          if (this.field_l) {
            return;
          }
          if (param0 <= 13) {
            this.field_d = (ab) null;
          }
          synchronized (this) {
            this.field_l = true;
            this.notifyAll();
          }
          if (this.field_c != null) {
            while (this.field_c.field_b == 0) {
              ge.a(0, 1L);
            }
            if (1 == this.field_c.field_b) {
              try {
                ((Thread) (this.field_c.field_g)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_c = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) throws IOException {
        if (this.field_l) {
          return;
        }
        if (param0 != 0) {
          return;
        }
        if (this.field_j) {
          this.field_j = false;
          throw new IOException();
        }
    }

    final static void a(int param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if ((long)param0 == param1 % 10L) {
          wa.a((byte) 5, -1L + param1);
          wa.a((byte) 5, 1L);
        } else {
          wa.a((byte) 5, param1);
        }
    }

    private ge(java.net.Socket param0, ab param1, int param2) throws IOException {
        this.field_k = 0;
        this.field_i = 0;
        this.field_l = false;
        this.field_j = false;
        try {
          this.field_g = param0;
          this.field_d = param1;
          this.field_g.setSoTimeout(30000);
          this.field_g.setTcpNoDelay(true);
          this.field_b = this.field_g.getInputStream();
          this.field_h = this.field_g.getOutputStream();
          this.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
