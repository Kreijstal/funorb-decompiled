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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 30) {
                break L1;
              } else {
                ((eb) this).field_H = true;
                break L1;
              }
            }
            L2: {
              if (!((eb) this).d(-105)) {
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
                ((eb) this).a(-1, 1, (byte) -2, -1);
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("eb.K(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final boolean d(int param0) {
        if (param0 >= -103) {
            return false;
        }
        return ((eb) this).field_H;
    }

    final static void a(int param0, byte param1) {
        int var3 = 79 % ((param1 - 80) / 44);
        uc var2 = di.field_l;
        var2.k(-17410, param0);
        var2.i(1, -106);
        var2.i(2, 73);
    }

    void a(gl param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        Object var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, 108);
              if (param3 >= 25) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$2 = ((eb) this).a((byte) -51, (gl) null);
                break L1;
              }
            }
            L2: {
              if (((eb) this).field_j == 0) {
                break L2;
              } else {
                if (((eb) this).field_j == oh.field_f) {
                  break L2;
                } else {
                  L3: {
                    if (!((eb) this).a(param2, param1, false, jb.field_b, ef.field_j)) {
                      break L3;
                    } else {
                      if (oh.field_f == 0) {
                        ((eb) this).a(jb.field_b - param1, ((eb) this).field_j, (byte) -2, ef.field_j - param2);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((eb) this).a(110, ef.field_j, param1, param2, jb.field_b, param0);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("eb.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void e(byte param0) {
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (!((eb) this).field_A) {
                break L1;
              } else {
                if (!((eb) this).field_z) {
                  break L1;
                } else {
                  if (param0 > 2) {
                    L2: {
                      param1.e(-80);
                      ((eb) this).field_H = true;
                      if (null == ((eb) this).field_r) {
                        break L2;
                      } else {
                        if (((eb) this).field_r instanceof kc) {
                          ((kc) (Object) ((eb) this).field_r).a(true, (gl) this, ((eb) this).field_H);
                          break L2;
                        } else {
                          return true;
                        }
                      }
                    }
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("eb.F(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void e(int param0) {
        Object var3 = null;
        if (param0 < 0) {
          if (((eb) this).field_H) {
            ((eb) this).field_H = false;
            if (null != ((eb) this).field_r) {
              if (((eb) this).field_r instanceof kc) {
                ((kc) (Object) ((eb) this).field_r).a(true, (gl) this, ((eb) this).field_H);
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
          var3 = null;
          ((eb) this).a((gl) null, 7, -73, -28);
          if (((eb) this).field_H) {
            ((eb) this).field_H = false;
            if (null != ((eb) this).field_r) {
              if (((eb) this).field_r instanceof kc) {
                ((kc) (Object) ((eb) this).field_r).a(true, (gl) this, ((eb) this).field_H);
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!((eb) this).field_A) {
                break L1;
              } else {
                if (((eb) this).a(param3, param2, false, param6, param1)) {
                  L2: {
                    boolean discarded$2 = ((eb) this).a((byte) 11, param5);
                    ((eb) this).field_j = param4;
                    if (((eb) this).field_r == null) {
                      break L2;
                    } else {
                      if (!(((eb) this).field_r instanceof ac)) {
                        break L2;
                      } else {
                        ((ac) (Object) ((eb) this).field_r).a(param2, (eb) this, param4, param1, param3, -32751, param6);
                        break L2;
                      }
                    }
                  }
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            if (!param0) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("eb.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param6 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final static void a(ja param0, int param1, int param2) {
        uc var3 = di.field_l;
        try {
            var3.k(-17410, 7);
            var3.i(param0.field_o, -90);
            var3.i(param0.field_k, 38);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "eb.NA(" + (param0 != null ? "{...}" : "null") + ',' + 0 + ',' + 7 + ')');
        }
    }

    eb(String param0, cj param1, sc param2) {
        super(param0, param1, param2);
        ((eb) this).field_H = false;
        ((eb) this).field_z = true;
        ((eb) this).field_A = true;
    }

    eb(String param0, sc param1) {
        this(param0, vc.field_c.field_n, param1);
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 34) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$6 = ((eb) this).a((byte) 48, (gl) null);
                break L1;
              }
            }
            L2: {
              if (((eb) this).a(param1, param3, -110, param2)) {
                L3: {
                  ((eb) this).a(param3, param2, (byte) 27, param1);
                  if (!((eb) this).field_C) {
                    break L3;
                  } else {
                    StringBuilder discarded$7 = param1.append(" active");
                    break L3;
                  }
                }
                if (((eb) this).field_A) {
                  break L2;
                } else {
                  StringBuilder discarded$8 = param1.append(" disabled");
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackOut_8_0 = (StringBuilder) param1;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("eb.KA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        try {
            if (null != ((eb) this).field_r) {
                if (((eb) this).field_r instanceof ac) {
                    ((ac) (Object) ((eb) this).field_r).a(param3, param1, -110, param4, param2, (eb) this);
                }
            }
            if (param0 < 36) {
                Object var8 = null;
                boolean discarded$0 = ((eb) this).a('￐', (gl) null, 48, -89);
            }
            ((eb) this).field_j = 0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "eb.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    protected eb() {
        ((eb) this).field_H = false;
        ((eb) this).field_z = true;
        ((eb) this).field_A = true;
        ((eb) this).field_l = vc.field_c.field_e;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (((eb) this).field_r != null) {
          if (((eb) this).field_r instanceof n) {
            ((n) (Object) ((eb) this).field_r).a((eb) this, param3, param1, param0, -87);
            if (param2 != -2) {
              ((eb) this).a(-10, 84, (byte) 118, 88);
              return;
            } else {
              return;
            }
          } else {
            if (param2 != -2) {
              ((eb) this).a(-10, 84, (byte) 118, 88);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 != -2) {
            ((eb) this).a(-10, 84, (byte) 118, 88);
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 0;
        field_E = "Password: ";
        field_J = new String[]{"Get a soldier to 90% accuracy", "Get a soldier to 90 health points", "Get a soldier to 10 kills", "Get a soldier to 25 kills", "Progress a soldier to captain", "Complete a mission after ACT I with no injuries", "Complete a mission after ACT I just using grenades", "Complete a mission after ACT I using high explosive weapons only (not grenades)", "Complete a mission after ACT I using just pistols", "Complete ACT I", "Complete ACT II", "Complete ACT III", "Complete ACT IV", "Complete the game using no researched technology", "Complete the game without recruiting any new soldiers on normal difficulty", "Complete the game on hard difficulty", "Defeat the zombie hordes within the city during the Hallowe'en holiday"};
        field_G = "Select mission";
    }
}
