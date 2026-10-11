/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends af {
    static String[] field_s;
    private bf field_w;
    static int[] field_q;
    static o field_p;
    private bf[] field_t;
    static gj field_r;
    static String field_u;
    static int field_v;

    final void a(byte param0, o param1) {
        int var5 = 0;
        bf[] var3 = null;
        int var4 = 0;
        bf var6 = null;
        int var7 = 0;
        bf[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          var4 = 12 / ((param0 - 14) / 55);
          var8 = this.field_t;
          var3 = var8;
          for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_k = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ql.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        rc stackIn_5_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        bf var7 = null;
        bf var9 = null;
        pj var10 = null;
        bf var11 = null;
        bf var12 = null;
        bf var13 = null;
        bf var14 = null;
        try {
          if (param0 < 113) {
            return;
          }
          if (param4 instanceof pj) {
            stackIn_5_0 = (rc) (param4);
          } else {
            stackIn_5_0 = null;
          }
          var10 = (pj) (stackIn_5_0);
          kf.a((byte) 97, param3 + param4.field_m, param1 + param4.field_j, param3 + param4.field_m + param4.field_t, param4.field_x + (param4.field_j + param1));
          if (var10 != null) {
            param2 = param2 & var10.field_B;
          }
          var7 = this.field_t[0];
          this.field_w.a(36);
          var7.a(this.field_w, param3, param4, -2147483648, param1, this);
          if (var10 != null) {
            if (var10.field_F) {
              var11 = this.field_t[1];
              if (var11 != null) {
                var11.a(this.field_w, param3, param4, -2147483648, param1, this);
              }
            }
            if (var10.field_v) {
              var12 = this.field_t[3];
              if (var10.field_u != 0 &&
                var12 != null) {
                var12.a(this.field_w, param3, param4, -2147483648, param1, this);
              } else {
                var9 = this.field_t[2];
                if (var9 != null) {
                  var9.a(this.field_w, param3, param4, -2147483648, param1, this);
                }
              }
            }
          }
          if (param4.b(true)) {
            var13 = this.field_t[5];
            if (var13 != null) {
              var13.a(this.field_w, param3, param4, -2147483648, param1, this);
            }
          }
          if (!param2) {
            var14 = this.field_t[4];
            if (var14 != null) {
              var14.a(this.field_w, param3, param4, -2147483648, param1, this);
            }
          }
          this.field_w.a(108, param1, param3, this, param4);
          mf.e(4096);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("ql.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final bf a(byte param0, int param1) {
        if (param0 > -37) {
          return (bf) null;
        }
        bf dupTemp$0 = new bf();
        this.field_t[param1] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(ql param0, boolean param1, int param2) {
        int var4_int = 0;
        bf dupTemp$0 = null;
        bf stackIn_8_0 = null;
        bf stackIn_9_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        bf var5 = null;
        bf var6 = null;
        int var7 = 0;
        o[] var8 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          super.a(param0, 6935);
          if (param1) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_t[var4_int];
              if (var5 == null) {
                param0.field_t[var4_int] = null;
              } else {
                var6 = param0.field_t[var4_int];
                stackIn_8_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new bf();
                  param0.field_t[var4_int] = dupTemp$0;
                  stackIn_9_1 = dupTemp$0;
                } else {
                  stackIn_9_1 = var6;
                }
                ((bf) (Object) stackIn_8_0).a(stackIn_9_1, 2);
              }
            }
          } else {
            fk.a(this.field_t, 0, param0.field_t, 0, 6);
          }
          if (param2 != 30089) {
            var8 = (o[]) null;
            this.a((byte) 62, (o[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ql.W(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0, o[] param1) {
        int var5 = 0;
        bf[] var3 = null;
        int var4 = 0;
        bf var6 = null;
        int var7 = 0;
        bf[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          var8 = this.field_t;
          var3 = var8;
          var4 = -51 % ((param0 + 26) / 48);
          for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_j = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ql.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        if (param0 != 1) {
          return;
        }
        field_s = null;
        field_u = null;
    }

    public ql() {
        this.field_t = new bf[6];
        this.field_w = new bf();
        bf dupTemp$0 = new bf();
        this.field_t[0] = dupTemp$0;
        bf var1 = dupTemp$0;
        var1.a(36);
    }

    final static void d(int param0) {
        u.field_b.j(1);
        if (pc.field_b == null) {
          pc.field_b = new lb(u.field_b, v.field_a);
        }
        u.field_b.b(pc.field_b, -120);
        if (param0 != 18962) {
          field_p = (o) null;
        }
    }

    final void a(byte param0, int param1, o[] param2) {
        int var4_int = 0;
        if (param0 != -60) {
          return;
        }
        try {
          var4_int = param1;
          if (null == this.field_t[var4_int]) {
            this.field_t[var4_int] = new bf();
          }
          this.field_t[param1].field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ql.DA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ql(ql param0, boolean param1) {
        this();
        try {
          param0.a(this, param1, 30089);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_s = new String[]{"Exciting new weapons", "Fullscreen mode", "No adverts"};
        field_q = new int[4];
        field_u = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_v = -1;
    }
}
