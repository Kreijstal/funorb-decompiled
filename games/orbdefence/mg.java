/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mg extends ca {
    static va field_m;
    static boolean field_g;
    int field_i;
    static String field_h;
    byte[] field_j;
    static ea field_k;
    static int field_f;
    static im field_l;

    final void a(int param0, int param1) {
        if (param1 > -3) {
            field_m = null;
        }
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$0] = (byte)param0;
    }

    final int b(byte param0) {
        if (param0 != 90) {
            Object var3 = null;
            ((mg) this).a((String) null, -65);
        }
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        return 255 & ((mg) this).field_j[fieldTemp$0];
    }

    final void a(int[] param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var4 = -102 % ((param1 - 53) / 53);
            var3_int = ((mg) this).field_i / 8;
            ((mg) this).field_i = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3_int) {
                break L0;
              } else {
                var6 = ((mg) this).l(0);
                var7 = ((mg) this).l(0);
                var8 = 0;
                var9 = -1640531527;
                var10 = 32;
                L2: while (true) {
                  int incrementValue$1 = var10;
                  var10--;
                  if (0 >= incrementValue$1) {
                    ((mg) this).field_i = ((mg) this).field_i - 8;
                    ((mg) this).b(var6, -1);
                    ((mg) this).b(var7, -1);
                    var5++;
                    continue L1;
                  } else {
                    var6 = var6 + ((var7 >>> 5 ^ var7 << 4) + var7 ^ param0[3 & var8] + var8);
                    var8 = var8 + var9;
                    var7 = var7 + ((var6 << 4 ^ var6 >>> 5) - -var6 ^ param0[1648361475 & var8 >>> 11] + var8);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("mg.N(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$1] = (byte)(param0 >> 8);
        if (param1 <= 100) {
            boolean discarded$2 = ((mg) this).h(47);
        }
        int fieldTemp$3 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$3] = (byte)param0;
    }

    final int a(byte param0) {
        ((mg) this).field_i = ((mg) this).field_i + 3;
        if (param0 != -30) {
            Object var3 = null;
            ((mg) this).a(false, (String) null);
        }
        return ((((mg) this).field_j[-3 + ((mg) this).field_i] & 255) << 16) + ((((mg) this).field_j[-2 + ((mg) this).field_i] << 8 & 65280) - -(255 & ((mg) this).field_j[-1 + ((mg) this).field_i]));
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$4] = (byte)(int)(param0 >> 24);
        if (param1 != -16943) {
            field_k = null;
        }
        int fieldTemp$5 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$7] = (byte)(int)param0;
    }

    public static void c(int param0) {
        field_k = null;
        if (param0 != 10) {
            mg.c(-9);
        }
        field_l = null;
        field_h = null;
        field_m = null;
    }

    final String f(int param0) {
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        int var2 = ((mg) this).field_j[fieldTemp$0];
        if (var2 != 0) {
            throw new IllegalStateException("");
        }
        if (param0 < 77) {
            ((mg) this).f(-19, -48);
        }
        int var3 = ((mg) this).field_i;
        while (true) {
            int fieldTemp$1 = ((mg) this).field_i;
            ((mg) this).field_i = ((mg) this).field_i + 1;
            if (((mg) this).field_j[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -1 + ((mg) this).field_i - var3;
        if (var4 == 0) {
            return "";
        }
        return tj.a(var4, var3, 0, ((mg) this).field_j);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param2 == -11) {
              var5_int = param0;
              L1: while (true) {
                if (param0 - -param1 <= var5_int) {
                  break L0;
                } else {
                  int fieldTemp$8 = ((mg) this).field_i;
                  ((mg) this).field_i = ((mg) this).field_i + 1;
                  ((mg) this).field_j[fieldTemp$8] = param3[var5_int];
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("mg.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw dd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final String i(int param0) {
        if (!(param0 != ~((mg) this).field_j[((mg) this).field_i])) {
            ((mg) this).field_i = ((mg) this).field_i + 1;
            return null;
        }
        return ((mg) this).g(param0 ^ -3);
    }

    final void d(int param0, int param1) {
        ((mg) this).field_j[param1 + (-param0 + ((mg) this).field_i)] = (byte)(param0 >> 8);
        ((mg) this).field_j[((mg) this).field_i - (param0 - -1)] = (byte)param0;
    }

    final int e(int param0) {
        if (param0 <= 118) {
            return 9;
        }
        int var2 = ((mg) this).field_j[((mg) this).field_i] & 255;
        if (var2 >= 128) {
            return -32768 + ((mg) this).j(98203176);
        }
        return ((mg) this).b((byte) 90);
    }

    final static void d(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) nk.field_q;
        synchronized (var1) {
          L0: {
            of.field_G = db.field_f;
            nl.field_d = nl.field_d + 1;
            ua.field_a = bl.field_g;
            vl.field_d = ic.field_g;
            kd.field_d = tf.field_m;
            tf.field_m = false;
            gi.field_e = eh.field_c;
            ig.field_fb = vg.field_p;
            bg.field_c = id.field_b;
            eh.field_c = 0;
            lg.field_a = sd.field_c;
            break L0;
          }
        }
    }

    final int k(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        int var2 = ((mg) this).field_j[fieldTemp$0];
        int var3 = param0;
        while (0 > var2) {
            var3 = (var3 | var2 & 127) << 7;
            int fieldTemp$1 = ((mg) this).field_i;
            ((mg) this).field_i = ((mg) this).field_i + 1;
            var2 = ((mg) this).field_j[fieldTemp$1];
        }
        return var3 | var2;
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param1 <= -19) {
          L0: {
            var2 = param0;
            if (param0 == 11) {
              var2 = 10;
              break L0;
            } else {
              if (param0 != 7) {
                break L0;
              } else {
                if (ok.a(0, false)) {
                  var2 = 11;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          return var2;
        } else {
          return -63;
        }
    }

    final void g(int param0, int param1) {
        if (param1 != 1) {
            int discarded$0 = ((mg) this).d(true);
        }
        ((mg) this).field_j[-4 + ((mg) this).field_i - param0] = (byte)(param0 >> 24);
        ((mg) this).field_j[-3 + (-param0 + ((mg) this).field_i)] = (byte)(param0 >> 16);
        ((mg) this).field_j[-param0 + (((mg) this).field_i - 2)] = (byte)(param0 >> 8);
        ((mg) this).field_j[-1 + ((mg) this).field_i + -param0] = (byte)param0;
    }

    final void a(boolean param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            if (param0) {
                field_g = false;
            }
            var3_int = param1.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((mg) this).field_i;
            ((mg) this).field_i = ((mg) this).field_i + 1;
            ((mg) this).field_j[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) (Object) param1;
            ((mg) this).field_i = ((mg) this).field_i + ue.a(param1.length(), var4, (byte) -86, 0, ((mg) this).field_j, ((mg) this).field_i);
            int fieldTemp$1 = ((mg) this).field_i;
            ((mg) this).field_i = ((mg) this).field_i + 1;
            ((mg) this).field_j[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "mg.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int c(boolean param0) {
        if (!param0) {
            return -10;
        }
        int var2 = ((mg) this).field_j[((mg) this).field_i] & 255;
        if (128 <= var2) {
            return -49152 + ((mg) this).j(98203176);
        }
        return -64 + ((mg) this).b((byte) 90);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = param2;
            if (param0 >= 90) {
              L1: while (true) {
                if (var5_int >= param2 + param3) {
                  break L0;
                } else {
                  int fieldTemp$7 = ((mg) this).field_i;
                  ((mg) this).field_i = ((mg) this).field_i + 1;
                  param1[var5_int] = ((mg) this).field_j[fieldTemp$7];
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("mg.FA(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final byte d(int param0) {
        if (param0 != -20398) {
            ((mg) this).field_i = -110;
        }
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        return ((mg) this).field_j[fieldTemp$0];
    }

    final void d(byte param0, int param1) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -115) {
            return;
        }
        while (((mg) this).field_i < param1) {
            int fieldTemp$0 = ((mg) this).field_i;
            ((mg) this).field_i = ((mg) this).field_i + 1;
            ((mg) this).field_j[fieldTemp$0] = (byte) 0;
        }
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            if (param1 != -6528) {
                ((mg) this).field_j = null;
            }
            var3_int = param0.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) (Object) param0;
            ((mg) this).field_i = ((mg) this).field_i + ue.a(param0.length(), var4, (byte) -86, 0, ((mg) this).field_j, ((mg) this).field_i);
            int fieldTemp$0 = ((mg) this).field_i;
            ((mg) this).field_i = ((mg) this).field_i + 1;
            ((mg) this).field_j[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "mg.CA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final long c(byte param0) {
        long var2 = (long)((mg) this).l(0) & 4294967295L;
        if (param0 != -89) {
            ((mg) this).d(61, -62);
        }
        long var4 = 4294967295L & (long)((mg) this).l(0);
        return var4 + (var2 << 32);
    }

    final String g(int param0) {
        int var2 = ((mg) this).field_i;
        if (param0 != 2) {
            int discarded$0 = ((mg) this).e(-29, -98);
        }
        while (true) {
            int fieldTemp$1 = ((mg) this).field_i;
            ((mg) this).field_i = ((mg) this).field_i + 1;
            if (((mg) this).field_j[fieldTemp$1] == 0) {
                break;
            }
        }
        int var3 = -1 + -var2 + ((mg) this).field_i;
        if (!(var3 != 0)) {
            return "";
        }
        return tj.a(var3, var2, param0 + -2, ((mg) this).field_j);
    }

    final void a(byte param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var7 = -105 % ((-7 - param0) / 62);
            var3_long = 0L;
            var5 = 0L;
            var8 = param1.length();
            var9 = 19;
            L1: while (true) {
              if (var9 < 0) {
                this.a(-3357, var3_long);
                this.a(-3357, var5);
                break L0;
              } else {
                L2: {
                  var3_long = var3_long * 38L;
                  if (var9 < var8) {
                    L3: {
                      var10 = param1.charAt(var9);
                      if (var10 < 65) {
                        break L3;
                      } else {
                        if (90 >= var10) {
                          var3_long = var3_long + (long)(2 + var10 - 65);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var10 < 97) {
                        break L4;
                      } else {
                        if (122 >= var10) {
                          var3_long = var3_long + (long)(var10 - 95);
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (48 > var10) {
                        break L5;
                      } else {
                        if (57 >= var10) {
                          var3_long = var3_long + (long)(-48 + (28 + var10));
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L6: {
                  if (var9 == 10) {
                    var5 = var3_long;
                    var3_long = 0L;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var9--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("mg.J(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final int j(int param0) {
        ((mg) this).field_i = ((mg) this).field_i + 2;
        if (param0 != 98203176) {
            field_g = true;
        }
        return (((mg) this).field_j[((mg) this).field_i - 1] & 255) + (((mg) this).field_j[-2 + ((mg) this).field_i] << 8 & 65280);
    }

    final void a(int param0, int param1, boolean param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = ((mg) this).field_i;
            ((mg) this).field_i = param0;
            var6 = (-param0 + param1) / 8;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                L2: {
                  if (!param2) {
                    break L2;
                  } else {
                    ((mg) this).field_j = null;
                    break L2;
                  }
                }
                ((mg) this).field_i = var5_int;
                break L0;
              } else {
                var8 = ((mg) this).l(0);
                var9 = ((mg) this).l(0);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$1 = var12;
                  var12--;
                  if (incrementValue$1 <= 0) {
                    ((mg) this).field_i = ((mg) this).field_i - 8;
                    ((mg) this).b(var8, -1);
                    ((mg) this).b(var9, -1);
                    var7++;
                    continue L1;
                  } else {
                    var9 = var9 - (var10 + param3[(6167 & var10) >>> 11] ^ var8 + (var8 >>> 5 ^ var8 << 4));
                    var10 = var10 - var11;
                    var8 = var8 - (var10 + param3[3 & var10] ^ (var9 << 4 ^ var9 >>> 5) + var9);
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("mg.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$4] = (byte)(int)(param1 >> 16);
        if (param0 != -3357) {
            ((mg) this).b((byte) 14, -76);
        }
        int fieldTemp$5 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$6] = (byte)(int)param1;
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$1] = (byte)param1;
        if (param0 != -60) {
            this.a(-11, 63L);
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != -1) {
            Object var4 = null;
            ((mg) this).a((byte) -60, (byte[]) null, -13, 28);
        }
        int fieldTemp$3 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$3] = (byte)param0;
    }

    final void c(byte param0, int param1) {
        ((mg) this).field_j[-1 + ((mg) this).field_i + -param1] = (byte)param1;
        int var3 = -29 % ((param0 - 66) / 46);
    }

    final int e(int param0, int param1) {
        if (param0 != -18951) {
            return 41;
        }
        int var3 = sd.a(param1, ((mg) this).field_j, ((mg) this).field_i, 0);
        ((mg) this).b(var3, param0 + 18950);
        return var3;
    }

    final boolean h(int param0) {
        ((mg) this).field_i = ((mg) this).field_i - 4;
        int var2 = sd.a(0, ((mg) this).field_j, ((mg) this).field_i, 0);
        int var3 = ((mg) this).l(0);
        if (!(var3 != var2)) {
            return true;
        }
        if (param0 != 9982) {
            return false;
        }
        return false;
    }

    mg(int param0) {
        ((mg) this).field_i = 0;
        ((mg) this).field_j = q.a(param0, (byte) 121);
    }

    final int d(boolean param0) {
        if (!param0) {
            Object var3 = null;
            ((mg) this).a((byte) -88, (byte[]) null, -94, -42);
        }
        if (((mg) this).field_j[((mg) this).field_i] >= 0) {
            return ((mg) this).j(98203176);
        }
        return ((mg) this).l(0) & 2147483647;
    }

    final void f(int param0, int param1) {
        if (param0 != -1) {
            ((mg) this).c((byte) 106, -63);
        }
        if (param1 < 64) {
            if (!(-64 > param1)) {
                ((mg) this).a(64 + param1, param0 + -102);
                return;
            }
        }
        if (param1 < 16384) {
            if (param1 >= -16384) {
                ((mg) this).b((byte) -60, 49152 + param1);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void a(byte param0, int param1) {
        if (param0 > -31) {
            return;
        }
        if (!((param1 & -128) == 0)) {
            if (!((param1 & -16384) == -1)) {
                if ((param1 & -2097152) != 0) {
                    if (!(-1 == (param1 & -268435456))) {
                        ((mg) this).a(128 | param1 >>> 28, -102);
                    }
                    ((mg) this).a(param1 >>> 21 | 128, -4);
                }
                ((mg) this).a(128 | param1 >>> 14, -106);
            }
            ((mg) this).a(128 | param1 >>> 7, -90);
        }
        ((mg) this).a(param1 & 127, -70);
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((mg) this).field_i;
            ((mg) this).field_i = 0;
            var5 = new byte[var4_int];
            ((mg) this).a((byte) 91, var5, 0, var4_int);
            if (param2 != 27551) {
                ((mg) this).d(59, 73);
            }
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param1);
            var8 = var7.toByteArray();
            ((mg) this).field_i = 0;
            ((mg) this).b((byte) -60, var8.length);
            ((mg) this).a(0, var8.length, (byte) -11, var8);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "mg.I(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    mg(byte[] param0) {
        try {
            ((mg) this).field_j = param0;
            ((mg) this).field_i = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "mg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final int l(int param0) {
        ((mg) this).field_i = ((mg) this).field_i + 4;
        if (param0 != 0) {
            ((mg) this).field_j = null;
        }
        return ((((mg) this).field_j[((mg) this).field_i - 2] & 255) << 8) + ((255 & ((mg) this).field_j[-3 + ((mg) this).field_i]) << 16) + (((255 & ((mg) this).field_j[((mg) this).field_i - 4]) << 24) + (((mg) this).field_j[-1 + ((mg) this).field_i] & 255));
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$1] = (byte)(int)(param1 >> 24);
        if (param0 < 99) {
            return;
        }
        int fieldTemp$2 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = ((mg) this).field_i;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[fieldTemp$4] = (byte)(int)param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Awesomo";
        field_m = new va();
        field_f = 64;
        field_l = new im();
    }
}
