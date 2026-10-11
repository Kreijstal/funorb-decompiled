/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pc extends nf {
    static int field_R;
    private int field_Q;
    private int field_W;
    private sd field_O;
    private int field_S;
    private ue field_Y;
    private int field_V;
    private we field_T;
    static le[] field_U;
    private int field_X;
    static String field_P;

    private final void a(we param0, int param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_Y != null) {
            this.field_Y.c(param1 ^ -19820);
          }
          if (param0 != null) {
            param0.a(param0.field_p, 13361, 6, param0.field_l, this.field_V + 6);
            this.field_Y = new ue(param0);
            if (MonkeyPuzzle2.field_F) {
              this.field_Y = new ue();
            }
          } else {
            this.field_Y = new ue();
          }
          this.b((byte) -114, this.field_Y);
          this.field_T = null;
          if (param1 != 6) {
            this.p(-125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pc.M(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void e(byte param0) {
        if (param0 != 10) {
          this.c((byte) 67, (we) null);
          if (fl.field_c != this.field_O) {
            this.field_O = ie.field_c;
            this.field_X = 0;
            this.a(this.field_T, 6);
            this.field_T = null;
            this.field_Y.field_F = 0;
            return;
          }
          return;
        }
        if (fl.field_c != this.field_O) {
          this.field_O = ie.field_c;
          this.field_X = 0;
          this.a(this.field_T, 6);
          this.field_T = null;
          this.field_Y.field_F = 0;
          return;
        }
    }

    void c(byte param0, we param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 < 25) {
            this.e((byte) 67);
          }
          this.field_T = param1;
          if (q.field_c != this.field_O) {
            if (this.field_O == fl.field_c) {
              return;
            }
            this.field_X = 0;
            this.field_O = fl.field_c;
            if (!MonkeyPuzzle2.field_F) {
              return;
            }
          }
          this.b(this.field_V + (12 + this.field_T.field_p), 0, this.field_T.field_l + 12, this.field_Q);
          this.field_X = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("pc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    boolean k(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$6 = 0;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null == this.field_O) {
          if (param0 == -23913) {
            return super.k(-23913);
          }
          this.b(false);
          return super.k(-23913);
        }
        if (fl.field_c == this.field_O) {
          fieldTemp$4 = this.field_X + 1;
          this.field_X = this.field_X + 1;
          if (fieldTemp$4 != this.field_S) {
            this.field_Y.field_F = -((this.field_X << 8) / this.field_S) + 256;
          } else {
            this.field_O = q.field_c;
            this.b(this.field_T.field_p + (12 + this.field_V), 0, this.field_T.field_l + 12, this.field_Q);
            this.field_X = 0;
            this.field_Y.field_F = 0;
            if (var3 != 0) {
              this.field_Y.field_F = -((this.field_X << 8) / this.field_S) + 256;
            }
          }
          if (param0 == -23913) {
            return super.k(-23913);
          }
          this.b(false);
          return super.k(-23913);
        }
        if (this.field_O != ie.field_c) {
          if (param0 == -23913) {
            return super.k(-23913);
          }
          this.b(false);
          return super.k(-23913);
        }
        fieldTemp$5 = this.field_X + 1;
        this.field_X = this.field_X + 1;
        if (fieldTemp$5 == this.field_W) {
          this.field_Y.field_F = 256;
          this.field_O = null;
          if (var3 != 0) {
            this.field_Y.field_F = (this.field_X << 8) / this.field_W;
            fieldTemp$7 = this.field_X + 1;
            this.field_X = this.field_X + 1;
            if (fieldTemp$7 == this.field_S) {
              this.field_O = q.field_c;
              this.b(this.field_T.field_p + (12 + this.field_V), 0, this.field_T.field_l + 12, this.field_Q);
              this.field_X = 0;
              this.field_Y.field_F = 0;
            }
            this.field_Y.field_F = -((this.field_X << 8) / this.field_S) + 256;
          }
          if (param0 == -23913) {
            return super.k(-23913);
          }
          this.b(false);
          return super.k(-23913);
        }
        this.field_Y.field_F = (this.field_X << 8) / this.field_W;
        if (var3 == 0) {
          if (param0 == -23913) {
            return super.k(-23913);
          }
          this.b(false);
          return super.k(-23913);
        }
        fieldTemp$6 = this.field_X + 1;
        this.field_X = this.field_X + 1;
        if (fieldTemp$6 != this.field_S) {
          this.field_Y.field_F = -((this.field_X << 8) / this.field_S) + 256;
        } else {
          this.field_O = q.field_c;
          this.b(this.field_T.field_p + (12 + this.field_V), 0, this.field_T.field_l + 12, this.field_Q);
          this.field_X = 0;
          this.field_Y.field_F = 0;
          this.field_Y.field_F = -((this.field_X << 8) / this.field_S) + 256;
        }
        if (param0 == -23913) {
          return super.k(-23913);
        }
        this.b(false);
        return super.k(-23913);
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        boolean stackIn_24_0 = false;
        String stackIn_31_0 = null;
        int stackIn_34_0 = 0;
        String stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_23_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2 == null) {
            stackIn_3_0 = cm.field_B;
            return stackIn_3_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = pl.a((byte) 109, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!ok.a(-61, var4.charAt(0)) &&
                !ok.a(-57, var4.charAt(-1 + var4.length()))) {
                if (param0 > -92) {
                  pc.a((byte) 28, false, (CharSequence) null);
                }
                var5 = 0;
                var6 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(var6 < param2.length())))) {
                  var7 = param2.charAt(var6);
                  stackOut_23_0 = ok.a(-115, (char) var7);
                  stackIn_34_0 = stackOut_23_0 ? 1 : 0;
                  stackIn_24_0 = stackOut_23_0;
                  if (var8 == 0) {
                    if (stackIn_24_0) {
                      var5++;
                    } else {
                      var5 = 0;
                    }
                    if (var5 >= 2 &&
                      !param1) {
                      stackIn_31_0 = ac.field_d;
                      return stackIn_31_0;
                    }
                    var6++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  stackIn_34_0 = -1;
                }
                if (stackIn_34_0 <= ~var5) {
                  return null;
                }
                stackIn_37_0 = n.field_c;
                return stackIn_37_0;
              }
              stackIn_18_0 = n.field_c;
              return stackIn_18_0;
            }
            stackIn_13_0 = cm.field_B;
            return stackIn_13_0;
          }
          stackIn_8_0 = cm.field_B;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("pc.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          this.p(-21);
          return super.b(false);
        }
        this.field_T = (we) null;
        this.p(-21);
        return super.b(false);
    }

    boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 72 / ((param3 - 37) / 50);
          if (super.a(param0, param1, param2, -113)) {
            return true;
          }
          if (this.field_Y == null) {
            return false;
          }
          if (param2 == 98) {
            this.field_Y.a(param0, false);
          }
          if (param2 == 99) {
            this.field_Y.a(param0, false);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("pc.V(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void p(int param0) {
        if (null != this.field_O) {
          if (ie.field_c != this.field_O) {
            this.a(12 + this.field_V + this.field_T.field_p, (byte) -11, this.field_T.field_l + 12);
            this.a(this.field_T, 6);
          } else {
            this.field_Y.field_F = 256;
            this.field_O = null;
            super.p(param0 ^ 0);
            if (param0 != -21) {
              this.c((byte) -90, (we) null);
              return;
            }
            return;
          }
          this.field_Y.field_F = 256;
          this.field_O = null;
          super.p(param0 ^ 0);
          if (param0 != -21) {
            this.c((byte) -90, (we) null);
            return;
          }
          return;
        }
        super.p(param0 ^ 0);
        if (param0 == -21) {
          return;
        }
        this.c((byte) -90, (we) null);
    }

    public static void c(boolean param0) {
        field_U = null;
        field_P = null;
        if (!param0) {
          field_R = 105;
        }
    }

    pc(kj param0, we param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_l, param1.field_p + (param2 + 12));
        try {
          this.field_W = param3;
          this.field_S = param3;
          this.field_V = param2;
          this.field_Q = param4;
          this.a(param1, 6);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          ah.field_h = false;
          if (param0 != -46) {
            field_R = 44;
          }
          hj.field_L = false;
          if (null != me.field_f) {
            if (!me.field_f.field_z) {
              return;
            }
            if (param1 == 8) {
              param1 = 2;
              if (!fk.field_a) {
                param2 = od.field_o;
                if (MonkeyPuzzle2.field_F) {
                  param2 = r.field_b;
                }
              } else {
                param2 = r.field_b;
              }
              j.field_e.a(bh.field_b, (byte) -34);
            }
            var3_int = 1;
            if (param1 == 10) {
              wj.d((byte) 35);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (hj.field_L) {
                param2 = gg.a(new String[]{param2}, ek.field_c, true);
              }
              if (ja.field_F) {
                param2 = oa.field_F;
              }
              me.field_f.a(-10, param2, param1);
            }
            if (256 != param1) {
              if (param1 == 10) {
                return;
              }
              if (!fk.field_a) {
                j.field_e.k(-112);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("pc.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    static {
        field_R = 640;
        field_P = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
