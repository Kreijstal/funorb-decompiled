/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar extends ms {
    static int field_w;
    static String field_v;
    int[] field_A;
    private int[][] field_u;
    static wk field_D;
    static String field_y;
    private String[] field_z;
    static int field_C;
    private int[] field_B;
    static String field_x;

    final static void a(int param0, um param1) {
        ku.a((byte) -93, true, param1);
        if (param0 != 2) {
            om discarded$0 = ar.a(87, 100, -49);
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ar) this).field_A != null) {
            for (var2 = 0; ((ar) this).field_A.length > var2; var2++) {
                ((ar) this).field_A[var2] = oe.c(((ar) this).field_A[var2], 32768);
            }
        }
        if (!param0) {
            Object var4 = null;
            this.a((byte) -5, 7, (vh) null);
        }
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4 = 0;
        if (param0) {
            var4 += 4;
        }
        if (param3) {
            var4 += 2;
        }
        if (param2 != -115) {
            ar.e((byte) -15);
        }
        if (!(!param1)) {
            var4++;
        }
        return cp.field_b[var4];
    }

    final static om a(int param0, int param1, int param2) {
        cf var4 = br.a(param0, (byte) -14);
        cf var3 = var4;
        if (var3 == null) {
            return null;
        }
        if (param1 < param2) {
            return null;
        }
        if (param1 >= var3.field_n.length) {
            return null;
        }
        return var4.field_n[param1];
    }

    final static void a(wk[][] param0, int[] param1, byte param2, byte[] param3, int param4, kl param5, kl param6, byte[] param7, String[] param8, int[] param9, boolean param10, int param11, String[][] param12, ru[] param13, kl param14, String[][] param15, wk[][] param16) {
        Object var18 = null;
        tv.a(param13, param7, param0, param1, param14, param16, 1, param5, param4, false, param15, param12, param11, param8, param3, (String[]) null, param10, param6, param9);
        int var17 = -18 / ((param2 - -15) / 42);
    }

    final void a(vh param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == 91) {
          L0: while (true) {
            var3 = param0.k(0);
            if (var3 != 0) {
              this.a((byte) -96, var3, param0);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final String d(byte param0) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(((ar) this).field_z != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((ar) this).field_z[0]);
        for (var3 = 1; ((ar) this).field_z.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((ar) this).field_z[var3]);
        }
        if (param0 != 97) {
            field_D = null;
        }
        return var2.toString();
    }

    public static void e(byte param0) {
        if (param0 != -74) {
            field_C = 84;
        }
        field_v = null;
        field_x = null;
        field_y = null;
        field_D = null;
    }

    ar() {
    }

    private final void a(byte param0, int param1, vh param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        me var8 = null;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = -110 % ((13 - param0) / 56);
          if (param1 != 1) {
            if (-3 != (param1 ^ -1)) {
              if (param1 == 3) {
                var5 = param2.k(0);
                ((ar) this).field_B = new int[var5];
                ((ar) this).field_u = new int[var5][];
                var6 = 0;
                L1: while (true) {
                  if (var5 <= var6) {
                    break L0;
                  } else {
                    var7 = param2.e((byte) -104);
                    var8 = fi.b(0, var7);
                    if (var8 != null) {
                      ((ar) this).field_B[var6] = var7;
                      ((ar) this).field_u[var6] = new int[var8.field_f];
                      var9 = 0;
                      L2: while (true) {
                        if (var9 < var8.field_f) {
                          ((ar) this).field_u[var6][var9] = param2.e((byte) -104);
                          var9++;
                          continue L2;
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
              } else {
                if ((param1 ^ -1) != -5) {
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var5 = param2.k(0);
              ((ar) this).field_A = new int[var5];
              var6 = 0;
              L3: while (true) {
                if (var5 <= var6) {
                  break L0;
                } else {
                  ((ar) this).field_A[var6] = param2.e((byte) -104);
                  var6++;
                  continue L3;
                }
              }
            }
          } else {
            ((ar) this).field_z = dj.a(61, '<', param2.g(1));
            break L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Coat of Arms";
        field_v = "On";
        field_x = "This panel shows the equipment you have purchased. To look through all equipment, click on the 'Store' tab. Selecting equipment for hotseat games and tutorials costs nothing, but equipment must be purchased to use in online multiplayer games.";
    }
}
