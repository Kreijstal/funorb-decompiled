/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends kna {
    private int field_J;
    static String[] field_L;
    static String field_G;
    static oc[] field_K;
    static int field_I;
    private int field_H;
    static ka[] field_F;

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return false;
    }

    mh(la param0, int param1) {
        super(param0, param1);
    }

    public static void A(int param0) {
        field_F = null;
        field_K = null;
        field_L = null;
        field_G = null;
        int var1 = -58 % ((param0 - -22) / 62);
    }

    final fsa a(boolean param0, int param1, la param2) {
        int var5 = 0;
        int var6_int = 0;
        mfa var6 = null;
        int var7 = 0;
        eq var8 = null;
        ro var9 = null;
        fsa var11 = null;
        eq var12 = null;
        ro var13 = null;
        int var15 = 0;
        int var16 = 0;
        int var19 = 0;
        fsa var20 = null;
        fsa var22 = null;
        ro var23 = null;
        fsa var24 = null;
        ro var25 = null;
        mfa var26 = null;
        Object var27 = null;
        lfa var27_ref = null;
        Object var28 = null;
        lfa var28_ref = null;
        Object var29 = null;
        lfa var29_ref = null;
        fsa var30 = null;
        ro var31 = null;
        fsa var32 = null;
        ro var33 = null;
        mfa var34 = null;
        Object var35 = null;
        lfa var35_ref = null;
        Object var36 = null;
        lfa var36_ref = null;
        Object var37 = null;
        lfa var37_ref = null;
        fsa var38 = null;
        ro var39 = null;
        fsa var40 = null;
        ro var41 = null;
        mfa var42 = null;
        Object var43 = null;
        lfa var43_ref = null;
        Object var44 = null;
        lfa var44_ref = null;
        Object var45 = null;
        lfa var45_ref = null;
        fsa var46 = null;
        ro var47 = null;
        fsa var48 = null;
        ro var49 = null;
        mfa var50 = null;
        Object var51 = null;
        lfa var51_ref = null;
        Object var52 = null;
        lfa var52_ref = null;
        Object var53 = null;
        lfa var53_ref = null;
        fsa var54 = null;
        ro var55 = null;
        fsa var56 = null;
        ro var57 = null;
        mfa var58 = null;
        Object var59 = null;
        lfa var59_ref = null;
        Object var60 = null;
        lfa var60_ref = null;
        Object var61 = null;
        lfa var61_ref = null;
        Object var62 = null;
        Object var63 = null;
        Object var64 = null;
        var27 = null;
        var28 = null;
        var29 = null;
        var35 = null;
        var36 = null;
        var37 = null;
        var43 = null;
        var44 = null;
        var45 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var59 = null;
        var60 = null;
        var61 = null;
        var62 = null;
        var63 = null;
        var64 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        var20 = new fsa(param2, param0);
        var20.b((byte) -11, ((mh) this).field_k, ((mh) this).field_l);
        var6_int = ((mh) this).field_m;
        if ((var6_int ^ -1) != -45) {
          if ((var6_int ^ -1) == -46) {
            L0: {
              var5 = 0;
              var34 = rm.field_a;
              if (var5 != 0) {
                L1: {
                  var30 = new fsa(param2, param0);
                  var30.b((byte) -11, ((mh) this).field_k / 3, ((mh) this).field_l / 2);
                  var30.b(437453352, -327680, -((mh) this).field_l / 4);
                  var30.h(3, 0);
                  var8 = new eq(param2, param0);
                  var30.a((byte) 83, (nv) (Object) var8);
                  var9 = new ro(param2, param0);
                  var9.a(param1 ^ 40, new gea(new int[1][]));
                  var30.a((wda) (Object) var9, 0);
                  var31 = new ro(param2, param0);
                  var31.a(param1 ^ 14, new gea(new int[1][]));
                  var31.a(true, false);
                  var30.a((wda) (Object) var31, 0);
                  var32 = new fsa(param2, param0);
                  var32.b((byte) -11, ((mh) this).field_k / 3, ((mh) this).field_l / 2);
                  var32.b(437453352, -327680, ((mh) this).field_l / 4);
                  var32.h(3, 0);
                  var12 = new eq(param2, param0);
                  var32.a((byte) 83, (nv) (Object) var12);
                  var13 = new ro(param2, param0);
                  var13.a(87, new gea(new int[1][]));
                  var32.a((wda) (Object) var13, param1 ^ 3);
                  var33 = new ro(param2, param0);
                  var33.a(66, new gea(new int[1][]));
                  var33.a(true, false);
                  var32.a((wda) (Object) var33, 0);
                  var20.a(-72, var30);
                  var20.a(-42, var32);
                  if ((((mh) this).field_H ^ -1) == -4) {
                    var15 = 0;
                    break L1;
                  } else {
                    var15 = 3;
                    break L1;
                  }
                }
                L2: {
                  if ((((mh) this).field_H ^ -1) != -4) {
                    var16 = 4;
                    break L2;
                  } else {
                    var16 = 1;
                    break L2;
                  }
                }
                var35_ref = (lfa) (Object) var34.a(6, 87);
                var35_ref.a(var15, true);
                var30.a((gr) null, (byte) 124, (dg) (Object) var35_ref);
                var30.f(param1 + 7, 1048576);
                var36_ref = (lfa) (Object) var34.a(6, 101);
                var36_ref.a(var16, true);
                var32.a((gr) null, (byte) 124, (dg) (Object) var36_ref);
                var32.f(param1 + 7, 1048576);
                break L0;
              } else {
                break L0;
              }
            }
            L3: {
              if (((mh) this).field_H != param1) {
                var7 = 5;
                break L3;
              } else {
                var7 = 2;
                break L3;
              }
            }
            var37_ref = (lfa) (Object) var34.a(6, 126);
            var37_ref.a(var7, true);
            var20.a((gr) null, (byte) 124, (dg) (Object) var37_ref);
            return var20;
          } else {
            if ((var6_int ^ -1) != -21) {
              if (var6_int == 21) {
                L4: {
                  ((mh) this).field_J = 1;
                  var5 = 1;
                  ((mh) this).field_H = 4;
                  var50 = rm.field_a;
                  if (var5 != 0) {
                    L5: {
                      var46 = new fsa(param2, param0);
                      var46.b((byte) -11, ((mh) this).field_k / 3, ((mh) this).field_l / 2);
                      var46.b(437453352, -327680, -((mh) this).field_l / 4);
                      var46.h(3, 0);
                      var8 = new eq(param2, param0);
                      var46.a((byte) 83, (nv) (Object) var8);
                      var9 = new ro(param2, param0);
                      var9.a(param1 ^ 40, new gea(new int[1][]));
                      var46.a((wda) (Object) var9, 0);
                      var47 = new ro(param2, param0);
                      var47.a(param1 ^ 14, new gea(new int[1][]));
                      var47.a(true, false);
                      var46.a((wda) (Object) var47, 0);
                      var48 = new fsa(param2, param0);
                      var48.b((byte) -11, ((mh) this).field_k / 3, ((mh) this).field_l / 2);
                      var48.b(437453352, -327680, ((mh) this).field_l / 4);
                      var48.h(3, 0);
                      var12 = new eq(param2, param0);
                      var48.a((byte) 83, (nv) (Object) var12);
                      var13 = new ro(param2, param0);
                      var13.a(87, new gea(new int[1][]));
                      var48.a((wda) (Object) var13, param1 ^ 3);
                      var49 = new ro(param2, param0);
                      var49.a(66, new gea(new int[1][]));
                      var49.a(true, false);
                      var48.a((wda) (Object) var49, 0);
                      var20.a(-72, var46);
                      var20.a(-42, var48);
                      if ((((mh) this).field_H ^ -1) == -4) {
                        var15 = 0;
                        break L5;
                      } else {
                        var15 = 3;
                        break L5;
                      }
                    }
                    L6: {
                      if ((((mh) this).field_H ^ -1) != -4) {
                        var16 = 4;
                        break L6;
                      } else {
                        var16 = 1;
                        break L6;
                      }
                    }
                    var51_ref = (lfa) (Object) var50.a(6, 87);
                    var51_ref.a(var15, true);
                    var46.a((gr) null, (byte) 124, (dg) (Object) var51_ref);
                    var46.f(param1 + 7, 1048576);
                    var52_ref = (lfa) (Object) var50.a(6, 101);
                    var52_ref.a(var16, true);
                    var48.a((gr) null, (byte) 124, (dg) (Object) var52_ref);
                    var48.f(param1 + 7, 1048576);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (((mh) this).field_H != param1) {
                    var7 = 5;
                    break L7;
                  } else {
                    var7 = 2;
                    break L7;
                  }
                }
                var53_ref = (lfa) (Object) var50.a(6, 126);
                var53_ref.a(var7, true);
                var20.a((gr) null, (byte) 124, (dg) (Object) var53_ref);
                return var20;
              } else {
                L8: {
                  ((mh) this).field_J = 1;
                  var5 = 1;
                  ((mh) this).field_H = 4;
                  var58 = rm.field_a;
                  var6 = var58;
                  if (var5 != 0) {
                    L9: {
                      var54 = new fsa(param2, param0);
                      var54.b((byte) -11, ((mh) this).field_k / 3, ((mh) this).field_l / 2);
                      var54.b(437453352, -327680, -((mh) this).field_l / 4);
                      var54.h(3, 0);
                      var8 = new eq(param2, param0);
                      var54.a((byte) 83, (nv) (Object) var8);
                      var9 = new ro(param2, param0);
                      var9.a(param1 ^ 40, new gea(new int[1][]));
                      var54.a((wda) (Object) var9, 0);
                      var55 = new ro(param2, param0);
                      var55.a(param1 ^ 14, new gea(new int[1][]));
                      var55.a(true, false);
                      var54.a((wda) (Object) var55, 0);
                      var56 = new fsa(param2, param0);
                      var11 = var56;
                      var56.b((byte) -11, ((mh) this).field_k / 3, ((mh) this).field_l / 2);
                      var56.b(437453352, -327680, ((mh) this).field_l / 4);
                      var56.h(3, 0);
                      var12 = new eq(param2, param0);
                      var56.a((byte) 83, (nv) (Object) var12);
                      var13 = new ro(param2, param0);
                      var13.a(87, new gea(new int[1][]));
                      var56.a((wda) (Object) var13, param1 ^ 3);
                      var57 = new ro(param2, param0);
                      var57.a(66, new gea(new int[1][]));
                      var57.a(true, false);
                      var56.a((wda) (Object) var57, 0);
                      var20.a(-72, var54);
                      var20.a(-42, var56);
                      if ((((mh) this).field_H ^ -1) == -4) {
                        var15 = 0;
                        break L9;
                      } else {
                        var15 = 3;
                        break L9;
                      }
                    }
                    L10: {
                      if ((((mh) this).field_H ^ -1) != -4) {
                        var16 = 4;
                        break L10;
                      } else {
                        var16 = 1;
                        break L10;
                      }
                    }
                    var59_ref = (lfa) (Object) var58.a(6, 87);
                    var59_ref.a(var15, true);
                    var54.a((gr) null, (byte) 124, (dg) (Object) var59_ref);
                    var54.f(param1 + 7, 1048576);
                    var60_ref = (lfa) (Object) var58.a(6, 101);
                    var60_ref.a(var16, true);
                    var56.a((gr) null, (byte) 124, (dg) (Object) var60_ref);
                    var56.f(param1 + 7, 1048576);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L11: {
                  if (((mh) this).field_H != param1) {
                    var7 = 5;
                    break L11;
                  } else {
                    var7 = 2;
                    break L11;
                  }
                }
                var61_ref = (lfa) (Object) var58.a(6, 126);
                var61_ref.a(var7, true);
                var20.a((gr) null, (byte) 124, (dg) (Object) var61_ref);
                return var20;
              }
            } else {
              L12: {
                ((mh) this).field_J = 1;
                var5 = 1;
                ((mh) this).field_H = 4;
                var42 = rm.field_a;
                if (var5 != 0) {
                  L13: {
                    var38 = new fsa(param2, param0);
                    var38.b((byte) -11, ((mh) this).field_k / 3, ((mh) this).field_l / 2);
                    var38.b(437453352, -327680, -((mh) this).field_l / 4);
                    var38.h(3, 0);
                    var8 = new eq(param2, param0);
                    var38.a((byte) 83, (nv) (Object) var8);
                    var9 = new ro(param2, param0);
                    var9.a(param1 ^ 40, new gea(new int[1][]));
                    var38.a((wda) (Object) var9, 0);
                    var39 = new ro(param2, param0);
                    var39.a(param1 ^ 14, new gea(new int[1][]));
                    var39.a(true, false);
                    var38.a((wda) (Object) var39, 0);
                    var40 = new fsa(param2, param0);
                    var40.b((byte) -11, ((mh) this).field_k / 3, ((mh) this).field_l / 2);
                    var40.b(437453352, -327680, ((mh) this).field_l / 4);
                    var40.h(3, 0);
                    var12 = new eq(param2, param0);
                    var40.a((byte) 83, (nv) (Object) var12);
                    var13 = new ro(param2, param0);
                    var13.a(87, new gea(new int[1][]));
                    var40.a((wda) (Object) var13, param1 ^ 3);
                    var41 = new ro(param2, param0);
                    var41.a(66, new gea(new int[1][]));
                    var41.a(true, false);
                    var40.a((wda) (Object) var41, 0);
                    var20.a(-72, var38);
                    var20.a(-42, var40);
                    if ((((mh) this).field_H ^ -1) == -4) {
                      var15 = 0;
                      break L13;
                    } else {
                      var15 = 3;
                      break L13;
                    }
                  }
                  L14: {
                    if ((((mh) this).field_H ^ -1) != -4) {
                      var16 = 4;
                      break L14;
                    } else {
                      var16 = 1;
                      break L14;
                    }
                  }
                  var43_ref = (lfa) (Object) var42.a(6, 87);
                  var43_ref.a(var15, true);
                  var38.a((gr) null, (byte) 124, (dg) (Object) var43_ref);
                  var38.f(param1 + 7, 1048576);
                  var44_ref = (lfa) (Object) var42.a(6, 101);
                  var44_ref.a(var16, true);
                  var40.a((gr) null, (byte) 124, (dg) (Object) var44_ref);
                  var40.f(param1 + 7, 1048576);
                  break L12;
                } else {
                  break L12;
                }
              }
              L15: {
                if (((mh) this).field_H != param1) {
                  var7 = 5;
                  break L15;
                } else {
                  var7 = 2;
                  break L15;
                }
              }
              var45_ref = (lfa) (Object) var42.a(6, 126);
              var45_ref.a(var7, true);
              var20.a((gr) null, (byte) 124, (dg) (Object) var45_ref);
              return var20;
            }
          }
        } else {
          L16: {
            var5 = 0;
            var26 = rm.field_a;
            if (var5 != 0) {
              L17: {
                var22 = new fsa(param2, param0);
                var22.b((byte) -11, ((mh) this).field_k / 3, ((mh) this).field_l / 2);
                var22.b(437453352, -327680, -((mh) this).field_l / 4);
                var22.h(3, 0);
                var8 = new eq(param2, param0);
                var22.a((byte) 83, (nv) (Object) var8);
                var9 = new ro(param2, param0);
                var9.a(param1 ^ 40, new gea(new int[1][]));
                var22.a((wda) (Object) var9, 0);
                var23 = new ro(param2, param0);
                var23.a(param1 ^ 14, new gea(new int[1][]));
                var23.a(true, false);
                var22.a((wda) (Object) var23, 0);
                var24 = new fsa(param2, param0);
                var24.b((byte) -11, ((mh) this).field_k / 3, ((mh) this).field_l / 2);
                var24.b(437453352, -327680, ((mh) this).field_l / 4);
                var24.h(3, 0);
                var12 = new eq(param2, param0);
                var24.a((byte) 83, (nv) (Object) var12);
                var13 = new ro(param2, param0);
                var13.a(87, new gea(new int[1][]));
                var24.a((wda) (Object) var13, param1 ^ 3);
                var25 = new ro(param2, param0);
                var25.a(66, new gea(new int[1][]));
                var25.a(true, false);
                var24.a((wda) (Object) var25, 0);
                var20.a(-72, var22);
                var20.a(-42, var24);
                if ((((mh) this).field_H ^ -1) == -4) {
                  var15 = 0;
                  break L17;
                } else {
                  var15 = 3;
                  break L17;
                }
              }
              L18: {
                if ((((mh) this).field_H ^ -1) != -4) {
                  var16 = 4;
                  break L18;
                } else {
                  var16 = 1;
                  break L18;
                }
              }
              var27_ref = (lfa) (Object) var26.a(6, 87);
              var27_ref.a(var15, true);
              var22.a((gr) null, (byte) 124, (dg) (Object) var27_ref);
              var22.f(param1 + 7, 1048576);
              var28_ref = (lfa) (Object) var26.a(6, 101);
              var28_ref.a(var16, true);
              var24.a((gr) null, (byte) 124, (dg) (Object) var28_ref);
              var24.f(param1 + 7, 1048576);
              break L16;
            } else {
              break L16;
            }
          }
          L19: {
            if (((mh) this).field_H != param1) {
              var7 = 5;
              break L19;
            } else {
              var7 = 2;
              break L19;
            }
          }
          var29_ref = (lfa) (Object) var26.a(6, 126);
          var29_ref.a(var7, true);
          var20.a((gr) null, (byte) 124, (dg) (Object) var29_ref);
          return var20;
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        int var2 = 0;
        super.q(param0);
        var2 = ((mh) this).field_m;
        if (20 != var2) {
          if (-45 != (var2 ^ -1)) {
            if (-22 != (var2 ^ -1)) {
              if (45 == var2) {
                ((mh) this).field_H = 4;
                ((mh) this).field_J = 1;
                ((mh) this).b(-67, ((mh) this).field_H * 2097152, 2097152 * ((mh) this).field_J);
                return;
              } else {
                ((mh) this).field_H = 4;
                ((mh) this).field_J = 1;
                ((mh) this).b(-67, ((mh) this).field_H * 2097152, 2097152 * ((mh) this).field_J);
                return;
              }
            } else {
              ((mh) this).field_H = 4;
              ((mh) this).field_J = 1;
              ((mh) this).b(-67, ((mh) this).field_H * 2097152, 2097152 * ((mh) this).field_J);
              return;
            }
          } else {
            ((mh) this).field_J = 1;
            ((mh) this).field_H = 3;
            ((mh) this).b(-67, ((mh) this).field_H * 2097152, 2097152 * ((mh) this).field_J);
            return;
          }
        } else {
          ((mh) this).field_J = 1;
          ((mh) this).field_H = 3;
          ((mh) this).b(-67, ((mh) this).field_H * 2097152, 2097152 * ((mh) this).field_J);
          return;
        }
    }

    mh(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return false;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
            boolean discarded$0 = ((mh) this).v(-73);
            return 7;
        }
        return 7;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final static jea r(byte param0) {
        if (param0 != 107) {
            return null;
        }
        return tn.field_n.field_tb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Game options";
        field_I = 0;
    }
}
