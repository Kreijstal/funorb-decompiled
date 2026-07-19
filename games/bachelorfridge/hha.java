/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hha extends ana {
    static long[] field_z;
    static hw[] field_w;
    static int[] field_A;
    private mna field_x;
    static ee[] field_y;
    static long[][] field_v;

    final static boolean e(int param0) {
        boolean discarded$0 = false;
        if (param0 != 1071140296) {
            discarded$0 = hha.e(-20);
        }
        return dka.field_G == kq.field_j ? true : false;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param3 == 1) {
            break L0;
          } else {
            hha.g(-64);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param6 < param4) {
              break L2;
            } else {
              if (param6 >= param4 + param2) {
                break L2;
              } else {
                if (param1 < param5) {
                  break L2;
                } else {
                  if (param5 - -param0 <= param1) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    private final void d(int param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = this.field_x.field_l.a(74, this.field_q.field_h);
        if (!(!var2.i(-117))) {
            return;
        }
        if (param0 != -10649) {
            return;
        }
        iv var3 = (iv) ((Object) this.field_x.field_o.b((byte) 90));
        oha discarded$6 = al.a(107, this.field_x.field_k);
        while (var3 != null) {
            var4 = var3.field_h.a(-27449, this.field_q);
            var4.b(param0 + 10648, 6);
            var4.a(24831, 95, kna.field_g[29]);
            var3.a(var2, this.field_q.field_h, 12);
            var3 = (iv) ((Object) this.field_x.field_o.c(0));
        }
    }

    private final void f(int param0) {
        boolean discarded$0 = false;
        if (param0 != 1532) {
            discarded$0 = hha.e(4);
        }
    }

    hha(gj param0, mna param1) {
        super(param0, param1);
        try {
            this.field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        int var2 = 84 % ((71 - param0) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
            if (-26 == (this.field_l ^ -1)) {
                jja.a(256, -1, 52);
                this.d(-10649);
            }
            return false;
        }
        this.f(1532);
        return true;
    }

    final static hk a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        hk[] var3 = null;
        int var4 = 0;
        hk var5 = null;
        int var6 = 0;
        hk stackIn_6_0 = null;
        hk stackIn_12_0 = null;
        hk stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hk stackOut_5_0 = null;
        hk stackOut_14_0 = null;
        hk stackOut_11_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2 = fi.a("jagex-last-login-method", 61, param1);
              if (param0 >= 121) {
                break L1;
              } else {
                hha.g(78);
                break L1;
              }
            }
            if (var2 == null) {
              stackOut_5_0 = uka.field_k;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = gh.c((byte) -67);
              var4 = 0;
              L2: while (true) {
                if (var4 >= var3.length) {
                  stackOut_14_0 = uka.field_k;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, 91)) {
                    stackOut_11_0 = (hk) (var5);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2_ref);
            stackOut_16_1 = new StringBuilder().append("hha.F(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    public static void g(int param0) {
        boolean discarded$0 = false;
        field_z = null;
        field_v = (long[][]) null;
        if (param0 != 0) {
            discarded$0 = hha.e(-114);
        }
        field_w = null;
        field_y = null;
        field_A = null;
    }

    static {
        $cfr$clinit: {
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
            field_z = new long[11];
            field_A = new int[8192];
            field_v = new long[8][256];
            var0 = 0;
            L0: while (true) {
              if ((var0 ^ -1) <= -257) {
                field_z[0] = 0L;
                var15 = 1;
                var0 = var15;
                L1: while (true) {
                  if ((var15 ^ -1) < -11) {
                    break $cfr$clinit;
                  } else {
                    var1 = 8 * (var15 - 1);
                    field_z[var15] = gv.a(gv.a(gv.a(gda.a(field_v[5][var1 + 5], 16711680L), gv.a(gda.a(field_v[4][var1 + 4], 4278190080L), gv.a(gda.a(1095216660480L, field_v[3][var1 - -3]), gv.a(gv.a(gda.a(71776119061217280L, field_v[1][1 + var1]), gda.a(-72057594037927936L, field_v[0][var1])), gda.a(280375465082880L, field_v[2][2 + var1]))))), gda.a(65280L, field_v[6][var1 + 6])), gda.a(field_v[7][7 + var1], 255L));
                    var15++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if ((var0 & 1) == 0) {
                    stackOut_4_0 = (long)(var1 >>> -1535809944);
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
                  var4 = var2 << 1769581953;
                  if ((var4 ^ -1L) > -257L) {
                    break L3;
                  } else {
                    var4 = var4 ^ 285L;
                    break L3;
                  }
                }
                L4: {
                  var6 = var4 << 1868563329;
                  if (var6 >= 256L) {
                    var6 = var6 ^ 285L;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var8 = var6 ^ var2;
                  var10 = var6 << 1385492545;
                  if (256L <= var10) {
                    var10 = var10 ^ 285L;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var12 = var10 ^ var2;
                field_v[0][var0] = sr.a(var12, sr.a(sr.a(sr.a(sr.a(sr.a(var6 << -625247448, sr.a(var2 << 341018096, var2 << 1955490232)), var2 << 2036442720), var10 << -282549096), var8 << 418259280), var4 << 1071140296));
                var14 = 1;
                L6: while (true) {
                  if (var14 >= 8) {
                    var0++;
                    continue L0;
                  } else {
                    field_v[var14][var0] = sr.a(field_v[var14 + -1][var0] << -2012904392, field_v[-1 + var14][var0] >>> -345350392);
                    var14++;
                    continue L6;
                  }
                }
              }
            }
        }
    }
}
