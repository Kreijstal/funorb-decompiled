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

    public static void g() {
        int var1 = -101;
        field_bb = null;
        field_P = null;
        field_cb = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        mk var6 = null;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        km var14 = null;
        km var15 = null;
        km var16 = null;
        mg var17 = null;
        var8 = null;
        var13 = Chess.field_G;
        if (param2 < -80) {
          var6 = ((ea) this).field_fb.a(21314);
          if (in.field_g != var6) {
            if (var6 != ek.field_d) {
              var5 = ((ea) this).field_fb.a(false);
              if (var5 != null) {
                L0: {
                  if (!var5.equals((Object) (Object) ((ea) this).field_v)) {
                    ((ea) this).field_v = var5;
                    ((ea) this).f((byte) 105);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                super.a(param0, param1, -109, param3);
                var6 = ((ea) this).field_fb.a(21314);
                var17 = (mg) (Object) ((ea) this).field_n;
                var9 = param3 - -((ea) this).field_u;
                var10 = var17.a(0, param0, (mf) this) + (var17.a((mf) this, -23159).a((byte) 34) >> 1);
                if (in.field_g != var6) {
                  if (var6 != ek.field_d) {
                    if (var6 != qk.field_b) {
                      if (oa.field_a == var6) {
                        var15 = uh.field_p[1];
                        var15.d(var9, -(var15.field_t >> 1) + var10, 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var14 = uh.field_p[2];
                      var14.d(var9, -(var14.field_t >> 1) + var10, 256);
                      return;
                    }
                  } else {
                    L1: {
                      var16 = uh.field_p[0];
                      var11 = var16.field_v << 1;
                      var12 = var16.field_u << 1;
                      if (null == ((ea) this).field_T) {
                        break L1;
                      } else {
                        if (var11 > ((ea) this).field_T.field_w) {
                          break L1;
                        } else {
                          if (var12 <= ((ea) this).field_T.field_t) {
                            tl.a((byte) -67, ((ea) this).field_T);
                            wb.b();
                            var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                            int discarded$22 = 28773;
                            fd.a();
                            ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                            return;
                          } else {
                            ((ea) this).field_T = new km(var11, var12);
                            tl.a((byte) -67, ((ea) this).field_T);
                            var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                            int discarded$23 = 28773;
                            fd.a();
                            ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                            return;
                          }
                        }
                      }
                    }
                    ((ea) this).field_T = new km(var11, var12);
                    tl.a((byte) -67, ((ea) this).field_T);
                    var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                    int discarded$24 = 28773;
                    fd.a();
                    ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                    return;
                  }
                } else {
                  L2: {
                    var16 = uh.field_p[0];
                    var11 = var16.field_v << 1;
                    var12 = var16.field_u << 1;
                    if (null == ((ea) this).field_T) {
                      break L2;
                    } else {
                      if (var11 > ((ea) this).field_T.field_w) {
                        break L2;
                      } else {
                        if (var12 <= ((ea) this).field_T.field_t) {
                          tl.a((byte) -67, ((ea) this).field_T);
                          wb.b();
                          var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                          int discarded$25 = 28773;
                          fd.a();
                          ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                          return;
                        } else {
                          ((ea) this).field_T = new km(var11, var12);
                          tl.a((byte) -67, ((ea) this).field_T);
                          var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                          int discarded$26 = 28773;
                          fd.a();
                          ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                          return;
                        }
                      }
                    }
                  }
                  ((ea) this).field_T = new km(var11, var12);
                  tl.a((byte) -67, ((ea) this).field_T);
                  var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                  int discarded$27 = 28773;
                  fd.a();
                  ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                  return;
                }
              } else {
                L3: {
                  var5 = ((ea) this).field_eb;
                  if (!var5.equals((Object) (Object) ((ea) this).field_v)) {
                    ((ea) this).field_v = var5;
                    ((ea) this).f((byte) 105);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                super.a(param0, param1, -109, param3);
                var6 = ((ea) this).field_fb.a(21314);
                var17 = (mg) (Object) ((ea) this).field_n;
                var9 = param3 - -((ea) this).field_u;
                var10 = var17.a(0, param0, (mf) this) + (var17.a((mf) this, -23159).a((byte) 34) >> 1);
                if (in.field_g != var6) {
                  if (var6 != ek.field_d) {
                    if (var6 != qk.field_b) {
                      if (oa.field_a != var6) {
                        return;
                      } else {
                        var15 = uh.field_p[1];
                        var15.d(var9, -(var15.field_t >> 1) + var10, 256);
                        return;
                      }
                    } else {
                      var14 = uh.field_p[2];
                      var14.d(var9, -(var14.field_t >> 1) + var10, 256);
                      return;
                    }
                  } else {
                    var16 = uh.field_p[0];
                    var11 = var16.field_v << 1;
                    var12 = var16.field_u << 1;
                    if (null != ((ea) this).field_T) {
                      if (var11 <= ((ea) this).field_T.field_w) {
                        if (var12 > ((ea) this).field_T.field_t) {
                          ((ea) this).field_T = new km(var11, var12);
                          tl.a((byte) -67, ((ea) this).field_T);
                          var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                          int discarded$28 = 28773;
                          fd.a();
                          ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                          return;
                        } else {
                          tl.a((byte) -67, ((ea) this).field_T);
                          wb.b();
                          var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                          int discarded$29 = 28773;
                          fd.a();
                          ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                          return;
                        }
                      } else {
                        ((ea) this).field_T = new km(var11, var12);
                        tl.a((byte) -67, ((ea) this).field_T);
                        var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                        int discarded$30 = 28773;
                        fd.a();
                        ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                        return;
                      }
                    } else {
                      ((ea) this).field_T = new km(var11, var12);
                      tl.a((byte) -67, ((ea) this).field_T);
                      var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                      int discarded$31 = 28773;
                      fd.a();
                      ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                      return;
                    }
                  }
                } else {
                  var16 = uh.field_p[0];
                  var11 = var16.field_v << 1;
                  var12 = var16.field_u << 1;
                  if (null != ((ea) this).field_T) {
                    if (var11 <= ((ea) this).field_T.field_w) {
                      if (var12 <= ((ea) this).field_T.field_t) {
                        tl.a((byte) -67, ((ea) this).field_T);
                        wb.b();
                        var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                        int discarded$32 = 28773;
                        fd.a();
                        ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                        return;
                      } else {
                        ((ea) this).field_T = new km(var11, var12);
                        tl.a((byte) -67, ((ea) this).field_T);
                        var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                        int discarded$33 = 28773;
                        fd.a();
                        ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                        return;
                      }
                    } else {
                      ((ea) this).field_T = new km(var11, var12);
                      tl.a((byte) -67, ((ea) this).field_T);
                      var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                      int discarded$34 = 28773;
                      fd.a();
                      ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                      return;
                    }
                  } else {
                    ((ea) this).field_T = new km(var11, var12);
                    tl.a((byte) -67, ((ea) this).field_T);
                    var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                    int discarded$35 = 28773;
                    fd.a();
                    ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                    return;
                  }
                }
              }
            } else {
              L4: {
                var5 = cc.field_v;
                if (!var5.equals((Object) (Object) ((ea) this).field_v)) {
                  ((ea) this).field_v = var5;
                  ((ea) this).f((byte) 105);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                super.a(param0, param1, -109, param3);
                var6 = ((ea) this).field_fb.a(21314);
                var17 = (mg) (Object) ((ea) this).field_n;
                var9 = param3 - -((ea) this).field_u;
                var10 = var17.a(0, param0, (mf) this) + (var17.a((mf) this, -23159).a((byte) 34) >> 1);
                if (in.field_g == var6) {
                  break L5;
                } else {
                  if (var6 == ek.field_d) {
                    break L5;
                  } else {
                    if (var6 != qk.field_b) {
                      if (oa.field_a != var6) {
                        return;
                      } else {
                        var15 = uh.field_p[1];
                        var15.d(var9, -(var15.field_t >> 1) + var10, 256);
                        return;
                      }
                    } else {
                      var14 = uh.field_p[2];
                      var14.d(var9, -(var14.field_t >> 1) + var10, 256);
                      return;
                    }
                  }
                }
              }
              var16 = uh.field_p[0];
              var11 = var16.field_v << 1;
              var12 = var16.field_u << 1;
              if (null != ((ea) this).field_T) {
                if (var11 <= ((ea) this).field_T.field_w) {
                  if (var12 > ((ea) this).field_T.field_t) {
                    ((ea) this).field_T = new km(var11, var12);
                    tl.a((byte) -67, ((ea) this).field_T);
                    var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                    int discarded$36 = 28773;
                    fd.a();
                    ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                    return;
                  } else {
                    tl.a((byte) -67, ((ea) this).field_T);
                    wb.b();
                    var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                    int discarded$37 = 28773;
                    fd.a();
                    ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                    return;
                  }
                } else {
                  ((ea) this).field_T = new km(var11, var12);
                  tl.a((byte) -67, ((ea) this).field_T);
                  var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                  int discarded$38 = 28773;
                  fd.a();
                  ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                  return;
                }
              } else {
                ((ea) this).field_T = new km(var11, var12);
                tl.a((byte) -67, ((ea) this).field_T);
                var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                int discarded$39 = 28773;
                fd.a();
                ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                return;
              }
            }
          } else {
            L6: {
              var5 = cc.field_v;
              if (!var5.equals((Object) (Object) ((ea) this).field_v)) {
                ((ea) this).field_v = var5;
                ((ea) this).f((byte) 105);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              super.a(param0, param1, -109, param3);
              var6 = ((ea) this).field_fb.a(21314);
              var17 = (mg) (Object) ((ea) this).field_n;
              var9 = param3 - -((ea) this).field_u;
              var10 = var17.a(0, param0, (mf) this) + (var17.a((mf) this, -23159).a((byte) 34) >> 1);
              if (in.field_g == var6) {
                break L7;
              } else {
                if (var6 == ek.field_d) {
                  break L7;
                } else {
                  if (var6 != qk.field_b) {
                    if (oa.field_a != var6) {
                      return;
                    } else {
                      var15 = uh.field_p[1];
                      var15.d(var9, -(var15.field_t >> 1) + var10, 256);
                      return;
                    }
                  } else {
                    var14 = uh.field_p[2];
                    var14.d(var9, -(var14.field_t >> 1) + var10, 256);
                    return;
                  }
                }
              }
            }
            var16 = uh.field_p[0];
            var11 = var16.field_v << 1;
            var12 = var16.field_u << 1;
            if (null != ((ea) this).field_T) {
              if (var11 <= ((ea) this).field_T.field_w) {
                if (var12 > ((ea) this).field_T.field_t) {
                  ((ea) this).field_T = new km(var11, var12);
                  tl.a((byte) -67, ((ea) this).field_T);
                  var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                  int discarded$40 = 28773;
                  fd.a();
                  ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                  return;
                } else {
                  tl.a((byte) -67, ((ea) this).field_T);
                  wb.b();
                  var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                  int discarded$41 = 28773;
                  fd.a();
                  ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                  return;
                }
              } else {
                ((ea) this).field_T = new km(var11, var12);
                tl.a((byte) -67, ((ea) this).field_T);
                var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
                int discarded$42 = 28773;
                fd.a();
                ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
                return;
              }
            } else {
              ((ea) this).field_T = new km(var11, var12);
              tl.a((byte) -67, ((ea) this).field_T);
              var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((ea) this).field_db << 10, 4096);
              int discarded$43 = 28773;
              fd.a();
              ((ea) this).field_T.d(-(var16.field_v >> 1) + var9, -var16.field_u + var10, 256);
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

    final static int h() {
        return si.field_o;
    }

    ea(vb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (jm) (Object) je.d());
        int discarded$0 = 0;
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
