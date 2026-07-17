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
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -73 / ((param2 - 55) / 56);
            int discarded$2 = -8779;
            stackOut_0_0 = im.a(param1, param0, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("pk.O(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_1_0;
    }

    pk(n param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (kh) (Object) ji.a(true));
        try {
            ((pk) this).field_Z = param0;
            ((pk) this).field_L = param1;
            ((pk) this).a(param2, param4, param3, 8192, param5);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "pk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
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
          super.a(param0, param1, (byte) -114, param3);
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
        var10 = var8.a(-18033, param1, (kb) this) + (var8.a(-69, (kb) this).a((byte) 27) >> 1);
        if (var6 == ad.field_K) {
          var18 = db.field_a[0];
          var11 = var18.field_A << 1;
          var12 = var18.field_x << 1;
          if (((pk) this).field_Y != null) {
            if (((pk) this).field_Y.field_y >= var11) {
              if (var12 > ((pk) this).field_Y.field_v) {
                ((pk) this).field_Y = new wk(var11, var12);
                int discarded$8 = 3;
                vn.a(((pk) this).field_Y);
                var18.b(112, 144, var18.field_A << 4, var18.field_x << 4, -((pk) this).field_U << 10, 4096);
                rf.b(-18862);
                ((pk) this).field_Y.f(var9 - (var18.field_A >> 1), -var18.field_x + var10, 256);
                return;
              } else {
                int discarded$9 = 3;
                vn.a(((pk) this).field_Y);
                qn.b();
                var18.b(112, 144, var18.field_A << 4, var18.field_x << 4, -((pk) this).field_U << 10, 4096);
                rf.b(-18862);
                ((pk) this).field_Y.f(var9 - (var18.field_A >> 1), -var18.field_x + var10, 256);
                return;
              }
            } else {
              ((pk) this).field_Y = new wk(var11, var12);
              int discarded$10 = 3;
              vn.a(((pk) this).field_Y);
              var18.b(112, 144, var18.field_A << 4, var18.field_x << 4, -((pk) this).field_U << 10, 4096);
              rf.b(-18862);
              ((pk) this).field_Y.f(var9 - (var18.field_A >> 1), -var18.field_x + var10, 256);
              return;
            }
          } else {
            ((pk) this).field_Y = new wk(var11, var12);
            int discarded$11 = 3;
            vn.a(((pk) this).field_Y);
            var18.b(112, 144, var18.field_A << 4, var18.field_x << 4, -((pk) this).field_U << 10, 4096);
            rf.b(-18862);
            ((pk) this).field_Y.f(var9 - (var18.field_A >> 1), -var18.field_x + var10, 256);
            return;
          }
        } else {
          if (so.field_e != var6) {
            if (var6 != rn.field_e) {
              if (var6 == oo.field_g) {
                var15 = db.field_a[1];
                var15.f(var9, -(var15.field_v >> 1) + var10, 256);
                return;
              } else {
                return;
              }
            } else {
              var16 = db.field_a[2];
              var16.f(var9, -(var16.field_v >> 1) + var10, 256);
              return;
            }
          } else {
            var17 = db.field_a[0];
            var14 = var17;
            var11 = var17.field_A << 1;
            var12 = var17.field_x << 1;
            if (((pk) this).field_Y != null) {
              if (((pk) this).field_Y.field_y >= var11) {
                if (var12 > ((pk) this).field_Y.field_v) {
                  ((pk) this).field_Y = new wk(var11, var12);
                  int discarded$12 = 3;
                  vn.a(((pk) this).field_Y);
                  var17.b(112, 144, var17.field_A << 4, var17.field_x << 4, -((pk) this).field_U << 10, 4096);
                  rf.b(-18862);
                  ((pk) this).field_Y.f(var9 - (var17.field_A >> 1), -var17.field_x + var10, 256);
                  return;
                } else {
                  int discarded$13 = 3;
                  vn.a(((pk) this).field_Y);
                  qn.b();
                  var17.b(112, 144, var17.field_A << 4, var17.field_x << 4, -((pk) this).field_U << 10, 4096);
                  rf.b(-18862);
                  ((pk) this).field_Y.f(var9 - (var17.field_A >> 1), -var17.field_x + var10, 256);
                  return;
                }
              } else {
                ((pk) this).field_Y = new wk(var11, var12);
                int discarded$14 = 3;
                vn.a(((pk) this).field_Y);
                var17.b(112, 144, var17.field_A << 4, var17.field_x << 4, -((pk) this).field_U << 10, 4096);
                rf.b(-18862);
                ((pk) this).field_Y.f(var9 - (var17.field_A >> 1), -var17.field_x + var10, 256);
                return;
              }
            } else {
              ((pk) this).field_Y = new wk(var11, var12);
              int discarded$15 = 3;
              vn.a(((pk) this).field_Y);
              var17.b(112, 144, var17.field_A << 4, var17.field_x << 4, -((pk) this).field_U << 10, 4096);
              rf.b(-18862);
              ((pk) this).field_Y.f(var9 - (var17.field_A >> 1), -var17.field_x + var10, 256);
              return;
            }
          }
        }
    }

    final boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 11) {
                break L1;
              } else {
                pk.a(56, -104, -60, 38, -92, -10, 85, -99);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pk.M(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
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
          if (var8 != 0) {
            if (7 == var8) {
              return;
            } else {
              L1: {
                if (var8 != 9) {
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
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_12_0;
                if (param2 >= ks.field_y - 1) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              var10 = stackIn_15_0;
              if (param1 > 0) {
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
                    L6: {
                      var8 = var8 * 20;
                      if (-1 + ef.field_c <= param1) {
                        break L6;
                      } else {
                        if (var9 == 0) {
                          va.field_z = cq.field_u[ks.field_y + param3];
                          if (var10 != 0) {
                            gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                            break L6;
                          } else {
                            ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                            ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                            ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                            ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                            return;
                          }
                        } else {
                          L7: {
                            oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                            va.field_z = cq.field_u[ks.field_y + param3];
                            if (var10 != 0) {
                              gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        }
                      }
                    }
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                    return;
                  } else {
                    L8: {
                      uf.field_e = cq.field_u[param3 + 1];
                      var8 = var8 * 20;
                      if (-1 + ef.field_c <= param1) {
                        break L8;
                      } else {
                        L9: {
                          if (var9 == 0) {
                            break L9;
                          } else {
                            oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                            break L9;
                          }
                        }
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 != 0) {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                    return;
                  }
                } else {
                  L10: {
                    if (var9 != 0) {
                      cs.field_Y = cq.field_u[-1 + param3];
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (var10 == 0) {
                    L11: {
                      var8 = var8 * 20;
                      if (-1 + ef.field_c <= param1) {
                        break L11;
                      } else {
                        if (var9 == 0) {
                          va.field_z = cq.field_u[ks.field_y + param3];
                          if (var10 != 0) {
                            gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                            break L11;
                          } else {
                            ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                            ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                            ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                            ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                            return;
                          }
                        } else {
                          L12: {
                            oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                            va.field_z = cq.field_u[ks.field_y + param3];
                            if (var10 != 0) {
                              gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        }
                      }
                    }
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                    return;
                  } else {
                    L13: {
                      uf.field_e = cq.field_u[param3 + 1];
                      var8 = var8 * 20;
                      if (-1 + ef.field_c <= param1) {
                        break L13;
                      } else {
                        L14: {
                          if (var9 == 0) {
                            break L14;
                          } else {
                            oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                            break L14;
                          }
                        }
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 != 0) {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                    return;
                  }
                }
              } else {
                L15: {
                  if (var9 != 0) {
                    cs.field_Y = cq.field_u[-1 + param3];
                    break L15;
                  } else {
                    break L15;
                  }
                }
                if (var10 == 0) {
                  L16: {
                    var8 = var8 * 20;
                    if (-1 + ef.field_c <= param1) {
                      break L16;
                    } else {
                      if (var9 == 0) {
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 != 0) {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          break L16;
                        } else {
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        }
                      } else {
                        L17: {
                          oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                          va.field_z = cq.field_u[ks.field_y + param3];
                          if (var10 != 0) {
                            gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                        return;
                      }
                    }
                  }
                  ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                  return;
                } else {
                  L18: {
                    uf.field_e = cq.field_u[param3 + 1];
                    var8 = var8 * 20;
                    if (-1 + ef.field_c <= param1) {
                      break L18;
                    } else {
                      L19: {
                        if (var9 == 0) {
                          break L19;
                        } else {
                          oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                          break L19;
                        }
                      }
                      va.field_z = cq.field_u[ks.field_y + param3];
                      if (var10 != 0) {
                        gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                  }
                  ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + var8].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void c() {
        field_S = null;
        field_W = null;
        field_T = null;
        field_V = null;
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
            ((pk) this).field_U = ((pk) this).field_U + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "pk.P(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
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
