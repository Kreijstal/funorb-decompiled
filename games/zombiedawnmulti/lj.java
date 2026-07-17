/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends br {
    static int field_n;
    private int field_w;
    static String[] field_t;
    static String field_q;
    static String field_m;
    private uj field_g;
    private uj field_i;
    static cj field_v;
    static String field_k;
    private int field_j;
    static String field_p;
    private um[] field_u;
    static String[] field_h;
    private int field_r;
    static String field_f;
    private boolean field_o;
    private int field_l;
    static String field_s;

    final void a(int param0) {
        int var3 = 0;
        um var4 = null;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -20587) {
            field_p = null;
        }
        um[] var6 = ((lj) this).field_u;
        um[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.a(((lj) this).field_w, ((lj) this).field_l, (byte) -125);
        }
        if (((lj) this).field_i != null) {
            if (!(!((lj) this).field_i.k())) {
                ((lj) this).field_i = null;
            }
        }
        ((lj) this).field_r = ((lj) this).field_r + 6;
        if (!(((lj) this).field_j >= ((lj) this).field_r)) {
            if (((lj) this).field_o) {
                fb.field_e.field_u.field_i.a((byte) 127);
                fb.field_e.field_u.a(48);
            }
            ((lj) this).a(true);
        }
    }

    final void a(byte param0, nm param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = param1.c(((lj) this).field_l, -20126);
                var4 = param1.d(((lj) this).field_w, 122);
                if (((lj) this).field_g != null) {
                  break L2;
                } else {
                  if (((lj) this).field_i != null) {
                    break L2;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = sd.b(126, var4, var3_int);
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var5 = stackIn_5_0;
              if (((lj) this).field_g != null) {
                if (((lj) this).field_g.k()) {
                  ((lj) this).field_g = null;
                  break L3;
                } else {
                  ((lj) this).field_g.h(var5);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (((lj) this).field_i == null) {
                break L4;
              } else {
                if (((lj) this).field_i.k()) {
                  ((lj) this).field_i = null;
                  break L4;
                } else {
                  ((lj) this).field_i.h(var5);
                  break L4;
                }
              }
            }
            L5: {
              var6 = (int)(15.0f * (float)((lj) this).field_r / (float)((lj) this).field_j);
              var7 = (int)((float)((lj) this).field_r * 128.0f / (float)((lj) this).field_j);
              var9 = 18 / ((-61 - param0) / 36);
              if (var7 > 96) {
                stackOut_16_0 = 288 + (-(3 * var7) + 96);
                stackIn_17_0 = stackOut_16_0;
                break L5;
              } else {
                stackOut_15_0 = var7;
                stackIn_17_0 = stackOut_15_0;
                break L5;
              }
            }
            L6: {
              var8 = stackIn_17_0;
              var10 = 128 + -var7 >> 1;
              if (var10 > 32) {
                var10 = 32;
                break L6;
              } else {
                break L6;
              }
            }
            var11 = 0;
            L7: while (true) {
              if (((lj) this).field_u.length / 2 <= var11) {
                var13 = ((lj) this).field_u.length / 2;
                var11 = var13;
                L8: while (true) {
                  if (((lj) this).field_u.length <= var13) {
                    break L0;
                  } else {
                    ((lj) this).field_u[var13].a(var4, (byte) 33, td.field_c[var6], var10, var8, var3_int);
                    var13++;
                    continue L8;
                  }
                }
              } else {
                ((lj) this).field_u[var11].a(var4, (byte) 33, td.field_c[var6], var10 / 2, var8 / 2, var3_int);
                var11++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("lj.D(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    public static void a() {
        field_k = null;
        field_m = null;
        int var1 = 50;
        field_p = null;
        field_h = null;
        field_f = null;
        field_q = null;
        field_t = null;
        field_s = null;
        field_v = null;
    }

    final static void a(fm param0, int param1, fm param2) {
        try {
            m.field_C = param0;
            int var4_int = -43;
            ib.field_b = 480;
            uq.field_f = param2;
            uo.a(oo.field_l / 2, oo.field_b / 2, 1633);
            ek.a(param0.field_J, param2.field_r + param2.field_J, 1829947600, param2.field_J, param0.field_r + param0.field_J);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "lj.A(" + (param0 != null ? "{...}" : "null") + 44 + 480 + 44 + (param2 != null ? "{...}" : "null") + 44 + 61 + 41);
        }
    }

    lj(int param0, int param1, boolean param2) {
        int var4 = 0;
        ((lj) this).field_g = null;
        ((lj) this).field_o = false;
        ((lj) this).field_i = null;
        if (!fb.field_e.field_u.a(-113, param1, param0)) {
            param1 = param1 - (param1 % 24 - 4);
        }
        ((lj) this).field_w = param1;
        ((lj) this).field_u = new um[150];
        ((lj) this).field_r = 0;
        ((lj) this).field_l = param0;
        for (var4 = 0; ((lj) this).field_u.length / 2 > var4; var4++) {
            ((lj) this).field_u[var4] = new um(jm.field_n[var4] * 6.0f, jm.field_k[var4] * 6.0f);
        }
        for (var4 = ((lj) this).field_u.length / 2; ((lj) this).field_u.length > var4; var4++) {
            ((lj) this).field_u[var4] = new um(jm.field_n[var4 % jm.field_n.length] * 6.0f / 2.0f, jm.field_k[var4 % jm.field_k.length] * 6.0f / 2.0f);
        }
        th discarded$2 = new th();
        ((lj) this).field_j = param2 ? 90 : 180;
        ((lj) this).field_g = nm.b(-127, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Breaking real-world laws";
        field_q = "Make your zombies hunger for human flesh. They will lunge faster and from further away.";
        field_h = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_t = new String[16];
        field_m = "Tutorial";
        field_f = "Username: ";
        field_k = "Invite more players, or alternatively try changing the following settings:  ";
        field_s = "You must be a member to play with the current options.";
    }
}
