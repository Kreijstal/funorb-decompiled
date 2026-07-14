/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static gh field_a;
    static String field_b;
    static String field_c;

    final static void a(int param0) {
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (ce.field_x.field_M) {
          if ((1 << ce.field_x.field_h & ce.field_x.field_P.field_e) == 0) {
            if (ce.field_x.field_P.field_e == 0) {
              if ((1 << ce.field_x.field_P.field_r) + -1 != (1 << ce.field_x.field_h | ce.field_x.field_i)) {
                oq.field_i[13] = uo.field_b;
                if (param0 != -2) {
                  field_a = null;
                  return;
                } else {
                  return;
                }
              } else {
                oq.field_i[13] = mq.field_a;
                if (param0 != -2) {
                  field_a = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              oq.field_i[13] = qq.field_s;
              if (param0 != -2) {
                field_a = null;
                return;
              } else {
                return;
              }
            }
          } else {
            oq.field_i[13] = eq.field_i;
            if (param0 == -2) {
              return;
            } else {
              field_a = null;
              return;
            }
          }
        } else {
          if (0 != (ce.field_x.field_P.field_e & 1 << ce.field_x.field_h)) {
            oq.field_i[13] = qc.field_s;
            if (param0 == -2) {
              return;
            } else {
              field_a = null;
              return;
            }
          } else {
            L0: {
              if (-1 == (ce.field_x.field_P.field_e ^ -1)) {
                if (-1 + (1 << ce.field_x.field_P.field_r) == (ce.field_x.field_i | 1 << ce.field_x.field_h)) {
                  oq.field_i[13] = ip.field_d;
                  break L0;
                } else {
                  oq.field_i[13] = hn.field_a;
                  break L0;
                }
              } else {
                oq.field_i[13] = en.field_d;
                break L0;
              }
            }
            if (param0 != -2) {
              field_a = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -90) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0, oh param1, oh param2) {
        if (param1.field_e == null) {
          param1.field_f = param2;
          param1.field_e = param2.field_e;
          param1.field_e.field_f = param1;
          param1.field_f.field_e = param1;
          if (param0 > -122) {
            field_c = null;
            return;
          } else {
            return;
          }
        } else {
          param1.b((byte) -111);
          param1.field_f = param2;
          param1.field_e = param2.field_e;
          param1.field_e.field_f = param1;
          param1.field_f.field_e = param1;
          if (param0 <= -122) {
            return;
          } else {
            field_c = null;
            return;
          }
        }
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != null) {
          var3 = param1.length();
          if (var3 >= 1) {
            if (12 >= var3) {
              var4 = ji.a(param1, true);
              if (var4 == null) {
                return fp.field_a;
              } else {
                if (-2 <= var4.length()) {
                  if (param0 <= -46) {
                    if (tc.a(var4.charAt(0), 2)) {
                      return cr.field_a;
                    } else {
                      if (!tc.a(var4.charAt(-1 + var4.length()), 2)) {
                        var5 = 0;
                        var6 = 0;
                        L0: while (true) {
                          if (param1.length() <= var6) {
                            if ((var5 ^ -1) < -1) {
                              return cr.field_a;
                            } else {
                              return null;
                            }
                          } else {
                            L1: {
                              var7 = param1.charAt(var6);
                              if (!tc.a((char) var7, 2)) {
                                var5 = 0;
                                break L1;
                              } else {
                                var5++;
                                break L1;
                              }
                            }
                            if (-3 < (var5 ^ -1)) {
                              var6++;
                              var6++;
                              continue L0;
                            } else {
                              if (!param2) {
                                return ms.field_g;
                              } else {
                                var6++;
                                continue L0;
                              }
                            }
                          }
                        }
                      } else {
                        return cr.field_a;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return fp.field_a;
                }
              }
            } else {
              return fp.field_a;
            }
          } else {
            return fp.field_a;
          }
        } else {
          return fp.field_a;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Click";
        field_c = "Place fleets in territory <%0> (<%1> remaining)";
    }
}
