/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class il extends jl {
    private oa field_ab;
    private int field_jb;
    private vg field_ib;
    private int field_db;
    static bi field_gb;
    private int field_Z;
    static String field_fb;
    static ob field_kb;
    static a field_bb;
    static String field_Y;
    static String field_lb;
    private int field_mb;
    private int field_X;
    static String field_hb;
    private cg field_eb;
    static float field_cb;

    private final void a(int param0, vg param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_eb) {
            this.field_eb.b((byte) -124);
          }
          if (param1 != null) {
            param1.a(6 + this.field_db, param1.field_n, (byte) 121, 6, param1.field_x);
            this.field_eb = new cg(param1);
          } else {
            this.field_eb = new cg();
          }
          this.b((byte) -97, this.field_eb);
          this.field_ib = null;
          if (param0 <= -5) {
            return;
          }
          this.k(-80);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("il.WB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    il(tc param0, vg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_x, param1.field_n + param2 + 12);
        try {
          this.field_db = param2;
          this.field_mb = param4;
          this.field_jb = param3;
          this.field_X = param3;
          this.a(-75, param1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "il.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_eb != null) {
            if (98 == param0) {
              this.field_eb.a((byte) -60, param3);
            }
            if (param0 == 99) {
              this.field_eb.a((byte) -23, param3);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("il.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void h(byte param0) {
        if (param0 == 88) {
          field_hb = null;
          field_gb = null;
          field_Y = null;
          field_lb = null;
          field_kb = null;
          field_bb = null;
          field_fb = null;
          return;
        }
        il.h((byte) -12);
        field_hb = null;
        field_gb = null;
        field_Y = null;
        field_lb = null;
        field_kb = null;
        field_bb = null;
        field_fb = null;
    }

    final void g(byte param0) {
        if (this.field_ab == gs.field_j) {
          return;
        }
        this.field_Z = 0;
        this.field_ab = je.field_a;
        if (param0 <= -100) {
          this.a(-125, this.field_ib);
          this.field_eb.field_J = 0;
          this.field_ib = null;
          return;
        }
    }

    boolean a(byte param0) {
        int fieldTemp$0 = 0;
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime1Lifetime1;
        if (null == this.field_ab) {
          var2 = -108 % ((param0 + 23) / 52);
          return super.a((byte) 81);
        }
        if (gs.field_j == this.field_ab) {
          fieldTemp$0 = this.field_Z + 1;
          this.field_Z = this.field_Z + 1;
          if (this.field_X != fieldTemp$0) {
            this.field_eb.field_J = -((this.field_Z << 8) / this.field_X) + 256;
            var2Lifetime1 = -108 % ((param0 + 23) / 52);
            return super.a((byte) 81);
          }
          this.field_ab = hd.field_s;
          this.b(-127, this.field_mb, 12 + this.field_ib.field_x, this.field_ib.field_n + this.field_db + 12);
          this.field_Z = 0;
          this.field_eb.field_J = 0;
          var2Lifetime1Lifetime1 = -108 % ((param0 + 23) / 52);
          return super.a((byte) 81);
        }
        if (this.field_ab != je.field_a) {
          var2Lifetime2 = -108 % ((param0 + 23) / 52);
          return super.a((byte) 81);
        }
        int fieldTemp$1 = this.field_Z + 1;
        this.field_Z = this.field_Z + 1;
        if (fieldTemp$1 == this.field_jb) {
          this.field_eb.field_J = 256;
          this.field_ab = null;
          var2Lifetime3 = -108 % ((param0 + 23) / 52);
          return super.a((byte) 81);
        }
        this.field_eb.field_J = (this.field_Z << 8) / this.field_jb;
        var2Lifetime4 = -108 % ((param0 + 23) / 52);
        return super.a((byte) 81);
    }

    void b(vg param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 87 / ((51 - param1) / 57);
          this.field_ib = param0;
          if (hd.field_s == this.field_ab) {
            this.b(-55, this.field_mb, this.field_ib.field_x + 12, this.field_ib.field_n + this.field_db + 12);
            this.field_Z = 0;
            return;
          }
          if (gs.field_j == this.field_ab) {
            return;
          }
          this.field_ab = gs.field_j;
          this.field_Z = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("il.AB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void n(int param0) {
        if (null != this.field_ab) {
          if (this.field_ab != je.field_a) {
            this.b(12 + this.field_db + this.field_ib.field_n, 12 + this.field_ib.field_x, (byte) -109);
            this.a(-107, this.field_ib);
          }
          this.field_eb.field_J = 256;
          this.field_ab = null;
        }
        super.n(param0);
    }

    final static void a(int param0, int param1, int param2, bi param3) {
        int var17 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null == ra.field_a ||
            ra.field_a.length != gf.field_b) {
            ra.field_a = new int[gf.field_b];
          }
          var4_int = param2 & 15;
          param2 = param2 >> 4;
          var5 = param0 & 15;
          param0 = param0 >> 4;
          var12 = param1;
          var13 = param3.field_z * param2 + param0;
          var14 = -gf.field_b + param3.field_z;
          var15 = -gf.field_k;
          while (0 > var15) {
            var16 = 0;
            for (var17 = -1 + gf.field_b; 0 <= var17; var17--) {
              var6 = param3.field_B[var13];
              var8 = var6 & 65280;
              var7 = var6 & 16711935;
              var10 = 267390960 & var5 * var7;
              var11 = var5 * var8 & 1044480;
              var9 = var11 | var10;
              var8Lifetime1 = var16 + var9;
              var7Lifetime1 = 267390960 & var8Lifetime1;
              var16 = (var6 << 4) - var9;
              var6Lifetime1 = var8Lifetime1 & 1044480;
              var10Lifetime1 = -16711936 & var4_int * var7Lifetime1;
              var11Lifetime1 = 16711680 & var6Lifetime1 * var4_int;
              var9Lifetime1 = var10Lifetime1 | var11Lifetime1;
              gf.field_h[var12] = ra.field_a[var17] + var9Lifetime1 >> 8;
              ra.field_a[var17] = (var8Lifetime1 << 4) - var9Lifetime1;
              var12++;
              var13++;
            }
            var15++;
            var13 = var13 + var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("il.VB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean k(int param0) {
        if (param0 != 0) {
          return true;
        }
        this.n(7489);
        return super.k(0);
    }

    static {
        field_fb = "Kick <%0> from this game";
        field_gb = null;
        field_lb = "Click to stop building fleets in this territory.";
        field_hb = "Accept NAP";
        field_Y = "WAITING FOR 1 PLAYER.";
    }
}
