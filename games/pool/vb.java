/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vb implements Runnable {
    private InputStream field_l;
    private int field_i;
    static String field_c;
    static int field_f;
    private java.net.Socket field_n;
    private le field_d;
    private int field_a;
    private boolean field_e;
    static of field_m;
    private int field_k;
    private byte[] field_j;
    private boolean field_h;
    static nb field_b;
    private OutputStream field_g;
    private sj field_o;
    static int[] field_p;

    vb(java.net.Socket param0, sj param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        if (!((vb) this).field_h) {
          L0: while (true) {
            if (0 >= param0) {
              if (param1 == 0) {
                return;
              } else {
                ((vb) this).field_n = null;
                return;
              }
            } else {
              var5 = ((vb) this).field_l.read(param3, param2, param0);
              if (0 >= var5) {
                throw new EOFException();
              } else {
                param0 = param0 - var5;
                param2 = param2 + var5;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_p = null;
        field_m = null;
        field_b = null;
        if (param0) {
            return;
        }
        field_f = 57;
    }

    final int a(int param0) throws IOException {
        if (((vb) this).field_h) {
            return 0;
        }
        if (param0 != 14528) {
            vb.a(false);
            return ((vb) this).field_l.read();
        }
        return ((vb) this).field_l.read();
    }

    final void e(int param0) throws IOException {
        if (((vb) this).field_h) {
            return;
        }
        if (param0 != 0) {
            ((vb) this).c(-107);
            if (!(!((vb) this).field_e)) {
                ((vb) this).field_e = false;
                throw new IOException();
            }
            return;
        }
        if (!(!((vb) this).field_e)) {
            ((vb) this).field_e = false;
            throw new IOException();
        }
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
            var6 = Pool.field_O;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((vb) this).field_a != ((vb) this).field_i) {
                      break L2;
                    } else {
                      if (((vb) this).field_h) {
                        try {
                          L3: {
                            L4: {
                              if (((vb) this).field_l != null) {
                                ((vb) this).field_l.close();
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              if (((vb) this).field_g != null) {
                                ((vb) this).field_g.close();
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (null != ((vb) this).field_n) {
                                ((vb) this).field_n.close();
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
                        ((vb) this).field_j = null;
                        break L0;
                      } else {
                        this.wait();
                        break L2;
                      }
                    }
                  }
                  L8: {
                    var2 = ((vb) this).field_a;
                    if (((vb) this).field_a > ((vb) this).field_i) {
                      var1_int = ((vb) this).field_k + -((vb) this).field_a;
                      break L8;
                    } else {
                      var1_int = ((vb) this).field_i - ((vb) this).field_a;
                      break L8;
                    }
                  }
                  if (0 < var1_int) {
                    try {
                      L9: {
                        ((vb) this).field_g.write(((vb) this).field_j, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((vb) this).field_e = true;
                        break L10;
                      }
                    }
                    ((vb) this).field_a = (var1_int + ((vb) this).field_a) % ((vb) this).field_k;
                    try {
                      L11: {
                        L12: {
                          if (((vb) this).field_a != ((vb) this).field_i) {
                            break L12;
                          } else {
                            ((vb) this).field_g.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((vb) this).field_e = true;
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
                tc.a((Throwable) (Object) var1_ref, (String) null, -8555);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, String param1, byte param2, nf param3, int param4, String param5, String param6) {
        if (wd.field_Lb != aa.field_c) {
            return false;
        }
        fq var9 = new fq(wd.field_Ub, param3);
        int var8 = 91 / ((48 - param2) / 53);
        wd.field_Ub.b((ei) (Object) var9, 30000);
        if (sq.k(0)) {
            var9.p((byte) -52);
        } else {
            qi.field_c = param0;
            j.field_b = param4;
            re.field_d = param5;
            vq.field_Xb = param6;
            wd.field_Lb = ra.field_e;
            sf.field_B = null;
            eo.field_Rb = param1;
            return true;
        }
        return true;
    }

    final int d(int param0) throws IOException {
        if (!((vb) this).field_h) {
          if (param0 <= 68) {
            ((vb) this).field_i = -51;
            return ((vb) this).field_l.available();
          } else {
            return ((vb) this).field_l.available();
          }
        } else {
          return 0;
        }
    }

    final static ai b(int param0) {
        int var1 = 52 / ((param0 - 41) / 41);
        return qf.field_d;
    }

    final void c(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        if (!((vb) this).field_h) {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                if (param0 < -82) {
                  break L1;
                } else {
                  ((vb) this).field_e = false;
                  break L1;
                }
              }
              ((vb) this).field_h = true;
              this.notifyAll();
              break L0;
            }
          }
          if (null != ((vb) this).field_d) {
            L2: while (true) {
              if (0 != ((vb) this).field_d.field_f) {
                if (-2 == (((vb) this).field_d.field_f ^ -1)) {
                  try {
                    L3: {
                      ((Thread) ((vb) this).field_d.field_e).join();
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                    ((vb) this).field_d = null;
                    return;
                  }
                  ((vb) this).field_d = null;
                  return;
                } else {
                  ((vb) this).field_d = null;
                  return;
                }
              } else {
                cf.a(-126, 1L);
                continue L2;
              }
            }
          } else {
            ((vb) this).field_d = null;
            return;
          }
        } else {
          return;
        }
    }

    protected final void finalize() {
        ((vb) this).c(-119);
    }

    final static or a(int param0, pq param1) {
        Object var3 = null;
        if (param0 != -6584) {
          var3 = null;
          boolean discarded$6 = vb.a(false, (String) null, (byte) 126, (nf) null, -39, (String) null, (String) null);
          or dupTemp$7 = new or(0, (or) null);
          param1.field_q = dupTemp$7;
          return dupTemp$7;
        } else {
          or dupTemp$8 = new or(0, (or) null);
          param1.field_q = dupTemp$8;
          return dupTemp$8;
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        if (((vb) this).field_h) {
          return;
        } else {
          var5 = 17 / ((param1 - -12) / 58);
          if (((vb) this).field_e) {
            ((vb) this).field_e = false;
            throw new IOException();
          } else {
            L0: {
              if (((vb) this).field_j != null) {
                break L0;
              } else {
                ((vb) this).field_j = new byte[((vb) this).field_k];
                break L0;
              }
            }
            var6 = this;
            synchronized (var6) {
              L1: {
                var7 = 0;
                L2: while (true) {
                  if (param2 <= var7) {
                    L3: {
                      if (null != ((vb) this).field_d) {
                        break L3;
                      } else {
                        ((vb) this).field_d = ((vb) this).field_o.a(33, 3, (Runnable) this);
                        break L3;
                      }
                    }
                    this.notifyAll();
                    break L1;
                  } else {
                    ((vb) this).field_j[((vb) this).field_i] = param0[param3 + var7];
                    ((vb) this).field_i = (((vb) this).field_i - -1) % ((vb) this).field_k;
                    if ((((vb) this).field_k + (((vb) this).field_a + -100)) % ((vb) this).field_k == ((vb) this).field_i) {
                      throw new IOException();
                    } else {
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    private vb(java.net.Socket param0, sj param1, int param2) throws IOException {
        ((vb) this).field_e = false;
        ((vb) this).field_i = 0;
        ((vb) this).field_a = 0;
        ((vb) this).field_h = false;
        ((vb) this).field_n = param0;
        ((vb) this).field_o = param1;
        ((vb) this).field_n.setSoTimeout(30000);
        ((vb) this).field_n.setTcpNoDelay(true);
        ((vb) this).field_l = ((vb) this).field_n.getInputStream();
        ((vb) this).field_g = ((vb) this).field_n.getOutputStream();
        ((vb) this).field_k = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "to over <%0> great games";
    }
}
