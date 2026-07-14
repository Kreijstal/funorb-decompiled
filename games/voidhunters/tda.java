/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tda extends iw implements oo {
    static String field_O;
    private htb field_P;
    private shb field_J;
    static String field_M;
    private long field_L;
    private htb field_N;
    static volatile int field_K;

    final void a(int param0, int param1, int param2, shb param3) {
        long var5 = 0L;
        int var7 = 0;
        L0: {
          super.a(param0, param1, param2, param3);
          if (!upb.field_c) {
            break L0;
          } else {
            param3.f((byte) -34);
            break L0;
          }
        }
        var5 = -((tda) this).field_L + wt.a(false);
        var7 = (int)((-var5 + 10999L) / 1000L);
        if ((var7 ^ -1) < -1) {
          ((tda) this).field_J.field_j = "" + var7;
          if (((tda) this).field_z) {
            if (psb.field_b == null) {
              this.l((byte) -98);
              ((tda) this).field_v.a(false, (shb) (Object) new mr(((tda) this).field_v, bca.field_a));
              if (psb.field_b != null) {
                if (!psb.field_b.field_a) {
                  return;
                } else {
                  this.l((byte) -98);
                  ((tda) this).field_v.a(false, (shb) (Object) new mr(((tda) this).field_v, bca.field_a));
                  return;
                }
              } else {
                return;
              }
            } else {
              L1: {
                if (psb.field_b == null) {
                  break L1;
                } else {
                  if (psb.field_b.field_a) {
                    this.l((byte) -98);
                    ((tda) this).field_v.a(false, (shb) (Object) new mr(((tda) this).field_v, bca.field_a));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          } else {
            L2: {
              if (psb.field_b == null) {
                break L2;
              } else {
                if (psb.field_b.field_a) {
                  this.l((byte) -98);
                  ((tda) this).field_v.a(false, (shb) (Object) new mr(((tda) this).field_v, bca.field_a));
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            return;
          }
        } else {
          spb.a((byte) -95);
          this.l((byte) -98);
          ((tda) this).field_v.a(false, (shb) (Object) new mr(((tda) this).field_v, oca.field_a));
          if (((tda) this).field_z) {
            if (psb.field_b == null) {
              this.l((byte) -98);
              ((tda) this).field_v.a(false, (shb) (Object) new mr(((tda) this).field_v, bca.field_a));
              if (psb.field_b != null) {
                if (!psb.field_b.field_a) {
                  return;
                } else {
                  this.l((byte) -98);
                  ((tda) this).field_v.a(false, (shb) (Object) new mr(((tda) this).field_v, bca.field_a));
                  return;
                }
              } else {
                return;
              }
            } else {
              L3: {
                if (psb.field_b == null) {
                  break L3;
                } else {
                  if (psb.field_b.field_a) {
                    this.l((byte) -98);
                    ((tda) this).field_v.a(false, (shb) (Object) new mr(((tda) this).field_v, bca.field_a));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              return;
            }
          } else {
            L4: {
              if (psb.field_b == null) {
                break L4;
              } else {
                if (psb.field_b.field_a) {
                  this.l((byte) -98);
                  ((tda) this).field_v.a(false, (shb) (Object) new mr(((tda) this).field_v, bca.field_a));
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            return;
          }
        }
    }

    tda(ida param0) {
        super(param0, 200, 200);
        ((tda) this).field_L = wt.a(false);
        shb var3 = new shb(al.field_a, (sba) null);
        var3.field_g = 0;
        var3.field_h = ((tda) this).field_h;
        var3.field_r = 50;
        var3.field_f = 100;
        var3.field_q = (wwa) (Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((tda) this).b(-18756, var3);
        ((tda) this).field_J = new shb(al.field_a, (sba) null);
        ((tda) this).field_J.field_r = 20 + var3.field_r - -var3.field_f;
        ((tda) this).field_J.field_g = 0;
        ((tda) this).field_J.field_h = ((tda) this).field_h;
        ((tda) this).field_J.field_f = 80;
        ((tda) this).field_J.field_q = (wwa) (Object) new bob(vob.field_r, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((tda) this).b(-18756, ((tda) this).field_J);
        ((tda) this).field_N = this.a((byte) -104, (sba) this, amb.field_b);
        ((tda) this).field_P = this.a((byte) -73, (sba) this, fja.field_r);
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        if (param0 == 11) {
          if (param3 != ((tda) this).field_N) {
            if (((tda) this).field_P == param3) {
              spb.a((byte) -95);
              this.l((byte) -98);
              return;
            } else {
              return;
            }
          } else {
            this.l((byte) -98);
            return;
          }
        } else {
          field_O = null;
          if (param3 != ((tda) this).field_N) {
            if (((tda) this).field_P != param3) {
              return;
            } else {
              spb.a((byte) -95);
              this.l((byte) -98);
              return;
            }
          } else {
            this.l((byte) -98);
            return;
          }
        }
    }

    private final htb a(byte param0, sba param1, String param2) {
        htb var4 = null;
        int var5 = 0;
        if (param0 > -21) {
          return null;
        } else {
          var4 = new htb(param2, param1);
          var4.field_q = (wwa) (Object) new vva();
          var5 = ((tda) this).field_f + -6;
          ((tda) this).field_f = ((tda) this).field_f + 38;
          var4.a(15, -16 + ((tda) this).field_h - 14, 30, 1, var5);
          ((tda) this).b(-18756, (shb) (Object) var4);
          ((tda) this).a(false);
          return var4;
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param0 == -15834) {
          var5 = param1;
          if ((var5 ^ -1) != -100) {
            if ((var5 ^ -1) == -99) {
              boolean discarded$4 = ((tda) this).field_N.a(param0 ^ -15834, (shb) this);
              return true;
            } else {
              return super.a(param0 ^ 0, param1, param2, param3);
            }
          } else {
            boolean discarded$5 = ((tda) this).field_P.a(param0 + 15834, (shb) this);
            return true;
          }
        } else {
          ((tda) this).field_J = null;
          var5 = param1;
          if ((var5 ^ -1) != -100) {
            if ((var5 ^ -1) == -99) {
              boolean discarded$6 = ((tda) this).field_N.a(param0 ^ -15834, (shb) this);
              return true;
            } else {
              return super.a(param0 ^ 0, param1, param2, param3);
            }
          } else {
            boolean discarded$7 = ((tda) this).field_P.a(param0 + 15834, (shb) this);
            return true;
          }
        }
    }

    public static void g(int param0) {
        field_M = null;
        if (param0 != 29914) {
            field_M = null;
            field_O = null;
            return;
        }
        field_O = null;
    }

    private final void l(byte param0) {
        if (!(((tda) this).field_z)) {
            return;
        }
        if (param0 != -98) {
            return;
        }
        ((tda) this).field_z = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "This game is full.";
        field_M = "Hide lobby chat";
        field_K = 0;
    }
}
