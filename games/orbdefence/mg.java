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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param1 > -3) {
          field_m = (va) null;
          fieldTemp$4 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$4] = (byte)param0;
          return;
        } else {
          fieldTemp$5 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$5] = (byte)param0;
          return;
        }
    }

    final int b(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        String var3 = null;
        if (param0 != 90) {
          var3 = (String) null;
          this.a((String) null, -65);
          fieldTemp$4 = this.field_i;
          this.field_i = this.field_i + 1;
          return 255 & this.field_j[fieldTemp$4];
        } else {
          fieldTemp$5 = this.field_i;
          this.field_i = this.field_i + 1;
          return 255 & this.field_j[fieldTemp$5];
        }
    }

    final void a(int[] param0, int param1) {
        int incrementValue$1 = 0;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
                if (var11 == 0) {
                  var10 = 32;
                  L2: while (true) {
                    L3: {
                      incrementValue$1 = var10;
                      var10--;
                      if (0 >= incrementValue$1) {
                        this.field_i = this.field_i - 8;
                        this.b(var6, -1);
                        this.b(var7, -1);
                        var5++;
                        break L3;
                      } else {
                        var6 = var6 + ((var7 >>> 119209125 ^ var7 << 1312358276) + var7 ^ param0[3 & var8] + var8);
                        var8 = var8 + var9;
                        var7 = var7 + ((var6 << -635681948 ^ var6 >>> 1078662949) - -var6 ^ param0[1648361475 & var8 >>> 1831296107] + var8);
                        if (var11 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    continue L1;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("mg.N(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0, int param1) {
        boolean discarded$12 = false;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$10 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$10] = (byte)(param0 >> 1390313680);
        int fieldTemp$11 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$11] = (byte)(param0 >> -446829976);
        if (param1 <= 100) {
          discarded$12 = this.h(47);
          fieldTemp$13 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$13] = (byte)param0;
          return;
        } else {
          fieldTemp$14 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$14] = (byte)param0;
          return;
        }
    }

    final int a(byte param0) {
        String var3 = null;
        this.field_i = this.field_i + 3;
        if (param0 != -30) {
          var3 = (String) null;
          this.a(false, (String) null);
          return ((this.field_j[-3 + this.field_i] & 255) << 361300720) + ((this.field_j[-2 + this.field_i] << -797337784 & 65280) - -(255 & this.field_j[-1 + this.field_i]));
        } else {
          return ((this.field_j[-3 + this.field_i] & 255) << 361300720) + ((this.field_j[-2 + this.field_i] << -797337784 & 65280) - -(255 & this.field_j[-1 + this.field_i]));
        }
    }

    final void a(long param0, int param1) {
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$11 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$11] = (byte)(int)(param0 >> -843177800);
        int fieldTemp$12 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$12] = (byte)(int)(param0 >> 779055664);
        int fieldTemp$13 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$13] = (byte)(int)(param0 >> 98203176);
        int fieldTemp$14 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$14] = (byte)(int)(param0 >> 92422688);
        int fieldTemp$15 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$15] = (byte)(int)(param0 >> -1741323048);
        if (param1 != -16943) {
          field_k = (ea) null;
          fieldTemp$16 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$16] = (byte)(int)(param0 >> 1687801808);
          fieldTemp$17 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$17] = (byte)(int)(param0 >> 1922328584);
          fieldTemp$18 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$18] = (byte)(int)param0;
          return;
        } else {
          fieldTemp$19 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$19] = (byte)(int)(param0 >> 1687801808);
          fieldTemp$20 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$20] = (byte)(int)(param0 >> 1922328584);
          fieldTemp$21 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$21] = (byte)(int)param0;
          return;
        }
    }

    public static void c(int param0) {
        field_k = null;
        if (param0 != 10) {
          mg.c(-9);
          field_l = null;
          field_h = null;
          field_m = null;
          return;
        } else {
          field_l = null;
          field_h = null;
          field_m = null;
          return;
        }
    }

    final String f(int param0) {
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        var2 = this.field_j[fieldTemp$6];
        if (var2 == 0) {
          if (param0 >= 77) {
            var3 = this.field_i;
            L0: while (true) {
              fieldTemp$7 = this.field_i;
              this.field_i = this.field_i + 1;
              if (this.field_j[fieldTemp$7] == 0) {
                var4 = -1 + this.field_i - var3;
                if (var4 == 0) {
                  return "";
                } else {
                  return tj.a(var4, var3, 0, this.field_j);
                }
              } else {
                continue L0;
              }
            }
          } else {
            this.f(-19, -48);
            var3 = this.field_i;
            L1: while (true) {
              fieldTemp$8 = this.field_i;
              this.field_i = this.field_i + 1;
              if (this.field_j[fieldTemp$8] == 0) {
                var4 = -1 + this.field_i - var3;
                if (var4 == 0) {
                  return "";
                } else {
                  return tj.a(var4, var3, 0, this.field_j);
                }
              } else {
                continue L1;
              }
            }
          }
        } else {
          throw new IllegalStateException("");
        }
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
        int fieldTemp$8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
                  fieldTemp$8 = this.field_i;
                  this.field_i = this.field_i + 1;
                  this.field_j[fieldTemp$8] = param3[var5_int];
                  var5_int++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
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
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("mg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
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
        int var2 = 0;
        if (param0 > 118) {
          var2 = this.field_j[this.field_i] & 255;
          if ((var2 ^ -1) <= -129) {
            return -32768 + this.j(98203176);
          } else {
            return this.b((byte) 90);
          }
        } else {
          return 9;
        }
    }

    final static void d(byte param0) {
        int discarded$3 = 0;
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
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
                discarded$3 = mg.a(-118, (byte) -31);
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
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte stackIn_4_0 = 0;
        byte stackIn_5_0 = 0;
        byte stackOut_3_0 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        var2 = this.field_j[fieldTemp$4];
        var3 = param0;
        L0: while (true) {
          if (0 > var2) {
            var3 = (var3 | var2 & 127) << 1188136647;
            fieldTemp$5 = this.field_i;
            this.field_i = this.field_i + 1;
            stackOut_3_0 = this.field_j[fieldTemp$5];
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var4 == 0) {
              var2 = stackIn_5_0;
              continue L0;
            } else {
              return stackIn_4_0;
            }
          } else {
            return var3 | var2;
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param1 <= -19) {
          var2 = param0;
          if (-12 != (param0 ^ -1)) {
            if (-8 == (param0 ^ -1)) {
              if (!ok.a(0, false)) {
                return var2;
              } else {
                L0: {
                  var2 = 11;
                  if (!OrbDefence.field_D) {
                    break L0;
                  } else {
                    var2 = 10;
                    break L0;
                  }
                }
                return var2;
              }
            } else {
              return var2;
            }
          } else {
            var2 = 10;
            return var2;
          }
        } else {
          return -63;
        }
    }

    final void g(int param0, int param1) {
        int discarded$1 = 0;
        if (param1 != 1) {
          discarded$1 = this.d(true);
          this.field_j[-4 + this.field_i - param0] = (byte)(param0 >> -2124841352);
          this.field_j[-3 + (-param0 + this.field_i)] = (byte)(param0 >> -828528912);
          this.field_j[-param0 + (this.field_i - 2)] = (byte)(param0 >> -1911583416);
          this.field_j[-1 + this.field_i + -param0] = (byte)param0;
          return;
        } else {
          this.field_j[-4 + this.field_i - param0] = (byte)(param0 >> -2124841352);
          this.field_j[-3 + (-param0 + this.field_i)] = (byte)(param0 >> -828528912);
          this.field_j[-param0 + (this.field_i - 2)] = (byte)(param0 >> -1911583416);
          this.field_j[-1 + this.field_i + -param0] = (byte)param0;
          return;
        }
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
        int var2 = 0;
        if (param0) {
          var2 = this.field_j[this.field_i] & 255;
          if (128 <= var2) {
            return -49152 + this.j(98203176);
          } else {
            return -64 + this.b((byte) 90);
          }
        } else {
          return -10;
        }
    }

    final void a(byte param0, byte[] param1, int param2, int param3) {
        int fieldTemp$7 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
                  fieldTemp$7 = this.field_i;
                  this.field_i = this.field_i + 1;
                  param1[var5_int] = this.field_j[fieldTemp$7];
                  var5_int++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
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
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("mg.FA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final byte d(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != -20398) {
          this.field_i = -110;
          fieldTemp$4 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_j[fieldTemp$4];
        } else {
          fieldTemp$5 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_j[fieldTemp$5];
        }
    }

    final void d(byte param0, int param1) {
        int fieldTemp$2 = 0;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 == -115) {
          L0: while (true) {
            if (this.field_i < param1) {
              fieldTemp$2 = this.field_i;
              this.field_i = this.field_i + 1;
              this.field_j[fieldTemp$2] = (byte) 0;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
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
        long var2 = 0L;
        long var4 = 0L;
        var2 = (long)this.l(0) & 4294967295L;
        if (param0 != -89) {
          this.d(61, -62);
          var4 = 4294967295L & (long)this.l(0);
          return var4 + (var2 << 513915424);
        } else {
          var4 = 4294967295L & (long)this.l(0);
          return var4 + (var2 << 513915424);
        }
    }

    final String g(int param0) {
        int discarded$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        var2 = this.field_i;
        if (param0 != 2) {
          discarded$3 = this.e(-29, -98);
          L0: while (true) {
            fieldTemp$4 = this.field_i;
            this.field_i = this.field_i + 1;
            if (-1 == (this.field_j[fieldTemp$4] ^ -1)) {
              var3 = -1 + -var2 + this.field_i;
              if (var3 == 0) {
                return "";
              } else {
                return tj.a(var3, var2, param0 + -2, this.field_j);
              }
            } else {
              continue L0;
            }
          }
        } else {
          L1: while (true) {
            fieldTemp$5 = this.field_i;
            this.field_i = this.field_i + 1;
            if (-1 == (this.field_j[fieldTemp$5] ^ -1)) {
              var3 = -1 + -var2 + this.field_i;
              if (var3 == 0) {
                return "";
              } else {
                return tj.a(var3, var2, param0 + -2, this.field_j);
              }
            } else {
              continue L1;
            }
          }
        }
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var7 = -105 % ((-7 - param0) / 62);
            var3_long = 0L;
            var5 = 0L;
            var8 = param1.length();
            var9 = 19;
            L1: while (true) {
              L2: {
                L3: {
                  if (-1 < (var9 ^ -1)) {
                    break L3;
                  } else {
                    var3_long = var3_long * 38L;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var9 < var8) {
                          L5: {
                            L6: {
                              var10 = param1.charAt(var9);
                              if (var10 < 65) {
                                break L6;
                              } else {
                                if (90 >= var10) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              L8: {
                                if (var10 < 97) {
                                  break L8;
                                } else {
                                  if (122 >= var10) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                L10: {
                                  if (48 > var10) {
                                    break L10;
                                  } else {
                                    if (57 >= var10) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var3_long = var3_long + 1L;
                                if (var11 == 0) {
                                  break L4;
                                } else {
                                  break L9;
                                }
                              }
                              var3_long = var3_long + (long)(-48 + (28 + var10));
                              if (var11 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                            var3_long = var3_long + (long)(var10 + 2 - 97);
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          var3_long = var3_long + (long)(2 + var10 - 65);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L11: {
                        if (var9 == 10) {
                          var5 = var3_long;
                          var3_long = 0L;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var9--;
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.a(-3357, var3_long);
                this.a(-3357, var5);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("mg.J(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L12;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L12;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final int j(int param0) {
        this.field_i = this.field_i + 2;
        if (param0 != 98203176) {
          field_g = true;
          return (this.field_j[this.field_i - 1] & 255) + (this.field_j[-2 + this.field_i] << 2011737416 & 65280);
        } else {
          return (this.field_j[this.field_i - 1] & 255) + (this.field_j[-2 + this.field_i] << 2011737416 & 65280);
        }
    }

    final void a(int param0, int param1, boolean param2, int[] param3) {
        int incrementValue$1 = 0;
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
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0 = false;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_i;
            this.field_i = param0;
            var6 = (-param0 + param1) / 8;
            var7 = 0;
            L1: while (true) {
              L2: {
                if (var7 >= var6) {
                  stackOut_11_0 = param2;
                  stackIn_12_0 = stackOut_11_0 ? 1 : 0;
                  break L2;
                } else {
                  var8 = this.l(0);
                  var9 = this.l(0);
                  var10 = -957401312;
                  var11 = -1640531527;
                  stackOut_3_0 = 32;
                  stackIn_12_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var13 != 0) {
                    break L2;
                  } else {
                    var12 = stackIn_4_0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          incrementValue$1 = var12;
                          var12--;
                          if ((incrementValue$1 ^ -1) >= -1) {
                            break L5;
                          } else {
                            var9 = var9 - (var10 + param3[(6167 & var10) >>> 306977099] ^ var8 + (var8 >>> -1388264155 ^ var8 << 1070781060));
                            var10 = var10 - var11;
                            var8 = var8 - (var10 + param3[3 & var10] ^ (var9 << -571053468 ^ var9 >>> -1535481179) + var9);
                            if (var13 != 0) {
                              break L4;
                            } else {
                              if (var13 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        this.field_i = this.field_i - 8;
                        this.b(var8, -1);
                        this.b(var9, -1);
                        var7++;
                        break L4;
                      }
                      continue L1;
                    }
                  }
                }
              }
              L6: {
                if (stackIn_12_0 == 0) {
                  break L6;
                } else {
                  this.field_j = (byte[]) null;
                  break L6;
                }
              }
              this.field_i = var5_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("mg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$9 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$9] = (byte)(int)(param1 >> 1590742960);
        int fieldTemp$10 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$10] = (byte)(int)(param1 >> 1464822120);
        int fieldTemp$11 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$11] = (byte)(int)(param1 >> -988339232);
        int fieldTemp$12 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$12] = (byte)(int)(param1 >> 1162468248);
        int fieldTemp$13 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$13] = (byte)(int)(param1 >> 1085564560);
        if (param0 != -3357) {
          this.b((byte) 14, -76);
          fieldTemp$14 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$14] = (byte)(int)(param1 >> -2118823160);
          fieldTemp$15 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$15] = (byte)(int)param1;
          return;
        } else {
          fieldTemp$16 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$16] = (byte)(int)(param1 >> -2118823160);
          fieldTemp$17 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$17] = (byte)(int)param1;
          return;
        }
    }

    final void b(byte param0, int param1) {
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$4] = (byte)(param1 >> -406696856);
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$5] = (byte)param1;
        if (param0 == -60) {
          return;
        } else {
          this.a(-11, 63L);
          return;
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        byte[] var4 = null;
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$5] = (byte)(param0 >> -207545960);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$6] = (byte)(param0 >> 890593296);
        int fieldTemp$7 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$7] = (byte)(param0 >> 557505480);
        if (param1 != -1) {
          var4 = (byte[]) null;
          this.a((byte) -60, (byte[]) null, -13, 28);
          fieldTemp$8 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$8] = (byte)param0;
          return;
        } else {
          fieldTemp$9 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$9] = (byte)param0;
          return;
        }
    }

    final void c(byte param0, int param1) {
        this.field_j[-1 + this.field_i + -param1] = (byte)param1;
        int var3 = -29 % ((param0 - 66) / 46);
    }

    final int e(int param0, int param1) {
        int var3 = 0;
        if (param0 != -18951) {
          return 41;
        } else {
          var3 = sd.a(param1, this.field_j, this.field_i, 0);
          this.b(var3, param0 + 18950);
          return var3;
        }
    }

    final boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_i = this.field_i - 4;
        var2 = sd.a(0, this.field_j, this.field_i, 0);
        var3 = this.l(0);
        if (var3 == var2) {
          return true;
        } else {
          if (param0 != 9982) {
            return false;
          } else {
            return false;
          }
        }
    }

    mg(int param0) {
        this.field_i = 0;
        this.field_j = q.a(param0, (byte) 121);
    }

    final int d(boolean param0) {
        byte[] var3 = null;
        if (param0) {
          if (this.field_j[this.field_i] >= 0) {
            return this.j(98203176);
          } else {
            return this.l(0) & 2147483647;
          }
        } else {
          var3 = (byte[]) null;
          this.a((byte) -88, (byte[]) null, -94, -42);
          if (this.field_j[this.field_i] >= 0) {
            return this.j(98203176);
          } else {
            return this.l(0) & 2147483647;
          }
        }
    }

    final void f(int param0, int param1) {
        if (param0 == -1) {
          if ((param1 ^ -1) <= -65) {
            if ((param1 ^ -1) > -16385) {
              if ((param1 ^ -1) > 16383) {
                throw new IllegalArgumentException();
              } else {
                this.b((byte) -60, 49152 + param1);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            if (-64 > param1) {
              if ((param1 ^ -1) > -16385) {
                if ((param1 ^ -1) > 16383) {
                  throw new IllegalArgumentException();
                } else {
                  this.b((byte) -60, 49152 + param1);
                  return;
                }
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              this.a(64 + param1, param0 + -102);
              return;
            }
          }
        } else {
          this.c((byte) 106, -63);
          if ((param1 ^ -1) > -65) {
            if (-64 <= param1) {
              this.a(64 + param1, param0 + -102);
              return;
            } else {
              if ((param1 ^ -1) > -16385) {
                if ((param1 ^ -1) <= 16383) {
                  this.b((byte) -60, 49152 + param1);
                  return;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            if ((param1 ^ -1) > -16385) {
              if ((param1 ^ -1) > 16383) {
                throw new IllegalArgumentException();
              } else {
                this.b((byte) -60, 49152 + param1);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        }
    }

    final void a(byte param0, int param1) {
        if (param0 > -31) {
          return;
        } else {
          L0: {
            if (-1 != (param1 & -128 ^ -1)) {
              L1: {
                if ((param1 & -16384) != 0) {
                  L2: {
                    if ((param1 & -2097152) == 0) {
                      break L2;
                    } else {
                      L3: {
                        if (-1 != (param1 & -268435456 ^ -1)) {
                          this.a(128 | param1 >>> -88120900, -102);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.a(param1 >>> -767907307 | 128, -4);
                      break L2;
                    }
                  }
                  this.a(128 | param1 >>> -176701746, -106);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.a(128 | param1 >>> 431540743, -90);
              break L0;
            } else {
              break L0;
            }
          }
          this.a(param1 & 127, -70);
          return;
        }
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
          return ((this.field_j[this.field_i - 2] & 255) << -373962616) + ((255 & this.field_j[-3 + this.field_i]) << -299752560) + (((255 & this.field_j[this.field_i - 4]) << -1552594376) + (this.field_j[-1 + this.field_i] & 255));
        } else {
          return ((this.field_j[this.field_i - 2] & 255) << -373962616) + ((255 & this.field_j[-3 + this.field_i]) << -299752560) + (((255 & this.field_j[this.field_i - 4]) << -1552594376) + (this.field_j[-1 + this.field_i] & 255));
        }
    }

    final void b(int param0, long param1) {
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$5] = (byte)(int)(param1 >> -1176418848);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$6] = (byte)(int)(param1 >> -1780835944);
        if (param0 < 99) {
          return;
        } else {
          fieldTemp$7 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$7] = (byte)(int)(param1 >> -572516720);
          fieldTemp$8 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$8] = (byte)(int)(param1 >> 1533620424);
          fieldTemp$9 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$9] = (byte)(int)param1;
          return;
        }
    }

    static {
        field_h = "Awesomo";
        field_m = new va();
        field_f = 64;
        field_l = new im();
    }
}
