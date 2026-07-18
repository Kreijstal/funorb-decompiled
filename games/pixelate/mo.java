/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mo implements Runnable {
    static int field_k;
    static String field_i;
    private OutputStream field_j;
    private ei field_m;
    private cb field_e;
    private int field_n;
    private int field_l;
    private boolean field_a;
    private byte[] field_d;
    static String field_b;
    private java.net.Socket field_h;
    private InputStream field_f;
    private boolean field_g;
    private int field_c;

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
            var6 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((mo) this).field_n == ((mo) this).field_c) {
                          if (((mo) this).field_a) {
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
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        var2 = ((mo) this).field_n;
                        if (((mo) this).field_n > ((mo) this).field_c) {
                          var1_int = -((mo) this).field_n + ((mo) this).field_l;
                          break L6;
                        } else {
                          var1_int = -((mo) this).field_n + ((mo) this).field_c;
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
                          if (null == ((mo) this).field_f) {
                            break L8;
                          } else {
                            ((mo) this).field_f.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (((mo) this).field_j != null) {
                            ((mo) this).field_j.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (((mo) this).field_h == null) {
                            break L10;
                          } else {
                            ((mo) this).field_h.close();
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
                    ((mo) this).field_d = null;
                    break L0;
                  } else {
                    if (0 < var1_int) {
                      try {
                        L12: {
                          ((mo) this).field_j.write(((mo) this).field_d, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((mo) this).field_g = true;
                          break L13;
                        }
                      }
                      ((mo) this).field_n = (((mo) this).field_n + var1_int) % ((mo) this).field_l;
                      try {
                        L14: {
                          L15: {
                            if (((mo) this).field_c != ((mo) this).field_n) {
                              break L15;
                            } else {
                              ((mo) this).field_j.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((mo) this).field_g = true;
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
                jo.a(1, (String) null, (Throwable) (Object) var1_ref);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    mo(java.net.Socket param0, cb param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int c(byte param0) throws IOException {
        if (param0 != -81) {
            ((mo) this).field_g = false;
        }
        if (((mo) this).field_a) {
            return 0;
        }
        return ((mo) this).field_f.read();
    }

    final void b(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        if (!((mo) this).field_a) {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((mo) this).field_a = true;
              this.notifyAll();
              break L0;
            }
          }
          if (param0 == -1) {
            L1: {
              if (null != ((mo) this).field_m) {
                L2: while (true) {
                  if (((mo) this).field_m.field_b != 0) {
                    if (((mo) this).field_m.field_b != 1) {
                      break L1;
                    } else {
                      try {
                        L3: {
                          ((Thread) ((mo) this).field_m.field_e).join();
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
                    vg.a(1L, (byte) 23);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            ((mo) this).field_m = null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (!((mo) this).field_a) {
              if (((mo) this).field_g) {
                ((mo) this).field_g = false;
                throw new IOException();
              } else {
                L1: {
                  if (null == ((mo) this).field_d) {
                    ((mo) this).field_d = new byte[((mo) this).field_l];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    if (param1 < -72) {
                      var6 = 0;
                      L3: while (true) {
                        if (var6 >= param0) {
                          L4: {
                            if (null == ((mo) this).field_m) {
                              ((mo) this).field_m = ((mo) this).field_e.a(3, (Runnable) this, (byte) -123);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.notifyAll();
                          break L2;
                        } else {
                          ((mo) this).field_d[((mo) this).field_c] = param3[param2 + var6];
                          ((mo) this).field_c = (((mo) this).field_c - -1) % ((mo) this).field_l;
                          if ((((mo) this).field_l + ((mo) this).field_n + -100) % ((mo) this).field_l != ((mo) this).field_c) {
                            var6++;
                            continue L3;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } else {
                      return;
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
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("mo.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    final int a(int param0) throws IOException {
        if (param0 >= -68) {
            field_b = null;
        }
        if (!(!((mo) this).field_a)) {
            return 0;
        }
        return ((mo) this).field_f.available();
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
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
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 119) {
                break L1;
              } else {
                ((mo) this).finalize();
                break L1;
              }
            }
            if (!((mo) this).field_a) {
              L2: while (true) {
                if (param3 <= 0) {
                  break L0;
                } else {
                  var5_int = ((mo) this).field_f.read(param0, param1, param3);
                  if (var5_int <= 0) {
                    throw new EOFException();
                  } else {
                    param1 = param1 + var5_int;
                    param3 = param3 - var5_int;
                    continue L2;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("mo.D(");
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
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(byte param0) throws IOException {
        int var2 = -74 % ((36 - param0) / 56);
        if (!(!((mo) this).field_a)) {
            return;
        }
        if (((mo) this).field_g) {
            ((mo) this).field_g = false;
            throw new IOException();
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        if (param0 > -55) {
            mo.a((byte) 57);
        }
    }

    protected final void finalize() {
        ((mo) this).b(-1);
    }

    private mo(java.net.Socket param0, cb param1, int param2) throws IOException {
        ((mo) this).field_n = 0;
        ((mo) this).field_a = false;
        ((mo) this).field_c = 0;
        ((mo) this).field_g = false;
        try {
            ((mo) this).field_h = param0;
            ((mo) this).field_e = param1;
            ((mo) this).field_h.setSoTimeout(30000);
            ((mo) this).field_h.setTcpNoDelay(true);
            ((mo) this).field_f = ((mo) this).field_h.getInputStream();
            ((mo) this).field_j = ((mo) this).field_h.getOutputStream();
            ((mo) this).field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> is already on your friend list.";
        field_i = "Player Name: ";
    }
}
