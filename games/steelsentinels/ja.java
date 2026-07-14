/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static String field_h;
    static int field_a;
    static String field_c;
    static int field_f;
    static int[][] field_b;
    static wk[] field_e;
    static sj field_g;
    static int field_i;
    static gk[] field_d;

    final static int a(int param0, boolean param1) {
        if (!param1) {
          param0 -= 17;
          if ((param0 ^ -1) <= -1) {
            if (param0 >= t.field_d.length) {
              return -1;
            } else {
              return t.field_d[param0];
            }
          } else {
            return -1;
          }
        } else {
          field_e = null;
          param0 -= 17;
          if ((param0 ^ -1) <= -1) {
            if (param0 < t.field_d.length) {
              return t.field_d[param0];
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    final static wk b(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = param0;
        if (-105 != (var2 ^ -1)) {
          if ((var2 ^ -1) != -106) {
            if ((var2 ^ -1) != -107) {
              if ((var2 ^ -1) != -108) {
                if (108 != var2) {
                  if (var2 != -110) {
                    if (-111 != var2) {
                      if ((var2 ^ -1) != -112) {
                        if (var2 != 112) {
                          if (var2 != -114) {
                            if (114 != var2) {
                              if (-116 != var2) {
                                if ((var2 ^ -1) != -117) {
                                  if (var2 != 117) {
                                    if ((var2 ^ -1) != -119) {
                                      if ((var2 ^ -1) != -120) {
                                        if (var2 != -121) {
                                          if (-122 != var2) {
                                            if (var2 != 122) {
                                              if ((var2 ^ -1) != -124) {
                                                if (param1) {
                                                  if (-201 < (param0 ^ -1)) {
                                                    if (param0 < rh.field_v.length) {
                                                      return rh.field_v[param0];
                                                    } else {
                                                      return null;
                                                    }
                                                  } else {
                                                    return nc.a(param0 - 199, (byte) -114).a();
                                                  }
                                                } else {
                                                  wk discarded$1 = ja.b(-72, true);
                                                  if (-201 < (param0 ^ -1)) {
                                                    if (param0 < rh.field_v.length) {
                                                      return rh.field_v[param0];
                                                    } else {
                                                      return null;
                                                    }
                                                  } else {
                                                    return nc.a(param0 - 199, (byte) -114).a();
                                                  }
                                                }
                                              } else {
                                                return hb.field_j[5];
                                              }
                                            } else {
                                              return hb.field_j[19];
                                            }
                                          } else {
                                            return hb.field_j[18];
                                          }
                                        } else {
                                          return hb.field_j[17];
                                        }
                                      } else {
                                        return hb.field_j[16];
                                      }
                                    } else {
                                      return hb.field_j[15];
                                    }
                                  } else {
                                    return hb.field_j[14];
                                  }
                                } else {
                                  return hb.field_j[13];
                                }
                              } else {
                                return hb.field_j[12];
                              }
                            } else {
                              return hb.field_j[11];
                            }
                          } else {
                            return hb.field_j[10];
                          }
                        } else {
                          return hb.field_j[9];
                        }
                      } else {
                        return hb.field_j[8];
                      }
                    } else {
                      return hb.field_j[7];
                    }
                  } else {
                    return hb.field_j[6];
                  }
                } else {
                  return hb.field_j[4];
                }
              } else {
                return hb.field_j[3];
              }
            } else {
              return hb.field_j[2];
            }
          } else {
            return hb.field_j[1];
          }
        } else {
          return hb.field_j[0];
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_c = null;
        field_g = null;
        if (!param0) {
            return;
        }
        field_h = null;
        field_d = null;
        field_e = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "OK";
        field_f = 3;
        field_i = 0;
    }
}
