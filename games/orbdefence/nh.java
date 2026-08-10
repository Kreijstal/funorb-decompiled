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
                stackIn_67_0 = 1;
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
                        stackIn_64_0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_64_0 = 0;
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
                          stackIn_50_0 = 1;
                          break L2;
                        }
                      }
                    }
                    stackIn_50_0 = 0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackIn_45_0 = 1;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackIn_40_0 = 1;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_e = (String) null;
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
                          stackIn_28_0 = 1;
                          break L4;
                        }
                      }
                    }
                    stackIn_28_0 = 0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackIn_23_0 = 1;
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
            return (oe) null;
        }
        oe var3 = (oe) (this.field_f.a((long)param1, 0));
        if (!(var3 == null)) {
            return var3;
        }
        if (param1 >= 32768) {
            var4 = this.field_g.b(1, false, 32767 & param1);
        } else {
            var4 = this.field_d.b(1, false, param1);
        }
        var3 = new oe();
        if (!(var4 == null)) {
            var3.a((byte) 67, new mg(var4));
        }
        if (!(-32769 < (param1 ^ -1))) {
            var3.b((byte) -77);
        }
        this.field_f.a(var3, (byte) -100, (long)param1);
        return var3;
    }

    final static void a(int param0, int param1) {
        d var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 15968) {
                break L1;
              } else {
                nh.a((byte) 53);
                break L1;
              }
            }
            var2 = (d) ((Object) md.field_h.b((byte) -25));
            L2: while (true) {
              if (var2 == null) {
                break L0;
              } else {
                fa.a(var2, param1, param0 ^ 15999);
                var2 = (d) ((Object) md.field_h.d(853));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "nh.C(" + param0 + ',' + param1 + ')');
        }
    }

    private nh() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "Wave";
        field_a = "ENERGY";
        field_c = new tl();
    }
}
