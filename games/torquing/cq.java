/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends am {
    private int field_x;
    private int field_s;
    static int field_u;
    private int[] field_z;
    static t field_w;
    static int[] field_y;
    private int field_v;
    private int field_t;

    final void a(fj param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        var6 = Torquing.field_u;
        try {
          if (param1 != 35) {
            this.field_x = -23;
          }
          var5 = param2;
          if (var5 == 0) {
            this.field_s = param0.i(7088);
          } else {
            if (var5 != 1) {
              if (2 == var5) {
                this.field_t = param0.i(7088);
              } else {
                if (var5 != 3) {
                  if (var5 == 4) {
                    var4_int = param0.e((byte) 62);
                    this.field_z[0] = ie.a(var4_int << 4, 267386880);
                    this.field_z[1] = ie.a(4080, var4_int >> 4);
                    this.field_z[2] = ie.a(255, var4_int) >> 12;
                  }
                } else {
                  this.field_v = param0.i(7088);
                }
              }
            } else {
              this.field_x = param0.i(7088);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("cq.H(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -1339901236) {
          return;
        }
        field_y = null;
        field_w = null;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              param1.getAppletContext().showDocument(og.a(var2, param1, (byte) -122), "_top");
              if (!param0) {
                var3 = (java.applet.Applet) null;
                cq.a(false, (java.applet.Applet) null);
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("cq.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int[][] a(int param0, int param1) {
        int var11 = 0;
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        int[][] var19;
        int[] var21;
        int[] var24;
        int[] var25;
        int[][] var27;
        int[] var29;
        int[] var32;
        int[] var33;
        int[][] var38;
        int[] var39;
        int[] var40;
        int[] var41;
        int[] var29Lifetime1;
        int[] var32Lifetime1;
        int[] var40Lifetime1;
        var16 = Torquing.field_u;
        if (param0 != -29116) {
          field_w = (t) null;
        }
        var27 = this.field_r.a(15142, param1);
        var19 = var27;
        var17 = var19;
        var3 = var17;
        if (this.field_r.field_b) {
          var38 = this.c(24066, param1, 0);
          var39 = var38[0];
          var40 = var38[1];
          var41 = var38[2];
          var29 = var27[0];
          var21 = var29;
          var8 = var21;
          var32 = var27[1];
          var24 = var32;
          var9 = var24;
          var33 = var27[2];
          var25 = var33;
          var10 = var25;
          for (var11 = 0; var11 < ci.field_c; var11++) {
            var13 = var39[var11];
            var12 = var13 - this.field_z[0];
            if (0 > var12) {
              var12 = -var12;
            }
            if (this.field_s < var12) {
              var29Lifetime1 = var27[0];
              var32Lifetime1 = var27[1];
              var40Lifetime1 = var38[1];
              var29Lifetime1[var11] = var13;
              var9[var11] = var40Lifetime1[var11];
              var10[var11] = var41[var11];
            } else {
              var29Lifetime1 = var27[0];
              var32Lifetime1 = var27[1];
              var40Lifetime1 = var38[1];
              var14 = var40Lifetime1[var11];
              var12 = var14 - this.field_z[1];
              if (var12 < 0) {
                var12 = -var12;
              }
              if (this.field_s >= var12) {
                var15 = var41[var11];
                var12 = -this.field_z[2] + var15;
                if (var12 < 0) {
                  var12 = -var12;
                }
                if (this.field_s >= var12) {
                  var8[var11] = this.field_v * var13 >> 12;
                  var9[var11] = var14 * this.field_t >> 12;
                  var10[var11] = this.field_x * var15 >> 12;
                } else {
                  var29Lifetime1[var11] = var13;
                  var32Lifetime1[var11] = var14;
                  var33[var11] = var15;
                }
              } else {
                var29Lifetime1[var11] = var13;
                var32Lifetime1[var11] = var14;
                var10[var11] = var41[var11];
              }
            }
          }
        }
        return var3;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          if (param2 <= 119) {
            stackIn_3_0 = -88;
            return stackIn_3_0;
          }
          var3_int = 0;
          while (param1 > 0) {
            var3_int = 1 & param0 | var3_int << 1;
            param0 = param0 >>> 1;
            param1--;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3), "cq.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public cq() {
        super(1, false);
        this.field_s = 409;
        this.field_x = 4096;
        this.field_z = new int[3];
        this.field_v = 4096;
        this.field_t = 4096;
    }

    static {
    }
}
