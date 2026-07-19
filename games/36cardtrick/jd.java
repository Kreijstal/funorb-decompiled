/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd implements Runnable {
    private vi field_d;
    private java.net.Socket field_k;
    private OutputStream field_e;
    private int field_i;
    static ib[] field_c;
    private InputStream field_l;
    private boolean field_f;
    private byte[] field_j;
    private le field_h;
    static int field_g;
    private boolean field_m;
    private int field_a;
    private int field_b;

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 23) {
            field_g = -6;
        }
    }

    final void a(boolean param0) {
        try {
            int var4 = 0;
            var4 = Main.field_T;
            if (!(!this.field_f)) {
                return;
            }
            synchronized (this) {
                this.field_f = param0 ? true : false;
                this.notifyAll();
            }
            if (this.field_d != null) {
                while (this.field_d.field_a == 0) {
                    wk.a((byte) -104, 1L);
                }
                if (!((this.field_d.field_a ^ -1) != -2)) {
                    try {
                        ((Thread) (this.field_d.field_e)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_d = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = Main.field_T;
        try {
          L0: {
            if (param1 == -89) {
              if (!this.field_f) {
                if (this.field_m) {
                  this.field_m = false;
                  throw new IOException();
                } else {
                  L1: {
                    if (this.field_j != null) {
                      break L1;
                    } else {
                      this.field_j = new byte[this.field_a];
                      break L1;
                    }
                  }
                  var5_ref = this;
                  synchronized (var5_ref) {
                    L2: {
                      var6 = 0;
                      L3: while (true) {
                        if (var6 >= param2) {
                          L4: {
                            if (this.field_d != null) {
                              break L4;
                            } else {
                              this.field_d = this.field_h.a(0, 3, (Runnable) (this));
                              break L4;
                            }
                          }
                          this.notifyAll();
                          break L2;
                        } else {
                          this.field_j[this.field_b] = param3[param0 + var6];
                          this.field_b = (this.field_b + 1) % this.field_a;
                          if (this.field_b == (this.field_a + this.field_i - 100) % this.field_a) {
                            throw new IOException();
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
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
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("jd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
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
            var6 = Main.field_T;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_b != this.field_i) {
                          break L3;
                        } else {
                          if (!this.field_f) {
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
                        var2 = this.field_i;
                        if (this.field_i <= this.field_b) {
                          var1_int = -this.field_i + this.field_b;
                          break L6;
                        } else {
                          var1_int = this.field_a - this.field_i;
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null != this.field_l) {
                            this.field_l.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_e != null) {
                            this.field_e.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null == this.field_k) {
                            break L10;
                          } else {
                            this.field_k.close();
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
                    this.field_j = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          this.field_e.write(this.field_j, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_m = true;
                          break L13;
                        }
                      }
                      this.field_i = (var1_int + this.field_i) % this.field_a;
                      try {
                        L14: {
                          L15: {
                            if (this.field_i != this.field_b) {
                              break L15;
                            } else {
                              this.field_e.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_m = true;
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
                k.a((Throwable) ((Object) var1_ref), (byte) -103, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        this.a(true);
    }

    final void b(byte param0) throws IOException {
        if (this.field_f) {
            return;
        }
        if (!(!this.field_m)) {
            this.field_m = false;
            throw new IOException();
        }
        if (param0 != -44) {
            this.field_a = -32;
        }
    }

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param0 == 66) {
                break L1;
              } else {
                this.finalize();
                break L1;
              }
            }
            if (this.field_f) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: while (true) {
                if (-1 <= (param2 ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_l.read(param1, param3, param2);
                  if ((var5_int ^ -1) >= -1) {
                    throw new EOFException();
                  } else {
                    param2 = param2 - var5_int;
                    param3 = param3 + var5_int;
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
            stackOut_12_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0) throws IOException {
        if (this.field_f) {
            return 0;
        }
        if (param0 != 0) {
            return -63;
        }
        return this.field_l.read();
    }

    jd(java.net.Socket param0, le param1) throws IOException {
        this(param0, param1, 5000);
    }

    private jd(java.net.Socket param0, le param1, int param2) throws IOException {
        this.field_f = false;
        this.field_m = false;
        this.field_b = 0;
        this.field_i = 0;
        try {
            this.field_k = param0;
            this.field_h = param1;
            this.field_k.setSoTimeout(30000);
            this.field_k.setTcpNoDelay(true);
            this.field_l = this.field_k.getInputStream();
            this.field_e = this.field_k.getOutputStream();
            this.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(int param0) throws IOException {
        if (!(!this.field_f)) {
            return 0;
        }
        int var2 = 59 / ((80 - param0) / 45);
        return this.field_l.available();
    }

    static {
        field_c = new ib[16];
        field_g = 20;
    }
}
