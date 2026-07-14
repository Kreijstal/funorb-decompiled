/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qm {
    static oa field_c;
    static int[] field_i;
    int field_f;
    int field_h;
    private static long[] field_d;
    static String field_g;
    static String field_a;
    static vn field_e;
    static int field_b;

    public static void a(int param0) {
        if (param0 != -22525) {
            return;
        }
        field_a = null;
        field_c = null;
        field_g = null;
        field_d = null;
        field_e = null;
        field_i = null;
    }

    final static void a(hj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var3 = 0;
        if (param2 != -1) {
            field_c = null;
        }
        while (param0.field_s * param0.field_y > var3) {
            var4 = param0.field_z[var3];
            var5 = 16711935 & var4;
            var5 = var5 * param1;
            var4 = var4 & 65280;
            var4 = var4 * param1;
            var5 = var5 & -16711936;
            var4 = var4 & 16711680;
            var4 = var4 | var5;
            param0.field_z[var3] = var4 >>> 59931912;
            var3++;
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (0 <= param0) {
            // if_icmpgt L26
        }
        param0 = param0 >>> 16;
        var2 += 16;
        if (param0 >= 256) {
            param0 = param0 >>> 8;
            var2 += 8;
        }
        if (!(param0 < 16)) {
            var2 += 4;
            param0 = param0 >>> 4;
        }
        if (param1 > -60) {
            int discarded$0 = qm.a(29, (byte) -27);
        }
        if (!(param0 < 4)) {
            var2 += 2;
            param0 = param0 >>> 2;
        }
        if (param0 >= 1) {
            var2++;
            param0 = param0 >>> 1;
        }
        return var2 + param0;
    }

    final void a(in param0, byte param1) {
        if (param1 <= 84) {
            return;
        }
        ((qm) this).field_f = (int)((float)((qm) this).field_f + param0.field_g);
        ((qm) this).field_h = (int)((float)((qm) this).field_h + param0.field_j);
    }

    final static boolean a(int param0, ei param1, int param2, qm param3, qm param4) {
        float var5 = 0.0f;
        int var6 = 0;
        lb var7 = null;
        int var8 = 0;
        ei var9 = null;
        int var10 = 0;
        lb var11 = null;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        var5 = 0.0f;
        var6 = 0;
        var7 = new lb(param3, param4, 0, false, true);
        var8 = 0;
        L0: while (true) {
          if (var8 >= param1.field_e) {
            L1: {
              if (param2 == -20484) {
                break L1;
              } else {
                int discarded$1 = qm.a(-86, (byte) 69);
                break L1;
              }
            }
            mm.field_d = var5;
            return var6 != 0;
          } else {
            var9 = (ei) param1.field_b[var8];
            var10 = 0;
            L2: while (true) {
              if (var9.field_e <= var10) {
                var8++;
                continue L0;
              } else {
                var11 = (lb) var9.field_b[var10];
                if (param0 + -1 <= var11.field_k) {
                  if (param0 - -1 >= var11.field_k) {
                    if (th.a(-1, var7, var11)) {
                      L3: {
                        L4: {
                          if (var5 > mm.field_d) {
                            break L4;
                          } else {
                            if (var6 != 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5 = mm.field_d;
                        break L3;
                      }
                      var6 = 1;
                      var10++;
                      continue L2;
                    } else {
                      var10++;
                      continue L2;
                    }
                  } else {
                    var10++;
                    continue L2;
                  }
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(in param0, int param1) {
        ((qm) this).field_f = (int)((float)((qm) this).field_f - param0.field_g);
        if (param1 != -13201) {
            return;
        }
        ((qm) this).field_h = (int)((float)((qm) this).field_h - param0.field_j);
    }

    qm(int param0, int param1) {
        ((qm) this).field_h = param0;
        ((qm) this).field_f = param1;
    }

    qm(qm param0) {
        ((qm) this).field_f = param0.field_f;
        ((qm) this).field_h = param0.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_d = new long[256];
        field_i = new int[]{65280, 16760703, 16777215, 4144959};
        var2 = 0;
        L0: while (true) {
          if (-257 >= (var2 ^ -1)) {
            field_g = "Demolition";
            field_a = "<img=5>";
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= -9) {
                field_d[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1551423937 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
