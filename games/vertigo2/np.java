/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends cr {
    private cr field_Hb;
    static cr field_Ib;
    static float field_Nb;
    static r field_Kb;
    static int field_Lb;
    static int field_Ob;
    static String field_Mb;
    static String field_Jb;

    final boolean a(byte param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        this.a(param0 ^ -51, true);
        if (param0 == -51) {
          if (-1 == (kf.field_c ^ -1)) {
            if (this.field_Hb.field_tb != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            if (this.field_tb != 0) {
              L0: {
                if (this.field_Hb.field_tb == 0) {
                  stackIn_21_0 = 0;
                  break L0;
                } else {
                  stackIn_21_0 = 1;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackIn_17_0 = 1;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          field_Ob = 28;
          if (-1 != (kf.field_c ^ -1)) {
            if (this.field_tb == 0) {
              return true;
            } else {
              L1: {
                if (this.field_Hb.field_tb == 0) {
                  stackIn_10_0 = 0;
                  break L1;
                } else {
                  stackIn_10_0 = 1;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (this.field_Hb.field_tb == 0) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        field_Mb = null;
        field_Kb = null;
        field_Ib = null;
        field_Jb = null;
        int var1 = 87 / ((-67 - param0) / 34);
    }

    np(cr param0, cr param1, cr param2, cr param3, cr param4, cr param5) {
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
        cr var8 = null;
        cr var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cr var13 = null;
        cr var14 = null;
        int var15 = 0;
        cr var17 = null;
        try {
          L0: {
            var17 = new cr(0L, param1, br.field_W.toUpperCase());
            var17.field_O = 1;
            this.field_Hb = new cr(0L, param2);
            var8 = new cr(0L, param3);
            var9 = new cr(0L, param3, ac.field_N);
            var9.field_O = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (sd.field_M.length <= var12) {
                var10 += 15;
                var17.a(126, 90 + (var11 - -20), 24, 0, 0);
                this.a(95, var17.field_Fb, var17.field_db + var10, 100, 100);
                this.field_Hb.a(84, 15, 15, 5, var17.field_Fb - 20);
                var8.a(87, this.field_Fb, this.field_db + -var17.field_db, var17.field_db, 0);
                var9.a(83, this.field_Fb, 15, 20, 0);
                var8.field_Bb = vl.a(var8.field_db, 3, 0, 2105376, 11579568, 8421504);
                var17.b(this.field_Hb, 124);
                var8.b(var9, 127);
                this.b(var17, 121);
                this.b(var8, 118);
                var10 = -(this.field_db >> 297713889) + 240;
                this.field_wb = -(this.field_Fb >> -1337576255) + 320;
                break L0;
              } else {
                L2: {
                  var13 = new cr(0L, param3, qr.field_k[var12]);
                  var14 = new cr(0L, param3, sd.field_M[var12]);
                  var15 = param3.field_z.c(sd.field_M[var12]);
                  var13.a(115, 65, 15, var10, 20);
                  if (var11 >= var15) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var14.a(85, 640, 15, var10, 90);
                var8.b(var13, 121);
                var8.b(var14, 125);
                var10 += 30;
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

            stackIn_10_1 = new StringBuilder().append("np.<init>(");

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
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_Mb = "Concluded";
        field_Jb = "End Game";
        field_Ob = -1;
    }
}
