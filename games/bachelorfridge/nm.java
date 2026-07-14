/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends ana {
    static String[] field_C;
    static int field_A;
    private eaa field_v;
    private boolean field_w;
    private int field_D;
    private int field_E;
    private int field_x;
    private oo field_z;
    private int field_y;
    private ad field_B;

    private final void d(int param0) {
        ((nm) this).field_q.a(-124, ((nm) this).field_x, ((nm) this).field_B, ((nm) this).field_z.field_r);
        ((nm) this).field_B.b(false);
        ((nm) this).field_B.field_k = 0;
        ((nm) this).field_B.field_o = 0;
        ((nm) this).field_B.field_s.field_s = ((nm) this).field_z.field_r;
        ((nm) this).field_B.field_r = param0;
    }

    final static void f(int param0) {
        if (param0 != -21522) {
            Object var2 = null;
            nm.a((vr) null, (vr) null, -95, (vr) null);
        }
    }

    final static void a(vr param0, vr param1, int param2, vr param3) {
        int var8 = 0;
        int var10_int = 0;
        ee[] var14 = null;
        int var12_int = 0;
        int var13 = BachelorFridge.field_y;
        oea.field_s = gw.a("commonui", "frame_top", param1, -107);
        jw.field_v = gw.a("commonui", "frame_bottom", param1, -84);
        gt.field_s = hca.a("commonui", param1, -59, "jagex_logo_grey");
        sl.field_k = gw.a("commonui", "button", param1, -61);
        fr.field_q = pi.a(param1, -8845, "commonui", "validation");
        oc.field_l = (po) (Object) rc.a(param3, (byte) 113, param1, "arezzo12", "commonui");
        jca.field_a = (po) (Object) rc.a(param3, (byte) 113, param1, "arezzo14", "commonui");
        qia.field_a = (po) (Object) rc.a(param3, (byte) 113, param1, "arezzo14bold", "commonui");
        kv var17 = new kv(param0.a((byte) 123, "", "button.gif"), (java.awt.Component) (Object) dca.field_y);
        ee discarded$0 = ch.a(param1, -1, "commonui", "dropdown");
        ee[] var5 = bla.a(29611, "commonui", "screen_options", param1);
        sh.field_G = new ee[4];
        sb.field_l = new ee[4];
        nea.field_Bb = new ee[4];
        ee[][] var6 = new ee[][]{sb.field_l, nea.field_Bb, sh.field_G};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_h;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_g[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        int var9 = -29 % ((param2 - 6) / 43);
        for (var10_int = 0; 3 > var10_int; var10_int++) {
            var14 = var6[var10_int];
            ee[] var11 = var14;
            for (var12_int = 0; var12_int < var14.length; var12_int++) {
                var14[var12_int] = hea.a(var5[var10_int], var21[var12_int], (byte) 117);
            }
        }
        var9 = var17.field_p;
        uc.d(39);
        var17.b();
        dg.i(0, 0, dg.field_i, dg.field_c);
        kv var10 = new kv(var9, var9);
        var10.b();
        var17.c(0, 0);
        kv var15 = new kv(var9, var9);
        kv var18 = var15;
        var18.b();
        var17.c(var9 + -var17.field_q, 0);
        kv var12 = new kv(-(2 * var9) + var17.field_q, var9);
        var12.b();
        var17.c(-var9, 0);
        db.b(103);
        sl.field_k = new kv[]{var10, var12, var15};
    }

    final boolean c(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        at var7 = null;
        var6 = BachelorFridge.field_y;
        if (!((nm) this).field_m.a((byte) -106)) {
          var7 = (at) (Object) ((nm) this).field_v.b((byte) 90);
          L0: while (true) {
            if (var7 == null) {
              ((nm) this).field_l = ((nm) this).field_l - 1;
              if ((((nm) this).field_l - 1 ^ -1) <= -1) {
                L1: {
                  ((nm) this).field_q.field_s.a(((nm) this).field_B, 97);
                  var4 = 74 / ((param0 - 71) / 47);
                  var3 = ((nm) this).field_D * ((nm) this).field_x - ((nm) this).field_l;
                  if (0 <= var3) {
                    break L1;
                  } else {
                    var3 = 0;
                    break L1;
                  }
                }
                L2: {
                  if (var3 % ((nm) this).field_D == ((nm) this).field_D >> 379666625) {
                    L3: {
                      if (((nm) this).field_w) {
                        break L3;
                      } else {
                        ((nm) this).field_w = true;
                        jja.a(256, -1, 56);
                        break L3;
                      }
                    }
                    var5 = var3 / ((nm) this).field_D + 1;
                    this.a(var5, 41);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((nm) this).field_B.field_r = var3 * ((nm) this).field_y / ((nm) this).field_D;
                ((nm) this).field_B.field_o = var3 * ((nm) this).field_E / ((nm) this).field_D;
                return false;
              } else {
                if (((nm) this).field_v.e(12917)) {
                  this.d(0);
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              L4: {
                if (!var7.b(21807)) {
                  break L4;
                } else {
                  var7.a(false);
                  break L4;
                }
              }
              var7 = (at) (Object) ((nm) this).field_v.c(0);
              continue L0;
            }
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, int param1, int param2) {
        ad var4 = null;
        if ((param2 ^ -1) <= param0) {
            if (param2 < ((nm) this).field_q.field_h.field_z) {
                if ((param1 ^ -1) <= -1) {
                    if (param1 < ((nm) this).field_q.field_h.field_B) {
                        var4 = ((nm) this).field_q.a(param1, false, param2);
                        if (!(var4 == null)) {
                            ((nm) this).field_v.a((bw) (Object) new mg(var4), true);
                        }
                    }
                }
            }
        }
        ((nm) this).a(param2, param1, ((nm) this).field_B, 0);
    }

    public static void e(int param0) {
        field_C = null;
        if (param0 != 25280) {
            field_C = null;
        }
    }

    private final void a(int param0, int param1) {
        int var6 = BachelorFridge.field_y;
        int var3 = ((nm) this).field_B.field_s.field_x;
        int var4 = ((nm) this).field_B.field_s.field_J;
        int var5 = -18 % ((param1 - -29) / 34);
        if (((nm) this).field_z.field_r != -3) {
            // if_icmpeq L67
        } else {
            if (2 == ((nm) this).field_z.field_r) {
                var3 = var3 - param0;
            } else {
                var3 = var3 + param0;
            }
            this.a(-1, var4, var3);
            this.a(-1, var4 - 1, var3);
            this.a(-1, var4 - -1, var3);
        }
        if (((nm) this).field_z.field_r != -2) {
            // if_icmpne L198
        }
        if (((nm) this).field_z.field_r != 1) {
            var4 = var4 + param0;
        } else {
            var4 = var4 - param0;
        }
        this.a(-1, var4, var3);
        this.a(-1, var4, var3 - 1);
        this.a(-1, var4, 1 + var3);
    }

    nm(gj param0, oo param1) {
        super(param0, (bca) (Object) param1);
        L0: {
          ((nm) this).field_w = false;
          ((nm) this).field_D = 8;
          ((nm) this).field_z = param1;
          ((nm) this).field_B = ((nm) this).field_z.field_l.a(-27449, ((nm) this).field_q);
          ((nm) this).field_B.b(-1, 3);
          ((nm) this).field_y = 0;
          ((nm) this).field_E = 0;
          if (-3 != (((nm) this).field_z.field_r ^ -1)) {
            if (1 == ((nm) this).field_z.field_r) {
              ((nm) this).field_y = -65536;
              break L0;
            } else {
              if ((((nm) this).field_z.field_r ^ -1) != -5) {
                if (((nm) this).field_z.field_r != 3) {
                  break L0;
                } else {
                  ((nm) this).field_y = 65536;
                  break L0;
                }
              } else {
                ((nm) this).field_E = 65536;
                break L0;
              }
            }
          } else {
            ((nm) this).field_E = -65536;
            break L0;
          }
        }
        ((nm) this).field_x = ((nm) this).field_z.b(((nm) this).field_q.field_h, -1);
        ((nm) this).field_l = ((nm) this).field_l + ((nm) this).field_x * ((nm) this).field_D;
        ((nm) this).field_v = new eaa();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new String[]{"Meaty", "Dairy", "Sugary", "Bready", "Spooky", "Bouncy", "Fizzy", "Fishy", "Spicy", "Savoury"};
        field_A = 0;
    }
}
