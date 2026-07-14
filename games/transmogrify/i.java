/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static java.applet.Applet field_f;
    static String field_e;
    static java.security.SecureRandom field_a;
    static String field_d;
    static int[] field_b;
    static String field_c;

    final static boolean a(char param0, int param1) {
        if (32 <= param0) {
          if (param0 <= 126) {
            return true;
          } else {
            L0: {
              if (param0 < param1) {
                break L0;
              } else {
                if (255 < param0) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            L1: {
              if (param0 == 8364) {
                break L1;
              } else {
                if (param0 == 338) {
                  break L1;
                } else {
                  if (param0 == 8212) {
                    break L1;
                  } else {
                    if (param0 == 339) {
                      break L1;
                    } else {
                      if (376 != param0) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            }
            return true;
          }
        } else {
          if (param0 >= param1) {
            if (255 >= param0) {
              return true;
            } else {
              L2: {
                if (param0 == 8364) {
                  break L2;
                } else {
                  if (param0 == 338) {
                    break L2;
                  } else {
                    if (param0 == 8212) {
                      break L2;
                    } else {
                      if (param0 == 339) {
                        break L2;
                      } else {
                        if (376 != param0) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
              }
              return true;
            }
          } else {
            if (param0 != 8364) {
              if (param0 != 338) {
                if (param0 != 8212) {
                  if (param0 != 339) {
                    if (376 != param0) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static void a(boolean param0) {
        ng.field_i = null;
        ej.field_n = param0 ? true : false;
        ne.field_a = null;
        th.field_d = null;
        bd.field_p = null;
    }

    final static boolean b(boolean param0) {
        if (param0) {
          if (null != nk.field_b) {
            if (lj.field_z != ll.field_Q) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_c = null;
          if (null != nk.field_b) {
            if (lj.field_z != ll.field_Q) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void c(boolean param0) {
        field_f = null;
        if (!param0) {
          field_e = null;
          field_d = null;
          field_e = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "End Tutorial";
        field_d = "Waiting for music";
        field_b = new int[16384];
        field_c = "Loading fonts";
    }
}
