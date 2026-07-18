/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends qi {
    static af field_V;
    static volatile int field_bb;
    static int field_Z;
    private int field_cb;
    static int field_Y;
    private nb field_X;
    static ck field_U;
    private ck field_eb;
    static String[] field_db;
    private String field_ab;
    static String[] field_gb;
    static int field_fb;
    static String field_W;

    pa(nb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (gl) (Object) vh.a(1424));
        try {
            ((pa) this).field_ab = param1;
            ((pa) this).field_X = param0;
            ((pa) this).b(param5, param4, param2, param3, -16555);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "pa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        tb var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        ck var17 = null;
        String var18 = null;
        Object var19 = null;
        ck var20 = null;
        ck var21 = null;
        ck var22 = null;
        ck var23 = null;
        ck var24 = null;
        ck var25 = null;
        Object var26 = null;
        ck var27 = null;
        ck var28 = null;
        ck var29 = null;
        ck var30 = null;
        ck var31 = null;
        ck var32 = null;
        Object var33 = null;
        ck var34 = null;
        ck var35 = null;
        ck var36 = null;
        ck var37 = null;
        ck var38 = null;
        ck var39 = null;
        nl var40 = null;
        nl var41 = null;
        nl var42 = null;
        var19 = null;
        var26 = null;
        var33 = null;
        var13 = client.field_A ? 1 : 0;
        var6 = ((pa) this).field_X.a(20350);
        if (var6 != le.field_o) {
          L0: {
            if (jb.field_j != var6) {
              var5 = ((pa) this).field_X.b((byte) 107);
              if (var5 != null) {
                break L0;
              } else {
                var5 = ((pa) this).field_ab;
                break L0;
              }
            } else {
              var5 = qi.field_T;
              break L0;
            }
          }
          if (!var5.equals((Object) (Object) ((pa) this).field_E)) {
            ((pa) this).field_E = var5;
            ((pa) this).a(2874);
            super.a(param0, -105, param2, param3);
            var6 = ((pa) this).field_X.a(20350);
            var42 = (nl) (Object) ((pa) this).field_p;
            var9 = ((pa) this).field_u + param0;
            if (param1 < -103) {
              L1: {
                var10 = var42.a(param3, 0, (ce) this) + (var42.a((ce) this, (byte) 44).b(-1) >> 1);
                if (le.field_o == var6) {
                  break L1;
                } else {
                  if (jb.field_j == var6) {
                    break L1;
                  } else {
                    if (var6 != vm.field_u) {
                      if (var6 == dc.field_b) {
                        var38 = tl.field_u[1];
                        var38.f(var9, var10 + -(var38.field_H >> 1), 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var37 = tl.field_u[2];
                      var37.f(var9, var10 - (var37.field_H >> 1), 256);
                      return;
                    }
                  }
                }
              }
              var39 = tl.field_u[0];
              var11 = var39.field_K << 1;
              var12 = var39.field_C << 1;
              if (((pa) this).field_eb != null) {
                if (var11 > ((pa) this).field_eb.field_I) {
                  ((pa) this).field_eb = new ck(var11, var12);
                  tb.a(true, ((pa) this).field_eb);
                  var39.a(112, 144, var39.field_K << 4, var39.field_C << 4, -((pa) this).field_cb << 10, 4096);
                  mk.a((byte) -5);
                  ((pa) this).field_eb.f(var9 - (var39.field_K >> 1), var10 - var39.field_C, 256);
                  return;
                } else {
                  if (var12 <= ((pa) this).field_eb.field_H) {
                    tb.a(true, ((pa) this).field_eb);
                    hk.b();
                    var39.a(112, 144, var39.field_K << 4, var39.field_C << 4, -((pa) this).field_cb << 10, 4096);
                    mk.a((byte) -5);
                    ((pa) this).field_eb.f(var9 - (var39.field_K >> 1), var10 - var39.field_C, 256);
                    return;
                  } else {
                    ((pa) this).field_eb = new ck(var11, var12);
                    tb.a(true, ((pa) this).field_eb);
                    var39.a(112, 144, var39.field_K << 4, var39.field_C << 4, -((pa) this).field_cb << 10, 4096);
                    mk.a((byte) -5);
                    ((pa) this).field_eb.f(var9 - (var39.field_K >> 1), var10 - var39.field_C, 256);
                    return;
                  }
                }
              } else {
                ((pa) this).field_eb = new ck(var11, var12);
                tb.a(true, ((pa) this).field_eb);
                var39.a(112, 144, var39.field_K << 4, var39.field_C << 4, -((pa) this).field_cb << 10, 4096);
                mk.a((byte) -5);
                ((pa) this).field_eb.f(var9 - (var39.field_K >> 1), var10 - var39.field_C, 256);
                return;
              }
            } else {
              L2: {
                var14 = null;
                boolean discarded$3 = ((pa) this).a(true, (ce) null);
                var10 = var42.a(param3, 0, (ce) this) + (var42.a((ce) this, (byte) 44).b(-1) >> 1);
                if (le.field_o == var6) {
                  break L2;
                } else {
                  if (jb.field_j == var6) {
                    break L2;
                  } else {
                    if (var6 != vm.field_u) {
                      if (var6 != dc.field_b) {
                        return;
                      } else {
                        var35 = tl.field_u[1];
                        var35.f(var9, var10 + -(var35.field_H >> 1), 256);
                        return;
                      }
                    } else {
                      var34 = tl.field_u[2];
                      var34.f(var9, var10 - (var34.field_H >> 1), 256);
                      return;
                    }
                  }
                }
              }
              var36 = tl.field_u[0];
              var17 = var36;
              var11 = var36.field_K << 1;
              var12 = var36.field_C << 1;
              if (((pa) this).field_eb != null) {
                if (var11 <= ((pa) this).field_eb.field_I) {
                  if (var12 <= ((pa) this).field_eb.field_H) {
                    tb.a(true, ((pa) this).field_eb);
                    hk.b();
                    var36.a(112, 144, var36.field_K << 4, var36.field_C << 4, -((pa) this).field_cb << 10, 4096);
                    mk.a((byte) -5);
                    ((pa) this).field_eb.f(var9 - (var36.field_K >> 1), var10 - var36.field_C, 256);
                    return;
                  } else {
                    ((pa) this).field_eb = new ck(var11, var12);
                    tb.a(true, ((pa) this).field_eb);
                    var36.a(112, 144, var36.field_K << 4, var36.field_C << 4, -((pa) this).field_cb << 10, 4096);
                    mk.a((byte) -5);
                    ((pa) this).field_eb.f(var9 - (var36.field_K >> 1), var10 - var36.field_C, 256);
                    return;
                  }
                } else {
                  ((pa) this).field_eb = new ck(var11, var12);
                  tb.a(true, ((pa) this).field_eb);
                  var36.a(112, 144, var36.field_K << 4, var36.field_C << 4, -((pa) this).field_cb << 10, 4096);
                  mk.a((byte) -5);
                  ((pa) this).field_eb.f(var9 - (var36.field_K >> 1), var10 - var36.field_C, 256);
                  return;
                }
              } else {
                ((pa) this).field_eb = new ck(var11, var12);
                tb.a(true, ((pa) this).field_eb);
                var36.a(112, 144, var36.field_K << 4, var36.field_C << 4, -((pa) this).field_cb << 10, 4096);
                mk.a((byte) -5);
                ((pa) this).field_eb.f(var9 - (var36.field_K >> 1), var10 - var36.field_C, 256);
                return;
              }
            }
          } else {
            super.a(param0, -105, param2, param3);
            var6 = ((pa) this).field_X.a(20350);
            var41 = (nl) (Object) ((pa) this).field_p;
            var9 = ((pa) this).field_u + param0;
            if (param1 < -103) {
              L3: {
                var10 = var41.a(param3, 0, (ce) this) + (var41.a((ce) this, (byte) 44).b(-1) >> 1);
                if (le.field_o == var6) {
                  break L3;
                } else {
                  if (jb.field_j == var6) {
                    break L3;
                  } else {
                    if (var6 != vm.field_u) {
                      if (var6 == dc.field_b) {
                        var31 = tl.field_u[1];
                        var31.f(var9, var10 + -(var31.field_H >> 1), 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var30 = tl.field_u[2];
                      var30.f(var9, var10 - (var30.field_H >> 1), 256);
                      return;
                    }
                  }
                }
              }
              var32 = tl.field_u[0];
              var11 = var32.field_K << 1;
              var12 = var32.field_C << 1;
              if (((pa) this).field_eb != null) {
                if (var11 <= ((pa) this).field_eb.field_I) {
                  if (var12 > ((pa) this).field_eb.field_H) {
                    ((pa) this).field_eb = new ck(var11, var12);
                    tb.a(true, ((pa) this).field_eb);
                    var32.a(112, 144, var32.field_K << 4, var32.field_C << 4, -((pa) this).field_cb << 10, 4096);
                    mk.a((byte) -5);
                    ((pa) this).field_eb.f(var9 - (var32.field_K >> 1), var10 - var32.field_C, 256);
                    return;
                  } else {
                    tb.a(true, ((pa) this).field_eb);
                    hk.b();
                    var32.a(112, 144, var32.field_K << 4, var32.field_C << 4, -((pa) this).field_cb << 10, 4096);
                    mk.a((byte) -5);
                    ((pa) this).field_eb.f(var9 - (var32.field_K >> 1), var10 - var32.field_C, 256);
                    return;
                  }
                } else {
                  ((pa) this).field_eb = new ck(var11, var12);
                  tb.a(true, ((pa) this).field_eb);
                  var32.a(112, 144, var32.field_K << 4, var32.field_C << 4, -((pa) this).field_cb << 10, 4096);
                  mk.a((byte) -5);
                  ((pa) this).field_eb.f(var9 - (var32.field_K >> 1), var10 - var32.field_C, 256);
                  return;
                }
              } else {
                ((pa) this).field_eb = new ck(var11, var12);
                tb.a(true, ((pa) this).field_eb);
                var32.a(112, 144, var32.field_K << 4, var32.field_C << 4, -((pa) this).field_cb << 10, 4096);
                mk.a((byte) -5);
                ((pa) this).field_eb.f(var9 - (var32.field_K >> 1), var10 - var32.field_C, 256);
                return;
              }
            } else {
              L4: {
                L5: {
                  var14 = null;
                  boolean discarded$4 = ((pa) this).a(true, (ce) null);
                  var10 = var41.a(param3, 0, (ce) this) + (var41.a((ce) this, (byte) 44).b(-1) >> 1);
                  if (le.field_o == var6) {
                    break L5;
                  } else {
                    if (jb.field_j == var6) {
                      break L5;
                    } else {
                      if (var6 != vm.field_u) {
                        if (var6 != dc.field_b) {
                          break L4;
                        } else {
                          var28 = tl.field_u[1];
                          var28.f(var9, var10 + -(var28.field_H >> 1), 256);
                          break L4;
                        }
                      } else {
                        var27 = tl.field_u[2];
                        var27.f(var9, var10 - (var27.field_H >> 1), 256);
                        break L4;
                      }
                    }
                  }
                }
                L6: {
                  L7: {
                    var29 = tl.field_u[0];
                    var11 = var29.field_K << 1;
                    var12 = var29.field_C << 1;
                    if (((pa) this).field_eb == null) {
                      break L7;
                    } else {
                      if (var11 > ((pa) this).field_eb.field_I) {
                        break L7;
                      } else {
                        if (var12 <= ((pa) this).field_eb.field_H) {
                          tb.a(true, ((pa) this).field_eb);
                          hk.b();
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  ((pa) this).field_eb = new ck(var11, var12);
                  tb.a(true, ((pa) this).field_eb);
                  break L6;
                }
                var29.a(112, 144, var29.field_K << 4, var29.field_C << 4, -((pa) this).field_cb << 10, 4096);
                mk.a((byte) -5);
                ((pa) this).field_eb.f(var9 - (var29.field_K >> 1), var10 - var29.field_C, 256);
                break L4;
              }
              return;
            }
          }
        } else {
          L8: {
            var18 = qi.field_T;
            if (var18.equals((Object) (Object) ((pa) this).field_E)) {
              break L8;
            } else {
              ((pa) this).field_E = var18;
              ((pa) this).a(2874);
              break L8;
            }
          }
          super.a(param0, -105, param2, param3);
          var6 = ((pa) this).field_X.a(20350);
          var40 = (nl) (Object) ((pa) this).field_p;
          var9 = ((pa) this).field_u + param0;
          if (param1 < -103) {
            L9: {
              var10 = var40.a(param3, 0, (ce) this) + (var40.a((ce) this, (byte) 44).b(-1) >> 1);
              if (le.field_o == var6) {
                break L9;
              } else {
                if (jb.field_j == var6) {
                  break L9;
                } else {
                  if (var6 != vm.field_u) {
                    if (var6 == dc.field_b) {
                      var24 = tl.field_u[1];
                      var24.f(var9, var10 + -(var24.field_H >> 1), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var23 = tl.field_u[2];
                    var23.f(var9, var10 - (var23.field_H >> 1), 256);
                    return;
                  }
                }
              }
            }
            var25 = tl.field_u[0];
            var11 = var25.field_K << 1;
            var12 = var25.field_C << 1;
            if (((pa) this).field_eb != null) {
              if (var11 <= ((pa) this).field_eb.field_I) {
                if (var12 > ((pa) this).field_eb.field_H) {
                  ((pa) this).field_eb = new ck(var11, var12);
                  tb.a(true, ((pa) this).field_eb);
                  var25.a(112, 144, var25.field_K << 4, var25.field_C << 4, -((pa) this).field_cb << 10, 4096);
                  mk.a((byte) -5);
                  ((pa) this).field_eb.f(var9 - (var25.field_K >> 1), var10 - var25.field_C, 256);
                  return;
                } else {
                  tb.a(true, ((pa) this).field_eb);
                  hk.b();
                  var25.a(112, 144, var25.field_K << 4, var25.field_C << 4, -((pa) this).field_cb << 10, 4096);
                  mk.a((byte) -5);
                  ((pa) this).field_eb.f(var9 - (var25.field_K >> 1), var10 - var25.field_C, 256);
                  return;
                }
              } else {
                ((pa) this).field_eb = new ck(var11, var12);
                tb.a(true, ((pa) this).field_eb);
                var25.a(112, 144, var25.field_K << 4, var25.field_C << 4, -((pa) this).field_cb << 10, 4096);
                mk.a((byte) -5);
                ((pa) this).field_eb.f(var9 - (var25.field_K >> 1), var10 - var25.field_C, 256);
                return;
              }
            } else {
              ((pa) this).field_eb = new ck(var11, var12);
              tb.a(true, ((pa) this).field_eb);
              var25.a(112, 144, var25.field_K << 4, var25.field_C << 4, -((pa) this).field_cb << 10, 4096);
              mk.a((byte) -5);
              ((pa) this).field_eb.f(var9 - (var25.field_K >> 1), var10 - var25.field_C, 256);
              return;
            }
          } else {
            L10: {
              L11: {
                var14 = null;
                boolean discarded$5 = ((pa) this).a(true, (ce) null);
                var10 = var40.a(param3, 0, (ce) this) + (var40.a((ce) this, (byte) 44).b(-1) >> 1);
                if (le.field_o == var6) {
                  break L11;
                } else {
                  if (jb.field_j == var6) {
                    break L11;
                  } else {
                    if (var6 != vm.field_u) {
                      if (var6 != dc.field_b) {
                        break L10;
                      } else {
                        var21 = tl.field_u[1];
                        var21.f(var9, var10 + -(var21.field_H >> 1), 256);
                        break L10;
                      }
                    } else {
                      var20 = tl.field_u[2];
                      var20.f(var9, var10 - (var20.field_H >> 1), 256);
                      break L10;
                    }
                  }
                }
              }
              L12: {
                L13: {
                  var22 = tl.field_u[0];
                  var11 = var22.field_K << 1;
                  var12 = var22.field_C << 1;
                  if (((pa) this).field_eb == null) {
                    break L13;
                  } else {
                    if (var11 > ((pa) this).field_eb.field_I) {
                      break L13;
                    } else {
                      if (var12 <= ((pa) this).field_eb.field_H) {
                        tb.a(true, ((pa) this).field_eb);
                        hk.b();
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                ((pa) this).field_eb = new ck(var11, var12);
                tb.a(true, ((pa) this).field_eb);
                break L12;
              }
              var22.a(112, 144, var22.field_K << 4, var22.field_C << 4, -((pa) this).field_cb << 10, 4096);
              mk.a((byte) -5);
              ((pa) this).field_eb.f(var9 - (var22.field_K >> 1), var10 - var22.field_C, 256);
              break L10;
            }
            return;
          }
        }
    }

    public static void h() {
        field_U = null;
        field_db = null;
        field_gb = null;
        field_V = null;
        field_W = null;
    }

    final static int b(int param0, int param1) {
        if (param0 < 4) {
          throw new IllegalArgumentException();
        } else {
          return 400 - -(50 * (-2 + param0) * (param0 + -3));
        }
    }

    final boolean a(boolean param0, ce param1) {
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
            if (!param0) {
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
            stackOut_5_1 = new StringBuilder().append("pa.EC(").append(param0).append(',');
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
          throw dh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final String c(byte param0) {
        if (param0 == 113) {
            return null;
        }
        Object var3 = null;
        ((pa) this).a((ce) null, -51, 86, -72);
        return null;
    }

    final static void g(byte param0) {
        int var1 = (-640 + wj.field_Lb) / 2;
        int var2 = dl.field_M * dl.field_M;
        int var3 = var2 - lg.field_W * lg.field_W;
        int var4 = 50 / ((param0 - 51) / 46);
        g.field_R.a(199, 0, 90, -90 + (-120 + hk.field_i) + -4, -(var3 * 199 / var2) + var1);
        wm.field_h.a(438, 0, 0, -4 + (hk.field_i + -120), 202 + (var1 - -(438 * var3 / var2)));
    }

    final void a(ce param0, int param1, int param2, int param3) {
        try {
            ((pa) this).field_cb = ((pa) this).field_cb + 1;
            if (param1 <= 38) {
                field_gb = null;
            }
            super.a(param0, 109, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "pa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = 0;
        field_Z = -1;
        field_V = new af();
        field_gb = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_W = "Eight-bit";
    }
}
