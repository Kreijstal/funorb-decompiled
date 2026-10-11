/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ec extends ne {
    int field_o;
    static String field_r;
    static String[] field_l;
    static fb field_i;
    static String field_q;
    static q[] field_j;
    static pp field_n;
    static int field_p;
    byte[] field_m;
    static nh field_k;

    final static void a(int param0, int param1, byte param2, cn param3, int param4, int param5) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var12Lifetime1;
        int var12Lifetime2;
        try {
          param0 = param0 + param3.field_A;
          param1 = param1 + param3.field_w;
          var6_int = param1 + gf.field_i * param0;
          var7 = 0;
          var8 = param3.field_v;
          var9 = param3.field_y;
          var10 = gf.field_i - var9;
          var11 = 0;
          if (gf.field_f > param0) {
            var12 = -param0 + gf.field_f;
            var7 = var7 + var12 * var9;
            var6_int = var6_int + var12 * gf.field_i;
            param0 = gf.field_f;
            var8 = var8 - var12;
          }
          if (gf.field_j > param1) {
            var12Lifetime1 = gf.field_j - param1;
            var6_int = var6_int + var12Lifetime1;
            var9 = var9 - var12Lifetime1;
            var10 = var10 + var12Lifetime1;
            var7 = var7 + var12Lifetime1;
            param1 = gf.field_j;
            var11 = var11 + var12Lifetime1;
          }
          if (gf.field_e < param0 + var8) {
            var8 = var8 - (var8 + (param0 - gf.field_e));
          }
          if (param2 > -60) {
            return;
          }
          if (gf.field_h < (var9 + param1)) {
            var12Lifetime2 = -gf.field_h + param1 + var9;
            var10 = var10 + var12Lifetime2;
            var11 = var11 + var12Lifetime2;
            var9 = var9 - var12Lifetime2;
          }
          if (var9 > 0 &&
            var8 > 0) {
            if (param5 != 256) {
              qj.a(param4, 0, 0, var7, param3.field_B, var10, param5, var11, 0, 0, 0, 105, gf.field_b, var9, var6_int, var8);
              if (DungeonAssault.field_K == 0) {
                return;
              }
            }
            he.a(gf.field_b, 0, false, var8, var9, param4, 0, var10, var6_int, var7, var11, 0, 0, 0, param3.field_B);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("ec.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void i(int param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          fieldTemp$2 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$2] = (byte)(param0 >> 8);
          if (param1 > -84) {
            this.f(-64);
          }
          fieldTemp$3 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$3] = (byte)param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "ec.VA(" + param0 + ',' + param1 + ')');
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int param3, int param4, CharSequence param5) {
        int stackIn_3_0 = 0;
        int stackIn_187_0 = 0;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        String stackIn_192_2 = null;
        StringBuilder stackIn_195_1 = null;
        String stackIn_196_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        try {
          var6_int = -param1 + param0;
          var7 = 0;
          if (param3 != -1) {
            stackIn_3_0 = 1;
            return stackIn_3_0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6_int <= var7))) {
            var8 = param5.charAt(var7 + param1);
            stackIn_187_0 = -1;
            if (var9 == 0) {
              L3: {
                if ((stackIn_187_0 <= ~var8 ||
                  var8 >= 128) &&
                  (var8 < 160 ||
                  var8 > 255)) {
                  switch (var8) {
                    case 402:
                      param2[var7 + param4] = (byte) -125;
                      break L3;
                    case 8224:
                      param2[var7 + param4] = (byte) -122;
                      break L3;
                    case 8225:
                      param2[var7 + param4] = (byte) -121;
                      break L3;
                    default:
                      switch (var8) {
                        case 8249:
                          param2[param4 + var7] = (byte) -117;
                          break L3;
                        case 8216:
                          param2[param4 + var7] = (byte) -111;
                          break L3;
                        case 8221:
                          param2[param4 + var7] = (byte) -108;
                          break L3;
                        case 8226:
                          param2[param4 + var7] = (byte) -107;
                          break L3;
                        case 8212:
                          param2[param4 + var7] = (byte) -105;
                          break L3;
                        case 732:
                          param2[var7 + param4] = (byte) -104;
                          break L3;
                        case 353:
                          param2[param4 + var7] = (byte) -102;
                          break L3;
                        default:
                          param2[var7 + param4] = (byte) 63;
                          break L3;
                        case 376:
                          param2[param4 + var7] = (byte) -97;
                          break L3;
                        case 382:
                          param2[var7 + param4] = (byte) -98;
                          break L3;
                        case 339:
                          param2[param4 + var7] = (byte) -100;
                          break L3;
                        case 8250:
                          param2[param4 + var7] = (byte) -101;
                          break L3;
                        case 8482:
                          param2[var7 + param4] = (byte) -103;
                          break L3;
                        case 8211:
                          param2[var7 + param4] = (byte) -106;
                          break L3;
                        case 8220:
                          param2[var7 + param4] = (byte) -109;
                          break L3;
                        case 8217:
                          param2[param4 + var7] = (byte) -110;
                          break L3;
                        case 381:
                          param2[var7 + param4] = (byte) -114;
                          break L3;
                        case 338:
                          param2[var7 + param4] = (byte) -116;
                          break L3;
                      }
                    case 352:
                      param2[param4 + var7] = (byte) -118;
                      break L3;
                    case 8240:
                      param2[var7 + param4] = (byte) -119;
                      break L3;
                    case 710:
                      param2[param4 + var7] = (byte) -120;
                      break L3;
                    case 8230:
                      param2[param4 + var7] = (byte) -123;
                      break L3;
                    case 8222:
                      param2[var7 + param4] = (byte) -124;
                      break L3;
                    case 8218:
                      param2[var7 + param4] = (byte) -126;
                      break L3;
                    case 8364:
                      param2[param4 + var7] = (byte) -128;
                      break L3;
                  }
                }
                param2[param4 + var7] = (byte)var8;
              }
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_187_0 = var6_int;
          }
          return stackIn_187_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_191_0 = var6;
          stackIn_191_1 = new StringBuilder().append("ec.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_192_2 = "null";
          } else {
            stackIn_192_2 = "{...}";
          }
          stackIn_195_1 = ((StringBuilder) (Object) stackIn_191_1).append(stackIn_192_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_196_2 = "null";
          } else {
            stackIn_196_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_191_0), ((StringBuilder) (Object) stackIn_195_1).append(stackIn_196_2).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 6) {
            this.e(-27, -85);
          }
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$1] = (byte)param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "ec.U(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        try {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$0] = (byte)(int)(param0 >> 32);
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$1] = (byte)(int)(param0 >> 24);
          fieldTemp$2 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$2] = (byte)(int)(param0 >> 16);
          fieldTemp$3 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$3] = (byte)(int)(param0 >> 8);
          fieldTemp$4 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$4] = (byte)(int)param0;
          if (param1 != 836) {
            this.c(-37, -35);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ec.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int[] param0, boolean param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        try {
          var3_int = this.field_o / 8;
          this.field_o = 0;
          var4 = 0;
          if (!param1) {
            field_n = (pp) null;
          }
          while (var3_int > var4) {
            var5 = this.h(-56);
            var6 = this.h(-54);
            var7 = 0;
            var8 = -1640531527;
            if (var10 != 0) {
              return;
            }
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param0[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 >>> 5 ^ var5 << 4) ^ param0[1138753539 & var7 >>> 11] + var7);
                continue;
              }
              break;
            }
            this.field_o = this.field_o - 8;
            this.a((byte) 63, var5);
            this.a((byte) 63, var6);
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ec.N(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(String param0, byte param1) {
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param0.length();
          var8 = 19;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 < 0))) {
            var3_long = var3_long * 38L;
            stackIn_32_0 = ~var7;
            stackIn_32_1 = ~var8;
            if (var10 == 0) {
              if (stackIn_32_0 < stackIn_32_1) {
                var9 = param0.charAt(var8);
                if (var9 >= 65 &&
                  var9 <= 90) {
                  var3_long = var3_long + (long)(var9 - 63);
                } else {
                  if (var9 >= 97 &&
                    122 >= var9) {
                    var3_long = var3_long + (long)(2 + var9 - 97);
                  } else {
                    if (var9 < 48 ||
                      var9 > 57) {
                      var3_long = var3_long + 1L;
                    } else {
                      var3_long = var3_long + (long)(-48 + (28 + var9));
                    }
                  }
                }
              }
              if (var8 == 10) {
                var5 = var3_long;
                var3_long = 0L;
              }
              var8--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.a(var3_long, (byte) -123);
            this.a(var5, (byte) -104);
            stackIn_32_0 = param1;
            stackIn_32_1 = 84;
          }
          if (stackIn_32_0 <= stackIn_32_1) {
            this.c((byte) 18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("ec.DB(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(long param0, byte param1) {
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          fieldTemp$7 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$7] = (byte)(int)(param0 >> 48);
          fieldTemp$8 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$8] = (byte)(int)(param0 >> 40);
          fieldTemp$9 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$9] = (byte)(int)(param0 >> 32);
          fieldTemp$10 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$10] = (byte)(int)(param0 >> 24);
          fieldTemp$11 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$11] = (byte)(int)(param0 >> 16);
          if (param1 >= -26) {
            field_l = (String[]) null;
          }
          fieldTemp$12 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$12] = (byte)(int)(param0 >> 8);
          fieldTemp$13 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$13] = (byte)(int)param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var4), "ec.FB(" + param0 + ',' + param1 + ')');
        }
    }

    final void g(int param0, int param1) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        try {
          if (param0 != 3) {
            field_p = 126;
          }
          while (this.field_o < param1) {
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_m[fieldTemp$0] = (byte) 0;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "ec.T(" + param0 + ',' + param1 + ')');
        }
    }

    final static q g(int param0) {
        q stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        q var1 = null;
        RuntimeException var1_ref = null;
        try {
          var1 = new q(ce.field_x, tb.field_i, hg.field_t[0], fe.field_g[0], jc.field_f[param0], jn.field_k[0], ub.field_q[0], uo.field_b);
          sb.a(500);
          stackIn_1_0 = var1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1_ref), "ec.CB(" + param0 + ')');
        }
    }

    final long b(byte param0) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        long var5 = 0L;
        try {
          var2_int = -31 / ((param0 + 24) / 58);
          var3 = (long)this.f(-112) & 4294967295L;
          var5 = 4294967295L & (long)this.h(-111);
          stackIn_1_0 = (var3 << 32) + var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.SA(" + param0 + ')');
        }
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        try {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$0] = (byte)(int)(param1 >> 56);
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$1] = (byte)(int)(param1 >> 48);
          fieldTemp$2 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$2] = (byte)(int)(param1 >> 40);
          fieldTemp$3 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$3] = (byte)(int)(param1 >> 32);
          fieldTemp$4 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$4] = (byte)(int)(param1 >> 24);
          fieldTemp$5 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$5] = (byte)(int)(param1 >> 16);
          fieldTemp$6 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$6] = (byte)(int)(param1 >> 8);
          fieldTemp$7 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$7] = (byte)(int)param1;
          if (param0 <= 26) {
            this.k(3);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ec.EB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void i(int param0) {
        field_n = null;
        field_k = null;
        field_r = null;
        field_l = null;
        if (param0 != 25) {
          return;
        }
        try {
          field_i = null;
          field_q = null;
          field_j = null;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ec.S(" + param0 + ')');
        }
    }

    final int h(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -29) {
            this.f(30);
          }
          this.field_o = this.field_o + 4;
          stackIn_4_0 = (this.field_m[this.field_o - 2] << 8 & 65280) + ((this.field_m[-3 + this.field_o] & 255) << 16) + ((this.field_m[this.field_o - 4] << 24 & -16777216) + (this.field_m[this.field_o - 1] & 255));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.BA(" + param0 + ')');
        }
    }

    final int e(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 90 % ((-5 - param0) / 62);
          this.field_o = this.field_o + 3;
          var3 = (this.field_m[-1 + this.field_o] & 255) + ((this.field_m[this.field_o - 3] & 255) << 16) + ((this.field_m[-2 + this.field_o] & 255) << 8);
          if (var3 > 8388607) {
            var3 = var3 - 16777216;
          }
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.OA(" + param0 + ')');
        }
    }

    final void f(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < ~param1 &&
            param1 >= -64) {
            this.a(6, 64 + param1);
            return;
          }
          if (param1 < 16384 &&
            -16384 <= param1) {
            this.i(param1 + 49152, -104);
            return;
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "ec.KA(" + param0 + ',' + param1 + ')');
        }
    }

    final String a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          var2_int = this.field_m[fieldTemp$0];
          if (var2_int != 0) {
            throw new IllegalStateException("");
          }
          var3 = this.field_o;
          if (param0 != -21030) {
            field_p = 56;
          }
          do {
            fieldTemp$1 = this.field_o;
            this.field_o = this.field_o + 1;
          } while (0 != this.field_m[fieldTemp$1]);
          var4 = -1 + (this.field_o - var3);
          if (var4 != 0) {
            stackIn_13_0 = mk.a((byte) -24, this.field_m, var4, var3);
            return stackIn_13_0;
          }
          stackIn_11_0 = "";
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.BB(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        try {
          var5_int = param1;
          while (param1 + param2 > var5_int) {
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
            param3[var5_int] = this.field_m[fieldTemp$0];
            var5_int++;
            if (var6 != 0) {
              return;
            }
          }
          if (param0 >= -86) {
            this.field_m = (byte[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ec.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(nh param0, boolean param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2776_0;
            StringBuilder stackIn_2776_1;
            String stackIn_2777_2;
            boolean stackIn_2785_0;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            nh param0;
            boolean param1;
            boolean finished;
            $CfrPartitionedBody(nh initialParam0, boolean initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2776_0 = null;
                this.stackIn_2776_1 = null;
                this.stackIn_2777_2 = null;
                this.stackIn_2785_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                d.field_d = param0;
                var2 = gm.a("text_game_name", false);
                if (var2 != null) {
                  ba.field_h = dj.a(var2, param1);
                }
                var2 = gm.a("text_benefits,0", false);
                if (var2 != null) {
                  qk.field_b[0] = dj.a(var2, false);
                }
                var2 = gm.a("text_benefits,1", false);
                if (null != var2) {
                  qk.field_b[1] = dj.a(var2, param1);
                }
                var2 = gm.a("text_benefits,2", false);
                if (var2 != null) {
                  qk.field_b[2] = dj.a(var2, false);
                }
                var2 = gm.a("text_benefits,3", false);
                if (null != var2) {
                  qk.field_b[3] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,0", false);
                if (null != var2) {
                  ce.field_o[0] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,1", param1);
                if (var2 != null) {
                  ce.field_o[1] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,2", false);
                if (var2 != null) {
                  ce.field_o[2] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,3", false);
                if (var2 != null) {
                  ce.field_o[3] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_names,4", param1);
                if (var2 != null) {
                  ce.field_o[4] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,5", param1);
                if (null != var2) {
                  ce.field_o[5] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,6", false);
                if (null != var2) {
                  ce.field_o[6] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,7", false);
                if (var2 != null) {
                  ce.field_o[7] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_names,8", false);
                if (var2 != null) {
                  ce.field_o[8] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_names,9", false);
                if (var2 != null) {
                  ce.field_o[9] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,10", param1);
                if (var2 != null) {
                  ce.field_o[10] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,11", param1);
                if (var2 != null) {
                  ce.field_o[11] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,12", false);
                if (null != var2) {
                  ce.field_o[12] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,13", false);
                if (var2 != null) {
                  ce.field_o[13] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,14", false);
                if (null != var2) {
                  ce.field_o[14] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,15", false);
                if (null != var2) {
                  ce.field_o[15] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,16", false);
                if (null != var2) {
                  ce.field_o[16] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_names,17", false);
                if (var2 != null) {
                  ce.field_o[17] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,18", param1);
                if (null != var2) {
                  ce.field_o[18] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_names,19", false);
                if (var2 != null) {
                  ce.field_o[19] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_names,20", false);
                if (var2 != null) {
                  ce.field_o[20] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,21", false);
                if (null != var2) {
                  ce.field_o[21] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,22", false);
                if (var2 != null) {
                  ce.field_o[22] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,23", false);
                if (null != var2) {
                  ce.field_o[23] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_names,24", false);
                if (null != var2) {
                  ce.field_o[24] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,25", false);
                if (null != var2) {
                  ce.field_o[25] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,26", false);
                if (null != var2) {
                  ce.field_o[26] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,27", param1);
                if (var2 != null) {
                  ce.field_o[27] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,28", false);
                if (null != var2) {
                  ce.field_o[28] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,29", false);
                if (null != var2) {
                  ce.field_o[29] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,30", param1);
                if (var2 != null) {
                  ce.field_o[30] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,31", param1);
                if (var2 != null) {
                  ce.field_o[31] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,32", false);
                if (null != var2) {
                  ce.field_o[32] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,33", false);
                if (var2 != null) {
                  ce.field_o[33] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,34", false);
                if (var2 != null) {
                  ce.field_o[34] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,35", param1);
                if (var2 != null) {
                  ce.field_o[35] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,36", false);
                if (var2 != null) {
                  ce.field_o[36] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,37", false);
                if (null != var2) {
                  ce.field_o[37] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,38", param1);
                if (null != var2) {
                  ce.field_o[38] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,39", param1);
                if (var2 != null) {
                  ce.field_o[39] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_names,40", param1);
                if (null != var2) {
                  ce.field_o[40] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,41", false);
                if (var2 != null) {
                  ce.field_o[41] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,42", false);
                if (var2 != null) {
                  ce.field_o[42] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_names,43", false);
                if (null != var2) {
                  ce.field_o[43] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_names,44", false);
                if (var2 != null) {
                  ce.field_o[44] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_names,45", param1);
                if (null != var2) {
                  ce.field_o[45] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,0", false);
                if (var2 != null) {
                  bb.field_k[0] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,1", false);
                if (null != var2) {
                  bb.field_k[1] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,2", false);
                if (null != var2) {
                  bb.field_k[2] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,3", false);
                if (var2 != null) {
                  bb.field_k[3] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,4", param1);
                if (null != var2) {
                  bb.field_k[4] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,5", param1);
                if (var2 != null) {
                  bb.field_k[5] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,6", false);
                if (null != var2) {
                  bb.field_k[6] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,7", false);
                if (var2 != null) {
                  bb.field_k[7] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,8", false);
                if (var2 != null) {
                  bb.field_k[8] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,9", false);
                if (var2 != null) {
                  bb.field_k[9] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,10", param1);
                if (null != var2) {
                  bb.field_k[10] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,11", param1);
                if (var2 != null) {
                  bb.field_k[11] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,12", false);
                if (null != var2) {
                  bb.field_k[12] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,13", false);
                if (null != var2) {
                  bb.field_k[13] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,14", param1);
                if (null != var2) {
                  bb.field_k[14] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,15", false);
                if (null != var2) {
                  bb.field_k[15] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,16", false);
                if (var2 != null) {
                  bb.field_k[16] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,17", false);
                if (var2 != null) {
                  bb.field_k[17] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,18", false);
                if (null != var2) {
                  bb.field_k[18] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,19", false);
                if (var2 != null) {
                  bb.field_k[19] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,20", false);
                if (null != var2) {
                  bb.field_k[20] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,21", false);
                if (null != var2) {
                  bb.field_k[21] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,22", false);
                if (var2 != null) {
                  bb.field_k[22] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,23", false);
                if (var2 != null) {
                  bb.field_k[23] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,24", false);
                if (null != var2) {
                  bb.field_k[24] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,25", param1);
                if (null != var2) {
                  bb.field_k[25] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,26", false);
                if (var2 != null) {
                  bb.field_k[26] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,27", false);
                if (var2 != null) {
                  bb.field_k[27] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,28", false);
                if (var2 != null) {
                  bb.field_k[28] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,29", param1);
                if (null != var2) {
                  bb.field_k[29] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,30", false);
                if (var2 != null) {
                  bb.field_k[30] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,31", false);
                if (var2 != null) {
                  bb.field_k[31] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,32", false);
                if (null != var2) {
                  bb.field_k[32] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,33", false);
                if (var2 != null) {
                  bb.field_k[33] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,34", false);
                if (null != var2) {
                  bb.field_k[34] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,35", false);
                if (var2 != null) {
                  bb.field_k[35] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,36", false);
                if (var2 != null) {
                  bb.field_k[36] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,37", false);
                if (null != var2) {
                  bb.field_k[37] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,38", false);
                if (var2 != null) {
                  bb.field_k[38] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,39", false);
                if (var2 != null) {
                  bb.field_k[39] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,40", false);
                if (var2 != null) {
                  bb.field_k[40] = dj.a(var2, param1);
                }
                var2 = gm.a("achievement_criteria,41", false);
                if (var2 != null) {
                  bb.field_k[41] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,42", false);
                if (null != var2) {
                  bb.field_k[42] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,43", false);
                if (null != var2) {
                  bb.field_k[43] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,44", false);
                if (var2 != null) {
                  bb.field_k[44] = dj.a(var2, false);
                }
                var2 = gm.a("achievement_criteria,45", param1);
                if (null != var2) {
                  bb.field_k[45] = dj.a(var2, false);
                }
                var2 = gm.a("intro_captions,0", false);
                if (var2 != null) {
                  qh.field_J[0] = dj.a(var2, false);
                }
                var2 = gm.a("intro_captions,1", false);
                if (null != var2) {
                  qh.field_J[1] = dj.a(var2, param1);
                }
                var2 = gm.a("intro_captions,2", false);
                if (null != var2) {
                  qh.field_J[2] = dj.a(var2, param1);
                }
                var2 = gm.a("intro_captions,3", param1);
                if (null != var2) {
                  qh.field_J[3] = dj.a(var2, false);
                }
                var2 = gm.a("intro_captions,4", false);
                if (null != var2) {
                  qh.field_J[4] = dj.a(var2, false);
                }
                var2 = gm.a("intro_captions,5", false);
                if (var2 != null) {
                  qh.field_J[5] = dj.a(var2, false);
                }
                var2 = gm.a("intro_captions,6", false);
                if (var2 != null) {
                  qh.field_J[6] = dj.a(var2, false);
                }
                var2 = gm.a("intro_captions,7", param1);
                if (var2 != null) {
                  qh.field_J[7] = dj.a(var2, false);
                }
                var2 = gm.a("intro_captions,8", false);
                if (var2 != null) {
                  qh.field_J[8] = dj.a(var2, param1);
                }
                var2 = gm.a("instructions_pages,0", false);
                if (var2 != null) {
                  en.field_a[0] = dj.a(var2, param1);
                }
                var2 = gm.a("instructions_pages,1", param1);
                if (null != var2) {
                  en.field_a[1] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_pages,2", param1);
                if (null != var2) {
                  en.field_a[2] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_pages,3", false);
                if (var2 != null) {
                  en.field_a[3] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_pages,4", false);
                if (null != var2) {
                  en.field_a[4] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_pages,5", false);
                if (var2 != null) {
                  en.field_a[5] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_pages,6", false);
                if (var2 != null) {
                  en.field_a[6] = dj.a(var2, param1);
                }
                var2 = gm.a("instructions_pages,7", param1);
                if (var2 != null) {
                  en.field_a[7] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_monsterroom", false);
                if (var2 != null) {
                  uj.field_b = dj.a(var2, false);
                }
                var2 = gm.a("instructions_traproom", false);
                if (null != var2) {
                  an.field_D = dj.a(var2, param1);
                }
                var2 = gm.a("instructions_guardianroom", false);
                if (var2 != null) {
                  sg.field_a = dj.a(var2, false);
                }
                var2 = gm.a("instructions_subtitles_text,0", false);
                if (null != var2) {
                  ie.field_j[0] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_subtitles_text,1", false);
                if (null != var2) {
                  ie.field_j[1] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_subtitles_text,2", false);
                if (var2 != null) {
                  ie.field_j[2] = dj.a(var2, param1);
                }
                var2 = gm.a("instructions_subtitles_text,3", param1);
                if (null != var2) {
                  ie.field_j[3] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_subtitles_text,4", false);
                if (var2 != null) {
                  ie.field_j[4] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_subtitles_text,5", false);
                if (var2 != null) {
                  ie.field_j[5] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_subtitles_text,6", param1);
                if (null != var2) {
                  ie.field_j[6] = dj.a(var2, false);
                }
                var2 = gm.a("instructions_subtitles_text,7", false);
                if (var2 != null) {
                  ie.field_j[7] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_welcome1,0", false);
                if (var2 != null) {
                  bh.field_J[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_welcome1,1", false);
                if (var2 != null) {
                  bh.field_J[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_welcome2,0", param1);
                if (null != var2) {
                  nf.field_C[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_welcome2,1", false);
                if (null != var2) {
                  nf.field_C[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_raiding1,1", param1);
                if (null != var2) {
                  rl.field_e[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_raiding2,0", param1);
                if (null != var2) {
                  co.field_J[0] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_raiding2,1", false);
                if (var2 != null) {
                  co.field_J[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_raiders1,1", false);
                if (var2 != null) {
                  p.field_J[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_raiders2,1", param1);
                if (null != var2) {
                  je.field_f[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_raiders3,1", param1);
                if (var2 != null) {
                  og.field_a[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_raiders4,0", false);
                if (null != var2) {
                  h.field_y[0] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_raiders4,1", false);
                if (var2 != null) {
                  h.field_y[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_rooms1,0", param1);
                if (null != var2) {
                  pp.field_E[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_rooms1,1", param1);
                if (null != var2) {
                  pp.field_E[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_rooms2,1", param1);
                if (var2 != null) {
                  np.field_C[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_firstroom1a,0", param1);
                if (var2 != null) {
                  eg.field_b[0] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_firstroom1a,1", param1);
                if (null != var2) {
                  eg.field_b[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_firstroom1b,0", false);
                if (null != var2) {
                  bn.field_m[0] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_firstroom1b,1", false);
                if (var2 != null) {
                  bn.field_m[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_firstroom2,1", false);
                if (var2 != null) {
                  lp.field_q[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_monster1,0", param1);
                if (var2 != null) {
                  rl.field_i[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_monster1,1", false);
                if (null != var2) {
                  rl.field_i[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_monster2,1", false);
                if (var2 != null) {
                  lb.field_d[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_monster3,1", false);
                if (var2 != null) {
                  le.field_c[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_strategies1,0", param1);
                if (null != var2) {
                  tp.field_C[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_strategies1,1", false);
                if (null != var2) {
                  tp.field_C[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_strategies2,1", false);
                if (var2 != null) {
                  lp.field_F[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_strategies3,1", false);
                if (null != var2) {
                  nl.field_f[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_strategies4,1", false);
                if (null != var2) {
                  ll.field_j[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_trap1,0", false);
                if (null != var2) {
                  bb.field_t[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_trap1,1", false);
                if (var2 != null) {
                  bb.field_t[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_trap2,1", false);
                if (null != var2) {
                  ka.field_d[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_guardian1,0", false);
                if (var2 != null) {
                  eh.field_e[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_guardian1,1", false);
                if (null != var2) {
                  eh.field_e[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_guardian2,1", param1);
                if (var2 != null) {
                  bk.field_f[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_victory,0", false);
                if (var2 != null) {
                  hj.field_O[0] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_victory,1", false);
                if (var2 != null) {
                  hj.field_O[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_defeat,0", false);
                if (var2 != null) {
                  ek.field_j[0] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_defeat,1", param1);
                if (null != var2) {
                  ek.field_j[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_defeat_repeated,0", param1);
                if (null != var2) {
                  rm.field_S[0] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_defeat_repeated,1", param1);
                if (null != var2) {
                  rm.field_S[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_death,0", false);
                if (null != var2) {
                  wl.field_c[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_death,1", param1);
                if (var2 != null) {
                  wl.field_c[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_hoardroom,0", false);
                if (null != var2) {
                  ha.field_j[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_hoardroom,1", false);
                if (null != var2) {
                  ha.field_j[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_abilities,0", false);
                if (null != var2) {
                  qa.field_e[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_abilities,1", false);
                if (var2 != null) {
                  qa.field_e[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_modifiers,0", param1);
                if (var2 != null) {
                  tl.field_m[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_modifiers,1", param1);
                if (var2 != null) {
                  tl.field_m[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_raid_complete,0", false);
                if (null != var2) {
                  ug.field_M[0] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_raid_complete,1", false);
                if (var2 != null) {
                  ug.field_M[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_construction1,0", param1);
                if (var2 != null) {
                  qh.field_E[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_construction1,1", false);
                if (null != var2) {
                  qh.field_E[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_construction2,1", false);
                if (null != var2) {
                  dg.field_O[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_placeroom1,1", false);
                if (var2 != null) {
                  tg.field_e[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_placeroom2,1", param1);
                if (null != var2) {
                  uo.field_g[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_stable1,0", false);
                if (null != var2) {
                  hh.field_n[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_stable1,1", false);
                if (null != var2) {
                  hh.field_n[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_stable2,1", false);
                if (null != var2) {
                  fj.field_a[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_stable3,1", false);
                if (null != var2) {
                  k.field_a[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_stable_noraider,1", false);
                if (var2 != null) {
                  rn.field_g[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_end_justplay,0", param1);
                if (null != var2) {
                  kg.field_e[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_end_justplay,1", false);
                if (var2 != null) {
                  kg.field_e[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_dragonsofrenown1,0", false);
                if (var2 != null) {
                  vf.field_A[0] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_dragonsofrenown1,1", param1);
                if (var2 != null) {
                  vf.field_A[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_dragonsofrenown2,1", false);
                if (var2 != null) {
                  qd.field_e[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_dragonsofrenown3,1", false);
                if (var2 != null) {
                  rk.field_k[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_dragonsofrenown4,1", false);
                if (null != var2) {
                  un.field_b[1] = dj.a(var2, false);
                }
                var2 = gm.a("tutorial_selectraiders,1", param1);
                if (var2 != null) {
                  tp.field_A[1] = dj.a(var2, param1);
                }
                var2 = gm.a("tutorial_justplay_warning", param1);
                if (null != var2) {
                  ub.field_r = dj.a(var2, false);
                }
                var2 = gm.a("goblin_runt", param1);
                if (null != var2) {
                  d.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("saurus_spawn", false);
                if (null != var2) {
                  ng.field_J = dj.a(var2, false);
                }
                var2 = gm.a("goblin_cleaver", false);
                if (null != var2) {
                  ub.field_l = dj.a(var2, false);
                }
                var2 = gm.a("orc_warrior", false);
                if (null != var2) {
                  gj.field_a = dj.a(var2, false);
                }
                var2 = gm.a("witch", false);
                if (var2 != null) {
                  ml.field_c = dj.a(var2, false);
                }
                var2 = gm.a("beastman", param1);
                if (null != var2) {
                  DungeonAssault.field_J = dj.a(var2, param1);
                }
                var2 = gm.a("saurus_slink", false);
                if (var2 != null) {
                  fb.field_b = dj.a(var2, param1);
                }
                var2 = gm.a("mercenary_knight", false);
                if (var2 != null) {
                  jl.field_b = dj.a(var2, false);
                }
                var2 = gm.a("priest", false);
                if (null != var2) {
                  jk.field_Cb = dj.a(var2, false);
                }
                var2 = gm.a("orc_blademaster", false);
                if (null != var2) {
                  dc.field_H = dj.a(var2, false);
                }
                var2 = gm.a("goblin_scout", false);
                if (null != var2) {
                  dn.field_W = dj.a(var2, false);
                }
                var2 = gm.a("necromancer", false);
                if (null != var2) {
                  df.field_g = dj.a(var2, param1);
                }
                var2 = gm.a("ogre_thug", false);
                if (var2 != null) {
                  lf.field_v = dj.a(var2, false);
                }
                var2 = gm.a("enchantress", false);
                if (null != var2) {
                  ok.field_jb = dj.a(var2, false);
                }
                var2 = gm.a("saurus_warrior", false);
                if (null != var2) {
                  sd.field_I = dj.a(var2, false);
                }
                var2 = gm.a("orc_shaman", false);
                if (null != var2) {
                  ik.field_d = dj.a(var2, false);
                }
                var2 = gm.a("cave_troll", false);
                if (var2 != null) {
                  ua.field_d = dj.a(var2, false);
                }
                var2 = gm.a("northman_ranger", false);
                if (var2 != null) {
                  oa.field_i = dj.a(var2, false);
                }
                var2 = gm.a("dwarf_renegade", false);
                if (null != var2) {
                  ae.field_c = dj.a(var2, false);
                }
                var2 = gm.a("thief", false);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  o.field_l = dj.a(var2, false);
                }
                var2 = gm.a("zealot", false);
                if (var2 != null) {
                  bo.field_Mb = dj.a(var2, param1);
                }
                var2 = gm.a("dark_elf_assassin", false);
                if (var2 != null) {
                  op.field_b = dj.a(var2, false);
                }
                var2 = gm.a("berserker", false);
                if (null != var2) {
                  lf.field_p = dj.a(var2, false);
                }
                var2 = gm.a("ogre_brute", false);
                if (var2 != null) {
                  sp.field_f = dj.a(var2, false);
                }
                var2 = gm.a("spy", false);
                if (var2 != null) {
                  hp.field_d = dj.a(var2, param1);
                }
                var2 = gm.a("shapeshifter", false);
                if (null != var2) {
                  mp.field_g = dj.a(var2, false);
                }
                var2 = gm.a("black_knight", param1);
                if (var2 != null) {
                  ro.field_m = dj.a(var2, false);
                }
                var2 = gm.a("minotaur", false);
                if (var2 != null) {
                  uf.field_c = dj.a(var2, param1);
                }
                var2 = gm.a("warlock", false);
                if (null != var2) {
                  kf.field_i = dj.a(var2, param1);
                }
                var2 = gm.a("death_knight", param1);
                if (var2 != null) {
                  e.field_k = dj.a(var2, param1);
                }
                var2 = gm.a("chaos_champion", false);
                if (var2 != null) {
                  ih.field_v = dj.a(var2, param1);
                }
                var2 = gm.a("centaur", false);
                if (var2 != null) {
                  gh.field_e = dj.a(var2, param1);
                }
                var2 = gm.a("daemonette", false);
                if (var2 != null) {
                  sg.field_f = dj.a(var2, false);
                }
                var2 = gm.a("dryad", false);
                if (null != var2) {
                  lm.field_r = dj.a(var2, false);
                }
                var2 = gm.a("none", false);
                if (null != var2) {
                  ic.field_A = dj.a(var2, false);
                }
                var2 = gm.a("unknown", false);
                if (var2 != null) {
                  ie.field_n = dj.a(var2, param1);
                }
                var2 = gm.a("hoard", false);
                if (null != var2) {
                  cm.field_S = dj.a(var2, false);
                }
                var2 = gm.a("entrance", param1);
                if (null != var2) {
                  wi.field_mb = dj.a(var2, param1);
                }
                var2 = gm.a("pit", false);
                if (var2 != null) {
                  go.field_F = dj.a(var2, false);
                }
                var2 = gm.a("snakes", param1);
                if (var2 != null) {
                  ce.field_m = dj.a(var2, false);
                }
                var2 = gm.a("nails", false);
                if (var2 != null) {
                  i.field_w = dj.a(var2, false);
                }
                var2 = gm.a("hidden_pit", false);
                if (null != var2) {
                  oh.field_q = dj.a(var2, param1);
                }
                var2 = gm.a("teleport", param1);
                if (var2 != null) {
                  ld.field_h = dj.a(var2, false);
                }
                var2 = gm.a("hidden_nails", param1);
                if (null != var2) {
                  nm.field_mb = dj.a(var2, false);
                }
                var2 = gm.a("bottomless_pit", false);
                if (null != var2) {
                  dd.field_z = dj.a(var2, false);
                }
                var2 = gm.a("crusher", false);
                if (null != var2) {
                  ll.field_u = dj.a(var2, false);
                }
                var2 = gm.a("hidden_darts", false);
                if (var2 != null) {
                  sm.field_a = dj.a(var2, false);
                }
                var2 = gm.a("whirling_blades", false);
                if (null != var2) {
                  fg.field_o = dj.a(var2, false);
                }
                var2 = gm.a("poison_gas", false);
                if (null != var2) {
                  ea.field_b = dj.a(var2, param1);
                }
                var2 = gm.a("giant_rats", false);
                if (null != var2) {
                  cp.field_O = dj.a(var2, param1);
                }
                var2 = gm.a("rot_worms", false);
                if (null != var2) {
                  cb.field_c = dj.a(var2, false);
                }
                var2 = gm.a("troglodytes", false);
                if (null != var2) {
                  jb.field_Ub = dj.a(var2, false);
                }
                var2 = gm.a("giant_snake", false);
                if (var2 != null) {
                  wi.field_rb = dj.a(var2, false);
                }
                var2 = gm.a("giant_spider", false);
                if (null != var2) {
                  pd.field_G = dj.a(var2, param1);
                }
                var2 = gm.a("skeleton_sentinels", false);
                if (var2 != null) {
                  hg.field_p = dj.a(var2, param1);
                }
                var2 = gm.a("corrosive_slime", false);
                if (null != var2) {
                  gi.field_P = dj.a(var2, false);
                }
                var2 = gm.a("razor_construct", param1);
                if (var2 != null) {
                  jj.field_a = dj.a(var2, false);
                }
                var2 = gm.a("rabid_wolf", param1);
                if (var2 != null) {
                  g.field_Kb = dj.a(var2, param1);
                }
                var2 = gm.a("vampire_bats", false);
                if (var2 != null) {
                  sf.field_i = dj.a(var2, false);
                }
                var2 = gm.a("imp", param1);
                if (var2 != null) {
                  jb.field_Vb = dj.a(var2, false);
                }
                var2 = gm.a("stone_golem", false);
                if (var2 != null) {
                  wf.field_v = dj.a(var2, false);
                }
                var2 = gm.a("spectre", false);
                if (null != var2) {
                  ih.field_s = dj.a(var2, false);
                }
                var2 = gm.a("banshee", false);
                if (var2 != null) {
                  cc.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("raging_beast", param1);
                if (null != var2) {
                  hb.field_h = dj.a(var2, param1);
                }
                var2 = gm.a("basilisk", param1);
                if (null != var2) {
                  field_q = dj.a(var2, param1);
                }
                var2 = gm.a("pit_demon", false);
                if (null != var2) {
                  kk.field_i = dj.a(var2, param1);
                }
                var2 = gm.a("vampire_lord", false);
                if (null != var2) {
                  ea.field_a = dj.a(var2, false);
                }
                var2 = gm.a("hell_beast", false);
                if (var2 != null) {
                  kf.field_q = dj.a(var2, param1);
                }
                var2 = gm.a("demon_lord", false);
                if (var2 != null) {
                  gj.field_b = dj.a(var2, false);
                }
                var2 = gm.a("tripwire_bell", param1);
                if (var2 != null) {
                  mi.field_b = dj.a(var2, param1);
                }
                var2 = gm.a("hall_of_glass", param1);
                if (null != var2) {
                  nj.field_d = dj.a(var2, false);
                }
                var2 = gm.a("magical_guardian_room", false);
                if (null != var2) {
                  ll.field_s = dj.a(var2, false);
                }
                var2 = gm.a("desc_goblin_runt", false);
                if (var2 != null) {
                  nm.field_lb = dj.a(var2, false);
                }
                var2 = gm.a("desc_saurus_spawn", false);
                if (var2 != null) {
                  a.field_p = dj.a(var2, false);
                }
                var2 = gm.a("desc_goblin_cleaver", false);
                if (null != var2) {
                  mm.field_m = dj.a(var2, false);
                }
                var2 = gm.a("desc_orc_warrior", false);
                if (var2 != null) {
                  fm.field_d = dj.a(var2, false);
                }
                var2 = gm.a("desc_witch", param1);
                if (var2 != null) {
                  fj.field_c = dj.a(var2, false);
                }
                var2 = gm.a("desc_beastman", false);
                if (null != var2) {
                  gh.field_j = dj.a(var2, false);
                }
                var2 = gm.a("desc_saurus_slink", false);
                if (var2 != null) {
                  in.field_t = dj.a(var2, param1);
                }
                var2 = gm.a("desc_mercenary_knight", false);
                if (null != var2) {
                  hj.field_ab = dj.a(var2, param1);
                }
                var2 = gm.a("desc_priest", false);
                if (null != var2) {
                  fc.field_h = dj.a(var2, false);
                }
                var2 = gm.a("desc_orc_blademaster", param1);
                if (var2 != null) {
                  tb.field_h = dj.a(var2, false);
                }
                var2 = gm.a("desc_goblin_scout", false);
                if (null != var2) {
                  uc.field_Q = dj.a(var2, param1);
                }
                var2 = gm.a("desc_necromancer", false);
                if (var2 != null) {
                  lg.field_r = dj.a(var2, false);
                }
                var2 = gm.a("desc_ogre_thug", false);
                if (null != var2) {
                  ba.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("desc_enchantress", false);
                if (var2 != null) {
                  a.field_l = dj.a(var2, false);
                }
                var2 = gm.a("desc_saurus_warrior", false);
                if (null != var2) {
                  df.field_f = dj.a(var2, false);
                }
                var2 = gm.a("desc_orc_shaman", false);
                if (var2 != null) {
                  ik.field_c = dj.a(var2, false);
                }
                var2 = gm.a("desc_cave_troll", param1);
                if (null != var2) {
                  h.field_n = dj.a(var2, false);
                }
                var2 = gm.a("desc_northman_ranger", false);
                if (var2 != null) {
                  oe.field_p = dj.a(var2, false);
                }
                var2 = gm.a("desc_dwarf_renegade", false);
                if (var2 != null) {
                  ta.field_h = dj.a(var2, false);
                }
                var2 = gm.a("desc_thief", false);
                if (var2 != null) {
                  ai.field_k = dj.a(var2, param1);
                }
                var2 = gm.a("desc_zealot", false);
                if (var2 != null) {
                  pk.field_q = dj.a(var2, false);
                }
                var2 = gm.a("desc_dark_elf_assassin", false);
                if (var2 != null) {
                  he.field_r = dj.a(var2, false);
                }
                var2 = gm.a("desc_berserker", param1);
                if (var2 != null) {
                  gh.field_b = dj.a(var2, false);
                }
                var2 = gm.a("desc_ogre_brute", false);
                if (var2 != null) {
                  dk.field_a = dj.a(var2, false);
                }
                var2 = gm.a("desc_spy", false);
                if (var2 != null) {
                  hc.field_g = dj.a(var2, param1);
                }
                var2 = gm.a("desc_shapeshifter", param1);
                if (var2 != null) {
                  eb.field_M = dj.a(var2, false);
                }
                var2 = gm.a("desc_black_knight", false);
                if (var2 != null) {
                  ql.field_l = dj.a(var2, false);
                }
                var2 = gm.a("desc_minotaur", false);
                if (var2 != null) {
                  jm.field_g = dj.a(var2, param1);
                }
                var2 = gm.a("desc_warlock", false);
                if (null != var2) {
                  qi.field_c = dj.a(var2, false);
                }
                var2 = gm.a("desc_death_knight", false);
                if (null != var2) {
                  kj.field_i = dj.a(var2, false);
                }
                var2 = gm.a("desc_chaos_champion", false);
                if (null != var2) {
                  no.field_b = dj.a(var2, param1);
                }
                var2 = gm.a("desc_centaur", false);
                if (null != var2) {
                  oo.field_e = dj.a(var2, false);
                }
                var2 = gm.a("desc_daemonette", param1);
                if (var2 != null) {
                  vk.field_b = dj.a(var2, false);
                }
                var2 = gm.a("desc_dryad", param1);
                if (var2 != null) {
                  jd.field_n = dj.a(var2, false);
                }
                var2 = gm.a("desc_none", false);
                if (var2 != null) {
                  nh.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("desc_unknown", false);
                if (var2 != null) {
                  s.field_c = dj.a(var2, false);
                }
                var2 = gm.a("desc_pit", false);
                if (null != var2) {
                  um.field_e = dj.a(var2, false);
                }
                var2 = gm.a("desc_snakes", false);
                if (var2 != null) {
                  fj.field_b = dj.a(var2, false);
                }
                var2 = gm.a("desc_nails", false);
                if (null != var2) {
                  fn.field_j = dj.a(var2, false);
                }
                var2 = gm.a("desc_hidden_pit", false);
                if (var2 != null) {
                  bh.field_L = dj.a(var2, false);
                }
                var2 = gm.a("desc_teleport", false);
                if (var2 != null) {
                  to.field_f = dj.a(var2, false);
                }
                var2 = gm.a("desc_hidden_nails", param1);
                if (var2 != null) {
                  hl.field_j = dj.a(var2, false);
                }
                var2 = gm.a("desc_bottomless_pit", param1);
                if (var2 != null) {
                  fa.field_k = dj.a(var2, param1);
                }
                var2 = gm.a("desc_crusher", false);
                if (var2 != null) {
                  dm.field_b = dj.a(var2, false);
                }
                var2 = gm.a("desc_hidden_darts", false);
                if (var2 != null) {
                  e.field_i = dj.a(var2, false);
                }
                var2 = gm.a("desc_whirling_blades", false);
                if (var2 != null) {
                  nb.field_c = dj.a(var2, false);
                }
                var2 = gm.a("desc_poison_gas", param1);
                if (var2 != null) {
                  cp.field_P = dj.a(var2, false);
                }
                var2 = gm.a("desc_giant_rats", false);
                if (null != var2) {
                  il.field_b = dj.a(var2, false);
                }
                var2 = gm.a("desc_rot_worms", false);
                if (null != var2) {
                  ul.field_a = dj.a(var2, false);
                }
                var2 = gm.a("desc_troglodytes", false);
                if (var2 != null) {
                  rn.field_f = dj.a(var2, param1);
                }
                var2 = gm.a("desc_giant_snake", false);
                if (var2 != null) {
                  ke.field_a = dj.a(var2, false);
                }
                var2 = gm.a("desc_giant_spider", false);
                if (var2 != null) {
                  li.field_d = dj.a(var2, false);
                }
                var2 = gm.a("desc_skeleton_sentinels", false);
                if (null != var2) {
                  tn.field_Y = dj.a(var2, false);
                }
                var2 = gm.a("desc_corrosive_slime", false);
                if (null != var2) {
                  bc.field_c = dj.a(var2, false);
                }
                var2 = gm.a("desc_razor_construct", param1);
                if (null != var2) {
                  qh.field_D = dj.a(var2, false);
                }
                var2 = gm.a("desc_rabid_wolf", false);
                if (var2 != null) {
                  f.field_e = dj.a(var2, param1);
                }
                var2 = gm.a("desc_vampire_bats", false);
                if (var2 != null) {
                  ed.field_R = dj.a(var2, false);
                }
                var2 = gm.a("desc_imp", param1);
                if (var2 != null) {
                  ti.field_n = dj.a(var2, false);
                }
                var2 = gm.a("desc_stone_golem", false);
                if (var2 != null) {
                  wi.field_lb = dj.a(var2, false);
                }
                var2 = gm.a("desc_spectre", param1);
                if (var2 != null) {
                  om.field_e = dj.a(var2, false);
                }
                var2 = gm.a("desc_banshee", false);
                if (var2 != null) {
                  mj.field_c = dj.a(var2, false);
                }
                var2 = gm.a("desc_raging_beast", param1);
                if (var2 != null) {
                  pe.field_k = dj.a(var2, false);
                }
                var2 = gm.a("desc_basilisk", param1);
                if (var2 != null) {
                  jm.field_d = dj.a(var2, false);
                }
                var2 = gm.a("desc_pit_demon", false);
                if (var2 != null) {
                  sj.field_eb = dj.a(var2, false);
                }
                var2 = gm.a("desc_vampire_lord", false);
                if (null != var2) {
                  an.field_x = dj.a(var2, false);
                }
                var2 = gm.a("desc_hell_beast", false);
                if (null != var2) {
                  sm.field_b = dj.a(var2, false);
                }
                var2 = gm.a("desc_demon_lord", param1);
                if (null != var2) {
                  fg.field_f = dj.a(var2, param1);
                }
                var2 = gm.a("desc_tripwire_bell", param1);
                if (null != var2) {
                  jb.field_Nb = dj.a(var2, false);
                }
                var2 = gm.a("desc_hall_of_glass", false);
                if (null != var2) {
                  tg.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("desc_magical_guardian_room", false);
                if (null != var2) {
                  ic.field_z = dj.a(var2, param1);
                }
                var2 = gm.a("tip_nails", false);
                if (null != var2) {
                  gm.field_e = dj.a(var2, false);
                }
                var2 = gm.a("tip_teleport", false);
                if (var2 != null) {
                  ek.field_a = dj.a(var2, false);
                }
                var2 = gm.a("tip_hidden_nails", param1);
                if (null != var2) {
                  dl.field_c = dj.a(var2, false);
                }
                var2 = gm.a("tip_bottomless_pit", param1);
                if (var2 != null) {
                  nf.field_w = dj.a(var2, param1);
                }
                var2 = gm.a("tip_lethal", param1);
                if (var2 != null) {
                  dj.a(var2, false);
                }
                var2 = gm.a("tip_hidden_darts", false);
                if (var2 != null) {
                  fb.field_e = dj.a(var2, false);
                }
                var2 = gm.a("tip_whirling_blades", false);
                if (null != var2) {
                  ho.field_e = dj.a(var2, false);
                }
                var2 = gm.a("tip_rot_worms", false);
                if (null != var2) {
                  vc.field_a = dj.a(var2, false);
                }
                var2 = gm.a("tip_skeleton_sentinels", param1);
                if (var2 != null) {
                  lb.field_x = dj.a(var2, false);
                }
                var2 = gm.a("tip_corrosive_slime", false);
                if (var2 != null) {
                  fm.field_l = dj.a(var2, false);
                }
                var2 = gm.a("tip_razor_construct", false);
                if (var2 != null) {
                  ub.field_m = dj.a(var2, false);
                }
                var2 = gm.a("tip_rabid_wolf", false);
                if (var2 != null) {
                  lg.field_e = dj.a(var2, false);
                }
                var2 = gm.a("tip_vampire_bats", false);
                if (var2 != null) {
                  df.field_b = dj.a(var2, param1);
                }
                var2 = gm.a("tip_stone_golem", false);
                if (null != var2) {
                  ko.field_w = dj.a(var2, false);
                }
                var2 = gm.a("tip_spectre", param1);
                if (null != var2) {
                  qm.field_p = dj.a(var2, false);
                }
                var2 = gm.a("tip_banshee", param1);
                if (var2 != null) {
                  eb.field_L = dj.a(var2, param1);
                }
                var2 = gm.a("tip_vampire_lord", false);
                if (var2 != null) {
                  ai.field_b = dj.a(var2, false);
                }
                var2 = gm.a("tip_demon_lord", param1);
                if (var2 != null) {
                  tk.field_b = dj.a(var2, false);
                }
                var2 = gm.a("tip_tripwire_bell", false);
                if (var2 != null) {
                  hl.field_d = dj.a(var2, false);
                }
                var2 = gm.a("tip_hall_of_glass", param1);
                if (var2 != null) {
                  eg.field_g = dj.a(var2, false);
                }
                var2 = gm.a("tip_magical_guardian_room", false);
                if (var2 != null) {
                  ii.field_J = dj.a(var2, param1);
                }
                var2 = gm.a("ability_pitimmunity,0", false);
                if (var2 != null) {
                  ao.field_i[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_pitimmunity,1", false);
                if (null != var2) {
                  ao.field_i[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_boostdef,0", param1);
                if (var2 != null) {
                  bo.field_Gb[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_boostdef,1", false);
                if (var2 != null) {
                  bo.field_Gb[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_boostsneak,0", false);
                if (null != var2) {
                  oa.field_g[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_boostsneak,1", false);
                if (null != var2) {
                  oa.field_g[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_tough,0", param1);
                if (null != var2) {
                  vc.field_d[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_tough,1", false);
                if (var2 != null) {
                  vc.field_d[1] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_retreat,0", false);
                if (var2 != null) {
                  up.field_c[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_retreat,1", param1);
                if (var2 != null) {
                  up.field_c[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_sacrifice_green,0", false);
                if (var2 != null) {
                  lg.field_d[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_sacrifice_green,1", false);
                if (null != var2) {
                  lg.field_d[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_thief,0", param1);
                if (null != var2) {
                  qj.field_f[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_thief,1", false);
                if (var2 != null) {
                  qj.field_f[1] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_summon,0", param1);
                if (var2 != null) {
                  jm.field_a[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_summon,1", false);
                if (var2 != null) {
                  jm.field_a[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_revive,0", param1);
                if (var2 != null) {
                  hh.field_h[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_revive,1", false);
                if (null != var2) {
                  hh.field_h[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_circumvent,0", false);
                if (var2 != null) {
                  ja.field_d[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_circumvent,1", false);
                if (null != var2) {
                  ja.field_d[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_scout,0", false);
                if (var2 != null) {
                  li.field_f[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_scout,1", false);
                if (null != var2) {
                  li.field_f[1] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_spy,0", false);
                if (null != var2) {
                  sp.field_g[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_spy,1", false);
                if (var2 != null) {
                  sp.field_g[1] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_glamour,0", false);
                if (null != var2) {
                  hj.field_P[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_glamour,1", false);
                if (null != var2) {
                  hj.field_P[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_intimidate,0", param1);
                if (null != var2) {
                  rf.field_N[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_intimidate,1", param1);
                if (null != var2) {
                  rf.field_N[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_ferocity,0", false);
                if (var2 != null) {
                  ll.field_t[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_ferocity,1", false);
                if (null != var2) {
                  ll.field_t[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_firststrike,0", param1);
                if (null != var2) {
                  an.field_F[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_firststrike,1", false);
                if (null != var2) {
                  an.field_F[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_fragility,0", false);
                if (var2 != null) {
                  ob.field_oc[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_fragility,1", false);
                if (var2 != null) {
                  ob.field_oc[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_armoured,0", false);
                if (var2 != null) {
                  np.field_z[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_armoured,1", param1);
                if (var2 != null) {
                  np.field_z[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_fireimmunity,0", false);
                if (null != var2) {
                  qp.field_f[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_fireimmunity,1", false);
                if (var2 != null) {
                  qp.field_f[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_immortal,0", false);
                if (var2 != null) {
                  vb.field_b[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_immortal,1", false);
                if (null != var2) {
                  vb.field_b[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_chaos_champion,0", false);
                if (null != var2) {
                  ob.field_Rb[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_chaos_champion,1", false);
                if (var2 != null) {
                  ob.field_Rb[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_fickle,0", param1);
                if (null != var2) {
                  pm.field_k[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_fickle,1", false);
                if (null != var2) {
                  pm.field_k[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_redistribute,0", false);
                if (var2 != null) {
                  j.field_S[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_redistribute,1", param1);
                if (var2 != null) {
                  j.field_S[1] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_pitimmunity_brief,0", param1);
                if (null != var2) {
                  ne.field_f[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_pitimmunity_brief,1", false);
                if (null != var2) {
                  ne.field_f[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_boostdef_brief,0", false);
                if (var2 != null) {
                  ha.field_l[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_boostdef_brief,1", false);
                if (var2 != null) {
                  ha.field_l[1] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_boostsneak_brief,0", false);
                if (var2 != null) {
                  rp.field_b[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_boostsneak_brief,1", false);
                if (var2 != null) {
                  rp.field_b[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_tough_brief,0", false);
                if (var2 != null) {
                  rk.field_f[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_tough_brief,1", false);
                if (null != var2) {
                  rk.field_f[1] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_retreat_brief,0", false);
                if (var2 != null) {
                  bj.field_H[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_retreat_brief,1", false);
                if (null != var2) {
                  bj.field_H[1] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_sacrifice_green_brief,0", false);
                if (var2 != null) {
                  bb.field_l[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_sacrifice_green_brief,1", false);
                if (null != var2) {
                  bb.field_l[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_thief_brief,0", false);
                if (var2 != null) {
                  al.field_i[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_thief_brief,1", false);
                if (null != var2) {
                  al.field_i[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_summon_brief,0", false);
                if (var2 != null) {
                  hk.field_d[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_summon_brief,1", false);
                if (var2 != null) {
                  hk.field_d[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_revive_brief,0", param1);
                if (null != var2) {
                  rp.field_f[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_revive_brief,1", param1);
                if (var2 != null) {
                  rp.field_f[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_circumvent_brief,0", false);
                if (var2 != null) {
                  um.field_b[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_circumvent_brief,1", false);
                if (var2 != null) {
                  um.field_b[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_scout_brief,0", false);
                if (var2 != null) {
                  gi.field_K[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_scout_brief,1", false);
                if (var2 != null) {
                  gi.field_K[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_spy_brief,0", false);
                if (null != var2) {
                  fe.field_n[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_spy_brief,1", false);
                if (null != var2) {
                  fe.field_n[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_glamour_brief,0", false);
                if (null != var2) {
                  gl.field_Kb[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_glamour_brief,1", false);
                if (null != var2) {
                  gl.field_Kb[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_intimidate_brief,0", false);
                if (var2 != null) {
                  uf.field_d[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_intimidate_brief,1", param1);
                if (null != var2) {
                  uf.field_d[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_ferocity_brief,0", param1);
                if (null != var2) {
                  mi.field_a[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_ferocity_brief,1", false);
                if (var2 != null) {
                  mi.field_a[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_firststrike_brief,0", false);
                if (null != var2) {
                  dm.field_e[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_firststrike_brief,1", param1);
                if (var2 != null) {
                  dm.field_e[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_fragility_brief,0", param1);
                if (var2 != null) {
                  to.field_b[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_fragility_brief,1", false);
                if (var2 != null) {
                  to.field_b[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_armoured_brief,0", false);
                if (null != var2) {
                  rj.field_j[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_armoured_brief,1", false);
                if (null != var2) {
                  rj.field_j[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_fireimmunity_brief,0", false);
                if (null != var2) {
                  dn.field_N[0] = dj.a(var2, false);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = gm.a("ability_fireimmunity_brief,1", false);
                if (null != var2) {
                  dn.field_N[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_immortal_brief,0", false);
                if (var2 != null) {
                  jf.field_e[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_immortal_brief,1", false);
                if (null != var2) {
                  jf.field_e[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_chaos_champion_brief,0", param1);
                if (var2 != null) {
                  bh.field_N[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_chaos_champion_brief,1", false);
                if (null != var2) {
                  bh.field_N[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_fickle_brief,0", param1);
                if (null != var2) {
                  ua.field_c[0] = dj.a(var2, false);
                }
                var2 = gm.a("ability_fickle_brief,1", false);
                if (var2 != null) {
                  ua.field_c[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_redistribute_brief,0", false);
                if (null != var2) {
                  wf.field_z[0] = dj.a(var2, param1);
                }
                var2 = gm.a("ability_redistribute_brief,1", param1);
                if (var2 != null) {
                  wf.field_z[1] = dj.a(var2, false);
                }
                var2 = gm.a("ability_ferocity_message", false);
                if (var2 != null) {
                  ia.field_N = dj.a(var2, false);
                }
                var2 = gm.a("ability_armoured_message", false);
                if (null != var2) {
                  le.field_e = dj.a(var2, false);
                }
                var2 = gm.a("ability_room_armoured_message", false);
                if (null != var2) {
                  qi.field_h = dj.a(var2, param1);
                }
                var2 = gm.a("fatal_monster", param1);
                if (var2 != null) {
                  rb.field_K = dj.a(var2, false);
                }
                var2 = gm.a("fatal_trap", false);
                if (null != var2) {
                  gm.field_a = dj.a(var2, false);
                }
                var2 = gm.a("fatal_guardian", param1);
                if (var2 != null) {
                  lf.field_m = dj.a(var2, false);
                }
                var2 = gm.a("fatal_brief", false);
                if (null != var2) {
                  lg.field_s = dj.a(var2, param1);
                }
                var2 = gm.a("orb_preservation", false);
                if (null != var2) {
                  ek.field_d = dj.a(var2, param1);
                }
                var2 = gm.a("orb_majesty", param1);
                if (null != var2) {
                  tp.field_z = dj.a(var2, param1);
                }
                var2 = gm.a("orb_brilliance", false);
                if (var2 != null) {
                  df.field_d = dj.a(var2, param1);
                }
                var2 = gm.a("orb_war", false);
                if (null != var2) {
                  tg.field_n = dj.a(var2, param1);
                }
                var2 = gm.a("orb_preservation_desc", false);
                if (var2 != null) {
                  da.field_E = dj.a(var2, false);
                }
                var2 = gm.a("orb_majesty_desc", false);
                if (var2 != null) {
                  lj.field_j = dj.a(var2, false);
                }
                var2 = gm.a("orb_brilliance_desc", false);
                if (null != var2) {
                  an.field_C = dj.a(var2, param1);
                }
                var2 = gm.a("orb_war_desc", false);
                if (null != var2) {
                  bj.field_J = dj.a(var2, false);
                }
                var2 = gm.a("titles_age_male,0", false);
                if (null != var2) {
                  od.field_b[0] = dj.a(var2, false);
                }
                var2 = gm.a("titles_age_male,1", false);
                if (null != var2) {
                  od.field_b[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_age_male,2", false);
                if (null != var2) {
                  od.field_b[2] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_age_male,3", false);
                if (null != var2) {
                  od.field_b[3] = dj.a(var2, false);
                }
                var2 = gm.a("titles_age_male,4", param1);
                if (var2 != null) {
                  od.field_b[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_age_male,5", false);
                if (null != var2) {
                  od.field_b[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_age_female,0", false);
                if (null != var2) {
                  ek.field_h[0] = dj.a(var2, false);
                }
                var2 = gm.a("titles_age_female,1", param1);
                if (var2 != null) {
                  ek.field_h[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_age_female,2", false);
                if (null != var2) {
                  ek.field_h[2] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_age_female,3", false);
                if (var2 != null) {
                  ek.field_h[3] = dj.a(var2, false);
                }
                var2 = gm.a("titles_age_female,4", false);
                if (var2 != null) {
                  ek.field_h[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_age_female,5", false);
                if (null != var2) {
                  ek.field_h[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_male,0", param1);
                if (null != var2) {
                  j.field_O[0] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_male,1", false);
                if (var2 != null) {
                  j.field_O[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_male,2", param1);
                if (null != var2) {
                  j.field_O[2] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_male,3", false);
                if (var2 != null) {
                  j.field_O[3] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_mastery_male,4", param1);
                if (var2 != null) {
                  j.field_O[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_male,5", false);
                if (var2 != null) {
                  j.field_O[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_male,6", false);
                if (null != var2) {
                  j.field_O[6] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_male,7", false);
                if (var2 != null) {
                  j.field_O[7] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_female,0", false);
                if (null != var2) {
                  ff.field_f[0] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_female,1", false);
                if (var2 != null) {
                  ff.field_f[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_female,2", param1);
                if (var2 != null) {
                  ff.field_f[2] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_female,3", param1);
                if (null != var2) {
                  ff.field_f[3] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_female,4", param1);
                if (var2 != null) {
                  ff.field_f[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_female,5", false);
                if (null != var2) {
                  ff.field_f[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_mastery_female,6", false);
                if (var2 != null) {
                  ff.field_f[6] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_mastery_female,7", false);
                if (var2 != null) {
                  ff.field_f[7] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_male,0", param1);
                if (var2 != null) {
                  hd.field_m[0] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_aggression_male,1", false);
                if (null != var2) {
                  hd.field_m[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_male,2", false);
                if (null != var2) {
                  hd.field_m[2] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_aggression_male,3", false);
                if (var2 != null) {
                  hd.field_m[3] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_male,4", param1);
                if (var2 != null) {
                  hd.field_m[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_male,5", false);
                if (var2 != null) {
                  hd.field_m[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_male,6", false);
                if (var2 != null) {
                  hd.field_m[6] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_aggression_male,7", false);
                if (null != var2) {
                  hd.field_m[7] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_male,8", false);
                if (null != var2) {
                  hd.field_m[8] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_aggression_female,0", false);
                if (var2 != null) {
                  ki.field_h[0] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_aggression_female,1", false);
                if (null != var2) {
                  ki.field_h[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_female,2", false);
                if (var2 != null) {
                  ki.field_h[2] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_female,3", false);
                if (var2 != null) {
                  ki.field_h[3] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_female,4", param1);
                if (var2 != null) {
                  ki.field_h[4] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_aggression_female,5", false);
                if (var2 != null) {
                  ki.field_h[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_female,6", false);
                if (null != var2) {
                  ki.field_h[6] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_female,7", param1);
                if (var2 != null) {
                  ki.field_h[7] = dj.a(var2, false);
                }
                var2 = gm.a("titles_aggression_female,8", false);
                if (null != var2) {
                  ki.field_h[8] = dj.a(var2, false);
                }
                var2 = gm.a("titles_achievements_male,0", false);
                if (null != var2) {
                  nj.field_c[0] = dj.a(var2, false);
                }
                var2 = gm.a("titles_achievements_male,1", false);
                if (null != var2) {
                  nj.field_c[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_achievements_male,2", false);
                if (null != var2) {
                  nj.field_c[2] = dj.a(var2, false);
                }
                var2 = gm.a("titles_achievements_male,3", false);
                if (null != var2) {
                  nj.field_c[3] = dj.a(var2, false);
                }
                var2 = gm.a("titles_achievements_male,4", false);
                if (null != var2) {
                  nj.field_c[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_achievements_female,0", false);
                if (var2 != null) {
                  lh.field_n[0] = dj.a(var2, false);
                }
                var2 = gm.a("titles_achievements_female,1", false);
                if (var2 != null) {
                  lh.field_n[1] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_achievements_female,2", false);
                if (var2 != null) {
                  lh.field_n[2] = dj.a(var2, false);
                }
                var2 = gm.a("titles_achievements_female,3", false);
                if (null != var2) {
                  lh.field_n[3] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_achievements_female,4", false);
                if (null != var2) {
                  lh.field_n[4] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_external_male,0", param1);
                if (var2 != null) {
                  wm.field_i[0] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_male,1", false);
                if (var2 != null) {
                  wm.field_i[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_male,2", param1);
                if (var2 != null) {
                  wm.field_i[2] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_male,3", false);
                if (var2 != null) {
                  wm.field_i[3] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_male,4", false);
                if (null != var2) {
                  wm.field_i[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_male,5", param1);
                if (var2 != null) {
                  wm.field_i[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_male,6", false);
                if (null != var2) {
                  wm.field_i[6] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_external_male,7", false);
                if (var2 != null) {
                  wm.field_i[7] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_external_male,8", false);
                if (null != var2) {
                  wm.field_i[8] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_male,9", false);
                if (var2 != null) {
                  wm.field_i[9] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_female,0", param1);
                if (var2 != null) {
                  wm.field_d[0] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_female,1", false);
                if (null != var2) {
                  wm.field_d[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_female,2", false);
                if (var2 != null) {
                  wm.field_d[2] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_external_female,3", false);
                if (null != var2) {
                  wm.field_d[3] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_female,4", false);
                if (var2 != null) {
                  wm.field_d[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_female,5", false);
                if (null != var2) {
                  wm.field_d[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_female,6", false);
                if (var2 != null) {
                  wm.field_d[6] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_external_female,7", false);
                if (null != var2) {
                  wm.field_d[7] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_female,8", false);
                if (null != var2) {
                  wm.field_d[8] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_female,9", false);
                if (null != var2) {
                  wm.field_d[9] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_game,0", false);
                if (var2 != null) {
                  ab.field_d[0] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_external_game,1", false);
                if (null != var2) {
                  ab.field_d[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_game,2", param1);
                if (null != var2) {
                  ab.field_d[2] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_game,3", false);
                if (var2 != null) {
                  ab.field_d[3] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_game,4", false);
                if (null != var2) {
                  ab.field_d[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_game,5", false);
                if (var2 != null) {
                  ab.field_d[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_game,6", false);
                if (var2 != null) {
                  ab.field_d[6] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_game,7", param1);
                if (var2 != null) {
                  ab.field_d[7] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_external_game,8", false);
                if (var2 != null) {
                  ab.field_d[8] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_game,9", false);
                if (null != var2) {
                  ab.field_d[9] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_achievement,0", false);
                if (null != var2) {
                  ka.field_b[0] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_achievement,1", false);
                if (var2 != null) {
                  ka.field_b[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_achievement,2", false);
                if (var2 != null) {
                  ka.field_b[2] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_achievement,3", param1);
                if (var2 != null) {
                  ka.field_b[3] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_external_achievement,4", false);
                if (null != var2) {
                  ka.field_b[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_achievement,5", false);
                if (null != var2) {
                  ka.field_b[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_achievement,6", false);
                if (null != var2) {
                  ka.field_b[6] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_achievement,7", param1);
                if (var2 != null) {
                  ka.field_b[7] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_achievement,8", false);
                if (var2 != null) {
                  ka.field_b[8] = dj.a(var2, false);
                }
                var2 = gm.a("titles_external_achievement,9", false);
                if (var2 != null) {
                  ka.field_b[9] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_purchased,0", param1);
                if (null != var2) {
                  ce.field_q[0] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,1", param1);
                if (var2 != null) {
                  ce.field_q[1] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,2", param1);
                if (var2 != null) {
                  ce.field_q[2] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,3", false);
                if (null != var2) {
                  ce.field_q[3] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,4", false);
                if (null != var2) {
                  ce.field_q[4] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,5", param1);
                if (var2 != null) {
                  ce.field_q[5] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,6", false);
                if (var2 != null) {
                  ce.field_q[6] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,7", false);
                if (var2 != null) {
                  ce.field_q[7] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,8", false);
                if (var2 != null) {
                  ce.field_q[8] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,9", false);
                if (var2 != null) {
                  ce.field_q[9] = dj.a(var2, param1);
                }
                var2 = gm.a("titles_purchased,10", false);
                if (null != var2) {
                  ce.field_q[10] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,11", param1);
                if (var2 != null) {
                  ce.field_q[11] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,12", false);
                if (null != var2) {
                  ce.field_q[12] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,13", false);
                if (var2 != null) {
                  ce.field_q[13] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,14", false);
                if (var2 != null) {
                  ce.field_q[14] = dj.a(var2, false);
                }
                var2 = gm.a("titles_purchased,15", false);
                if (var2 != null) {
                  ce.field_q[15] = dj.a(var2, false);
                }
                var2 = gm.a("text_initiate_raid", param1);
                if (var2 != null) {
                  t.field_b = dj.a(var2, false);
                }
                var2 = gm.a("text_dragons_of_renown", false);
                if (null != var2) {
                  c.field_e = dj.a(var2, param1);
                }
                var2 = gm.a("text_my_profile", false);
                if (null != var2) {
                  sj.field_W = dj.a(var2, false);
                }
                var2 = gm.a("text_construction", false);
                if (null != var2) {
                  uc.field_C = dj.a(var2, false);
                }
                var2 = gm.a("text_stable", false);
                if (null != var2) {
                  rl.field_a = dj.a(var2, false);
                }
                var2 = gm.a("text_result", false);
                if (null != var2) {
                  bb.field_q = dj.a(var2, false);
                }
                var2 = gm.a("text_continue", false);
                if (var2 != null) {
                  hj.field_X = dj.a(var2, param1);
                }
                var2 = gm.a("text_dungeon_assault", false);
                if (var2 != null) {
                  tp.field_u = dj.a(var2, false);
                }
                var2 = gm.a("text_instructions", param1);
                if (var2 != null) {
                  bn.field_q = dj.a(var2, false);
                }
                var2 = gm.a("text_achievements", false);
                if (null != var2) {
                  vd.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_profile", param1);
                if (var2 != null) {
                  gk.field_K = dj.a(var2, false);
                }
                var2 = gm.a("text_dungeon_builder", param1);
                if (var2 != null) {
                  f.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_cost_colon", false);
                if (var2 != null) {
                  ef.field_f = dj.a(var2, false);
                }
                var2 = gm.a("text_treasure_colon", param1);
                if (var2 != null) {
                  pb.field_I = dj.a(var2, false);
                }
                var2 = gm.a("text_menu", param1);
                if (null != var2) {
                  l.field_d = dj.a(var2, false);
                }
                var2 = gm.a("text_rooms", false);
                if (var2 != null) {
                  dj.a(var2, false);
                }
                var2 = gm.a("text_commit", param1);
                if (null != var2) {
                  lk.field_P = dj.a(var2, false);
                }
                var2 = gm.a("text_cancel", false);
                if (var2 != null) {
                  be.field_r = dj.a(var2, param1);
                }
                var2 = gm.a("text_members_only", false);
                if (var2 != null) {
                  dn.field_T = dj.a(var2, false);
                }
                var2 = gm.a("text_orbmode", false);
                if (var2 != null) {
                  be.field_q = dj.a(var2, false);
                }
                var2 = gm.a("text_x_renown", false);
                if (null != var2) {
                  n.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("text_exit", false);
                if (null != var2) {
                  r.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("text_raid", param1);
                if (var2 != null) {
                  ia.field_Y = dj.a(var2, false);
                }
                var2 = gm.a("text_search", param1);
                if (var2 != null) {
                  hb.field_l = dj.a(var2, false);
                }
                var2 = gm.a("text_search_tip", false);
                if (var2 != null) {
                  hl.field_k = dj.a(var2, param1);
                }
                var2 = gm.a("text_recently_raided", false);
                if (null != var2) {
                  no.field_e = dj.a(var2, param1);
                }
                var2 = gm.a("text_dismiss", false);
                if (null != var2) {
                  dj.a(var2, false);
                }
                var2 = gm.a("text_revive", param1);
                if (null != var2) {
                  sa.field_e = dj.a(var2, param1);
                }
                var2 = gm.a("text_heal", false);
                if (var2 != null) {
                  ae.field_e = dj.a(var2, false);
                }
                var2 = gm.a("text_raid_fatal", false);
                if (null != var2) {
                  kc.field_P = dj.a(var2, param1);
                }
                var2 = gm.a("text_recruit", false);
                if (null != var2) {
                  dj.a(var2, false);
                }
                var2 = gm.a("text_raider_recruitment", false);
                if (var2 != null) {
                  lg.field_h = dj.a(var2, param1);
                }
                var2 = gm.a("text_raider_selection", param1);
                if (null != var2) {
                  pi.field_i = dj.a(var2, false);
                }
                var2 = gm.a("text_inst_trap", param1);
                if (var2 != null) {
                  an.field_y = dj.a(var2, false);
                }
                var2 = gm.a("text_inst_monster", false);
                if (null != var2) {
                  id.field_k = dj.a(var2, false);
                }
                var2 = gm.a("text_inst_guardian", false);
                if (null != var2) {
                  og.field_d = dj.a(var2, param1);
                }
                var2 = gm.a("text_renowntable_hint", false);
                if (var2 != null) {
                  ai.field_e = dj.a(var2, false);
                }
                var2 = gm.a("text_stake", param1);
                if (null != var2) {
                  le.field_a = dj.a(var2, false);
                }
                var2 = gm.a("text_protection", false);
                if (null != var2) {
                  vl.field_l = dj.a(var2, false);
                }
                var2 = gm.a("text_bounty", param1);
                if (null != var2) {
                  mi.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_bounty_protection", false);
                if (null != var2) {
                  ra.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("text_bounty_claimed", param1);
                if (var2 != null) {
                  wm.field_e = dj.a(var2, false);
                }
                var2 = gm.a("text_please_wait", false);
                if (null != var2) {
                  nl.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_gold_stolen", param1);
                if (null != var2) {
                  eh.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("text_renown_lost", false);
                if (var2 != null) {
                  jc.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("text_spendable_renown", param1);
                if (var2 != null) {
                  nm.field_jb = dj.a(var2, false);
                }
                var2 = gm.a("text_renown_gained", false);
                if (var2 != null) {
                  kl.field_e = dj.a(var2, false);
                }
                var2 = gm.a("text_risk_of_waking", false);
                if (null != var2) {
                  li.field_e = dj.a(var2, false);
                }
                var2 = gm.a("text_too_heavy", false);
                if (null != var2) {
                  oo.field_b = dj.a(var2, false);
                }
                var2 = gm.a("text_steal_gold", false);
                if (var2 != null) {
                  ab.field_b = dj.a(var2, param1);
                }
                var2 = gm.a("text_claim_bounty", param1);
                if (null != var2) {
                  dj.a(var2, param1);
                }
                var2 = gm.a("text_hoard_room", param1);
                if (null != var2) {
                  ak.field_p = dj.a(var2, false);
                }
                var2 = gm.a("text_accept", param1);
                if (var2 != null) {
                  pe.field_n = dj.a(var2, false);
                }
                var2 = gm.a("text_close", false);
                if (null != var2) {
                  tf.field_g = dj.a(var2, param1);
                }
                var2 = gm.a("text_orbs_of_mastery", false);
                if (var2 != null) {
                  ag.field_b = dj.a(var2, false);
                }
                var2 = gm.a("text_renown_and_raids", false);
                if (null != var2) {
                  uj.field_e = dj.a(var2, param1);
                }
                var2 = gm.a("text_cost_x", false);
                if (null != var2) {
                  ho.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_plan", false);
                if (var2 != null) {
                  mm.field_s = dj.a(var2, false);
                }
                var2 = gm.a("text_3dview", false);
                if (null != var2) {
                  cf.field_d = dj.a(var2, false);
                }
                var2 = gm.a("text_viewstyle", param1);
                if (var2 != null) {
                  uf.field_b = dj.a(var2, param1);
                }
                var2 = gm.a("text_isometric", false);
                if (var2 != null) {
                  ql.field_g = dj.a(var2, param1);
                }
                var2 = gm.a("text_topdown", false);
                if (var2 != null) {
                  go.field_V = dj.a(var2, false);
                }
                var2 = gm.a("text_buy", false);
                if (null != var2) {
                  bg.field_x = dj.a(var2, false);
                }
                var2 = gm.a("text_orb_warning", false);
                if (var2 != null) {
                  oj.field_c = dj.a(var2, param1);
                }
                var2 = gm.a("text_charging_hint_none", false);
                if (var2 != null) {
                  ng.field_L = dj.a(var2, false);
                }
                var2 = gm.a("text_charging_hint_x", false);
                if (var2 != null) {
                  dg.field_G = dj.a(var2, false);
                }
                var2 = gm.a("text_charging_hint_one", false);
                if (null != var2) {
                  oc.field_v = dj.a(var2, param1);
                }
                var2 = gm.a("text_dungeon_reset", false);
                if (null != var2) {
                  fl.field_n = dj.a(var2, false);
                }
                var2 = gm.a("text_orbs_active_x", param1);
                if (null != var2) {
                  nh.field_i = dj.a(var2, param1);
                }
                var2 = gm.a("text_orbs_charging_x", false);
                if (null != var2) {
                  to.field_a = dj.a(var2, false);
                }
                var2 = gm.a("text_limit_reached", false);
                if (null != var2) {
                  qh.field_j = dj.a(var2, false);
                }
                var2 = gm.a("text_limit_reached_long", false);
                if (var2 != null) {
                  bl.field_b = dj.a(var2, param1);
                }
                var2 = gm.a("text_stole_gold", param1);
                if (var2 != null) {
                  wi.field_qb = dj.a(var2, false);
                }
                var2 = gm.a("text_woke_dragon", false);
                if (var2 != null) {
                  sm.field_e = dj.a(var2, false);
                }
                var2 = gm.a("text_raiders_died_none", false);
                if (null != var2) {
                  l.field_f = dj.a(var2, false);
                }
                var2 = gm.a("text_raiders_died_one", param1);
                if (var2 != null) {
                  rp.field_a = dj.a(var2, false);
                }
                var2 = gm.a("text_raiders_died_x", false);
                if (var2 != null) {
                  od.field_c = dj.a(var2, param1);
                }
                var2 = gm.a("text_status_postcombat", param1);
                if (null != var2) {
                  co.field_E = dj.a(var2, param1);
                }
                var2 = gm.a("text_status_pregame", false);
                if (null != var2) {
                  bj.field_I = dj.a(var2, false);
                }
                var2 = gm.a("text_flee_tooltip", false);
                if (var2 != null) {
                  eb.field_I = dj.a(var2, false);
                }
                var2 = gm.a("text_advance_tooltip", false);
                if (var2 != null) {
                  hm.field_l = dj.a(var2, param1);
                }
                var2 = gm.a("text_charge_tooltip", false);
                if (null != var2) {
                  mo.field_f = dj.a(var2, false);
                }
                var2 = gm.a("text_disarm_trap_tooltip", false);
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (var2 != null) {
                  ai.field_d = dj.a(var2, false);
                }
                var2 = gm.a("text_disarm_guardian_tooltip", false);
                if (var2 != null) {
                  kg.field_k = dj.a(var2, param1);
                }
                var2 = gm.a("text_sneak_past_tooltip", false);
                if (null != var2) {
                  a.field_k = dj.a(var2, false);
                }
                var2 = gm.a("text_continue_tooltip", false);
                if (var2 != null) {
                  pb.field_H = dj.a(var2, false);
                }
                var2 = gm.a("text_flee_coloured", false);
                if (null != var2) {
                  qa.field_d = dj.a(var2, false);
                }
                var2 = gm.a("text_advance_coloured", false);
                if (var2 != null) {
                  dn.field_L = dj.a(var2, false);
                }
                var2 = gm.a("text_charge_coloured", param1);
                if (null != var2) {
                  lh.field_b = dj.a(var2, false);
                }
                var2 = gm.a("text_disarm_trap_coloured", false);
                if (null != var2) {
                  vd.field_b = dj.a(var2, param1);
                }
                var2 = gm.a("text_disarm_guardian_coloured", false);
                if (null != var2) {
                  u.field_S = dj.a(var2, false);
                }
                var2 = gm.a("text_useskill_coloured", false);
                if (var2 != null) {
                  dj.a(var2, false);
                }
                var2 = gm.a("text_flee_minitip", false);
                if (null != var2) {
                  jc.field_b = dj.a(var2, false);
                }
                var2 = gm.a("text_advance_minitip", param1);
                if (null != var2) {
                  gi.field_Q = dj.a(var2, false);
                }
                var2 = gm.a("text_charge_minitip", false);
                if (var2 != null) {
                  fp.field_e = dj.a(var2, param1);
                }
                var2 = gm.a("text_disarm_trap_minitip", param1);
                if (null != var2) {
                  vo.field_o = dj.a(var2, false);
                }
                var2 = gm.a("text_disarm_guardian_minitip", param1);
                if (var2 != null) {
                  rb.field_I = dj.a(var2, false);
                }
                var2 = gm.a("text_useskill_minitip", false);
                if (null != var2) {
                  dj.a(var2, param1);
                }
                var2 = gm.a("text_guardian_detected_alerted", false);
                if (var2 != null) {
                  nh.field_b = dj.a(var2, false);
                }
                var2 = gm.a("text_raider_snuck_past_guardian", param1);
                if (null != var2) {
                  c.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_guardian_trapped_alerted", param1);
                if (var2 != null) {
                  ah.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("text_raider_avoided_guardian", false);
                if (null != var2) {
                  np.field_G = dj.a(var2, param1);
                }
                var2 = gm.a("text_monster_wins", param1);
                if (var2 != null) {
                  h.field_i = dj.a(var2, false);
                }
                var2 = gm.a("text_monster_attacks", false);
                if (var2 != null) {
                  u.field_R = dj.a(var2, false);
                }
                var2 = gm.a("text_raider_wins", param1);
                if (null != var2) {
                  lj.field_p = dj.a(var2, false);
                }
                var2 = gm.a("text_raider_escapes", param1);
                if (null != var2) {
                  cm.field_K = dj.a(var2, param1);
                }
                var2 = gm.a("text_raider_attacks", false);
                if (var2 != null) {
                  ri.field_c = dj.a(var2, param1);
                }
                var2 = gm.a("text_raider_dodges", false);
                if (var2 != null) {
                  al.field_m = dj.a(var2, false);
                }
                var2 = gm.a("text_success", false);
                if (var2 != null) {
                  ac.field_h = dj.a(var2, false);
                }
                var2 = gm.a("text_failure", param1);
                if (var2 != null) {
                  lp.field_n = dj.a(var2, param1);
                }
                var2 = gm.a("text_party_sneaks_past", false);
                if (var2 != null) {
                  qj.field_d = dj.a(var2, false);
                }
                var2 = gm.a("text_monster_failed_to_trap", false);
                if (null != var2) {
                  fc.field_e = dj.a(var2, param1);
                }
                var2 = gm.a("text_raider_detected", param1);
                if (var2 != null) {
                  uo.field_d = dj.a(var2, param1);
                }
                var2 = gm.a("text_raider_avoided_detection", param1);
                if (var2 != null) {
                  mo.field_h = dj.a(var2, false);
                }
                var2 = gm.a("text_raiders_flee_in_terror", false);
                if (var2 != null) {
                  ep.field_i = dj.a(var2, false);
                }
                var2 = gm.a("text_raider_trapped_incap", false);
                if (null != var2) {
                  bp.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_raider_trapped_killed", param1);
                if (null != var2) {
                  vb.field_a = dj.a(var2, false);
                }
                var2 = gm.a("text_raider_avoided_trap", false);
                if (null != var2) {
                  ba.field_d = dj.a(var2, false);
                }
                var2 = gm.a("text_raider_disarmed_trap", param1);
                if (null != var2) {
                  ch.field_l = dj.a(var2, param1);
                }
                var2 = gm.a("text_status_precombat", param1);
                if (var2 != null) {
                  rn.field_d = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_select_room", false);
                if (null != var2) {
                  pi.field_g = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_select_raider", param1);
                if (var2 != null) {
                  ho.field_b = dj.a(var2, false);
                }
                var2 = gm.a("text_party_defeated", false);
                if (null != var2) {
                  al.field_n = dj.a(var2, false);
                }
                var2 = gm.a("text_hoardroom_hint", false);
                if (null != var2) {
                  um.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_cost", false);
                if (var2 != null) {
                  tn.field_U = dj.a(var2, false);
                }
                var2 = gm.a("text_attack", false);
                if (null != var2) {
                  qk.field_d = dj.a(var2, false);
                }
                var2 = gm.a("text_defence", false);
                if (null != var2) {
                  dj.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_dodge", false);
                if (var2 != null) {
                  pm.field_n = dj.a(var2, false);
                }
                var2 = gm.a("text_sneak", param1);
                if (var2 != null) {
                  nf.field_x = dj.a(var2, false);
                }
                var2 = gm.a("text_snare", false);
                if (null != var2) {
                  rk.field_a = dj.a(var2, false);
                }
                var2 = gm.a("text_detect", param1);
                if (null != var2) {
                  eg.field_f = dj.a(var2, false);
                }
                var2 = gm.a("text_sort_raiders_by", false);
                if (var2 != null) {
                  ib.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_sort_rooms_by", false);
                if (null != var2) {
                  tp.field_w = dj.a(var2, false);
                }
                var2 = gm.a("text_modifier_stat_increased", false);
                if (var2 != null) {
                  so.field_a = dj.a(var2, false);
                }
                var2 = gm.a("text_modifier_stat_decreased", param1);
                if (null != var2) {
                  vc.field_b = dj.a(var2, false);
                }
                var2 = gm.a("text_modifier_glamour", false);
                if (var2 != null) {
                  kl.field_b = dj.a(var2, param1);
                }
                var2 = gm.a("text_dead", false);
                if (null != var2) {
                  kg.field_m = dj.a(var2, param1);
                }
                var2 = gm.a("text_incapacitated", false);
                if (var2 != null) {
                  gl.field_Hb = dj.a(var2, false);
                }
                var2 = gm.a("text_ability_used", false);
                if (null != var2) {
                  wi.field_nb = dj.a(var2, param1);
                }
                var2 = gm.a("text_disarmed", false);
                if (var2 != null) {
                  fi.field_t = dj.a(var2, false);
                }
                var2 = gm.a("text_defeated", param1);
                if (var2 != null) {
                  ii.field_C = dj.a(var2, param1);
                }
                var2 = gm.a("text_modifier_blinded", false);
                if (null != var2) {
                  dm.field_c = dj.a(var2, param1);
                }
                var2 = gm.a("text_passive_ability", param1);
                if (null != var2) {
                  rm.field_J = dj.a(var2, false);
                }
                var2 = gm.a("text_ability_ready", param1);
                if (null != var2) {
                  g.field_Jb = dj.a(var2, param1);
                }
                var2 = gm.a("text_active_ability", param1);
                if (null != var2) {
                  lc.field_g = dj.a(var2, param1);
                }
                var2 = gm.a("text_activeraider", param1);
                if (var2 != null) {
                  od.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("text_useskill", false);
                if (var2 != null) {
                  vo.field_m = dj.a(var2, false);
                }
                var2 = gm.a("text_raider", param1);
                if (null != var2) {
                  gg.field_e = dj.a(var2, false);
                }
                var2 = gm.a("text_monster", false);
                if (var2 != null) {
                  af.field_a = dj.a(var2, param1);
                }
                var2 = gm.a("text_trap", false);
                if (var2 != null) {
                  DungeonAssault.field_H = dj.a(var2, false);
                }
                var2 = gm.a("text_guardian", false);
                if (var2 != null) {
                  ki.field_e = dj.a(var2, false);
                }
                var2 = gm.a("text_raiders", false);
                if (null != var2) {
                  ak.field_m = dj.a(var2, param1);
                }
                var2 = gm.a("text_monsters", param1);
                if (null != var2) {
                  wo.field_f = dj.a(var2, false);
                }
                var2 = gm.a("text_traps", false);
                if (var2 != null) {
                  dh.field_e = dj.a(var2, param1);
                }
                var2 = gm.a("text_guardians", false);
                if (var2 != null) {
                  wm.field_j = dj.a(var2, false);
                }
                var2 = gm.a("text_no_defences", false);
                if (var2 != null) {
                  uh.field_V = dj.a(var2, param1);
                }
                var2 = gm.a("text_defences", false);
                if (null != var2) {
                  rb.field_M = dj.a(var2, param1);
                }
                var2 = gm.a("text_no_raids", false);
                if (var2 != null) {
                  wa.field_f = dj.a(var2, false);
                }
                var2 = gm.a("text_outcome", false);
                if (null != var2) {
                  ip.field_k = dj.a(var2, param1);
                }
                var2 = gm.a("text_raids", false);
                if (null != var2) {
                  p.field_r = dj.a(var2, false);
                }
                var2 = gm.a("text_income_rate", false);
                if (var2 != null) {
                  la.field_j = dj.a(var2, false);
                }
                var2 = gm.a("text_unspent_x", false);
                if (null != var2) {
                  bp.field_h = dj.a(var2, param1);
                }
                var2 = gm.a("text_highest_x", false);
                if (var2 != null) {
                  mm.field_j = dj.a(var2, param1);
                }
                var2 = gm.a("text_renown_x", false);
                if (null != var2) {
                  kk.field_s = dj.a(var2, param1);
                }
                var2 = gm.a("text_confirm_changes", false);
                if (null != var2) {
                  oa.field_h = dj.a(var2, false);
                }
                var2 = gm.a("text_confirm_changes_dungeon", false);
                if (var2 != null) {
                  wj.field_x = dj.a(var2, false);
                }
                var2 = gm.a("text_confirm_changes_stable", false);
                if (var2 != null) {
                  pb.field_F = dj.a(var2, false);
                }
                var2 = gm.a("text_save_and_exit", param1);
                if (null != var2) {
                  ud.field_u = dj.a(var2, param1);
                }
                var2 = gm.a("text_exit_without_saving", false);
                if (var2 != null) {
                  pm.field_o = dj.a(var2, false);
                }
                var2 = gm.a("text_save_and_exit_brief", false);
                if (var2 != null) {
                  oi.field_M = dj.a(var2, param1);
                }
                var2 = gm.a("text_exit_without_saving_brief", false);
                if (var2 != null) {
                  nk.field_Lb = dj.a(var2, false);
                }
                var2 = gm.a("text_warning_activate_dungeon", false);
                if (var2 != null) {
                  dh.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_dungeon_builder_hint", false);
                if (var2 != null) {
                  wh.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_activate_dungeon_dialog_title", false);
                if (var2 != null) {
                  dj.a(var2, false);
                }
                var2 = gm.a("text_activate_dungeon_dialog_body", param1);
                if (null != var2) {
                  dj.a(var2, false);
                }
                var2 = gm.a("text_raider_recruitment_hint", param1);
                if (var2 != null) {
                  a.field_m = dj.a(var2, param1);
                }
                var2 = gm.a("text_dismiss_tooltip", false);
                if (null != var2) {
                  dj.a(var2, false);
                }
                var2 = gm.a("text_revive_tooltip", param1);
                if (null != var2) {
                  e.field_g = dj.a(var2, false);
                }
                var2 = gm.a("text_heal_tooltip", false);
                if (null != var2) {
                  t.field_c = dj.a(var2, param1);
                }
                var2 = gm.a("text_recruit_tooltip", false);
                if (null != var2) {
                  dj.a(var2, false);
                }
                var2 = gm.a("text_title_heading", param1);
                if (null != var2) {
                  fd.field_a = dj.a(var2, false);
                }
                var2 = gm.a("text_title_requirements_age_x", false);
                if (null != var2) {
                  vj.field_i = dj.a(var2, false);
                }
                var2 = gm.a("text_title_requirements_age_one", param1);
                if (var2 != null) {
                  be.field_m = dj.a(var2, false);
                }
                var2 = gm.a("text_title_requirements_mastery_x", false);
                if (null != var2) {
                  wf.field_y = dj.a(var2, false);
                }
                var2 = gm.a("text_title_requirements_mastery_one", false);
                if (null != var2) {
                  tl.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_title_requirements_aggression", false);
                if (var2 != null) {
                  ac.field_f = dj.a(var2, false);
                }
                var2 = gm.a("text_title_requirements_achievement", false);
                if (var2 != null) {
                  l.field_c = dj.a(var2, param1);
                }
                var2 = gm.a("text_title_requirements_external", false);
                if (var2 != null) {
                  uk.field_b = dj.a(var2, false);
                }
                var2 = gm.a("text_title_requirements_unknown", false);
                if (var2 != null) {
                  dk.field_e = dj.a(var2, false);
                }
                var2 = gm.a("text_title_hint", param1);
                if (var2 != null) {
                  DungeonAssault.field_G = dj.a(var2, param1);
                }
                var2 = gm.a("text_recently_raided_by", false);
                if (null != var2) {
                  oh.field_o = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_redistribute", false);
                if (null != var2) {
                  eb.field_P = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_spy", false);
                if (var2 != null) {
                  li.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_sacrifice_raider", false);
                if (null != var2) {
                  wf.field_D = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_sacrifice_greenskin", param1);
                if (var2 != null) {
                  ta.field_g = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_sacrifice_goblin", param1);
                if (var2 != null) {
                  em.field_F = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_scout_room", false);
                if (var2 != null) {
                  rl.field_c = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_revive", false);
                if (var2 != null) {
                  mo.field_b = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_ability_glamour", false);
                if (null != var2) {
                  jd.field_i = dj.a(var2, false);
                }
                var2 = gm.a("text_hint_ability_boostsneak", param1);
                if (null != var2) {
                  bb.field_r = dj.a(var2, param1);
                }
                var2 = gm.a("text_hint_ability_boostdef", param1);
                if (var2 != null) {
                  pe.field_i = dj.a(var2, false);
                }
                var2 = gm.a("text_acv_hunter_singleton", false);
                if (var2 != null) {
                  i.field_y = dj.a(var2, false);
                }
                var2 = gm.a("text_acv_hunter", false);
                if (var2 != null) {
                  ji.field_H = dj.a(var2, false);
                }
                var2 = gm.a("text_acv_riches", false);
                if (null != var2) {
                  fn.field_q = dj.a(var2, false);
                }
                var2 = gm.a("text_acv_habit", param1);
                if (var2 != null) {
                  wl.field_b = dj.a(var2, false);
                }
                var2 = gm.a("title_dtdtdt", param1);
                if (var2 != null) {
                  ng.field_K = dj.a(var2, false);
                }
                var2 = gm.a("renowntable_column_text,0", false);
                if (null != var2) {
                  rb.field_J[0] = dj.a(var2, false);
                }
                var2 = gm.a("renowntable_column_text,1", false);
                if (null != var2) {
                  rb.field_J[1] = dj.a(var2, false);
                }
                var2 = gm.a("renowntable_column_text,2", param1);
                if (var2 != null) {
                  rb.field_J[2] = dj.a(var2, false);
                }
                var2 = gm.a("renowntable_column_text,3", false);
                if (null != var2) {
                  rb.field_J[3] = dj.a(var2, false);
                }
                var2 = gm.a("renowntable_error", false);
                if (var2 != null) {
                  ac.field_D = dj.a(var2, false);
                }
                var2 = gm.a("achievement_title", false);
                if (var2 != null) {
                  f.field_b = dj.a(var2, false);
                }
                d.field_d = null;
            }
            void run() {
                var3 = DungeonAssault.field_K;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                  runChunk3();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2776_0 = (RuntimeException) (var2_ref);
                  stackIn_2776_1 = new StringBuilder().append("ec.P(");
                  if (param0 == null) {
                    stackIn_2777_2 = "null";
                  } else {
                    stackIn_2777_2 = "{...}";
                  }
                  throw vk.a((Throwable) ((Object) stackIn_2776_0), ((StringBuilder) (Object) stackIn_2776_1).append(stackIn_2777_2).append(',').append(param1).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_2785_0 = (!kg.field_j);
                  kg.field_j = stackIn_2785_0;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final void d(int param0, int param1) {
        try {
          this.field_m[-param1 + this.field_o - 4] = (byte)(param1 >> 24);
          this.field_m[this.field_o + (-param1 - 3)] = (byte)(param1 >> 16);
          this.field_m[-param1 + (this.field_o - 2)] = (byte)(param1 >> 8);
          this.field_m[-param1 + this.field_o - param0] = (byte)param1;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ec.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final int d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 58) {
            this.a((int[]) null, true);
          }
          var2_int = this.field_m[this.field_o] & 255;
          if (var2_int < 128) {
            stackIn_7_0 = this.c(true);
            return stackIn_7_0;
          }
          stackIn_5_0 = this.k(param0 ^ 58) - 32768;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.EA(" + param0 + ')');
        }
    }

    final int f(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_o = this.field_o + 3;
          if (param0 >= -93) {
            this.b((byte) 41);
          }
          stackIn_4_0 = ((this.field_m[this.field_o - 3] & 255) << 16) + (((this.field_m[this.field_o - 2] & 255) << 8) + (255 & this.field_m[-1 + this.field_o]));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.J(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 < 54) {
            return true;
          }
          stackIn_16_0 = (param4 <= param2) && (param4 + param3 > param2) && (param5 >= param0) && ((param0 + param1) > param5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var7), "ec.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void b(int param0, int param1) {
        try {
          this.field_m[-param0 + this.field_o - 2] = (byte)(param0 >> 8);
          this.field_m[-param0 + this.field_o - param1] = (byte)param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ec.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(String param0, byte param1) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          this.field_o = this.field_o + ec.a(param0.length(), 0, this.field_m, -1, this.field_o, (CharSequence) ((Object) param0));
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$1] = (byte) 0;
          if (param1 != -20) {
            field_k = (nh) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ec.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = this.field_o;
          this.field_o = 0;
          var5 = new byte[var4_int];
          this.a((byte) -126, 0, var4_int, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param2, param0);
          if (param1 != 2) {
            field_l = (String[]) null;
          }
          var8 = var7.toByteArray();
          this.field_o = 0;
          this.i(var8.length, -97);
          this.a(var8, 1, var8.length, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ec.WA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int l(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = this.field_m[this.field_o] & 255;
          if (param0 != 0) {
            stackIn_2_0 = 78;
            return stackIn_2_0;
          }
          if (var2_int >= 128) {
            stackIn_7_0 = this.k(0) - 49152;
            return stackIn_7_0;
          }
          stackIn_5_0 = -64 + this.c(true);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.W(" + param0 + ')');
        }
    }

    final String b(boolean param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 == this.field_m[this.field_o]) {
            this.field_o = this.field_o + 1;
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (!param0) {
            this.a((java.math.BigInteger) null, 11, (java.math.BigInteger) null);
          }
          stackIn_7_0 = this.d(-100);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.Q(" + param0 + ')');
        }
    }

    final void c(int param0, int param1) {
        try {
          this.field_m[param1 - param0 + this.field_o] = (byte)param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ec.JA(" + param0 + ',' + param1 + ')');
        }
    }

    final int k(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_o = this.field_o + 2;
          if (param0 == 0) {
            stackIn_4_0 = ((255 & this.field_m[this.field_o - 2]) << 8) + (255 & this.field_m[-1 + this.field_o]);
            return stackIn_4_0;
          }
          stackIn_2_0 = -80;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.UA(" + param0 + ')');
        }
    }

    final void e(int param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 != (param1 & -128)) {
            if ((param1 & -16384) != 0) {
              if (0 != (param1 & -2097152)) {
                if ((param1 & -268435456) != 0) {
                  this.a(6, 128 | param1 >>> 28);
                }
                this.a(6, param1 >>> 21 | 128);
              }
              this.a(6, (param1 | 2102129) >>> 14);
            }
            this.a(param0 + 268435462, 128 | param1 >>> 7);
          }
          if (param0 != -268435456) {
            return;
          }
          this.a(6, param1 & 127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "ec.IA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int[] param1, int param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
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
        var13 = DungeonAssault.field_K;
        try {
          if (param3 != -10708) {
            field_q = (String) null;
          }
          var5_int = this.field_o;
          this.field_o = param2;
          var6 = (param0 - param2) / 8;
          var7 = 0;
          while (var7 < var6) {
            var8 = this.h(-52);
            var9 = this.h(param3 + 10677);
            var10 = -957401312;
            var11 = -1640531527;
            if (var13 != 0) {
              return;
            }
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (0 < incrementValue$0) {
                var9 = var9 - (var10 + param1[(7507 & var10) >>> 11] ^ var8 + (var8 >>> 5 ^ var8 << 4));
                var10 = var10 - var11;
                var8 = var8 - (param1[3 & var10] + var10 ^ (var9 << 4 ^ var9 >>> 5) + var9);
                continue;
              }
              break;
            }
            this.field_o = this.field_o - 8;
            this.a((byte) 63, var8);
            this.a((byte) 63, var9);
            var7++;
          }
          this.field_o = var5_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ec.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        try {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$0] = (byte)(param1 >> 24);
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$1] = (byte)(param1 >> 16);
          fieldTemp$2 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$2] = (byte)(param1 >> 8);
          fieldTemp$3 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$3] = (byte)param1;
          if (param0 != 63) {
            field_p = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ec.I(" + param0 + ',' + param1 + ')');
        }
    }

    final String d(int param0) {
        int fieldTemp$0 = 0;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          var2_int = this.field_o;
          do {
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
          } while (this.field_m[fieldTemp$0] != 0);
          var3 = -var2_int + this.field_o - 1;
          if (param0 >= -88) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          if (var3 != 0) {
            stackIn_11_0 = mk.a((byte) -24, this.field_m, var3, var2_int);
            return stackIn_11_0;
          }
          stackIn_9_0 = "";
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.K(" + param0 + ')');
        }
    }

    final int c(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -106) {
            stackIn_2_0 = -109;
            return stackIn_2_0;
          }
          var3_int = fm.a(this.field_o, 67, param1, this.field_m);
          this.a((byte) 63, var3_int);
          stackIn_4_0 = var3_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "ec.FA(" + param0 + ',' + param1 + ')');
        }
    }

    final long c(byte param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 45) {
            this.field_m = (byte[]) null;
          }
          var2_long = 4294967295L & (long)this.h(-86);
          var4 = (long)this.h(-94) & 4294967295L;
          stackIn_4_0 = (var2_long << 32) + var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.DA(" + param0 + ')');
        }
    }

    final int j(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            stackIn_2_0 = 73;
            return stackIn_2_0;
          }
          if (this.field_m[this.field_o] >= 0) {
            stackIn_7_0 = this.k(0);
            return stackIn_7_0;
          }
          stackIn_5_0 = 2147483647 & this.h(param0 - 95);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.O(" + param0 + ')');
        }
    }

    final byte a(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        byte stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            field_l = (String[]) null;
          }
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          stackIn_4_0 = this.field_m[fieldTemp$1];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.M(" + param0 + ')');
        }
    }

    final int c(boolean param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = -37;
            return stackIn_2_0;
          }
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          stackIn_4_0 = 255 & this.field_m[fieldTemp$1];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.AB(" + param0 + ')');
        }
    }

    final static int[] h(int param0, int param1) {
        int[] stackIn_28_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        md var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        try {
          var2 = new int[ib.field_k];
          var3_int = 0;
          do {
            if (!(var3_int < ib.field_k)) {
              var2[param0] = 0;
              break;
            }
            var2[var3_int] = 2147483647;
            var3_int++;
          } while (var6 == 0);
          if (param1 != 5) {
            field_p = -121;
          }
          var3 = new md();
          var3.a(new a(param0), false);
          while (!var3.a((byte) -87)) {
            var4 = ((a) (var3.b((byte) -124))).field_j;
            var5 = 1 + var2[var4];
            if (var4 % ib.field_j > 0) {
              dm.a(var3, var2, var5, -32, -1 + var4, var4 + (-1 - var4 / ib.field_j));
            }
            if (ib.field_j - 1 > var4 % ib.field_j) {
              dm.a(var3, var2, var5, 120, 1 + var4, var4 - var4 / ib.field_j);
            }
            if (var4 >= ib.field_j) {
              dm.a(var3, var2, var5, 127, var4 - ib.field_j, (ib.field_l >> 1) + var4 - ib.field_j);
            }
            if (ib.field_k - ib.field_j > var4) {
              dm.a(var3, var2, var5, -105, ib.field_j + var4, var4 + (ib.field_l >> 1));
            }
            if (var6 == 0) {
              continue;
            }
            break;
          }
          stackIn_28_0 = var2;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2_ref), "ec.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        try {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$0] = (byte)(param1 >> 16);
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$1] = (byte)(param1 >> 8);
          fieldTemp$2 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$2] = (byte)param1;
          if (param0 != -106) {
            this.e((byte) -94);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ec.V(" + param0 + ',' + param1 + ')');
        }
    }

    final int e(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        byte stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_6_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        try {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          var2_int = this.field_m[fieldTemp$0];
          if (param0 != -651413500) {
            field_q = (String) null;
          }
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2_int >= 0))) {
            var3 = (127 & var2_int | var3) << 7;
            fieldTemp$1 = this.field_o;
            this.field_o = this.field_o + 1;
            stackOut_6_0 = this.field_m[fieldTemp$1];
            stackIn_9_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (var4 == 0) {
              var2_int = stackIn_7_0;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_9_0 = var3 | var2_int;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.R(" + param0 + ')');
        }
    }

    final boolean d(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_o = this.field_o - 4;
          if (!param0) {
            return true;
          }
          var2_int = fm.a(this.field_o, 99, 0, this.field_m);
          var3 = this.h(-80);
          if (var2_int != var3) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "ec.GB(" + param0 + ')');
        }
    }

    final void a(int param0, String param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$2 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$2] = (byte) 0;
          this.field_o = this.field_o + ec.a(param1.length(), 0, this.field_m, param0 ^ -3, this.field_o, (CharSequence) ((Object) param1));
          fieldTemp$3 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_m[fieldTemp$3] = (byte) 0;
          if (param0 != 2) {
            this.b(-99, -104);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ec.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ec(int param0) {
        try {
          this.field_o = 0;
          this.field_m = kn.a(param0, false);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ec.<init>(" + param0 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        try {
          if (param1 != 1) {
            field_j = (q[]) null;
          }
          var5_int = param3;
          while (param2 + param3 > var5_int) {
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_m[fieldTemp$0] = param0[var5_int];
            var5_int++;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ec.PA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ec(byte[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = param0;
          this.field_o = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ec.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_q = "Basilisk";
        field_i = new fb();
    }
}
