/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static boolean field_i;
    static ck field_a;
    static gh field_j;
    static qm field_e;
    static cc field_b;
    static pi[] field_f;
    static w field_g;
    static nm field_c;
    static String field_d;
    static String field_h;

    final static boolean a(int param0, String param1, String param2) {
        if (param0 <= -94) {
          if (qf.a(param2, 0)) {
            return false;
          } else {
            if (mc.a(param2, (byte) -111)) {
              return false;
            } else {
              if (client.a(92, param2)) {
                return false;
              } else {
                if (param1.length() != 0) {
                  if (nn.a(false, param1, param2)) {
                    return false;
                  } else {
                    if (!ij.a(param2, param1, (byte) -117)) {
                      if (he.a(param1, (byte) 126, param2)) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return true;
                }
              }
            }
          }
        } else {
          gf.a(-99);
          if (qf.a(param2, 0)) {
            return false;
          } else {
            if (mc.a(param2, (byte) -111)) {
              return false;
            } else {
              if (client.a(92, param2)) {
                return false;
              } else {
                if (param1.length() != 0) {
                  if (nn.a(false, param1, param2)) {
                    return false;
                  } else {
                    if (!ij.a(param2, param1, (byte) -117)) {
                      if (he.a(param1, (byte) 126, param2)) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 > -124) {
          return null;
        } else {
          L0: {
            var4 = 0;
            if (param3) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param2) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param1) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return ki.field_n[var4];
        }
    }

    final static void a(String[] args, boolean param1) {
        if (!param1) {
          if (da.field_e != null) {
            L0: {
              da.field_e.field_db.a(32, args);
              if (null != sn.field_k) {
                sn.field_k.field_W.a(32, args);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (null != sn.field_k) {
                sn.field_k.field_W.a(32, args);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        Object var2 = null;
        if (!v.field_d) {
          throw new IllegalStateException();
        } else {
          if (param0 != -126) {
            var2 = null;
            gf.a((String[]) null, true);
            qi.field_M = true;
            vk.a(false, 841566312);
            hc.field_d = 0;
            return;
          } else {
            qi.field_M = true;
            vk.a(false, 841566312);
            hc.field_d = 0;
            return;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_h = null;
        field_d = null;
        field_g = null;
        field_b = null;
        field_j = null;
        if (param0 != 2) {
          String discarded$2 = gf.a(46, true, false, false);
          field_a = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new gh(0);
        field_e = new qm(4, 1, 1, 1);
        field_d = "<%0> has declined the invitation.";
        field_h = "Hide lobby chat";
    }
}
