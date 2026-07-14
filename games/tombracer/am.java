/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends dg {
    private int field_m;
    private bua field_p;
    static int field_n;
    static int field_o;

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        int var8 = 0;
        ka var9 = null;
        ka var10 = null;
        if (null == ((am) this).field_p) {
          return;
        } else {
          L0: {
            var7 = -80 / ((param4 - -38) / 47);
            var9 = ((am) this).field_p.b((byte) 74);
            if (var9 == null) {
              break L0;
            } else {
              var8 = dfa.a(4096 + -((am) this).field_h.g(-25787) >> 860672738, 2048, -40);
              gqa.a(var8, -83584144, param1, param2, var9, param3);
              break L0;
            }
          }
          L1: {
            if (-2 == (((am) this).field_m ^ -1)) {
              var10 = wma.a(49, 12166, 1);
              var8 = dfa.a(4096 - ((am) this).field_h.g(-25787) >> -1302788318, 2048, 86);
              gqa.a(var8, -83584144, param1, param2, var10, param3);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(byte param0, int param1, uw param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qea var10 = null;
        qea var11 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        super.a((byte) 52, param1, param2);
        if (param0 > 50) {
          var11 = ((am) this).a(46).e(true);
          ((am) this).field_g = var11.a(100, 0);
          var5 = 0;
          var7 = ((am) this).field_m;
          if (-2 != (var7 ^ -1)) {
            if (2 != var7) {
              if (0 != var7) {
                if (var7 != 3) {
                  return;
                } else {
                  L0: {
                    var6 = 77;
                    if (33 <= ((am) this).field_g) {
                      break L0;
                    } else {
                      var6 = 77;
                      break L0;
                    }
                  }
                  L1: {
                    if (-67 >= (((am) this).field_g ^ -1)) {
                      var6 = 79;
                      break L1;
                    } else {
                      var6 = 78;
                      break L1;
                    }
                  }
                  ((am) this).field_p = new bua(1, var6);
                  return;
                }
              } else {
                ((am) this).field_p = new bua(1, 47);
                ((am) this).field_p.a(3, true, (byte) -90, 0);
                var5 = var11.a(20, 0);
                ((am) this).field_p.b(125, var5);
                return;
              }
            } else {
              ((am) this).field_p = new bua(1, 50);
              ((am) this).field_p.a(3, true, (byte) 62, 2);
              var5 = var11.a(20, 0);
              ((am) this).field_p.b(-83, var5);
              return;
            }
          } else {
            ((am) this).field_p = new bua(1, 48);
            ((am) this).field_p.a(3, true, (byte) -109, 1);
            var5 = var11.a(20, 0);
            ((am) this).field_p.b(-125, var5);
            return;
          }
        } else {
          field_n = -110;
          var10 = ((am) this).a(46).e(true);
          ((am) this).field_g = var10.a(100, 0);
          var5 = 0;
          var7 = ((am) this).field_m;
          if (-2 != (var7 ^ -1)) {
            if (2 != var7) {
              if (0 != var7) {
                if (var7 != 3) {
                  return;
                } else {
                  L2: {
                    var6 = 77;
                    if (33 <= ((am) this).field_g) {
                      break L2;
                    } else {
                      var6 = 77;
                      break L2;
                    }
                  }
                  L3: {
                    if (-67 >= (((am) this).field_g ^ -1)) {
                      var6 = 79;
                      break L3;
                    } else {
                      var6 = 78;
                      break L3;
                    }
                  }
                  ((am) this).field_p = new bua(1, var6);
                  return;
                }
              } else {
                ((am) this).field_p = new bua(1, 47);
                ((am) this).field_p.a(3, true, (byte) -90, 0);
                var5 = var10.a(20, 0);
                ((am) this).field_p.b(125, var5);
                return;
              }
            } else {
              ((am) this).field_p = new bua(1, 50);
              ((am) this).field_p.a(3, true, (byte) 62, 2);
              var5 = var10.a(20, 0);
              ((am) this).field_p.b(-83, var5);
              return;
            }
          } else {
            ((am) this).field_p = new bua(1, 48);
            ((am) this).field_p.a(3, true, (byte) -109, 1);
            var5 = var10.a(20, 0);
            ((am) this).field_p.b(-125, var5);
            return;
          }
        }
    }

    public final void f(int param0) {
        super.f(param0);
        if (((am) this).field_p != null) {
            ((am) this).field_p.a(0);
        }
    }

    final void b(int param0, byte param1) {
        ((am) this).field_m = param0;
        if (param1 != 77) {
            field_n = -49;
        }
    }

    final void a(int param0, la param1, kh param2) {
        super.a(124, param1, param2);
        if (param0 >= 119) {
          if (-18 >= param1.field_E) {
            return;
          } else {
            ((am) this).field_m = param2.b((byte) 44, 4);
            return;
          }
        } else {
          ((am) this).field_m = 77;
          if (-18 <= param1.field_E) {
            return;
          } else {
            ((am) this).field_m = param2.b((byte) 44, 4);
            return;
          }
        }
    }

    final void a(byte param0, kh param1) {
        int var3 = -114 % ((-8 - param0) / 40);
        super.a((byte) -105, param1);
        param1.a((byte) 30, ((am) this).field_m, 4);
    }

    am(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    am(int param0) {
        super(param0);
    }

    static {
    }
}
