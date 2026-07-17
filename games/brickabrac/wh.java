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
            ((wh) this).finalize();
        }
        if (((wh) this).field_k) {
            return 0;
        }
        return ((wh) this).field_e.read();
    }

    protected final void finalize() {
        ((wh) this).a((byte) 111);
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
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
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (((wh) this).field_k) {
              return;
            } else {
              if (param1) {
                if (((wh) this).field_g) {
                  ((wh) this).field_g = false;
                  throw new IOException();
                } else {
                  L1: {
                    if (((wh) this).field_c == null) {
                      ((wh) this).field_c = new byte[((wh) this).field_a];
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
                        if (var6 >= param2) {
                          L4: {
                            if (null != ((wh) this).field_i) {
                              break L4;
                            } else {
                              ((wh) this).field_i = ((wh) this).field_f.a(3, (Runnable) this, (byte) -69);
                              break L4;
                            }
                          }
                          this.notifyAll();
                          break L2;
                        } else {
                          ((wh) this).field_c[((wh) this).field_b] = param0[param3 + var6];
                          ((wh) this).field_b = (1 + ((wh) this).field_b) % ((wh) this).field_a;
                          if ((((wh) this).field_a + ((wh) this).field_j - 100) % ((wh) this).field_a != ((wh) this).field_b) {
                            var6++;
                            continue L3;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    }
                  }
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("wh.B(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!((wh) this).field_k) {
              if (param0 == 25826) {
                L1: while (true) {
                  if (0 >= param2) {
                    break L0;
                  } else {
                    var5_int = ((wh) this).field_e.read(param1, param3, param2);
                    if (var5_int > 0) {
                      param2 = param2 - var5_int;
                      param3 = param3 + var5_int;
                      continue L1;
                    } else {
                      throw new EOFException();
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("wh.E(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
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
            Object var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((wh) this).field_b != ((wh) this).field_j) {
                          break L3;
                        } else {
                          if (!((wh) this).field_k) {
                            {
                              L4: {
                                this.wait();
                                break L4;
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
                        if (((wh) this).field_j <= ((wh) this).field_b) {
                          var1_int = -((wh) this).field_j + ((wh) this).field_b;
                          break L6;
                        } else {
                          var1_int = ((wh) this).field_a - ((wh) this).field_j;
                          break L6;
                        }
                      }
                      var2 = ((wh) this).field_j;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (((wh) this).field_e != null) {
                            ((wh) this).field_e.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null == ((wh) this).field_l) {
                            break L9;
                          } else {
                            ((wh) this).field_l.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((wh) this).field_d) {
                            ((wh) this).field_d.close();
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
                    ((wh) this).field_c = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((wh) this).field_l.write(((wh) this).field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((wh) this).field_g = true;
                          break L13;
                        }
                      }
                      ((wh) this).field_j = (var1_int + ((wh) this).field_j) % ((wh) this).field_a;
                      try {
                        L14: {
                          L15: {
                            if (((wh) this).field_j != ((wh) this).field_b) {
                              break L15;
                            } else {
                              ((wh) this).field_l.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((wh) this).field_g = true;
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
                var7 = null;
                rk.a((String) null, (Throwable) (Object) var1_ref, 105);
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
        field_h = null;
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (!((wh) this).field_k) {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((wh) this).field_k = true;
              this.notifyAll();
              break L0;
            }
          }
          L1: {
            if (((wh) this).field_i == null) {
              break L1;
            } else {
              L2: while (true) {
                if (((wh) this).field_i.field_f != 0) {
                  if (((wh) this).field_i.field_f != 1) {
                    break L1;
                  } else {
                    try {
                      L3: {
                        ((Thread) ((wh) this).field_i.field_e).join();
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    break L1;
                  }
                } else {
                  wj.a(-127, 1L);
                  continue L2;
                }
              }
            }
          }
          L5: {
            ((wh) this).field_i = null;
            if (param0 >= 110) {
              break L5;
            } else {
              ((wh) this).a((byte) 56);
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (nq.field_p) {
            lb.b(lb.field_i, lb.field_b, -lb.field_i + lb.field_f, -lb.field_b + lb.field_j);
            wd.field_w.a(true, false);
        }
    }

    final void c(int param0) throws IOException {
        if (!(!((wh) this).field_k)) {
            return;
        }
        if (param0 != -1) {
            ((wh) this).field_b = -17;
        }
        if (!(!((wh) this).field_g)) {
            ((wh) this).field_g = false;
            throw new IOException();
        }
    }

    final int d(int param0) throws IOException {
        if (!(!((wh) this).field_k)) {
            return 0;
        }
        if (param0 != 10434) {
            ((wh) this).finalize();
        }
        return ((wh) this).field_e.available();
    }

    private wh(java.net.Socket param0, tg param1, int param2) throws IOException {
        ((wh) this).field_g = false;
        ((wh) this).field_k = false;
        ((wh) this).field_j = 0;
        ((wh) this).field_b = 0;
        try {
            ((wh) this).field_f = param1;
            ((wh) this).field_d = param0;
            ((wh) this).field_d.setSoTimeout(30000);
            ((wh) this).field_d.setTcpNoDelay(true);
            ((wh) this).field_e = ((wh) this).field_d.getInputStream();
            ((wh) this).field_l = ((wh) this).field_d.getOutputStream();
            ((wh) this).field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "wh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
    }
}
