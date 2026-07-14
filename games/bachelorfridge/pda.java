/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pda extends eo {
    private String[] field_r;
    int[] field_s;
    private int[] field_o;
    static String field_q;
    private int[][] field_n;
    static int field_p;

    private final void a(lu param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        du var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            ((pda) this).field_r = null;
            break L0;
          }
        }
        L1: {
          if (param2 != 1) {
            if (-3 != param2) {
              if (-4 == (param2 ^ -1)) {
                var4 = param0.b(16711935);
                ((pda) this).field_o = new int[var4];
                ((pda) this).field_n = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    var6 = param0.e((byte) 57);
                    var7 = pga.a(false, var6);
                    if (var7 != null) {
                      ((pda) this).field_o[var5] = var6;
                      ((pda) this).field_n[var5] = new int[var7.field_d];
                      var8 = 0;
                      L3: while (true) {
                        if (var8 < var7.field_d) {
                          ((pda) this).field_n[var5][var8] = param0.e((byte) 85);
                          var8++;
                          continue L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (4 != param2) {
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              var4 = param0.b(16711935);
              ((pda) this).field_s = new int[var4];
              var5 = 0;
              L4: while (true) {
                if (var4 <= var5) {
                  break L1;
                } else {
                  ((pda) this).field_s[var5] = param0.e((byte) 97);
                  var5++;
                  continue L4;
                }
              }
            }
          } else {
            ((pda) this).field_r = fda.a(param1, '<', param0.g(-125));
            break L1;
          }
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (!param0) {
            return;
        }
        if (null != ((pda) this).field_s) {
            for (var2 = 0; var2 < ((pda) this).field_s.length; var2++) {
                ((pda) this).field_s[var2] = mp.a(((pda) this).field_s[var2], 32768);
            }
        }
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != -3) {
            field_p = 23;
        }
    }

    final void a(lu param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param1 >= 89) {
          L0: while (true) {
            var3 = param0.b(16711935);
            if (var3 != 0) {
              this.a(param0, 0, var3);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    pda() {
    }

    final String d(byte param0) {
        int var4 = BachelorFridge.field_y;
        StringBuilder var6 = new StringBuilder(80);
        var6 = var6;
        if (null == ((pda) this).field_r) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(((pda) this).field_r[0]);
        int var3 = 1;
        if (param0 <= 61) {
            String discarded$1 = ((pda) this).d((byte) 118);
        }
        while (var3 < ((pda) this).field_r.length) {
            StringBuilder discarded$2 = var6.append("...");
            StringBuilder discarded$3 = var6.append(((pda) this).field_r[var3]);
            var3++;
        }
        return var6.toString();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "You need a rating of <%1> to play with the current options.";
        field_p = 480;
    }
}
