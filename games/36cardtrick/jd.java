/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd implements Runnable {
    private vi field_d;
    private java.net.Socket field_k;
    private OutputStream field_e;
    private int field_i;
    static ib[] field_c;
    private InputStream field_l;
    private boolean field_f;
    private byte[] field_j;
    private le field_h;
    static int field_g;
    private boolean field_m;
    private int field_a;
    private int field_b;

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 23) {
            field_g = -6;
        }
    }

    final void a(boolean param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var4 = Main.field_T;
        if (((jd) this).field_f) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param0) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              ((jd) this).field_f = stackIn_7_1 != 0;
              this.notifyAll();
              break L0;
            }
          }
          L2: {
            if (((jd) this).field_d == null) {
              break L2;
            } else {
              L3: while (true) {
                if (((jd) this).field_d.field_a != 0) {
                  if ((((jd) this).field_d.field_a ^ -1) == -2) {
                    try {
                      L4: {
                        ((Thread) ((jd) this).field_d.field_e).join();
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
                  wk.a((byte) -104, 1L);
                  continue L3;
                }
              }
            }
          }
          ((jd) this).field_d = null;
          return;
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = Main.field_T;
        if (param1 == -89) {
          if (!((jd) this).field_f) {
            if (((jd) this).field_m) {
              ((jd) this).field_m = false;
              throw new IOException();
            } else {
              L0: {
                if (((jd) this).field_j != null) {
                  break L0;
                } else {
                  ((jd) this).field_j = new byte[((jd) this).field_a];
                  break L0;
                }
              }
              var5 = this;
              synchronized (var5) {
                L1: {
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= param2) {
                      L3: {
                        if (((jd) this).field_d != null) {
                          break L3;
                        } else {
                          ((jd) this).field_d = ((jd) this).field_h.a(0, 3, (Runnable) this);
                          break L3;
                        }
                      }
                      this.notifyAll();
                      break L1;
                    } else {
                      ((jd) this).field_j[((jd) this).field_b] = param3[param0 + var6];
                      ((jd) this).field_b = (((jd) this).field_b + 1) % ((jd) this).field_a;
                      if (((jd) this).field_b == (((jd) this).field_a + ((jd) this).field_i - 100) % ((jd) this).field_a) {
                        throw new IOException();
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            var6 = Main.field_T;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((jd) this).field_b != ((jd) this).field_i) {
                      break L2;
                    } else {
                      if (!((jd) this).field_f) {
                        this.wait();
                        break L2;
                      } else {
                        try {
                          L3: {
                            L4: {
                              if (null != ((jd) this).field_l) {
                                ((jd) this).field_l.close();
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              if (((jd) this).field_e != null) {
                                ((jd) this).field_e.close();
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (null == ((jd) this).field_k) {
                                break L6;
                              } else {
                                ((jd) this).field_k.close();
                                break L6;
                              }
                            }
                            break L3;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L7: {
                            var1 = (IOException) (Object) decompiledCaughtException;
                            break L7;
                          }
                        }
                        ((jd) this).field_j = null;
                        break L0;
                      }
                    }
                  }
                  L8: {
                    var2 = ((jd) this).field_i;
                    if (((jd) this).field_i <= ((jd) this).field_b) {
                      var1_int = -((jd) this).field_i + ((jd) this).field_b;
                      break L8;
                    } else {
                      var1_int = ((jd) this).field_a - ((jd) this).field_i;
                      break L8;
                    }
                  }
                  if (var1_int > 0) {
                    try {
                      L9: {
                        ((jd) this).field_e.write(((jd) this).field_j, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((jd) this).field_m = true;
                        break L10;
                      }
                    }
                    ((jd) this).field_i = (var1_int + ((jd) this).field_i) % ((jd) this).field_a;
                    try {
                      L11: {
                        L12: {
                          if (((jd) this).field_i != ((jd) this).field_b) {
                            break L12;
                          } else {
                            ((jd) this).field_e.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((jd) this).field_m = true;
                        break L13;
                      }
                    }
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L14: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = null;
                k.a((Throwable) (Object) var1_ref, (byte) -103, (String) null);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        ((jd) this).a(true);
    }

    final void b(byte param0) throws IOException {
        if (((jd) this).field_f) {
            return;
        }
        if (!(!((jd) this).field_m)) {
            ((jd) this).field_m = false;
            throw new IOException();
        }
        if (param0 != -44) {
            ((jd) this).field_a = -32;
        }
    }

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = Main.field_T;
        if (param0 != 66) {
            ((jd) this).finalize();
        }
        if (!(!((jd) this).field_f)) {
            return;
        }
        while (-1 > (param2 ^ -1)) {
            var5 = ((jd) this).field_l.read(param1, param3, param2);
            if (!((var5 ^ -1) < -1)) {
                throw new EOFException();
            }
            param2 = param2 - var5;
            param3 = param3 + var5;
        }
    }

    final int a(int param0) throws IOException {
        if (((jd) this).field_f) {
            return 0;
        }
        if (param0 != 0) {
            return -63;
        }
        return ((jd) this).field_l.read();
    }

    jd(java.net.Socket param0, le param1) throws IOException {
        this(param0, param1, 5000);
    }

    private jd(java.net.Socket param0, le param1, int param2) throws IOException {
        ((jd) this).field_f = false;
        ((jd) this).field_m = false;
        ((jd) this).field_b = 0;
        ((jd) this).field_i = 0;
        ((jd) this).field_k = param0;
        ((jd) this).field_h = param1;
        ((jd) this).field_k.setSoTimeout(30000);
        ((jd) this).field_k.setTcpNoDelay(true);
        ((jd) this).field_l = ((jd) this).field_k.getInputStream();
        ((jd) this).field_e = ((jd) this).field_k.getOutputStream();
        ((jd) this).field_a = param2;
    }

    final int b(int param0) throws IOException {
        if (!(!((jd) this).field_f)) {
            return 0;
        }
        int var2 = 59 / ((80 - param0) / 45);
        return ((jd) this).field_l.available();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ib[16];
        field_g = 20;
    }
}
