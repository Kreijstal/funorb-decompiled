/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static hl field_b;
    static String field_c;
    static String field_a;

    final static boolean a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        var2 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (mj.field_d == 0) {
                sj.a(8192, (byte) 51);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var1_int = 0;
              de.field_j = true;
              if (0 == mj.field_d) {
                rk.field_e.a(pc.field_a, 100, 6144 * qm.field_c / 64, 8192);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (10 != mj.field_d) {
                break L3;
              } else {
                rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, 8192);
                break L3;
              }
            }
            L4: {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: while (true) {
              if (!pn.p(-126)) {
                int discarded$48 = 8158;
                int discarded$49 = 8158;
                di.field_d.a(gb.a(sf.field_c, ng.field_ob), (byte) 126, gb.a(dh.field_d, bj.field_y));
                int discarded$50 = 0;
                if (fn.a(true)) {
                  var1_int = 1;
                  stackOut_18_0 = var1_int;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  return var1_int != 0;
                }
              } else {
                di.field_d.c((byte) 6);
                int discarded$51 = 0;
                if (!fn.a(false)) {
                  continue L5;
                } else {
                  var1_int = 1;
                  stackOut_14_0 = var1_int;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "mm.F(" + -59 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        he.field_x = param2;
        int var5 = -76 % ((-35 - param0) / 47);
        ok.field_a = param4;
        je.field_b = param1;
        vk.field_t = param3;
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param0 != 64) {
            field_b = null;
            return dj.a(param0 + 6381);
        }
        return dj.a(param0 + 6381);
    }

    final static boolean a(int param0, int param1) {
        int var3 = 0;
        mf var4 = null;
        var3 = EscapeVector.field_A;
        if (!fa.field_c[param1]) {
          var4 = fi.field_j;
          if (5 != param1) {
            if (param1 == 4) {
              if (se.field_b == null) {
                fn.a((byte) 53);
                return true;
              } else {
                sl.field_b[param1] = se.field_b.field_g;
                pf.field_g[param1] = se.field_b.field_d;
                fa.field_c[param1] = true;
                fn.a((byte) 53);
                return true;
              }
            } else {
              if (!var4.a(0, da.field_d[param1])) {
                return false;
              } else {
                int discarded$4 = 1;
                tk.field_a[param1] = fe.a(da.field_d[param1], var4, "texture");
                int discarded$5 = 1;
                dd.field_a[param1] = fe.a(da.field_d[param1], var4, "frosting");
                dd.field_a[param1].c();
                int discarded$6 = 0;
                dm.a(var4, param1);
                fa.field_c[param1] = true;
                fn.a((byte) 53);
                return true;
              }
            }
          } else {
            int discarded$7 = 5;
            en.a(var4);
            fn.a((byte) 53);
            return true;
          }
        } else {
          return true;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (var2_int <= 20) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var10 = new char[var2_int];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_21_0 = new String(var10);
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L4;
                    } else {
                      if (90 < var5) {
                        break L4;
                      } else {
                        var3[var4] = (char)(-65 + var5 - -97);
                        var4++;
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5 < 97) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (var5 <= 57) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var3[var4] = '_';
                    var4++;
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  var4++;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("mm.B(").append(0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_22_0;
    }

    public static void b() {
        int var1 = 0;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Logging in...";
        field_c = "Create your own free Jagex account";
    }
}
