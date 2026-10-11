/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends a {
    static int field_r;
    static le[] field_t;
    static int field_v;
    static int[] field_u;
    private hc[] field_s;
    private hc field_q;

    public ak() {
        this.field_s = new hc[6];
        this.field_q = new hc();
        hc dupTemp$0 = new hc();
        this.field_s[0] = dupTemp$0;
        hc var1 = dupTemp$0;
        var1.a(0);
    }

    ak(ak param0, boolean param1) {
        this();
        try {
          param0.a(124, this, param1);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(le[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
          if (param1 != 4986) {
            this.field_q = (hc) null;
          }
          var4_int = param2;
          if (this.field_s[var4_int] == null) {
            this.field_s[var4_int] = new hc();
          }
          this.field_s[param2].field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ak.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(le[] param0, int param1) {
        int var4 = 0;
        hc[] var3 = null;
        hc var5 = null;
        int var6 = 0;
        hc[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 != 250) {
            return;
          }
          var7 = this.field_s;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_e = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ak.CA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, ak param1, boolean param2) {
        int var4_int = 0;
        hc dupTemp$0 = null;
        hc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        hc stackIn_9_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        hc var5 = null;
        hc var6 = null;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          super.a(false, param1);
          if (param2) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_s[var4_int];
              if (var5 == null) {
                param1.field_s[var4_int] = null;
              } else {
                var6 = param1.field_s[var4_int];
                stackIn_8_0 = var5;
                stackIn_8_1 = 124;
                if (var6 == null) {
                  dupTemp$0 = new hc();
                  param1.field_s[var4_int] = dupTemp$0;
                  stackIn_9_2 = dupTemp$0;
                } else {
                  stackIn_9_2 = var6;
                }
                ((hc) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2);
              }
            }
          } else {
            gl.a(this.field_s, 0, param1.field_s, 0, 6);
          }
          if (param0 < 100) {
            ak.a((byte) -47);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ak.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if ((param0 <= ~param1 ||
            128 <= param1) &&
            (param1 < 160 ||
            255 < param1)) {
            if (param1 != 0) {
              var6 = sb.field_n;
              var2 = var6;
              var3 = 0;
              while (var6.length > var3) {
                var4 = var6[var3];
                if (var4 != param1) {
                  var3++;
                  continue;
                }
                return true;
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "ak.DA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != -1) {
          ak.a((byte) -46);
        }
        field_u = null;
        field_t = null;
    }

    final void a(byte param0, le param1) {
        hc[] var3 = null;
        int var4 = 0;
        hc var5 = null;
        int var6 = 0;
        hc[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var7 = this.field_s;
          var3 = var7;
          var4 = 0;
          if (param0 != 1) {
            return;
          }
          while (var4 < var7.length) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_a = param1;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ak.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (uj.field_i != -ea.field_b + 0 &&
          uj.field_i == -ea.field_b + 250) {
        }
        if (param0 != 99) {
          return;
        }
        uj.field_i = uj.field_i + 1;
    }

    final hc a(byte param0, int param1) {
        if (param0 != -102) {
          field_t = (le[]) null;
        }
        hc dupTemp$0 = new hc();
        this.field_s[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        we stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        hc var7 = null;
        hc var9 = null;
        ak var10 = null;
        t var11 = null;
        hc var12 = null;
        hc var13 = null;
        hc var14 = null;
        hc var15 = null;
        try {
          if (param1 instanceof t) {
            stackIn_3_0 = (we) (param1);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (t) (stackIn_3_0);
          qi.a(param1.field_r + param3 + param1.field_l, true, param1.field_p + param1.field_e + param2, param1.field_r + param3, param2 + param1.field_e);
          if (var11 != null) {
            param0 = param0 & var11.field_w;
          }
          if (param4 < 19) {
            var10 = (ak) null;
            this.a(123, (ak) null, false);
          }
          var7 = this.field_s[0];
          this.field_q.a(0);
          var7.a(param3, this, param2, 84, param1, this.field_q);
          if (var11 != null) {
            if (var11.field_u) {
              var12 = this.field_s[1];
              if (var12 != null) {
                var12.a(param3, this, param2, 112, param1, this.field_q);
              }
            }
            if (var11.field_g) {
              var13 = this.field_s[3];
              if (var11.field_t != 0 &&
                var13 != null) {
                var13.a(param3, this, param2, 100, param1, this.field_q);
              } else {
                var9 = this.field_s[2];
                if (var9 != null) {
                  var9.a(param3, this, param2, 115, param1, this.field_q);
                }
              }
            }
          }
          if (param1.b((byte) 56)) {
            var14 = this.field_s[5];
            if (var14 != null) {
              var14.a(param3, this, param2, 114, param1, this.field_q);
            }
          }
          if (!param0) {
            var15 = this.field_s[4];
            if (var15 != null) {
              var15.a(param3, this, param2, 120, param1, this.field_q);
            }
          }
          this.field_q.a(this, param1, (byte) -2, param2, param3);
          tj.b(653);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("ak.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_r = 0;
        field_v = 2;
    }
}
