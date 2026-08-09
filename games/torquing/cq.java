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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 == 35) {
                break L1;
              } else {
                this.field_x = -23;
                break L1;
              }
            }
            L2: {
              var5 = param2;
              if (-1 == (var5 ^ -1)) {
                this.field_s = param0.i(7088);
                break L2;
              } else {
                if (var5 != 1) {
                  if (2 == var5) {
                    this.field_t = param0.i(7088);
                    break L2;
                  } else {
                    if (-4 != (var5 ^ -1)) {
                      if (var5 == 4) {
                        var4_int = param0.e((byte) 62);
                        this.field_z[0] = ie.a(var4_int << -1608898396, 267386880);
                        this.field_z[1] = ie.a(4080, var4_int >> 734328804);
                        this.field_z[2] = ie.a(255, var4_int) >> -698708980;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      this.field_v = param0.i(7088);
                      break L2;
                    }
                  }
                } else {
                  this.field_x = param0.i(7088);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("cq.H(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
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
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                      param1.getAppletContext().showDocument(og.a(var2, param1, (byte) -122), "_top");
                      if (param0) {
                        break L2;
                      } else {
                        var3 = (java.applet.Applet) null;
                        cq.a(false, (java.applet.Applet) null);
                        break L2;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_7_0 = (RuntimeException) (var2_ref2);

                stackIn_7_1 = new StringBuilder().append("cq.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L4;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L4;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
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
        L0: {
          var16 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            field_w = (t) null;
            break L0;
          }
        }
        L1: {
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
            var11 = 0;
            L2: while (true) {
              if (var11 >= ci.field_c) {
                break L1;
              } else {
                L3: {
                  var13 = var39[var11];
                  var12 = var13 + -this.field_z[0];
                  if (0 <= var12) {
                    break L3;
                  } else {
                    var12 = -var12;
                    break L3;
                  }
                }
                if (this.field_s < var12) {
                  var29 = var27[0];
                  var32 = var27[1];
                  var40 = var38[1];
                  var29[var11] = var13;
                  var9[var11] = var40[var11];
                  var10[var11] = var41[var11];
                  var11++;
                  continue L2;
                } else {
                  L4: {
                    var29 = var27[0];
                    var32 = var27[1];
                    var40 = var38[1];
                    var14 = var40[var11];
                    var12 = var14 - this.field_z[1];
                    if (var12 < 0) {
                      var12 = -var12;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (this.field_s >= var12) {
                    L5: {
                      var15 = var41[var11];
                      var12 = -this.field_z[2] + var15;
                      if (-1 >= (var12 ^ -1)) {
                        break L5;
                      } else {
                        var12 = -var12;
                        break L5;
                      }
                    }
                    if (this.field_s >= var12) {
                      var8[var11] = this.field_v * var13 >> -537926708;
                      var9[var11] = var14 * this.field_t >> -1339901236;
                      var10[var11] = this.field_x * var15 >> 1015642764;
                      var11++;
                      continue L2;
                    } else {
                      var29[var11] = var13;
                      var32[var11] = var14;
                      var33[var11] = var15;
                      var11++;
                      continue L2;
                    }
                  } else {
                    var29[var11] = var13;
                    var32[var11] = var14;
                    var10[var11] = var41[var11];
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            break L1;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            if (param2 > 119) {
              var3_int = 0;
              L1: while (true) {
                if (param1 <= 0) {
                  stackIn_8_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int = 1 & param0 | var3_int << -526281919;
                  param0 = param0 >>> 1;
                  param1--;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -88;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3), "cq.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
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
