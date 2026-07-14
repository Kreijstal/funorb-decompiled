/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vpa implements ntb {
    static eab field_b;
    private hkb[] field_a;

    final static boolean a(byte param0) {
        if (param0 >= -41) {
            return false;
        }
        if (null == fwa.field_g) {
            return false;
        }
        if (fwa.field_g.field_e == null) {
            return false;
        }
        return true;
    }

    public static void a(boolean param0) {
        if (param0) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static java.applet.Applet b(byte param0) {
        if (!(bkb.field_b == null)) {
            return bkb.field_b;
        }
        if (param0 >= -81) {
            return null;
        }
        return (java.applet.Applet) (Object) tu.field_a;
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        hkb[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        hkb var8 = null;
        int var9 = 0;
        hkb[] var10 = null;
        faa var11 = null;
        hkb[] var12 = null;
        hkb[] var13 = null;
        faa var14 = null;
        hkb[] var15 = null;
        int stackIn_4_0 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_19_0 = 0;
        faa stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        faa stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        faa stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        faa stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        faa stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        faa stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          if (param1 < -109) {
            break L0;
          } else {
            L1: {
              field_b = null;
              var11 = param0;
              var3 = var11;
              var10 = ((vpa) this).field_a;
              var4 = var10;
              if (var4 == null) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = var10.length;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var5 = stackIn_4_0;
            var11.a(-632, var5, 8);
            if (0 != var5) {
              var12 = var10;
              var7 = 0;
              if (var12.length > var7) {
                L2: {
                  var8 = var12[var7];
                  stackOut_8_0 = (faa) var3;
                  stackOut_8_1 = -88;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (var8 == null) {
                    stackOut_10_0 = (faa) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    break L2;
                  } else {
                    stackOut_9_0 = (faa) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    break L2;
                  }
                }
                L3: {
                  if (vq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0)) {
                    stb.a(2, 1, var11, (tv) (Object) var8);
                    break L3;
                  } else {
                    var7++;
                    break L3;
                  }
                }
                var7++;
                var7++;
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
        L4: {
          var14 = param0;
          var3 = var14;
          var13 = ((vpa) this).field_a;
          var4 = var13;
          if (var4 == null) {
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            break L4;
          } else {
            stackOut_17_0 = var13.length;
            stackIn_19_0 = stackOut_17_0;
            break L4;
          }
        }
        var5 = stackIn_19_0;
        var14.a(-632, var5, 8);
        if (0 != var5) {
          var15 = var13;
          var7 = 0;
          L5: while (true) {
            if (var15.length > var7) {
              L6: {
                var8 = var15[var7];
                stackOut_24_0 = (faa) var3;
                stackOut_24_1 = -88;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (var8 == null) {
                  stackOut_26_0 = (faa) (Object) stackIn_26_0;
                  stackOut_26_1 = stackIn_26_1;
                  stackOut_26_2 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L6;
                } else {
                  stackOut_25_0 = (faa) (Object) stackIn_25_0;
                  stackOut_25_1 = stackIn_25_1;
                  stackOut_25_2 = 1;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L6;
                }
              }
              if (vq.a(stackIn_27_0, stackIn_27_1, stackIn_27_2 != 0)) {
                stb.a(2, 1, var14, (tv) (Object) var8);
                var7++;
                var7++;
                continue L5;
              } else {
                var7++;
                var7++;
                continue L5;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final hkb a(int param0, boolean param1) {
        Object var3 = null;
        hkb var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = VoidHunters.field_G;
        if (null != ((vpa) this).field_a) {
          var3 = null;
          var4 = 0;
          if (param1) {
            var6 = null;
            ((vpa) this).a((tv) null, -74);
            L0: while (true) {
              if (((vpa) this).field_a.length > var4) {
                if (param0 == ((vpa) this).field_a[var4].a(0)) {
                  return ((vpa) this).field_a[var4];
                } else {
                  if (((vpa) this).field_a[var4].a(0) == 0) {
                    var3_ref = ((vpa) this).field_a[var4];
                    var4++;
                    continue L0;
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              } else {
                System.err.println("Mission id " + param0 + ", not found, using sandbox");
                return var3_ref;
              }
            }
          } else {
            L1: while (true) {
              if (((vpa) this).field_a.length > var4) {
                if (param0 == ((vpa) this).field_a[var4].a(0)) {
                  return ((vpa) this).field_a[var4];
                } else {
                  if (((vpa) this).field_a[var4].a(0) == 0) {
                    var3_ref = ((vpa) this).field_a[var4];
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              } else {
                System.err.println("Mission id " + param0 + ", not found, using sandbox");
                return (hkb) var3;
              }
            }
          }
        } else {
          return null;
        }
    }

    public final void a(tv param0, int param1) {
        vpa var3 = null;
        int var4 = 0;
        L0: {
          var3 = (vpa) (Object) param0;
          boolean discarded$2 = tja.a((ntb[]) (Object) var3.field_a, 1, (ntb[]) (Object) var3.field_a, false, 5547);
          var4 = 0;
          if (dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, -5)) {
            var4 = 1;
            System.out.println("Mission[] missions has changed. ");
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 > -19) {
          return;
        } else {
          L1: {
            if (var4 != 0) {
              System.out.println("This instance of MissionList has changed");
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        vpa var3 = null;
        var3 = (vpa) (Object) param1;
        if (param0 <= 54) {
          return;
        } else {
          var3.field_a = (hkb[]) (Object) sqb.a((tv[]) (Object) var3.field_a, (tv[]) (Object) var3.field_a, 1, fi.field_p, false);
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        vpa var3 = (vpa) (Object) param1;
        int var4 = -51 / ((22 - param0) / 59);
        return dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) ((vpa) this).field_a, 0);
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        ((vpa) this).field_a = (hkb[]) (Object) kcb.a(8, fi.field_p, param0, 1, -92, (tv[]) (Object) ((vpa) this).field_a);
    }

    static {
    }
}
