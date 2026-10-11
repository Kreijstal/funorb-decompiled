/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends hl {
    private int field_Mb;
    private oh[] field_Zb;
    static ei field_bc;
    private int field_Yb;
    static int field_Pb;
    private int[] field_Sb;
    static String field_Kb;
    private int field_Rb;
    private int field_Qb;
    private int field_Tb;
    private hl field_Ob;
    static int field_Nb;
    static int field_Vb;
    private nh[] field_Lb;
    private int field_ac;
    static ve field_Wb;
    private int field_Xb;
    private hl field_Ub;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var11;
        int var9;
        int var10;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var7Lifetime3;
        int var8Lifetime3;
        var11 = TetraLink.field_J;
        if (this.field_Rb != 0) {
          var6 = 0;
          for (var7 = 0; this.field_Rb > var7; var7++) {
            var8 = this.field_Lb[var7].b(-26606, this.field_Qb, this.field_Mb);
            if (var6 < var8) {
              var6 = var8;
            }
          }
          var6 = var6 + 2 * this.field_Tb;
          var7Lifetime3 = this.field_Yb + this.field_Yb + this.field_Rb * this.field_Xb;
          var8Lifetime3 = eo.a(var6, (byte) 123, param4, param0);
          var9 = mh.a(param3, param1, var7Lifetime3, -8748);
          this.a((byte) -80, var6, var9, var7Lifetime3, var8Lifetime3);
          var10 = 0;
          if (param2 >= -13) {
            return;
          }
          while (this.field_Rb > var10) {
            this.field_Lb[var10].b(0, var6 - 2 * this.field_Tb, this.field_Yb + var10 * this.field_Xb, this.field_Qb, this.field_Tb, this.field_Mb, this.field_Xb);
            var10++;
          }
          return;
        }
        this.field_Lb[this.field_Rb] = new nh(0L, (hl) null, (hl) null, this.field_Ob, (oh) null, field_Kb);
        this.field_Lb[this.field_Rb].field_J = 1;
        this.a((byte) -95, this.field_Lb[this.field_Rb]);
        this.field_Sb[this.field_Rb] = -1;
        this.field_Rb = this.field_Rb + 1;
        var6Lifetime1 = 0;
        for (var7Lifetime1 = 0; this.field_Rb > var7Lifetime1; var7Lifetime1++) {
          var8Lifetime1 = this.field_Lb[var7Lifetime1].b(-26606, this.field_Qb, this.field_Mb);
          if (var6Lifetime1 < var8Lifetime1) {
            var6Lifetime1 = var8Lifetime1;
          }
        }
        var6Lifetime1 = var6Lifetime1 + 2 * this.field_Tb;
        var7Lifetime2 = this.field_Yb + this.field_Yb + this.field_Rb * this.field_Xb;
        var8Lifetime2 = eo.a(var6Lifetime1, (byte) 123, param4, param0);
        var9Lifetime1 = mh.a(param3, param1, var7Lifetime2, -8748);
        this.a((byte) -80, var6Lifetime1, var9Lifetime1, var7Lifetime2, var8Lifetime2);
        var10Lifetime1 = 0;
        if (param2 >= -13) {
          return;
        }
        while (this.field_Rb > var10Lifetime1) {
          this.field_Lb[var10Lifetime1].b(0, var6Lifetime1 - 2 * this.field_Tb, this.field_Yb + var10Lifetime1 * this.field_Xb, this.field_Qb, this.field_Tb, this.field_Mb, this.field_Xb);
          var10Lifetime1++;
        }
    }

    final void a(int param0, oh param1, int param2, String param3) {
        try {
          this.field_Lb[this.field_Rb] = new nh((long)param2, (hl) null, (hl) null, this.field_Ub, param1, param3);
          this.field_Lb[this.field_Rb].field_kb = this.field_Zb;
          this.field_Lb[this.field_Rb].field_Cb = true;
          this.field_Lb[this.field_Rb].field_J = 1;
          this.a((byte) 92, this.field_Lb[this.field_Rb]);
          this.field_Sb[this.field_Rb] = param0;
          this.field_Rb = this.field_Rb + 1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        try {
          this.field_Lb[this.field_Rb] = new nh(0L, (hl) null, (hl) null, this.field_Ub, (oh) null, param0);
          this.field_Lb[this.field_Rb].field_kb = this.field_Zb;
          this.field_Lb[this.field_Rb].field_Cb = true;
          this.field_Lb[this.field_Rb].field_J = param1;
          this.a((byte) -93, this.field_Lb[this.field_Rb]);
          this.field_Sb[this.field_Rb] = param2;
          this.field_Rb = this.field_Rb + 1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "aa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 == -2) {
          field_Wb = null;
          field_Kb = null;
          field_bc = null;
          return;
        }
        field_Pb = 25;
        field_Wb = null;
        field_Kb = null;
        field_bc = null;
    }

    final static void d(byte param0) {
        String var3 = (String) null;
        ve.a(-1, (String) null, pl.field_e);
        if (param0 < 36) {
          String var2 = (String) null;
          aa.a((String) null, -21, -48, (String) null);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = TetraLink.field_J;
        if (param3 <= param0) {
          if (param5 > param0) {
            qi.a(param1, param4, (byte) 98, param2, param0, param5, ra.field_b, param3, param6);
          } else {
            if (param3 >= param5) {
              qi.a(param2, param1, (byte) 98, param4, param3, param0, ra.field_b, param5, param6);
            } else {
              qi.a(param2, param4, (byte) 98, param1, param5, param0, ra.field_b, param3, param6);
            }
          }
        } else {
          if (param5 > param3) {
            qi.a(param1, param2, (byte) 98, param4, param3, param5, ra.field_b, param0, param6);
          } else {
            if (param5 <= param0) {
              qi.a(param4, param1, (byte) 98, param2, param0, param3, ra.field_b, param5, param6);
            } else {
              qi.a(param4, param2, (byte) 98, param1, param5, param3, ra.field_b, param0, param6);
            }
          }
        }
        if (param7 > 88) {
          return;
        }
        field_Vb = -56;
    }

    aa(hl param0, oh[] param1, hl param2, hl param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Sb = new int[256];
        this.field_Lb = new nh[256];
        this.field_ac = -2;
        try {
          this.field_Qb = param6;
          this.field_Tb = param4;
          this.field_Mb = param5;
          this.field_Xb = param8;
          this.field_Ub = param3;
          this.field_Yb = param7;
          this.field_Ob = param2;
          this.field_Zb = param1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "aa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean e(byte param0) {
        if (this.field_ac != -2) {
          return false;
        }
        if (dg.field_e == 13) {
          this.field_ac = -1;
          if (param0 == -87) {
            return true;
          }
          return false;
        }
        if (param0 == -87) {
          return true;
        }
        return false;
    }

    final static String a(String param0, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        bc var5 = null;
        int var6 = 0;
        ud var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param0);
          if (!gi.a(false, var8)) {
            stackIn_3_0 = uk.field_u;
            return stackIn_3_0;
          }
          if (ji.field_Tb != param2) {
            stackIn_6_0 = uf.field_a;
            return stackIn_6_0;
          }
          var7 = fh.a(param2 ^ -32053, param3);
          if (var7 == null) {
            stackIn_9_0 = sk.a(new String[]{param3}, am.field_e, 121);
            return stackIn_9_0;
          }
          var7.b(false);
          var7.e(0);
          ca.field_c = ca.field_c - 1;
          var5 = nd.field_Lb;
          var5.f(param1, (byte) -92);
          var5.field_t = var5.field_t + 1;
          var6 = var5.field_t;
          var5.a(3, false);
          var5.a(param0, 0);
          var5.b(-var6 + var5.field_t, param2 - 4);
          stackIn_11_0 = null;
          return (String) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("aa.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = TetraLink.field_J;
        this.a(0, param0);
        if (!param0) {
          return -2;
        }
        if (param1 > -90) {
          field_Kb = (String) null;
        }
        for (var3 = 0; this.field_Rb > var3; var3++) {
          if (this.field_Lb[var3].field_F != 0) {
            return this.field_Sb[var3];
          }
        }
        if (tm.field_t == 0) {
          return this.field_ac;
        }
        return -1;
    }

    aa(aa param0) {
        this(param0, param0.field_Zb, param0.field_Ob, param0.field_Ub, param0.field_Tb, param0.field_Mb, param0.field_Qb, param0.field_Yb, param0.field_Xb);
    }

    static {
        field_Kb = "No options available";
        field_Nb = 0;
    }
}
