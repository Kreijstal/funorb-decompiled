/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static em field_b;
    static int field_f;
    static int field_c;
    static int field_g;
    private IntrusiveDeque field_a;
    private IntrusiveNode field_d;
    static int field_e;

    final static boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        try {
          L0: {
            if (n.field_j == param0) {
              td.a(-348, fl.field_c[25]);
            }
            n.field_j = n.field_j + 1;
            L2: while (true) {
              if (!hh.a(93)) {
                if (0 == n.field_j % 40) {
                  if (vc.field_h < 11) {
                    fh.field_c = n.field_j;
                    vc.field_h = vc.field_h + 1;
                    if (10 == vc.field_h) {
                      td.a(-348, fl.field_c[26]);
                    }
                  }
                }
                var1_float = -((480.0f - (float)n.field_j) / 480.0f) + 1.0f;
                if (11 > vc.field_h) {
                  si.field_j = ((int)(var1_float * MenuScreen.field_c) << -231506296) + (uf.field_h[0] + ((int)(var1_float * lk.field_b) << -265857872)) - -(int)(kk.field_x * var1_float);
                }
                var2 = tl.field_r[vc.field_h].field_s >> -757524927;
                var3 = n.field_j << -597797246;
                if (!sg.field_d) {
                  if (-var3 + 900 <= 320 + var2) {
                    td.a(-348, fl.field_c[7]);
                    sg.field_d = true;
                  }
                }
                if (!ab.field_d) {
                  if (-var2 + (320 - qh.field_O[1].field_s) <= -1200 - -var3) {
                    td.a(-348, fl.field_c[8]);
                    ab.field_d = true;
                  }
                }
                if (494 > n.field_j) {
                  stackIn_25_0 = 0;
                } else {
                  stackIn_25_0 = 1;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-14 != (ki.field_d ^ -1)) {
                  continue L2;
                } else {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "gb.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_25_0 != 0;
        }
    }

    final IntrusiveNode c(byte param0) {
        IntrusiveNode var2 = this.field_a.sentinel.nextNode;
        if (var2 == this.field_a.sentinel) {
            this.field_d = null;
            return null;
        }
        if (param0 == 88) {
            this.field_d = var2.nextNode;
            return var2;
        }
        field_g = -4;
        this.field_d = var2.nextNode;
        return var2;
    }

    final IntrusiveNode d(int param0) {
        IntrusiveNode var2 = this.field_a.sentinel.previousNode;
        if (!(this.field_a.sentinel != var2)) {
            this.field_d = null;
            return null;
        }
        if (param0 == 1) {
            this.field_d = var2.previousNode;
            return var2;
        }
        this.a((byte) 55);
        this.field_d = var2.previousNode;
        return var2;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_d;
        if (var2 == this.field_a.sentinel) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.previousNode;
        if (param0 == 26) {
            return var2;
        }
        return (IntrusiveNode) null;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            kd.field_e.a(true, 127, ec.field_d, mj.field_b);
            kd.field_e.i(-65);
            L1: while (hh.a(77)) {
              kd.field_e.a((byte) 105, te.field_a, ki.field_d);
            }
            if (fe.field_d == param0) {
              if (va.field_d) {
                stackIn_10_0 = 3;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (si.field_g == IntrusiveDeque.field_d) {
                  stackIn_14_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (ih.field_c.a(-106)) {
                    if (kd.field_b != IntrusiveDeque.field_d) {
                      stackIn_22_0 = -1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_20_0 = 2;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_17_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              var1_int = fe.field_d;
              pc.a(-1, false);
              stackIn_6_0 = var1_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "gb.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  return stackIn_22_0;
                }
              }
            }
          }
        }
    }

    final IntrusiveNode a(IntrusiveNode param0, byte param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_a.sentinel.previousNode;
          } else {
            var3 = param0;
          }
          if (this.field_a.sentinel != var3) {
            var4 = 59 / ((param1 - 85) / 38);
            this.field_d = var3.previousNode;
            stackIn_7_0 = (IntrusiveNode) (var3);
            decompiledRegionSelector0 = 1;
          } else {
            this.field_d = null;
            stackIn_5_0 = null;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3_ref);

          stackIn_10_1 = new StringBuilder().append("gb.F(");

          if (param0 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (IntrusiveNode) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    public static void b(byte param0) {
        int var1 = -66 / ((33 - param0) / 32);
        field_b = null;
    }

    final static void a(String param0, byte param1) {
        int var2 = -10 / ((58 - param1) / 41);
        System.out.println("Error: " + og.a(param0, "\n", true, "%0a"));
    }

    gb(IntrusiveDeque param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_d;
        if (param0 <= 105) {
            return (IntrusiveNode) null;
        }
        if (!(var2 != this.field_a.sentinel)) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.nextNode;
        return var2;
    }

    final IntrusiveNode a(byte param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_a.sentinel.nextNode;
          }
          if (param0 != 56) {
            this.d(-60);
          }
          if (this.field_a.sentinel == var3) {
            this.field_d = null;
            stackIn_8_0 = null;
            decompiledRegionSelector0 = 0;
          } else {
            this.field_d = var3.nextNode;
            stackIn_10_0 = (IntrusiveNode) (var3);
            decompiledRegionSelector0 = 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var3_ref);

          stackIn_13_1 = new StringBuilder().append("gb.J(").append(param0).append(',');

          if (param1 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (IntrusiveNode) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_e = -1;
    }
}
