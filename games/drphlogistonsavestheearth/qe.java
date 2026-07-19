/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qe implements Runnable {
    private java.net.Socket field_j;
    static m field_e;
    private InputStream field_q;
    private il field_m;
    private int field_f;
    static int field_c;
    static he field_k;
    private boolean field_n;
    private OutputStream field_b;
    private boolean field_i;
    private bl field_h;
    private int field_d;
    private int field_p;
    private byte[] field_o;
    static java.awt.Color field_g;
    static int field_a;
    static int field_l;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (!this.field_n) {
              L1: {
                if (param0 == -14) {
                  break L1;
                } else {
                  this.field_h = (bl) null;
                  break L1;
                }
              }
              L2: while (true) {
                if (-1 <= (param3 ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_q.read(param1, param2, param3);
                  if (0 < var5_int) {
                    param2 = param2 + var5_int;
                    param3 = param3 - var5_int;
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
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("qe.I(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) throws IOException {
        if (this.field_n) {
            return;
        }
        if (param0 != -13) {
            field_k = (he) null;
            if (!(!this.field_i)) {
                this.field_i = false;
                throw new IOException();
            }
            return;
        }
        if (!(!this.field_i)) {
            this.field_i = false;
            throw new IOException();
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_e = null;
        field_k = null;
        if (param0 == 0) {
            return;
        }
        qe.c(44);
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
            var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_f == this.field_p) {
                          if (!this.field_n) {
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
                        if (this.field_p < this.field_f) {
                          var1_int = this.field_d + -this.field_f;
                          break L6;
                        } else {
                          var1_int = -this.field_f + this.field_p;
                          break L6;
                        }
                      }
                      var2 = this.field_f;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == this.field_q) {
                            break L8;
                          } else {
                            this.field_q.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_b != null) {
                            this.field_b.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_j != null) {
                            this.field_j.close();
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
                    this.field_o = null;
                    break L0;
                  } else {
                    if (0 >= var1_int) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          this.field_b.write(this.field_o, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_i = true;
                          break L13;
                        }
                      }
                      this.field_f = (this.field_f + var1_int) % this.field_d;
                      try {
                        L14: {
                          L15: {
                            if (this.field_f == this.field_p) {
                              this.field_b.flush();
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
                          this.field_i = true;
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
                gb.a((Throwable) ((Object) var1_ref), (String) null, 10);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        try {
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (!this.field_n) {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  this.field_n = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (this.field_m != null) {
                L1: while (true) {
                  if (this.field_m.field_b != 0) {
                    L2: {
                      if ((this.field_m.field_b ^ -1) != -2) {
                        break L2;
                      } else {
                        try {
                          L3: {
                            ((Thread) (this.field_m.field_g)).join();
                            decompiledRegionSelector0 = 0;
                            break L3;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L4: {
                            var2 = (InterruptedException) (Object) decompiledCaughtException;
                            decompiledRegionSelector0 = 1;
                            break L4;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          this.field_m = null;
                          if (param0 == 50) {
                            return;
                          } else {
                            this.run();
                            return;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    this.field_m = null;
                    if (param0 == 50) {
                      return;
                    } else {
                      this.run();
                      return;
                    }
                  } else {
                    kk.a(1L, true);
                    continue L1;
                  }
                }
              } else {
                this.field_m = null;
                if (param0 == 50) {
                  return;
                } else {
                  this.run();
                  return;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) throws IOException {
        int var2 = -86 / ((param0 - -63) / 49);
        if (this.field_n) {
            return 0;
        }
        return this.field_q.available();
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        nh[] var9 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (!this.field_n) {
              if (!this.field_i) {
                L1: {
                  if (this.field_o != null) {
                    break L1;
                  } else {
                    this.field_o = new byte[this.field_d];
                    break L1;
                  }
                }
                L2: {
                  if (param1 == -30537) {
                    break L2;
                  } else {
                    var9 = (nh[]) null;
                    qe.a(-98, -28, (nh[]) null, (byte) 55);
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
                          if (this.field_m != null) {
                            break L5;
                          } else {
                            this.field_m = this.field_h.a((Runnable) (this), 3, (byte) -126);
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L3;
                      } else {
                        this.field_o[this.field_p] = param2[param3 + var6];
                        this.field_p = (this.field_p - -1) % this.field_d;
                        if (this.field_p == (-100 + (this.field_d + this.field_f)) % this.field_d) {
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
                this.field_i = false;
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
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("qe.E(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, nh[] param2, byte param3) {
        try {
            ia.field_a = new gk(param2);
            if (param3 > -65) {
                qe.c(-58);
            }
            ch.field_B = param1;
            lg.field_i = param0;
            h.a(true);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "qe.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    qe(java.net.Socket param0, bl param1) throws IOException {
        this(param0, param1, 5000);
    }

    protected final void finalize() {
        this.b(50);
    }

    final int a(int param0) throws IOException {
        if (param0 < -119) {
          if (this.field_n) {
            return 0;
          } else {
            return this.field_q.read();
          }
        } else {
          this.b(18);
          if (this.field_n) {
            return 0;
          } else {
            return this.field_q.read();
          }
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= param1) {
                break L1;
              } else {
                var3_int = param1;
                param1 = param2;
                param2 = var3_int;
                break L1;
              }
            }
            L2: {
              if (param0 == 26) {
                break L2;
              } else {
                qe.c(-113);
                break L2;
              }
            }
            L3: while (true) {
              if (0 == param2) {
                stackOut_7_0 = param1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var3_int = param1 % param2;
                param1 = param2;
                param2 = var3_int;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "qe.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    private qe(java.net.Socket param0, bl param1, int param2) throws IOException {
        this.field_f = 0;
        this.field_n = false;
        this.field_i = false;
        this.field_p = 0;
        try {
            this.field_j = param0;
            this.field_h = param1;
            this.field_j.setSoTimeout(30000);
            this.field_j.setTcpNoDelay(true);
            this.field_q = this.field_j.getInputStream();
            this.field_b = this.field_j.getOutputStream();
            this.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = 50;
        field_g = new java.awt.Color(10040319);
        field_l = 480;
        field_a = -150;
    }
}
