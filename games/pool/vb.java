/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vb implements Runnable {
    private InputStream field_l;
    private int field_i;
    static String field_c;
    static int field_f;
    private java.net.Socket field_n;
    private le field_d;
    private int field_a;
    private boolean field_e;
    static of field_m;
    private int field_k;
    private byte[] field_j;
    private boolean field_h;
    static nb field_b;
    private OutputStream field_g;
    private sj field_o;
    static int[] field_p;

    vb(java.net.Socket param0, sj param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_h) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: while (true) {
                if (0 >= param0) {
                  if (param1 == 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_n = (java.net.Socket) null;
                    return;
                  }
                } else {
                  var5_int = this.field_l.read(param3, param2, param0);
                  if (0 >= var5_int) {
                    throw new EOFException();
                  } else {
                    param0 = param0 - var5_int;
                    param2 = param2 + var5_int;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("vb.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_p = null;
        field_m = null;
        field_b = null;
        if (param0) {
            return;
        }
        field_f = 57;
    }

    final int a(int param0) throws IOException {
        if (this.field_h) {
            return 0;
        }
        if (param0 != 14528) {
            vb.a(false);
            return this.field_l.read();
        }
        return this.field_l.read();
    }

    final void e(int param0) throws IOException {
        if (this.field_h) {
            return;
        }
        if (param0 != 0) {
            this.c(-107);
            if (!(!this.field_e)) {
                this.field_e = false;
                throw new IOException();
            }
            return;
        }
        if (!(!this.field_e)) {
            this.field_e = false;
            throw new IOException();
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
            var6 = Pool.field_O;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_a != this.field_i) {
                          break L3;
                        } else {
                          if (this.field_h) {
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
                        var2 = this.field_a;
                        if (this.field_a > this.field_i) {
                          var1_int = this.field_k + -this.field_a;
                          break L6;
                        } else {
                          var1_int = this.field_i - this.field_a;
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
                          if (this.field_l != null) {
                            this.field_l.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_g != null) {
                            this.field_g.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null != this.field_n) {
                            this.field_n.close();
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
                    this.field_j = null;
                    break L0;
                  } else {
                    if (0 < var1_int) {
                      try {
                        L12: {
                          this.field_g.write(this.field_j, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_e = true;
                          break L13;
                        }
                      }
                      this.field_a = (var1_int + this.field_a) % this.field_k;
                      try {
                        L14: {
                          L15: {
                            if (this.field_a != this.field_i) {
                              break L15;
                            } else {
                              this.field_g.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_e = true;
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
                tc.a((Throwable) ((Object) var1_ref), (String) null, -8555);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, String param1, byte param2, nf param3, int param4, String param5, String param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        fq var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wd.field_Lb == aa.field_c) {
              var9 = new fq(wd.field_Ub, param3);
              var8 = 91 / ((48 - param2) / 53);
              wd.field_Ub.b(var9, 30000);
              if (!sq.k(0)) {
                qi.field_c = param0;
                j.field_b = param4;
                re.field_d = param5;
                vq.field_Xb = param6;
                wd.field_Lb = ra.field_e;
                sf.field_B = null;
                eo.field_Rb = param1;
                return true;
              } else {
                var9.p((byte) -52);
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("vb.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param6 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final int d(int param0) throws IOException {
        if (!this.field_h) {
          if (param0 <= 68) {
            this.field_i = -51;
            return this.field_l.available();
          } else {
            return this.field_l.available();
          }
        } else {
          return 0;
        }
    }

    final static ai b(int param0) {
        int var1 = 52 / ((param0 - 41) / 41);
        return qf.field_d;
    }

    final void c(int param0) {
        try {
            InterruptedException var2 = null;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            if (!this.field_h) {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  L1: {
                    if (param0 < -82) {
                      break L1;
                    } else {
                      this.field_e = false;
                      break L1;
                    }
                  }
                  this.field_h = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (null != this.field_d) {
                L2: while (true) {
                  if (0 != this.field_d.field_f) {
                    if (-2 == (this.field_d.field_f ^ -1)) {
                      try {
                        L3: {
                          ((Thread) (this.field_d.field_e)).join();
                          break L3;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var2 = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_d = null;
                        return;
                      }
                      this.field_d = null;
                      return;
                    } else {
                      this.field_d = null;
                      return;
                    }
                  } else {
                    cf.a(-126, 1L);
                    continue L2;
                  }
                }
              } else {
                this.field_d = null;
                return;
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

    protected final void finalize() {
        this.c(-119);
    }

    final static or a(int param0, pq param1) {
        or dupTemp$1 = null;
        RuntimeException var2 = null;
        String var3 = null;
        or stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -6584) {
                break L1;
              } else {
                var3 = (String) null;
                vb.a(false, (String) null, (byte) 126, (nf) null, -39, (String) null, (String) null);
                break L1;
              }
            }
            dupTemp$1 = new or(0, (or) null);
            param1.field_q = dupTemp$1;
            stackIn_3_0 = (or) (dupTemp$1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("vb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        int var7 = 0;
        try {
          L0: {
            if (this.field_h) {
              break L0;
            } else {
              var5_int = 17 / ((param1 - -12) / 58);
              if (this.field_e) {
                this.field_e = false;
                throw new IOException();
              } else {
                L1: {
                  if (this.field_j != null) {
                    break L1;
                  } else {
                    this.field_j = new byte[this.field_k];
                    break L1;
                  }
                }
                var6 = this;
                synchronized (var6) {
                  L2: {
                    var7 = 0;
                    L3: while (true) {
                      if (param2 <= var7) {
                        L4: {
                          if (null != this.field_d) {
                            break L4;
                          } else {
                            this.field_d = this.field_o.a(33, 3, (Runnable) (this));
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_j[this.field_i] = param0[param3 + var7];
                        this.field_i = (this.field_i - -1) % this.field_k;
                        if ((this.field_k + (this.field_a + -100)) % this.field_k == this.field_i) {
                          throw new IOException();
                        } else {
                          var7++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("vb.I(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private vb(java.net.Socket param0, sj param1, int param2) throws IOException {
        this.field_e = false;
        this.field_i = 0;
        this.field_a = 0;
        this.field_h = false;
        try {
            this.field_n = param0;
            this.field_o = param1;
            this.field_n.setSoTimeout(30000);
            this.field_n.setTcpNoDelay(true);
            this.field_l = this.field_n.getInputStream();
            this.field_g = this.field_n.getOutputStream();
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "to over <%0> great games";
    }
}
