/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    static boolean field_f;
    static int field_a;
    private lc field_b;
    static String field_d;
    private int field_g;
    private hs field_h;
    static int field_e;
    private int field_c;

    final static String a(int param0, CharSequence[] param1) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        String stackOut_28_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (0 != param0) {
              if (param0 == 1) {
                var10 = param1[0];
                var4 = var10;
                if (var4 != null) {
                  stackOut_9_0 = ((Object) (Object) var10).toString();
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                var4_int = param0;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    L2: {
                      var6 = new StringBuilder(var5);
                      var7 = 0;
                      if (var4_int <= var7) {
                        break L2;
                      } else {
                        L3: {
                          var8 = param1[var7];
                          if (var8 == null) {
                            StringBuilder discarded$2 = var6.append("null");
                            var7++;
                            break L3;
                          } else {
                            StringBuilder discarded$3 = var6.append(var8);
                            var7++;
                            break L3;
                          }
                        }
                        var7++;
                        var7++;
                        break L2;
                      }
                    }
                    stackOut_28_0 = var6.toString();
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  } else {
                    L4: {
                      var7_ref_CharSequence = param1[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        var6_int++;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        var6_int++;
                        var6_int++;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4_ref;
            stackOut_30_1 = new StringBuilder().append("gq.C(").append(param0).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + 21530 + 44 + 0 + 41);
        }
        return stackIn_29_0;
    }

    final void a(byte param0, int param1) {
        he var3 = null;
        mb var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var3 = (he) (Object) ((gq) this).field_h.a(-115);
        L0: while (true) {
          if (var3 == null) {
            if (param0 > -33) {
              field_a = 98;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              if (!var3.e(0)) {
                long fieldTemp$4 = var3.field_i + 1L;
                var3.field_i = var3.field_i + 1L;
                if (~fieldTemp$4 < ~(long)param1) {
                  var4 = new mb(var3.a((byte) 74), var3.field_p);
                  ((gq) this).field_b.a(-1, (wf) (Object) var4, var3.field_b);
                  ns.a((wt) (Object) var4, -30575, (wt) (Object) var3);
                  var3.c(-125);
                  var3.d(-115);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                if (var3.a((byte) 74) != null) {
                  break L1;
                } else {
                  var3.c(-128);
                  var3.d(-126);
                  ((gq) this).field_g = ((gq) this).field_g + var3.field_p;
                  break L1;
                }
              }
            }
            var3 = (he) (Object) ((gq) this).field_h.a(true);
            continue L0;
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = AceOfSkies.field_G ? 1 : 0;
        if (param0 <= 95) {
          gq.a(-5);
          if (param7 > param3) {
            if (param7 >= param5) {
              if (param3 >= param5) {
                tm.a(param2, param7, param4, 14250, param1, vp.field_j, param5, param3, param6);
                return;
              } else {
                tm.a(param1, param7, param4, 14250, param2, vp.field_j, param3, param5, param6);
                return;
              }
            } else {
              tm.a(param4, param5, param1, 14250, param2, vp.field_j, param3, param7, param6);
              return;
            }
          } else {
            if (param3 >= param5) {
              if (param7 >= param5) {
                tm.a(param4, param3, param2, 14250, param1, vp.field_j, param5, param7, param6);
                return;
              } else {
                tm.a(param1, param3, param2, 14250, param4, vp.field_j, param7, param5, param6);
                return;
              }
            } else {
              tm.a(param2, param5, param1, 14250, param4, vp.field_j, param7, param3, param6);
              return;
            }
          }
        } else {
          if (param7 > param3) {
            if (param7 >= param5) {
              if (param3 >= param5) {
                tm.a(param2, param7, param4, 14250, param1, vp.field_j, param5, param3, param6);
                return;
              } else {
                tm.a(param1, param7, param4, 14250, param2, vp.field_j, param3, param5, param6);
                return;
              }
            } else {
              tm.a(param4, param5, param1, 14250, param2, vp.field_j, param3, param7, param6);
              return;
            }
          } else {
            if (param3 >= param5) {
              if (param7 >= param5) {
                tm.a(param4, param3, param2, 14250, param1, vp.field_j, param5, param7, param6);
                return;
              } else {
                tm.a(param1, param3, param2, 14250, param4, vp.field_j, param7, param5, param6);
                return;
              }
            } else {
              tm.a(param2, param5, param1, 14250, param4, vp.field_j, param7, param3, param6);
              return;
            }
          }
        }
    }

    private final void a(int param0, he param1) {
        RuntimeException var3 = null;
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
            if (param1 == null) {
              break L0;
            } else {
              param1.c(-123);
              param1.d(-117);
              ((gq) this).field_g = ((gq) this).field_g + param1.field_p;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("gq.F(").append(6646).append(44);
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        qj var6 = null;
        he var7 = null;
        var7 = (he) (Object) ((gq) this).field_b.a(param0, (byte) 106);
        if (var7 != null) {
          var5 = var7.a((byte) 74);
          if (param1 < -90) {
            if (var5 != null) {
              if (var7.e(0)) {
                var6 = new qj(var5, var7.field_p);
                ((gq) this).field_b.a(-1, (wf) (Object) var6, var7.field_b);
                ((gq) this).field_h.a((wt) (Object) var6, (byte) -74);
                ((he) (Object) var6).field_i = 0L;
                var7.c(-128);
                var7.d(-119);
                return var5;
              } else {
                ((gq) this).field_h.a((wt) (Object) var7, (byte) 85);
                var7.field_i = 0L;
                return var5;
              }
            } else {
              var7.c(-124);
              var7.d(-114);
              ((gq) this).field_g = ((gq) this).field_g + var7.field_p;
              return null;
            }
          } else {
            ((gq) this).field_g = 32;
            if (var5 != null) {
              if (var7.e(0)) {
                var6 = new qj(var5, var7.field_p);
                ((gq) this).field_b.a(-1, (wf) (Object) var6, var7.field_b);
                ((gq) this).field_h.a((wt) (Object) var6, (byte) -74);
                ((he) (Object) var6).field_i = 0L;
                var7.c(-128);
                var7.d(-119);
                return var5;
              } else {
                ((gq) this).field_h.a((wt) (Object) var7, (byte) 85);
                var7.field_i = 0L;
                return var5;
              }
            } else {
              var7.c(-124);
              var7.d(-114);
              ((gq) this).field_g = ((gq) this).field_g + var7.field_p;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        if (!param0) {
            gq.a(false, 19, 116);
            ik.field_k = param1;
            rs.field_v = param2;
            return;
        }
        ik.field_k = param1;
        rs.field_v = param2;
    }

    gq(int param0) {
        this(param0, param0);
    }

    final static int a(hd param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          if (param0 == wo.field_n) {
            stackOut_17_0 = 6407;
            stackIn_18_0 = stackOut_17_0;
            return stackIn_18_0;
          } else {
            if (param0 != lc.field_g) {
              if (ro.field_o != param0) {
                if (wf.field_d == param0) {
                  stackOut_15_0 = 6409;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  if (param0 != hh.field_c) {
                    if (aj.field_r == param0) {
                      stackOut_13_0 = 6145;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      throw new IllegalStateException();
                    }
                  } else {
                    stackOut_9_0 = 6410;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              } else {
                stackOut_5_0 = 6406;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = 6408;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("gq.G(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L0;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L0;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + -29824 + 41);
        }
    }

    final Object b(int param0) {
        he var2 = null;
        Object var3 = null;
        he var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var2 = (he) (Object) ((gq) this).field_b.a(param0 + -6533);
        L0: while (true) {
          if (var2 == null) {
            if (param0 == 6408) {
              return null;
            } else {
              field_a = 59;
              return null;
            }
          } else {
            var3 = var2.a((byte) 74);
            if (var3 == null) {
              var4 = var2;
              var2 = (he) (Object) ((gq) this).field_b.a(-64);
              var4.c(-125);
              var4.d(-127);
              ((gq) this).field_g = ((gq) this).field_g + var4.field_p;
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    final void a(long param0, Object param1, int param2) {
        try {
            if (param2 > -30) {
                Object var6 = null;
                this.a(-60L, (byte) -4, -64, (Object) null);
            }
            this.a(param0, (byte) 71, 1, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "gq.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final Object a(byte param0) {
        he var2 = null;
        Object var3 = null;
        he var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var2 = (he) (Object) ((gq) this).field_b.b(param0 ^ -16);
        L0: while (true) {
          if (var2 == null) {
            if (param0 == -16) {
              return null;
            } else {
              return null;
            }
          } else {
            var3 = var2.a((byte) 74);
            if (var3 == null) {
              var4 = var2;
              var2 = (he) (Object) ((gq) this).field_b.a(-118);
              var4.c(-126);
              var4.d(-116);
              ((gq) this).field_g = ((gq) this).field_g + var4.field_p;
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    private final void a(int param0, long param1) {
        he var4 = (he) (Object) ((gq) this).field_b.a(param1, (byte) 91);
        this.a(6646, var4);
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 6408) {
            gq.a((byte) 93, -113, 71, 39, 20, -85, -2, -11);
        }
    }

    private final void a(long param0, byte param1, int param2, Object param3) {
        he var9 = null;
        qj var6 = null;
        int var8 = AceOfSkies.field_G ? 1 : 0;
        try {
            if (!(param2 <= ((gq) this).field_c)) {
                throw new IllegalStateException();
            }
            this.a(-111, param0);
            ((gq) this).field_g = ((gq) this).field_g - param2;
            while (((gq) this).field_g < 0) {
                var9 = (he) (Object) ((gq) this).field_h.b(false);
                this.a(6646, var9);
            }
            var6 = new qj(param3, param2);
            int var7 = -16 / ((-52 - param1) / 34);
            ((gq) this).field_b.a(-1, (wf) (Object) var6, param0);
            ((gq) this).field_h.a((wt) (Object) var6, (byte) 64);
            ((he) (Object) var6).field_i = 0L;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "gq.K(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private gq(int param0, int param1) {
        int var3 = 0;
        ((gq) this).field_h = new hs();
        ((gq) this).field_g = param0;
        ((gq) this).field_c = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((gq) this).field_b = new lc(var3);
              return;
            }
          } else {
            ((gq) this).field_b = new lc(var3);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_e = 0;
    }
}
