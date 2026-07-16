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
                if ((((pj) this).field_m.field_f ^ -1) != -2) {
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
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
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
            var5 = this;
            synchronized (var5) {
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
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            var6 = EscapeVector.field_A;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((pj) this).field_d == ((pj) this).field_a) {
                      if (!((pj) this).field_f) {
                        this.wait();
                        break L2;
                      } else {
                        try {
                          L3: {
                            L4: {
                              if (((pj) this).field_h == null) {
                                break L4;
                              } else {
                                ((pj) this).field_h.close();
                                break L4;
                              }
                            }
                            L5: {
                              if (((pj) this).field_b != null) {
                                ((pj) this).field_b.close();
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (null != ((pj) this).field_i) {
                                ((pj) this).field_i.close();
                                break L6;
                              } else {
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
                        ((pj) this).field_l = null;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L8: {
                    var2 = ((pj) this).field_a;
                    if (((pj) this).field_d >= ((pj) this).field_a) {
                      var1_int = ((pj) this).field_d - ((pj) this).field_a;
                      break L8;
                    } else {
                      var1_int = -((pj) this).field_a + ((pj) this).field_j;
                      break L8;
                    }
                  }
                  if ((var1_int ^ -1) < -1) {
                    try {
                      L9: {
                        ((pj) this).field_b.write(((pj) this).field_l, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((pj) this).field_c = true;
                        break L10;
                      }
                    }
                    ((pj) this).field_a = (var1_int + ((pj) this).field_a) % ((pj) this).field_j;
                    try {
                      L11: {
                        L12: {
                          if (((pj) this).field_a != ((pj) this).field_d) {
                            break L12;
                          } else {
                            ((pj) this).field_b.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((pj) this).field_c = true;
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
                pf.a(false, (String) null, (Throwable) (Object) var1_ref);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        if (param3 == -49) {
          if (!((pj) this).field_f) {
            L0: while (true) {
              if (param1 > 0) {
                var5 = ((pj) this).field_h.read(param2, param0, param1);
                if (var5 > 0) {
                  param0 = param0 + var5;
                  param1 = param1 - var5;
                  continue L0;
                } else {
                  throw new EOFException();
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private pj(java.net.Socket param0, lk param1, int param2) throws IOException {
        ((pj) this).field_f = false;
        ((pj) this).field_d = 0;
        ((pj) this).field_c = false;
        ((pj) this).field_a = 0;
        ((pj) this).field_i = param0;
        ((pj) this).field_e = param1;
        ((pj) this).field_i.setSoTimeout(30000);
        ((pj) this).field_i.setTcpNoDelay(true);
        ((pj) this).field_h = ((pj) this).field_i.getInputStream();
        ((pj) this).field_b = ((pj) this).field_i.getOutputStream();
        ((pj) this).field_j = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new om(7, 0, 1, 1);
    }
}
