/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends cj {
    static String field_O;
    static String[] field_M;
    static int field_Q;
    static boolean field_T;
    private String field_R;
    private int field_V;
    static nc field_Z;
    static String field_S;
    private bd field_P;
    static String field_X;
    static int[] field_W;
    static int[] field_U;
    private bg field_Y;
    static vh field_N;

    final String e(int param0) {
        if (param0 == 34) {
            return null;
        }
        return null;
    }

    public static void a(byte param0) {
        field_U = null;
        field_X = null;
        field_N = null;
        field_W = null;
        field_O = null;
        field_M = null;
        if (param0 != 78) {
          return;
        } else {
          field_Z = null;
          field_S = null;
          return;
        }
    }

    final boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                var4 = null;
                ((al) this).a((ag) null, -14, 37, 1);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("al.LA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    al(bg param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (nn) (Object) ni.a(101));
        try {
            ((al) this).field_R = param1;
            ((al) this).field_Y = param0;
            ((al) this).a(param4, param3, 0, param2, param5);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "al.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
            ((al) this).field_V = ((al) this).field_V + 1;
            super.a(param0, param1, param2 ^ param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "al.W(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        bm var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bd var16 = null;
        Object var17 = null;
        bd var18 = null;
        bd var19 = null;
        bd var20 = null;
        Object var21 = null;
        bd var22 = null;
        bd var23 = null;
        bd var24 = null;
        mi var25 = null;
        mi var26 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                var17 = null;
                var21 = null;
                var13 = HostileSpawn.field_I ? 1 : 0;
                var6 = ((al) this).field_Y.b(-110);
                if (wl.field_c == var6) {
                  break L3;
                } else {
                  if (var6 == m.field_n) {
                    break L3;
                  } else {
                    var5 = ((al) this).field_Y.a(-56);
                    if (var5 == null) {
                      var5 = ((al) this).field_R;
                      if (var13 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      if (!var5.equals((Object) (Object) ((al) this).field_n)) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
              var5 = mg.field_d;
              break L2;
            }
            if (!var5.equals((Object) (Object) ((al) this).field_n)) {
              break L1;
            } else {
              break L0;
            }
          }
          ((al) this).field_n = var5;
          ((al) this).j(-25638);
          break L0;
        }
        super.a(param0, param1, (byte) 107, param3);
        var6 = ((al) this).field_Y.b(-100);
        if (param2 > 42) {
          L4: {
            var26 = (mi) (Object) ((al) this).field_h;
            var9 = ((al) this).field_v + param1;
            var10 = var26.a(-1, (ag) this, param0) - -(var26.a((ag) this, 1).a(true) >> 1);
            if (var6 == wl.field_c) {
              break L4;
            } else {
              if (m.field_n == var6) {
                break L4;
              } else {
                L5: {
                  if (bi.field_d == var6) {
                    break L5;
                  } else {
                    if (var6 == nd.field_d) {
                      var22 = cf.field_u[1];
                      var22.c(var9, var10 - (var22.field_A >> 1), 256);
                      if (var13 != 0) {
                        break L5;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                var23 = cf.field_u[2];
                var23.c(var9, -(var23.field_A >> 1) + var10, 256);
                if (var13 != 0) {
                  break L4;
                } else {
                  return;
                }
              }
            }
          }
          var24 = cf.field_u[0];
          var11 = var24.field_u << 1;
          var12 = var24.field_r << 1;
          if (((al) this).field_P != null) {
            if (((al) this).field_P.field_z >= var11) {
              if (((al) this).field_P.field_A >= var12) {
                sb.a(((al) this).field_P, -117);
                si.d();
                if (var13 == 0) {
                  var24.b(112, 144, var24.field_u << 4, var24.field_r << 4, -((al) this).field_V << 10, 4096);
                  eh.b(false);
                  ((al) this).field_P.c(-(var24.field_u >> 1) + var9, var10 + -var24.field_r, 256);
                  return;
                } else {
                  ((al) this).field_P = new bd(var11, var12);
                  sb.a(((al) this).field_P, -120);
                  var24.b(112, 144, var24.field_u << 4, var24.field_r << 4, -((al) this).field_V << 10, 4096);
                  eh.b(false);
                  ((al) this).field_P.c(-(var24.field_u >> 1) + var9, var10 + -var24.field_r, 256);
                  return;
                }
              } else {
                ((al) this).field_P = new bd(var11, var12);
                sb.a(((al) this).field_P, -120);
                var24.b(112, 144, var24.field_u << 4, var24.field_r << 4, -((al) this).field_V << 10, 4096);
                eh.b(false);
                ((al) this).field_P.c(-(var24.field_u >> 1) + var9, var10 + -var24.field_r, 256);
                return;
              }
            } else {
              ((al) this).field_P = new bd(var11, var12);
              sb.a(((al) this).field_P, -120);
              var24.b(112, 144, var24.field_u << 4, var24.field_r << 4, -((al) this).field_V << 10, 4096);
              eh.b(false);
              ((al) this).field_P.c(-(var24.field_u >> 1) + var9, var10 + -var24.field_r, 256);
              return;
            }
          } else {
            ((al) this).field_P = new bd(var11, var12);
            sb.a(((al) this).field_P, -120);
            var24.b(112, 144, var24.field_u << 4, var24.field_r << 4, -((al) this).field_V << 10, 4096);
            eh.b(false);
            ((al) this).field_P.c(-(var24.field_u >> 1) + var9, var10 + -var24.field_r, 256);
            return;
          }
        } else {
          L6: {
            field_Q = 125;
            var25 = (mi) (Object) ((al) this).field_h;
            var9 = ((al) this).field_v + param1;
            var10 = var25.a(-1, (ag) this, param0) - -(var25.a((ag) this, 1).a(true) >> 1);
            if (var6 == wl.field_c) {
              break L6;
            } else {
              if (m.field_n == var6) {
                break L6;
              } else {
                L7: {
                  if (bi.field_d == var6) {
                    break L7;
                  } else {
                    if (var6 == nd.field_d) {
                      var18 = cf.field_u[1];
                      var18.c(var9, var10 - (var18.field_A >> 1), 256);
                      if (var13 != 0) {
                        break L7;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                var19 = cf.field_u[2];
                var19.c(var9, -(var19.field_A >> 1) + var10, 256);
                if (var13 != 0) {
                  break L6;
                } else {
                  return;
                }
              }
            }
          }
          var20 = cf.field_u[0];
          var16 = var20;
          var11 = var20.field_u << 1;
          var12 = var20.field_r << 1;
          if (((al) this).field_P != null) {
            if (((al) this).field_P.field_z >= var11) {
              if (((al) this).field_P.field_A >= var12) {
                sb.a(((al) this).field_P, -117);
                si.d();
                if (var13 != 0) {
                  ((al) this).field_P = new bd(var11, var12);
                  sb.a(((al) this).field_P, -120);
                  var20.b(112, 144, var20.field_u << 4, var20.field_r << 4, -((al) this).field_V << 10, 4096);
                  eh.b(false);
                  ((al) this).field_P.c(-(var20.field_u >> 1) + var9, var10 + -var20.field_r, 256);
                  return;
                } else {
                  var20.b(112, 144, var20.field_u << 4, var20.field_r << 4, -((al) this).field_V << 10, 4096);
                  eh.b(false);
                  ((al) this).field_P.c(-(var20.field_u >> 1) + var9, var10 + -var20.field_r, 256);
                  return;
                }
              } else {
                ((al) this).field_P = new bd(var11, var12);
                sb.a(((al) this).field_P, -120);
                var20.b(112, 144, var20.field_u << 4, var20.field_r << 4, -((al) this).field_V << 10, 4096);
                eh.b(false);
                ((al) this).field_P.c(-(var20.field_u >> 1) + var9, var10 + -var20.field_r, 256);
                return;
              }
            } else {
              ((al) this).field_P = new bd(var11, var12);
              sb.a(((al) this).field_P, -120);
              var20.b(112, 144, var20.field_u << 4, var20.field_r << 4, -((al) this).field_V << 10, 4096);
              eh.b(false);
              ((al) this).field_P.c(-(var20.field_u >> 1) + var9, var10 + -var20.field_r, 256);
              return;
            }
          } else {
            ((al) this).field_P = new bd(var11, var12);
            sb.a(((al) this).field_P, -120);
            var20.b(112, 144, var20.field_u << 4, var20.field_r << 4, -((al) this).field_V << 10, 4096);
            eh.b(false);
            ((al) this).field_P.c(-(var20.field_u >> 1) + var9, var10 + -var20.field_r, 256);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Pick-ups";
        field_M = new String[255];
        field_Q = 0;
        field_S = "Collect ammo packs to replenish your stocks. If you run out of ammo you will have to rely on your pistol.<br>The auto gun and the C.R.A.G. share ammo packs, while the railgun and plasma cannon share energy cells.";
        field_X = "Accept";
        field_U = new int[6];
        field_W = new int[128];
    }
}
