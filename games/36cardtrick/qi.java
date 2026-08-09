/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qi extends qg {
    private int field_H;
    private boolean field_E;
    private int field_G;
    static de field_A;
    private int field_C;
    static String field_F;
    private int field_B;
    private boolean field_J;
    static kc field_D;

    final StringBuilder a(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param3, param2, param1, param0)) {
                this.a(param0, (byte) -16, param3, param2);
                this.a(param3, param0, true, param2);
                discarded$0 = param3.append(" revert=").append(this.field_E);
                if (2147483647 == this.field_B) {
                  break L1;
                } else {
                  if (this.field_H == 2147483647) {
                    break L1;
                  } else {
                    discarded$1 = param3.append(" to ").append(this.field_B).append(',').append(this.field_H);
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            stackIn_10_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("qi.V(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_19_2 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(byte param0, qk param1) {
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        String stackIn_146_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              sd.field_a = param1;
              var2 = wf.a("achievements_names,0", -19073);
              if (null == var2) {
                break L1;
              } else {
                ge.field_b[0] = ge.a(var2, (byte) 109);
                break L1;
              }
            }
            L2: {
              var2 = wf.a("achievements_names,1", -19073);
              if (var2 != null) {
                ge.field_b[1] = ge.a(var2, (byte) 94);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2 = wf.a("achievements_names,2", -19073);
              if (null != var2) {
                ge.field_b[2] = ge.a(var2, (byte) 121);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2 = wf.a("achievements_names,3", -19073);
              if (null == var2) {
                break L4;
              } else {
                ge.field_b[3] = ge.a(var2, (byte) 86);
                break L4;
              }
            }
            L5: {
              var2 = wf.a("achievements_names,4", -19073);
              if (var2 == null) {
                break L5;
              } else {
                ge.field_b[4] = ge.a(var2, (byte) 97);
                break L5;
              }
            }
            L6: {
              var2 = wf.a("achievements_names,5", -19073);
              if (null != var2) {
                ge.field_b[5] = ge.a(var2, (byte) 82);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var2 = wf.a("achievements_names,6", -19073);
              if (null == var2) {
                break L7;
              } else {
                ge.field_b[6] = ge.a(var2, (byte) 93);
                break L7;
              }
            }
            L8: {
              var2 = wf.a("achievements_names,7", -19073);
              if (null == var2) {
                break L8;
              } else {
                ge.field_b[7] = ge.a(var2, (byte) 89);
                break L8;
              }
            }
            L9: {
              var2 = wf.a("achievements_names,8", -19073);
              if (var2 == null) {
                break L9;
              } else {
                ge.field_b[8] = ge.a(var2, (byte) 120);
                break L9;
              }
            }
            L10: {
              var2 = wf.a("achievements_names,9", -19073);
              if (var2 == null) {
                break L10;
              } else {
                ge.field_b[9] = ge.a(var2, (byte) 83);
                break L10;
              }
            }
            L11: {
              var2 = wf.a("achievements_names,10", -19073);
              if (var2 != null) {
                ge.field_b[10] = ge.a(var2, (byte) 85);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var2 = wf.a("achievements_names,11", -19073);
              if (var2 == null) {
                break L12;
              } else {
                ge.field_b[11] = ge.a(var2, (byte) 86);
                break L12;
              }
            }
            L13: {
              var2 = wf.a("achievements_names,12", -19073);
              if (var2 != null) {
                ge.field_b[12] = ge.a(var2, (byte) 119);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2 = wf.a("achievements_names,13", -19073);
              if (var2 != null) {
                ge.field_b[13] = ge.a(var2, (byte) 82);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var2 = wf.a("achievements_names,14", -19073);
              if (null != var2) {
                ge.field_b[14] = ge.a(var2, (byte) 107);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var2 = wf.a("achievements_crit,0", -19073);
              if (var2 == null) {
                break L16;
              } else {
                lk.field_u[0] = ge.a(var2, (byte) 82);
                break L16;
              }
            }
            L17: {
              var2 = wf.a("achievements_crit,1", -19073);
              if (var2 != null) {
                lk.field_u[1] = ge.a(var2, (byte) 111);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2 = wf.a("achievements_crit,2", -19073);
              if (var2 != null) {
                lk.field_u[2] = ge.a(var2, (byte) 97);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              var2 = wf.a("achievements_crit,3", -19073);
              if (null == var2) {
                break L19;
              } else {
                lk.field_u[3] = ge.a(var2, (byte) 90);
                break L19;
              }
            }
            L20: {
              var2 = wf.a("achievements_crit,4", -19073);
              if (null == var2) {
                break L20;
              } else {
                lk.field_u[4] = ge.a(var2, (byte) 115);
                break L20;
              }
            }
            L21: {
              var2 = wf.a("achievements_crit,5", -19073);
              if (null == var2) {
                break L21;
              } else {
                lk.field_u[5] = ge.a(var2, (byte) 111);
                break L21;
              }
            }
            L22: {
              var2 = wf.a("achievements_crit,6", -19073);
              if (null == var2) {
                break L22;
              } else {
                lk.field_u[6] = ge.a(var2, (byte) 124);
                break L22;
              }
            }
            L23: {
              var2 = wf.a("achievements_crit,7", -19073);
              if (var2 == null) {
                break L23;
              } else {
                lk.field_u[7] = ge.a(var2, (byte) 85);
                break L23;
              }
            }
            L24: {
              var3 = 56 % ((1 - param0) / 55);
              var2 = wf.a("achievements_crit,8", -19073);
              if (null == var2) {
                break L24;
              } else {
                lk.field_u[8] = ge.a(var2, (byte) 84);
                break L24;
              }
            }
            L25: {
              var2 = wf.a("achievements_crit,9", -19073);
              if (null != var2) {
                lk.field_u[9] = ge.a(var2, (byte) 105);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2 = wf.a("achievements_crit,10", -19073);
              if (var2 == null) {
                break L26;
              } else {
                lk.field_u[10] = ge.a(var2, (byte) 101);
                break L26;
              }
            }
            L27: {
              var2 = wf.a("achievements_crit,11", -19073);
              if (var2 != null) {
                lk.field_u[11] = ge.a(var2, (byte) 93);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var2 = wf.a("achievements_crit,12", -19073);
              if (null == var2) {
                break L28;
              } else {
                lk.field_u[12] = ge.a(var2, (byte) 91);
                break L28;
              }
            }
            L29: {
              var2 = wf.a("achievements_crit,13", -19073);
              if (var2 == null) {
                break L29;
              } else {
                lk.field_u[13] = ge.a(var2, (byte) 79);
                break L29;
              }
            }
            L30: {
              var2 = wf.a("achievements_crit,14", -19073);
              if (var2 == null) {
                break L30;
              } else {
                lk.field_u[14] = ge.a(var2, (byte) 126);
                break L30;
              }
            }
            L31: {
              var2 = wf.a("coins", -19073);
              if (var2 != null) {
                ge.a(var2, (byte) 82);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2 = wf.a("easy", -19073);
              if (var2 == null) {
                break L32;
              } else {
                rf.field_e = ge.a(var2, (byte) 127);
                break L32;
              }
            }
            L33: {
              var2 = wf.a("hard", -19073);
              if (var2 != null) {
                sg.field_e = ge.a(var2, (byte) 117);
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              var2 = wf.a("level", -19073);
              if (null != var2) {
                vk.field_j = ge.a(var2, (byte) 93);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2 = wf.a("misses", -19073);
              if (null == var2) {
                break L35;
              } else {
                tj.field_D = ge.a(var2, (byte) 122);
                break L35;
              }
            }
            L36: {
              var2 = wf.a("score", -19073);
              if (var2 == null) {
                break L36;
              } else {
                ti.field_b = ge.a(var2, (byte) 109);
                break L36;
              }
            }
            L37: {
              var2 = wf.a("time", -19073);
              if (null == var2) {
                break L37;
              } else {
                uc.field_o = ge.a(var2, (byte) 103);
                break L37;
              }
            }
            L38: {
              var2 = wf.a("instructions_text", -19073);
              if (var2 == null) {
                break L38;
              } else {
                rc.field_n = ge.a(var2, (byte) 98);
                break L38;
              }
            }
            L39: {
              var2 = wf.a("login_create", -19073);
              if (null != var2) {
                dd.field_e = ge.a(var2, (byte) 117);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2 = wf.a("empty_string", -19073);
              if (var2 != null) {
                Main.field_y = ge.a(var2, (byte) 87);
                break L40;
              } else {
                break L40;
              }
            }
            L41: {
              var2 = wf.a("fps_label", -19073);
              if (null != var2) {
                cd.field_f = ge.a(var2, (byte) 78);
                break L41;
              } else {
                break L41;
              }
            }
            sd.field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L42: {
            var2_ref = decompiledCaughtException;
            stackIn_145_0 = (RuntimeException) (var2_ref);

            stackIn_145_1 = new StringBuilder().append("qi.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_146_0 = (RuntimeException) ((Object) stackIn_145_0);
              stackIn_146_1 = (StringBuilder) ((Object) stackIn_145_1);
              stackIn_146_2 = "null";
              break L42;
            } else {
              stackIn_146_0 = (RuntimeException) ((Object) stackIn_145_0);
              stackIn_146_1 = (StringBuilder) ((Object) stackIn_145_1);
              stackIn_146_2 = "{...}";
              break L42;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_146_0), stackIn_146_2 + ')');
        }
    }

    final void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.a(param0, param1, param2, param3, param4, param5);
            if (!param0) {
              this.field_x = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("qi.O(").append(param0).append(',');

            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static qk a(boolean param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        qk stackIn_2_0 = null;
        qk stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 == 2147483647) {
              stackIn_4_0 = lf.a(param0, param3, param2, param1, (byte) -70, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (qk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "qi.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void d(byte param0) {
        field_A = null;
        field_D = null;
        if (param0 <= 11) {
            return;
        }
        try {
            field_F = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "qi.I(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, -54, param4, param5, param6) ? 1 : 0;
              if (param3 <= -14) {
                break L1;
              } else {
                field_A = (de) null;
                break L1;
              }
            }
            L2: {
              if (var8_int == 0) {
                break L2;
              } else {
                if (!this.field_J) {
                  break L2;
                } else {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!this.a(-59, param0, param6, param2, param1)) {
              stackIn_19_0 = var8_int;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L3: {
                this.field_x = param5;
                if (param5 == 1) {
                  this.field_C = -param0 + (param2 - this.field_o);
                  sh.field_i = (qi) (this);
                  this.field_G = -this.field_i + (param6 + -param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              stackIn_17_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var8);

            stackIn_23_1 = new StringBuilder().append("qi.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        Object stackIn_29_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_y instanceof hl)) {
                    break L3;
                  } else {
                    if (!((hl) ((Object) this.field_y)).field_B) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_x != 1) {
                  break L2;
                } else {
                  L4: {
                    L5: {
                      var5_int = -this.field_C + eg.field_b - param1;
                      var6 = ij.field_e + (-this.field_G - param0);
                      if (var5_int != this.field_o) {
                        break L5;
                      } else {
                        if (var6 == this.field_i) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.field_i = var6;
                    this.field_o = var5_int;
                    if (!(this.field_k instanceof o)) {
                      break L4;
                    } else {
                      ((o) ((Object) this.field_k)).a(param1, 32747, param0, (qi) (this));
                      break L4;
                    }
                  }
                  if (Main.field_T == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (!this.field_E) {
                break L1;
              } else {
                L6: {
                  if ((this.field_B ^ -1) != (this.field_o ^ -1)) {
                    L7: {
                      var5_int = this.field_B + -this.field_o;
                      stackIn_32_0 = this;

                      stackIn_32_1 = this.field_o;

                      if ((Math.abs(var5_int) ^ -1) < -3) {
                        stackIn_33_0 = this;
                        stackIn_33_1 = stackIn_32_1;
                        stackIn_33_2 = var5_int >> -1255491743;
                        break L7;
                      } else {
                        stackIn_31_0 = this;

                        if (var5_int > 0) {
                          stackIn_33_0 = this;
                          stackIn_33_1 = stackIn_32_1;
                          stackIn_33_2 = 1;
                          break L7;
                        } else {
                          stackIn_29_0 = this;

                          stackIn_33_0 = this;
                          stackIn_33_1 = stackIn_32_1;
                          stackIn_33_2 = -1;
                          break L7;
                        }
                      }
                    }
                    ((qi) (this)).field_o = stackIn_33_1 + stackIn_33_2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (this.field_H == this.field_i) {
                  break L1;
                } else {
                  L8: {
                    var5_int = -this.field_i + this.field_H;
                    stackIn_42_0 = this;

                    stackIn_42_1 = this.field_i;

                    if (2 < Math.abs(var5_int)) {
                      stackIn_43_0 = this;
                      stackIn_43_1 = stackIn_42_1;
                      stackIn_43_2 = var5_int >> 775613345;
                      break L8;
                    } else {
                      stackIn_41_0 = this;

                      if (-1 <= (var5_int ^ -1)) {
                        stackIn_43_0 = this;
                        stackIn_43_1 = stackIn_42_1;
                        stackIn_43_2 = -1;
                        break L8;
                      } else {
                        stackIn_39_0 = this;

                        stackIn_43_0 = this;
                        stackIn_43_1 = stackIn_42_1;
                        stackIn_43_2 = 1;
                        break L8;
                      }
                    }
                  }
                  ((qi) (this)).field_i = stackIn_43_1 + stackIn_43_2;
                  break L1;
                }
              }
            }
            L9: {
              if (param3 == 3) {
                break L9;
              } else {
                this.a(36, 104, (lk) null, -63);
                break L9;
              }
            }
            super.a(param0, param1, param2, param3 ^ 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var5);

            stackIn_52_1 = new StringBuilder().append("qi.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L10;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L10;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param3 + ')');
        }
    }

    final void h(int param0) {
        try {
            super.h(param0);
            this.field_y.a(this.field_q, 0, this.field_h, 0, true);
            this.field_B = this.field_o;
            this.field_H = this.field_i;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "qi.H(" + param0 + ')');
        }
    }

    private qi(int param0, int param1, int param2, int param3, ci param4, pl param5, lk param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_H = 2147483647;
        this.field_B = 2147483647;
        try {
          L0: {
            this.field_E = param7;
            this.field_y = param6;
            this.field_J = param8;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("qi.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_15_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_F = "This password contains your Player Name, and would be easy to guess";
        field_A = new de(9, 0, 4, 1);
    }
}
