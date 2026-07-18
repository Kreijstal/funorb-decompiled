/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm implements pf {
    static int[] field_g;
    static String field_i;
    private dj field_m;
    static qb field_l;
    static vn field_j;
    static String field_n;
    private int field_e;
    static int field_d;
    static int field_a;
    static int field_f;
    static kc field_h;
    private int field_k;
    static String field_b;
    static boolean field_c;

    public static void a(int param0) {
        field_n = null;
        field_j = null;
        field_i = null;
        field_l = null;
        field_g = null;
        field_h = null;
        field_b = null;
    }

    final static int b(int param0) {
        if (param0 != -2) {
            return -77;
        }
        return (int)(1000000000L / fd.field_d);
    }

    final static void a() {
        if (ob.field_Y == null) {
            throw new IllegalStateException("NGR");
        }
        ob.field_Y.field_l = true;
        li.a(1, 0);
        int var1 = 10;
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0.field_w) {
                  break L2;
                } else {
                  if (param0.d(-2116)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 2188450;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_5_0;
              int discarded$2 = ((gm) this).field_m.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_g + "</u>", param2 - -param0.field_n, param3 - -param0.field_j, param0.field_v, param0.field_k, var6_int, -1, ((gm) this).field_k, ((gm) this).field_e, ((gm) this).field_m.field_C - -((gm) this).field_m.field_m);
              if (param0.d(-2116)) {
                L4: {
                  var7 = ((gm) this).field_m.b(param0.field_g);
                  var8 = ((gm) this).field_m.field_C - -((gm) this).field_m.field_m;
                  var9 = param0.field_n + param2;
                  if (((gm) this).field_k == 2) {
                    var9 = var9 + (param0.field_v - var7);
                    break L4;
                  } else {
                    if (((gm) this).field_k == 1) {
                      var9 = var9 + (-var7 + param0.field_v >> 1);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var10 = param3 - -param0.field_j;
                  if (2 != ((gm) this).field_e) {
                    if (((gm) this).field_e == 1) {
                      var10 = var10 + (param0.field_k - var8 >> 1);
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    var10 = var10 + (-var8 + param0.field_k);
                    break L5;
                  }
                }
                oj.a(param1 ^ -5581056, var10 - -2, -2 + var9, var8, 4 + var7);
                break L3;
              } else {
                break L3;
              }
            }
            if (param1 == 5592405) {
              break L0;
            } else {
              int discarded$3 = gm.b(-20);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("gm.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public gm() {
        ((gm) this).field_e = 1;
        ((gm) this).field_k = 1;
        ((gm) this).field_m = ia.field_c;
    }

    gm(dj param0, int param1, int param2) {
        try {
            ((gm) this).field_m = param0;
            ((gm) this).field_k = param1;
            ((gm) this).field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[8192];
        field_n = "<%0> has lost connection.";
        field_i = "Spectate <%0>'s game";
        field_a = 3;
        field_c = true;
        field_b = "Lesson 2 of 7<br><br>Practise using a tactically varied spell in a safe and secure environment.<br><br>Use the Lava Bomb spell to destroy all three targets.<br><br><br>* Using controlled power *<br>* Use of terrain to direct your spells *";
    }
}
