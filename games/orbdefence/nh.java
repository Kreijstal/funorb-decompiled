/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    private gb field_f;
    private ki field_g;
    static tl field_c;
    static String field_e;
    static int field_b;
    static String field_a;
    private ki field_d;

    public static void a(byte param0) {
        if (param0 > -51) {
            return;
        }
        field_a = null;
        field_c = null;
        field_e = null;
    }

    final static boolean a(boolean param0, char param1) {
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
        if (!param0) {
          if (48 > param1) {
            if (65 > param1) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 <= 90) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param1 < 97) {
                      break L1;
                    } else {
                      if (param1 > 122) {
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
            if (param1 > 57) {
              if (65 > param1) {
                if (param1 >= 97) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L2: {
                    L3: {
                      if (param1 < 97) {
                        break L3;
                      } else {
                        if (param1 > 122) {
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
          field_e = null;
          if (48 <= param1) {
            if (param1 > 57) {
              if (65 > param1) {
                if (param1 >= 97) {
                  if (param1 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L4: {
                    L5: {
                      if (param1 < 97) {
                        break L5;
                      } else {
                        if (param1 > 122) {
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
            if (65 > param1) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 > 90) {
                if (param1 >= 97) {
                  if (param1 > 122) {
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

    final oe b(int param0, int param1) {
        byte[] var4 = null;
        if (param0 != -11244) {
            return null;
        }
        oe var3 = (oe) ((nh) this).field_f.a((long)param1, 0);
        if (!(var3 == null)) {
            return var3;
        }
        if (param1 >= 32768) {
            var4 = ((nh) this).field_g.b(1, false, 32767 & param1);
        } else {
            var4 = ((nh) this).field_d.b(1, false, param1);
        }
        oe var3_ref = new oe();
        if (!(var4 == null)) {
            var3_ref.a((byte) 67, new mg(var4));
        }
        if (!(-32769 < (param1 ^ -1))) {
            var3_ref.b((byte) -77);
        }
        ((nh) this).field_f.a((Object) (Object) var3_ref, (byte) -100, (long)param1);
        return var3_ref;
    }

    final static void a(int param0, int param1) {
        d var2 = null;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 == 15968) {
          var2 = (d) (Object) md.field_h.b((byte) -25);
          L0: while (true) {
            if (var2 == null) {
              return;
            } else {
              fa.a(var2, param1, param0 ^ 15999);
              var2 = (d) (Object) md.field_h.d(853);
              continue L0;
            }
          }
        } else {
          nh.a((byte) 53);
          var2 = (d) (Object) md.field_h.b((byte) -25);
          L1: while (true) {
            if (var2 == null) {
              return;
            } else {
              fa.a(var2, param1, param0 ^ 15999);
              var2 = (d) (Object) md.field_h.d(853);
              continue L1;
            }
          }
        }
    }

    private nh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Wave";
        field_a = "ENERGY";
        field_c = new tl();
    }
}
