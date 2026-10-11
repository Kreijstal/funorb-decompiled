/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends lb {
    static int field_u;
    static int field_v;
    static String field_q;
    static String field_t;
    static ko[] field_x;
    private pm field_w;
    static int field_s;
    static String field_y;
    private pm[] field_r;

    public static void b(int param0) {
        field_t = null;
        field_x = null;
        field_y = null;
        field_q = null;
        if (param0 != -5082) {
          field_y = (String) null;
        }
    }

    fk(fk param0, boolean param1) {
        this();
        try {
          param0.a(this, 6, param1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ce a(boolean param0, String param1) {
        String var2 = null;
        ce var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        ce stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = CrazyCrystals.field_B;
        try {
          if (vl.field_d == null) {
            stackIn_3_0 = null;
            return (ce) (stackIn_3_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = fe.a(60136, var6);
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (ce) (vl.field_d.a((long)var2.hashCode(), param0));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_fb);
            var4 = fe.a(60136, var7);
            if (var4 == null) {
              var4 = var3.field_fb;
            }
            if (var4.equals(var2)) {
              stackIn_16_0 = var3;
              return stackIn_16_0;
            }
            var3 = (ce) (vl.field_d.b(50));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("fk.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public fk() {
        this.field_r = new pm[6];
        this.field_w = new pm();
        pm dupTemp$0 = new pm();
        this.field_r[0] = dupTemp$0;
        pm var1 = dupTemp$0;
        var1.a(0);
    }

    final void a(int param0, int param1, dl[] param2) {
        int var4_int = 0;
        try {
          var4_int = param0;
          if (this.field_r[var4_int] == null) {
            this.field_r[var4_int] = new pm();
          }
          if (param1 != 0) {
            this.field_r = (pm[]) null;
          }
          this.field_r[param0].field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fk.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(dl[] param0, int param1) {
        int var4 = 0;
        pm[] var3 = null;
        pm var5 = null;
        int var6 = 0;
        pm[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = CrazyCrystals.field_B;
        try {
          var7 = this.field_r;
          var3 = var7;
          for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_k = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("fk.DA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(fk param0, int param1, boolean param2) {
        int var4_int = 0;
        pm dupTemp$0 = null;
        pm stackIn_10_0 = null;
        pm stackIn_11_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        pm var5 = null;
        pm var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          if (param1 != 6) {
            return;
          }
          super.a((byte) 119, param0);
          if (param2) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_r[var4_int];
              if (var5 == null) {
                param0.field_r[var4_int] = null;
              } else {
                var6 = param0.field_r[var4_int];
                stackIn_10_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new pm();
                  param0.field_r[var4_int] = dupTemp$0;
                  stackIn_11_1 = dupTemp$0;
                } else {
                  stackIn_11_1 = var6;
                }
                ((pm) (Object) stackIn_10_0).a(stackIn_11_1, -127);
              }
            }
            return;
          }
          eg.a(this.field_r, 0, param0.field_r, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("fk.AA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(dl param0, int param1) {
        int var4 = 0;
        pm[] var3 = null;
        pm var5 = null;
        int var6 = 0;
        pm[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = CrazyCrystals.field_B;
        try {
          if (param1 != -13869) {
            this.a((byte) 78, -108);
          }
          var7 = this.field_r;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_h = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("fk.CA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final pm a(byte param0, int param1) {
        int var3 = 2 / ((param0 + 73) / 46);
        pm dupTemp$0 = new pm();
        this.field_r[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        qm stackIn_5_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        pm var7 = null;
        pm var9 = null;
        pc var10 = null;
        pm var11 = null;
        pm var12 = null;
        pm var13 = null;
        pm var14 = null;
        try {
          if (param1) {
            return;
          }
          if (!(param3 instanceof pc)) {
            stackIn_5_0 = null;
          } else {
            stackIn_5_0 = (qm) (param3);
          }
          var10 = (pc) (stackIn_5_0);
          qp.a(param2 + param3.field_r, param0 - (-param3.field_j - param3.field_f), param3.field_r + param2 + param3.field_g, (byte) 73, param0 + param3.field_j);
          if (var10 != null) {
            param4 = param4 & var10.field_x;
          }
          var7 = this.field_r[0];
          this.field_w.a(0);
          var7.a(this, param0, -101, param3, param2, this.field_w);
          if (var10 != null) {
            if (var10.field_A) {
              var11 = this.field_r[1];
              if (var11 != null) {
                var11.a(this, param0, -49, param3, param2, this.field_w);
              }
            }
            if (var10.field_m) {
              var12 = this.field_r[3];
              if (var10.field_s != 0 &&
                var12 != null) {
                var12.a(this, param0, -73, param3, param2, this.field_w);
              } else {
                var9 = this.field_r[2];
                if (var9 != null) {
                  var9.a(this, param0, -39, param3, param2, this.field_w);
                }
              }
            }
          }
          if (param3.e(-122)) {
            var13 = this.field_r[5];
            if (var13 != null) {
              var13.a(this, param0, -106, param3, param2, this.field_w);
            }
          }
          if (!param4) {
            var14 = this.field_r[4];
            if (var14 != null) {
              var14.a(this, param0, 16, param3, param2, this.field_w);
            }
          }
          this.field_w.a(this, param2, param3, param0, 36);
          lg.a(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("fk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_q = "This password contains repeated characters, and would be easy to guess";
        field_y = "Discard";
        field_t = "ON";
    }
}
