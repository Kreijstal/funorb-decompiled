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
            this.finalize();
        }
        if (!(!this.field_l)) {
            return;
        }
        if (!(!this.field_a)) {
            this.field_a = false;
            throw new IOException();
        }
    }

    final static void b(int param0) {
        int var2;
        ql var3;
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
            if (fleas.field_E != 0) {
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
          if (ia.field_m[fleas.field_E].length <= tj.field_a) {
            L3: {
              if (hj.field_a[1] != -1 + pl.field_l[1]) {
                break L3;
              } else {
                if (hj.field_a[0] != -1 + pl.field_l[0]) {
                  break L3;
                } else {
                  hg.a(-25389, 3, 252, tj.field_a);
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (pl.field_l[1] - 1 == hj.field_a[1]) {
                  break L5;
                } else {
                  if (hj.field_a[0] == -1 + pl.field_l[0]) {
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
            if (tj.field_a >= ia.field_m[fleas.field_E].length) {
              oa.a(9, true, 41);
              break L0;
            } else {
              hj.field_a[fleas.field_E] = Math.max(tj.field_a, hj.field_a[fleas.field_E]);
              var3 = new ql(fleas.field_E, -1 + hj.field_a[fleas.field_E], 0, 0, 0, 0);
              if (!qh.c((byte) 38)) {
                rd.a(var3, 79, 5);
                ej.a((byte) -39);
                break L0;
              } else {
                mi.field_r.a(false, var3);
                ej.a((byte) -39);
                break L0;
              }
            }
          }
        }
        L8: {
          if (param0 > 8) {
            break L8;
          } else {
            field_m = (dd) null;
            break L8;
          }
        }
    }

    public static void a(int param0) {
        field_f = (long[][]) null;
        field_j = null;
        field_g = null;
        field_k = null;
        field_c = null;
        field_m = null;
        if (param0 != 123167272) {
            field_f = (long[][]) null;
        }
    }

    final static void g(int param0) {
        cg.a((byte) -105, param0);
    }

    public final void run() {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            int var6 = 0;
            String var7 = null;
            var6 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_e == this.field_b) {
                          if (this.field_l) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
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
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (this.field_e <= this.field_b) {
                          var1_int = -this.field_e + this.field_b;
                          break L6;
                        } else {
                          var1_int = this.field_r - this.field_e;
                          break L6;
                        }
                      }
                      var2 = this.field_e;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == this.field_n) {
                            break L8;
                          } else {
                            this.field_n.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null != this.field_d) {
                            this.field_d.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null == this.field_o) {
                            break L10;
                          } else {
                            this.field_o.close();
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
                    this.field_h = null;
                    break L0;
                  } else {
                    if (-1 > (var1_int ^ -1)) {
                      try {
                        L12: {
                          this.field_d.write(this.field_h, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_a = true;
                          break L13;
                        }
                      }
                      this.field_e = (var1_int + this.field_e) % this.field_r;
                      try {
                        L14: {
                          L15: {
                            if (this.field_e == this.field_b) {
                              this.field_d.flush();
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_a = true;
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
                var7 = (String) null;
                ud.a((String) null, (Throwable) ((Object) var1_ref), 0);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        try {
            int var4 = 0;
            var4 = fleas.field_A ? 1 : 0;
            if (this.field_l) {
                return;
            }
            synchronized (this) {
                this.field_l = true;
                this.notifyAll();
            }
            if (param0 != 0) {
                return;
            }
            if (!(null == this.field_q)) {
                while (this.field_q.field_b == 0) {
                    vh.a(1L, param0 + 104);
                }
                if (!(1 != this.field_q.field_b)) {
                    try {
                        ((Thread) (this.field_q.field_e)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_q = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean d(int param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 < -79) {
            break L0;
          } else {
            field_j = (wk) null;
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
              stackIn_9_0 = 0;
              break L1;
            } else {
              break L2;
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    protected final void finalize() {
        this.h(0);
    }

    final static void a(byte param0, ni param1) {
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              rf.field_l = param1.d((byte) 72) << 324436709;
              var2_int = param1.e(false);
              rf.field_l = rf.field_l + (var2_int >> -1982762621);
              wd.field_c = var2_int << -976228430 & 1835008;
              wd.field_c = wd.field_c + (param1.d((byte) -112) << -1786963710);
              var2_int = param1.e(false);
              wd.field_c = wd.field_c + (var2_int >> -753536666);
              dk.field_B = 2064384 & var2_int << -1150991121;
              dk.field_B = dk.field_B + (param1.e(false) << -1115925337);
              var2_int = param1.e(false);
              w.field_a = var2_int << -1678141744 & 65536;
              dk.field_B = dk.field_B + (var2_int >> -526079167);
              w.field_a = w.field_a + param1.d((byte) -88);
              if (param0 == -107) {
                break L1;
              } else {
                td.b(13);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("td.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    td(java.net.Socket param0, ce param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 <= -85) {
              if (!this.field_l) {
                if (!this.field_a) {
                  L1: {
                    if (this.field_h == null) {
                      this.field_h = new byte[this.field_r];
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var5 = this;
                  synchronized (var5) {
                    L2: {
                      var6 = 0;
                      L3: while (true) {
                        if (var6 >= param1) {
                          L4: {
                            if (null != this.field_q) {
                              break L4;
                            } else {
                              this.field_q = this.field_p.a(4532, (Runnable) (this), 3);
                              break L4;
                            }
                          }
                          this.notifyAll();
                          break L2;
                        } else {
                          this.field_h[this.field_b] = param3[param2 + var6];
                          this.field_b = (1 + this.field_b) % this.field_r;
                          if ((-100 + this.field_r + this.field_e) % this.field_r != this.field_b) {
                            var6++;
                            continue L3;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  this.field_a = false;
                  throw new IOException();
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5_ref);

            stackIn_25_1 = new StringBuilder().append("td.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int f(int param0) throws IOException {
        if (!(!this.field_l)) {
            return 0;
        }
        if (param0 != 1605772320) {
            this.field_a = false;
        }
        return this.field_n.read();
    }

    final void a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.field_l) {
              L1: {
                if (!param3) {
                  break L1;
                } else {
                  field_c = (long[]) null;
                  break L1;
                }
              }
              L2: while (true) {
                if ((param0 ^ -1) >= -1) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_n.read(param1, param2, param0);
                  if ((var5_int ^ -1) >= -1) {
                    throw new EOFException();
                  } else {
                    param0 = param0 - var5_int;
                    param2 = param2 + var5_int;
                    continue L2;
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
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("td.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ql var4 = null;
        fi var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (ql) ((Object) sd.field_d.c((byte) 47));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  var5 = (fi) ((Object) lk.field_O.c((byte) 47));
                  if (param1 == -1115925337) {
                    break L2;
                  } else {
                    td.g(-22);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    rd.a(param0, var5, (byte) -118);
                    var5 = (fi) ((Object) lk.field_O.b((byte) -105));
                    continue L3;
                  }
                }
              } else {
                qb.a(param0, (byte) 90, var4);
                var4 = (ql) ((Object) sd.field_d.b((byte) -105));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "td.C(" + param0 + ',' + param1 + ')');
        }
    }

    final int e(int param0) throws IOException {
        if (this.field_l) {
            return 0;
        }
        int var2 = 49 % ((param0 - -57) / 48);
        return this.field_n.available();
    }

    private td(java.net.Socket param0, ce param1, int param2) throws IOException {
        this.field_b = 0;
        this.field_e = 0;
        this.field_l = false;
        this.field_a = false;
        try {
            this.field_o = param0;
            this.field_p = param1;
            this.field_o.setSoTimeout(30000);
            this.field_o.setTcpNoDelay(true);
            this.field_n = this.field_o.getInputStream();
            this.field_d = this.field_o.getOutputStream();
            this.field_r = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit: {
            long stackIn_5_0 = 0L;
            int var0;
            int var1;
            long var2;
            long var4;
            long var6;
            long var8;
            long var10;
            long var12;
            int var14;
            int var15;
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
                    break $cfr$clinit;
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
                    stackIn_5_0 = (long)(var1 >>> -717312504);
                    break L2;
                  } else {
                    stackIn_5_0 = (long)(var1 & 255);
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
}
