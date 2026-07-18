/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends an {
    static String field_E;
    static String field_I;
    static String field_H;
    static boolean field_F;
    static int[] field_G;

    fm(String param0, sk param1, boolean param2) {
        this(param0, param1);
        try {
            ((fm) this).field_x = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private fm(String param0, sk param1) {
        this(param0, se.field_j.field_a, param1);
        try {
            ((fm) this).field_h = se.field_j.field_g;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private fm(String param0, io param1, sk param2) {
        super(param0, param1, param2);
        try {
            ((fm) this).field_h = se.field_j.field_g;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        am var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        bo var11 = null;
        b var12 = null;
        am var13 = null;
        b var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var13 = fj.field_g;
              var2 = var13.d((byte) -116);
              if (var2 != 0) {
                if (var2 != 1) {
                  if (2 != var2) {
                    ae.a((Throwable) null, 10331, "A1: " + cb.f(3));
                    p.a(1);
                    break L1;
                  } else {
                    var14 = (b) (Object) qi.field_J.b((byte) 26);
                    if (var14 == null) {
                      p.a(1);
                      return;
                    } else {
                      var14.field_k = ae.a(14821);
                      var14.field_o = true;
                      var14.b(-27598);
                      break L1;
                    }
                  }
                } else {
                  var11 = (bo) (Object) mp.field_g.b((byte) 26);
                  if (var11 == null) {
                    p.a(1);
                    return;
                  } else {
                    var11.b(-27598);
                    break L1;
                  }
                }
              } else {
                var10 = ae.a(14821);
                var3 = var10;
                var9 = var10;
                var4 = var9;
                var5 = var13;
                var6 = ((de) (Object) var5).d((byte) -124);
                var7 = 0;
                L2: while (true) {
                  if (var6 <= var7) {
                    var12 = (b) (Object) qi.field_J.b((byte) 26);
                    if (var12 == null) {
                      p.a(1);
                      return;
                    } else {
                      var12.field_o = true;
                      var12.field_k = var3;
                      var12.b(-27598);
                      break L1;
                    }
                  } else {
                    var9[var7] = ((de) (Object) var5).c(-90);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "fm.F(" + true + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((fm) this).field_x = !((fm) this).field_x ? true : false;
        int var5 = -35 / ((-12 - param1) / 56);
        super.b(param0, -73, param2, param3);
    }

    public static void a(int param0) {
        field_H = null;
        field_G = null;
        field_I = null;
        field_E = null;
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          if (param0 != null) {
            var2_int = 0;
            var3 = param0.length();
            L0: while (true) {
              L1: {
                if (var2_int >= var3) {
                  break L1;
                } else {
                  if (!vi.a(31153, param0.charAt(var2_int))) {
                    break L1;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var2_int >= var3) {
                    break L3;
                  } else {
                    if (!vi.a(31153, param0.charAt(-1 + var3))) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = -var2_int + var3;
                if (var4 >= 1) {
                  if (var4 <= 12) {
                    L4: {
                      var5 = new StringBuilder(var4);
                      if (param1 < -34) {
                        break L4;
                      } else {
                        fm.b(true);
                        break L4;
                      }
                    }
                    var6 = var2_int;
                    L5: while (true) {
                      if (var3 <= var6) {
                        if (var5.length() != 0) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L6: {
                          var7 = param0.charAt(var6);
                          if (bh.a((char) var7, false)) {
                            var8 = qj.a(-122, (char) var7);
                            if (var8 == 0) {
                              break L6;
                            } else {
                              StringBuilder discarded$1 = var5.append((char) var8);
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var6++;
                        continue L5;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("fm.G(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Unfortunately you are not eligible to create an account.";
        field_I = "The living have defeated your shambling advance.";
        field_F = true;
        field_H = "Level Selection";
        field_G = new int[8192];
    }
}
