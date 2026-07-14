/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wua extends od {
    static int field_n;
    private int[] field_k;
    static apa field_o;
    private String[] field_l;
    private int[][] field_q;
    int[] field_m;
    static String field_p;

    final static boolean c(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 49) {
            break L0;
          } else {
            wua.a((byte) 74);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (gda.field_c ^ -1)) {
              break L2;
            } else {
              if (cga.field_f < 13) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 37) {
            wua.a((byte) -54);
        }
        if (!(((wua) this).field_m == null)) {
            for (var2 = 0; ((wua) this).field_m.length > var2; var2++) {
                ((wua) this).field_m[var2] = fh.a(((wua) this).field_m[var2], 32768);
            }
        }
    }

    final void a(uia param0, byte param1) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = -85 % ((param1 - 27) / 57);
        while (true) {
            var4 = param0.h(255);
            if (-1 == (var4 ^ -1)) {
                break;
            }
            this.a(param0, var4, (byte) 46);
        }
    }

    private final void a(uia param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        su var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (param2 >= 3) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        L1: {
          if (-2 != (param1 ^ -1)) {
            if (param1 == 2) {
              var4 = param0.h(255);
              ((wua) this).field_m = new int[var4];
              var5 = 0;
              L2: while (true) {
                if (var4 <= var5) {
                  break L1;
                } else {
                  ((wua) this).field_m[var5] = param0.d(123);
                  var5++;
                  continue L2;
                }
              }
            } else {
              if ((param1 ^ -1) == -4) {
                var4 = param0.h(255);
                ((wua) this).field_q = new int[var4][];
                ((wua) this).field_k = new int[var4];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4) {
                    break L1;
                  } else {
                    var6 = param0.d(122);
                    var7 = li.a(var6, (byte) 126);
                    if (var7 != null) {
                      ((wua) this).field_k[var5] = var6;
                      ((wua) this).field_q[var5] = new int[var7.field_b];
                      var8 = 0;
                      L4: while (true) {
                        if (var8 < var7.field_b) {
                          ((wua) this).field_q[var5][var8] = param0.d(124);
                          var8++;
                          continue L4;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (4 != param1) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            ((wua) this).field_l = rga.a(32287, param0.e((byte) -76), '<');
            break L1;
          }
        }
    }

    final String b(byte param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 != -5) {
            ((wua) this).field_k = null;
        }
        if (null == ((wua) this).field_l) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((wua) this).field_l[0]);
        for (var3 = 1; ((wua) this).field_l.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((wua) this).field_l[var3]);
        }
        return var2.toString();
    }

    public static void a(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 > -1) {
            field_p = null;
        }
    }

    wua() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Private";
    }
}
