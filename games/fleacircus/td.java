/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class td implements Runnable {
    private OutputStream field_d;
    static long[][] field_f;
    private InputStream field_n;
    private od field_q;
    private int field_r;
    private boolean field_a;
    static int field_i;
    private boolean field_l;
    private int field_b;
    static long[] field_c;
    private ce field_p;
    private byte[] field_h;
    private int field_e;
    static dd field_m;
    static ke field_g;
    static w field_k;
    static wk field_j;
    private java.net.Socket field_o;

    final static int a(boolean param0) {
        if (!param0) {
            return -33;
        }
        return lg.field_d;
    }

    final void c(int param0) throws IOException {
        if (param0 != 0) {
            ((td) this).finalize();
        }
        if (!(!((td) this).field_l)) {
            return;
        }
        if (!(!((td) this).field_a)) {
            ((td) this).field_a = false;
            throw new IOException();
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        ql var3 = null;
        L0: {
          L1: {
            L2: {
              var2 = fleas.field_A ? 1 : 0;
              tj.field_a = tj.field_a + 1;
              if (wc.field_q <= 0) {
                break L2;
              } else {
                if (!qh.c((byte) 68)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if ((fleas.field_E ^ -1) != -1) {
              break L1;
            } else {
              if ((tj.field_a ^ -1) > -16) {
                break L1;
              } else {
                oa.a(9, true, 15);
                break L0;
              }
            }
          }
          if ((ia.field_m[fleas.field_E].length ^ -1) >= (tj.field_a ^ -1)) {
            L3: {
              if ((hj.field_a[1] ^ -1) != (-1 + pl.field_l[1] ^ -1)) {
                break L3;
              } else {
                if ((hj.field_a[0] ^ -1) != (-1 + pl.field_l[0] ^ -1)) {
                  break L3;
                } else {
                  hg.a(-25389, 3, 252, tj.field_a);
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if ((pl.field_l[1] - 1 ^ -1) == (hj.field_a[1] ^ -1)) {
                  break L5;
                } else {
                  if ((hj.field_a[0] ^ -1) == (-1 + pl.field_l[0] ^ -1)) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              if (tg.field_g) {
                hg.a(-25389, 15, 240, tj.field_a);
                break L4;
              } else {
                break L4;
              }
            }
            oa.a(9, true, 37);
            break L0;
          } else {
            L6: {
              bc.field_V = -1;
              if (-1 <= (em.field_b ^ -1)) {
                break L6;
              } else {
                wi.field_p.a(-119, em.field_b);
                wi.field_p.a(false);
                em.field_b = 0;
                break L6;
              }
            }
            L7: {
              if (-13 != (tj.field_a ^ -1)) {
                break L7;
              } else {
                if (fleas.field_E != 0) {
                  break L7;
                } else {
                  if (!c.field_U) {
                    hg.a(-25389, 10, 245, tj.field_a);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            if ((tj.field_a ^ -1) <= (ia.field_m[fleas.field_E].length ^ -1)) {
              oa.a(9, true, 41);
              break L0;
            } else {
              L8: {
                hj.field_a[fleas.field_E] = Math.max(tj.field_a, hj.field_a[fleas.field_E]);
                var3 = new ql(fleas.field_E, -1 + hj.field_a[fleas.field_E], 0, 0, 0, 0);
                if (!qh.c((byte) 38)) {
                  rd.a(var3, 79, 5);
                  break L8;
                } else {
                  mi.field_r.a(false, (lh) (Object) var3);
                  break L8;
                }
              }
              ej.a((byte) -39);
              break L0;
            }
          }
        }
        L9: {
          if (param0 > 8) {
            break L9;
          } else {
            field_m = null;
            break L9;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_j = null;
        field_g = null;
        field_k = null;
        field_c = null;
        field_m = null;
        if (param0 != 123167272) {
            field_f = null;
        }
    }

    final static void g(int param0) {
        cg.a((byte) -105, param0);
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
            var6 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((td) this).field_e == ((td) this).field_b) {
                      if (((td) this).field_l) {
                        try {
                          L3: {
                            L4: {
                              if (null == ((td) this).field_n) {
                                break L4;
                              } else {
                                ((td) this).field_n.close();
                                break L4;
                              }
                            }
                            L5: {
                              if (null != ((td) this).field_d) {
                                ((td) this).field_d.close();
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (null == ((td) this).field_o) {
                                break L6;
                              } else {
                                ((td) this).field_o.close();
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
                        ((td) this).field_h = null;
                        break L0;
                      } else {
                        this.wait();
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L8: {
                    if (((td) this).field_e <= ((td) this).field_b) {
                      var1_int = -((td) this).field_e + ((td) this).field_b;
                      break L8;
                    } else {
                      var1_int = ((td) this).field_r - ((td) this).field_e;
                      break L8;
                    }
                  }
                  var2 = ((td) this).field_e;
                  if (-1 > (var1_int ^ -1)) {
                    try {
                      L9: {
                        ((td) this).field_d.write(((td) this).field_h, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((td) this).field_a = true;
                        break L10;
                      }
                    }
                    ((td) this).field_e = (var1_int + ((td) this).field_e) % ((td) this).field_r;
                    try {
                      L11: {
                        L12: {
                          if (((td) this).field_e == ((td) this).field_b) {
                            ((td) this).field_d.flush();
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((td) this).field_a = true;
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
                ud.a((String) null, (Throwable) (Object) var1_ref, 0);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        if (!((td) this).field_l) {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((td) this).field_l = true;
              this.notifyAll();
              break L0;
            }
          }
          if (param0 == 0) {
            L1: {
              if (null != ((td) this).field_q) {
                L2: while (true) {
                  if (((td) this).field_q.field_b != 0) {
                    if (1 == ((td) this).field_q.field_b) {
                      try {
                        L3: {
                          ((Thread) ((td) this).field_q.field_e).join();
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
                    vh.a(1L, param0 + 104);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            ((td) this).field_q = null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean d(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -79) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (!vc.field_b) {
                break L3;
              } else {
                if (mf.field_a == null) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (!qh.c((byte) 33)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    protected final void finalize() {
        ((td) this).h(0);
    }

    final static void a(byte param0, ni param1) {
        rf.field_l = param1.d((byte) 72) << 324436709;
        int var2 = param1.e(false);
        rf.field_l = rf.field_l + (var2 >> -1982762621);
        wd.field_c = var2 << -976228430 & 1835008;
        wd.field_c = wd.field_c + (param1.d((byte) -112) << -1786963710);
        var2 = param1.e(false);
        wd.field_c = wd.field_c + (var2 >> -753536666);
        dk.field_B = 2064384 & var2 << -1150991121;
        dk.field_B = dk.field_B + (param1.e(false) << -1115925337);
        var2 = param1.e(false);
        w.field_a = var2 << -1678141744 & 65536;
        dk.field_B = dk.field_B + (var2 >> -526079167);
        w.field_a = w.field_a + param1.d((byte) -88);
        if (param0 != -107) {
            td.b(13);
        }
    }

    td(java.net.Socket param0, ce param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        if (param0 <= -85) {
          if (!((td) this).field_l) {
            if (!((td) this).field_a) {
              L0: {
                if (((td) this).field_h == null) {
                  ((td) this).field_h = new byte[((td) this).field_r];
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
                    if (var6 >= param1) {
                      L3: {
                        if (null != ((td) this).field_q) {
                          break L3;
                        } else {
                          ((td) this).field_q = ((td) this).field_p.a(4532, (Runnable) this, 3);
                          break L3;
                        }
                      }
                      this.notifyAll();
                      break L1;
                    } else {
                      ((td) this).field_h[((td) this).field_b] = param3[param2 + var6];
                      ((td) this).field_b = (1 + ((td) this).field_b) % ((td) this).field_r;
                      if ((-100 + ((td) this).field_r + ((td) this).field_e) % ((td) this).field_r != ((td) this).field_b) {
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
              ((td) this).field_a = false;
              throw new IOException();
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int f(int param0) throws IOException {
        if (!(!((td) this).field_l)) {
            return 0;
        }
        if (param0 != 1605772320) {
            ((td) this).field_a = false;
        }
        return ((td) this).field_n.read();
    }

    final void a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        if (((td) this).field_l) {
            return;
        }
        if (param3) {
            field_c = null;
        }
        while ((param0 ^ -1) < -1) {
            var5 = ((td) this).field_n.read(param1, param2, param0);
            if (!((var5 ^ -1) < -1)) {
                throw new EOFException();
            }
            param0 = param0 - var5;
            param2 = param2 + var5;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = fleas.field_A ? 1 : 0;
        ql var4 = (ql) (Object) sd.field_d.c((byte) 47);
        while (var4 != null) {
            qb.a(param0, (byte) 90, var4);
            var4 = (ql) (Object) sd.field_d.b((byte) -105);
        }
        fi var2 = (fi) (Object) lk.field_O.c((byte) 47);
        if (param1 != -1115925337) {
            td.g(-22);
        }
        while (var2 != null) {
            rd.a(param0, var2, (byte) -118);
            var2 = (fi) (Object) lk.field_O.b((byte) -105);
        }
    }

    final int e(int param0) throws IOException {
        if (((td) this).field_l) {
            return 0;
        }
        int var2 = 49 % ((param0 - -57) / 48);
        return ((td) this).field_n.available();
    }

    private td(java.net.Socket param0, ce param1, int param2) throws IOException {
        ((td) this).field_b = 0;
        ((td) this).field_e = 0;
        ((td) this).field_l = false;
        ((td) this).field_a = false;
        ((td) this).field_o = param0;
        ((td) this).field_p = param1;
        ((td) this).field_o.setSoTimeout(30000);
        ((td) this).field_o.setTcpNoDelay(true);
        ((td) this).field_n = ((td) this).field_o.getInputStream();
        ((td) this).field_d = ((td) this).field_o.getOutputStream();
        ((td) this).field_r = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_f = new long[8][256];
        field_c = new long[11];
        var0 = 0;
        L0: while (true) {
          if ((var0 ^ -1) <= -257) {
            field_c[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (-11 > (var15 ^ -1)) {
                return;
              } else {
                var1 = -8 + var15 * 8;
                field_c[var15] = ik.a(re.a(field_f[7][var1 + 7], 255L), ik.a(re.a(65280L, field_f[6][var1 + 6]), ik.a(ik.a(ik.a(re.a(field_f[3][var1 - -3], 1095216660480L), ik.a(ik.a(re.a(-72057594037927936L, field_f[0][var1]), re.a(71776119061217280L, field_f[1][var1 - -1])), re.a(field_f[2][2 + var1], 280375465082880L))), re.a(field_f[4][4 + var1], 4278190080L)), re.a(field_f[5][var1 - -5], 16711680L))));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) == 0) {
                stackOut_4_0 = (long)(var1 >>> -717312504);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1934584129;
              if ((var4 ^ -1L) <= -257L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1978889857;
              if (256L > var6) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << 344694401;
              if (256L <= var10) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_f[0][var0] = cd.a(cd.a(var4 << -750757048, cd.a(cd.a(var10 << -286779944, cd.a(var2 << 1605772320, cd.a(var6 << 123167272, cd.a(var2 << 743919288, var2 << -368416976)))), var8 << -640463792)), var12);
            var14 = 1;
            L6: while (true) {
              if ((var14 ^ -1) <= -9) {
                var0++;
                continue L0;
              } else {
                field_f[var14][var0] = cd.a(field_f[-1 + var14][var0] >>> -1233610744, field_f[-1 + var14][var0] << 1052021880);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
