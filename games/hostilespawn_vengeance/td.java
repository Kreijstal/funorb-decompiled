/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class td implements Runnable {
    private boolean field_h;
    private InputStream field_b;
    private boolean field_e;
    private int field_m;
    static java.util.zip.CRC32 field_a;
    private OutputStream field_q;
    private int field_j;
    private kk field_k;
    static bd field_f;
    private int field_i;
    private fd field_g;
    static int[] field_d;
    static long field_c;
    static vl field_o;
    static String field_p;
    private java.net.Socket field_n;
    private byte[] field_l;

    td(java.net.Socket param0, fd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) {
        try {
          int var4 = 0;
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (this.field_e) {
            return;
          }
          synchronized (this) {
            this.field_e = true;
            this.notifyAll();
          }
          if (null != this.field_k) {
            while (this.field_k.field_f == 0) {
              vj.a(1L, (byte) -49);
            }
            if (this.field_k.field_f == 1) {
              try {
                ((Thread) (this.field_k.field_c)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          int var2 = -81 % ((param0 + 12) / 41);
          this.field_k = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int b(byte param0) throws IOException {
        if (this.field_e) {
          return 0;
        }
        if (param0 < 26) {
          this.field_l = (byte[]) null;
        }
        return this.field_b.available();
    }

    public static void b(int param0) {
        if (param0 != 200) {
          td.b(-94);
        }
        field_d = null;
        field_f = null;
        field_o = null;
        field_p = null;
        field_a = null;
    }

    final static void c(byte param0) {
        if (!jk.a(-23322)) {
          return;
        }
        hh.a(5, 4, false);
        if (param0 <= 104) {
          field_d = (int[]) null;
        }
    }

    final int d(byte param0) throws IOException {
        if (this.field_e) {
          return 0;
        }
        int var2 = 118 % ((-52 - param0) / 44);
        return this.field_b.read();
    }

    protected final void finalize() {
        this.a(118);
    }

    final static boolean a(vb param0, boolean param1, vb param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_int = param2.field_Gb - param0.field_Gb;
          if (!param1) {
            field_p = (String) null;
          }
          if (param2.field_Mb == eg.field_w) {
            var3_int -= 200;
          } else {
            if (null == param2.field_Mb) {
              var3_int += 200;
            }
          }
          if (param0.field_Mb != eg.field_w) {
            if (null == param0.field_Mb) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("td.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(nj.a(param0, true, var2), "_top");
              if (param1 != 200) {
                td.b(-26);
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("td.A(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
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
          var6 = HostileSpawn.field_I ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_i == this.field_j) {
                  if (this.field_e) {
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
                  if (this.field_j <= this.field_i) {
                    var1_int = -this.field_j + this.field_i;
                  } else {
                    var1_int = this.field_m - this.field_j;
                  }
                  var2 = this.field_j;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_b != null) {
                    this.field_b.close();
                  }
                  if (this.field_q != null) {
                    this.field_q.close();
                  }
                  if (this.field_n != null) {
                    this.field_n.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_l = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_q.write(this.field_l, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_h = true;
              }
              this.field_j = (var1_int + this.field_j) % this.field_m;
              try {
                if (this.field_j == this.field_i) {
                  this.field_q.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_h = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            ic.a((byte) -120, (String) null, (Throwable) ((Object) var1_ref));
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        int var9 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (this.field_e) {
            return;
          }
          if (this.field_h) {
            this.field_h = false;
            throw new IOException();
          }
          var5_int = 100 % ((param2 + 12) / 42);
          if (null == this.field_l) {
            this.field_l = new byte[this.field_m];
          }
          var6 = this;
          synchronized (var6) {
            for (var7 = 0; var7 < param0; var7++) {
              this.field_l[this.field_i] = param1[var7 + param3];
              this.field_i = (this.field_i + 1) % this.field_m;
              if ((this.field_m + (this.field_j - 100)) % this.field_m == this.field_i) {
                throw new IOException();
              }
            }
            if (null == this.field_k) {
              this.field_k = this.field_g.a(3, (Runnable) (this), 85);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("td.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private td(java.net.Socket param0, fd param1, int param2) throws IOException {
        this.field_h = false;
        this.field_e = false;
        this.field_i = 0;
        this.field_j = 0;
        try {
          this.field_g = param1;
          this.field_n = param0;
          this.field_n.setSoTimeout(30000);
          this.field_n.setTcpNoDelay(true);
          this.field_b = this.field_n.getInputStream();
          this.field_q = this.field_n.getOutputStream();
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0) throws IOException {
        if (this.field_e) {
          return;
        }
        if (this.field_h) {
          this.field_h = false;
          throw new IOException();
        }
        int var2 = 69 / ((param0 - 81) / 32);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (this.field_e) {
            return;
          }
          if (param0 != -1) {
            field_o = (vl) null;
          }
          while (param3 > 0) {
            var5_int = this.field_b.read(param1, param2, param3);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param3 = param3 - var5_int;
            param2 = param2 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("td.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = new java.util.zip.CRC32();
        field_d = new int[]{5};
        field_p = "Oh, a blast door. A rocket launcher would be useful at this point.";
        field_o = new vl();
    }
}
