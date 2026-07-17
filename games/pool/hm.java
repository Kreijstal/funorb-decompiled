/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    int field_f;
    int field_c;
    static nl field_k;
    static int field_e;
    private static int field_i;
    int field_b;
    static String field_g;
    int field_h;
    static String field_d;
    static int field_j;
    static dd[] field_l;
    static long field_a;

    final void a(ge param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (((hm) this).field_b >= 16777216) {
                break L1;
              } else {
                if (((hm) this).field_b > -16777216) {
                  if (param1 == 123) {
                    L2: {
                      if (((hm) this).field_f >= 16777216) {
                        break L2;
                      } else {
                        if (16777215 <= ((hm) this).field_f) {
                          break L2;
                        } else {
                          L3: {
                            if (-16777217 <= ((hm) this).field_h) {
                              break L3;
                            } else {
                              if (((hm) this).field_h > -16777216) {
                                L4: {
                                  if (((hm) this).field_c >= 16777216) {
                                    break L4;
                                  } else {
                                    if (((hm) this).field_c > -16777216) {
                                      param0.b(((hm) this).field_b, param1 + -2);
                                      param0.b(((hm) this).field_f, 65);
                                      param0.b(((hm) this).field_h, param1 + -44);
                                      param0.b(((hm) this).field_c, 109);
                                      break L0;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                throw new IllegalStateException("fpquaternion out of range for state dump.");
                              } else {
                                break L3;
                              }
                            }
                          }
                          throw new IllegalStateException("fpquaternion out of range for state dump.");
                        }
                      }
                    }
                    throw new IllegalStateException("fpquaternion out of range for state dump.");
                  } else {
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalStateException("fpquaternion out of range for state dump.");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) runtimeException;
            stackOut_20_1 = new StringBuilder().append("hm.E(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        var2 = aj.a(((hm) this).field_b, false, ((hm) this).field_b) - (-aj.a(((hm) this).field_f, false, ((hm) this).field_f) - (aj.a(((hm) this).field_h, false, ((hm) this).field_h) + aj.a(((hm) this).field_c, false, ((hm) this).field_c)));
        if (param0) {
          if (var2 >= 65535) {
            if (65537 < var2) {
              var2 = rf.a(var2, -127);
              ((hm) this).field_b = lh.a(var2, (byte) -76, (long)((hm) this).field_b);
              ((hm) this).field_f = lh.a(var2, (byte) -62, (long)((hm) this).field_f);
              ((hm) this).field_h = lh.a(var2, (byte) -71, (long)((hm) this).field_h);
              ((hm) this).field_c = lh.a(var2, (byte) -69, (long)((hm) this).field_c);
              return;
            } else {
              return;
            }
          } else {
            var2 = rf.a(var2, -127);
            ((hm) this).field_b = lh.a(var2, (byte) -76, (long)((hm) this).field_b);
            ((hm) this).field_f = lh.a(var2, (byte) -62, (long)((hm) this).field_f);
            ((hm) this).field_h = lh.a(var2, (byte) -71, (long)((hm) this).field_h);
            ((hm) this).field_c = lh.a(var2, (byte) -69, (long)((hm) this).field_c);
            return;
          }
        } else {
          field_d = null;
          if (var2 < 65535) {
            var2 = rf.a(var2, -127);
            ((hm) this).field_b = lh.a(var2, (byte) -76, (long)((hm) this).field_b);
            ((hm) this).field_f = lh.a(var2, (byte) -62, (long)((hm) this).field_f);
            ((hm) this).field_h = lh.a(var2, (byte) -71, (long)((hm) this).field_h);
            ((hm) this).field_c = lh.a(var2, (byte) -69, (long)((hm) this).field_c);
            return;
          } else {
            L0: {
              if (65537 >= var2) {
                break L0;
              } else {
                var2 = rf.a(var2, -127);
                ((hm) this).field_b = lh.a(var2, (byte) -76, (long)((hm) this).field_b);
                ((hm) this).field_f = lh.a(var2, (byte) -62, (long)((hm) this).field_f);
                ((hm) this).field_h = lh.a(var2, (byte) -71, (long)((hm) this).field_h);
                ((hm) this).field_c = lh.a(var2, (byte) -69, (long)((hm) this).field_c);
                break L0;
              }
            }
            return;
          }
        }
    }

    final void a(int param0, hm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3_int = aj.a(((hm) this).field_b, false, param1.field_b) + (-aj.a(((hm) this).field_f, false, param1.field_f) + -aj.a(((hm) this).field_h, false, param1.field_h) - aj.a(((hm) this).field_c, false, param1.field_c));
              if (param0 == 3) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var4 = aj.a(((hm) this).field_f, false, param1.field_b) + (aj.a(((hm) this).field_b, false, param1.field_f) - -aj.a(((hm) this).field_c, false, param1.field_h)) - aj.a(((hm) this).field_h, false, param1.field_c);
            var5 = aj.a(((hm) this).field_h, false, param1.field_b) + -aj.a(((hm) this).field_c, false, param1.field_f) - -aj.a(((hm) this).field_b, false, param1.field_h) + aj.a(((hm) this).field_f, false, param1.field_c);
            ((hm) this).field_c = aj.a(((hm) this).field_c, false, param1.field_b) + (aj.a(((hm) this).field_h, false, param1.field_f) - (aj.a(((hm) this).field_f, false, param1.field_h) + -aj.a(((hm) this).field_b, false, param1.field_c)));
            ((hm) this).field_b = var3_int;
            ((hm) this).field_f = var4;
            ((hm) this).field_h = var5;
            ((hm) this).b(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("hm.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final void a(int[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3_int = aj.a(((hm) this).field_b, false, ((hm) this).field_b);
            var4 = aj.a(((hm) this).field_f, false, ((hm) this).field_b);
            var5 = aj.a(((hm) this).field_h, false, ((hm) this).field_b);
            var6 = aj.a(((hm) this).field_c, false, ((hm) this).field_b);
            var7 = aj.a(((hm) this).field_f, false, ((hm) this).field_f);
            var8 = aj.a(((hm) this).field_h, false, ((hm) this).field_f);
            var9 = aj.a(((hm) this).field_c, false, ((hm) this).field_f);
            if (param1 <= -36) {
              var10 = aj.a(((hm) this).field_h, false, ((hm) this).field_h);
              var11 = aj.a(((hm) this).field_c, false, ((hm) this).field_h);
              var12 = aj.a(((hm) this).field_c, false, ((hm) this).field_c);
              param0[3] = -var10 + (var3_int + var7 - var12);
              param0[5] = var9 + (-var5 + var9 - var5);
              param0[4] = var6 + (var8 + (var8 + var6));
              param0[9] = var9 + (var5 + var9 + var5);
              param0[7] = -var7 + var10 - (-var3_int + var12);
              param0[10] = var11 + (-var4 + var11) - var4;
              param0[6] = -var6 + (-var6 + var8 - -var8);
              param0[8] = var4 + var11 + (var4 + var11);
              param0[11] = var3_int + var12 - (var10 + var7);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("hm.K(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
    }

    final void b(int param0, hm param1) {
        try {
            ((hm) this).field_f = param1.field_f;
            ((hm) this).field_h = param1.field_h;
            ((hm) this).field_c = param1.field_c;
            if (param0 != 0) {
                ((hm) this).a(true);
            }
            ((hm) this).field_b = param1.field_b;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "hm.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0) {
        System.out.print("[");
        int discarded$36 = 7697781;
        System.out.print(lo.a((long)((hm) this).field_b));
        System.out.print(",");
        int discarded$70 = 7697781;
        System.out.print(lo.a((long)((hm) this).field_f));
        System.out.print(",");
        int discarded$93 = 7697781;
        System.out.print(lo.a((long)((hm) this).field_h));
        System.out.print(",");
        int discarded$105 = 7697781;
        System.out.print(lo.a((long)((hm) this).field_c));
        System.out.print("]");
        if (param0 >= -19) {
            field_i = -79;
        }
    }

    final void a(boolean param0, ge param1) {
        try {
            ((hm) this).field_b = param1.l(0);
            ((hm) this).field_f = param1.l(0);
            if (param0) {
                ((hm) this).b(96);
            }
            ((hm) this).field_h = param1.l(0);
            ((hm) this).field_c = param1.l(0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "hm.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    hm(int param0, int param1, int param2, int param3) {
        ((hm) this).field_c = param3;
        ((hm) this).field_f = param1;
        ((hm) this).field_b = param0;
        ((hm) this).field_h = param2;
    }

    public static void a(int param0) {
        int var1 = -69 / ((param0 - 2) / 61);
        field_k = null;
        field_d = null;
        field_l = null;
        field_g = null;
    }

    final void a(boolean param0) {
        ((hm) this).field_f = 0;
        ((hm) this).field_c = 0;
        ((hm) this).field_h = 0;
        ((hm) this).field_b = 65536;
        if (param0) {
            ((hm) this).field_f = 106;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        param4 = param4 >> 1;
        var6 = ao.a(param4, true);
        var7 = hc.a(2047, param4);
        ((hm) this).field_b = var7;
        ((hm) this).field_f = aj.a(var6, false, param1);
        ((hm) this).field_h = aj.a(var6, false, param2);
        if (param0 <= 46) {
          ((hm) this).a(32, -115, -18, -75, 3);
          ((hm) this).field_c = aj.a(var6, false, param3);
          return;
        } else {
          ((hm) this).field_c = aj.a(var6, false, param3);
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        if (!(!oj.c(-26))) {
            param0 = false;
        }
        wj.a(-114, param0);
        int discarded$0 = -97;
        ka.b();
    }

    public hm() {
        ((hm) this).field_b = 65536;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new nl();
        field_j = 49;
        field_i = 8;
        field_d = "Email address is unavailable";
        field_e = 1 << field_i;
        field_g = "Try changing the following settings:  ";
    }
}
