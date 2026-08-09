/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lpb implements Runnable {
    private int field_i;
    private eab field_e;
    private int field_k;
    private boolean field_f;
    private mob field_g;
    private OutputStream field_j;
    private boolean field_c;
    private byte[] field_a;
    private java.net.Socket field_h;
    private InputStream field_b;
    private int field_d;

    final void b(int param0) {
        try {
            int var4 = 0;
            var4 = VoidHunters.field_G;
            if (this.field_c) {
                return;
            }
            if (param0 != 1) {
                return;
            }
            synchronized (this) {
                this.field_c = true;
                this.notifyAll();
            }
            if (this.field_g != null) {
                while (this.field_g.field_f == 0) {
                    gdb.b(-94, 1L);
                }
                if (!(this.field_g.field_f != 1)) {
                    try {
                        ((Thread) (this.field_g.field_d)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_g = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 < -121) {
                break L1;
              } else {
                this.field_k = 66;
                break L1;
              }
            }
            if (!this.field_c) {
              L2: while (true) {
                if (-1 <= (param2 ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_b.read(param3, param1, param2);
                  if (0 < var5_int) {
                    param1 = param1 + var5_int;
                    param2 = param2 - var5_int;
                    continue L2;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("lpb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            var6 = VoidHunters.field_G;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_i == this.field_d) {
                          if (!this.field_c) {
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
                        var2 = this.field_d;
                        if (this.field_i >= this.field_d) {
                          var1_int = -this.field_d + this.field_i;
                          break L6;
                        } else {
                          var1_int = this.field_k - this.field_d;
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
                          if (null != this.field_b) {
                            this.field_b.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != this.field_j) {
                            this.field_j.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_h == null) {
                            break L10;
                          } else {
                            this.field_h.close();
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
                    this.field_a = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          this.field_j.write(this.field_a, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_f = true;
                          break L13;
                        }
                      }
                      this.field_d = (var1_int + this.field_d) % this.field_k;
                      try {
                        L14: {
                          L15: {
                            if (this.field_i == this.field_d) {
                              this.field_j.flush();
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
                          this.field_f = true;
                          break L16;
                        }
                      }
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
                gna.a((Throwable) ((Object) var1_ref), (String) null, 0);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) throws IOException {
        if (param0 >= -34) {
            byte[] var3 = (byte[]) null;
            lpb.a((byte) -34, (byte[]) null);
        }
        if (!(!this.field_c)) {
            return 0;
        }
        return this.field_b.read();
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (!this.field_c) {
              if (this.field_f) {
                this.field_f = false;
                throw new IOException();
              } else {
                L1: {
                  if (this.field_a == null) {
                    this.field_a = new byte[this.field_k];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    var6 = param0;
                    L3: while (true) {
                      if (var6 >= param2) {
                        L4: {
                          if (null == this.field_g) {
                            this.field_g = this.field_e.a(0, 3, (Runnable) (this));
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_a[this.field_i] = param1[var6 + param3];
                        this.field_i = (this.field_i + 1) % this.field_k;
                        if (this.field_i != (-100 + (this.field_k + this.field_d)) % this.field_k) {
                          var6++;
                          continue L3;
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
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5_ref);

            stackIn_25_1 = new StringBuilder().append("lpb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static ngb a(byte param0, byte[] param1) {
        ngb var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        ngb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param0 == 19) {
                  break L1;
                } else {
                  var3 = (byte[]) null;
                  lpb.a((byte) -54, (byte[]) null);
                  break L1;
                }
              }
              var2 = new ngb(param1, iib.field_e, so.field_f, nhb.field_o, hla.field_a, rlb.field_d, sh.field_a);
              qqb.a(39);
              stackIn_6_0 = (ngb) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("lpb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final int c(int param0) throws IOException {
        if (!(!this.field_c)) {
            return 0;
        }
        if (param0 != 0) {
            return 45;
        }
        return this.field_b.available();
    }

    final void a(byte param0) throws IOException {
        if (this.field_c) {
            return;
        }
        if (this.field_f) {
            this.field_f = false;
            throw new IOException();
        }
        if (param0 <= 101) {
            this.finalize();
        }
    }

    protected final void finalize() {
        this.b(1);
    }

    lpb(java.net.Socket param0, eab param1) throws IOException {
        this(param0, param1, 5000);
    }

    private lpb(java.net.Socket param0, eab param1, int param2) throws IOException {
        this.field_f = false;
        this.field_c = false;
        this.field_i = 0;
        this.field_d = 0;
        try {
            this.field_e = param1;
            this.field_h = param0;
            this.field_h.setSoTimeout(30000);
            this.field_h.setTcpNoDelay(true);
            this.field_b = this.field_h.getInputStream();
            this.field_j = this.field_h.getOutputStream();
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lpb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
