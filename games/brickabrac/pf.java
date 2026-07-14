/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf implements ub {
    static String field_a;
    static int field_i;
    private int field_j;
    private int field_e;
    private int field_g;
    private dh field_l;
    static int[] field_b;
    static String field_c;
    private int field_o;
    private int field_m;
    static boolean field_p;
    private int field_k;
    static boolean field_d;
    static mh field_h;
    private int field_n;
    static boolean field_f;

    final static mp a(boolean param0, String param1) {
        String var2 = null;
        mp var3 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        CharSequence var23 = null;
        CharSequence var24 = null;
        CharSequence var25 = null;
        var16 = null;
        var17 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var22 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (of.field_i != null) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var23 = (CharSequence) (Object) param1;
              var2 = gb.a(var23, 75);
              if (var2 != null) {
                var3 = (mp) (Object) of.field_i.a((long)var2.hashCode(), -1);
                if (param0) {
                  field_f = false;
                  L0: while (true) {
                    if (var3 != null) {
                      var25 = (CharSequence) (Object) var3.field_Rb;
                      var7 = gb.a(var25, 117);
                      if (var7.equals((Object) (Object) var2)) {
                        return var3;
                      } else {
                        var3 = (mp) (Object) of.field_i.a((byte) 127);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  L1: while (true) {
                    if (var3 != null) {
                      var24 = (CharSequence) (Object) var3.field_Rb;
                      var6 = gb.a(var24, 117);
                      if (var6.equals((Object) (Object) var2)) {
                        return var3;
                      } else {
                        var3 = (mp) (Object) of.field_i.a((byte) 127);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vh var14 = null;
        oc stackIn_3_0 = null;
        oc stackOut_2_0;
        Object stackOut_1_0;
        L0: {
          if (param3 instanceof vh) {
            stackOut_2_0 = (oc) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (oc) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (vh) (Object) stackIn_3_0;
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          lb.g(param3.field_o + param2, param3.field_w + param4, param3.field_t, param3.field_s, ((pf) this).field_o);
          var7 = var14.field_Z + param2 - -param3.field_o;
          var8 = var14.field_R + (param4 + param3.field_w);
          lb.f(var7, var8, var14.field_W, ((pf) this).field_e);
          if (var14.field_Q != -1) {
            var9 = 3.141592653589793 * (double)var14.field_Q * 2.0 / (double)var14.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_W);
            var12 = (int)(Math.cos(var9) * (double)var14.field_W);
            lb.f(var7 + var11, var12 + var8, 1, ((pf) this).field_m);
            break L2;
          } else {
            break L2;
          }
        }
        lb.f(var7, var8, 2, 1);
        if (param1 != -20618) {
          return;
        } else {
          L3: {
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_O) / (double)var14.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_W);
            var12 = (int)(Math.cos(var9) * (double)var14.field_W);
            lb.d(var7, var8, var11 + var7, var8 + var12, 1);
            if (((pf) this).field_l != null) {
              var13 = var14.field_Z + var14.field_W + ((pf) this).field_n;
              int discarded$1 = ((pf) this).field_l.a(param3.field_A, param3.field_o + param2 - -var13, param4 + (param3.field_w + ((pf) this).field_g), param3.field_t - (((pf) this).field_n + var13), param3.field_s + -(((pf) this).field_n << 1398127169), ((pf) this).field_k, ((pf) this).field_j, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final static void a(int param0, String param1) {
        ai.field_t = param1;
        int var2 = 7 / ((-10 - param0) / 51);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          boolean discarded$2 = pf.a(false, 38);
          field_b = null;
          field_c = null;
          field_h = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_h = null;
          return;
        }
    }

    final static void a(int param0, byte[] param1, mf param2, String[] param3, int param4, boolean param5, jp[][] param6, mf param7, int param8, int[] param9, String[] param10, jp[][] param11, tp[] param12, int param13, byte[] param14, String[][] param15, String[] param16, String[][] param17, int[] param18, mf param19) {
        hc.a((byte) 113, param12, param9, param7, param19);
        fr.a(param7, (byte) 121);
        if (param4 != -27460) {
            field_i = 90;
        }
        sl.a(param17, param11, 45, param10, param13, param1, param3, param7, param18, param6, param14, param0, param16, param8, param15);
        ed.a(param5, param7, param2, (byte) 104);
        dj.b((byte) 13);
        h.g((byte) -24);
        nb.b((byte) 40);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            if (param1) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(hg.a(param0, var2, -1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, int param1) {
        Object var3 = null;
        if (!param0) {
          if (null != hd.field_d) {
            if (null != hd.field_d) {
              if (hd.field_d.field_a != param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (param1 != lp.field_rb.field_a) {
              if (null != hd.field_d) {
                if (hd.field_d.field_a != param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          var3 = null;
          pf.a(97, (byte[]) null, (mf) null, (String[]) null, 18, true, (jp[][]) null, (mf) null, -121, (int[]) null, (String[]) null, (jp[][]) null, (tp[]) null, -69, (byte[]) null, (String[][]) null, (String[]) null, (String[][]) null, (int[]) null, (mf) null);
          if (null == hd.field_d) {
            if (param1 != lp.field_rb.field_a) {
              if (null != hd.field_d) {
                if (hd.field_d.field_a != param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (null != hd.field_d) {
              if (hd.field_d.field_a != param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    pf(dh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((pf) this).field_n = param1;
        ((pf) this).field_o = param7;
        ((pf) this).field_m = param6;
        ((pf) this).field_k = param3;
        ((pf) this).field_g = param2;
        ((pf) this).field_l = param0;
        ((pf) this).field_j = param4;
        ((pf) this).field_e = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "There are no valid types of game that match your preferences.";
        field_b = new int[]{25776, 12658477, 16494651, 26679, 16711935};
        field_c = "Rating";
        field_f = false;
    }
}
