/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class eb extends gl {
    static volatile int field_F;
    static String[] field_J;
    static String field_E;
    static String field_G;
    static String field_B;
    static int field_D;
    static int field_I;
    private boolean field_z;
    private boolean field_H;
    boolean field_A;
    boolean field_C;

    boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 30) {
                break L1;
              } else {
                this.field_H = true;
                break L1;
              }
            }
            L2: {
              if (!this.d(-105)) {
                break L2;
              } else {
                L3: {
                  if (84 == param3) {
                    break L3;
                  } else {
                    if (param3 != 83) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.a(-1, 1, (byte) -2, -1);
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            stackIn_9_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("eb.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final boolean d(int param0) {
        if (param0 >= -103) {
            return false;
        }
        return this.field_H;
    }

    final static void a(int param0, byte param1) {
        int var3 = 79 % ((param1 - 80) / 44);
        uc var2 = di.field_l;
        var2.k(-17410, param0);
        var2.i(1, -106);
        var2.i(2, 73);
    }

    void a(gl param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, 108);
            if (param3 < 25) {
                gl var6 = (gl) null;
                this.a((byte) -51, (gl) null);
            }
            if (this.field_j != 0 && this.field_j != oh.field_f) {
                if (this.a(param2, param1, false, jb.field_b, ef.field_j)) {
                    if (!(oh.field_f != 0)) {
                        this.a(jb.field_b - param1, this.field_j, (byte) -2, ef.field_j - param2);
                    }
                }
                this.a(110, ef.field_j, param1, param2, jb.field_b, param0);
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "eb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 >= -53) {
            return;
        }
        field_B = null;
        field_E = null;
        field_G = null;
        field_J = null;
    }

    boolean a(byte param0, gl param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_A) {
                break L1;
              } else {
                if (!this.field_z) {
                  break L1;
                } else {
                  if (param0 > 2) {
                    L2: {
                      param1.e(-80);
                      this.field_H = true;
                      if (null == this.field_r) {
                        break L2;
                      } else {
                        if (this.field_r instanceof kc) {
                          ((kc) ((Object) this.field_r)).a(true, (gl) (this), this.field_H);
                          break L2;
                        } else {
                          return true;
                        }
                      }
                    }
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_7_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("eb.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final void e(int param0) {
        gl var3;
        if (param0 < 0) {
          if (this.field_H) {
            this.field_H = false;
            if (null != this.field_r) {
              if (this.field_r instanceof kc) {
                ((kc) ((Object) this.field_r)).a(true, (gl) (this), this.field_H);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var3 = (gl) null;
          this.a((gl) null, 7, -73, -28);
          if (this.field_H) {
            this.field_H = false;
            if (null != this.field_r) {
              if (this.field_r instanceof kc) {
                ((kc) ((Object) this.field_r)).a(true, (gl) (this), this.field_H);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_A) {
                break L1;
              } else {
                if (this.a(param3, param2, false, param6, param1)) {
                  L2: {
                    this.a((byte) 11, param5);
                    this.field_j = param4;
                    if (this.field_r == null) {
                      break L2;
                    } else {
                      if (!(this.field_r instanceof ac)) {
                        break L2;
                      } else {
                        ((ac) ((Object) this.field_r)).a(param2, (eb) (this), param4, param1, param3, -32751, param6);
                        break L2;
                      }
                    }
                  }
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param0) {
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("eb.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static void a(ja param0, int param1, int param2) {
        uc var3 = di.field_l;
        if (param1 != 0) {
            return;
        }
        try {
            var3.k(-17410, param2);
            var3.i(param0.field_o, -90);
            var3.i(param0.field_k, 38);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "eb.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    eb(String param0, cj param1, sc param2) {
        super(param0, param1, param2);
        this.field_H = false;
        this.field_z = true;
        this.field_A = true;
    }

    eb(String param0, sc param1) {
        this(param0, vc.field_c.field_n, param1);
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        gl var6 = null;
        StringBuilder stackIn_9_0 = null;
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
              if (param0 == 34) {
                break L1;
              } else {
                var6 = (gl) null;
                this.a((byte) 48, (gl) null);
                break L1;
              }
            }
            L2: {
              if (this.a(param1, param3, -110, param2)) {
                L3: {
                  this.a(param3, param2, (byte) 27, param1);
                  if (!this.field_C) {
                    break L3;
                  } else {
                    discarded$2 = param1.append(" active");
                    break L3;
                  }
                }
                if (this.field_A) {
                  break L2;
                } else {
                  discarded$3 = param1.append(" disabled");
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackIn_9_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("eb.KA(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        try {
            if (null != this.field_r && this.field_r instanceof ac) {
                ((ac) ((Object) this.field_r)).a(param3, param1, -110, param4, param2, (eb) (this));
            }
            if (param0 < 36) {
                gl var8 = (gl) null;
                this.a('￐', (gl) null, 48, -89);
            }
            this.field_j = 0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "eb.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    protected eb() {
        this.field_H = false;
        this.field_z = true;
        this.field_A = true;
        this.field_l = vc.field_c.field_e;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (this.field_r != null) {
          if (this.field_r instanceof n) {
            ((n) ((Object) this.field_r)).a((eb) (this), param3, param1, param0, -87);
            if (param2 != -2) {
              this.a(-10, 84, (byte) 118, 88);
              return;
            } else {
              return;
            }
          } else {
            if (param2 != -2) {
              this.a(-10, 84, (byte) 118, 88);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 != -2) {
            this.a(-10, 84, (byte) 118, 88);
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_F = 0;
        field_E = "Password: ";
        field_J = new String[]{"Get a soldier to 90% accuracy", "Get a soldier to 90 health points", "Get a soldier to 10 kills", "Get a soldier to 25 kills", "Progress a soldier to captain", "Complete a mission after ACT I with no injuries", "Complete a mission after ACT I just using grenades", "Complete a mission after ACT I using high explosive weapons only (not grenades)", "Complete a mission after ACT I using just pistols", "Complete ACT I", "Complete ACT II", "Complete ACT III", "Complete ACT IV", "Complete the game using no researched technology", "Complete the game without recruiting any new soldiers on normal difficulty", "Complete the game on hard difficulty", "Defeat the zombie hordes within the city during the Hallowe'en holiday"};
        field_G = "Select mission";
    }
}
