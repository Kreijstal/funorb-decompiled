/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends df {
    private ka field_Z;
    static ka[][] field_cb;
    private String field_W;
    static ka field_Y;
    static am field_V;
    private wd field_bb;
    private int field_X;
    static ka field_ab;

    final static fb a(int param0, lj param1, boolean param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        if (param2) {
          var4 = param1.c(param0, -103);
          var3 = var4;
          if (var4 == null) {
            return null;
          } else {
            return new fb(var4);
          }
        } else {
          field_V = null;
          var4 = param1.c(param0, -103);
          var3 = var4;
          if (var4 == null) {
            return null;
          } else {
            return new fb(var4);
          }
        }
    }

    dh(wd param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (j) (Object) kk.c(false));
        ((dh) this).field_W = param1;
        ((dh) this).field_bb = param0;
        ((dh) this).a((byte) 118, param2, param5, param4, param3);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if (0 != (7 & param1)) {
            var2 = 8 - (param1 & 7);
            break L0;
          } else {
            break L0;
          }
        }
        var3 = var2 + param1;
        if (param0 != 8) {
          return 26;
        } else {
          return var3;
        }
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        ((dh) this).field_X = ((dh) this).field_X + 1;
        if (param2 > -97) {
            return;
        }
        super.a(param0, param1, (byte) -103, param3);
    }

    public static void g(int param0) {
        field_Y = null;
        field_cb = null;
        if (param0 != 112) {
          int discarded$2 = dh.a(-110, -29);
          field_ab = null;
          field_V = null;
          return;
        } else {
          field_ab = null;
          field_V = null;
          return;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        String var5 = null;
        rj var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ka var16 = null;
        String var17 = null;
        Object var18 = null;
        ka var19 = null;
        ka var20 = null;
        ka var21 = null;
        String var23 = null;
        Object var24 = null;
        ka var25 = null;
        ka var27 = null;
        ka var30 = null;
        ka var32 = null;
        Object var37 = null;
        ka var38 = null;
        ka var39 = null;
        ka var40 = null;
        gd var41 = null;
        gd var42 = null;
        gd var43 = null;
        var18 = null;
        var24 = null;
        var37 = null;
        var13 = TorChallenge.field_F ? 1 : 0;
        var6 = ((dh) this).field_bb.b(105);
        if (bl.field_S != var6) {
          if (var6 != jh.field_c) {
            L0: {
              var5 = ((dh) this).field_bb.a((byte) -10);
              if (var5 != null) {
                break L0;
              } else {
                var5 = ((dh) this).field_W;
                break L0;
              }
            }
            L1: {
              if (!var5.equals((Object) (Object) ((dh) this).field_v)) {
                ((dh) this).field_v = var5;
                ((dh) this).d(false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              super.a(param0, param1, param2, param3);
              var6 = ((dh) this).field_bb.b(-74);
              var43 = (gd) (Object) ((dh) this).field_q;
              var9 = ((dh) this).field_m + param1;
              var10 = var43.a((ee) this, 3, param0) + (var43.a(102, (ee) this).a((byte) -63) >> 1843213441);
              if (var6 == bl.field_S) {
                break L2;
              } else {
                if (jh.field_c == var6) {
                  break L2;
                } else {
                  if (lk.field_c != var6) {
                    if (var6 != tf.field_w) {
                      return;
                    } else {
                      var39 = ub.field_f[1];
                      var39.b(var9, var10 + -(var39.field_x >> -1199853439), 256);
                      return;
                    }
                  } else {
                    var38 = ub.field_f[2];
                    var38.b(var9, -(var38.field_x >> 2018012417) + var10, 256);
                    return;
                  }
                }
              }
            }
            var40 = ub.field_f[0];
            var11 = var40.field_q << -1522393343;
            var12 = var40.field_v << 1586846593;
            if (((dh) this).field_Z != null) {
              if (((dh) this).field_Z.field_u >= var11) {
                if (((dh) this).field_Z.field_x >= var12) {
                  ad.a(122, ((dh) this).field_Z);
                  qg.b();
                  var40.b(112, 144, var40.field_q << 1481584004, var40.field_v << -2119609404, -((dh) this).field_X << -246025206, 4096);
                  ie.b((byte) -9);
                  ((dh) this).field_Z.b(-(var40.field_q >> -1191985439) + var9, var10 + -var40.field_v, 256);
                  return;
                } else {
                  ((dh) this).field_Z = new ka(var11, var12);
                  ad.a(-114, ((dh) this).field_Z);
                  var40.b(112, 144, var40.field_q << 1481584004, var40.field_v << -2119609404, -((dh) this).field_X << -246025206, 4096);
                  ie.b((byte) -9);
                  ((dh) this).field_Z.b(-(var40.field_q >> -1191985439) + var9, var10 + -var40.field_v, 256);
                  return;
                }
              } else {
                ((dh) this).field_Z = new ka(var11, var12);
                ad.a(-114, ((dh) this).field_Z);
                var40.b(112, 144, var40.field_q << 1481584004, var40.field_v << -2119609404, -((dh) this).field_X << -246025206, 4096);
                ie.b((byte) -9);
                ((dh) this).field_Z.b(-(var40.field_q >> -1191985439) + var9, var10 + -var40.field_v, 256);
                return;
              }
            } else {
              ((dh) this).field_Z = new ka(var11, var12);
              ad.a(-114, ((dh) this).field_Z);
              var40.b(112, 144, var40.field_q << 1481584004, var40.field_v << -2119609404, -((dh) this).field_X << -246025206, 4096);
              ie.b((byte) -9);
              ((dh) this).field_Z.b(-(var40.field_q >> -1191985439) + var9, var10 + -var40.field_v, 256);
              return;
            }
          } else {
            L3: {
              var23 = hb.field_h;
              if (!var23.equals((Object) (Object) ((dh) this).field_v)) {
                ((dh) this).field_v = var23;
                ((dh) this).d(false);
                break L3;
              } else {
                break L3;
              }
            }
            super.a(param0, param1, param2, param3);
            var6 = ((dh) this).field_bb.b(-74);
            var42 = (gd) (Object) ((dh) this).field_q;
            var9 = ((dh) this).field_m + param1;
            var10 = var42.a((ee) this, 3, param0) + (var42.a(102, (ee) this).a((byte) -63) >> 1843213441);
            if (var6 != bl.field_S) {
              if (jh.field_c == var6) {
                var32 = ub.field_f[0];
                var16 = var32;
                var11 = var32.field_q << -1522393343;
                var12 = var32.field_v << 1586846593;
                if (((dh) this).field_Z != null) {
                  if (((dh) this).field_Z.field_u >= var11) {
                    if (((dh) this).field_Z.field_x >= var12) {
                      ad.a(122, ((dh) this).field_Z);
                      qg.b();
                      var32.b(112, 144, var32.field_q << 1481584004, var32.field_v << -2119609404, -((dh) this).field_X << -246025206, 4096);
                      ie.b((byte) -9);
                      ((dh) this).field_Z.b(-(var32.field_q >> -1191985439) + var9, var10 + -var32.field_v, 256);
                      return;
                    } else {
                      ((dh) this).field_Z = new ka(var11, var12);
                      ad.a(-114, ((dh) this).field_Z);
                      var32.b(112, 144, var32.field_q << 1481584004, var32.field_v << -2119609404, -((dh) this).field_X << -246025206, 4096);
                      ie.b((byte) -9);
                      ((dh) this).field_Z.b(-(var32.field_q >> -1191985439) + var9, var10 + -var32.field_v, 256);
                      return;
                    }
                  } else {
                    ((dh) this).field_Z = new ka(var11, var12);
                    ad.a(-114, ((dh) this).field_Z);
                    var32.b(112, 144, var32.field_q << 1481584004, var32.field_v << -2119609404, -((dh) this).field_X << -246025206, 4096);
                    ie.b((byte) -9);
                    ((dh) this).field_Z.b(-(var32.field_q >> -1191985439) + var9, var10 + -var32.field_v, 256);
                    return;
                  }
                } else {
                  ((dh) this).field_Z = new ka(var11, var12);
                  ad.a(-114, ((dh) this).field_Z);
                  var32.b(112, 144, var32.field_q << 1481584004, var32.field_v << -2119609404, -((dh) this).field_X << -246025206, 4096);
                  ie.b((byte) -9);
                  ((dh) this).field_Z.b(-(var32.field_q >> -1191985439) + var9, var10 + -var32.field_v, 256);
                  return;
                }
              } else {
                if (lk.field_c != var6) {
                  if (var6 != tf.field_w) {
                    return;
                  } else {
                    var30 = ub.field_f[1];
                    var30.b(var9, var10 + -(var30.field_x >> -1199853439), 256);
                    return;
                  }
                } else {
                  var27 = ub.field_f[2];
                  var27.b(var9, -(var27.field_x >> 2018012417) + var10, 256);
                  return;
                }
              }
            } else {
              L4: {
                L5: {
                  var25 = ub.field_f[0];
                  var16 = var25;
                  var11 = var25.field_q << -1522393343;
                  var12 = var25.field_v << 1586846593;
                  if (((dh) this).field_Z == null) {
                    break L5;
                  } else {
                    if (((dh) this).field_Z.field_u < var11) {
                      break L5;
                    } else {
                      if (((dh) this).field_Z.field_x < var12) {
                        break L5;
                      } else {
                        ad.a(122, ((dh) this).field_Z);
                        qg.b();
                        break L4;
                      }
                    }
                  }
                }
                ((dh) this).field_Z = new ka(var11, var12);
                ad.a(-114, ((dh) this).field_Z);
                break L4;
              }
              var25.b(112, 144, var25.field_q << 1481584004, var25.field_v << -2119609404, -((dh) this).field_X << -246025206, 4096);
              ie.b((byte) -9);
              ((dh) this).field_Z.b(-(var25.field_q >> -1191985439) + var9, var10 + -var25.field_v, 256);
              return;
            }
          }
        } else {
          L6: {
            var17 = hb.field_h;
            if (!var17.equals((Object) (Object) ((dh) this).field_v)) {
              ((dh) this).field_v = var17;
              ((dh) this).d(false);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            L8: {
              super.a(param0, param1, param2, param3);
              var6 = ((dh) this).field_bb.b(-74);
              var41 = (gd) (Object) ((dh) this).field_q;
              var9 = ((dh) this).field_m + param1;
              var10 = var41.a((ee) this, 3, param0) + (var41.a(102, (ee) this).a((byte) -63) >> 1843213441);
              if (var6 == bl.field_S) {
                break L8;
              } else {
                if (jh.field_c == var6) {
                  break L8;
                } else {
                  if (lk.field_c != var6) {
                    if (var6 == tf.field_w) {
                      var20 = ub.field_f[1];
                      var20.b(var9, var10 + -(var20.field_x >> -1199853439), 256);
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    var19 = ub.field_f[2];
                    var19.b(var9, -(var19.field_x >> 2018012417) + var10, 256);
                    break L7;
                  }
                }
              }
            }
            L9: {
              L10: {
                var21 = ub.field_f[0];
                var16 = var21;
                var11 = var21.field_q << -1522393343;
                var12 = var21.field_v << 1586846593;
                if (((dh) this).field_Z == null) {
                  break L10;
                } else {
                  if (((dh) this).field_Z.field_u < var11) {
                    break L10;
                  } else {
                    if (((dh) this).field_Z.field_x < var12) {
                      break L10;
                    } else {
                      ad.a(122, ((dh) this).field_Z);
                      qg.b();
                      break L9;
                    }
                  }
                }
              }
              ((dh) this).field_Z = new ka(var11, var12);
              ad.a(-114, ((dh) this).field_Z);
              break L9;
            }
            var21.b(112, 144, var21.field_q << 1481584004, var21.field_v << -2119609404, -((dh) this).field_X << -246025206, 4096);
            ie.b((byte) -9);
            ((dh) this).field_Z.b(-(var21.field_q >> -1191985439) + var9, var10 + -var21.field_v, 256);
            break L7;
          }
          return;
        }
    }

    final boolean a(ee param0, int param1) {
        if (param1 != 0) {
            ((dh) this).field_W = null;
            return false;
        }
        return false;
    }

    final static ae a(int param0, int param1, byte param2, int param3, int param4) {
        ae var5 = null;
        ae var5_ref = null;
        int var6 = 0;
        ae var7 = null;
        ae var8 = null;
        var5 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        if (param2 == -69) {
          var5_ref = (ae) (Object) bk.field_t.c((byte) 121);
          L0: while (true) {
            if (var5_ref != null) {
              if (var5_ref.field_o == param0) {
                return var5_ref;
              } else {
                var5_ref = (ae) (Object) bk.field_t.c(param2 ^ 329);
                continue L0;
              }
            } else {
              var7 = new ae();
              var7.field_r = param1;
              var7.field_q = param3;
              var7.field_o = param0;
              bk.field_t.a((da) (Object) var7, -53);
              bg.a(param4, (byte) 26, var7);
              return var7;
            }
          }
        } else {
          ae discarded$1 = dh.a(-109, -75, (byte) -32, 2, -86);
          var5_ref = (ae) (Object) bk.field_t.c((byte) 121);
          L1: while (true) {
            if (var5_ref != null) {
              if (var5.field_o == param0) {
                return var5;
              } else {
                var5_ref = (ae) (Object) bk.field_t.c(param2 ^ 329);
                continue L1;
              }
            } else {
              var8 = new ae();
              var5 = var8;
              var8.field_r = param1;
              var8.field_q = param3;
              var8.field_o = param0;
              bk.field_t.a((da) (Object) var8, -53);
              bg.a(param4, (byte) 26, var8);
              return var8;
            }
          }
        }
    }

    final String b(boolean param0) {
        if (!param0) {
            return null;
        }
        String discarded$0 = ((dh) this).b(false);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = new am(0);
    }
}
