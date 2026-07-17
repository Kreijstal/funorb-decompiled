/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bh {
    static int field_j;
    int field_a;
    static int field_e;
    int field_d;
    static int field_f;
    static String field_b;
    int field_l;
    int field_k;
    int field_c;
    static int field_g;
    int field_i;
    static String field_h;

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        bh.a(68);
    }

    abstract void a(int param0, int param1);

    final static String a(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var9 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String stackIn_9_0 = null;
        String stackIn_19_0 = null;
        String stackIn_26_0 = null;
        String stackIn_36_0 = null;
        String stackOut_25_0 = null;
        String stackOut_35_0 = null;
        String stackOut_8_0 = null;
        String stackOut_18_0 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 < 0) {
          var15 = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
          if (rc.field_f > 0) {
            var1 = var15 + ":";
            var2 = 0;
            L0: while (true) {
              if (rc.field_f > var2) {
                L1: {
                  stackOut_25_0 = var1 + 32;
                  stackIn_36_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var16 = stackIn_26_0;
                        var3 = 255 & MonkeyPuzzle2.field_D.field_g[var2];
                        var4 = var3 >> 4;
                        var3 = var3 & 15;
                        if (var4 >= 10) {
                          break L3;
                        } else {
                          var4 += 48;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4 += 55;
                      break L2;
                    }
                    L4: {
                      L5: {
                        var17 = var16 + (char)var4;
                        if (var3 < 10) {
                          break L5;
                        } else {
                          var3 += 55;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 += 48;
                      break L4;
                    }
                    var1 = var17 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      stackOut_35_0 = (String) var1;
                      stackIn_36_0 = stackOut_35_0;
                      break L1;
                    }
                  }
                }
                return stackIn_36_0;
              } else {
                return var1;
              }
            }
          } else {
            return var15;
          }
        } else {
          field_j = -79;
          var9 = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
          if (rc.field_f > 0) {
            var1 = var9 + ":";
            var2 = 0;
            L6: while (true) {
              if (rc.field_f > var2) {
                L7: {
                  stackOut_8_0 = var1 + 32;
                  stackIn_19_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var5 != 0) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        var13 = stackIn_9_0;
                        var3 = 255 & MonkeyPuzzle2.field_D.field_g[var2];
                        var4 = var3 >> 4;
                        var3 = var3 & 15;
                        if (var4 >= 10) {
                          break L9;
                        } else {
                          var4 += 48;
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var4 += 55;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var14 = var13 + (char)var4;
                        if (var3 < 10) {
                          break L11;
                        } else {
                          var3 += 55;
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var3 += 48;
                      break L10;
                    }
                    var1 = var14 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L6;
                    } else {
                      stackOut_18_0 = (String) var1;
                      stackIn_19_0 = stackOut_18_0;
                      break L7;
                    }
                  }
                }
                return stackIn_19_0;
              } else {
                return var1;
              }
            }
          } else {
            return var9;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_h = "Account created successfully!";
    }
}
