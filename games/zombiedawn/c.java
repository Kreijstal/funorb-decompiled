/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static String field_a;
    static vo field_b;
    static int field_c;

    final static cg[] b(int param0) {
        if (param0 != 19795) {
          boolean discarded$1 = c.a('ￄ', 89);
          return new cg[]{kl.field_p, hl.field_d, rf.field_c, hl.field_g, uj.field_a, mh.field_I, lo.field_s, nl.field_m, bd.field_q, be.field_i, nb.field_l, jl.field_v, mp.field_b, se.field_n};
        } else {
          return new cg[]{kl.field_p, hl.field_d, rf.field_c, hl.field_g, uj.field_a, mh.field_I, lo.field_s, nl.field_m, bd.field_q, be.field_i, nb.field_l, jl.field_v, mp.field_b, se.field_n};
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            field_b = null;
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        if (param1 == 441) {
          if (param0 < 48) {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (90 >= param0) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param0 < 97) {
                      break L1;
                    } else {
                      if (param0 > 122) {
                        break L1;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (90 < param0) {
                  L2: {
                    L3: {
                      if (param0 < 97) {
                        break L3;
                      } else {
                        if (param0 > 122) {
                          break L3;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_49_0 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_c = -62;
          if (param0 >= 48) {
            if (param0 > 57) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (90 < param0) {
                  L4: {
                    L5: {
                      if (param0 < 97) {
                        break L5;
                      } else {
                        if (param0 > 122) {
                          break L5;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (90 < param0) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final static String a(dj param0, String param1, String param2, String param3, byte param4) {
        if (param4 > -24) {
            cg[] discarded$7 = c.b(-60);
            if (!(param0.a((byte) 73))) {
                return param2;
            }
            return param1 + " - " + param0.b(param3, 109) + "%";
        }
        if (!(param0.a((byte) 73))) {
            return param2;
        }
        return param1 + " - " + param0.b(param3, 109) + "%";
    }

    final static void a(int param0) {
        String var1 = null;
        if (nm.field_c) {
          L0: {
            if (null != kk.field_i) {
              kk.field_i.h((byte) 20);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != 65) {
            return;
          } else {
            var1 = bo.a(param0 + 39);
            he.field_a = new ih(var1, (String) null, true, false, false);
            e.field_S.a((ga) (Object) bm.field_d, true);
            bm.field_d.b(20, (ga) (Object) he.field_a);
            bm.field_d.f((byte) -70);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Your email address is used to identify this account";
        field_b = new vo();
    }
}
