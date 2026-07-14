/*
 * Decompiled by CFR-JS 0.4.0.
 */
class te extends s {
    static String field_J;
    static int field_O;
    static boolean field_G;
    private String[] field_K;
    static String field_L;
    private cc field_H;
    static String[] field_N;
    private im field_I;
    static fk field_M;

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 != 53) {
            return;
        }
        ((te) this).a(param3, param0, ((rj) (Object) ((te) this).field_j).b((pj) this, true), (byte) -90, param2);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((te) this).a((byte) -127);
    }

    te(String param0, td param1) {
        super(param0, (ag) null);
        ((te) this).field_H = null;
        ((te) this).field_j = param1;
    }

    final void a(int param0, String param1, int param2) {
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        if (param2 != 2) {
            return;
        }
        if (null != ((te) this).field_K) {
            // if_icmple L31
        } else {
            var7 = new String[param0 - -1];
            var4 = var7;
            if (null != ((te) this).field_K) {
                for (var5 = 0; var5 < ((te) this).field_K.length; var5++) {
                    var7[var5] = ((te) this).field_K[var5];
                }
            }
            ((te) this).field_K = var4;
        }
        ((te) this).field_K[param0] = param1;
    }

    final void a(byte param0) {
        int var2 = 0;
        rj var3 = null;
        dm var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        cc var10 = null;
        int var11 = 0;
        ed var12 = null;
        int var13 = 0;
        int var14 = 0;
        cc var15 = null;
        int var16 = 0;
        Object var17 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var16 = OrbDefence.field_D ? 1 : 0;
        ((te) this).field_I = new im();
        var2 = 0;
        var3 = (rj) (Object) ((te) this).field_j;
        var4 = var3.a((pj) this, true);
        L0: while (true) {
          var5 = ((te) this).field_l.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            L1: {
              if (param0 == -127) {
                break L1;
              } else {
                var17 = null;
                boolean discarded$1 = ((te) this).a(-25, (pj) null);
                break L1;
              }
            }
            return;
          } else {
            var7 = ((te) this).field_l.indexOf(">", var5);
            var6 = ((te) this).field_l.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((te) this).field_l.indexOf("</hotspot>", var5);
            var8 = var4.a(var5, (byte) 107);
            var9 = var4.a(var2, (byte) 107);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var11 != var8) {
                    stackOut_6_0 = var12.field_g[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = var4.a(param0 ^ 12, var5);
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_7_0;
                  if (var9 != var11) {
                    if (var12 != null) {
                      stackOut_11_0 = var12.field_g[var12.field_g.length - 1];
                      stackIn_12_0 = stackOut_11_0;
                      break L4;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    }
                  } else {
                    stackOut_8_0 = var4.a(param0 + 32, var2);
                    stackIn_12_0 = stackOut_8_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_12_0;
                  var15 = new cc(var7, var13, var12.field_f, -var13 + var14, Math.max(var3.a((byte) -128), -var12.field_f + var12.field_c));
                  if (var10 == null) {
                    break L5;
                  } else {
                    var10.field_p = var15;
                    break L5;
                  }
                }
                ((te) this).field_I.a(-92, (ca) (Object) var15);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final static int j(int param0) {
        if (param0 != 2) {
            te.k(-128);
        }
        return h.field_H;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2 + 0, param3);
        if (param2 != 1048575) {
            cc discarded$0 = this.a(-110, 35, 78);
        }
        if (-1 != (param1 ^ -1)) {
            return;
        }
        rj var9 = (rj) (Object) ((te) this).field_j;
        cc var6 = ((te) this).field_H;
        if (var6 == null) {
        } else {
            var7 = var9.a((pj) this, param3, (byte) 54);
            var8 = var9.a((pj) this, 9534, param0);
            do {
                wh.a(var6.field_s + 2, false, -2 + var7 - -var6.field_o, var6.field_n + 2, -2 + var8 - -var6.field_g);
                var6 = var6.field_p;
            } while (var6 != null);
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((te) this).field_H = null;
        if (((te) this).field_t) {
            var5 = ua.field_a + -param2 + -((te) this).field_s;
            var6 = vl.field_d - param3 + -((te) this).field_n;
            ((te) this).field_H = this.a(-2, var6, var5);
        }
    }

    boolean a(int param0, pj param1) {
        if (param0 != -81) {
            ((te) this).b(-120, 119, 43, -76);
        }
        return false;
    }

    String g(int param0) {
        if (param0 != -8235) {
            return null;
        }
        if (((te) this).field_H == null) {
            return null;
        }
        if (((te) this).field_K == null) {
            return null;
        }
        if (((te) this).field_K.length <= ((te) this).field_H.field_q) {
            return null;
        }
        return ((te) this).field_K[((te) this).field_H.field_q];
    }

    private final cc a(int param0, int param1, int param2) {
        cc var5 = null;
        int var6 = OrbDefence.field_D ? 1 : 0;
        cc var4 = (cc) (Object) ((te) this).field_I.b((byte) -22);
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if (param2 >= var5.field_o) {
                    if (var5.field_g <= param1) {
                        if (var5.field_s + var5.field_o > param2) {
                            if (!(var5.field_g + var5.field_n < param1)) {
                                return var4;
                            }
                        }
                    }
                }
                var5 = var5.field_p;
            }
            var4 = (cc) (Object) ((te) this).field_I.d(param0 ^ -853);
        }
        if (param0 == -2) {
            return null;
        }
        field_L = null;
        return null;
    }

    public static void k(int param0) {
        field_N = null;
        field_J = null;
        field_M = null;
        if (param0 != -3213) {
            te.k(-125);
        }
        field_L = null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0 ^ 0, param1, param2, param3);
        if (param0 != 84) {
            ((te) this).a(93, (byte) 51, 88, -37);
        }
        int var5 = -((te) this).field_s + param3;
        int var6 = -((te) this).field_n + param1;
        cc var7 = this.a(param0 ^ -86, var6, var5);
        if (var7 != null) {
            if (!(null == ((te) this).field_h)) {
                ((ff) (Object) ((te) this).field_h).a(param2, var7.field_q, (byte) 101, (te) this);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "to return to the normal view.";
        field_G = false;
        field_N = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_L = "Please enter your age in years";
        field_M = new fk(0);
    }
}
