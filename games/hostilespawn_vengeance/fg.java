/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static jb[] field_b;
    static String field_a;
    static int[] field_c;
    static bd field_d;

    final static void a(int param0, int param1, int param2, p param3) {
        int var4 = -(param3.field_e * 32) + 256;
        int var5 = -125 % ((-44 - param2) / 49);
        lg.field_k.a(true, var4, (int)param3.field_c, param0, param1);
    }

    final static int a(ic param0, int param1, boolean param2, jd param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == null) {
            break L0;
          } else {
            if (null == param0.field_l) {
              break L0;
            } else {
              if (param3 == null) {
                break L0;
              } else {
                if (param0.field_j == param3.field_t) {
                  var4 = param3.field_w.length;
                  var5 = param0.field_l[param1].length / var4;
                  var6 = 0;
                  L1: while (true) {
                    if (var5 <= var6) {
                      L2: {
                        if (!param2) {
                          break L2;
                        } else {
                          var9 = null;
                          fg.a(81, -66, -114, (p) null);
                          break L2;
                        }
                      }
                      return -1;
                    } else {
                      if ((param3.field_k ^ -1L) == (param0.field_i[param1][var6] ^ -1L)) {
                        if (pc.a(14088, param0.field_p[param1][var6])) {
                          var7 = 0;
                          L3: while (true) {
                            if (var7 >= var4) {
                              return var6;
                            } else {
                              if (param3.field_w[var7] == param0.field_l[param1][var6 * var4 - -var7]) {
                                var6 = var6;
                                var7++;
                                continue L3;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -1;
    }

    final static java.awt.Container b(byte param0) {
        if (!(null == md.field_n)) {
            return (java.awt.Container) (Object) md.field_n;
        }
        if (param0 != -31) {
            field_b = null;
        }
        return (java.awt.Container) (Object) bn.c(-1);
    }

    final static bd a(String param0, String param1, gb param2, boolean param3) {
        int var4 = param2.a((byte) -2, param0);
        if (param3) {
            return null;
        }
        int var5 = param2.a(var4, param1, -1);
        return ac.a(var4, var5, (byte) -118, param2);
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        int var1 = -49 % ((param0 - -55) / 38);
        field_c = null;
    }

    final static boolean a(int param0) {
        if (param0 != 32) {
            fg.a((byte) 107);
        }
        return sj.field_a.a(-26720);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new jb[27];
        field_a = "Please enter your age in years";
        field_c = new int[]{3, 4};
    }
}
