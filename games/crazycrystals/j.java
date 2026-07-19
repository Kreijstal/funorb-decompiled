/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j implements Runnable {
    private InputStream field_n;
    private int field_d;
    private boolean field_m;
    private int field_g;
    private byte[] field_a;
    private java.net.Socket field_c;
    static int field_j;
    private int field_f;
    private un field_b;
    static String field_h;
    private OutputStream field_e;
    private gb field_l;
    private boolean field_k;
    static int[] field_i;

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        boolean discarded$1 = false;
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
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            if (!this.field_k) {
              if (!this.field_m) {
                L1: {
                  if (this.field_a == null) {
                    this.field_a = new byte[this.field_d];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 >= 85) {
                    break L2;
                  } else {
                    discarded$1 = j.c((byte) -1);
                    break L2;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L3: {
                    var6 = 0;
                    L4: while (true) {
                      if (param3 <= var6) {
                        L5: {
                          if (null != this.field_l) {
                            break L5;
                          } else {
                            this.field_l = this.field_b.a((Runnable) (this), 2, 3);
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L3;
                      } else {
                        this.field_a[this.field_g] = param2[var6 + param0];
                        this.field_g = (this.field_g + 1) % this.field_d;
                        if ((-100 + (this.field_d + this.field_f)) % this.field_d == this.field_g) {
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
                this.field_m = false;
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
            stackOut_24_1 = new StringBuilder().append("j.E(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ')');
        }
    }

    final static void a(ak param0, int param1, boolean param2) {
        md var3 = tp.field_f;
        if (param2) {
            return;
        }
        try {
            var3.d(8, param1);
            var3.a(true, 5);
            var3.a(!param2 ? true : false, 0);
            var3.c(-161478600, param0.field_g);
            var3.a(true, param0.field_h);
            var3.a(!param2 ? true : false, param0.field_j);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "j.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0) throws IOException {
        if (param0 == 5) {
          if (this.field_k) {
            return 0;
          } else {
            return this.field_n.read();
          }
        } else {
          this.field_m = true;
          if (this.field_k) {
            return 0;
          } else {
            return this.field_n.read();
          }
        }
    }

    j(java.net.Socket param0, un param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) throws IOException {
        int var2 = 0;
        var2 = 0 % ((param0 - -23) / 37);
        if (!this.field_k) {
          if (this.field_m) {
            this.field_m = false;
            throw new IOException();
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(byte param0) {
        try {
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = CrazyCrystals.field_B;
            if (this.field_k) {
              return;
            } else {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  L1: {
                    this.field_k = true;
                    this.notifyAll();
                    if (param0 == -118) {
                      break L1;
                    } else {
                      this.field_g = -44;
                      break L1;
                    }
                  }
                  break L0;
                }
              }
              if (null != this.field_l) {
                L2: while (true) {
                  if (this.field_l.field_a != 0) {
                    if (this.field_l.field_a == 1) {
                      try {
                        L3: {
                          ((Thread) (this.field_l.field_b)).join();
                          break L3;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var2 = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_l = null;
                        return;
                      }
                      this.field_l = null;
                      return;
                    } else {
                      this.field_l = null;
                      return;
                    }
                  } else {
                    fh.a(true, 1L);
                    continue L2;
                  }
                }
              } else {
                this.field_l = null;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            var6 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_g == this.field_f) {
                          if (this.field_k) {
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
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (this.field_f <= this.field_g) {
                          var1_int = this.field_g + -this.field_f;
                          break L6;
                        } else {
                          var1_int = -this.field_f + this.field_d;
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
                          if (this.field_n == null) {
                            break L8;
                          } else {
                            this.field_n.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null == this.field_e) {
                            break L9;
                          } else {
                            this.field_e.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != this.field_c) {
                            this.field_c.close();
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
                    this.field_a = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          this.field_e.write(this.field_a, var2, var1_int);
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
                      this.field_f = (this.field_f - -var1_int) % this.field_d;
                      try {
                        L14: {
                          L15: {
                            if (this.field_f != this.field_g) {
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
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              L17: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                wp.a((Throwable) ((Object) var1_ref), (String) null, 21862);
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
        this.b((byte) -118);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            if (this.field_k) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: while (true) {
                if (param1 <= 0) {
                  if (param2 == 2034) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_f = -31;
                    return;
                  }
                } else {
                  var5_int = this.field_n.read(param0, param3, param1);
                  if (var5_int <= 0) {
                    throw new EOFException();
                  } else {
                    param3 = param3 + var5_int;
                    param1 = param1 - var5_int;
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
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("j.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        if (param0 == 45) {
            return;
        }
        field_h = (String) null;
    }

    final int c(int param0) throws IOException {
        if (this.field_k) {
            return 0;
        }
        if (param0 != 0) {
            return -14;
        }
        return this.field_n.available();
    }

    private j(java.net.Socket param0, un param1, int param2) throws IOException {
        this.field_f = 0;
        this.field_g = 0;
        this.field_k = false;
        this.field_m = false;
        try {
            this.field_b = param1;
            this.field_c = param0;
            this.field_c.setSoTimeout(30000);
            this.field_c.setTcpNoDelay(true);
            this.field_n = this.field_c.getInputStream();
            this.field_e = this.field_c.getOutputStream();
            this.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "j.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        ka.field_j = true;
        if (param0 != -23) {
          return false;
        } else {
          L0: {
            ee.field_e = lo.a((byte) 81) - -15000L;
            if (hp.field_s != 11) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_h = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
