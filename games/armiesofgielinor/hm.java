/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    cm field_g;
    private int field_k;
    int field_j;
    int[] field_a;
    static String field_e;
    int field_c;
    static String[] field_i;
    int[] field_b;
    int[] field_d;
    static jl field_h;
    static int[] field_l;
    static je field_f;

    public static void b(int param0) {
        field_f = null;
        field_l = null;
        field_e = null;
        field_i = null;
        field_h = null;
        if (param0 != 0) {
            field_f = null;
        }
    }

    hm(vh param0, boolean param1) {
        this();
        int discarded$0 = this.a(param0, -2, param1);
    }

    final static int a(mo param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == -5) {
            break L0;
          } else {
            hm.a(-8, 127, -35, 78, 58, -62, -122);
            break L0;
          }
        }
        L1: {
          var2 = ni.field_d;
          if (param0.field_b != 2) {
            if ((param0.field_b ^ -1) == -5) {
              var2 = fm.field_d[param0.field_b];
              break L1;
            } else {
              if ((oh.field_H ^ -1L) == (param0.field_n ^ -1L)) {
                var2 = ag.field_A[param0.field_b];
                break L1;
              } else {
                var2 = fm.field_d[param0.field_b];
                break L1;
              }
            }
          } else {
            if (!param0.field_f) {
              L2: {
                if (0 != param0.field_a) {
                  break L2;
                } else {
                  if (param0.field_e != 0) {
                    break L2;
                  } else {
                    var2 = ag.field_A[param0.field_b];
                    break L1;
                  }
                }
              }
              var2 = fm.field_d[param0.field_b];
              break L1;
            } else {
              var2 = ni.field_d;
              break L1;
            }
          }
        }
        return var2;
    }

    final int a(byte param0) {
        if (param0 <= 44) {
            int discarded$0 = ((hm) this).a((byte) 121);
        }
        return -((hm) this).field_k + ((hm) this).field_c;
    }

    final boolean a(int param0, byte param1) {
        if (!(((hm) this).a((byte) 57) >= param0)) {
            return false;
        }
        ((hm) this).field_k = ((hm) this).field_k + param0;
        if (param1 != 103) {
            field_l = null;
            return true;
        }
        return true;
    }

    final int a(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = at.field_c.length;
        int var3 = ((hm) this).field_j + ((hm) this).field_c;
        for (var4 = param0; var4 < var2; var4++) {
            var5 = at.field_c[var4];
            var3 = var3 - var5;
            if (!(0 <= var3)) {
                return var4;
            }
        }
        return var2;
    }

    private final int a(vh param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = param0.k(param1 + 2);
        if (9 >= var4) {
          L0: {
            if (var4 <= param1) {
              L1: {
                L2: {
                  if (-6 > var4) {
                    break L2;
                  } else {
                    if (!param2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6 = 0;
                L3: while (true) {
                  if (((hm) this).field_a.length <= var6) {
                    break L1;
                  } else {
                    ((hm) this).field_a[var6] = param0.k(0);
                    var6++;
                    continue L3;
                  }
                }
              }
              var6 = 0;
              L4: while (true) {
                if (((hm) this).field_d.length <= var6) {
                  ((hm) this).field_c = param0.i(1);
                  var6 = 0;
                  L5: while (true) {
                    if (7 <= var6) {
                      break L0;
                    } else {
                      ((hm) this).field_b[var6] = param0.e((byte) -104);
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  ((hm) this).field_d[var6] = param0.e((byte) -104);
                  if ((((hm) this).field_d[var6] ^ -1) <= -136) {
                    ((hm) this).field_d[var6] = -1;
                    var6++;
                    continue L4;
                  } else {
                    var6++;
                    continue L4;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L6: {
            var5 = -1;
            if (6 <= var4) {
              ((hm) this).field_k = param0.i(1);
              ((hm) this).field_j = param0.i(1);
              ((hm) this).field_g.a(var4, param0, -115);
              break L6;
            } else {
              var5 = param0.k(0);
              ((hm) this).field_k = 0;
              ((hm) this).field_j = 0;
              var6 = 0;
              L7: while (true) {
                if (var6 >= var5) {
                  break L6;
                } else {
                  var7 = at.field_c[var6];
                  ((hm) this).field_j = ((hm) this).field_j + var7;
                  var6++;
                  continue L7;
                }
              }
            }
          }
          return var4;
        } else {
          throw new RuntimeException("Unrecognized version: " + var4);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        as.field_E.a(param5, -20500, param6, param2, param4);
        if (qd.field_I != null) {
            qd.field_I.b(param1, param3, param5, -kn.field_z + param1, param5, param0 ^ 6518);
        }
        if (param0 != -1) {
            field_i = null;
        }
    }

    private hm() {
        int var1 = 0;
        ((hm) this).field_k = 0;
        ((hm) this).field_a = new int[135];
        ((hm) this).field_b = new int[7];
        ((hm) this).field_c = 0;
        ((hm) this).field_j = 0;
        ((hm) this).field_d = new int[5];
        for (var1 = 0; 5 > var1; var1++) {
            ((hm) this).field_d[var1] = -1;
        }
        int var3 = 0;
        var1 = var3;
        while (135 > var3) {
            ((hm) this).field_a[var3] = 0;
            var3++;
        }
        ((hm) this).field_g = new cm();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Full health", "1/2 health", "1/3 health", "1/4 health", "1/5 health", "1/6 health"};
        field_e = "Are You Sure?";
        field_l = new int[]{0, 0, 536870912, 553634816, 544700415};
        field_h = new jl();
    }
}
