/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends ja {
    private int field_T;
    static String[] field_R;
    private dd field_Q;
    private jb field_S;
    private String field_V;
    static byte[][] field_U;

    final String g(int param0) {
        if (param0 == 4) {
            return null;
        }
        ((v) this).field_Q = null;
        return null;
    }

    v(jb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ch) (Object) wi.a(17641));
        ((v) this).field_V = param1;
        ((v) this).field_S = param0;
        ((v) this).a(param2, param4, param3, param5, 80);
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        ((v) this).field_T = ((v) this).field_T + 1;
        super.a(param0, param1, param2, (byte) -112);
        if (param3 >= -85) {
            ((v) this).field_S = null;
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        String var5 = null;
        wd var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dd var16 = null;
        String var17 = null;
        Object var18 = null;
        dd var19 = null;
        dd var20 = null;
        dd var21 = null;
        Object var22 = null;
        dd var23 = null;
        dd var24 = null;
        dd var25 = null;
        Object var26 = null;
        dd var27 = null;
        dd var28 = null;
        dd var29 = null;
        dd var30 = null;
        Object var36 = null;
        dd var37 = null;
        dd var38 = null;
        dd var39 = null;
        eg var40 = null;
        eg var41 = null;
        eg var42 = null;
        eg var43 = null;
        var18 = null;
        var22 = null;
        var26 = null;
        var36 = null;
        var13 = fleas.field_A ? 1 : 0;
        var6 = ((v) this).field_S.a(false);
        if (ea.field_b != var6) {
          L0: {
            if (var6 != w.field_e) {
              var5 = ((v) this).field_S.b(-19);
              if (var5 == null) {
                var5 = ((v) this).field_V;
                break L0;
              } else {
                break L0;
              }
            } else {
              var5 = bg.field_b;
              break L0;
            }
          }
          if (var5.equals((Object) (Object) ((v) this).field_i)) {
            L1: {
              super.b(param0, param1, true, param3);
              var6 = ((v) this).field_S.a(false);
              var43 = (eg) (Object) ((v) this).field_p;
              var9 = param1 + ((v) this).field_y;
              var10 = var43.a(param0, (qa) this, (byte) -59) - -(var43.a((qa) this, (byte) -35).a(param2) >> 1449838945);
              if (ea.field_b == var6) {
                break L1;
              } else {
                if (var6 == w.field_e) {
                  break L1;
                } else {
                  if (var6 != ml.field_K) {
                    if (hm.field_b == var6) {
                      var38 = t.field_h[1];
                      var38.a(var9, -(var38.field_t >> -579947871) + var10, 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var37 = t.field_h[2];
                    var37.a(var9, var10 - (var37.field_t >> -707282303), 256);
                    return;
                  }
                }
              }
            }
            var39 = t.field_h[0];
            var11 = var39.field_x << -1465467423;
            var12 = var39.field_r << 1907293153;
            if (((v) this).field_Q != null) {
              if (var11 <= ((v) this).field_Q.field_w) {
                if (((v) this).field_Q.field_t < var12) {
                  ((v) this).field_Q = new dd(var11, var12);
                  r.a(((v) this).field_Q, 45);
                  var39.a(112, 144, var39.field_x << 155964772, var39.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
                  ia.a(-66);
                  ((v) this).field_Q.a(var9 + -(var39.field_x >> 1511108321), -var39.field_r + var10, 256);
                  return;
                } else {
                  r.a(((v) this).field_Q, 45);
                  gb.c();
                  var39.a(112, 144, var39.field_x << 155964772, var39.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
                  ia.a(-66);
                  ((v) this).field_Q.a(var9 + -(var39.field_x >> 1511108321), -var39.field_r + var10, 256);
                  return;
                }
              } else {
                ((v) this).field_Q = new dd(var11, var12);
                r.a(((v) this).field_Q, 45);
                var39.a(112, 144, var39.field_x << 155964772, var39.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
                ia.a(-66);
                ((v) this).field_Q.a(var9 + -(var39.field_x >> 1511108321), -var39.field_r + var10, 256);
                return;
              }
            } else {
              ((v) this).field_Q = new dd(var11, var12);
              r.a(((v) this).field_Q, 45);
              var39.a(112, 144, var39.field_x << 155964772, var39.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
              ia.a(-66);
              ((v) this).field_Q.a(var9 + -(var39.field_x >> 1511108321), -var39.field_r + var10, 256);
              return;
            }
          } else {
            ((v) this).field_i = var5;
            ((v) this).i(424);
            super.b(param0, param1, true, param3);
            var6 = ((v) this).field_S.a(false);
            var42 = (eg) (Object) ((v) this).field_p;
            var9 = param1 + ((v) this).field_y;
            var10 = var42.a(param0, (qa) this, (byte) -59) - -(var42.a((qa) this, (byte) -35).a(param2) >> 1449838945);
            if (ea.field_b != var6) {
              if (var6 == w.field_e) {
                var30 = t.field_h[0];
                var16 = var30;
                var11 = var30.field_x << -1465467423;
                var12 = var30.field_r << 1907293153;
                if (((v) this).field_Q != null) {
                  if (var11 <= ((v) this).field_Q.field_w) {
                    if (((v) this).field_Q.field_t >= var12) {
                      r.a(((v) this).field_Q, 45);
                      gb.c();
                      var30.a(112, 144, var30.field_x << 155964772, var30.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
                      ia.a(-66);
                      ((v) this).field_Q.a(var9 + -(var30.field_x >> 1511108321), -var30.field_r + var10, 256);
                      return;
                    } else {
                      ((v) this).field_Q = new dd(var11, var12);
                      r.a(((v) this).field_Q, 45);
                      var30.a(112, 144, var30.field_x << 155964772, var30.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
                      ia.a(-66);
                      ((v) this).field_Q.a(var9 + -(var30.field_x >> 1511108321), -var30.field_r + var10, 256);
                      return;
                    }
                  } else {
                    ((v) this).field_Q = new dd(var11, var12);
                    r.a(((v) this).field_Q, 45);
                    var30.a(112, 144, var30.field_x << 155964772, var30.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
                    ia.a(-66);
                    ((v) this).field_Q.a(var9 + -(var30.field_x >> 1511108321), -var30.field_r + var10, 256);
                    return;
                  }
                } else {
                  ((v) this).field_Q = new dd(var11, var12);
                  r.a(((v) this).field_Q, 45);
                  var30.a(112, 144, var30.field_x << 155964772, var30.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
                  ia.a(-66);
                  ((v) this).field_Q.a(var9 + -(var30.field_x >> 1511108321), -var30.field_r + var10, 256);
                  return;
                }
              } else {
                if (var6 != ml.field_K) {
                  if (hm.field_b != var6) {
                    return;
                  } else {
                    var29 = t.field_h[1];
                    var29.a(var9, -(var29.field_t >> -579947871) + var10, 256);
                    return;
                  }
                } else {
                  var28 = t.field_h[2];
                  var28.a(var9, var10 - (var28.field_t >> -707282303), 256);
                  return;
                }
              }
            } else {
              L2: {
                L3: {
                  var27 = t.field_h[0];
                  var11 = var27.field_x << -1465467423;
                  var12 = var27.field_r << 1907293153;
                  if (((v) this).field_Q == null) {
                    break L3;
                  } else {
                    if (var11 > ((v) this).field_Q.field_w) {
                      break L3;
                    } else {
                      if (((v) this).field_Q.field_t < var12) {
                        break L3;
                      } else {
                        r.a(((v) this).field_Q, 45);
                        gb.c();
                        break L2;
                      }
                    }
                  }
                }
                ((v) this).field_Q = new dd(var11, var12);
                r.a(((v) this).field_Q, 45);
                break L2;
              }
              var27.a(112, 144, var27.field_x << 155964772, var27.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
              ia.a(-66);
              ((v) this).field_Q.a(var9 + -(var27.field_x >> 1511108321), -var27.field_r + var10, 256);
              return;
            }
          }
        } else {
          var17 = bg.field_b;
          if (var17.equals((Object) (Object) ((v) this).field_i)) {
            L4: {
              super.b(param0, param1, true, param3);
              var6 = ((v) this).field_S.a(false);
              var41 = (eg) (Object) ((v) this).field_p;
              var9 = param1 + ((v) this).field_y;
              var10 = var41.a(param0, (qa) this, (byte) -59) - -(var41.a((qa) this, (byte) -35).a(param2) >> 1449838945);
              if (ea.field_b == var6) {
                break L4;
              } else {
                if (var6 == w.field_e) {
                  break L4;
                } else {
                  if (var6 != ml.field_K) {
                    if (hm.field_b != var6) {
                      return;
                    } else {
                      var24 = t.field_h[1];
                      var24.a(var9, -(var24.field_t >> -579947871) + var10, 256);
                      return;
                    }
                  } else {
                    var23 = t.field_h[2];
                    var23.a(var9, var10 - (var23.field_t >> -707282303), 256);
                    return;
                  }
                }
              }
            }
            var25 = t.field_h[0];
            var11 = var25.field_x << -1465467423;
            var12 = var25.field_r << 1907293153;
            if (((v) this).field_Q != null) {
              if (var11 <= ((v) this).field_Q.field_w) {
                if (((v) this).field_Q.field_t >= var12) {
                  r.a(((v) this).field_Q, 45);
                  gb.c();
                  var25.a(112, 144, var25.field_x << 155964772, var25.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
                  ia.a(-66);
                  ((v) this).field_Q.a(var9 + -(var25.field_x >> 1511108321), -var25.field_r + var10, 256);
                  return;
                } else {
                  ((v) this).field_Q = new dd(var11, var12);
                  r.a(((v) this).field_Q, 45);
                  var25.a(112, 144, var25.field_x << 155964772, var25.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
                  ia.a(-66);
                  ((v) this).field_Q.a(var9 + -(var25.field_x >> 1511108321), -var25.field_r + var10, 256);
                  return;
                }
              } else {
                ((v) this).field_Q = new dd(var11, var12);
                r.a(((v) this).field_Q, 45);
                var25.a(112, 144, var25.field_x << 155964772, var25.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
                ia.a(-66);
                ((v) this).field_Q.a(var9 + -(var25.field_x >> 1511108321), -var25.field_r + var10, 256);
                return;
              }
            } else {
              ((v) this).field_Q = new dd(var11, var12);
              r.a(((v) this).field_Q, 45);
              var25.a(112, 144, var25.field_x << 155964772, var25.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
              ia.a(-66);
              ((v) this).field_Q.a(var9 + -(var25.field_x >> 1511108321), -var25.field_r + var10, 256);
              return;
            }
          } else {
            L5: {
              L6: {
                ((v) this).field_i = var17;
                ((v) this).i(424);
                super.b(param0, param1, true, param3);
                var6 = ((v) this).field_S.a(false);
                var40 = (eg) (Object) ((v) this).field_p;
                var9 = param1 + ((v) this).field_y;
                var10 = var40.a(param0, (qa) this, (byte) -59) - -(var40.a((qa) this, (byte) -35).a(param2) >> 1449838945);
                if (ea.field_b == var6) {
                  break L6;
                } else {
                  if (var6 == w.field_e) {
                    break L6;
                  } else {
                    if (var6 != ml.field_K) {
                      if (hm.field_b == var6) {
                        var20 = t.field_h[1];
                        var20.a(var9, -(var20.field_t >> -579947871) + var10, 256);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      var19 = t.field_h[2];
                      var19.a(var9, var10 - (var19.field_t >> -707282303), 256);
                      break L5;
                    }
                  }
                }
              }
              L7: {
                L8: {
                  var21 = t.field_h[0];
                  var11 = var21.field_x << -1465467423;
                  var12 = var21.field_r << 1907293153;
                  if (((v) this).field_Q == null) {
                    break L8;
                  } else {
                    if (var11 > ((v) this).field_Q.field_w) {
                      break L8;
                    } else {
                      if (((v) this).field_Q.field_t < var12) {
                        break L8;
                      } else {
                        r.a(((v) this).field_Q, 45);
                        gb.c();
                        break L7;
                      }
                    }
                  }
                }
                ((v) this).field_Q = new dd(var11, var12);
                r.a(((v) this).field_Q, 45);
                break L7;
              }
              var21.a(112, 144, var21.field_x << 155964772, var21.field_r << -1821427388, -((v) this).field_T << 1673028810, 4096);
              ia.a(-66);
              ((v) this).field_Q.a(var9 + -(var21.field_x >> 1511108321), -var21.field_r + var10, 256);
              break L5;
            }
            return;
          }
        }
    }

    final boolean a(qa param0, int param1) {
        if (param1 > -26) {
            field_R = null;
            return false;
        }
        return false;
    }

    public static void k(int param0) {
        field_U = null;
        field_R = null;
        if (param0 != -8011) {
            field_U = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new byte[250][];
    }
}
