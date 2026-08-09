/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static boolean[][] field_h;
    static hh field_d;
    static int field_c;
    static hd[] field_a;
    static String field_e;
    static String field_b;
    static boolean field_g;
    static String field_f;

    final static gf[] a(ml param0, byte param1) {
        gf[] stackIn_6_0 = null;
        gf[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        gf[] var4 = null;
        int var5 = 0;
        gf var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param0.l(8, 59);
            if (0 >= var2_int) {
              var3 = param0.l(12, 59);
              var4 = new gf[var3];
              if (param1 == -4) {
                var5 = 0;
                L1: while (true) {
                  if (var3 <= var5) {
                    stackIn_15_0 = (gf[]) (var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      if (mu.a(param0, (byte) -39)) {
                        var6 = new gf();
                        param0.l(24, param1 ^ -57);
                        param0.l(24, 59);
                        var6.field_g = param0.l(24, 59);
                        param0.l(9, 59);
                        param0.l(12, param1 ^ -57);
                        param0.l(12, 59);
                        param0.l(12, 59);
                        var4[var5] = var6;
                        break L2;
                      } else {
                        var6_int = param0.l(kb.a(-1 + var5, false), param1 ^ -57);
                        var4[var5] = var4[var6_int];
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = (gf[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("ds.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_15_0;
        }
    }

    final static void a(int param0, bb param1) {
        try {
            qa.field_E.a((byte) -128, (hd) (param1));
            if (param0 != -1) {
                field_c = -45;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ds.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_h = (boolean[][]) null;
        field_f = null;
        field_a = null;
        field_d = null;
        field_e = null;
        field_b = null;
        if (param0 >= -3) {
            field_f = (String) null;
        }
    }

    final static int a(int param0, int param1) {
        if (param1 != param0) {
          if (8 != param0) {
            if (11 != param0) {
              if ((param0 ^ -1) == -19) {
                return 1;
              } else {
                if ((param0 ^ -1) != -20) {
                  if ((param0 ^ -1) == -33) {
                    return 1;
                  } else {
                    if (37 == param0) {
                      return 1;
                    } else {
                      if (24 == param0) {
                        return 1;
                      } else {
                        if ((param0 ^ -1) == -26) {
                          return 1;
                        } else {
                          if (param0 != 23) {
                            if ((param0 ^ -1) != -30) {
                              if (34 != param0) {
                                if ((param0 ^ -1) != -31) {
                                  if (21 == param0) {
                                    return 0;
                                  } else {
                                    if (20 != param0) {
                                      return 0;
                                    } else {
                                      return 1;
                                    }
                                  }
                                } else {
                                  return 1;
                                }
                              } else {
                                return 1;
                              }
                            } else {
                              return 1;
                            }
                          } else {
                            return 0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return 1;
                }
              }
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        } else {
          return 2;
        }
    }

    static {
        field_d = new hh();
        field_c = 225;
        field_e = "Send private message";
        field_g = false;
        field_f = "Click to Spectate";
    }
}
