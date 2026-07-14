/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static String field_d;
    static String field_a;
    static String field_c;
    static long field_b;
    static String field_e;

    final static vh a(eh param0, int param1, String param2, String param3, eh param4) {
        int var5 = param0.a(param1, param2);
        int var6 = param0.a(-70, var5, param3);
        return ie.a(false, var6, var5, param0, param4);
    }

    final static void a(mg param0, byte param1) {
        Object var2 = null;
        ij var2_ref = null;
        rm[] var3 = null;
        int var5 = 0;
        rm var6 = null;
        rm var10 = null;
        rm var15 = null;
        rm var16 = null;
        var2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        pj.a(param0, 256);
        if (!db.b((byte) 13, 0)) {
          df.b(0, 0, 200, 400, 8421504);
          if (param1 <= -24) {
            var2_ref = (ij) (Object) sk.field_a.a((byte) -98);
            L0: while (true) {
              if (var2_ref == null) {
                ul.b((byte) 121);
                return;
              } else {
                L1: {
                  if (0 == var2_ref.field_g) {
                    var3 = tk.field_d;
                    break L1;
                  } else {
                    if (1 != var2_ref.field_g) {
                      var3 = wh.field_b;
                      break L1;
                    } else {
                      var3 = ic.field_y;
                      break L1;
                    }
                  }
                }
                L2: {
                  var15 = var3[var2_ref.field_o / 3];
                  var15.field_m[1] = var2_ref.field_l * 65793;
                  if (!var2_ref.field_p) {
                    var15.b(-31, 200);
                    break L2;
                  } else {
                    var15.a(-31, 200);
                    break L2;
                  }
                }
                var2_ref = (ij) (Object) sk.field_a.a(16213);
                continue L0;
              }
            }
          } else {
            pc.a(111);
            var2_ref = (ij) (Object) sk.field_a.a((byte) -98);
            L3: while (true) {
              if (var2_ref == null) {
                ul.b((byte) 121);
                return;
              } else {
                L4: {
                  if (0 == var2_ref.field_g) {
                    var3 = tk.field_d;
                    break L4;
                  } else {
                    if (1 != var2_ref.field_g) {
                      var3 = wh.field_b;
                      break L4;
                    } else {
                      var3 = ic.field_y;
                      break L4;
                    }
                  }
                }
                L5: {
                  var16 = var3[var2_ref.field_o / 3];
                  var16.field_m[1] = var2_ref.field_l * 65793;
                  if (!var2_ref.field_p) {
                    var16.b(-31, 200);
                    break L5;
                  } else {
                    var16.a(-31, 200);
                    break L5;
                  }
                }
                var2_ref = (ij) (Object) sk.field_a.a(16213);
                continue L3;
              }
            }
          }
        } else {
          if (sh.a(4712, 100) == 0) {
            df.b(0, 0, 200, 400, 8421504);
            if (param1 <= -24) {
              var2_ref = (ij) (Object) sk.field_a.a((byte) -98);
              L6: while (true) {
                if (var2_ref == null) {
                  ul.b((byte) 121);
                  return;
                } else {
                  L7: {
                    if (0 == var2_ref.field_g) {
                      var3 = tk.field_d;
                      break L7;
                    } else {
                      if (1 != var2_ref.field_g) {
                        var3 = wh.field_b;
                        break L7;
                      } else {
                        var3 = ic.field_y;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var6 = var3[var2_ref.field_o / 3];
                    var6.field_m[1] = var2_ref.field_l * 65793;
                    if (!var2_ref.field_p) {
                      var6.b(-31, 200);
                      break L8;
                    } else {
                      var6.a(-31, 200);
                      break L8;
                    }
                  }
                  var2_ref = (ij) (Object) sk.field_a.a(16213);
                  continue L6;
                }
              }
            } else {
              pc.a(111);
              var2_ref = (ij) (Object) sk.field_a.a((byte) -98);
              L9: while (true) {
                if (var2_ref == null) {
                  ul.b((byte) 121);
                  return;
                } else {
                  L10: {
                    if (0 == var2_ref.field_g) {
                      var3 = tk.field_d;
                      break L10;
                    } else {
                      if (1 != var2_ref.field_g) {
                        var3 = wh.field_b;
                        break L10;
                      } else {
                        var3 = ic.field_y;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    var10 = var3[var2_ref.field_o / 3];
                    var10.field_m[1] = var2_ref.field_l * 65793;
                    if (!var2_ref.field_p) {
                      var10.b(-31, 200);
                      break L11;
                    } else {
                      var10.a(-31, 200);
                      break L11;
                    }
                  }
                  var2_ref = (ij) (Object) sk.field_a.a(16213);
                  continue L9;
                }
              }
            }
          } else {
            df.b(0, 0, 200, 400, 0);
            ul.b((byte) 96);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        if (param0 != -30114) {
            field_b = -39L;
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create a free account to";
        field_c = "Show all game chat";
        field_e = "Your opponent is <%0>.";
        field_d = "Email (Login):";
    }
}
