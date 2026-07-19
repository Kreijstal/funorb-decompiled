/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bh implements Runnable {
    private int field_n;
    static String field_h;
    private byte[] field_r;
    private boolean field_c;
    static String field_q;
    static hd field_u;
    private boolean field_e;
    private java.net.Socket field_b;
    private int field_o;
    private int field_d;
    private wu field_p;
    private bu field_g;
    private OutputStream field_m;
    private InputStream field_a;
    static String field_t;
    static int[] field_f;
    static int field_s;
    static int field_k;
    static String[] field_i;
    static int field_j;
    static int field_l;

    final int a(byte param0) throws IOException {
        if (!(!this.field_e)) {
            return 0;
        }
        if (param0 != 63) {
            return 121;
        }
        return this.field_a.available();
    }

    protected final void finalize() {
        this.a(1);
    }

    final int b(int param0) throws IOException {
        if (this.field_e) {
            return 0;
        }
        if (param0 != 1) {
            bh.c(-10);
        }
        return this.field_a.read();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param3 == -4847) {
                break L1;
              } else {
                this.finalize();
                break L1;
              }
            }
            if (this.field_e) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: while (true) {
                if (0 >= param1) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_a.read(param0, param2, param1);
                  if (var5_int <= 0) {
                    throw new EOFException();
                  } else {
                    param2 = param2 + var5_int;
                    param1 = param1 - var5_int;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("bh.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
            return;
        }
        fj.a(-45);
        qd.b(38, 4);
    }

    public final void run() {
        try {
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            IOException var3 = null;
            Object var3_ref = null;
            InterruptedException var4 = null;
            Throwable var5 = null;
            int var6 = 0;
            String var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = Kickabout.field_G;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_d != this.field_n) {
                          break L3;
                        } else {
                          if (!this.field_e) {
                            try {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L5: {
                                var4 = (InterruptedException) (Object) decompiledCaughtException;
                                break L5;
                              }
                            }
                            break L3;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          }
                        }
                      }
                      L6: {
                        if (this.field_d <= this.field_n) {
                          var1_int = -this.field_d + this.field_n;
                          break L6;
                        } else {
                          var1_int = -this.field_d + this.field_o;
                          break L6;
                        }
                      }
                      var2 = this.field_d;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (this.field_a != null) {
                            this.field_a.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != this.field_m) {
                            this.field_m.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null == this.field_b) {
                            break L10;
                          } else {
                            this.field_b.close();
                            break L10;
                          }
                        }
                        break L7;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L11: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L11;
                      }
                    }
                    this.field_r = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          this.field_m.write(this.field_r, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_c = true;
                          break L13;
                        }
                      }
                      this.field_d = (this.field_d + var1_int) % this.field_o;
                      try {
                        L14: {
                          L15: {
                            if (this.field_n != this.field_d) {
                              break L15;
                            } else {
                              this.field_m.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_c = true;
                          break L16;
                        }
                      }
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              L17: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                bd.a((String) null, (Throwable) ((Object) var1_ref), 1);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        if (param0 > -41) {
            field_i = (String[]) null;
        }
        field_q = null;
        field_u = null;
        field_f = null;
        field_h = null;
        field_i = null;
        field_t = null;
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            if (!this.field_e) {
              if (!this.field_c) {
                L1: {
                  if (null == this.field_r) {
                    this.field_r = new byte[this.field_o];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= param0) {
                        L4: {
                          if (null != this.field_p) {
                            break L4;
                          } else {
                            this.field_p = this.field_g.a(3, (byte) 127, (Runnable) (this));
                            break L4;
                          }
                        }
                        if (param1 == -127) {
                          this.notifyAll();
                          break L2;
                        } else {
                          return;
                        }
                      } else {
                        this.field_r[this.field_n] = param3[param2 + var6];
                        this.field_n = (1 + this.field_n) % this.field_o;
                        if (this.field_n == (-100 + this.field_d - -this.field_o) % this.field_o) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_c = false;
                throw new IOException();
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("bh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    bh(java.net.Socket param0, bu param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void b(byte param0) throws IOException {
        int var2 = -42 / ((62 - param0) / 57);
        if (this.field_e) {
            return;
        }
        if (this.field_c) {
            this.field_c = false;
            throw new IOException();
        }
    }

    final void a(int param0) {
        try {
            int var4 = 0;
            var4 = Kickabout.field_G;
            if (!(!this.field_e)) {
                return;
            }
            synchronized (this) {
                this.field_e = true;
                this.notifyAll();
            }
            if (null != this.field_p) {
                while (this.field_p.field_a == 0) {
                    aj.a(1L, 1);
                }
                if (!(this.field_p.field_a != 1)) {
                    try {
                        ((Thread) (this.field_p.field_b)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            if (param0 != 1) {
                this.field_m = (OutputStream) null;
            }
            this.field_p = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private bh(java.net.Socket param0, bu param1, int param2) throws IOException {
        this.field_n = 0;
        this.field_d = 0;
        this.field_e = false;
        this.field_c = false;
        try {
            this.field_b = param0;
            this.field_g = param1;
            this.field_b.setSoTimeout(30000);
            this.field_b.setTcpNoDelay(true);
            this.field_a = this.field_b.getInputStream();
            this.field_m = this.field_b.getOutputStream();
            this.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_q = "Loading graphics";
        field_t = "Your search returned no results.";
        field_f = st.c(-23091);
        field_k = -2;
    }
}
