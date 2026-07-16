/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fl implements Runnable {
    private OutputStream field_i;
    static int field_g;
    private java.net.Socket field_f;
    static String field_a;
    static int field_b;
    private int field_k;
    static kc field_o;
    private vl field_r;
    private int field_v;
    private ie field_d;
    private byte[] field_t;
    static ji field_n;
    private boolean field_m;
    static int field_q;
    static int[] field_c;
    private int field_l;
    static boolean field_s;
    static lk field_u;
    static String field_h;
    private boolean field_p;
    static String field_e;
    private InputStream field_j;

    public static void b(int param0) {
        field_c = null;
        field_o = null;
        field_e = null;
        field_a = null;
        field_u = null;
        if (param0 != -26787) {
            field_b = 24;
        }
        field_h = null;
        field_n = null;
    }

    final int c(int param0) throws IOException {
        if (param0 != 3) {
            fl.b(95);
        }
        if (((fl) this).field_m) {
            return 0;
        }
        return ((fl) this).field_j.read();
    }

    final void d(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        if (!((fl) this).field_m) {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                ((fl) this).field_m = true;
                this.notifyAll();
                if (param0 == -15488) {
                  break L1;
                } else {
                  ((fl) this).finalize();
                  break L1;
                }
              }
              break L0;
            }
          }
          L2: {
            if (null == ((fl) this).field_r) {
              break L2;
            } else {
              L3: while (true) {
                if (((fl) this).field_r.field_d != 0) {
                  if (1 != ((fl) this).field_r.field_d) {
                    break L2;
                  } else {
                    try {
                      L4: {
                        ((Thread) ((fl) this).field_r.field_f).join();
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
                  }
                } else {
                  tb.a(false, 1L);
                  continue L3;
                }
              }
            }
          }
          ((fl) this).field_r = null;
          return;
        } else {
          return;
        }
    }

    protected final void finalize() {
        ((fl) this).d(-15488);
    }

    fl(java.net.Socket param0, ie param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        if (((fl) this).field_m) {
            return;
        }
        if (param3 != 0) {
            field_u = null;
        }
        while (param1 > 0) {
            var5 = ((fl) this).field_j.read(param2, param0, param1);
            if (-1 <= (var5 ^ -1)) {
                throw new EOFException();
            }
            param0 = param0 + var5;
            param1 = param1 - var5;
        }
    }

    final void a(int param0) throws IOException {
        if (!(!((fl) this).field_m)) {
            return;
        }
        if (((fl) this).field_p) {
            ((fl) this).field_p = false;
            throw new IOException();
        }
        if (param0 != 100) {
            ((fl) this).d(-94);
        }
    }

    final static hb e(int param0) {
        String var1 = sa.a((byte) -39);
        if (param0 != 1) {
            Object var2 = null;
            boolean discarded$0 = fl.a((byte) 60, (CharSequence) null);
        }
        if (var1 != null) {
            if (!(0 > var1.indexOf('@'))) {
                var1 = "";
            }
        }
        return new hb(sa.a((byte) -113), pm.a(true));
    }

    final void a(boolean param0, int param1, byte[] param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = TetraLink.field_J;
        if (((fl) this).field_m) {
          return;
        } else {
          if (((fl) this).field_p) {
            ((fl) this).field_p = false;
            throw new IOException();
          } else {
            L0: {
              if (((fl) this).field_t != null) {
                break L0;
              } else {
                ((fl) this).field_t = new byte[((fl) this).field_k];
                break L0;
              }
            }
            var5 = this;
            synchronized (var5) {
              L1: {
                L2: {
                  var6 = 0;
                  if (param0) {
                    break L2;
                  } else {
                    field_s = false;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var6 >= param1) {
                    L4: {
                      if (null == ((fl) this).field_r) {
                        ((fl) this).field_r = ((fl) this).field_d.a((Runnable) this, 88, 3);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    this.notifyAll();
                    break L1;
                  } else {
                    ((fl) this).field_t[((fl) this).field_v] = param2[var6 + param3];
                    ((fl) this).field_v = (((fl) this).field_v - -1) % ((fl) this).field_k;
                    if ((((fl) this).field_k + ((fl) this).field_l - 100) % ((fl) this).field_k != ((fl) this).field_v) {
                      var6++;
                      continue L3;
                    } else {
                      throw new IOException();
                    }
                  }
                }
              }
            }
            return;
          }
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
            var6 = TetraLink.field_J;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((fl) this).field_l != ((fl) this).field_v) {
                      break L2;
                    } else {
                      if (!((fl) this).field_m) {
                        this.wait();
                        break L2;
                      } else {
                        try {
                          L3: {
                            L4: {
                              if (((fl) this).field_j == null) {
                                break L4;
                              } else {
                                ((fl) this).field_j.close();
                                break L4;
                              }
                            }
                            L5: {
                              if (((fl) this).field_i == null) {
                                break L5;
                              } else {
                                ((fl) this).field_i.close();
                                break L5;
                              }
                            }
                            L6: {
                              if (null != ((fl) this).field_f) {
                                ((fl) this).field_f.close();
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
                        ((fl) this).field_t = null;
                        break L0;
                      }
                    }
                  }
                  L8: {
                    var2 = ((fl) this).field_l;
                    if (((fl) this).field_v >= ((fl) this).field_l) {
                      var1_int = ((fl) this).field_v - ((fl) this).field_l;
                      break L8;
                    } else {
                      var1_int = -((fl) this).field_l + ((fl) this).field_k;
                      break L8;
                    }
                  }
                  if (-1 > (var1_int ^ -1)) {
                    try {
                      L9: {
                        ((fl) this).field_i.write(((fl) this).field_t, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((fl) this).field_p = true;
                        break L10;
                      }
                    }
                    ((fl) this).field_l = (((fl) this).field_l + var1_int) % ((fl) this).field_k;
                    try {
                      L11: {
                        L12: {
                          if (((fl) this).field_l != ((fl) this).field_v) {
                            break L12;
                          } else {
                            ((fl) this).field_i.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((fl) this).field_p = true;
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
                fk.a(-55, (Throwable) (Object) var1_ref, (String) null);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 <= 119) {
            hb discarded$0 = fl.e(92);
        }
        return ti.a(45, param1, false);
    }

    final int f(int param0) throws IOException {
        if (param0 != 0) {
            ((fl) this).field_i = null;
        }
        if (((fl) this).field_m) {
            return 0;
        }
        return ((fl) this).field_j.available();
    }

    private fl(java.net.Socket param0, ie param1, int param2) throws IOException {
        ((fl) this).field_v = 0;
        ((fl) this).field_m = false;
        ((fl) this).field_l = 0;
        ((fl) this).field_p = false;
        ((fl) this).field_f = param0;
        ((fl) this).field_d = param1;
        ((fl) this).field_f.setSoTimeout(30000);
        ((fl) this).field_f.setTcpNoDelay(true);
        ((fl) this).field_j = ((fl) this).field_f.getInputStream();
        ((fl) this).field_i = ((fl) this).field_f.getOutputStream();
        ((fl) this).field_k = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{6000, 4500, 3000, 2250, 1500, 1000, 500};
        field_q = 0;
        field_a = "Waiting for extra data";
        field_s = false;
        field_e = "You are playing <%0>.";
        field_h = "You have declined the invitation.";
    }
}
