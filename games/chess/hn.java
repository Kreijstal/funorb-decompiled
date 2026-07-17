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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            if (((hn) this).field_c) {
              return;
            } else {
              L1: {
                if (param2 == -87) {
                  break L1;
                } else {
                  var7 = null;
                  hn.a((int[]) null, 27, -70, (int[]) null, -84);
                  break L1;
                }
              }
              L2: while (true) {
                if (0 >= param1) {
                  break L0;
                } else {
                  var5_int = ((hn) this).field_j.read(param0, param3, param1);
                  if (0 < var5_int) {
                    param1 = param1 - var5_int;
                    param3 = param3 + var5_int;
                    continue L2;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("hn.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
            Object var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = Chess.field_G;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((hn) this).field_q == ((hn) this).field_h) {
                          if (!((hn) this).field_c) {
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
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (((hn) this).field_h >= ((hn) this).field_q) {
                          var1_int = ((hn) this).field_h + -((hn) this).field_q;
                          break L6;
                        } else {
                          var1_int = ((hn) this).field_r + -((hn) this).field_q;
                          break L6;
                        }
                      }
                      var2 = ((hn) this).field_q;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null != ((hn) this).field_j) {
                            ((hn) this).field_j.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (((hn) this).field_o != null) {
                            ((hn) this).field_o.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (((hn) this).field_i != null) {
                            ((hn) this).field_i.close();
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
                    ((hn) this).field_g = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((hn) this).field_o.write(((hn) this).field_g, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((hn) this).field_l = true;
                          break L13;
                        }
                      }
                      ((hn) this).field_q = (var1_int + ((hn) this).field_q) % ((hn) this).field_r;
                      try {
                        L14: {
                          L15: {
                            if (((hn) this).field_q != ((hn) this).field_h) {
                              break L15;
                            } else {
                              ((hn) this).field_o.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((hn) this).field_l = true;
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
                var7 = null;
                fg.a((Throwable) (Object) var1_ref, (byte) -77, (String) null);
                break L17;
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
                  if (((hn) this).field_f.field_f != 1) {
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
        RuntimeException var4 = null;
        rk[] var5 = null;
        rk[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        rk[] var10 = null;
        km var11 = null;
        int var11_int = 0;
        km var12 = null;
        int var13 = 0;
        rk[] var14 = null;
        km var15 = null;
        int[][] var16 = null;
        km var17 = null;
        km var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var13 = Chess.field_G;
        try {
          L0: {
            jc.field_d = ao.a(param3, "frame_top", 2993, "commonui");
            ej.field_e = ao.a(param3, "frame_bottom", 2993, "commonui");
            vk.field_a = wk.a(param3, 1, "jagex_logo_grey", "commonui");
            bj.field_db = ao.a(param3, "button", 2993, "commonui");
            uh.field_p = ol.a(param3, "validation", "commonui", (byte) -117);
            rc.field_a = (lh) (Object) rc.a("commonui", 19131, "arezzo12", param3, param1);
            rb.field_b = (lh) (Object) rc.a("commonui", 19131, "arezzo14", param3, param1);
            tk.field_a = (lh) (Object) rc.a("commonui", 19131, "arezzo14bold", param3, param1);
            var17 = new km(param2.a("button.gif", 30045, ""), (java.awt.Component) (Object) ja.field_h);
            rk discarded$1 = jn.a("dropdown", 8221, "commonui", param3);
            var5 = qm.a(1, "commonui", "screen_options", param3);
            mf.field_s = new rk[4];
            ia.field_e = new rk[4];
            dn.field_g = new rk[4];
            var6 = new rk[][]{dn.field_g, mf.field_s, ia.field_e};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_o;
            if (param0 >= 65) {
              var8 = 1;
              L1: while (true) {
                if (var8 >= var21.length) {
                  var8 = var5[0].field_p[0];
                  var21[2][var8] = 16777215;
                  var21[1][var8] = 2394342;
                  var21[3][var8] = 4767999;
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= 3) {
                      var9 = var17.field_t;
                      r.k(3029);
                      var17.e();
                      wb.d(0, 0, wb.field_h, wb.field_c);
                      var15 = new km(var9, var9);
                      var18 = var15;
                      var18.e();
                      var17.d(0, 0);
                      var11 = new km(var9, var9);
                      var11.e();
                      var17.d(-var17.field_w + var9, 0);
                      var12 = new km(var17.field_w - var9 * 2, var9);
                      var12.e();
                      var17.d(-var9, 0);
                      fd.a(28773);
                      bj.field_db = new km[]{var15, var12, var11};
                      break L0;
                    } else {
                      var14 = var6[var9];
                      var10 = var14;
                      var11_int = 0;
                      L3: while (true) {
                        if (var11_int >= var14.length) {
                          var9++;
                          continue L2;
                        } else {
                          var14[var11_int] = ch.a(true, var21[var11_int], var5[var9]);
                          var11_int++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var7[var8] = (int[]) var21[0].clone();
                  var8++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("hn.E(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
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
        try {
            if (param2 != -54) {
                hn.b(50);
            }
            dc.field_m = true;
            ja.field_i = param3;
            vg.field_f = param1;
            tj.field_m = param4;
            hd.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "hn.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void b(int param0) {
        int var1 = -2 / ((-19 - param0) / 49);
        if (!(Chess.field_E == ph.field_j.field_i)) {
            cb.field_a = cb.field_a + (-Chess.field_E + ph.field_j.field_i);
            Chess.field_E = ph.field_j.field_i;
        }
        if (da.field_F > 0) {
            da.field_F = da.field_F - 1;
        }
        if (da.field_F > 0) {
            jb.a((byte) -89);
        }
    }

    hn(java.net.Socket param0, jk param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
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
        var8 = Chess.field_G;
        try {
          L0: {
            if (!((hn) this).field_c) {
              if (!((hn) this).field_l) {
                L1: {
                  if (null == ((hn) this).field_g) {
                    ((hn) this).field_g = new byte[((hn) this).field_r];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    L3: {
                      if (param2 == -92) {
                        break L3;
                      } else {
                        field_s = 18;
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= param1) {
                        L5: {
                          if (((hn) this).field_f != null) {
                            break L5;
                          } else {
                            ((hn) this).field_f = ((hn) this).field_a.a(3, true, (Runnable) this);
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((hn) this).field_g[((hn) this).field_h] = param3[param0 + var6];
                        ((hn) this).field_h = (((hn) this).field_h - -1) % ((hn) this).field_r;
                        if (((hn) this).field_h == (-100 + ((hn) this).field_q - -((hn) this).field_r) % ((hn) this).field_r) {
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
                ((hn) this).field_l = false;
                throw new IOException();
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("hn.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw fk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final static void a(int[] param0, int param1, int param2, int[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var13 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param1 >= param4) {
                break L1;
              } else {
                L2: {
                  var5_int = (param4 + param1) / 2;
                  var6 = param1;
                  var7 = param0[var5_int];
                  param0[var5_int] = param0[param4];
                  param0[param4] = var7;
                  var8 = param3[var5_int];
                  param3[var5_int] = param3[param4];
                  param3[param4] = var8;
                  if (2147483647 == var7) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                var9 = stackIn_5_0;
                var10 = param1;
                L3: while (true) {
                  if (var10 >= param4) {
                    param0[param4] = param0[var6];
                    param0[var6] = var7;
                    param3[param4] = param3[var6];
                    param3[var6] = var8;
                    hn.a(param0, param1, 0, param3, var6 + -1);
                    hn.a(param0, var6 + 1, 0, param3, param4);
                    break L1;
                  } else {
                    L4: {
                      if (var7 + -(var10 & var9) >= param0[var10]) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              }
            }
            L5: {
              if (param2 == 0) {
                break L5;
              } else {
                var14 = null;
                hn.a((int[]) null, 112, -123, (int[]) null, 20);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("hn.H(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param4 + 41);
        }
    }

    private hn(java.net.Socket param0, jk param1, int param2) throws IOException {
        ((hn) this).field_h = 0;
        ((hn) this).field_q = 0;
        ((hn) this).field_l = false;
        ((hn) this).field_c = false;
        try {
            ((hn) this).field_a = param1;
            ((hn) this).field_i = param0;
            ((hn) this).field_i.setSoTimeout(30000);
            ((hn) this).field_i.setTcpNoDelay(true);
            ((hn) this).field_j = ((hn) this).field_i.getInputStream();
            ((hn) this).field_o = ((hn) this).field_i.getOutputStream();
            ((hn) this).field_r = param2;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "hn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
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
