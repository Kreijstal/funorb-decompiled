/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wh implements Runnable {
    private int field_b;
    private java.net.Socket field_d;
    private boolean field_g;
    private tg field_f;
    private byte[] field_c;
    private boolean field_k;
    private OutputStream field_l;
    static int field_m;
    private int field_j;
    private InputStream field_e;
    private ql field_i;
    private int field_a;
    static mh field_h;

    final int e(int param0) throws IOException {
        if (param0 != 0) {
            this.finalize();
        }
        if (this.field_k) {
            return 0;
        }
        return this.field_e.read();
    }

    protected final void finalize() {
        this.a((byte) 111);
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (this.field_k) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1) {
                if (this.field_g) {
                  this.field_g = false;
                  throw new IOException();
                } else {
                  L1: {
                    if (this.field_c == null) {
                      this.field_c = new byte[this.field_a];
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var5 = this;
                  synchronized (var5) {
                    L2: {
                      var6 = 0;
                      L3: while (true) {
                        if (var6 >= param2) {
                          L4: {
                            if (null != this.field_i) {
                              break L4;
                            } else {
                              this.field_i = this.field_f.a(3, (Runnable) (this), (byte) -69);
                              break L4;
                            }
                          }
                          this.notifyAll();
                          break L2;
                        } else {
                          this.field_c[this.field_b] = param0[param3 + var6];
                          this.field_b = (1 + this.field_b) % this.field_a;
                          if ((this.field_a + this.field_j - 100) % this.field_a != this.field_b) {
                            var6++;
                            continue L3;
                          } else {
                            throw new IOException();
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5_ref);

            stackIn_27_1 = new StringBuilder().append("wh.B(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!this.field_k) {
              if (param0 == 25826) {
                L1: while (true) {
                  if (0 >= param2) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var5_int = this.field_e.read(param1, param3, param2);
                    if (-1 > (var5_int ^ -1)) {
                      param2 = param2 - var5_int;
                      param3 = param3 + var5_int;
                      continue L1;
                    } else {
                      throw new EOFException();
                    }
                  }
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
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("wh.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
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
            var6 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_b != this.field_j) {
                          break L3;
                        } else {
                          if (!this.field_k) {
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
                        if (this.field_j <= this.field_b) {
                          var1_int = -this.field_j + this.field_b;
                          break L6;
                        } else {
                          var1_int = this.field_a - this.field_j;
                          break L6;
                        }
                      }
                      var2 = this.field_j;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (this.field_e != null) {
                            this.field_e.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null == this.field_l) {
                            break L9;
                          } else {
                            this.field_l.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != this.field_d) {
                            this.field_d.close();
                            break L10;
                          } else {
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
                    this.field_c = null;
                    break L0;
                  } else {
                    if ((var1_int ^ -1) < -1) {
                      try {
                        L12: {
                          this.field_l.write(this.field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_g = true;
                          break L13;
                        }
                      }
                      this.field_j = (var1_int + this.field_j) % this.field_a;
                      try {
                        L14: {
                          L15: {
                            if (this.field_j != this.field_b) {
                              break L15;
                            } else {
                              this.field_l.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_g = true;
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
                rk.a((String) null, (Throwable) ((Object) var1_ref), 105);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    wh(java.net.Socket param0, tg param1) throws IOException {
        this(param0, param1, 5000);
    }

    public static void b(int param0) {
        if (param0 < 89) {
            return;
        }
        field_h = null;
    }

    final void a(byte param0) {
        try {
            int var4 = 0;
            var4 = BrickABrac.field_J ? 1 : 0;
            if (this.field_k) {
                return;
            }
            synchronized (this) {
                this.field_k = true;
                this.notifyAll();
            }
            if (this.field_i != null) {
                while (this.field_i.field_f == 0) {
                    wj.a(-127, 1L);
                }
                if (this.field_i.field_f == 1) {
                    try {
                        ((Thread) (this.field_i.field_e)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_i = null;
            if (param0 < 110) {
                this.a((byte) 56);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        if (param0 != 21862) {
            return;
        }
        if (nq.field_p) {
            lb.b(lb.field_i, lb.field_b, -lb.field_i + lb.field_f, -lb.field_b + lb.field_j);
            wd.field_w.a(true, false);
        }
    }

    final void c(int param0) throws IOException {
        if (!(!this.field_k)) {
            return;
        }
        if (param0 != -1) {
            this.field_b = -17;
        }
        if (!(!this.field_g)) {
            this.field_g = false;
            throw new IOException();
        }
    }

    final int d(int param0) throws IOException {
        if (!(!this.field_k)) {
            return 0;
        }
        if (param0 != 10434) {
            this.finalize();
        }
        return this.field_e.available();
    }

    private wh(java.net.Socket param0, tg param1, int param2) throws IOException {
        this.field_g = false;
        this.field_k = false;
        this.field_j = 0;
        this.field_b = 0;
        try {
            this.field_f = param1;
            this.field_d = param0;
            this.field_d.setSoTimeout(30000);
            this.field_d.setTcpNoDelay(true);
            this.field_e = this.field_d.getInputStream();
            this.field_l = this.field_d.getOutputStream();
            this.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
