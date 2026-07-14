/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ona extends sna {
    static String field_vb;
    kna field_zb;
    static kv field_yb;
    int field_wb;
    static String field_xb;

    final static rga a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var6 = BachelorFridge.field_y;
        var2 = param0.length();
        if (var2 == 0) {
          return uc.field_j;
        } else {
          if (var2 <= 64) {
            if (param0.charAt(0) == 34) {
              if (param0.charAt(var2 + -1) != 34) {
                return cha.field_m;
              } else {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (var4 < var2 - 1) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L1: {
                        if (var3 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L1;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L1;
                        }
                      }
                      var3 = stackIn_18_0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var5 != 34) {
                          break L2;
                        } else {
                          if (var3 == 0) {
                            return cha.field_m;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              L3: {
                var3 = 0;
                if (param1 == -15679) {
                  break L3;
                } else {
                  ona.f(47);
                  break L3;
                }
              }
              var4 = 0;
              L4: while (true) {
                if (var4 < var2) {
                  var5 = param0.charAt(var4);
                  if (var5 != 46) {
                    if (-1 != jk.field_l.indexOf(var5)) {
                      var3 = 0;
                      var4++;
                      continue L4;
                    } else {
                      return cha.field_m;
                    }
                  } else {
                    L5: {
                      if (var4 == 0) {
                        break L5;
                      } else {
                        if (var4 == var2 - 1) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    return cha.field_m;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return rm.field_c;
          }
        }
    }

    final static boolean c(int param0, int param1) {
        if (param1 != 34) {
            ona.f(87);
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    public static void f(int param0) {
        field_xb = null;
        field_vb = null;
        field_yb = null;
        if (param0 != 1) {
            ona.f(26);
        }
    }

    ona(int param0, kv param1, kna param2) {
        ((ona) this).field_p = 39;
        ((ona) this).field_v = param1;
        ((ona) this).field_wb = param0;
        ((ona) this).field_sb = 39;
        if (cc.field_b.field_z != null) {
            ((ona) this).field_kb = cc.field_b.field_z.g(0) % 4 * 39;
            ((ona) this).field_rb = 39 * (cc.field_b.field_z.g(0) / 4);
        }
        ((ona) this).field_zb = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_vb = "Please send me news and updates (I can unsubscribe at any time)";
        field_xb = "Cooldown <%0> turns";
    }
}
