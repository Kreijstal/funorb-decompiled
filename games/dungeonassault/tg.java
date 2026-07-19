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
        field_f = (int[][]) null;
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
          if (null != this.field_k) {
            if (this.field_k.length == 0) {
              return 0;
            } else {
              return this.field_k[-1 + this.field_k.length];
            }
          } else {
            return 0;
          }
        } else {
          return 15;
        }
    }

    final static String a(char param0, String param1, int param2, String param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param2 == 3) {
                break L1;
              } else {
                field_e = (String[]) null;
                break L1;
              }
            }
            L2: {
              var4_int = param1.length();
              var5 = param3.length();
              var6 = var4_int;
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
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param1.indexOf((int) param0, var9);
              if ((var10 ^ -1) <= -1) {
                discarded$3 = var8.append(param1.substring(var9, var10));
                var9 = var10 + 1;
                discarded$4 = var8.append(param3);
                continue L4;
              } else {
                discarded$5 = var8.append(param1.substring(var9));
                stackOut_13_0 = var8.toString();
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("tg.C(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (this.field_k != null) {
          if (-1 != (this.field_k.length ^ -1)) {
            var3 = 1;
            L0: while (true) {
              if (this.field_k.length <= var3) {
                if (param0 > -77) {
                  tg.a(-90);
                  return this.field_k.length - 1;
                } else {
                  return this.field_k.length - 1;
                }
              } else {
                if (param1 >= this.field_k[var3] + this.field_k[-1 + var3] >> -382352863) {
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
        this.field_c = param1;
        this.field_k = new int[param2 - -1];
        this.field_m = param0;
    }

    static {
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
        pi.a(new int[]{2, 13, 14, 28, 7, 11}, 180, 1, 33, 460, 88, 0);
        pi.a(new int[]{5, 6, 3, 9}, 82, 3, 33, 336, 88, 0);
        pi.a(new int[]{10}, 180, 6, 33, 460, 410, 0);
        pi.a(new int[]{16, 10}, 200, 8, 33, 440, 392, 0);
        pi.a(new int[]{10}, 200, 9, 33, 440, 392, 0);
        pi.a(new int[]{16, 17}, 180, 10, 33, 460, 400, 0);
        pi.a(new int[]{9}, 290, 11, 33, 460, 400, 0);
        pi.a(new int[]{}, 180, 12, 33, 460, 88, 0);
    }
}
