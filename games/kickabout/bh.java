/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bh implements Runnable {
    private int field_n;
    static String field_h;
    private byte[] field_r;
    private boolean field_c;
    static String field_q;
    static hd field_u;
    private boolean field_e;
    private java.net.Socket field_b;
    private int field_o;
    private int field_d;
    private wu field_p;
    private bu field_g;
    private OutputStream field_m;
    private InputStream field_a;
    static String field_t;
    static int[] field_f;
    static int field_s;
    static int field_k;
    static String[] field_i;
    static int field_j;
    static int field_l;

    final int a(byte param0) throws IOException {
        if (!(!((bh) this).field_e)) {
            return 0;
        }
        if (param0 != 63) {
            return 121;
        }
        return ((bh) this).field_a.available();
    }

    protected final void finalize() {
        ((bh) this).a(1);
    }

    final int b(int param0) throws IOException {
        if (((bh) this).field_e) {
            return 0;
        }
        if (param0 != 1) {
            bh.c(-10);
        }
        return ((bh) this).field_a.read();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param3 != -4847) {
            ((bh) this).finalize();
        }
        if (!(!((bh) this).field_e)) {
            return;
        }
        while (0 < param1) {
            var5 = ((bh) this).field_a.read(param0, param2, param1);
            if (!(var5 > 0)) {
                throw new EOFException();
            }
            param2 = param2 + var5;
            param1 = param1 - var5;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
            return;
        }
        fj.a(-45);
        qd.b(38, 4);
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
            var6 = Kickabout.field_G;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((bh) this).field_d != ((bh) this).field_n) {
                      break L2;
                    } else {
                      if (!((bh) this).field_e) {
                        this.wait();
                        break L2;
                      } else {
                        try {
                          L3: {
                            L4: {
                              if (((bh) this).field_a != null) {
                                ((bh) this).field_a.close();
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              if (null != ((bh) this).field_m) {
                                ((bh) this).field_m.close();
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (null == ((bh) this).field_b) {
                                break L6;
                              } else {
                                ((bh) this).field_b.close();
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
                        ((bh) this).field_r = null;
                        break L0;
                      }
                    }
                  }
                  L8: {
                    if (((bh) this).field_d <= ((bh) this).field_n) {
                      var1_int = -((bh) this).field_d + ((bh) this).field_n;
                      break L8;
                    } else {
                      var1_int = -((bh) this).field_d + ((bh) this).field_o;
                      break L8;
                    }
                  }
                  var2 = ((bh) this).field_d;
                  if (var1_int > 0) {
                    try {
                      L9: {
                        ((bh) this).field_m.write(((bh) this).field_r, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((bh) this).field_c = true;
                        break L10;
                      }
                    }
                    ((bh) this).field_d = (((bh) this).field_d + var1_int) % ((bh) this).field_o;
                    try {
                      L11: {
                        L12: {
                          if (((bh) this).field_n != ((bh) this).field_d) {
                            break L12;
                          } else {
                            ((bh) this).field_m.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((bh) this).field_c = true;
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
                bd.a((String) null, (Throwable) (Object) var1_ref, 1);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        if (param0 > -41) {
            field_i = null;
        }
        field_q = null;
        field_u = null;
        field_f = null;
        field_h = null;
        field_i = null;
        field_t = null;
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        if (!((bh) this).field_e) {
          if (!((bh) this).field_c) {
            L0: {
              if (null == ((bh) this).field_r) {
                ((bh) this).field_r = new byte[((bh) this).field_o];
                break L0;
              } else {
                break L0;
              }
            }
            var5 = this;
            synchronized (var5) {
              L1: {
                var6 = 0;
                L2: while (true) {
                  if (var6 >= param0) {
                    L3: {
                      if (null != ((bh) this).field_p) {
                        break L3;
                      } else {
                        ((bh) this).field_p = ((bh) this).field_g.a(3, (byte) 127, (Runnable) this);
                        break L3;
                      }
                    }
                    if (param1 == -127) {
                      this.notifyAll();
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    ((bh) this).field_r[((bh) this).field_n] = param3[param2 + var6];
                    ((bh) this).field_n = (1 + ((bh) this).field_n) % ((bh) this).field_o;
                    if (((bh) this).field_n == (-100 + ((bh) this).field_d - -((bh) this).field_o) % ((bh) this).field_o) {
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
          } else {
            ((bh) this).field_c = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    bh(java.net.Socket param0, bu param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void b(byte param0) throws IOException {
        int var2 = -42 / ((62 - param0) / 57);
        if (((bh) this).field_e) {
            return;
        }
        if (((bh) this).field_c) {
            ((bh) this).field_c = false;
            throw new IOException();
        }
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        if (((bh) this).field_e) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((bh) this).field_e = true;
              this.notifyAll();
              break L0;
            }
          }
          L1: {
            if (null == ((bh) this).field_p) {
              break L1;
            } else {
              L2: while (true) {
                if (((bh) this).field_p.field_a != 0) {
                  if (((bh) this).field_p.field_a == 1) {
                    try {
                      L3: {
                        ((Thread) ((bh) this).field_p.field_b).join();
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
                  aj.a(1L, 1);
                  continue L2;
                }
              }
            }
          }
          L5: {
            if (param0 == 1) {
              break L5;
            } else {
              ((bh) this).field_m = null;
              break L5;
            }
          }
          ((bh) this).field_p = null;
          return;
        }
    }

    private bh(java.net.Socket param0, bu param1, int param2) throws IOException {
        ((bh) this).field_n = 0;
        ((bh) this).field_d = 0;
        ((bh) this).field_e = false;
        ((bh) this).field_c = false;
        ((bh) this).field_b = param0;
        ((bh) this).field_g = param1;
        ((bh) this).field_b.setSoTimeout(30000);
        ((bh) this).field_b.setTcpNoDelay(true);
        ((bh) this).field_a = ((bh) this).field_b.getInputStream();
        ((bh) this).field_m = ((bh) this).field_b.getOutputStream();
        ((bh) this).field_o = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Loading graphics";
        field_t = "Your search returned no results.";
        field_f = st.c(-23091);
        field_k = -2;
    }
}
