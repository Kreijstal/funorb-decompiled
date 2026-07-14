/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lk extends ic implements ec {
    static String field_g;
    static dl field_e;
    private ae field_f;
    static pf field_i;
    static int field_h;
    static int field_j;

    public final void b(ae param0, int param1) {
        if (param1 == 0) {
            return;
        }
        field_i = null;
    }

    public final boolean a(byte param0) {
        Object var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 > 8) {
          if (((lk) this).field_f.field_m != null) {
            if (((lk) this).field_f.field_m.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var3 = null;
          java.net.URL discarded$5 = lk.a((java.applet.Applet) null, (java.net.URL) null, -125);
          if (((lk) this).field_f.field_m == null) {
            return true;
          } else {
            L0: {
              if (((lk) this).field_f.field_m.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final cg c(byte param0) {
        int var2 = 107 / ((-36 - param0) / 52);
        return ((lk) this).a((byte) 102, ((lk) this).field_f.field_m);
    }

    final String b(byte param0) {
        Object var3 = null;
        if (param0 != 36) {
          var3 = null;
          java.net.URL discarded$2 = lk.a((java.applet.Applet) null, (java.net.URL) null, -64);
          return ((lk) this).b((byte) -76, ((lk) this).field_f.field_m);
        } else {
          return ((lk) this).b((byte) -76, ((lk) this).field_f.field_m);
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        var4 = -100 % ((param2 - -13) / 56);
        var3 = null;
        var5 = null;
        if (l.field_g != null) {
          if (l.field_g.equals((Object) (Object) param0.getParameter("settings"))) {
            L0: {
              if (oc.field_a == null) {
                break L0;
              } else {
                if (oc.field_a.equals((Object) (Object) param0.getParameter("session"))) {
                  break L0;
                } else {
                  var5 = oc.field_a;
                  break L0;
                }
              }
            }
            return tg.a(param1, -1, var3, var5, 30403);
          } else {
            L1: {
              var3 = l.field_g;
              var5 = var3;
              var5 = var3;
              if (oc.field_a == null) {
                break L1;
              } else {
                if (oc.field_a.equals((Object) (Object) param0.getParameter("session"))) {
                  break L1;
                } else {
                  var5 = oc.field_a;
                  break L1;
                }
              }
            }
            return tg.a(param1, -1, var3, var5, 30403);
          }
        } else {
          L2: {
            if (oc.field_a == null) {
              break L2;
            } else {
              if (oc.field_a.equals((Object) (Object) param0.getParameter("session"))) {
                break L2;
              } else {
                var5 = oc.field_a;
                break L2;
              }
            }
          }
          return tg.a(param1, -1, var3, var5, 30403);
        }
    }

    abstract cg a(byte param0, String param1);

    abstract String b(byte param0, String param1);

    public final void a(ae param0, int param1) {
        if (param1 != 0) {
            ((lk) this).field_f = null;
            ((lk) this).a(param1 + -125);
            return;
        }
        ((lk) this).a(param1 + -125);
    }

    lk(ae param0) {
        ((lk) this).field_f = param0;
    }

    final static void e(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        var4 = stellarshard.field_B;
        cc.a();
        fc.field_e = 11;
        ol.field_g = new int[260];
        if (param0 == 25536) {
          var1 = 0;
          L0: while (true) {
            if (-257 >= (var1 ^ -1)) {
              var5 = 256;
              var1 = var5;
              L1: while (true) {
                if (ol.field_g.length > var5) {
                  ol.field_g[var5] = 255;
                  var5++;
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              var2 = 15.0;
              ol.field_g[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
              var1++;
              continue L0;
            }
          }
        } else {
          field_e = null;
          var1 = 0;
          L2: while (true) {
            if (-257 >= (var1 ^ -1)) {
              var5 = 256;
              var1 = var5;
              L3: while (true) {
                if (ol.field_g.length > var5) {
                  ol.field_g[var5] = 255;
                  var5++;
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              var2 = 15.0;
              ol.field_g[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
              var1++;
              continue L2;
            }
          }
        }
    }

    public static void d(int param0) {
        field_e = null;
        field_i = null;
        field_g = null;
        int var1 = 85 % ((-18 - param0) / 55);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Congratulations, stellarshard completed!<br>";
    }
}
