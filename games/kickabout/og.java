/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class og {
    int[] field_b;
    int field_a;
    static int field_c;
    java.awt.Image field_d;
    int field_e;

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    final static void a(int param0, ut[] param1, int param2, int param3) {
        int[] var4 = null;
        ut var4_ref = null;
        int[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        ut var6_ref_ut = null;
        int var7 = 0;
        ut var7_ref_ut = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ut var11 = null;
        int[] var12 = null;
        ut var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        ut var16 = null;
        int[] var17 = null;
        ut var18 = null;
        L0: {
          L1: {
            var10 = Kickabout.field_G;
            if (0 == rm.field_C) {
              break L1;
            } else {
              L2: {
                if (rm.field_C == 1) {
                  break L2;
                } else {
                  if ((rm.field_C ^ -1) == -3) {
                    break L2;
                  } else {
                    if (3 == rm.field_C) {
                      var11 = param1[p.a((byte) -24, 3)];
                      var4_ref = var11;
                      var5_int = el.a(29430, 10, 896 + -var11.field_o >> 730531553);
                      var6 = el.a(29430, 10, 50 + -(var11.field_v >> 829059617));
                      var11.c(var5_int + param2, var6 + param3);
                      var4_ref.c(param2 - -var5_int, -var11.field_v + -var6 + (1344 + param3));
                      var5_int = el.a(29430, 10, -var11.field_o + 896 >> -1266628095);
                      var6 = el.a(29430, 10, 1344 + -var11.field_v >> -1282865343);
                      param1[p.a((byte) -24, 3)].c(var5_int + param2, param3 + var6);
                      if (0 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
              var12 = new int[]{-40, 40, 0};
              var14 = new int[]{0, 0, 50};
              var6 = 0;
              L3: while (true) {
                L4: {
                  if (-4 >= (var6 ^ -1)) {
                    break L4;
                  } else {
                    var13 = param1[var6];
                    var7_ref_ut = var13;
                    var8 = el.a(29430, 10, var12[var6] + (896 - var13.field_o >> 724538049));
                    var9 = el.a(29430, 10, 60 - ((var13.field_v >> 1805808033) + -var14[var6]));
                    var13.c(var8 + param2, var9 + param3);
                    var7_ref_ut.c(var8 + param2, -var13.field_v + -var9 + (1344 + param3));
                    var6++;
                    if (0 == 0) {
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var6_ref_ut = param1[p.a((byte) -24, 3)];
                var7 = el.a(29430, 10, -var6_ref_ut.field_o + 896 >> -1437065887);
                var8 = el.a(29430, 10, 1344 + -var6_ref_ut.field_v >> -204698815);
                var6_ref_ut.c(var7 + param2, var8 + param3);
                if (0 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          var15 = new int[]{-100, 100, 0, 50, -50};
          var17 = new int[]{100, 100, 90, 40, 40};
          var6 = 0;
          L5: while (true) {
            L6: {
              if (5 <= var6) {
                break L6;
              } else {
                var16 = param1[p.a((byte) -24, 3)];
                var8 = 448 + var15[var6] + -(var16.field_o >> -1850535551);
                var9 = var17[var6] + -(var16.field_v >> -1077673759) + 10;
                var16.c(var8 + param2, var9 + param3);
                var16.c(var8 + param2, param3 + 1344 - var9 - var16.field_v);
                var6++;
                if (0 == 0) {
                  continue L5;
                } else {
                  break L6;
                }
              }
            }
            var5 = new int[]{30, -20, 0};
            var4 = new int[]{-50, -10, 40};
            var6 = 0;
            L7: while (true) {
              if (-4 >= (var6 ^ -1)) {
                break L0;
              } else {
                var18 = param1[p.a((byte) -24, 3)];
                var8 = var4[var6] + (896 + -var18.field_o >> -1820089375);
                var9 = var5[var6] + (1344 + -var18.field_v >> 1044739457);
                var18.c(param2 + var8, var9 + param3);
                var6++;
                if (0 == 0) {
                  continue L7;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L8: {
          if (param0 >= 71) {
            break L8;
          } else {
            field_c = 46;
            break L8;
          }
        }
    }

    final void b(int param0) {
        on.a(((og) this).field_b, ((og) this).field_a, ((og) this).field_e);
        if (param0 != 32) {
            ((og) this).field_a = -72;
        }
    }

    final static void a(int param0) {
        vu.field_Ib = new tk("Cabinet", ne.j((byte) 15), be.field_q, it.field_m);
        vu.field_Ib.a(16, 100, 4, (byte) -114, 200, 300, 70);
        if (param0 != 20164) {
            field_c = 125;
        }
    }

    abstract void a(int param0, int param1, int param2, java.awt.Component param3);

    final static String[] a(String param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        String[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Kickabout.field_G;
        if (param0 == null) {
          return new String[]{};
        } else {
          StringBuilder discarded$2 = dj.a(0, ' ', -11407, c.field_a);
          var3 = 0;
          var4 = 0;
          var5 = -1;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = param0.length();
          var10 = 0;
          L0: while (true) {
            if (var10 >= var9) {
              L1: {
                if (var4 < c.field_a.length()) {
                  n.field_f[var8] = c.field_a.toString().substring(var4, c.field_a.length());
                  var8++;
                  break L1;
                } else {
                  break L1;
                }
              }
              var10 = -13 % ((param2 - 77) / 44);
              var11 = new String[var8];
              var12 = 0;
              L2: while (true) {
                if (var8 <= var12) {
                  return var11;
                } else {
                  var11[var12] = n.field_f[var12];
                  var12++;
                  continue L2;
                }
              }
            } else {
              L3: {
                var11_int = param0.charAt(var10);
                if (var11_int == 0) {
                  break L3;
                } else {
                  StringBuilder discarded$3 = c.field_a.append(var11_int);
                  var3++;
                  var11_int = (char)(255 & mf.a((char) var11_int, (byte) -104));
                  break L3;
                }
              }
              L4: {
                if (var11_int == 32) {
                  var5 = c.field_a.length();
                  var7 = 1;
                  var6 = var3;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var3 <= param1) {
                  break L5;
                } else {
                  if (var5 < 0) {
                    break L5;
                  } else {
                    n.field_f[var8] = c.field_a.toString().substring(var4, var5 + -var7);
                    var8++;
                    var4 = var5;
                    var3 = var3 - var6;
                    var5 = -1;
                    break L5;
                  }
                }
              }
              if (var11_int == 45) {
                var5 = c.field_a.length();
                var7 = 0;
                var6 = var3;
                var10++;
                continue L0;
              } else {
                var10++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        np.field_Jb.a((gn) (Object) new sq(), 3);
        if (param0) {
            og.a(false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 1;
    }
}
