/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class nh extends sk {
    static pf field_g;
    static int[] field_d;
    static char[] field_e;
    private String field_i;
    static int field_f;
    static int field_h;
    private long field_j;

    final static boolean a(int param0, boolean param1) {
        L0: {
          if (null != am.field_c) {
            break L0;
          } else {
            am.field_c = il.field_v.a(df.field_j, (byte) 34, ue.field_d);
            break L0;
          }
        }
        if (-1 != am.field_c.field_f) {
          L1: {
            long dupTemp$2 = ih.a((byte) -98);
            t.field_d = dupTemp$2;
            ka.field_o = dupTemp$2;
            if (-2 != am.field_c.field_f) {
              break L1;
            } else {
              break L1;
            }
          }
          sl.field_d = lh.field_n;
          am.field_c = null;
          return true;
        } else {
          return false;
        }
    }

    ua a(int param0) {
        if (param0 != 160) {
            nh.c(-105);
        }
        return ea.field_o;
    }

    final void a(int param0, ka param1) {
        try {
            param1.a((byte) 122, ((nh) this).field_j);
            if (param0 != 95) {
                ua discarded$0 = ((nh) this).a(-10);
            }
            param1.a(false, ((nh) this).field_i);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "nh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
    }

    final static void a(le param0, byte param1, int param2) {
        int var4 = 0;
        ha var5 = pg.field_fb;
        var5.f(6, 950);
        try {
            var5.field_k = var5.field_k + 1;
            var4 = var5.field_k;
            var5.a(false, 1);
            if (param0.field_p == null) {
                var5.a(false, 0);
            } else {
                var5.a(false, param0.field_p.length);
                var5.a(param0.field_p.length, 0, (byte) -13, param0.field_p);
            }
            int discarded$0 = var5.c(var4, (byte) -3);
            var5.field_k = var5.field_k - 4;
            param0.field_o = var5.b(false);
            var5.a(-var4 + var5.field_k, (byte) 70);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "nh.L(" + (param0 != null ? "{...}" : "null") + ',' + -30 + ',' + 6 + ')');
        }
    }

    final static String a(CharSequence param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_29_0 = null;
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
        Object stackOut_28_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var9 = stellarshard.field_B;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!sk.a(param0.charAt(var2_int), -109)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!sk.a(param0.charAt(var3 + -1), -118)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = var3 + -var2_int;
                  if (1 <= var4) {
                    if (12 >= var4) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var3 <= var6) {
                          if (var5.length() != 0) {
                            stackOut_30_0 = var5.toString();
                            stackIn_31_0 = stackOut_30_0;
                            break L0;
                          } else {
                            stackOut_28_0 = null;
                            stackIn_29_0 = stackOut_28_0;
                            return (String) (Object) stackIn_29_0;
                          }
                        } else {
                          L6: {
                            var7 = param0.charAt(var6);
                            if (s.a(45, (char) var7)) {
                              var8 = of.a(-119, (char) var7);
                              if (var8 != 0) {
                                StringBuilder discarded$2 = var5.append((char) var8);
                                break L6;
                              } else {
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
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var2;
            stackOut_32_1 = new StringBuilder().append("nh.D(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L7;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + false + ')');
        }
        return stackIn_31_0;
    }

    final static void c(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            var5 = tg.field_a;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                L2: {
                  if (param0 <= -17) {
                    break L2;
                  } else {
                    field_h = 114;
                    break L2;
                  }
                }
                break L0;
              } else {
                int incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                int incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                int incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                int incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                int incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                int incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                int incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                int incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1_ref, "nh.K(" + param0 + ')');
        }
    }

    nh(long param0, String param1) {
        try {
            ((nh) this).field_j = param0;
            ((nh) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "nh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_d = new int[8192];
    }
}
