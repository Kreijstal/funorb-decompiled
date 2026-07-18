/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String field_d;
    static String[] field_c;
    static int field_b;
    static th field_a;

    public static void a() {
        field_c = null;
        field_a = null;
        int var1 = 0;
        field_d = null;
    }

    final static jb[] a(byte[] param0) {
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
        int[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        jb[] stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb[] stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var12 = new wf(param0);
            var15 = var12;
            var3 = new jb[var15.d(true)];
            var28 = new int[256];
            var24 = var28;
            var20 = var24;
            var16 = var20;
            var4 = var16;
            var5 = 0;
            L1: while (true) {
              if (var28.length <= var5) {
                var5 = -1;
                var6 = 0;
                L2: while (true) {
                  if (var3.length <= var6) {
                    var7 = 0;
                    stackOut_25_0 = (jb[]) var3;
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    L3: {
                      var3[var6] = new jb(640, 480, 256);
                      var3[var6].field_j = var4;
                      var30 = var3[var6].field_i;
                      var26 = var30;
                      var22 = var26;
                      var18 = var22;
                      var13 = var18;
                      var29 = var13;
                      var25 = var29;
                      var21 = var25;
                      var17 = var21;
                      var7_ref_byte__ = var17;
                      var8 = var15.d(true);
                      var10 = var8;
                      if (var10 == 0) {
                        var5 = var6;
                        var15.a(82, 307200, 0, var29);
                        var6++;
                        break L3;
                      } else {
                        if (var10 == 1) {
                          var15.a(122, 307200, 0, var30);
                          var5 = var6;
                          int discarded$3 = -29165;
                          var3[var6].field_i = ui.a(480, var7_ref_byte__).field_j;
                          var6++;
                          break L3;
                        } else {
                          L4: {
                            if (var10 != 2) {
                              if (3 == var10) {
                                break L4;
                              } else {
                                var6++;
                                break L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            var31 = var3[var5].field_i;
                            var15.a(109, 307200, 0, var29);
                            if (var8 == 3) {
                              int discarded$4 = -29165;
                              byte[] dupTemp$5 = ui.a(480, var7_ref_byte__).field_j;
                              var7_ref_byte__ = dupTemp$5;
                              var3[var6].field_i = dupTemp$5;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var14 = 0;
                          var10 = var14;
                          L6: while (true) {
                            if (param0.length <= var14) {
                              break L3;
                            } else {
                              var7_ref_byte__[var14] = (byte)(-param0[var14] + var31[var14]);
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
            stackOut_27_0 = (RuntimeException) var2;
            stackOut_27_1 = new StringBuilder().append("ig.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + -66 + ')');
        }
        return stackIn_26_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
