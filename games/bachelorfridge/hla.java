/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hla extends bca {
    static lu field_t;
    static pj field_s;
    nq field_q;
    static String field_r;

    public static void d(int param0) {
        field_s = null;
        field_r = null;
        if (param0 > -64) {
            field_t = null;
            field_t = null;
            return;
        }
        field_t = null;
    }

    final void a(op param0, int param1) {
        int var3 = -37 % ((param1 - 12) / 35);
        ((hla) this).a(param0, (byte) -2);
    }

    hla(int param0, nq param1, nq param2) {
        super(param0, param1);
        ((hla) this).field_q = param2;
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new vea(param1, (hla) this);
    }

    hla(lu param0) {
        super(param0);
        ((hla) this).field_k = param0.e((byte) 72);
        ((hla) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((hla) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((hla) this).field_q = qi.a(param0, (byte) 12);
    }

    final void a(byte param0, lu param1) {
        if (param0 > -12) {
            return;
        }
        this.a((byte) -107, param1);
        er.a(((hla) this).field_q, 112, param1);
    }

    final static sba a(int param0, ee[] param1, byte[] param2) {
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        byte[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        byte[][] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        var9 = BachelorFridge.field_y;
        if ((param1.length ^ -1) == -257) {
          var26 = new int[256];
          var21 = var26;
          var16 = var21;
          var11 = var16;
          var10 = var11;
          var3 = var10;
          var27 = new int[256];
          var22 = var27;
          var17 = var22;
          var12 = var17;
          var4 = var12;
          var28 = new int[256];
          var23 = var28;
          var18 = var23;
          var13 = var18;
          var5 = var13;
          if (param0 != 4676) {
            return null;
          } else {
            var29 = new int[256];
            var24 = var29;
            var19 = var24;
            var14 = var19;
            var6 = var14;
            var30 = new byte[256][];
            var25 = var30;
            var20 = var25;
            var15 = var20;
            var7 = var15;
            var8 = 0;
            L0: while (true) {
              if (-257 >= (var8 ^ -1)) {
                return new sba(param2, var26, var27, var28, var29, param1[0].field_h, var30);
              } else {
                var10[var8] = param1[var8].field_f;
                var4[var8] = param1[var8].field_c;
                var5[var8] = param1[var8].field_d;
                var6[var8] = param1[var8].field_e;
                var7[var8] = param1[var8].field_g;
                var8++;
                continue L0;
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new lu(30000);
        field_r = "Connection lost - attempting to reconnect";
    }
}
