/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pj implements Runnable {
    static QuickChatDynamicCommand field_k;
    private boolean field_f;
    private java.net.Socket field_i;
    private int field_j;
    private int field_d;
    private boolean field_c;
    private SystemTask field_m;
    private byte[] field_l;
    private SystemTaskService field_e;
    static Sprite[] field_g;
    private InputStream field_h;
    private OutputStream field_b;
    private int field_a;

    final void c(int param0) {
        try {
          int var4 = EscapeVector.obfuscationControl;
          if (this.field_f) {
            return;
          }
          Object var2 = this;
          synchronized (var2) {
            this.field_f = true;
            this.notifyAll();
          }
          if (param0 != 12497) {
            this.field_i = (java.net.Socket) null;
          }
          if (this.field_m != null) {
            while (0 == this.field_m.field_f) {
              en.a((byte) 81, 1L);
            }
            if (this.field_m.field_f == 1) {
              try {
                ((Thread) (this.field_m.field_b)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                Throwable decompiledCaughtException = decompiledCaughtParameter0;
                InterruptedException var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                this.field_m = null;
                return;
              }
            }
          }
          this.field_m = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        this.c(12497);
    }

    final void a(byte param0) throws IOException {
        if (this.field_f) {
          return;
        }
        if (param0 != 123) {
          pj.releaseStatics((byte) 28);
          if (this.field_c) {
            this.field_c = false;
            throw new IOException();
          }
          return;
        }
        if (this.field_c) {
          this.field_c = false;
          throw new IOException();
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        String stackIn_30_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (this.field_f) {
            return;
          }
          if (this.field_c) {
            this.field_c = false;
            throw new IOException();
          }
          if (this.field_l == null) {
            this.field_l = new byte[this.field_j];
          }
          Object var5 = this;
          synchronized (var5) {
            for (int var6 = 0; param0 > var6; var6++) {
              this.field_l[this.field_d] = param2[param1 + var6];
              this.field_d = (this.field_d + 1) % this.field_j;
              if (~((-100 + this.field_a + this.field_j) % this.field_j) == ~this.field_d) {
                throw new IOException();
              }
            }
            if (this.field_m == null) {
              this.field_m = this.field_e.a(true, 3, (Runnable) (this));
            }
            if (param3 != 5000) {
              return;
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_29_0 = var5_ref;
          StringBuilder stackIn_29_1 = new StringBuilder().append("pj.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    final int b(int param0) throws IOException {
        if (this.field_f) {
          return 0;
        }
        if (param0 < -116) {
          return this.field_h.available();
        }
        this.run();
        return this.field_h.available();
    }

    pj(java.net.Socket param0, SystemTaskService param1) throws IOException {
        this(param0, param1, 5000);
    }

    public static void releaseStatics(byte guard) {
        field_g = null;
        field_k = null;
        if (guard == 6) {
          return;
        }
        pj.releaseStatics((byte) -119);
    }

    final int a(int param0) throws IOException {
        if (param0 != -16650) {
          return 22;
        }
        if (this.field_f) {
          return 0;
        }
        return this.field_h.read();
    }

    public final void run() {
        try {
          boolean decompiledRegionSelector0 = false;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          int var2 = 0;
          IOException var3_ref = null;
          int var6 = EscapeVector.obfuscationControl;
          try {
            while (true) {
              Object var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_d == this.field_a) {
                  if (this.field_f) {
                    decompiledRegionSelector0 = false;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      InterruptedException var4 = (InterruptedException) (Object) decompiledCaughtException;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  var2 = this.field_a;
                  if (this.field_d >= this.field_a) {
                    var1_int = this.field_d - this.field_a;
                  } else {
                    var1_int = -this.field_a + this.field_j;
                  }
                  decompiledRegionSelector0 = true;
                }
              }
              if (!decompiledRegionSelector0) {
                try {
                  if (this.field_h != null) {
                    this.field_h.close();
                  }
                  if (this.field_b != null) {
                    this.field_b.close();
                  }
                  if (null != this.field_i) {
                    this.field_i.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  IOException var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_l = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_b.write(this.field_l, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_c = true;
              }
              this.field_a = (var1_int + this.field_a) % this.field_j;
              try {
                if (this.field_a == this.field_d) {
                  this.field_b.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_c = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            Exception var1_ref = (Exception) (Object) decompiledCaughtException;
            String var7 = (String) null;
            pf.a(false, (String) null, (Throwable) ((Object) var1_ref));
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (param3 != -49) {
            return;
          }
          if (this.field_f) {
            return;
          }
          while (param1 > 0) {
            int var5_int = this.field_h.read(param2, param0, param1);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param0 = param0 + var5_int;
            param1 = param1 - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("pj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private pj(java.net.Socket param0, SystemTaskService param1, int param2) throws IOException {
        this.field_f = false;
        this.field_d = 0;
        this.field_c = false;
        this.field_a = 0;
        try {
          this.field_i = param0;
          this.field_e = param1;
          this.field_i.setSoTimeout(30000);
          this.field_i.setTcpNoDelay(true);
          this.field_h = this.field_i.getInputStream();
          this.field_b = this.field_i.getOutputStream();
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_k = new QuickChatDynamicCommand(7, 0, 1, 1);
    }
}
