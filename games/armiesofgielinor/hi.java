/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hi implements Runnable {
    static String field_h;
    private OutputStream field_n;
    private hd field_e;
    static String[] field_m;
    private int field_b;
    private boolean field_k;
    private InputStream field_f;
    static ep field_i;
    private wo field_d;
    static String field_a;
    private java.net.Socket field_l;
    private byte[] field_c;
    private int field_p;
    private int field_g;
    private boolean field_o;
    static int field_j;

    final static void a(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 != 41) {
          return;
        }
        if (va.field_w == null) {
          return;
        }
        var1 = va.field_w;
        synchronized (var1) {
          va.field_w = null;
        }
        return;
    }

    public static void b(byte param0) {
        field_h = null;
        if (param0 > 72) {
          field_m = null;
          field_i = null;
          field_a = null;
          return;
        }
        field_h = (String) null;
        field_m = null;
        field_i = null;
        field_a = null;
    }

    hi(java.net.Socket param0, hd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_k) {
            return;
          }
          if (this.field_o) {
            this.field_o = false;
            throw new IOException();
          }
          if (this.field_c == null) {
            this.field_c = new byte[this.field_p];
          }
          var5 = this;
          synchronized (var5) {
            if (param1 != 20) {
              return;
            }
            for (var6 = 0; param3 > var6; var6++) {
              this.field_c[this.field_g] = param0[param2 + var6];
              this.field_g = (this.field_g + 1) % this.field_p;
              if (this.field_g == (-100 + this.field_p + this.field_b) % this.field_p) {
                throw new IOException();
              }
            }
            if (null == this.field_d) {
              this.field_d = this.field_e.a(3, param1 - 20, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("hi.D(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 0) {
            this.run();
          }
          if (this.field_k) {
            return;
          }
          while (0 < param2) {
            var5_int = this.field_f.read(param3, param1, param2);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            param2 = param2 - var5_int;
            param1 = param1 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("hi.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int d(byte param0) throws IOException {
        if (this.field_k) {
          return 0;
        }
        if (param0 != 43) {
          field_j = -2;
          return this.field_f.available();
        }
        return this.field_f.available();
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
          var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_g == this.field_b) {
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
                  if (this.field_g < this.field_b) {
                    var1_int = -this.field_b + this.field_p;
                  } else {
                    var1_int = -this.field_b + this.field_g;
                  }
                  var2 = this.field_b;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_f) {
                    this.field_f.close();
                  }
                  if (this.field_n != null) {
                    this.field_n.close();
                  }
                  if (null != this.field_l) {
                    this.field_l.close();
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
                this.field_n.write(this.field_c, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_o = true;
              }
              this.field_b = (var1_int + this.field_b) % this.field_p;
              try {
                if (this.field_b == this.field_g) {
                  this.field_n.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_o = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            af.a((Throwable) ((Object) var1_ref), -65, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        int var1 = 0;
        if (bp.field_e <= 32) {
          mh.a(0, (byte) -109);
        } else {
          var1 = bp.field_e % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          mh.a(bp.field_e - var1, (byte) -109);
        }
        if (param0) {
          hi.b((byte) -114);
          return;
        }
    }

    final void c(byte param0) {
        try {
          InterruptedException var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          if (this.field_k) {
            return;
          }
          var2_ref = this;
          synchronized (var2_ref) {
            this.field_k = true;
            this.notifyAll();
          }
          if (param0 != -45) {
            return;
          }
          if (this.field_d != null) {
            while (this.field_d.field_g == 0) {
              nu.a(1L, 0);
            }
            if (this.field_d.field_g == 1) {
              try {
                ((Thread) (this.field_d.field_f)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (InterruptedException) (Object) decompiledCaughtException;
              }
            }
          }
          this.field_d = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
          return;
        }
        if (this.field_k) {
          return;
        }
        if (this.field_o) {
          this.field_o = false;
          throw new IOException();
        }
    }

    protected final void finalize() {
        this.c((byte) -45);
    }

    final int a(int param0) throws IOException {
        if (this.field_k) {
          return 0;
        }
        if (param0 > 1) {
          return this.field_f.read();
        }
        field_j = 65;
        return this.field_f.read();
    }

    private hi(java.net.Socket param0, hd param1, int param2) throws IOException {
        this.field_b = 0;
        this.field_o = false;
        this.field_g = 0;
        this.field_k = false;
        try {
          this.field_e = param1;
          this.field_l = param0;
          this.field_l.setSoTimeout(30000);
          this.field_l.setTcpNoDelay(true);
          this.field_f = this.field_l.getInputStream();
          this.field_n = this.field_l.getOutputStream();
          this.field_p = param2;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = "You currently have an ongoing mission in progress<br><br><col=FFFF00><%0></col>.<br><br>Starting a new mission will abort the currently ongoing mission.<br><br>Do you wish to continue?";
        field_m = new String[]{"Skirmish", "Warrior", "Ranger", "Mage", "Flying", "Helper", "Creeper", "Titan"};
        field_a = "Earn runes to access new gods and units.";
    }
}
