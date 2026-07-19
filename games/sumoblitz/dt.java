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
        if (param0 < -84) {
          if (this.field_l) {
            return 0;
          } else {
            return this.field_d.read();
          }
        } else {
          this.field_e = (byte[]) null;
          if (this.field_l) {
            return 0;
          } else {
            return this.field_d.read();
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
            var6 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_a == this.field_c) {
                          L4: {
                            if (!this.field_l) {
                              break L4;
                            } else {
                              if (var6 == 0) {
                                decompiledRegionSelector0 = 0;
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          try {
                            L5: {
                              this.wait();
                              break L5;
                            }
                          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L6: {
                              var4 = (InterruptedException) (Object) decompiledCaughtException;
                              break L6;
                            }
                          }
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L7: {
                        L8: {
                          if (this.field_c > this.field_a) {
                            break L8;
                          } else {
                            var1_int = -this.field_c + this.field_a;
                            if (var6 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var1_int = -this.field_c + this.field_j;
                        break L7;
                      }
                      var2 = this.field_c;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L9: {
                        L10: {
                          if (null != this.field_d) {
                            this.field_d.close();
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (null != this.field_k) {
                            this.field_k.close();
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (this.field_m == null) {
                            break L12;
                          } else {
                            this.field_m.close();
                            break L12;
                          }
                        }
                        break L9;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L13;
                      }
                    }
                    this.field_e = null;
                    break L0;
                  } else {
                    if (0 < var1_int) {
                      try {
                        L14: {
                          this.field_k.write(this.field_e, var2, var1_int);
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L15: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_b = true;
                          break L15;
                        }
                      }
                      this.field_c = (this.field_c - -var1_int) % this.field_j;
                      try {
                        L16: {
                          L17: {
                            if (this.field_a == this.field_c) {
                              this.field_k.flush();
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          break L16;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L18: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_b = true;
                          break L18;
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
              L19: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                ms.a((String) null, (Throwable) ((Object) var1_ref), 0);
                break L19;
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
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = Sumoblitz.field_L ? 1 : 0;
            if (this.field_l) {
              return;
            } else {
              L0: {
                if (param0 < -36) {
                  break L0;
                } else {
                  this.field_g = (wi) null;
                  break L0;
                }
              }
              var2_ref = this;
              synchronized (var2_ref) {
                L1: {
                  this.field_l = true;
                  this.notifyAll();
                  break L1;
                }
              }
              if (this.field_o == null) {
                this.field_o = null;
                return;
              } else {
                L2: while (true) {
                  L3: {
                    L4: {
                      if (this.field_o.field_c != 0) {
                        break L4;
                      } else {
                        tg.a(1L, (byte) 113);
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (-2 == (this.field_o.field_c ^ -1)) {
                      try {
                        L5: {
                          ((Thread) (this.field_o.field_d)).join();
                          break L5;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var2 = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_o = null;
                        return;
                      }
                      break L3;
                    } else {
                      this.field_o = null;
                      return;
                    }
                  }
                  this.field_o = null;
                  return;
                }
              }
            }
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
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
                var5_ref = this;
                synchronized (var5_ref) {
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
                      L5: {
                        if (var6 >= param3) {
                          stackOut_17_0 = this;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          this.field_e[this.field_a] = param2[var6 + param0];
                          this.field_a = (this.field_a + 1) % this.field_j;
                          stackOut_13_0 = this;
                          stackIn_18_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (((dt) (this)).field_a != (-100 + this.field_c + this.field_j) % this.field_j) {
                              var6++;
                              continue L4;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      }
                      L6: {
                        if (((dt) (this)).field_o != null) {
                          break L6;
                        } else {
                          this.field_o = this.field_g.a(true, (Runnable) (this), 3);
                          break L6;
                        }
                      }
                      this.notifyAll();
                      break L2;
                    }
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("dt.G(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
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
          field_i = null;
          field_h = null;
          field_p = null;
          field_n = null;
          return;
        } else {
          field_i = null;
          field_h = null;
          field_p = null;
          field_n = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_l) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (stackIn_6_0 >= param2) {
                        break L4;
                      } else {
                        var5_int = this.field_d.read(param3, param1, param2);
                        var8 = var5_int;
                        var7 = 0;
                        if (var6 != 0) {
                          if (var7 <= var8) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          if (var7 < var8) {
                            param1 = param1 + var5_int;
                            param2 = param2 - var5_int;
                            if (var6 == 0) {
                              stackOut_5_0 = 0;
                              stackIn_6_0 = stackOut_5_0;
                              continue L1;
                            } else {
                              break L4;
                            }
                          } else {
                            throw new EOFException();
                          }
                        }
                      }
                    }
                    if (param0 <= -12) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  this.field_b = true;
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("dt.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
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
