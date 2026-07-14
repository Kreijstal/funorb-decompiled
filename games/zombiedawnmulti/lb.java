/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_e;
    static ul field_d;
    static int[] field_c;
    static int field_a;
    static String field_b;

    final static boolean a(String param0, String param1, byte param2) {
        if (ol.a(param1, false)) {
          return false;
        } else {
          if (qa.a((byte) 29, param1)) {
            return false;
          } else {
            if (gn.b((byte) 62, param1)) {
              return false;
            } else {
              if (param0.length() != 0) {
                if (!cr.a(param0, param1, param2 ^ 9)) {
                  if (param2 == -10) {
                    if (a.a(param1, param0, (byte) -74)) {
                      return false;
                    } else {
                      if (!ia.a(127, param0, param1)) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!df.field_H) {
          return;
        } else {
          if (-1 != param0) {
            if (0 == param2) {
              fk.a(hl.field_d[1], true);
              if (param1) {
                field_c = null;
                return;
              } else {
                return;
              }
            } else {
              if (-2 == param2) {
                fk.a(hl.field_d[2], true);
                if (param1) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              } else {
                if (param2 == 2) {
                  fk.a(hl.field_d[3], true);
                  if (param1) {
                    field_c = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (-4 != param2) {
                    if (4 == param2) {
                      fk.a(hl.field_d[1], true);
                      if (param1) {
                        field_c = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param1) {
                        field_c = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    fk.a(hl.field_d[4], true);
                    if (!param1) {
                      return;
                    } else {
                      field_c = null;
                      return;
                    }
                  }
                }
              }
            }
          } else {
            fk.a(hl.field_d[12], true);
            if (param1) {
              field_c = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0) {
        String var1 = null;
        if (ch.field_e) {
          L0: {
            if (h.field_L != null) {
              h.field_L.m(-7435);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = ob.e(-24093);
          b.field_c = new qm(var1, (String) null, true, false, false);
          nb.field_a.b(3016, (cf) (Object) wj.field_i);
          wj.field_i.a((cf) (Object) b.field_c, (byte) -123);
          if (param0 != 9047) {
            lb.a((byte) -43);
            wj.field_i.h((byte) 49);
            return;
          } else {
            wj.field_i.h((byte) 49);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void a(byte param0) {
        if (param0 != 43) {
          field_b = null;
          field_c = null;
          field_d = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != 53) {
            return false;
        }
        return 0 <= param1 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You cannot join this game - it is in progress";
        field_e = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
