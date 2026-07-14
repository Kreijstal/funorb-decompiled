/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hv extends fw {
    static int[] field_R;
    private at field_P;
    private String[] field_Q;
    static String field_O;
    private ct field_M;
    static rn field_N;

    final void a(int param0, int param1, int param2, boolean param3) {
        this.a(param0, param1, param2, param3);
        int var5 = -((hv) this).field_B + param1;
        int var6 = param2 + -((hv) this).field_p;
        ct var7 = this.a(var6, (byte) -61, var5);
        if (var7 != null) {
            if (!(null == ((hv) this).field_x)) {
                ((nq) (Object) ((hv) this).field_x).a(var7.field_n, param0, (byte) 112, (hv) this);
            }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        pm var3 = null;
        ju var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ct var10 = null;
        int var11 = 0;
        ts var12 = null;
        int var13 = 0;
        int var14 = 0;
        ct var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((hv) this).field_P = new at();
        var2 = 0;
        var3 = (pm) (Object) ((hv) this).field_k;
        var4 = var3.a(-77, (kb) this);
        if (param0 <= -115) {
          L0: while (true) {
            var5 = ((hv) this).field_v.indexOf("<hotspot=", var2);
            if ((var5 ^ -1) != 0) {
              var7 = ((hv) this).field_v.indexOf(">", var5);
              var6 = ((hv) this).field_v.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((hv) this).field_v.indexOf("</hotspot>", var5);
              var8 = var4.a(0, var5);
              var9 = var4.a(0, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_b[var11];
                    if (var8 != var11) {
                      stackOut_8_0 = var12.field_i[0];
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = var4.a((byte) -66, var5);
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var11 != var9) {
                      if (var12 == null) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = var12.field_i[-1 + var12.field_i.length];
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    } else {
                      stackOut_10_0 = var4.a((byte) -66, var2);
                      stackIn_14_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new ct(var7, var13, var12.field_n, -var13 + var14, Math.max(var3.a(true), var12.field_c - var12.field_n));
                    if (var10 != null) {
                      var10.field_k = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((hv) this).field_P.a((byte) -119, (tc) (Object) var15);
                  var10 = var15;
                  var11++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean a(int param0, kb param1) {
        if (param0 != 11) {
            Object var4 = null;
            ((hv) this).a(-45, 118, 84, (kb) null);
        }
        return false;
    }

    private final ct a(int param0, byte param1, int param2) {
        ct var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        ct var4 = (ct) (Object) ((hv) this).field_P.e((byte) 107);
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if (param2 >= var5.field_r) {
                    if (param0 >= var5.field_l) {
                        if (var5.field_r - -var5.field_p > param2) {
                            if (!(var5.field_q + var5.field_l < param0)) {
                                return var4;
                            }
                        }
                    }
                }
                var5 = var5.field_k;
            }
            var4 = (ct) (Object) ((hv) this).field_P.a((byte) 123);
        }
        if (param1 == -61) {
            return null;
        }
        Object var7 = null;
        ((hv) this).a(-11, -2, 46, (kb) null);
        return null;
    }

    void a(int param0, int param1, int param2, kb param3) {
        int var5 = 0;
        int var6 = 0;
        this.a(param0, param1, param2, param3);
        ((hv) this).field_M = null;
        if (((hv) this).field_t) {
            var5 = -param1 + (sm.field_d - ((hv) this).field_B);
            var6 = -param2 + ko.field_b + -((hv) this).field_p;
            ((hv) this).field_M = this.a(var6, (byte) -61, var5);
        }
    }

    hv(String param0, kh param1) {
        super(param0, (qo) null);
        ((hv) this).field_M = null;
        ((hv) this).field_k = param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 8192) {
            field_R = null;
        }
        this.a(param0, param1, param2, param3 ^ 0, param4);
        ((hv) this).a(-128);
    }

    public static void b(boolean param0) {
        field_N = null;
        field_O = null;
        if (!param0) {
            field_N = null;
        }
        field_R = null;
    }

    String h(int param0) {
        if (((hv) this).field_M == null) {
            return null;
        }
        if (null == ((hv) this).field_Q) {
            return null;
        }
        if (param0 != 21384) {
            return null;
        }
        if (((hv) this).field_Q.length <= ((hv) this).field_M.field_n) {
            return null;
        }
        return ((hv) this).field_Q[((hv) this).field_M.field_n];
    }

    final void a(String param0, boolean param1, int param2) {
        String[] var8 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != ((hv) this).field_Q) {
            // if_icmple L25
        } else {
            var8 = new String[param2 - -1];
            var4 = var8;
            if (null != ((hv) this).field_Q) {
                for (var5 = 0; var5 < ((hv) this).field_Q.length; var5++) {
                    var8[var5] = ((hv) this).field_Q[var5];
                }
            }
            ((hv) this).field_Q = var4;
        }
        if (param1) {
            Object var7 = null;
            ((hv) this).a((String) null, false, -3);
        }
        ((hv) this).field_Q[param2] = param0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((hv) this).a(param2, param0, param3, 8192, ((pm) (Object) ((hv) this).field_k).a((kb) this, -2));
        if (param1 != 9567) {
            ((hv) this).field_P = null;
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        this.a(param0, param1, (byte) -124, param3);
        if (param3 != 0) {
            return;
        }
        pm var10 = (pm) (Object) ((hv) this).field_k;
        if (param2 > -82) {
            Object var9 = null;
            boolean discarded$0 = ((hv) this).a(-37, (kb) null);
        }
        ct var6 = ((hv) this).field_M;
        if (var6 != null) {
            var7 = var10.a((kb) this, param0, (byte) -123);
            var8 = var10.a(-18033, param1, (kb) this);
            do {
                na.c(2 + var6.field_p, var7 - (-var6.field_r - -2), 116, 2 + var6.field_q, -2 + (var6.field_l + var8));
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "This unit has no magical ability.";
        field_N = new rn();
    }
}
