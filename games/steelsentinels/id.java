/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends gh {
    static int[] field_cc;
    private gh field_Yb;
    static String field_Sb;
    static String field_Wb;
    static String field_Tb;
    private gh field_Vb;
    static String field_Ub;
    static int field_ac;
    static String field_Zb;
    static String field_Xb;
    static cm field_bc;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((id) this).a(0, param0, param5, param4, param1);
        int var7 = 36 / ((param3 - -7) / 47);
        this.a(false, param2);
    }

    private final void a(boolean param0, int param1) {
        if (param0) {
            return;
        }
        ((id) this).field_Yb.a(0, 0, ((id) this).field_Lb, 0, ((id) this).field_Yb.g(-2147483648));
        int var3 = ((id) this).field_Yb.field_zb - -param1;
        ((id) this).field_Vb.a(0, 0, ((id) this).field_Lb, var3, ((id) this).field_zb - var3);
    }

    public static void j(int param0) {
        field_Wb = null;
        field_Ub = null;
        field_Zb = null;
        field_Xb = null;
        field_bc = null;
        field_Sb = null;
        field_cc = null;
        if (param0 < 106) {
            field_Sb = null;
        }
        field_Tb = null;
    }

    final int c(int param0, int param1) {
        if (param0 > -46) {
            return 30;
        }
        return param1 + ((id) this).field_Yb.g(-2147483648) + ((id) this).field_Vb.g(-2147483648);
    }

    id(long param0, id param1, String param2) {
        this(param0, param1.field_Yb, param1.field_Vb, param2);
    }

    final static void d(byte param0) {
        ci.field_a.c((lh) (Object) new pd(), -22908735);
        int var1 = -48 % ((param0 - -48) / 47);
    }

    id(long param0, wk param1, wk param2, int param3, gh param4, String param5) {
        this(param0, (gh) null, param4, param5);
        ((id) this).field_Yb.field_Fb = param3;
        ((id) this).field_Yb.field_Pb = param2;
        ((id) this).field_Yb.field_Hb = param1;
    }

    final static int a(String param0, int param1, String param2, int param3, String param4, boolean param5, int param6) {
        if (param1 != 0) {
            return -108;
        }
        ik var7 = new ik(param2);
        ik var8 = new ik(param4);
        return ka.a(param0, param5, param6, (byte) -124, param3, var7, var8);
    }

    private id(long param0, gh param1, gh param2, String param3) {
        super(param0, (gh) null);
        ((id) this).field_Yb = new gh(0L, param1);
        ((id) this).field_Vb = new gh(0L, param2);
        ((id) this).field_Vb.field_S = param3;
        ((id) this).a(((id) this).field_Yb, 127);
        ((id) this).a(((id) this).field_Vb, 127);
        ((id) this).h(46);
    }

    final static String a(String param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          if (param0 != null) {
            stackOut_2_0 = param0.length();
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (var2 != 0) {
          var9 = new char[var2];
          var8 = var9;
          var3 = var8;
          var4 = param1;
          var5 = 0;
          var6 = 0;
          L1: while (true) {
            if (var6 >= var2) {
              return new String(var9);
            } else {
              var3[var6] = param0.charAt(var6);
              if (60 != var9[var6]) {
                L2: {
                  if (var9[var6] != 62) {
                    break L2;
                  } else {
                    if (var4 > 0) {
                      var4--;
                      var6++;
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (0 == var4) {
                  if (var5 == 0) {
                    if (!Character.isWhitespace(var9[var6])) {
                      var5 = 1;
                      var3[var6] = Character.toUpperCase(var9[var6]);
                      var6++;
                      continue L1;
                    } else {
                      var6++;
                      continue L1;
                    }
                  } else {
                    var6++;
                    continue L1;
                  }
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                var4++;
                var6++;
                continue L1;
              }
            }
          }
        } else {
          return param0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Sb = "No";
        field_Wb = null;
        field_Tb = "Log in or create a free account to save your progress.";
        field_Ub = "Security";
        field_Xb = "Mute this player for 48 hours";
        field_cc = new int[]{40, 33, 46, 7};
        field_Zb = "DROP";
    }
}
