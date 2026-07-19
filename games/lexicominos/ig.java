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
        byte[] dupTemp$1 = null;
        RuntimeException var2 = null;
        jb[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7_ref_byte__ = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        wf var12 = null;
        byte[] var13 = null;
        wf var14 = null;
        int[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var24 = null;
        int stackIn_10_0 = 0;
        int stackIn_30_0 = 0;
        jb[] stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_29_0 = 0;
        jb[] stackOut_30_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var12 = new wf(param0);
            var14 = var12;
            var3 = new jb[var14.d(true)];
            var19 = new int[256];
            var15 = var19;
            var4 = var15;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var19.length <= var5) {
                    break L3;
                  } else {
                    var4[var5] = var12.a(98);
                    var5++;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5 = -1;
                break L2;
              }
              var6 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3.length <= var6) {
                      break L6;
                    } else {
                      var3[var6] = new jb(640, 480, 256);
                      var3[var6].field_j = var4;
                      var21 = var3[var6].field_i;
                      var17 = var21;
                      var13 = var17;
                      var20 = var13;
                      var16 = var20;
                      var7_ref_byte__ = var16;
                      var8 = var14.d(true);
                      var10 = var8;
                      stackOut_9_0 = var10;
                      stackIn_30_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var11 != 0) {
                        break L5;
                      } else {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                if (stackIn_10_0 == 0) {
                                  var5 = var6;
                                  var14.a(82, 307200, 0, var20);
                                  if (var11 == 0) {
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  if ((var10 ^ -1) == -2) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if ((var10 ^ -1) != -3) {
                                        break L11;
                                      } else {
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    if (3 == var10) {
                                      break L9;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var14.a(122, 307200, 0, var21);
                              var5 = var6;
                              var3[var6].field_i = ui.a(480, var20, -29165).field_j;
                              if (var11 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                            L12: {
                              var24 = var3[var5].field_i;
                              var14.a(109, 307200, 0, var20);
                              if ((var8 ^ -1) == -4) {
                                dupTemp$1 = ui.a(480, var20, -29165).field_j;
                                var7_ref_byte__ = dupTemp$1;
                                var3[var6].field_i = dupTemp$1;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var10 = 0;
                            L13: while (true) {
                              if (param0.length <= var10) {
                                break L8;
                              } else {
                                var7_ref_byte__[var10] = (byte)(-param0[var10] + var24[var10]);
                                var10++;
                                if (var11 != 0) {
                                  break L7;
                                } else {
                                  if (var11 == 0) {
                                    continue L13;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          var6++;
                          break L7;
                        }
                        if (var11 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_29_0 = 112 % ((param1 - -19) / 47);
                  stackIn_30_0 = stackOut_29_0;
                  break L5;
                }
                var7 = stackIn_30_0;
                stackOut_30_0 = (jb[]) (var3);
                stackIn_31_0 = stackOut_30_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var2);
            stackOut_32_1 = new StringBuilder().append("ig.A(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L14;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L14;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        return stackIn_31_0;
    }

    static {
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
