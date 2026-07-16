/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends ud {
    static ko field_cb;
    static String[] field_fb;
    static String field_eb;
    static am field_db;

    public static void l(int param0) {
        if (param0 < 14) {
          ck.l(-61);
          field_eb = null;
          field_fb = null;
          field_db = null;
          field_cb = null;
          return;
        } else {
          field_eb = null;
          field_fb = null;
          field_db = null;
          field_cb = null;
          return;
        }
    }

    final void a(qm param0, byte param1) {
        super.a(param0, param1);
    }

    final static void n(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = CrazyCrystals.field_B;
        var5 = to.field_b;
        var1 = var5;
        if (param0 != 48) {
          return;
        } else {
          var2 = 0;
          var3 = var5.length;
          L0: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              int incrementValue$16 = var2;
              var2++;
              var5[incrementValue$16] = 0;
              int incrementValue$17 = var2;
              var2++;
              var5[incrementValue$17] = 0;
              int incrementValue$18 = var2;
              var2++;
              var5[incrementValue$18] = 0;
              int incrementValue$19 = var2;
              var2++;
              var5[incrementValue$19] = 0;
              int incrementValue$20 = var2;
              var2++;
              var5[incrementValue$20] = 0;
              int incrementValue$21 = var2;
              var2++;
              var5[incrementValue$21] = 0;
              int incrementValue$22 = var2;
              var2++;
              var5[incrementValue$22] = 0;
              int incrementValue$23 = var2;
              var2++;
              var5[incrementValue$23] = 0;
              continue L0;
            }
          }
        }
    }

    final static void m(int param0) {
        kf.field_f = null;
        co.field_F = false;
        cl.field_o = param0;
        rf.field_G = -1;
        ni.field_b = -1;
    }

    final static long a(byte param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        var2 = 0L;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          if (var4 > var5) {
            L1: {
              L2: {
                var2 = var2 * 37L;
                var6 = param1.charAt(var5);
                if (65 > var6) {
                  break L2;
                } else {
                  if (90 >= var6) {
                    var2 = var2 + (long)(var6 + 1 + -65);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var6 < 97) {
                  break L3;
                } else {
                  if (var6 > 122) {
                    break L3;
                  } else {
                    var2 = var2 + (long)(1 - -var6 + -97);
                    break L1;
                  }
                }
              }
              if (48 > var6) {
                break L1;
              } else {
                if (var6 > 57) {
                  break L1;
                } else {
                  var2 = var2 + (long)(27 + var6 - 48);
                  break L1;
                }
              }
            }
            if (177917621779460413L > var2) {
              var5++;
              continue L0;
            } else {
              var6 = -71 % ((param0 - 52) / 38);
              L4: while (true) {
                L5: {
                  if ((var2 % 37L ^ -1L) != -1L) {
                    break L5;
                  } else {
                    if (-1L == (var2 ^ -1L)) {
                      break L5;
                    } else {
                      var2 = var2 / 37L;
                      continue L4;
                    }
                  }
                }
                return var2;
              }
            }
          } else {
            var6 = -71 % ((param0 - 52) / 38);
            L6: while (true) {
              L7: {
                if ((var2 % 37L ^ -1L) != -1L) {
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
    }

    ck(ol param0, qm param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = "Player";
        field_fb = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
