/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static int[] field_c;
    int field_b;
    int field_a;

    final static boolean a(int param0, int param1, boolean param2) {
        int var3 = 0;
        Object var4 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          if (param2) {
            break L0;
          } else {
            bi.a(-33);
            break L0;
          }
        }
        L1: {
          if (null == la.field_h) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var3 = stackIn_5_0;
        if (um.field_Gb != 9) {
          if (10 != um.field_Gb) {
            if ((um.field_Gb ^ -1) == -12) {
              if (li.field_m) {
                L2: {
                  if (ve.field_o != 2) {
                    break L2;
                  } else {
                    if (hm.a(hn.field_n, nd.field_c, -24236)) {
                      break L2;
                    } else {
                      return false;
                    }
                  }
                }
                if (2 == ve.field_o) {
                  if (!he.h(-120)) {
                    return true;
                  } else {
                    var4 = null;
                    jl.a(ld.field_d, ve.field_o, hn.field_n, param0, (byte) 39, (String) null);
                    return true;
                  }
                } else {
                  if (var3 != 0) {
                    return false;
                  } else {
                    if (!he.h(-120)) {
                      return true;
                    } else {
                      var4 = null;
                      jl.a(ld.field_d, ve.field_o, hn.field_n, param0, (byte) 39, (String) null);
                      return true;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (var3 != 0) {
              return false;
            } else {
              tf.a((byte) 86);
              return true;
            }
          }
        } else {
          if (oa.a(28977, ca.field_O, an.field_a, i.field_F, sh.field_ub)) {
            L3: {
              if (-3 == (i.field_F ^ -1)) {
                break L3;
              } else {
                if (var3 == 0) {
                  break L3;
                } else {
                  return false;
                }
              }
            }
            return ul.a(an.field_a, i.field_F, -22557, ca.field_O, sh.field_ub);
          } else {
            if (10 != um.field_Gb) {
              if ((um.field_Gb ^ -1) == -12) {
                if (li.field_m) {
                  L4: {
                    if (ve.field_o != 2) {
                      break L4;
                    } else {
                      if (hm.a(hn.field_n, nd.field_c, -24236)) {
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (2 == ve.field_o) {
                    if (he.h(-120)) {
                      var4 = null;
                      jl.a(ld.field_d, ve.field_o, hn.field_n, param0, (byte) 39, (String) null);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    if (var3 == 0) {
                      L5: {
                        if (!he.h(-120)) {
                          break L5;
                        } else {
                          var4 = null;
                          jl.a(ld.field_d, ve.field_o, hn.field_n, param0, (byte) 39, (String) null);
                          break L5;
                        }
                      }
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              if (var3 != 0) {
                return false;
              } else {
                tf.a((byte) 86);
                return true;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 46) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    bi(int param0, int param1, int param2, int param3, int param4) {
        ((bi) this).field_a = param0;
        ((bi) this).field_b = param1;
    }

    static {
    }
}
