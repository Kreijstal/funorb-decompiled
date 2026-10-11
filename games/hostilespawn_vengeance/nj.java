/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nj {
    static String field_e;
    static jg field_c;
    static String field_b;
    static int field_a;
    static pg[][] field_d;

    public static void b(byte param0) {
        if (param0 != -93) {
          field_c = (jg) null;
        }
        field_c = null;
        field_d = (pg[][]) null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, bd param4, int param5) {
        if (param3 != 22173) {
          return;
        }
        try {
          ld.a(param1 << 5, (byte) -84, param5 << 8, param0, param4, param2);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "nj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int incrementValue$2 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        p var8_ref_p = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4 = uj.field_p.field_e + 24;
          var5 = uj.field_p.field_g;
          var15 = new int[12];
          var14 = var15;
          var6 = var14;
          var7 = 0;
          for (var1_int = 0; ib.field_c > var1_int; var1_int++) {
            L2: {
              var8_ref_p = jn.field_F[var1_int];
              var9 = var8_ref_p.field_j.b(-4);
              var3 = (int)(24.0 * (var8_ref_p.field_l.field_a + (double)var8_ref_p.field_j.field_g)) - var5;
              var2 = -var4 + (int)(24.0 * (var8_ref_p.field_l.field_f + (double)var8_ref_p.field_j.field_e));
              if (!(var2 < -96) &&
                !(var3 < -96) &&
                !(var2 > 736) &&
                !(var3 > 576) || (5 == var8_ref_p.field_i ||
                24 == var8_ref_p.field_i)) {
                if (var8_ref_p.field_i != 13 &&
                  ln.field_a.field_u[var9] < 24) {
                  ln.field_a.field_u[var9] = 24;
                }
                var10 = 0;
                var12 = var8_ref_p.field_i;
                if (var12 != 20) {
                  if (var12 != 0 &&
                    var12 != 18 &&
                    var12 != 9 &&
                    23 != var12) {
                    switch (var12) {
                      case 32:
                        oa.a(-17652, var3, var8_ref_p, var2);
                        break L2;
                      case 1:
                        var11 = var8_ref_p.field_e / 2;
                        if (0 > var11) {
                          var11 = 0;
                        }
                        if (me.field_ib.length <= var11) {
                          var11 = -1 + me.field_ib.length;
                        }
                        if (bm.field_c != 1) {
                          me.field_ib[var11].c(var2 - me.field_ib[var11].field_z / 2, -(me.field_ib[var11].field_A / 2) + var3, 128);
                          break L2;
                        }
                        if (kd.field_t) {
                          nj.a(var2 - me.field_ib[var11].field_z / 2, 128, -(me.field_ib[var11].field_A / 2) + var3, 22173, me.field_ib[var11], (int)var8_ref_p.field_c);
                          break L2;
                        }
                        if (var11 <= 0) {
                          break L2;
                        }
                        me.field_ib[var11].a(true, 128, (int)var8_ref_p.field_c, var2, var3);
                        break L2;
                      case 2:
                        var10 = 16711680;
                        si.f(var2, var3, var8_ref_p.field_e * 2, var10, 128 - var8_ref_p.field_e * 4);
                        break L2;
                      case 3:
                        nm.a(var2, var8_ref_p, var3, param0 ^ 11187);
                        break L2;
                      case 21:
                        ic.a(var2, var3, var8_ref_p, (byte) 107);
                        break L2;
                      case 17:
                      case 29:
                      case 5:
                      case 7:
                      case 24:
                      case 6:
                      case 37:
                      case 11:
                      case 34:
                      case 33:
                      case 12:
                      case 13:
                      case 14:
                      default:
                        if (var12 != 4 &&
                          var12 != 8) {
                          if (var12 == 17) {
                            pf.a(var3, true, var8_ref_p, var2);
                            break L2;
                          }
                          if (var12 != 29) {
                            if (var12 != 28 &&
                              var12 != 30) {
                              switch (var12) {
                                case 5:
                                  ha.a(var2, param0 ^ -896, var8_ref_p, var3);
                                  break L2;
                                case 7:
                                  if (var7 >= var15.length) {
                                    break L2;
                                  }
                                  var6[var7++] = var2;
                                  var6[var7++] = var3;
                                  incrementValue$2 = var7;
                                  var7++;
                                  var6[incrementValue$2] = (int)var8_ref_p.field_c;
                                  break L2;
                                case 24:
                                  bn.a(true, var3, var8_ref_p, var2);
                                  break L2;
                                case 6:
                                  tm.a((byte) 88, var2, var3, var8_ref_p);
                                  break L2;
                                case 37:
                                  am.a(-1, var3, var2, var8_ref_p);
                                  break L2;
                                case 11:
                                case 34:
                                case 33:
                                case 12:
                                case 13:
                                case 14:
                                default:
                                  if (10 != var12 &&
                                    var12 != 25) {
                                    switch (var12) {
                                      case 11:
                                        ri.a(91, var3, var8_ref_p, var2);
                                        break L2;
                                      case 34:
                                        f.a(var2, var3, var8_ref_p, param0 ^ 11176);
                                        break L2;
                                      case 33:
                                        in.a(param0 ^ 11182, var8_ref_p, var3, var2);
                                        break L2;
                                      case 12:
                                        var11 = var8_ref_p.field_e * ln.field_m.length / 128;
                                        if (var11 >= ln.field_m.length) {
                                          var11 = ln.field_m.length - 1;
                                        }
                                        if (var11 < 0) {
                                          var11 = 0;
                                        }
                                        ln.field_m[var11].a((double)var3, (double)var2, false, var8_ref_p.field_c, 256);
                                        break L2;
                                      case 13:
                                        ka.a(var2, var8_ref_p, var3, 128);
                                        break L2;
                                      case 14:
                                        mg.a(var8_ref_p, var2, var3, 2);
                                        break L2;
                                      default:
                                        if (var12 != 22 &&
                                          var12 != 27) {
                                          break L2;
                                        }
                                        bi.a(var8_ref_p, var3, var2, -49);
                                        break L2;
                                    }
                                  }
                                  el.a(var2, var8_ref_p, param0 - 11295, var3);
                                  break L2;
                              }
                            }
                            hd.a(var2, -110, var3, var8_ref_p);
                            break L2;
                          }
                        }
                        pf.a(var3, true, var8_ref_p, var2);
                        break L2;
                    }
                  }
                  gb.a(var3, (byte) 81, var8_ref_p, var2);
                } else {
                  wi.a(var8_ref_p, var2, (byte) -87, var3);
                }
              }
            }
          }
          if (param0 != 11178) {
            return;
          }
          for (var8 = 0; var7 > var8; var8 += 3) {
            var3 = var6[1 + var8];
            var2 = var15[var8];
            var9 = var6[2 + var8];
            ue.field_c.a(true, 128, var9, var2, var3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "nj.A(" + param0 + ')');
        }
    }

    final static java.net.URL a(java.applet.Applet param0, boolean param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (null != bi.field_g &&
            !bi.field_g.equals(param0.getParameter("settings"))) {
            var3 = bi.field_g;
            var4 = var3;
            var4 = var3;
          }
          if (vh.field_c != null &&
            !vh.field_c.equals(param0.getParameter("session"))) {
            var4 = vh.field_c;
          }
          if (param1) {
            stackIn_11_0 = ig.a(true, param2, (String) (var3), -1, (String) (var4));
            return stackIn_11_0;
          }
          stackIn_9_0 = (java.net.URL) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("nj.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static gb a(int param0, int param1, boolean param2, boolean param3, int param4) {
        if (param0 <= 66) {
          return (gb) null;
        }
        return bf.a(false, param2, param1, param4, param3, -31);
    }

    final static int a(oc param0, oc param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_e <= param0.field_e) {
            stackIn_3_0 = param0.field_e - param1.field_e;
          } else {
            stackIn_3_0 = param1.field_e - param0.field_e;
          }
          var3_int = stackIn_3_0;
          if (param2 != -28835) {
            nj.b((byte) -110);
          }
          if (param1.field_g <= param0.field_g) {
            stackIn_8_0 = param0.field_g - param1.field_g;
          } else {
            stackIn_8_0 = -param0.field_g + param1.field_g;
          }
          var4 = stackIn_8_0;
          stackIn_11_0 = (var3_int >= var4) ? var3_int : var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("nj.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract void a(int param0, byte[] param1);

    abstract byte[] a(byte param0);

    static {
        field_e = "Hard mode";
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_c = new jg();
    }
}
