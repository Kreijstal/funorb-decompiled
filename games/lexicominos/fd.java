/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd implements Runnable {
    static tf field_e;
    static int field_g;
    volatile boolean field_d;
    volatile boolean field_c;
    ab field_b;
    static String field_a;
    volatile b[] field_f;

    final static boolean a(String param0, int param1, int param2, String param3, pj param4, String param5, boolean param6) {
        if (bk.field_c != c.field_m) {
            return false;
        }
        u var8 = new u(ug.field_A, param4);
        if (param1 != 0) {
            field_a = null;
        }
        ug.field_A.a(param1 + -14579, (w) (Object) var8);
        if (g.f(256)) {
            var8.k((byte) -92);
        } else {
            ce.field_d = param0;
            Lexicominos.field_H = param3;
            cg.field_l = param2;
            wa.field_k = param5;
            bk.field_c = ca.field_i;
            li.field_T = null;
            we.field_d = param6 ? true : false;
            return true;
        }
        return true;
    }

    final static long a(byte param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        var2 = 0L;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 >= var4) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (var6 < 65) {
                    break L3;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(-65 + var6 + 1);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 < 97) {
                    break L4;
                  } else {
                    if (122 >= var6) {
                      var2 = var2 + (long)(-97 + (1 - -var6));
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 < 48) {
                  break L2;
                } else {
                  if (57 < var6) {
                    break L2;
                  } else {
                    var2 = var2 + (long)(var6 + 27 - 48);
                    break L2;
                  }
                }
              }
              if ((var2 ^ -1L) > -177917621779460414L) {
                var5++;
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L5: {
            if (param0 == -58) {
              break L5;
            } else {
              fd.a((byte) -11);
              break L5;
            }
          }
          L6: while (true) {
            L7: {
              if (-1L != (var2 % 37L ^ -1L)) {
                break L7;
              } else {
                if (-1L == (var2 ^ -1L)) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    public final void run() {
        int var1_int = 0;
        b var2 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        ((fd) this).field_c = true;
        try {
            while (!((fd) this).field_d) {
                for (var1_int = 0; 2 > var1_int; var1_int++) {
                    var2 = ((fd) this).field_f[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.e();
                    }
                }
                ge.a(0, 10L);
                ki.a((Object) null, ((fd) this).field_b, 50);
            }
        } catch (Exception exception) {
            Object var5 = null;
            uj.a((String) null, (Throwable) (Object) exception, 1);
        } finally {
            ((fd) this).field_c = false;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 != -61) {
            field_g = -15;
        }
    }

    fd() {
        ((fd) this).field_f = new b[2];
        ((fd) this).field_d = false;
        ((fd) this).field_c = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "No highscores";
        field_e = new tf();
    }
}
