/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wpb extends rqa {
    static java.awt.Color field_p;
    static String field_o;

    wpb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            asb discarded$0 = wpb.a(108, -55);
            field_p = null;
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        oq.field_d = param0[0].a(66);
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((wpb) this).a((nc[]) null, -50);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static boolean a(int[] param0, int[] param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var5 = VoidHunters.field_G;
        if (param0 == param1) {
          return false;
        } else {
          if (param1 != null) {
            if (param0 != null) {
              if (param2 == 28) {
                if (param1.length != param0.length) {
                  return true;
                } else {
                  var3 = 0;
                  var4 = param1.length - 3;
                  L0: while (true) {
                    if (var4 <= var3) {
                      var4 += 3;
                      L1: while (true) {
                        if (var4 > var3) {
                          if (param0[var3] == param1[var3]) {
                            var3++;
                            continue L1;
                          } else {
                            return true;
                          }
                        } else {
                          return false;
                        }
                      }
                    } else {
                      if (param0[var3] == param1[var3]) {
                        var3++;
                        if (param1[var3] != param0[var3]) {
                          return true;
                        } else {
                          var3++;
                          if (param1[var3] != param0[var3]) {
                            return true;
                          } else {
                            var3++;
                            if (param0[var3] == param1[var3]) {
                              var3++;
                              continue L0;
                            } else {
                              return true;
                            }
                          }
                        }
                      } else {
                        return true;
                      }
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            L2: {
              if (param0 == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final static asb a(int param0, int param1) {
        asb stackIn_5_0 = null;
        asb stackIn_11_0 = null;
        asb stackOut_9_0 = null;
        asb stackOut_4_0 = null;
        asb stackOut_3_0 = null;
        if (param1 == 11835) {
          if (akb.field_a == null) {
            if (-1 == param0) {
              return akb.field_a;
            } else {
              return mla.a(true, false, -52, true, param0, 1);
            }
          } else {
            stackOut_9_0 = akb.field_a;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0;
          }
        } else {
          field_o = null;
          if (akb.field_a != null) {
            return akb.field_a;
          } else {
            L0: {
              if (-1 != param0) {
                stackOut_4_0 = mla.a(true, false, -52, true, param0, 1);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = akb.field_a;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Accept rematch";
        field_p = new java.awt.Color(10040319);
    }
}
