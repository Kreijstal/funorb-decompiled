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
        try {
            ((u) this).field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "u.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
        }
        ((u) this).field_b.a(true, 0, true, dl.field_p, false);
        ((u) this).field_b.a(un.field_i, 0, 0);
        ((u) this).field_b.c(0, (byte) -86);
        ((u) this).field_b.a(0, (byte) 127);
        ((u) this).field_b.a((byte) -74, -16777216);
        ((u) this).field_b.a(bs.field_a, 0, 0);
        ((u) this).d(18580);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = AceOfSkies.field_G ? 1 : 0;
          if (param0 == 1786747298) {
            break L0;
          } else {
            var6 = null;
            ((u) this).a(-79, -84, (jj) null);
            break L0;
          }
        }
        L1: {
          ((u) this).field_b.a(1, (byte) 111);
          if ((128 & param1) != 0) {
            ((u) this).field_b.a((jj) null, -9135);
            break L1;
          } else {
            if ((1 & param2) != 1) {
              if (!((u) this).field_f.field_e) {
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_i[0], -9135);
                break L1;
              } else {
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_f, -9135);
                break L1;
              }
            } else {
              if (((u) this).field_f.field_e) {
                ((u) this).field_h = (float)(((u) this).field_b.field_r % 4000) / 4000.0f;
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_f, -9135);
                break L1;
              } else {
                var4 = ((u) this).field_b.field_r % 4000 * 16 / 4000;
                ((u) this).field_b.a((jj) (Object) ((u) this).field_f.field_i[var4], -9135);
                break L1;
              }
            }
          }
        }
        ((u) this).field_b.a(0, (byte) 44);
    }

    final static int a(cd param0, int param1, String param2, boolean param3, int param4, int param5, cd param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_5_0 = 0;
        rb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        rb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        rb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        rb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        rb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        rb stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        rb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        rb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        rb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        rb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        rb stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        rb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        int stackOut_34_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var13 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param6.b(-17233);
              var8 = param0.b(-17233);
              if (ft.field_l != null) {
                break L1;
              } else {
                if (!fp.a((byte) -116, false)) {
                  stackOut_4_0 = -1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (ca.field_f == qa.field_b) {
                L3: {
                  q.field_p.field_g = 0;
                  qj.field_r = null;
                  if (param2 != null) {
                    L4: {
                      var9 = 0;
                      fa.field_c.field_g = 0;
                      if (!param3) {
                        break L4;
                      } else {
                        var9 = var9 | 1;
                        break L4;
                      }
                    }
                    L5: {
                      fa.field_c.a((byte) 113, vr.field_h.nextInt());
                      fa.field_c.a((byte) 115, vr.field_h.nextInt());
                      fa.field_c.a(false, var14);
                      fa.field_c.a(false, var8);
                      var15 = (CharSequence) (Object) param2;
                      fa.field_c.a(false, ip.a((byte) -81, var15));
                      fa.field_c.a(param1, 23385);
                      fa.field_c.b(-1336879960, param5);
                      fa.field_c.b(-1336879960, var9);
                      q.field_p.b(-1336879960, 18);
                      q.field_p.field_g = q.field_p.field_g + 2;
                      var10 = q.field_p.field_g;
                      int discarded$7 = 0;
                      var11_ref_String = ao.a(bm.m(108));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    q.field_p.a(-117, var11_ref_String);
                    gn.a(hp.field_j, pb.field_a, (rb) (Object) q.field_p, fa.field_c, 92);
                    q.field_p.a(false, q.field_p.field_g + -var10);
                    break L3;
                  } else {
                    L6: {
                      fa.field_c.field_g = 0;
                      fa.field_c.a((byte) 88, vr.field_h.nextInt());
                      fa.field_c.a((byte) 23, vr.field_h.nextInt());
                      stackOut_9_0 = fa.field_c;
                      stackOut_9_1 = 0;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (param6.a(-109)) {
                        stackOut_11_0 = (rb) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = (String) var14;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        break L6;
                      } else {
                        stackOut_10_0 = (rb) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = "";
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        break L6;
                      }
                    }
                    L7: {
                      ((rb) (Object) stackIn_12_0).a(stackIn_12_1 != 0, stackIn_12_2);
                      stackOut_12_0 = fa.field_c;
                      stackOut_12_1 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (!param0.a(-103)) {
                        stackOut_14_0 = (rb) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = "";
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        break L7;
                      } else {
                        stackOut_13_0 = (rb) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = (String) var8;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        break L7;
                      }
                    }
                    ((rb) (Object) stackIn_15_0).a(stackIn_15_1 != 0, stackIn_15_2);
                    q.field_p.b(-1336879960, 16);
                    q.field_p.field_g = q.field_p.field_g + 1;
                    var9 = q.field_p.field_g;
                    gn.a(hp.field_j, pb.field_a, (rb) (Object) q.field_p, fa.field_c, 78);
                    q.field_p.b(q.field_p.field_g - var9, (byte) 85);
                    break L3;
                  }
                }
                fr.a(-37, -1);
                ca.field_f = mq.field_h;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (mq.field_h == ca.field_f) {
                if (wo.a(1, true)) {
                  L9: {
                    var9 = nm.field_c.g(78);
                    nm.field_c.field_g = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        ca.field_f = kf.field_m;
                        sd.field_j = new String[-100 + var9];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var9 == 248) {
                    oj.a(26099, bm.m(112));
                    rp.field_m = wo.field_h;
                    int discarded$8 = 1;
                    te.b();
                    ld.field_d = false;
                    stackOut_34_0 = var9;
                    stackIn_35_0 = stackOut_34_0;
                    return stackIn_35_0;
                  } else {
                    if (var9 == 99) {
                      int discarded$9 = 1;
                      boolean discarded$10 = wo.a(km.a(), true);
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
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (ca.field_f != kf.field_m) {
                break L10;
              } else {
                var9 = 2;
                if (wo.a(var9, true)) {
                  var10 = nm.field_c.i((byte) 0);
                  nm.field_c.field_g = 0;
                  if (!wo.a(var10, true)) {
                    break L10;
                  } else {
                    var11 = sd.field_j.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var11 <= var12) {
                        int discarded$11 = 1;
                        te.b();
                        ld.field_d = false;
                        stackOut_44_0 = 100 - -var11;
                        stackIn_45_0 = stackOut_44_0;
                        return stackIn_45_0;
                      } else {
                        sd.field_j[var12] = nm.field_c.d((byte) 77);
                        var12++;
                        continue L11;
                      }
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (cd.field_a != ca.field_f) {
                break L12;
              } else {
                if (rm.a(0)) {
                  L13: {
                    if (qs.field_b == 255) {
                      var9_ref_String = nm.field_c.e((byte) -109);
                      if (var9_ref_String != null) {
                        sf.a((byte) -125, bm.m(118), var9_ref_String);
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      rp.field_m = nm.field_c.h(-17883);
                      break L13;
                    }
                  }
                  int discarded$12 = 1;
                  te.b();
                  ld.field_d = false;
                  stackOut_54_0 = qs.field_b;
                  stackIn_55_0 = stackOut_54_0;
                  return stackIn_55_0;
                } else {
                  break L12;
                }
              }
            }
            L14: {
              if (ft.field_l == null) {
                if (!ld.field_d) {
                  var9 = sg.field_b;
                  sg.field_b = ca.field_h;
                  ca.field_h = var9;
                  ld.field_d = true;
                  break L14;
                } else {
                  L15: {
                    int discarded$13 = -1;
                    if (gm.g() <= 30000L) {
                      rp.field_m = jf.field_b;
                      break L15;
                    } else {
                      rp.field_m = rm.field_c;
                      break L15;
                    }
                  }
                  ld.field_d = false;
                  stackOut_62_0 = 249;
                  stackIn_63_0 = stackOut_62_0;
                  return stackIn_63_0;
                }
              } else {
                break L14;
              }
            }
            var9 = 74 % ((-57 - param4) / 47);
            stackOut_65_0 = -1;
            stackIn_66_0 = stackOut_65_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("u.E(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L16;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L16;
            }
          }
          L17: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L17;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L17;
            }
          }
          L18: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param6 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L18;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L18;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ')');
        }
        return stackIn_66_0;
    }

    final void a(int param0, int param1, jj param2) {
        try {
            if (param1 <= 66) {
                int discarded$0 = u.a(97, 109);
            }
            ((u) this).field_b.a(param2, -9135);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "u.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            return true;
        }
        return ((u) this).field_f.b(false);
    }

    final static int a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param0 <= -106) {
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          L1: {
            if (6144 <= param1) {
              stackOut_9_0 = lp.field_c[-6144 + param1];
              stackIn_10_0 = stackOut_9_0;
              break L1;
            } else {
              stackOut_8_0 = -lp.field_c[-param1 + 6144];
              stackIn_10_0 = stackOut_8_0;
              break L1;
            }
          }
          return stackIn_10_0;
        } else {
          L2: {
            if (param1 < 2048) {
              stackOut_5_0 = lp.field_c[-param1 + 2048];
              stackIn_6_0 = stackOut_5_0;
              break L2;
            } else {
              stackOut_4_0 = -lp.field_c[param1 + -2048];
              stackIn_6_0 = stackOut_4_0;
              break L2;
            }
          }
          return stackIn_6_0;
        }
    }

    public static void b() {
        field_i = null;
        field_g = null;
    }

    final void d(int param0) {
        ec var2 = null;
        ec var3 = null;
        if (param0 != 18580) {
            ((u) this).field_h = 1.6919490098953247f;
        }
        if (!(0 != ((u) this).field_b.M(7693))) {
            var2 = ((u) this).field_b.J(100);
            ((u) this).field_b.a(1, (byte) 89);
            var3 = ((u) this).field_b.d(param0 ^ 30883);
            var3.a((ao) (Object) var2, true);
            var3.a(0.125f, 1.0f, 0.125f, 0);
            var3.b(0.0f, (byte) -125, ((u) this).field_h, 0.0f);
            ((u) this).field_b.a(qn.field_a, (byte) 123);
            ((u) this).field_b.a(0, (byte) 111);
        }
    }

    static {
    }
}
