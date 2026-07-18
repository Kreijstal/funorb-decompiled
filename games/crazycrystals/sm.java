/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class sm extends l {
    static int field_f;
    static int field_j;
    private int field_g;
    static String field_h;
    static int field_i;
    static int field_e;

    public static void b() {
        field_h = null;
    }

    final static String a(long param0, byte param1) {
        an.field_t.setTime(new Date(param0));
        int var3 = an.field_t.get(7);
        if (param1 <= 120) {
            Object var10 = null;
            byte[] discarded$0 = sm.a(-128, (byte[]) null);
        }
        int var4 = an.field_t.get(5);
        int var5 = an.field_t.get(2);
        int var6 = an.field_t.get(1);
        int var7 = an.field_t.get(11);
        int var8 = an.field_t.get(12);
        int var9 = an.field_t.get(13);
        return ed.field_y[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + mn.field_l[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_26_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_30_0 = null;
        String stackOut_25_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = fe.a(60136, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (am.a(var4.charAt(0), (byte) 100)) {
                              break L3;
                            } else {
                              if (!am.a(var4.charAt(var4.length() - 1), (byte) 26)) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (~var6 <= ~param2.length()) {
                                    var6 = 0;
                                    if (var5 > 0) {
                                      stackOut_30_0 = on.field_a;
                                      stackIn_31_0 = stackOut_30_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param2.charAt(var6);
                                      if (am.a((char) var7, (byte) 125)) {
                                        var5++;
                                        break L5;
                                      } else {
                                        var5 = 0;
                                        break L5;
                                      }
                                    }
                                    if (2 > var5) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_25_0 = fe.field_e;
                                      stackIn_26_0 = stackOut_25_0;
                                      return stackIn_26_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_17_0 = on.field_a;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = om.field_v;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_7_0 = om.field_v;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = om.field_v;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("sm.E(").append(127).append(',').append(false).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_31_0;
    }

    final static int d(byte param0) {
        int var1 = -39 / ((param0 - -26) / 39);
        return (int)(1000000000L / s.field_k);
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -35 / ((-86 - param0) / 36);
            var3 = param1.length;
            var4 = new byte[var3];
            eg.a(param1, 0, var4, 0, var3);
            stackOut_0_0 = (byte[]) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("sm.H(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final l a(int param0) {
        if (li.field_a != null) {
            if (li.field_a.field_l != null) {
                if (180 <= li.field_a.field_f) {
                    return (l) this;
                }
            }
        }
        nj.field_k = kk.field_a[0].length;
        ij.a(0, param0, 0, kk.field_a);
        nj.field_k = 0;
        if (!(((sm) this).field_g < 60)) {
            jj.field_b = jj.field_b + -(~jj.field_b >> 3);
            if (jj.field_b >= kk.field_l) {
                kk.field_a = null;
                bd.a((byte) 35, true);
                kj.a((byte) 91);
                return null;
            }
        }
        ((sm) this).field_g = ((sm) this).field_g + 1;
        return (l) this;
    }

    final l b(byte param0) {
        kk.field_a = null;
        bd.a((byte) 35, false);
        kj.a((byte) 36);
        if (param0 == -90) {
            return null;
        }
        return null;
    }

    sm() {
        ((sm) this).field_g = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 256;
        field_h = "?";
        field_i = -1;
    }
}
