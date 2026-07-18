/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class el implements Runnable {
    static boolean field_k;
    static String field_i;
    private boolean field_l;
    private InputStream field_e;
    private OutputStream field_j;
    private un field_n;
    static String field_g;
    private java.net.Socket field_q;
    static String field_b;
    private boolean field_p;
    static String field_a;
    private int field_c;
    private byte[] field_v;
    static eh field_d;
    private int field_m;
    static int field_r;
    static int[] field_w;
    static int[] field_h;
    static cj[] field_s;
    static String field_f;
    private int field_u;
    static int field_t;
    private pd field_o;

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                el.a(false);
                break L1;
              }
            }
            if (!((el) this).field_l) {
              L2: while (true) {
                if (param0 <= 0) {
                  break L0;
                } else {
                  var5_int = ((el) this).field_e.read(param1, param3, param0);
                  if (var5_int > 0) {
                    param0 = param0 - var5_int;
                    param3 = param3 + var5_int;
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
            stackOut_10_1 = new StringBuilder().append("el.I(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static cj a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hg var8 = null;
        th var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_22_0 = null;
        int[] stackOut_21_0 = null;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          var8 = sh.field_qb;
          var3 = var8.g(11132);
          td.field_h = 127 & var3;
          if (0 == (128 & var3)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          ea.field_b = stackIn_3_0 != 0;
          va.field_b = var8.g(11132);
          hk.field_Kb = var8.e((byte) -60);
          if (td.field_h != 2) {
            eb.field_d = 0;
            pl.field_b = 0;
            break L1;
          } else {
            eb.field_d = var8.c((byte) -54);
            pl.field_b = var8.a(-25842);
            break L1;
          }
        }
        L2: {
          if (1 != var8.g(11132)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          vc.field_hb = var8.h(-118);
          if (var4 == 0) {
            vl.field_k = vc.field_hb;
            break L3;
          } else {
            vl.field_k = var8.h(-118);
            break L3;
          }
        }
        L4: {
          L5: {
            if (td.field_h == 1) {
              break L5;
            } else {
              if (4 != td.field_h) {
                pb.field_l = null;
                ef.field_b = 0;
                break L4;
              } else {
                break L5;
              }
            }
          }
          ef.field_b = var8.c((byte) 49);
          pb.field_l = var8.h(-127);
          break L4;
        }
        L6: {
          if (param0) {
            var5 = var8.c((byte) -77);
            try {
              L7: {
                L8: {
                  var9 = cj.field_s.a((byte) 125, var5);
                  aa.field_f = var9.d(124);
                  if (vl.field_k.equals((Object) (Object) mi.field_d)) {
                    stackOut_22_0 = null;
                    stackIn_23_0 = (int[]) (Object) stackOut_22_0;
                    break L8;
                  } else {
                    stackOut_21_0 = var9.field_u;
                    stackIn_23_0 = stackOut_21_0;
                    break L8;
                  }
                }
                ne.field_e = stackIn_23_0;
                break L7;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                int discarded$1 = 1;
                en.a("CC1", (Throwable) (Object) var6);
                ne.field_e = null;
                aa.field_f = null;
                break L9;
              }
            }
            break L6;
          } else {
            aa.field_f = hc.a(128, 80, (jc) (Object) var8);
            ne.field_e = null;
            break L6;
          }
        }
        return new cj(param0);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((param1 & 7) != 0) {
            var2 = 8 - (param1 & 7);
        }
        int var4 = 0;
        int var3 = var2 + param1;
        return var3;
    }

    final void c(int param0) throws IOException {
        if (param0 > -62) {
            ((el) this).field_l = true;
        }
        if (((el) this).field_l) {
            return;
        }
        if (((el) this).field_p) {
            ((el) this).field_p = false;
            throw new IOException();
        }
    }

    final void b(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        if (!((el) this).field_l) {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((el) this).field_l = true;
              this.notifyAll();
              break L0;
            }
          }
          L1: {
            if (null != ((el) this).field_n) {
              L2: while (true) {
                if (((el) this).field_n.field_a != 0) {
                  if (((el) this).field_n.field_a == 1) {
                    try {
                      L3: {
                        ((Thread) ((el) this).field_n.field_f).join();
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
                  mm.a(-64, 1L);
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          L5: {
            if (param0 == 4155) {
              break L5;
            } else {
              field_f = null;
              break L5;
            }
          }
          ((el) this).field_n = null;
          return;
        } else {
          return;
        }
    }

    final static void e() {
        la var1 = (la) (Object) vi.field_h.a((byte) -34);
        if (var1 == null) {
            tn.a(false);
            return;
        }
        hg var2 = sh.field_qb;
        int discarded$0 = var2.d((byte) 118);
        int discarded$1 = var2.d((byte) 102);
        int discarded$2 = var2.d((byte) 99);
        int discarded$3 = var2.d((byte) 102);
        var1.a(false);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (!((el) this).field_l) {
              if (!((el) this).field_p) {
                L1: {
                  if (((el) this).field_v == null) {
                    ((el) this).field_v = new byte[((el) this).field_m];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = param1;
                    L3: while (true) {
                      if (var6 >= param3) {
                        L4: {
                          if (null != ((el) this).field_n) {
                            break L4;
                          } else {
                            ((el) this).field_n = ((el) this).field_o.a(3, (Runnable) this, param1 ^ 255);
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((el) this).field_v[((el) this).field_c] = param0[var6 + param2];
                        ((el) this).field_c = (((el) this).field_c - -1) % ((el) this).field_m;
                        if (((el) this).field_c != (((el) this).field_m + ((el) this).field_u + -100) % ((el) this).field_m) {
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
              } else {
                ((el) this).field_p = false;
                throw new IOException();
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("el.F(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
            return;
        }
        ib.b(-94);
        nf.a(td.field_j, j.field_k[0].field_u, pg.field_e, oc.field_k, -27, qi.field_d);
    }

    protected final void finalize() {
        ((el) this).b(4155);
    }

    public static void d() {
        field_a = null;
        field_f = null;
        field_g = null;
        field_s = null;
        field_w = null;
        field_i = null;
        field_d = null;
        field_h = null;
        field_b = null;
    }

    final int f(int param0) throws IOException {
        if (!(!((el) this).field_l)) {
            return 0;
        }
        if (param0 != 31479) {
            return 69;
        }
        return ((el) this).field_e.available();
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          L1: {
            ad.field_g[2] = 0.0;
            ad.field_g[0] = 1.0;
            el.a(false, (byte) -106);
            mj.field_D = 262144;
            ao.field_Hb = 52.5f;
            we.field_k = 50.0f;
            co.field_h = 0;
            var2 = param1 ? 1 : 0;
            var3 = bd.field_e;
            if (hm.field_c == 0) {
              break L1;
            } else {
              if (2 == i.field_y) {
                break L1;
              } else {
                if (i.field_y == 3) {
                  break L1;
                } else {
                  if (4 == hm.field_c) {
                    break L1;
                  } else {
                    if (hm.field_c == 5) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
          var3 = hm.field_c;
          break L0;
        }
        L2: {
          gb.a(-2, var3, var2 != 0, 0);
          if (param0 == 12229) {
            break L2;
          } else {
            field_h = null;
            break L2;
          }
        }
        L3: {
          if (mj.field_E == 0) {
            break L3;
          } else {
            L4: {
              if (mj.field_E < 10) {
                break L4;
              } else {
                if (mj.field_E >= 20) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              if (mj.field_E < 15) {
                stackOut_15_0 = 2;
                stackIn_16_0 = stackOut_15_0;
                break L5;
              } else {
                stackOut_14_0 = 3;
                stackIn_16_0 = stackOut_14_0;
                break L5;
              }
            }
            bc.field_c = stackIn_16_0;
            co.field_l = stackIn_16_0;
            ka.a(true, (byte) 87);
            break L3;
          }
        }
    }

    public final void run() {
        try {
            IOException iOException = null;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            Throwable var5 = null;
            int var6 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (((el) this).field_u != ((el) this).field_c) {
                          break L3;
                        } else {
                          if (!((el) this).field_l) {
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
                        if (((el) this).field_u <= ((el) this).field_c) {
                          var1_int = ((el) this).field_c + -((el) this).field_u;
                          break L6;
                        } else {
                          var1_int = ((el) this).field_m - ((el) this).field_u;
                          break L6;
                        }
                      }
                      var2 = ((el) this).field_u;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null != ((el) this).field_e) {
                            ((el) this).field_e.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (((el) this).field_j == null) {
                            break L9;
                          } else {
                            ((el) this).field_j.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (((el) this).field_q != null) {
                            ((el) this).field_q.close();
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
                    ((el) this).field_v = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((el) this).field_j.write(((el) this).field_v, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          iOException = (IOException) (Object) decompiledCaughtException;
                          ((el) this).field_p = true;
                          break L13;
                        }
                      }
                      ((el) this).field_u = (((el) this).field_u + var1_int) % ((el) this).field_m;
                      try {
                        L14: {
                          L15: {
                            if (((el) this).field_u != ((el) this).field_c) {
                              break L15;
                            } else {
                              ((el) this).field_j.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          iOException = (IOException) (Object) decompiledCaughtException;
                          ((el) this).field_p = true;
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
                int discarded$1 = 1;
                en.a((String) null, (Throwable) (Object) var1_ref);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    el(java.net.Socket param0, pd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void a(boolean param0, byte param1) {
        ec.field_z = sj.field_o;
        jk.field_c = 2;
        if (param0) {
            kg.field_a = sg.field_i;
            ai.field_c = sj.field_o;
        }
        if (param1 != -106) {
            return;
        }
        em.field_c = sg.field_i;
    }

    final int a(int param0) throws IOException {
        if (param0 != -1) {
            ((el) this).field_l = false;
        }
        if (((el) this).field_l) {
            return 0;
        }
        return ((el) this).field_e.read();
    }

    private el(java.net.Socket param0, pd param1, int param2) throws IOException {
        ((el) this).field_l = false;
        ((el) this).field_p = false;
        ((el) this).field_c = 0;
        ((el) this).field_u = 0;
        try {
            ((el) this).field_q = param0;
            ((el) this).field_o = param1;
            ((el) this).field_q.setSoTimeout(30000);
            ((el) this).field_q.setTcpNoDelay(true);
            ((el) this).field_e = ((el) this).field_q.getInputStream();
            ((el) this).field_j = ((el) this).field_q.getOutputStream();
            ((el) this).field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = "Full";
        field_r = -1;
        field_g = "Only show lobby chat from my friends";
        field_f = "Seriously offensive language";
        field_t = 2;
        field_h = new int[]{8};
        field_a = "This game option has not yet been unlocked for use.";
    }
}
