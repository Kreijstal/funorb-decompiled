/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String field_d;
    static String[] field_c;
    static int field_b;
    static th field_a;

    public static void a(int param0) {
        try {
            field_c = null;
            field_a = null;
            int var1_int = -111 % ((28 - param0) / 57);
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ig.B(" + param0 + ')');
        }
    }

    final static jb[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        wf var2_ref = null;
        jb[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7_ref_byte__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_11_0 = 0;
        int stackIn_44_0 = 0;
        jb[] stackIn_45_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_43_0 = 0;
        jb[] stackOut_44_0 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_ref = new wf(param0);
            var3 = new jb[var2_ref.d(true)];
            var4 = new int[256];
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4.length <= var5) {
                    break L3;
                  } else {
                    var4[var5] = var2_ref.a(98);
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
                      var7_ref_byte__ = var3[var6].field_i;
                      var8 = var2_ref.d(true);
                      var10 = var8;
                      stackOut_10_0 = var10;
                      stackIn_44_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var11 != 0) {
                        break L5;
                      } else {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                if (stackIn_11_0 == 0) {
                                  var5 = var6;
                                  var2_ref.a(82, 307200, 0, var7_ref_byte__);
                                  if (var11 == 0) {
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  if (var10 == 1) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (var10 != 2) {
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
                              var2_ref.a(122, 307200, 0, var7_ref_byte__);
                              var5 = var6;
                              var3[var6].field_i = ui.a(480, var7_ref_byte__, -29165).field_j;
                              if (var11 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                            L12: {
                              var9 = var3[var5].field_i;
                              var2_ref.a(109, 307200, 0, var7_ref_byte__);
                              if (var8 == 3) {
                                byte[] dupTemp$1 = ui.a(480, var7_ref_byte__, -29165).field_j;
                                var7_ref_byte__ = dupTemp$1;
                                var3[var6].field_i = dupTemp$1;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var10 = 0;
                            L13: while (true) {
                              L14: {
                                if (var7_ref_byte__.length <= var10) {
                                  break L14;
                                } else {
                                  var7_ref_byte__[var10] = (byte)(-var7_ref_byte__[var10] + var9[var10]);
                                  var10++;
                                  if (var11 != 0) {
                                    break L7;
                                  } else {
                                    if (var11 == 0) {
                                      continue L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              break L8;
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
                  stackOut_43_0 = 112 % ((param1 - -19) / 47);
                  stackIn_44_0 = stackOut_43_0;
                  break L5;
                }
                var7 = stackIn_44_0;
                stackOut_44_0 = (jb[]) var3;
                stackIn_45_0 = stackOut_44_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var2;
            stackOut_46_1 = new StringBuilder().append("ig.A(");
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L15;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L15;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param1 + ')');
        }
        return stackIn_45_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
