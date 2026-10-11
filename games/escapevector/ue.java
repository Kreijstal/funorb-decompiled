/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ue extends hc {
    private cn field_D;
    private String[] field_F;
    private bl field_E;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param2 - this.field_k;
        int var6 = param1 - this.field_j;
        bl var7 = this.a(var6, (byte) -110, var5);
        if (var7 != null &&
          null != this.field_q) {
          ((sg) ((Object) this.field_q)).a(param0 ^ 18321, this, var7.field_m, param3);
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (byte) 87, param2, param3);
        if (param1 <= 85) {
          this.field_D = (cn) null;
        }
        if (param2 != 0) {
          return;
        }
        ao var9 = (ao) ((Object) this.field_s);
        bl var6 = this.field_E;
        if (var6 == null) {
        } else {
          var7 = var9.a((byte) -113, (hm) (this), param3);
          var8 = var9.a((hm) (this), param0, -16956);
          do {
            ic.a(false, 2 + var6.field_j, var6.field_i + var7 - 2, var6.field_n + 2, -2 + var8 + var6.field_g);
            var6 = var6.field_k;
          } while (var6 != null);
        }
    }

    final void a(String param0, byte param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          if (this.field_F == null ||
            param2 >= this.field_F.length) {
            var7 = new String[1 + param2];
            var8 = var7;
            var4 = var8;
            if (this.field_F != null) {
              for (var5 = 0; this.field_F.length > var5; var5++) {
                var7[var5] = this.field_F[var5];
              }
            }
            this.field_F = var8;
          }
          if (param1 < 51) {
            ue.b(-38, (byte) -110);
          }
          this.field_F[param2] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("ue.I(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void k(int param0) {
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        ao var3;
        pg var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        vl var12;
        int var13;
        int var14;
        bl var15;
        int var16;
        int var7Lifetime1;
        var16 = EscapeVector.field_A;
        this.field_D = new cn();
        var2 = param0;
        var3 = (ao) ((Object) this.field_s);
        var4 = var3.b((hm) (this), 90);
        while (true) {
          var5 = this.field_l.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_l.indexOf(">", var5);
          var6 = this.field_l.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_l.indexOf("</hotspot>", var5);
          var8 = var4.a(var5, 0);
          var9 = var4.a(var2, 0);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_a[var11];
            if (var8 == var11) {
              stackIn_7_0 = var4.a((byte) 122, var5);
            } else {
              stackIn_7_0 = var12.field_b[0];
            }
            var13 = stackIn_7_0;
            if (var11 == var9) {
              stackIn_12_0 = var4.a((byte) 125, var2);
            } else {
              if (var12 == null) {
                stackIn_12_0 = 0;
              } else {
                stackIn_12_0 = var12.field_b[-1 + var12.field_b.length];
              }
            }
            var14 = stackIn_12_0;
            var15 = new bl(var7Lifetime1, var13, var12.field_d, -var13 + var14, Math.max(var3.a(109), var12.field_a - var12.field_d));
            if (var10 != null) {
              ((bl) (var10)).field_k = var15;
            }
            this.field_D.a(-12328, var15);
            var10 = var15;
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (!param3) {
          ue.b(-85, (byte) -78);
        }
        super.a(param0, param1, param2, param3, param4);
        this.k(0);
    }

    ue(String param0, db param1) {
        super(param0, (wn) null);
        this.field_E = null;
        try {
          this.field_s = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final bl a(int param0, byte param1, int param2) {
        bl var4;
        bl var5;
        int var6;
        var6 = EscapeVector.field_A;
        var4 = (bl) (this.field_D.a(false));
        if (param1 > -83) {
          return (bl) null;
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param2 >= var5.field_i &&
              var5.field_g <= param0 &&
              var5.field_i + var5.field_j > param2 &&
              var5.field_g + var5.field_n >= param0) {
              return var4;
            }
            var5 = var5.field_k;
          }
          var4 = (bl) (this.field_D.b((byte) 70));
        }
        return null;
    }

    final static void b(int param0, byte param1) {
        try {
          try {
            sd.a((byte) 106, oc.d((byte) -62), new Object[]{new Integer(param0)}, "resizing");
          } catch (Throwable throwable) {
          }
          if (param1 <= 93) {
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.a(param2, param3, param1, true, ((ao) ((Object) this.field_s)).a(-106, (hm) (this)));
        if (param0 != 2463) {
          this.field_F = (String[]) null;
        }
    }

    boolean a(int param0, hm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -4659) {
            return false;
          }
          this.field_E = (bl) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ue.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.field_E = null;
          if (this.field_u) {
            var5_int = -param2 + (dh.field_d - this.field_k);
            var6 = -param1 + bj.field_y - this.field_j;
            this.field_E = this.a(var6, (byte) -111, var5_int);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ue.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    String d(int param0) {
        if (this.field_E == null) {
          return null;
        }
        if (this.field_F == null) {
          return null;
        }
        if (param0 != 1) {
          return (String) null;
        }
        if (this.field_E.field_m >= this.field_F.length) {
          return null;
        }
        return this.field_F[this.field_E.field_m];
    }

    static {
    }
}
