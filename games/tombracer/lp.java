/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    int field_b;
    boolean field_a;
    int field_d;
    int field_e;
    int field_c;
    boolean field_i;
    int field_f;
    static ko field_h;
    static int field_g;

    final void a(int param0, int param1, uia param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 == -1) {
          L0: while (true) {
            var4 = param2.h(255);
            if (var4 != 0) {
              this.a(param2, param1, (byte) -124, var4);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static vna a(byte param0, String param1) {
        vna var2 = null;
        in var3 = null;
        int var4 = 0;
        int var5 = 0;
        in var6 = null;
        in var7 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 == 48) {
          var2 = new vna();
          var6 = new in(param1);
          L0: while (true) {
            if (var6.a(0)) {
              return var2;
            } else {
              var4 = var6.b(21098);
              if (Character.isWhitespace((char) var4)) {
                continue L0;
              } else {
                L1: {
                  if (var4 == 34) {
                    break L1;
                  } else {
                    if (var4 == 39) {
                      break L1;
                    } else {
                      if (var4 == 40) {
                        var2.b((byte) -90, (vg) (Object) new mi(lna.field_a, -1 + var6.field_b));
                        continue L0;
                      } else {
                        if (var4 == 41) {
                          var2.b((byte) -112, (vg) (Object) new mi(rs.field_a, var6.field_b - 1));
                          continue L0;
                        } else {
                          if (44 == var4) {
                            var2.b((byte) -107, (vg) (Object) new mi(qba.field_c, var6.field_b + -1));
                            continue L0;
                          } else {
                            var2.b((byte) -75, (vg) (Object) ska.a(param0 + -93, var6));
                            continue L0;
                          }
                        }
                      }
                    }
                  }
                }
                var2.b((byte) -81, (vg) (Object) hb.a(var6, false));
                continue L0;
              }
            }
          }
        } else {
          field_h = null;
          var2 = new vna();
          var7 = new in(param1);
          var3 = var7;
          L2: while (true) {
            if (var7.a(0)) {
              return var2;
            } else {
              var4 = var7.b(21098);
              if (Character.isWhitespace((char) var4)) {
                continue L2;
              } else {
                L3: {
                  if (var4 == 34) {
                    break L3;
                  } else {
                    if (var4 == 39) {
                      break L3;
                    } else {
                      if (var4 == 40) {
                        var2.b((byte) -90, (vg) (Object) new mi(lna.field_a, -1 + var7.field_b));
                        continue L2;
                      } else {
                        if (var4 == 41) {
                          var2.b((byte) -112, (vg) (Object) new mi(rs.field_a, var7.field_b - 1));
                          continue L2;
                        } else {
                          if (44 == var4) {
                            var2.b((byte) -107, (vg) (Object) new mi(qba.field_c, var7.field_b + -1));
                            continue L2;
                          } else {
                            var2.b((byte) -75, (vg) (Object) ska.a(param0 + -93, var7));
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
                var2.b((byte) -81, (vg) (Object) hb.a(var7, false));
                continue L2;
              }
            }
          }
        }
    }

    private final void a(uia param0, int param1, byte param2, int param3) {
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (1 != param3) {
          if (param3 == -3) {
            ((lp) this).field_d = 1 + param0.d(123);
            ((lp) this).field_b = 1 + param0.d(122);
            if (param2 >= -121) {
              lp.a((byte) -38);
              return;
            } else {
              return;
            }
          } else {
            if (-4 != param3) {
              if (param3 == 4) {
                ((lp) this).field_e = param0.h(255);
                if (param2 < -121) {
                  return;
                } else {
                  lp.a((byte) -38);
                  return;
                }
              } else {
                if (param3 != 5) {
                  if (param3 == 6) {
                    ((lp) this).field_a = true;
                    if (param2 < -121) {
                      return;
                    } else {
                      lp.a((byte) -38);
                      return;
                    }
                  } else {
                    if (param3 == 7) {
                      ((lp) this).field_i = true;
                      if (param2 < -121) {
                        return;
                      } else {
                        lp.a((byte) -38);
                        return;
                      }
                    } else {
                      if (param2 < -121) {
                        return;
                      } else {
                        lp.a((byte) -38);
                        return;
                      }
                    }
                  }
                } else {
                  ((lp) this).field_c = param0.h(255);
                  if (param2 < -121) {
                    return;
                  } else {
                    lp.a((byte) -38);
                    return;
                  }
                }
              }
            } else {
              byte discarded$1 = param0.c((byte) 64);
              if (param2 < -121) {
                return;
              } else {
                lp.a((byte) -38);
                return;
              }
            }
          }
        } else {
          ((lp) this).field_f = param0.d(126);
          if ((((lp) this).field_f ^ -1) == -65536) {
            ((lp) this).field_f = -1;
            if (param2 < -121) {
              return;
            } else {
              lp.a((byte) -38);
              return;
            }
          } else {
            if (param2 < -121) {
              return;
            } else {
              lp.a((byte) -38);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 34) {
            field_g = 31;
            field_h = null;
            return;
        }
        field_h = null;
    }

    lp() {
        ((lp) this).field_e = 2;
        ((lp) this).field_a = false;
        ((lp) this).field_i = false;
        ((lp) this).field_b = 64;
        ((lp) this).field_d = 64;
        ((lp) this).field_f = -1;
        ((lp) this).field_c = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ko(1);
        field_g = 0;
    }
}
