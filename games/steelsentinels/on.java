/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends me {
    static int field_j;
    static int field_h;
    private String field_m;
    static int field_i;
    static int field_n;
    static String field_k;
    private String field_l;

    final static void b(int param0) {
        qd[] var2 = null;
        int var3 = 0;
        qd var4 = null;
        int var5 = 0;
        int var6 = 0;
        qd[] var7 = null;
        qd[] var8 = null;
        var6 = SteelSentinels.field_G;
        lc.field_f = false;
        qf.field_b = false;
        qh.field_Wb = false;
        nb.field_I = false;
        bm.field_Q = false;
        if (param0 == 50) {
          vc.field_d = false;
          wl.field_lb = false;
          bf.field_Gb = false;
          var8 = new qd[]{};
          var7 = hl.field_v.a(var8, -21636, 4095);
          var2 = var7;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var2.length) {
              L1: {
                if (-9 != (dc.field_g ^ -1)) {
                  break L1;
                } else {
                  if (!nb.field_I) {
                    rc.a(false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              ef.field_b = true;
              return;
            } else {
              L2: {
                L3: {
                  var4 = var2[var3];
                  if (null == var4.field_d) {
                    break L3;
                  } else {
                    if (var4.field_d.field_N == 89) {
                      qh.field_Wb = true;
                      lc.field_f = true;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null == var4.field_d) {
                    break L4;
                  } else {
                    if ((var4.field_d.field_N ^ -1) != -67) {
                      break L4;
                    } else {
                      qh.field_Wb = true;
                      break L2;
                    }
                  }
                }
                L5: {
                  if (null == var4.field_d) {
                    break L5;
                  } else {
                    if (76 != var4.field_d.field_N) {
                      break L5;
                    } else {
                      qh.field_Wb = true;
                      break L2;
                    }
                  }
                }
                if (null == var4.field_d) {
                  break L2;
                } else {
                  if (83 == var4.field_d.field_N) {
                    break L2;
                  } else {
                    if ((var4.field_d.field_Q & 1008) == 0) {
                      break L2;
                    } else {
                      qh.field_Wb = true;
                      var5 = ja.a(var4.field_d.field_N, false);
                      if (var5 != 1) {
                        if (var5 != 0) {
                          if (7 != var5) {
                            if (var5 != 8) {
                              L6: {
                                if (11 != var5) {
                                  if (12 == var5) {
                                    break L6;
                                  } else {
                                    if (var5 != 13) {
                                      L7: {
                                        if (14 != var5) {
                                          if (15 != var5) {
                                            if (-17 != (var5 ^ -1)) {
                                              if (var5 != 17) {
                                                if (18 != var5) {
                                                  if (var5 != 19) {
                                                    if ((var5 ^ -1) == -10) {
                                                      qf.field_b = true;
                                                      break L2;
                                                    } else {
                                                      break L2;
                                                    }
                                                  } else {
                                                    nb.field_I = true;
                                                    break L2;
                                                  }
                                                } else {
                                                  break L7;
                                                }
                                              } else {
                                                break L7;
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            nb.field_I = true;
                                            break L2;
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      nb.field_I = true;
                                      break L2;
                                    } else {
                                      nb.field_I = true;
                                      break L2;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              vc.field_d = true;
                              bf.field_Gb = true;
                              break L2;
                            } else {
                              L8: {
                                if (-48 != (var4.field_d.field_N ^ -1)) {
                                  break L8;
                                } else {
                                  bm.field_Q = true;
                                  break L8;
                                }
                              }
                              vc.field_d = true;
                              break L2;
                            }
                          } else {
                            wl.field_lb = true;
                            vc.field_d = true;
                            bm.field_Q = true;
                            break L2;
                          }
                        } else {
                          vc.field_d = true;
                          wl.field_lb = true;
                          break L2;
                        }
                      } else {
                        wl.field_lb = true;
                        break L2;
                      }
                    }
                  }
                }
              }
              var3++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void a(gi param0, boolean param1) {
        param0.a(13588, ((on) this).field_m);
        param0.a(((on) this).field_l, (byte) -83);
        if (param1) {
            on.b(114);
        }
    }

    final static pc a(em param0, int param1) {
        if (param1 != -48) {
            return null;
        }
        pc var2 = new pc(param0, (ck) (Object) param0);
        mm.field_b.a(3, (ck) (Object) var2);
        ll.field_e.b((we) (Object) param0);
        return var2;
    }

    final dj a(byte param0) {
        if (param0 < 47) {
            Object var3 = null;
            ((on) this).a((gi) null, true);
        }
        return nk.field_F;
    }

    public static void b(byte param0) {
        if (param0 != -116) {
            return;
        }
        field_k = null;
    }

    on(String param0, String param1) {
        ((on) this).field_m = param0;
        ((on) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 50;
    }
}
