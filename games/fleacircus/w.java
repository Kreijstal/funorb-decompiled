/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w {
    static wd field_e;
    bf field_o;
    static String field_i;
    static int field_a;
    static int field_l;
    static String field_j;
    static int field_r;
    bf field_q;
    bf field_n;
    bf field_h;
    int field_k;
    long field_m;
    ni field_d;
    ni field_f;
    byte field_g;
    volatile int field_b;
    volatile int field_c;
    fk field_p;

    abstract boolean b(byte param0);

    abstract void d(int param0);

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        String var3 = null;
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
              if (param0 == 61) {
                break L1;
              } else {
                var3 = (String) null;
                w.a(86, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("w.I(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean a(int param0) {
        int var2 = -6 / ((-53 - param0) / 34);
        return -21 >= (this.f(1) ^ -1) ? true : false;
    }

    abstract void a(byte param0);

    public static void c(int param0) {
        field_i = null;
        int var1 = 114 / ((param0 - -33) / 34);
        field_e = null;
        field_j = null;
    }

    abstract void a(Object param0, boolean param1, byte param2);

    final static dd[] a(int param0, int param1, int param2, rh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        dd[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dd[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            var4_int = -54 % ((36 - param0) / 55);
            if (ha.a(param3, -32180, param2, param1)) {
              stackOut_3_0 = fc.b(-128);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("w.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dd[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final fk a(int param0, boolean param1, int param2, int param3, byte param4) {
        long var6 = 0L;
        fk var8 = null;
        fk stackIn_1_0 = null;
        fk stackIn_2_0 = null;
        fk stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        fk stackOut_0_0 = null;
        fk stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        fk stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = (long)param2 + ((long)param3 << 2049519136);
          var8 = new fk();
          stackOut_0_0 = (fk) (var8);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = (fk) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (fk) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_v = stackIn_3_1 != 0;
        var8.field_E = param4;
        var8.field_j = var6;
        if (param0 > 126) {
          L1: {
            if (!param1) {
              break L1;
            } else {
              if (-21 < (this.f(1) ^ -1)) {
                this.field_o.a(var8, -1089421886);
                if (fleas.field_A) {
                  break L1;
                } else {
                  return var8;
                }
              } else {
                throw new RuntimeException();
              }
            }
          }
          if ((this.e(-83) ^ -1) <= -21) {
            throw new RuntimeException();
          } else {
            this.field_n.a(var8, -1089421886);
            return var8;
          }
        } else {
          L2: {
            field_a = 47;
            if (!param1) {
              break L2;
            } else {
              if (-21 < (this.f(1) ^ -1)) {
                this.field_o.a(var8, -1089421886);
                if (fleas.field_A) {
                  break L2;
                } else {
                  return var8;
                }
              } else {
                throw new RuntimeException();
              }
            }
          }
          if ((this.e(-83) ^ -1) <= -21) {
            throw new RuntimeException();
          } else {
            this.field_n.a(var8, -1089421886);
            return var8;
          }
        }
    }

    final int e(int param0) {
        if (param0 > -52) {
          this.field_d = (ni) null;
          return this.field_n.a((byte) 67) - -this.field_h.a((byte) 20);
        } else {
          return this.field_n.a((byte) 67) - -this.field_h.a((byte) 20);
        }
    }

    final boolean b(int param0) {
        int var2 = -126 % ((73 - param0) / 37);
        return (this.e(-88) ^ -1) <= -21 ? true : false;
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_7_0 = null;
            String stackIn_13_0 = null;
            String stackIn_15_0 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            String stackOut_14_0 = null;
            String stackOut_12_0 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var8 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param1.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (eb.a("getcookies", param1, param0 + -250));
                    var5 = m.a(';', 122, var4);
                    var6 = param0;
                    L2: while (true) {
                      L3: {
                        if (var5.length <= var6) {
                          break L3;
                        } else {
                          var7 = var5[var6].indexOf('=');
                          if (var8 != 0) {
                            break L3;
                          } else {
                            L4: {
                              if (var7 < 0) {
                                break L4;
                              } else {
                                if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                                  break L4;
                                } else {
                                  stackOut_6_0 = var5[var6].substring(1 + var7).trim();
                                  stackIn_7_0 = stackOut_6_0;
                                  decompiledRegionSelector0 = 1;
                                  break L1;
                                }
                              }
                            }
                            var6++;
                            if (var8 == 0) {
                              continue L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (lj.field_g == null) {
                    stackOut_14_0 = param1.getParameter("settings");
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackOut_12_0 = lj.field_g;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) (var2);
                stackOut_16_1 = new StringBuilder().append("w.J(").append(param0).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param1 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_15_0;
              } else {
                return stackIn_7_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int f(int param0) {
        if (param0 != 1) {
          this.field_g = (byte) 23;
          return this.field_o.a((byte) 5) + this.field_q.a((byte) 9);
        } else {
          return this.field_o.a((byte) 5) + this.field_q.a((byte) 9);
        }
    }

    w() {
        this.field_o = new bf();
        this.field_q = new bf();
        this.field_n = new bf();
        this.field_h = new bf();
        this.field_d = new ni(6);
        this.field_c = 0;
        this.field_g = (byte) 0;
        this.field_b = 0;
        this.field_f = new ni(10);
    }

    static {
        field_e = new wd();
        field_i = "<%0>Trapdoor:<%1> if a flea stands on one of these, it opens and the flea falls through.";
        field_j = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
