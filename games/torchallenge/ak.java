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
        L0: {
          if (param0.field_i != null) {
            param0.a(12695);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 2) {
          return;
        } else {
          param0.field_k = ((ak) this).field_f;
          param0.field_i = ((ak) this).field_f.field_i;
          param0.field_i.field_k = param0;
          param0.field_k.field_i = param0;
          return;
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        var2 = TorChallenge.field_F ? 1 : 0;
        if (!we.b(false)) {
          if (null != gi.field_d) {
            if (!gi.field_d.field_i) {
              return;
            } else {
              ij.c((byte) -109);
              TorChallenge.field_H.a((byte) 123, (ee) (Object) new nh(TorChallenge.field_H, de.field_b));
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$12 = TorChallenge.field_H.a(e.field_m, param0, qa.field_b, true);
          TorChallenge.field_H.j(-86);
          L0: while (true) {
            if (!kj.e((byte) -124)) {
              return;
            } else {
              boolean discarded$13 = TorChallenge.field_H.a(di.field_m, b.field_J, -58);
              continue L0;
            }
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ag((ak) this);
    }

    final static void a(int param0, int param1, int param2, int param3, ka[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        if (param4 != null) {
          if (0 < param1) {
            var5 = param4[0].field_q;
            var6 = param4[2].field_q;
            if (param3 > -115) {
              return;
            } else {
              var7 = param4[1].field_q;
              param4[0].g(param0, param2);
              param4[2].g(param1 + (param0 + -var6), param2);
              qg.a(bk.field_s);
              qg.a(var5 + param0, param2, -var6 + (param0 - -param1), param4[1].field_v + param2);
              var8 = var5 + param0;
              var9 = param1 + param0 - var6;
              param0 = var8;
              L0: while (true) {
                if (var9 <= param0) {
                  qg.b(bk.field_s);
                  return;
                } else {
                  param4[1].g(param0, param2);
                  param0 = param0 + var7;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_e = null;
        if (param0 >= -19) {
          field_h = 101;
          field_j = null;
          field_d = null;
          field_g = null;
          return;
        } else {
          field_j = null;
          field_d = null;
          field_g = null;
          return;
        }
    }

    final w a(int param0) {
        w var2 = null;
        if (param0 == 0) {
          var2 = ((ak) this).field_f.field_k;
          if (((ak) this).field_f == var2) {
            return null;
          } else {
            var2.a(12695);
            return var2;
          }
        } else {
          field_a = null;
          var2 = ((ak) this).field_f.field_k;
          if (((ak) this).field_f == var2) {
            return null;
          } else {
            var2.a(12695);
            return var2;
          }
        }
    }

    final static java.awt.Container b(int param0) {
        Object var2 = null;
        if (gi.field_b != null) {
          return (java.awt.Container) (Object) gi.field_b;
        } else {
          if (param0 != 4) {
            var2 = null;
            ak.a(12, -9, 70, 32, (ka[]) null);
            return (java.awt.Container) (Object) gi.b(param0 + 12472);
          } else {
            return (java.awt.Container) (Object) gi.b(param0 + 12472);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
