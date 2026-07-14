/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr {
    static int[] field_a;

    final static void a(kl param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        gv.field_a = new wk[es.field_c.length][][];
        var9 = "basic";
        var2 = var9;
        var3 = 0;
        if (param1 == 18) {
          L0: {
            if (es.field_c.length <= var3) {
              break L0;
            } else {
              L1: {
                if (es.field_c[var3] == null) {
                  var3++;
                  break L1;
                } else {
                  gv.field_a[var3] = new wk[es.field_c[var3].length][];
                  var4 = 0;
                  L2: while (true) {
                    if (es.field_c[var3].length <= var4) {
                      var3++;
                      break L1;
                    } else {
                      var11 = es.field_c[var3][var4];
                      var5 = var11;
                      if (var5 != null) {
                        L3: {
                          gv.field_a[var3][var4] = new wk[var11.length];
                          var6 = 0;
                          if (var11.length <= var6) {
                            break L3;
                          } else {
                            L4: {
                              var12 = var11[var6];
                              if (var12 == null) {
                                var6++;
                                break L4;
                              } else {
                                gv.field_a[var3][var4][var6] = ic.a(var12, (byte) 51, var9, param0);
                                var6++;
                                break L4;
                              }
                            }
                            var6++;
                            var6++;
                            var6++;
                            break L3;
                          }
                        }
                        if (-15 == (var3 ^ -1)) {
                          if (var4 == 0) {
                            hw.a((byte) 29, var3, var4);
                            var4++;
                            continue L2;
                          } else {
                            var4++;
                            continue L2;
                          }
                        } else {
                          var4++;
                          var4++;
                          continue L2;
                        }
                      } else {
                        var4++;
                        var4++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              var3++;
              var3++;
              var3++;
              break L0;
            }
          }
          bj.field_p = new wk[4];
          var10 = 0;
          var3 = var10;
          L5: while (true) {
            if (bj.field_p.length <= var10) {
              td.field_f.a(0, param1 + -18);
              so.field_b.a(5605);
              return;
            } else {
              bj.field_p[var10] = new wk(100, 110);
              bj.field_p[var10].b();
              qn.b();
              td.field_f.a(var10, 0);
              ds.a(10, 50, va.field_G[0], 27066, false, var10, true, va.field_G[3]);
              ds.a(10, 50, va.field_G[0], 27066, false, var10, false, va.field_G[3]);
              vu.a(true, false, 10, 50, var10, 1, 1);
              vu.a(false, false, 10, 50, var10, 1, 1);
              var10++;
              continue L5;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -37) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        if (param0 == 11987) {
          var7 = (CharSequence) (Object) param1;
          var3 = k.a(var7, false);
          var8 = (CharSequence) (Object) param2;
          var4 = k.a(var8, false);
          if (var3 == null) {
            if (var4 != null) {
              if (var3 != null) {
                if (var4 != null) {
                  return var3.equals((Object) (Object) var4);
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (var3 != null) {
              if (var4 == null) {
                return false;
              } else {
                return var3.equals((Object) (Object) var4);
              }
            } else {
              return false;
            }
          }
        } else {
          field_a = null;
          var5 = (CharSequence) (Object) param1;
          var3 = k.a(var5, false);
          var6 = (CharSequence) (Object) param2;
          var4 = k.a(var6, false);
          if (var3 == null) {
            if (var4 != null) {
              if (var3 != null) {
                if (var4 == null) {
                  return false;
                } else {
                  return var3.equals((Object) (Object) var4);
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (var3 != null) {
              if (var4 == null) {
                return false;
              } else {
                return var3.equals((Object) (Object) var4);
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{0, 4, 9, 13, 22, 18, 8, 17};
    }
}
