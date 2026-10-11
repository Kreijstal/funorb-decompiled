/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends jtb {
    ds field_p;
    int field_r;
    static int field_o;
    byte field_q;
    static String field_s;

    public static void g(byte param0) {
        field_s = null;
        if (param0 != 114) {
          km.g((byte) -103);
        }
    }

    final byte[] a(int param0) {
        int var2;
        if (this.field_n) {
          throw new RuntimeException();
        }
        if (this.field_p.field_e < this.field_p.field_h.length - this.field_q) {
          throw new RuntimeException();
        }
        var2 = 9 / ((17 - param0) / 58);
        return this.field_p.field_h;
    }

    final static void e(int param0) {
        fva.field_p = true;
        ow.field_b = 0;
        if (param0 != 1) {
          field_o = -76;
        }
    }

    final static void a(asb param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        wma var5 = null;
        int[] var6 = null;
        int var7 = 0;
        faa var8 = null;
        int var9 = 0;
        faa var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = VoidHunters.field_G;
        try {
          var8 = new faa(param0.a("", true, "logo.fo3d"));
          var10 = var8;
          var3 = var10.e((byte) -87);
          var10.p(-23497);
          gs.field_a = bh.a(var10, (byte) -122);
          raa.field_p = new int[var3][];
          eha.field_o = new wma[var3];
          for (var4 = 0; var3 > var4; var4++) {
            eha.field_o[var4] = ur.a(var8, (byte) -105);
          }
          var10.f((byte) -79);
          var9 = 0;
          var4Lifetime1 = var9;
          if (param1 != 36) {
            return;
          }
          while (var9 < var3) {
            var5 = eha.field_o[var9];
            var5.a(-21227, 6, 6, 6, 1);
            var5.a(param1 + 83);
            var6 = new int[]{var5.field_B + var5.field_d >> 1, var5.field_a + var5.field_u >> 1, var5.field_s + var5.field_q >> 1};
            raa.field_p[var9] = var6;
            var5.a(param1 - 45, -var6[2], -var6[0], -var6[1]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("km.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void f(byte param0) {
        if (param0 != -119) {
          km.g((byte) 33);
        }
        if (qmb.field_q == 10) {
          twa.b(param0 ^ -108);
          qmb.field_q = 11;
        } else {
          if (!nua.b(true)) {
            twa.b(param0 ^ -108);
            qmb.field_q = 11;
          }
        }
        dga.field_a = true;
    }

    km() {
    }

    final int e(byte param0) {
        if (null == this.field_p) {
          return 0;
        }
        if (param0 != -4) {
          return -96;
        }
        return this.field_p.field_e * 100 / (this.field_p.field_h.length - this.field_q);
    }

    static {
        field_o = 5;
        field_s = "External ship design loaded";
    }
}
