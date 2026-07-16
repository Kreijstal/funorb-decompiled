/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends se {
    private vb field_fb;
    static String field_P;
    static bn field_cb;
    static ok field_bb;
    private String field_eb;
    private int field_db;
    private km field_T;

    final void a(int param0, int param1, mf param2, int param3) {
        ((ea) this).field_db = ((ea) this).field_db + 1;
        super.a(param0, -32, param2, param3);
        if (param1 >= -6) {
            Object var6 = null;
            ((ea) this).a(95, -66, (mf) null, 75);
        }
    }

    public static void g(byte param0) {
        int var1 = 101 / ((param0 - 37) / 53);
        field_bb = null;
        field_P = null;
        field_cb = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        mk var6 = null;
        mg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        km var14 = null;
        km var16 = null;
        km var17 = null;
        km var18 = null;
        km var19 = null;
        km var20 = null;
        km var21 = null;
        km var22 = null;
        var13 = Chess.field_G;
        if (param2 < -80) {
          L0: {
            L1: {
              L2: {
                L3: {
                  var6 = ((ea) this).field_fb.a(21314);
                  if (in.field_g == var6) {
                    break L3;
                  } else {
                    if (var6 == ek.field_d) {
                      break L3;
                    } else {
                      var5 = ((ea) this).field_fb.a(false);
                      if (var5 == null) {
                        var5 = ((ea) this).field_eb;
                        if (var13 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        if (!var5.equals((Object) (Object) ((ea) this).field_v)) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
                var5 = cc.field_v;
                break L2;
              }
              if (!var5.equals((Object) (Object) ((ea) this).field_v)) {
                break L1;
              } else {
                break L0;
              }
            }
            ((ea) this).field_v = var5;
            ((ea) this).f((byte) 105);
            break L0;
          }
          super.a(param0, param1, -109, param3);
          var6 = ((ea) this).field_fb.a(21314);
          var8 = (mg) (Object) ((ea) this).field_n;
          var9 = param3 - -((ea) this).field_u;
          var10 = var8.a(0, param0, (mf) this) + (var8.a((mf) this, -23159).a((byte) 34) >> -1420287551);
          if (in.field_g != var6) {
            if (var6 != ek.field_d) {
              if (var6 == qk.field_b) {
                var14 = uh.field_p[2];
                var14.d(var9, -(var14.field_t >> -830288991) + var10, 256);
                if (var13 != 0) {
                  if (oa.field_a == var6) {
                    var21 = uh.field_p[1];
                    var21.d(var9, -(var21.field_t >> -588563903) + var10, 256);
                    if (var13 != 0) {
                      L4: {
                        var22 = uh.field_p[0];
                        var11 = var22.field_v << 1087088929;
                        var12 = var22.field_u << -1443206655;
                        if (null == ((ea) this).field_T) {
                          break L4;
                        } else {
                          if (var11 > ((ea) this).field_T.field_w) {
                            break L4;
                          } else {
                            if (var12 <= ((ea) this).field_T.field_t) {
                              tl.a((byte) -67, ((ea) this).field_T);
                              wb.b();
                              var22.b(112, 144, var22.field_v << 326496996, var22.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                              fd.a(28773);
                              ((ea) this).field_T.d(-(var22.field_v >> 1940217569) + var9, -var22.field_u + var10, 256);
                              return;
                            } else {
                              ((ea) this).field_T = new km(var11, var12);
                              tl.a((byte) -67, ((ea) this).field_T);
                              tl.a((byte) -67, ((ea) this).field_T);
                              wb.b();
                              var22.b(112, 144, var22.field_v << 326496996, var22.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                              fd.a(28773);
                              ((ea) this).field_T.d(-(var22.field_v >> 1940217569) + var9, -var22.field_u + var10, 256);
                              return;
                            }
                          }
                        }
                      }
                      ((ea) this).field_T = new km(var11, var12);
                      tl.a((byte) -67, ((ea) this).field_T);
                      tl.a((byte) -67, ((ea) this).field_T);
                      wb.b();
                      var22.b(112, 144, var22.field_v << 326496996, var22.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                      fd.a(28773);
                      ((ea) this).field_T.d(-(var22.field_v >> 1940217569) + var9, -var22.field_u + var10, 256);
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
                if (oa.field_a == var6) {
                  var19 = uh.field_p[1];
                  var19.d(var9, -(var19.field_t >> -588563903) + var10, 256);
                  if (var13 != 0) {
                    L5: {
                      var20 = uh.field_p[0];
                      var11 = var20.field_v << 1087088929;
                      var12 = var20.field_u << -1443206655;
                      if (null == ((ea) this).field_T) {
                        break L5;
                      } else {
                        if (var11 > ((ea) this).field_T.field_w) {
                          break L5;
                        } else {
                          if (var12 > ((ea) this).field_T.field_t) {
                            ((ea) this).field_T = new km(var11, var12);
                            tl.a((byte) -67, ((ea) this).field_T);
                            if (var13 != 0) {
                              tl.a((byte) -67, ((ea) this).field_T);
                              wb.b();
                              var20.b(112, 144, var20.field_v << 326496996, var20.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                              fd.a(28773);
                              ((ea) this).field_T.d(-(var20.field_v >> 1940217569) + var9, -var20.field_u + var10, 256);
                              return;
                            } else {
                              var20.b(112, 144, var20.field_v << 326496996, var20.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                              fd.a(28773);
                              ((ea) this).field_T.d(-(var20.field_v >> 1940217569) + var9, -var20.field_u + var10, 256);
                              return;
                            }
                          } else {
                            tl.a((byte) -67, ((ea) this).field_T);
                            wb.b();
                            var20.b(112, 144, var20.field_v << 326496996, var20.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                            fd.a(28773);
                            ((ea) this).field_T.d(-(var20.field_v >> 1940217569) + var9, -var20.field_u + var10, 256);
                            return;
                          }
                        }
                      }
                    }
                    ((ea) this).field_T = new km(var11, var12);
                    tl.a((byte) -67, ((ea) this).field_T);
                    if (var13 != 0) {
                      tl.a((byte) -67, ((ea) this).field_T);
                      wb.b();
                      var20.b(112, 144, var20.field_v << 326496996, var20.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                      fd.a(28773);
                      ((ea) this).field_T.d(-(var20.field_v >> 1940217569) + var9, -var20.field_u + var10, 256);
                      return;
                    } else {
                      var20.b(112, 144, var20.field_v << 326496996, var20.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                      fd.a(28773);
                      ((ea) this).field_T.d(-(var20.field_v >> 1940217569) + var9, -var20.field_u + var10, 256);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L6: {
                var18 = uh.field_p[0];
                var16 = var18;
                var11 = var18.field_v << 1087088929;
                var12 = var18.field_u << -1443206655;
                if (null == ((ea) this).field_T) {
                  break L6;
                } else {
                  if (var11 > ((ea) this).field_T.field_w) {
                    break L6;
                  } else {
                    if (var12 > ((ea) this).field_T.field_t) {
                      ((ea) this).field_T = new km(var11, var12);
                      tl.a((byte) -67, ((ea) this).field_T);
                      if (var13 != 0) {
                        tl.a((byte) -67, ((ea) this).field_T);
                        wb.b();
                        var18.b(112, 144, var18.field_v << 326496996, var18.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                        fd.a(28773);
                        ((ea) this).field_T.d(-(var18.field_v >> 1940217569) + var9, -var18.field_u + var10, 256);
                        return;
                      } else {
                        var18.b(112, 144, var18.field_v << 326496996, var18.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                        fd.a(28773);
                        ((ea) this).field_T.d(-(var18.field_v >> 1940217569) + var9, -var18.field_u + var10, 256);
                        return;
                      }
                    } else {
                      tl.a((byte) -67, ((ea) this).field_T);
                      wb.b();
                      var18.b(112, 144, var18.field_v << 326496996, var18.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                      fd.a(28773);
                      ((ea) this).field_T.d(-(var18.field_v >> 1940217569) + var9, -var18.field_u + var10, 256);
                      return;
                    }
                  }
                }
              }
              ((ea) this).field_T = new km(var11, var12);
              tl.a((byte) -67, ((ea) this).field_T);
              if (var13 != 0) {
                tl.a((byte) -67, ((ea) this).field_T);
                wb.b();
                var18.b(112, 144, var18.field_v << 326496996, var18.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                fd.a(28773);
                ((ea) this).field_T.d(-(var18.field_v >> 1940217569) + var9, -var18.field_u + var10, 256);
                return;
              } else {
                var18.b(112, 144, var18.field_v << 326496996, var18.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                fd.a(28773);
                ((ea) this).field_T.d(-(var18.field_v >> 1940217569) + var9, -var18.field_u + var10, 256);
                return;
              }
            }
          } else {
            L7: {
              var17 = uh.field_p[0];
              var11 = var17.field_v << 1087088929;
              var12 = var17.field_u << -1443206655;
              if (null == ((ea) this).field_T) {
                break L7;
              } else {
                if (var11 > ((ea) this).field_T.field_w) {
                  break L7;
                } else {
                  if (var12 > ((ea) this).field_T.field_t) {
                    L8: {
                      ((ea) this).field_T = new km(var11, var12);
                      tl.a((byte) -67, ((ea) this).field_T);
                      if (var13 == 0) {
                        break L8;
                      } else {
                        tl.a((byte) -67, ((ea) this).field_T);
                        wb.b();
                        break L8;
                      }
                    }
                    var17.b(112, 144, var17.field_v << 326496996, var17.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                    fd.a(28773);
                    ((ea) this).field_T.d(-(var17.field_v >> 1940217569) + var9, -var17.field_u + var10, 256);
                    return;
                  } else {
                    tl.a((byte) -67, ((ea) this).field_T);
                    wb.b();
                    var17.b(112, 144, var17.field_v << 326496996, var17.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                    fd.a(28773);
                    ((ea) this).field_T.d(-(var17.field_v >> 1940217569) + var9, -var17.field_u + var10, 256);
                    return;
                  }
                }
              }
            }
            ((ea) this).field_T = new km(var11, var12);
            tl.a((byte) -67, ((ea) this).field_T);
            if (var13 != 0) {
              tl.a((byte) -67, ((ea) this).field_T);
              wb.b();
              var17.b(112, 144, var17.field_v << 326496996, var17.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
              fd.a(28773);
              ((ea) this).field_T.d(-(var17.field_v >> 1940217569) + var9, -var17.field_u + var10, 256);
              return;
            } else {
              var17.b(112, 144, var17.field_v << 326496996, var17.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
              fd.a(28773);
              ((ea) this).field_T.d(-(var17.field_v >> 1940217569) + var9, -var17.field_u + var10, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final String g(int param0) {
        if (param0 == 0) {
            return null;
        }
        String discarded$0 = ((ea) this).g(93);
        return null;
    }

    final boolean a(int param0, mf param1) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    final static int h(byte param0) {
        if (param0 != -16) {
            field_bb = null;
            return si.field_o;
        }
        return si.field_o;
    }

    ea(vb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (jm) (Object) je.d(false));
        ((ea) this).field_fb = param0;
        ((ea) this).field_eb = param1;
        ((ea) this).a(param3, 34, param5, param4, param2);
    }

    final static long i(byte param0) {
        int var1 = 40 % ((-84 - param0) / 36);
        return -ml.field_d + ud.a(2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Shortcut Reference";
    }
}
