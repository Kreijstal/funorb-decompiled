/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sja extends qma {
    static int[] field_h;
    static g[] field_i;

    public static void b(byte param0) {
        field_i = null;
        field_h = null;
        if (param0 > -96) {
            field_h = (int[]) null;
        }
    }

    final static int b(int param0, int param1) {
        if (param1 == 20934) {
          L0: {
            if ((param0 ^ -1) == -6408) {
              break L0;
            } else {
              if (34843 == param0) {
                break L0;
              } else {
                if (34837 == param0) {
                  break L0;
                } else {
                  L1: {
                    if (param0 == 6408) {
                      break L1;
                    } else {
                      if (-34843 == (param0 ^ -1)) {
                        break L1;
                      } else {
                        if ((param0 ^ -1) == -34837) {
                          break L1;
                        } else {
                          if ((param0 ^ -1) == -6407) {
                            return 6406;
                          } else {
                            if (param0 != 34844) {
                              if (param0 == 6409) {
                                return 6409;
                              } else {
                                if ((param0 ^ -1) != -34847) {
                                  if (-6411 == (param0 ^ -1)) {
                                    return 6410;
                                  } else {
                                    if (-34848 != (param0 ^ -1)) {
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
                      }
                    }
                  }
                  return 6408;
                }
              }
            }
          }
          return 6407;
        } else {
          field_i = (g[]) null;
          if ((param0 ^ -1) != -6408) {
            if (34843 != param0) {
              if (34837 == param0) {
                return 6407;
              } else {
                if (param0 != 6408) {
                  if (-34843 != (param0 ^ -1)) {
                    if ((param0 ^ -1) == -34837) {
                      return 6408;
                    } else {
                      if ((param0 ^ -1) == -6407) {
                        return 6406;
                      } else {
                        if (param0 != 34844) {
                          if (param0 == 6409) {
                            return 6409;
                          } else {
                            if ((param0 ^ -1) != -34847) {
                              if (-6411 == (param0 ^ -1)) {
                                return 6410;
                              } else {
                                if (-34848 != (param0 ^ -1)) {
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
    }

    sja(cn param0, cn param1, cn param2) {
        super(param0, param1, param2);
    }

    public final boolean a(int param0, byte param1) {
        if (param1 < 10) {
            field_i = (g[]) null;
            if (((lqa) ((Object) baa.field_d.field_i.field_b)).field_j) {
                return super.a(param0, (byte) 79);
            }
            if (ad.a(-13545, param0)) {
                return super.a(param0, (byte) 79);
            }
            return false;
        }
        if (((lqa) ((Object) baa.field_d.field_i.field_b)).field_j) {
            return super.a(param0, (byte) 79);
        }
        if (ad.a(-13545, param0)) {
            return super.a(param0, (byte) 79);
        }
        return false;
    }

    static {
        field_h = new int[]{15, 12, 7, 18, 33};
    }
}
