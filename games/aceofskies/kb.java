/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends vq {
    private ll field_F;
    static ej field_C;
    private String field_A;
    private int field_E;
    private sp field_B;
    static vd[] field_D;

    public static void h(int param0) {
        field_C = null;
        if (param0 != 1927884356) {
            field_C = null;
            field_D = null;
            return;
        }
        field_D = null;
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        RuntimeException runtimeException = null;
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
              ((kb) this).field_E = ((kb) this).field_E + 1;
              super.a((byte) 42, param1, param2, param3);
              if (param0 >= 13) {
                break L1;
              } else {
                ((kb) this).field_B = null;
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
            stackOut_3_1 = new StringBuilder().append("kb.S(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(int param0) {
        if (param0 != -1903710079) {
            return null;
        }
        return rs.field_x;
    }

    kb(sp param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ir) (Object) pe.a());
        int discarded$0 = -63;
        try {
            ((kb) this).field_B = param0;
            ((kb) this).field_A = param1;
            ((kb) this).a(param5, param2, param3, param4, (byte) 123);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "kb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(ea param0, byte param1) {
        RuntimeException var3 = null;
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
            if (param1 == -42) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((kb) this).field_E = -90;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("kb.U(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        String var5 = null;
        pt var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var17 = null;
        Object var18 = null;
        ll var19 = null;
        ll var20 = null;
        ll var21 = null;
        Object var22 = null;
        ll var23 = null;
        ll var24 = null;
        ll var25 = null;
        Object var26 = null;
        ll var27 = null;
        ll var28 = null;
        ll var29 = null;
        et var30 = null;
        et var31 = null;
        et var32 = null;
        var18 = null;
        var22 = null;
        var26 = null;
        var13 = AceOfSkies.field_G ? 1 : 0;
        var6 = ((kb) this).field_B.b(true);
        if (jc.field_Pc != var6) {
          L0: {
            if (ce.field_t != var6) {
              var5 = ((kb) this).field_B.a(true);
              if (var5 == null) {
                var5 = ((kb) this).field_A;
                break L0;
              } else {
                break L0;
              }
            } else {
              var5 = uu.field_g;
              break L0;
            }
          }
          if (!var5.equals((Object) (Object) ((kb) this).field_f)) {
            ((kb) this).field_f = var5;
            ((kb) this).a((byte) -67);
            super.a((byte) 107, param1, param2, param3);
            var6 = ((kb) this).field_B.b(true);
            var32 = (et) (Object) ((kb) this).field_e;
            var9 = param3 - -((kb) this).field_p;
            var10 = var32.a(param2, false, (ea) this) - -(var32.a((byte) 86, (ea) this).a(0) >> 1);
            if (param0 > 64) {
              L1: {
                if (jc.field_Pc == var6) {
                  break L1;
                } else {
                  if (var6 != ce.field_t) {
                    if (var6 != bt.field_a) {
                      if (fd.field_a == var6) {
                        var29 = gu.field_c[1];
                        var29.d(var9, -(var29.field_n >> 1) + var10, 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var28 = gu.field_c[2];
                      var28.d(var9, -(var28.field_n >> 1) + var10, 256);
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var27 = gu.field_c[0];
              var11 = var27.field_v << 1;
              var12 = var27.field_q << 1;
              if (((kb) this).field_F != null) {
                if (((kb) this).field_F.field_r >= var11) {
                  if (((kb) this).field_F.field_n >= var12) {
                    int discarded$24 = -14492;
                    cm.a(((kb) this).field_F);
                    vp.a();
                    var27.a(112, 144, var27.field_v << 4, var27.field_q << 4, -((kb) this).field_E << 10, 4096);
                    int discarded$25 = 2765;
                    sl.c();
                    ((kb) this).field_F.d(var9 - (var27.field_v >> 1), -var27.field_q + var10, 256);
                    return;
                  } else {
                    ((kb) this).field_F = new ll(var11, var12);
                    int discarded$26 = -14492;
                    cm.a(((kb) this).field_F);
                    var27.a(112, 144, var27.field_v << 4, var27.field_q << 4, -((kb) this).field_E << 10, 4096);
                    int discarded$27 = 2765;
                    sl.c();
                    ((kb) this).field_F.d(var9 - (var27.field_v >> 1), -var27.field_q + var10, 256);
                    return;
                  }
                } else {
                  ((kb) this).field_F = new ll(var11, var12);
                  int discarded$28 = -14492;
                  cm.a(((kb) this).field_F);
                  var27.a(112, 144, var27.field_v << 4, var27.field_q << 4, -((kb) this).field_E << 10, 4096);
                  int discarded$29 = 2765;
                  sl.c();
                  ((kb) this).field_F.d(var9 - (var27.field_v >> 1), -var27.field_q + var10, 256);
                  return;
                }
              } else {
                ((kb) this).field_F = new ll(var11, var12);
                int discarded$30 = -14492;
                cm.a(((kb) this).field_F);
                var27.a(112, 144, var27.field_v << 4, var27.field_q << 4, -((kb) this).field_E << 10, 4096);
                int discarded$31 = 2765;
                sl.c();
                ((kb) this).field_F.d(var9 - (var27.field_v >> 1), -var27.field_q + var10, 256);
                return;
              }
            } else {
              return;
            }
          } else {
            super.a((byte) 107, param1, param2, param3);
            var6 = ((kb) this).field_B.b(true);
            var31 = (et) (Object) ((kb) this).field_e;
            var9 = param3 - -((kb) this).field_p;
            var10 = var31.a(param2, false, (ea) this) - -(var31.a((byte) 86, (ea) this).a(0) >> 1);
            if (param0 > 64) {
              L2: {
                if (jc.field_Pc == var6) {
                  break L2;
                } else {
                  if (var6 != ce.field_t) {
                    if (var6 != bt.field_a) {
                      if (fd.field_a != var6) {
                        return;
                      } else {
                        var25 = gu.field_c[1];
                        var25.d(var9, -(var25.field_n >> 1) + var10, 256);
                        return;
                      }
                    } else {
                      var24 = gu.field_c[2];
                      var24.d(var9, -(var24.field_n >> 1) + var10, 256);
                      return;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var23 = gu.field_c[0];
              var11 = var23.field_v << 1;
              var12 = var23.field_q << 1;
              if (((kb) this).field_F != null) {
                if (((kb) this).field_F.field_r >= var11) {
                  if (((kb) this).field_F.field_n < var12) {
                    ((kb) this).field_F = new ll(var11, var12);
                    int discarded$32 = -14492;
                    cm.a(((kb) this).field_F);
                    var23.a(112, 144, var23.field_v << 4, var23.field_q << 4, -((kb) this).field_E << 10, 4096);
                    int discarded$33 = 2765;
                    sl.c();
                    ((kb) this).field_F.d(var9 - (var23.field_v >> 1), -var23.field_q + var10, 256);
                    return;
                  } else {
                    int discarded$34 = -14492;
                    cm.a(((kb) this).field_F);
                    vp.a();
                    var23.a(112, 144, var23.field_v << 4, var23.field_q << 4, -((kb) this).field_E << 10, 4096);
                    int discarded$35 = 2765;
                    sl.c();
                    ((kb) this).field_F.d(var9 - (var23.field_v >> 1), -var23.field_q + var10, 256);
                    return;
                  }
                } else {
                  ((kb) this).field_F = new ll(var11, var12);
                  int discarded$36 = -14492;
                  cm.a(((kb) this).field_F);
                  var23.a(112, 144, var23.field_v << 4, var23.field_q << 4, -((kb) this).field_E << 10, 4096);
                  int discarded$37 = 2765;
                  sl.c();
                  ((kb) this).field_F.d(var9 - (var23.field_v >> 1), -var23.field_q + var10, 256);
                  return;
                }
              } else {
                ((kb) this).field_F = new ll(var11, var12);
                int discarded$38 = -14492;
                cm.a(((kb) this).field_F);
                var23.a(112, 144, var23.field_v << 4, var23.field_q << 4, -((kb) this).field_E << 10, 4096);
                int discarded$39 = 2765;
                sl.c();
                ((kb) this).field_F.d(var9 - (var23.field_v >> 1), -var23.field_q + var10, 256);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L3: {
            var17 = uu.field_g;
            if (var17.equals((Object) (Object) ((kb) this).field_f)) {
              break L3;
            } else {
              ((kb) this).field_f = var17;
              ((kb) this).a((byte) -67);
              break L3;
            }
          }
          super.a((byte) 107, param1, param2, param3);
          var6 = ((kb) this).field_B.b(true);
          var30 = (et) (Object) ((kb) this).field_e;
          var9 = param3 - -((kb) this).field_p;
          var10 = var30.a(param2, false, (ea) this) - -(var30.a((byte) 86, (ea) this).a(0) >> 1);
          if (param0 > 64) {
            L4: {
              if (jc.field_Pc == var6) {
                break L4;
              } else {
                if (var6 != ce.field_t) {
                  if (var6 != bt.field_a) {
                    if (fd.field_a != var6) {
                      return;
                    } else {
                      var21 = gu.field_c[1];
                      var21.d(var9, -(var21.field_n >> 1) + var10, 256);
                      return;
                    }
                  } else {
                    var20 = gu.field_c[2];
                    var20.d(var9, -(var20.field_n >> 1) + var10, 256);
                    return;
                  }
                } else {
                  break L4;
                }
              }
            }
            var19 = gu.field_c[0];
            var11 = var19.field_v << 1;
            var12 = var19.field_q << 1;
            if (((kb) this).field_F != null) {
              if (((kb) this).field_F.field_r >= var11) {
                if (((kb) this).field_F.field_n < var12) {
                  ((kb) this).field_F = new ll(var11, var12);
                  int discarded$40 = -14492;
                  cm.a(((kb) this).field_F);
                  var19.a(112, 144, var19.field_v << 4, var19.field_q << 4, -((kb) this).field_E << 10, 4096);
                  int discarded$41 = 2765;
                  sl.c();
                  ((kb) this).field_F.d(var9 - (var19.field_v >> 1), -var19.field_q + var10, 256);
                  return;
                } else {
                  int discarded$42 = -14492;
                  cm.a(((kb) this).field_F);
                  vp.a();
                  var19.a(112, 144, var19.field_v << 4, var19.field_q << 4, -((kb) this).field_E << 10, 4096);
                  int discarded$43 = 2765;
                  sl.c();
                  ((kb) this).field_F.d(var9 - (var19.field_v >> 1), -var19.field_q + var10, 256);
                  return;
                }
              } else {
                ((kb) this).field_F = new ll(var11, var12);
                int discarded$44 = -14492;
                cm.a(((kb) this).field_F);
                var19.a(112, 144, var19.field_v << 4, var19.field_q << 4, -((kb) this).field_E << 10, 4096);
                int discarded$45 = 2765;
                sl.c();
                ((kb) this).field_F.d(var9 - (var19.field_v >> 1), -var19.field_q + var10, 256);
                return;
              }
            } else {
              ((kb) this).field_F = new ll(var11, var12);
              int discarded$46 = -14492;
              cm.a(((kb) this).field_F);
              var19.a(112, 144, var19.field_v << 4, var19.field_q << 4, -((kb) this).field_E << 10, 4096);
              int discarded$47 = 2765;
              sl.c();
              ((kb) this).field_F.d(var9 - (var19.field_v >> 1), -var19.field_q + var10, 256);
              return;
            }
          } else {
            return;
          }
        }
    }

    final String c(byte param0) {
        if (param0 <= -41) {
            return null;
        }
        String discarded$0 = kb.a(106);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new ej(9, 0, 4, 1);
    }
}
