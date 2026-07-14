/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hca extends rqa {
    static llb field_o;

    hca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        ak.field_o = param0[0].a(false);
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    public static void e(byte param0) {
        if (param0 < 91) {
            field_o = null;
        }
        field_o = null;
    }

    final static lkb a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          var2 = param1.length();
          if (param0 > 95) {
            break L0;
          } else {
            var7 = null;
            lkb discarded$1 = hca.a((byte) 73, (String) null);
            break L0;
          }
        }
        if (0 == var2) {
          return br.field_f;
        } else {
          if (-65 > (var2 ^ -1)) {
            return qw.field_j;
          } else {
            if (param1.charAt(0) != 34) {
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 < var2) {
                  var5 = param1.charAt(var4);
                  if (var5 == 46) {
                    L2: {
                      if (0 == var4) {
                        break L2;
                      } else {
                        if (var4 == -1 + var2) {
                          break L2;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    return ira.field_b;
                  } else {
                    if (es.field_a.indexOf(var5) == -1) {
                      return ira.field_b;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              if (param1.charAt(var2 + -1) != 34) {
                return ira.field_b;
              } else {
                var3 = 0;
                var4 = 1;
                L3: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param1.charAt(var4);
                    if (var5 != 92) {
                      L4: {
                        if (34 != var5) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            return ira.field_b;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L3;
                    } else {
                      L5: {
                        if (var3 != 0) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L5;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          break L5;
                        }
                      }
                      var3 = stackIn_19_0;
                      var4++;
                      continue L3;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
