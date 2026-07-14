/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    private static int[] field_i;
    static int[] field_j;
    static int[][] field_f;
    static String field_a;
    static int[] field_d;
    static int field_g;
    int field_c;
    static String[] field_e;
    int field_m;
    static int[] field_b;
    int[] field_k;
    static se field_l;
    static int[] field_h;
    static String field_n;

    public static void a(int param0) {
        field_e = null;
        field_l = null;
        field_n = null;
        field_b = null;
        field_f = null;
        field_h = null;
        if (param0 != 400) {
          return;
        } else {
          field_d = null;
          field_j = null;
          field_a = null;
          field_i = null;
          return;
        }
    }

    final int a(byte param0) {
        if (param0 == -90) {
          if (null != ((tg) this).field_k) {
            if (((tg) this).field_k.length == 0) {
              return 0;
            } else {
              return ((tg) this).field_k[-1 + ((tg) this).field_k.length];
            }
          } else {
            return 0;
          }
        } else {
          return 15;
        }
    }

    final static String a(char param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = DungeonAssault.field_K;
        if (param2 == 3) {
          var4 = param1.length();
          var5 = param3.length();
          var6 = var4;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param1.indexOf((int) param0, var8_int);
              if (0 <= var8_int) {
                var6 = var6 + var7;
                var8_int++;
                continue L0;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L1: while (true) {
                  var10 = param1.indexOf((int) param0, var9);
                  if ((var10 ^ -1) <= -1) {
                    StringBuilder discarded$12 = var13.append(param1.substring(var9, var10));
                    var9 = var10 + 1;
                    StringBuilder discarded$13 = var13.append(param3);
                    continue L1;
                  } else {
                    StringBuilder discarded$14 = var13.append(param1.substring(var9));
                    return var13.toString();
                  }
                }
              }
            }
          } else {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param1.indexOf((int) param0, var9);
              if ((var10 ^ -1) <= -1) {
                StringBuilder discarded$15 = var12.append(param1.substring(var9, var10));
                var9 = var10 + 1;
                StringBuilder discarded$16 = var12.append(param3);
                continue L2;
              } else {
                StringBuilder discarded$17 = var12.append(param1.substring(var9));
                return var12.toString();
              }
            }
          }
        } else {
          field_e = null;
          var4 = param1.length();
          var5 = param3.length();
          var6 = var4;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            L3: while (true) {
              var8_int = param1.indexOf((int) param0, var8_int);
              if (0 <= var8_int) {
                var6 = var6 + var7;
                var8_int++;
                continue L3;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L4: while (true) {
                  var10 = param1.indexOf((int) param0, var9);
                  if ((var10 ^ -1) <= -1) {
                    StringBuilder discarded$18 = var8.append(param1.substring(var9, var10));
                    var9 = var10 + 1;
                    StringBuilder discarded$19 = var8.append(param3);
                    continue L4;
                  } else {
                    StringBuilder discarded$20 = var8.append(param1.substring(var9));
                    return var8.toString();
                  }
                }
              }
            }
          } else {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L5: while (true) {
              var10 = param1.indexOf((int) param0, var9);
              if ((var10 ^ -1) <= -1) {
                StringBuilder discarded$21 = var8.append(param1.substring(var9, var10));
                var9 = var10 + 1;
                StringBuilder discarded$22 = var8.append(param3);
                continue L5;
              } else {
                StringBuilder discarded$23 = var8.append(param1.substring(var9));
                return var8.toString();
              }
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (((tg) this).field_k != null) {
          if (-1 != (((tg) this).field_k.length ^ -1)) {
            var3 = 1;
            L0: while (true) {
              if (((tg) this).field_k.length <= var3) {
                if (param0 > -77) {
                  tg.a(-90);
                  return ((tg) this).field_k.length - 1;
                } else {
                  return ((tg) this).field_k.length - 1;
                }
              } else {
                if (param1 >= ((tg) this).field_k[var3] + ((tg) this).field_k[-1 + var3] >> -382352863) {
                  var3++;
                  continue L0;
                } else {
                  return var3 - 1;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    tg(int param0, int param1, int param2) {
        ((tg) this).field_c = param1;
        ((tg) this).field_k = new int[param2 - -1];
        ((tg) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[14];
        field_d = new int[14];
        field_b = new int[14];
        field_g = 0;
        field_i = new int[]{20, 4, 3, 7, 21, 13, 14, 8, 15, 12};
        field_a = "Traversing this room without breaking any glass or mirrors will take a skilful and agile raider.<br><br>When triggered, the <%detect> of all monsters in this dungeon is increased by 2.";
        field_f = new int[14][];
        field_h = new int[14];
        field_e = new String[]{null, "Rooms you have just placed are <%highlight>surrounded by a blue glow to show they are not yet fixed</col>. You can <col=FF0000>right-click</col> on a newly placed room to remove it, restoring the tile it replaced."};
        field_n = "Orb of War";
        pi.a(field_i, 180, 0, 33, 460, 88, 0);
        pi.a(new int[6], 180, 1, 33, 460, 88, 0);
        pi.a(new int[4], 82, 3, 33, 336, 88, 0);
        pi.a(new int[1], 180, 6, 33, 460, 410, 0);
        pi.a(new int[2], 200, 8, 33, 440, 392, 0);
        pi.a(new int[1], 200, 9, 33, 440, 392, 0);
        pi.a(new int[2], 180, 10, 33, 460, 400, 0);
        pi.a(new int[1], 290, 11, 33, 460, 400, 0);
        pi.a(new int[0], 180, 12, 33, 460, 88, 0);
    }
}
