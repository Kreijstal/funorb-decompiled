/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo extends vh {
    private vh field_Nb;
    static vh field_Lb;
    vh field_Pb;
    static int field_Qb;
    static String field_Ob;
    static vh[] field_Mb;

    final int a(int param0, int param1, int param2) {
        if (param0 != 0) {
          return -21;
        }
        int var4 = -param1;
        int var5 = -param1;
        if (null != this.field_Nb) {
          var4 = this.field_Nb.b(true);
        }
        if (this.field_Pb != null) {
          var5 = this.field_Pb.b(true);
        }
        return var5 + (param2 + var4) + param1 + param2;
    }

    uo(long param0, vh param1, vh param2, vh param3, dd param4, String param5) {
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
            this.field_Nb = new vh(0L, param2);
            this.field_Nb.field_hb = param4;
            this.a(-99, this.field_Nb);
          }
          if (param5 != null) {
            this.field_Pb = new vh(0L, param3, param5);
            this.a(92, this.field_Pb);
            this.d((byte) -125);
          } else {
            this.d((byte) -125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("uo.<init>(").append(param0).append(',');
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
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void f(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        oq var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        tq var11 = null;
        i var12 = null;
        oq var13 = null;
        tq var14 = null;
        var8 = Pool.field_O;
        try {
          var13 = kn.field_e;
          var2 = var13.g(-94);
          if (param0 >= -102) {
            uo.f(44);
          }
          if (0 == var2) {
            var10 = ek.a(121);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var13;
            var6 = ((ge) ((Object) var5)).g(-101);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((ge) ((Object) var5)).b(true);
            }
            var11 = (tq) (hb.field_j.c((byte) 77));
            if (var11 == null) {
              dn.c(-107);
              return;
            }
            var11.field_l = var3;
            var11.field_s = true;
            var11.a((byte) -117);
            return;
          }
          if (var2 == 1) {
            var12 = (i) (ue.field_b.c((byte) -19));
            if (var12 == null) {
              dn.c(-69);
              return;
            }
            var12.a((byte) -117);
          } else {
            if (2 == var2) {
              var14 = (tq) (hb.field_j.c((byte) -112));
              if (var14 == null) {
                dn.c(-81);
                return;
              }
              var14.field_l = ek.a(117);
              var14.field_s = true;
              var14.a((byte) -117);
            } else {
              tc.a((Throwable) null, "A1: " + t.a(99), -8555);
              dn.c(84);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "uo.F(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        field_Ob = null;
        if (param0 != -102) {
          uo.c(true);
        }
        field_Mb = null;
        field_Lb = null;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        this.b(param6, 2147483647, param0, param5, param3);
        this.a(param4, (byte) -97, param2);
        if (!param1) {
          this.a(-47, (byte) 126, 26);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        var4 = -param0;
        if (this.field_Nb != null) {
          var4 = this.field_Nb.b(true);
        }
        var5 = -param0;
        if (this.field_Pb != null) {
          var5 = this.field_Pb.a(-100, -param2 + (-param0 + this.field_gb + (-param2 - var4)));
        }
        var6 = param2 + (param0 + var4 + (param2 + var5));
        if (var6 > this.field_gb) {
          var5 = var5 + (this.field_gb - var6);
          var6 = this.field_gb;
        }
        if (this.field_Fb == 1) {
          param2 = param2 + (-var6 + this.field_gb) / 2;
        }
        if (2 == this.field_Fb) {
          param2 = param2 + (-var6 + this.field_gb);
        }
        if (this.field_Nb != null) {
          this.field_Nb.b(0, 2147483647, param2, var4, this.field_Db);
          this.field_Nb.field_cb = this.field_cb;
        }
        if (this.field_Pb != null) {
          this.field_Pb.b(0, 2147483647, param0 + param2 + var4, var5, this.field_Db);
          if (this.field_Nb != null) {
            this.field_Pb.field_Fb = 0;
          } else {
            this.field_Pb.field_Fb = this.field_Fb;
          }
          this.field_Pb.field_cb = this.field_cb;
        }
        if (param1 > -78) {
          this.field_Pb = (vh) null;
        }
    }

    final static void c(boolean param0) {
        aa var1 = null;
        lk var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        try {
          if (ne.field_r.c(0)) {
            return;
          }
          var1 = new aa(ne.field_r);
          var2 = (lk) (var1.b((byte) -92));
          if (var2.field_v) {
            var2.field_q = 16;
          }
          while (var2 != null) {
            if (var2.field_v &&
              var2.field_p >= 230) {
              var2.a((byte) -117);
            }
            var2 = (lk) (var1.b(-117));
          }
          if (param0) {
            uo.f((byte) 125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "uo.C(" + param0 + ')');
        }
    }

    static {
        field_Ob = "<%0>: Ball-in-hand!";
        field_Qb = -1;
    }
}
