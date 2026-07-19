/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hi implements Runnable {
    private int field_b;
    private jh field_e;
    private byte[] field_i;
    private boolean field_g;
    private java.net.Socket field_o;
    static int field_c;
    private int field_n;
    private OutputStream field_h;
    static boolean[] field_p;
    private InputStream field_m;
    private boolean field_f;
    private int field_d;
    private vh field_j;
    static rc field_l;
    static long field_k;
    static int field_a;

    final int a(byte param0) throws IOException {
        if (param0 != 19) {
            return 111;
        }
        if (!(!this.field_g)) {
            return 0;
        }
        return this.field_m.read();
    }

    hi(java.net.Socket param0, vh param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            if (!this.field_g) {
              if (!this.field_f) {
                L1: {
                  if (null != this.field_i) {
                    break L1;
                  } else {
                    this.field_i = new byte[this.field_n];
                    break L1;
                  }
                }
                L2: {
                  if (param2 == 1) {
                    break L2;
                  } else {
                    this.b((byte) 47);
                    break L2;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L3: {
                    var6 = 0;
                    L4: while (true) {
                      if (param0 <= var6) {
                        L5: {
                          if (null == this.field_e) {
                            this.field_e = this.field_j.a((byte) -118, (Runnable) (this), 3);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L3;
                      } else {
                        this.field_i[this.field_b] = param1[var6 + param3];
                        this.field_b = (1 + this.field_b) % this.field_n;
                        if (this.field_b == (-100 + (this.field_n + this.field_d)) % this.field_n) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                this.field_f = false;
                throw new IOException();
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("hi.G(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0) throws IOException {
        if (this.field_g) {
          return;
        } else {
          if (param0 == 0) {
            if (this.field_f) {
              this.field_f = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            this.field_e = (jh) null;
            if (this.field_f) {
              this.field_f = false;
              throw new IOException();
            } else {
              return;
            }
          }
        }
    }

    final static java.awt.Canvas d(byte param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        ui stackOut_7_0 = null;
        java.awt.Canvas stackOut_6_0 = null;
        ui stackOut_3_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        if (param0 <= 66) {
          L0: {
            field_c = 115;
            if (null != ki.field_E) {
              stackOut_7_0 = ki.field_E;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = wizardrun.field_G;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return (java.awt.Canvas) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null != ki.field_E) {
              stackOut_3_0 = ki.field_E;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = wizardrun.field_G;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return (java.awt.Canvas) ((Object) stackIn_4_0);
        }
    }

    final void b(byte param0) {
        try {
            java.awt.Canvas discarded$3 = null;
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var4 = wizardrun.field_H;
            if (this.field_g) {
              return;
            } else {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  L1: {
                    if (param0 == 76) {
                      break L1;
                    } else {
                      discarded$3 = hi.d((byte) 8);
                      break L1;
                    }
                  }
                  this.field_g = true;
                  this.notifyAll();
                  break L0;
                }
              }
              L2: {
                if (null == this.field_e) {
                  break L2;
                } else {
                  L3: while (true) {
                    if (-1 != (this.field_e.field_a ^ -1)) {
                      if (1 == this.field_e.field_a) {
                        try {
                          L4: {
                            ((Thread) (this.field_e.field_e)).join();
                            decompiledRegionSelector0 = 0;
                            break L4;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L5: {
                            var2 = (InterruptedException) (Object) decompiledCaughtException;
                            decompiledRegionSelector0 = 1;
                            break L5;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          this.field_e = null;
                          return;
                        } else {
                          break L2;
                        }
                      } else {
                        this.field_e = null;
                        return;
                      }
                    } else {
                      tg.a(1L, false);
                      continue L3;
                    }
                  }
                }
              }
              this.field_e = null;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(byte param0) throws IOException {
        if (param0 != 89) {
            this.field_g = true;
            if (!(!this.field_g)) {
                return 0;
            }
            return this.field_m.available();
        }
        if (!(!this.field_g)) {
            return 0;
        }
        return this.field_m.available();
    }

    protected final void finalize() {
        this.b((byte) 76);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var5_int = -119 % ((-63 - param1) / 40);
            if (!this.field_g) {
              L1: while (true) {
                if ((param2 ^ -1) >= -1) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = this.field_m.read(param0, param3, param2);
                  if (var6 <= 0) {
                    throw new EOFException();
                  } else {
                    param2 = param2 - var6;
                    param3 = param3 + var6;
                    continue L1;
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
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("hi.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != -30534) {
            field_k = 39L;
            field_l = null;
            field_p = null;
            return;
        }
        field_l = null;
        field_p = null;
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
            var6 = wizardrun.field_H;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_b != this.field_d) {
                          break L3;
                        } else {
                          if (this.field_g) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
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
                          }
                        }
                      }
                      L6: {
                        if (this.field_d > this.field_b) {
                          var1_int = -this.field_d + this.field_n;
                          break L6;
                        } else {
                          var1_int = this.field_b - this.field_d;
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
                          if (this.field_m == null) {
                            break L8;
                          } else {
                            this.field_m.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null == this.field_h) {
                            break L9;
                          } else {
                            this.field_h.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null == this.field_o) {
                            break L10;
                          } else {
                            this.field_o.close();
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
                    this.field_i = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          this.field_h.write(this.field_i, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_f = true;
                          break L13;
                        }
                      }
                      this.field_d = (this.field_d - -var1_int) % this.field_n;
                      try {
                        L14: {
                          L15: {
                            if (this.field_b == this.field_d) {
                              this.field_h.flush();
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
                          var3 = (IOException) (Object) decompiledCaughtException;
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
                rg.a((Throwable) ((Object) var1_ref), (String) null, -562);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private hi(java.net.Socket param0, vh param1, int param2) throws IOException {
        this.field_g = false;
        this.field_b = 0;
        this.field_f = false;
        this.field_d = 0;
        try {
            this.field_j = param1;
            this.field_o = param0;
            this.field_o.setSoTimeout(30000);
            this.field_o.setTcpNoDelay(true);
            this.field_m = this.field_o.getInputStream();
            this.field_h = this.field_o.getOutputStream();
            this.field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_p = new boolean[112];
        field_l = new rc();
        field_a = -480;
    }
}
