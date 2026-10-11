/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends ek {
    private oc field_p;
    private oc[] field_q;

    final void a(kc param0, byte param1) {
        oc[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        oc var6 = null;
        int var7 = 0;
        oc[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = Main.field_T;
        try {
          var8 = this.field_q;
          var3 = var8;
          var4 = 0;
          var5 = 43 % ((-3 - param1) / 34);
          while (var8.length > var4) {
            var6 = var8[var4];
            if (var6 != null) {
              var6.field_b = param0;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("nd.M(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(kc[] param0, int param1) {
        oc[] var3 = null;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Main.field_T;
        try {
          var3 = this.field_q;
          var4 = 0;
          if (param1 > -118) {
            this.field_q = (oc[]) null;
          }
          while (var4 < var3.length) {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_f = param0;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("nd.P(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final oc a(byte param0, int param1) {
        if (param0 != -1) {
          lk var4 = (lk) null;
          this.a(8, (lk) null, 72, -15, true);
        }
        oc dupTemp$0 = new oc();
        this.field_q[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(boolean param0, int param1, kc[] param2) {
        int var4_int = param1;
        if (this.field_q[var4_int] == null) {
          this.field_q[var4_int] = new oc();
        }
        if (!param0) {
          return;
        }
        try {
          this.field_q[param1].field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "nd.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, boolean param1, nd param2) {
        int var4_int = 0;
        oc dupTemp$0 = null;
        oc stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        oc stackIn_10_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        oc var5 = null;
        oc var6 = null;
        int var7 = 0;
        var7 = Main.field_T;
        try {
          super.a(param2, (byte) -80);
          if (param1) {
            return;
          }
          if (param0) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_q[var4_int];
              if (var5 == null) {
                param2.field_q[var4_int] = null;
              } else {
                var6 = param2.field_q[var4_int];
                stackIn_9_0 = var5;
                stackIn_9_1 = -59;
                if (var6 == null) {
                  dupTemp$0 = new oc();
                  param2.field_q[var4_int] = dupTemp$0;
                  stackIn_10_2 = dupTemp$0;
                } else {
                  stackIn_10_2 = var6;
                }
                ((oc) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_10_2);
              }
            }
            return;
          }
          og.a(this.field_q, 0, param2.field_q, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("nd.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public nd() {
        this.field_q = new oc[6];
        this.field_p = new oc();
        oc dupTemp$0 = new oc();
        this.field_q[0] = dupTemp$0;
        oc var1 = dupTemp$0;
        var1.a((byte) 44);
    }

    nd(nd param0, boolean param1) {
        this();
        try {
          param0.a(param1, false, this);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        lk stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        oc var7 = null;
        oc var9 = null;
        hl var10 = null;
        oc var11 = null;
        oc var12 = null;
        oc var13 = null;
        oc var14 = null;
        try {
          if (param1 instanceof hl) {
            stackIn_3_0 = (lk) (param1);
          } else {
            stackIn_3_0 = null;
          }
          var10 = (hl) (stackIn_3_0);
          ek.a(param1.field_i + param3, param1.field_h + param1.field_o + param0, param0 + param1.field_o, (byte) 43, param1.field_q + (param1.field_i + param3));
          if (var10 != null) {
            param4 = param4 & var10.field_B;
          }
          var7 = this.field_q[0];
          this.field_p.a((byte) 117);
          var7.a(param3, param1, param0, this, this.field_p, (byte) -10);
          if (param2 != 11447) {
            return;
          }
          if (var10 != null) {
            if (var10.field_D) {
              var11 = this.field_q[1];
              if (var11 != null) {
                var11.a(param3, param1, param0, this, this.field_p, (byte) -105);
              }
            }
            if (var10.field_j) {
              var12 = this.field_q[3];
              if (var10.field_x != 0 &&
                var12 != null) {
                var12.a(param3, param1, param0, this, this.field_p, (byte) -61);
              } else {
                var9 = this.field_q[2];
                if (var9 != null) {
                  var9.a(param3, param1, param0, this, this.field_p, (byte) -19);
                }
              }
            }
          }
          if (param1.d(88)) {
            var13 = this.field_q[5];
            if (var13 != null) {
              var13.a(param3, param1, param0, this, this.field_p, (byte) -120);
            }
          }
          if (!param4) {
            var14 = this.field_q[4];
            if (var14 != null) {
              var14.a(param3, param1, param0, this, this.field_p, (byte) -85);
            }
          }
          this.field_p.a(param0, param1, param3, (byte) 88, this);
          gg.a(14756);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("nd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
