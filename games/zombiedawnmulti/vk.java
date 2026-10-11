/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends rg {
    static String field_K;
    static int[] field_J;
    private th field_H;
    static String field_F;
    static String field_G;
    static boolean field_E;
    static pd field_I;
    static String[] field_L;

    final void b(int param0, cf param1) {
        df var3 = null;
        if (!(param1 instanceof df)) {
          throw new IllegalArgumentException();
        }
        if (param0 != 3016) {
          return;
        }
        try {
          var3 = (df) (param1);
          this.field_H.a(-25612, var3);
          var3.field_R = true;
          var3.a((cf) (this), 0);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "vk.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean l(byte param0) {
        CharSequence var2;
        boolean stackIn_9_0 = false;
        if (param0 > -121) {
          var2 = (CharSequence) null;
          vk.a(-28, (CharSequence) null);
        }
        boolean decompiledFrameRemainder0 = true;
        if (fn.field_i >= 20 &&
          ge.p(-86) && (!(qq.field_a > 0) ||
          re.b(-118))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final void h(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(this.field_H);
        df var3 = (df) (var2.c(-3));
        if (param0 > -84) {
          vk.l((byte) 127);
        }
        while (var3 != null) {
          if (var3.i(-27388)) {
            var3.a(true);
          }
          var3 = (df) (var2.a((byte) -113));
        }
        this.field_B = (cf) ((Object) this.j((byte) -119));
    }

    public static void k(byte param0) {
        field_K = null;
        field_I = null;
        int var1 = 90 / ((30 - param0) / 47);
        field_F = null;
        field_J = null;
        field_G = null;
        field_L = null;
    }

    final static void a(ka param0, byte param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != 83) {
            field_J = (int[]) null;
          }
          for (var2_int = 0; var2_int < 3; var2_int++) {
            ub.field_ub[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; uf.field_g > var2_intLifetime1; var2_intLifetime1++) {
            if (param0.field_l == uk.field_M[var2_intLifetime1].field_l) {
              dupTemp$3 = uk.field_M[var2_intLifetime1].a(true);
              ub.field_ub[dupTemp$3] = ub.field_ub[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a(true);
          ub.field_ub[dupTemp$0] = ub.field_ub[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < uf.field_g; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (uk.field_M[var3].field_l == param0.field_l) {
              var4 = uk.field_M[var3].a(true);
              if (ub.field_ub[var4] > sj.field_m) {
                ub.field_ub[var4] = ub.field_ub[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              uk.field_M[incrementValue$2] = uk.field_M[var3];
            }
          }
          uf.field_g = var2_intLifetime2;
          fieldTemp$1 = uf.field_g;
          uf.field_g = uf.field_g + 1;
          uk.field_M[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("vk.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 20) {
            var3 = (int[]) null;
            vk.a((int[]) null, true, 94, 30, (byte) 84, (int[]) null, 90, 72, -73);
          }
          stackIn_3_0 = so.a(false, -52, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vk.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean i(byte param0) {
        int[] var2;
        boolean stackIn_6_0 = false;
        if (param0 != -39) {
          var2 = (int[]) null;
          vk.a((int[]) null, false, -127, -95, (byte) -9, (int[]) null, -29, -30, -79);
        }
        stackIn_6_0 = (a.a(-107)) && ((8 & wf.field_m) == 0);
        return stackIn_6_0;
    }

    final void h(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(this.field_H);
        df var3 = (df) (var2.c(-3));
        while (var3 != null) {
          var3.field_R = false;
          var3 = (df) (var2.a((byte) -112));
        }
        this.field_B = null;
        if (param0 >= -81) {
          vk.i((byte) 56);
        }
    }

    final df j(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(this.field_H);
        df var3 = (df) (var2.c(-3));
        while (var3 != null) {
          if (var3.field_R) {
            return var3;
          }
          var3 = (df) (var2.a((byte) -48));
        }
        if (param0 < -118) {
          return null;
        }
        return (df) null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_h != null) {
          this.field_h.a(true, param1, -15112, param3, (cf) (this));
        }
        if (param0 != -2) {
          return;
        }
        ch var5 = new ch(this.field_H);
        cf var6 = (cf) (var5.a(32397));
        while (var6 != null) {
          var6.a(-2, param1 + this.field_i, param2, param3 + this.field_y);
          var6 = (cf) (var5.e(-3));
        }
    }

    final cf f(int param0) {
        ch var2;
        df var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(this.field_H);
        if (param0 != -1963) {
          return (cf) null;
        }
        var3 = (df) (var2.c(-3));
        while (var3 != null) {
          if (var3.field_R) {
            return var3.g(122);
          }
          var3 = (df) (var2.a((byte) -38));
        }
        return null;
    }

    final static ja[] a(int param0, int param1, ul param2, int param3) {
        RuntimeException var4 = null;
        ja[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ud.a(param3, param2, param1, (byte) -42)) {
            return null;
          }
          if (param0 < 32) {
            vk.i((byte) -118);
          }
          stackIn_6_0 = eb.a(33);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("vk.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, byte param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9_int = 13 / ((param4 - 48) / 58);
          if (param2 == 1) {
            mj.field_Hb[param2] = (nc) ((Object) new ho(param2, param1, param3, param6, param8, param7, param5));
          } else {
            if (3 != param2) {
              if (param2 == 4) {
                mj.field_Hb[param2] = (nc) ((Object) new ol(param2, param1, param3, param6, param8, param7, param5));
              } else {
                if (5 != param2 &&
                  param2 != 6) {
                  if (10 == param2) {
                    mj.field_Hb[param2] = (nc) ((Object) new si(param2, param1, param3, param6, param8, param7, param5));
                  } else {
                    if (param2 == 12) {
                      mj.field_Hb[param2] = (nc) ((Object) new vo(param2, param1, param3, param6, param8, param7, param5));
                    } else {
                      if (param2 == 14) {
                        mj.field_Hb[param2] = (nc) ((Object) new vj(param2, param1, param3, param6, param8, param7, param5));
                      } else {
                        if (param2 == 15) {
                          mj.field_Hb[param2] = (nc) ((Object) new tk(param2, param1, param3, param6, param8, param7, param5));
                        } else {
                          if (13 == param2) {
                            mj.field_Hb[param2] = (nc) ((Object) new kp(param2, param1, param3, param6, param8, param7, param5));
                          } else {
                            mj.field_Hb[param2] = new nc(param2, param1, param3, param6, param8, param7, param5);
                          }
                        }
                      }
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  mj.field_Hb[param2] = (nc) ((Object) new mq(param2, param1, param3, param6, param8, param7, param5));
                }
              }
            } else {
              mj.field_Hb[param2] = (nc) ((Object) new fk(param2, param1, param3, param6, param8, param7, param5));
            }
          }
          ab.field_h = (si) (mj.field_Hb[10]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_25_0 = var9;
          stackIn_25_1 = new StringBuilder().append("vk.R(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public vk() {
        super(0, 0, ub.field_wb, kc.field_a, (nl) null, (bj) null);
        this.field_H = new th();
    }

    final void g(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(this.field_H);
        if (param0 != 118) {
          field_J = (int[]) null;
        }
        df var3 = (df) (var2.c(-3));
        while (var3 != null) {
          if (var3.h(-6134)) {
            var3.a(true);
          }
          var3 = (df) (var2.a((byte) -30));
        }
    }

    static {
        field_F = "(Including <%0>)";
        field_G = "Achievements can only be earned in Rated games.";
        field_K = "Music: ";
        field_L = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_E = false;
    }
}
