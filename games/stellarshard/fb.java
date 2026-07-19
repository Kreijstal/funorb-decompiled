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
        boolean discarded$0 = false;
        if (param0 > -77) {
            discarded$0 = this.e(-118);
        }
        return this.field_o.b((byte) -7) + this.field_q.b((byte) -7);
    }

    abstract void a(byte param0);

    abstract boolean f(int param0);

    final static ml a(int param0, boolean param1, String param2) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        ml stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_2_0 = null;
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
              var3 = new ml(false);
              var3.field_g = param0;
              var3.field_e = param2;
              if (param1) {
                break L1;
              } else {
                field_f = -59;
                break L1;
              }
            }
            stackOut_2_0 = (ml) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("fb.O(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        field_h = null;
        if (param0 != -2918) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            fb.a(47, (String[]) null, 113, (java.applet.Applet) null, 32, -16);
        }
    }

    final int a(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            discarded$0 = this.f(72);
        }
        return this.field_j.b((byte) -7) + this.field_k.b((byte) -7);
    }

    final static void a(int param0, byte param1, ta param2) {
        ha var3 = pg.field_fb;
        var3.f(param0, 950);
        var3.a(false, param2.field_o);
        if (param1 > -117) {
            return;
        }
        try {
            var3.a(false, param2.field_t);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "fb.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean d(int param0) {
        if (param0 != 2) {
            this.field_k = (al) null;
        }
        return 20 <= this.b((byte) -87) ? true : false;
    }

    final ph a(byte param0, int param1, boolean param2, int param3, boolean param4) {
        long var6 = ((long)param3 << -1322373600) + (long)param1;
        if (!param4) {
            return (ph) null;
        }
        ph var8 = new ph();
        var8.field_F = param0;
        var8.field_u = param2 ? true : false;
        var8.field_o = var6;
        if (param2) {
            if (!(20 > this.b((byte) -92))) {
                throw new RuntimeException();
            }
            this.field_o.a((byte) 124, var8);
        } else {
            if (this.a(0) >= 20) {
                throw new RuntimeException();
            }
            this.field_j.a((byte) 125, var8);
        }
        return var8;
    }

    abstract void b(int param0);

    abstract void a(boolean param0, Object param1, int param2);

    final boolean e(int param0) {
        int var2 = -34 / ((-29 - param0) / 36);
        return (this.a(0) ^ -1) <= -21 ? true : false;
    }

    final static void a(ka param0, int param1, ej param2, int param3) {
        try {
            byte[] array$1 = null;
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
            lb var18_ref = null;
            byte[][] var19 = null;
            byte[][] var20 = null;
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
            int decompiledRegionSelector1 = 0;
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
                var18_ref = new lb();
                var18_ref.field_s = param0.f(4);
                var18_ref.field_l = param0.b(false);
                var18_ref.field_p = new int[var18_ref.field_s];
                var18_ref.field_n = new int[var18_ref.field_s];
                var18_ref.field_k = new int[var18_ref.field_s];
                var18_ref.field_r = new re[var18_ref.field_s];
                var18_ref.field_m = new byte[var18_ref.field_s][][];
                var18_ref.field_q = new re[var18_ref.field_s];
                if (param3 == 20) {
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var18_ref.field_s) {
                      oc.field_c.b(param3 + -136, var18_ref);
                      decompiledRegionSelector1 = 1;
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
                                if ((var6_int ^ -1) == -2) {
                                  break L4;
                                } else {
                                  if ((var6_int ^ -1) != -3) {
                                    L5: {
                                      if (3 == var6_int) {
                                        break L5;
                                      } else {
                                        if (var6_int == 4) {
                                          break L5;
                                        } else {
                                          var5++;
                                          decompiledRegionSelector0 = 1;
                                          break L2;
                                        }
                                      }
                                    }
                                    var7 = param0.e((byte) 106);
                                    var8 = param0.e((byte) 117);
                                    var9 = param0.f(param3 ^ 16);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L6: while (true) {
                                      if (var9 <= var11_int) {
                                        L7: {
                                          var20 = new byte[var9][];
                                          var19 = var20;
                                          var11 = var19;
                                          if (var6_int != 3) {
                                            break L7;
                                          } else {
                                            var12_int = 0;
                                            L8: while (true) {
                                              if (var9 <= var12_int) {
                                                break L7;
                                              } else {
                                                var13 = param0.b(false);
                                                array$1 = new byte[var13];
                                                var11[var12_int] = array$1;
                                                param0.a(0, (byte) -106, var13, var20[var12_int]);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          }
                                        }
                                        var18_ref.field_k[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L9: while (true) {
                                          if (var9 <= var17) {
                                            var18_ref.field_q[var5] = param2.a(var8, var12, param3 + 94, he.b(var7, ih.a(param3, -73)));
                                            var18_ref.field_m[var5] = var20;
                                            break L3;
                                          } else {
                                            var12[var17] = he.b(var10[var17], -61);
                                            var17++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param0.e((byte) 85);
                                        var11_int++;
                                        continue L6;
                                      }
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
                              if (-2 != (var6_int ^ -1)) {
                                break L10;
                              } else {
                                var9 = param0.b(false);
                                break L10;
                              }
                            }
                            var18_ref.field_k[var5] = var6_int;
                            var18_ref.field_n[var5] = var9;
                            var18_ref.field_r[var5] = param2.a(he.b(var15, -112), 0, var16);
                            break L3;
                          }
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L11: {
                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                          var18_ref.field_p[var5] = -1;
                          decompiledRegionSelector0 = 0;
                          break L11;
                        }
                      } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L12: {
                          var6_ref = (SecurityException) (Object) decompiledCaughtException;
                          var18_ref.field_p[var5] = -2;
                          decompiledRegionSelector0 = 0;
                          break L12;
                        }
                      } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                          var18_ref.field_p[var5] = -3;
                          decompiledRegionSelector0 = 0;
                          break L13;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L14: {
                          var6_ref3 = (Exception) (Object) decompiledCaughtException;
                          var18_ref.field_p[var5] = -4;
                          decompiledRegionSelector0 = 0;
                          break L14;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L15: {
                          var6_ref4 = decompiledCaughtException;
                          var18_ref.field_p[var5] = -5;
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
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) (var4);
                stackOut_36_1 = new StringBuilder().append("fb.S(");
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param0 == null) {
                  stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L16;
                } else {
                  stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L16;
                }
              }
              L17: {
                stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',');
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param2 == null) {
                  stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L17;
                } else {
                  stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackOut_40_2 = "{...}";
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  break L17;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String[] param1, int param2, java.applet.Applet param3, int param4, int param5) {
        RuntimeException var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        ej var9 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
              var6_ref = param3.getParameter("currency");
              if (var6_ref == null) {
                ic.field_a = 2;
                break L3;
              } else {
                if (!rg.a((byte) 19, (CharSequence) ((Object) var6_ref))) {
                  ic.field_a = 2;
                  break L3;
                } else {
                  ic.field_a = pf.a((CharSequence) ((Object) var6_ref), (byte) 125);
                  break L3;
                }
              }
            }
            ki.field_x = param5;
            jb.field_a = param0;
            ki.field_t = param2;
            dl.field_C = new pb[param1.length];
            var7 = 0;
            L4: while (true) {
              if (param1.length <= var7) {
                L5: {
                  if (param4 == -1) {
                    break L5;
                  } else {
                    var9 = (ej) null;
                    fb.a((ka) null, 60, (ej) null, 71);
                    break L5;
                  }
                }
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
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var6);
            stackOut_19_1 = new StringBuilder().append("fb.L(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    fb() {
        this.field_o = new al();
        this.field_q = new al();
        this.field_j = new al();
        this.field_k = new al();
        this.field_c = new ka(6);
        this.field_p = (byte) 0;
        this.field_i = 0;
        this.field_g = 0;
        this.field_a = new ka(10);
    }

    static {
        field_n = 0;
        field_f = 0;
    }
}
