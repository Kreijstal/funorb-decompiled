/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends qa {
    private int field_X;
    private qi field_V;
    static int field_W;
    private nh field_Z;
    static volatile boolean field_U;
    static String field_K;
    private String field_Y;

    public static void i(int param0) {
        field_K = null;
        if (param0 > -45) {
          field_W = 31;
        }
    }

    final String e(int param0) {
        if (param0 <= -39) {
          return null;
        }
        field_W = 81;
        return null;
    }

    ci(qi param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, pe.a(2147483647));
        try {
          this.field_V = param0;
          this.field_Y = param1;
          this.a(param3, param5, param2, 16535, param4);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        this.field_X = this.field_X + 1;
        if (param3 > -127) {
          return;
        }
        try {
          super.a(param0, param1, param2, (byte) -128);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ci.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        vh var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        nh var16;
        String var17;
        Object var18;
        nh var19;
        nh var20;
        nh var21;
        String var22;
        Object var23;
        nh var24;
        nh var25;
        nh var26;
        String var27;
        Object var28;
        nh var29;
        nh var30;
        nh var31;
        String var32;
        Object var33;
        nh var34;
        nh var35;
        nh var36;
        va var38;
        va var39;
        va var40;
        va var41;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        vh var6Lifetime1;
        vh var6Lifetime2;
        var18 = null;
        var23 = null;
        var28 = null;
        var33 = null;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var6 = this.field_V.a(-12317);
        if (var6 == ai.field_A) {
          var17 = ug.field_T;
          if (!var17.equals(this.field_p)) {
            this.field_p = var17;
            this.h(126);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_V.a(-12317);
          var38 = (va) ((Object) this.field_l);
          var9 = param0 + this.field_o;
          var10 = var38.a((vg) (this), param3, (byte) -121) + (var38.a((vg) (this), true).b(20111) >> 1);
          if (ai.field_A != var6 &&
            var6 != nd.field_P) {
            if (var6 == u.field_b) {
              var20 = ja.field_n[2];
              var20.a(var9, var10 - (var20.field_w >> 1), 256);
              return;
            }
            if (ce.field_e != var6) {
              return;
            }
            var19 = ja.field_n[1];
            var19.a(var9, var10 - (var19.field_w >> 1), 256);
            return;
          }
          var21 = ja.field_n[0];
          var11 = var21.field_z << 1;
          var12 = var21.field_C << 1;
          if (null == this.field_Z) {
            this.field_Z = new nh(var11, var12);
            aj.a(this.field_Z, (byte) 85);
          } else {
            if (this.field_Z.field_y < var11) {
              this.field_Z = new nh(var11, var12);
              aj.a(this.field_Z, (byte) 85);
            } else {
              if (this.field_Z.field_w < var12) {
                this.field_Z = new nh(var11, var12);
                aj.a(this.field_Z, (byte) 85);
              } else {
                aj.a(this.field_Z, (byte) 83);
                wj.c();
              }
            }
          }
          var21.b(112, 144, var21.field_z << 4, var21.field_C << 4, -this.field_X << 10, 4096);
          cl.d((byte) -94);
          this.field_Z.a(-(var21.field_z >> 1) + var9, -var21.field_C + var10, 256);
          return;
        }
        if (nd.field_P == var6) {
          var22 = ug.field_T;
          if (!var22.equals(this.field_p)) {
            this.field_p = var22;
            this.h(126);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_V.a(-12317);
          var39 = (va) ((Object) this.field_l);
          var9Lifetime1 = param0 + this.field_o;
          var10Lifetime1 = var39.a((vg) (this), param3, (byte) -121) + (var39.a((vg) (this), true).b(20111) >> 1);
          if (ai.field_A != var6 &&
            var6 != nd.field_P) {
            if (var6 == u.field_b) {
              var25 = ja.field_n[2];
              var25.a(var9Lifetime1, var10Lifetime1 - (var25.field_w >> 1), 256);
              return;
            }
            if (ce.field_e != var6) {
              return;
            }
            var24 = ja.field_n[1];
            var24.a(var9Lifetime1, var10Lifetime1 - (var24.field_w >> 1), 256);
            return;
          }
          var26 = ja.field_n[0];
          var11Lifetime1 = var26.field_z << 1;
          var12Lifetime1 = var26.field_C << 1;
          if (null == this.field_Z) {
            this.field_Z = new nh(var11Lifetime1, var12Lifetime1);
            aj.a(this.field_Z, (byte) 85);
          } else {
            if (this.field_Z.field_y < var11Lifetime1) {
              this.field_Z = new nh(var11Lifetime1, var12Lifetime1);
              aj.a(this.field_Z, (byte) 85);
            } else {
              if (this.field_Z.field_w >= var12Lifetime1) {
                aj.a(this.field_Z, (byte) 83);
                wj.c();
              } else {
                this.field_Z = new nh(var11Lifetime1, var12Lifetime1);
                aj.a(this.field_Z, (byte) 85);
              }
            }
          }
          var26.b(112, 144, var26.field_z << 4, var26.field_C << 4, -this.field_X << 10, 4096);
          cl.d((byte) -94);
          this.field_Z.a(-(var26.field_z >> 1) + var9Lifetime1, -var26.field_C + var10Lifetime1, 256);
          return;
        }
        var27 = this.field_V.b(-16034);
        if (var27 == null) {
          var32 = this.field_Y;
          if (!var32.equals(this.field_p)) {
            this.field_p = var32;
            this.h(126);
          }
          super.a(param0, param1, param2, param3);
          var6Lifetime1 = this.field_V.a(-12317);
          var41 = (va) ((Object) this.field_l);
          var9Lifetime2 = param0 + this.field_o;
          var10Lifetime2 = var41.a((vg) (this), param3, (byte) -121) + (var41.a((vg) (this), true).b(20111) >> 1);
          if (ai.field_A != var6Lifetime1 &&
            var6Lifetime1 != nd.field_P) {
            if (var6Lifetime1 == u.field_b) {
              var35 = ja.field_n[2];
              var35.a(var9Lifetime2, var10Lifetime2 - (var35.field_w >> 1), 256);
              return;
            }
            if (ce.field_e != var6Lifetime1) {
              return;
            }
            var34 = ja.field_n[1];
            var34.a(var9Lifetime2, var10Lifetime2 - (var34.field_w >> 1), 256);
            return;
          }
          var36 = ja.field_n[0];
          var16 = var36;
          var11Lifetime2 = var36.field_z << 1;
          var12Lifetime2 = var36.field_C << 1;
          if (null != this.field_Z &&
            this.field_Z.field_y >= var11Lifetime2) {
            if (this.field_Z.field_w >= var12Lifetime2) {
              aj.a(this.field_Z, (byte) 83);
              wj.c();
            } else {
              this.field_Z = new nh(var11Lifetime2, var12Lifetime2);
              aj.a(this.field_Z, (byte) 85);
            }
          } else {
            this.field_Z = new nh(var11Lifetime2, var12Lifetime2);
            aj.a(this.field_Z, (byte) 85);
          }
          var36.b(112, 144, var36.field_z << 4, var36.field_C << 4, -this.field_X << 10, 4096);
          cl.d((byte) -94);
          this.field_Z.a(-(var36.field_z >> 1) + var9Lifetime2, -var36.field_C + var10Lifetime2, 256);
          return;
        }
        if (!var27.equals(this.field_p)) {
          this.field_p = var27;
          this.h(126);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime2 = this.field_V.a(-12317);
        var40 = (va) ((Object) this.field_l);
        var9Lifetime3 = param0 + this.field_o;
        var10Lifetime3 = var40.a((vg) (this), param3, (byte) -121) + (var40.a((vg) (this), true).b(20111) >> 1);
        if (ai.field_A != var6Lifetime2 &&
          var6Lifetime2 != nd.field_P) {
          if (var6Lifetime2 == u.field_b) {
            var30 = ja.field_n[2];
            var30.a(var9Lifetime3, var10Lifetime3 - (var30.field_w >> 1), 256);
            return;
          }
          if (ce.field_e != var6Lifetime2) {
            return;
          }
          var29 = ja.field_n[1];
          var29.a(var9Lifetime3, var10Lifetime3 - (var29.field_w >> 1), 256);
          return;
        }
        var31 = ja.field_n[0];
        var11Lifetime3 = var31.field_z << 1;
        var12Lifetime3 = var31.field_C << 1;
        if (null == this.field_Z) {
          this.field_Z = new nh(var11Lifetime3, var12Lifetime3);
          aj.a(this.field_Z, (byte) 85);
        } else {
          if (this.field_Z.field_y < var11Lifetime3) {
            this.field_Z = new nh(var11Lifetime3, var12Lifetime3);
            aj.a(this.field_Z, (byte) 85);
          } else {
            if (this.field_Z.field_w < var12Lifetime3) {
              this.field_Z = new nh(var11Lifetime3, var12Lifetime3);
              aj.a(this.field_Z, (byte) 85);
            } else {
              aj.a(this.field_Z, (byte) 83);
              wj.c();
            }
          }
        }
        var31.b(112, 144, var31.field_z << 4, var31.field_C << 4, -this.field_X << 10, 4096);
        cl.d((byte) -94);
        this.field_Z.a(-(var31.field_z >> 1) + var9Lifetime3, -var31.field_C + var10Lifetime3, 256);
    }

    final boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ci.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_U = false;
        field_K = "Type your age in years";
    }
}
