/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends cda {
    private int field_w;

    final void d(int param0) {
        if (param0 != -1) {
            ((nq) this).field_w = 86;
        }
    }

    nq(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, la param1, kh param2) {
        super.a(124, param1, param2);
        ((nq) this).field_w = param2.b((byte) 44, 4);
        if (param0 < 119) {
            Object var5 = null;
            ((nq) this).a((byte) -7, (kh) null);
        }
    }

    final void a(byte param0, kh param1) {
        super.a((byte) 44, param1);
        int var3 = 113 / ((param0 - -8) / 40);
        param1.a((byte) -44, ((nq) this).field_w, 4);
    }

    final int k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -99) {
          var2 = ((nq) this).field_w;
          if (var2 != 2) {
            if (3 != var2) {
              if (var2 != 0) {
                if (var2 != 1) {
                  if (var2 == 4) {
                    return 6;
                  } else {
                    return -1;
                  }
                } else {
                  return 6;
                }
              } else {
                return 7;
              }
            } else {
              return 7;
            }
          } else {
            return 7;
          }
        } else {
          ((nq) this).field_w = 111;
          var2 = ((nq) this).field_w;
          if (var2 != 2) {
            if (3 != var2) {
              if (var2 != 0) {
                if (var2 != 1) {
                  if (var2 == 4) {
                    return 6;
                  } else {
                    return -1;
                  }
                } else {
                  return 6;
                }
              } else {
                return 7;
              }
            } else {
              return 7;
            }
          } else {
            return 7;
          }
        }
    }

    final void b(int param0, int param1) {
        ((nq) this).field_w = param1;
        if (param0 != 8022) {
            ((nq) this).field_w = 97;
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        super.a(param0, param1, param2);
    }

    nq(int param0) {
        super(param0);
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        ka var6 = null;
        ka var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ka var10 = null;
        ka var11 = null;
        ka var11_ref = null;
        ka var12 = null;
        ka var12_ref = null;
        ka var13 = null;
        ka var13_ref = null;
        var9 = TombRacer.field_G ? 1 : 0;
        var6 = null;
        var7 = dfa.a(4096 + -((nq) this).field_h.g(-25787) >> 802944994, 2048, 91);
        var8 = ((nq) this).field_w;
        if (var8 == 0) {
          var10 = df.field_J[0];
          var11 = var10;
          var12 = var11;
          var13 = var12;
          var6 = var13;
          var11 = var10;
          var8 = 6 / ((param4 - -38) / 47);
          if (var10 == null) {
            return;
          } else {
            gqa.a(var7, -83584144, param1, param2, var10, param3);
            return;
          }
        } else {
          if ((var8 ^ -1) != -2) {
            if (var8 != 4) {
              if (var8 == 2) {
                var13_ref = df.field_J[2];
                var6 = var13_ref;
                var6 = var13_ref;
                var8 = 6 / ((param4 - -38) / 47);
                if (var13_ref == null) {
                  return;
                } else {
                  gqa.a(var7, -83584144, param1, param2, var13_ref, param3);
                  return;
                }
              } else {
                L0: {
                  if (var8 != 3) {
                    break L0;
                  } else {
                    param3 = param3 + 2097152;
                    var6_ref = df.field_J[3];
                    break L0;
                  }
                }
                var8 = 6 / ((param4 - -38) / 47);
                if (var6_ref == null) {
                  return;
                } else {
                  gqa.a(var7, -83584144, param1, param2, var6_ref, param3);
                  return;
                }
              }
            } else {
              var12_ref = df.field_J[109];
              var13 = var12_ref;
              var6 = var13;
              var13 = var12_ref;
              var8 = 6 / ((param4 - -38) / 47);
              if (var12_ref == null) {
                return;
              } else {
                gqa.a(var7, -83584144, param1, param2, var12_ref, param3);
                return;
              }
            }
          } else {
            var11_ref = df.field_J[1];
            var12 = var11_ref;
            var13 = var12;
            var6 = var13;
            var12 = var11_ref;
            var8 = 6 / ((param4 - -38) / 47);
            if (var11_ref == null) {
              return;
            } else {
              gqa.a(var7, -83584144, param1, param2, var11_ref, param3);
              return;
            }
          }
        }
    }

    static {
    }
}
