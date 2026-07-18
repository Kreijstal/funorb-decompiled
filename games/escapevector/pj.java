/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pj implements Runnable {
    static om field_k;
    private boolean field_f;
    private java.net.Socket field_i;
    private int field_j;
    private int field_d;
    private boolean field_c;
    private la field_m;
    private byte[] field_l;
    private lk field_e;
    static ed[] field_g;
    private InputStream field_h;
    private OutputStream field_b;
    private int field_a;

    final void c(int param0) {
        InterruptedException var2 = null;
        Object var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        if (!((pj) this).field_f) {
          var2_ref = this;
          synchronized (var2_ref) {
            L0: {
              ((pj) this).field_f = true;
              this.notifyAll();
              break L0;
            }
          }
          L1: {
            if (param0 == 12497) {
              break L1;
            } else {
              ((pj) this).field_i = null;
              break L1;
            }
          }
          if (((pj) this).field_m != null) {
            L2: while (true) {
              if (0 != ((pj) this).field_m.field_f) {
                if (((pj) this).field_m.field_f != 1) {
                  ((pj) this).field_m = null;
                  return;
                } else {
                  try {
                    L3: {
                      ((Thread) ((pj) this).field_m.field_b).join();
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (InterruptedException) (Object) decompiledCaughtException;
                    ((pj) this).field_m = null;
                    return;
                  }
                  ((pj) this).field_m = null;
                  return;
                }
              } else {
                en.a((byte) 81, 1L);
                continue L2;
              }
            }
          } else {
            ((pj) this).field_m = null;
            return;
          }
        } else {
          return;
        }
    }

    protected final void finalize() {
        ((pj) this).c(12497);
    }

    final void a(byte param0) throws IOException {
        if (!(!((pj) this).field_f)) {
            return;
        }
        if (param0 != 123) {
            pj.b((byte) 28);
            if (!(!((pj) this).field_c)) {
                ((pj) this).field_c = false;
                throw new IOException();
            }
            return;
        }
        if (!(!((pj) this).field_c)) {
            ((pj) this).field_c = false;
            throw new IOException();
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        var8 = EscapeVector.field_A;
        try {
          if (((pj) this).field_f) {
            return;
          } else {
            if (!((pj) this).field_c) {
              L0: {
                if (((pj) this).field_l != null) {
                  break L0;
                } else {
                  ((pj) this).field_l = new byte[((pj) this).field_j];
                  break L0;
                }
              }
              var5_ref = this;
              synchronized (var5_ref) {
                L1: {
                  var6 = 0;
                  L2: while (true) {
                    if (param0 <= var6) {
                      L3: {
                        if (((pj) this).field_m == null) {
                          ((pj) this).field_m = ((pj) this).field_e.a(true, 3, (Runnable) this);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (param3 == 5000) {
                        this.notifyAll();
                        break L1;
                      } else {
                        return;
                      }
                    } else {
                      ((pj) this).field_l[((pj) this).field_d] = param2[param1 + var6];
                      ((pj) this).field_d = (((pj) this).field_d + 1) % ((pj) this).field_j;
                      if ((-100 + ((pj) this).field_a + ((pj) this).field_j) % ((pj) this).field_j != ((pj) this).field_d) {
                        var6++;
                        continue L2;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                }
              }
              return;
            } else {
              ((pj) this).field_c = false;
              throw new IOException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("pj.E(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param3 + ')');
        }
    }

    final int b(int param0) throws IOException {
        if (((pj) this).field_f) {
          return 0;
        } else {
          if (param0 >= -116) {
            ((pj) this).run();
            return ((pj) this).field_h.available();
          } else {
            return ((pj) this).field_h.available();
          }
        }
    }

    pj(java.net.Socket param0, lk param1) throws IOException {
        this(param0, param1, 5000);
    }

    public static void b(byte param0) {
        field_g = null;
        field_k = null;
        if (param0 == 6) {
            return;
        }
        pj.b((byte) -119);
    }

    final int a(int param0) throws IOException {
        if (param0 != -16650) {
            return 22;
        }
        if (!(!((pj) this).field_f)) {
            return 0;
        }
        return ((pj) this).field_h.read();
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
            var6 = EscapeVector.field_A;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((pj) this).field_d == ((pj) this).field_a) {
                          if (!((pj) this).field_f) {
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
                        var2 = ((pj) this).field_a;
                        if (((pj) this).field_d >= ((pj) this).field_a) {
                          var1_int = ((pj) this).field_d - ((pj) this).field_a;
                          break L6;
                        } else {
                          var1_int = -((pj) this).field_a + ((pj) this).field_j;
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
                          if (((pj) this).field_h == null) {
                            break L8;
                          } else {
                            ((pj) this).field_h.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (((pj) this).field_b != null) {
                            ((pj) this).field_b.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((pj) this).field_i) {
                            ((pj) this).field_i.close();
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
                    ((pj) this).field_l = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((pj) this).field_b.write(((pj) this).field_l, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((pj) this).field_c = true;
                          break L13;
                        }
                      }
                      ((pj) this).field_a = (var1_int + ((pj) this).field_a) % ((pj) this).field_j;
                      try {
                        L14: {
                          L15: {
                            if (((pj) this).field_a != ((pj) this).field_d) {
                              break L15;
                            } else {
                              ((pj) this).field_b.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((pj) this).field_c = true;
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
                pf.a(false, (String) null, (Throwable) (Object) var1_ref);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
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
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if (param3 == -49) {
              if (((pj) this).field_f) {
                return;
              } else {
                L1: while (true) {
                  if (param1 <= 0) {
                    break L0;
                  } else {
                    var5_int = ((pj) this).field_h.read(param2, param0, param1);
                    if (var5_int > 0) {
                      param0 = param0 + var5_int;
                      param1 = param1 - var5_int;
                      continue L1;
                    } else {
                      throw new EOFException();
                    }
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
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("pj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    private pj(java.net.Socket param0, lk param1, int param2) throws IOException {
        ((pj) this).field_f = false;
        ((pj) this).field_d = 0;
        ((pj) this).field_c = false;
        ((pj) this).field_a = 0;
        try {
            ((pj) this).field_i = param0;
            ((pj) this).field_e = param1;
            ((pj) this).field_i.setSoTimeout(30000);
            ((pj) this).field_i.setTcpNoDelay(true);
            ((pj) this).field_h = ((pj) this).field_i.getInputStream();
            ((pj) this).field_b = ((pj) this).field_i.getOutputStream();
            ((pj) this).field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new om(7, 0, 1, 1);
    }
}
