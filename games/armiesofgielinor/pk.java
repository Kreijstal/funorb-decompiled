/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends hv {
    private n field_Z;
    private wk field_Y;
    private int field_U;
    static String field_S;
    static int field_X;
    static String field_W;
    static int[][] field_T;
    static String field_V;
    private String field_L;

    final String h(int param0) {
        if (param0 == 21384) {
            return null;
        }
        ((pk) this).field_U = -103;
        return null;
    }

    final static int a(byte[] param0, int param1, int param2) {
        int var3 = -73 / ((param2 - 55) / 56);
        return im.a(param1, param0, 0, -8779);
    }

    pk(n param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (kh) (Object) ji.a(true));
        ((pk) this).field_Z = param0;
        ((pk) this).field_L = param1;
        ((pk) this).a(param2, param4, param3, 8192, param5);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        gu var6 = null;
        pm var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wk var14 = null;
        wk var15 = null;
        wk var16 = null;
        wk var17 = null;
        wk var18 = null;
        L0: {
          L1: {
            var13 = ArmiesOfGielinor.field_M ? 1 : 0;
            var6 = ((pk) this).field_Z.a(false);
            if (ad.field_K == var6) {
              break L1;
            } else {
              if (var6 == so.field_e) {
                break L1;
              } else {
                var5 = ((pk) this).field_Z.a((byte) 55);
                if (var5 == null) {
                  var5 = ((pk) this).field_L;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = gt.field_h;
          break L0;
        }
        L2: {
          if (var5.equals((Object) (Object) ((pk) this).field_v)) {
            break L2;
          } else {
            ((pk) this).field_v = var5;
            ((pk) this).a(-128);
            break L2;
          }
        }
        L3: {
          this.a(param0, param1, (byte) -114, param3);
          if (param2 <= -82) {
            break L3;
          } else {
            field_W = null;
            break L3;
          }
        }
        var6 = ((pk) this).field_Z.a(false);
        var8 = (pm) (Object) ((pk) this).field_k;
        var9 = param0 + ((pk) this).field_B;
        var10 = var8.a(-18033, param1, (kb) this) + (var8.a(-69, (kb) this).a((byte) 27) >> -854092863);
        if (var6 == ad.field_K) {
          var18 = db.field_a[0];
          var11 = var18.field_A << 633676609;
          var12 = var18.field_x << 1007017217;
          if (((pk) this).field_Y != null) {
            if (((pk) this).field_Y.field_y >= var11) {
              if (var12 > ((pk) this).field_Y.field_v) {
                ((pk) this).field_Y = new wk(var11, var12);
                vn.a(((pk) this).field_Y, 3);
                var18.b(112, 144, var18.field_A << -1976760156, var18.field_x << -609333596, -((pk) this).field_U << 606184554, 4096);
                rf.b(-18862);
                ((pk) this).field_Y.f(var9 - (var18.field_A >> -207799071), -var18.field_x + var10, 256);
                return;
              } else {
                vn.a(((pk) this).field_Y, 3);
                qn.b();
                var18.b(112, 144, var18.field_A << -1976760156, var18.field_x << -609333596, -((pk) this).field_U << 606184554, 4096);
                rf.b(-18862);
                ((pk) this).field_Y.f(var9 - (var18.field_A >> -207799071), -var18.field_x + var10, 256);
                return;
              }
            } else {
              ((pk) this).field_Y = new wk(var11, var12);
              vn.a(((pk) this).field_Y, 3);
              var18.b(112, 144, var18.field_A << -1976760156, var18.field_x << -609333596, -((pk) this).field_U << 606184554, 4096);
              rf.b(-18862);
              ((pk) this).field_Y.f(var9 - (var18.field_A >> -207799071), -var18.field_x + var10, 256);
              return;
            }
          } else {
            ((pk) this).field_Y = new wk(var11, var12);
            vn.a(((pk) this).field_Y, 3);
            var18.b(112, 144, var18.field_A << -1976760156, var18.field_x << -609333596, -((pk) this).field_U << 606184554, 4096);
            rf.b(-18862);
            ((pk) this).field_Y.f(var9 - (var18.field_A >> -207799071), -var18.field_x + var10, 256);
            return;
          }
        } else {
          if (so.field_e != var6) {
            if (var6 != rn.field_e) {
              if (var6 == oo.field_g) {
                var15 = db.field_a[1];
                var15.f(var9, -(var15.field_v >> -1562877407) + var10, 256);
                return;
              } else {
                return;
              }
            } else {
              var16 = db.field_a[2];
              var16.f(var9, -(var16.field_v >> -1937125855) + var10, 256);
              return;
            }
          } else {
            var17 = db.field_a[0];
            var14 = var17;
            var11 = var17.field_A << 633676609;
            var12 = var17.field_x << 1007017217;
            if (((pk) this).field_Y != null) {
              if (((pk) this).field_Y.field_y >= var11) {
                if (var12 > ((pk) this).field_Y.field_v) {
                  ((pk) this).field_Y = new wk(var11, var12);
                  vn.a(((pk) this).field_Y, 3);
                  var17.b(112, 144, var17.field_A << -1976760156, var17.field_x << -609333596, -((pk) this).field_U << 606184554, 4096);
                  rf.b(-18862);
                  ((pk) this).field_Y.f(var9 - (var17.field_A >> -207799071), -var17.field_x + var10, 256);
                  return;
                } else {
                  vn.a(((pk) this).field_Y, 3);
                  qn.b();
                  var17.b(112, 144, var17.field_A << -1976760156, var17.field_x << -609333596, -((pk) this).field_U << 606184554, 4096);
                  rf.b(-18862);
                  ((pk) this).field_Y.f(var9 - (var17.field_A >> -207799071), -var17.field_x + var10, 256);
                  return;
                }
              } else {
                ((pk) this).field_Y = new wk(var11, var12);
                vn.a(((pk) this).field_Y, 3);
                var17.b(112, 144, var17.field_A << -1976760156, var17.field_x << -609333596, -((pk) this).field_U << 606184554, 4096);
                rf.b(-18862);
                ((pk) this).field_Y.f(var9 - (var17.field_A >> -207799071), -var17.field_x + var10, 256);
                return;
              }
            } else {
              ((pk) this).field_Y = new wk(var11, var12);
              vn.a(((pk) this).field_Y, 3);
              var17.b(112, 144, var17.field_A << -1976760156, var17.field_x << -609333596, -((pk) this).field_U << 606184554, 4096);
              rf.b(-18862);
              ((pk) this).field_Y.f(var9 - (var17.field_A >> -207799071), -var17.field_x + var10, 256);
              return;
            }
          }
        }
    }

    final boolean a(int param0, kb param1) {
        if (param0 != 11) {
            pk.a(56, -104, -60, 38, -92, -10, 85, -99);
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var8 = cq.field_u[param3];
          if (11 != var8) {
            break L0;
          } else {
            var8 = 7;
            break L0;
          }
        }
        if (param5 == -29403) {
          if (var8 != -1) {
            if (7 != var8) {
              L1: {
                if (-10 != var8) {
                  break L1;
                } else {
                  var8 = 2;
                  break L1;
                }
              }
              L2: {
                j.field_b = var8;
                uf.field_e = var8;
                rq.field_m = var8;
                np.field_Wb = var8;
                oh.field_E = var8;
                pv.field_b = var8;
                cs.field_Y = var8;
                gt.field_i = var8;
                va.field_z = var8;
                if (0 >= param2) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_13_0;
                if (param2 >= ks.field_y - 1) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              var10 = stackIn_16_0;
              if ((param1 ^ -1) < -1) {
                L4: {
                  if (var9 != 0) {
                    np.field_Wb = cq.field_u[param3 + (-ks.field_y + -1)];
                    break L4;
                  } else {
                    break L4;
                  }
                }
                pv.field_b = cq.field_u[-ks.field_y + param3];
                if (var10 != 0) {
                  L5: {
                    rq.field_m = cq.field_u[-ks.field_y + (param3 + 1)];
                    if (var9 != 0) {
                      cs.field_Y = cq.field_u[-1 + param3];
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var10 == 0) {
                    var8 = var8 * 20;
                    if (-1 + ef.field_c > param1) {
                      if (var9 == 0) {
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 == 0) {
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        } else {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        }
                      } else {
                        L6: {
                          oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                          va.field_z = cq.field_u[ks.field_y + param3];
                          if (var10 != 0) {
                            gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                        return;
                      }
                    } else {
                      ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                      return;
                    }
                  } else {
                    L7: {
                      uf.field_e = cq.field_u[param3 + 1];
                      var8 = var8 * 20;
                      if (-1 + ef.field_c <= param1) {
                        break L7;
                      } else {
                        L8: {
                          if (var9 == 0) {
                            break L8;
                          } else {
                            oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                            break L8;
                          }
                        }
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 != 0) {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                    return;
                  }
                } else {
                  L9: {
                    if (var9 != 0) {
                      cs.field_Y = cq.field_u[-1 + param3];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  if (var10 == 0) {
                    var8 = var8 * 20;
                    if (-1 + ef.field_c > param1) {
                      if (var9 == 0) {
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 == 0) {
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        } else {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        }
                      } else {
                        oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                        va.field_z = cq.field_u[ks.field_y + param3];
                        ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                        return;
                      }
                    } else {
                      ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                      return;
                    }
                  } else {
                    L10: {
                      uf.field_e = cq.field_u[param3 + 1];
                      var8 = var8 * 20;
                      if (-1 + ef.field_c <= param1) {
                        break L10;
                      } else {
                        L11: {
                          if (var9 == 0) {
                            break L11;
                          } else {
                            oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                            break L11;
                          }
                        }
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 != 0) {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                    return;
                  }
                }
              } else {
                L12: {
                  if (var9 != 0) {
                    cs.field_Y = cq.field_u[-1 + param3];
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if (var10 == 0) {
                  var8 = var8 * 20;
                  if (-1 + ef.field_c > param1) {
                    if (var9 == 0) {
                      va.field_z = cq.field_u[ks.field_y + param3];
                      if (var10 == 0) {
                        ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                        return;
                      } else {
                        gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                        ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                        return;
                      }
                    } else {
                      L13: {
                        oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 != 0) {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                      return;
                    }
                  } else {
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                    return;
                  }
                } else {
                  L14: {
                    uf.field_e = cq.field_u[param3 + 1];
                    var8 = var8 * 20;
                    if (-1 + ef.field_c <= param1) {
                      break L14;
                    } else {
                      L15: {
                        if (var9 == 0) {
                          break L15;
                        } else {
                          oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                          break L15;
                        }
                      }
                      va.field_z = cq.field_u[ks.field_y + param3];
                      if (var10 != 0) {
                        gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        field_S = null;
        field_W = null;
        field_T = null;
        if (param0) {
            field_W = null;
            field_V = null;
            return;
        }
        field_V = null;
    }

    final void a(int param0, int param1, int param2, kb param3) {
        ((pk) this).field_U = ((pk) this).field_U + 1;
        this.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
        field_S = "Only show lobby chat from my friends";
        field_W = "Invite <%0> to this game";
        field_V = "You are not currently logged in to the game.";
        field_X = 0;
    }
}
