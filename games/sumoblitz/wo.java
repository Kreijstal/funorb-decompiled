/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo extends java.awt.Canvas {
    static boolean field_c;
    static hr[] field_b;
    private java.awt.Component field_a;

    public static void a(int param0) {
        try {
          field_b = null;
          if (param0 <= 89) {
            field_b = (hr[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wo.A(" + param0 + ')');
        }
    }

    final static int a(String[] args, vn param1, int param2, boolean param3, String param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = param1.a(param4);
          if (var5_int <= param2 &&
            -1 == param4.indexOf("<br>")) {
            args[0] = param4;
            stackIn_8_0 = 1;
            return stackIn_8_0;
          }
          var6 = (-1 + param2 + var5_int) / param2;
          param2 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          if (param3) {
            stackIn_11_0 = -80;
            return stackIn_11_0;
          }
          var8 = param4.length();
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 <= var9))) {
            var10 = param4.charAt(var9);
            stackIn_34_0 = var10;
            stackIn_34_1 = 32;
            if (var13 == 0) {
              if (stackIn_34_0 == stackIn_34_1 ||
                var10 == 45) {
                var11 = param4.substring(var7, 1 + var9).trim();
                var12 = param1.a(var11);
                if (var12 >= param2) {
                  var7 = var9 + 1;
                  incrementValue$0 = var6Lifetime1;
                  var6Lifetime1++;
                  args[incrementValue$0] = var11;
                }
              }
              if (var10 == 62 &&
                param4.regionMatches(var9 - 3, "<br>", 0, 4)) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                args[incrementValue$1] = param4.substring(var7, var9 - 3).trim();
                var7 = 1 + var9;
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_34_0 = ~var8;
            stackIn_34_1 = ~var7;
          }
          if (stackIn_34_0 < stackIn_34_1) {
            incrementValue$2 = var6Lifetime1;
            var6Lifetime1++;
            args[incrementValue$2] = param4.substring(var7, var8).trim();
          }
          stackIn_38_0 = var6Lifetime1;
          return stackIn_38_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_42_0 = var5;
          stackIn_42_1 = new StringBuilder().append("wo.B(");
          if (args == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(')').toString());
        }
    }

    public final void paint(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a.paint(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wo.paint(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a.update(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wo.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(hr[] param0, int param1, int param2, int param3, int param4, ha param5, int param6, int param7, int param8, boolean param9) {
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_128_2 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_132_2 = null;
        RuntimeException decompiledCaughtException = null;
        pm var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var25Lifetime1;
        int var25Lifetime2;
        int var25Lifetime3;
        int var25Lifetime4;
        var27 = Sumoblitz.field_L ? 1 : 0;
        try {
          var10 = wq.a(param5, (byte) 15);
          if (param0 == null) {
            return;
          }
          if (0 < param6 &&
            0 < param1) {
            if (null != param0[3]) {
              stackIn_14_0 = param0[3].b();
            } else {
              stackIn_14_0 = 0;
            }
            var11 = stackIn_14_0;
            if (param0[5] != null) {
              stackIn_18_0 = param0[5].b();
            } else {
              stackIn_18_0 = 0;
            }
            var12 = stackIn_18_0;
            if (null == param0[1]) {
              stackIn_22_0 = 0;
            } else {
              stackIn_22_0 = param0[1].d();
            }
            var13 = stackIn_22_0;
            if (null == param0[7]) {
              stackIn_26_0 = 0;
            } else {
              stackIn_26_0 = param0[7].d();
            }
            var14 = stackIn_26_0;
            var15 = param6 + param2;
            var16 = param7 + param1;
            var17 = var11 + param2;
            var18 = var15 - var12;
            var19 = var13 + param7;
            var20 = -var14 + var16;
            var21 = var17;
            if (!param9) {
              wo.a((hr[]) null, 78, -40, 98, -104, (ha) null, -45, 54, 115, true);
            }
            var22 = var18;
            if (var21 > var22) {
              var22 = param6 * var11 / (var11 + var12) + param2;
              var21 = param6 * var11 / (var11 + var12) + param2;
            }
            var23 = var19;
            var24 = var20;
            if (var24 < var23) {
              var24 = param1 * var13 / (var13 + var14) + param7;
              var23 = param1 * var13 / (var13 + var14) + param7;
            }
            if (null != param0[0]) {
              var10.a((byte) 81, param7, var23, param2, var21);
              param0[0].a(param2, param7, param4, param3, param8);
              var10.a(29709);
            }
            if (param0[2] != null) {
              var10.a((byte) -98, param7, var23, var22, var15);
              param0[2].a(var18, param7, param4, param3, param8);
              var10.a(29709);
            }
            if (null != param0[6]) {
              var10.a((byte) 43, var24, var16, param2, var21);
              param0[6].a(param2, var20, param4, param3, param8);
              var10.a(29709);
            }
            if (param0[8] != null) {
              var10.a((byte) 37, var24, var16, var22, var15);
              param0[8].a(var18, var20, param4, param3, param8);
              var10.a(29709);
            }
            boolean decompiledFrameCompleted3 = true;
            if (param0[1] != null &&
              param0[1].b() != 0) {
              var10.a((byte) 51, param7, var23, var21, var22);
              var25 = var17;
              while (var25 < var18) {
                param0[1].a(var25, param7, param4, param3, param8);
                var25 = var25 + param0[1].b();
                if (var27 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted3) {
                var10.a(29709);
              }
            }
            boolean decompiledFrameCompleted2 = true;
            if (null != param0[7] &&
              param0[7].b() != 0) {
              var10.a((byte) 109, var24, var16, var21, var22);
              var25Lifetime1 = var17;
              while (var18 > var25Lifetime1) {
                param0[7].a(var25Lifetime1, var20, param4, param3, param8);
                var25Lifetime1 = var25Lifetime1 + param0[7].b();
                if (var27 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted2) {
                var10.a(29709);
              }
            }
            boolean decompiledFrameCompleted1 = true;
            if (null != param0[3] &&
              param0[3].d() != 0) {
              var10.a((byte) -93, var23, var24, param2, var21);
              var25Lifetime2 = var19;
              while (var20 > var25Lifetime2) {
                param0[3].a(param2, var25Lifetime2, param4, param3, param8);
                var25Lifetime2 = var25Lifetime2 + param0[3].d();
                if (var27 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                var10.a(29709);
              }
            }
            boolean decompiledFrameCompleted0 = true;
            if (param0[5] != null &&
              param0[5].d() != 0) {
              var10.a((byte) -128, var23, var24, var22, var15);
              var25Lifetime3 = var19;
              while (var25Lifetime3 < var20) {
                param0[5].a(var18, var25Lifetime3, param4, param3, param8);
                var25Lifetime3 = var25Lifetime3 + param0[5].d();
                if (var27 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                var10.a(29709);
              }
            }
            if (param0[4] != null &&
              param0[4].b() != 0 &&
              0 != param0[4].d()) {
              var10.a((byte) 97, var23, var24, var21, var22);
              var25Lifetime4 = var19;
              while (var20 > var25Lifetime4) {
                if (var27 != 0) {
                  return;
                }
                var26 = var17;
                while (var18 > var26) {
                  param0[4].a(var26, var25Lifetime4, param4, param3, param8);
                  var26 = var26 + param0[4].b();
                }
                var25Lifetime4 = var25Lifetime4 + param0[4].d();
              }
              var10.a(29709);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_127_0 = var10_ref;
          stackIn_127_1 = new StringBuilder().append("wo.C(");
          if (param0 == null) {
            stackIn_128_2 = "null";
          } else {
            stackIn_128_2 = "{...}";
          }
          stackIn_131_1 = ((StringBuilder) (Object) stackIn_127_1).append(stackIn_128_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_132_2 = "null";
          } else {
            stackIn_132_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_127_0), ((StringBuilder) (Object) stackIn_131_1).append(stackIn_132_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    wo(java.awt.Component param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("wo.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
    }
}
