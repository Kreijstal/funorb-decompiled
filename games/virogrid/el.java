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
        int decompiledRegionSelector0 = 0;
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
            if (!this.field_l) {
              L2: while (true) {
                if (param0 <= 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_e.read(param1, param3, param0);
                  if ((var5_int ^ -1) < -1) {
                    param0 = param0 - var5_int;
                    param3 = param3 + var5_int;
                    continue L2;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("el.I(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
                  if (vl.field_k.equals(mi.field_d)) {
                    stackOut_22_0 = null;
                    stackIn_23_0 = (int[]) ((Object) stackOut_22_0);
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
                en.a("CC1", (Throwable) ((Object) var6), 1);
                ne.field_e = null;
                aa.field_f = null;
                break L9;
              }
            }
            break L6;
          } else {
            aa.field_f = hc.a(128, 80, var8);
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
            this.field_l = true;
        }
        if (this.field_l) {
            return;
        }
        if (this.field_p) {
            this.field_p = false;
            throw new IOException();
        }
    }

    final void b(int param0) {
        try {
            int var4 = 0;
            var4 = Virogrid.field_F ? 1 : 0;
            if (this.field_l) {
                return;
            }
            synchronized (this) {
                this.field_l = true;
                this.notifyAll();
            }
            if (!(null == this.field_n)) {
                while (-1 == (this.field_n.field_a ^ -1)) {
                    mm.a(-64, 1L);
                }
                if (!((this.field_n.field_a ^ -1) != -2)) {
                    try {
                        ((Thread) (this.field_n.field_f)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            if (param0 != 4155) {
                field_f = (String) null;
            }
            this.field_n = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void e(int param0) {
        if (param0 != -2) {
            return;
        }
        la var1 = (la) ((Object) vi.field_h.a((byte) -34));
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
        int decompiledRegionSelector0 = 0;
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
            if (!this.field_l) {
              if (!this.field_p) {
                L1: {
                  if (this.field_v == null) {
                    this.field_v = new byte[this.field_m];
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
                          if (null != this.field_n) {
                            break L4;
                          } else {
                            this.field_n = this.field_o.a(3, (Runnable) (this), param1 ^ 255);
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_v[this.field_c] = param0[var6 + param2];
                        this.field_c = (this.field_c - -1) % this.field_m;
                        if (this.field_c != (this.field_m + this.field_u + -100) % this.field_m) {
                          var6++;
                          continue L3;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_p = false;
                throw new IOException();
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("el.F(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
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
        this.b(4155);
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
        if (!(!this.field_l)) {
            return 0;
        }
        if (param0 != 31479) {
            return 69;
        }
        return this.field_e.available();
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
            field_h = (int[]) null;
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
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            IOException var3 = null;
            Object var3_ref = null;
            InterruptedException var4 = null;
            Throwable var5 = null;
            int var6 = 0;
            String var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_u != this.field_c) {
                          break L3;
                        } else {
                          if (!this.field_l) {
                            try {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L5: {
                                var4 = (InterruptedException) (Object) decompiledCaughtException;
                                break L5;
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
                        if (this.field_u <= this.field_c) {
                          var1_int = this.field_c + -this.field_u;
                          break L6;
                        } else {
                          var1_int = this.field_m - this.field_u;
                          break L6;
                        }
                      }
                      var2 = this.field_u;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null != this.field_e) {
                            this.field_e.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_j == null) {
                            break L9;
                          } else {
                            this.field_j.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_q != null) {
                            this.field_q.close();
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
                    this.field_v = null;
                    break L0;
                  } else {
                    if ((var1_int ^ -1) >= -1) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          this.field_j.write(this.field_v, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_p = true;
                          break L13;
                        }
                      }
                      this.field_u = (this.field_u + var1_int) % this.field_m;
                      try {
                        L14: {
                          L15: {
                            if (this.field_u != this.field_c) {
                              break L15;
                            } else {
                              this.field_j.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_p = true;
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
                var7 = (String) null;
                en.a((String) null, (Throwable) ((Object) var1_ref), 1);
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
            this.field_l = false;
        }
        if (this.field_l) {
            return 0;
        }
        return this.field_e.read();
    }

    private el(java.net.Socket param0, pd param1, int param2) throws IOException {
        this.field_l = false;
        this.field_p = false;
        this.field_c = 0;
        this.field_u = 0;
        try {
            this.field_q = param0;
            this.field_o = param1;
            this.field_q.setSoTimeout(30000);
            this.field_q.setTcpNoDelay(true);
            this.field_e = this.field_q.getInputStream();
            this.field_j = this.field_q.getOutputStream();
            this.field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
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
