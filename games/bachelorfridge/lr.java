/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends bw {
    int field_q;
    int[][] field_h;
    int field_f;
    private int field_n;
    int field_g;
    boolean field_i;
    private int[][][] field_p;
    wia[][] field_o;
    private int field_j;
    int field_m;
    private int field_l;
    static String[] field_k;

    final int[][] b(int param0, int param1) {
        if (param1 >= -1) {
          return (int[][]) null;
        }
        return this.field_p[param0];
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, boolean param6, boolean param7, boolean param8, boolean param9) {
        int var11;
        var11 = BachelorFridge.field_y;
        if (!param6 && (kg.field_b != dg.field_i ||
          kq.field_i != dg.field_c) && (dg.field_c == hga.field_U.field_f &&
          dg.field_i == hga.field_U.field_b)) {
          if (pw.field_w != null) {
            pv.a(false, true);
          } else {
            if (null == rv.field_n) {
              kf.a((byte) -6);
            } else {
              pv.a(true, true);
            }
          }
        }
        if (!param6) {
          ce.field_t = (-640 + kg.field_b) / 2;
        } else {
          ce.field_t = wq.field_n;
        }
        nja.a(param6, (byte) 81);
        if (lfa.field_q > 0) {
          ada.a(param9, 0, param4, param6);
        }
        cw.field_yb.field_L = rea.field_g.field_L;
        cw.field_yb.field_N = param5;
        if (0 < ld.field_p) {
          sr.a(true, param6, param4, param9);
        }
        if (dja.field_m > 0) {
          mh.a(param0, param6, param9, param4, (byte) -51);
        }
        if (w.field_e &&
          pw.field_w.field_Pb <= pw.field_w.field_Rb) {
          qba.field_m.field_wb.field_Z = oia.field_i;
          tv.field_o.field_u = false;
          nn.a((byte) -126, qba.field_m.field_vb);
        } else {
          qba.field_m.field_wb.field_Z = null;
          tv.field_o.field_u = true;
          vt.a(qba.field_m, param4, 0, param8, param1);
        }
        sma.a(param7, param8, -6, param1, param2, param4, param3);
        vt.a(ak.field_q, param4, 0, param8, param1);
        qf.field_v = qf.field_v + 1;
    }

    final static void a(int param0, int param1, int param2, eaa param3, int param4, byte param5) {
        lh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        eaa var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var9 = BachelorFridge.field_y;
        try {
          param4 += 8;
          param1 -= 32;
          var6 = (lh) (param3.b((byte) 90));
          if (param5 != -4) {
            var10 = (eaa) null;
            lr.a(44, -29, -91, (eaa) null, 24, -68);
          }
          var7 = 0;
          while (var6 != null) {
            var8 = (8357 * var6.field_i + var6.field_h * 326565 & 63) + (var6.field_o >> 1);
            if (var8 > 256) {
              var8 = 256;
            }
            var7++;
            ed.field_f[3 + (var7 & 3)].a(param4 + (param2 * var6.field_i >> 16) - 32, param1 + (-(param2 * var6.field_q >> 16) - 34), var6.field_o << 1);
            var6 = (lh) (param3.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_11_0 = var6_ref;
          stackIn_11_1 = new StringBuilder().append("lr.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, int param1) {
        int var3;
        int var5;
        int var4;
        int var3Lifetime1;
        var5 = BachelorFridge.field_y;
        if (this.field_i) {
          return true;
        }
        for (var3 = 0; var3 < this.field_m; var3++) {
          if (param1 == 2) {
            if (this.field_h[var3][0] == -1) {
              return false;
            }
            if (-1 == this.field_h[var3][1]) {
              return false;
            }
          }
        }
        var3Lifetime1 = param0;
        L1: while (true) {
          if (var3Lifetime1 >= this.field_l) {
            return true;
          }
          var4 = 0;
          while (true) {
            if (this.field_n <= var4) {
              var3Lifetime1++;
              continue L1;
            }
            if (-1 != this.field_p[var3Lifetime1][var4][0] &&
              -1 != this.field_p[var3Lifetime1][var4][1]) {
              var4++;
              continue;
            }
            break;
          }
          break;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, eaa param3, int param4, int param5) {
        lh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var9 = BachelorFridge.field_y;
        try {
          var6 = (lh) (param3.b((byte) 90));
          if (param4 != 265949093) {
            field_k = (String[]) null;
          }
          var7 = 0;
          while (var6 != null) {
            var8 = (var6.field_o >> 1) + (630 & 8357 * var6.field_i + var6.field_h * 326565);
            if (var8 > 256) {
              var8 = 256;
            }
            lw.field_b[1 + (var7 & 1)].a(-32 + param1 + (var6.field_i >> 4), -32 + (-2 + (var6.field_q >> 4) + param5) - (var6.field_h >> 5), 256 - ((var6.field_o << 2) + (var6.field_o << 1)));
            var6 = (lh) (param3.c(0));
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_11_0 = var6_ref;
          stackIn_11_1 = new StringBuilder().append("lr.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 != 34) {
          lr.a(54);
        }
    }

    lr(lu param0) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        try {
          if (param0.b(16711935) != 0) {
            param0.field_g = param0.field_g - 1;
            this.field_j = 2;
          } else {
            param0.b(16711935);
            this.field_j = param0.b(16711935);
          }
          this.field_f = param0.b(16711935);
          this.field_q = param0.b(16711935);
          this.field_o = new wia[this.field_f][this.field_q];
          for (var2_int = 0; var2_int < this.field_f; var2_int++) {
            for (var3 = 0; this.field_q > var3; var3++) {
              this.field_o[var2_int][var3] = new wia(param0.b(16711935));
              this.field_o[var2_int][var3].field_a = param0.b(true);
            }
          }
          this.field_l = param0.b(16711935);
          this.field_n = param0.b(16711935);
          this.field_m = param0.b(16711935);
          param0.b(16711935);
          this.field_h = new int[this.field_m][2];
          for (var2_intLifetime1 = 0; this.field_m > var2_intLifetime1; var2_intLifetime1++) {
            this.field_h[var2_intLifetime1] = new int[]{param0.b(true), param0.b(true)};
          }
          this.field_p = new int[this.field_l][this.field_n][2];
          for (var2_intLifetime2 = 0; this.field_l > var2_intLifetime2; var2_intLifetime2++) {
            for (var3Lifetime1 = 0; this.field_n > var3Lifetime1; var3Lifetime1++) {
              this.field_p[var2_intLifetime2][var3Lifetime1] = new int[]{param0.b(true), param0.b(true)};
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("lr.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        if (this.field_i &&
          param0) {
          return true;
        }
        if (param0) {
          return false;
        }
        if (this.field_l < param1) {
          return false;
        }
        if (param4 != -2581) {
          eaa var7 = (eaa) null;
          lr.a(-128, -48, 46, (eaa) null, -89, (byte) 122);
        }
        if (param3 > this.field_n) {
          return false;
        }
        if (param2 == this.field_j) {
          return true;
        }
        return false;
    }

    static {
    }
}
