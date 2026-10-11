/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl implements kj {
    static lc field_f;
    private p field_j;
    private tb[] field_b;
    static String field_g;
    static int[] field_i;
    static String field_e;
    static String field_k;
    static boolean field_d;
    static String field_m;
    private int field_c;
    private int field_a;
    private int field_h;
    private eh field_l;

    public final int a(byte param0, int param1) {
        if (param0 > -61) {
          return -51;
        }
        if (this.field_b[param1].field_n) {
          return 0;
        }
        return 1;
    }

    final static boolean a(byte param0, int param1, int param2) {
        if (13 == um.field_Gb) {
          nf.a((byte) -126);
          return true;
        }
        int var3 = 78 / ((param0 + 8) / 47);
        if (102 == um.field_Gb) {
          dk.field_v.h(1026);
          return true;
        }
        if (null == dk.field_v) {
          return false;
        }
        if (!dk.field_v.a(true, param2, param1)) {
          return false;
        }
        return true;
    }

    public final int[] a(float param0, byte param1, int param2) {
        tb var7;
        tb var9;
        tb var10;
        tb var11;
        tb var12;
        tb var13;
        tb var14;
        tb var10Lifetime1;
        tb var13Lifetime1;
        if (param1 < -77) {
          var12 = this.field_b[param2];
          var13 = var12;
          var13Lifetime1 = var12;
          if (var12 == null) {
            return null;
          }
          boolean decompiledFrameRemainder1 = true;
          if ((var12.field_l != null) &&
            (decompiledFrameRemainder1 = (param0 != var12.field_h))) {
            var12.a(false);
            var12.a();
            this.field_c = this.field_c + 1;
          }
          if (decompiledFrameRemainder1) {
            if (!var12.a(param0, this.field_h, this.field_l)) {
              return null;
            }
            if (this.field_c == 0) {
              var14 = (tb) (this.field_j.b(-92));
              var14.a();
            } else {
              this.field_c = this.field_c - 1;
            }
          }
          this.field_j.b(var12, (byte) -45);
          return var12.field_l;
        }
        vl.a(-69);
        var9 = this.field_b[param2];
        var10 = var9;
        var10Lifetime1 = var9;
        var7 = var9;
        if (var9 == null) {
          return null;
        }
        boolean decompiledFrameRemainder0 = true;
        if ((var9.field_l != null) &&
          (decompiledFrameRemainder0 = (param0 != var9.field_h))) {
          var9.a(false);
          var9.a();
          this.field_c = this.field_c + 1;
        }
        if (decompiledFrameRemainder0) {
          if (!var9.a(param0, this.field_h, this.field_l)) {
            return null;
          }
          if (this.field_c == 0) {
            var11 = (tb) (this.field_j.b(-92));
            var11.a();
          } else {
            this.field_c = this.field_c - 1;
          }
        }
        this.field_j.b(var9, (byte) -45);
        return var9.field_l;
    }

    public static void a(boolean param0) {
        field_e = null;
        field_f = null;
        if (param0) {
          vl.a(75);
          field_i = null;
          field_m = null;
          field_k = null;
          field_g = null;
          return;
        }
        field_i = null;
        field_m = null;
        field_k = null;
        field_g = null;
    }

    public final boolean b(int param0, byte param1) {
        if (param1 < 104) {
          this.field_b = (tb[]) null;
          return true;
        }
        return true;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 != 11864) {
          vl.a(-125);
          if (32 >= c.field_a) {
            bm.d(0, 0);
          } else {
            var1 = c.field_a % 32;
            if (var1 == 0) {
              var1 = 32;
            }
            bm.d(-var1 + c.field_a, 0);
          }
          return;
        }
        if (32 >= c.field_a) {
          bm.d(0, 0);
        } else {
          var1Lifetime1 = c.field_a % 32;
          if (var1Lifetime1 == 0) {
            var1Lifetime1 = 32;
          }
          bm.d(-var1Lifetime1 + c.field_a, 0);
        }
    }

    public final int a(int param0, byte param1) {
        int var3 = -101 / ((param1 - 57) / 59);
        if (this.field_b[param0] == null) {
          return 0;
        }
        return this.field_b[param0].field_i;
    }

    public final boolean a(int param0, int param1) {
        if (param1 != 0) {
          this.field_h = -1;
          return this.field_h == 64 ? true : false;
        }
        return this.field_h == 64 ? true : false;
    }

    vl(eh param0, eh param1, int param2, int param3) {
        int var7 = 0;
        int[] var5 = null;
        int var6 = 0;
        jc var8 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        this.field_j = new p();
        this.field_c = 0;
        this.field_h = 128;
        try {
          this.field_a = param2;
          this.field_l = param1;
          this.field_c = this.field_a;
          this.field_h = param3;
          var12 = param0.e((byte) 125, 0);
          var11 = var12;
          var10 = var11;
          var5 = var10;
          var6 = var12.length;
          this.field_b = new tb[param0.d((byte) 43, 0)];
          for (var7 = 0; var7 < var6; var7++) {
            var8 = new jc(param0.a(0, var12[var7], 0));
            this.field_b[var12[var7]] = new tb(var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("vl.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_f = new lc(14, 0, 4, 1);
        field_g = "Chat is currently disabled.";
        field_e = "Create";
        field_m = "Loading textures";
    }
}
