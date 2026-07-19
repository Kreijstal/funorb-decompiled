/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wb implements Runnable {
    private InputStream field_b;
    static qe field_p;
    static String[] field_n;
    private uj field_c;
    static String field_m;
    private boolean field_k;
    private boolean field_e;
    private java.net.Socket field_i;
    private int field_a;
    static int field_d;
    private OutputStream field_f;
    private int field_l;
    private byte[] field_o;
    private mi field_h;
    private int field_g;
    static String field_q;
    static int field_j;

    public static void a(boolean param0) {
        if (!param0) {
          field_d = -75;
          field_q = null;
          field_p = null;
          field_n = null;
          field_m = null;
          return;
        } else {
          field_q = null;
          field_p = null;
          field_n = null;
          field_m = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == -1) {
              if (!this.field_k) {
                L1: while (true) {
                  if ((param2 ^ -1) >= -1) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var5_int = this.field_b.read(param3, param1, param2);
                    if ((var5_int ^ -1) >= -1) {
                      throw new EOFException();
                    } else {
                      param1 = param1 + var5_int;
                      param2 = param2 - var5_int;
                      continue L1;
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
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("wb.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw oj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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

    final static void a(boolean param0, byte param1) {
        ee.a(param0, 1, false);
        if (param1 <= -66) {
            return;
        }
        field_q = (String) null;
    }

    protected final void finalize() {
        this.a((byte) -90);
    }

    final static void b(byte param0) {
        kd var1 = (kd) ((Object) mc.field_k.d((byte) -119));
        if (!(var1 != null)) {
            var1 = new kd();
        }
        var1.a(qg.field_g, qg.field_a, qg.field_i, qg.field_f, (byte) -8, qg.field_l, qg.field_c, qg.field_k);
        rf.field_db.a(var1, -84);
        int var2 = 126 / ((param0 - -23) / 54);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_k) {
              break L0;
            } else {
              if (this.field_e) {
                this.field_e = false;
                throw new IOException();
              } else {
                L1: {
                  if (this.field_o == null) {
                    this.field_o = new byte[this.field_g];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      if (param0 <= var6) {
                        L4: {
                          if (null != this.field_h) {
                            break L4;
                          } else {
                            this.field_h = this.field_c.a((Runnable) (this), true, 3);
                            break L4;
                          }
                        }
                        L5: {
                          this.notifyAll();
                          if (param2 >= 57) {
                            break L5;
                          } else {
                            wb.a(true);
                            break L5;
                          }
                        }
                        break L2;
                      } else {
                        this.field_o[this.field_l] = param3[param1 + var6];
                        this.field_l = (this.field_l - -1) % this.field_g;
                        if (this.field_l == (-100 + this.field_a + this.field_g) % this.field_g) {
                          throw new IOException();
                        } else {
                          var6++;
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
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var5);
            stackOut_26_1 = new StringBuilder().append("wb.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    wb(java.net.Socket param0, uj param1) throws IOException {
        this(param0, param1, 5000);
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
            var6 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_a == this.field_l) {
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
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (this.field_l < this.field_a) {
                          var1_int = this.field_g + -this.field_a;
                          break L6;
                        } else {
                          var1_int = this.field_l + -this.field_a;
                          break L6;
                        }
                      }
                      var2 = this.field_a;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (this.field_b != null) {
                            this.field_b.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null == this.field_f) {
                            break L9;
                          } else {
                            this.field_f.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_i != null) {
                            this.field_i.close();
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
                    if ((var1_int ^ -1) >= -1) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          this.field_f.write(this.field_o, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_e = true;
                          break L13;
                        }
                      }
                      this.field_a = (var1_int + this.field_a) % this.field_g;
                      try {
                        L14: {
                          L15: {
                            if (this.field_l == this.field_a) {
                              this.field_f.flush();
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
                          this.field_e = true;
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
                td.a((String) null, (Throwable) ((Object) var1_ref), (byte) -84);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(int param0) throws IOException {
        if (param0 == 0) {
          if (this.field_k) {
            return 0;
          } else {
            return this.field_b.read();
          }
        } else {
          wb.b((byte) 122);
          if (this.field_k) {
            return 0;
          } else {
            return this.field_b.read();
          }
        }
    }

    final void b(int param0) throws IOException {
        if (!(!this.field_k)) {
            return;
        }
        int var2 = 113 / ((67 - param0) / 58);
        if (!(!this.field_e)) {
            this.field_e = false;
            throw new IOException();
        }
    }

    final void a(byte param0) {
        try {
            int var2 = 0;
            InterruptedException var3 = null;
            Object var3_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Throwable decompiledCaughtException = null;
            var5 = TorChallenge.field_F ? 1 : 0;
            if (!this.field_k) {
              var2 = -85 / ((23 - param0) / 56);
              var3_ref = this;
              synchronized (var3_ref) {
                L0: {
                  this.field_k = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (this.field_h != null) {
                L1: while (true) {
                  if (-1 != (this.field_h.field_d ^ -1)) {
                    if (-2 != (this.field_h.field_d ^ -1)) {
                      this.field_h = null;
                      return;
                    } else {
                      try {
                        L2: {
                          ((Thread) (this.field_h.field_g)).join();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var3 = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_h = null;
                        return;
                      }
                      this.field_h = null;
                      return;
                    }
                  } else {
                    c.a(115, 1L);
                    continue L1;
                  }
                }
              } else {
                this.field_h = null;
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

    private wb(java.net.Socket param0, uj param1, int param2) throws IOException {
        this.field_l = 0;
        this.field_a = 0;
        this.field_e = false;
        this.field_k = false;
        try {
            this.field_c = param1;
            this.field_i = param0;
            this.field_i.setSoTimeout(30000);
            this.field_i.setTcpNoDelay(true);
            this.field_b = this.field_i.getInputStream();
            this.field_f = this.field_i.getOutputStream();
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "wb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0) throws IOException {
        if (this.field_k) {
            return 0;
        }
        if (param0 != 0) {
            wb.a(false, (byte) 115);
            return this.field_b.available();
        }
        return this.field_b.available();
    }

    static {
        field_n = new String[]{"Coin Collector", "Master of War", "Jade Collector", "Jade Expert", "Jade Master", "Bonus Walker", "Bonus Runner", "Bonus Sprinter", "Trainee Monk", "Enlightened Monk", "Master Monk", "Wise, Aged Master Monk", "Seal Collector", "Seal Expert", "Seal Master", "Agility Master", "Skilled Skuller"};
        field_m = "Loading...";
        field_q = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
