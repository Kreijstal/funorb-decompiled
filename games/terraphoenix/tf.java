/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tf implements Runnable {
    private int field_e;
    private he field_h;
    private java.net.Socket field_a;
    private InputStream field_b;
    private boolean field_l;
    private boolean field_g;
    private int field_f;
    private byte[] field_m;
    private OutputStream field_c;
    static o field_d;
    private mf field_i;
    static int field_k;
    private int field_j;

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            if (!this.field_g) {
              if (!this.field_l) {
                L1: {
                  if (null == this.field_m) {
                    this.field_m = new byte[this.field_f];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2 == -97) {
                    break L2;
                  } else {
                    this.a((byte) -76);
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
                          if (null == this.field_i) {
                            this.field_i = this.field_h.a((Runnable) (this), (byte) -21, 3);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L3;
                      } else {
                        this.field_m[this.field_e] = param3[param1 + var6];
                        this.field_e = (1 + this.field_e) % this.field_f;
                        if (this.field_e == (this.field_j + (this.field_f - 100)) % this.field_f) {
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
                this.field_l = false;
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
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("tf.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final int a(int param0) throws IOException {
        if (this.field_g) {
            return 0;
        }
        if (param0 != 0) {
            this.field_l = false;
            return this.field_b.available();
        }
        return this.field_b.available();
    }

    tf(java.net.Socket param0, he param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0) {
        try {
            int var2 = 0;
            Object var2_ref_Object = null;
            InterruptedException var3 = null;
            Throwable var3_ref = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = Terraphoenix.field_V;
            if (this.field_g) {
              return;
            } else {
              var2_ref_Object = this;
              synchronized (var2_ref_Object) {
                L0: {
                  this.field_g = true;
                  this.notifyAll();
                  break L0;
                }
              }
              var2 = -36 % ((-82 - param0) / 40);
              if (this.field_i != null) {
                L1: while (true) {
                  if (0 != this.field_i.field_d) {
                    if (-2 == (this.field_i.field_d ^ -1)) {
                      try {
                        L2: {
                          ((Thread) (this.field_i.field_e)).join();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var3 = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_i = null;
                        return;
                      }
                      this.field_i = null;
                      return;
                    } else {
                      this.field_i = null;
                      return;
                    }
                  } else {
                    gi.a((byte) -26, 1L);
                    continue L1;
                  }
                }
              } else {
                this.field_i = null;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) throws IOException {
        if (param0 == 10509) {
          if (this.field_g) {
            return;
          } else {
            if (this.field_l) {
              this.field_l = false;
              throw new IOException();
            } else {
              return;
            }
          }
        } else {
          this.finalize();
          if (this.field_g) {
            return;
          } else {
            if (this.field_l) {
              this.field_l = false;
              throw new IOException();
            } else {
              return;
            }
          }
        }
    }

    protected final void finalize() {
        this.a((byte) 37);
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
            var6 = Terraphoenix.field_V;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_e != this.field_j) {
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
                        if (this.field_j > this.field_e) {
                          var1_int = this.field_f - this.field_j;
                          break L6;
                        } else {
                          var1_int = this.field_e - this.field_j;
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
                          if (null == this.field_b) {
                            break L8;
                          } else {
                            this.field_b.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null != this.field_c) {
                            this.field_c.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null == this.field_a) {
                            break L10;
                          } else {
                            this.field_a.close();
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
                    this.field_m = null;
                    break L0;
                  } else {
                    if (-1 > (var1_int ^ -1)) {
                      try {
                        L12: {
                          this.field_c.write(this.field_m, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_l = true;
                          break L13;
                        }
                      }
                      this.field_j = (this.field_j + var1_int) % this.field_f;
                      try {
                        L14: {
                          L15: {
                            if (this.field_j != this.field_e) {
                              break L15;
                            } else {
                              this.field_c.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_l = true;
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
                bd.a((Throwable) ((Object) var1_ref), (String) null, -99);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_d = null;
        if (param0 > 94) {
            return;
        }
        field_k = 18;
    }

    final static boolean a(int param0, byte param1, int param2, int param3, boolean param4, int param5) {
        int var6 = 0;
        var6 = 72 / ((-25 - param1) / 34);
        if (param3 <= ef.field_j) {
          if (param3 - -param0 > ef.field_j) {
            if (jb.field_b >= param2) {
              if (param2 - -param5 > jb.field_b) {
                if (!param4) {
                  return true;
                } else {
                  l.d(param3, param2, param0, param5, 16777215, 128);
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private tf(java.net.Socket param0, he param1, int param2) throws IOException {
        this.field_e = 0;
        this.field_g = false;
        this.field_l = false;
        this.field_j = 0;
        try {
            this.field_h = param1;
            this.field_a = param0;
            this.field_a.setSoTimeout(30000);
            this.field_a.setTcpNoDelay(true);
            this.field_b = this.field_a.getInputStream();
            this.field_c = this.field_a.getOutputStream();
            this.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            if (this.field_g) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: while (true) {
                if (param1 <= 0) {
                  if (param3 >= 96) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    field_k = -40;
                    return;
                  }
                } else {
                  var5_int = this.field_b.read(param0, param2, param1);
                  if (var5_int > 0) {
                    param2 = param2 + var5_int;
                    param1 = param1 - var5_int;
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
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("tf.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int b(int param0) throws IOException {
        if (param0 != 0) {
            this.field_m = (byte[]) null;
            if (!(!this.field_g)) {
                return 0;
            }
            return this.field_b.read();
        }
        if (!(!this.field_g)) {
            return 0;
        }
        return this.field_b.read();
    }

    static {
        field_k = -1;
        field_d = new o();
    }
}
