/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends fa {
    static boolean field_m;
    int field_p;
    static String field_l;
    fa field_k;
    static ak field_o;
    pp field_n;

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        var2 = param0.charAt(0);
        var3 = 1;
        L0: while (true) {
          if (param0.length() > var3) {
            if (var2 == param0.charAt(var3)) {
              var3++;
              continue L0;
            } else {
              return false;
            }
          } else {
            var4 = 125 / ((param1 - -52) / 59);
            return true;
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = (ni.field_q + -640) / 2;
        var3 = qh.field_c * qh.field_c;
        var4 = -(param0 * param0) + var3;
        if (param1 != 4740) {
          return;
        } else {
          ff.field_h.a(90, -124 + (t.field_d + -90), -(var4 * 199 / var3) + var2, 256, 199);
          ai.field_A.a(0, t.field_d - 124, var4 * 438 / var3 + (var2 + 202), 256, 438);
          return;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var4 = -77 % ((param1 - 28) / 58);
        int var3 = param2 >>> 1066016383;
        return (param2 - -var3) / param0 + -var3;
    }

    final static char a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param0;
        if (param1 == 63) {
          if (-1 != (var2 ^ -1)) {
            if (128 <= var2) {
              if (160 <= var2) {
                return (char)var2;
              } else {
                L0: {
                  var3 = jg.field_I[-128 + var2];
                  if (0 != var3) {
                    break L0;
                  } else {
                    var3 = 63;
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        } else {
          cm.e(47);
          if (-1 != (var2 ^ -1)) {
            if (128 > var2) {
              return (char)var2;
            } else {
              L1: {
                if (160 > var2) {
                  L2: {
                    var3 = jg.field_I[-128 + var2];
                    if (0 != var3) {
                      break L2;
                    } else {
                      var3 = 63;
                      break L2;
                    }
                  }
                  var2 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 128) {
          var2 = null;
          boolean discarded$2 = cm.a((String) null, -122);
          field_l = null;
          field_o = null;
          return;
        } else {
          field_l = null;
          field_o = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, long param2, String param3, int param4, int param5) {
        int var7 = -86 % ((-33 - param0) / 49);
        aa.field_f.g(param5, 15514);
        aa.field_f.field_m = aa.field_f.field_m + 1;
        int var8 = aa.field_f.field_m;
        aa.field_f.a(false, param2);
        aa.field_f.b((byte) -41, param3);
        aa.field_f.e(160, param4);
        aa.field_f.e(160, param1 ? 1 : 0);
        aa.field_f.f(aa.field_f.field_m + -var8, -1);
    }

    final static void e(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 < -84) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var3 = null;
                    cm.a(-64, true, 36L, (String) null, -110, -88);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var1 = (Object) (Object) fj.field_c;
                    // monitorenter fj.field_c
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        oi.field_c = oi.field_c + 1;
                        ef.field_b = jm.field_o;
                        uf.field_d = u.field_b;
                        bg.field_k = ra.field_d;
                        im.field_Jb = u.field_j;
                        u.field_j = false;
                        nm.field_c = tl.field_a;
                        uo.field_a = c.field_X;
                        ji.field_c = fa.field_j;
                        tl.field_a = 0;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    cm(pp param0, fa param1) {
        ((cm) this).field_n = param0;
        ((cm) this).field_p = param0.e();
        ((cm) this).field_k = param1;
        ((cm) this).field_n.h(128 + ia.field_h * ((cm) this).field_p >> -1790376536);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = false;
        field_l = "Instructions";
    }
}
