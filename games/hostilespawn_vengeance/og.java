/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static String field_e;
    static int field_c;
    static int[] field_b;
    double field_f;
    double field_a;
    static bd field_d;

    final void a(int param0, byte param1, double param2) {
        Object var6 = null;
        param2 = param2 * 0.02454369260617026;
        if (param1 != 94) {
          var6 = null;
          og.a((byte) 120, (oc) null);
          ((og) this).field_f = ((og) this).field_f + (double)(-param0) * Math.sin(param2) / 20.0;
          ((og) this).field_a = ((og) this).field_a + Math.cos(param2) * (double)(-param0) / 20.0;
          return;
        } else {
          ((og) this).field_f = ((og) this).field_f + (double)(-param0) * Math.sin(param2) / 20.0;
          ((og) this).field_a = ((og) this).field_a + Math.cos(param2) * (double)(-param0) / 20.0;
          return;
        }
    }

    final boolean[] a(int param0, double param1, oc param2, boolean param3, id param4) {
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        boolean[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!param3) {
              stackOut_3_0 = ((og) this).a(25302, false, param1, param0, param4, 1, param2);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (boolean[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("og.J(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final boolean[] a(double param0, oc param1, int param2, id param3, byte param4) {
        RuntimeException var7 = null;
        boolean[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param4 < -63) {
                break L1;
              } else {
                ((og) this).field_f = 2.317784439522071;
                break L1;
              }
            }
            stackOut_2_0 = ((og) this).a(25302, false, param0, param2, param3, 0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("og.K(").append(param0).append(44);
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param4 + 41);
        }
        return stackIn_3_0;
    }

    final void a(og param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((og) this).field_f = param0.field_f;
              ((og) this).field_a = param0.field_a;
              if (param1 == -28860) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("og.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ne var4 = null;
        de var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = (ne) (Object) n.field_v.g(-97);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 == -22248) {
                    break L2;
                  } else {
                    og.a(-73, 61);
                    break L2;
                  }
                }
                var5 = (de) (Object) ke.field_B.g(-47);
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    km.a(var5, -19746, param1);
                    var5 = (de) (Object) ke.field_B.a(12684);
                    continue L3;
                  }
                }
              } else {
                bl.a(1, var4, param1);
                var4 = (ne) (Object) n.field_v.a(12684);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "og.A(" + param0 + 44 + param1 + 41);
        }
    }

    final boolean[] a(oc param0, double param1, int param2, int param3, id param4) {
        RuntimeException var7 = null;
        boolean[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                ((og) this).a(-128, (byte) 30, 0.14322233202140824);
                break L1;
              }
            }
            stackOut_2_0 = ((og) this).a(25302, true, param1, param3, param4, 1, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("og.I(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(double param0, double param1, int param2) {
        ((og) this).field_a = param0;
        if (param2 != 1) {
            og.a(47, -122);
            ((og) this).field_f = param1;
            return;
        }
        ((og) this).field_f = param1;
    }

    final static void a(byte param0, oc param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            vi.field_p = new oj[17];
            vi.field_p[0] = new oj(param1, 8, rl.field_c);
            vi.field_p[0].field_I = 1000;
            var2_int = 1;
            var3 = -18 % ((param0 - -14) / 46);
            L1: while (true) {
              if (vi.field_p.length <= var2_int) {
                var2_int = -1 + vi.field_p.length;
                L2: while (true) {
                  if (var2_int < 0) {
                    break L0;
                  } else {
                    mm.field_m[el.field_j] = vi.field_p[var2_int];
                    el.field_j = el.field_j + 1;
                    var2_int--;
                    continue L2;
                  }
                }
              } else {
                vi.field_p[var2_int] = new oj(param1, 231, rl.field_c);
                vi.field_p[var2_int].field_I = 200;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("og.F(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final boolean[] a(int param0, boolean param1, double param2, int param3, id param4, int param5, oc param6) {
        RuntimeException var9 = null;
        double var9_double = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        int var24_int = 0;
        double var24 = 0.0;
        int var25 = 0;
        int var26_int = 0;
        double var26 = 0.0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        Object var33 = null;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        boolean[] stackIn_62_0 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        boolean[] stackOut_61_0 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var32 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_double = 3.141592653589793 * param2 / 128.0;
              if (param0 == 25302) {
                break L1;
              } else {
                var33 = null;
                boolean[] discarded$1 = ((og) this).a(-112, 0.23920950584503275, (oc) null, true, (id) null);
                break L1;
              }
            }
            L2: {
              var11 = Math.sin(var9_double) * (double)(-param3) / 40.0;
              if (var11 <= -0.01) {
                break L2;
              } else {
                if (var11 < 0.01) {
                  var11 = 0.0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var13 = Math.cos(var9_double) * (double)(-param3) / 40.0;
              if (var13 <= -0.01) {
                break L3;
              } else {
                if (0.01 > var13) {
                  var13 = 0.0;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var15 = var11;
              var17 = var13;
              var19 = param6.b(-4);
              var20 = var11;
              if (var11 * (((og) this).field_f - 0.5) <= 0.0) {
                var20 = 0.0;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var22 = var13;
              if (var13 * (((og) this).field_a - 0.5) <= 0.0) {
                var22 = 0.0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              L7: {
                if (var20 != 0.0) {
                  break L7;
                } else {
                  if (var22 != 0.0) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                if (0.0 <= var20) {
                  if (var20 > 0.0) {
                    stackOut_24_0 = 1;
                    stackIn_25_0 = stackOut_24_0;
                    break L8;
                  } else {
                    stackOut_23_0 = 0;
                    stackIn_25_0 = stackOut_23_0;
                    break L8;
                  }
                } else {
                  stackOut_21_0 = -1;
                  stackIn_25_0 = stackOut_21_0;
                  break L8;
                }
              }
              L9: {
                var24_int = stackIn_25_0;
                if (var22 >= 0.0) {
                  if (0.0 >= var22) {
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    break L9;
                  } else {
                    stackOut_28_0 = param4.field_d;
                    stackIn_30_0 = stackOut_28_0;
                    break L9;
                  }
                } else {
                  stackOut_26_0 = -param4.field_d;
                  stackIn_30_0 = stackOut_26_0;
                  break L9;
                }
              }
              L10: {
                var25 = stackIn_30_0;
                var26_int = var19 - -var24_int;
                var27 = var26_int - -var25;
                var28 = var25 + var19;
                if (param1) {
                  stackOut_32_0 = param4.b(param5, 5857, var27);
                  stackIn_33_0 = stackOut_32_0;
                  break L10;
                } else {
                  stackOut_31_0 = param4.c(param5, -2, var27);
                  stackIn_33_0 = stackOut_31_0;
                  break L10;
                }
              }
              L11: {
                var29 = stackIn_33_0;
                if (param1) {
                  stackOut_35_0 = param4.b(param5, param0 ^ 29751, var26_int);
                  stackIn_36_0 = stackOut_35_0;
                  break L11;
                } else {
                  stackOut_34_0 = param4.c(param5, param0 ^ -25304, var26_int);
                  stackIn_36_0 = stackOut_34_0;
                  break L11;
                }
              }
              L12: {
                var30 = stackIn_36_0;
                if (param1) {
                  stackOut_38_0 = param4.b(param5, 5857, var28);
                  stackIn_39_0 = stackOut_38_0;
                  break L12;
                } else {
                  stackOut_37_0 = param4.c(param5, -2, var28);
                  stackIn_39_0 = stackOut_37_0;
                  break L12;
                }
              }
              var31 = stackIn_39_0;
              if (var29 > 1) {
                if (1 >= var30) {
                  var22 = 0.0;
                  var13 = 0.0;
                  break L6;
                } else {
                  if (var31 > 1) {
                    var20 = 0.0;
                    var22 = 0.0;
                    var11 = 0.0;
                    var13 = 0.0;
                    break L6;
                  } else {
                    var20 = 0.0;
                    var11 = 0.0;
                    break L6;
                  }
                }
              } else {
                L13: {
                  if (var30 <= 1) {
                    break L13;
                  } else {
                    var20 = 0.0;
                    var11 = 0.0;
                    break L13;
                  }
                }
                if (1 < var31) {
                  var13 = 0.0;
                  var22 = 0.0;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L14: {
              ((og) this).field_a = ((og) this).field_a + var13;
              ((og) this).field_f = ((og) this).field_f + var11;
              var24 = var11 - var15;
              if (0.0 > var24) {
                var24 = -var24;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var26 = -var17 + var13;
              if (0.0 <= var26) {
                break L15;
              } else {
                var26 = -var26;
                break L15;
              }
            }
            L16: {
              if (0.01 >= var24) {
                stackOut_57_0 = 0;
                stackIn_58_0 = stackOut_57_0;
                break L16;
              } else {
                stackOut_56_0 = 1;
                stackIn_58_0 = stackOut_56_0;
                break L16;
              }
            }
            L17: {
              var28 = stackIn_58_0;
              if (0.01 >= var26) {
                stackOut_60_0 = 0;
                stackIn_61_0 = stackOut_60_0;
                break L17;
              } else {
                stackOut_59_0 = 1;
                stackIn_61_0 = stackOut_59_0;
                break L17;
              }
            }
            var29 = stackIn_61_0;
            stackOut_61_0 = new boolean[]{var28 != 0, var29 != 0};
            stackIn_62_0 = stackOut_61_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var9;
            stackOut_63_1 = new StringBuilder().append("og.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param4 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L18;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L18;
            }
          }
          L19: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(44).append(param5).append(44);
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param6 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L19;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L19;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 41);
        }
        return stackIn_62_0;
    }

    public final String toString() {
        return "(" + oc.a(-1, ((og) this).field_f) + "," + oc.a(-1, ((og) this).field_a) + ")";
    }

    final void b(double param0, double param1, int param2) {
        if (param2 <= 92) {
          ((og) this).a(41, (byte) -101, 1.4898316096248228);
          param1 = param1 * 0.02454369260617026;
          ((og) this).field_f = ((og) this).field_f + Math.sin(param1) * -param0 / 20.0;
          ((og) this).field_a = ((og) this).field_a + Math.cos(param1) * -param0 / 20.0;
          return;
        } else {
          param1 = param1 * 0.02454369260617026;
          ((og) this).field_f = ((og) this).field_f + Math.sin(param1) * -param0 / 20.0;
          ((og) this).field_a = ((og) this).field_a + Math.cos(param1) * -param0 / 20.0;
          return;
        }
    }

    public static void a() {
        field_d = null;
        field_e = null;
        field_b = null;
    }

    og() {
        ((og) this).field_f = 0.0;
        ((og) this).field_a = 0.0;
    }

    og(og param0) {
        try {
            ((og) this).field_f = param0.field_f;
            ((og) this).field_a = param0.field_a;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "og.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Vengeance";
        og discarded$0 = new og();
    }
}
