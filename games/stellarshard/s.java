/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class s implements Iterator {
    private ah field_d;
    static boolean field_i;
    private ah field_h;
    static int field_b;
    static li field_f;
    static bd field_c;
    static va field_e;
    private bg field_a;
    static String field_g;

    public final boolean hasNext() {
        return ((s) this).field_h != ((s) this).field_a.field_b;
    }

    final static String a(CharSequence param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_27_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_31_0 = null;
        String stackOut_26_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = cg.field_b;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var3_int = param0.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      int discarded$2 = 0;
                      var4 = nh.a(param0);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (sk.a(var4.charAt(0), -122)) {
                              break L3;
                            } else {
                              if (!sk.a(var4.charAt(-1 + var4.length()), -105)) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (var6 >= param0.length()) {
                                    if (var5 > 0) {
                                      stackOut_31_0 = jb.field_h;
                                      stackIn_32_0 = stackOut_31_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param0.charAt(var6);
                                      if (sk.a((char) var7, -113)) {
                                        var5++;
                                        break L5;
                                      } else {
                                        var5 = 0;
                                        break L5;
                                      }
                                    }
                                    if (var5 < 2) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_26_0 = t.field_c;
                                      stackIn_27_0 = stackOut_26_0;
                                      return stackIn_27_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_18_0 = jb.field_h;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      }
                    }
                    stackOut_13_0 = cg.field_b;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
              stackOut_8_0 = cg.field_b;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("s.C(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + false + ',' + 3 + ')');
        }
        return stackIn_32_0;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        char[] var16 = null;
        char[] var17 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var6 = stellarshard.field_B;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              int discarded$6 = 0;
              if (!od.a(param1)) {
                var16 = nh.field_e;
                var14 = var16;
                var12 = var14;
                var10 = var12;
                var7 = var10;
                var2 = var7;
                var3 = 0;
                L1: while (true) {
                  if (var16.length <= var3) {
                    var17 = fe.field_g;
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var8 = var11;
                    var2 = var8;
                    var3 = 0;
                    var9 = 0;
                    var4 = var9;
                    L2: while (true) {
                      if (var9 >= var17.length) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      } else {
                        var5 = var17[var9];
                        if (param1 == var5) {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        } else {
                          var9++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var16[var3];
                    if (param1 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2_ref, "s.B(" + 45 + ',' + param1 + ')');
        }
        return stackIn_21_0 != 0;
    }

    public final void remove() {
        if (null == ((s) this).field_d) {
            throw new IllegalStateException();
        }
        ((s) this).field_d.c((byte) 36);
        ((s) this).field_d = null;
    }

    public final Object next() {
        ah var1 = ((s) this).field_h;
        if (((s) this).field_a.field_b != var1) {
            ((s) this).field_h = var1.field_m;
        } else {
            ((s) this).field_h = null;
            var1 = null;
        }
        ((s) this).field_d = var1;
        return (Object) (Object) var1;
    }

    public static void a() {
        field_e = null;
        field_g = null;
        field_f = null;
        field_c = null;
    }

    s(bg param0) {
        ((s) this).field_d = null;
        try {
            ((s) this).field_a = param0;
            ((s) this).field_d = null;
            ((s) this).field_h = ((s) this).field_a.field_b.field_m;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "s.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new li(13, 0, 1, 0);
        field_g = "Please check if address is correct";
    }
}
