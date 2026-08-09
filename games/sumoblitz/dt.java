/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dt implements Runnable {
    static ri field_n;
    private byte[] field_e;
    static jr field_p;
    private int field_c;
    private int field_j;
    private boolean field_b;
    private boolean field_l;
    private OutputStream field_k;
    static String[] field_i;
    static String field_h;
    private wi field_g;
    private int field_a;
    static boolean field_f;
    private java.net.Socket field_m;
    private jr field_o;
    private InputStream field_d;

    final int a(int param0) throws IOException {
        if (param0 >= -84) {
            this.field_e = (byte[]) null;
        }
        if (this.field_l) {
            return 0;
        }
        return this.field_d.read();
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
            var6 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_a == this.field_c) {
                          if (!this.field_l) {
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
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (this.field_c > this.field_a) {
                          var1_int = -this.field_c + this.field_j;
                          break L6;
                        } else {
                          var1_int = -this.field_c + this.field_a;
                          break L6;
                        }
                      }
                      var2 = this.field_c;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null != this.field_d) {
                            this.field_d.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != this.field_k) {
                            this.field_k.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_m == null) {
                            break L10;
                          } else {
                            this.field_m.close();
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
                    this.field_e = null;
                    break L0;
                  } else {
                    if (0 < var1_int) {
                      try {
                        L12: {
                          this.field_k.write(this.field_e, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_b = true;
                          break L13;
                        }
                      }
                      this.field_c = (this.field_c - -var1_int) % this.field_j;
                      try {
                        L14: {
                          L15: {
                            if (this.field_a == this.field_c) {
                              this.field_k.flush();
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_b = true;
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
                ms.a((String) null, (Throwable) ((Object) var1_ref), 0);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) throws IOException {
        if (!(!this.field_l)) {
            return;
        }
        int var2 = -72 / ((36 - param0) / 42);
        if (!(!this.field_b)) {
            this.field_b = false;
            throw new IOException();
        }
    }

    protected final void finalize() {
        this.a((byte) -97);
    }

    final void a(byte param0) {
        try {
            int var4 = 0;
            var4 = Sumoblitz.field_L ? 1 : 0;
            if (!(!this.field_l)) {
                return;
            }
            if (param0 >= -36) {
                this.field_g = (wi) null;
            }
            synchronized (this) {
                this.field_l = true;
                this.notifyAll();
            }
            if (this.field_o != null) {
                while (this.field_o.field_c == 0) {
                    tg.a(1L, (byte) 113);
                }
                if (!(-2 != (this.field_o.field_c ^ -1))) {
                    try {
                        ((Thread) (this.field_o.field_d)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_o = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(int param0) throws IOException {
        if (param0 >= -22) {
            return 73;
        }
        if (this.field_l) {
            return 0;
        }
        return this.field_d.available();
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_l) {
              if (this.field_b) {
                this.field_b = false;
                throw new IOException();
              } else {
                L1: {
                  if (null != this.field_e) {
                    break L1;
                  } else {
                    this.field_e = new byte[this.field_j];
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    L3: {
                      if (param1 == -2) {
                        break L3;
                      } else {
                        this.field_m = (java.net.Socket) null;
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= param3) {
                        L5: {
                          if (this.field_o != null) {
                            break L5;
                          } else {
                            this.field_o = this.field_g.a(true, (Runnable) (this), 3);
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_e[this.field_a] = param2[var6 + param0];
                        this.field_a = (this.field_a + 1) % this.field_j;
                        if (this.field_a != (-100 + this.field_c + this.field_j) % this.field_j) {
                          var6++;
                          continue L4;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5_ref);

            stackIn_25_1 = new StringBuilder().append("dt.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    dt(java.net.Socket param0, wi param1) throws IOException {
        this(param0, param1, 5000);
    }

    private dt(java.net.Socket param0, wi param1, int param2) throws IOException {
        this.field_c = 0;
        this.field_l = false;
        this.field_b = false;
        this.field_a = 0;
        try {
            this.field_m = param0;
            this.field_g = param1;
            this.field_m.setSoTimeout(30000);
            this.field_m.setTcpNoDelay(true);
            this.field_d = this.field_m.getInputStream();
            this.field_k = this.field_m.getOutputStream();
            this.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "dt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 <= 19) {
            dt.d(-53);
        }
        field_i = null;
        field_h = null;
        field_p = null;
        field_n = null;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_l) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: while (true) {
                if (0 >= param2) {
                  L2: {
                    if (param0 <= -12) {
                      break L2;
                    } else {
                      this.field_b = true;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_d.read(param3, param1, param2);
                  if (0 < var5_int) {
                    param1 = param1 + var5_int;
                    param2 = param2 - var5_int;
                    continue L1;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("dt.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_h = "More suggestions";
        field_f = true;
    }
}
