/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fb {
    al field_o;
    static int field_f;
    static int field_n;
    static int field_b;
    static ej field_d;
    static String[] field_e;
    al field_q;
    static pb field_h;
    al field_j;
    al field_k;
    ka field_c;
    int field_m;
    long field_l;
    volatile int field_g;
    ka field_a;
    byte field_p;
    volatile int field_i;
    ph field_r;

    final int b(byte param0) {
        if (param0 > -77) {
            boolean discarded$0 = ((fb) this).e(-118);
        }
        return ((fb) this).field_o.b((byte) -7) + ((fb) this).field_q.b((byte) -7);
    }

    abstract void a(byte param0);

    abstract boolean f(int param0);

    final static ml a(int param0, boolean param1, String param2) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        ml stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_0_0 = null;
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
            var3 = new ml(false);
            var3.field_g = param0;
            var3.field_e = param2;
            stackOut_0_0 = (ml) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("fb.O(").append(param0).append(',').append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        field_h = null;
    }

    final int a(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((fb) this).f(72);
        }
        return ((fb) this).field_j.b((byte) -7) + ((fb) this).field_k.b((byte) -7);
    }

    final static void a(int param0, byte param1, ta param2) {
        ha var3 = pg.field_fb;
        var3.f(7, 950);
        var3.a(false, param2.field_o);
        try {
            var3.a(false, param2.field_t);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "fb.R(" + 7 + ',' + -118 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean d(int param0) {
        if (param0 != 2) {
            ((fb) this).field_k = null;
        }
        return 20 <= ((fb) this).b((byte) -87) ? true : false;
    }

    final ph a(byte param0, int param1, boolean param2, int param3, boolean param4) {
        long var6 = ((long)param3 << 32) + (long)param1;
        if (!param4) {
            return null;
        }
        ph var8 = new ph();
        var8.field_F = param0;
        var8.field_u = param2 ? true : false;
        var8.field_o = var6;
        if (param2) {
            if (!(20 > ((fb) this).b((byte) -92))) {
                throw new RuntimeException();
            }
            ((fb) this).field_o.a((byte) 124, (ah) (Object) var8);
        } else {
            if (((fb) this).a(0) >= 20) {
                throw new RuntimeException();
            }
            ((fb) this).field_j.a((byte) 125, (ah) (Object) var8);
        }
        return var8;
    }

    abstract void b(int param0);

    abstract void a(boolean param0, Object param1, int param2);

    final boolean e(int param0) {
        int var2 = -34 / ((-29 - param0) / 36);
        return ((fb) this).a(0) >= 20 ? true : false;
    }

    final static void a(ka param0, int param1, ej param2, int param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            Object var18 = null;
            byte[][] var19 = null;
            byte[][] var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            var14 = stellarshard.field_B;
            try {
              L0: {
                var18 = (Object) (Object) new lb();
                ((lb) var18).field_s = param0.f(4);
                ((lb) var18).field_l = param0.b(false);
                ((lb) var18).field_p = new int[((lb) var18).field_s];
                ((lb) var18).field_n = new int[((lb) var18).field_s];
                ((lb) var18).field_k = new int[((lb) var18).field_s];
                ((lb) var18).field_r = new re[((lb) var18).field_s];
                ((lb) var18).field_m = new byte[((lb) var18).field_s][][];
                ((lb) var18).field_q = new re[((lb) var18).field_s];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= ((lb) var18).field_s) {
                    oc.field_c.b(-116, (gg) var18);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param0.f(4);
                            if (var6_int == 0) {
                              break L4;
                            } else {
                              if (var6_int == 1) {
                                break L4;
                              } else {
                                if (var6_int != 2) {
                                  if (3 == var6_int) {
                                    var7 = param0.e((byte) 106);
                                    var8 = param0.e((byte) 117);
                                    var9 = param0.f(4);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L5: while (true) {
                                      if (var9 <= var11_int) {
                                        L6: {
                                          var22 = new byte[var9][];
                                          var21 = var22;
                                          var20 = var21;
                                          var19 = var20;
                                          var11 = var19;
                                          if (var6_int != 3) {
                                            break L6;
                                          } else {
                                            var12_int = 0;
                                            L7: while (true) {
                                              if (var9 <= var12_int) {
                                                break L6;
                                              } else {
                                                var13 = param0.b(false);
                                                var11[var12_int] = new byte[var13];
                                                param0.a(0, (byte) -106, var13, var22[var12_int]);
                                                var12_int++;
                                                continue L7;
                                              }
                                            }
                                          }
                                        }
                                        ((lb) var18).field_k[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L8: while (true) {
                                          if (var9 <= var17) {
                                            ((lb) var18).field_q[var5] = param2.a(var8, var12, 114, he.b(var7, ih.a(20, -73)));
                                            ((lb) var18).field_m[var5] = var22;
                                            break L3;
                                          } else {
                                            var12[var17] = he.b(var10[var17], -61);
                                            var17++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param0.e((byte) 85);
                                        var11_int++;
                                        continue L5;
                                      }
                                    }
                                  } else {
                                    L9: {
                                      if (var6_int != 4) {
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var5++;
                                    decompiledRegionSelector0 = 1;
                                    break L2;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L10: {
                            var15 = param0.e((byte) 102);
                            var7 = var15;
                            var16 = param0.e((byte) 102);
                            var8 = var16;
                            var9 = 0;
                            if (var6_int != 1) {
                              break L10;
                            } else {
                              var9 = param0.b(false);
                              break L10;
                            }
                          }
                          ((lb) var18).field_k[var5] = var6_int;
                          ((lb) var18).field_n[var5] = var9;
                          ((lb) var18).field_r[var5] = param2.a(he.b(var15, -112), 0, var16);
                          break L3;
                        }
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((lb) var18).field_p[var5] = -1;
                        decompiledRegionSelector0 = 0;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((lb) var18).field_p[var5] = -4;
                        decompiledRegionSelector0 = 0;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        ((lb) var18).field_p[var5] = -5;
                        decompiledRegionSelector0 = 0;
                        break L15;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var5++;
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) var4;
                stackOut_36_1 = new StringBuilder().append("fb.S(");
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param0 == null) {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L16;
                } else {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L16;
                }
              }
              L17: {
                stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',');
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param2 == null) {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L17;
                } else {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "{...}";
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  break L17;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + 20 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String[] param1, int param2, java.applet.Applet param3, int param4, int param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              vd.field_d = param3.getParameter("overxgames");
              if (vd.field_d == null) {
                vd.field_d = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              vg.field_r = param3.getParameter("overxachievements");
              if (null == vg.field_r) {
                vg.field_r = "0";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = param3.getParameter("currency");
              if (var6 == null) {
                ic.field_a = 2;
                break L3;
              } else {
                if (!rg.a((byte) 19, (CharSequence) (Object) var6)) {
                  ic.field_a = 2;
                  break L3;
                } else {
                  ic.field_a = pf.a((CharSequence) (Object) var6, (byte) 125);
                  break L3;
                }
              }
            }
            ki.field_x = 16777215;
            jb.field_a = 192;
            ki.field_t = 0;
            dl.field_C = new pb[param1.length];
            var7 = 0;
            L4: while (true) {
              if (param1.length <= var7) {
                pk.field_d = param1;
                break L0;
              } else {
                dl.field_C[var7] = new pb(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6_ref;
            stackOut_17_1 = new StringBuilder().append("fb.L(").append(192).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + -1 + ',' + 16777215 + ')');
        }
    }

    fb() {
        ((fb) this).field_o = new al();
        ((fb) this).field_q = new al();
        ((fb) this).field_j = new al();
        ((fb) this).field_k = new al();
        ((fb) this).field_c = new ka(6);
        ((fb) this).field_p = (byte) 0;
        ((fb) this).field_i = 0;
        ((fb) this).field_g = 0;
        ((fb) this).field_a = new ka(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_f = 0;
    }
}
