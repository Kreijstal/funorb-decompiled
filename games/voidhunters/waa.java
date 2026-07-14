/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class waa extends dqa implements jpb, oo {
    rcb field_v;
    private tga field_A;
    static String field_y;
    static String[] field_w;
    static String field_x;
    static String[] field_D;
    private htb field_z;
    private htb field_C;

    private final int a(int param0, int param1, String param2, String param3, int param4, shb param5) {
        if (param0 != 35) {
          field_D = null;
          return this.a(param1, 35, param2, param5, param3, 126, param4);
        } else {
          return this.a(param1, 35, param2, param5, param3, 126, param4);
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        Object var7 = null;
        if (param0 == 11) {
          if (param3 != ((waa) this).field_C) {
            if (((waa) this).field_z == param3) {
              this.e(25);
              return;
            } else {
              return;
            }
          } else {
            ot.a(-116);
            return;
          }
        } else {
          var7 = null;
          boolean discarded$3 = this.a((lca) null, (byte) 100);
          if (param3 != ((waa) this).field_C) {
            if (((waa) this).field_z != param3) {
              return;
            } else {
              this.e(25);
              return;
            }
          } else {
            ot.a(-116);
            return;
          }
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        if (param0 != -15834) {
            field_D = null;
            if (super.a(param0 ^ 0, param1, param2, param3)) {
                return true;
            }
            if (!(param1 != 98)) {
                return ((waa) this).a(param2, 0);
            }
            if (-100 == (param1 ^ -1)) {
                return ((waa) this).a(true, param2);
            }
            return false;
        }
        if (super.a(param0 ^ 0, param1, param2, param3)) {
            return true;
        }
        if (!(param1 != 98)) {
            return ((waa) this).a(param2, 0);
        }
        if (!(-100 != (param1 ^ -1))) {
            return ((waa) this).a(true, param2);
        }
        return false;
    }

    public waa() {
        super(0, 0, 496, 0, (wwa) null);
        ((waa) this).field_A = new tga("", (sba) null, 12);
        bob var1 = new bob(web.field_o, 0, 0, 0, 0, 16777215, -1, 3, 0, loa.field_o.field_k, -1, 2147483647, true);
        shb var2 = new shb(field_y, (wwa) (Object) var1, (sba) null);
        ((waa) this).field_z = new htb(tia.field_K, (sba) null);
        ((waa) this).field_C = new htb(fqb.field_p, (sba) null);
        ((waa) this).field_A.field_p = gna.field_m;
        ((waa) this).field_A.a(6614, (eeb) (Object) new tib((uf) (Object) ((waa) this).field_A));
        ((waa) this).field_z.field_x = false;
        ((waa) this).field_z.field_q = (wwa) (Object) new vva();
        ((waa) this).field_C.field_q = (wwa) (Object) new meb();
        ((waa) this).field_A.field_q = (wwa) (Object) new io(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 270, 50, 1, var3);
        ((waa) this).b(-18756, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(35, var3, ffb.field_c, tj.field_r, 170, (shb) (Object) ((waa) this).field_A));
        ((waa) this).field_z.a(-var5 + 496 >> -1661755679, var5, 40, 1, var3);
        ((waa) this).field_C.a(var4 - -3, 60, 40, 1, 15 + var3);
        ((waa) this).field_C.field_l = (sba) this;
        ((waa) this).field_z.field_l = (sba) this;
        ((waa) this).b(-18756, (shb) (Object) ((waa) this).field_z);
        ((waa) this).b(-18756, (shb) (Object) ((waa) this).field_C);
        ((waa) this).field_v = new rcb((jpb) this);
        ((waa) this).field_v.a(60 + (((waa) this).field_A.field_g + ((waa) this).field_A.field_h), -60 + -((waa) this).field_A.field_g + (((waa) this).field_h + -((waa) this).field_A.field_h), 150, 1, 20);
        ((waa) this).b(-18756, (shb) (Object) ((waa) this).field_v);
        ((waa) this).a(0, 496, var4 + var3 + 55, 1, 0);
    }

    final void a(int param0, int param1, int param2, shb param3) {
        super.a(param0, param1, param2, param3);
        ((waa) this).field_z.field_x = this.d(-31927);
    }

    private final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -31927) {
          field_y = null;
          if (this.a((lca) (Object) ((waa) this).field_A, (byte) -92)) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (!this.a((lca) (Object) ((waa) this).field_A, (byte) -92)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private final boolean a(lca param0, byte param1) {
        eeb var3 = null;
        qrb var4 = null;
        Object var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var3 = param0.a(-782444220);
        if (var3 == null) {
          return true;
        } else {
          if (param1 != -92) {
            L0: {
              var5 = null;
              ((waa) this).a(-39, -53, -80, (shb) null);
              var4 = var3.a((byte) 35);
              if (var4 != lea.field_o) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              var4 = var3.a((byte) 35);
              if (var4 != lea.field_o) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    private final int a(int param0, int param1, String param2, shb param3, String param4, int param5, int param6) {
        sca var10 = new sca(20, param0, 120 + param6, 25, param3, false, 120, 3, loa.field_o, 16777215, param2);
        ((waa) this).b(-18756, (shb) (Object) var10);
        gm var9 = new gm(((lca) (Object) param3).a(-782444220), param4, param5, param0 + var10.field_f, 25 + param6, param1);
        var9.field_l = (sba) this;
        ((waa) this).b(-18756, (shb) (Object) var9);
        return var10.field_f + var9.field_f;
    }

    final static sd a(asb param0, byte param1, int param2) {
        byte[] var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        var5 = param0.c((byte) 9, param2);
        var3 = var5;
        if (var5 == null) {
          return null;
        } else {
          var4 = -102 % ((param1 - 24) / 60);
          return new sd(var5);
        }
    }

    public static void i(byte param0) {
        field_D = null;
        int var1 = -52 % ((6 - param0) / 55);
        field_x = null;
        field_w = null;
        field_y = null;
    }

    final static void a(ml param0, int param1) {
        Object var3 = null;
        ml var6 = null;
        ml var7 = null;
        ml var8 = null;
        ml var9 = null;
        param0.a(1, 15, new ml(15));
        param0.a(param1 ^ 18633, 14, new ml(15));
        if (param1 != 18632) {
          var3 = null;
          sd discarded$1 = waa.a((asb) null, (byte) -43, -58);
          param0.a(param1 + -18631, 5, new ml(13));
          param0.a(1, 6, new ml(13));
          param0.a(1, 7, new ml(13));
          param0.a(1, 8, new ml(13));
          param0.a(1, 0, new ml(13));
          param0.a(1, 13, new ml(13));
          param0.a(param1 ^ 18633, 4, new ml(13));
          param0.a(1, 9, new ml(13));
          var6 = new ml(34);
          var6.a(1, 3, new ml(15));
          param0.a(param1 + -18631, 11, var6);
          var7 = new ml(34);
          var7.a(1, 1, new ml(15));
          param0.a(param1 ^ 18633, 2, var7);
          return;
        } else {
          param0.a(param1 + -18631, 5, new ml(13));
          param0.a(1, 6, new ml(13));
          param0.a(1, 7, new ml(13));
          param0.a(1, 8, new ml(13));
          param0.a(1, 0, new ml(13));
          param0.a(1, 13, new ml(13));
          param0.a(param1 ^ 18633, 4, new ml(13));
          param0.a(1, 9, new ml(13));
          var8 = new ml(34);
          var8.a(1, 3, new ml(15));
          param0.a(param1 + -18631, 11, var8);
          var9 = new ml(34);
          var9.a(1, 1, new ml(15));
          param0.a(param1 ^ 18633, 2, var9);
          return;
        }
    }

    public final void a(int param0) {
        ((tib) (Object) ((waa) this).field_A.a(-782444220)).d((byte) 127);
        if (param0 != 1546) {
            Object var3 = null;
            int discarded$0 = this.a(25, 1, (String) null, (String) null, 83, (shb) null);
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        var2 = 71 / ((78 - param0) / 41);
        if (!this.d(-31927)) {
          return;
        } else {
          lr.a(((waa) this).field_A.field_j, -127);
          return;
        }
    }

    public final void a(byte param0, String param1) {
        tga var3 = null;
        String var4 = null;
        Object var5 = null;
        var3 = ((waa) this).field_A;
        var4 = param1;
        ((uf) (Object) var3).a(false, 0, var4);
        if (param0 != 41) {
          var5 = null;
          int discarded$2 = this.a(37, 125, (String) null, (shb) null, (String) null, 67, -21);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_y = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_D = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
