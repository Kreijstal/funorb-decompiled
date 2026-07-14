/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends kna {
    private int field_G;
    static ica field_F;
    static long field_H;

    public static void B(int param0) {
        field_F = null;
        if (param0 != 15) {
            ln.A(112);
        }
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -128, ((ln) this).field_G, 4);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return false;
        }
        return false;
    }

    final static void a(vg param0, vg param1, byte param2) {
        int var3 = 0;
        if (null != param1.field_e) {
          param1.p(63);
          param1.field_e = param0.field_e;
          var3 = -97 % ((-39 - param2) / 63);
          param1.field_a = param0;
          param1.field_e.field_a = param1;
          param1.field_a.field_e = param1;
          return;
        } else {
          param1.field_e = param0.field_e;
          var3 = -97 % ((-39 - param2) / 63);
          param1.field_a = param0;
          param1.field_e.field_a = param1;
          param1.field_a.field_e = param1;
          return;
        }
    }

    final static void A(int param0) {
        ij.j((byte) -116);
        int var1 = -6 / ((-10 - param0) / 45);
    }

    final static mg b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param1 == 23688) {
            break L0;
          } else {
            ln.A(-122);
            break L0;
          }
        }
        var2 = param0;
        if (-1 != (var2 ^ -1)) {
          if (1 != var2) {
            if (var2 != -3) {
              if (3 != var2) {
                if (-5 != var2) {
                  if (var2 != 5) {
                    if (-7 != var2) {
                      if (var2 != 7) {
                        if (-9 != var2) {
                          return new mg(new int[0]);
                        } else {
                          return new mg(new int[12]);
                        }
                      } else {
                        return new mg(new int[12]);
                      }
                    } else {
                      return new mg(new int[6]);
                    }
                  } else {
                    return new mg(new int[6]);
                  }
                } else {
                  return new mg(new int[4]);
                }
              } else {
                return new mg(new int[2]);
              }
            } else {
              return new mg(new int[2]);
            }
          } else {
            return new mg(new int[2]);
          }
        } else {
          return new mg(new int[0]);
        }
    }

    ln(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((ln) this).field_G = param2.b((byte) 44, 4);
    }

    ln(la param0, int param1) {
        super(param0, param1);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return false;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_F = null;
            return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        lpa var5 = null;
        mfa var6 = null;
        ce var7 = null;
        var4 = new fsa(param2, param0);
        var4.b((byte) -11, ((ln) this).field_k, ((ln) this).field_l);
        var5 = new lpa(param2, false);
        var5.b(-5, ((ln) this).field_G);
        var4.a((byte) 83, (nv) (Object) var5);
        var6 = rm.field_a;
        if (param1 != 3) {
          L0: {
            int discarded$1 = ((ln) this).t(49);
            if (60 == ((ln) this).field_m) {
              break L0;
            } else {
              var7 = (ce) (Object) var6.a(17, param1 ^ 93);
              var7.b(2, (byte) 23);
              var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
              break L0;
            }
          }
          return var4;
        } else {
          L1: {
            if (60 == ((ln) this).field_m) {
              break L1;
            } else {
              var7 = (ce) (Object) var6.a(17, param1 ^ 93);
              var7.b(2, (byte) 23);
              var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
              break L1;
            }
          }
          return var4;
        }
    }

    final void q(byte param0) {
        super.q(param0);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
            boolean discarded$0 = ((ln) this).z(45);
            return 3;
        }
        return 3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new ica();
    }
}
