/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends sf implements he {
    private fw field_bb;
    static rn field_ab;
    private fw field_fb;
    static wk[] field_eb;
    static jl field_cb;
    static byte[] field_db;
    static tg field_Z;
    static String field_X;
    static String field_Y;
    static int[][] field_W;

    public static void n(int param0) {
        field_ab = null;
        field_eb = null;
        field_db = null;
        field_X = null;
        field_Z = null;
        field_W = null;
        if (param0 != 0) {
            return;
        }
        field_Y = null;
        field_cb = null;
    }

    tn(gk param0) {
        super(param0, 200, 130);
        kb var2 = new kb(hw.field_z, (qo) null);
        var2.field_w = 80;
        var2.field_l = ((tn) this).field_l;
        var2.field_B = 0;
        var2.field_p = 50;
        var2.field_k = (kh) (Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((tn) this).a((byte) 10, var2);
        if (nw.g(98)) {
            ((tn) this).field_fb = this.a((qo) this, true, tg.field_j);
        }
        ((tn) this).field_bb = this.a((qo) this, true, pd.field_f);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (param1 != 11) {
            field_W = null;
        }
        if (param4 == ((tn) this).field_fb) {
            ed.a(false);
            this.o(param1 + -10);
        } else {
            if (!(param4 != ((tn) this).field_bb)) {
                this.o(1);
            }
        }
    }

    private final void o(int param0) {
        if (param0 != 1) {
            Object var3 = null;
        }
        if (!(((tn) this).field_L)) {
            return;
        }
        ((tn) this).field_L = false;
    }

    private final fw a(qo param0, boolean param1, String param2) {
        fw var4 = new fw(param2, param0);
        if (!param1) {
            wk[] discarded$0 = tn.a(false, -22, 101);
        }
        var4.field_k = (kh) (Object) new nu();
        int var5 = -6 + ((tn) this).field_w;
        ((tn) this).field_w = ((tn) this).field_w + 38;
        var4.a(15, -14 + ((tn) this).field_l + -16, var5, 8192, 30);
        ((tn) this).a((byte) 10, (kb) (Object) var4);
        ((tn) this).e(0);
        return var4;
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        if (98 == param1) {
            if (((tn) this).field_fb == null) {
                boolean discarded$0 = ((tn) this).field_bb.a(11, (kb) this);
                return true;
            }
            boolean discarded$1 = ((tn) this).field_fb.a(11, (kb) this);
            return true;
        }
        if (param3 != -12215) {
            return true;
        }
        if (param1 == 99) {
            boolean discarded$2 = ((tn) this).field_bb.a(11, (kb) this);
            return true;
        }
        return this.a(param0, param1, param2, param3 + 0);
    }

    final static void a(byte param0, wk[] param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        L0: {
          var13 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 >= 67) {
            break L0;
          } else {
            field_ab = null;
            break L0;
          }
        }
        L1: {
          var2 = 0;
          if ((param1.length ^ -1) != -7) {
            if ((param1.length ^ -1) != -8) {
              return;
            } else {
              break L1;
            }
          } else {
            var2 = 1;
            break L1;
          }
        }
        var3 = 0;
        L2: while (true) {
          if (var3 >= param1.length) {
            return;
          } else {
            var17 = param1[var3].field_B;
            var16 = var17;
            var15 = var16;
            var14 = var15;
            var4 = var14;
            var5 = 16711680 & bo.field_g[var2 + var3];
            var6 = 65280 & bo.field_g[var2 + var3];
            var7 = 255 & bo.field_g[var3 - -var2];
            var8 = 0;
            L3: while (true) {
              if (var17.length <= var8) {
                var3++;
                continue L2;
              } else {
                var9 = var17[var8] & 16711680;
                var10 = 65280 & var17[var8];
                var11 = 255 & var17[var8];
                var12 = var17[var8] & -16777216;
                if (var10 == var9 >> -705478136) {
                  if (var10 >> 2033572456 == var11) {
                    if (var11 < 128) {
                      var11 = var11 << 1;
                      var4[var8] = oe.c(var12, oe.c(oe.c(rn.a(var5 * var11, -16777164) >>> 1440235560, rn.a(var11 * var6, 16711832) >>> 1822604168), rn.a(var7 * var11 >>> 1296372296, 754974975)));
                      var8++;
                      continue L3;
                    } else {
                      var4[var8] = oe.c(oe.c(oe.c(rn.a((256 - var11) * var5 + var11 * 16711680 + -2139095040 >>> 1559026023, 1727987712), rn.a(8355863, (-var11 + 256) * var6 + (var11 - 128) * 65280) >>> 382425191), (256 - var11) * var7 + 255 * var11 - 32640 >>> 1498552903), var12);
                      var8++;
                      continue L3;
                    }
                  } else {
                    var8++;
                    continue L3;
                  }
                } else {
                  var8++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static long a(boolean param0, int param1, bv param2) {
        if (param0) {
            return 100L;
        }
        return (long)de.a(-111, param2, 4, 14, 30, 20);
    }

    final static wk[] a(boolean param0, int param1, int param2) {
        if (!param0) {
            Object var4 = null;
        }
        return ft.a(param1, (byte) -114, param2, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = new rn();
        field_cb = new jl();
        field_Y = "You must play 1 more rated game before playing with the current options.";
        field_X = "Email (Login):";
        field_db = new byte[520];
        field_W = new int[][]{new int[5], new int[3], new int[1]};
    }
}
