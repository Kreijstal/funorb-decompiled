/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd {
    static sa field_d;
    static int[] field_e;
    static int[] field_b;
    static gk field_c;
    static he[] field_f;
    static he[] field_a;

    abstract int a(int param0, int param1);

    abstract kh a(byte param0);

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        field_f = null;
        field_a = null;
        if (param0 < 36) {
            return;
        }
        field_e = null;
    }

    abstract byte[] b(int param0, int param1);

    final static void b(int param0) {
        nh var1 = null;
        int var2_int = 0;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        nh var6 = null;
        nh var7 = null;
        nh var8 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        wj.d(243, 197, 369, 143, 16777215);
        wj.f(244, 198, 367, 141, 0);
        if (null == gl.field_e) {
          L0: {
            if (sc.field_f == null) {
              break L0;
            } else {
              int discarded$3 = sc.field_f.a(ha.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L0;
            }
          }
          return;
        } else {
          if (param0 == 139) {
            L1: {
              var6 = gl.field_e[ig.field_k];
              var1 = var6;
              if (var6 != null) {
                var6.d(245, 199);
                break L1;
              } else {
                if (null == sc.field_f) {
                  break L1;
                } else {
                  int discarded$4 = sc.field_f.a(ha.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L1;
                }
              }
            }
            L2: {
              if (la.field_b < rd.field_F) {
                var7 = gl.field_e[bd.field_L];
                if (var7 != null) {
                  var2_int = la.field_b * (60 + var7.field_z) / rd.field_F;
                  var3 = var2_int - 30;
                  if (!ie.field_B) {
                    jc.a(var7, 256 * (-var3 + var7.field_z) / 30, var3 * -256 / 30, (byte) 110, 199, 245);
                    break L2;
                  } else {
                    jc.a(var7, -256 * var3 / 30, (-var3 + var7.field_z) * 256 / 30, (byte) 77, 199, 245);
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (null != sc.field_f) {
                var2 = null;
                var5 = 0;
                var3 = var5;
                L4: while (true) {
                  if (var5 >= gl.field_e.length) {
                    if (var2 == null) {
                      break L3;
                    } else {
                      int discarded$5 = sc.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      break L3;
                    }
                  } else {
                    var8 = gl.field_e[var5];
                    if (var8 != null) {
                      L5: {
                        if (-366 != (var8.field_z ^ -1)) {
                          break L5;
                        } else {
                          if (var8.field_C != 139) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      if (var2 == null) {
                        var2 = Integer.toString(var5);
                        var5++;
                        continue L4;
                      } else {
                        var2 = var2 + ", " + var5;
                        var5++;
                        continue L4;
                      }
                    } else {
                      var5++;
                      continue L4;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new sa(10, 2, 2, 0);
        field_b = new int[8192];
        field_e = new int[12];
    }
}
