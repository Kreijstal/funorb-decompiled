/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static boolean field_k;
    static String field_e;
    static int field_b;
    static int field_d;
    static ut[] field_a;
    static String field_i;
    static int field_j;
    static double field_c;
    static String field_f;
    static int field_h;
    static byte[][] field_g;
    static ut field_l;

    final static long a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        long stackIn_5_0 = 0L;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0L;
            var5 = param0;
            L1: while (true) {
              if (var2_int <= var5) {
                stackIn_5_0 = var3;
                break L0;
              } else {
                var3 = -var3 + ((var3 << 1347056389) + (long)param1.charAt(var5));
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("vb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    public static void a(int param0) {
        field_f = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_g = (byte[][]) null;
        field_a = null;
        if (param0 != 0) {
            field_c = 0.39487605170744977;
        }
    }

    final static boolean b(int param0) {
        if (param0 < 117) {
            return false;
        }
        return null != jl.field_f ? true : false;
    }

    final static void a(boolean param0) {
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (-1 == (rm.field_C ^ -1)) {
                bv.field_l = null;
                break L1;
              } else {
                if (!vi.field_n) {
                  bv.field_l = null;
                  break L1;
                } else {
                  if (-2 != (rm.field_C ^ -1)) {
                    if (-3 != (rm.field_C ^ -1)) {
                      if ((rm.field_C ^ -1) != -4) {
                        break L1;
                      } else {
                        bv.field_l = null;
                        break L1;
                      }
                    } else {
                      bv.field_l = new rk[34];
                      var1_int = 0;
                      var2 = 0;
                      L2: while (true) {
                        if (-18 >= (var2 ^ -1)) {
                          var1_int = 0;
                          var2 = 17;
                          L3: while (true) {
                            if ((var2 ^ -1) <= -35) {
                              break L1;
                            } else {
                              if (p.a((byte) -24, 3) != 0) {
                                var3 = 1424;
                                var4 = p.a((byte) -24, 5);
                                var5 = p.a((byte) -24, 100);
                                bv.field_l[var2] = new rk(var1_int - -var4, var3 - -var5, 4);
                                var1_int += 54;
                                var2++;
                                continue L3;
                              } else {
                                var1_int += 54;
                                var2++;
                                continue L3;
                              }
                            }
                          }
                        } else {
                          stackIn_21_0 = p.a((byte) -24, 3) ^ -1;

                          stackIn_21_1 = -1;

                          L4: {
                            if (stackIn_21_0 != stackIn_21_1) {
                              var3 = -170;
                              var4 = p.a((byte) -24, 5);
                              var5 = p.a((byte) -24, 100);
                              bv.field_l[var2] = new rk(var4 + var1_int, var5 + var3, 0);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1_int += 54;
                          var2++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    bv.field_l = new rk[30];
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= bv.field_l.length) {
                        break L1;
                      } else {
                        L8: {
                          if (ih.field_c != 2) {
                            stackIn_11_0 = -60;
                            break L8;
                          } else {
                            stackIn_11_0 = -120;
                            break L8;
                          }
                        }
                        L9: {
                          var2 = stackIn_11_0;
                          var2 = el.a(29430, 15, var2);
                          var3 = 20 + var1_int * 45;
                          var4 = 6;
                          if (0 == p.a((byte) -24, 2)) {
                            var4 = 2;
                            var2 = 896 + -var2;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        bv.field_l[var1_int] = new rk(var2, var3, var4);
                        var1_int++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
            L10: {
              if (param0) {
                break L10;
              } else {
                vb.b(-46);
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "vb.B(" + param0 + ')');
        }
    }

    static {
        field_e = "Go Back";
        field_b = 0;
        field_i = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_f = "Camera unlocked. Press 'Shift' + 'Enter' to attach.";
        field_c = Math.atan2(1.0, 0.0);
        field_g = new byte[1000][];
    }
}
