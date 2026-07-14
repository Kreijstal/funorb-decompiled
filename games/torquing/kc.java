/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends am {
    private int[][] field_s;
    static ei field_z;
    private int[] field_y;
    static fn field_x;
    private int[] field_u;
    private short[] field_t;
    static int field_v;
    private int field_w;

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_x = null;
        field_z = null;
    }

    private final int[] b(int param0, int param1) {
        if (-1 < (param0 ^ -1)) {
            return ((kc) this).field_u;
        }
        if (((kc) this).field_s.length <= param0) {
            return ((kc) this).field_y;
        }
        if (param1 != 257) {
            return null;
        }
        return ((kc) this).field_s[param0];
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Torquing.field_u;
        if (param1 != 35) {
            return;
        }
        if (!(param2 != 0)) {
            ((kc) this).field_w = param0.i((byte) -101);
            ((kc) this).field_s = new int[param0.i((byte) -101)][2];
            for (var4 = 0; var4 < ((kc) this).field_s.length; var4++) {
                ((kc) this).field_s[var4][0] = param0.i(7088);
                ((kc) this).field_s[var4][1] = param0.i(7088);
            }
        }
    }

    private final void g(byte param0) {
        int[] var14 = ((kc) this).field_s[0];
        int[] var12 = var14;
        int[] var10 = var12;
        int[] var8 = var10;
        int[] var7 = var8;
        int[] var2 = var7;
        int[] var15 = ((kc) this).field_s[1];
        int[] var4 = ((kc) this).field_s[((kc) this).field_s.length - 2];
        int[] var5 = ((kc) this).field_s[((kc) this).field_s.length + -1];
        if (param0 < 27) {
            Object var6 = null;
            int discarded$0 = kc.a((byte) -52, (CharSequence) null);
        }
        ((kc) this).field_y = new int[]{var4[0] - var5[0] - -var4[0], var4[1] + (-var5[1] + var4[1])};
        ((kc) this).field_u = new int[]{var14[0] + var14[0] - var15[0], var14[1] + -var15[1] + var14[1]};
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        L0: {
          var21 = Torquing.field_u;
          var2 = ((kc) this).field_w;
          if (var2 == 2) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -258) {
                break L0;
              } else {
                var4 = var2 << 1798880708;
                var3 = 1;
                L2: while (true) {
                  L3: {
                    if (((kc) this).field_s.length - 1 <= var3) {
                      break L3;
                    } else {
                      if (((kc) this).field_s[var3][0] <= var4) {
                        var3++;
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var22 = ((kc) this).field_s[var3 + -1];
                    var34 = ((kc) this).field_s[var3];
                    var7 = this.b(var3 - 2, 257)[1];
                    var8 = var22[1];
                    var9 = var34[1];
                    var10 = this.b(1 + var3, 257)[1];
                    var11 = (var4 - var22[0] << 1419780300) / (var34[0] - var22[0]);
                    var12 = var11 * var11 >> -440134836;
                    var13 = var8 + -var7 + -var9 + var10;
                    var14 = -var8 + (var7 - var13);
                    var15 = -var7 + var9;
                    var16 = var8;
                    var17 = var12 * (var11 * var13 >> 22694028) >> 1674360300;
                    var18 = var12 * var14 >> 975465804;
                    var19 = var15 * var11 >> -1281210644;
                    var20 = var19 + var17 - -var18 - -var16;
                    if (var20 > -32768) {
                      break L4;
                    } else {
                      var20 = -32767;
                      break L4;
                    }
                  }
                  L5: {
                    if ((var20 ^ -1) > -32769) {
                      break L5;
                    } else {
                      var20 = 32767;
                      break L5;
                    }
                  }
                  ((kc) this).field_t[var2] = (short)var20;
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            if (1 == var2) {
              var2 = 0;
              L6: while (true) {
                if (var2 >= 257) {
                  break L0;
                } else {
                  var4 = var2 << 49239556;
                  var3 = 1;
                  L7: while (true) {
                    L8: {
                      if (((kc) this).field_s.length - 1 <= var3) {
                        break L8;
                      } else {
                        if (var4 < ((kc) this).field_s[var3][0]) {
                          break L8;
                        } else {
                          var3++;
                          continue L7;
                        }
                      }
                    }
                    L9: {
                      var24 = ((kc) this).field_s[var3 + -1];
                      var35 = ((kc) this).field_s[var3];
                      var7 = (var4 + -var24[0] << -70437940) / (var35[0] + -var24[0]);
                      var8 = 4096 - de.field_d[(var7 & 8167) >> -2145922011] >> 631575329;
                      var9 = -var8 + 4096;
                      var10 = var24[1] * var9 - -(var8 * var35[1]) >> -629174964;
                      if (32767 > var10) {
                        break L9;
                      } else {
                        var10 = -32767;
                        break L9;
                      }
                    }
                    L10: {
                      if (-32769 > var10) {
                        break L10;
                      } else {
                        var10 = 32767;
                        break L10;
                      }
                    }
                    ((kc) this).field_t[var2] = (short)var10;
                    var2++;
                    continue L6;
                  }
                }
              }
            } else {
              var2 = 0;
              L11: while (true) {
                if (257 <= var2) {
                  break L0;
                } else {
                  var4 = var2 << -1858471388;
                  var3 = 1;
                  L12: while (true) {
                    L13: {
                      if (var3 >= -1 + ((kc) this).field_s.length) {
                        break L13;
                      } else {
                        if (((kc) this).field_s[var3][0] > var4) {
                          break L13;
                        } else {
                          var3++;
                          continue L12;
                        }
                      }
                    }
                    L14: {
                      var26 = ((kc) this).field_s[-1 + var3];
                      var36 = ((kc) this).field_s[var3];
                      var7 = (-var26[0] + var4 << 1055113068) / (-var26[0] + var36[0]);
                      var8 = -var7 + 4096;
                      var9 = var8 * var26[1] - -(var36[1] * var7) >> -1847924276;
                      if (-32768 >= var9) {
                        var9 = -32767;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (32768 > var9) {
                        break L15;
                      } else {
                        var9 = 32767;
                        break L15;
                      }
                    }
                    ((kc) this).field_t[var2] = (short)var9;
                    var2++;
                    continue L11;
                  }
                }
              }
            }
          }
        }
        L16: {
          if (!param0) {
            break L16;
          } else {
            ((kc) this).field_u = null;
            break L16;
          }
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = Torquing.field_u;
        if (param0 <= 86) {
            return null;
        }
        int[] var8 = ((kc) this).field_l.a(param1, 25657);
        int[] var3 = var8;
        if (!(!((kc) this).field_l.field_b)) {
            var5 = ((kc) this).b(0, 0, param1);
            for (var6 = 0; var6 < ci.field_c; var6++) {
                var4 = var5[var6] >> 177150276;
                if (-1 < var4) {
                    var4 = 0;
                }
                if (!(-257 >= var4)) {
                    var4 = 256;
                }
                var8[var6] = ((kc) this).field_t[var4];
            }
        }
        return var8;
    }

    final static int a(byte param0, CharSequence param1) {
        int var2 = -83 / ((param0 - 49) / 60);
        return ga.a(false, param1, true, 10);
    }

    public kc() {
        super(1, true);
        ((kc) this).field_t = new short[257];
        ((kc) this).field_w = 0;
    }

    final void a(byte param0) {
        if (((kc) this).field_s == null) {
            ((kc) this).field_s = new int[][]{new int[2], new int[2]};
        }
        if (2 > ((kc) this).field_s.length) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if ((((kc) this).field_w ^ -1) == -3) {
            this.g((byte) 69);
        }
        if (param0 <= 123) {
            Object var3 = null;
            kc.a(76, (la) null, (la) null);
        }
        ie.a(14837);
        this.a(false);
    }

    final static String[] a(char param0, String param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Torquing.field_u;
        CharSequence var10 = (CharSequence) (Object) param1;
        int var3 = fm.a(param2, param0, var10);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param1.charAt(var8) != param0; var8++) {
            }
            var5++;
            var4[var5] = param1.substring(var6, var8);
            var6 = var8 - -1;
        }
        var4[var3] = param1.substring(var6);
        return var4;
    }

    final static void a(int param0, la param1, la param2) {
        if (param0 != 1) {
            Object var4 = null;
            String[] discarded$0 = kc.a('', (String) null, -20);
        }
        qm.field_a = param1;
        ae.field_mb = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new ei();
    }
}
