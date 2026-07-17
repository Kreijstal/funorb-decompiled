/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends pn {
    static int field_Z;
    static String[] field_U;
    private int field_Y;
    private of field_J;
    static String field_X;
    static String field_V;
    private er field_bb;
    static fe field_W;
    static long field_cb;
    private String field_ab;
    static og field_T;

    final String a(boolean param0) {
        if (!param0) {
            return null;
        }
        qe.h(-124);
        return null;
    }

    public static void h(int param0) {
        field_W = null;
        field_U = null;
        field_X = null;
        field_V = null;
        int var1 = 118 / ((11 - param0) / 39);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        String var5 = null;
        ba var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var17 = null;
        Object var18 = null;
        er var19 = null;
        er var20 = null;
        er var21 = null;
        er var22 = null;
        String var23 = null;
        Object var24 = null;
        er var25 = null;
        er var26 = null;
        er var27 = null;
        er var28 = null;
        Object var29 = null;
        er var30 = null;
        er var31 = null;
        er var32 = null;
        er var33 = null;
        qa var34 = null;
        qa var35 = null;
        qa var36 = null;
        var18 = null;
        var24 = null;
        var29 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        var6 = ((qe) this).field_J.a(-23996);
        if (var6 != tk.field_n) {
          if (var6 != dj.field_c) {
            L0: {
              var5 = ((qe) this).field_J.d(-27183);
              if (var5 == null) {
                var5 = ((qe) this).field_ab;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (!var5.equals((Object) (Object) ((qe) this).field_w)) {
                ((qe) this).field_w = var5;
                ((qe) this).e((byte) -118);
                break L1;
              } else {
                break L1;
              }
            }
            super.a(param0, param1, param2, param3);
            var6 = ((qe) this).field_J.a(-23996);
            var36 = (qa) (Object) ((qe) this).field_B;
            var9 = ((qe) this).field_o + param2;
            var10 = var36.a((iq) this, 1, param3) - -(var36.b((iq) this, 110).b((byte) 91) >> 1);
            if (tk.field_n == var6) {
              var31 = jn.field_b[0];
              var11 = var31.field_x << 1;
              var12 = var31.field_B << 1;
              if (null != ((qe) this).field_bb) {
                if (((qe) this).field_bb.field_y >= var11) {
                  if (var12 > ((qe) this).field_bb.field_t) {
                    ((qe) this).field_bb = new er(var11, var12);
                    lq.a(((qe) this).field_bb, (byte) -94);
                    var31.a(112, 144, var31.field_x << 4, var31.field_B << 4, -((qe) this).field_Y << 10, 4096);
                    ln.d(-28558);
                    ((qe) this).field_bb.d(-(var31.field_x >> 1) + var9, -var31.field_B + var10, 256);
                    return;
                  } else {
                    lq.a(((qe) this).field_bb, (byte) -94);
                    bi.c();
                    var31.a(112, 144, var31.field_x << 4, var31.field_B << 4, -((qe) this).field_Y << 10, 4096);
                    ln.d(-28558);
                    ((qe) this).field_bb.d(-(var31.field_x >> 1) + var9, -var31.field_B + var10, 256);
                    return;
                  }
                } else {
                  ((qe) this).field_bb = new er(var11, var12);
                  lq.a(((qe) this).field_bb, (byte) -94);
                  var31.a(112, 144, var31.field_x << 4, var31.field_B << 4, -((qe) this).field_Y << 10, 4096);
                  ln.d(-28558);
                  ((qe) this).field_bb.d(-(var31.field_x >> 1) + var9, -var31.field_B + var10, 256);
                  return;
                }
              } else {
                ((qe) this).field_bb = new er(var11, var12);
                lq.a(((qe) this).field_bb, (byte) -94);
                var31.a(112, 144, var31.field_x << 4, var31.field_B << 4, -((qe) this).field_Y << 10, 4096);
                ln.d(-28558);
                ((qe) this).field_bb.d(-(var31.field_x >> 1) + var9, -var31.field_B + var10, 256);
                return;
              }
            } else {
              if (dj.field_c != var6) {
                if (ir.field_a != var6) {
                  if (qm.field_G == var6) {
                    var32 = jn.field_b[1];
                    var32.d(var9, var10 - (var32.field_t >> 1), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var33 = jn.field_b[2];
                  var33.d(var9, var10 - (var33.field_t >> 1), 256);
                  return;
                }
              } else {
                L2: {
                  L3: {
                    var30 = jn.field_b[0];
                    var11 = var30.field_x << 1;
                    var12 = var30.field_B << 1;
                    if (null == ((qe) this).field_bb) {
                      break L3;
                    } else {
                      if (((qe) this).field_bb.field_y < var11) {
                        break L3;
                      } else {
                        if (var12 > ((qe) this).field_bb.field_t) {
                          break L3;
                        } else {
                          lq.a(((qe) this).field_bb, (byte) -94);
                          bi.c();
                          break L2;
                        }
                      }
                    }
                  }
                  ((qe) this).field_bb = new er(var11, var12);
                  lq.a(((qe) this).field_bb, (byte) -94);
                  break L2;
                }
                var30.a(112, 144, var30.field_x << 4, var30.field_B << 4, -((qe) this).field_Y << 10, 4096);
                ln.d(-28558);
                ((qe) this).field_bb.d(-(var30.field_x >> 1) + var9, -var30.field_B + var10, 256);
                return;
              }
            }
          } else {
            L4: {
              var23 = lr.field_L;
              if (!var23.equals((Object) (Object) ((qe) this).field_w)) {
                ((qe) this).field_w = var23;
                ((qe) this).e((byte) -118);
                break L4;
              } else {
                break L4;
              }
            }
            super.a(param0, param1, param2, param3);
            var6 = ((qe) this).field_J.a(-23996);
            var35 = (qa) (Object) ((qe) this).field_B;
            var9 = ((qe) this).field_o + param2;
            var10 = var35.a((iq) this, 1, param3) - -(var35.b((iq) this, 110).b((byte) 91) >> 1);
            if (tk.field_n == var6) {
              var26 = jn.field_b[0];
              var11 = var26.field_x << 1;
              var12 = var26.field_B << 1;
              if (null != ((qe) this).field_bb) {
                if (((qe) this).field_bb.field_y >= var11) {
                  if (var12 <= ((qe) this).field_bb.field_t) {
                    lq.a(((qe) this).field_bb, (byte) -94);
                    bi.c();
                    var26.a(112, 144, var26.field_x << 4, var26.field_B << 4, -((qe) this).field_Y << 10, 4096);
                    ln.d(-28558);
                    ((qe) this).field_bb.d(-(var26.field_x >> 1) + var9, -var26.field_B + var10, 256);
                    return;
                  } else {
                    ((qe) this).field_bb = new er(var11, var12);
                    lq.a(((qe) this).field_bb, (byte) -94);
                    var26.a(112, 144, var26.field_x << 4, var26.field_B << 4, -((qe) this).field_Y << 10, 4096);
                    ln.d(-28558);
                    ((qe) this).field_bb.d(-(var26.field_x >> 1) + var9, -var26.field_B + var10, 256);
                    return;
                  }
                } else {
                  ((qe) this).field_bb = new er(var11, var12);
                  lq.a(((qe) this).field_bb, (byte) -94);
                  var26.a(112, 144, var26.field_x << 4, var26.field_B << 4, -((qe) this).field_Y << 10, 4096);
                  ln.d(-28558);
                  ((qe) this).field_bb.d(-(var26.field_x >> 1) + var9, -var26.field_B + var10, 256);
                  return;
                }
              } else {
                ((qe) this).field_bb = new er(var11, var12);
                lq.a(((qe) this).field_bb, (byte) -94);
                var26.a(112, 144, var26.field_x << 4, var26.field_B << 4, -((qe) this).field_Y << 10, 4096);
                ln.d(-28558);
                ((qe) this).field_bb.d(-(var26.field_x >> 1) + var9, -var26.field_B + var10, 256);
                return;
              }
            } else {
              if (dj.field_c != var6) {
                if (ir.field_a != var6) {
                  if (qm.field_G == var6) {
                    var27 = jn.field_b[1];
                    var27.d(var9, var10 - (var27.field_t >> 1), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var28 = jn.field_b[2];
                  var28.d(var9, var10 - (var28.field_t >> 1), 256);
                  return;
                }
              } else {
                L5: {
                  L6: {
                    var25 = jn.field_b[0];
                    var11 = var25.field_x << 1;
                    var12 = var25.field_B << 1;
                    if (null == ((qe) this).field_bb) {
                      break L6;
                    } else {
                      if (((qe) this).field_bb.field_y < var11) {
                        break L6;
                      } else {
                        if (var12 > ((qe) this).field_bb.field_t) {
                          break L6;
                        } else {
                          lq.a(((qe) this).field_bb, (byte) -94);
                          bi.c();
                          break L5;
                        }
                      }
                    }
                  }
                  ((qe) this).field_bb = new er(var11, var12);
                  lq.a(((qe) this).field_bb, (byte) -94);
                  break L5;
                }
                var25.a(112, 144, var25.field_x << 4, var25.field_B << 4, -((qe) this).field_Y << 10, 4096);
                ln.d(-28558);
                ((qe) this).field_bb.d(-(var25.field_x >> 1) + var9, -var25.field_B + var10, 256);
                return;
              }
            }
          }
        } else {
          L7: {
            var17 = lr.field_L;
            if (!var17.equals((Object) (Object) ((qe) this).field_w)) {
              ((qe) this).field_w = var17;
              ((qe) this).e((byte) -118);
              break L7;
            } else {
              break L7;
            }
          }
          super.a(param0, param1, param2, param3);
          var6 = ((qe) this).field_J.a(-23996);
          var34 = (qa) (Object) ((qe) this).field_B;
          var9 = ((qe) this).field_o + param2;
          var10 = var34.a((iq) this, 1, param3) - -(var34.b((iq) this, 110).b((byte) 91) >> 1);
          if (tk.field_n == var6) {
            var20 = jn.field_b[0];
            var11 = var20.field_x << 1;
            var12 = var20.field_B << 1;
            if (null != ((qe) this).field_bb) {
              if (((qe) this).field_bb.field_y >= var11) {
                if (var12 <= ((qe) this).field_bb.field_t) {
                  lq.a(((qe) this).field_bb, (byte) -94);
                  bi.c();
                  var20.a(112, 144, var20.field_x << 4, var20.field_B << 4, -((qe) this).field_Y << 10, 4096);
                  ln.d(-28558);
                  ((qe) this).field_bb.d(-(var20.field_x >> 1) + var9, -var20.field_B + var10, 256);
                  return;
                } else {
                  ((qe) this).field_bb = new er(var11, var12);
                  lq.a(((qe) this).field_bb, (byte) -94);
                  var20.a(112, 144, var20.field_x << 4, var20.field_B << 4, -((qe) this).field_Y << 10, 4096);
                  ln.d(-28558);
                  ((qe) this).field_bb.d(-(var20.field_x >> 1) + var9, -var20.field_B + var10, 256);
                  return;
                }
              } else {
                ((qe) this).field_bb = new er(var11, var12);
                lq.a(((qe) this).field_bb, (byte) -94);
                var20.a(112, 144, var20.field_x << 4, var20.field_B << 4, -((qe) this).field_Y << 10, 4096);
                ln.d(-28558);
                ((qe) this).field_bb.d(-(var20.field_x >> 1) + var9, -var20.field_B + var10, 256);
                return;
              }
            } else {
              ((qe) this).field_bb = new er(var11, var12);
              lq.a(((qe) this).field_bb, (byte) -94);
              var20.a(112, 144, var20.field_x << 4, var20.field_B << 4, -((qe) this).field_Y << 10, 4096);
              ln.d(-28558);
              ((qe) this).field_bb.d(-(var20.field_x >> 1) + var9, -var20.field_B + var10, 256);
              return;
            }
          } else {
            if (dj.field_c != var6) {
              if (ir.field_a != var6) {
                if (qm.field_G != var6) {
                  return;
                } else {
                  var21 = jn.field_b[1];
                  var21.d(var9, var10 - (var21.field_t >> 1), 256);
                  return;
                }
              } else {
                var22 = jn.field_b[2];
                var22.d(var9, var10 - (var22.field_t >> 1), 256);
                return;
              }
            } else {
              L8: {
                L9: {
                  var19 = jn.field_b[0];
                  var11 = var19.field_x << 1;
                  var12 = var19.field_B << 1;
                  if (null == ((qe) this).field_bb) {
                    break L9;
                  } else {
                    if (((qe) this).field_bb.field_y < var11) {
                      break L9;
                    } else {
                      if (var12 > ((qe) this).field_bb.field_t) {
                        break L9;
                      } else {
                        lq.a(((qe) this).field_bb, (byte) -94);
                        bi.c();
                        break L8;
                      }
                    }
                  }
                }
                ((qe) this).field_bb = new er(var11, var12);
                lq.a(((qe) this).field_bb, (byte) -94);
                break L8;
              }
              var19.a(112, 144, var19.field_x << 4, var19.field_B << 4, -((qe) this).field_Y << 10, 4096);
              ln.d(-28558);
              ((qe) this).field_bb.d(-(var19.field_x >> 1) + var9, -var19.field_B + var10, 256);
              return;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        try {
            ((qe) this).field_Y = ((qe) this).field_Y + 1;
            if (param0 < 6) {
                ((qe) this).field_bb = null;
            }
            super.a((byte) 25, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "qe.E(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    qe(of param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ur) (Object) ni.a(false));
        try {
            ((qe) this).field_ab = param1;
            ((qe) this).field_J = param0;
            ((qe) this).a(false, param2, param3, param5, param4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "qe.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final boolean a(byte param0, iq param1) {
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
            if (param0 == 116) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((qe) this).field_ab = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("qe.DA(").append(param0).append(44);
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
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static ch a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        ch stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ch stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (bf.field_b != um.field_F) {
              L1: {
                if (param1 >= 42) {
                  break L1;
                } else {
                  field_Z = 3;
                  break L1;
                }
              }
              L2: {
                if (oe.field_qb != um.field_F) {
                  break L2;
                } else {
                  if (param0.equals((Object) (Object) uk.field_u)) {
                    um.field_F = l.field_a;
                    stackOut_10_0 = rf.field_p;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              uk.field_u = param0;
              rf.field_p = null;
              um.field_F = bf.field_b;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (ch) (Object) stackIn_9_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ch) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("qe.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "There are no valid types of game that match your preferences.";
        field_T = null;
    }
}
