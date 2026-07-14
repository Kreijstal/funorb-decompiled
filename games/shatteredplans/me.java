/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me {
    static bi field_h;
    static boolean field_a;
    static String field_c;
    fs[] field_i;
    static qr field_d;
    fs[] field_g;
    static String field_f;
    static boolean field_j;
    static int field_e;
    private boolean[] field_b;

    abstract int b(boolean param0);

    abstract void a(ob param0, byte param1);

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 19) {
            break L0;
          } else {
            field_e = 28;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!qh.f(29443)) {
              break L2;
            } else {
              if (0 != (8 & cl.field_n)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    abstract fs[] b(int param0);

    public static void a(boolean param0) {
        field_d = null;
        field_f = null;
        if (!param0) {
            field_h = null;
        }
        field_h = null;
        field_c = null;
    }

    boolean a(dc param0, byte param1) {
        int var3 = 0;
        fs var4 = null;
        fs[] var5_ref_fs__ = null;
        int var5 = 0;
        int var6 = 0;
        fs var7_ref_fs = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 0;
        var4 = null;
        var5_ref_fs__ = ((me) this).field_i;
        if (param1 >= 23) {
          var6 = 0;
          L0: while (true) {
            if (var5_ref_fs__.length <= var6) {
              if (-1 != (var3 ^ -1)) {
                if ((var3 ^ -1) == -2) {
                  ((me) this).field_g = new fs[]{var4};
                  return true;
                } else {
                  var9 = 0;
                  var5 = var9;
                  L1: while (true) {
                    if (((me) this).field_i.length <= var9) {
                      return false;
                    } else {
                      if (!((me) this).field_i[var9].field_i.g(88)) {
                        ((me) this).field_b[var9] = true;
                        var9++;
                        continue L1;
                      } else {
                        ((me) this).field_b[var9] = false;
                        var9++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                var5 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= ((me) this).field_i.length) {
                    if (0 < var5) {
                      ((me) this).field_g = new fs[var5];
                      var6 = 0;
                      var7 = 0;
                      L3: while (true) {
                        if (var7 >= ((me) this).field_i.length) {
                          return true;
                        } else {
                          if (((me) this).field_b[var7]) {
                            if ((1 << var7 & param0.field_f) == 0) {
                              ((me) this).field_g[var6] = ((me) this).field_i[var7];
                              var6++;
                              var7++;
                              continue L3;
                            } else {
                              var7++;
                              continue L3;
                            }
                          } else {
                            var7++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      return true;
                    }
                  } else {
                    if (((me) this).field_b[var6]) {
                      if ((param0.field_f & 1 << var6) == 0) {
                        var5++;
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              var7_ref_fs = var5_ref_fs__[var6];
              if (!var7_ref_fs.field_i.g(-96)) {
                var3++;
                var4 = var7_ref_fs;
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    final boolean a(byte param0, fs param1) {
        int var5 = 0;
        fs var6 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((me) this).field_g == null) {
            return false;
        }
        int var3 = 75 / ((9 - param0) / 56);
        fs[] var4 = ((me) this).field_g;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (!(param1 != var6)) {
                return false;
            }
        }
        return true;
    }

    abstract void a(int param0, ob param1);

    final fs[] a(byte param0) {
        if (param0 != -23) {
            Object var3 = null;
            int discarded$0 = me.a(-73, (byte[]) null, -98);
        }
        return ((me) this).field_g;
    }

    abstract void a(byte param0, dc param1, kq param2);

    final static int a(int param0, byte[] param1, int param2) {
        if (param0 < 50) {
            Object var4 = null;
            int discarded$0 = me.a(-118, (byte[]) null, -21);
        }
        return bs.a(param2, param1, (byte) -53, 0);
    }

    me(fs[] param0) {
        int var2 = 0;
        ((me) this).field_i = param0;
        ((me) this).field_b = new boolean[param0.length];
        for (var2 = 0; ((me) this).field_b.length > var2; var2++) {
            ((me) this).field_b[var2] = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_c = "No Achievement";
        field_f = "Amount of wasted research data.";
    }
}
