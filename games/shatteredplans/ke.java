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
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!((ke) this).field_c) {
              if (!((ke) this).field_d) {
                L1: {
                  if (((ke) this).field_e != null) {
                    break L1;
                  } else {
                    ((ke) this).field_e = new byte[((ke) this).field_g];
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= param0) {
                        L4: {
                          if (null == ((ke) this).field_p) {
                            ((ke) this).field_p = ((ke) this).field_m.a(true, 3, (Runnable) this);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((ke) this).field_e[((ke) this).field_b] = param2[param1 + var6];
                        ((ke) this).field_b = (((ke) this).field_b + 1) % ((ke) this).field_g;
                        if (((ke) this).field_b != (-100 + ((ke) this).field_g + ((ke) this).field_a) % ((ke) this).field_g) {
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
                    ((ke) this).field_f = null;
                    break L5;
                  }
                }
                break L0;
              } else {
                ((ke) this).field_d = false;
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
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("ke.B(").append(param0).append(44).append(param1).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param3 + 41);
        }
    }

    final void b(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((ke) this).field_c) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((ke) this).field_c = true;
              this.notifyAll();
              break L0;
            }
          }
          L1: {
            if (((ke) this).field_p == null) {
              break L1;
            } else {
              L2: while (true) {
                if (((ke) this).field_p.field_d != 0) {
                  if (((ke) this).field_p.field_d == 1) {
                    try {
                      L3: {
                        ((Thread) ((ke) this).field_p.field_e).join();
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
                  jb.a((byte) -111, 1L);
                  continue L2;
                }
              }
            }
          }
          L5: {
            ((ke) this).field_p = null;
            if (param0 >= 83) {
              break L5;
            } else {
              ke.a(52, 12, -47, -94, 64);
              break L5;
            }
          }
          return;
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_h = null;
        field_k = null;
        if (param0 > -124) {
            field_k = null;
        }
        field_q = null;
        field_i = null;
    }

    final int a(byte param0) throws IOException {
        if (!(!((ke) this).field_c)) {
            return 0;
        }
        if (param0 <= 120) {
            ((ke) this).field_a = -122;
        }
        return ((ke) this).field_f.read();
    }

    final void a(boolean param0) throws IOException {
        if (!(!((ke) this).field_c)) {
            return;
        }
        if (param0) {
            ((ke) this).finalize();
        }
        if (!(!((ke) this).field_d)) {
            ((ke) this).field_d = false;
            throw new IOException();
        }
    }

    protected final void finalize() {
        ((ke) this).b(104);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        wh.a(false);
        if (param0 != -6187) {
            ke.b((byte) 13);
        }
        gf.i(param4, param3, param1, param2);
    }

    final int a(int param0) throws IOException {
        if (!(!((ke) this).field_c)) {
            return 0;
        }
        if (param0 != -1) {
            field_h = null;
        }
        return ((ke) this).field_f.available();
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
            var6 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((ke) this).field_b == ((ke) this).field_a) {
                          if (((ke) this).field_c) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
                            {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            }
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (((ke) this).field_a > ((ke) this).field_b) {
                          var1_int = -((ke) this).field_a + ((ke) this).field_g;
                          break L6;
                        } else {
                          var1_int = ((ke) this).field_b - ((ke) this).field_a;
                          break L6;
                        }
                      }
                      var2 = ((ke) this).field_a;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (((ke) this).field_f != null) {
                            ((ke) this).field_f.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != ((ke) this).field_n) {
                            ((ke) this).field_n.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((ke) this).field_o) {
                            ((ke) this).field_o.close();
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
                    ((ke) this).field_e = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((ke) this).field_n.write(((ke) this).field_e, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((ke) this).field_d = true;
                          break L13;
                        }
                      }
                      ((ke) this).field_a = (var1_int + ((ke) this).field_a) % ((ke) this).field_g;
                      try {
                        L14: {
                          L15: {
                            if (((ke) this).field_b == ((ke) this).field_a) {
                              ((ke) this).field_n.flush();
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((ke) this).field_d = true;
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
                var7 = null;
                jq.a(-29901, (Throwable) (Object) var1_ref, (String) null);
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
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 26 / ((param3 - 64) / 40);
            if (!((ke) this).field_c) {
              L1: while (true) {
                if (0 >= param1) {
                  break L0;
                } else {
                  var6 = ((ke) this).field_f.read(param0, param2, param1);
                  if (var6 <= 0) {
                    throw new EOFException();
                  } else {
                    param2 = param2 + var6;
                    param1 = param1 - var6;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("ke.I(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    ke(java.net.Socket param0, qb param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void a(int param0, si param1) {
        try {
            param1.field_s = new char[]{'?'};
            param1.field_x = new int[]{-1};
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ke.C(" + -69 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private ke(java.net.Socket param0, qb param1, int param2) throws IOException {
        ((ke) this).field_a = 0;
        ((ke) this).field_b = 0;
        ((ke) this).field_d = false;
        ((ke) this).field_c = false;
        try {
            ((ke) this).field_m = param1;
            ((ke) this).field_o = param0;
            ((ke) this).field_o.setSoTimeout(30000);
            ((ke) this).field_o.setTcpNoDelay(true);
            ((ke) this).field_f = ((ke) this).field_o.getInputStream();
            ((ke) this).field_n = ((ke) this).field_o.getOutputStream();
            ((ke) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ke.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
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
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_l = new long[8][256];
        field_q = new int[5];
        field_k = new long[11];
        var0 = 0;
        L0: while (true) {
          if (256 <= var0) {
            field_k[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (var0 > 10) {
                return;
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
                stackOut_4_0 = (long)(var1 >>> 8);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1;
              if (var4 >= 256L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1;
              if (256L > var6) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << 1;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_l[0][var0] = ff.a(var12, ff.a(ff.a(var8 << 16, ff.a(var10 << 24, ff.a(var2 << 32, ff.a(ff.a(var2 << 56, var2 << 48), var6 << 40)))), var4 << 8));
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_l[var14][var0] = ff.a(field_l[-1 + var14][var0] >>> 8, field_l[-1 + var14][var0] << 56);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
