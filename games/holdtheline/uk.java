/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uk extends IOException {
    static hj field_a;
    static String field_f;
    static e field_g;
    static uf field_b;
    static String field_d;
    static String[] field_c;
    static boolean field_e;

    final static void a(int param0) {
        String var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hj var6 = null;
        hj var7 = null;
        hj var8 = null;
        var4 = HoldTheLine.field_D;
        tc.a(243, 197, 369, 143, 16777215);
        tc.f(244, 198, 367, 141, 0);
        if (qk.field_y != null) {
          L0: {
            var6 = qk.field_y[va.field_e];
            if (var6 != null) {
              var6.a(245, 199);
              break L0;
            } else {
              if (an.field_e != null) {
                int discarded$3 = an.field_e.a(ug.field_f, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L0;
              } else {
                break L0;
              }
            }
          }
          if (param0 == 3979) {
            L1: {
              if (hk.field_e >= bg.field_g) {
                break L1;
              } else {
                var7 = qk.field_y[hf.field_i];
                if (var7 == null) {
                  break L1;
                } else {
                  var2_int = hk.field_e * (60 + var7.field_o) / bg.field_g;
                  var3 = var2_int - 30;
                  if (rg.field_e) {
                    jg.a(199, 256 * (-var3 + var7.field_o) / 30, var7, true, 245, var3 * -256 / 30);
                    break L1;
                  } else {
                    jg.a(199, -256 * var3 / 30, var7, true, 245, (var7.field_o - var3) * 256 / 30);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (an.field_e != null) {
                var2 = null;
                var5 = 0;
                var3 = var5;
                L3: while (true) {
                  if (var5 >= qk.field_y.length) {
                    if (var2 == null) {
                      break L2;
                    } else {
                      int discarded$4 = an.field_e.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      break L2;
                    }
                  } else {
                    var8 = qk.field_y[var5];
                    if (var8 != null) {
                      L4: {
                        if (var8.field_o != 365) {
                          break L4;
                        } else {
                          if (139 != var8.field_v) {
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      if (var2 != null) {
                        var2 = var2 + ", " + var5;
                        var5++;
                        continue L3;
                      } else {
                        var2 = Integer.toString(var5);
                        var5++;
                        continue L3;
                      }
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          L5: {
            if (null != an.field_e) {
              int discarded$5 = an.field_e.a(ug.field_f, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    final static void b(int param0) {
        ci.field_o = false;
        if (param0 >= -41) {
            field_g = null;
        }
        aa.field_k = false;
        go.a(0, -1);
        ak.field_b = gg.field_M;
        bb.field_a = gg.field_M;
    }

    uk(String param0) {
        super(param0);
    }

    public static void a(byte param0) {
        int var1 = 97 / ((-59 - param0) / 57);
        field_c = null;
        field_f = null;
        field_b = null;
        field_a = null;
        field_d = null;
        field_g = null;
    }

    final static kg a(String param0, boolean param1, int param2, boolean param3) {
        int var4 = -104 % ((42 - param2) / 54);
        return new kg(param0, param3, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Minor thrust";
        field_d = "Fullscreen";
        field_g = new e(0, 2, 2, 1);
    }
}
