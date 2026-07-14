/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wja extends pu {
    static wma field_m;
    static kv field_l;
    static String field_n;

    public static void d(byte param0) {
        field_n = null;
        if (param0 >= -100) {
            wja.d((byte) 105);
            field_m = null;
            field_l = null;
            return;
        }
        field_m = null;
        field_l = null;
    }

    final static int a(int param0, int param1, boolean param2) {
        if (null != ug.field_o) {
          if (qs.field_o <= param1) {
            if (ug.field_o.field_q + qs.field_o > param1) {
              L0: {
                if (et.field_l > param0) {
                  break L0;
                } else {
                  if (et.field_l - -ug.field_o.field_p <= param0) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
              if (!param2) {
                L1: {
                  if (ak.field_u > param1) {
                    break L1;
                  } else {
                    if (param1 >= ug.field_o.field_q + ak.field_u) {
                      break L1;
                    } else {
                      if (param0 < hka.field_h) {
                        break L1;
                      } else {
                        if (hka.field_h - -ug.field_o.field_p <= param0) {
                          break L1;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              } else {
                L2: {
                  field_n = null;
                  if (ak.field_u > param1) {
                    break L2;
                  } else {
                    if (param1 >= ug.field_o.field_q + ak.field_u) {
                      break L2;
                    } else {
                      if (param0 < hka.field_h) {
                        break L2;
                      } else {
                        if (hka.field_h - -ug.field_o.field_p <= param0) {
                          break L2;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              }
            } else {
              if (!param2) {
                L3: {
                  if (ak.field_u > param1) {
                    break L3;
                  } else {
                    if (param1 >= ug.field_o.field_q + ak.field_u) {
                      break L3;
                    } else {
                      if (param0 < hka.field_h) {
                        break L3;
                      } else {
                        if (hka.field_h - -ug.field_o.field_p <= param0) {
                          break L3;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              } else {
                L4: {
                  field_n = null;
                  if (ak.field_u > param1) {
                    break L4;
                  } else {
                    if (param1 >= ug.field_o.field_q + ak.field_u) {
                      break L4;
                    } else {
                      if (param0 < hka.field_h) {
                        break L4;
                      } else {
                        if (hka.field_h - -ug.field_o.field_p <= param0) {
                          break L4;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
                return -1;
              }
            }
          } else {
            if (!param2) {
              L5: {
                if (ak.field_u > param1) {
                  break L5;
                } else {
                  if (param1 >= ug.field_o.field_q + ak.field_u) {
                    break L5;
                  } else {
                    if (param0 < hka.field_h) {
                      break L5;
                    } else {
                      if (hka.field_h - -ug.field_o.field_p <= param0) {
                        break L5;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              return -1;
            } else {
              field_n = null;
              if (ak.field_u <= param1) {
                if (param1 < ug.field_o.field_q + ak.field_u) {
                  if (param0 >= hka.field_h) {
                    if (hka.field_h - -ug.field_o.field_p > param0) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          }
        } else {
          return -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "You must have at least one move and one attack action equipped to continue.";
    }
}
