/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rg extends ig {
    private String[] field_G;
    private oj field_H;
    static int field_F;
    private ja field_K;
    static ua field_J;
    static String field_I;

    String d(int param0) {
        if (((rg) this).field_K == null) {
            return null;
        }
        if (((rg) this).field_G == null) {
            return null;
        }
        if (param0 != 3690) {
            Object var3 = null;
            boolean discarded$0 = ((rg) this).a(86, (rj) null);
        }
        if (((rg) this).field_K.field_l >= ((rg) this).field_G.length) {
            return null;
        }
        return ((rg) this).field_G[((rg) this).field_K.field_l];
    }

    final void b(int param0, byte param1, int param2, int param3) {
        ((rg) this).b(param0, param2, param3, ((pj) (Object) ((rg) this).field_u).a((rj) this, 28361), 23987);
        if (param1 != -11) {
            Object var6 = null;
            boolean discarded$0 = rg.a((byte) -126, (CharSequence) null);
        }
    }

    private final ja b(int param0, int param1, int param2) {
        ja var5 = null;
        int var6 = stellarshard.field_B;
        ja var4 = (ja) (Object) ((rg) this).field_H.b(-127);
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if (var5.field_s <= param0) {
                    if (var5.field_r <= param2) {
                        if (var5.field_n + var5.field_s > param0) {
                            if (!(param2 > var5.field_o + var5.field_r)) {
                                return var4;
                            }
                        }
                    }
                }
                var5 = var5.field_p;
            }
            var4 = (ja) (Object) ((rg) this).field_H.b((byte) -76);
        }
        if (param1 < -122) {
            return null;
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 < 39) {
            ((rg) this).a(125, (byte) -86, 89, 28);
        }
        super.a(param0, param1, param2, 84);
        int var5 = param1 - ((rg) this).field_w;
        int var6 = param0 - ((rg) this).field_k;
        ja var7 = this.b(var5, -124, var6);
        if (var7 != null) {
            if (((rg) this).field_v != null) {
                ((md) (Object) ((rg) this).field_v).a(var7.field_l, -2, (rg) this, param2);
            }
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 != 19) {
            return true;
        }
        return th.a(-123, true, 10, param1);
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = stellarshard.field_B;
        rb.field_u.a((byte) -115);
        if (param0 != -33) {
            return;
        }
        for (var1 = 0; 32 > var1; var1++) {
            vg.field_t[var1] = 0L;
        }
        for (var1 = 0; (var1 ^ -1) > -33; var1++) {
            ce.field_c[var1] = 0L;
        }
        ol.field_c = 0;
    }

    final void a(String param0, int param1, int param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        L0: {
          L1: {
            var6 = stellarshard.field_B;
            if (null == ((rg) this).field_G) {
              break L1;
            } else {
              if (param1 >= ((rg) this).field_G.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            var7 = new String[1 + param1];
            var4 = var7;
            if (((rg) this).field_G == null) {
              break L2;
            } else {
              var5 = 0;
              L3: while (true) {
                if (((rg) this).field_G.length <= var5) {
                  break L2;
                } else {
                  var7[var5] = ((rg) this).field_G[var5];
                  var5++;
                  continue L3;
                }
              }
            }
          }
          ((rg) this).field_G = var4;
          break L0;
        }
        if (param2 == 1) {
          ((rg) this).field_G[param1] = param0;
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, rj param1) {
        if (param0 != -2147483648) {
            ((rg) this).b(-88, (byte) -84, -22, 108);
        }
        return false;
    }

    rg(String param0, uk param1) {
        super(param0, (lf) null);
        ((rg) this).field_K = null;
        ((rg) this).field_u = param1;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((rg) this).a((byte) 66);
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        pj var9 = (pj) (Object) ((rg) this).field_u;
        ja var6 = ((rg) this).field_K;
        if (var6 == null) {
        } else {
            var7 = var9.a(param1 ^ -57, (rj) this, param3);
            var8 = var9.a((byte) -2, (rj) this, param2);
            do {
                og.a(-2 + var7 + var6.field_s, (byte) 105, var6.field_n - -2, 2 + var6.field_o, -2 + (var8 - -var6.field_r));
                var6 = var6.field_p;
            } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        pj var3 = null;
        vk var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        uj var13 = null;
        int var14 = 0;
        int var15 = 0;
        ja var16 = null;
        int var17 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var17 = stellarshard.field_B;
        ((rg) this).field_H = new oj();
        var2 = 0;
        var3 = (pj) (Object) ((rg) this).field_u;
        var5 = -101 / ((param0 - -30) / 33);
        var4 = var3.b((rj) this, (byte) 94);
        L0: while (true) {
          var6 = ((rg) this).field_m.indexOf("<hotspot=", var2);
          if ((var6 ^ -1) == 0) {
            return;
          } else {
            var8 = ((rg) this).field_m.indexOf(">", var6);
            var7 = ((rg) this).field_m.substring(var6 + 9, var8);
            var8 = Integer.parseInt(var7);
            var2 = ((rg) this).field_m.indexOf("</hotspot>", var6);
            var9 = var4.a(48, var6);
            var10 = var4.a(113, var2);
            var11 = null;
            var12 = var9;
            L1: while (true) {
              if (var10 < var12) {
                continue L0;
              } else {
                L2: {
                  var13 = var4.field_a[var12];
                  if (var12 == var9) {
                    stackOut_6_0 = var4.b(var6, 26);
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var13.field_a[0];
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var14 = stackIn_7_0;
                  if (var10 != var12) {
                    if (var13 != null) {
                      stackOut_11_0 = var13.field_a[var13.field_a.length + -1];
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  } else {
                    stackOut_8_0 = var4.b(var2, -127);
                    stackIn_12_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var15 = stackIn_12_0;
                  var16 = new ja(var8, var14, var13.field_b, -var14 + var15, Math.max(var3.a((byte) -73), var13.field_c - var13.field_b));
                  if (var11 == null) {
                    break L4;
                  } else {
                    ((ja) var11).field_p = var16;
                    break L4;
                  }
                }
                var11 = (Object) (Object) var16;
                ((rg) this).field_H.b(-71, (gg) (Object) var16);
                var12++;
                continue L1;
              }
            }
          }
        }
    }

    public static void d(boolean param0) {
        field_J = null;
        field_I = null;
        if (!param0) {
            field_J = null;
        }
    }

    void a(int param0, boolean param1, int param2, rj param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((rg) this).field_K = null;
        if (((rg) this).field_q) {
            var5 = -((rg) this).field_w + -param2 + ni.field_e;
            var6 = -param0 + eb.field_a + -((rg) this).field_k;
            ((rg) this).field_K = this.b(var5, -127, var6);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        pi discarded$0 = new pi();
        field_J = new ua(0);
    }
}
