/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    hl field_e;
    static rg field_a;
    static int field_b;
    static gn field_d;
    private hl field_c;

    final static int a(vj param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        lb var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11 = (lb) ((Object) param0);
            var5 = var11.field_r.field_f;
            var6 = var11.field_s.field_f;
            var7 = var11.field_r.field_h;
            var8 = var11.field_s.field_h;
            if (var5 == var6) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = 27 / ((param1 - 31) / 32);
                if (var5 > var6) {
                  var10 = var5;
                  var5 = var6;
                  var6 = var10;
                  var10 = var7;
                  var7 = var8;
                  var8 = var10;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param2 <= var5) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var6 >= param2) {
                  if ((-var5 + param2) * (-var7 + var8) <= (-var7 + param3) * (-var5 + var6)) {
                    stackIn_16_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  return 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ah.M(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    final hl c(byte param0) {
        hl var2 = this.field_c;
        if (!(var2 != this.field_e)) {
            this.field_c = null;
            return null;
        }
        int var3 = 110 % ((32 - param0) / 54);
        this.field_c = var2.field_h;
        return var2;
    }

    final static void b(boolean param0) {
        oi.field_f = param0 ? true : false;
        aa.field_j = null;
        dg.field_b = null;
        qg.field_b = null;
        pb.field_a = null;
    }

    private final void a(hl param0, byte param1, ah param2) {
        hl var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = this.field_e.field_a;
              this.field_e.field_a = param0.field_a;
              param0.field_a.field_h = this.field_e;
              if (param0 != this.field_e) {
                param0.field_a = param2.field_e.field_a;
                param0.field_a.field_h = param0;
                var4.field_h = param2.field_e;
                param2.field_e.field_a = var4;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 < -98) {
              break L0;
            } else {
              field_b = 68;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref);

            stackIn_8_1 = new StringBuilder().append("ah.I(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
        field_d = null;
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 0) {
          L0: {
            field_d = (gn) null;
            if (this.field_e.field_h != this.field_e) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_e.field_h != this.field_e) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(hl param0, int param1, hl param2) {
        try {
            if (null != param2.field_a) {
                param2.d(0);
            }
            param2.field_h = param0;
            param2.field_a = param0.field_a;
            if (param1 != 0) {
                field_a = (rg) null;
            }
            param2.field_a.field_h = param2;
            param2.field_h.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ah.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, hl param1) {
        if (param0 >= -61) {
            return;
        }
        try {
            if (!(param1.field_a == null)) {
                param1.d(0);
            }
            param1.field_h = this.field_e;
            param1.field_a = this.field_e.field_a;
            param1.field_a.field_h = param1;
            param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ah.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, byte param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (il.field_a == null) {
                break L1;
              } else {
                if (il.field_a.equals(param1.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = il.field_a;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                }
              }
            }
            L2: {
              if (null == hg.field_M) {
                break L2;
              } else {
                if (hg.field_M.equals(param1.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = hg.field_M;
                  break L2;
                }
              }
            }
            if (param2 > 6) {
              stackIn_10_0 = ab.a((String) (var3), (String) (var4), param0, (byte) -118, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = (java.net.URL) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = var3;

            stackIn_13_1 = new StringBuilder().append("ah.F(");

            if (param0 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    final void a(int param0) {
        hl var2;
        int var3;
        var3 = HoldTheLine.field_D;
        L0: while (true) {
          var2 = this.field_e.field_h;
          if (this.field_e != var2) {
            var2.d(0);
            continue L0;
          } else {
            if (param0 != 29020) {
              field_d = (gn) null;
              this.field_c = null;
              return;
            } else {
              this.field_c = null;
              return;
            }
          }
        }
    }

    final hl d(byte param0) {
        if (param0 != 124) {
            return (hl) null;
        }
        hl var2 = this.field_e.field_a;
        if (!(this.field_e != var2)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final hl c(int param0) {
        hl var2 = null;
        if (param0 != -4140) {
            this.field_e = (hl) null;
            var2 = this.field_c;
            if (!(this.field_e != var2)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_a;
            return var2;
        }
        var2 = this.field_c;
        if (!(this.field_e != var2)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final hl a(byte param0) {
        hl var2;
        if (param0 == 74) {
          var2 = this.field_e.field_a;
          if (this.field_e == var2) {
            return null;
          } else {
            var2.d(0);
            return var2;
          }
        } else {
          return (hl) null;
        }
    }

    final void a(int param0, ah param1) {
        try {
            if (param0 != -30510) {
                field_b = -18;
            }
            this.a(this.field_e.field_h, (byte) -123, param1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ah.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(hl param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_a != null) {
                param0.d(0);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_h = this.field_e.field_h;
            param0.field_a = this.field_e;
            param0.field_a.field_h = param0;
            param0.field_h.field_a = param0;
            if (!param1) {
              break L0;
            } else {
              this.field_e = (hl) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ah.P(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final hl b(byte param0) {
        hl var2;
        var2 = this.field_e.field_h;
        if (param0 > 84) {
          if (this.field_e == var2) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_h;
            return var2;
          }
        } else {
          ah.a(true);
          if (this.field_e == var2) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_h;
            return var2;
          }
        }
    }

    public ah() {
        this.field_e = new hl();
        this.field_e.field_a = this.field_e;
        this.field_e.field_h = this.field_e;
    }

    static {
    }
}
