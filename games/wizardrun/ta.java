/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta {
    static rc field_c;
    static String field_d;
    static int field_a;
    static String field_e;
    static o field_b;
    static String field_f;

    final static boolean a(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 60) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (ri.field_a < 20) {
              break L2;
            } else {
              if (!ph.a((byte) 71)) {
                break L2;
              } else {
                L3: {
                  if (0 >= ei.field_t) {
                    break L3;
                  } else {
                    if (hd.g((byte) 80)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void b(int param0) {
        field_d = null;
        field_f = null;
        field_c = null;
        if (param0 != -1) {
            field_c = null;
        }
        field_e = null;
        field_b = null;
    }

    abstract void a(java.awt.Component param0, int param1);

    abstract void b(java.awt.Component param0, int param1);

    abstract int a(int param0);

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = wizardrun.field_H;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!d.a(true, param1.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!d.a(true, param1.charAt(var3 + -1))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              L4: {
                var4 = -var2 + var3;
                if (param0 <= -48) {
                  break L4;
                } else {
                  field_b = null;
                  break L4;
                }
              }
              if (var4 >= 1) {
                if ((var4 ^ -1) >= -13) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L5: while (true) {
                    if (var6 >= var3) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param1.charAt(var6);
                      if (fg.a((char) var7, 0)) {
                        var8 = sf.a(-1514, (char) var7);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
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
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_e = "Members";
        field_f = "take you to the top.  Beware of the rats doing this.";
        field_c = new rc();
    }
}
