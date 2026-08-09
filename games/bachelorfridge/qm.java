/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qm {
    int[] field_e;
    static qia field_g;
    int field_b;
    int field_f;
    java.awt.Image field_c;
    static wl field_d;
    static po field_a;

    final static fea a(ee[] param0, byte[] param1, int param2) {
        fea stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        byte[][] var20 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0.length != 256) {
              throw new IllegalArgumentException();
            } else {
              var16 = new int[256];
              var11 = var16;
              var10 = var11;
              var3 = var10;
              var17 = new int[256];
              var12 = var17;
              var4 = var12;
              var18 = new int[256];
              var13 = var18;
              var5 = var13;
              var19 = new int[256];
              var14 = var19;
              var6 = var14;
              var20 = new byte[256][];
              var15 = var20;
              var7 = var15;
              var8 = param2;
              L1: while (true) {
                if (var8 >= 256) {
                  stackIn_8_0 = new fea(param1, var16, var17, var18, var19, var20);
                  break L0;
                } else {
                  var10[var8] = param0[var8].field_f;
                  var4[var8] = param0[var8].field_c;
                  var5[var8] = param0[var8].field_d;
                  var6[var8] = param0[var8].field_e;
                  var7[var8] = param0[var8].field_g;
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("qm.N(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final static String a(String param0, String param1, String param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = param2.length();
            var5 = param1.length();
            var6 = param0.length();
            if (var5 != 0) {
              L1: {
                var7 = var4_int;
                var8 = var6 + -var5;
                if ((var8 ^ -1) != param3) {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param2.indexOf(param1, var9_int);
                    if (var9_int >= 0) {
                      var9_int = var9_int + var5;
                      var7 = var7 + var8;
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param2.indexOf(param1, var10);
                if ((var11 ^ -1) <= -1) {
                  discarded$0 = var9.append(param2.substring(var10, var11));
                  discarded$1 = var9.append(param0);
                  var10 = var11 + var5;
                  continue L3;
                } else {
                  discarded$2 = var9.append(param2.substring(var10));
                  stackIn_14_0 = var9.toString();
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("qm.J(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        kg.a(param3, he.field_l, gba.field_Bb, param1, -3, param2, rg.field_h);
        if (param0) {
            field_d = (wl) null;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_d = null;
        field_g = null;
    }

    final static void a(int param0, int param1) {
        ol.a(ib.field_d[param0], true);
        if (param1 != 7758) {
            field_a = (po) null;
        }
    }

    final void a(byte param0) {
        int var2 = -17 % ((76 - param0) / 37);
        dg.a(this.field_e, this.field_b, this.field_f);
    }

    abstract void a(byte param0, int param1, java.awt.Graphics param2, int param3);

    static {
        field_g = new qia();
    }
}
