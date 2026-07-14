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
        // if_acmpne L27
        am.field_c = il.field_v.a(df.field_j, (byte) 34, ue.field_d);
        // goto L27
        // if_icmpne L39
        return false;
    }

    ua a(int param0) {
        if (param0 != 160) {
            nh.c(-105);
        }
        return ea.field_o;
    }

    final void a(int param0, ka param1) {
        param1.a((byte) 122, ((nh) this).field_j);
        if (param0 != 95) {
            ua discarded$0 = ((nh) this).a(-10);
        }
        param1.a(false, ((nh) this).field_i);
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
        if (param0 != 245) {
            field_d = null;
        }
    }

    final static void a(le param0, byte param1, int param2) {
        ha var5 = pg.field_fb;
        var5.f(param2, 950);
        if (param1 != -30) {
            return;
        }
        var5.field_k = var5.field_k + 1;
        int var4 = var5.field_k;
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
    }

    final static String a(CharSequence param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = stellarshard.field_B;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!sk.a(param0.charAt(var2), -109)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            if (!param1) {
              L2: while (true) {
                L3: {
                  if (var3 <= var2) {
                    break L3;
                  } else {
                    if (!sk.a(param0.charAt(var3 + -1), -118)) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = var3 + -var2;
                if (1 <= var4) {
                  if (12 >= var4) {
                    var5 = new StringBuilder(var4);
                    var6 = var2;
                    L4: while (true) {
                      if (var3 <= var6) {
                        if (-1 != (var5.length() ^ -1)) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        var7 = param0.charAt(var6);
                        if (s.a(45, (char) var7)) {
                          var8 = of.a(-119, (char) var7);
                          if (var8 != 0) {
                            StringBuilder discarded$1 = var5.append(var8);
                            var6++;
                            continue L4;
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void c(int param0) {
        int var4 = stellarshard.field_B;
        int[] var5 = tg.field_a;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
        if (param0 > -17) {
            field_h = 114;
        }
    }

    nh(long param0, String param1) {
        ((nh) this).field_j = param0;
        ((nh) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_d = new int[8192];
    }
}
