/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp {
    static int field_g;
    static gd field_h;
    static int field_i;
    private int field_j;
    static String field_n;
    private int field_l;
    private int field_k;
    private int field_p;
    private ui[] field_c;
    private int[][] field_f;
    static int field_o;
    static long[][] field_e;
    static long[] field_m;
    private ei field_d;
    boolean field_b;
    static kh field_a;

    final int[] a(int param0, int param1) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ui var3;
        ui var4;
        int var5;
        L0: {
          var5 = Torquing.field_u;
          if (param1 == 25657) {
            break L0;
          } else {
            this.a(110);
            break L0;
          }
        }
        if (this.field_k != this.field_p) {
          if ((this.field_k ^ -1) != -2) {
            L1: {
              var3 = this.field_c[param0];
              if (var3 != null) {
                this.field_b = false;
                break L1;
              } else {
                L2: {
                  this.field_b = true;
                  if (this.field_j < this.field_k) {
                    var3 = new ui(param0, this.field_j);
                    this.field_j = this.field_j + 1;
                    break L2;
                  } else {
                    var4 = (ui) ((Object) this.field_d.c(-6938));
                    var3 = new ui(param0, var4.field_j);
                    this.field_c[var4.field_m] = null;
                    var4.f(0);
                    break L2;
                  }
                }
                this.field_c[param0] = var3;
                break L1;
              }
            }
            this.field_d.b((byte) 68, var3);
            return this.field_f[var3.field_j];
          } else {
            L3: {
              stackIn_10_0 = this;

              if (this.field_l == param0) {
                stackIn_11_0 = this;
                stackIn_11_1 = 0;
                break L3;
              } else {
                stackIn_11_0 = this;
                stackIn_11_1 = 1;
                break L3;
              }
            }
            ((tp) (this)).field_b = stackIn_11_1 != 0;
            this.field_l = param0;
            return this.field_f[0];
          }
        } else {
          L4: {
            stackIn_5_0 = this;

            if (null != this.field_c[param0]) {
              stackIn_6_0 = this;
              stackIn_6_1 = 0;
              break L4;
            } else {
              stackIn_6_0 = this;
              stackIn_6_1 = 1;
              break L4;
            }
          }
          ((tp) (this)).field_b = stackIn_6_1 != 0;
          this.field_c[param0] = tl.field_l;
          return this.field_f[param0];
        }
    }

    final void c(int param0) {
        int var3 = Torquing.field_u;
        int var2 = 0;
        if (param0 < 97) {
            field_a = (kh) null;
        }
        while (this.field_k > var2) {
            this.field_f[var2] = null;
            var2++;
        }
        this.field_c = null;
        this.field_f = (int[][]) null;
        this.field_d.a(0);
        this.field_d = null;
    }

    public static void b(int param0) {
        field_n = null;
        field_h = null;
        field_e = (long[][]) null;
        field_a = null;
        field_m = null;
        int var1 = -66 / ((85 - param0) / 34);
    }

    final static bc a(byte param0, boolean param1, String param2, String param3, long param4) {
        RuntimeException var6 = null;
        rk stackIn_5_0 = null;
        wj stackIn_9_0 = null;
        e stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -51) {
                break L1;
              } else {
                tp.a((byte) -7, true, (String) null, (String) null, 44L);
                break L1;
              }
            }
            L2: {
              if (param4 != 0L) {
                break L2;
              } else {
                if (param3 == null) {
                  break L2;
                } else {
                  stackIn_5_0 = new rk(param3, param2);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param1) {
              stackIn_9_0 = new wj(param4, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_11_0 = new e(param4, param2);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("tp.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bc) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bc) ((Object) stackIn_9_0);
          } else {
            return (bc) ((Object) stackIn_11_0);
          }
        }
    }

    final int[][] a(int param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        if (!(this.field_k == this.field_p)) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = param0; this.field_k > var2; var2++) {
            this.field_c[var2] = tl.field_l;
        }
        return this.field_f;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            int var3 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = -58 % ((param1 - 38) / 51);
                    var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                    param0.getAppletContext().showDocument(og.a(var2, param0, (byte) -122), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref2);

                stackIn_6_1 = new StringBuilder().append("tp.B(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L3;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L3;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    tp(int param0, int param1, int param2) {
        this.field_l = -1;
        this.field_j = 0;
        this.field_d = new ei();
        this.field_b = false;
        this.field_p = param1;
        this.field_k = param0;
        this.field_f = new int[this.field_k][param2];
        this.field_c = new ui[this.field_p];
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
            field_n = "Instructions";
            field_h = new gd();
            field_e = new long[8][256];
            field_m = new long[11];
            field_o = 0;
            var0 = 0;
            L0: while (true) {
              if (var0 >= 256) {
                field_m[0] = 0L;
                var15 = 1;
                var0 = var15;
                L1: while (true) {
                  if (var15 > 10) {
                    break $cfr$clinit;
                  } else {
                    var1 = var15 * 8 - 8;
                    field_m[var15] = vb.a(on.a(field_e[7][7 + var1], 255L), vb.a(on.a(65280L, field_e[6][var1 - -6]), vb.a(on.a(field_e[5][5 + var1], 16711680L), vb.a(on.a(4278190080L, field_e[4][4 + var1]), vb.a(on.a(field_e[3][3 + var1], 1095216660480L), vb.a(vb.a(on.a(field_e[0][var1], -72057594037927936L), on.a(71776119061217280L, field_e[1][1 + var1])), on.a(280375465082880L, field_e[2][var1 - -2])))))));
                    var15++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if (0 != (var0 & 1)) {
                    stackIn_5_0 = (long)(255 & var1);
                    break L2;
                  } else {
                    stackIn_5_0 = (long)(var1 >>> -957025304);
                    break L2;
                  }
                }
                L3: {
                  var2 = stackIn_5_0;
                  var4 = var2 << -257021759;
                  if (var4 >= 256L) {
                    var4 = var4 ^ 285L;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var6 = var4 << 779547585;
                  if ((var6 ^ -1L) <= -257L) {
                    var6 = var6 ^ 285L;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var8 = var2 ^ var6;
                  var10 = var6 << 300405057;
                  if (256L > var10) {
                    break L5;
                  } else {
                    var10 = var10 ^ 285L;
                    break L5;
                  }
                }
                var12 = var2 ^ var10;
                field_e[0][var0] = ee.a(ee.a(ee.a(var8 << -139099376, ee.a(ee.a(var2 << 1753608736, ee.a(var6 << -1300743960, ee.a(var2 << -1046255432, var2 << 19431024))), var10 << -674966056)), var4 << -1265114680), var12);
                var14 = 1;
                L6: while (true) {
                  if (-9 >= (var14 ^ -1)) {
                    var0++;
                    continue L0;
                  } else {
                    field_e[var14][var0] = ee.a(field_e[var14 + -1][var0] << -1873807048, field_e[var14 - 1][var0] >>> -1304310456);
                    var14++;
                    continue L6;
                  }
                }
              }
            }
        }
    }
}
