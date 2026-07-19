/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends oj {
    private int field_y;
    int field_Q;
    static int[] field_L;
    boolean field_N;
    private boolean field_E;
    boolean field_M;
    int field_G;
    int field_K;
    int field_D;
    int field_R;
    static int[] field_A;
    static je field_I;
    boolean field_J;
    private int field_z;
    int field_F;
    static int field_P;
    int field_B;
    static String field_O;
    private int field_H;

    public static void e(byte param0) {
        field_A = null;
        if (param0 >= -122) {
          field_O = (String) null;
          field_O = null;
          field_L = null;
          field_I = null;
          return;
        } else {
          field_O = null;
          field_L = null;
          field_I = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        bv var3 = null;
        var3 = vl.field_n;
        var3.h(32161, param0);
        var3.b(1, 3);
        var3.b(1, 8);
        if (param1 > -41) {
          ag.e((byte) 75);
          var3.b(true, param2);
          return;
        } else {
          var3.b(true, param2);
          return;
        }
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        var4 = -122 / ((53 - param0) / 51);
        if (!param1) {
          var3 = "EventCombat: creature: " + this.field_z + ", com:(" + this.field_Q + "," + this.field_G + ")" + ", att:(" + this.field_F + "," + this.field_B + ")" + ", dam:(" + this.field_K + "," + this.field_R + ")" + "\n" + "die:(" + this.field_N + "," + this.field_M + ")" + ", count:(" + this.field_H + "," + this.field_y + ")" + ", deployed:(" + this.field_J + "," + this.field_E + ")" + ", battleid:" + this.field_D;
          return var3;
        } else {
          L0: {
            System.out.println("Combat event debug");
            System.out.println("Attacker at " + this.field_Q + "," + this.field_G);
            System.out.println("Attacks " + (this.field_Q + this.field_F) + "," + (this.field_G + this.field_B));
            System.out.println("Attacker deals " + this.field_K + " damage");
            System.out.println("Defender deals " + this.field_R + " damage");
            if (!this.field_N) {
              break L0;
            } else {
              System.out.println("Attacker dies");
              break L0;
            }
          }
          L1: {
            if (!this.field_M) {
              break L1;
            } else {
              System.out.println("Defender dies");
              break L1;
            }
          }
          System.out.println(this.field_H + " attackers in anim");
          System.out.println(this.field_y + " defenders in anim");
          System.out.println("Unseen type is" + this.field_z);
          var3 = "EventCombat: creature: " + this.field_z + ", com:(" + this.field_Q + "," + this.field_G + ")" + ", att:(" + this.field_F + "," + this.field_B + ")" + ", dam:(" + this.field_K + "," + this.field_R + ")" + "\n" + "die:(" + this.field_N + "," + this.field_M + ")" + ", count:(" + this.field_H + "," + this.field_y + ")" + ", deployed:(" + this.field_J + "," + this.field_E + ")" + ", battleid:" + this.field_D;
          return var3;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        jd var5 = null;
        jd var6 = null;
        int stackIn_32_0 = 0;
        boolean stackIn_34_0 = false;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_33_0 = false;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        try {
          L0: {
            L1: {
              var6 = param2.field_xb.c(this.field_G, true, this.field_Q);
              if (param1 <= -84) {
                break L1;
              } else {
                this.field_G = -99;
                break L1;
              }
            }
            L2: {
              L3: {
                var5 = param2.field_xb.c(this.field_B + this.field_G, true, this.field_Q - -this.field_F);
                if (this.field_B * this.field_B + this.field_F * this.field_F != 1) {
                  break L3;
                } else {
                  L4: {
                    if (var6 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (this.field_F > 0) {
                          var6.e(74, 1280);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (this.field_B > 0) {
                          var6.e(-118, 1792);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if ((this.field_F ^ -1) <= -1) {
                          break L7;
                        } else {
                          var6.e(-127, 256);
                          break L7;
                        }
                      }
                      if ((this.field_B ^ -1) > -1) {
                        var6.e(-122, 768);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var5 != null) {
                    L8: {
                      if (-1 <= (this.field_F ^ -1)) {
                        break L8;
                      } else {
                        var5.e(72, 256);
                        break L8;
                      }
                    }
                    L9: {
                      if ((this.field_B ^ -1) < -1) {
                        var5.e(-117, 768);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (-1 < (this.field_F ^ -1)) {
                        var5.e(-121, 1280);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    if ((this.field_B ^ -1) > -1) {
                      var5.e(3, 1792);
                      if (!ArmiesOfGielinor.field_M) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (var6 == null) {
                break L2;
              } else {
                var6.e(118, 2048 - (int)(2048.0 * Math.atan2((double)this.field_B, (double)(-this.field_F)) / 3.141592653589793 / 2.0) - -256 & 2047);
                break L2;
              }
            }
            param2.d(this.field_D, 4);
            if (!uc.field_a) {
              stackOut_33_0 = this.a((byte) -39, param2, param0, true);
              stackIn_34_0 = stackOut_33_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param2.e(this.field_D, -56);
              this.a(param2.field_xb, -26661);
              param2.a(true, var6);
              this.c((byte) -125);
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var4);
            stackOut_35_1 = new StringBuilder().append("ag.A(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L11;
            }
          }
          L12: {
            stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param1).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_32_0 != 0;
        } else {
          return stackIn_34_0;
        }
    }

    final void a(ha param0, int param1) {
        RuntimeException runtimeException = null;
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
              param0.a(this.field_G, this.field_F, this.field_N, this.field_Q, this.field_B, 111, this.field_M, this.field_K, this.field_R, this.field_z);
              hf.a(param0, (byte) 9, true);
              if (param1 == -26661) {
                break L1;
              } else {
                this.field_B = -38;
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
            stackOut_3_1 = new StringBuilder().append("ag.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static java.applet.Applet d(byte param0) {
        if (null != la.field_g) {
            return la.field_g;
        }
        int var1 = 90 % ((param0 - -67) / 44);
        return (java.applet.Applet) ((Object) lr.field_a);
    }

    ag(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, boolean param8, int param9, int param10, boolean param11, boolean param12, int param13) {
        this.field_m = 1;
        this.field_K = param5;
        this.field_D = param13;
        this.field_J = param11 ? true : false;
        this.field_y = param10;
        this.field_G = param2;
        this.field_F = param3;
        this.field_N = param7 ? true : false;
        this.field_R = param6;
        this.field_E = param12 ? true : false;
        this.field_H = param9;
        this.field_M = param8 ? true : false;
        this.field_z = param0;
        this.field_B = param4;
        this.field_Q = param1;
    }

    static {
        field_L = new int[4];
        field_A = new int[5];
        field_O = "To Customer Support";
        field_P = 0;
    }
}
