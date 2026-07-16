/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp {
    static vn[] field_c;
    static String field_a;
    static int[] field_b;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 < 24) {
            qp.a((byte) 47);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static String a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        if (param1 > 32) {
          var2 = param0;
          if (0 == var2) {
            return tk.field_b;
          } else {
            if (-2 != (var2 ^ -1)) {
              if ((var2 ^ -1) != -3) {
                if ((var2 ^ -1) != -4) {
                  if ((var2 ^ -1) == -5) {
                    return rg.field_K;
                  } else {
                    if (var2 == 5) {
                      return ti.field_d;
                    } else {
                      if (-7 != (var2 ^ -1)) {
                        if (var2 != 7) {
                          if (var2 == 9) {
                            return fe.field_J;
                          } else {
                            if (-11 != (var2 ^ -1)) {
                              if ((var2 ^ -1) != -14) {
                                if (-13 != (var2 ^ -1)) {
                                  if (var2 != 14) {
                                    if ((var2 ^ -1) == -16) {
                                      return tl.field_k;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    return ig.field_Bb;
                                  }
                                } else {
                                  return pa.field_C;
                                }
                              } else {
                                return dm.field_s;
                              }
                            } else {
                              return ub.field_h;
                            }
                          }
                        } else {
                          return bh.field_h;
                        }
                      } else {
                        return ij.field_J;
                      }
                    }
                  }
                } else {
                  return cl.field_a;
                }
              } else {
                return ah.field_bb;
              }
            } else {
              return mm.field_l;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
    }
}
