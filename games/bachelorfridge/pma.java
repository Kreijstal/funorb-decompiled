/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pma extends k {
    private int field_l;
    static boolean field_k;
    private int field_n;
    private int field_m;

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2;
          if (0 == var4_int) {
            this.a(param1.a(3), true);
          }
          if (param0 != -71) {
            this.field_n = 29;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("pma.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        if (!param1) {
          pma.b(-29, -88);
        }
        this.field_n = 4080 & param0 >> 4;
        this.field_l = 4080 & param0 >> 12;
        this.field_m = 4080 & param0 << 4;
    }

    private pma(int param0) {
        super(0, false);
        this.a(param0, true);
    }

    final int[][] a(boolean param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = BachelorFridge.field_y;
        int[][] var9 = this.field_h.a(param1, -858);
        int[][] var3 = var9;
        if (this.field_h.field_b) {
          var4 = var9[0];
          var5 = var9[1];
          var6 = var9[2];
          for (var7 = 0; var7 < hh.field_d; var7++) {
            var4[var7] = this.field_l;
            var5[var7] = this.field_n;
            var6[var7] = this.field_m;
          }
        }
        if (param0) {
          this.field_m = 48;
        }
        return var3;
    }

    final static void a(byte param0, boolean param1) {
        int var2;
        int stackIn_8_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        int stackIn_15_5;
        boolean stackIn_16_6 = false;
        mla.b((byte) 5);
        if (param0 != 122) {
          pma.a((byte) 49, false);
        }
        if (pw.field_w != null) {
          stackIn_8_0 = (hfa.a(pw.field_w.field_Rb, param0 - 120)) ? 1 : 0;
        } else {
          stackIn_8_0 = 0;
        }
        var2 = stackIn_8_0;
        stackIn_13_0 = (vs.field_d) || (gja.field_n);
        stackIn_15_1 = 14;
        stackIn_15_2 = 13;
        stackIn_15_3 = 15;
        stackIn_15_4 = var2;
        stackIn_15_5 = vc.field_a;
        stackIn_16_6 = (md.field_l <= 50) ? false : true;
        gfa.a(stackIn_13_0, stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4 != 0, stackIn_15_5, stackIn_16_6, param1, 0, true, 109, 11);
        if (aba.field_f) {
          sja.field_fb.c(57, (byte) 100);
          aba.field_f = false;
        }
        if (efa.field_p) {
          sja.field_fb.c(10, (byte) 97);
          efa.field_p = false;
        }
    }

    final static void b(int param0, int param1) {
        bf.field_h = new lw[11];
        bf.field_h[0] = (lw) ((Object) new wa());
        bf.field_h[1] = (lw) ((Object) new wb());
        bf.field_h[2] = (lw) ((Object) new li());
        bf.field_h[3] = (lw) ((Object) new dp());
        bf.field_h[4] = (lw) ((Object) new nia());
        bf.field_h[5] = (lw) ((Object) new cha());
        bf.field_h[6] = (lw) ((Object) new bda());
        bf.field_h[7] = (lw) ((Object) new dea());
        bf.field_h[8] = (lw) ((Object) new iq());
        bf.field_h[9] = (lw) ((Object) new ih());
        bf.field_h[10] = (lw) ((Object) new sc());
        if (param1 != 20208) {
          pma.b(121, -115);
        }
        wca.field_n = param0;
        if (8 >= wca.field_n) {
          iaa.field_a = false;
        }
        if (wca.field_n <= 3) {
          sh.field_I = false;
        }
        if (8 > wca.field_n) {
          pka.field_f = false;
        }
        if (wca.field_n <= 3) {
          ku.field_q = false;
        }
        if (wca.field_n <= 5) {
          gi.field_a = false;
        }
        if (wca.field_n <= 8) {
          cm.field_v = false;
        }
        if (wca.field_n <= 2) {
          hp.field_a = false;
        }
        if (wca.field_n <= 7) {
          wf.field_x = false;
        }
        if (wca.field_n <= 5) {
          gla.field_k = false;
        }
        if (wca.field_n < 8) {
          mka.field_j = false;
        }
        if (wca.field_n <= 5) {
          bfa.field_a = false;
        }
        if (o.d((byte) 54)) {
          af.field_a = false;
        } else {
          bf.field_h[wca.field_n].a(108);
          ua.field_b = true;
          af.field_a = true;
          aga.d(false);
        }
    }

    public pma() {
        this(0);
    }

    static {
    }
}
