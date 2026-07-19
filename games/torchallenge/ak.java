/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ak implements Iterable {
    static String field_d;
    static String field_e;
    static int field_h;
    w field_f;
    static ka[] field_i;
    static ka[][] field_a;
    static String field_b;
    static int[][] field_j;
    static String field_c;
    static String field_g;

    final void a(w param0, int param1) {
        if (!(param0.field_i == null)) {
            param0.a(12695);
        }
        if (param1 != 2) {
            return;
        }
        try {
            param0.field_k = this.field_f;
            param0.field_i = this.field_f.field_i;
            param0.field_i.field_k = param0;
            param0.field_k.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ak.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        boolean discarded$15 = false;
        boolean discarded$16 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (we.b(false)) {
              discarded$15 = TorChallenge.field_H.a(e.field_m, param0, qa.field_b, true);
              TorChallenge.field_H.j(-86);
              L1: while (true) {
                if (!kj.e((byte) -124)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$16 = TorChallenge.field_H.a(di.field_m, b.field_J, -58);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == gi.field_d) {
                  break L2;
                } else {
                  if (gi.field_d.field_i) {
                    ij.c((byte) -109);
                    TorChallenge.field_H.a((byte) 123, (ee) (new nh(TorChallenge.field_H, de.field_b)));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "ak.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ag((ak) (this)));
    }

    final static void a(int param0, int param1, int param2, int param3, ka[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (0 >= param1) {
                  break L1;
                } else {
                  var5_int = param4[0].field_q;
                  var6 = param4[2].field_q;
                  if (param3 <= -115) {
                    var7 = param4[1].field_q;
                    param4[0].g(param0, param2);
                    param4[2].g(param1 + (param0 + -var6), param2);
                    qg.a(bk.field_s);
                    qg.a(var5_int + param0, param2, -var6 + (param0 - -param1), param4[1].field_v + param2);
                    var8 = var5_int + param0;
                    var9 = param1 + param0 - var6;
                    param0 = var8;
                    L2: while (true) {
                      if (var9 <= param0) {
                        qg.b(bk.field_s);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        param4[1].g(param0, param2);
                        param0 = param0 + var7;
                        continue L2;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("ak.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_c = null;
        field_b = null;
        field_a = (ka[][]) null;
        field_e = null;
        if (param0 >= -19) {
          field_h = 101;
          field_j = (int[][]) null;
          field_d = null;
          field_g = null;
          return;
        } else {
          field_j = (int[][]) null;
          field_d = null;
          field_g = null;
          return;
        }
    }

    final w a(int param0) {
        w var2 = null;
        if (param0 == 0) {
          var2 = this.field_f.field_k;
          if (this.field_f == var2) {
            return null;
          } else {
            var2.a(12695);
            return var2;
          }
        } else {
          field_a = (ka[][]) null;
          var2 = this.field_f.field_k;
          if (this.field_f == var2) {
            return null;
          } else {
            var2.a(12695);
            return var2;
          }
        }
    }

    final static java.awt.Container b(int param0) {
        ka[] var2 = null;
        if (gi.field_b != null) {
          return (java.awt.Container) ((Object) gi.field_b);
        } else {
          if (param0 != 4) {
            var2 = (ka[]) null;
            ak.a(12, -9, 70, 32, (ka[]) null);
            return (java.awt.Container) ((Object) gi.b(param0 + 12472));
          } else {
            return (java.awt.Container) ((Object) gi.b(param0 + 12472));
          }
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 95) {
          if (param1 != 160) {
            if (32 != param1) {
              if (95 != param1) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ak.a((byte) -6);
          if (param1 != 160) {
            if (32 != param1) {
              if (95 != param1) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    private ak() throws Throwable {
        throw new Error();
    }

    static {
        field_h = 0;
        field_a = new ka[3][];
        field_d = "Type your age in years";
        field_j = new int[4][4];
        field_b = "Service unavailable";
        field_g = "Try again";
        field_e = "Account created successfully!";
        field_c = "Your email address is used to identify this account";
    }
}
