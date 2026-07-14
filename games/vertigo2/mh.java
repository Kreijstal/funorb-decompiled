/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static boolean field_a;
    static int[] field_c;
    static String field_b;
    static dd field_d;

    final static void a(boolean param0, byte param1, int param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        if (null != rc.field_d) {
          var3 = rc.field_d.c(param0, 104);
          if (var3 != 0) {
            if ((var3 ^ -1) == -3) {
              if (rc.field_d.field_S != null) {
                L0: {
                  if (rc.field_d.field_S.equals((Object) (Object) "")) {
                    break L0;
                  } else {
                    L1: {
                      if (rc.field_d.field_S.charAt(0) != 91) {
                        var7 = (CharSequence) (Object) rc.field_d.field_S;
                        var4 = rc.a(var7, 320);
                        break L1;
                      } else {
                        var4 = rc.field_d.field_S;
                        break L1;
                      }
                    }
                    L2: {
                      var5 = null;
                      if (hk.field_n != -1) {
                        break L2;
                      } else {
                        var5 = ia.a(-113, param2, var4);
                        break L2;
                      }
                    }
                    L3: {
                      if (-2 != hk.field_n) {
                        break L3;
                      } else {
                        var5 = lk.a((byte) 96, param2, var4);
                        break L3;
                      }
                    }
                    L4: {
                      if (2 == hk.field_n) {
                        var5 = br.a(var4, param2, 100);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if ((hk.field_n ^ -1) == -4) {
                        var5 = en.a(var4, (byte) -108, var4, param2);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (var5 != null) {
                      var6 = null;
                      dh.a((byte) -59, var5, 2, (String) null, 0, var4);
                      break L0;
                    } else {
                      rc.field_d = null;
                      hk.field_n = -1;
                      if (param1 > -52) {
                        field_c = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                rc.field_d = null;
                hk.field_n = -1;
                if (param1 > -52) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              } else {
                rc.field_d = null;
                hk.field_n = -1;
                if (param1 > -52) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              rc.field_d = null;
              hk.field_n = -1;
              if (param1 > -52) {
                field_c = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 > -52) {
              field_c = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 > -52) {
            field_c = null;
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 != -1) {
            field_d = null;
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            field_c = null;
            ch.field_e.a(0, 86, 0);
            return;
        }
        ch.field_e.a(0, 86, 0);
    }

    final static void a(boolean param0, er[][] param1, byte[] param2, int param3, r param4, r param5, boolean param6, int[] param7, String[] param8, String[][] param9, er[][] param10, int param11, String[][] param12, byte[] param13, r param14) {
        Object var17 = null;
        Object var16 = null;
        wn.a(param8, param13, param7, param9, (u[]) null, param5, param4, (byte) -42, param10, param12, param14, param3, param2, param1, param11, (int[]) null, param6);
        if (!param0) {
            field_a = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email is valid";
    }
}
