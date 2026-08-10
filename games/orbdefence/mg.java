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
            field_m = (va) null;
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)param0;
    }

    final int b(byte param0) {
        if (param0 != 90) {
            String var3 = (String) null;
            this.a((String) null, -65);
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return 255 & this.field_j[fieldTemp$0];
    }

    final void a(int[] param0, int param1) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var4 = -102 % ((param1 - 53) / 53);
            var3_int = this.field_i / 8;
            this.field_i = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3_int) {
                break L0;
              } else {
                var6 = this.l(0);
                var7 = this.l(0);
                var8 = 0;
                var9 = -1640531527;
                var10 = 32;
                L2: while (true) {
                  incrementValue$2 = var10;
                  var10--;
                  if (0 >= incrementValue$2) {
                    this.field_i = this.field_i - 8;
                    this.b(var6, -1);
                    this.b(var7, -1);
                    var5++;
                    continue L1;
                  } else {
                    var6 = var6 + ((var7 >>> 119209125 ^ var7 << 1312358276) + var7 ^ param0[3 & var8] + var8);
                    var8 = var8 + var9;
                    var7 = var7 + ((var6 << -635681948 ^ var6 >>> 1078662949) - -var6 ^ param0[1648361475 & var8 >>> 1831296107] + var8);
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
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("mg.N(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 >> 1390313680);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)(param0 >> -446829976);
        if (param1 <= 100) {
            this.h(47);
        }
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$2] = (byte)param0;
    }

    final int a(byte param0) {
        this.field_i = this.field_i + 3;
        if (param0 != -30) {
            String var3 = (String) null;
            this.a(false, (String) null);
        }
        return ((this.field_j[-3 + this.field_i] & 255) << 361300720) + ((this.field_j[-2 + this.field_i] << -797337784 & 65280) - -(255 & this.field_j[-1 + this.field_i]));
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param0 >> -843177800);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param0 >> 779055664);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param0 >> 98203176);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param0 >> 92422688);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$4] = (byte)(int)(param0 >> -1741323048);
        if (param1 != -16943) {
            field_k = (ea) null;
        }
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$5] = (byte)(int)(param0 >> 1687801808);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$6] = (byte)(int)(param0 >> 1922328584);
        int fieldTemp$7 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$7] = (byte)(int)param0;
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
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        int var2 = this.field_j[fieldTemp$0];
        if (var2 != 0) {
            throw new IllegalStateException("");
        }
        if (param0 < 77) {
            this.f(-19, -48);
        }
        int var3 = this.field_i;
        while (true) {
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            if (this.field_j[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -1 + this.field_i - var3;
        if (var4 == 0) {
            return "";
        }
        return tj.a(var4, var3, 0, this.field_j);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param2 == -11) {
              var5_int = param0;
              L1: while (true) {
                if (param0 - -param1 <= var5_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$2 = this.field_i;
                  this.field_i = this.field_i + 1;
                  this.field_j[fieldTemp$2] = param3[var5_int];
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("mg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String i(int param0) {
        if (!(param0 != (this.field_j[this.field_i] ^ -1))) {
            this.field_i = this.field_i + 1;
            return null;
        }
        return this.g(param0 ^ -3);
    }

    final void d(int param0, int param1) {
        this.field_j[param1 + (-param0 + this.field_i)] = (byte)(param0 >> -1614606616);
        this.field_j[this.field_i - (param0 - -1)] = (byte)param0;
    }

    final int e(int param0) {
        if (param0 <= 118) {
            return 9;
        }
        int var2 = this.field_j[this.field_i] & 255;
        if ((var2 ^ -1) <= -129) {
            return -32768 + this.j(98203176);
        }
        return this.b((byte) 90);
    }

    final static void d(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = nk.field_q;
        synchronized (var1) {
          L0: {
            L1: {
              of.field_G = db.field_f;
              nl.field_d = nl.field_d + 1;
              ua.field_a = bl.field_g;
              if (param0 < -13) {
                break L1;
              } else {
                mg.a(-118, (byte) -31);
                break L1;
              }
            }
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
        int fieldTemp$1 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        int var2 = this.field_j[fieldTemp$0];
        int var3 = param0;
        while (0 > var2) {
            var3 = (var3 | var2 & 127) << 1188136647;
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            var2 = this.field_j[fieldTemp$1];
        }
        return var3 | var2;
    }

    final static int a(int param0, byte param1) {
        int var2;
        if (param1 <= -19) {
          L0: {
            var2 = param0;
            if (-12 == (param0 ^ -1)) {
              var2 = 10;
              break L0;
            } else {
              if (-8 != (param0 ^ -1)) {
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
            this.d(true);
        }
        this.field_j[-4 + this.field_i - param0] = (byte)(param0 >> -2124841352);
        this.field_j[-3 + (-param0 + this.field_i)] = (byte)(param0 >> -828528912);
        this.field_j[-param0 + (this.field_i - 2)] = (byte)(param0 >> -1911583416);
        this.field_j[-1 + this.field_i + -param0] = (byte)param0;
    }

    final void a(boolean param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
            if (param0) {
                field_g = false;
            }
            var3_int = param1.indexOf(' ');
            if (!(-1 < (var3_int ^ -1))) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_j[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) ((Object) param1);
            this.field_i = this.field_i + ue.a(param1.length(), var4, (byte) -86, 0, this.field_j, this.field_i);
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_j[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "mg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(boolean param0) {
        if (!param0) {
            return -10;
        }
        int var2 = this.field_j[this.field_i] & 255;
        if (128 <= var2) {
            return -49152 + this.j(98203176);
        }
        return -64 + this.b((byte) 90);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = param2;
            if (param0 >= 90) {
              L1: while (true) {
                if (var5_int >= param2 + param3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$2 = this.field_i;
                  this.field_i = this.field_i + 1;
                  param1[var5_int] = this.field_j[fieldTemp$2];
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("mg.FA(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final byte d(int param0) {
        if (param0 != -20398) {
            this.field_i = -110;
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_j[fieldTemp$0];
    }

    final void d(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -115) {
            return;
        }
        while (this.field_i < param1) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_j[fieldTemp$0] = (byte) 0;
        }
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
            if (param1 != -6528) {
                this.field_j = (byte[]) null;
            }
            var3_int = param0.indexOf(' ');
            if (-1 >= (var3_int ^ -1)) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) ((Object) param0);
            this.field_i = this.field_i + ue.a(param0.length(), var4, (byte) -86, 0, this.field_j, this.field_i);
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_j[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "mg.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long c(byte param0) {
        long var2 = (long)this.l(0) & 4294967295L;
        if (param0 != -89) {
            this.d(61, -62);
        }
        long var4 = 4294967295L & (long)this.l(0);
        return var4 + (var2 << 513915424);
    }

    final String g(int param0) {
        int fieldTemp$0 = 0;
        int var2 = this.field_i;
        if (param0 != 2) {
            this.e(-29, -98);
        }
        while (true) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            if (-1 == (this.field_j[fieldTemp$0] ^ -1)) {
                break;
            }
        }
        int var3 = -1 + -var2 + this.field_i;
        if (!(var3 != 0)) {
            return "";
        }
        return tj.a(var3, var2, param0 + -2, this.field_j);
    }

    final void a(byte param0, String param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var7 = -105 % ((-7 - param0) / 62);
            var3_long = 0L;
            var5 = 0L;
            var8 = param1.length();
            var9 = 19;
            L1: while (true) {
              if (-1 < (var9 ^ -1)) {
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
                          var3_long = var3_long + (long)(var10 + 2 - 97);
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
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("mg.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    final int j(int param0) {
        this.field_i = this.field_i + 2;
        if (param0 != 98203176) {
            field_g = true;
        }
        return (this.field_j[this.field_i - 1] & 255) + (this.field_j[-2 + this.field_i] << 2011737416 & 65280);
    }

    final void a(int param0, int param1, boolean param2, int[] param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_i;
            this.field_i = param0;
            var6 = (-param0 + param1) / 8;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                L2: {
                  if (!param2) {
                    break L2;
                  } else {
                    this.field_j = (byte[]) null;
                    break L2;
                  }
                }
                this.field_i = var5_int;
                break L0;
              } else {
                var8 = this.l(0);
                var9 = this.l(0);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  incrementValue$0 = var12;
                  var12--;
                  if ((incrementValue$0 ^ -1) >= -1) {
                    this.field_i = this.field_i - 8;
                    this.b(var8, -1);
                    this.b(var9, -1);
                    var7++;
                    continue L1;
                  } else {
                    var9 = var9 - (var10 + param3[(6167 & var10) >>> 306977099] ^ var8 + (var8 >>> -1388264155 ^ var8 << 1070781060));
                    var10 = var10 - var11;
                    var8 = var8 - (var10 + param3[3 & var10] ^ (var9 << -571053468 ^ var9 >>> -1535481179) + var9);
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
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("mg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param1 >> 1590742960);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param1 >> 1464822120);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param1 >> -988339232);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param1 >> 1162468248);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$4] = (byte)(int)(param1 >> 1085564560);
        if (param0 != -3357) {
            this.b((byte) 14, -76);
        }
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$5] = (byte)(int)(param1 >> -2118823160);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$6] = (byte)(int)param1;
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(param1 >> -406696856);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)param1;
        if (param0 != -60) {
            this.a(-11, 63L);
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 >> -207545960);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)(param0 >> 890593296);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$2] = (byte)(param0 >> 557505480);
        if (param1 != -1) {
            byte[] var4 = (byte[]) null;
            this.a((byte) -60, (byte[]) null, -13, 28);
        }
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$3] = (byte)param0;
    }

    final void c(byte param0, int param1) {
        this.field_j[-1 + this.field_i + -param1] = (byte)param1;
        int var3 = -29 % ((param0 - 66) / 46);
    }

    final int e(int param0, int param1) {
        if (param0 != -18951) {
            return 41;
        }
        int var3 = sd.a(param1, this.field_j, this.field_i, 0);
        this.b(var3, param0 + 18950);
        return var3;
    }

    final boolean h(int param0) {
        this.field_i = this.field_i - 4;
        int var2 = sd.a(0, this.field_j, this.field_i, 0);
        int var3 = this.l(0);
        if (!(var3 != var2)) {
            return true;
        }
        if (param0 != 9982) {
            return false;
        }
        return false;
    }

    mg(int param0) {
        this.field_i = 0;
        this.field_j = q.a(param0, (byte) 121);
    }

    final int d(boolean param0) {
        if (!param0) {
            byte[] var3 = (byte[]) null;
            this.a((byte) -88, (byte[]) null, -94, -42);
        }
        if (this.field_j[this.field_i] >= 0) {
            return this.j(98203176);
        }
        return this.l(0) & 2147483647;
    }

    final void f(int param0, int param1) {
        if (param0 != -1) {
            this.c((byte) 106, -63);
        }
        if ((param1 ^ -1) > -65) {
            if (!(-64 > param1)) {
                this.a(64 + param1, param0 + -102);
                return;
            }
        }
        if ((param1 ^ -1) > -16385 && (param1 ^ -1) <= 16383) {
            this.b((byte) -60, 49152 + param1);
            return;
        }
        throw new IllegalArgumentException();
    }

    final void a(byte param0, int param1) {
        if (param0 > -31) {
            return;
        }
        if (!(-1 == (param1 & -128 ^ -1))) {
            if (!((param1 & -16384) == 0)) {
                if ((param1 & -2097152) != 0) {
                    if (!(-1 == (param1 & -268435456 ^ -1))) {
                        this.a(128 | param1 >>> -88120900, -102);
                    }
                    this.a(param1 >>> -767907307 | 128, -4);
                }
                this.a(128 | param1 >>> -176701746, -106);
            }
            this.a(128 | param1 >>> 431540743, -90);
        }
        this.a(param1 & 127, -70);
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = this.field_i;
            this.field_i = 0;
            var5 = new byte[var4_int];
            this.a((byte) 91, var5, 0, var4_int);
            if (param2 != 27551) {
                this.d(59, 73);
            }
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param1);
            var8 = var7.toByteArray();
            this.field_i = 0;
            this.b((byte) -60, var8.length);
            this.a(0, var8.length, (byte) -11, var8);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "mg.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    mg(byte[] param0) {
        try {
            this.field_j = param0;
            this.field_i = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int l(int param0) {
        this.field_i = this.field_i + 4;
        if (param0 != 0) {
            this.field_j = (byte[]) null;
        }
        return ((this.field_j[this.field_i - 2] & 255) << -373962616) + ((255 & this.field_j[-3 + this.field_i]) << -299752560) + (((255 & this.field_j[this.field_i - 4]) << -1552594376) + (this.field_j[-1 + this.field_i] & 255));
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param1 >> -1176418848);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param1 >> -1780835944);
        if (param0 < 99) {
            return;
        }
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param1 >> -572516720);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param1 >> 1533620424);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$4] = (byte)(int)param1;
    }

    static {
        field_h = "Awesomo";
        field_m = new va();
        field_f = 64;
        field_l = new im();
    }
}
