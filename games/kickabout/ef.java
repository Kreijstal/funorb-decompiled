/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends am {
    private int field_o;
    static String field_p;
    static String field_n;
    private byte[][] field_r;
    static String field_s;
    db[] field_q;

    public static void h(byte param0) {
        int var1 = 35 % ((-83 - param0) / 36);
        field_p = null;
        field_s = null;
        field_n = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          if (!hw.a(param0, -26200, true)) {
            return false;
          }
          if (param1 != -9907) {
            field_n = (String) null;
          }
          var2_int = 0;
          while (true) {
            if (param0.length() <= var2_int) {
              return true;
            }
            if (ws.a(param0.charAt(var2_int), (byte) 121)) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ef.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean g(byte param0) {
        int var7 = 0;
        int[] var2_ref_int__;
        int var2;
        int var3_int;
        tf var3;
        int var4;
        int var5;
        iw var5_ref_iw;
        int var6;
        iw var9;
        int var10;
        Object var11;
        je var12;
        int var13;
        int[] var14;
        je var15;
        int var16;
        int[] var17;
        int[] var21;
        byte[] var28;
        int[] var29;
        byte[] var30;
        int var3_intLifetime1;
        var13 = Kickabout.field_G;
        if (this.field_q != null) {
          return true;
        }
        if (null == this.field_r) {
          if (!gd.field_c.b((byte) 20, this.field_o)) {
            return false;
          }
          var21 = gd.field_c.c(this.field_o, 4);
          var17 = var21;
          var14 = var17;
          var2_ref_int__ = var14;
          this.field_r = new byte[var21.length][];
          for (var3_int = 0; var21.length > var3_int; var3_int++) {
            this.field_r[var3_int] = gd.field_c.b(this.field_o, -32669, var21[var3_int]);
          }
        }
        var2 = 1;
        var16 = 0;
        var3_intLifetime1 = var16;
        while (var16 < this.field_r.length) {
          var28 = this.field_r[var16];
          var5_ref_iw = new iw(var28);
          var5_ref_iw.field_n = 1;
          var6 = var5_ref_iw.a((byte) 81);
          var2 = var2 != 0 & gs.field_d.b(var6, 119) ? 1 : 0;
          var16++;
        }
        if (var2 == 0) {
          return false;
        }
        var5 = 57 % ((param0 - 36) / 42);
        var3 = new tf();
        var4 = gd.field_c.a(true, this.field_o);
        this.field_q = new db[var4];
        var29 = gd.field_c.c(this.field_o, 4);
        for (var7 = 0; var29.length > var7; var7++) {
          var30 = this.field_r[var7];
          var9 = new iw(var30);
          var9.field_n = 1;
          var10 = var9.a((byte) 81);
          var11 = null;
          var12 = (je) (var3.g(24009));
          while (var12 != null) {
            if (~var12.field_l != ~var10) {
              var12 = (je) (var3.c(33));
              continue;
            }
            var11 = var12;
            break;
          }
          if (var11 == null) {
            var15 = new je(var10, gs.field_d.a(0, var10));
            var11 = var15;
            var3.a(var15, 3);
          }
          this.field_q[var29[var7]] = new db(var30, (je) (var11));
        }
        this.field_r = (byte[][]) null;
        return true;
    }

    ef(int param0) {
        this.field_o = param0;
    }

    static {
        field_n = "Insufficient funds!";
        field_p = "Show all game chat";
        field_s = "<%0> goes through <%1> for making more passes than <%2>";
    }
}
