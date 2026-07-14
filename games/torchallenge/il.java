/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends ma {
    static String[] field_s;
    static k field_n;
    static String[] field_p;
    static int[] field_o;
    static int[] field_r;
    static long field_m;
    static int[] field_q;

    il(dj param0) {
        super(param0);
    }

    final rj a(byte param0, String param1) {
        int var3 = null == aj.a(param1, true) ? 1 : 0;
        if (param0 != 24) {
            String discarded$0 = il.f(-25);
        }
        if (var3 == 0) {
            return lk.field_c;
        }
        return tf.field_w;
    }

    final static String f(int param0) {
        if (qc.field_i == gj.field_a) {
            return mj.field_d;
        }
        if (!(ji.field_k.b(param0 ^ param0))) {
            return ji.field_k.a(0);
        }
        if (qc.field_i == eh.field_p) {
            return ji.field_k.a(0);
        }
        return lg.field_b;
    }

    final String a(String param0, byte param1) {
        if (param1 != -24) {
            return null;
        }
        if (((il) this).a((byte) 24, param0) == lk.field_c) {
            return d.field_r;
        }
        return rk.field_c;
    }

    final static void a(boolean param0, int param1) {
        if (!(null != ji.field_p)) {
            si.e((byte) 125);
        }
        if (param1 != 0) {
            return;
        }
        gb.a(2, -66, (eg) (Object) ag.field_e, 32, ji.field_p, ji.field_p, param0, ag.field_e.field_x, tf.field_x, 24, 24, 8, 18, 320, 240);
    }

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!ak.a(95, param0.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!ak.a(95, param0.charAt(-1 + var3))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = var3 + -var2;
              if (var4 >= 1) {
                if (-13 <= (var4 ^ -1)) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L4: while (true) {
                    if (var6 >= var3) {
                      L5: {
                        if (param1 == 21) {
                          break L5;
                        } else {
                          il.a(true, -106);
                          break L5;
                        }
                      }
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (ie.a((byte) 82, (char) var7)) {
                        var8 = uk.a((char) var7, (byte) -111);
                        if (0 != var8) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L4;
                        } else {
                          var6++;
                          continue L4;
                        }
                      } else {
                        var6++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (!(11 != gj.field_c)) {
            mf.c(-122);
        }
        if (param0 != -20895) {
            return;
        }
        c.a(sa.field_b, 127, hk.field_d, bg.field_G);
        nj.a(0, 0, param1, param0 + 20895);
    }

    public static void g(int param0) {
        field_q = null;
        field_s = null;
        field_o = null;
        field_r = null;
        if (param0 != 8) {
            field_p = null;
        }
        field_n = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_n = new k(2, 4, 4, 0);
        field_o = new int[]{3, 4, 5};
        field_p = new String[]{"4 more towers.", "2 more master monks.", "Many more seals and riches to collect."};
        field_q = new int[16];
        field_r = new int[8192];
    }
}
