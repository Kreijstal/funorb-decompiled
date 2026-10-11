/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static int field_b;
    static String field_c;
    static boolean field_k;
    private int field_a;
    private int field_o;
    private be field_m;
    private be field_n;
    static int field_g;
    private be[] field_e;
    private long field_h;
    static qm field_f;
    static int[] field_j;
    static String[][] field_d;
    static volatile int field_l;
    static boolean field_i;

    public static void a(int param0) {
        field_c = null;
        field_d = (String[][]) null;
        field_j = null;
        field_f = null;
        if (param0 > -31) {
          byte[] var2 = (byte[]) null;
          nk.a((w) null, (w) null, 83, -100, -58, (w) null, (byte[]) null, 7, 17, -108);
        }
    }

    final be b(int param0) {
        int fieldTemp$0 = 0;
        be var2_ref_be;
        int var2;
        int var3;
        be var4;
        var3 = client.field_A ? 1 : 0;
        if (this.field_o > 0 &&
          this.field_e[-1 + this.field_o] != this.field_m) {
          var2_ref_be = this.field_m;
          this.field_m = var2_ref_be.field_p;
          return var2_ref_be;
        }
        do {
          if (this.field_o >= this.field_a) {
            var2 = -38 / ((param0 + 21) / 56);
            return null;
          }
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          var4 = this.field_e[fieldTemp$0].field_p;
          var2_ref_be = var4;
        } while (var4 == this.field_e[this.field_o - 1]);
        this.field_m = var2_ref_be.field_p;
        return var2_ref_be;
    }

    final be d(int param0) {
        be var3 = null;
        int var4 = client.field_A ? 1 : 0;
        if (null == this.field_n) {
          return null;
        }
        if (param0 != -17713) {
          return (be) null;
        }
        be var2 = this.field_e[(int)((long)(this.field_a - 1) & this.field_h)];
        while (var2 != this.field_n) {
          if (this.field_n.field_r == this.field_h) {
            var3 = this.field_n;
            this.field_n = this.field_n.field_p;
            return var3;
          }
          this.field_n = this.field_n.field_p;
        }
        this.field_n = null;
        return null;
    }

    final void a(be param0, int param1, long param2) {
        be var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (null != param0.field_v) {
            param0.e((byte) 75);
          }
          var5 = this.field_e[(int)((long)(this.field_a - 1) & param2)];
          param0.field_p = var5;
          param0.field_v = var5.field_v;
          param0.field_v.field_p = param0;
          param0.field_r = param2;
          param0.field_p.field_v = param0;
          if (param1 != -1) {
            this.b(85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("nk.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final be c(int param0) {
        this.field_o = 0;
        if (param0 != -9443) {
          field_i = true;
        }
        return this.b(-81);
    }

    final static void a(w param0, w param1, int param2, int param3, int param4, w param5, byte[] param6, int param7, int param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = client.field_A ? 1 : 0;
        try {
          rb.field_k = param6;
          uc.field_g = -1L;
          hg.field_b = param3;
          j.field_b = param6.length;
          kk.field_l = new byte[(hg.field_b + 7) / 8];
          fj.field_h = false;
          g.field_N = null;
          cd.field_m = null;
          var10_int = param2;
          for (var11 = 0; var11 < rb.field_k.length; var11++) {
            var10_int = var10_int + (255 & rb.field_k[var11]);
          }
          var10_int = (7 + var10_int) / 8;
          v.field_a = new byte[var10_int];
          if (null == param1.field_M) {
            param1.field_M = new vj();
          }
          i.field_b = param1.field_M;
          i.field_b.c(118);
          ob.field_i = new nk(param4);
          rf.field_o = -1;
          de.field_R = -1;
          cj.field_a = 0;
          ta.field_b = 0;
          if (null == param0.field_M) {
            param0.field_M = new vj();
          }
          h.field_b = param0.field_M;
          h.field_b.c(param2 ^ 105);
          tg.field_b = new nk(param9);
          if (param5.field_M == null) {
            param5.field_M = new vj();
          }
          oc.field_b = param5.field_M;
          oc.field_b.c(121);
          hn.field_h = new nk(param8);
          oa.field_a = param7;
          km.field_C = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("nk.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1, tf param2, boolean param3, int param4, String param5, String param6) {
        RuntimeException var7 = null;
        wj var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (uc.field_c != sh.field_d) {
            return false;
          }
          var8 = new wj(ah.field_c, param2);
          ah.field_c.a((byte) -123, var8);
          if (!dg.b(-40)) {
            ve.field_Gc = param0;
            ea.field_x = null;
            te.field_q = param6;
            sh.field_d = pa.field_V;
            qb.field_t = param5;
            jk.field_e = param4;
            cf.field_i = param3;
          } else {
            var8.b(true);
          }
          if (param1 > 120) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("nk.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param6 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    nk(int param0) {
        int var2 = 0;
        be dupTemp$0 = null;
        be var3 = null;
        this.field_o = 0;
        this.field_e = new be[param0];
        this.field_a = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new be();
          var3 = dupTemp$0;
          this.field_e[var2] = dupTemp$0;
          var3.field_v = var3;
          var3.field_p = var3;
        }
    }

    final be a(int param0, long param1) {
        be var5 = null;
        int var6 = client.field_A ? 1 : 0;
        this.field_h = param1;
        be var4 = this.field_e[(int)((long)(-1 + this.field_a) & param1)];
        this.field_n = var4.field_p;
        while (var4 != this.field_n) {
          if (~this.field_n.field_r == ~param1) {
            var5 = this.field_n;
            this.field_n = this.field_n.field_p;
            return var5;
          }
          this.field_n = this.field_n.field_p;
        }
        if (param0 != 24710) {
          String var7 = (String) null;
          nk.a((String) null, (byte) 91, (tf) null, false, 64, (String) null, (String) null);
        }
        this.field_n = null;
        return null;
    }

    static {
        field_c = "The wildcard special item can be used in place of any other colour.";
        field_j = new int[8];
        field_d = new String[][]{new String[]{"Earthquake", "Causes stacks of loose pieces to collapse."}, new String[]{"Drill", "Individually pops every piece in its path."}, new String[]{"Bomb", "When you pop a shape touching a bomb, everything in your bucket of the same colour will explode."}, new String[]{"Power Drill", "Pops every entire shape, loose or solid, in its path. Loose shapes take touching solid shapes with them!"}, new String[]{"Water Capsule", "Turns every solid shape in your bucket into loose pieces. Can be quite spectacular."}, new String[]{"Poison", "Turns all the loose pieces in your bucket into solid shapes. Not good!"}, new String[]{"Wildcard", "Can be used in place of any other loose piece."}};
        field_f = new qm(8, 0, 4, 1);
        field_l = 0;
        field_i = false;
    }
}
