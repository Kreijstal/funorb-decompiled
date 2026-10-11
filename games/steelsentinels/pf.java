/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf implements qk {
    private int field_q;
    private int field_l;
    static String field_f;
    static int[] field_j;
    private int field_i;
    static wk field_b;
    private int field_k;
    private int field_e;
    static String field_r;
    private int field_a;
    static int field_n;
    private int field_o;
    private int field_p;
    static String field_m;
    private int field_d;
    private int field_g;
    private int field_h;
    private mi field_c;

    public static void a(boolean param0) {
        field_r = null;
        field_b = null;
        field_j = null;
        field_f = null;
        field_m = null;
        if (!param0) {
          field_j = (int[]) null;
        }
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        lh stackIn_3_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        java.applet.Applet var11 = null;
        sb var12 = null;
        try {
          if (!(param1 instanceof sb)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (lh) (param1);
          }
          var12 = (sb) (stackIn_3_0);
          if (var12 != null) {
            param3 = param3 & var12.field_K;
          }
          var7 = 5592405;
          pb.a(param0 + param1.field_o, param1.field_z + param4, param1.field_x, param1.field_E, this.field_l);
          if (param3) {
            var7 = 16777215;
          }
          var8 = this.field_p + (param1.field_o + param0);
          var9 = this.field_k + param1.field_z + param4;
          pb.e(var8, var9, this.field_e, this.field_h, 5592405);
          pb.a(var8, var9, this.field_e, this.field_h, var7);
          if (var12.field_T) {
            pb.d(var8, var9, this.field_e + var8, var9 + this.field_h, 1);
            pb.d(var8 + this.field_e, var9, var8, var9 + this.field_h, 1);
          }
          if (param2 != -30) {
            var11 = (java.applet.Applet) null;
            pf.a((java.applet.Applet) null, -4);
          }
          if (null == this.field_c) {
            return;
          }
          var10 = this.field_e + this.field_p + this.field_a;
          this.field_c.a(param1.field_y, var10 + (param1.field_o + param0), param4 + param1.field_z + this.field_i, param1.field_x - this.field_a - var10, param1.field_E - (this.field_a << 1), this.field_q, this.field_g, this.field_o, this.field_d, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("pf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var3 = var2.indexOf((int) (char)param1);
              var4 = "reload.ws";
              if (0 <= var3) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4);
              param0.getAppletContext().showDocument(ge.a(0, var5, param0), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var2_ref2;
            stackIn_9_1 = new StringBuilder().append("pf.B(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 89 % ((param1 - 62) / 38);
          stackIn_3_0 = (wi.a(param0, (byte) 118) != null);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pf.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    pf(mi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_o = 1;
        this.field_d = 1;
        try {
          this.field_p = param5;
          this.field_h = param7;
          this.field_k = param6;
          this.field_g = param4;
          this.field_q = param3;
          this.field_i = param2;
          this.field_e = param8;
          this.field_l = param9;
          this.field_c = param0;
          this.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_j = new int[5];
        field_f = "Connection lost - attempting to reconnect";
        field_r = "<%1> was destroyed within <%0>'s core containment explosion";
        field_m = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
