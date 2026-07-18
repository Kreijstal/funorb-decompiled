/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pm implements Runnable {
    static boolean field_a;
    private wk field_e;
    private java.net.Socket field_g;
    static boolean field_d;
    private int field_h;
    private int field_i;
    private OutputStream field_f;
    private int field_l;
    private byte[] field_j;
    private boolean field_c;
    private boolean field_b;
    private InputStream field_m;
    private jj field_k;

    final int a(int param0) throws IOException {
        if (param0 != 15166) {
            ((pm) this).field_h = -24;
        }
        if (((pm) this).field_c) {
            return 0;
        }
        return ((pm) this).field_m.available();
    }

    protected final void finalize() {
        ((pm) this).b(0);
    }

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            Throwable var5 = null;
            int var6 = 0;
            Object var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (((pm) this).field_i != ((pm) this).field_l) {
                          break L3;
                        } else {
                          if (((pm) this).field_c) {
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
                        if (((pm) this).field_i >= ((pm) this).field_l) {
                          var1_int = ((pm) this).field_i - ((pm) this).field_l;
                          break L6;
                        } else {
                          var1_int = -((pm) this).field_l + ((pm) this).field_h;
                          break L6;
                        }
                      }
                      var2 = ((pm) this).field_l;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (((pm) this).field_m != null) {
                            ((pm) this).field_m.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (((pm) this).field_f == null) {
                            break L9;
                          } else {
                            ((pm) this).field_f.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (((pm) this).field_g == null) {
                            break L10;
                          } else {
                            ((pm) this).field_g.close();
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
                    ((pm) this).field_j = null;
                    break L0;
                  } else {
                    if (0 >= var1_int) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((pm) this).field_f.write(((pm) this).field_j, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          ((pm) this).field_b = true;
                          break L13;
                        }
                      }
                      ((pm) this).field_l = (((pm) this).field_l + var1_int) % ((pm) this).field_h;
                      try {
                        L14: {
                          L15: {
                            if (((pm) this).field_i != ((pm) this).field_l) {
                              break L15;
                            } else {
                              ((pm) this).field_f.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          ((pm) this).field_b = true;
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
                ke.a((Throwable) (Object) var1_ref, (String) null, 0);
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
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (((pm) this).field_c) {
          return;
        } else {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              r discarded$3 = pm.a(79, 67);
              break L0;
            }
          }
          var2 = this;
          synchronized (var2) {
            L1: {
              ((pm) this).field_c = true;
              this.notifyAll();
              break L1;
            }
          }
          L2: {
            if (((pm) this).field_e == null) {
              break L2;
            } else {
              L3: while (true) {
                if (((pm) this).field_e.field_b != 0) {
                  if (((pm) this).field_e.field_b == 1) {
                    try {
                      L4: {
                        ((Thread) ((pm) this).field_e.field_d).join();
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
                  um.a(true, 1L);
                  continue L3;
                }
              }
            }
          }
          ((pm) this).field_e = null;
          return;
        }
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
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
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (((pm) this).field_c) {
              return;
            } else {
              L1: while (true) {
                if (0 >= param2) {
                  L2: {
                    if (!param1) {
                      break L2;
                    } else {
                      ((pm) this).field_k = null;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5_int = ((pm) this).field_m.read(param0, param3, param2);
                  if (var5_int > 0) {
                    param3 = param3 + var5_int;
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
            stackOut_11_1 = new StringBuilder().append("pm.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(int param0) throws IOException {
        if (param0 != -26206) {
            ((pm) this).run();
        }
        if (!(!((pm) this).field_c)) {
            return;
        }
        if (!(!((pm) this).field_b)) {
            ((pm) this).field_b = false;
            throw new IOException();
        }
    }

    final static void a(byte param0, boolean param1) {
        ak.a(false, param1, 3);
    }

    pm(java.net.Socket param0, jj param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int a(byte param0) throws IOException {
        int var2 = 29 / ((42 - param0) / 42);
        if (!(!((pm) this).field_c)) {
            return 0;
        }
        return ((pm) this).field_m.read();
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int var9 = 0;
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
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (((pm) this).field_c) {
              return;
            } else {
              if (!((pm) this).field_b) {
                L1: {
                  if (null != ((pm) this).field_j) {
                    break L1;
                  } else {
                    ((pm) this).field_j = new byte[((pm) this).field_h];
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= param1) {
                        L4: {
                          var7 = -118 / ((param2 - -29) / 52);
                          if (((pm) this).field_e == null) {
                            ((pm) this).field_e = ((pm) this).field_k.a(3, (Runnable) this, 0);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((pm) this).field_j[((pm) this).field_i] = param3[var6 + param0];
                        ((pm) this).field_i = (1 + ((pm) this).field_i) % ((pm) this).field_h;
                        if ((((pm) this).field_h + ((pm) this).field_l - 100) % ((pm) this).field_h == ((pm) this).field_i) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                ((pm) this).field_b = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("pm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final static r a(int param0, int param1) {
        if (param1 <= 122) {
            field_d = true;
        }
        return vo.a(false, 126, 1, param0, false, true);
    }

    private pm(java.net.Socket param0, jj param1, int param2) throws IOException {
        ((pm) this).field_l = 0;
        ((pm) this).field_i = 0;
        ((pm) this).field_c = false;
        ((pm) this).field_b = false;
        try {
            ((pm) this).field_k = param1;
            ((pm) this).field_g = param0;
            ((pm) this).field_g.setSoTimeout(30000);
            ((pm) this).field_g.setTcpNoDelay(true);
            ((pm) this).field_m = ((pm) this).field_g.getInputStream();
            ((pm) this).field_f = ((pm) this).field_g.getOutputStream();
            ((pm) this).field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "pm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
