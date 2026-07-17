/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    static String field_o;
    static ja field_g;
    static jh field_n;
    static int field_e;
    private go field_s;
    private di field_c;
    private int field_m;
    private int field_h;
    static ja field_j;
    private boolean field_i;
    static int field_q;
    private InputStream field_d;
    private OutputStream field_l;
    private java.net.Socket field_f;
    private boolean field_r;
    private int field_a;
    private byte[] field_b;
    static String field_k;
    static int[] field_p;

    public static void b(byte param0) {
        field_n = null;
        field_g = null;
        field_j = null;
        field_k = null;
        if (param0 <= 10) {
            field_q = -107;
        }
        field_o = null;
        field_p = null;
    }

    final void b(int param0) throws IOException {
        if (((ej) this).field_r) {
            return;
        }
        if (!(!((ej) this).field_i)) {
            ((ej) this).field_i = false;
            throw new IOException();
        }
        if (param0 != -26844) {
            ((ej) this).c(-17);
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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((ej) this).field_a != ((ej) this).field_h) {
                          break L3;
                        } else {
                          if (!((ej) this).field_r) {
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
                        }
                      }
                      L6: {
                        if (((ej) this).field_a < ((ej) this).field_h) {
                          var1_int = -((ej) this).field_h + ((ej) this).field_m;
                          break L6;
                        } else {
                          var1_int = -((ej) this).field_h + ((ej) this).field_a;
                          break L6;
                        }
                      }
                      var2 = ((ej) this).field_h;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null != ((ej) this).field_d) {
                            ((ej) this).field_d.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null == ((ej) this).field_l) {
                            break L9;
                          } else {
                            ((ej) this).field_l.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (((ej) this).field_f != null) {
                            ((ej) this).field_f.close();
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
                    ((ej) this).field_b = null;
                    break L0;
                  } else {
                    if (0 < var1_int) {
                      try {
                        L12: {
                          ((ej) this).field_l.write(((ej) this).field_b, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((ej) this).field_i = true;
                          break L13;
                        }
                      }
                      ((ej) this).field_h = (((ej) this).field_h - -var1_int) % ((ej) this).field_m;
                      try {
                        L14: {
                          L15: {
                            if (((ej) this).field_h != ((ej) this).field_a) {
                              break L15;
                            } else {
                              ((ej) this).field_l.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((ej) this).field_i = true;
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
                int discarded$1 = 0;
                bd.a((String) null, (Throwable) (Object) var1_ref);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cr a() {
        cr var2 = new cr();
        dc.field_Gb.a((br) (Object) var2, false);
        mi.b(1, 6);
        return var2;
    }

    protected final void finalize() {
        ((ej) this).c(92);
    }

    final static void a(ja param0, byte param1, ja param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            jj.field_F = new ja[7];
            rb.field_e = new ja[7];
            eg.field_D = new ja(300, 200);
            rb.field_e[0] = param2;
            jj.field_F[0] = new ja(param2.field_x - -20, param2.field_w - -10);
            rb.field_e[1] = param0;
            jj.field_F[1] = new ja(param0.field_x + 10, 10 + param0.field_w);
            rb.field_e[2] = new ja(150, 100);
            jj.field_F[2] = new ja(150, 100);
            rb.field_e[3] = new ja(120, 50);
            jj.field_F[3] = new ja(120, 50);
            rb.field_e[4] = new ja(300, 50);
            jj.field_F[4] = new ja(300, 50);
            rb.field_e[5] = new ja(200, 90);
            jj.field_F[5] = new ja(200, 90);
            rb.field_e[6] = new ja(200, 50);
            if (param1 < -4) {
              jj.field_F[6] = new ja(200, 50);
              g.c();
              jj.field_F[0].a();
              rb.field_e[0].f(5, 5, 16777215);
              int discarded$2 = -18;
              jm.d();
              rb.field_e[0].f(5, 5, 0);
              jj.field_F[1].a();
              rb.field_e[1].f(-35, 5, 16777215);
              g.a(16777215);
              int discarded$3 = -18;
              jm.d();
              rb.field_e[1].f(-35, 5, 0);
              g.b();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ej.H(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    ej(java.net.Socket param0, go param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int a(int param0) throws IOException {
        if (((ej) this).field_r) {
            return 0;
        }
        int var2 = -42 / ((param0 - -37) / 35);
        return ((ej) this).field_d.available();
    }

    final static long a(byte param0) {
        long var1_long = 0L;
        RuntimeException var1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        long stackIn_11_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_10_0 = 0L;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_long = 0L;
            var3 = -15 / ((35 - param0) / 62);
            var4 = 0;
            L1: while (true) {
              if (var4 >= em.field_Y.length) {
                stackOut_10_0 = var1_long;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= em.field_Y[var4][0].length) {
                    var4++;
                    continue L1;
                  } else {
                    L3: {
                      if (em.field_Y[var4][0][var5] != 255) {
                        var1_long = var1_long | 1L << em.field_Y[var4][0][var5];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "ej.C(" + param0 + 41);
        }
        return stackIn_11_0;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((ej) this).field_r) {
              return;
            } else {
              L1: while (true) {
                if (0 >= param0) {
                  L2: {
                    if (param3 > 96) {
                      break L2;
                    } else {
                      ej.b((byte) 10);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5_int = ((ej) this).field_d.read(param2, param1, param0);
                  if (var5_int <= 0) {
                    throw new EOFException();
                  } else {
                    param1 = param1 + var5_int;
                    param0 = param0 - var5_int;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ej.J(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
        }
    }

    final void c(int param0) {
        InterruptedException interruptedException = null;
        Object var2_ref_Object = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!((ej) this).field_r) {
          var2_ref_Object = this;
          synchronized (var2_ref_Object) {
            L0: {
              ((ej) this).field_r = true;
              this.notifyAll();
              break L0;
            }
          }
          L1: {
            var2 = 61 / ((param0 - 20) / 58);
            if (((ej) this).field_c != null) {
              L2: while (true) {
                if (((ej) this).field_c.field_f != 0) {
                  if (((ej) this).field_c.field_f != 1) {
                    break L1;
                  } else {
                    try {
                      L3: {
                        ((Thread) ((ej) this).field_c.field_d).join();
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
                  vd.a(false, 1L);
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          ((ej) this).field_c = null;
          return;
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
        Object var9 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((ej) this).field_r) {
              return;
            } else {
              if (!((ej) this).field_i) {
                L1: {
                  if (null != ((ej) this).field_b) {
                    break L1;
                  } else {
                    ((ej) this).field_b = new byte[((ej) this).field_m];
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    L3: {
                      if (param1 == -100) {
                        break L3;
                      } else {
                        var9 = null;
                        ej.a((ja) null, (byte) -16, (ja) null);
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      if (param2 <= var6) {
                        L5: {
                          if (null != ((ej) this).field_c) {
                            break L5;
                          } else {
                            ((ej) this).field_c = ((ej) this).field_s.a(47, (Runnable) this, 3);
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((ej) this).field_b[((ej) this).field_a] = param3[param0 + var6];
                        ((ej) this).field_a = (((ej) this).field_a - -1) % ((ej) this).field_m;
                        if (((ej) this).field_a == (-100 + (((ej) this).field_m + ((ej) this).field_h)) % ((ej) this).field_m) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                ((ej) this).field_i = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ej.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final int c(byte param0) throws IOException {
        if (param0 != 59) {
            ((ej) this).field_r = true;
        }
        if (!(!((ej) this).field_r)) {
            return 0;
        }
        return ((ej) this).field_d.read();
    }

    private ej(java.net.Socket param0, go param1, int param2) throws IOException {
        ((ej) this).field_h = 0;
        ((ej) this).field_r = false;
        ((ej) this).field_a = 0;
        ((ej) this).field_i = false;
        try {
            ((ej) this).field_s = param1;
            ((ej) this).field_f = param0;
            ((ej) this).field_f.setSoTimeout(30000);
            ((ej) this).field_f.setTcpNoDelay(true);
            ((ej) this).field_d = ((ej) this).field_f.getInputStream();
            ((ej) this).field_l = ((ej) this).field_f.getOutputStream();
            ((ej) this).field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ej.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Please log in as a subscribing member to access this feature.";
        field_e = 0;
        field_k = "Select a human!";
    }
}
