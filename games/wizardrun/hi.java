/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.awt.Canvas;

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
        if (!(!((hi) this).field_g)) {
            return 0;
        }
        return ((hi) this).field_m.read();
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
          if (!((hi) this).field_g) {
            if (!((hi) this).field_f) {
              L0: {
                if (null != ((hi) this).field_i) {
                  break L0;
                } else {
                  ((hi) this).field_i = new byte[((hi) this).field_n];
                  break L0;
                }
              }
              L1: {
                if (param2 == 1) {
                  break L1;
                } else {
                  ((hi) this).b((byte) 47);
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
                        if (null == ((hi) this).field_e) {
                          ((hi) this).field_e = ((hi) this).field_j.a((byte) -118, (Runnable) this, 3);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.notifyAll();
                      break L2;
                    } else {
                      ((hi) this).field_i[((hi) this).field_b] = param1[var6 + param3];
                      ((hi) this).field_b = (1 + ((hi) this).field_b) % ((hi) this).field_n;
                      if (((hi) this).field_b == (-100 + (((hi) this).field_n + ((hi) this).field_d)) % ((hi) this).field_n) {
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
            } else {
              ((hi) this).field_f = false;
              throw new IOException();
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("hi.G(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0) throws IOException {
        if (((hi) this).field_g) {
          return;
        } else {
          if (param0 == 0) {
            if (((hi) this).field_f) {
              ((hi) this).field_f = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            ((hi) this).field_e = null;
            if (((hi) this).field_f) {
              ((hi) this).field_f = false;
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
              stackIn_8_0 = (Object) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = wizardrun.field_G;
              stackIn_8_0 = (Object) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null != ki.field_E) {
              stackOut_3_0 = ki.field_E;
              stackIn_4_0 = (Object) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = wizardrun.field_G;
              stackIn_4_0 = (Object) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_4_0;
        }
    }

    final void b(byte param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        if (((hi) this).field_g) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                if (param0 == 76) {
                  break L1;
                } else {
                  java.awt.Canvas discarded$4 = hi.d((byte) 8);
                  break L1;
                }
              }
              ((hi) this).field_g = true;
              this.notifyAll();
              break L0;
            }
          }
          L2: {
            if (null == ((hi) this).field_e) {
              break L2;
            } else {
              L3: while (true) {
                if (((hi) this).field_e.field_a != 0) {
                  if (1 == ((hi) this).field_e.field_a) {
                    try {
                      L4: {
                        ((Thread) ((hi) this).field_e.field_e).join();
                        decompiledRegionSelector0 = 0;
                        break L4;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L5;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      ((hi) this).field_e = null;
                      return;
                    } else {
                      break L2;
                    }
                  } else {
                    ((hi) this).field_e = null;
                    return;
                  }
                } else {
                  int discarded$5 = 0;
                  tg.a(1L);
                  continue L3;
                }
              }
            }
          }
          ((hi) this).field_e = null;
          return;
        }
    }

    final int c(byte param0) throws IOException {
        if (param0 != 89) {
            ((hi) this).field_g = true;
            if (!(!((hi) this).field_g)) {
                return 0;
            }
            return ((hi) this).field_m.available();
        }
        if (!(!((hi) this).field_g)) {
            return 0;
        }
        return ((hi) this).field_m.available();
    }

    protected final void finalize() {
        ((hi) this).b((byte) 76);
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
            if (!((hi) this).field_g) {
              L1: while (true) {
                if (param2 <= 0) {
                  break L0;
                } else {
                  var6 = ((hi) this).field_m.read(param0, param3, param2);
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
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("hi.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
            Object var7 = null;
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
                        if (((hi) this).field_b != ((hi) this).field_d) {
                          break L3;
                        } else {
                          if (((hi) this).field_g) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
                            {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            }
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (((hi) this).field_d > ((hi) this).field_b) {
                          var1_int = -((hi) this).field_d + ((hi) this).field_n;
                          break L6;
                        } else {
                          var1_int = ((hi) this).field_b - ((hi) this).field_d;
                          break L6;
                        }
                      }
                      var2 = ((hi) this).field_d;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (((hi) this).field_m == null) {
                            break L8;
                          } else {
                            ((hi) this).field_m.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null == ((hi) this).field_h) {
                            break L9;
                          } else {
                            ((hi) this).field_h.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null == ((hi) this).field_o) {
                            break L10;
                          } else {
                            ((hi) this).field_o.close();
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
                    ((hi) this).field_i = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((hi) this).field_h.write(((hi) this).field_i, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((hi) this).field_f = true;
                          break L13;
                        }
                      }
                      ((hi) this).field_d = (((hi) this).field_d - -var1_int) % ((hi) this).field_n;
                      try {
                        L14: {
                          L15: {
                            if (((hi) this).field_b == ((hi) this).field_d) {
                              ((hi) this).field_h.flush();
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((hi) this).field_f = true;
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
                var7 = null;
                rg.a((Throwable) (Object) var1_ref, (String) null, -562);
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
        ((hi) this).field_g = false;
        ((hi) this).field_b = 0;
        ((hi) this).field_f = false;
        ((hi) this).field_d = 0;
        try {
            ((hi) this).field_j = param1;
            ((hi) this).field_o = param0;
            ((hi) this).field_o.setSoTimeout(30000);
            ((hi) this).field_o.setTcpNoDelay(true);
            ((hi) this).field_m = ((hi) this).field_o.getInputStream();
            ((hi) this).field_h = ((hi) this).field_o.getOutputStream();
            ((hi) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "hi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new boolean[112];
        field_l = new rc();
        field_a = -480;
    }
}
