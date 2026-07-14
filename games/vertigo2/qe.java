/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends pn {
    static int field_Z;
    static String[] field_U;
    private int field_Y;
    private of field_J;
    static String field_X;
    static String field_V;
    private er field_bb;
    static fe field_W;
    static long field_cb;
    private String field_ab;
    static og field_T;

    final String a(boolean param0) {
        if (!param0) {
            return null;
        }
        qe.h(-124);
        return null;
    }

    public static void h(int param0) {
        field_W = null;
        field_U = null;
        field_X = null;
        field_V = null;
        int var1 = 118 / ((11 - param0) / 39);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        String var5 = null;
        ba var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var17 = null;
        Object var18 = null;
        er var19 = null;
        er var20 = null;
        er var21 = null;
        er var22 = null;
        String var23 = null;
        Object var24 = null;
        er var25 = null;
        er var26 = null;
        er var27 = null;
        er var28 = null;
        Object var29 = null;
        er var30 = null;
        er var31 = null;
        er var32 = null;
        er var33 = null;
        qa var34 = null;
        qa var35 = null;
        qa var36 = null;
        var18 = null;
        var24 = null;
        var29 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        var6 = ((qe) this).field_J.a(-23996);
        if (var6 != tk.field_n) {
          if (var6 != dj.field_c) {
            L0: {
              var5 = ((qe) this).field_J.d(-27183);
              if (var5 == null) {
                var5 = ((qe) this).field_ab;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (!var5.equals((Object) (Object) ((qe) this).field_w)) {
                ((qe) this).field_w = var5;
                ((qe) this).e((byte) -118);
                break L1;
              } else {
                break L1;
              }
            }
            super.a(param0, param1, param2, param3);
            var6 = ((qe) this).field_J.a(-23996);
            var36 = (qa) (Object) ((qe) this).field_B;
            var9 = ((qe) this).field_o + param2;
            var10 = var36.a((iq) this, 1, param3) - -(var36.b((iq) this, 110).b((byte) 91) >> 93243041);
            if (tk.field_n == var6) {
              var31 = jn.field_b[0];
              var11 = var31.field_x << -254638207;
              var12 = var31.field_B << -1787520479;
              if (null != ((qe) this).field_bb) {
                if (((qe) this).field_bb.field_y >= var11) {
                  if (var12 > ((qe) this).field_bb.field_t) {
                    ((qe) this).field_bb = new er(var11, var12);
                    lq.a(((qe) this).field_bb, (byte) -94);
                    var31.a(112, 144, var31.field_x << 362082084, var31.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                    ln.d(-28558);
                    ((qe) this).field_bb.d(-(var31.field_x >> 1516382817) + var9, -var31.field_B + var10, 256);
                    return;
                  } else {
                    lq.a(((qe) this).field_bb, (byte) -94);
                    bi.c();
                    var31.a(112, 144, var31.field_x << 362082084, var31.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                    ln.d(-28558);
                    ((qe) this).field_bb.d(-(var31.field_x >> 1516382817) + var9, -var31.field_B + var10, 256);
                    return;
                  }
                } else {
                  ((qe) this).field_bb = new er(var11, var12);
                  lq.a(((qe) this).field_bb, (byte) -94);
                  var31.a(112, 144, var31.field_x << 362082084, var31.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                  ln.d(-28558);
                  ((qe) this).field_bb.d(-(var31.field_x >> 1516382817) + var9, -var31.field_B + var10, 256);
                  return;
                }
              } else {
                ((qe) this).field_bb = new er(var11, var12);
                lq.a(((qe) this).field_bb, (byte) -94);
                var31.a(112, 144, var31.field_x << 362082084, var31.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                ln.d(-28558);
                ((qe) this).field_bb.d(-(var31.field_x >> 1516382817) + var9, -var31.field_B + var10, 256);
                return;
              }
            } else {
              if (dj.field_c != var6) {
                if (ir.field_a != var6) {
                  if (qm.field_G == var6) {
                    var32 = jn.field_b[1];
                    var32.d(var9, var10 - (var32.field_t >> 112509633), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var33 = jn.field_b[2];
                  var33.d(var9, var10 - (var33.field_t >> 597373537), 256);
                  return;
                }
              } else {
                L2: {
                  L3: {
                    var30 = jn.field_b[0];
                    var11 = var30.field_x << -254638207;
                    var12 = var30.field_B << -1787520479;
                    if (null == ((qe) this).field_bb) {
                      break L3;
                    } else {
                      if (((qe) this).field_bb.field_y < var11) {
                        break L3;
                      } else {
                        if (var12 > ((qe) this).field_bb.field_t) {
                          break L3;
                        } else {
                          lq.a(((qe) this).field_bb, (byte) -94);
                          bi.c();
                          break L2;
                        }
                      }
                    }
                  }
                  ((qe) this).field_bb = new er(var11, var12);
                  lq.a(((qe) this).field_bb, (byte) -94);
                  break L2;
                }
                var30.a(112, 144, var30.field_x << 362082084, var30.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                ln.d(-28558);
                ((qe) this).field_bb.d(-(var30.field_x >> 1516382817) + var9, -var30.field_B + var10, 256);
                return;
              }
            }
          } else {
            L4: {
              var23 = lr.field_L;
              if (!var23.equals((Object) (Object) ((qe) this).field_w)) {
                ((qe) this).field_w = var23;
                ((qe) this).e((byte) -118);
                break L4;
              } else {
                break L4;
              }
            }
            super.a(param0, param1, param2, param3);
            var6 = ((qe) this).field_J.a(-23996);
            var35 = (qa) (Object) ((qe) this).field_B;
            var9 = ((qe) this).field_o + param2;
            var10 = var35.a((iq) this, 1, param3) - -(var35.b((iq) this, 110).b((byte) 91) >> 93243041);
            if (tk.field_n == var6) {
              var26 = jn.field_b[0];
              var11 = var26.field_x << -254638207;
              var12 = var26.field_B << -1787520479;
              if (null != ((qe) this).field_bb) {
                if (((qe) this).field_bb.field_y >= var11) {
                  if (var12 <= ((qe) this).field_bb.field_t) {
                    lq.a(((qe) this).field_bb, (byte) -94);
                    bi.c();
                    var26.a(112, 144, var26.field_x << 362082084, var26.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                    ln.d(-28558);
                    ((qe) this).field_bb.d(-(var26.field_x >> 1516382817) + var9, -var26.field_B + var10, 256);
                    return;
                  } else {
                    ((qe) this).field_bb = new er(var11, var12);
                    lq.a(((qe) this).field_bb, (byte) -94);
                    var26.a(112, 144, var26.field_x << 362082084, var26.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                    ln.d(-28558);
                    ((qe) this).field_bb.d(-(var26.field_x >> 1516382817) + var9, -var26.field_B + var10, 256);
                    return;
                  }
                } else {
                  ((qe) this).field_bb = new er(var11, var12);
                  lq.a(((qe) this).field_bb, (byte) -94);
                  var26.a(112, 144, var26.field_x << 362082084, var26.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                  ln.d(-28558);
                  ((qe) this).field_bb.d(-(var26.field_x >> 1516382817) + var9, -var26.field_B + var10, 256);
                  return;
                }
              } else {
                ((qe) this).field_bb = new er(var11, var12);
                lq.a(((qe) this).field_bb, (byte) -94);
                var26.a(112, 144, var26.field_x << 362082084, var26.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                ln.d(-28558);
                ((qe) this).field_bb.d(-(var26.field_x >> 1516382817) + var9, -var26.field_B + var10, 256);
                return;
              }
            } else {
              if (dj.field_c != var6) {
                if (ir.field_a != var6) {
                  if (qm.field_G == var6) {
                    var27 = jn.field_b[1];
                    var27.d(var9, var10 - (var27.field_t >> 112509633), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var28 = jn.field_b[2];
                  var28.d(var9, var10 - (var28.field_t >> 597373537), 256);
                  return;
                }
              } else {
                L5: {
                  L6: {
                    var25 = jn.field_b[0];
                    var11 = var25.field_x << -254638207;
                    var12 = var25.field_B << -1787520479;
                    if (null == ((qe) this).field_bb) {
                      break L6;
                    } else {
                      if (((qe) this).field_bb.field_y < var11) {
                        break L6;
                      } else {
                        if (var12 > ((qe) this).field_bb.field_t) {
                          break L6;
                        } else {
                          lq.a(((qe) this).field_bb, (byte) -94);
                          bi.c();
                          break L5;
                        }
                      }
                    }
                  }
                  ((qe) this).field_bb = new er(var11, var12);
                  lq.a(((qe) this).field_bb, (byte) -94);
                  break L5;
                }
                var25.a(112, 144, var25.field_x << 362082084, var25.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                ln.d(-28558);
                ((qe) this).field_bb.d(-(var25.field_x >> 1516382817) + var9, -var25.field_B + var10, 256);
                return;
              }
            }
          }
        } else {
          L7: {
            var17 = lr.field_L;
            if (!var17.equals((Object) (Object) ((qe) this).field_w)) {
              ((qe) this).field_w = var17;
              ((qe) this).e((byte) -118);
              break L7;
            } else {
              break L7;
            }
          }
          super.a(param0, param1, param2, param3);
          var6 = ((qe) this).field_J.a(-23996);
          var34 = (qa) (Object) ((qe) this).field_B;
          var9 = ((qe) this).field_o + param2;
          var10 = var34.a((iq) this, 1, param3) - -(var34.b((iq) this, 110).b((byte) 91) >> 93243041);
          if (tk.field_n == var6) {
            var20 = jn.field_b[0];
            var11 = var20.field_x << -254638207;
            var12 = var20.field_B << -1787520479;
            if (null != ((qe) this).field_bb) {
              if (((qe) this).field_bb.field_y >= var11) {
                if (var12 <= ((qe) this).field_bb.field_t) {
                  lq.a(((qe) this).field_bb, (byte) -94);
                  bi.c();
                  var20.a(112, 144, var20.field_x << 362082084, var20.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                  ln.d(-28558);
                  ((qe) this).field_bb.d(-(var20.field_x >> 1516382817) + var9, -var20.field_B + var10, 256);
                  return;
                } else {
                  ((qe) this).field_bb = new er(var11, var12);
                  lq.a(((qe) this).field_bb, (byte) -94);
                  var20.a(112, 144, var20.field_x << 362082084, var20.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                  ln.d(-28558);
                  ((qe) this).field_bb.d(-(var20.field_x >> 1516382817) + var9, -var20.field_B + var10, 256);
                  return;
                }
              } else {
                ((qe) this).field_bb = new er(var11, var12);
                lq.a(((qe) this).field_bb, (byte) -94);
                var20.a(112, 144, var20.field_x << 362082084, var20.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
                ln.d(-28558);
                ((qe) this).field_bb.d(-(var20.field_x >> 1516382817) + var9, -var20.field_B + var10, 256);
                return;
              }
            } else {
              ((qe) this).field_bb = new er(var11, var12);
              lq.a(((qe) this).field_bb, (byte) -94);
              var20.a(112, 144, var20.field_x << 362082084, var20.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
              ln.d(-28558);
              ((qe) this).field_bb.d(-(var20.field_x >> 1516382817) + var9, -var20.field_B + var10, 256);
              return;
            }
          } else {
            if (dj.field_c != var6) {
              if (ir.field_a != var6) {
                if (qm.field_G != var6) {
                  return;
                } else {
                  var21 = jn.field_b[1];
                  var21.d(var9, var10 - (var21.field_t >> 112509633), 256);
                  return;
                }
              } else {
                var22 = jn.field_b[2];
                var22.d(var9, var10 - (var22.field_t >> 597373537), 256);
                return;
              }
            } else {
              L8: {
                L9: {
                  var19 = jn.field_b[0];
                  var11 = var19.field_x << -254638207;
                  var12 = var19.field_B << -1787520479;
                  if (null == ((qe) this).field_bb) {
                    break L9;
                  } else {
                    if (((qe) this).field_bb.field_y < var11) {
                      break L9;
                    } else {
                      if (var12 > ((qe) this).field_bb.field_t) {
                        break L9;
                      } else {
                        lq.a(((qe) this).field_bb, (byte) -94);
                        bi.c();
                        break L8;
                      }
                    }
                  }
                }
                ((qe) this).field_bb = new er(var11, var12);
                lq.a(((qe) this).field_bb, (byte) -94);
                break L8;
              }
              var19.a(112, 144, var19.field_x << 362082084, var19.field_B << -298291548, -((qe) this).field_Y << 2054636426, 4096);
              ln.d(-28558);
              ((qe) this).field_bb.d(-(var19.field_x >> 1516382817) + var9, -var19.field_B + var10, 256);
              return;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        ((qe) this).field_Y = ((qe) this).field_Y + 1;
        if (param0 < 6) {
          ((qe) this).field_bb = null;
          super.a((byte) 25, param1, param2, param3);
          return;
        } else {
          super.a((byte) 25, param1, param2, param3);
          return;
        }
    }

    qe(of param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ur) (Object) ni.a(false));
        ((qe) this).field_ab = param1;
        ((qe) this).field_J = param0;
        ((qe) this).a(false, param2, param3, param5, param4);
    }

    final boolean a(byte param0, iq param1) {
        if (param0 != 116) {
            ((qe) this).field_ab = null;
            return false;
        }
        return false;
    }

    final static ch a(String param0, byte param1) {
        if (bf.field_b != um.field_F) {
          if (param1 >= 42) {
            if (oe.field_qb == um.field_F) {
              if (!param0.equals((Object) (Object) uk.field_u)) {
                uk.field_u = param0;
                rf.field_p = null;
                um.field_F = bf.field_b;
                return null;
              } else {
                um.field_F = l.field_a;
                return rf.field_p;
              }
            } else {
              uk.field_u = param0;
              rf.field_p = null;
              um.field_F = bf.field_b;
              return null;
            }
          } else {
            field_Z = 3;
            if (oe.field_qb == um.field_F) {
              if (!param0.equals((Object) (Object) uk.field_u)) {
                uk.field_u = param0;
                rf.field_p = null;
                um.field_F = bf.field_b;
                return null;
              } else {
                um.field_F = l.field_a;
                return rf.field_p;
              }
            } else {
              uk.field_u = param0;
              rf.field_p = null;
              um.field_F = bf.field_b;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "There are no valid types of game that match your preferences.";
        field_T = null;
    }
}
