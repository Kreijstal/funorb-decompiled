/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa implements ca {
    private int field_f;
    static String[] field_g;
    private se field_b;
    static String field_i;
    private int field_a;
    static String[] field_d;
    static int[] field_e;
    static String field_h;
    static String[] field_c;

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          var11 = DungeonAssault.field_K;
          if (param1.field_u) {
            stackOut_16_0 = 3249872;
            stackIn_18_0 = stackOut_16_0;
            break L0;
          } else {
            if (!param1.a((byte) 127)) {
              stackOut_17_0 = 2188450;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              L1: {
                var6 = 3249872;
                if (param0 == 34) {
                  break L1;
                } else {
                  oa.a((byte) -52);
                  break L1;
                }
              }
              L2: {
                int discarded$2 = ((oa) this).field_b.a("<u=" + Integer.toString(var6, 16) + ">" + param1.field_w + "</u>", param1.field_q + param2, param1.field_v + param3, param1.field_x, param1.field_s, var6, -1, ((oa) this).field_a, ((oa) this).field_f, ((oa) this).field_b.field_H + ((oa) this).field_b.field_E);
                if (!param1.a((byte) 20)) {
                  break L2;
                } else {
                  L3: {
                    var7 = ((oa) this).field_b.b(param1.field_w);
                    var8 = ((oa) this).field_b.field_E + ((oa) this).field_b.field_H;
                    var9 = param2 - -param1.field_q;
                    var10 = param1.field_v + param3;
                    if ((((oa) this).field_a ^ -1) != -3) {
                      if (1 != ((oa) this).field_a) {
                        break L3;
                      } else {
                        var9 = var9 + (param1.field_x - var7 >> 1422585281);
                        break L3;
                      }
                    } else {
                      var9 = var9 + (-var7 + param1.field_x);
                      break L3;
                    }
                  }
                  L4: {
                    if (2 != ((oa) this).field_f) {
                      if (1 != ((oa) this).field_f) {
                        break L4;
                      } else {
                        var10 = var10 + (-var8 + param1.field_s >> 1077514401);
                        break L4;
                      }
                    } else {
                      var10 = var10 + (-var8 + param1.field_s);
                      break L4;
                    }
                  }
                  in.a(-2 + var9, var8, var7 - -4, 2 + var10, 1);
                  break L2;
                }
              }
              return;
            }
          }
        }
        L5: {
          var6 = stackIn_18_0;
          if (param0 == 34) {
            break L5;
          } else {
            oa.a((byte) -52);
            break L5;
          }
        }
        int discarded$3 = ((oa) this).field_b.a("<u=" + Integer.toString(var6, 16) + ">" + param1.field_w + "</u>", param1.field_q + param2, param1.field_v + param3, param1.field_x, param1.field_s, var6, -1, ((oa) this).field_a, ((oa) this).field_f, ((oa) this).field_b.field_H + ((oa) this).field_b.field_E);
        if (param1.a((byte) 20)) {
          var7 = ((oa) this).field_b.b(param1.field_w);
          var8 = ((oa) this).field_b.field_E + ((oa) this).field_b.field_H;
          var9 = param2 - -param1.field_q;
          var10 = param1.field_v + param3;
          if ((((oa) this).field_a ^ -1) != -3) {
            L6: {
              if (1 != ((oa) this).field_a) {
                break L6;
              } else {
                var9 = var9 + (param1.field_x - var7 >> 1422585281);
                break L6;
              }
            }
            if (2 == ((oa) this).field_f) {
              var10 = var10 + (-var8 + param1.field_s);
              in.a(-2 + var9, var8, var7 - -4, 2 + var10, 1);
              return;
            } else {
              L7: {
                if (1 != ((oa) this).field_f) {
                  break L7;
                } else {
                  var10 = var10 + (-var8 + param1.field_s >> 1077514401);
                  break L7;
                }
              }
              in.a(-2 + var9, var8, var7 - -4, 2 + var10, 1);
              return;
            }
          } else {
            L8: {
              var9 = var9 + (-var7 + param1.field_x);
              if (2 != ((oa) this).field_f) {
                if (1 != ((oa) this).field_f) {
                  break L8;
                } else {
                  var10 = var10 + (-var8 + param1.field_s >> 1077514401);
                  break L8;
                }
              } else {
                var10 = var10 + (-var8 + param1.field_s);
                break L8;
              }
            }
            in.a(-2 + var9, var8, var7 - -4, 2 + var10, 1);
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_i = null;
        field_e = null;
        field_h = null;
        int var1 = 65 / ((param0 - 1) / 60);
        field_d = null;
        field_c = null;
    }

    public oa() {
        ((oa) this).field_b = lp.field_C;
        ((oa) this).field_a = 1;
        ((oa) this).field_f = 1;
    }

    oa(se param0, int param1, int param2) {
        ((oa) this).field_b = param0;
        ((oa) this).field_f = param2;
        ((oa) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Gift of the Trees", "The <%0> channels the power of the great forests that were once her home to double the <%sneak> of a raider in the next room. (Single use)"};
        field_e = new int[]{5, 4};
        field_i = "Ranger of the North";
        field_d = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_h = "Confirm changes?";
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
