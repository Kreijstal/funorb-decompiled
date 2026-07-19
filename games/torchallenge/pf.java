/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static sl field_d;
    static cf field_b;
    static int field_e;
    static eg field_c;
    static int[] field_g;
    static dk field_f;
    static ka[] field_a;

    final static int a(int param0, int param1, int param2) {
        if (null == ub.field_e) {
          return -1;
        } else {
          if (param2 >= wc.field_b) {
            if (ub.field_e.field_u + wc.field_b > param2) {
              L0: {
                if (bi.field_i > param0) {
                  break L0;
                } else {
                  if (param0 >= ub.field_e.field_x + bi.field_i) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
              L1: {
                if (field_e > param2) {
                  break L1;
                } else {
                  if (param2 >= ub.field_e.field_u + field_e) {
                    break L1;
                  } else {
                    if (ii.field_a > param0) {
                      break L1;
                    } else {
                      if (ub.field_e.field_x + ii.field_a > param0) {
                        return 1;
                      } else {
                        if (param1 == -19503) {
                          return -1;
                        } else {
                          field_c = (eg) null;
                          return -1;
                        }
                      }
                    }
                  }
                }
              }
              if (param1 == -19503) {
                return -1;
              } else {
                field_c = (eg) null;
                return -1;
              }
            } else {
              if (field_e <= param2) {
                if (param2 < ub.field_e.field_u + field_e) {
                  if (ii.field_a > param0) {
                    if (param1 == -19503) {
                      return -1;
                    } else {
                      field_c = (eg) null;
                      return -1;
                    }
                  } else {
                    if (ub.field_e.field_x + ii.field_a > param0) {
                      return 1;
                    } else {
                      if (param1 == -19503) {
                        return -1;
                      } else {
                        field_c = (eg) null;
                        return -1;
                      }
                    }
                  }
                } else {
                  if (param1 == -19503) {
                    return -1;
                  } else {
                    field_c = (eg) null;
                    return -1;
                  }
                }
              } else {
                if (param1 != -19503) {
                  field_c = (eg) null;
                  return -1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            if (field_e <= param2) {
              if (param2 < ub.field_e.field_u + field_e) {
                if (ii.field_a > param0) {
                  if (param1 != -19503) {
                    field_c = (eg) null;
                    return -1;
                  } else {
                    return -1;
                  }
                } else {
                  if (ub.field_e.field_x + ii.field_a <= param0) {
                    if (param1 != -19503) {
                      field_c = (eg) null;
                      return -1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 1;
                  }
                }
              } else {
                if (param1 != -19503) {
                  field_c = (eg) null;
                  return -1;
                } else {
                  return -1;
                }
              }
            } else {
              if (param1 != -19503) {
                field_c = (eg) null;
                return -1;
              } else {
                return -1;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_e = 82;
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_f = null;
          field_g = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_f = null;
          field_g = null;
          return;
        }
    }

    static {
        field_d = new sl();
        field_b = new cf();
        field_g = new int[4];
    }
}
