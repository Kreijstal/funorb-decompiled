/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vq extends mi {
    private IntrusiveDeque field_x;
    private jo field_z;
    static int instructionPage;
    private String[] field_y;

    final void a(int param0, String param1, int param2) {
        String stackIn_15_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var4_int = -56 / ((param0 - 14) / 53);
          if (this.field_y == null ||
            param2 >= this.field_y.length) {
            String[] var5 = new String[param2 + 1];
            if (null != this.field_y) {
              for (int var6 = 0; this.field_y.length > var6; var6++) {
                var5[var6] = this.field_y[var6];
              }
            }
            this.field_y = var5;
          }
          this.field_y[param2] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_14_0 = runtimeException;
          StringBuilder stackIn_14_1 = new StringBuilder().append("vq.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        this.a(((et) ((Object) this.field_e)).a(param3 + 2147483537, (ea) (this)), param0, param1, param2, (byte) 124);
        if (param3 != 110) {
          this.a((byte) -98, -99, -83, 107);
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) 109, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        et var9 = (et) ((Object) this.field_e);
        jo var6 = this.field_z;
        if (var6 != null) {
          int var7 = var9.a(param3, (ea) (this), (byte) -128);
          int var8 = var9.a(param2, false, (ea) (this));
          do {
            co.a(var8 + (var6.field_g - 2), var6.field_e + 2, 2 + var6.field_h, var7 + var6.field_i - 2, 112);
            var6 = var6.field_f;
          } while (var6 != null);
        }
        if (param0 < 64) {
          this.a(-83, 88, 88, -90, (byte) 51);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, (byte) 127);
        if (param4 <= 122) {
          return;
        }
        this.a((byte) -67);
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param1 - this.field_p;
        int var6 = -this.field_h + param3;
        jo var7 = this.c(var6, 0, var5);
        if (var7 != null &&
          this.field_o != null) {
          ((ue) ((Object) this.field_o)).a((byte) -73, param2, this, var7.field_k);
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        String stackIn_9_2 = null;
        try {
          super.a((byte) 53, param1, param2, param3);
          this.field_z = null;
          if (this.field_g) {
            int var5_int = ic.field_b - (param3 + this.field_p);
            int var6 = -this.field_h + (cf.field_g - param2);
            this.field_z = this.c(var6, 0, var5_int);
          }
          if (param0 < 13) {
            ea var7 = (ea) null;
            this.a((byte) 11, (ea) null, -123, 59);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("vq.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var16 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_x = new IntrusiveDeque();
        int var2 = 0;
        et var3 = (et) ((Object) this.field_e);
        if (param0 != -67) {
          return;
        }
        pp var4 = var3.a((byte) 66, (ea) (this));
        while (true) {
          int var5 = this.field_f.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          int var7 = this.field_f.indexOf(">", var5);
          String var6 = this.field_f.substring(var5 + 9, var7);
          int var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_f.indexOf("</hotspot>", var5);
          int var8 = var4.a(1, var5);
          int var9 = var4.a(1, var2);
          Object var10 = null;
          for (int var11 = var8; var11 <= var9; var11++) {
            co var12 = var4.field_b[var11];
            if (var8 == var11) {
              stackIn_9_0 = var4.b(var5, -122);
            } else {
              stackIn_9_0 = var12.field_h[0];
            }
            int var13 = stackIn_9_0;
            if (var9 == var11) {
              stackIn_14_0 = var4.b(var2, -114);
            } else if (var12 != null) {
              stackIn_14_0 = var12.field_h[-1 + var12.field_h.length];
            } else {
              stackIn_14_0 = 0;
            }
            int var14 = stackIn_14_0;
            jo var15 = new jo(var7Lifetime1, var13, var12.field_f, -var13 + var14, Math.max(var3.a(-4), var12.field_d - var12.field_f));
            if (var10 != null) {
              ((jo) (var10)).field_f = var15;
            }
            var10 = var15;
            this.field_x.addLast(66, var15);
          }
        }
    }

    private final jo c(int param0, int param1, int param2) {
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param1 != 0) {
          String var7 = (String) null;
          this.a(-112, (String) null, -74);
        }
        jo var4 = (jo) (this.field_x.first(268435455));
        while (var4 != null) {
          jo var5 = var4;
          while (var5 != null) {
            if (var5.field_i <= param2 &&
              var5.field_g <= param0 &&
              var5.field_h + var5.field_i > param2 &&
              var5.field_g + var5.field_e >= param0) {
              return var4;
            }
            var5 = var5.field_f;
          }
          var4 = (jo) (this.field_x.next((byte) 103));
        }
        return null;
    }

    String c(byte param0) {
        if (param0 >= -41) {
          return (String) null;
        }
        if (this.field_z == null) {
          return null;
        }
        if (this.field_y == null) {
          return null;
        }
        if (this.field_y.length <= this.field_z.field_k) {
          return null;
        }
        return this.field_y[this.field_z.field_k];
    }

    boolean a(ea param0, byte param1) {
        String stackIn_8_2 = null;
        try {
          if (param1 == -42) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("vq.U(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    vq(String param0, ir param1) {
        super(param0, (no) null);
        this.field_z = null;
        try {
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        instructionPage = 0;
    }
}
