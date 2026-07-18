/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static lb field_j;
    static int field_e;
    static String[] field_i;
    private ck[] field_d;
    static String field_f;
    static String field_h;
    static wk field_k;
    private ck field_a;
    private int field_b;
    private int field_g;
    private ck field_c;

    public static void c(int param0) {
        field_h = null;
        int var1 = 54 / ((-11 - param0) / 35);
        field_k = null;
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final void a(long param0, ck param1, int param2) {
        ck var5 = null;
        try {
            if (param1.field_i != null) {
                param1.b(param2 + 1820);
            }
            var5 = ((uh) this).field_d[(int)(param0 & (long)(((uh) this).field_b - 1))];
            param1.field_i = var5.field_i;
            param1.field_k = var5;
            param1.field_i.field_k = param1;
            if (param2 != -1816) {
                uh.c(30);
            }
            param1.field_j = param0;
            param1.field_k.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "uh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        ca.field_r = null;
        dl.field_L = null;
        rl.field_a = null;
        ba.field_d = null;
        oa.field_M = null;
        le.field_L = null;
    }

    final ck a(byte param0) {
        int var3 = 0;
        ck var4 = null;
        ck var35 = null;
        ck var36 = null;
        ck var37 = null;
        ck var38 = null;
        ck var41 = null;
        var3 = SteelSentinels.field_G;
        if (param0 > 92) {
          if (((uh) this).field_g > 0) {
            if (((uh) this).field_a == ((uh) this).field_d[-1 + ((uh) this).field_g]) {
              L0: while (true) {
                if (((uh) this).field_g < ((uh) this).field_b) {
                  int fieldTemp$4 = ((uh) this).field_g;
                  ((uh) this).field_g = ((uh) this).field_g + 1;
                  var38 = ((uh) this).field_d[fieldTemp$4].field_k;
                  if (((uh) this).field_d[((uh) this).field_g - 1] != var38) {
                    ((uh) this).field_a = var38.field_k;
                    return var38;
                  } else {
                    continue L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var41 = ((uh) this).field_a;
              ((uh) this).field_a = var41.field_k;
              return var41;
            }
          } else {
            L1: while (true) {
              if (((uh) this).field_g < ((uh) this).field_b) {
                int fieldTemp$5 = ((uh) this).field_g;
                ((uh) this).field_g = ((uh) this).field_g + 1;
                var37 = ((uh) this).field_d[fieldTemp$5].field_k;
                if (((uh) this).field_d[((uh) this).field_g - 1] != var37) {
                  ((uh) this).field_a = var37.field_k;
                  return var37;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          ((uh) this).field_d = null;
          if (((uh) this).field_g > 0) {
            if (((uh) this).field_a != ((uh) this).field_d[-1 + ((uh) this).field_g]) {
              var35 = ((uh) this).field_a;
              ((uh) this).field_a = var35.field_k;
              return var35;
            } else {
              L2: while (true) {
                if (((uh) this).field_g < ((uh) this).field_b) {
                  int fieldTemp$6 = ((uh) this).field_g;
                  ((uh) this).field_g = ((uh) this).field_g + 1;
                  var36 = ((uh) this).field_d[fieldTemp$6].field_k;
                  if (((uh) this).field_d[((uh) this).field_g - 1] != var36) {
                    ((uh) this).field_a = var36.field_k;
                    return var36;
                  } else {
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L3: while (true) {
              if (((uh) this).field_g < ((uh) this).field_b) {
                int fieldTemp$7 = ((uh) this).field_g;
                ((uh) this).field_g = ((uh) this).field_g + 1;
                var4 = ((uh) this).field_d[fieldTemp$7].field_k;
                if (((uh) this).field_d[((uh) this).field_g - 1] != var4) {
                  ((uh) this).field_a = var4.field_k;
                  return var4;
                } else {
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = param1 >> 31 & -1 + param2;
        return var3 + (param1 - -(param1 >>> 31)) % param2;
    }

    final static void a(int param0, wk[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              jb.field_S = param1;
              if (null == jb.field_S) {
                break L1;
              } else {
                if (param1.length < 3) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("uh.H(").append(1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final ck b(int param0) {
        ((uh) this).field_g = param0;
        return ((uh) this).a((byte) 113);
    }

    final ck a(long param0, int param1) {
        ck var4 = null;
        ck var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        var4 = ((uh) this).field_d[(int)(param0 & (long)(-1 + ((uh) this).field_b))];
        ((uh) this).field_c = var4.field_k;
        L0: while (true) {
          if (var4 == ((uh) this).field_c) {
            if (param1 < 122) {
              return null;
            } else {
              ((uh) this).field_c = null;
              return null;
            }
          } else {
            if (~((uh) this).field_c.field_j == ~param0) {
              var5 = ((uh) this).field_c;
              ((uh) this).field_c = ((uh) this).field_c.field_k;
              return var5;
            } else {
              ((uh) this).field_c = ((uh) this).field_c.field_k;
              continue L0;
            }
          }
        }
    }

    final static gk a(gk param0, int[] param1, boolean param2) {
        gk var3 = null;
        RuntimeException var3_ref = null;
        gk stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        gk stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var3 = new gk(0, 0, 0);
            var3.field_a = param0.field_a;
            var3.field_i = param0.field_i;
            var3.field_g = param0.field_g;
            var3.field_j = param0.field_j;
            var3.field_d = param0.field_d;
            var3.field_p = param0.field_p;
            var3.field_o = param1;
            var3.field_n = param0.field_n;
            stackOut_0_0 = (gk) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("uh.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + false + ')');
        }
        return stackIn_1_0;
    }

    uh(int param0) {
        int var2 = 0;
        ck var3 = null;
        ((uh) this).field_g = 0;
        ((uh) this).field_d = new ck[param0];
        ((uh) this).field_b = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            ck dupTemp$2 = new ck();
            var3 = dupTemp$2;
            ((uh) this).field_d[var2] = dupTemp$2;
            var3.field_k = var3;
            var3.field_i = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Flak repeater", "Minigun", "Fire bomb launcher", "Gauss gun", "Pulse laser", "Plasma spray", "Rapier missile", "Piercer rocket", "EMP rocket", "Airburst rocket", "Electron cannon", "Flak cannon", "Heavy gun", "Heavy cannon", "Mortar", "Rifled sniper cannon", "Rail repeater", "Laser beam", "Plasma cannon", "Multirocket", "Heavy rocket", "Lightning cannon", "Magno claw", "Flame cannon", "Bio rocket", "Air mine", "Ultra gun", "Doomsday cannon", "Howitzer", "Rail cannon", "Solaris laser", "Fusion cannon", "DEATH nuke", "Destructor rocket", "Air death missile", "EMP cannon"};
        field_h = "D";
        field_f = "Close";
        field_e = 1;
    }
}
