/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static vc field_d;
    static boolean field_e;
    static String field_c;
    static pl field_a;
    static int field_b;

    final static dj a(int param0, byte[] param1) {
        dj var2 = null;
        if (param1 != null) {
          if (param0 != -26395) {
            return null;
          } else {
            var2 = new dj(param1, vg.field_I, b.field_b, ij.field_H, ob.field_a, rd.field_d, of.field_d);
            c.o(-28210);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (fleas.field_E != 0) {
            break L0;
          } else {
            if (fl.field_f) {
              var1 = (int)(ma.a((double)ni.field_j / 50.0, param0 + 58) * 32.0);
              var2 = 1;
              if (tj.field_a == 0) {
                L1: {
                  var3 = 17;
                  var4 = 24;
                  if (fl.field_c[var4][var3] == 0) {
                    ej.a(var2, var3, var1, (byte) 64, var4, var2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var3 = 18;
                  var4 = 25;
                  if (fl.field_c[var4][var3] == 0) {
                    ej.a(var2, var3, var1, (byte) 76, var4, var2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var3 = 19;
                var4 = 26;
                if (fl.field_c[var4][var3] != 0) {
                  L3: {
                    if ((tj.field_a ^ -1) != -3) {
                      break L3;
                    } else {
                      var4 = 20;
                      var3 = 4;
                      if (0 == fl.field_c[var4][var3]) {
                        break L3;
                      } else {
                        var2 = 3;
                        ej.a(var2, var3, var1, (byte) -54, var4, var2);
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (3 != tj.field_a) {
                      break L4;
                    } else {
                      var4 = 18;
                      var3 = 4;
                      ej.a(18, var3, var1, (byte) 102, var4, 1);
                      ej.a(1, var3, var1, (byte) 65, var4, 10);
                      break L4;
                    }
                  }
                  L5: {
                    if (-5 != (tj.field_a ^ -1)) {
                      break L5;
                    } else {
                      var4 = 18;
                      var3 = 13;
                      ej.a(1, var3, var1, (byte) -48, var4, 1);
                      var3 = 4;
                      var4 = 19;
                      ej.a(1, var3, var1, (byte) -30, var4, 1);
                      break L5;
                    }
                  }
                  L6: {
                    if (5 != tj.field_a) {
                      break L6;
                    } else {
                      var3 = 19;
                      var4 = 12;
                      ej.a(1, var3, var1, (byte) 58, var4, 1);
                      break L6;
                    }
                  }
                  L7: {
                    if (-7 != (tj.field_a ^ -1)) {
                      break L7;
                    } else {
                      var4 = 11;
                      var3 = 13;
                      ej.a(1, var3, var1, (byte) 67, var4, 3);
                      break L7;
                    }
                  }
                  L8: {
                    if (tj.field_a == 7) {
                      var3 = 2;
                      var4 = 7;
                      ej.a(1, var3, var1, (byte) 91, var4, 18);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if (-9 != (tj.field_a ^ -1)) {
                    if (-10 == (tj.field_a ^ -1)) {
                      var3 = 4;
                      var4 = 17;
                      ej.a(1, var3, var1, (byte) -71, var4, 2);
                      var4 = 24;
                      var3 = 4;
                      ej.a(1, var3, var1, (byte) 107, var4, 2);
                      var3 = 9;
                      var4 = 30;
                      ej.a(1, var3, var1, (byte) 56, var4, 2);
                      break L0;
                    } else {
                      if (param0 != 7) {
                        bk.b(-74);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L9: {
                      ej.field_a[8].field_a = 115;
                      ej.field_a[8].field_l = 250;
                      ej.field_a[8].c(18);
                      if (-10 == (tj.field_a ^ -1)) {
                        var3 = 4;
                        var4 = 17;
                        ej.a(1, var3, var1, (byte) -71, var4, 2);
                        var4 = 24;
                        var3 = 4;
                        ej.a(1, var3, var1, (byte) 107, var4, 2);
                        var3 = 9;
                        var4 = 30;
                        ej.a(1, var3, var1, (byte) 56, var4, 2);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (param0 != 7) {
                      bk.b(-74);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L10: {
                    ej.a(var2, var3, var1, (byte) 58, var4, var2);
                    if ((tj.field_a ^ -1) != -3) {
                      break L10;
                    } else {
                      var4 = 20;
                      var3 = 4;
                      if (0 == fl.field_c[var4][var3]) {
                        break L10;
                      } else {
                        var2 = 3;
                        ej.a(var2, var3, var1, (byte) -54, var4, var2);
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (3 != tj.field_a) {
                      break L11;
                    } else {
                      var4 = 18;
                      var3 = 4;
                      ej.a(18, var3, var1, (byte) 102, var4, 1);
                      ej.a(1, var3, var1, (byte) 65, var4, 10);
                      break L11;
                    }
                  }
                  L12: {
                    if (-5 != (tj.field_a ^ -1)) {
                      break L12;
                    } else {
                      var4 = 18;
                      var3 = 13;
                      ej.a(1, var3, var1, (byte) -48, var4, 1);
                      var3 = 4;
                      var4 = 19;
                      ej.a(1, var3, var1, (byte) -30, var4, 1);
                      break L12;
                    }
                  }
                  L13: {
                    if (5 != tj.field_a) {
                      break L13;
                    } else {
                      var3 = 19;
                      var4 = 12;
                      ej.a(1, var3, var1, (byte) 58, var4, 1);
                      break L13;
                    }
                  }
                  L14: {
                    if (-7 != (tj.field_a ^ -1)) {
                      break L14;
                    } else {
                      var4 = 11;
                      var3 = 13;
                      ej.a(1, var3, var1, (byte) 67, var4, 3);
                      break L14;
                    }
                  }
                  L15: {
                    if (tj.field_a == 7) {
                      var3 = 2;
                      var4 = 7;
                      ej.a(1, var3, var1, (byte) 91, var4, 18);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  if (-9 != (tj.field_a ^ -1)) {
                    L16: {
                      if (-10 == (tj.field_a ^ -1)) {
                        var3 = 4;
                        var4 = 17;
                        ej.a(1, var3, var1, (byte) -71, var4, 2);
                        var4 = 24;
                        var3 = 4;
                        ej.a(1, var3, var1, (byte) 107, var4, 2);
                        var3 = 9;
                        var4 = 30;
                        ej.a(1, var3, var1, (byte) 56, var4, 2);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (param0 != 7) {
                      bk.b(-74);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L17: {
                      ej.field_a[8].field_a = 115;
                      ej.field_a[8].field_l = 250;
                      ej.field_a[8].c(18);
                      if (-10 == (tj.field_a ^ -1)) {
                        var3 = 4;
                        var4 = 17;
                        ej.a(1, var3, var1, (byte) -71, var4, 2);
                        var4 = 24;
                        var3 = 4;
                        ej.a(1, var3, var1, (byte) 107, var4, 2);
                        var3 = 9;
                        var4 = 30;
                        ej.a(1, var3, var1, (byte) 56, var4, 2);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (param0 == 7) {
                        break L18;
                      } else {
                        bk.b(-74);
                        break L18;
                      }
                    }
                    return;
                  }
                }
              } else {
                L19: {
                  if ((tj.field_a ^ -1) != -3) {
                    break L19;
                  } else {
                    var4 = 20;
                    var3 = 4;
                    if (0 == fl.field_c[var4][var3]) {
                      break L19;
                    } else {
                      var2 = 3;
                      ej.a(var2, var3, var1, (byte) -54, var4, var2);
                      break L19;
                    }
                  }
                }
                L20: {
                  if (3 != tj.field_a) {
                    break L20;
                  } else {
                    var4 = 18;
                    var3 = 4;
                    ej.a(18, var3, var1, (byte) 102, var4, 1);
                    ej.a(1, var3, var1, (byte) 65, var4, 10);
                    break L20;
                  }
                }
                L21: {
                  if (-5 != (tj.field_a ^ -1)) {
                    break L21;
                  } else {
                    var4 = 18;
                    var3 = 13;
                    ej.a(1, var3, var1, (byte) -48, var4, 1);
                    var3 = 4;
                    var4 = 19;
                    ej.a(1, var3, var1, (byte) -30, var4, 1);
                    break L21;
                  }
                }
                L22: {
                  if (5 != tj.field_a) {
                    break L22;
                  } else {
                    var3 = 19;
                    var4 = 12;
                    ej.a(1, var3, var1, (byte) 58, var4, 1);
                    break L22;
                  }
                }
                L23: {
                  if (-7 != (tj.field_a ^ -1)) {
                    break L23;
                  } else {
                    var4 = 11;
                    var3 = 13;
                    ej.a(1, var3, var1, (byte) 67, var4, 3);
                    break L23;
                  }
                }
                L24: {
                  if (tj.field_a == 7) {
                    var3 = 2;
                    var4 = 7;
                    ej.a(1, var3, var1, (byte) 91, var4, 18);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                if (-9 != (tj.field_a ^ -1)) {
                  if (-10 == (tj.field_a ^ -1)) {
                    var3 = 4;
                    var4 = 17;
                    ej.a(1, var3, var1, (byte) -71, var4, 2);
                    var4 = 24;
                    var3 = 4;
                    ej.a(1, var3, var1, (byte) 107, var4, 2);
                    var3 = 9;
                    var4 = 30;
                    ej.a(1, var3, var1, (byte) 56, var4, 2);
                    if (param0 != 7) {
                      bk.b(-74);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 != 7) {
                      bk.b(-74);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L25: {
                    ej.field_a[8].field_a = 115;
                    ej.field_a[8].field_l = 250;
                    ej.field_a[8].c(18);
                    if (-10 == (tj.field_a ^ -1)) {
                      var3 = 4;
                      var4 = 17;
                      ej.a(1, var3, var1, (byte) -71, var4, 2);
                      var4 = 24;
                      var3 = 4;
                      ej.a(1, var3, var1, (byte) 107, var4, 2);
                      var3 = 9;
                      var4 = 30;
                      ej.a(1, var3, var1, (byte) 56, var4, 2);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (param0 == 7) {
                      break L26;
                    } else {
                      bk.b(-74);
                      break L26;
                    }
                  }
                  return;
                }
              }
            } else {
              if (param0 == 7) {
                return;
              } else {
                bk.b(-74);
                return;
              }
            }
          }
        }
        if (param0 != 7) {
          bk.b(-74);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, fa param2, fa param3) {
        pb.field_e = param3;
        if (param0 != -5237) {
          field_b = -126;
          lj.field_a = param2;
          vh.field_l = param1;
          rb.a(gb.field_d / 2, gb.field_k / 2, (byte) 70);
          hg.a(0, param2.field_K + param2.field_y, param2.field_y, param3.field_y - -param3.field_K, param3.field_y);
          return;
        } else {
          lj.field_a = param2;
          vh.field_l = param1;
          rb.a(gb.field_d / 2, gb.field_k / 2, (byte) 70);
          hg.a(0, param2.field_K + param2.field_y, param2.field_y, param3.field_y - -param3.field_K, param3.field_y);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 6564) {
          field_c = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Quit";
        field_d = new vc();
        field_a = new pl(1);
    }
}
