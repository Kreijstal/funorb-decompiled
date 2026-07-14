/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends aj {
    static int field_x;
    private jj[] field_w;
    static String field_v;
    private jj field_y;
    static int field_u;

    final void a(byte param0, mg param1) {
        jj[] var3 = null;
        int var4 = 0;
        jj var5 = null;
        int var6 = 0;
        Object var7 = null;
        jj[] var8 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        var8 = ((nl) this).field_w;
        var3 = var8;
        var4 = 0;
        L0: while (true) {
          if (var8.length <= var4) {
            L1: {
              if (param0 < -113) {
                break L1;
              } else {
                var7 = null;
                ((nl) this).a((byte) -103, (mg) null);
                break L1;
              }
            }
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_c = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(mg[] param0, int param1) {
        jj[] var3 = null;
        int var4 = 0;
        jj var5 = null;
        int var6 = 0;
        Object var7 = null;
        jj[] var8 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        var8 = ((nl) this).field_w;
        var3 = var8;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var8.length) {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                var7 = null;
                nl.a(38, (String[]) null);
                break L1;
              }
            }
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_k = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(java.math.BigInteger param0, jc param1, jc param2, java.math.BigInteger param3, int param4) {
        bl.a(0, param1.field_l, param0, param2, param1.field_g, param3, param4);
    }

    final static void a(java.applet.Applet param0, int param1) {
        CharSequence var3 = null;
        String var2 = param0.getParameter("username");
        if (param1 != 17574) {
            return;
        }
        if (var2 != null) {
            var3 = (CharSequence) (Object) var2;
            // ifeq L44
        } else {
            return;
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        jj var7 = null;
        jj var9 = null;
        tg var10 = null;
        jj var11 = null;
        jj var12 = null;
        jj var13 = null;
        jj var14 = null;
        fi stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        fi stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof tg)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (fi) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (fi) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (tg) (Object) stackIn_3_0;
          uk.a(param1.field_m + param3 + param1.field_u, 6, param0 + param1.field_l, param1.field_g + param0 + param1.field_l, param3 + param1.field_u);
          if (var10 != null) {
            param2 = param2 & var10.field_C;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = ((nl) this).field_w[0];
          ((nl) this).field_y.a(31749);
          var7.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
          if (var10 == null) {
            break L2;
          } else {
            L3: {
              if (!var10.field_z) {
                break L3;
              } else {
                var11 = ((nl) this).field_w[1];
                if (var11 != null) {
                  var11.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (!var10.field_p) {
              break L2;
            } else {
              L4: {
                var12 = ((nl) this).field_w[3];
                if (var10.field_i == 0) {
                  break L4;
                } else {
                  if (var12 == null) {
                    break L4;
                  } else {
                    var12.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
                    break L2;
                  }
                }
              }
              var9 = ((nl) this).field_w[2];
              if (var9 == null) {
                break L2;
              } else {
                var9.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
                break L2;
              }
            }
          }
        }
        L5: {
          if (param1.f(true)) {
            var13 = ((nl) this).field_w[5];
            if (var13 != null) {
              var13.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (param2) {
            break L6;
          } else {
            var14 = ((nl) this).field_w[4];
            if (var14 != null) {
              var14.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          ((nl) this).field_y.a(param1, param4 ^ -23296, (nl) this, param3, param0);
          if (param4 == -23294) {
            break L7;
          } else {
            ((nl) this).field_y = null;
            break L7;
          }
        }
        ai.a(true);
    }

    final static void a(int param0, String[] param1) {
        if (null != tk.field_b) {
            tk.field_b.field_H.a(param1, (byte) 72);
        }
        if (!(null == qi.field_c)) {
            qi.field_c.field_F.a(param1, (byte) 56);
        }
        if (param0 != -22063) {
            Object var3 = null;
            nl.a((java.applet.Applet) null, 68);
        }
    }

    final void a(int param0, mg[] param1, byte param2) {
        if (param2 >= -119) {
            return;
        }
        int var4 = param0;
        if (((nl) this).field_w[var4] == null) {
            ((nl) this).field_w[var4] = new jj();
        }
        ((nl) this).field_w[param0].field_k = param1;
    }

    final jj a(byte param0, int param1) {
        if (param0 < 77) {
            field_v = null;
        }
        ((nl) this).field_w[param1] = new jj();
        return new jj();
    }

    final static int b(int param0) {
        if (param0 != 4) {
            return -116;
        }
        return (qe.field_m << -860508766) + (ca.field_D << 286808740) - -el.field_t;
    }

    public static void c(int param0) {
        field_v = null;
        if (param0 < 119) {
            nl.c(46);
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, boolean param10, boolean param11, int param12, int param13) {
        wc.field_g = null;
        qk.b((byte) 59);
        param0 = mc.a(param4, param0, false, param3, param1, param2, param9);
        if (param12 != 0) {
            return;
        }
        ha.a(param2, param10, param11, 104, param6, param7, param8, param5, param0, param13);
        eg.a(param8, -98, param10);
        ac.a(param8, -1, param3, param0);
    }

    public nl() {
        ((nl) this).field_w = new jj[6];
        ((nl) this).field_y = new jj();
        ((nl) this).field_w[0] = new jj();
        jj var1 = new jj();
        var1.a(31749);
    }

    private final void a(int param0, boolean param1, nl param2) {
        int var4 = 0;
        jj var5 = null;
        jj var6 = null;
        int var7 = 0;
        jj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        jj stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        jj stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        jj stackIn_11_2 = null;
        jj stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        jj stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        jj stackOut_10_2 = null;
        jj stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        jj stackOut_9_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        if (param0 == 3) {
          L0: {
            super.a(0, (aj) (Object) param2);
            if (param1) {
              var4 = 0;
              L1: while (true) {
                if ((var4 ^ -1) <= -7) {
                  break L0;
                } else {
                  var5 = ((nl) this).field_w[var4];
                  if (var5 != null) {
                    L2: {
                      var6 = param2.field_w[var4];
                      stackOut_8_0 = (jj) var5;
                      stackOut_8_1 = param0 + 13595;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var6 == null) {
                        param2.field_w[var4] = new jj();
                        stackOut_10_0 = (jj) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = new jj();
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L2;
                      } else {
                        stackOut_9_0 = (jj) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = (jj) var6;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L2;
                      }
                    }
                    ((jj) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                    var4++;
                    continue L1;
                  } else {
                    param2.field_w[var4] = null;
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              ek.a((Object[]) (Object) ((nl) this).field_w, 0, (Object[]) (Object) param2.field_w, 0, 6);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    nl(nl param0, boolean param1) {
        this();
        param0.a(3, param1, (nl) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_u = 0;
    }
}
