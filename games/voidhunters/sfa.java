/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sfa {
    private int field_e;
    static llb field_d;
    private tj field_a;
    private ml field_c;
    private int field_b;

    final void b(byte param0) {
        int var2 = 51 / ((64 - param0) / 50);
        ((sfa) this).field_c = null;
        ((sfa) this).field_a = null;
    }

    final boolean a(byte param0) {
        int var2 = 113 % ((56 - param0) / 32);
        return null != ((sfa) this).field_c ? true : false;
    }

    final void a(int param0, ml param1, tj param2, byte param3, int param4) {
        ((sfa) this).field_e = param4;
        ((sfa) this).field_b = param0;
        ((sfa) this).field_c = param1;
        if (param3 != 61) {
            Object var7 = null;
            ((sfa) this).a((pe) null, -17, (anb) null, false);
        }
        ((sfa) this).field_a = param2;
    }

    public static void a(boolean param0) {
        if (param0) {
            field_d = null;
        }
        field_d = null;
    }

    public sfa() {
        ((sfa) this).b((byte) 118);
    }

    final void a(pe param0, int param1, anb param2, boolean param3) {
        int var5 = 0;
        int var6_int = 0;
        wfb var6 = null;
        int var7 = 0;
        int var8 = 0;
        wfb var9 = null;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var10 = VoidHunters.field_G;
          if (-2 != (((sfa) this).field_a.g((byte) -104) ^ -1)) {
            if (3 != ((sfa) this).field_a.g((byte) -104)) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_6_0;
          if (-4 != (((sfa) this).field_a.g((byte) -104) ^ -1)) {
            break L1;
          } else {
            ((sfa) this).field_a.a(((sfa) this).field_b, ((sfa) this).field_e, 127);
            break L1;
          }
        }
        L2: {
          if (2 == ((sfa) this).field_a.g((byte) -104)) {
            L3: {
              if (!(param2 instanceof sg)) {
                break L3;
              } else {
                if (((sg) (Object) param2).o((byte) -117) != ((sfa) this).field_a.b(false)) {
                  break L3;
                } else {
                  if (((sg) (Object) param2).q((byte) 115) == ((sfa) this).field_a.e(param1 + 513)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var6_int = laa.field_o;
            param2.a(((sfa) this).field_a.field_h * var6_int, ((sfa) this).field_e, ((sfa) this).field_b, (byte) -119, var6_int * ((sfa) this).field_a.field_f);
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          if (((sfa) this).field_a.g((byte) -104) != 5) {
            break L4;
          } else {
            var6_int = db.field_q;
            param2.a(((sfa) this).field_a.field_h * var6_int, ((sfa) this).field_e, ((sfa) this).field_b, (byte) -116, ((sfa) this).field_a.field_f * var6_int);
            break L4;
          }
        }
        L5: {
          if (-7 == (((sfa) this).field_a.g((byte) -104) ^ -1)) {
            L6: {
              L7: {
                if (param3) {
                  break L7;
                } else {
                  if ((cva.field_o ^ -1) != -2) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              param0.a(0, gib.field_a, ((sfa) this).field_a.e(512), ((sfa) this).field_a.b(false), false, ((sfa) this).field_e, ((sfa) this).field_b);
              break L6;
            }
            param3 = false;
            break L5;
          } else {
            break L5;
          }
        }
        L8: {
          if (!param3) {
            break L8;
          } else {
            L9: {
              var6 = ((sfa) this).field_c.i((byte) -112);
              if (((sfa) this).field_a.g((byte) -104) != 3) {
                if ((((sfa) this).field_a.g((byte) -104) ^ -1) == -2) {
                  rmb.a(((sfa) this).field_b, param2.c(false), 40, 106, ((sfa) this).field_e);
                  break L9;
                } else {
                  if (!var6.field_r) {
                    if (var6.field_B == 0) {
                      qba.a(20382, ((sfa) this).field_e, 60, ((sfa) this).field_b, 1);
                      break L9;
                    } else {
                      qba.a(20382, ((sfa) this).field_e, 56, ((sfa) this).field_b, 1);
                      break L9;
                    }
                  } else {
                    qba.a(20382, ((sfa) this).field_e, 77, ((sfa) this).field_b, 1);
                    break L9;
                  }
                }
              } else {
                rmb.a(((sfa) this).field_b, param2.c(false), 70, -48, ((sfa) this).field_e);
                break L9;
              }
            }
            L10: {
              var7 = 5;
              var8 = ((sfa) this).field_a.g((byte) -104);
              if (-2 != (var8 ^ -1)) {
                if (var8 == 0) {
                  var7 = ehb.field_e;
                  break L10;
                } else {
                  if ((var8 ^ -1) != -3) {
                    if ((var8 ^ -1) != -4) {
                      if ((var8 ^ -1) != -5) {
                        if (5 != var8) {
                          break L10;
                        } else {
                          var7 = fmb.field_r;
                          break L10;
                        }
                      } else {
                        var7 = gaa.field_p;
                        break L10;
                      }
                    } else {
                      var7 = pea.field_b;
                      break L10;
                    }
                  } else {
                    var7 = km.field_o;
                    break L10;
                  }
                }
              } else {
                var7 = mc.field_u;
                break L10;
              }
            }
            L11: {
              var8 = ((sfa) this).field_c.a(((sfa) this).field_a.c((byte) 68), (byte) 40);
              if (-1 > (var8 ^ -1)) {
                var5 = 0;
                ((sfa) this).field_a.b(var8, 110);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              param0.a(sva.field_m, ((sfa) this).field_b, ((sfa) this).field_e, ei.field_a, 11184895, var7, dw.field_b);
              var9 = var6;
              if (!((sfa) this).field_c.k((byte) 99)) {
                break L12;
              } else {
                if (-1 > (var9.field_y ^ -1)) {
                  param2.field_k.a(true, ((sfa) this).field_c, param0, 60, param2);
                  param2.field_k.a((byte) 102, param2);
                  param0.a(1, var9.field_y, ((sfa) this).field_a.e(param1 ^ -513), ((sfa) this).field_a.b(false), false, ((sfa) this).field_c.b(true), ((sfa) this).field_c.a((byte) 74));
                  break L8;
                } else {
                  break L12;
                }
              }
            }
            if ((bka.field_p ^ -1) != -2) {
              break L8;
            } else {
              if (!((sfa) this).field_c.k((byte) 71)) {
                break L8;
              } else {
                if (((sfa) this).field_c != param2.field_k) {
                  int discarded$1 = ((sfa) this).field_c.a(true, false, var9.field_p);
                  param2.field_k.a(true, ((sfa) this).field_c, param0, param1 ^ -39, param2);
                  param2.field_k.a((byte) 97, param2);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
          }
        }
        L13: {
          if (var5 != 0) {
            ((sfa) this).field_a.b(-3846);
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          if (param1 == -1) {
            break L14;
          } else {
            ((sfa) this).field_a = null;
            break L14;
          }
        }
    }

    static {
    }
}
