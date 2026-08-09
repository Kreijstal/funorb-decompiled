/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends ak {
    static String field_Fb;
    private ak field_Eb;
    static String[] field_Hb;
    static tf field_Gb;

    final static ak j(int param0) {
        if (param0 != 0) {
            hp.a(41, 47, -28, (byte) -84, 63);
        }
        return kc.e(16);
    }

    final boolean b(int param0, boolean param1) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 <= -43) {
            break L0;
          } else {
            field_Fb = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              this.a(-28476, true);
              if (0 == nm.field_c) {
                break L3;
              } else {
                if (this.field_P == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (this.field_Eb.field_P == 0) {
              stackIn_9_0 = 0;
              break L1;
            } else {
              break L2;
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        ti.a(false);
        if (param3 > -83) {
            hp.j(-32);
        }
        t.d(param0, param4, param2, param1);
    }

    hp(ak param0, ak param1, ak param2, ak param3, ak param4, ak param5) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        ak var8 = null;
        ak var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ak var13 = null;
        ak var14 = null;
        int var15 = 0;
        ak var17 = null;
        try {
          L0: {
            var17 = new ak(0L, param1, ui.field_g.toUpperCase());
            var17.field_Bb = 1;
            this.field_Eb = new ak(0L, param2);
            var8 = new ak(0L, param3);
            var9 = new ak(0L, param3, mg.field_g);
            var9.field_Bb = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (var12 >= kd.field_c.length) {
                var17.a(0, 24, 0, 256, 20 + (var11 + 90));
                var10 += 15;
                this.a(100, var17.field_nb + var10, 100, 256, var17.field_K);
                this.field_Eb.a(5, 15, -20 + var17.field_K, 256, 15);
                var8.a(var17.field_nb, this.field_nb + -var17.field_nb, 0, 256, this.field_K);
                var9.a(20, 15, 0, 256, this.field_K);
                var8.field_zb = op.a(8421504, 16, 11579568, var8.field_nb, 2105376, 3);
                var17.a(this.field_Eb, (byte) 26);
                var8.a(var9, (byte) 26);
                this.a(var17, (byte) 26);
                this.a(var8, (byte) 26);
                var10 = -(this.field_nb >> -596341119) + 240;
                this.field_D = 320 + -(this.field_K >> -1068103615);
                break L0;
              } else {
                L2: {
                  var13 = new ak(0L, param3, cf.field_I[var12]);
                  var14 = new ak(0L, param3, kd.field_c[var12]);
                  var15 = param3.field_Db.c(kd.field_c[var12]);
                  var13.a(var10, 15, 20, 256, 65);
                  if (var11 >= var15) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var14.a(var10, 15, 90, 256, 640);
                var8.a(var13, (byte) 26);
                var10 += 30;
                var8.a(var14, (byte) 26);
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("hp.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    public static void b(byte param0) {
        field_Fb = null;
        if (param0 != -15) {
            field_Gb = (tf) null;
        }
        field_Gb = null;
        field_Hb = null;
    }

    static {
        field_Hb = new String[]{"Difficulty", "Number of Pictures"};
        field_Fb = "Enter name of friend to delete from list";
    }
}
