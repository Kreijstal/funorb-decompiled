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
        boolean stackIn_25_0 = false;
        RuntimeException decompiledCaughtException = null;
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        try {
          if (MatchingTextValidator.field_j == param0) {
            td.playPcmSample(-348, fl.field_c[25]);
          }
          MatchingTextValidator.field_j = MatchingTextValidator.field_j + 1;
          L1: while (true) {
            if (hh.a(93)) {
              if (ki.field_d != 13) {
                continue L1;
              }
              return true;
            }
            {
              if (0 == MatchingTextValidator.field_j % 40) {
                if (vc.field_h < 11) {
                  fh.field_c = MatchingTextValidator.field_j;
                  vc.field_h = vc.field_h + 1;
                  if (10 == vc.field_h) {
                    td.playPcmSample(-348, fl.field_c[26]);
                  }
                }
              }
              var1_float = -((480.0f - (float)MatchingTextValidator.field_j) / 480.0f) + 1.0f;
              if (11 > vc.field_h) {
                si.field_j = ((int)(var1_float * MenuScreen.field_c) << 8) + (uf.avatarTintPalette[0] + ((int)(var1_float * lk.field_b) << 16)) + (int)(kk.field_x * var1_float);
              }
              var2 = tl.introFaceFrames[vc.field_h].fullWidth >> 1;
              var3 = MatchingTextValidator.field_j << 2;
              if (!sg.field_d) {
                if (-var3 + 900 <= 320 + var2) {
                  td.playPcmSample(-348, fl.field_c[7]);
                  sg.field_d = true;
                }
              }
              if (!ab.field_d) {
                if (-var2 + (320 - qh.introGeometryFrames[1].fullWidth) <= -1200 + var3) {
                  td.playPcmSample(-348, fl.field_c[8]);
                  ab.field_d = true;
                }
              }
              stackIn_25_0 = !(494 > MatchingTextValidator.field_j);
              return stackIn_25_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "gb.A(" + param0 + ')');
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
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          kd.field_e.a(true, 127, ec.field_d, mj.field_b);
          kd.field_e.i(-65);
          L0: while (hh.a(77)) {
            kd.field_e.a((byte) 105, te.field_a, ki.field_d);
          }
          if (fe.field_d != param0) {
            var1_int = fe.field_d;
            pc.a(-1, false);
            stackIn_6_0 = var1_int;
            return stackIn_6_0;
          }
          if (va.field_d) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (si.field_g == IntrusiveDeque.field_d) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!ih.field_c.a(-106)) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (kd.field_b != IntrusiveDeque.field_d) {
            stackIn_22_0 = -1;
            return stackIn_22_0;
          }
          stackIn_20_0 = 2;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "gb.B(" + param0 + ')');
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
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_a.sentinel.previousNode;
          } else {
            var3 = param0;
          }
          if (this.field_a.sentinel == var3) {
            this.field_d = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) ((Object) stackIn_5_0);
          }
          var4 = 59 / ((param1 - 85) / 38);
          this.field_d = var3.previousNode;
          stackIn_7_0 = (IntrusiveNode) (var3);
          return stackIn_7_0;
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
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
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
            return (IntrusiveNode) ((Object) stackIn_8_0);
          }
          this.field_d = var3.nextNode;
          stackIn_10_0 = (IntrusiveNode) (var3);
          return stackIn_10_0;
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
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_e = -1;
    }
}
