/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends am {
    static String field_r;
    static String field_o;
    static String field_q;
    private int[] field_p;
    static String field_s;
    private String[] field_u;
    static String field_v;
    private int[][] field_t;
    int[] field_n;

    private final void a(byte param0, int param1, iw param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ff var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Kickabout.field_G;
          if (-2 == (param1 ^ -1)) {
            ((bg) this).field_u = wr.a(param2.a(param0 ^ 100), 2, '<');
            break L0;
          } else {
            if (2 != param1) {
              if (param1 != 3) {
                if ((param1 ^ -1) != -5) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param2.h((byte) -120);
                ((bg) this).field_t = new int[var4][];
                ((bg) this).field_p = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    var6 = param2.a((byte) 81);
                    var7 = bb.a((byte) 127, var6);
                    if (var7 != null) {
                      ((bg) this).field_p[var5] = var6;
                      ((bg) this).field_t[var5] = new int[var7.field_d];
                      var8 = 0;
                      L2: while (true) {
                        if (var8 < var7.field_d) {
                          ((bg) this).field_t[var5][var8] = param2.a((byte) 81);
                          var8++;
                          continue L2;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              var4 = param2.h((byte) -122);
              ((bg) this).field_n = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  ((bg) this).field_n[var5] = param2.a((byte) 81);
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
        L4: {
          if (param0 == 63) {
            break L4;
          } else {
            field_o = null;
            break L4;
          }
        }
    }

    final static String a(byte param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = Kickabout.field_G;
        if (-1L <= (param1 ^ -1L)) {
            return null;
        }
        if (-6582952005840035282L >= (param1 ^ -1L)) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while ((var4 ^ -1L) != -1L) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        if (param0 < 103) {
            field_o = null;
        }
        while (0L != param1) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = gu.field_yb[(int)(var7 + -(37L * param1))];
            if (!(95 != var9)) {
                var10 = var6.length() + -1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static ut a(String param0, sj param1, byte param2, String param3) {
        if (param2 <= 35) {
            return null;
        }
        int var4 = param1.b(param0, -1);
        int var5 = param1.a((byte) -126, param3, var4);
        return ow.a(param1, var4, (byte) 89, var5);
    }

    public static void a(int param0) {
        if (param0 < 41) {
            String discarded$0 = bg.a((byte) 105, -78L);
        }
        field_o = null;
        field_v = null;
        field_r = null;
        field_s = null;
        field_q = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (!(((bg) this).field_n == null)) {
            for (var2 = 0; ((bg) this).field_n.length > var2; var2++) {
                ((bg) this).field_n[var2] = hf.a(((bg) this).field_n[var2], 32768);
            }
        }
        if (param0) {
            bg.a(-4);
        }
    }

    bg() {
    }

    final String g(byte param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((bg) this).field_u) {
            return "";
        }
        StringBuilder discarded$7 = var5.append(((bg) this).field_u[0]);
        if (param0 > -71) {
            ((bg) this).field_n = null;
        }
        for (var3 = 1; var3 < ((bg) this).field_u.length; var3++) {
            StringBuilder discarded$8 = var2.append("...");
            StringBuilder discarded$9 = var5.append(((bg) this).field_u[var3]);
        }
        return var2.toString();
    }

    final void a(byte param0, iw param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        L0: while (true) {
          var3 = param1.h((byte) -117);
          if (var3 != 0) {
            this.a((byte) 63, var3, param1);
            continue L0;
          } else {
            L1: {
              if (param0 > 87) {
                break L1;
              } else {
                ((bg) this).field_p = null;
                break L1;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Use the mouse to point to a character!";
        field_s = "This game is full.";
        field_o = "Service unavailable";
        field_v = "Auction one of your players online.";
    }
}
