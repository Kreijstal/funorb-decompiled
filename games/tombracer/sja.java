/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sja extends qma {
    static int[] field_h;
    static g[] field_i;

    public static void b(byte param0) {
        field_i = null;
        field_h = null;
    }

    final static int b(int param0, int param1) {
        if (param0 != 6407) {
          if (34843 != param0) {
            if (34837 == param0) {
              return 6407;
            } else {
              if (param0 != 6408) {
                if (param0 != 34842) {
                  if (param0 == 34836) {
                    return 6408;
                  } else {
                    if (param0 == 6406) {
                      return 6406;
                    } else {
                      if (param0 != 34844) {
                        if (param0 == 6409) {
                          return 6409;
                        } else {
                          if (param0 != 34846) {
                            if (param0 == 6410) {
                              return 6410;
                            } else {
                              if (param0 != 34847) {
                                if (param0 != 6402) {
                                  throw new IllegalArgumentException("");
                                } else {
                                  return 6402;
                                }
                              } else {
                                return 6410;
                              }
                            }
                          } else {
                            return 6409;
                          }
                        }
                      } else {
                        return 6406;
                      }
                    }
                  }
                } else {
                  return 6408;
                }
              } else {
                return 6408;
              }
            }
          } else {
            return 6407;
          }
        } else {
          return 6407;
        }
    }

    sja(cn param0, cn param1, cn param2) {
        super(param0, param1, param2);
    }

    public final boolean a(int param0, byte param1) {
        if (param1 >= 10) {
          if (!((lqa) (Object) baa.field_d.field_i.field_b).field_j) {
            if (ad.a(-13545, param0)) {
              return super.a(param0, (byte) 79);
            } else {
              return false;
            }
          } else {
            return super.a(param0, (byte) 79);
          }
        } else {
          field_i = null;
          if (!((lqa) (Object) baa.field_d.field_i.field_b).field_j) {
            if (ad.a(-13545, param0)) {
              return super.a(param0, (byte) 79);
            } else {
              return false;
            }
          } else {
            return super.a(param0, (byte) 79);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{15, 12, 7, 18, 33};
    }
}
