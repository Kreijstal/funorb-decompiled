/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uq extends ms {
    static int[] field_u;
    static String field_v;
    static String field_w;
    int field_z;
    static String field_x;
    static String field_y;

    final static int a(String param0, gl param1, int param2, int param3, int param4, gl param5, boolean param6) {
        int stackIn_4_0 = 0;
        vh stackIn_10_0 = null;
        vh stackIn_11_0 = null;
        String stackIn_11_1 = null;
        vh stackIn_13_0 = null;
        vh stackIn_14_0 = null;
        String stackIn_14_1 = null;
        int stackIn_31_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param1.a(param2 ^ -20049);
              var8 = param5.a(-91);
              if (null != am.field_z) {
                break L1;
              } else {
                if (tb.a(false, 0)) {
                  break L1;
                } else {
                  stackIn_4_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (ov.field_g == sg.field_a) {
                L3: {
                  vl.field_n.field_q = 0;
                  cv.field_s = null;
                  if (param0 != null) {
                    L4: {
                      var9 = 0;
                      vd.field_b.field_q = 0;
                      if (param6) {
                        var9 = var9 | 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      vd.field_b.a((byte) -108, iq.field_e.nextInt());
                      vd.field_b.a((byte) -52, iq.field_e.nextInt());
                      vd.field_b.a(var14, 413740432);
                      vd.field_b.a(var8, 413740432);
                      var15 = (CharSequence) ((Object) param0);
                      vd.field_b.a(ea.a(param2 + 18820, var15), 413740432);
                      vd.field_b.b(true, param4);
                      vd.field_b.b(1, param3);
                      vd.field_b.b(param2 + 20033, var9);
                      vl.field_n.b(param2 + 20033, 18);
                      vl.field_n.field_q = vl.field_n.field_q + 2;
                      var10 = vl.field_n.field_q;
                      var11_ref_String = mg.a(0, ag.d((byte) 55));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    vl.field_n.b(var11_ref_String, param2 + 33883);
                    fp.a(mu.field_c, cs.field_cb, (byte) 26, vd.field_b, vl.field_n);
                    vl.field_n.f(0, -var10 + vl.field_n.field_q);
                    break L3;
                  } else {
                    L6: {
                      vd.field_b.field_q = 0;
                      vd.field_b.a((byte) -57, iq.field_e.nextInt());
                      vd.field_b.a((byte) -54, iq.field_e.nextInt());
                      stackIn_10_0 = vd.field_b;

                      if (!param1.a((byte) 125)) {
                        stackIn_11_0 = (vh) ((Object) stackIn_10_0);
                        stackIn_11_1 = "";
                        break L6;
                      } else {
                        stackIn_11_0 = (vh) ((Object) stackIn_10_0);
                        stackIn_11_1 = (String) (var14);
                        break L6;
                      }
                    }
                    L7: {
                      ((vh) (Object) stackIn_11_0).a(stackIn_11_1, param2 ^ -413754288);
                      stackIn_13_0 = vd.field_b;

                      if (param5.a((byte) -111)) {
                        stackIn_14_0 = (vh) ((Object) stackIn_13_0);
                        stackIn_14_1 = (String) (var8);
                        break L7;
                      } else {
                        stackIn_14_0 = (vh) ((Object) stackIn_13_0);
                        stackIn_14_1 = "";
                        break L7;
                      }
                    }
                    ((vh) (Object) stackIn_14_0).a(stackIn_14_1, 413740432);
                    vl.field_n.b(1, 16);
                    vl.field_n.field_q = vl.field_n.field_q + 1;
                    var9 = vl.field_n.field_q;
                    fp.a(mu.field_c, cs.field_cb, (byte) 26, vd.field_b, vl.field_n);
                    vl.field_n.e(vl.field_n.field_q + -var9, 5930);
                    break L3;
                  }
                }
                hb.a((byte) 54, -1);
                ov.field_g = cj.field_m;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (ov.field_g != cj.field_m) {
                break L8;
              } else {
                if (es.a(param2 ^ 20080, 1)) {
                  L9: {
                    var9 = mg.field_e.k(0);
                    mg.field_e.field_q = 0;
                    if (-101 < (var9 ^ -1)) {
                      break L9;
                    } else {
                      if (var9 > 105) {
                        break L9;
                      } else {
                        ov.field_g = mv.field_c;
                        br.field_b = new String[var9 - 100];
                        break L8;
                      }
                    }
                  }
                  if (var9 != 248) {
                    if ((var9 ^ -1) == -100) {
                      es.a(-81, qa.h(1));
                      cv.field_s = new Boolean(rr.a((byte) -76, mg.field_e));
                      mg.field_e.field_q = 0;
                      break L8;
                    } else {
                      fk.field_b = -1;
                      nm.field_o = var9;
                      ov.field_g = da.field_b;
                      break L8;
                    }
                  } else {
                    tf.a((byte) -99, ag.d((byte) -127));
                    lk.field_r = om.field_s;
                    dj.a((byte) -128);
                    ev.field_b = false;
                    stackIn_31_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (mv.field_c == ov.field_g) {
                var9 = 2;
                if (es.a(-79, var9)) {
                  var10 = mg.field_e.e((byte) -104);
                  mg.field_e.field_q = 0;
                  if (!es.a(-83, var10)) {
                    break L10;
                  } else {
                    var11 = br.field_b.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        dj.a((byte) -128);
                        ev.field_b = false;
                        stackIn_44_0 = 100 - -var11;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        br.field_b[var12] = mg.field_e.h((byte) 121);
                        var12++;
                        continue L11;
                      }
                    }
                  }
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (da.field_b == ov.field_g) {
                if (!jh.g(2)) {
                  break L12;
                } else {
                  L13: {
                    if (-256 == (nm.field_o ^ -1)) {
                      var9_ref_String = mg.field_e.c((byte) -85);
                      if (var9_ref_String == null) {
                        break L13;
                      } else {
                        ph.a(var9_ref_String, ag.d((byte) -5), false);
                        break L13;
                      }
                    } else {
                      lk.field_r = mg.field_e.g(1);
                      break L13;
                    }
                  }
                  dj.a((byte) -127);
                  ev.field_b = false;
                  stackIn_53_0 = nm.field_o;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                break L12;
              }
            }
            L14: {
              if (param2 == -20032) {
                break L14;
              } else {
                field_v = (String) null;
                break L14;
              }
            }
            L15: {
              if (am.field_z != null) {
                break L15;
              } else {
                if (!ev.field_b) {
                  var9 = rn.field_d;
                  rn.field_d = sm.field_c;
                  ev.field_b = true;
                  sm.field_c = var9;
                  break L15;
                } else {
                  L16: {
                    if ((ca.b(0) ^ -1L) < -30001L) {
                      lk.field_r = gu.field_a;
                      break L16;
                    } else {
                      lk.field_r = nw.field_y;
                      break L16;
                    }
                  }
                  ev.field_b = false;
                  stackIn_62_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
            stackIn_65_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var7);

            stackIn_68_1 = new StringBuilder().append("uq.D(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L17;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');

            if (param1 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L18;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L19;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L19;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_69_0), stackIn_75_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_44_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_53_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_62_0;
                } else {
                  return stackIn_65_0;
                }
              }
            }
          }
        }
    }

    abstract Object b(boolean param0);

    abstract boolean a(boolean param0);

    public static void g(int param0) {
        if (param0 >= -11) {
            field_y = (String) null;
        }
        field_y = null;
        field_v = null;
        field_x = null;
        field_w = null;
        field_u = null;
    }

    uq(int param0) {
        this.field_z = param0;
    }

    final static ln a(vh param0, boolean param1) {
        ln var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        ln var5 = null;
        ln stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = new ln();
              var2 = var5;
              if (!param1) {
                break L1;
              } else {
                uq.g(56);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if ((var3 ^ -1) <= -7) {
                stackIn_7_0 = (ln) (var2);
                break L0;
              } else {
                var5.field_a[var3] = param0.a((byte) 103);
                var5.field_b[var3] = param0.a((byte) 120);
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("uq.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_u = new int[8192];
        field_w = "Chat view has been scrolled up. Scroll down to chat.";
        field_v = "Fast";
        field_x = "<%0> is not on your ignore list.";
        field_y = "Show chat (1 unread message)";
    }
}
