/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qa extends hf {
    static int[] field_I;
    private fk field_P;
    private vd field_Q;
    static String field_N;
    static he[] field_S;
    private String[] field_R;
    static int[] field_T;
    static nh field_L;
    static int[] field_J;
    static nh field_M;
    static String field_O;

    String e(int param0) {
        if (((qa) this).field_P == null) {
            return null;
        }
        if (null == ((qa) this).field_R) {
            return null;
        }
        if (param0 >= -39) {
            return null;
        }
        if (((qa) this).field_P.field_s >= ((qa) this).field_R.length) {
            return null;
        }
        return ((qa) this).field_R[((qa) this).field_P.field_s];
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
            field_T = null;
        }
        ((qa) this).a(param3, ((va) (Object) ((qa) this).field_l).a(170, (vg) this), param2, 16535, param1);
    }

    final void h(int param0) {
        int var2 = 0;
        va var3 = null;
        em var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        fk var10 = null;
        int var11 = 0;
        mi var12 = null;
        int var13 = 0;
        int var14 = 0;
        fk var15 = null;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ((qa) this).field_Q = new vd();
        var2 = 0;
        var3 = (va) (Object) ((qa) this).field_l;
        var4 = var3.a((vg) this, true);
        L0: while (true) {
          var5 = ((qa) this).field_p.indexOf("<hotspot=", var2);
          if (-1 != var5) {
            var7 = ((qa) this).field_p.indexOf(">", var5);
            var6 = ((qa) this).field_p.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((qa) this).field_p.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, -12280);
            var9 = var4.b(var2, -12280);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var9 < var11) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_a[var11];
                  if (var8 != var11) {
                    stackOut_7_0 = var12.field_a[0];
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = var4.a(74, var5);
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var12.field_a[var12.field_a.length - 1];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  } else {
                    stackOut_9_0 = var4.a(-88, var2);
                    stackIn_13_0 = stackOut_9_0;
                    break L3;
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new fk(var7, var13, var12.field_e, var14 - var13, Math.max(var3.a((byte) -116), -var12.field_e + var12.field_b));
                  if (var10 == null) {
                    break L4;
                  } else {
                    var10.field_k = var15;
                    break L4;
                  }
                }
                var10 = var15;
                ((qa) this).field_Q.a((gi) (Object) var15, 255);
                var11++;
                continue L1;
              }
            }
          } else {
            var5 = -128 / ((param0 - -57) / 43);
            return;
          }
        }
    }

    void a(vg param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, (byte) -128);
        ((qa) this).field_P = null;
        if (param3 >= -127) {
            ((qa) this).field_Q = null;
        }
        if (((qa) this).field_n) {
            var5 = ck.field_c + -param1 + -((qa) this).field_o;
            var6 = -((qa) this).field_m + (ob.field_g - param2);
            ((qa) this).field_P = this.a(var6, var5, (byte) 122);
        }
    }

    public static void a(byte param0) {
        field_J = null;
        field_I = null;
        if (param0 != 122) {
            qa.a((byte) 76);
        }
        field_O = null;
        field_L = null;
        field_N = null;
        field_M = null;
        field_T = null;
        field_S = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 16535) {
            field_J = null;
        }
        super.a(param0, param1, param2, param3 + 0, param4);
        ((qa) this).h(param3 + -16466);
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        while (true) {
            param3--;
            if (-1 < (param3 ^ -1)) {
                break;
            }
            var9 = param1;
            int[] var5 = var9;
            var6 = param0;
            var7 = param2;
            var9[var6] = (rk.a(var9[var6], 16711422) >> -2141888031) + var7;
            param0++;
        }
        if (param4 != -2141888031) {
            field_L = null;
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        va var5 = (va) (Object) ((qa) this).field_l;
        fk var6 = ((qa) this).field_P;
        if (var6 != null) {
            var7 = var5.a((vg) this, param2 ^ -1540021398, param0);
            var8 = var5.a((vg) this, param3, (byte) -124);
            do {
                ce.a(var6.field_j + 2, -2 + var6.field_o + var7, param2 ^ 16598, 2 + var6.field_n, var8 - -var6.field_i + -2);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    qa(String param0, cg param1) {
        super(param0, (fd) null);
        ((qa) this).field_P = null;
        ((qa) this).field_l = param1;
    }

    boolean a(boolean param0, vg param1) {
        if (param0) {
            ((qa) this).h(29);
        }
        return false;
    }

    private final fk a(int param0, int param1, byte param2) {
        fk var5_ref = null;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        fk var4 = (fk) (Object) ((qa) this).field_Q.h(-11151);
        while (var4 != null) {
            var5_ref = var4;
            while (var5_ref != null) {
                if (param1 >= var5_ref.field_o) {
                    if (var5_ref.field_i <= param0) {
                        if (var5_ref.field_o + var5_ref.field_n > param1) {
                            if (var5_ref.field_i + var5_ref.field_j >= param0) {
                                return var4;
                            }
                        }
                    }
                }
                var5_ref = var5_ref.field_k;
            }
            var4 = (fk) (Object) ((qa) this).field_Q.e(0);
        }
        int var5 = 85 % ((59 - param2) / 51);
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -((qa) this).field_o + param3;
        int var6 = -((qa) this).field_m + param2;
        fk var7 = this.a(var6, var5, (byte) -70);
        if (var7 != null) {
            if (!(null == ((qa) this).field_u)) {
                ((ra) (Object) ((qa) this).field_u).a(var7.field_s, -99, (qa) this, param0);
            }
        }
    }

    final void a(String param0, int param1, int param2) {
        String[] var7 = null;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((qa) this).field_R != null) {
            // if_icmpge L24
        } else {
            var7 = new String[1 + param1];
            var4_ref_String__ = var7;
            if (!(((qa) this).field_R == null)) {
                for (var5 = 0; var5 < ((qa) this).field_R.length; var5++) {
                    var7[var5] = ((qa) this).field_R[var5];
                }
            }
            ((qa) this).field_R = var4_ref_String__;
        }
        ((qa) this).field_R[param1] = param0;
        int var4 = 53 / ((61 - param2) / 48);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[]{1, 1, 1, 1, 1, -3, 0, 1, 0, 0, 0, -4, 1, 1, 1, 1, 1, -5, -6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, 1, 1, 0, 2, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_N = "Members";
        field_T = new int[]{5, 10, 5, 1, 3, 10, 10, 10, 10, 20, 30, 10, 10, 10, 10, 5, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 5, 10, 25, 10, 5, 5, 10, 10, 10, 10, 10, 10, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 30, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        field_O = "Unpacking graphics";
    }
}
