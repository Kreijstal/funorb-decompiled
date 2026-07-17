/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends tc {
    int field_m;
    int field_k;
    static String field_n;
    int field_s;
    static long[] field_u;
    float field_t;
    int field_o;
    int field_r;
    int field_q;
    static String field_v;
    int field_l;
    static int[] field_p;

    final static void e(int param0) {
        if (param0 != 17023) {
            field_p = null;
        }
        if (!(ra.field_e == null)) {
            ra.field_e.field_h = false;
        }
        ds.a(0, param0 ^ -16982);
    }

    public static void f(int param0) {
        field_p = null;
        int var1 = -70 / ((-47 - param0) / 52);
        field_u = null;
        field_v = null;
        field_n = null;
    }

    final boolean g(int param0) {
        int var2 = 75 / ((-13 - param0) / 54);
        return ((jb) this).field_k != -1 ? true : false;
    }

    final int a(byte param0, ej param1) {
        RuntimeException var3 = null;
        hw var3_ref = null;
        mn var4 = null;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (((jb) this).field_s != -1) {
                if (((jb) this).field_l == -1) {
                  L2: {
                    param1.field_U.a(((jb) this).field_q, (byte) -116, ((jb) this).field_s);
                    if (param1.field_U.field_m > 0) {
                      break L2;
                    } else {
                      if (((jb) this).field_k != 0) {
                        break L2;
                      } else {
                        ((jb) this).field_r = -2;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (0 != ((jb) this).field_k) {
                      param1.field_U.field_l = -((jb) this).field_s + ((jb) this).field_k;
                      param1.field_U.field_j = ((jb) this).field_o - ((jb) this).field_q;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = param1.field_U.a(param1.field_z, 103);
                  if (param1.a(var4, -125)) {
                    break L1;
                  } else {
                    ((jb) this).field_r = -2;
                    break L1;
                  }
                } else {
                  var3_ref = new hw(((jb) this).field_m, ((jb) this).field_s, ((jb) this).field_q, ((jb) this).field_l);
                  boolean discarded$1 = param1.a((mn) (Object) var3_ref, -124);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (param0 == 5) {
                break L4;
              } else {
                ((jb) this).field_o = 65;
                break L4;
              }
            }
            stackOut_14_0 = ((jb) this).field_r;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("jb.G(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0;
    }

    final void h(int param0) {
        ((jb) this).field_m = -1;
        ((jb) this).field_t = 1.401298464324817e-45f;
        ((jb) this).field_s = -1;
        ((jb) this).field_l = -1;
        ((jb) this).field_q = -1;
        ((jb) this).field_r = -1;
        ((jb) this).field_o = param0;
        ((jb) this).field_k = -1;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((jb) this).g(-25);
        }
        return ((jb) this).field_s != -1 ? true : false;
    }

    final static boolean a(char param0) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < 160) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 != 0) {
                var6 = ou.field_a;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param0) {
                      var3++;
                      continue L4;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "jb.F(" + param0 + 44 + 16150 + 41);
        }
        return stackIn_20_0 != 0;
    }

    jb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new long[32];
        field_v = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_n = "Dragonhide armour deflects fire and acts as a barrier to heat.";
        field_p = new int[8192];
    }
}
