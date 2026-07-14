/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int field_e;
    static String field_c;
    static int field_f;
    static db[] field_d;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 0) {
            Object var2 = null;
            String discarded$0 = ef.a((CharSequence[]) null, 75);
        }
        field_d = null;
    }

    final static String a(CharSequence[] param0, int param1) {
        if (param1 != 0) {
            field_e = 96;
        }
        return vl.a(param0.length, param0, 0, -96);
    }

    final static kb a(long param0, int param1, String param2, boolean param3, String param4) {
        L0: {
          if (0L != param0) {
            break L0;
          } else {
            if (param2 != null) {
              return (kb) (Object) new a(param2, param4);
            } else {
              break L0;
            }
          }
        }
        if (!param3) {
          if (param1 == -27981) {
            return (kb) (Object) new fk(param0, param4);
          } else {
            return null;
          }
        } else {
          return (kb) (Object) new pf(param0, param4);
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        var2 = param0.length();
        var3 = new StringBuilder(var2);
        if (param1 <= -12) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= var2) {
              return var3.toString();
            } else {
              L1: {
                L2: {
                  var5 = param0.charAt(var4);
                  if (var5 < 97) {
                    break L2;
                  } else {
                    if (122 >= var5) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var5 < 48) {
                    break L3;
                  } else {
                    if (var5 <= 57) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 < 65) {
                    break L4;
                  } else {
                    if (90 < var5) {
                      break L4;
                    } else {
                      StringBuilder discarded$68 = var3.append((char)(-65 + (var5 + 97)));
                      var4++;
                      continue L0;
                    }
                  }
                }
                L5: {
                  if (var5 == 43) {
                    break L5;
                  } else {
                    if (var5 != 38) {
                      var6 = var3.length();
                      if (var6 < -1) {
                        if (-96 != var3.charAt(var6 - 1)) {
                          StringBuilder discarded$69 = var3.append(95);
                          var4++;
                          continue L0;
                        } else {
                          var4++;
                          continue L0;
                        }
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                StringBuilder discarded$70 = var3.append(43);
                var4++;
                continue L0;
              }
              StringBuilder discarded$71 = var3.append(var5);
              var4++;
              continue L0;
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
        field_e = 0;
        field_c = "Waiting for extra data";
        field_a = 0;
    }
}
