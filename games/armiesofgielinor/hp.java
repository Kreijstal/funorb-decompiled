/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends oj {
    int field_y;
    int field_D;
    private boolean field_z;
    static wk field_A;
    private boolean field_B;

    final static void a(li param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        bv var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = vl.field_n;
              var5.h(32161, param1);
              var5.field_q = var5.field_q + 1;
              var4 = var5.field_q;
              var5.b(1, 1);
              if (null == param0.field_l) {
                var5.b(param2 + -25521, 0);
                break L1;
              } else {
                var5.b(1, param0.field_l.length);
                var5.a(param0.field_l, 0, param0.field_l.length, 86);
                break L1;
              }
            }
            var5.b((byte) -39, var4);
            var5.field_q = var5.field_q - 4;
            param0.field_o = var5.i(param2 ^ 25523);
            var5.e(-var4 + var5.field_q, 5930);
            if (param2 == 25522) {
              break L0;
            } else {
              field_A = (wk) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("hp.B(");

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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void g(int param0) {
        field_A = null;
        if (param0 >= -80) {
            field_A = (wk) null;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        String var5 = null;
        nn stackIn_6_0 = null;
        nn stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param2.field_xb, -26661);
              if (param1 <= -84) {
                break L1;
              } else {
                var5 = (String) null;
                hp.a((int[]) null, (int[]) null, (String) null, 40);
                break L1;
              }
            }
            L2: {
              if (param2.field_T != null) {
                L3: {
                  stackIn_6_0 = param2.field_vb;

                  if (null != param2.field_oc) {
                    stackIn_7_0 = (nn) ((Object) stackIn_6_0);
                    stackIn_7_1 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = (nn) ((Object) stackIn_6_0);
                    stackIn_7_1 = 1;
                    break L3;
                  }
                }
                ((nn) (Object) stackIn_7_0).a(stackIn_7_1 != 0, 32, param2.field_q, param2.field_T, param2.field_vb.field_y, param2.field_vb.field_p);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_9_0 = this.a((byte) -39, param2, param0, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("hp.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final String a(byte param0, boolean param1) {
        int var3;
        String var4;
        if (param1) {
          System.out.println("Death event debug");
          System.out.println("Unit at " + this.field_y + "," + this.field_D);
          if (!this.field_z) {
            var3 = 58 / ((53 - param0) / 51);
            var4 = "EventDeath: pos: (" + this.field_y + "," + this.field_D + ")";
            return var4;
          } else {
            System.out.println("Bones devoured");
            var3 = 58 / ((53 - param0) / 51);
            var4 = "EventDeath: pos: (" + this.field_y + "," + this.field_D + ")";
            return var4;
          }
        } else {
          var3 = 58 / ((53 - param0) / 51);
          var4 = "EventDeath: pos: (" + this.field_y + "," + this.field_D + ")";
          return var4;
        }
    }

    hp(int param0, int param1) {
        this.field_B = false;
        this.field_z = false;
        this.field_y = param0;
        this.field_D = param1;
        this.field_m = 10;
        this.field_w = null;
    }

    final static wk a(int[] param0, int[] param1, String param2, int param3) {
        RuntimeException var4 = null;
        wk stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            no.field_P.field_v = qn.field_g;
            no.field_P.field_B = qn.field_d;
            no.field_P.field_y = qn.field_l;
            ku.field_J.b();
            qn.b();
            dm.a(-1, -1, param1, -1, false, param0, -1, false, 0, false, 0, param2);
            no.field_P.b();
            if (param3 == 17813) {
              stackIn_4_0 = ew.a((byte) 107, ku.field_J);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("hp.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (wk) ((Object) stackIn_4_0);
        }
    }

    hp(jd param0) {
        this.field_B = false;
        try {
            this.field_D = param0.field_w;
            this.field_y = param0.field_J;
            this.field_w = param0;
            this.field_m = 10;
            this.field_z = false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        jd stackIn_8_0 = null;
        jd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.field_B) {
              L1: {
                this.field_B = true;
                if (null == this.field_w) {
                  this.field_w = param0.c(this.field_D, true, this.field_y);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.field_w == null) {
                  break L2;
                } else {
                  L3: {
                    stackIn_8_0 = this.field_w;

                    if (this.field_z) {
                      stackIn_9_0 = (jd) ((Object) stackIn_8_0);
                      stackIn_9_1 = 0;
                      break L3;
                    } else {
                      stackIn_9_0 = (jd) ((Object) stackIn_8_0);
                      stackIn_9_1 = 1;
                      break L3;
                    }
                  }
                  ((jd) (Object) stackIn_9_0).a(stackIn_9_1 != 0, (byte) 105);
                  break L2;
                }
              }
              hf.a(param0, (byte) 9, true);
              if (param1 == -26661) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_A = (wk) null;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("hp.G(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    hp(jd param0, boolean param1) {
        this.field_B = false;
        try {
            this.field_z = param1 ? true : false;
            this.field_m = 10;
            this.field_D = param0.field_w;
            this.field_y = param0.field_J;
            this.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
