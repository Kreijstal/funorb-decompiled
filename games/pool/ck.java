/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends mh {
    static ko field_W;
    private dd field_U;
    private String field_X;
    private int field_V;
    static String[] field_R;
    static String[] field_T;
    private ip field_S;
    static ko[] field_Y;

    final boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 103 % ((param1 - -43) / 47);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ck.M(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(ei param0, int param1, int param2, int param3) {
        try {
            ((ck) this).field_V = ((ck) this).field_V + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ck.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ck(ip param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (fp) (Object) ub.c());
        int discarded$0 = 4;
        try {
            ((ck) this).field_S = param0;
            ((ck) this).field_X = param1;
            ((ck) this).a(param4, param2, param5, false, param3);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        String var5 = null;
        na var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var18 = null;
        Object var19 = null;
        dd var20 = null;
        dd var21 = null;
        dd var22 = null;
        dd var23 = null;
        String var24 = null;
        Object var25 = null;
        dd var26 = null;
        dd var27 = null;
        dd var28 = null;
        dd var29 = null;
        Object var30 = null;
        dd var31 = null;
        dd var32 = null;
        dd var33 = null;
        dd var34 = null;
        io var35 = null;
        io var36 = null;
        io var37 = null;
        var19 = null;
        var25 = null;
        var30 = null;
        var14 = Pool.field_O;
        var6 = ((ck) this).field_S.c(-31873);
        if (var6 != ji.field_h) {
          if (var6 != no.field_k) {
            L0: {
              var5 = ((ck) this).field_S.a(126);
              if (var5 == null) {
                var5 = ((ck) this).field_X;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var5.equals((Object) (Object) ((ck) this).field_m)) {
                break L1;
              } else {
                ((ck) this).field_m = var5;
                ((ck) this).g((byte) 33);
                break L1;
              }
            }
            super.a(param0, (byte) 112, param2, param3);
            var6 = ((ck) this).field_S.c(-31873);
            var37 = (io) (Object) ((ck) this).field_z;
            var10 = -91 % ((-42 - param1) / 53);
            var9 = ((ck) this).field_C + param2;
            var11 = var37.a(param3, (ei) this, (byte) -7) + (var37.b(0, (ei) this).a((byte) 66) >> 1);
            if (ji.field_h == var6) {
              var32 = bo.field_a[0];
              var12 = var32.field_w << 1;
              var13 = var32.field_y << 1;
              if (((ck) this).field_U != null) {
                if (((ck) this).field_U.field_z >= var12) {
                  if (var13 > ((ck) this).field_U.field_A) {
                    ((ck) this).field_U = new dd(var12, var13);
                    kj.a(81, ((ck) this).field_U);
                    var32.b(112, 144, var32.field_w << 4, var32.field_y << 4, -((ck) this).field_V << 10, 4096);
                    oc.a(126);
                    ((ck) this).field_U.c(var9 - (var32.field_w >> 1), var11 + -var32.field_y, 256);
                    return;
                  } else {
                    kj.a(53, ((ck) this).field_U);
                    qh.d();
                    var32.b(112, 144, var32.field_w << 4, var32.field_y << 4, -((ck) this).field_V << 10, 4096);
                    oc.a(126);
                    ((ck) this).field_U.c(var9 - (var32.field_w >> 1), var11 + -var32.field_y, 256);
                    return;
                  }
                } else {
                  ((ck) this).field_U = new dd(var12, var13);
                  kj.a(81, ((ck) this).field_U);
                  var32.b(112, 144, var32.field_w << 4, var32.field_y << 4, -((ck) this).field_V << 10, 4096);
                  oc.a(126);
                  ((ck) this).field_U.c(var9 - (var32.field_w >> 1), var11 + -var32.field_y, 256);
                  return;
                }
              } else {
                ((ck) this).field_U = new dd(var12, var13);
                kj.a(81, ((ck) this).field_U);
                var32.b(112, 144, var32.field_w << 4, var32.field_y << 4, -((ck) this).field_V << 10, 4096);
                oc.a(126);
                ((ck) this).field_U.c(var9 - (var32.field_w >> 1), var11 + -var32.field_y, 256);
                return;
              }
            } else {
              if (no.field_k != var6) {
                if (gp.field_d != var6) {
                  if (kr.field_e == var6) {
                    var34 = bo.field_a[1];
                    var34.c(var9, var11 + -(var34.field_A >> 1), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var33 = bo.field_a[2];
                  var33.c(var9, var11 + -(var33.field_A >> 1), 256);
                  return;
                }
              } else {
                L2: {
                  L3: {
                    var31 = bo.field_a[0];
                    var12 = var31.field_w << 1;
                    var13 = var31.field_y << 1;
                    if (((ck) this).field_U == null) {
                      break L3;
                    } else {
                      if (((ck) this).field_U.field_z < var12) {
                        break L3;
                      } else {
                        if (var13 > ((ck) this).field_U.field_A) {
                          break L3;
                        } else {
                          kj.a(53, ((ck) this).field_U);
                          qh.d();
                          break L2;
                        }
                      }
                    }
                  }
                  ((ck) this).field_U = new dd(var12, var13);
                  kj.a(81, ((ck) this).field_U);
                  break L2;
                }
                var31.b(112, 144, var31.field_w << 4, var31.field_y << 4, -((ck) this).field_V << 10, 4096);
                oc.a(126);
                ((ck) this).field_U.c(var9 - (var31.field_w >> 1), var11 + -var31.field_y, 256);
                return;
              }
            }
          } else {
            L4: {
              var24 = oi.field_r;
              if (var24.equals((Object) (Object) ((ck) this).field_m)) {
                break L4;
              } else {
                ((ck) this).field_m = var24;
                ((ck) this).g((byte) 33);
                break L4;
              }
            }
            super.a(param0, (byte) 112, param2, param3);
            var6 = ((ck) this).field_S.c(-31873);
            var36 = (io) (Object) ((ck) this).field_z;
            var10 = -91 % ((-42 - param1) / 53);
            var9 = ((ck) this).field_C + param2;
            var11 = var36.a(param3, (ei) this, (byte) -7) + (var36.b(0, (ei) this).a((byte) 66) >> 1);
            if (ji.field_h == var6) {
              var27 = bo.field_a[0];
              var12 = var27.field_w << 1;
              var13 = var27.field_y << 1;
              if (((ck) this).field_U != null) {
                if (((ck) this).field_U.field_z >= var12) {
                  if (var13 <= ((ck) this).field_U.field_A) {
                    kj.a(53, ((ck) this).field_U);
                    qh.d();
                    var27.b(112, 144, var27.field_w << 4, var27.field_y << 4, -((ck) this).field_V << 10, 4096);
                    oc.a(126);
                    ((ck) this).field_U.c(var9 - (var27.field_w >> 1), var11 + -var27.field_y, 256);
                    return;
                  } else {
                    ((ck) this).field_U = new dd(var12, var13);
                    kj.a(81, ((ck) this).field_U);
                    var27.b(112, 144, var27.field_w << 4, var27.field_y << 4, -((ck) this).field_V << 10, 4096);
                    oc.a(126);
                    ((ck) this).field_U.c(var9 - (var27.field_w >> 1), var11 + -var27.field_y, 256);
                    return;
                  }
                } else {
                  ((ck) this).field_U = new dd(var12, var13);
                  kj.a(81, ((ck) this).field_U);
                  var27.b(112, 144, var27.field_w << 4, var27.field_y << 4, -((ck) this).field_V << 10, 4096);
                  oc.a(126);
                  ((ck) this).field_U.c(var9 - (var27.field_w >> 1), var11 + -var27.field_y, 256);
                  return;
                }
              } else {
                ((ck) this).field_U = new dd(var12, var13);
                kj.a(81, ((ck) this).field_U);
                var27.b(112, 144, var27.field_w << 4, var27.field_y << 4, -((ck) this).field_V << 10, 4096);
                oc.a(126);
                ((ck) this).field_U.c(var9 - (var27.field_w >> 1), var11 + -var27.field_y, 256);
                return;
              }
            } else {
              if (no.field_k != var6) {
                if (gp.field_d != var6) {
                  if (kr.field_e != var6) {
                    return;
                  } else {
                    var29 = bo.field_a[1];
                    var29.c(var9, var11 + -(var29.field_A >> 1), 256);
                    return;
                  }
                } else {
                  var28 = bo.field_a[2];
                  var28.c(var9, var11 + -(var28.field_A >> 1), 256);
                  return;
                }
              } else {
                L5: {
                  L6: {
                    var26 = bo.field_a[0];
                    var12 = var26.field_w << 1;
                    var13 = var26.field_y << 1;
                    if (((ck) this).field_U == null) {
                      break L6;
                    } else {
                      if (((ck) this).field_U.field_z < var12) {
                        break L6;
                      } else {
                        if (var13 > ((ck) this).field_U.field_A) {
                          break L6;
                        } else {
                          kj.a(53, ((ck) this).field_U);
                          qh.d();
                          break L5;
                        }
                      }
                    }
                  }
                  ((ck) this).field_U = new dd(var12, var13);
                  kj.a(81, ((ck) this).field_U);
                  break L5;
                }
                var26.b(112, 144, var26.field_w << 4, var26.field_y << 4, -((ck) this).field_V << 10, 4096);
                oc.a(126);
                ((ck) this).field_U.c(var9 - (var26.field_w >> 1), var11 + -var26.field_y, 256);
                return;
              }
            }
          }
        } else {
          L7: {
            var18 = oi.field_r;
            if (var18.equals((Object) (Object) ((ck) this).field_m)) {
              break L7;
            } else {
              ((ck) this).field_m = var18;
              ((ck) this).g((byte) 33);
              break L7;
            }
          }
          super.a(param0, (byte) 112, param2, param3);
          var6 = ((ck) this).field_S.c(-31873);
          var35 = (io) (Object) ((ck) this).field_z;
          var10 = -91 % ((-42 - param1) / 53);
          var9 = ((ck) this).field_C + param2;
          var11 = var35.a(param3, (ei) this, (byte) -7) + (var35.b(0, (ei) this).a((byte) 66) >> 1);
          if (ji.field_h == var6) {
            var21 = bo.field_a[0];
            var12 = var21.field_w << 1;
            var13 = var21.field_y << 1;
            if (((ck) this).field_U != null) {
              if (((ck) this).field_U.field_z >= var12) {
                if (var13 <= ((ck) this).field_U.field_A) {
                  kj.a(53, ((ck) this).field_U);
                  qh.d();
                  var21.b(112, 144, var21.field_w << 4, var21.field_y << 4, -((ck) this).field_V << 10, 4096);
                  oc.a(126);
                  ((ck) this).field_U.c(var9 - (var21.field_w >> 1), var11 + -var21.field_y, 256);
                  return;
                } else {
                  ((ck) this).field_U = new dd(var12, var13);
                  kj.a(81, ((ck) this).field_U);
                  var21.b(112, 144, var21.field_w << 4, var21.field_y << 4, -((ck) this).field_V << 10, 4096);
                  oc.a(126);
                  ((ck) this).field_U.c(var9 - (var21.field_w >> 1), var11 + -var21.field_y, 256);
                  return;
                }
              } else {
                ((ck) this).field_U = new dd(var12, var13);
                kj.a(81, ((ck) this).field_U);
                var21.b(112, 144, var21.field_w << 4, var21.field_y << 4, -((ck) this).field_V << 10, 4096);
                oc.a(126);
                ((ck) this).field_U.c(var9 - (var21.field_w >> 1), var11 + -var21.field_y, 256);
                return;
              }
            } else {
              ((ck) this).field_U = new dd(var12, var13);
              kj.a(81, ((ck) this).field_U);
              var21.b(112, 144, var21.field_w << 4, var21.field_y << 4, -((ck) this).field_V << 10, 4096);
              oc.a(126);
              ((ck) this).field_U.c(var9 - (var21.field_w >> 1), var11 + -var21.field_y, 256);
              return;
            }
          } else {
            if (no.field_k != var6) {
              if (gp.field_d != var6) {
                if (kr.field_e != var6) {
                  return;
                } else {
                  var23 = bo.field_a[1];
                  var23.c(var9, var11 + -(var23.field_A >> 1), 256);
                  return;
                }
              } else {
                var22 = bo.field_a[2];
                var22.c(var9, var11 + -(var22.field_A >> 1), 256);
                return;
              }
            } else {
              L8: {
                L9: {
                  var20 = bo.field_a[0];
                  var12 = var20.field_w << 1;
                  var13 = var20.field_y << 1;
                  if (((ck) this).field_U == null) {
                    break L9;
                  } else {
                    if (((ck) this).field_U.field_z < var12) {
                      break L9;
                    } else {
                      if (var13 > ((ck) this).field_U.field_A) {
                        break L9;
                      } else {
                        kj.a(53, ((ck) this).field_U);
                        qh.d();
                        break L8;
                      }
                    }
                  }
                }
                ((ck) this).field_U = new dd(var12, var13);
                kj.a(81, ((ck) this).field_U);
                break L8;
              }
              var20.b(112, 144, var20.field_w << 4, var20.field_y << 4, -((ck) this).field_V << 10, 4096);
              oc.a(126);
              ((ck) this).field_U.c(var9 - (var20.field_w >> 1), var11 + -var20.field_y, 256);
              return;
            }
          }
        }
    }

    public static void a() {
        field_Y = null;
        field_T = null;
        field_R = null;
        field_W = null;
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (param0 >= -123) {
          return -104;
        } else {
          param3 = -param3 + param2;
          return -(param3 * param3 * 4000 / param2 / param2) + 4000;
        }
    }

    final String e(int param0) {
        if (param0 <= -10) {
            return null;
        }
        Object var3 = null;
        boolean discarded$0 = ((ck) this).a((ei) null, (byte) -51);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
