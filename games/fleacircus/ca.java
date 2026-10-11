/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends gj implements dc, da, pe {
    private bc field_K;
    private bb field_R;
    static mf field_L;
    static dd field_P;
    private bc field_F;
    static String field_O;
    private bb field_I;
    ij field_N;
    static int field_Q;
    private bc field_S;
    static int[] field_G;
    private vk field_T;
    private ja field_J;
    private bc field_H;
    private bc field_U;
    private bc field_M;

    private final int a(int param0, qa param1, String param2, int param3, int param4) {
        ml var6 = null;
        RuntimeException var6_ref = null;
        je var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new ml(20, param4, 120 + param3, 25, param1, false, 120, 3, ug.field_e, 16777215, param2);
          this.a((qa) (var6), (byte) -85);
          var7 = new je(((nh) ((Object) param1)).a((byte) 21));
          this.a((qa) (var7), (byte) -29);
          var7.a(3 + var6.field_u + var6.field_y, 15, var6.field_z + (var6.field_j + param0 >> 1), 15, 80);
          stackIn_1_0 = var6.field_j;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_5_0 = var6_ref;
          stackIn_5_1 = new StringBuilder().append("ca.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, int param1, String param2, int param3, qa param4) {
        ml var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new ml(20, param3, param1 + 120, 25, param4, false, 120, 3, ug.field_e, 16777215, param2);
          this.a((qa) (var6), (byte) -66);
          if (param0 > -27) {
            this.field_R = (bb) null;
          }
          stackIn_4_0 = var6.field_j;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_8_0 = var6_ref;
          stackIn_8_1 = new StringBuilder().append("ca.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_O = null;
          if (param0 != 100) {
            field_Q = -51;
          }
          field_L = null;
          field_G = null;
          field_P = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "ca.NA(" + param0 + ')');
        }
    }

    private final boolean a(nh param0, int param1) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        wd var4 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.a((byte) 92);
          if (var3 == null) {
            return true;
          }
          if (param1 != 22898) {
            field_G = (int[]) null;
          }
          var4 = var3.a(false);
          if (ml.field_K == var4) {
            return false;
          }
          if (var4 == ea.field_b) {
            return false;
          }
          if (var4 != uk.field_b) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_24_0 = var3_ref;
          stackIn_24_1 = new StringBuilder().append("ca.QA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(String param0, String param1, int param2, int param3, int param4, qa param5) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -19983) {
            this.a(-55, -75, (qa) null, (byte) -86);
          }
          stackIn_4_0 = this.a(param5, 35, param3, param0, param1, (byte) -86, param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ca.OA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final String k(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11579568) {
            this.a(75, 25, (qa) null, '￱');
          }
          stackIn_4_0 = "<u=2164A2><col=2164A2>";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "ca.AA(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.b(param2, -28533);
            return stackIn_7_0;
          }
          if (99 == param1) {
            stackIn_12_0 = this.a(32, param2);
            return stackIn_12_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ca.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean l(int param0) {
        NumberFormatException numberFormatException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        boolean stackIn_10_0 = false;
        Throwable decompiledCaughtException = null;
        try {
          if (!this.e((byte) 65)) {
            return false;
          }
          var2_int = -1;
          try {
            var3_int = 78 / ((40 - param0) / 42);
            var2_int = Integer.parseInt(this.field_S.field_i);
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
          }
          stackIn_10_0 = gh.a(this.field_K.field_i, var2_int, this.field_F.field_i, this.field_T.field_G, this, -122, this.field_U.field_i);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "ca.IA(" + param0 + ')');
        }
    }

    private final int a(qa param0, int param1, int param2, String param3, String param4, byte param5, int param6) {
        ml var8 = null;
        RuntimeException var8_ref = null;
        v var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new ml(20, param2, param6 + 120, 25, param0, false, 120, 3, ug.field_e, 16777215, param3);
          this.a((qa) (var8), (byte) -42);
          if (param5 != -86) {
            stackIn_2_0 = 108;
            return stackIn_2_0;
          }
          var9 = new v(((nh) ((Object) param0)).a((byte) -2), param4, 126, var8.field_j + param2, 50 + param6, param1);
          var9.field_s = (kd) (this);
          this.a((qa) (var9), (byte) -77);
          stackIn_4_0 = var8.field_j + var9.field_j;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_8_0 = var8_ref;
          stackIn_8_1 = new StringBuilder().append("ca.PA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean e(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((nh) (this.field_K), 22898) &&
            this.a((nh) (this.field_U), 22898) &&
            this.a((nh) (this.field_H), 22898) &&
            this.a((nh) (this.field_F), 22898) &&
            this.a((nh) (this.field_M), 22898) &&
            this.a((nh) (this.field_S), 22898)) {
            if (param0 >= 18) {
              return true;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "ca.FA(" + param0 + ')');
        }
    }

    public final void a(int param0, ja param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          if (param0 == 0) {
            lk.a(-15493, "terms.ws");
          }
          if (param0 != 0 ||
            var6 != 0) {
            if (param0 != 1) {
              if (param0 == 2) {
                lk.a(-15493, "conduct.ws");
                if (var6 != 0) {
                  lk.a(-15493, "privacy.ws");
                }
              }
            } else {
              lk.a(-15493, "privacy.ws");
            }
          }
          var5_int = 8 % ((param3 + 36) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("ca.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          param0.removeKeyListener(rh.field_f);
          if (param1 != 83) {
            ca.j(-73);
          }
          param0.removeFocusListener(rh.field_f);
          em.field_f = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ca.LA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, si param2, boolean param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_37_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = fleas.field_A ? 1 : 0;
        try {
          var5_int = dk.a(3 * (param1 - param0), (byte) -57);
          var6 = 3 * param0;
          if (param3) {
            return;
          }
          sk.b((byte) -80);
          var7 = -10 + var5_int;
          if (param2.field_h > 0 &&
            param2.field_J != null) {
            ik.d(109);
          }
          vc.field_d = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_j)))) {
            var9 = param2.field_Q[var8];
            var10 = param2.field_M[var8];
            var11 = param2.field_N[var8];
            stackOut_11_0 = param4;
            stackIn_47_0 = stackOut_11_0 ? 1 : 0;
            stackIn_12_0 = stackOut_11_0;
            if (var19 == 0) {
              if (stackIn_12_0) {
                var12 = kb.field_o[var9];
                var13 = il.field_c[var9];
                var14 = -var12 + kb.field_o[var10];
                var15 = -var12 + kb.field_o[var11];
                var16 = il.field_c[var10] - var13;
                var17 = -var13 + il.field_c[var11];
              }
              if (!stackIn_12_0 ||
                var14 * var17 - var15 * var16 < 0) {
                var12Lifetime1 = h.field_c[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = h.field_c[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = h.field_c[var11];
                    if (-2147483648 != var14) {
                      var15 = var14 + var13Lifetime1 + (var12Lifetime1 - var6);
                      if (var7 < 0) {
                        stackIn_26_0 = var15 << -var7;
                      } else {
                        stackIn_26_0 = var15 >> var7;
                      }
                      var16 = -stackIn_26_0 + ed.field_c.length - 1;
                      var17 = ed.field_c[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_37_0 = var16;
                          if (stackIn_37_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = ed.field_c[var16];
                          continue;
                        }
                        stackIn_37_0Lifetime1 = var17 + (var16 << 4);
                        var18 = stackIn_37_0Lifetime1;
                        pk.field_J[var18] = var8;
                        ed.field_c[var16] = 1 + var17;
                        if (param2.field_h > 0 &&
                          null != param2.field_J) {
                          dupTemp$0 = param2.field_J[var8];
                          ge.field_e[dupTemp$0] = ge.field_e[dupTemp$0] + 1;
                        }
                        vc.field_d = vc.field_d + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_47_0 = -1;
          }
          if (stackIn_47_0 > ~param2.field_h &&
            null != param2.field_J) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= ge.field_e.length)) {
              var10Lifetime1 = ge.field_e[var9Lifetime1];
              ge.field_e[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_63_0 = var5;
          stackIn_63_1 = new StringBuilder().append("ca.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public ca() {
        super(0, 0, 496, 0, (ch) null);
        int var1_int = 0;
        aa dupTemp$0 = null;
        mh dupTemp$1 = null;
        String var2 = null;
        int var3 = 0;
        ml var4 = null;
        e var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          this.field_K = new bc("", (kd) null, 12);
          this.field_U = new bc("", (kd) null, 100);
          this.field_H = new bc("", (kd) null, 100);
          this.field_F = new bc("", (kd) null, 20);
          this.field_M = new bc("", (kd) null, 20);
          this.field_S = new bc("", (kd) null, 3);
          var1_int = 1;
          this.field_T = new vk("", (kd) null, var1_int != 0);
          this.field_I = new bb(tk.field_y, (kd) null);
          this.field_R = new bb(qj.field_J, (kd) null);
          this.field_K.field_m = df.field_c;
          this.field_U.field_m = bj.field_i;
          this.field_H.field_m = cg.field_v;
          this.field_F.field_m = nc.field_c;
          this.field_M.field_m = a.field_h;
          this.field_S.field_m = va.field_k;
          this.field_T.field_m = gf.field_f;
          this.field_K.a(true, new vf(this.field_K));
          this.field_U.a(true, new ai(this.field_U));
          this.field_H.a(true, new ck(this.field_H, this.field_U));
          this.field_F.a(true, new gh(this.field_F, this.field_K, this.field_U));
          this.field_M.a(true, new tl(this.field_M, this.field_F));
          this.field_S.a(true, new ga(this.field_S));
          this.field_I.field_D = false;
          this.field_I.field_p = (ch) ((Object) new ri());
          this.field_R.field_p = (ch) ((Object) new me());
          this.field_K.field_p = (ch) ((Object) new aa(10000536));
          dupTemp$0 = new aa(10000536);
          this.field_H.field_p = (ch) ((Object) dupTemp$0);
          this.field_U.field_p = (ch) ((Object) dupTemp$0);
          this.field_S.field_p = (ch) ((Object) new aa(10000536));
          this.field_T.field_p = (ch) ((Object) new jc());
          dupTemp$1 = new mh(10000536);
          this.field_M.field_p = (ch) ((Object) dupTemp$1);
          this.field_F.field_p = (ch) ((Object) dupTemp$1);
          var2 = db.a(ei.field_v, new String[]{this.k(11579568), this.f((byte) 49)}, true);
          var3 = 20;
          var3 = var3 + this.a(-61, 170, ff.field_a, var3, this.field_U);
          var3 = var3 + (this.a(this.field_H, 20, var3, b.field_c, "", (byte) -86, 170) + 5);
          var3 = var3 + this.a(-93, 170, kc.field_g, var3, this.field_F);
          var3 = var3 + (this.a(gd.field_c, hd.field_f, 170, var3, -19983, this.field_M) + 5);
          var3 = var3 + (5 + this.a(me.field_a, bb.field_J, 170, var3, -19983, this.field_K));
          var3 = var3 + this.a(-15, this.field_S, me.field_f, 170, var3);
          var4 = new ml(46, var3, this.field_u - 90, 25, this.field_T, true, -120 + this.field_u, 5, nb.field_c, 11579568, lf.field_a);
          this.a((qa) (var4), (byte) -101);
          var3 = var3 + var4.field_j;
          var5 = new e(ug.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, ug.field_e.field_H, -1, 2147483647, true);
          this.field_J = new ja(var2, var5);
          this.field_J.field_m = "";
          this.field_J.a(0, pi.field_f, 0);
          this.field_J.a(0, pi.field_f, 1);
          this.field_J.field_s = (kd) (this);
          this.field_J.b(this.field_u - 90, 46, var3, -9);
          var3 = var3 + (15 + this.field_J.field_j);
          this.a((qa) (this.field_J), (byte) -83);
          var6 = 4;
          var7 = 200;
          this.field_I.a(-var7 + 496 >> 1, var7, var3, 40, 80);
          this.field_R.a(var6 + 3, 60, var3 + 15, 40, 80);
          this.field_R.field_s = (kd) (this);
          this.field_I.field_s = (kd) (this);
          this.a((qa) (this.field_I), (byte) -51);
          this.a((qa) (this.field_R), (byte) -106);
          this.field_N = new ij((pe) (this));
          this.field_N.a(60 + this.field_K.field_u + this.field_K.field_y, -60 + (-this.field_K.field_y + this.field_u - this.field_K.field_u), 20 + this.field_K.field_z, 150, 80);
          this.a((qa) (this.field_N), (byte) -77);
          this.a(0, 496, 0, var6 + (var3 + 55), 80);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ca.<init>()");
        }
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, (byte) -107);
          if (param3 >= -85) {
            this.field_R = (bb) null;
          }
          this.field_I.field_D = this.e((byte) 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ca.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(String param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        bc var3 = null;
        String var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_K;
          if (param1 != -96) {
            discarded$1 = this.a(4, (qa) null, (String) null, 11, 117);
          }
          var4 = param0;
          ((c) ((Object) var3)).a(false, (byte) -91, var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ca.CA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String f(byte param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 49) {
            this.a(46, -16, 42, -88, (bb) null);
          }
          stackIn_4_0 = "</col></u>";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "ca.BA(" + param0 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        boolean discarded$0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_R == param4) {
            ej.a(param3 - 232);
            if ((fleas.field_A) &&
              (param4 == this.field_I)) {
              discarded$0 = this.l(127);
            }
          } else {
            if (param4 == this.field_I) {
              discarded$0 = this.l(127);
            }
          }
          if (param3 != 248) {
            ca.a((java.awt.Component) null, (byte) 78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ca.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void a(int param0) {
        try {
          ((vf) (this.field_K.a((byte) -109))).d(true);
          if (param0 >= -66) {
            field_L = (mf) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ca.HA(" + param0 + ')');
        }
    }

    static {
        field_Q = 480;
        field_G = new int[5];
        field_O = "<%0>Bomb:<%1> Explodes when a flea touches it, removing all adjacent tiles. Does <u>not</u> harm fleas.";
    }
}
