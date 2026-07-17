/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    String field_e;
    String[] field_g;
    boolean field_d;
    static int[] field_c;
    static String field_j;
    int field_a;
    static java.awt.Font field_f;
    static String field_i;
    static int[] field_h;
    boolean field_b;

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_j = null;
        field_i = null;
        field_f = null;
    }

    final static void a(boolean param0) {
        if (!param0) {
            return;
        }
        jc.a((byte) 59, hc.a(0));
    }

    final static ah a(int param0, int param1, int param2, int param3) {
        if (param0 >= 49) {
          if (param2 < 9) {
            return (ah) (Object) new wo(param1, param3, param2);
          } else {
            if (param2 >= 11) {
              L0: {
                if (param2 < 17) {
                  break L0;
                } else {
                  if (28 == param2) {
                    break L0;
                  } else {
                    if (param2 != 23) {
                      if (param2 != 18) {
                        if (param2 != 19) {
                          if (param2 != 20) {
                            if (27 != param2) {
                              return (ah) (Object) new wo(param1, param3, param2);
                            } else {
                              return (ah) (Object) new dk(param1, param3);
                            }
                          } else {
                            return (ah) (Object) new fc(param1, param3, param2);
                          }
                        } else {
                          return (ah) (Object) new we(param1, param3, param2);
                        }
                      } else {
                        return (ah) (Object) new wc(param1, param3, param2);
                      }
                    } else {
                      return (ah) (Object) new si(param1, param3, param2);
                    }
                  }
                }
              }
              L1: {
                if (ng.field_e) {
                  break L1;
                } else {
                  if (dj.field_e.field_q != 7) {
                    break L1;
                  } else {
                    return (ah) (Object) new jo(param1, param3, param2);
                  }
                }
              }
              return (ah) (Object) new qk(param1, param3, param2);
            } else {
              return (ah) (Object) new po(param1, param3, param2);
            }
          }
        } else {
          eo.a(false);
          if (param2 < 9) {
            return (ah) (Object) new wo(param1, param3, param2);
          } else {
            if (param2 >= 11) {
              if (param2 >= 17) {
                if (28 != param2) {
                  if (param2 != 23) {
                    if (param2 != 18) {
                      if (param2 != 19) {
                        if (param2 != 20) {
                          if (27 != param2) {
                            return (ah) (Object) new wo(param1, param3, param2);
                          } else {
                            return (ah) (Object) new dk(param1, param3);
                          }
                        } else {
                          return (ah) (Object) new fc(param1, param3, param2);
                        }
                      } else {
                        return (ah) (Object) new we(param1, param3, param2);
                      }
                    } else {
                      return (ah) (Object) new wc(param1, param3, param2);
                    }
                  } else {
                    return (ah) (Object) new si(param1, param3, param2);
                  }
                } else {
                  if (!ng.field_e) {
                    if (dj.field_e.field_q == 7) {
                      return (ah) (Object) new jo(param1, param3, param2);
                    } else {
                      return (ah) (Object) new qk(param1, param3, param2);
                    }
                  } else {
                    return (ah) (Object) new qk(param1, param3, param2);
                  }
                }
              } else {
                if (!ng.field_e) {
                  if (dj.field_e.field_q == 7) {
                    return (ah) (Object) new jo(param1, param3, param2);
                  } else {
                    return (ah) (Object) new qk(param1, param3, param2);
                  }
                } else {
                  return (ah) (Object) new qk(param1, param3, param2);
                }
              }
            } else {
              return (ah) (Object) new po(param1, param3, param2);
            }
          }
        }
    }

    final static boolean b(int param0) {
        return nm.field_c;
    }

    eo(boolean param0) {
        ((eo) this).field_b = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Orb points: ";
        field_c = new int[4];
        field_i = "This password contains repeated characters, and would be easy to guess";
        field_h = new int[29];
        field_h[0] = 10;
        field_h[1] = 9;
        field_h[22] = 1000;
        field_h[12] = 1038;
        field_h[2] = 12;
        field_h[24] = 557;
        field_h[21] = 0;
        field_h[8] = 57;
        field_h[4] = 65;
        field_h[27] = 1000;
        field_h[14] = 401;
        field_h[13] = 5986;
        field_h[25] = 1000;
        field_h[17] = 383;
        field_h[6] = 10;
        field_h[15] = 81;
        field_h[11] = 889;
        field_h[18] = 167;
        field_h[26] = 1000;
        field_h[10] = 2038;
        field_h[3] = 13;
        field_h[5] = 389;
        field_h[16] = 355;
        field_h[7] = 25;
    }
}
