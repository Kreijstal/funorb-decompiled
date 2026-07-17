/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lpb implements Runnable {
    private int field_i;
    private eab field_e;
    private int field_k;
    private boolean field_f;
    private mob field_g;
    private OutputStream field_j;
    private boolean field_c;
    private byte[] field_a;
    private java.net.Socket field_h;
    private InputStream field_b;
    private int field_d;

    final void b(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        if (!((lpb) this).field_c) {
          if (param0 == 1) {
            var2 = this;
            synchronized (var2) {
              L0: {
                ((lpb) this).field_c = true;
                this.notifyAll();
                break L0;
              }
            }
            L1: {
              if (((lpb) this).field_g == null) {
                break L1;
              } else {
                L2: while (true) {
                  if (((lpb) this).field_g.field_f != 0) {
                    if (((lpb) this).field_g.field_f == 1) {
                      try {
                        L3: {
                          ((Thread) ((lpb) this).field_g.field_d).join();
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
                    } else {
                      break L1;
                    }
                  } else {
                    gdb.b(-94, 1L);
                    continue L2;
                  }
                }
              }
            }
            ((lpb) this).field_g = null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 < -121) {
                break L1;
              } else {
                ((lpb) this).field_k = 66;
                break L1;
              }
            }
            if (!((lpb) this).field_c) {
              L2: while (true) {
                if (param2 <= 0) {
                  break L0;
                } else {
                  var5_int = ((lpb) this).field_b.read(param3, param1, param2);
                  if (0 < var5_int) {
                    param1 = param1 + var5_int;
                    param2 = param2 - var5_int;
                    continue L2;
                  } else {
                    throw new EOFException();
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
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("lpb.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
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
            var6 = VoidHunters.field_G;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((lpb) this).field_i == ((lpb) this).field_d) {
                          if (!((lpb) this).field_c) {
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
                        var2 = ((lpb) this).field_d;
                        if (((lpb) this).field_i >= ((lpb) this).field_d) {
                          var1_int = -((lpb) this).field_d + ((lpb) this).field_i;
                          break L6;
                        } else {
                          var1_int = ((lpb) this).field_k - ((lpb) this).field_d;
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
                          if (null != ((lpb) this).field_b) {
                            ((lpb) this).field_b.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != ((lpb) this).field_j) {
                            ((lpb) this).field_j.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (((lpb) this).field_h == null) {
                            break L10;
                          } else {
                            ((lpb) this).field_h.close();
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
                    ((lpb) this).field_a = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((lpb) this).field_j.write(((lpb) this).field_a, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((lpb) this).field_f = true;
                          break L13;
                        }
                      }
                      ((lpb) this).field_d = (var1_int + ((lpb) this).field_d) % ((lpb) this).field_k;
                      try {
                        L14: {
                          L15: {
                            if (((lpb) this).field_i == ((lpb) this).field_d) {
                              ((lpb) this).field_j.flush();
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
                          ((lpb) this).field_f = true;
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
                gna.a((Throwable) (Object) var1_ref, (String) null, 0);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) throws IOException {
        if (param0 >= -34) {
            Object var3 = null;
            ngb discarded$0 = lpb.a((byte) -34, (byte[]) null);
        }
        if (!(!((lpb) this).field_c)) {
            return 0;
        }
        return ((lpb) this).field_b.read();
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (!((lpb) this).field_c) {
              if (((lpb) this).field_f) {
                ((lpb) this).field_f = false;
                throw new IOException();
              } else {
                L1: {
                  if (((lpb) this).field_a == null) {
                    ((lpb) this).field_a = new byte[((lpb) this).field_k];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = param0;
                    L3: while (true) {
                      if (var6 >= param2) {
                        L4: {
                          if (null == ((lpb) this).field_g) {
                            ((lpb) this).field_g = ((lpb) this).field_e.a(0, 3, (Runnable) this);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((lpb) this).field_a[((lpb) this).field_i] = param1[var6 + param3];
                        ((lpb) this).field_i = (((lpb) this).field_i + 1) % ((lpb) this).field_k;
                        if (((lpb) this).field_i != (-100 + (((lpb) this).field_k + ((lpb) this).field_d)) % ((lpb) this).field_k) {
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("lpb.C(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static ngb a(byte param0, byte[] param1) {
        ngb var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        ngb stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ngb stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param0 == 19) {
                  break L1;
                } else {
                  var3 = null;
                  ngb discarded$2 = lpb.a((byte) -54, (byte[]) null);
                  break L1;
                }
              }
              var2 = new ngb(param1, iib.field_e, so.field_f, nhb.field_o, hla.field_a, rlb.field_d, sh.field_a);
              qqb.a(39);
              stackOut_5_0 = (ngb) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("lpb.A(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final int c(int param0) throws IOException {
        if (!(!((lpb) this).field_c)) {
            return 0;
        }
        if (param0 != 0) {
            return 45;
        }
        return ((lpb) this).field_b.available();
    }

    final void a(byte param0) throws IOException {
        if (((lpb) this).field_c) {
            return;
        }
        if (((lpb) this).field_f) {
            ((lpb) this).field_f = false;
            throw new IOException();
        }
        if (param0 <= 101) {
            ((lpb) this).finalize();
        }
    }

    protected final void finalize() {
        ((lpb) this).b(1);
    }

    lpb(java.net.Socket param0, eab param1) throws IOException {
        this(param0, param1, 5000);
    }

    private lpb(java.net.Socket param0, eab param1, int param2) throws IOException {
        ((lpb) this).field_f = false;
        ((lpb) this).field_c = false;
        ((lpb) this).field_i = 0;
        ((lpb) this).field_d = 0;
        try {
            ((lpb) this).field_e = param1;
            ((lpb) this).field_h = param0;
            ((lpb) this).field_h.setSoTimeout(30000);
            ((lpb) this).field_h.setTcpNoDelay(true);
            ((lpb) this).field_b = ((lpb) this).field_h.getInputStream();
            ((lpb) this).field_j = ((lpb) this).field_h.getOutputStream();
            ((lpb) this).field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "lpb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
    }
}
