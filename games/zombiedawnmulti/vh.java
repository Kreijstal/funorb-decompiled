/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends cj {
    static String field_Nb;
    static boolean field_Mb;
    int field_Ob;
    static ej field_Gb;
    private int field_Jb;
    static String field_Fb;
    static boolean field_Hb;
    static ri field_Lb;
    static String[] field_Ib;
    private ja field_Kb;

    final void j(int param0) {
        int var2;
        int var3;
        var2 = bd.field_g - this.field_x;
        var3 = -this.field_Q + bo.field_d;
        if ((param0 & jf.field_e) != 0 &&
          var3 >= 0 &&
          var3 < this.field_z) {
          if (var2 >= 0 &&
            this.field_zb > var2) {
            this.field_Ob = this.field_Kb.field_B[this.field_Kb.field_x * var3 + var2];
          }
          if (4 + this.field_zb <= var2 &&
            this.field_zb + 12 > var2) {
            this.field_Jb = -(185 * var3 / this.field_z) + 255;
            this.a(this.field_Kb, 12);
          }
        }
    }

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -24) {
            field_Hb = false;
          }
          if (!param0) {
            stackIn_6_0 = e.field_c.a(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = wn.field_u.a(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vh.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    vh(long param0, cj param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3, param4, param5, (String) null);
        this.field_Jb = 190;
        try {
          this.field_Kb = new ja(param4, param5);
          this.a(this.field_Kb, 12);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "vh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_6_0 = false;
        if (param1 != 85) {
          field_Mb = true;
        }
        stackIn_6_0 = (param0 >= 48) && (57 >= param0);
        return stackIn_6_0;
    }

    final void i(int param0) {
        int var2;
        int var3;
        int var4;
        this.field_Kb.c(this.field_x, this.field_Q);
        oo.a(4 + this.field_zb + this.field_x, this.field_Q, 8, this.field_z, 16777215, 4671303);
        var4 = 18 / ((param0 - 16) / 42);
        var2 = -this.field_x + bd.field_g;
        var3 = bo.field_d - this.field_Q;
        if ((jf.field_e & 1) != 0 &&
          var3 >= 0 && !(this.field_z <= var3) && (var2 >= 0 &&
          var2 < this.field_zb)) {
          oo.c(bd.field_g, bo.field_d, 2, 0);
        }
    }

    private final void a(ja param0, int param1) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = 0;
          if (param1 != 12) {
            vh.c((byte) 47);
          }
          while (param0.field_w > var3_int) {
            for (var4 = 0; var4 < param0.field_x; var4++) {
              var5 = var4 * 256 / param0.field_x;
              var6 = -(var3_int * 256 / param0.field_w) + 255;
              param0.field_B[var3_int * param0.field_x + var4] = gi.a(var6, this.field_Jb, var5, (byte) -115);
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("vh.BA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 >= -97) {
          return;
        }
        field_Ib = null;
        field_Lb = null;
        field_Fb = null;
        field_Gb = null;
        field_Nb = null;
    }

    final static void a(int param0, int[] param1, Object[] param2) {
        try {
          if (param0 != -7255) {
            Object[] var4 = (Object[]) null;
            vh.a(((int[]) (param2[10]))[0], (int[]) null, (Object[]) null);
          }
          qf.a(param2, 0, 2, param1.length - 1, param1);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "vh.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int h(int param0) {
        if (param0 <= 10) {
          return -120;
        }
        return lq.field_d;
    }

    static {
        field_Mb = false;
        field_Nb = "Status";
        field_Hb = false;
        field_Ib = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
