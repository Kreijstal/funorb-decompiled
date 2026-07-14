/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static String field_a;
    static le field_b;

    public static void a(byte param0) {
        if (param0 != -17) {
            field_a = null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (5 <= var2) {
            if (param1) {
              if (param0 == -32663) {
                return;
              } else {
                field_a = null;
                return;
              }
            } else {
              ck.field_b = -1;
              jk.field_u = 0;
              if (param0 == -32663) {
                return;
              } else {
                field_a = null;
                return;
              }
            }
          } else {
            fd.field_o[var2] = param1;
            var2++;
            continue L0;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        Object var3 = null;
        if (param0 == 0) {
          if (param1 != null) {
            if (param1.length() >= d.field_e) {
              if (param1.length() > af.field_d) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var3 = null;
          tl.a(113, -12, (byte) -41, 79, (int[]) null);
          if (param1 != null) {
            if (param1.length() >= d.field_e) {
              if (param1.length() > af.field_d) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param2 >= -75) {
          tl.a((byte) 106);
          L0: while (true) {
            param0--;
            if (0 <= param0) {
              var11 = param4;
              var9 = var11;
              var5 = var9;
              var6 = param3;
              var7 = param1;
              var9[var6] = var7 + (ch.a(16711422, var11[var6]) >> -952387231);
              param3++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param0--;
            if (0 <= param0) {
              var10 = param4;
              var9 = var10;
              var5 = var9;
              var6 = param3;
              var7 = param1;
              var9[var6] = var7 + (ch.a(16711422, var10[var6]) >> -952387231);
              param3++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for levels";
    }
}
