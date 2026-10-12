/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class st extends oj {
    static java.awt.Color field_F;
    int field_D;
    private boolean field_G;
    static String field_B;
    static String field_y;
    static boolean field_C;
    static String field_A;
    static hc field_z;

    final void a(ha param0, int param1) {
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (this.field_G) {
            return;
          }
          this.field_G = true;
          if (param1 != -26661) {
            field_B = (String) null;
          }
          L1: {
            L2: {
              L3: {
                L4: {
                  boolean decompiledFrameRemainder1 = true;
                  boolean decompiledFrameRemainder0 = true;
                  var3_int = this.field_D;
                  if ((1 != var3_int ||
                    var4 != 0) &&
                    (decompiledFrameRemainder0 = (var3_int != 2 ||
                    var4 != 0)) &&
                    (decompiledFrameRemainder1 = (var3_int != 3 ||
                    var4 != 0))) {
                    switch (var3_int) {
                      case 4:
                        break L4;
                      case 6:
                        break L3;
                      default:
                        break L1;
                      case 5:
                        if (var4 == 0) {
                          break L2;
                        }
                        break;
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    if (this.field_w.field_t <= this.field_w.field_Y) {
                      break L1;
                    }
                    if (this.field_w.field_S) {
                      break L1;
                    }
                    this.field_w.field_Y = this.field_w.field_Y + 1;
                    if (!param0.field_b) {
                      break L1;
                    }
                    param0.field_ob[this.field_w.field_O] = param0.field_ob[this.field_w.field_O] + 1;
                    if (var4 == 0) {
                      break L1;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    this.field_w.a(1, true);
                    if (var4 == 0) {
                      break L1;
                    }
                  }
                  this.field_w.a(1, true);
                  if (var4 == 0) {
                    break L1;
                  }
                }
                this.field_w.field_t = this.field_w.field_t + 1;
                this.field_w.field_Y = this.field_w.field_Y + 1;
                if (this.field_w.field_t > 99) {
                  this.field_w.field_t = 99;
                }
                if (this.field_w.field_Y > this.field_w.field_t) {
                  this.field_w.field_Y = this.field_w.field_t;
                }
                if (!param0.field_b) {
                  break L1;
                }
                param0.d(this.field_w.field_O, -bw.field_m[this.field_w.field_N][4] + this.field_w.field_Y, param1 ^ -26714, 8);
                if (var4 == 0) {
                  break L1;
                }
              }
              this.field_w.field_Y = this.field_w.field_Y - 1;
              this.field_w.field_t = this.field_w.field_t - 1;
              if (this.field_w.field_t < 1) {
                this.field_w.field_t = 1;
              }
              if (this.field_w.field_Y < 0) {
                this.field_w.field_Y = 0;
              }
              this.field_w.w(param1 + 48992);
              if (!param0.field_b) {
                break L1;
              }
              param0.d(this.field_w.field_O, this.field_w.field_Y - bw.field_m[this.field_w.field_N][4], 95, 8);
              if (var4 == 0) {
                break L1;
              }
            }
            this.field_w.field_A = this.field_w.field_A - 1;
            this.field_w.w(22331);
          }
          fl.a(param0, -112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_86_0 = var3;
          stackIn_86_1 = new StringBuilder().append("st.G(");
          if (param0 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_86_0), ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -84) {
            field_F = (java.awt.Color) null;
          }
          var4_int = this.a((byte) -39, param2, param0, true) ? 1 : 0;
          this.a(param2.field_xb, -26661);
          stackIn_4_0 = var4_int;
          return stackIn_4_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("st.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_w != null) {
            var3 = "EventTurnEffect: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + "), type: " + this.field_D;
            if (ArmiesOfGielinor.field_M) {
              var3 = "EventTurnEffect: unit: null, type: " + this.field_D;
            }
          } else {
            var3 = "EventTurnEffect: unit: null, type: " + this.field_D;
          }
          var4 = 109 / ((53 - param0) / 51);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "st.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_y = null;
          field_B = null;
          field_A = null;
          if (!param0) {
            field_B = (String) null;
          }
          field_F = null;
          field_z = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "st.E(" + param0 + ')');
        }
    }

    final static void a(int param0, je param1, je param2, je param3, je param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (jl.field_b != null) {
            return;
          }
          if (param0 != 8) {
            st.a(-95, (je) null, (je) null, (je) null, (je) null);
          }
          hf.field_c = false;
          if (!bb.field_a) {
            if (vi.field_d) {
              var5 = ml.field_Lb;
              if (var6 != 0) {
                var5 = ll.field_Tb;
                var5 = dc.field_l;
              }
            } else {
              var5 = ll.field_Tb;
              if (var6 != 0) {
                var5 = dc.field_l;
              }
            }
          } else {
            var5 = dc.field_l;
          }
          fs.a(ni.field_d, (String) null, var5, 112, 0);
          qj.field_z.field_W = (8355711 & uf.field_i.field_W >> 1) - (ni.field_d >> 1 & 8355711) + ni.field_d;
          jl.field_b = qj.field_z;
          qj.field_z.field_T = (8355711 & uf.field_i.field_T >> 1) + (ni.field_d - ((ni.field_d & 16711422) >> 1));
          qj.field_z.field_wb = -((16711423 & ni.field_d) >> 1) + ni.field_d + ((uf.field_i.field_wb & 16711423) >> 1);
          ew.field_d = rb.field_b;
          eu.field_g = new je(0L, param2);
          sb.field_i = new je(0L, param4);
          f.field_C = new je(0L, (je) null);
          mb.field_F = new je(0L, param3);
          qj.field_z = new je(0L, param1);
          qj.field_z.field_Z = tc.field_e;
          mb.field_F.a(qj.field_z, 102);
          rb.field_b = new je(0L, ew.field_d);
          mb.field_F.a(rb.field_b, 66);
          qf.field_e = new je(0L, uf.field_i, nk.field_t);
          ed.field_e = new je(0L, uf.field_i);
          eu.field_g.a(sb.field_i, 103);
          eu.field_g.a(f.field_C, 79);
          f.field_C.a(mb.field_F, 64);
          f.field_C.a(qf.field_e, 80);
          f.field_C.a(ed.field_e, 123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_19_0 = var5_ref;
          stackIn_19_1 = new StringBuilder().append("st.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    st(jd param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = 19;
          this.field_D = param1;
          this.field_w = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("st.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static d a(String param0, kl param1, kl param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        d stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -2088) {
            st.a(false);
          }
          var5_int = param2.a(param3, param4 ^ -2139);
          var6 = param2.a((byte) 120, var5_int, param0);
          stackIn_4_0 = sp.a(param2, var6, 0, var5_int, param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("st.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_B = "Passwords must be between 5 and 20 letters and numbers";
        field_F = new java.awt.Color(10040319);
        field_y = "Empty";
        field_A = "Spells to affect the balance of power.";
    }
}
