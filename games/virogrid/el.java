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
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        if (param2 != -1) {
            el.a(false);
        }
        if (((el) this).field_l) {
            return;
        }
        while (param0 > 0) {
            var5 = ((el) this).field_e.read(param1, param3, param0);
            if ((var5 ^ -1) >= -1) {
                throw new EOFException();
            }
            param0 = param0 - var5;
            param3 = param3 + var5;
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
          if (param1 == (128 & var3)) {
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
            if (-2 == (td.field_h ^ -1)) {
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
                en.a("CC1", (Throwable) (Object) var6, 1);
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
        int var4 = 112 % ((46 - param0) / 59);
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
                if (-1 != (((el) this).field_n.field_a ^ -1)) {
                  if ((((el) this).field_n.field_a ^ -1) == -2) {
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

    final static void e(int param0) {
        if (param0 != -2) {
            return;
        }
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
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = Virogrid.field_F ? 1 : 0;
        if (!((el) this).field_l) {
          if (!((el) this).field_p) {
            L0: {
              if (((el) this).field_v == null) {
                ((el) this).field_v = new byte[((el) this).field_m];
                break L0;
              } else {
                break L0;
              }
            }
            var5 = this;
            synchronized (var5) {
              L1: {
                var6 = param1;
                L2: while (true) {
                  if (var6 >= param3) {
                    L3: {
                      if (null != ((el) this).field_n) {
                        break L3;
                      } else {
                        ((el) this).field_n = ((el) this).field_o.a(3, (Runnable) this, param1 ^ 255);
                        break L3;
                      }
                    }
                    this.notifyAll();
                    break L1;
                  } else {
                    ((el) this).field_v[((el) this).field_c] = param0[var6 + param2];
                    ((el) this).field_c = (((el) this).field_c - -1) % ((el) this).field_m;
                    if (((el) this).field_c != (((el) this).field_m + ((el) this).field_u + -100) % ((el) this).field_m) {
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
            ((el) this).field_p = false;
            throw new IOException();
          }
        } else {
          return;
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

    public static void d(int param0) {
        if (param0 > -124) {
            return;
        }
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
            if ((hm.field_c ^ -1) == -1) {
              break L1;
            } else {
              if (2 == i.field_y) {
                break L1;
              } else {
                if ((i.field_y ^ -1) == -4) {
                  break L1;
                } else {
                  if (4 == hm.field_c) {
                    break L1;
                  } else {
                    if ((hm.field_c ^ -1) == -6) {
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
          if (-1 == (mj.field_E ^ -1)) {
            break L3;
          } else {
            L4: {
              if (-11 < (mj.field_E ^ -1)) {
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
              if (-16 < (mj.field_E ^ -1)) {
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
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            var6 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((el) this).field_u != ((el) this).field_c) {
                      break L2;
                    } else {
                      if (!((el) this).field_l) {
                        this.wait();
                        break L2;
                      } else {
                        try {
                          L3: {
                            L4: {
                              if (null != ((el) this).field_e) {
                                ((el) this).field_e.close();
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              if (((el) this).field_j == null) {
                                break L5;
                              } else {
                                ((el) this).field_j.close();
                                break L5;
                              }
                            }
                            L6: {
                              if (((el) this).field_q != null) {
                                ((el) this).field_q.close();
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
                        ((el) this).field_v = null;
                        break L0;
                      }
                    }
                  }
                  L8: {
                    if (((el) this).field_u <= ((el) this).field_c) {
                      var1_int = ((el) this).field_c + -((el) this).field_u;
                      break L8;
                    } else {
                      var1_int = ((el) this).field_m - ((el) this).field_u;
                      break L8;
                    }
                  }
                  var2 = ((el) this).field_u;
                  if ((var1_int ^ -1) >= -1) {
                    continue L1;
                  } else {
                    try {
                      L9: {
                        ((el) this).field_j.write(((el) this).field_v, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ((el) this).field_p = true;
                        break L10;
                      }
                    }
                    ((el) this).field_u = (((el) this).field_u + var1_int) % ((el) this).field_m;
                    try {
                      L11: {
                        L12: {
                          if (((el) this).field_u != ((el) this).field_c) {
                            break L12;
                          } else {
                            ((el) this).field_j.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ((el) this).field_p = true;
                        break L13;
                      }
                    }
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L14: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = null;
                en.a((String) null, (Throwable) (Object) var1_ref, 1);
                break L14;
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
        ((el) this).field_q = param0;
        ((el) this).field_o = param1;
        ((el) this).field_q.setSoTimeout(30000);
        ((el) this).field_q.setTcpNoDelay(true);
        ((el) this).field_e = ((el) this).field_q.getInputStream();
        ((el) this).field_j = ((el) this).field_q.getOutputStream();
        ((el) this).field_m = param2;
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
