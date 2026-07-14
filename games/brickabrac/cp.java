/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends h {
    private vl field_J;
    static mh field_K;
    static String field_G;
    static jp field_I;
    static String field_H;

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (param1 == 21543) {
            break L0;
          } else {
            var4 = null;
            cp.a(103, 104, 91, (byte) -14, (j) null, 105, 90);
            break L0;
          }
        }
        L1: {
          if (0 >= go.field_c) {
            if (og.h(-26090)) {
              var2 = 0;
              break L1;
            } else {
              var2 = 1;
              break L1;
            }
          } else {
            L2: {
              if (null == jj.field_a) {
                ua.field_d = ff.a(0, 0, 640, 480, true, lp.field_ub);
                break L2;
              } else {
                ua.field_d = jj.field_a.a(true);
                qm.a(97, 2);
                break L2;
              }
            }
            if (ua.field_d == null) {
              var2 = 3;
              break L1;
            } else {
              var2 = 2;
              ap.a((byte) 117, (java.awt.Canvas) (Object) ua.field_d);
              break L1;
            }
          }
        }
        L3: {
          if (null != jj.field_a) {
            break L3;
          } else {
            if (!gh.field_c) {
              break L3;
            } else {
              bq.a(param0, var2, (byte) 104);
              break L3;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (((cp) this).field_l != null) {
            ((cp) this).field_l.a(true, param3 + -20607, param1, (oc) this, param0);
        }
        kh var5 = new kh(((cp) this).field_J);
        oc var6 = (oc) (Object) var5.a(true);
        while (var6 != null) {
            var6.a(param0 - -((cp) this).field_w, param1 - -((cp) this).field_o, param2, (byte) -11);
            var6 = (oc) (Object) var5.d(-24706);
        }
        if (param3 != -11) {
            field_G = null;
        }
    }

    public static void j(byte param0) {
        field_I = null;
        field_G = null;
        if (param0 > -91) {
            Object var2 = null;
            cp.a(-80, 69, (ta) null, 50, (ta) null, -32);
        }
        field_H = null;
        field_K = null;
    }

    final void a(int param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 > -119) {
            return;
        }
        kh var2 = new kh(((cp) this).field_J);
        jc var3 = (jc) (Object) var2.a(240);
        while (var3 != null) {
            var3.field_N = false;
            var3 = (jc) (Object) var2.b(7);
        }
        ((cp) this).field_E = null;
    }

    final void a(int param0, oc param1) {
        if (!(param1 instanceof jc)) {
            throw new IllegalArgumentException();
        }
        jc var3 = (jc) (Object) param1;
        if (param0 > -63) {
            cp.j((byte) -73);
        }
        ((cp) this).field_J.a(true, (nm) (Object) var3);
        var3.field_N = true;
        boolean discarded$0 = var3.a(true, (oc) this);
    }

    final void i(byte param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        kh var2 = new kh(((cp) this).field_J);
        jc var3 = (jc) (Object) var2.a(240);
        if (param0 != -36) {
            return;
        }
        while (var3 != null) {
            if (!(!var3.a(-94))) {
                var3.b((byte) 111);
            }
            var3 = (jc) (Object) var2.b(param0 ^ -37);
        }
    }

    public cp() {
        super(0, 0, mn.field_y, r.field_w, (ub) null, (uh) null);
        ((cp) this).field_J = new vl();
    }

    final static lo a(String param0, byte param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        lo var5 = null;
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length() != 0) {
              var2 = param0.indexOf('@');
              if (-1 != var2) {
                var3 = param0.substring(0, var2);
                var4 = param0.substring(var2 - -1);
                if (param1 < -16) {
                  var5 = h.a(var3, false);
                  if (var5 == null) {
                    return ji.a(var4, 0);
                  } else {
                    return var5;
                  }
                } else {
                  return null;
                }
              } else {
                return la.field_a;
              }
            } else {
              break L0;
            }
          }
        }
        return tl.field_b;
    }

    final static void a(int param0, int param1, ta param2, int param3, ta param4, int param5) {
        kn.field_y = param1;
        cn.field_c = param5;
        if (param3 <= 25) {
            cp.h(24);
        }
        cd.field_c = param4;
        jb.field_H = param0;
        c.field_l = param2;
    }

    final void i(int param0) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var3 = 18 / ((36 - param0) / 43);
        kh var2 = new kh(((cp) this).field_J);
        jc var4 = (jc) (Object) var2.a(240);
        while (var4 != null) {
            if (var4.h(0)) {
                var4.b((byte) 111);
            }
            var4 = (jc) (Object) var2.b(7);
        }
        ((cp) this).field_E = (oc) (Object) ((cp) this).g(-126);
    }

    final static void h(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        ta var9 = null;
        int var10 = 0;
        Object var11 = null;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_32_0 = null;
        int stackIn_38_0 = 0;
        ta stackIn_43_0 = null;
        int stackOut_17_0;
        int stackOut_16_0;
        int stackOut_20_0;
        int stackOut_19_0;
        String stackOut_25_0;
        String stackOut_24_0;
        String stackOut_31_0;
        String stackOut_30_0;
        int stackOut_37_0;
        int stackOut_36_0;
        ta stackOut_42_0;
        ta stackOut_41_0;
        L0: {
          var10 = BrickABrac.field_J ? 1 : 0;
          var1 = jq.field_r;
          var2 = 0;
          if (param0 == -16546) {
            break L0;
          } else {
            var11 = null;
            cp.a(-114, -15, 90, (byte) -109, (j) null, -85, -67);
            break L0;
          }
        }
        L1: {
          if (-3 != (ih.field_p ^ -1)) {
            break L1;
          } else {
            var3_long = -un.field_g + ue.a(false);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (0 > var2) {
              var2 = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        var3 = 0;
        L2: while (true) {
          if (qh.field_i.length <= var3) {
            return;
          } else {
            L3: {
              var4 = BrickABrac.field_K[var3];
              if (-1 < (var4 ^ -1)) {
                var5 = cc.field_H;
                break L3;
              } else {
                if (mh.field_H.field_j != var4) {
                  var5 = eb.field_n;
                  break L3;
                } else {
                  var5 = vq.field_A;
                  break L3;
                }
              }
            }
            L4: {
              var6 = qh.field_i[var3];
              if (2 != ih.field_p) {
                break L4;
              } else {
                if (1 != var2) {
                  break L4;
                } else {
                  L5: {
                    if (rg.field_k.length >= ik.field_b.length) {
                      stackOut_17_0 = rg.field_k.length;
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = ik.field_b.length;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_18_0;
                    if (fk.field_h.length <= h.field_F.length) {
                      stackOut_20_0 = h.field_F.length;
                      stackIn_21_0 = stackOut_20_0;
                      break L6;
                    } else {
                      stackOut_19_0 = fk.field_h.length;
                      stackIn_21_0 = stackOut_19_0;
                      break L6;
                    }
                  }
                  L7: {
                    var8 = stackIn_21_0;
                    if ((var3 ^ -1) > -7) {
                      break L7;
                    } else {
                      if (6 - -var7 <= var3) {
                        break L7;
                      } else {
                        L8: {
                          if (-var7 + -6 + var3 - -rg.field_k.length < 0) {
                            stackOut_25_0 = "";
                            stackIn_26_0 = stackOut_25_0;
                            break L8;
                          } else {
                            stackOut_24_0 = rg.field_k[-var7 + var3 + (-6 + rg.field_k.length)];
                            stackIn_26_0 = stackOut_24_0;
                            break L8;
                          }
                        }
                        var6_ref = (String) (Object) stackIn_26_0;
                        break L7;
                      }
                    }
                  }
                  if (7 + var7 > var3) {
                    break L4;
                  } else {
                    if (7 - (-var7 + -var8) <= var3) {
                      break L4;
                    } else {
                      L9: {
                        if (-var7 + (var3 - 7) < h.field_F.length) {
                          stackOut_31_0 = h.field_F[var3 + (-7 + -var7)];
                          stackIn_32_0 = stackOut_31_0;
                          break L9;
                        } else {
                          stackOut_30_0 = "";
                          stackIn_32_0 = stackOut_30_0;
                          break L9;
                        }
                      }
                      var6_ref = (String) (Object) stackIn_32_0;
                      break L4;
                    }
                  }
                }
              }
            }
            L10: {
              if (-2 != var4) {
                break L10;
              } else {
                var6_ref = Integer.toString(var2);
                break L10;
              }
            }
            L11: {
              if (0 > var4) {
                stackOut_37_0 = 0;
                stackIn_38_0 = stackOut_37_0;
                break L11;
              } else {
                stackOut_36_0 = 1;
                stackIn_38_0 = stackOut_36_0;
                break L11;
              }
            }
            L12: {
              var7 = hm.a(stackIn_38_0 != 0, var6_ref, 0);
              var8 = wi.field_k + -(var7 >> 1509099745);
              if (var4 >= 0) {
                L13: {
                  var1 = var1 + kn.field_y;
                  if (mh.field_H.field_j != var4) {
                    stackOut_42_0 = cd.field_c;
                    stackIn_43_0 = stackOut_42_0;
                    break L13;
                  } else {
                    stackOut_41_0 = c.field_l;
                    stackIn_43_0 = stackOut_41_0;
                    break L13;
                  }
                }
                L14: {
                  var9 = (ta) (Object) stackIn_43_0;
                  if (var9 != null) {
                    var9.a((cn.field_c << 639194529) + var7, b.field_c + (jb.field_H << 857598337), -cn.field_c + var8, false, var1);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var1 = var1 + jb.field_H;
                break L12;
              } else {
                break L12;
              }
            }
            if (-1 >= (var4 ^ -1)) {
              kp.field_b.c(var6_ref, var8, var1 - -so.field_b, var5, -1);
              var1 = var1 + (jb.field_H + (kn.field_y - -b.field_c));
              var3++;
              continue L2;
            } else {
              ni.field_Wb.c(var6_ref, var8, var1 + ae.field_f, var5, -1);
              var1 = var1 + pe.field_s;
              var3++;
              continue L2;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, j param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        jp var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackOut_5_0;
        int stackOut_5_1;
        int stackOut_5_2;
        int stackOut_7_0;
        int stackOut_7_1;
        int stackOut_7_2;
        int stackOut_7_3;
        int stackOut_6_0;
        int stackOut_6_1;
        int stackOut_6_2;
        int stackOut_6_3;
        if (-51 < param4.field_U) {
          return;
        } else {
          L0: {
            var7 = param4.field_U - 50;
            var8 = var7 * 96 / 100;
            if (-97 >= var8) {
              break L0;
            } else {
              var8 = 96;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = param0;
            stackOut_5_1 = param5;
            stackOut_5_2 = param1 / param6;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            if (-2 != (param6 ^ -1)) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              break L1;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = 35;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              break L1;
            }
          }
          L2: {
            lb.d(stackIn_8_0, stackIn_8_1, stackIn_8_2, -stackIn_8_3 + param2 / param6, 0, var8);
            if (150 >= var7 * 2) {
              break L2;
            } else {
              if ((param4.field_zb ^ -1) >= -1) {
                break L2;
              } else {
                if (param4.field_zb + -1 < a.field_s.length) {
                  L3: {
                    var8 = -75 + var7;
                    if (50 < var8) {
                      var8 = 50;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8 = 256 * var8 / 50;
                  var9 = a.field_s[param4.field_zb + -1];
                  var9.b(param0 + (param1 + -(param6 * var9.field_x)) / (param6 * 2), param5 + (param2 + -(var9.field_z * param6)) / (param6 * 2), var8);
                  lo.a(param1, var8, 60, param0, param6, param5, param2, param4);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
          }
          L4: {
            if (param3 >= 118) {
              break L4;
            } else {
              cp.a(true, 86);
              break L4;
            }
          }
          return;
        }
    }

    final static eg b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = BrickABrac.field_J ? 1 : 0;
        eg var5 = (eg) (Object) qc.field_n.d(-91);
        while (var5 != null) {
            if (var5.field_l == param1) {
                return var5;
            }
            var5 = (eg) (Object) qc.field_n.a((byte) 116);
        }
        eg var7 = new eg();
        eg var5_ref = var7;
        var7.field_q = param3;
        var7.field_p = param2;
        if (param0 != -2) {
            return null;
        }
        var5_ref.field_l = param1;
        qc.field_n.a((nm) (Object) var5_ref, (byte) 3);
        uo.a(var5_ref, param4, (byte) 68);
        return var5_ref;
    }

    final oc h(byte param0) {
        kh var2 = null;
        jc var3 = null;
        int var4 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          var2 = new kh(((cp) this).field_J);
          if (param0 == 25) {
            break L0;
          } else {
            cp.j((byte) -34);
            break L0;
          }
        }
        var3 = (jc) (Object) var2.a(param0 + 215);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_N) {
              var3 = (jc) (Object) var2.b(7);
              continue L1;
            } else {
              return var3.g((byte) -3);
            }
          } else {
            return null;
          }
        }
    }

    final jc g(int param0) {
        kh var2 = null;
        jc var3 = null;
        int var4 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          if (param0 < -96) {
            break L0;
          } else {
            field_G = null;
            break L0;
          }
        }
        var2 = new kh(((cp) this).field_J);
        var3 = (jc) (Object) var2.a(240);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_N) {
              return var3;
            } else {
              var3 = (jc) (Object) var2.b(7);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<%0> would need a rating of <%1> to play with the current options.";
        field_G = "Confirm Password: ";
    }
}
