/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vh extends tc {
    byte[] field_o;
    int field_q;
    static me field_l;
    static String field_r;
    static hd field_s;
    static String field_m;
    static String field_p;
    static byte[][][] field_k;
    static int field_n;

    final void a(int param0, String param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 0L;
        var5 = 0L;
        var7 = param1.length();
        if (param0 <= -26) {
          var8 = 19;
          L0: while (true) {
            if (0 > var8) {
              this.a((byte) 96, var3);
              this.a((byte) 112, var5);
              return;
            } else {
              L1: {
                var3 = var3 * 38L;
                if (var8 >= var7) {
                  break L1;
                } else {
                  L2: {
                    var9 = param1.charAt(var8);
                    if (var9 < 65) {
                      break L2;
                    } else {
                      if (var9 > 90) {
                        break L2;
                      } else {
                        var3 = var3 + (long)(-63 - -var9);
                        break L1;
                      }
                    }
                  }
                  L3: {
                    if (var9 < 97) {
                      break L3;
                    } else {
                      if (var9 <= 122) {
                        var3 = var3 + (long)(2 + (var9 + -97));
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var9 < 48) {
                      break L4;
                    } else {
                      if (var9 <= 57) {
                        var3 = var3 + (long)(-20 - -var9);
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 = var3 + 1L;
                  break L1;
                }
              }
              if (10 == var8) {
                var5 = var3;
                var3 = 0L;
                var8--;
                continue L0;
              } else {
                var8--;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(boolean param0, long param1) {
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param1 >> -523357984);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param1 >> 1100567256);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param1 >> 93485648);
        if (!param0) {
            field_n = -23;
        }
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param1 >> 2037631368);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)param1;
    }

    final void a(long param0, int param1) {
        Object var5 = null;
        L0: {
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param0 >> 2092323896);
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param0 >> 840699056);
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param0 >> 82828648);
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param0 >> 130209376);
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param0 >> 695052824);
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param0 >> 38359632);
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param0 >> 1967119432);
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[((vh) this).field_q] = (byte)(int)param0;
          if (param1 == 38359632) {
            break L0;
          } else {
            var5 = null;
            ((vh) this).a((int[]) null, -11, -67, -35);
            break L0;
          }
        }
    }

    final void d(int param0, int param1) {
        ((vh) this).field_o[-param1 + ((vh) this).field_q - 4] = (byte)(param1 >> 311195448);
        ((vh) this).field_o[((vh) this).field_q - (param1 + 3)] = (byte)(param1 >> 975187440);
        ((vh) this).field_o[-param1 + ((vh) this).field_q + -2] = (byte)(param1 >> -420245976);
        ((vh) this).field_o[param0 + -param1 + ((vh) this).field_q] = (byte)param1;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var5 = 122 % ((param3 - 32) / 47);
        for (var6 = param1; param2 + param1 > var6; var6++) {
            ((vh) this).field_q = ((vh) this).field_q + 1;
            ((vh) this).field_o[((vh) this).field_q] = param0[var6];
        }
    }

    final void b(int param0, int param1) {
        if (param0 != 1) {
            field_r = null;
        }
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)param1;
    }

    final int i(int param0) {
        if (param0 != 1) {
            return -27;
        }
        ((vh) this).field_q = ((vh) this).field_q + 4;
        return (((vh) this).field_o[((vh) this).field_q - 1] & 255) + ((255 & ((vh) this).field_o[((vh) this).field_q - 2]) << -1589908920) + ((-16777216 & ((vh) this).field_o[-4 + ((vh) this).field_q] << 1895138040) + (((vh) this).field_o[-3 + ((vh) this).field_q] << 1467172912 & 16711680));
    }

    final String g(int param0) {
        if (param0 != 1) {
            int discarded$0 = ((vh) this).e(28);
        }
        int var2 = ((vh) this).field_q;
        while (true) {
            ((vh) this).field_q = ((vh) this).field_q + 1;
            if (0 == ((vh) this).field_o[((vh) this).field_q]) {
                break;
            }
        }
        int var3 = -1 + (((vh) this).field_q + -var2);
        if (var3 == 0) {
            return "";
        }
        return co.a(var2, var3, -101, ((vh) this).field_o);
    }

    final String c(byte param0) {
        if (param0 >= -73) {
            return null;
        }
        if (((vh) this).field_o[((vh) this).field_q] == 0) {
            ((vh) this).field_q = ((vh) this).field_q + 1;
            return null;
        }
        return ((vh) this).g(1);
    }

    final void a(byte param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = ((vh) this).field_q / 8;
        ((vh) this).field_q = 0;
        if (param0 != 31) {
            return;
        }
        for (var4 = 0; var3 > var4; var4++) {
            var5 = ((vh) this).i(1);
            var6 = ((vh) this).i(1);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
                var9--;
                if ((var9 ^ -1) >= -1) {
                    break;
                }
                var5 = var5 + (var6 + (var6 << -88535644 ^ var6 >>> -394982139) ^ param1[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var7 + param1[(var7 & 8001) >>> -372635349] ^ var5 + (var5 >>> 1217987141 ^ var5 << 1000709252));
            }
            ((vh) this).field_q = ((vh) this).field_q - 8;
            ((vh) this).a((byte) -105, var5);
            ((vh) this).a((byte) -58, var6);
        }
    }

    final int a(int param0) {
        if (param0 <= 44) {
            field_n = -101;
        }
        int var2 = ((vh) this).field_o[((vh) this).field_q] & 255;
        if ((var2 ^ -1) <= -129) {
            return -49152 + ((vh) this).e((byte) -104);
        }
        return ((vh) this).k(0) + -64;
    }

    final int e(byte param0) {
        if (param0 != -104) {
            return 93;
        }
        ((vh) this).field_q = ((vh) this).field_q + 2;
        return ((255 & ((vh) this).field_o[((vh) this).field_q - 2]) << 749089384) - -(((vh) this).field_o[((vh) this).field_q - 1] & 255);
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
            return;
        }
        if (-1 >= param1) {
            if (128 > param1) {
                ((vh) this).b(1, param1);
                return;
            }
        }
        if (0 <= param1) {
            if (!(-32769 <= param1)) {
                ((vh) this).b(true, 32768 - -param1);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void l(int param0) {
        if (!(null == ((vh) this).field_o)) {
            od.a(-30001, ((vh) this).field_o);
        }
        ((vh) this).field_o = null;
        if (param0 <= 99) {
            field_k = null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= param5) {
          return;
        } else {
          if (param4 > 1 + param0) {
            L0: {
              if (param0 - -5 >= param4) {
                break L0;
              } else {
                if (param1 == param3) {
                  break L0;
                } else {
                  var7 = (param1 >> 800932225) + (param3 >> 1006511361) + (param3 & param1 & 1);
                  var8 = param0;
                  var9 = param1;
                  var10 = param3;
                  var11 = param0;
                  L1: while (true) {
                    if (param4 <= var11) {
                      vh.a(param0, param1, false, var9, var8, param5, param6);
                      vh.a(var8, var10, param2, param3, param4, param5, param6);
                      return;
                    } else {
                      L2: {
                        var12 = vt.field_m[var11];
                        if (!param6) {
                          stackOut_20_0 = tb.field_h[var12];
                          stackIn_21_0 = stackOut_20_0;
                          break L2;
                        } else {
                          stackOut_19_0 = no.field_U[var12];
                          stackIn_21_0 = stackOut_19_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_21_0;
                      if (var13 <= var7) {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        vt.field_m[var11] = vt.field_m[var8];
                        var8++;
                        vt.field_m[var8] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = -1 + param4;
            L3: while (true) {
              if (var7 <= param0) {
                return;
              } else {
                var8 = param0;
                L4: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = vt.field_m[var8];
                    var10 = vt.field_m[1 + var8];
                    if (co.a(param6, var10, var9, -27)) {
                      vt.field_m[var8] = var10;
                      vt.field_m[var8 + 1] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void i(byte param0) {
        ot.g(76);
        dh.d(-1);
        ik.field_b = null;
        int var1 = -111 % ((-16 - param0) / 46);
        e.a((byte) -117);
    }

    final byte a(byte param0) {
        int var2 = 120 % ((53 - param0) / 44);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        return ((vh) this).field_o[((vh) this).field_q];
    }

    final static wk a(int param0, int param1, kl param2, int param3) {
        if (!kp.a(false, param1, param2, param3)) {
            return null;
        }
        if (param0 != -1) {
            return null;
        }
        return bj.e(12722);
    }

    final void f(int param0, int param1) {
        if (param0 != 0) {
            return;
        }
        ((vh) this).field_o[-param1 + ((vh) this).field_q + -2] = (byte)(param1 >> -1480020600);
        ((vh) this).field_o[-1 + (-param1 + ((vh) this).field_q)] = (byte)param1;
    }

    final long j(byte param0) {
        long var2 = 4294967295L & (long)((vh) this).i(1);
        long var4 = 4294967295L & (long)((vh) this).i(1);
        if (param0 != -2) {
            return 69L;
        }
        return (var2 << 1879274144) + var4;
    }

    final void a(int[] param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var5 = ((vh) this).field_q;
        ((vh) this).field_q = param2;
        int var6 = (param1 + -param2) / 8;
        for (var7 = 0; var6 > var7; var7++) {
            var8 = ((vh) this).i(param3 ^ -12365);
            var9 = ((vh) this).i(param3 + 12367);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
                var12--;
                if ((var12 ^ -1) >= -1) {
                    break;
                }
                var9 = var9 - (var10 - -param0[-1948254205 & var10 >>> -697495413] ^ (var8 << 744227044 ^ var8 >>> -1829671579) - -var8);
                var10 = var10 - var11;
                var8 = var8 - ((var9 >>> -1280449659 ^ var9 << 1732176036) + var9 ^ var10 + param0[var10 & 3]);
            }
            ((vh) this).field_q = ((vh) this).field_q - 8;
            ((vh) this).a((byte) -118, var8);
            ((vh) this).a((byte) -119, var9);
        }
        ((vh) this).field_q = var5;
        if (param3 != -12366) {
            ((vh) this).field_o = null;
        }
    }

    final void c(int param0, int param1) {
        if (param0 != -49) {
            return;
        }
        if (!((-128 & param1) == 0)) {
            if (!((param1 & -16384) == -1)) {
                if (!(0 == (-2097152 & param1))) {
                    if (!(-1 == (param1 & -268435456))) {
                        ((vh) this).b(1, param1 >>> -2099379460 | 128);
                    }
                    ((vh) this).b(1, (param1 | 268669197) >>> 1452178005);
                }
                ((vh) this).b(1, (2106399 | param1) >>> -1521176178);
            }
            ((vh) this).b(1, (param1 | 16422) >>> 1717998503);
        }
        ((vh) this).b(1, 127 & param1);
    }

    final int b(byte param0, int param1) {
        int var3 = im.a(((vh) this).field_q, ((vh) this).field_o, param1, -8779);
        ((vh) this).a((byte) -87, var3);
        if (param0 != -39) {
            ((vh) this).c((byte) -110, 112);
        }
        return var3;
    }

    final void b(String param0, int param1) {
        int var3 = param0.indexOf(' ');
        if (!((var3 ^ -1) > -1)) {
            throw new IllegalArgumentException("");
        }
        if (param1 != 13851) {
            Object var4 = null;
            ((vh) this).a((byte[]) null, -81, 60, -69);
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        ((vh) this).field_q = ((vh) this).field_q + ic.a(((vh) this).field_o, 0, var5, param0.length(), ((vh) this).field_q, (byte) 114);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte) 0;
    }

    final int h(int param0) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = 106 % ((param0 - 50) / 41);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        int var2 = ((vh) this).field_o[((vh) this).field_q];
        int var4 = 0;
        while ((var2 ^ -1) > -1) {
            var4 = (var2 & 127 | var4) << 1186131527;
            ((vh) this).field_q = ((vh) this).field_q + 1;
            var2 = ((vh) this).field_o[((vh) this).field_q];
        }
        return var2 | var4;
    }

    final int k(int param0) {
        if (param0 != 0) {
            return -34;
        }
        ((vh) this).field_q = ((vh) this).field_q + 1;
        return ((vh) this).field_o[((vh) this).field_q] & 255;
    }

    final void e(int param0, int param1) {
        if (param1 != 5930) {
            return;
        }
        ((vh) this).field_o[((vh) this).field_q - (param0 - -1)] = (byte)param0;
    }

    final void a(String param0, int param1) {
        int var3 = param0.indexOf(' ');
        if (!((var3 ^ -1) > -1)) {
            throw new IllegalArgumentException("");
        }
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte) 0;
        if (param1 != 413740432) {
            field_m = null;
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        ((vh) this).field_q = ((vh) this).field_q + ic.a(((vh) this).field_o, 0, var4, param0.length(), ((vh) this).field_q, (byte) 113);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte) 0;
    }

    final boolean j(int param0) {
        if (param0 != 4215) {
            field_k = null;
        }
        ((vh) this).field_q = ((vh) this).field_q - 4;
        int var2 = im.a(((vh) this).field_q, ((vh) this).field_o, 0, -8779);
        int var3 = ((vh) this).i(1);
        if (var3 == var2) {
            return true;
        }
        return false;
    }

    final void c(byte param0, int param1) {
        if (param0 != 60) {
            ((vh) this).a(false, 84);
        }
        if (param1 > -65) {
            if (!(param1 < -64)) {
                ((vh) this).b(1, param1 - -64);
                return;
            }
        }
        if (-16385 > param1) {
            if (!(-16384 > param1)) {
                ((vh) this).b(true, param1 - -49152);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final int d(byte param0) {
        if (param0 != -13) {
            ((vh) this).field_q = -28;
        }
        ((vh) this).field_q = ((vh) this).field_q + 3;
        return (((vh) this).field_o[-3 + ((vh) this).field_q] << -56600336 & 16711680) + ((((vh) this).field_o[-2 + ((vh) this).field_q] << 1711696520 & 65280) - -(((vh) this).field_o[-1 + ((vh) this).field_q] & 255));
    }

    final String h(byte param0) {
        ((vh) this).field_q = ((vh) this).field_q + 1;
        int var2 = ((vh) this).field_o[((vh) this).field_q];
        if (!(-1 == (var2 ^ -1))) {
            throw new IllegalStateException("");
        }
        int var3 = ((vh) this).field_q;
        if (param0 != 121) {
            return null;
        }
        while (true) {
            ((vh) this).field_q = ((vh) this).field_q + 1;
            if (0 == ((vh) this).field_o[((vh) this).field_q]) {
                break;
            }
        }
        int var4 = -1 + ((vh) this).field_q - var3;
        if (var4 == 0) {
            return "";
        }
        return co.a(var3, var4, param0 + -231, ((vh) this).field_o);
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        if (param0 != -5247) {
            Object var9 = null;
            ((vh) this).a(-2, (String) null);
        }
        int var4 = ((vh) this).field_q;
        ((vh) this).field_q = 0;
        byte[] var5 = new byte[var4];
        ((vh) this).a(0, var4, 0, var5);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param1, param2);
        byte[] var8 = var7.toByteArray();
        ((vh) this).field_q = 0;
        ((vh) this).b(true, var8.length);
        ((vh) this).a(var8, 0, var8.length, 115);
    }

    private final void a(byte param0, long param1) {
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param1 >> -412704592);
        int var4 = 65 / ((47 - param0) / 43);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param1 >> -954935896);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param1 >> 672688160);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param1 >> -1611260648);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param1 >> 413740432);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)(param1 >> -100866744);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(int)param1;
    }

    final int f(byte param0) {
        if (param0 < 91) {
            return -51;
        }
        if (((vh) this).field_o[((vh) this).field_q] >= 0) {
            return ((vh) this).e((byte) -104);
        }
        return 2147483647 & ((vh) this).i(1);
    }

    final byte[] g(byte param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        byte[] var2 = new byte[((vh) this).field_q];
        int var3 = 0;
        if (param0 >= -27) {
            int discarded$0 = ((vh) this).a(97);
        }
        while (var3 < ((vh) this).field_q) {
            var2[var3] = ((vh) this).field_o[var3];
            var3++;
        }
        return var2;
    }

    vh(int param0) {
        ((vh) this).field_q = 0;
        ((vh) this).field_o = od.a(param0, 50);
    }

    vh(byte[] param0) {
        ((vh) this).field_q = 0;
        ((vh) this).field_o = param0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 0) {
            ((vh) this).d(74, 42);
        }
        for (var5 = param2; var5 < param2 + param1; var5++) {
            ((vh) this).field_q = ((vh) this).field_q + 1;
            param3[var5] = ((vh) this).field_o[((vh) this).field_q];
        }
    }

    final void a(byte param0, int param1) {
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(param1 >> 1431843352);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(param1 >> 361386320);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(param1 >> -1720563512);
        if (param0 >= -46) {
            return;
        }
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)param1;
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
            return;
        }
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(param1 >> 1523985896);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)param1;
    }

    final int e(int param0) {
        int var2 = ((vh) this).field_o[((vh) this).field_q] & 255;
        if (param0 != -23470) {
            return 108;
        }
        if (-129 >= (var2 ^ -1)) {
            return ((vh) this).e((byte) -104) + -32768;
        }
        return ((vh) this).k(0);
    }

    final void a(int param0, byte param1) {
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(param0 >> -314377488);
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)(param0 >> 1950420008);
        if (param1 != 58) {
            return;
        }
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[((vh) this).field_q] = (byte)param0;
    }

    public static void f(int param0) {
        field_k = null;
        if (param0 <= 49) {
            field_m = null;
        }
        field_l = null;
        field_r = null;
        field_s = null;
        field_p = null;
        field_m = null;
    }

    final void b(int param0, byte param1) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        while (param0 > ((vh) this).field_q) {
            ((vh) this).field_q = ((vh) this).field_q + 1;
            ((vh) this).field_o[((vh) this).field_q] = (byte) 0;
        }
        int var3 = 34 / ((19 - param1) / 60);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new me(4, 1, 1, 1);
        field_r = "Restart Mission";
        field_m = "Waiting for music";
        field_p = "Quicksaving...";
    }
}
