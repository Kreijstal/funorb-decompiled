/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ke implements Runnable {
    private int field_a;
    private pb field_p;
    private qb field_m;
    static int[] field_q;
    private java.net.Socket field_o;
    private int field_g;
    private boolean field_d;
    static long[][] field_l;
    private int field_b;
    private byte[] field_e;
    static boolean field_j;
    private boolean field_c;
    static long[] field_k;
    private OutputStream field_n;
    static bi field_i;
    private InputStream field_f;
    static String field_h;

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.field_c) {
              if (!this.field_d) {
                L1: {
                  if (this.field_e != null) {
                    break L1;
                  } else {
                    this.field_e = new byte[this.field_g];
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= param0) {
                        L4: {
                          if (null == this.field_p) {
                            this.field_p = this.field_m.a(true, 3, (Runnable) (this));
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_e[this.field_b] = param2[param1 + var6];
                        this.field_b = (this.field_b + 1) % this.field_g;
                        if (this.field_b != (-100 + this.field_g + this.field_a) % this.field_g) {
                          var6++;
                          continue L3;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (param3 == -13976) {
                    break L5;
                  } else {
                    this.field_f = (InputStream) null;
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_d = false;
                throw new IOException();
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5_ref);

            stackIn_25_1 = new StringBuilder().append("ke.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        try {
            int var4 = 0;
            var4 = ShatteredPlansClient.field_F ? 1 : 0;
            if (!(!this.field_c)) {
                return;
            }
            synchronized (this) {
                this.field_c = true;
                this.notifyAll();
            }
            if (this.field_p != null) {
                while (this.field_p.field_d == 0) {
                    jb.a((byte) -111, 1L);
                }
                if (!(this.field_p.field_d != 1)) {
                    try {
                        ((Thread) (this.field_p.field_e)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_p = null;
            if (param0 < 83) {
                ke.a(52, 12, -47, -94, 64);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_l = (long[][]) null;
        field_h = null;
        field_k = null;
        if (param0 > -124) {
            field_k = (long[]) null;
        }
        field_q = null;
        field_i = null;
    }

    final int a(byte param0) throws IOException {
        if (!(!this.field_c)) {
            return 0;
        }
        if (param0 <= 120) {
            this.field_a = -122;
        }
        return this.field_f.read();
    }

    final void a(boolean param0) throws IOException {
        if (!(!this.field_c)) {
            return;
        }
        if (param0) {
            this.finalize();
        }
        if (!(!this.field_d)) {
            this.field_d = false;
            throw new IOException();
        }
    }

    protected final void finalize() {
        this.b(104);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        wh.a(false);
        if (param0 != -6187) {
            ke.b((byte) 13);
        }
        gf.i(param4, param3, param1, param2);
    }

    final int a(int param0) throws IOException {
        if (!(!this.field_c)) {
            return 0;
        }
        if (param0 != -1) {
            field_h = (String) null;
        }
        return this.field_f.available();
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
            var6 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_b == this.field_a) {
                          if (this.field_c) {
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
                        if (this.field_a > this.field_b) {
                          var1_int = -this.field_a + this.field_g;
                          break L6;
                        } else {
                          var1_int = this.field_b - this.field_a;
                          break L6;
                        }
                      }
                      var2 = this.field_a;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (this.field_f != null) {
                            this.field_f.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != this.field_n) {
                            this.field_n.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null != this.field_o) {
                            this.field_o.close();
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
                    this.field_e = null;
                    break L0;
                  } else {
                    if (-1 > (var1_int ^ -1)) {
                      try {
                        L12: {
                          this.field_n.write(this.field_e, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_d = true;
                          break L13;
                        }
                      }
                      this.field_a = (var1_int + this.field_a) % this.field_g;
                      try {
                        L14: {
                          L15: {
                            if (this.field_b == this.field_a) {
                              this.field_n.flush();
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
                          this.field_d = true;
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
                jq.a(-29901, (Throwable) ((Object) var1_ref), (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 26 / ((param3 - 64) / 40);
            if (!this.field_c) {
              L1: while (true) {
                if (0 >= param1) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = this.field_f.read(param0, param2, param1);
                  if (-1 <= (var6 ^ -1)) {
                    throw new EOFException();
                  } else {
                    param2 = param2 + var6;
                    param1 = param1 - var6;
                    continue L1;
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
          L2: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ke.I(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ke(java.net.Socket param0, qb param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void a(int param0, si param1) {
        try {
            param1.field_s = new char[]{(char)63};
            if (param0 >= -39) {
                field_h = (String) null;
            }
            param1.field_x = new int[]{-1};
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ke.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ke(java.net.Socket param0, qb param1, int param2) throws IOException {
        this.field_a = 0;
        this.field_b = 0;
        this.field_d = false;
        this.field_c = false;
        try {
            this.field_m = param1;
            this.field_o = param0;
            this.field_o.setSoTimeout(30000);
            this.field_o.setTcpNoDelay(true);
            this.field_f = this.field_o.getInputStream();
            this.field_n = this.field_o.getOutputStream();
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ke.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
            field_l = new long[8][256];
            field_q = new int[5];
            field_k = new long[11];
            var0 = 0;
            L0: while (true) {
              if (256 <= var0) {
                field_k[0] = 0L;
                var0 = 1;
                L1: while (true) {
                  if ((var0 ^ -1) < -11) {
                    break $cfr$clinit;
                  } else {
                    var1 = (var0 + -1) * 8;
                    field_k[var0] = bg.a(bg.a(co.a(65280L, field_l[6][var1 + 6]), bg.a(bg.a(co.a(4278190080L, field_l[4][var1 - -4]), bg.a(co.a(1095216660480L, field_l[3][var1 + 3]), bg.a(co.a(field_l[2][2 + var1], 280375465082880L), bg.a(co.a(field_l[1][var1 + 1], 71776119061217280L), co.a(field_l[0][var1], -72057594037927936L))))), co.a(field_l[5][var1 + 5], 16711680L))), co.a(field_l[7][var1 - -7], 255L));
                    var0++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if ((var0 & 1) == 0) {
                    stackIn_5_0 = (long)(var1 >>> -645714104);
                    break L2;
                  } else {
                    stackIn_5_0 = (long)(255 & var1);
                    break L2;
                  }
                }
                L3: {
                  var2 = stackIn_5_0;
                  var4 = var2 << -1859226175;
                  if (var4 >= 256L) {
                    var4 = var4 ^ 285L;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var6 = var4 << -1214699583;
                  if (256L > var6) {
                    break L4;
                  } else {
                    var6 = var6 ^ 285L;
                    break L4;
                  }
                }
                L5: {
                  var8 = var2 ^ var6;
                  var10 = var6 << -1083364031;
                  if ((var10 ^ -1L) <= -257L) {
                    var10 = var10 ^ 285L;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var12 = var10 ^ var2;
                field_l[0][var0] = ff.a(var12, ff.a(ff.a(var8 << -890568688, ff.a(var10 << 674617880, ff.a(var2 << 779538336, ff.a(ff.a(var2 << -1992280392, var2 << -247570640), var6 << 495817640)))), var4 << -394852152));
                var14 = 1;
                L6: while (true) {
                  if (var14 >= 8) {
                    var0++;
                    continue L0;
                  } else {
                    field_l[var14][var0] = ff.a(field_l[-1 + var14][var0] >>> -1113970040, field_l[-1 + var14][var0] << -1028846728);
                    var14++;
                    continue L6;
                  }
                }
              }
            }
        }
    }
}
