/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv implements mh {
    static String field_b;
    private int field_a;
    private int field_d;
    private vn field_c;

    public static void b(int param0) {
        if (param0 < 38) {
            bv.a(31);
            field_b = null;
            return;
        }
        field_b = null;
    }

    public bv() {
        ((bv) this).field_a = 1;
        ((bv) this).field_d = 1;
        ((bv) this).field_c = kw.field_b;
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var11 = Sumoblitz.field_L ? 1 : 0;
          if (param0.field_k) {
            stackOut_19_0 = 3249872;
            stackIn_21_0 = stackOut_19_0;
            break L0;
          } else {
            if (!param0.d(-1)) {
              stackOut_20_0 = 2188450;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              L1: {
                var6 = 3249872;
                int discarded$2 = ((bv) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_m + "</u>", param4 - -param0.field_r, param0.field_v + param1, param0.field_q, param0.field_p, var6, -1, ((bv) this).field_d, ((bv) this).field_a, ((bv) this).field_c.field_s + ((bv) this).field_c.field_I);
                if (!param0.d(-1)) {
                  break L1;
                } else {
                  L2: {
                    var7 = ((bv) this).field_c.a(param0.field_m);
                    var8 = ((bv) this).field_c.field_s - -((bv) this).field_c.field_I;
                    var9 = param4 - -param0.field_r;
                    if (2 == ((bv) this).field_d) {
                      var9 = var9 + (-var7 + param0.field_q);
                      break L2;
                    } else {
                      if (1 != ((bv) this).field_d) {
                        break L2;
                      } else {
                        var9 = var9 + (param0.field_q - var7 >> -363927231);
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var10 = param0.field_v + param1;
                    if (-3 == ((bv) this).field_a) {
                      var10 = var10 + (param0.field_p + -var8);
                      break L3;
                    } else {
                      if (-2 == ((bv) this).field_a) {
                        L4: {
                          var10 = var10 + (param0.field_p + -var8 >> 863028641);
                          pp.a(var10 + 2, 4 + var7, param2 ^ -5596714, var9 - 2, var8);
                          if (param2 == 5592405) {
                            break L4;
                          } else {
                            ((bv) this).field_a = 59;
                            break L4;
                          }
                        }
                        return;
                      } else {
                        break L3;
                      }
                    }
                  }
                  pp.a(var10 + 2, 4 + var7, param2 ^ -5596714, var9 - 2, var8);
                  break L1;
                }
              }
              if (param2 != 5592405) {
                ((bv) this).field_a = 59;
                return;
              } else {
                return;
              }
            }
          }
        }
        L5: {
          var6 = stackIn_21_0;
          int discarded$3 = ((bv) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_m + "</u>", param4 - -param0.field_r, param0.field_v + param1, param0.field_q, param0.field_p, var6, -1, ((bv) this).field_d, ((bv) this).field_a, ((bv) this).field_c.field_s + ((bv) this).field_c.field_I);
          if (!param0.d(-1)) {
            break L5;
          } else {
            L6: {
              var7 = ((bv) this).field_c.a(param0.field_m);
              var8 = ((bv) this).field_c.field_s - -((bv) this).field_c.field_I;
              var9 = param4 - -param0.field_r;
              if (2 == ((bv) this).field_d) {
                var9 = var9 + (-var7 + param0.field_q);
                break L6;
              } else {
                if (1 != ((bv) this).field_d) {
                  break L6;
                } else {
                  var9 = var9 + (param0.field_q - var7 >> -363927231);
                  var10 = param0.field_v + param1;
                  if (-3 == ((bv) this).field_a) {
                    var10 = var10 + (param0.field_p + -var8);
                    pp.a(var10 + 2, 4 + var7, param2 ^ -5596714, var9 - 2, var8);
                    if (param2 != 5592405) {
                      ((bv) this).field_a = 59;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (-2 == ((bv) this).field_a) {
                      var10 = var10 + (param0.field_p + -var8 >> 863028641);
                      pp.a(var10 + 2, 4 + var7, param2 ^ -5596714, var9 - 2, var8);
                      if (param2 == 5592405) {
                        return;
                      } else {
                        ((bv) this).field_a = 59;
                        return;
                      }
                    } else {
                      L7: {
                        pp.a(var10 + 2, 4 + var7, param2 ^ -5596714, var9 - 2, var8);
                        if (param2 == 5592405) {
                          break L7;
                        } else {
                          ((bv) this).field_a = 59;
                          break L7;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
            var10 = param0.field_v + param1;
            if (-3 == ((bv) this).field_a) {
              var10 = var10 + (param0.field_p + -var8);
              pp.a(var10 + 2, 4 + var7, param2 ^ -5596714, var9 - 2, var8);
              break L5;
            } else {
              if (-2 == ((bv) this).field_a) {
                var10 = var10 + (param0.field_p + -var8 >> 863028641);
                pp.a(var10 + 2, 4 + var7, param2 ^ -5596714, var9 - 2, var8);
                if (param2 != 5592405) {
                  ((bv) this).field_a = 59;
                  return;
                } else {
                  return;
                }
              } else {
                pp.a(var10 + 2, 4 + var7, param2 ^ -5596714, var9 - 2, var8);
                if (param2 != 5592405) {
                  ((bv) this).field_a = 59;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param2 != 5592405) {
          ((bv) this).field_a = 59;
          return;
        } else {
          return;
        }
    }

    bv(vn param0, int param1, int param2) {
        ((bv) this).field_a = param2;
        ((bv) this).field_c = param0;
        ((bv) this).field_d = param1;
    }

    final static void a(int param0) {
        Object var2 = null;
        wv.a((byte) 99, in.field_C, (String) null);
        if (param0 != -363927231) {
            bv.a(-108);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Friends can be added in multiplayer<nbsp>games";
    }
}
