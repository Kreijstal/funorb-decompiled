/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lg extends d {
    private String[] field_K;
    private vl field_O;
    private gg field_N;
    static int field_L;
    static String field_M;

    final void i(int param0) {
        int var2 = 0;
        qe var3 = null;
        ep var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gg var10 = null;
        int var11 = 0;
        ml var12 = null;
        int var13 = 0;
        int var14 = 0;
        gg var15 = null;
        int var16 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0;
        int stackOut_8_0;
        int stackOut_14_0;
        int stackOut_13_0;
        int stackOut_11_0;
        L0: {
          var16 = BrickABrac.field_J ? 1 : 0;
          ((lg) this).field_O = new vl();
          var2 = 0;
          var3 = (qe) (Object) ((lg) this).field_l;
          if (param0 == -1) {
            break L0;
          } else {
            ((lg) this).a(-10, (byte) -28, 79, -11);
            break L0;
          }
        }
        var4 = var3.c((oc) this, -7);
        L1: while (true) {
          var5 = ((lg) this).field_A.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = ((lg) this).field_A.indexOf(">", var5);
            var6 = ((lg) this).field_A.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((lg) this).field_A.indexOf("</hotspot>", var5);
            var8 = var4.a(var5, true);
            var9 = var4.a(var2, true);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var11 == var8) {
                    stackOut_9_0 = var4.a(var5, (byte) -53);
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var12.field_g[0];
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 != var11) {
                    if (var12 != null) {
                      stackOut_14_0 = var12.field_g[var12.field_g.length + -1];
                      stackIn_15_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = var4.a(var2, (byte) -79);
                    stackIn_15_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new gg(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a((byte) 71), -var12.field_d + var12.field_a));
                  if (var10 != null) {
                    var10.field_k = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((lg) this).field_O.a((nm) (Object) var15, (byte) 3);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    String d(int param0) {
        if (null == ((lg) this).field_N) {
            return null;
        }
        if (null == ((lg) this).field_K) {
            return null;
        }
        if (param0 <= 6) {
            ((lg) this).a(-25, -88, 90, 70);
        }
        if (((lg) this).field_N.field_u >= ((lg) this).field_K.length) {
            return null;
        }
        return ((lg) this).field_K[((lg) this).field_N.field_u];
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 != 46) {
            return;
        }
        ((lg) this).a(((qe) (Object) ((lg) this).field_l).a((oc) this, 46695), param0, param3, (byte) -119, param2);
    }

    boolean a(boolean param0, oc param1) {
        if (!param0) {
            field_L = 12;
            return false;
        }
        return false;
    }

    private final gg b(int param0, int param1, int param2) {
        gg var4 = null;
        gg var5 = null;
        int var6 = 0;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            ((lg) this).a(3, -6, -76, (byte) 116, -98);
            break L0;
          }
        }
        var4 = (gg) (Object) ((lg) this).field_O.d(param1 + -75);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (gg) (Object) ((lg) this).field_O.a((byte) 116);
                continue L1;
              } else {
                L3: {
                  if (var5.field_j > param2) {
                    break L3;
                  } else {
                    if (var5.field_s > param0) {
                      break L3;
                    } else {
                      if (var5.field_j + var5.field_r <= param2) {
                        break L3;
                      } else {
                        if (param0 <= var5.field_s + var5.field_n) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_k;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((lg) this).i(-1);
    }

    void a(oc param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((lg) this).field_N = null;
        if (!(!((lg) this).field_q)) {
            var5 = -param2 + (pq.field_k - ((lg) this).field_o);
            var6 = -param3 + (po.field_a - ((lg) this).field_w);
            ((lg) this).field_N = this.b(var6, 0, var5);
        }
    }

    public static void j(int param0) {
        if (param0 != -2) {
            field_M = null;
        }
        field_M = null;
    }

    final static boolean a(int param0) {
        if (param0 != 9) {
            field_L = -88;
        }
        return ik.field_j;
    }

    final static jp a(int param0, String param1, int param2) {
        if (param2 != -1) {
            field_L = -26;
        }
        return fp.a(2, param0, param1, false);
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, -106, param3);
        if (param2 >= -8) {
            Object var8 = null;
            jp discarded$0 = lg.a(-127, (String) null, 62);
        }
        int var5 = -((lg) this).field_o + param3;
        int var6 = -((lg) this).field_w + param0;
        gg var7 = this.b(var6, 0, var5);
        if (var7 != null) {
            if (!(((lg) this).field_i == null)) {
                ((ha) (Object) ((lg) this).field_i).a(param1, -526, var7.field_u, (lg) this);
            }
        }
    }

    final static void h(int param0) {
        ob.field_E.c((byte) -114);
        dl.field_f = param0;
    }

    final void a(String param0, int param1, byte param2) {
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (((lg) this).field_K != null) {
            // if_icmple L24
        } else {
            var7 = new String[param1 - -1];
            var4 = var7;
            if (!(null == ((lg) this).field_K)) {
                for (var5 = 0; var5 < ((lg) this).field_K.length; var5++) {
                    var7[var5] = ((lg) this).field_K[var5];
                }
            }
            ((lg) this).field_K = var4;
        }
        ((lg) this).field_K[param1] = param0;
        if (param2 != -98) {
            String discarded$0 = ((lg) this).d(-97);
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        qe var9 = (qe) (Object) ((lg) this).field_l;
        gg var6 = ((lg) this).field_N;
        if (var6 == null) {
        } else {
            var7 = var9.a((oc) this, (byte) 77, param1);
            var8 = var9.a(param0, (byte) -100, (oc) this);
            do {
                hj.a(-2 + (var8 + var6.field_s), var7 - (-var6.field_j + 2), param3 + 132, var6.field_n + 2, 2 + var6.field_r);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    lg(String param0, ub param1) {
        super(param0, (uh) null);
        ((lg) this).field_N = null;
        ((lg) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Show private chat from my friends and opponents";
    }
}
