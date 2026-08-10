/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String field_d;
    static String[] field_c;
    static int field_b;
    static th field_a;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = -111 % ((28 - param0) / 57);
        field_d = null;
    }

    final static jb[] a(byte[] param0, int param1) {
        byte[] dupTemp$0 = null;
        jb[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        jb[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        wf var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        wf var15 = null;
        int[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var25 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var12 = new wf(param0);
            var15 = var12;
            var3 = new jb[var15.d(true)];
            var20 = new int[256];
            var16 = var20;
            var4 = var16;
            var5 = 0;
            L1: while (true) {
              if (var20.length <= var5) {
                var5 = -1;
                var6 = 0;
                L2: while (true) {
                  if (var3.length <= var6) {
                    var7 = 112 % ((param1 - -19) / 47);
                    stackIn_23_0 = (jb[]) (var3);
                    break L0;
                  } else {
                    L3: {
                      var3[var6] = new jb(640, 480, 256);
                      var3[var6].field_j = var4;
                      var22 = var3[var6].field_i;
                      var18 = var22;
                      var13 = var18;
                      var21 = var13;
                      var17 = var21;
                      var7_ref_byte__ = var17;
                      var8 = var15.d(true);
                      var10 = var8;
                      if (var10 == 0) {
                        var5 = var6;
                        var15.a(82, 307200, 0, var21);
                        break L3;
                      } else {
                        if ((var10 ^ -1) == -2) {
                          var15.a(122, 307200, 0, var22);
                          var5 = var6;
                          var3[var6].field_i = ui.a(480, var21, -29165).field_j;
                          break L3;
                        } else {
                          L4: {
                            if ((var10 ^ -1) != -3) {
                              if (3 == var10) {
                                break L4;
                              } else {
                                break L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            var25 = var3[var5].field_i;
                            var15.a(109, 307200, 0, var21);
                            if ((var8 ^ -1) == -4) {
                              dupTemp$0 = ui.a(480, var21, -29165).field_j;
                              var7_ref_byte__ = dupTemp$0;
                              var3[var6].field_i = dupTemp$0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var14 = 0;
                          var10 = var14;
                          L6: while (true) {
                            if (var7_ref_byte__.length <= var14) {
                              break L3;
                            } else {
                              var7_ref_byte__[var14] = (byte)(-var7_ref_byte__[var14] + var25[var14]);
                              var14++;
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var4[var5] = var12.a(98);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("ig.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    static {
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
