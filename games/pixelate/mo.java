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
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            var6 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((mo) this).field_n == ((mo) this).field_c) {
                      if (((mo) this).field_a) {
                        try {
                          L3: {
                            L4: {
                              if (null == ((mo) this).field_f) {
                                break L4;
                              } else {
                                ((mo) this).field_f.close();
                                break L4;
                              }
                            }
                            L5: {
                              if (((mo) this).field_j != null) {
                                ((mo) this).field_j.close();
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (((mo) this).field_h == null) {
                                break L6;
                              } else {
                                ((mo) this).field_h.close();
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
                        ((mo) this).field_d = null;
                        break L0;
                      } else {
                        this.wait();
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L8: {
                    var2 = ((mo) this).field_n;
                    if (((mo) this).field_n > ((mo) this).field_c) {
                      var1_int = -((mo) this).field_n + ((mo) this).field_l;
                      break L8;
                    } else {
                      var1_int = -((mo) this).field_n + ((mo) this).field_c;
                      break L8;
                    }
                  }
                  if (0 < var1_int) {
                    try {
                      L9: {
                        ((mo) this).field_j.write(((mo) this).field_d, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((mo) this).field_g = true;
                        break L10;
                      }
                    }
                    ((mo) this).field_n = (((mo) this).field_n + var1_int) % ((mo) this).field_l;
                    try {
                      L11: {
                        L12: {
                          if (((mo) this).field_c != ((mo) this).field_n) {
                            break L12;
                          } else {
                            ((mo) this).field_j.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((mo) this).field_g = true;
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
                jo.a(1, (String) null, (Throwable) (Object) var1_ref);
                break L14;
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
                    if ((((mo) this).field_m.field_b ^ -1) != -2) {
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
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        if (!((mo) this).field_a) {
          if (((mo) this).field_g) {
            ((mo) this).field_g = false;
            throw new IOException();
          } else {
            L0: {
              if (null == ((mo) this).field_d) {
                ((mo) this).field_d = new byte[((mo) this).field_l];
                break L0;
              } else {
                break L0;
              }
            }
            var5 = this;
            synchronized (var5) {
              L1: {
                if (param1 < -72) {
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= param0) {
                      L3: {
                        if (null == ((mo) this).field_m) {
                          ((mo) this).field_m = ((mo) this).field_e.a(3, (Runnable) this, (byte) -123);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.notifyAll();
                      break L1;
                    } else {
                      ((mo) this).field_d[((mo) this).field_c] = param3[param2 + var6];
                      ((mo) this).field_c = (((mo) this).field_c - -1) % ((mo) this).field_l;
                      if ((((mo) this).field_l + ((mo) this).field_n + -100) % ((mo) this).field_l != ((mo) this).field_c) {
                        var6++;
                        continue L2;
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
            return;
          }
        } else {
          return;
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
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param2 != 119) {
            ((mo) this).finalize();
        }
        if (((mo) this).field_a) {
            return;
        }
        while (-1 > (param3 ^ -1)) {
            var5 = ((mo) this).field_f.read(param0, param1, param3);
            if (!(var5 > 0)) {
                throw new EOFException();
            }
            param1 = param1 + var5;
            param3 = param3 - var5;
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
        ((mo) this).field_h = param0;
        ((mo) this).field_e = param1;
        ((mo) this).field_h.setSoTimeout(30000);
        ((mo) this).field_h.setTcpNoDelay(true);
        ((mo) this).field_f = ((mo) this).field_h.getInputStream();
        ((mo) this).field_j = ((mo) this).field_h.getOutputStream();
        ((mo) this).field_l = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> is already on your friend list.";
        field_i = "Player Name: ";
    }
}
