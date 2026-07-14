/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends fh {
    int[] field_n;
    private String[] field_k;
    private int[][] field_l;
    private int[] field_m;

    private final void a(ds param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ri var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          if (param2 == 0) {
            break L0;
          } else {
            pi.a((byte) 3, false, false);
            break L0;
          }
        }
        L1: {
          if ((param1 ^ -1) == -2) {
            ((pi) this).field_k = up.a((byte) -67, '<', param0.a(-1));
            break L1;
          } else {
            if (param1 == -3) {
              var4 = param0.e((byte) -113);
              ((pi) this).field_n = new int[var4];
              var5 = 0;
              L2: while (true) {
                if (var4 <= var5) {
                  break L1;
                } else {
                  ((pi) this).field_n[var5] = param0.e(1869);
                  var5++;
                  continue L2;
                }
              }
            } else {
              if (-4 == param1) {
                var4 = param0.e((byte) -107);
                ((pi) this).field_m = new int[var4];
                ((pi) this).field_l = new int[var4][];
                var5 = 0;
                L3: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    var6 = param0.e(param2 ^ 1869);
                    var7 = itb.a(0, var6);
                    if (var7 != null) {
                      ((pi) this).field_m[var5] = var6;
                      ((pi) this).field_l[var5] = new int[var7.field_c];
                      var8 = 0;
                      L4: while (true) {
                        if (var8 < var7.field_c) {
                          ((pi) this).field_l[var5][var8] = param0.e(1869);
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
                if ((param1 ^ -1) == -5) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
    }

    final String a(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        StringBuilder var5 = new StringBuilder(param0);
        StringBuilder var2 = var5;
        if (null == ((pi) this).field_k) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((pi) this).field_k[0]);
        for (var3 = 1; ((pi) this).field_k.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((pi) this).field_k[var3]);
        }
        return var2.toString();
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (param0 != 97) {
            return;
        }
        if (null != ((pi) this).field_n) {
            for (var2 = 0; ((pi) this).field_n.length > var2; var2++) {
                ((pi) this).field_n[var2] = knb.a(((pi) this).field_n[var2], 32768);
            }
        }
    }

    final void a(ds param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        L0: while (true) {
          var3 = param0.e((byte) -104);
          if (var3 != 0) {
            this.a(param0, var3, 0);
            continue L0;
          } else {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                ((pi) this).field_n = null;
                break L1;
              }
            }
            return;
          }
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param0 > -6) {
            return;
        }
        if (!param1) {
            dma.a();
        } else {
            dma.e(0, 0, dma.field_g, dma.field_j, 0, 192);
        }
        vqb.a(param1, 76);
    }

    pi() {
    }

    static {
    }
}
