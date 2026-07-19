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
        gg var2 = null;
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
        boolean discarded$2 = false;
        gg var2 = null;
        var2 = this.field_c;
        if (this.field_e != var2) {
          if (param0 >= -13) {
            discarded$2 = this.c(125);
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
        gg var2 = null;
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
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            field_f = 105L;
            if (this.field_e != this.field_e.field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_e != this.field_e.field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("nc.G(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final void a(int param0, gg param1) {
        gg discarded$0 = null;
        try {
            if (!(null == param1.field_a)) {
                param1.c(10);
            }
            param1.field_d = this.field_e.field_d;
            param1.field_a = this.field_e;
            param1.field_a.field_d = param1;
            if (param0 != -3024) {
                discarded$0 = this.c((byte) -25);
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
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            pd stackOut_2_0 = null;
            oa stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
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
                    stackOut_2_0 = (pd) (var5);
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new oa();
                  ((pd) ((Object) var5_ref)).a(param3, 9387, param1, param0);
                  stackOut_4_0 = (oa) (var5_ref);
                  stackIn_5_0 = stackOut_4_0;
                  return (pd) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var4_ref2);
                stackOut_6_1 = new StringBuilder().append("nc.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param3 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 26) {
                break L1;
              } else {
                field_a = -33;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((kj.field_R ^ -1) <= -11) {
                  break L3;
                } else {
                  L4: {
                    var3_int = 0;
                    if (!wa.field_b) {
                      break L4;
                    } else {
                      wa.field_b = false;
                      var3_int = 1;
                      break L4;
                    }
                  }
                  la.a(ak.a(true), ae.field_e, 82, var3_int != 0, mc.a(-100));
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (!uk.h(250)) {
                mi.a();
                vg.b(240, 320, 18);
                uf.a((byte) 99, 0, 0, param0);
                return;
              } else {
                L5: {
                  if (-1 == (fj.field_i ^ -1)) {
                    break L5;
                  } else {
                    ih.a(20753, param0);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                nh.a((byte) -101, false, param2);
                uf.a((byte) 99, 0, 0, param0);
                if (var4 == 0) {
                  break L2;
                } else {
                  mi.a();
                  vg.b(240, 320, 18);
                  uf.a((byte) 99, 0, 0, param0);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("nc.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public nc() {
        this.field_e = new gg();
        this.field_e.field_d = this.field_e;
        this.field_e.field_a = this.field_e;
    }

    final void a(boolean param0) {
        gg var2 = null;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          L1: {
            L2: {
              var2 = this.field_e.field_d;
              if (var2 == this.field_e) {
                if (var3 != 0) {
                  break L2;
                } else {
                  if (var3 == 0) {
                    break L1;
                  } else {
                    var2.c(10);
                    break L2;
                  }
                }
              } else {
                var2.c(10);
                break L2;
              }
            }
            if (var3 == 0) {
              continue L0;
            } else {
              break L1;
            }
          }
          if (!param0) {
            return;
          } else {
            this.field_c = null;
            return;
          }
        }
    }

    static {
        field_g = 0;
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_d = new java.math.BigInteger("65537");
    }
}
