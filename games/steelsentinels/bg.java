/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bg extends kd {
    static boolean field_H;
    static int field_G;
    static String field_F;
    static wk[] field_C;
    int field_z;
    static int field_y;
    static String field_E;
    static String field_D;
    static byte[][] field_A;

    final static void c(byte param0) {
        boolean stackIn_5_0 = false;
        String[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        String stackIn_8_2 = null;
        if (param0 <= 56) {
          field_E = (String) null;
        }
        stackIn_5_0 = !(si.field_p);
        si.field_p = stackIn_5_0;
        stackIn_7_0 = ti.field_A;
        stackIn_7_1 = 41;
        if (si.field_p) {
          stackIn_8_2 = hf.field_b;
        } else {
          stackIn_8_2 = fm.field_h;
        }
        stackIn_7_0[stackIn_7_1] = stackIn_8_2;
        if (si.field_p &&
          fk.field_i != null &&
          null != fk.field_i.field_C) {
          fk.field_i.field_V = -(fk.field_i.field_C.field_Gb >> 4) + fk.field_i.field_E - 3200;
          fk.field_i.field_p = -(fk.field_i.field_C.field_hc >> 4) + (fk.field_i.field_P + 5120);
        }
    }

    final static int a(byte param0, boolean param1, int param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SteelSentinels.field_G;
        try {
          if (2 <= param2 &&
            param2 <= 36) {
            var4_int = 0;
            var5 = 0;
            if (param0 <= 35) {
              field_F = (String) null;
            }
            var6 = 0;
            var7 = param3.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (43 != var9 ||
                !param1))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param2) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param2;
                if (var10 / param2 != var6) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_41_0 = var6;
            return stackIn_41_0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("bg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    abstract boolean h(int param0);

    final static void a(na param0, int param1) {
        int var2_int = 0;
        na var3 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = SteelSentinels.field_G;
        try {
          if (null == param0.field_o) {
            return;
          }
          if (param0.field_w != 0 ||
            param0.field_n != 0) {
            for (var2_int = 0; var2_int < uc.field_a; var2_int++) {
              var3 = ph.field_e[var2_int];
              if (var3.field_k == 2 &&
                var3.field_w == param0.field_w &&
                param0.field_n == var3.field_n) {
                return;
              }
            }
          }
          if (null != param0.field_l) {
            dh.field_B = param0.field_k;
            f.field_x = param0.field_p;
            se.field_b = param0.field_j;
            pa.field_h = param0.field_l;
          }
          tf.a(param0, (byte) -115);
          if (param1 >= -61) {
            field_C = (wk[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("bg.H(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, int param1, byte param2, mi param3) {
        Object var4 = null;
        String var4_ref = null;
        RuntimeException var4_ref2 = null;
        int var5 = 0;
        mb var6 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          if (param2 != -45) {
            var6 = (mb) null;
            bg.a((wk) null, (mb) null, 56);
          }
          if (param0 != null &&
            param3.c(param0) > param1) {
            do {
              if (param0.length() <= 0) {
                stackIn_14_0 = (String) (param0);
                return stackIn_14_0;
              }
              param0 = param0.substring(0, param0.length() - 1);
              var4_ref = param0 + "...";
            } while (param1 < param3.c(var4_ref));
            stackIn_11_0 = var4_ref;
            return stackIn_11_0;
          }
          stackIn_7_0 = (String) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          stackIn_17_0 = var4_ref2;
          stackIn_17_1 = new StringBuilder().append("bg.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    abstract Object d(byte param0);

    bg(int param0) {
        this.field_z = param0;
    }

    public static void g(int param0) {
        field_A = (byte[][]) null;
        field_D = null;
        field_E = null;
        field_F = null;
        field_C = null;
        if (param0 != -1008) {
          CharSequence var2 = (CharSequence) null;
          bg.a((byte) -111, true, -42, (CharSequence) null);
        }
    }

    final static void a(wk param0, mb param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SteelSentinels.field_G;
        try {
          var3_int = 0;
          if (param2 != 14590) {
            bg.c((byte) -71);
          }
          for (var4 = 0; var4 < param0.field_B; var4++) {
            for (var5 = 0; param0.field_z > var5; var5++) {
              var6 = param0.field_E[var3_int + var5];
              if (~(var6 >> 8) == ~(var6 & 65535)) {
                var7 = param1.d((byte) -102);
                var8 = var6 & 255;
                if (var8 > 64) {
                  param0.field_E[var5 + var3_int] = (ec.a(16711720, var8 * ec.a(var7, 65280)) >> 8) + ec.a(ec.a(16711935, var7) * var8 >> 8, 16711935);
                }
              } else {
                var7 = var6 & 255;
                var7 = var7 / 2;
                if (var7 > 32) {
                  param0.field_E[var5 + var3_int] = var7 * param1.field_ic;
                }
              }
            }
            var3_int = var3_int + param0.field_z;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("bg.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_E = "Kick <%0> from this game";
        field_G = 1;
        field_D = "Get access to new modules by expending solarite cubes on engineering. Until you engineer a module, it cannot be equipped on a sentinel.";
        field_A = new byte[250][];
    }
}
