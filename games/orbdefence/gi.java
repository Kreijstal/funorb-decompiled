/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static boolean field_b;
    static int field_a;
    static t field_f;
    static int[] field_c;
    static int field_e;
    static String field_d;

    final static ti a(String param0, int param1) {
        int var2 = 0;
        String var3 = null;
        ti var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        if (null != ge.field_c) {
          if (param0 != null) {
            if (0 != param0.length()) {
              var2 = 90 / ((34 - param1) / 63);
              var7 = (CharSequence) (Object) param0;
              var3 = ua.a(-28, var7);
              if (var3 != null) {
                var4 = (ti) (Object) ge.field_c.a((byte) 125, (long)var3.hashCode());
                L0: while (true) {
                  if (var4 != null) {
                    var8 = (CharSequence) (Object) var4.field_db;
                    var5 = ua.a(-102, var8);
                    if (!var5.equals((Object) (Object) var3)) {
                      var4 = (ti) (Object) ge.field_c.c((byte) -33);
                      continue L0;
                    } else {
                      return var4;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        if (!param0) {
          var2 = null;
          ti discarded$2 = gi.a((String) null, -123);
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static void a(String[] args, byte param1) {
        if (param1 <= -57) {
          if (ck.field_j != null) {
            L0: {
              ck.field_j.field_M.a(args, (byte) -34);
              if (ti.field_bb != null) {
                ti.field_bb.field_I.a(args, (byte) -34);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (ti.field_bb != null) {
                ti.field_bb.field_I.a(args, (byte) -34);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          field_f = null;
          if (ck.field_j == null) {
            L2: {
              if (ti.field_bb != null) {
                ti.field_bb.field_I.a(args, (byte) -34);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              ck.field_j.field_M.a(args, (byte) -34);
              if (ti.field_bb != null) {
                ti.field_bb.field_I.a(args, (byte) -34);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = OrbDefence.field_D ? 1 : 0;
        if (param4 >= -7) {
          field_e = 95;
          if (param3 < param6) {
            if (param6 >= param1) {
              if (param1 > param3) {
                al.a(ul.field_b, param1, param5, param2, 30979, param7, param3, param0, param6);
                return;
              } else {
                al.a(ul.field_b, param3, param5, param7, 30979, param2, param1, param0, param6);
                return;
              }
            } else {
              al.a(ul.field_b, param6, param2, param5, 30979, param7, param3, param0, param1);
              return;
            }
          } else {
            if (param3 >= param1) {
              if (param1 <= param6) {
                al.a(ul.field_b, param6, param7, param5, 30979, param2, param1, param0, param3);
                return;
              } else {
                al.a(ul.field_b, param1, param7, param2, 30979, param5, param6, param0, param3);
                return;
              }
            } else {
              al.a(ul.field_b, param3, param2, param7, 30979, param5, param6, param0, param1);
              return;
            }
          }
        } else {
          if (param3 < param6) {
            if (param6 >= param1) {
              if (param1 > param3) {
                al.a(ul.field_b, param1, param5, param2, 30979, param7, param3, param0, param6);
                return;
              } else {
                al.a(ul.field_b, param3, param5, param7, 30979, param2, param1, param0, param6);
                return;
              }
            } else {
              al.a(ul.field_b, param6, param2, param5, 30979, param7, param3, param0, param1);
              return;
            }
          } else {
            if (param3 >= param1) {
              if (param1 <= param6) {
                al.a(ul.field_b, param6, param7, param5, 30979, param2, param1, param0, param3);
                return;
              } else {
                al.a(ul.field_b, param1, param7, param2, 30979, param5, param6, param0, param3);
                return;
              }
            } else {
              al.a(ul.field_b, param3, param2, param7, 30979, param5, param6, param0, param1);
              return;
            }
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_e = 0;
        field_d = "You have 1 unread message!";
    }
}
