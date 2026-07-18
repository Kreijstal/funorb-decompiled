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
        if (param0 >= -84) {
            ((dt) this).field_e = null;
        }
        if (((dt) this).field_l) {
            return 0;
        }
        return ((dt) this).field_d.read();
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
            var6 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((dt) this).field_a == ((dt) this).field_c) {
                          if (!((dt) this).field_l) {
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
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (((dt) this).field_c > ((dt) this).field_a) {
                          var1_int = -((dt) this).field_c + ((dt) this).field_j;
                          break L6;
                        } else {
                          var1_int = -((dt) this).field_c + ((dt) this).field_a;
                          break L6;
                        }
                      }
                      var2 = ((dt) this).field_c;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null != ((dt) this).field_d) {
                            ((dt) this).field_d.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != ((dt) this).field_k) {
                            ((dt) this).field_k.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (((dt) this).field_m == null) {
                            break L10;
                          } else {
                            ((dt) this).field_m.close();
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
                    ((dt) this).field_e = null;
                    break L0;
                  } else {
                    if (0 < var1_int) {
                      try {
                        L12: {
                          ((dt) this).field_k.write(((dt) this).field_e, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((dt) this).field_b = true;
                          break L13;
                        }
                      }
                      ((dt) this).field_c = (((dt) this).field_c - -var1_int) % ((dt) this).field_j;
                      try {
                        L14: {
                          L15: {
                            if (((dt) this).field_a == ((dt) this).field_c) {
                              ((dt) this).field_k.flush();
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
                          ((dt) this).field_b = true;
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
                ms.a((String) null, (Throwable) (Object) var1_ref, 0);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) throws IOException {
        if (!(!((dt) this).field_l)) {
            return;
        }
        int var2 = -72 / ((36 - param0) / 42);
        if (!(!((dt) this).field_b)) {
            ((dt) this).field_b = false;
            throw new IOException();
        }
    }

    protected final void finalize() {
        ((dt) this).a((byte) -97);
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (((dt) this).field_l) {
          return;
        } else {
          L0: {
            if (param0 < -36) {
              break L0;
            } else {
              ((dt) this).field_g = null;
              break L0;
            }
          }
          var2 = this;
          synchronized (var2) {
            L1: {
              ((dt) this).field_l = true;
              this.notifyAll();
              break L1;
            }
          }
          L2: {
            if (((dt) this).field_o == null) {
              break L2;
            } else {
              L3: while (true) {
                if (((dt) this).field_o.field_c != 0) {
                  if (((dt) this).field_o.field_c == 1) {
                    try {
                      L4: {
                        ((Thread) ((dt) this).field_o.field_d).join();
                        break L4;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  tg.a(1L, (byte) 113);
                  continue L3;
                }
              }
            }
          }
          ((dt) this).field_o = null;
          return;
        }
    }

    final int c(int param0) throws IOException {
        if (param0 >= -22) {
            return 73;
        }
        if (((dt) this).field_l) {
            return 0;
        }
        return ((dt) this).field_d.available();
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!((dt) this).field_l) {
              if (((dt) this).field_b) {
                ((dt) this).field_b = false;
                throw new IOException();
              } else {
                L1: {
                  if (null != ((dt) this).field_e) {
                    break L1;
                  } else {
                    ((dt) this).field_e = new byte[((dt) this).field_j];
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
                        ((dt) this).field_m = null;
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= param3) {
                        L5: {
                          if (((dt) this).field_o != null) {
                            break L5;
                          } else {
                            ((dt) this).field_o = ((dt) this).field_g.a(true, (Runnable) this, 3);
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((dt) this).field_e[((dt) this).field_a] = param2[var6 + param0];
                        ((dt) this).field_a = (((dt) this).field_a + 1) % ((dt) this).field_j;
                        if (((dt) this).field_a != (-100 + ((dt) this).field_c + ((dt) this).field_j) % ((dt) this).field_j) {
                          var6++;
                          continue L4;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("dt.G(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param3 + ')');
        }
    }

    dt(java.net.Socket param0, wi param1) throws IOException {
        this(param0, param1, 5000);
    }

    private dt(java.net.Socket param0, wi param1, int param2) throws IOException {
        ((dt) this).field_c = 0;
        ((dt) this).field_l = false;
        ((dt) this).field_b = false;
        ((dt) this).field_a = 0;
        try {
            ((dt) this).field_m = param0;
            ((dt) this).field_g = param1;
            ((dt) this).field_m.setSoTimeout(30000);
            ((dt) this).field_m.setTcpNoDelay(true);
            ((dt) this).field_d = ((dt) this).field_m.getInputStream();
            ((dt) this).field_k = ((dt) this).field_m.getOutputStream();
            ((dt) this).field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "dt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 <= 19) {
            dt.d(-53);
        }
        field_i = null;
        field_h = null;
        field_p = null;
        field_n = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (((dt) this).field_l) {
              return;
            } else {
              L1: while (true) {
                if (0 >= param2) {
                  L2: {
                    if (param0 <= -12) {
                      break L2;
                    } else {
                      ((dt) this).field_b = true;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5_int = ((dt) this).field_d.read(param3, param1, param2);
                  if (0 < var5_int) {
                    param1 = param1 + var5_int;
                    param2 = param2 - var5_int;
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
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("dt.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "More suggestions";
        field_f = true;
    }
}
