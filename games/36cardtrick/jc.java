/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jc extends qf {
    static String[] field_L;
    static sc field_P;
    static ik field_O;
    private int field_T;
    private int field_M;
    private int field_K;
    static String field_S;
    private int field_Q;
    static int field_N;
    static String field_R;
    private int field_V;
    private int field_U;

    jc(j param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_K = 0;
        this.field_Q = 0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param3 <= 0) {
          this.a(param2, param1, -1);
          return;
        }
        this.field_Q = param3;
        this.field_U = param1;
        if (param0 > -25) {
          this.a((byte) 23, -44, -23, 60);
        }
        this.field_V = this.field_q;
        this.field_T = param2;
        this.field_K = 0;
        this.field_M = this.field_h;
    }

    void q(int param0) {
        if (this.field_Q <= 0) {
          return;
        }
        this.a(this.field_T, this.field_U, -1);
        this.field_Q = param0;
        this.d((byte) -120);
    }

    final static void a(int param0, byte param1, boolean param2, ff param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        try {
          kb.field_e[0] = pg.field_a.nextInt();
          kb.field_e[1] = pg.field_a.nextInt();
          kb.field_e[3] = (int)hb.field_b;
          gh.field_h.field_i = 0;
          kb.field_e[2] = (int)(hb.field_b >> 32);
          gh.field_h.a(-246, kb.field_e[0]);
          gh.field_h.a(-246, kb.field_e[1]);
          gh.field_h.a(-246, kb.field_e[2]);
          gh.field_h.a(-246, kb.field_e[3]);
          bj.a(gh.field_h, -25);
          gh.field_h.e(param0, 26040);
          param3.a(-1, gh.field_h);
          na.field_r.field_i = 0;
          if (param2) {
            na.field_r.b(-9469, 18);
          } else {
            na.field_r.b(-9469, 16);
          }
          var5_int = -40 % ((param1 - 14) / 58);
          na.field_r.field_i = na.field_r.field_i + 2;
          var6 = na.field_r.field_i;
          na.field_r.a(-246, nf.field_c);
          na.field_r.a(wk.field_d, (byte) 98);
          var7 = 0;
          if (dg.field_F) {
            var7 = var7 | 1;
          }
          if (bj.field_m) {
            var7 = var7 | 4;
          }
          if (param4) {
            var7 = var7 | 8;
          }
          if (null != ia.field_b) {
            var7 = var7 | 16;
          }
          na.field_r.b(-9469, var7);
          var8 = bi.a((byte) 95, mk.g(-128));
          if (var8 == null) {
            var8 = "";
          }
          na.field_r.a(var8, 19235);
          if (null != ia.field_b) {
            na.field_r.a(744825352, ia.field_b);
          }
          lf.a(wd.field_c, na.field_r, id.field_c, (byte) -75, gh.field_h);
          na.field_r.d(na.field_r.field_i - var6, -27308);
          fe.a((byte) -75, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("jc.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void p(int param0) {
        field_S = null;
        field_P = null;
        field_O = null;
        field_L = null;
        if (param0 != 42) {
          return;
        }
        field_R = null;
    }

    void d(byte param0) {
        if (param0 > -29) {
          this.o(-87);
        }
    }

    boolean o(int param0) {
        if (param0 != 928516712) {
          this.o(22);
        }
        this.q(0);
        return super.o(928516712);
    }

    final static short[] a(w param0, int param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Main.field_T;
        try {
          var4_int = param0.g(param1, -1);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new short[var4_int];
          }
          var5 = param0.g(4, -1);
          var6 = (short)param0.g(16, -1);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)(param0.g(var5, -1) + var6);
            }
          }
          if (param2 != 21) {
            jc.p(-103);
          }
          stackIn_18_0 = (short[]) (param3);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("jc.KA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    void b(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = Main.field_T;
        vj.b(param0 + 6, 35 + param2, -12 + this.field_h, -40 + this.field_q, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (vj.field_h <= var8 &&
            var8 < vj.field_b) {
            var9 = var5 + var7 * (-var5 + var6) / var4;
            var10 = 0;
            var11 = this.field_h;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var10) * (-var10 + 20) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  vj.field_j[param0 + vj.field_l * var8 + var10] = var13;
                }
                var10++;
              }
            }
            if (20 >= var7) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (20 >= var13Lifetime1) {
                var14 = var13Lifetime1 * var13Lifetime1 + (20 - var7) * (20 - var7);
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = 1 + var11;
                  } else {
                    var15 = (-var14 + 462) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    vj.field_j[param0 + (vj.field_l * var8 + var11)] = var15;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            vj.d(var10 + param0, var8, var11 - var10, var9);
          }
          var7++;
          var8++;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param2;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var7Lifetime1 * (var6Lifetime1 - var5Lifetime1) / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          vj.d(param0, var8Lifetime1, 6, var9Lifetime1);
          vj.d(this.field_h + param0 - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        if (param1 != -77) {
          field_O = (ik) null;
        }
        pb.field_k.d(-90 + (param0 + this.field_h), 10 + param2);
        cd.a(se.field_G, this.field_h - 10, (byte) -94, param0 + 5, param2 + 35);
        cd.a(rc.field_k, this.field_h, (byte) -94, param0, -22 + this.field_q + param2);
        var4Lifetime2 = this.field_q - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = param2 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          vj.d(param0, var8Lifetime2, 6, var9Lifetime2);
          vj.d(-6 + (param0 + this.field_h), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (this.field_Q <= 0) {
        } else {
          var2 = this.field_U;
          var3 = this.field_T;
          fieldTemp$0 = this.field_K + 1;
          this.field_K = this.field_K + 1;
          if (this.field_Q > fieldTemp$0) {
            var4 = this.field_K * (-this.field_K + this.field_Q * 2);
            var5 = this.field_Q * this.field_Q;
            var2 = var4 * (-this.field_M + this.field_U) / var5 + this.field_M;
            var3 = this.field_V + (this.field_T - this.field_V) * var4 / var5;
          } else {
            this.field_Q = 0;
            this.d((byte) -117);
          }
          this.a(var3, var2, -1);
        }
        if (!param0) {
          this.d((byte) -65);
        }
        return super.a(true);
    }

    static {
        field_S = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_L = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_N = 0;
        field_R = "Creating your account";
    }
}
