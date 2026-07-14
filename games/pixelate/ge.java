/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static int[] field_c;
    static String field_a;
    static ak field_h;
    static String field_b;
    static boolean field_f;
    static tf field_g;
    static String field_d;
    static String field_e;
    static el field_i;

    final static void a(String[] args, int param1, fm param2, byte[] param3, tf[][] param4, int param5, String[][] param6, fm param7, byte[] param8, String[] param9, tf[][] param10, hh[] param11, String[][] param12, fm param13, String[] param14, int[] param15, int param16, boolean param17, int[] param18, byte param19) {
        oe.a(param19 + -84, param2, param11, param18, param13);
        ph.a(param2, (byte) -106);
        fa.a(param14, param2, param15, (byte) 126, param10, param16, param8, param4, args, param12, param6, param9, param5, param1, param3);
        aj.a(param7, param2, param17, -94);
        if (param19 != -41) {
            field_g = null;
        }
        ve.j(1565);
        gd.a((byte) -7);
        jj.a(0);
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_i = null;
        field_g = null;
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 != -1) {
            Object var2 = null;
            ge.a((String[]) null, -96, (fm) null, (byte[]) null, (tf[][]) null, 52, (String[][]) null, (fm) null, (byte[]) null, (String[]) null, (tf[][]) null, (hh[]) null, (String[][]) null, (fm) null, (String[]) null, (int[]) null, 27, true, (int[]) null, (byte) -67);
        }
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(rh param0, ue param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Pixelate.field_H ? 1 : 0;
          if (param1 == null) {
            break L0;
          } else {
            if (null == param1.field_l) {
              break L0;
            } else {
              if (param0 == null) {
                break L0;
              } else {
                if (param1.field_o != param0.field_t) {
                  break L0;
                } else {
                  var4 = param0.field_k.length;
                  var5 = param1.field_l[param2].length / var4;
                  var6 = 0;
                  L1: while (true) {
                    if (var6 >= var5) {
                      if (param3 == -7402) {
                        return -1;
                      } else {
                        return -20;
                      }
                    } else {
                      if (param1.field_k[param2][var6] == param0.field_q) {
                        if (sm.a(param1.field_r[param2][var6], -1)) {
                          var7 = 0;
                          L2: while (true) {
                            if (var4 <= var7) {
                              return var6;
                            } else {
                              if (param0.field_k[var7] == param1.field_l[param2][var4 * var6 + var7]) {
                                var7++;
                                continue L2;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Puzzle Mode";
        field_b = "Menu";
        field_e = "Show private chat from my friends and opponents";
        field_d = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_i = new el();
    }
}
