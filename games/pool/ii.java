/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static vh field_e;
    static String field_b;
    static int field_d;
    static int field_a;
    static String field_f;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 126) {
            return;
        }
        field_f = null;
        field_e = null;
        field_c = null;
    }

    final static dd a(int param0, qb param1) {
        dd var9 = new dd(4 + param1.field_f, param1.field_g - -4);
        var9.field_B = param1.field_d - 2;
        var9.field_G = param1.field_e + -2;
        int[] var11 = new int[4];
        int[] var12 = qh.field_d;
        int var5 = qh.field_l;
        int var6 = qh.field_f;
        qh.a(var11);
        var9.e();
        param1.field_d = 0;
        qb var7 = param1;
        param1.field_h = param1.field_f;
        var7.field_e = 0;
        param1.field_b = param1.field_g;
        param1.a(2, param0);
        var9.e(4144959);
        var9.e(65793);
        qh.a(var12, var5, var6);
        qh.b(var11);
        return var9;
    }

    final static bg a(int param0, String param1, int param2) {
        if (param0 < 97) {
            ii.a(66);
        }
        kr var3 = new kr();
        ((bg) (Object) var3).field_a = param2;
        ((bg) (Object) var3).field_c = param1;
        return (bg) (Object) var3;
    }

    final static long a(byte[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        long var4 = -1L;
        for (var6 = param2; var6 < param1; var6++) {
            var4 = var4 >>> 154302664 ^ hb.field_f[(int)(((long)param0[var6] ^ var4) & 255L)];
        }
        if (param3 != 154302664) {
            Object var7 = null;
        }
        var4 = var4 ^ -1L;
        return var4;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        if (param0 == -31668) {
          L0: {
            if (null != sm.field_C) {
              var3 = sm.field_C.a(param2, (byte) -83);
              if (0 != var3) {
                L1: {
                  if ((var3 ^ -1) != -3) {
                    break L1;
                  } else {
                    if (sm.field_C.field_nb == null) {
                      break L1;
                    } else {
                      if (!sm.field_C.field_nb.equals((Object) (Object) "")) {
                        L2: {
                          if (sm.field_C.field_nb.charAt(0) != 91) {
                            var7 = (CharSequence) (Object) sm.field_C.field_nb;
                            var4 = hq.a(85, var7);
                            break L2;
                          } else {
                            var4 = sm.field_C.field_nb;
                            break L2;
                          }
                        }
                        L3: {
                          var5 = null;
                          if (ne.field_m == 0) {
                            var5 = va.a(var4, param1, 51);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (-2 == ne.field_m) {
                            var5 = ul.a((byte) 83, var4, param1);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (-3 == ne.field_m) {
                            var5 = jd.a(param1, var4, param0 ^ -31666);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (-4 == (ne.field_m ^ -1)) {
                            var5 = ae.a(-3266, var4, var4, param1);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (var5 != null) {
                          var6 = null;
                          jh.a(0, var5, (String) null, 2, var4, true);
                          ne.field_m = -1;
                          sm.field_C = null;
                          break L0;
                        } else {
                          ne.field_m = -1;
                          sm.field_C = null;
                          break L0;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                ne.field_m = -1;
                sm.field_C = null;
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        t.a(117, param0, false);
        if (param1 != 0) {
            field_d = -51;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_b = "Type your password again to make sure it's correct";
        field_f = "<%0> cannot join; the game has started.";
        field_c = "Try changing the '<%0>' setting.";
        field_a = 0;
    }
}
