/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends qr {
    static String field_z;
    private static String[] field_y;
    static int field_A;

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        vp var7 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var7 = ava.field_f;
        if (var7 != null) {
          if (((k) this).a(param5, param3, 17, param2, param4)) {
            if (!(((k) this).field_h instanceof kja)) {
              if (!(var7.field_h instanceof kja)) {
                return;
              } else {
                ((kja) (Object) var7.field_h).a(var7, (byte) 59, (k) this);
                ava.field_f = null;
                return;
              }
            } else {
              ((kja) (Object) ((k) this).field_h).a(var7, (byte) 59, (k) this);
              ava.field_f = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private k(int param0, int param1, int param2, int param3, isa param4, qc param5, ae param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((k) this).field_x = param6;
    }

    final static void a(byte param0, gqa param1) {
        int var2 = 0;
        int var4 = 0;
        gqa var5 = null;
        gqa var6 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (null != param1.field_f) {
          if (-1 == (param1.field_c ^ -1)) {
            if (param1.field_o == 0) {
              if (null == param1.field_h) {
                if (param0 < 103) {
                  return;
                } else {
                  tna.a(16599, param1);
                  return;
                }
              } else {
                tba.field_g = param1.field_j;
                fp.field_d = param1.field_h;
                uba.field_f = param1.field_d;
                bla.field_I = param1.field_i;
                if (param0 < 103) {
                  return;
                } else {
                  tna.a(16599, param1);
                  return;
                }
              }
            } else {
              L0: {
                var2 = 0;
                if (ara.field_xb <= var2) {
                  break L0;
                } else {
                  L1: {
                    var6 = wea.field_d[var2];
                    if (2 != var6.field_d) {
                      var2++;
                      break L1;
                    } else {
                      L2: {
                        if (param1.field_c != var6.field_c) {
                          var2++;
                          break L2;
                        } else {
                          if (param1.field_o != var6.field_o) {
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                      var2++;
                      break L1;
                    }
                  }
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  break L0;
                }
              }
              if (null == param1.field_h) {
                if (param0 < 103) {
                  return;
                } else {
                  tna.a(16599, param1);
                  return;
                }
              } else {
                tba.field_g = param1.field_j;
                fp.field_d = param1.field_h;
                uba.field_f = param1.field_d;
                bla.field_I = param1.field_i;
                if (param0 < 103) {
                  return;
                } else {
                  tna.a(16599, param1);
                  return;
                }
              }
            }
          } else {
            L3: {
              var2 = 0;
              if (ara.field_xb <= var2) {
                break L3;
              } else {
                L4: {
                  var5 = wea.field_d[var2];
                  if (2 != var5.field_d) {
                    var2++;
                    break L4;
                  } else {
                    L5: {
                      if (param1.field_c != var5.field_c) {
                        var2++;
                        break L5;
                      } else {
                        if (param1.field_o != var5.field_o) {
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    var2++;
                    break L4;
                  }
                }
                var2++;
                var2++;
                var2++;
                var2++;
                break L3;
              }
            }
            if (null == param1.field_h) {
              if (param0 < 103) {
                return;
              } else {
                tna.a(16599, param1);
                return;
              }
            } else {
              tba.field_g = param1.field_j;
              fp.field_d = param1.field_h;
              uba.field_f = param1.field_d;
              bla.field_I = param1.field_i;
              if (param0 < 103) {
                return;
              } else {
                tna.a(16599, param1);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void e(int param0) {
        field_z = null;
        if (param0 != 0) {
            Object var2 = null;
            k.a((byte) -103, (gqa) null);
            field_y = null;
            return;
        }
        field_y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Match by...";
        field_y = new String[5];
        field_y[0] = "Simple";
        field_y[3] = "Falling";
        field_y[2] = "Kit";
        field_y[4] = "Maze";
        field_y[1] = "Portal";
    }
}
