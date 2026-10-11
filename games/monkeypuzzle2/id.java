/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id implements Runnable {
    static String field_h;
    private java.net.Socket field_j;
    private OutputStream field_b;
    static int field_a;
    private md field_f;
    private InputStream field_g;
    private ic field_d;
    private int field_l;
    static int field_m;
    private byte[] field_c;
    private int field_e;
    private boolean field_n;
    private boolean field_i;
    private int field_k;

    protected final void finalize() {
        this.a((byte) 73);
    }

    final int a(int param0) throws IOException {
        if (param0 != -16840) {
          return 43;
        }
        if (this.field_n) {
          return 0;
        }
        return this.field_g.read();
    }

    final void a(byte param0) {
        try {
          int var4 = 0;
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (this.field_n) {
            return;
          }
          synchronized (this) {
            this.field_n = true;
            this.notifyAll();
          }
          if (this.field_d != null) {
            while (this.field_d.field_g == 0) {
              em.a(1L, false);
            }
            if (1 == this.field_d.field_g) {
              try {
                ((Thread) (this.field_d.field_b)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_d = null;
          if (param0 != 73) {
            this.field_n = true;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) throws IOException {
        if (this.field_n) {
          return;
        }
        if (this.field_i) {
          this.field_i = false;
          throw new IOException();
        }
        int var2 = 122 / ((-61 - param0) / 56);
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        dd var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var11Lifetime5Lifetime1;
        String var11Lifetime5Lifetime2;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 instanceof dd) {
          var14 = (dd) ((Object) param0);
          param0 = var14.field_b;
          var2 = var14.field_c + " | ";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
        } else {
          var2 = "";
        }
        if (param1 != 37) {
          field_h = (String) null;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var11Lifetime3 = var7;
        var2Lifetime2 = var11Lifetime3;
        var11Lifetime4 = var7;
        while (true) {
          var8 = var6.readLine();
          var11Lifetime5 = var8;
          var2Lifetime3 = var11Lifetime5;
          var11Lifetime5Lifetime1 = var8;
          if (var8 == null) {
            var2Lifetime3 = var2Lifetime3 + "| " + var7;
            return var2Lifetime3;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (var9 == -1) {
            var11Lifetime5Lifetime2 = var8;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
          } else {
            var11Lifetime5Lifetime2 = var8.substring(0, var9);
          }
          var16 = var11Lifetime5Lifetime2.trim();
          var2Lifetime3Lifetime2 = var16;
          var2Lifetime3Lifetime3 = var16;
          var17 = var16.substring(1 + var16.lastIndexOf(' '));
          var2Lifetime3Lifetime4 = var17;
          var2Lifetime3Lifetime5 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var2Lifetime3Lifetime7 + var18;
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var2Lifetime3Lifetime10 = var19;
          if (var9 != -1) {
            if (var10 == -1) {
              var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime10 = var19 + var8.substring(5 + var12, var10);
            }
          }
          var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
        }
    }

    id(java.net.Socket param0, md param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (this.field_n) {
            return;
          }
          if (this.field_i) {
            this.field_i = false;
            throw new IOException();
          }
          if (this.field_c == null) {
            this.field_c = new byte[this.field_k];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; var6 < param3; var6++) {
              this.field_c[this.field_e] = param0[var6 + param1];
              this.field_e = (this.field_e + 1) % this.field_k;
              if ((-100 + (this.field_k + this.field_l)) % this.field_k == this.field_e) {
                throw new IOException();
              }
            }
            if (null == this.field_d) {
              this.field_d = this.field_f.a((Runnable) (this), 3, 0);
            }
            if (param2 < 12) {
              this.a((byte) 110);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("id.F(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 != 1) {
          field_h = (String) null;
        }
    }

    final void a(int param0, boolean param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (this.field_n) {
            return;
          }
          while (0 < param0) {
            var5_int = this.field_g.read(param2, param3, param0);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param0 = param0 - var5_int;
            param3 = param3 + var5_int;
          }
          if (!param1) {
            this.a((byte) 64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("id.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
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
          var6 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_e == this.field_l) {
                  if (this.field_n) {
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
                  if (this.field_e < this.field_l) {
                    var1_int = this.field_k - this.field_l;
                  } else {
                    var1_int = this.field_e - this.field_l;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_g != null) {
                    this.field_g.close();
                  }
                  if (this.field_b != null) {
                    this.field_b.close();
                  }
                  if (null != this.field_j) {
                    this.field_j.close();
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
                this.field_b.write(this.field_c, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_i = true;
              }
              this.field_l = (this.field_l + var1_int) % this.field_k;
              try {
                if (this.field_e == this.field_l) {
                  this.field_b.flush();
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
            kk.a((String) null, (byte) 69, (Throwable) ((Object) var1_ref));
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(int param0) throws IOException {
        int var2 = -80 % ((param0 + 42) / 38);
        if (this.field_n) {
          return 0;
        }
        return this.field_g.available();
    }

    private id(java.net.Socket param0, md param1, int param2) throws IOException {
        this.field_l = 0;
        this.field_n = false;
        this.field_e = 0;
        this.field_i = false;
        try {
          this.field_j = param0;
          this.field_f = param1;
          this.field_j.setSoTimeout(30000);
          this.field_j.setTcpNoDelay(true);
          this.field_g = this.field_j.getInputStream();
          this.field_b = this.field_j.getOutputStream();
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = "Type your password again to make sure it's correct";
        field_a = 250;
    }
}
