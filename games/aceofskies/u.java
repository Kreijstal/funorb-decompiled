/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends sk {
    private float field_h;
    static mg field_g;
    static ll[] field_i;
    private em field_f;

    final void a(boolean param0) {
        ((u) this).field_b.a(1, (byte) 106);
        ((u) this).field_b.a(ru.field_a, param0, ru.field_a);
        ((u) this).field_b.a((byte) 122, 0, dl.field_p);
        ((u) this).field_b.a(dl.field_p, 0, 0);
        ((u) this).field_b.c(1, (byte) -99);
        ((u) this).field_b.a((jj) null, -9135);
        ((u) this).field_b.a(0, (byte) 57);
        ((u) this).field_b.a(dl.field_p, 0, 0);
    }

    u(bf param0, em param1) {
        super(param0);
        ((u) this).field_h = 0.0f;
        ((u) this).field_f = param1;
    }

    final void a(boolean param0, boolean param1) {
        ((u) this).field_b.a(ru.field_a, true, bd.field_C);
        if (param0) {
            ((u) this).d(6);
        }
    }

    final void a(boolean param0, byte param1) {
        ((u) this).field_b.a(1, (byte) 41);
        ((u) this).field_b.a(lo.field_j, true, bd.field_C);
        if (param1 < 2) {
          ((u) this).field_h = -0.11807350814342499f;
          ((u) this).field_b.a(true, 0, true, dl.field_p, false);
          ((u) this).field_b.a(un.field_i, 0, 0);
          ((u) this).field_b.c(0, (byte) -86);
          ((u) this).field_b.a(0, (byte) 127);
          ((u) this).field_b.a((byte) -74, -16777216);
          ((u) this).field_b.a(bs.field_a, 0, 0);
          ((u) this).d(18580);
          return;
        } else {
          ((u) this).field_b.a(true, 0, true, dl.field_p, false);
          ((u) this).field_b.a(un.field_i, 0, 0);
          ((u) this).field_b.c(0, (byte) -86);
          ((u) this).field_b.a(0, (byte) 127);
          ((u) this).field_b.a((byte) -74, -16777216);
          ((u) this).field_b.a(bs.field_a, 0, 0);
          ((u) this).d(18580);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        jj var6 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == 1786747298) {
          ((u) this).field_b.a(1, (byte) 111);
          if (-1 == (128 & param1 ^ -1)) {
            if ((1 & param2 ^ -1) != -2) {
              if (((u) this).field_f.field_e) {
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_f, -9135);
                ((u) this).field_b.a(0, (byte) 44);
                return;
              } else {
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_i[0], -9135);
                ((u) this).field_b.a(0, (byte) 44);
                return;
              }
            } else {
              if (!((u) this).field_f.field_e) {
                var4 = ((u) this).field_b.field_r % 4000 * 16 / 4000;
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_i[var4], -9135);
                ((u) this).field_b.a(0, (byte) 44);
                return;
              } else {
                ((u) this).field_h = (float)(((u) this).field_b.field_r % 4000) / 4000.0f;
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_f, -9135);
                ((u) this).field_b.a(0, (byte) 44);
                return;
              }
            }
          } else {
            ((u) this).field_b.a((jj) null, -9135);
            ((u) this).field_b.a(0, (byte) 44);
            return;
          }
        } else {
          var6 = (jj) null;
          ((u) this).a(-79, -84, (jj) null);
          ((u) this).field_b.a(1, (byte) 111);
          if (-1 == (128 & param1 ^ -1)) {
            if ((1 & param2 ^ -1) != -2) {
              if (((u) this).field_f.field_e) {
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_f, -9135);
                ((u) this).field_b.a(0, (byte) 44);
                return;
              } else {
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_i[0], -9135);
                ((u) this).field_b.a(0, (byte) 44);
                return;
              }
            } else {
              if (!((u) this).field_f.field_e) {
                var4 = ((u) this).field_b.field_r % 4000 * 16 / 4000;
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_i[var4], -9135);
                ((u) this).field_b.a(0, (byte) 44);
                return;
              } else {
                ((u) this).field_h = (float)(((u) this).field_b.field_r % 4000) / 4000.0f;
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_f, -9135);
                ((u) this).field_b.a(0, (byte) 44);
                return;
              }
            }
          } else {
            ((u) this).field_b.a((jj) null, -9135);
            ((u) this).field_b.a(0, (byte) 44);
            return;
          }
        }
    }

    final static int a(cd param0, int param1, String param2, boolean param3, int param4, int param5, cd param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        rb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        rb stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        rb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_10_2 = null;
        rb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        rb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        rb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        rb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        rb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        rb stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        String stackOut_8_2 = null;
        rb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        rb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        rb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        L0: {
          var13 = AceOfSkies.field_G ? 1 : 0;
          var14 = param6.b(-17233);
          var8 = param0.b(-17233);
          if (ft.field_l != null) {
            break L0;
          } else {
            if (!fp.a((byte) -116, false)) {
              return -1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (ca.field_f == qa.field_b) {
            L2: {
              q.field_p.field_g = 0;
              qj.field_r = null;
              if (param2 != null) {
                L3: {
                  var9 = 0;
                  fa.field_c.field_g = 0;
                  if (!param3) {
                    break L3;
                  } else {
                    var9 = var9 | 1;
                    break L3;
                  }
                }
                L4: {
                  fa.field_c.a((byte) 113, vr.field_h.nextInt());
                  fa.field_c.a((byte) 115, vr.field_h.nextInt());
                  fa.field_c.a(false, var14);
                  fa.field_c.a(false, var8);
                  var15 = (CharSequence) param2;
                  fa.field_c.a(false, ip.a((byte) -81, var15));
                  fa.field_c.a(param1, 23385);
                  fa.field_c.b(-1336879960, param5);
                  fa.field_c.b(-1336879960, var9);
                  q.field_p.b(-1336879960, 18);
                  q.field_p.field_g = q.field_p.field_g + 2;
                  var10 = q.field_p.field_g;
                  var11_ref = ao.a(bm.m(108), false);
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L4;
                  } else {
                    break L4;
                  }
                }
                q.field_p.a(-117, var11_ref);
                gn.a(hp.field_j, pb.field_a, (rb) (Object) q.field_p, fa.field_c, 92);
                q.field_p.a(false, q.field_p.field_g + -var10);
                break L2;
              } else {
                L5: {
                  fa.field_c.field_g = 0;
                  fa.field_c.a((byte) 88, vr.field_h.nextInt());
                  fa.field_c.a((byte) 23, vr.field_h.nextInt());
                  stackOut_7_0 = fa.field_c;
                  stackOut_7_1 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (param6.a(-109)) {
                    stackOut_9_0 = (rb) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = (String) var14;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    break L5;
                  } else {
                    stackOut_8_0 = (rb) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = "";
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    break L5;
                  }
                }
                L6: {
                  ((rb) (Object) stackIn_10_0).a(stackIn_10_1 != 0, (String) (Object) stackIn_10_2);
                  stackOut_10_0 = fa.field_c;
                  stackOut_10_1 = 0;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (!param0.a(-103)) {
                    stackOut_12_0 = (rb) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = "";
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L6;
                  } else {
                    stackOut_11_0 = (rb) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = (String) var8;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L6;
                  }
                }
                ((rb) (Object) stackIn_13_0).a(stackIn_13_1 != 0, (String) (Object) stackIn_13_2);
                q.field_p.b(-1336879960, 16);
                q.field_p.field_g = q.field_p.field_g + 1;
                var9 = q.field_p.field_g;
                gn.a(hp.field_j, pb.field_a, (rb) (Object) q.field_p, fa.field_c, 78);
                q.field_p.b(q.field_p.field_g - var9, (byte) 85);
                break L2;
              }
            }
            fr.a(-37, -1);
            ca.field_f = mq.field_h;
            break L1;
          } else {
            break L1;
          }
        }
        L7: {
          if (mq.field_h == ca.field_f) {
            if (wo.a(1, true)) {
              var9 = nm.field_c.g(78);
              nm.field_c.field_g = 0;
              if (-101 >= (var9 ^ -1)) {
                if (var9 > 105) {
                  if (var9 == 248) {
                    oj.a(26099, bm.m(112));
                    rp.field_m = wo.field_h;
                    te.b(true);
                    ld.field_d = false;
                    return var9;
                  } else {
                    if (var9 == 99) {
                      boolean discarded$2 = wo.a(km.a(1), true);
                      qj.field_r = new Boolean(b.a(true, (rb) (Object) nm.field_c));
                      nm.field_c.field_g = 0;
                      break L7;
                    } else {
                      ag.field_s = -1;
                      ca.field_f = cd.field_a;
                      qs.field_b = var9;
                      break L7;
                    }
                  }
                } else {
                  ca.field_f = kf.field_m;
                  sd.field_j = new String[-100 + var9];
                  break L7;
                }
              } else {
                if (var9 == 248) {
                  oj.a(26099, bm.m(112));
                  rp.field_m = wo.field_h;
                  te.b(true);
                  ld.field_d = false;
                  return var9;
                } else {
                  L8: {
                    if (var9 == 99) {
                      boolean discarded$3 = wo.a(km.a(1), true);
                      qj.field_r = new Boolean(b.a(true, (rb) (Object) nm.field_c));
                      nm.field_c.field_g = 0;
                      break L8;
                    } else {
                      ag.field_s = -1;
                      ca.field_f = cd.field_a;
                      qs.field_b = var9;
                      break L8;
                    }
                  }
                  L9: {
                    if (ca.field_f != kf.field_m) {
                      break L9;
                    } else {
                      var9 = 2;
                      if (wo.a(var9, true)) {
                        var10 = nm.field_c.i((byte) 0);
                        nm.field_c.field_g = 0;
                        if (!wo.a(var10, true)) {
                          break L9;
                        } else {
                          var11 = sd.field_j.length;
                          var12 = 0;
                          L10: while (true) {
                            if (var11 <= var12) {
                              te.b(true);
                              ld.field_d = false;
                              return 100 - -var11;
                            } else {
                              sd.field_j[var12] = nm.field_c.d((byte) 77);
                              var12++;
                              continue L10;
                            }
                          }
                        }
                      } else {
                        L11: {
                          if (cd.field_a != ca.field_f) {
                            break L11;
                          } else {
                            if (rm.a(0)) {
                              L12: {
                                if (qs.field_b == 255) {
                                  var9_ref = nm.field_c.e((byte) -109);
                                  if (var9_ref != null) {
                                    sf.a((byte) -125, bm.m(118), var9_ref);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  rp.field_m = nm.field_c.h(-17883);
                                  break L12;
                                }
                              }
                              te.b(true);
                              ld.field_d = false;
                              return qs.field_b;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (ft.field_l == null) {
                          if (ld.field_d) {
                            L13: {
                              if (-30001L <= (gm.g(-1) ^ -1L)) {
                                rp.field_m = jf.field_b;
                                break L13;
                              } else {
                                rp.field_m = rm.field_c;
                                break L13;
                              }
                            }
                            ld.field_d = false;
                            return 249;
                          } else {
                            var9 = sg.field_b;
                            sg.field_b = ca.field_h;
                            ca.field_h = var9;
                            ld.field_d = true;
                            var9 = 74 % ((-57 - param4) / 47);
                            return -1;
                          }
                        } else {
                          var9 = 74 % ((-57 - param4) / 47);
                          return -1;
                        }
                      }
                    }
                  }
                  if (cd.field_a != ca.field_f) {
                    if (ft.field_l == null) {
                      if (ld.field_d) {
                        if (-30001L > (gm.g(-1) ^ -1L)) {
                          rp.field_m = rm.field_c;
                          ld.field_d = false;
                          return 249;
                        } else {
                          rp.field_m = jf.field_b;
                          ld.field_d = false;
                          return 249;
                        }
                      } else {
                        var9 = sg.field_b;
                        sg.field_b = ca.field_h;
                        ca.field_h = var9;
                        ld.field_d = true;
                        var9 = 74 % ((-57 - param4) / 47);
                        return -1;
                      }
                    } else {
                      var9 = 74 % ((-57 - param4) / 47);
                      return -1;
                    }
                  } else {
                    if (rm.a(0)) {
                      if (qs.field_b == 255) {
                        var9_ref = nm.field_c.e((byte) -109);
                        if (var9_ref == null) {
                          te.b(true);
                          ld.field_d = false;
                          return qs.field_b;
                        } else {
                          sf.a((byte) -125, bm.m(118), var9_ref);
                          te.b(true);
                          ld.field_d = false;
                          return qs.field_b;
                        }
                      } else {
                        rp.field_m = nm.field_c.h(-17883);
                        te.b(true);
                        ld.field_d = false;
                        return qs.field_b;
                      }
                    } else {
                      if (ft.field_l == null) {
                        if (ld.field_d) {
                          L14: {
                            if (-30001L <= (gm.g(-1) ^ -1L)) {
                              rp.field_m = jf.field_b;
                              break L14;
                            } else {
                              rp.field_m = rm.field_c;
                              break L14;
                            }
                          }
                          ld.field_d = false;
                          return 249;
                        } else {
                          var9 = sg.field_b;
                          sg.field_b = ca.field_h;
                          ca.field_h = var9;
                          ld.field_d = true;
                          var9 = 74 % ((-57 - param4) / 47);
                          return -1;
                        }
                      } else {
                        var9 = 74 % ((-57 - param4) / 47);
                        return -1;
                      }
                    }
                  }
                }
              }
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        if (ca.field_f == kf.field_m) {
          var9 = 2;
          if (wo.a(var9, true)) {
            var10 = nm.field_c.i((byte) 0);
            nm.field_c.field_g = 0;
            if (!wo.a(var10, true)) {
              if (cd.field_a != ca.field_f) {
                L15: {
                  if (ft.field_l == null) {
                    if (!ld.field_d) {
                      var9 = sg.field_b;
                      sg.field_b = ca.field_h;
                      ca.field_h = var9;
                      ld.field_d = true;
                      break L15;
                    } else {
                      if (-30001L <= (gm.g(-1) ^ -1L)) {
                        rp.field_m = jf.field_b;
                        ld.field_d = false;
                        return 249;
                      } else {
                        rp.field_m = rm.field_c;
                        ld.field_d = false;
                        return 249;
                      }
                    }
                  } else {
                    break L15;
                  }
                }
                var9 = 74 % ((-57 - param4) / 47);
                return -1;
              } else {
                if (rm.a(0)) {
                  if (qs.field_b == 255) {
                    var9_ref = nm.field_c.e((byte) -109);
                    if (var9_ref != null) {
                      sf.a((byte) -125, bm.m(118), var9_ref);
                      te.b(true);
                      ld.field_d = false;
                      return qs.field_b;
                    } else {
                      te.b(true);
                      ld.field_d = false;
                      return qs.field_b;
                    }
                  } else {
                    rp.field_m = nm.field_c.h(-17883);
                    te.b(true);
                    ld.field_d = false;
                    return qs.field_b;
                  }
                } else {
                  L16: {
                    if (ft.field_l == null) {
                      if (!ld.field_d) {
                        var9 = sg.field_b;
                        sg.field_b = ca.field_h;
                        ca.field_h = var9;
                        ld.field_d = true;
                        break L16;
                      } else {
                        if (-30001L <= (gm.g(-1) ^ -1L)) {
                          rp.field_m = jf.field_b;
                          ld.field_d = false;
                          return 249;
                        } else {
                          rp.field_m = rm.field_c;
                          ld.field_d = false;
                          return 249;
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                  var9 = 74 % ((-57 - param4) / 47);
                  return -1;
                }
              }
            } else {
              var11 = sd.field_j.length;
              var12 = 0;
              L17: while (true) {
                if (var11 <= var12) {
                  te.b(true);
                  ld.field_d = false;
                  return 100 - -var11;
                } else {
                  sd.field_j[var12] = nm.field_c.d((byte) 77);
                  var12++;
                  continue L17;
                }
              }
            }
          } else {
            if (cd.field_a != ca.field_f) {
              L18: {
                if (ft.field_l == null) {
                  if (!ld.field_d) {
                    var9 = sg.field_b;
                    sg.field_b = ca.field_h;
                    ca.field_h = var9;
                    ld.field_d = true;
                    break L18;
                  } else {
                    if (-30001L <= (gm.g(-1) ^ -1L)) {
                      rp.field_m = jf.field_b;
                      ld.field_d = false;
                      return 249;
                    } else {
                      rp.field_m = rm.field_c;
                      ld.field_d = false;
                      return 249;
                    }
                  }
                } else {
                  break L18;
                }
              }
              var9 = 74 % ((-57 - param4) / 47);
              return -1;
            } else {
              if (rm.a(0)) {
                if (qs.field_b == 255) {
                  var9_ref = nm.field_c.e((byte) -109);
                  if (var9_ref != null) {
                    sf.a((byte) -125, bm.m(118), var9_ref);
                    te.b(true);
                    ld.field_d = false;
                    return qs.field_b;
                  } else {
                    te.b(true);
                    ld.field_d = false;
                    return qs.field_b;
                  }
                } else {
                  rp.field_m = nm.field_c.h(-17883);
                  te.b(true);
                  ld.field_d = false;
                  return qs.field_b;
                }
              } else {
                if (ft.field_l == null) {
                  if (!ld.field_d) {
                    var9 = sg.field_b;
                    sg.field_b = ca.field_h;
                    ca.field_h = var9;
                    ld.field_d = true;
                    var9 = 74 % ((-57 - param4) / 47);
                    return -1;
                  } else {
                    L19: {
                      if (-30001L <= (gm.g(-1) ^ -1L)) {
                        rp.field_m = jf.field_b;
                        break L19;
                      } else {
                        rp.field_m = rm.field_c;
                        break L19;
                      }
                    }
                    ld.field_d = false;
                    return 249;
                  }
                } else {
                  var9 = 74 % ((-57 - param4) / 47);
                  return -1;
                }
              }
            }
          }
        } else {
          if (cd.field_a != ca.field_f) {
            if (ft.field_l == null) {
              if (ld.field_d) {
                if (-30001L <= (gm.g(-1) ^ -1L)) {
                  rp.field_m = jf.field_b;
                  ld.field_d = false;
                  return 249;
                } else {
                  rp.field_m = rm.field_c;
                  ld.field_d = false;
                  return 249;
                }
              } else {
                var9 = sg.field_b;
                sg.field_b = ca.field_h;
                ca.field_h = var9;
                ld.field_d = true;
                var9 = 74 % ((-57 - param4) / 47);
                return -1;
              }
            } else {
              var9 = 74 % ((-57 - param4) / 47);
              return -1;
            }
          } else {
            if (rm.a(0)) {
              if (qs.field_b == 255) {
                var9_ref = nm.field_c.e((byte) -109);
                if (var9_ref == null) {
                  te.b(true);
                  ld.field_d = false;
                  return qs.field_b;
                } else {
                  sf.a((byte) -125, bm.m(118), var9_ref);
                  te.b(true);
                  ld.field_d = false;
                  return qs.field_b;
                }
              } else {
                rp.field_m = nm.field_c.h(-17883);
                te.b(true);
                ld.field_d = false;
                return qs.field_b;
              }
            } else {
              if (ft.field_l == null) {
                if (ld.field_d) {
                  if (-30001L <= (gm.g(-1) ^ -1L)) {
                    rp.field_m = jf.field_b;
                    ld.field_d = false;
                    return 249;
                  } else {
                    rp.field_m = rm.field_c;
                    ld.field_d = false;
                    return 249;
                  }
                } else {
                  var9 = sg.field_b;
                  sg.field_b = ca.field_h;
                  ca.field_h = var9;
                  ld.field_d = true;
                  var9 = 74 % ((-57 - param4) / 47);
                  return -1;
                }
              } else {
                var9 = 74 % ((-57 - param4) / 47);
                return -1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, jj param2) {
        if (param1 <= 66) {
          int discarded$2 = u.a(97, 109);
          ((u) this).field_b.a(param2, -9135);
          return;
        } else {
          ((u) this).field_b.a(param2, -9135);
          return;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            return true;
        }
        return ((u) this).field_f.b(false);
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -106) {
          param1 = param1 & 8191;
          if (param1 >= 4096) {
            L0: {
              if (6144 <= param1) {
                stackOut_18_0 = lp.field_c[-6144 + param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -lp.field_c[-param1 + 6144];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-2049 < (param1 ^ -1)) {
                stackOut_14_0 = lp.field_c[-param1 + 2048];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -lp.field_c[param1 + -2048];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_g = (mg) null;
          param1 = param1 & 8191;
          if (param1 >= 4096) {
            L2: {
              if (6144 <= param1) {
                stackOut_8_0 = lp.field_c[-6144 + param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -lp.field_c[-param1 + 6144];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-2049 < (param1 ^ -1)) {
                stackOut_4_0 = lp.field_c[-param1 + 2048];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -lp.field_c[param1 + -2048];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_i = null;
        field_g = null;
    }

    final void d(int param0) {
        ec var2 = null;
        ec var3 = null;
        if (param0 != 18580) {
          L0: {
            ((u) this).field_h = 1.6919490098953247f;
            if (0 == ((u) this).field_b.M(7693)) {
              var2 = ((u) this).field_b.J(100);
              ((u) this).field_b.a(1, (byte) 89);
              var3 = ((u) this).field_b.d(param0 ^ 30883);
              var3.a((ao) (Object) var2, true);
              var3.a(0.125f, 1.0f, 0.125f, 0);
              var3.b(0.0f, (byte) -125, ((u) this).field_h, 0.0f);
              ((u) this).field_b.a(qn.field_a, (byte) 123);
              ((u) this).field_b.a(0, (byte) 111);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (0 == ((u) this).field_b.M(7693)) {
              var2 = ((u) this).field_b.J(100);
              ((u) this).field_b.a(1, (byte) 89);
              var3 = ((u) this).field_b.d(param0 ^ 30883);
              var3.a((ao) (Object) var2, true);
              var3.a(0.125f, 1.0f, 0.125f, 0);
              var3.b(0.0f, (byte) -125, ((u) this).field_h, 0.0f);
              ((u) this).field_b.a(qn.field_a, (byte) 123);
              ((u) this).field_b.a(0, (byte) 111);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
    }
}
