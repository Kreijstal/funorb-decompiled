/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_a;

    public static void b(byte param0) {
        if (param0 > -90) {
            field_a = null;
        }
        field_a = null;
    }

    final static tf a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var2 = param0.length();
        if (var2 == 0) {
          return w.field_k;
        } else {
          if (-65 > var2) {
            return vi.field_l;
          } else {
            if (param0.charAt(0) == 34) {
              if (-35 != param0.charAt(var2 - 1)) {
                return ll.field_a;
              } else {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 != 92) {
                      L1: {
                        if (34 != var5) {
                          break L1;
                        } else {
                          if (var3 == 0) {
                            return ll.field_a;
                          } else {
                            break L1;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var3 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L2;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L2;
                        }
                      }
                      var3 = stackIn_18_0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              var3 = 0;
              var4 = 0;
              if (param1 == 111) {
                L3: while (true) {
                  if (var4 < var2) {
                    var5 = param0.charAt(var4);
                    if (var5 != 46) {
                      if ((hf.field_c.indexOf(var5) ^ -1) == 0) {
                        return ll.field_a;
                      } else {
                        var3 = 0;
                        var4++;
                        continue L3;
                      }
                    } else {
                      L4: {
                        if (-1 == (var4 ^ -1)) {
                          break L4;
                        } else {
                          if (var2 + -1 == var4) {
                            break L4;
                          } else {
                            if (var3 == 0) {
                              var3 = 1;
                              var4++;
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      return ll.field_a;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        int var3 = 0;
        if (!param2) {
            return -15;
        }
        while ((param0 ^ -1) < -1) {
            var3 = var3 << 438251425 | param1 & 1;
            param0--;
            param1 = param1 >>> 1;
        }
        return var3;
    }

    final static aj[] a(byte param0) {
        if (param0 != -55) {
            return null;
        }
        return new aj[]{gj.field_w, q.field_d, rk.field_n, vb.field_l, rk.field_d, uj.field_c, rj.field_b, li.field_R, nl.field_b, he.field_c, w.field_n, vf.field_m, fb.field_l, qb.field_d};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Username: ";
    }
}
