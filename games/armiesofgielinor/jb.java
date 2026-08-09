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
            field_p = (int[]) null;
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
        return 0 != (this.field_k ^ -1) ? true : false;
    }

    final int a(byte param0, ej param1) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        hw var3 = null;
        RuntimeException var3_ref = null;
        mn var4 = null;
        try {
          L0: {
            L1: {
              if (0 != (this.field_s ^ -1)) {
                if ((this.field_l ^ -1) == 0) {
                  L2: {
                    param1.field_U.a(this.field_q, (byte) -116, this.field_s);
                    if (-1 > (param1.field_U.field_m ^ -1)) {
                      break L2;
                    } else {
                      if ((this.field_k ^ -1) != 0) {
                        break L2;
                      } else {
                        this.field_r = -2;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (0 != (this.field_k ^ -1)) {
                      param1.field_U.field_l = -this.field_s + this.field_k;
                      param1.field_U.field_j = this.field_o - this.field_q;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = param1.field_U.a(param1.field_z, 103);
                  if (param1.a(var4, -125)) {
                    break L1;
                  } else {
                    this.field_r = -2;
                    break L1;
                  }
                } else {
                  var3 = new hw(this.field_m, this.field_s, this.field_q, this.field_l);
                  param1.a(var3, -124);
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
                this.field_o = 65;
                break L4;
              }
            }
            stackIn_15_0 = this.field_r;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("jb.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    final void h(int param0) {
        this.field_m = -1;
        this.field_t = 1.401298464324817e-45f;
        this.field_s = -1;
        this.field_l = -1;
        this.field_q = -1;
        this.field_r = -1;
        this.field_o = param0;
        this.field_k = -1;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            this.g(-25);
        }
        return (this.field_s ^ -1) != 0 ? true : false;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 == 16150) {
              L1: {
                if (param0 <= 0) {
                  break L1;
                } else {
                  if (param0 < 128) {
                    stackIn_11_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
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
                        stackIn_18_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackIn_21_0 = 0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "jb.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    jb() {
    }

    static {
        field_u = new long[32];
        field_v = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_n = "Dragonhide armour deflects fire and acts as a barrier to heat.";
        field_p = new int[8192];
    }
}
