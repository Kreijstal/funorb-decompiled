/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends k {
    private int field_k;
    static String field_m;
    private int field_o;
    static String field_p;
    static String field_n;
    private int field_l;

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = BachelorFridge.field_y;
          var4 = param2;
          if (var4 != 0) {
            if ((var4 ^ -1) != -2) {
              if (2 != var4) {
                break L0;
              } else {
                ((sk) this).field_k = param1.e((byte) 52);
                break L0;
              }
            } else {
              ((sk) this).field_o = param1.b(param0 ^ -16711866);
              break L0;
            }
          } else {
            ((sk) this).field_l = param1.b(16711935);
            break L0;
          }
        }
        L1: {
          if (param0 == -71) {
            break L1;
          } else {
            var6 = null;
            ((sk) this).a((byte) 105, (lu) null, -57);
            break L1;
          }
        }
    }

    public sk() {
        super(0, true);
        ((sk) this).field_o = 1;
        ((sk) this).field_k = 204;
        ((sk) this).field_l = 1;
    }

    public static void d(int param0) {
        field_p = null;
        field_n = null;
        field_m = null;
        if (param0 >= -109) {
            field_n = null;
        }
    }

    final int[] a(int param0, int param1) {
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
          var11 = BachelorFridge.field_y;
          var15 = ((sk) this).field_j.a(param0, param1 + -1);
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (param1 == 0) {
            break L0;
          } else {
            ((sk) this).field_k = -14;
            break L0;
          }
        }
        L1: {
          if (((sk) this).field_j.field_m) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= hh.field_d) {
                break L1;
              } else {
                L3: {
                  L4: {
                    var5 = jq.field_k[var4];
                    var6 = tj.field_f[param0];
                    var7 = ((sk) this).field_l * var5 >> -1220032660;
                    var8 = ((sk) this).field_o * var6 >> 1736496236;
                    var9 = var5 % (4096 / ((sk) this).field_l) * ((sk) this).field_l;
                    var10 = var6 % (4096 / ((sk) this).field_o) * ((sk) this).field_o;
                    if (((sk) this).field_k <= var10) {
                      break L4;
                    } else {
                      var7 = var7 - var8;
                      L5: while (true) {
                        if ((var7 ^ -1) <= -1) {
                          L6: while (true) {
                            if ((var7 ^ -1) >= -4) {
                              if (var7 != 1) {
                                var15 = var14;
                                var15[var4] = 0;
                                var4++;
                                continue L2;
                              } else {
                                if (var9 < ((sk) this).field_k) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var7 -= 4;
                              continue L6;
                            }
                          }
                        } else {
                          var7 += 4;
                          continue L5;
                        }
                      }
                    }
                  }
                  L7: {
                    if (((sk) this).field_k <= var9) {
                      break L7;
                    } else {
                      var7 = var7 - var8;
                      L8: while (true) {
                        if (var7 >= 0) {
                          L9: while (true) {
                            if (-4 <= (var7 ^ -1)) {
                              if (0 < var7) {
                                break L3;
                              } else {
                                break L7;
                              }
                            } else {
                              var7 -= 4;
                              continue L9;
                            }
                          }
                        } else {
                          var7 += 4;
                          continue L8;
                        }
                      }
                    }
                  }
                  var15[var4] = 4096;
                  var4++;
                  continue L2;
                }
                var15[var4] = 0;
                var4++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "This is your shopping bag, where your food is stored once bought.";
        field_p = "Searching for an opponent";
        field_m = "Use the magnifier to view a creatures details.";
    }
}
