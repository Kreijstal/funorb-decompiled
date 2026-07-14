/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br extends mh {
    private int field_Vb;
    private int field_dc;
    private jp[] field_Tb;
    private int field_Yb;
    private int field_Sb;
    private int field_Zb;
    static int[][] field_bc;
    private int field_Qb;
    private rk[] field_Xb;
    static String field_ac;
    private int field_Wb;
    private int[] field_cc;
    static String field_Ub;
    static String field_Rb;
    private mh field_ec;
    private mh field_Pb;

    final static void a(int param0, byte param1, int param2) {
        om var6 = null;
        om var7 = null;
        pi var4 = null;
        if (re.field_i != param2) {
            var6 = (om) (Object) pn.field_i.a((long)re.field_i, -1);
            var7 = var6;
            if (!(var7 == null)) {
                var7.field_Qb = null;
            }
            re.field_i = param2;
            var4 = k.field_h;
            var4.e(-13413, param0);
            var4.a(-29, 3);
            var4.a(-127, 11);
            var4.b((byte) 121, param2);
        }
        int var3 = 20 / ((55 - param1) / 62);
    }

    final void a(String param0, int param1, byte param2) {
        ((br) this).field_Xb[((br) this).field_Wb] = new rk(0L, (mh) null, (mh) null, ((br) this).field_ec, (jp) null, param0);
        ((br) this).field_Xb[((br) this).field_Wb].field_Gb = ((br) this).field_Tb;
        ((br) this).field_Xb[((br) this).field_Wb].field_Lb = true;
        ((br) this).field_Xb[((br) this).field_Wb].field_Q = 1;
        ((br) this).a((mh) (Object) ((br) this).field_Xb[((br) this).field_Wb], 0);
        if (param2 < 70) {
            ((br) this).field_Xb = null;
            ((br) this).field_cc[((br) this).field_Wb] = param1;
            ((br) this).field_Wb = ((br) this).field_Wb + 1;
            return;
        }
        ((br) this).field_cc[((br) this).field_Wb] = param1;
        ((br) this).field_Wb = ((br) this).field_Wb + 1;
    }

    final int a(byte param0, boolean param1) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        ((br) this).a(param1, -15211);
        if (!param1) {
            return -2;
        }
        int var3 = -36 / ((param0 - 13) / 63);
        for (var4 = 0; ((br) this).field_Wb > var4; var4++) {
            if (((br) this).field_Xb[var4].field_L != 0) {
                return ((br) this).field_cc[var4];
            }
        }
        if (!(ki.field_e == 0)) {
            return -1;
        }
        return ((br) this).field_dc;
    }

    final void a(String param0, int param1, int param2, jp param3) {
        ((br) this).field_Xb[((br) this).field_Wb] = new rk(0L, (mh) null, (mh) null, ((br) this).field_ec, param3, param0);
        ((br) this).field_Xb[((br) this).field_Wb].field_Gb = ((br) this).field_Tb;
        ((br) this).field_Xb[((br) this).field_Wb].field_Lb = true;
        ((br) this).field_Xb[((br) this).field_Wb].field_Q = 1;
        ((br) this).a((mh) (Object) ((br) this).field_Xb[((br) this).field_Wb], 0);
        ((br) this).field_cc[((br) this).field_Wb] = param2;
        ((br) this).field_Wb = ((br) this).field_Wb + 1;
        if (param1 < 62) {
            ((br) this).field_Vb = -95;
        }
    }

    br(br param0) {
        this((mh) (Object) param0, param0.field_Tb, param0.field_Pb, param0.field_ec, param0.field_Vb, param0.field_Qb, param0.field_Yb, param0.field_Sb, param0.field_Zb);
    }

    public static void h(int param0) {
        field_Ub = null;
        if (param0 < 20) {
            return;
        }
        field_bc = null;
        field_Rb = null;
        field_ac = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4 = 33 % ((param3 - 75) / 45);
        if (lb.field_d >= param1 - -param2 - -param0) {
            return param1 - -param2;
        }
        if (!(0 > param1 - param0)) {
            return param1 - param0;
        }
        return lb.field_d + -param0;
    }

    br(mh param0, jp[] param1, mh param2, mh param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((br) this).field_Xb = new rk[256];
        ((br) this).field_dc = -2;
        ((br) this).field_cc = new int[256];
        ((br) this).field_Pb = param2;
        ((br) this).field_Qb = param5;
        ((br) this).field_Zb = param8;
        ((br) this).field_Sb = param7;
        ((br) this).field_ec = param3;
        ((br) this).field_Tb = param1;
        ((br) this).field_Yb = param6;
        ((br) this).field_Vb = param4;
    }

    final boolean i(int param0) {
        int var2 = 0;
        if (!(-2 == ((br) this).field_dc)) {
            return false;
        }
        if (dc.field_b == 13) {
            ((br) this).field_dc = -1;
            var2 = -81 % ((-25 - param0) / 41);
            return true;
        }
        var2 = -81 % ((-25 - param0) / 41);
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (((br) this).field_Wb != 0) {
          var6 = 0;
          if (param1 < -49) {
            var7 = 0;
            L0: while (true) {
              if (((br) this).field_Wb <= var7) {
                var6 = var6 + ((br) this).field_Vb * 2;
                var7 = ((br) this).field_Zb * ((br) this).field_Wb + ((br) this).field_Sb - -((br) this).field_Sb;
                var8 = fp.a(-1, var6, param4, param3);
                var9 = br.a(var7, param0, param2, 122);
                ((br) this).a(var7, var9, var8, var6, (byte) 64);
                var10 = 0;
                L1: while (true) {
                  if (var10 >= ((br) this).field_Wb) {
                    return;
                  } else {
                    ((br) this).field_Xb[var10].a(-10411, ((br) this).field_Zb * var10 + ((br) this).field_Sb, ((br) this).field_Qb, ((br) this).field_Yb, ((br) this).field_Vb, ((br) this).field_Zb, var6 - 2 * ((br) this).field_Vb);
                    var10++;
                    continue L1;
                  }
                }
              } else {
                var8 = ((br) this).field_Xb[var7].a(((br) this).field_Yb, 24, ((br) this).field_Qb);
                if (var6 < var8) {
                  var6 = var8;
                  var7++;
                  continue L0;
                } else {
                  var7++;
                  continue L0;
                }
              }
            }
          } else {
            ((br) this).field_Zb = -94;
            var7 = 0;
            L2: while (true) {
              if (((br) this).field_Wb <= var7) {
                var6 = var6 + ((br) this).field_Vb * 2;
                var7 = ((br) this).field_Zb * ((br) this).field_Wb + ((br) this).field_Sb - -((br) this).field_Sb;
                var8 = fp.a(-1, var6, param4, param3);
                var9 = br.a(var7, param0, param2, 122);
                ((br) this).a(var7, var9, var8, var6, (byte) 64);
                var10 = 0;
                L3: while (true) {
                  if (var10 >= ((br) this).field_Wb) {
                    return;
                  } else {
                    ((br) this).field_Xb[var10].a(-10411, ((br) this).field_Zb * var10 + ((br) this).field_Sb, ((br) this).field_Qb, ((br) this).field_Yb, ((br) this).field_Vb, ((br) this).field_Zb, var6 - 2 * ((br) this).field_Vb);
                    var10++;
                    continue L3;
                  }
                }
              } else {
                var8 = ((br) this).field_Xb[var7].a(((br) this).field_Yb, 24, ((br) this).field_Qb);
                if (var6 < var8) {
                  var6 = var8;
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } else {
          ((br) this).field_Xb[((br) this).field_Wb] = new rk(0L, (mh) null, (mh) null, ((br) this).field_Pb, (jp) null, gg.field_m);
          ((br) this).field_Xb[((br) this).field_Wb].field_Q = 1;
          ((br) this).a((mh) (Object) ((br) this).field_Xb[((br) this).field_Wb], 0);
          ((br) this).field_cc[((br) this).field_Wb] = -1;
          ((br) this).field_Wb = ((br) this).field_Wb + 1;
          var6 = 0;
          if (param1 >= -49) {
            L4: {
              ((br) this).field_Zb = -94;
              var7 = 0;
              if (((br) this).field_Wb <= var7) {
                break L4;
              } else {
                L5: {
                  var8 = ((br) this).field_Xb[var7].a(((br) this).field_Yb, 24, ((br) this).field_Qb);
                  if (var6 >= var8) {
                    var7++;
                    break L5;
                  } else {
                    var6 = var8;
                    break L5;
                  }
                }
                var7++;
                var7++;
                break L4;
              }
            }
            var6 = var6 + ((br) this).field_Vb * 2;
            var7 = ((br) this).field_Zb * ((br) this).field_Wb + ((br) this).field_Sb - -((br) this).field_Sb;
            var8 = fp.a(-1, var6, param4, param3);
            var9 = br.a(var7, param0, param2, 122);
            ((br) this).a(var7, var9, var8, var6, (byte) 64);
            var10 = 0;
            L6: while (true) {
              if (var10 >= ((br) this).field_Wb) {
                return;
              } else {
                ((br) this).field_Xb[var10].a(-10411, ((br) this).field_Zb * var10 + ((br) this).field_Sb, ((br) this).field_Qb, ((br) this).field_Yb, ((br) this).field_Vb, ((br) this).field_Zb, var6 - 2 * ((br) this).field_Vb);
                var10++;
                continue L6;
              }
            }
          } else {
            L7: {
              var7 = 0;
              if (((br) this).field_Wb <= var7) {
                break L7;
              } else {
                L8: {
                  var8 = ((br) this).field_Xb[var7].a(((br) this).field_Yb, 24, ((br) this).field_Qb);
                  if (var6 >= var8) {
                    var7++;
                    break L8;
                  } else {
                    var6 = var8;
                    break L8;
                  }
                }
                var7++;
                var7++;
                var7++;
                break L7;
              }
            }
            var6 = var6 + ((br) this).field_Vb * 2;
            var7 = ((br) this).field_Zb * ((br) this).field_Wb + ((br) this).field_Sb - -((br) this).field_Sb;
            var8 = fp.a(-1, var6, param4, param3);
            var9 = br.a(var7, param0, param2, 122);
            ((br) this).a(var7, var9, var8, var6, (byte) 64);
            var10 = 0;
            L9: while (true) {
              if (var10 >= ((br) this).field_Wb) {
                return;
              } else {
                ((br) this).field_Xb[var10].a(-10411, ((br) this).field_Zb * var10 + ((br) this).field_Sb, ((br) this).field_Qb, ((br) this).field_Yb, ((br) this).field_Vb, ((br) this).field_Zb, var6 - 2 * ((br) this).field_Vb);
                var10++;
                continue L9;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ac = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_Ub = "To report a player, right-click on their name and select the option to report abuse.";
        field_Rb = "Breaking real-world laws";
    }
}
