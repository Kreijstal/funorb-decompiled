/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ck extends IOException {
    static java.awt.Frame field_d;
    static int field_a;
    static String field_c;
    static String field_b;

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!cf.a(param0.charAt(var2), (byte) 78)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!cf.a(param0.charAt(var3 - 1), (byte) 78)) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if (-2 >= (var4 ^ -1)) {
                if ((var4 ^ -1) >= -13) {
                  L4: {
                    var5 = new StringBuilder(var4);
                    if (param1 == -48) {
                      break L4;
                    } else {
                      field_d = null;
                      break L4;
                    }
                  }
                  var6 = var2;
                  L5: while (true) {
                    if (var3 <= var6) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (vb.a((byte) -106, (char) var7)) {
                        var8 = hh.a(125, (char) var7);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
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
          }
        } else {
          return null;
        }
    }

    ck(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1) {
        th var2 = ed.field_q;
        var2.h(param0, 0);
        var2.c(1, -1);
        var2.c(param1, -1);
    }

    final static void b(byte param0) {
        if (jc.field_b != null) {
            jc.field_b.b(58);
            jc.field_b = null;
        }
        if (param0 >= -25) {
            field_a = 22;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -18) {
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = "Type your age in years";
        field_c = "Loading extra data";
    }
}
