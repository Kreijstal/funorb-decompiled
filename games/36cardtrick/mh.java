/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh {
    static nk field_a;
    static qk field_c;
    static ja field_d;
    static volatile int field_b;

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -41) {
            mh.a((byte) 58);
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Main.field_T;
          if (d.field_c > param0) {
            L1: {
              if (wc.field_A != null) {
                gj.field_a = wc.field_A.c(-1);
                vd.a(2, -1);
                break L1;
              } else {
                gj.field_a = qa.a(0, 480, 0, 17651, jk.field_a, 640);
                break L1;
              }
            }
            if (gj.field_a != null) {
              tk.a((java.awt.Canvas) (Object) gj.field_a, -1);
              var2 = 2;
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          } else {
            if (!dl.d(0)) {
              var2 = 1;
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          }
        }
        L2: {
          if (null != wc.field_A) {
            break L2;
          } else {
            if (!rg.field_a) {
              break L2;
            } else {
              sc.a(var2, (byte) 116, param1);
              break L2;
            }
          }
        }
    }

    final static int a(boolean param0, int param1, ee param2, String param3, String[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Main.field_T;
          var5 = param2.a(param3);
          if (var5 > param1) {
            break L0;
          } else {
            if (0 == (param3.indexOf("<br>") ^ -1)) {
              param4[0] = (String) (Object) param4;
              return 1;
            } else {
              break L0;
            }
          }
        }
        var6 = (-1 + (param1 + var5)) / param1;
        param1 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param3.length();
        if (!param0) {
          var9 = 0;
          L1: while (true) {
            if (var9 >= var8) {
              L2: {
                if (var8 <= var7) {
                  break L2;
                } else {
                  int incrementValue$3 = var6;
                  var6++;
                  param4[incrementValue$3] = param3.substring(var7, var8).trim();
                  break L2;
                }
              }
              return var6;
            } else {
              L3: {
                L4: {
                  var10 = param3.charAt(var9);
                  if (var10 == 32) {
                    break L4;
                  } else {
                    if (45 != var10) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var11 = param3.substring(var7, var9 + 1).trim();
                var12 = param2.a(var11);
                if (param1 > var12) {
                  break L3;
                } else {
                  var7 = 1 + var9;
                  int incrementValue$4 = var6;
                  var6++;
                  param4[incrementValue$4] = var11;
                  break L3;
                }
              }
              if (var10 == 62) {
                if (param3.regionMatches(var9 - 3, "<br>", 0, 4)) {
                  int incrementValue$5 = var6;
                  var6++;
                  param4[incrementValue$5] = param3.substring(var7, -3 + var9).trim();
                  var7 = 1 + var9;
                  var9++;
                  continue L1;
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return 69;
        }
    }

    final static nk a(int param0, String param1) {
        if (param0 != -63) {
            mh.a(125, true);
        }
        if (ei.field_d == hh.field_g) {
            return null;
        }
        if (ei.field_d == gg.field_b) {
            if (param1.equals((Object) (Object) dj.field_e)) {
                ei.field_d = tj.field_F;
                return tf.field_s;
            }
        }
        ei.field_d = hh.field_g;
        tf.field_s = null;
        dj.field_e = param1;
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
