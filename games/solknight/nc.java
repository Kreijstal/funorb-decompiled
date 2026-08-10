/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    gg field_e;
    static String field_b;
    static int field_g;
    static long field_f;
    static java.math.BigInteger field_d;
    private gg field_c;
    static int field_a;

    final gg e(byte param0) {
        gg var2;
        if (param0 == 86) {
          var2 = this.field_e.field_a;
          if (var2 == this.field_e) {
            return null;
          } else {
            var2.c(10);
            return var2;
          }
        } else {
          return (gg) null;
        }
    }

    final gg b(int param0) {
        gg var2;
        var2 = this.field_c;
        if (this.field_e != var2) {
          if (param0 >= -13) {
            this.c(125);
            this.field_c = var2.field_d;
            return var2;
          } else {
            this.field_c = var2.field_d;
            return var2;
          }
        } else {
          this.field_c = null;
          return null;
        }
    }

    final gg b(byte param0) {
        gg var2 = null;
        if (param0 != 94) {
            field_f = 120L;
            var2 = this.field_c;
            if (!(var2 != this.field_e)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_a;
            return var2;
        }
        var2 = this.field_c;
        if (!(var2 != this.field_e)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final gg a(int param0) {
        gg var2;
        if (param0 == 0) {
          var2 = this.field_e.field_d;
          if (var2 == this.field_e) {
            return null;
          } else {
            var2.c(10);
            return var2;
          }
        } else {
          return (gg) null;
        }
    }

    final gg c(byte param0) {
        gg var2 = this.field_e.field_a;
        if (param0 != 96) {
            java.awt.Canvas var3 = (java.awt.Canvas) null;
            nc.a((byte) 61, (java.awt.Canvas) null);
            if (!(var2 != this.field_e)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_a;
            return var2;
        }
        if (!(var2 != this.field_e)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    public static void d(byte param0) {
        field_b = null;
        if (param0 >= -105) {
            field_f = 59L;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -1) {
          L0: {
            field_f = 105L;
            if (this.field_e != this.field_e.field_d) {
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
            if (this.field_e != this.field_e.field_d) {
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

    final void a(gg param0, int param1) {
        try {
            if (param1 != -7044) {
                field_g = -70;
            }
            if (null != param0.field_a) {
                param0.c(param1 ^ -7050);
            }
            param0.field_d = this.field_e;
            param0.field_a = this.field_e.field_a;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "nc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ob.a(-1, (java.awt.Component) ((Object) param1));
              if (param0 == 86) {
                break L1;
              } else {
                var3 = (java.awt.Canvas) null;
                nc.a((java.awt.Canvas) null, 35, true);
                break L1;
              }
            }
            sj.a((java.awt.Component) ((Object) param1), -122);
            if (ah.field_d == null) {
              break L0;
            } else {
              ah.field_d.a((java.awt.Component) ((Object) param1), -127);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("nc.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final void a(int param0, gg param1) {
        try {
            if (!(null == param1.field_a)) {
                param1.c(10);
            }
            param1.field_d = this.field_e.field_d;
            param1.field_a = this.field_e;
            param1.field_a.field_d = param1;
            if (param0 != -3024) {
                this.c((byte) -25);
            }
            param1.field_d.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "nc.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final gg a(byte param0) {
        gg var2 = null;
        if (param0 != 51) {
            field_f = -72L;
            var2 = this.field_e.field_d;
            if (!(this.field_e != var2)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_d;
            return var2;
        }
        var2 = this.field_e.field_d;
        if (!(this.field_e != var2)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_d;
        return var2;
    }

    final static pd a(int param0, int param1, byte param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            pd var5 = null;
            oa var5_ref = null;
            pd stackIn_3_0 = null;
            oa stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = Class.forName("vf");
                      var5 = (pd) (var4.newInstance());
                      if (param2 == -35) {
                        break L2;
                      } else {
                        field_b = (String) null;
                        break L2;
                      }
                    }
                    var5.a(param3, param2 ^ -9354, param1, param0);
                    stackIn_3_0 = (pd) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new oa();
                  ((pd) ((Object) var5_ref)).a(param3, 9387, param1, param0);
                  stackIn_5_0 = (oa) (var5_ref);
                  return (pd) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("nc.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 > 26) {
              break L0;
            } else {
              field_a = -33;
              break L0;
            }
          }
          if ((kj.field_R ^ -1) <= -11) {
            if (!uk.h(250)) {
              mi.a();
              vg.b(240, 320, 18);
              uf.a((byte) 99, 0, 0, param0);
              return;
            } else {
              if (-1 == (fj.field_i ^ -1)) {
                nh.a((byte) -101, false, param2);
                uf.a((byte) 99, 0, 0, param0);
                return;
              } else {
                ih.a(20753, param0);
                return;
              }
            }
          } else {
            L1: {
              var3_int = 0;
              if (!wa.field_b) {
                break L1;
              } else {
                wa.field_b = false;
                var3_int = 1;
                break L1;
              }
            }
            la.a(ak.a(true), ae.field_e, 82, var3_int != 0, mc.a(-100));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("nc.D(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public nc() {
        this.field_e = new gg();
        this.field_e.field_d = this.field_e;
        this.field_e.field_a = this.field_e;
    }

    final void a(boolean param0) {
        gg var2;
        int var3;
        var3 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          var2 = this.field_e.field_d;
          if (var2 != this.field_e) {
            var2.c(10);
            continue L0;
          } else {
            if (!param0) {
              return;
            } else {
              this.field_c = null;
              return;
            }
          }
        }
    }

    static {
        field_g = 0;
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_d = new java.math.BigInteger("65537");
    }
}
