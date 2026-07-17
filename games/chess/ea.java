/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends se {
    private vb field_fb;
    static String field_P;
    static bn field_cb;
    static ok field_bb;
    private String field_eb;
    private int field_db;
    private km field_T;

    final void a(int param0, int param1, mf param2, int param3) {
        RuntimeException runtimeException = null;
        Object var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ea) this).field_db = ((ea) this).field_db + 1;
              super.a(param0, -32, param2, param3);
              if (param1 < -6) {
                break L1;
              } else {
                var6 = null;
                ((ea) this).a(95, -66, (mf) null, 75);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ea.G(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param3 + 41);
        }
    }

    public static void g(byte param0) {
        int var1 = 101 / ((param0 - 37) / 53);
        field_bb = null;
        field_P = null;
        field_cb = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        mk var6 = null;
        mg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        km var14 = null;
        km var16 = null;
        km var17 = null;
        km var18 = null;
        km var19 = null;
        km var20 = null;
        km var21 = null;
        km var22 = null;
        var13 = Chess.field_G;
        if (param2 < -80) {
          L0: {
            L1: {
              L2: {
                L3: {
                  var6 = ((ea) this).field_fb.a(21314);
                  if (in.field_g == var6) {
                    break L3;
                  } else {
                    if (var6 == ek.field_d) {
                      break L3;
                    } else {
                      var5 = ((ea) this).field_fb.a(false);
                      if (var5 == null) {
                        var5 = ((ea) this).field_eb;
                        if (var13 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        if (!var5.equals((Object) (Object) ((ea) this).field_v)) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
                var5 = cc.field_v;
                break L2;
              }
              if (!var5.equals((Object) (Object) ((ea) this).field_v)) {
                break L1;
              } else {
                break L0;
              }
            }
            ((ea) this).field_v = var5;
            ((ea) this).f((byte) 105);
            break L0;
          }
          super.a(param0, param1, -109, param3);
          var6 = ((ea) this).field_fb.a(21314);
          var8 = (mg) (Object) ((ea) this).field_n;
          var9 = param3 - -((ea) this).field_u;
          var10 = var8.a(0, param0, (mf) this) + (var8.a((mf) this, -23159).a((byte) 34) >> 1);
          if (in.field_g != var6) {
            if (var6 != ek.field_d) {
              if (var6 == qk.field_b) {
                var14 = uh.field_p[2];
                var14.d(var9, -(var14.field_t >> 1) + var10, 256);
                if (var13 != 0) {
                  if (oa.field_a == var6) {
                    var21 = uh.field_p[1];
                    var21.d(var9, -(var21.field_t >> 1) + var10, 256);
                    if (var13 != 0) {
                      L4: {
                        var22 = uh.field_p[0];
                        var11 = var22.field_v << 1;
                        var12 = var22.field_u << 1;
                        if (null == ((ea) this).field_T) {
                          break L4;
                        } else {
                          if (var11 > ((ea) this).field_T.field_w) {
                            break L4;
                          } else {
                            if (var12 > ((ea) this).field_T.field_t) {
                              ((ea) this).field_T = new km(var11, var12);
                              tl.a((byte) -67, ((ea) this).field_T);
                              if (var13 != 0) {
                                tl.a((byte) -67, ((ea) this).field_T);
                                wb.b();
                                var22.b(112, 144, var22.field_v << 4, var22.field_u << 4, -((ea) this).field_db << 10, 4096);
                                fd.a(28773);
                                ((ea) this).field_T.d(-(var22.field_v >> 1) + var9, -var22.field_u + var10, 256);
                                return;
                              } else {
                                var22.b(112, 144, var22.field_v << 4, var22.field_u << 4, -((ea) this).field_db << 10, 4096);
                                fd.a(28773);
                                ((ea) this).field_T.d(-(var22.field_v >> 1) + var9, -var22.field_u + var10, 256);
                                return;
                              }
                            } else {
                              tl.a((byte) -67, ((ea) this).field_T);
                              wb.b();
                              var22.b(112, 144, var22.field_v << 4, var22.field_u << 4, -((ea) this).field_db << 10, 4096);
                              fd.a(28773);
                              ((ea) this).field_T.d(-(var22.field_v >> 1) + var9, -var22.field_u + var10, 256);
                              return;
                            }
                          }
                        }
                      }
                      ((ea) this).field_T = new km(var11, var12);
                      tl.a((byte) -67, ((ea) this).field_T);
                      if (var13 != 0) {
                        tl.a((byte) -67, ((ea) this).field_T);
                        wb.b();
                        var22.b(112, 144, var22.field_v << 4, var22.field_u << 4, -((ea) this).field_db << 10, 4096);
                        fd.a(28773);
                        ((ea) this).field_T.d(-(var22.field_v >> 1) + var9, -var22.field_u + var10, 256);
                        return;
                      } else {
                        var22.b(112, 144, var22.field_v << 4, var22.field_u << 4, -((ea) this).field_db << 10, 4096);
                        fd.a(28773);
                        ((ea) this).field_T.d(-(var22.field_v >> 1) + var9, -var22.field_u + var10, 256);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (oa.field_a == var6) {
                  var19 = uh.field_p[1];
                  var19.d(var9, -(var19.field_t >> 1) + var10, 256);
                  if (var13 != 0) {
                    L5: {
                      var20 = uh.field_p[0];
                      var11 = var20.field_v << 1;
                      var12 = var20.field_u << 1;
                      if (null == ((ea) this).field_T) {
                        break L5;
                      } else {
                        if (var11 > ((ea) this).field_T.field_w) {
                          break L5;
                        } else {
                          if (var12 > ((ea) this).field_T.field_t) {
                            ((ea) this).field_T = new km(var11, var12);
                            tl.a((byte) -67, ((ea) this).field_T);
                            if (var13 != 0) {
                              tl.a((byte) -67, ((ea) this).field_T);
                              wb.b();
                              var20.b(112, 144, var20.field_v << 4, var20.field_u << 4, -((ea) this).field_db << 10, 4096);
                              fd.a(28773);
                              ((ea) this).field_T.d(-(var20.field_v >> 1) + var9, -var20.field_u + var10, 256);
                              return;
                            } else {
                              var20.b(112, 144, var20.field_v << 4, var20.field_u << 4, -((ea) this).field_db << 10, 4096);
                              fd.a(28773);
                              ((ea) this).field_T.d(-(var20.field_v >> 1) + var9, -var20.field_u + var10, 256);
                              return;
                            }
                          } else {
                            tl.a((byte) -67, ((ea) this).field_T);
                            wb.b();
                            var20.b(112, 144, var20.field_v << 4, var20.field_u << 4, -((ea) this).field_db << 10, 4096);
                            fd.a(28773);
                            ((ea) this).field_T.d(-(var20.field_v >> 1) + var9, -var20.field_u + var10, 256);
                            return;
                          }
                        }
                      }
                    }
                    ((ea) this).field_T = new km(var11, var12);
                    tl.a((byte) -67, ((ea) this).field_T);
                    if (var13 != 0) {
                      tl.a((byte) -67, ((ea) this).field_T);
                      wb.b();
                      var20.b(112, 144, var20.field_v << 4, var20.field_u << 4, -((ea) this).field_db << 10, 4096);
                      fd.a(28773);
                      ((ea) this).field_T.d(-(var20.field_v >> 1) + var9, -var20.field_u + var10, 256);
                      return;
                    } else {
                      var20.b(112, 144, var20.field_v << 4, var20.field_u << 4, -((ea) this).field_db << 10, 4096);
                      fd.a(28773);
                      ((ea) this).field_T.d(-(var20.field_v >> 1) + var9, -var20.field_u + var10, 256);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L6: {
                var18 = uh.field_p[0];
                var16 = var18;
                var11 = var18.field_v << 1;
                var12 = var18.field_u << 1;
                if (null == ((ea) this).field_T) {
                  break L6;
                } else {
                  if (var11 > ((ea) this).field_T.field_w) {
                    break L6;
                  } else {
                    if (var12 > ((ea) this).field_T.field_t) {
                      ((ea) this).field_T = new km(var11, var12);
                      tl.a((byte) -67, ((ea) this).field_T);
                      if (var13 != 0) {
                        tl.a((byte) -67, ((ea) this).field_T);
                        wb.b();
                        var18.b(112, 144, var18.field_v << 4, var18.field_u << 4, -((ea) this).field_db << 10, 4096);
                        fd.a(28773);
                        ((ea) this).field_T.d(-(var18.field_v >> 1) + var9, -var18.field_u + var10, 256);
                        return;
                      } else {
                        var18.b(112, 144, var18.field_v << 4, var18.field_u << 4, -((ea) this).field_db << 10, 4096);
                        fd.a(28773);
                        ((ea) this).field_T.d(-(var18.field_v >> 1) + var9, -var18.field_u + var10, 256);
                        return;
                      }
                    } else {
                      tl.a((byte) -67, ((ea) this).field_T);
                      wb.b();
                      var18.b(112, 144, var18.field_v << 4, var18.field_u << 4, -((ea) this).field_db << 10, 4096);
                      fd.a(28773);
                      ((ea) this).field_T.d(-(var18.field_v >> 1) + var9, -var18.field_u + var10, 256);
                      return;
                    }
                  }
                }
              }
              ((ea) this).field_T = new km(var11, var12);
              tl.a((byte) -67, ((ea) this).field_T);
              if (var13 != 0) {
                tl.a((byte) -67, ((ea) this).field_T);
                wb.b();
                var18.b(112, 144, var18.field_v << 4, var18.field_u << 4, -((ea) this).field_db << 10, 4096);
                fd.a(28773);
                ((ea) this).field_T.d(-(var18.field_v >> 1) + var9, -var18.field_u + var10, 256);
                return;
              } else {
                var18.b(112, 144, var18.field_v << 4, var18.field_u << 4, -((ea) this).field_db << 10, 4096);
                fd.a(28773);
                ((ea) this).field_T.d(-(var18.field_v >> 1) + var9, -var18.field_u + var10, 256);
                return;
              }
            }
          } else {
            L7: {
              var17 = uh.field_p[0];
              var11 = var17.field_v << 1;
              var12 = var17.field_u << 1;
              if (null == ((ea) this).field_T) {
                break L7;
              } else {
                if (var11 > ((ea) this).field_T.field_w) {
                  break L7;
                } else {
                  if (var12 > ((ea) this).field_T.field_t) {
                    L8: {
                      ((ea) this).field_T = new km(var11, var12);
                      tl.a((byte) -67, ((ea) this).field_T);
                      if (var13 == 0) {
                        break L8;
                      } else {
                        tl.a((byte) -67, ((ea) this).field_T);
                        wb.b();
                        break L8;
                      }
                    }
                    var17.b(112, 144, var17.field_v << 4, var17.field_u << 4, -((ea) this).field_db << 10, 4096);
                    fd.a(28773);
                    ((ea) this).field_T.d(-(var17.field_v >> 1) + var9, -var17.field_u + var10, 256);
                    return;
                  } else {
                    tl.a((byte) -67, ((ea) this).field_T);
                    wb.b();
                    var17.b(112, 144, var17.field_v << 4, var17.field_u << 4, -((ea) this).field_db << 10, 4096);
                    fd.a(28773);
                    ((ea) this).field_T.d(-(var17.field_v >> 1) + var9, -var17.field_u + var10, 256);
                    return;
                  }
                }
              }
            }
            ((ea) this).field_T = new km(var11, var12);
            tl.a((byte) -67, ((ea) this).field_T);
            if (var13 != 0) {
              tl.a((byte) -67, ((ea) this).field_T);
              wb.b();
              var17.b(112, 144, var17.field_v << 4, var17.field_u << 4, -((ea) this).field_db << 10, 4096);
              fd.a(28773);
              ((ea) this).field_T.d(-(var17.field_v >> 1) + var9, -var17.field_u + var10, 256);
              return;
            } else {
              var17.b(112, 144, var17.field_v << 4, var17.field_u << 4, -((ea) this).field_db << 10, 4096);
              fd.a(28773);
              ((ea) this).field_T.d(-(var17.field_v >> 1) + var9, -var17.field_u + var10, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final String g(int param0) {
        if (param0 == 0) {
            return null;
        }
        String discarded$0 = ((ea) this).g(93);
        return null;
    }

    final boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ea.D(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static int h(byte param0) {
        if (param0 != -16) {
            field_bb = null;
            return si.field_o;
        }
        return si.field_o;
    }

    ea(vb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (jm) (Object) je.d(false));
        try {
            ((ea) this).field_fb = param0;
            ((ea) this).field_eb = param1;
            ((ea) this).a(param3, 34, param5, param4, param2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ea.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static long i(byte param0) {
        int var1 = 40 % ((-84 - param0) / 36);
        return -ml.field_d + ud.a(2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Shortcut Reference";
    }
}
