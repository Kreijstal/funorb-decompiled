/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl implements fp {
    private int field_b;
    private int field_i;
    static String field_c;
    private lr field_e;
    private int field_j;
    private int field_g;
    private int field_h;
    private int field_o;
    static ie field_a;
    private int field_f;
    private int field_l;
    private int field_k;
    private int field_d;
    private int field_m;
    static int field_n;

    final static eo a(String param0, int param1) {
        Object var2 = null;
        eo var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        if (null != gd.field_c) {
          L0: {
            var5 = (CharSequence) (Object) param0;
            var2 = (Object) (Object) hq.a(param1 ^ 123, var5);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (Object) (Object) var5;
              break L0;
            }
          }
          var3 = (eo) (Object) gd.field_c.a((long)((String) var2).hashCode(), false);
          L1: while (true) {
            if (var3 == null) {
              if (param1 == 1) {
                return null;
              } else {
                int discarded$2 = hl.a(-34);
                return null;
              }
            } else {
              L2: {
                var6 = (CharSequence) (Object) var3.field_Zb;
                var4 = hq.a(param1 ^ 104, var6);
                if (var4 != null) {
                  break L2;
                } else {
                  var4 = var3.field_Zb;
                  break L2;
                }
              }
              if (!var4.equals(var2)) {
                var3 = (eo) (Object) gd.field_c.a(param1 ^ -98);
                continue L1;
              } else {
                return var3;
              }
            }
          }
        } else {
          return null;
        }
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ri var12 = null;
        ei stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        ei stackOut_1_0 = null;
        L0: {
          if (!(param4 instanceof ri)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ei) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ei) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (ri) (Object) stackIn_3_0;
          if (var12 != null) {
            param0 = param0 & var12.field_I;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          qh.f(param4.field_C + param1, param4.field_D + param3, param4.field_l, param4.field_y, ((hl) this).field_f);
          if (param0) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var10 = 8 / ((param2 - 2) / 41);
          var8 = param1 - (-param4.field_C + -((hl) this).field_o);
          var9 = ((hl) this).field_k + (param3 - -param4.field_D);
          qh.c(var8, var9, ((hl) this).field_g, ((hl) this).field_j, 5592405);
          qh.f(var8, var9, ((hl) this).field_g, ((hl) this).field_j, var7);
          if (var12.field_G) {
            qh.d(var8, var9, var8 + ((hl) this).field_g, ((hl) this).field_j + var9, 1);
            qh.d(((hl) this).field_g + var8, var9, var8, var9 - -((hl) this).field_j, 1);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (null == ((hl) this).field_e) {
            break L4;
          } else {
            var11 = ((hl) this).field_g + ((hl) this).field_o - -((hl) this).field_m;
            int discarded$1 = ((hl) this).field_e.a(param4.field_m, var11 + (param1 - -param4.field_C), ((hl) this).field_d + (param3 - -param4.field_D), -var11 + (-((hl) this).field_m + param4.field_l), -(((hl) this).field_m << -674461023) + param4.field_y, ((hl) this).field_l, ((hl) this).field_i, ((hl) this).field_b, ((hl) this).field_h, 0);
            break L4;
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            field_n = -28;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int a(int param0) {
        if (param0 != 23467) {
            return 80;
        }
        return rl.field_a;
    }

    final static void a(dd param0, int param1) {
        int var2 = 17 % ((param1 - 33) / 56);
        mm.field_c = param0;
    }

    hl(lr param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((hl) this).field_b = 1;
        ((hl) this).field_h = 1;
        ((hl) this).field_i = param4;
        ((hl) this).field_j = param7;
        ((hl) this).field_d = param2;
        ((hl) this).field_e = param0;
        ((hl) this).field_g = param8;
        ((hl) this).field_k = param6;
        ((hl) this).field_l = param3;
        ((hl) this).field_o = param5;
        ((hl) this).field_f = param9;
        ((hl) this).field_m = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_a = new ie();
    }
}
