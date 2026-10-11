/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends qr {
    qr field_Bb;
    private qr field_Db;
    static qr field_zb;
    static int field_Cb;
    static qr field_Ab;
    static String field_yb;
    static String field_xb;

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        nq var7;
        int var5Lifetime1;
        int var6Lifetime1;
        var4 = -param1;
        if (param0 == 50) {
          if (this.field_Db != null) {
            var4 = this.field_Db.e(false);
          }
          var5 = -param1;
          if (null != this.field_Bb) {
            var5 = this.field_Bb.a(-param2 + (-param1 - param2) + (this.field_K - var4), (byte) -79);
          }
          var6 = param2 + (var4 + param2) - (-param1 - var5);
          if (this.field_K < var6) {
            var5 = var5 + (this.field_K - var6);
            var6 = this.field_K;
          }
          if (this.field_y == 1) {
            param2 = param2 + (-var6 + this.field_K) / 2;
          }
          if (this.field_y == 2) {
            param2 = param2 + (this.field_K - var6);
          }
          if (null != this.field_Db) {
            this.field_Db.a(var4, this.field_mb, (byte) 61, 0, param2);
            this.field_Db.field_G = this.field_G;
          }
          if (this.field_Bb == null) {
            return;
          }
          this.field_Bb.a(var5, this.field_mb, (byte) 50, 0, param2 + (var4 + param1));
          if (this.field_Db != null) {
            this.field_Bb.field_y = 0;
          } else {
            this.field_Bb.field_y = this.field_y;
          }
          this.field_Bb.field_G = this.field_G;
          return;
        }
        var7 = (nq) null;
        sg.a(true, false, -42, (String) null, (nq) null);
        if (this.field_Db != null) {
          var4 = this.field_Db.e(false);
        }
        var5Lifetime1 = -param1;
        if (null != this.field_Bb) {
          var5Lifetime1 = this.field_Bb.a(-param2 + (-param1 - param2) + (this.field_K - var4), (byte) -79);
        }
        var6Lifetime1 = param2 + (var4 + param2) - (-param1 - var5Lifetime1);
        if (this.field_K < var6Lifetime1) {
          var5Lifetime1 = var5Lifetime1 + (this.field_K - var6Lifetime1);
          var6Lifetime1 = this.field_K;
        }
        if (this.field_y == 1) {
          param2 = param2 + (-var6Lifetime1 + this.field_K) / 2;
        }
        if (this.field_y == 2) {
          param2 = param2 + (this.field_K - var6Lifetime1);
        }
        if (null != this.field_Db) {
          this.field_Db.a(var4, this.field_mb, (byte) 61, 0, param2);
          this.field_Db.field_G = this.field_G;
        }
        if (this.field_Bb == null) {
          return;
        }
        this.field_Bb.a(var5Lifetime1, this.field_mb, (byte) 50, 0, param2 + (var4 + param1));
        if (this.field_Db != null) {
          this.field_Bb.field_y = 0;
        } else {
          this.field_Bb.field_y = this.field_y;
        }
        this.field_Bb.field_G = this.field_G;
        return;
    }

    sg(long param0, qr param1, qr param2, qr param3, bi param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Db = new qr(0L, param2);
            this.field_Db.field_pb = param4;
            this.a(4, this.field_Db);
          }
          if (param5 != null) {
            this.field_Bb = new qr(0L, param3, param5);
            this.a(4, this.field_Bb);
            this.e((byte) -128);
          } else {
            this.e((byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("sg.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param5, param1, (byte) 42, param2, param6);
        this.a(param0, param4, param3);
    }

    public static void f(byte param0) {
        field_zb = null;
        field_Ab = null;
        field_yb = null;
        field_xb = null;
        if (param0 != 34) {
          nq var2 = (nq) null;
          sg.a(false, false, -26, (String) null, (nq) null);
        }
    }

    final static void a(boolean param0, boolean param1, int param2, String param3, nq param4) {
        int var7 = 0;
        int var6 = 0;
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null == cb.field_h) {
            cb.field_h = new pf();
          }
          var9 = new String[32];
          var10 = var9;
          var6 = param4.a(param3, new int[]{600}, var10);
          if (param1) {
            param2 = param2 - var6 * 50;
          }
          if (!param0) {
            return;
          }
          for (var7 = 0; var6 > var7; var7++) {
            cb.field_h.a((byte) -113, new hd(var9[var7], param4, var7 * 50 + param2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("sg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = -param0;
        int var5 = -param0;
        if (null != this.field_Db) {
          var4 = this.field_Db.e(false);
        }
        if (param1 <= -62) {
          if (this.field_Bb != null) {
            var5 = this.field_Bb.e(false);
          }
          return var5 + var4 + (param2 + (param0 + param2));
        }
        this.field_Bb = (qr) null;
        if (this.field_Bb != null) {
          var5 = this.field_Bb.e(false);
        }
        return var5 + var4 + (param2 + (param0 + param2));
    }

    final static as a(byte param0, mg param1) {
        as var2 = null;
        RuntimeException var2_ref = null;
        mg var3 = null;
        as stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new as(param1);
          var2.field_v = -var2.field_v;
          if (param0 != 101) {
            var3 = (mg) null;
            sg.a((byte) -73, (mg) null);
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("sg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_yb = "This resource is limiting your fleet production.";
        field_xb = "Unfortunately you are not eligible to create an account.";
    }
}
