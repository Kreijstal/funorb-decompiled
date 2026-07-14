/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    tc field_c;
    int field_f;
    static boolean[][] field_j;
    static dd field_h;
    static String field_i;
    static String field_a;
    static String field_d;
    static int field_b;
    static String[][] field_e;
    int field_g;

    final boolean b(int param0, int param1) {
        int var3 = 0;
        if (!(null != ((dl) this).field_c)) {
            return false;
        }
        for (var3 = 0; var3 < ((dl) this).field_c.a((byte) 88); var3++) {
            if (!(((dl) this).field_c.a(var3, 2229) != param0)) {
                return true;
            }
        }
        if (param1 != 304) {
            return false;
        }
        return false;
    }

    final static boolean a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Pool.field_O;
        var1 = param0;
        L0: while (true) {
          if (var1 >= ml.field_h.length) {
            return true;
          } else {
            if (ml.field_h[var1][0] != -3) {
              if (-3 != ml.field_h[var1][2]) {
                if (en.a(ml.field_h[var1][1], ml.field_h[var1][0], 115)) {
                  if (en.a(ml.field_h[var1][3], ml.field_h[var1][2], 110)) {
                    return false;
                  } else {
                    var1++;
                    continue L0;
                  }
                } else {
                  var1++;
                  continue L0;
                }
              } else {
                var1++;
                continue L0;
              }
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_h = null;
        if (param0) {
            field_b = 37;
        }
        field_j = null;
        field_e = null;
        field_i = null;
        field_a = null;
        field_d = null;
    }

    final int a(byte param0) {
        int var2 = 67 / ((-51 - param0) / 62);
        return (((dl) this).field_c == null ? 0 : ((dl) this).field_c.a((byte) 99)) + 1;
    }

    final void a(boolean param0) {
        int var2 = 0;
        if (!param0) {
            Object var3 = null;
            ie discarded$0 = dl.a(29, (String) null);
        }
        if (((dl) this).field_c != null) {
            // ifeq L115
            System.out.print("{");
            for (var2 = 0; var2 < ((dl) this).field_c.a((byte) 113); var2++) {
                if (!(0 == var2)) {
                    System.out.print(",");
                }
                System.out.print(Integer.toString(((dl) this).field_c.a(var2, 2229)));
            }
            System.out.print("}");
        } else {
            System.out.print("empty");
        }
    }

    final void a(byte param0, ge param1) {
        int var4 = 0;
        int var5 = Pool.field_O;
        if (param0 != 113) {
            ((dl) this).field_f = -35;
        }
        int var3 = param1.g(-101);
        if (var3 <= 0) {
            ((dl) this).field_c = null;
        } else {
            ((dl) this).field_c = cj.a(var3, 1, 0);
            for (var4 = 0; var4 < var3; var4++) {
                ((dl) this).field_c.a(10499, param1.g(param0 + -222), var4);
            }
        }
    }

    final void a(int param0, int param1) {
        if (((dl) this).field_c == null) {
            ((dl) this).field_c = qe.b(true);
        }
        int var3 = 126 / ((param1 - 0) / 51);
        ((dl) this).field_c.a((byte) -2, param0);
    }

    final void a(ge param0, int param1) {
        int var3 = 0;
        if (param1 != 0) {
            boolean discarded$0 = ((dl) this).b(-87, 43);
        }
        if (null == ((dl) this).field_c) {
            param0.a(0, false);
        } else {
            param0.a(((dl) this).field_c.a((byte) 120), false);
            for (var3 = 0; ((dl) this).field_c.a((byte) 108) > var3; var3++) {
                param0.a(((dl) this).field_c.a(var3, 2229), false);
            }
        }
    }

    final static ie a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = param1.length();
        if (0 != var2) {
          if (63 < var2) {
            return la.field_h;
          } else {
            if (param0 > 36) {
              var3 = 0;
              L0: while (true) {
                if (var3 < var2) {
                  var4 = param1.charAt(var3);
                  if (var4 == 45) {
                    L1: {
                      if (0 == var3) {
                        break L1;
                      } else {
                        if (var2 - 1 == var3) {
                          break L1;
                        } else {
                          var3++;
                          continue L0;
                        }
                      }
                    }
                    return pj.field_K;
                  } else {
                    if (0 == (ie.field_c.indexOf(var4) ^ -1)) {
                      return pj.field_K;
                    } else {
                      var3++;
                      continue L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return uj.field_e;
        }
    }

    final void a(pq[] param0, int param1) {
        tc var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        tc stackIn_13_1 = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        tc stackOut_12_1 = null;
        Object stackOut_11_0 = null;
        Object stackOut_11_1 = null;
        if (null != ((dl) this).field_c) {
          var3 = qe.b(true);
          var4 = 0;
          var5 = 0;
          L0: while (true) {
            if (var5 >= ((dl) this).field_c.a((byte) 110)) {
              L1: {
                if (param1 < -36) {
                  break L1;
                } else {
                  int discarded$1 = ((dl) this).a((byte) -111);
                  break L1;
                }
              }
              L2: {
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (var3.a((byte) 98) != 0) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = (tc) var3;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = null;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = (tc) (Object) stackOut_11_1;
                  break L2;
                }
              }
              ((dl) this).field_c = stackIn_13_1;
              return;
            } else {
              if (!param0[((dl) this).field_c.a(var5, 2229)].field_s) {
                var4++;
                var3.a(10499, ((dl) this).field_c.a(var5, 2229), var4);
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    dl(bf param0) {
        ((dl) this).field_c = null;
        ((dl) this).field_g = (param0.field_f + param0.field_a) / 2;
        ((dl) this).field_f = (param0.field_j - -param0.field_l) / 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Full";
        field_a = "You have not yet unlocked this option for use.";
        field_e = new String[][]{new String[1], new String[1], new String[2], new String[3], new String[2], new String[2], new String[3], new String[2], new String[2], new String[2], new String[2], new String[1], new String[2], new String[4], new String[2], new String[2], new String[2]};
        field_i = "<%0> have all resigned!";
    }
}
