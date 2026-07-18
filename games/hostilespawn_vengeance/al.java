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

    public static void a() {
        field_U = null;
        field_X = null;
        field_N = null;
        field_W = null;
        field_O = null;
        field_M = null;
        field_Z = null;
        field_S = null;
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
            stackOut_4_1 = new StringBuilder().append("al.LA(").append(param0).append(',');
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
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
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
            throw wg.a((Throwable) (Object) runtimeException, "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
            ((al) this).field_V = ((al) this).field_V + 1;
            super.a(param0, param1, param2 ^ param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "al.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        bm var6 = null;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bd var14 = null;
        bd var15 = null;
        bd var16 = null;
        mi var17 = null;
        var8 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        var6 = ((al) this).field_Y.b(-110);
        if (wl.field_c != var6) {
          if (var6 != m.field_n) {
            var5 = ((al) this).field_Y.a(-56);
            if (var5 != null) {
              L0: {
                if (!var5.equals((Object) (Object) ((al) this).field_n)) {
                  ((al) this).field_n = var5;
                  ((al) this).j(-25638);
                  break L0;
                } else {
                  break L0;
                }
              }
              super.a(param0, param1, (byte) 107, param3);
              var6 = ((al) this).field_Y.b(-100);
              if (param2 > 42) {
                L1: {
                  var17 = (mi) (Object) ((al) this).field_h;
                  var9 = ((al) this).field_v + param1;
                  var10 = var17.a(-1, (ag) this, param0) - -(var17.a((ag) this, 1).a(true) >> 1);
                  if (var6 == wl.field_c) {
                    break L1;
                  } else {
                    if (m.field_n == var6) {
                      break L1;
                    } else {
                      if (bi.field_d == var6) {
                        var15 = cf.field_u[2];
                        var15.c(var9, -(var15.field_A >> 1) + var10, 256);
                        return;
                      } else {
                        if (var6 != nd.field_d) {
                          return;
                        } else {
                          var14 = cf.field_u[1];
                          var14.c(var9, var10 - (var14.field_A >> 1), 256);
                          return;
                        }
                      }
                    }
                  }
                }
                L2: {
                  var16 = cf.field_u[0];
                  var11 = var16.field_u << 1;
                  var12 = var16.field_r << 1;
                  if (((al) this).field_P == null) {
                    break L2;
                  } else {
                    if (((al) this).field_P.field_z < var11) {
                      break L2;
                    } else {
                      if (((al) this).field_P.field_A < var12) {
                        break L2;
                      } else {
                        sb.a(((al) this).field_P, -117);
                        si.d();
                        var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                        int discarded$19 = 0;
                        eh.b();
                        ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                        return;
                      }
                    }
                  }
                }
                ((al) this).field_P = new bd(var11, var12);
                sb.a(((al) this).field_P, -120);
                var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                int discarded$20 = 0;
                eh.b();
                ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                return;
              } else {
                L3: {
                  field_Q = 125;
                  var17 = (mi) (Object) ((al) this).field_h;
                  var9 = ((al) this).field_v + param1;
                  var10 = var17.a(-1, (ag) this, param0) - -(var17.a((ag) this, 1).a(true) >> 1);
                  if (var6 == wl.field_c) {
                    break L3;
                  } else {
                    if (m.field_n == var6) {
                      break L3;
                    } else {
                      if (bi.field_d != var6) {
                        if (var6 == nd.field_d) {
                          var14 = cf.field_u[1];
                          var14.c(var9, var10 - (var14.field_A >> 1), 256);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var15 = cf.field_u[2];
                        var15.c(var9, -(var15.field_A >> 1) + var10, 256);
                        return;
                      }
                    }
                  }
                }
                var16 = cf.field_u[0];
                var11 = var16.field_u << 1;
                var12 = var16.field_r << 1;
                if (((al) this).field_P != null) {
                  L4: {
                    if (((al) this).field_P.field_z < var11) {
                      break L4;
                    } else {
                      if (((al) this).field_P.field_A < var12) {
                        break L4;
                      } else {
                        sb.a(((al) this).field_P, -117);
                        si.d();
                        var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                        int discarded$21 = 0;
                        eh.b();
                        ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                        return;
                      }
                    }
                  }
                  ((al) this).field_P = new bd(var11, var12);
                  sb.a(((al) this).field_P, -120);
                  var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                  int discarded$22 = 0;
                  eh.b();
                  ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                  return;
                } else {
                  ((al) this).field_P = new bd(var11, var12);
                  sb.a(((al) this).field_P, -120);
                  var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                  int discarded$23 = 0;
                  eh.b();
                  ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                  return;
                }
              }
            } else {
              L5: {
                var5 = ((al) this).field_R;
                if (!var5.equals((Object) (Object) ((al) this).field_n)) {
                  ((al) this).field_n = var5;
                  ((al) this).j(-25638);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                super.a(param0, param1, (byte) 107, param3);
                var6 = ((al) this).field_Y.b(-100);
                if (param2 > 42) {
                  break L6;
                } else {
                  field_Q = 125;
                  break L6;
                }
              }
              L7: {
                var17 = (mi) (Object) ((al) this).field_h;
                var9 = ((al) this).field_v + param1;
                var10 = var17.a(-1, (ag) this, param0) - -(var17.a((ag) this, 1).a(true) >> 1);
                if (var6 == wl.field_c) {
                  break L7;
                } else {
                  if (m.field_n == var6) {
                    break L7;
                  } else {
                    L8: {
                      if (bi.field_d == var6) {
                        var15 = cf.field_u[2];
                        var15.c(var9, -(var15.field_A >> 1) + var10, 256);
                        break L8;
                      } else {
                        if (var6 == nd.field_d) {
                          var14 = cf.field_u[1];
                          var14.c(var9, var10 - (var14.field_A >> 1), 256);
                          break L8;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              var16 = cf.field_u[0];
              var11 = var16.field_u << 1;
              var12 = var16.field_r << 1;
              if (((al) this).field_P != null) {
                if (((al) this).field_P.field_z >= var11) {
                  if (((al) this).field_P.field_A >= var12) {
                    sb.a(((al) this).field_P, -117);
                    si.d();
                    var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                    int discarded$24 = 0;
                    eh.b();
                    ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                    return;
                  } else {
                    ((al) this).field_P = new bd(var11, var12);
                    sb.a(((al) this).field_P, -120);
                    var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                    int discarded$25 = 0;
                    eh.b();
                    ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                    return;
                  }
                } else {
                  ((al) this).field_P = new bd(var11, var12);
                  sb.a(((al) this).field_P, -120);
                  var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                  int discarded$26 = 0;
                  eh.b();
                  ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                  return;
                }
              } else {
                ((al) this).field_P = new bd(var11, var12);
                sb.a(((al) this).field_P, -120);
                var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                int discarded$27 = 0;
                eh.b();
                ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                return;
              }
            }
          } else {
            L9: {
              var5 = mg.field_d;
              if (!var5.equals((Object) (Object) ((al) this).field_n)) {
                ((al) this).field_n = var5;
                ((al) this).j(-25638);
                break L9;
              } else {
                break L9;
              }
            }
            super.a(param0, param1, (byte) 107, param3);
            var6 = ((al) this).field_Y.b(-100);
            if (param2 > 42) {
              L10: {
                var17 = (mi) (Object) ((al) this).field_h;
                var9 = ((al) this).field_v + param1;
                var10 = var17.a(-1, (ag) this, param0) - -(var17.a((ag) this, 1).a(true) >> 1);
                if (var6 == wl.field_c) {
                  break L10;
                } else {
                  if (m.field_n == var6) {
                    break L10;
                  } else {
                    if (bi.field_d != var6) {
                      if (var6 == nd.field_d) {
                        var14 = cf.field_u[1];
                        var14.c(var9, var10 - (var14.field_A >> 1), 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var15 = cf.field_u[2];
                      var15.c(var9, -(var15.field_A >> 1) + var10, 256);
                      return;
                    }
                  }
                }
              }
              var16 = cf.field_u[0];
              var11 = var16.field_u << 1;
              var12 = var16.field_r << 1;
              if (((al) this).field_P != null) {
                if (((al) this).field_P.field_z >= var11) {
                  if (((al) this).field_P.field_A < var12) {
                    ((al) this).field_P = new bd(var11, var12);
                    sb.a(((al) this).field_P, -120);
                    var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                    int discarded$28 = 0;
                    eh.b();
                    ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                    return;
                  } else {
                    sb.a(((al) this).field_P, -117);
                    si.d();
                    var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                    int discarded$29 = 0;
                    eh.b();
                    ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                    return;
                  }
                } else {
                  ((al) this).field_P = new bd(var11, var12);
                  sb.a(((al) this).field_P, -120);
                  var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                  int discarded$30 = 0;
                  eh.b();
                  ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                  return;
                }
              } else {
                ((al) this).field_P = new bd(var11, var12);
                sb.a(((al) this).field_P, -120);
                var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                int discarded$31 = 0;
                eh.b();
                ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                return;
              }
            } else {
              L11: {
                L12: {
                  field_Q = 125;
                  var17 = (mi) (Object) ((al) this).field_h;
                  var9 = ((al) this).field_v + param1;
                  var10 = var17.a(-1, (ag) this, param0) - -(var17.a((ag) this, 1).a(true) >> 1);
                  if (var6 == wl.field_c) {
                    break L12;
                  } else {
                    if (m.field_n == var6) {
                      break L12;
                    } else {
                      if (bi.field_d == var6) {
                        var15 = cf.field_u[2];
                        var15.c(var9, -(var15.field_A >> 1) + var10, 256);
                        break L11;
                      } else {
                        if (var6 != nd.field_d) {
                          break L11;
                        } else {
                          var14 = cf.field_u[1];
                          var14.c(var9, var10 - (var14.field_A >> 1), 256);
                          break L11;
                        }
                      }
                    }
                  }
                }
                L13: {
                  L14: {
                    var16 = cf.field_u[0];
                    var11 = var16.field_u << 1;
                    var12 = var16.field_r << 1;
                    if (((al) this).field_P == null) {
                      break L14;
                    } else {
                      if (((al) this).field_P.field_z < var11) {
                        break L14;
                      } else {
                        if (((al) this).field_P.field_A < var12) {
                          break L14;
                        } else {
                          sb.a(((al) this).field_P, -117);
                          si.d();
                          break L13;
                        }
                      }
                    }
                  }
                  ((al) this).field_P = new bd(var11, var12);
                  sb.a(((al) this).field_P, -120);
                  break L13;
                }
                var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                int discarded$32 = 0;
                eh.b();
                ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                break L11;
              }
              return;
            }
          }
        } else {
          L15: {
            var5 = mg.field_d;
            if (!var5.equals((Object) (Object) ((al) this).field_n)) {
              ((al) this).field_n = var5;
              ((al) this).j(-25638);
              break L15;
            } else {
              break L15;
            }
          }
          super.a(param0, param1, (byte) 107, param3);
          var6 = ((al) this).field_Y.b(-100);
          if (param2 > 42) {
            L16: {
              var17 = (mi) (Object) ((al) this).field_h;
              var9 = ((al) this).field_v + param1;
              var10 = var17.a(-1, (ag) this, param0) - -(var17.a((ag) this, 1).a(true) >> 1);
              if (var6 == wl.field_c) {
                break L16;
              } else {
                if (m.field_n == var6) {
                  break L16;
                } else {
                  if (bi.field_d != var6) {
                    if (var6 == nd.field_d) {
                      var14 = cf.field_u[1];
                      var14.c(var9, var10 - (var14.field_A >> 1), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var15 = cf.field_u[2];
                    var15.c(var9, -(var15.field_A >> 1) + var10, 256);
                    return;
                  }
                }
              }
            }
            var16 = cf.field_u[0];
            var11 = var16.field_u << 1;
            var12 = var16.field_r << 1;
            if (((al) this).field_P != null) {
              if (((al) this).field_P.field_z >= var11) {
                if (((al) this).field_P.field_A >= var12) {
                  sb.a(((al) this).field_P, -117);
                  si.d();
                  var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                  int discarded$33 = 0;
                  eh.b();
                  ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                  return;
                } else {
                  ((al) this).field_P = new bd(var11, var12);
                  sb.a(((al) this).field_P, -120);
                  var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                  int discarded$34 = 0;
                  eh.b();
                  ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                  return;
                }
              } else {
                ((al) this).field_P = new bd(var11, var12);
                sb.a(((al) this).field_P, -120);
                var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
                int discarded$35 = 0;
                eh.b();
                ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
                return;
              }
            } else {
              ((al) this).field_P = new bd(var11, var12);
              sb.a(((al) this).field_P, -120);
              var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
              int discarded$36 = 0;
              eh.b();
              ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
              return;
            }
          } else {
            L17: {
              L18: {
                field_Q = 125;
                var17 = (mi) (Object) ((al) this).field_h;
                var9 = ((al) this).field_v + param1;
                var10 = var17.a(-1, (ag) this, param0) - -(var17.a((ag) this, 1).a(true) >> 1);
                if (var6 == wl.field_c) {
                  break L18;
                } else {
                  if (m.field_n == var6) {
                    break L18;
                  } else {
                    if (bi.field_d == var6) {
                      var15 = cf.field_u[2];
                      var15.c(var9, -(var15.field_A >> 1) + var10, 256);
                      break L17;
                    } else {
                      if (var6 != nd.field_d) {
                        break L17;
                      } else {
                        var14 = cf.field_u[1];
                        var14.c(var9, var10 - (var14.field_A >> 1), 256);
                        break L17;
                      }
                    }
                  }
                }
              }
              L19: {
                L20: {
                  var16 = cf.field_u[0];
                  var11 = var16.field_u << 1;
                  var12 = var16.field_r << 1;
                  if (((al) this).field_P == null) {
                    break L20;
                  } else {
                    if (((al) this).field_P.field_z < var11) {
                      break L20;
                    } else {
                      if (((al) this).field_P.field_A < var12) {
                        break L20;
                      } else {
                        sb.a(((al) this).field_P, -117);
                        si.d();
                        break L19;
                      }
                    }
                  }
                }
                ((al) this).field_P = new bd(var11, var12);
                sb.a(((al) this).field_P, -120);
                break L19;
              }
              var16.b(112, 144, var16.field_u << 4, var16.field_r << 4, -((al) this).field_V << 10, 4096);
              int discarded$37 = 0;
              eh.b();
              ((al) this).field_P.c(-(var16.field_u >> 1) + var9, var10 + -var16.field_r, 256);
              break L17;
            }
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
