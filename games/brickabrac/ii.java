/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends nm {
    int field_o;
    static String field_l;
    int field_p;
    static boolean field_j;
    static int field_q;
    static String[] field_r;
    int field_n;
    int field_k;
    int field_m;
    static String field_s;
    int field_t;
    int[] field_i;

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_k = param7;
        this.field_m = param2;
        this.field_n = param1;
        this.field_o = param6;
        this.field_p = param3;
        this.field_t = param5;
        if (param4 != -161) {
            return;
        }
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ii.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static boolean a(boolean param0, char param1) {
        if (param1 >= 32) {
          if (126 < param1) {
            if (param0) {
              L0: {
                if (param1 < 160) {
                  break L0;
                } else {
                  if (255 < param1) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              if (param1 != 8364) {
                if (param1 != 338) {
                  if (param1 != 8212) {
                    if (param1 != 339) {
                      if (param1 != 376) {
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
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          if (param0) {
            if (param1 >= 160) {
              if (255 < param1) {
                if (param1 != 8364) {
                  if (param1 != 338) {
                    if (param1 != 8212) {
                      if (param1 != 339) {
                        if (param1 != 376) {
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
              } else {
                return true;
              }
            } else {
              if (param1 != 8364) {
                if (param1 != 338) {
                  if (param1 != 8212) {
                    if (param1 != 339) {
                      if (param1 == 376) {
                        return true;
                      } else {
                        return false;
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
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 20888) {
          field_l = (String) null;
          field_l = null;
          field_r = null;
          field_s = null;
          return;
        } else {
          field_l = null;
          field_r = null;
          field_s = null;
          return;
        }
    }

    ii() {
    }

    static {
        field_r = new String[16];
        field_l = "Only show lobby chat from my friends";
        field_q = 2;
        field_s = "<%0> installed";
    }
}
