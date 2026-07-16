/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hn implements Runnable {
    private nl field_f;
    private int field_q;
    private boolean field_l;
    static ci field_d;
    private int field_r;
    static int field_k;
    static String field_n;
    static int field_p;
    static int field_t;
    static String field_b;
    private int field_h;
    static int field_s;
    static int[] field_e;
    private byte[] field_g;
    private jk field_a;
    private java.net.Socket field_i;
    static int field_m;
    static s field_u;
    private OutputStream field_o;
    private InputStream field_j;
    private boolean field_c;

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = Chess.field_G;
        if (!(!((hn) this).field_c)) {
            return;
        }
        if (param2 != -87) {
            Object var7 = null;
            hn.a((int[]) null, 27, -70, (int[]) null, -84);
        }
        while (0 < param1) {
            var5 = ((hn) this).field_j.read(param0, param3, param1);
            if (0 >= var5) {
                throw new EOFException();
            }
            param1 = param1 - var5;
            param3 = param3 + var5;
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
            var6 = Chess.field_G;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((hn) this).field_q == ((hn) this).field_h) {
                      if (!((hn) this).field_c) {
                        this.wait();
                        break L2;
                      } else {
                        try {
                          L3: {
                            L4: {
                              if (null != ((hn) this).field_j) {
                                ((hn) this).field_j.close();
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              if (((hn) this).field_o != null) {
                                ((hn) this).field_o.close();
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (((hn) this).field_i != null) {
                                ((hn) this).field_i.close();
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
                        ((hn) this).field_g = null;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L8: {
                    if (((hn) this).field_h >= ((hn) this).field_q) {
                      var1_int = ((hn) this).field_h + -((hn) this).field_q;
                      break L8;
                    } else {
                      var1_int = ((hn) this).field_r + -((hn) this).field_q;
                      break L8;
                    }
                  }
                  var2 = ((hn) this).field_q;
                  if (var1_int <= 0) {
                    continue L1;
                  } else {
                    try {
                      L9: {
                        ((hn) this).field_o.write(((hn) this).field_g, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((hn) this).field_l = true;
                        break L10;
                      }
                    }
                    ((hn) this).field_q = (var1_int + ((hn) this).field_q) % ((hn) this).field_r;
                    try {
                      L11: {
                        L12: {
                          if (((hn) this).field_q != ((hn) this).field_h) {
                            break L12;
                          } else {
                            ((hn) this).field_o.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((hn) this).field_l = true;
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
                fg.a((Throwable) (Object) var1_ref, (byte) -77, (String) null);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_n = null;
        if (param0) {
            return;
        }
        field_d = null;
        field_u = null;
        field_e = null;
    }

    final int b(byte param0) throws IOException {
        if (((hn) this).field_c) {
            return 0;
        }
        int var2 = 91 % ((param0 - -30) / 48);
        return ((hn) this).field_j.read();
    }

    final int c(int param0) throws IOException {
        if (!(!((hn) this).field_c)) {
            return 0;
        }
        if (param0 != 0) {
            hn.a((String) null, 112, (byte) -30, -125, -34L);
        }
        return ((hn) this).field_j.available();
    }

    protected final void finalize() {
        ((hn) this).a(-1);
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Chess.field_G;
        if (!((hn) this).field_c) {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                ((hn) this).field_c = true;
                this.notifyAll();
                if (param0 == -1) {
                  break L1;
                } else {
                  field_u = null;
                  break L1;
                }
              }
              break L0;
            }
          }
          L2: {
            if (null == ((hn) this).field_f) {
              break L2;
            } else {
              L3: while (true) {
                if (((hn) this).field_f.field_f != 0) {
                  if ((((hn) this).field_f.field_f ^ -1) != -2) {
                    break L2;
                  } else {
                    try {
                      L4: {
                        ((Thread) ((hn) this).field_f.field_b).join();
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
                  bc.a(1L, (byte) 60);
                  continue L3;
                }
              }
            }
          }
          ((hn) this).field_f = null;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, um param1, um param2, um param3) {
        int var8 = 0;
        int var9 = 0;
        rk[] var14 = null;
        int var11_int = 0;
        int var13 = Chess.field_G;
        jc.field_d = ao.a(param3, "frame_top", 2993, "commonui");
        ej.field_e = ao.a(param3, "frame_bottom", 2993, "commonui");
        vk.field_a = wk.a(param3, 1, "jagex_logo_grey", "commonui");
        bj.field_db = ao.a(param3, "button", 2993, "commonui");
        uh.field_p = ol.a(param3, "validation", "commonui", (byte) -117);
        rc.field_a = (lh) (Object) rc.a("commonui", 19131, "arezzo12", param3, param1);
        rb.field_b = (lh) (Object) rc.a("commonui", 19131, "arezzo14", param3, param1);
        tk.field_a = (lh) (Object) rc.a("commonui", 19131, "arezzo14bold", param3, param1);
        km var17 = new km(param2.a("button.gif", 30045, ""), (java.awt.Component) (Object) ja.field_h);
        rk discarded$0 = jn.a("dropdown", 8221, "commonui", param3);
        rk[] var5 = qm.a(1, "commonui", "screen_options", param3);
        mf.field_s = new rk[4];
        ia.field_e = new rk[4];
        dn.field_g = new rk[4];
        rk[][] var6 = new rk[][]{dn.field_g, mf.field_s, ia.field_e};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_o;
        if (param0 < 65) {
            return;
        }
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_p[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var14 = var6[var9];
            rk[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = ch.a(true, var21[var11_int], var5[var9]);
            }
        }
        var9 = var17.field_t;
        r.k(3029);
        var17.e();
        wb.d(0, 0, wb.field_h, wb.field_c);
        km var15 = new km(var9, var9);
        km var18 = var15;
        var18.e();
        var17.d(0, 0);
        km var11 = new km(var9, var9);
        var11.e();
        var17.d(-var17.field_w + var9, 0);
        km var12 = new km(var17.field_w - var9 * 2, var9);
        var12.e();
        var17.d(-var9, 0);
        fd.a(28773);
        bj.field_db = new km[]{var15, var12, var11};
    }

    final void a(byte param0) throws IOException {
        if (((hn) this).field_c) {
            return;
        }
        if (param0 != -41) {
            ((hn) this).field_q = -44;
        }
        if (((hn) this).field_l) {
            ((hn) this).field_l = false;
            throw new IOException();
        }
    }

    final static void a(String param0, int param1, byte param2, int param3, long param4) {
        if (param2 != -54) {
            hn.b(50);
        }
        dc.field_m = true;
        ja.field_i = param3;
        vg.field_f = param1;
        tj.field_m = param4;
        hd.field_e = param0;
    }

    final static void b(int param0) {
        int var1 = -2 / ((-19 - param0) / 49);
        if (!(Chess.field_E == ph.field_j.field_i)) {
            cb.field_a = cb.field_a + (-Chess.field_E + ph.field_j.field_i);
            Chess.field_E = ph.field_j.field_i;
        }
        if (-1 > (da.field_F ^ -1)) {
            da.field_F = da.field_F - 1;
        }
        if ((da.field_F ^ -1) < -1) {
            jb.a((byte) -89);
        }
    }

    hn(java.net.Socket param0, jk param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = Chess.field_G;
        if (!((hn) this).field_c) {
          if (!((hn) this).field_l) {
            L0: {
              if (null == ((hn) this).field_g) {
                ((hn) this).field_g = new byte[((hn) this).field_r];
                break L0;
              } else {
                break L0;
              }
            }
            var5 = this;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param2 == -92) {
                    break L2;
                  } else {
                    field_s = 18;
                    break L2;
                  }
                }
                var6 = 0;
                L3: while (true) {
                  if (var6 >= param1) {
                    L4: {
                      if (((hn) this).field_f != null) {
                        break L4;
                      } else {
                        ((hn) this).field_f = ((hn) this).field_a.a(3, true, (Runnable) this);
                        break L4;
                      }
                    }
                    this.notifyAll();
                    break L1;
                  } else {
                    ((hn) this).field_g[((hn) this).field_h] = param3[param0 + var6];
                    ((hn) this).field_h = (((hn) this).field_h - -1) % ((hn) this).field_r;
                    if (((hn) this).field_h == (-100 + ((hn) this).field_q - -((hn) this).field_r) % ((hn) this).field_r) {
                      throw new IOException();
                    } else {
                      var6++;
                      continue L3;
                    }
                  }
                }
              }
            }
            return;
          } else {
            ((hn) this).field_l = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    final static void a(int[] param0, int param1, int param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var13 = Chess.field_G;
          if (param1 >= param4) {
            break L0;
          } else {
            L1: {
              var5 = (param4 + param1) / 2;
              var6 = param1;
              var7 = param0[var5];
              param0[var5] = param0[param4];
              param0[param4] = var7;
              var8 = param3[var5];
              param3[var5] = param3[param4];
              param3[param4] = var8;
              if (2147483647 == var7) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var9 = stackIn_4_0;
            var10 = param1;
            L2: while (true) {
              if (var10 >= param4) {
                param0[param4] = param0[var6];
                param0[var6] = var7;
                param3[param4] = param3[var6];
                param3[var6] = var8;
                hn.a(param0, param1, 0, param3, var6 + -1);
                hn.a(param0, var6 + 1, 0, param3, param4);
                break L0;
              } else {
                if (var7 + -(var10 & var9) < param0[var10]) {
                  var11 = param0[var10];
                  param0[var10] = param0[var6];
                  param0[var6] = var11;
                  var12 = param3[var10];
                  param3[var10] = param3[var6];
                  int incrementValue$1 = var6;
                  var6++;
                  param3[incrementValue$1] = var12;
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          if (param2 == 0) {
            break L3;
          } else {
            var14 = null;
            hn.a((int[]) null, 112, -123, (int[]) null, 20);
            break L3;
          }
        }
    }

    private hn(java.net.Socket param0, jk param1, int param2) throws IOException {
        ((hn) this).field_h = 0;
        ((hn) this).field_q = 0;
        ((hn) this).field_l = false;
        ((hn) this).field_c = false;
        ((hn) this).field_a = param1;
        ((hn) this).field_i = param0;
        ((hn) this).field_i.setSoTimeout(30000);
        ((hn) this).field_i.setTcpNoDelay(true);
        ((hn) this).field_j = ((hn) this).field_i.getInputStream();
        ((hn) this).field_o = ((hn) this).field_i.getOutputStream();
        ((hn) this).field_r = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_n = "Quick Chat lobby";
        field_t = 0;
        field_k = 0;
        field_b = "All players have left <%0>'s game.";
    }
}
