/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends cj {
    boolean field_Pb;
    int field_bc;
    cj field_Ub;
    boolean field_Ob;
    long field_Kb;
    static String field_Xb;
    static int[] field_Ib;
    static int field_Qb;
    cj field_Hb;
    String field_Lb;
    int field_Mb;
    int field_Vb;
    boolean field_Nb;
    int field_Sb;
    static ri field_Wb;
    int field_Fb;
    String field_Jb;
    static cj field_ac;
    long field_ec;
    int field_Yb;
    cj field_cc;
    static int[] field_dc;
    cj field_Gb;
    cj field_Tb;
    static int field_Zb;
    static String field_Rb;

    final boolean a(byte param0, dm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        boolean stackIn_18_0 = false;
        boolean stackIn_22_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param1.field_Ob) ? 0 : 1;
          if (stackIn_3_0 == (this.field_Ob ? 1 : 0)) {
            stackIn_6_0 = this.field_Ob;
            return stackIn_6_0;
          }
          if (param0 >= -53) {
            this.field_Hb = (cj) null;
          }
          stackIn_12_0 = (this.field_Pb) ? 0 : 1;
          if (param1.field_Pb) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if (stackIn_12_0 != stackIn_15_1) {
            stackIn_18_0 = this.field_Pb;
            return stackIn_18_0;
          }
          stackIn_22_0 = !(this.field_Kb >= param1.field_Kb);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("dm.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        if (param0 != 15) {
          this.field_Gb = (cj) null;
        }
        return !this.c(0) ? true : false;
    }

    final static sj a(byte param0, ga param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        sj stackIn_2_0 = null;
        sj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.d((byte) 69);
          var3 = param1.d((byte) 69);
          var4 = param1.d((byte) 69);
          if (param0 < 37) {
            stackIn_2_0 = (sj) null;
            return stackIn_2_0;
          }
          var5 = param1.d((byte) 69);
          var6 = param1.i(-1478490344);
          var7 = param1.i(-1478490344);
          var8 = param1.g(31365);
          stackIn_4_0 = new sj(var2_int, var3, var4, var5, var6, var7, var8);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("dm.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_Rb = null;
        field_Ib = null;
        field_ac = null;
        field_dc = null;
        field_Wb = null;
        field_Xb = null;
        if (param0 != 0) {
          field_Xb = (String) null;
        }
    }

    dm(String param0, String param1, long param2) {
        super(0L, (cj) null);
        CharSequence var6 = null;
        try {
          this.field_Jb = param0;
          this.field_Lb = param1;
          this.field_ec = param2;
          var6 = (CharSequence) ((Object) this.field_Jb);
          tg.a(var6, false);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(String param0, String param1, int param2) {
        CharSequence var5 = null;
        try {
          this.field_Jb = param0;
          this.field_Lb = param1;
          if (param2 != 43) {
            this.field_Kb = -111L;
          }
          var5 = (CharSequence) ((Object) this.field_Jb);
          tg.a(var5, false);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dm.BA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        int var5 = 0;
        field_Xb = "Similar rating";
        field_dc = new int[43];
        field_Ib = new int[43];
        double var0 = 0.0;
        double var2 = 0.5983986006837702;
        int var4 = 14;
        for (var5 = 0; var5 < 42; var5++) {
          field_dc[var5] = (int)(Math.sin(var0) * ((double)(var5 < var4 ? 2 : var5 >= 2 * var4 ? 8 : 4) * 20.0));
          field_Ib[var5] = (int)(20.0 * (double)(var4 <= var5 ? var5 >= var4 * 2 ? 8 : 4 : 2) * Math.cos(var0));
          var0 = var0 + var2;
        }
        field_dc[42] = 0;
        field_Ib[42] = 0;
        field_Rb = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
