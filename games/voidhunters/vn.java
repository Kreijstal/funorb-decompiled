/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends le {
    private int field_k;
    static int field_m;
    static String field_i;
    private int field_l;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = VoidHunters.field_G;
          var4 = param0;
          if (var4 == 0) {
            ((vn) this).field_j = param2.e((byte) -108);
            break L0;
          } else {
            if (1 != var4) {
              if (2 == var4) {
                ((vn) this).field_k = param2.e(1869);
                break L0;
              } else {
                break L0;
              }
            } else {
              ((vn) this).field_l = param2.e((byte) -93);
              break L0;
            }
          }
        }
        L1: {
          if (param1 < -60) {
            break L1;
          } else {
            var6 = null;
            ((vn) this).a(-122, -52, (ds) null);
            break L1;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_i = null;
    }

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var11 = VoidHunters.field_G;
          var15 = ((vn) this).field_f.a((byte) 120, param0);
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (((vn) this).field_f.field_e) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= hob.field_d) {
                break L0;
              } else {
                L2: {
                  var5 = grb.field_l[var4];
                  var6 = sj.field_p[param0];
                  var7 = var5 * ((vn) this).field_j >> -1508719092;
                  var8 = ((vn) this).field_l * var6 >> -445983476;
                  var9 = ((vn) this).field_j * (var5 % (4096 / ((vn) this).field_j));
                  var10 = var6 % (4096 / ((vn) this).field_l) * ((vn) this).field_l;
                  if (var10 >= ((vn) this).field_k) {
                    break L2;
                  } else {
                    var7 = var7 - var8;
                    L3: while (true) {
                      if (var7 >= 0) {
                        L4: while (true) {
                          if (3 >= var7) {
                            var15 = var14;
                            if ((var7 ^ -1) == -2) {
                              var15 = var14;
                              if (((vn) this).field_k <= var9) {
                                break L2;
                              } else {
                                var15[var4] = 0;
                                var4++;
                                continue L1;
                              }
                            } else {
                              var15[var4] = 0;
                              var4++;
                              continue L1;
                            }
                          } else {
                            var7 -= 4;
                            continue L4;
                          }
                        }
                      } else {
                        var7 += 4;
                        continue L3;
                      }
                    }
                  }
                }
                L5: {
                  if (((vn) this).field_k <= var9) {
                    break L5;
                  } else {
                    var7 = var7 - var8;
                    L6: while (true) {
                      if ((var7 ^ -1) <= -1) {
                        L7: while (true) {
                          if ((var7 ^ -1) >= -4) {
                            if (0 < var7) {
                              var15[var4] = 0;
                              var4++;
                              continue L1;
                            } else {
                              break L5;
                            }
                          } else {
                            var7 -= 4;
                            continue L7;
                          }
                        }
                      } else {
                        var7 += 4;
                        continue L6;
                      }
                    }
                  }
                }
                var15[var4] = 4096;
                var4++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        if (param1) {
          return var3;
        } else {
          return null;
        }
    }

    public vn() {
        super(0, true);
        ((vn) this).field_k = 204;
        ((vn) this).field_l = 1;
        ((vn) this).field_j = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 32;
        field_i = "Standard thruster";
    }
}
