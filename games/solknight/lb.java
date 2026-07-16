/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ld {
    private boolean field_X;
    private String field_S;
    private boolean field_Z;
    private c field_Y;
    private String field_U;
    static String field_W;
    static int[] field_V;
    static String field_T;

    final void f(byte param0) {
        ((lb) this).field_Z = true;
        int var2 = -94 % ((17 - param0) / 46);
        ((lb) this).field_Y.field_B = false;
    }

    lb(i param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((lb) this).field_S = param1;
        if (null != ((lb) this).field_S) {
            var3 = uc.field_g.b(((lb) this).field_S, 260, uc.field_g.field_F);
            ((lb) this).b(300, -2038584927, 150 - -var3);
        }
        ((lb) this).field_Y = new c(13, 50, 274, 30, 15, 2113632, 4210752);
        ((lb) this).field_Z = false;
        ((lb) this).field_X = false;
        ((lb) this).field_Y.field_B = true;
        ((lb) this).a((rc) (Object) ((lb) this).field_Y, 5411);
    }

    final static boolean g(byte param0) {
        if (param0 != -94) {
            field_W = null;
        }
        rh.field_f = true;
        kj.field_I = je.a(1) - -15000L;
        return -12 == (fj.field_i ^ -1) ? true : false;
    }

    public static void m(int param0) {
        field_T = null;
        field_W = null;
        if (param0 <= 118) {
            return;
        }
        field_V = null;
    }

    final static boolean b(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_16_0 = 0;
            var7 = SolKnight.field_L ? 1 : 0;
            if (me.field_g) {
              return true;
            } else {
              L0: {
                if (param1 == 6669) {
                  break L0;
                } else {
                  lb.m(14);
                  break L0;
                }
              }
              try {
                L1: {
                  var2 = "tuhstatbut";
                  var3 = (String) fd.a(param0, "getcookies", (byte) 94);
                  var4 = b.a(var3, ';', true);
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      break L1;
                    } else {
                      L3: {
                        var6 = var4[var5].indexOf('=');
                        if (0 > var6) {
                          break L3;
                        } else {
                          if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            return stackIn_11_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var2_ref = decompiledCaughtException;
                  break L4;
                }
              }
              L5: {
                if (param0.getParameter("tuhstatbut") == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L5;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L5;
                }
              }
              return stackIn_18_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static o a(int param0, o param1, int param2, int param3, int param4, int param5) {
        o var6 = new o(0, param4);
        var6.field_t = param1.field_t;
        var6.field_p = param1.field_p;
        var6.field_r = param1.field_r - (-param5 + -param0);
        var6.field_n = param5 + param1.field_n;
        var6.field_q = param3 + param1.field_q - -param2;
        var6.field_v = param1.field_v;
        var6.field_s = param1.field_s - -param2;
        return var6;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 90 / ((param1 - -55) / 39);
        super.a(param0, (byte) 52, param2);
        uc.field_g.a(((lb) this).field_U, (((lb) this).field_t >> 91607137) + param0, param2 - -103, 16777215, -1);
        if (!(((lb) this).field_S == null)) {
            mi.b(param0 + 20, -7 + (120 + param2), 260, 8421504);
            int discarded$0 = uc.field_g.a(((lb) this).field_S, param0 - -20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, uc.field_g.field_F);
        }
    }

    final void a(String param0, boolean param1, float param2, int param3) {
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          if (param1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          if (stackIn_3_0 == (((lb) this).field_X ? 1 : 0)) {
            L2: {
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (!param1) {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L2;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L2;
              }
            }
            ((lb) this).field_X = stackIn_8_1 != 0;
            if (((lb) this).field_X) {
              ((lb) this).field_Y.a((byte) 69, 4210752, 8405024);
              ((lb) this).field_Y.field_B = true;
              break L1;
            } else {
              ((lb) this).field_Y.a((byte) -127, 4210752, 2113632);
              if (((lb) this).field_Z) {
                ((lb) this).field_Y.field_B = false;
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
        L3: {
          ((lb) this).field_U = param0;
          ((lb) this).field_Y.field_R = (int)(param2 / 100.0f * 65536.0f);
          if (param3 > 124) {
            break L3;
          } else {
            ((lb) this).field_Y = null;
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Resume Game";
        field_V = new int[128];
    }
}
