/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sb {
    int field_j;
    int field_h;
    int field_a;
    static ip field_i;
    int field_b;
    static String field_g;
    static String field_k;
    static int field_c;
    int field_e;
    int field_f;
    static String field_d;

    final static ma a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = param1.length();
        if (-1 != (var2 ^ -1)) {
          L0: {
            if (param0 == 32351) {
              break L0;
            } else {
              field_d = null;
              break L0;
            }
          }
          if (64 < var2) {
            return er.field_f;
          } else {
            if (param1.charAt(0) != 34) {
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 < var2) {
                  var5 = param1.charAt(var4);
                  if (46 != var5) {
                    if (0 != (cd.field_Kb.indexOf(var5) ^ -1)) {
                      var3 = 0;
                      var4++;
                      continue L1;
                    } else {
                      return so.field_t;
                    }
                  } else {
                    L2: {
                      if (var4 == 0) {
                        break L2;
                      } else {
                        if (var2 - 1 == var4) {
                          break L2;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            var3 = 1;
                            var4++;
                            continue L1;
                          }
                        }
                      }
                    }
                    return so.field_t;
                  }
                } else {
                  return null;
                }
              }
            } else {
              if (param1.charAt(var2 + -1) == 34) {
                var3 = 0;
                var4 = 1;
                L3: while (true) {
                  if (var4 < -1 + var2) {
                    var5 = param1.charAt(var4);
                    if (var5 == 92) {
                      L4: {
                        if (var3 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L4;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L4;
                        }
                      }
                      var3 = stackIn_18_0;
                      var4++;
                      continue L3;
                    } else {
                      L5: {
                        if (var5 != 34) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            return so.field_t;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L3;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return so.field_t;
              }
            }
          }
        } else {
          return jo.field_e;
        }
    }

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_k = null;
        int var1 = 50 % ((-63 - param0) / 43);
        field_i = null;
    }

    abstract void a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Add <%0> to ignore list";
        field_d = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_i = new ip();
    }
}
