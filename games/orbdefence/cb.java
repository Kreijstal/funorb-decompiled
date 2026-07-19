/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb implements Runnable {
    private int field_p;
    static String field_g;
    private boolean field_d;
    private byte[] field_c;
    private int field_l;
    private int field_h;
    static im field_b;
    static fh field_a;
    private eb field_f;
    private OutputStream field_i;
    private InputStream field_m;
    static int field_j;
    private be field_k;
    static int field_e;
    private boolean field_o;
    private java.net.Socket field_n;

    final void a(int param0) {
        try {
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            java.awt.Component var5 = null;
            Throwable decompiledCaughtException = null;
            var4 = OrbDefence.field_D ? 1 : 0;
            if (this.field_d) {
              return;
            } else {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  this.field_d = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (null != this.field_f) {
                L1: while (true) {
                  L2: {
                    L3: {
                      if (this.field_f.field_a != 0) {
                        break L3;
                      } else {
                        hb.a(1L, param0 + 120);
                        if (var4 != 0) {
                          break L2;
                        } else {
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (this.field_f.field_a == 1) {
                      try {
                        L4: {
                          ((Thread) (this.field_f.field_g)).join();
                          break L4;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          var2 = (InterruptedException) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      break L2;
                    } else {
                      this.field_f = null;
                      if (param0 == 1) {
                        return;
                      } else {
                        var5 = (java.awt.Component) null;
                        cb.a(-74, (java.awt.Component) null);
                        return;
                      }
                    }
                  }
                  this.field_f = null;
                  if (param0 == 1) {
                    return;
                  } else {
                    var5 = (java.awt.Component) null;
                    cb.a(-74, (java.awt.Component) null);
                    return;
                  }
                }
              } else {
                this.field_f = null;
                if (param0 == 1) {
                  return;
                } else {
                  var5 = (java.awt.Component) null;
                  cb.a(-74, (java.awt.Component) null);
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

    final static void a(int param0, java.awt.Component param1) {
        if (param0 != 5000) {
            return;
        }
        try {
            param1.removeMouseListener(nk.field_q);
            param1.removeMouseMotionListener(nk.field_q);
            param1.removeFocusListener(nk.field_q);
            db.field_f = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "cb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
            var6 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_h == this.field_l) {
                          L4: {
                            if (!this.field_d) {
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
                          if (this.field_h <= this.field_l) {
                            break L8;
                          } else {
                            var1_int = this.field_p - this.field_h;
                            if (var6 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var1_int = -this.field_h + this.field_l;
                        break L7;
                      }
                      var2 = this.field_h;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L9: {
                        L10: {
                          if (null == this.field_m) {
                            break L10;
                          } else {
                            this.field_m.close();
                            break L10;
                          }
                        }
                        L11: {
                          if (null == this.field_i) {
                            break L11;
                          } else {
                            this.field_i.close();
                            break L11;
                          }
                        }
                        L12: {
                          if (this.field_n != null) {
                            this.field_n.close();
                            break L12;
                          } else {
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
                    this.field_c = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L14: {
                          this.field_i.write(this.field_c, var2, var1_int);
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L15: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_o = true;
                          break L15;
                        }
                      }
                      this.field_h = (var1_int + this.field_h) % this.field_p;
                      try {
                        L16: {
                          L17: {
                            if (this.field_l == this.field_h) {
                              this.field_i.flush();
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
                          this.field_o = true;
                          break L18;
                        }
                      }
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
                pe.a((byte) -13, (Throwable) ((Object) var1_ref), (String) null);
                break L19;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 >= -66) {
          cb.a((byte) -75);
          field_a = null;
          field_b = null;
          field_g = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_g = null;
          return;
        }
    }

    cb(java.net.Socket param0, be param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (this.field_d) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.field_o) {
                L1: {
                  if (null != this.field_c) {
                    break L1;
                  } else {
                    this.field_c = new byte[this.field_p];
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    L3: {
                      if (param0 == 30) {
                        break L3;
                      } else {
                        this.field_m = (InputStream) null;
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      L5: {
                        if (param3 <= var6) {
                          L6: {
                            if (this.field_f != null) {
                              break L6;
                            } else {
                              this.field_f = this.field_k.a(314572800, 3, (Runnable) (this));
                              break L6;
                            }
                          }
                          this.notifyAll();
                          break L5;
                        } else {
                          this.field_c[this.field_l] = param1[param2 + var6];
                          this.field_l = (1 + this.field_l) % this.field_p;
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if ((-100 + this.field_h - -this.field_p) % this.field_p == this.field_l) {
                              throw new IOException();
                            } else {
                              var6++;
                              continue L4;
                            }
                          }
                        }
                      }
                      break L2;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_o = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int b(byte param0) throws IOException {
        java.awt.Component var3 = null;
        if (this.field_d) {
          return 0;
        } else {
          if (param0 != 101) {
            var3 = (java.awt.Component) null;
            cb.a(45, (java.awt.Component) null);
            return this.field_m.available();
          } else {
            return this.field_m.available();
          }
        }
    }

    final void b(int param0) throws IOException {
        if (param0 < -54) {
          if (!this.field_d) {
            if (this.field_o) {
              this.field_o = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          this.a(62);
          if (!this.field_d) {
            if (this.field_o) {
              this.field_o = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final int a(boolean param0) throws IOException {
        if (param0) {
          if (this.field_d) {
            return 0;
          } else {
            return this.field_m.read();
          }
        } else {
          this.field_h = 44;
          if (this.field_d) {
            return 0;
          } else {
            return this.field_m.read();
          }
        }
    }

    protected final void finalize() {
        this.a(1);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (!this.field_d) {
              var5_int = -79 / ((23 - param2) / 35);
              L1: while (true) {
                if (param1 <= 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = this.field_m.read(param3, param0, param1);
                  if (var7 == 0) {
                    if ((var6 ^ -1) < -1) {
                      param1 = param1 - var6;
                      param0 = param0 + var6;
                      continue L1;
                    } else {
                      throw new EOFException();
                    }
                  } else {
                    return;
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
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("cb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private cb(java.net.Socket param0, be param1, int param2) throws IOException {
        this.field_h = 0;
        this.field_l = 0;
        this.field_o = false;
        this.field_d = false;
        try {
            this.field_k = param1;
            this.field_n = param0;
            this.field_n.setSoTimeout(30000);
            this.field_n.setTcpNoDelay(true);
            this.field_m = this.field_n.getInputStream();
            this.field_i = this.field_n.getOutputStream();
            this.field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_g = "Achieved";
        field_b = new im();
    }
}
