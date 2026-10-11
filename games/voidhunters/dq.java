/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    private int[] field_f;
    private int field_c;
    private int field_d;
    private int field_b;
    private int field_a;
    private int[] field_e;

    final static void a(byte param0, int param1, boolean param2) {
        soa stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        boolean stackIn_6_4 = false;
        llb stackIn_22_0 = null;
        String stackIn_23_1 = null;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ij var4 = null;
        Object var5 = null;
        vu var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        hqb var16 = null;
        hqb var17 = null;
        var15 = VoidHunters.field_G;
        try {
          if (param0 < 17) {
            return;
          }
          stackIn_5_0 = vra.field_b.field_xb;
          stackIn_5_1 = 38;
          stackIn_5_2 = 2;
          stackIn_5_3 = param1 * (2 + nna.field_w) * 3;
          stackIn_6_4 = (qg.field_a == vra.field_b.field_xb);
          var3_int = ((soa) (Object) stackIn_5_0).a((byte) stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_6_4, param2, 2 + nna.field_w) ? 1 : 0;
          var4 = vra.field_b.field_yb.field_lb;
          if (iwa.field_b != 2 &&
            1 != iwa.field_b) {
            vra.field_b.field_xb.field_xb.field_R = dsa.field_o;
            vra.field_b.field_y = false;
            igb.a(vra.field_b.field_yb, (byte) -25);
            return;
          }
          vra.field_b.field_xb.field_xb.field_R = null;
          vra.field_b.field_y = true;
          var5 = null;
          var6 = (vu) (var4.d(0));
          while (var6 != null) {
            var7 = 0;
            if (var6.field_lb == null) {
              var6.field_wb = new llb(0L, bsa.field_q);
              var6.b(-561, var6.field_wb);
              var6.field_Bb = new llb(0L, bsa.field_q);
              var6.b(-561, var6.field_Bb);
              var7 = 1;
              var6.g(127);
            }
            var6.field_hb = vra.field_b.field_yb.field_hb;
            var6.field_wb.a(0, -55, var6.field_hb, 0, nna.field_w);
            var8 = 0;
            if (null != var6.field_vb &&
              !var6.field_vb.equals("")) {
              var6.field_Bb.field_tb = iqb.field_o;
              var6.field_Bb.field_qb = 16737894;
              var8 = 1;
              var6.field_Bb.a(0, -87, iqb.field_o.field_m + 3, 0, nna.field_w);
            }
            var9 = 0;
            var10 = var6.field_hb;
            if (var8 != 0) {
              var9 = 3 + iqb.field_o.field_m;
              var10 = var10 - var9;
            }
            stackIn_22_0 = var6.field_wb;
            if (var10 <= 0) {
              stackIn_23_1 = var6.field_Fb;
            } else {
              stackIn_23_1 = no.a(var6.field_wb.field_eb, var6.field_Fb, var10);
            }
            stackIn_22_0.field_R = stackIn_23_1;
            stackIn_26_0 = (var6.field_wb.field_R.equals(var6.field_Fb)) ? 0 : 1;
            var11 = stackIn_26_0;
            var6.field_wb.a(var9, 117, var10, 0, nna.field_w);
            if (var3_int == 0) {
              var6.field_E = -var6.field_G + nna.field_w;
            }
            if (var7 != 0) {
              vra.field_b.field_yb.a((llb) (var5), 2, var6, -113);
            }
            if (var6.field_Bb != null &&
              var6.field_Bb.field_O) {
              lob.field_a = var6.field_vb;
            } else {
              if (var6.field_wb.field_O &&
                var11 != 0) {
                lob.field_a = var6.field_Fb;
              }
            }
            var5 = var6;
            if (var6.field_o != 0) {
              pea.$cfr$intArgs$a$91f64d33677c(0L, var6, -1, (int[]) null, var6.field_Cb, vra.field_b.field_xb, var6.field_Fb, 72, -1);
              var16 = cka.field_o;
              var13_ref_String = ci.field_a;
              var16.field_i.a(var13_ref_String, (byte) -53, 7);
              var17 = cka.field_o;
              var13 = oq.field_H;
              var14 = qs.field_a;
              var17.field_i.b(var13, -29060, var14, 0, 0);
            }
            var6 = (vu) (var4.a((byte) 66));
          }
          if (0 != vra.field_b.field_wb.field_o) {
            ola.field_p = new qka(vra.field_b.field_wb.field_M, vra.field_b.field_wb.field_u, vra.field_b.field_wb.field_hb, vra.field_b.field_wb.field_G, mw.field_d, msa.field_o, qc.field_q, qc.field_q);
            rc.field_b = 2;
          }
          if (0 == vra.field_b.field_zb.field_o) {
            return;
          }
          ola.field_p = new qka(vra.field_b.field_zb.field_M, vra.field_b.field_zb.field_u, vra.field_b.field_zb.field_hb, vra.field_b.field_zb.field_G, cab.field_q, msa.field_o, qc.field_q, qc.field_q);
          rc.field_b = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "dq.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var11 = VoidHunters.field_G;
        int var2Lifetime1;
        int var2Lifetime2;
        if (!param0) {
          this.field_f = (int[]) null;
        }
        int var8 = -1640531527;
        int var7 = -1640531527;
        int var3 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        int var4 = -1640531527;
        int var9 = -1640531527;
        for (var2 = 0; 4 > var2; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var4 = var4 + this.field_e[1 + var2Lifetime1];
          var5 = var5 + this.field_e[2 + var2Lifetime1];
          var9 = var9 + this.field_e[var2Lifetime1 + 6];
          var8 = var8 + this.field_e[5 + var2Lifetime1];
          var10 = var10 + this.field_e[7 + var2Lifetime1];
          var6 = var6 + this.field_e[var2Lifetime1 + 3];
          var7 = var7 + this.field_e[4 + var2Lifetime1];
          var3 = var3 + this.field_e[var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_f[var2Lifetime1] = var3;
          this.field_f[1 + var2Lifetime1] = var4;
          this.field_f[2 + var2Lifetime1] = var5;
          this.field_f[3 + var2Lifetime1] = var6;
          this.field_f[4 + var2Lifetime1] = var7;
          this.field_f[var2Lifetime1 + 5] = var8;
          this.field_f[6 + var2Lifetime1] = var9;
          this.field_f[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var9 = var9 + this.field_f[var2Lifetime2 + 6];
          var10 = var10 + this.field_f[var2Lifetime2 + 7];
          var3 = var3 + this.field_f[var2Lifetime2];
          var6 = var6 + this.field_f[3 + var2Lifetime2];
          var8 = var8 + this.field_f[var2Lifetime2 + 5];
          var5 = var5 + this.field_f[2 + var2Lifetime2];
          var7 = var7 + this.field_f[4 + var2Lifetime2];
          var4 = var4 + this.field_f[var2Lifetime2 + 1];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_f[var2Lifetime2] = var3;
          this.field_f[var2Lifetime2 + 1] = var4;
          this.field_f[2 + var2Lifetime2] = var5;
          this.field_f[3 + var2Lifetime2] = var6;
          this.field_f[var2Lifetime2 + 4] = var7;
          this.field_f[var2Lifetime2 + 5] = var8;
          this.field_f[6 + var2Lifetime2] = var9;
          this.field_f[var2Lifetime2 + 7] = var10;
        }
        this.b((byte) 57);
        this.field_c = 256;
    }

    private final void b(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        if (param0 != 57) {
          this.field_d = 8;
        }
        int fieldTemp$0 = this.field_b + 1;
        this.field_b = this.field_b + 1;
        this.field_a = this.field_a + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_f[var2];
          if (0 == (2 & var2)) {
            if (0 != (var2 & 1)) {
              this.field_d = this.field_d ^ this.field_d >>> 6;
            } else {
              this.field_d = this.field_d ^ this.field_d << 13;
            }
          } else {
            if ((var2 & 1) == 0) {
              this.field_d = this.field_d ^ this.field_d << 2;
            } else {
              this.field_d = this.field_d ^ this.field_d >>> 16;
            }
          }
          this.field_d = this.field_d + this.field_f[255 & 128 + var2];
          dupTemp$1 = this.field_a + this.field_f[dla.a(var3 >> 2, 255)] + this.field_d;
          var4 = dupTemp$1;
          this.field_f[var2] = dupTemp$1;
          dupTemp$2 = this.field_f[dla.a(var4 >> 8, 1020) >> 2] + var3;
          this.field_a = dupTemp$2;
          this.field_e[var2] = dupTemp$2;
        }
    }

    final int a(byte param0) {
        if (this.field_c == 0) {
          this.b((byte) 57);
          this.field_c = 256;
        }
        if (param0 != -41) {
          this.field_a = -75;
        }
        int fieldTemp$0 = this.field_c - 1;
        this.field_c = this.field_c - 1;
        return this.field_e[fieldTemp$0];
    }

    dq(int[] param0) {
        int var2_int = 0;
        try {
          this.field_e = new int[256];
          this.field_f = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_e[var2_int] = param0[var2_int];
          }
          this.a(true);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "dq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
