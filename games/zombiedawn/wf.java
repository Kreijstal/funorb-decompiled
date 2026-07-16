/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends hm {
    static boolean[] field_P;
    private String field_Q;
    private vn field_O;
    private vc field_R;
    private int field_T;

    final boolean a(byte param0, ga param1) {
        if (param0 <= 67) {
            ((wf) this).field_T = 52;
            return false;
        }
        return false;
    }

    public static void h(int param0) {
        field_P = null;
        if (param0 < 62) {
            wf.h(-102);
        }
    }

    wf(vc param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (io) (Object) tp.c(113));
        ((wf) this).field_Q = param1;
        ((wf) this).field_R = param0;
        ((wf) this).a(-119, param3, param2, param4, param5);
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        int var5 = 101 / ((46 - param1) / 42);
        ((wf) this).field_T = ((wf) this).field_T + 1;
        super.a(param0, (byte) -91, param2, param3);
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        rh var6 = null;
        ak var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vn var14 = null;
        vn var16 = null;
        vn var17 = null;
        vn var18 = null;
        vn var19 = null;
        vn var20 = null;
        vn var21 = null;
        vn var22 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                var13 = ZombieDawn.field_J;
                var6 = ((wf) this).field_R.a((byte) -73);
                if (var6 == se.field_l) {
                  break L3;
                } else {
                  if (var6 == gj.field_v) {
                    break L3;
                  } else {
                    var5 = ((wf) this).field_R.b((byte) 78);
                    if (var5 == null) {
                      var5 = ((wf) this).field_Q;
                      if (var13 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      if (!var5.equals((Object) (Object) ((wf) this).field_o)) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
              var5 = no.field_E;
              break L2;
            }
            if (!var5.equals((Object) (Object) ((wf) this).field_o)) {
              break L1;
            } else {
              break L0;
            }
          }
          ((wf) this).field_o = var5;
          ((wf) this).d((byte) -36);
          break L0;
        }
        super.a(param0, param1, param2, param3);
        var6 = ((wf) this).field_R.a((byte) -120);
        var8 = (ak) (Object) ((wf) this).field_h;
        var9 = ((wf) this).field_k + param2;
        var10 = var8.a((ga) this, param3 + 1, param0) + (var8.a(112, (ga) this).a((byte) 102) >> 600768609);
        if (var6 != se.field_l) {
          if (gj.field_v != var6) {
            if (var6 != uc.field_b) {
              if (mc.field_g == var6) {
                var14 = dj.field_k[1];
                var14.b(var9, -(var14.field_t >> 1758093441) + var10, 256);
                if (var13 != 0) {
                  var21 = dj.field_k[2];
                  var21.b(var9, -(var21.field_t >> 808486785) + var10, 256);
                  if (var13 != 0) {
                    L4: {
                      var22 = dj.field_k[0];
                      var16 = var22;
                      var11 = var22.field_r << -1320692991;
                      var12 = var22.field_q << 1842606081;
                      if (((wf) this).field_O == null) {
                        break L4;
                      } else {
                        if (var11 > ((wf) this).field_O.field_w) {
                          break L4;
                        } else {
                          if (var12 <= ((wf) this).field_O.field_t) {
                            ki.a((byte) -103, ((wf) this).field_O);
                            bi.d();
                            var22.a(112, 144, var22.field_r << 1763612836, var22.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                            pa.a(-21189);
                            ((wf) this).field_O.b(-(var22.field_r >> -1586282143) + var9, var10 - var22.field_q, 256);
                            return;
                          } else {
                            ((wf) this).field_O = new vn(var11, var12);
                            ki.a((byte) -118, ((wf) this).field_O);
                            ki.a((byte) -103, ((wf) this).field_O);
                            bi.d();
                            var22.a(112, 144, var22.field_r << 1763612836, var22.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                            pa.a(-21189);
                            ((wf) this).field_O.b(-(var22.field_r >> -1586282143) + var9, var10 - var22.field_q, 256);
                            return;
                          }
                        }
                      }
                    }
                    ((wf) this).field_O = new vn(var11, var12);
                    ki.a((byte) -118, ((wf) this).field_O);
                    ki.a((byte) -103, ((wf) this).field_O);
                    bi.d();
                    var22.a(112, 144, var22.field_r << 1763612836, var22.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                    pa.a(-21189);
                    ((wf) this).field_O.b(-(var22.field_r >> -1586282143) + var9, var10 - var22.field_q, 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              var19 = dj.field_k[2];
              var19.b(var9, -(var19.field_t >> 808486785) + var10, 256);
              if (var13 != 0) {
                L5: {
                  var20 = dj.field_k[0];
                  var11 = var20.field_r << -1320692991;
                  var12 = var20.field_q << 1842606081;
                  if (((wf) this).field_O == null) {
                    break L5;
                  } else {
                    if (var11 > ((wf) this).field_O.field_w) {
                      break L5;
                    } else {
                      if (var12 > ((wf) this).field_O.field_t) {
                        ((wf) this).field_O = new vn(var11, var12);
                        ki.a((byte) -118, ((wf) this).field_O);
                        if (var13 != 0) {
                          ki.a((byte) -103, ((wf) this).field_O);
                          bi.d();
                          var20.a(112, 144, var20.field_r << 1763612836, var20.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                          pa.a(-21189);
                          ((wf) this).field_O.b(-(var20.field_r >> -1586282143) + var9, var10 - var20.field_q, 256);
                          return;
                        } else {
                          var20.a(112, 144, var20.field_r << 1763612836, var20.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                          pa.a(-21189);
                          ((wf) this).field_O.b(-(var20.field_r >> -1586282143) + var9, var10 - var20.field_q, 256);
                          return;
                        }
                      } else {
                        ki.a((byte) -103, ((wf) this).field_O);
                        bi.d();
                        var20.a(112, 144, var20.field_r << 1763612836, var20.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                        pa.a(-21189);
                        ((wf) this).field_O.b(-(var20.field_r >> -1586282143) + var9, var10 - var20.field_q, 256);
                        return;
                      }
                    }
                  }
                }
                ((wf) this).field_O = new vn(var11, var12);
                ki.a((byte) -118, ((wf) this).field_O);
                if (var13 != 0) {
                  ki.a((byte) -103, ((wf) this).field_O);
                  bi.d();
                  var20.a(112, 144, var20.field_r << 1763612836, var20.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                  pa.a(-21189);
                  ((wf) this).field_O.b(-(var20.field_r >> -1586282143) + var9, var10 - var20.field_q, 256);
                  return;
                } else {
                  var20.a(112, 144, var20.field_r << 1763612836, var20.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                  pa.a(-21189);
                  ((wf) this).field_O.b(-(var20.field_r >> -1586282143) + var9, var10 - var20.field_q, 256);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L6: {
              var18 = dj.field_k[0];
              var16 = var18;
              var11 = var18.field_r << -1320692991;
              var12 = var18.field_q << 1842606081;
              if (((wf) this).field_O == null) {
                break L6;
              } else {
                if (var11 > ((wf) this).field_O.field_w) {
                  break L6;
                } else {
                  if (var12 > ((wf) this).field_O.field_t) {
                    ((wf) this).field_O = new vn(var11, var12);
                    ki.a((byte) -118, ((wf) this).field_O);
                    if (var13 != 0) {
                      ki.a((byte) -103, ((wf) this).field_O);
                      bi.d();
                      var18.a(112, 144, var18.field_r << 1763612836, var18.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                      pa.a(-21189);
                      ((wf) this).field_O.b(-(var18.field_r >> -1586282143) + var9, var10 - var18.field_q, 256);
                      return;
                    } else {
                      var18.a(112, 144, var18.field_r << 1763612836, var18.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                      pa.a(-21189);
                      ((wf) this).field_O.b(-(var18.field_r >> -1586282143) + var9, var10 - var18.field_q, 256);
                      return;
                    }
                  } else {
                    ki.a((byte) -103, ((wf) this).field_O);
                    bi.d();
                    var18.a(112, 144, var18.field_r << 1763612836, var18.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                    pa.a(-21189);
                    ((wf) this).field_O.b(-(var18.field_r >> -1586282143) + var9, var10 - var18.field_q, 256);
                    return;
                  }
                }
              }
            }
            ((wf) this).field_O = new vn(var11, var12);
            ki.a((byte) -118, ((wf) this).field_O);
            if (var13 != 0) {
              ki.a((byte) -103, ((wf) this).field_O);
              bi.d();
              var18.a(112, 144, var18.field_r << 1763612836, var18.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
              pa.a(-21189);
              ((wf) this).field_O.b(-(var18.field_r >> -1586282143) + var9, var10 - var18.field_q, 256);
              return;
            } else {
              var18.a(112, 144, var18.field_r << 1763612836, var18.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
              pa.a(-21189);
              ((wf) this).field_O.b(-(var18.field_r >> -1586282143) + var9, var10 - var18.field_q, 256);
              return;
            }
          }
        } else {
          L7: {
            var17 = dj.field_k[0];
            var11 = var17.field_r << -1320692991;
            var12 = var17.field_q << 1842606081;
            if (((wf) this).field_O == null) {
              break L7;
            } else {
              if (var11 > ((wf) this).field_O.field_w) {
                break L7;
              } else {
                if (var12 > ((wf) this).field_O.field_t) {
                  L8: {
                    ((wf) this).field_O = new vn(var11, var12);
                    ki.a((byte) -118, ((wf) this).field_O);
                    if (var13 == 0) {
                      break L8;
                    } else {
                      ki.a((byte) -103, ((wf) this).field_O);
                      bi.d();
                      break L8;
                    }
                  }
                  var17.a(112, 144, var17.field_r << 1763612836, var17.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                  pa.a(-21189);
                  ((wf) this).field_O.b(-(var17.field_r >> -1586282143) + var9, var10 - var17.field_q, 256);
                  return;
                } else {
                  ki.a((byte) -103, ((wf) this).field_O);
                  bi.d();
                  var17.a(112, 144, var17.field_r << 1763612836, var17.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
                  pa.a(-21189);
                  ((wf) this).field_O.b(-(var17.field_r >> -1586282143) + var9, var10 - var17.field_q, 256);
                  return;
                }
              }
            }
          }
          ((wf) this).field_O = new vn(var11, var12);
          ki.a((byte) -118, ((wf) this).field_O);
          if (var13 != 0) {
            ki.a((byte) -103, ((wf) this).field_O);
            bi.d();
            var17.a(112, 144, var17.field_r << 1763612836, var17.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
            pa.a(-21189);
            ((wf) this).field_O.b(-(var17.field_r >> -1586282143) + var9, var10 - var17.field_q, 256);
            return;
          } else {
            var17.a(112, 144, var17.field_r << 1763612836, var17.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
            pa.a(-21189);
            ((wf) this).field_O.b(-(var17.field_r >> -1586282143) + var9, var10 - var17.field_q, 256);
            return;
          }
        }
    }

    final String d(int param0) {
        int var2 = 44 / ((10 - param0) / 58);
        return null;
    }

    final static Boolean e(byte param0) {
        Boolean var1 = ba.field_g;
        ba.field_g = null;
        if (param0 < 22) {
            field_P = null;
            return var1;
        }
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new boolean[32];
    }
}
