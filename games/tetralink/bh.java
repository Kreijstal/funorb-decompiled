/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bh extends mc {
    static String field_o;
    static fa field_q;
    int field_t;
    static boolean field_r;
    static String field_n;
    static String field_s;
    static boolean field_p;
    byte[] field_u;

    final String g(byte param0) {
        int var2 = ((bh) this).field_t;
        while (true) {
            ((bh) this).field_t = ((bh) this).field_t + 1;
            if (0 == ((bh) this).field_u[((bh) this).field_t]) {
                break;
            }
        }
        int var3 = ((bh) this).field_t + (-var2 - 1);
        if (param0 != 81) {
            return null;
        }
        if (-1 == (var3 ^ -1)) {
            return "";
        }
        return cl.a(-1095, var3, ((bh) this).field_u, var2);
    }

    final byte g(int param0) {
        if (param0 != -1772093437) {
            ((bh) this).field_t = 119;
        }
        ((bh) this).field_t = ((bh) this).field_t + 1;
        return ((bh) this).field_u[((bh) this).field_t];
    }

    final boolean h(int param0) {
        ((bh) this).field_t = ((bh) this).field_t - param0;
        int var2 = q.a(((bh) this).field_u, 2, ((bh) this).field_t, 0);
        int var3 = ((bh) this).f(24);
        if (var2 != var3) {
            return false;
        }
        return true;
    }

    final void c(int param0, byte param1) {
        ((bh) this).field_u[-4 + (((bh) this).field_t - param0)] = (byte)(param0 >> 33721848);
        int var3 = 49 / ((param1 - -67) / 45);
        ((bh) this).field_u[((bh) this).field_t + (-param0 - 3)] = (byte)(param0 >> -230115664);
        ((bh) this).field_u[-2 + (((bh) this).field_t + -param0)] = (byte)(param0 >> 1895504008);
        ((bh) this).field_u[-1 + -param0 + ((bh) this).field_t] = (byte)param0;
    }

    final void b(int param0, byte param1) {
        if ((param0 ^ -1) <= -1) {
            if (!(param0 >= 128)) {
                ((bh) this).a(param0, false);
                return;
            }
        }
        if (param1 >= -79) {
            ((bh) this).field_t = -106;
        }
        if (0 <= param0) {
            if (!((param0 ^ -1) <= -32769)) {
                ((bh) this).b(32768 + param0, false);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final int e(int param0) {
        if (param0 < 126) {
            this.b(-74, -51L);
        }
        ((bh) this).field_t = ((bh) this).field_t + 2;
        return ((255 & ((bh) this).field_u[((bh) this).field_t - 2]) << 775077608) + (255 & ((bh) this).field_u[((bh) this).field_t + -1]);
    }

    final void b(int param0, int param1) {
        ((bh) this).field_u[-1 + -param0 + ((bh) this).field_t] = (byte)param0;
        if (param1 != -2) {
            String discarded$0 = ((bh) this).i(13);
        }
    }

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var3 = TetraLink.field_J;
          ec.field_i = ec.field_i + 1;
          if (-1 != sj.field_e) {
            break L0;
          } else {
            if ((hl.field_cb ^ -1) != 0) {
              break L0;
            } else {
              hl.field_cb = a.field_a;
              sj.field_e = aa.field_Nb;
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if (param1 != null) {
              if (param1.equals((Object) (Object) sc.field_c)) {
                break L1;
              } else {
                break L2;
              }
            } else {
              if (null != sc.field_c) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (!fl.field_s) {
              if (ec.field_i >= gd.field_Mb) {
                if (ej.field_z + gd.field_Mb > ec.field_i) {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = 0;
                  stackIn_15_0 = stackOut_12_0;
                  break L3;
                }
              } else {
                stackOut_10_0 = 0;
                stackIn_15_0 = stackOut_10_0;
                break L3;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_15_0 = stackOut_8_0;
              break L3;
            }
          }
          L4: {
            var2 = stackIn_15_0;
            if (param1 != null) {
              if (!fl.field_s) {
                if (var2 == 0) {
                  ec.field_i = 0;
                  break L4;
                } else {
                  ec.field_i = gd.field_Mb;
                  break L4;
                }
              } else {
                ec.field_i = gd.field_Mb;
                break L4;
              }
            } else {
              ec.field_i = 0;
              break L4;
            }
          }
          L5: {
            ph.field_z = hl.field_cb;
            if (param1 == null) {
              if (var2 == 0) {
                break L5;
              } else {
                fl.field_s = true;
                break L5;
              }
            } else {
              fl.field_s = false;
              break L5;
            }
          }
          fi.field_Db = sj.field_e;
          break L1;
        }
        L6: {
          if (param0 <= -54) {
            break L6;
          } else {
            field_o = null;
            break L6;
          }
        }
        L7: {
          sc.field_c = param1;
          if (fl.field_s) {
            break L7;
          } else {
            if (gd.field_Mb <= ec.field_i) {
              break L7;
            } else {
              if (qd.field_T) {
                fi.field_Db = sj.field_e;
                ec.field_i = 0;
                ph.field_z = hl.field_cb;
                break L7;
              } else {
                break L7;
              }
            }
          }
        }
        L8: {
          if (!fl.field_s) {
            break L8;
          } else {
            if (co.field_n == ec.field_i) {
              ec.field_i = 0;
              fl.field_s = false;
              break L8;
            } else {
              break L8;
            }
          }
        }
        sj.field_e = -1;
        hl.field_cb = -1;
    }

    final static void a(int param0) {
        int var1 = 0;
        if ((wb.field_c ^ -1) <= -225) {
            qn.a(256, param0 ^ 384);
        } else {
            var1 = wb.field_c % 32;
            qn.a(wb.field_c - (-32 - -var1), 128);
        }
        if (param0 != 256) {
            field_p = false;
        }
    }

    final long c(int param0) {
        long var2 = (long)((bh) this).f(param0 + -212) & 4294967295L;
        if (param0 != 255) {
            field_n = null;
        }
        long var4 = (long)((bh) this).f(53) & 4294967295L;
        return (var2 << -1288952096) + var4;
    }

    final void a(int param0, int[] param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = TetraLink.field_J;
        int var5 = ((bh) this).field_t;
        if (param0 != -25351) {
            return;
        }
        ((bh) this).field_t = param3;
        int var6 = (param2 + -param3) / 8;
        for (var7 = 0; var7 < var6; var7++) {
            var8 = ((bh) this).f(param0 + 25442);
            var9 = ((bh) this).f(-115);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
                var12--;
                if ((var12 ^ -1) >= -1) {
                    break;
                }
                var9 = var9 - (var8 + (var8 << -2065572924 ^ var8 >>> 1850351269) ^ param1[-1772093437 & var10 >>> -804818485] + var10);
                var10 = var10 - var11;
                var8 = var8 - (var10 + param1[3 & var10] ^ var9 + (var9 << -2123958588 ^ var9 >>> -419201915));
            }
            ((bh) this).field_t = ((bh) this).field_t - 8;
            ((bh) this).d(var8, (byte) -124);
            ((bh) this).d(var9, (byte) -124);
        }
        ((bh) this).field_t = var5;
    }

    final void d(int param0, byte param1) {
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(param0 >> 1608165720);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(param0 >> 381054160);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(param0 >> 1976116104);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)param0;
        if (param1 != -124) {
            Object var4 = null;
            ((bh) this).a((java.math.BigInteger) null, (java.math.BigInteger) null, -19);
        }
    }

    final void b(int param0, int param1, byte[] param2, int param3) {
        int var7 = TetraLink.field_J;
        int var5 = param1;
        int var6 = 47 / ((param3 - 66) / 60);
        while (var5 < param1 + param0) {
            ((bh) this).field_t = ((bh) this).field_t + 1;
            param2[var5] = ((bh) this).field_u[((bh) this).field_t];
            var5++;
        }
    }

    final void c(byte param0, int param1) {
        if (!(-1 == (param1 & -128 ^ -1))) {
            if ((-16384 & param1) != 0) {
                if (!((-2097152 & param1) == -1)) {
                    if (!(-1 == (-268435456 & param1))) {
                        ((bh) this).a(128 | param1 >>> 748292156, false);
                    }
                    ((bh) this).a(param1 >>> -254604587 | 128, false);
                }
                ((bh) this).a(128 | param1 >>> 290468270, false);
            }
            ((bh) this).a(param1 >>> 278992583 | 128, false);
        }
        if (param0 >= -98) {
        }
        ((bh) this).a(param1 & 127, false);
    }

    final int d(byte param0) {
        if (param0 != -99) {
            return 117;
        }
        ((bh) this).field_t = ((bh) this).field_t + 1;
        return 255 & ((bh) this).field_u[((bh) this).field_t];
    }

    private final void b(int param0, long param1) {
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> 1937149040);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> -1341777880);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> -1427754144);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> 820767256);
        if (param0 != -1427754144) {
            byte discarded$0 = ((bh) this).g(-73);
        }
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> 581619344);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> -194724344);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)param1;
    }

    final int e(byte param0) {
        int var2 = ((bh) this).field_u[((bh) this).field_t] & 255;
        if (param0 != 82) {
            ((bh) this).field_u = null;
        }
        if (-129 >= (var2 ^ -1)) {
            return ((bh) this).e(param0 ^ 45) + -49152;
        }
        return -64 + ((bh) this).d((byte) -99);
    }

    final void a(int param0, byte param1) {
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(param0 >> -448967248);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(param0 >> -1161751064);
        if (param1 > -63) {
            field_p = false;
        }
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)param0;
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4 = ((bh) this).field_t;
        ((bh) this).field_t = 0;
        byte[] var5 = new byte[var4];
        ((bh) this).b(var4, 0, var5, -111);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param0, param1);
        byte[] var8 = var7.toByteArray();
        ((bh) this).field_t = 0;
        if (param2 != -25035) {
            return;
        }
        ((bh) this).b(var8.length, false);
        ((bh) this).a(0, 128, var8, var8.length);
    }

    public static void c(boolean param0) {
        if (!param0) {
            Object var2 = null;
            bh.a(37, (String) null);
        }
        field_o = null;
        field_n = null;
        field_s = null;
        field_q = null;
    }

    final int b(byte param0) {
        int var4 = TetraLink.field_J;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        int var2 = ((bh) this).field_u[((bh) this).field_t];
        if (param0 != 120) {
            return 14;
        }
        int var3 = 0;
        while ((var2 ^ -1) > -1) {
            var3 = (var3 | 127 & var2) << -841350073;
            ((bh) this).field_t = ((bh) this).field_t + 1;
            var2 = ((bh) this).field_u[((bh) this).field_t];
        }
        return var3 | var2;
    }

    final void b(byte param0, int param1) {
        int var4 = TetraLink.field_J;
        while (param1 > ((bh) this).field_t) {
            ((bh) this).field_t = ((bh) this).field_t + 1;
            ((bh) this).field_u[((bh) this).field_t] = (byte) 0;
        }
        int var3 = -121 / ((param0 - -7) / 36);
    }

    final void a(String param0, int param1) {
        int var3 = param0.indexOf((int) (char)param1);
        if ((var3 ^ -1) <= -1) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        ((bh) this).field_t = ((bh) this).field_t + wd.a(var4, param0.length(), 0, ((bh) this).field_u, ((bh) this).field_t, (byte) -82);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte) 0;
    }

    final int c(int param0, int param1) {
        int var3 = q.a(((bh) this).field_u, 2, ((bh) this).field_t, param0);
        if (param1 >= -49) {
            field_q = null;
        }
        ((bh) this).d(var3, (byte) -124);
        return var3;
    }

    final void a(String param0, byte param1) {
        if (param1 != 103) {
            ((bh) this).b(-9, false);
        }
        int var3 = param0.indexOf(' ');
        if (!(var3 < 0)) {
            throw new IllegalArgumentException("");
        }
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte) 0;
        CharSequence var4 = (CharSequence) (Object) param0;
        ((bh) this).field_t = ((bh) this).field_t + wd.a(var4, param0.length(), 0, ((bh) this).field_u, ((bh) this).field_t, (byte) 125);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte) 0;
    }

    final void a(int param0, long param1) {
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> -402349128);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> -2107199504);
        if (param0 != -1) {
            return;
        }
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> 1990289896);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> 1075252576);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> -1200680744);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> 780576016);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param1 >> -137344248);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)param1;
    }

    final void a(int param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = TetraLink.field_J;
        if (param0 != 10830) {
            field_o = null;
        }
        int var3 = ((bh) this).field_t / 8;
        ((bh) this).field_t = 0;
        for (var4 = 0; var4 < var3; var4++) {
            var5 = ((bh) this).f(param0 + -10946);
            var6 = ((bh) this).f(param0 + -10945);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
                var9--;
                if ((var9 ^ -1) >= -1) {
                    break;
                }
                var5 = var5 + (var7 - -param1[3 & var7] ^ (var6 << 1093916740 ^ var6 >>> -616524187) + var6);
                var7 = var7 + var8;
                var6 = var6 + ((var5 << 1882799300 ^ var5 >>> -1143194395) - -var5 ^ var7 - -param1[1656750083 & var7 >>> 1209220747]);
            }
            ((bh) this).field_t = ((bh) this).field_t - 8;
            ((bh) this).d(var5, (byte) -124);
            ((bh) this).d(var6, (byte) -124);
        }
    }

    final void a(byte param0, String param1) {
        long var3 = 0L;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        var5 = 80 % ((52 - param0) / 51);
        var3 = 0L;
        var6 = 0L;
        var8 = param1.length();
        var9 = 19;
        L0: while (true) {
          if (0 > var9) {
            this.b(-1427754144, var3);
            this.b(-1427754144, var6);
            return;
          } else {
            L1: {
              var3 = var3 * 38L;
              if (var8 <= var9) {
                break L1;
              } else {
                L2: {
                  var10 = param1.charAt(var9);
                  if (var10 < 65) {
                    break L2;
                  } else {
                    if (var10 <= 90) {
                      var3 = var3 + (long)(-65 + (var10 + 2));
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var10 < 97) {
                    break L3;
                  } else {
                    if (var10 > 122) {
                      break L3;
                    } else {
                      var3 = var3 + (long)(-95 + var10);
                      break L1;
                    }
                  }
                }
                L4: {
                  if (var10 < 48) {
                    break L4;
                  } else {
                    if (var10 <= 57) {
                      var3 = var3 + (long)(-20 - -var10);
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
            if (-11 == (var9 ^ -1)) {
              var6 = var3;
              var3 = 0L;
              var9--;
              continue L0;
            } else {
              var9--;
              continue L0;
            }
          }
        }
    }

    final int d(int param0) {
        ((bh) this).field_t = ((bh) this).field_t + 3;
        if (param0 != -1) {
            field_s = null;
        }
        return (255 & ((bh) this).field_u[-1 + ((bh) this).field_t]) + (((255 & ((bh) this).field_u[-2 + ((bh) this).field_t]) << -1154964600) + ((255 & ((bh) this).field_u[((bh) this).field_t + -3]) << 692495120));
    }

    final int c(byte param0) {
        if (param0 != -40) {
            return -99;
        }
        if (-1 >= (((bh) this).field_u[((bh) this).field_t] ^ -1)) {
            return ((bh) this).e(param0 ^ -89);
        }
        return ((bh) this).f(88) & 2147483647;
    }

    final int f(byte param0) {
        if (param0 < 6) {
            int discarded$0 = ((bh) this).e((byte) 89);
        }
        int var2 = 255 & ((bh) this).field_u[((bh) this).field_t];
        if (-129 < (var2 ^ -1)) {
            return ((bh) this).d((byte) -99);
        }
        return ((bh) this).e(127) - 32768;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        for (var5 = param0; param3 + param0 > var5; var5++) {
            ((bh) this).field_t = ((bh) this).field_t + 1;
            ((bh) this).field_u[((bh) this).field_t] = param2[var5];
        }
        if (param1 != 128) {
            field_q = null;
        }
    }

    final void b(int param0, boolean param1) {
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(param0 >> -1879464696);
        if (param1) {
            return;
        }
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)param0;
    }

    final static int h(byte param0) {
        int var1 = 0;
        int var2 = TetraLink.field_J;
        boolean discarded$8 = mf.field_s.a(TetraLink.field_I, true, mn.field_a, false);
        if (param0 != -47) {
            Object var3 = null;
            bh.a(21, (String) null);
        }
        mf.field_s.j(param0 + 47);
        while (nj.b((byte) 28)) {
            boolean discarded$9 = mf.field_s.a(dg.field_e, tb.field_m, -81);
        }
        if (0 != (fk.field_W ^ -1)) {
            var1 = fk.field_W;
            t.a(-1, 0);
            return var1;
        }
        if (s.field_f) {
            return 3;
        }
        if (ll.field_C == pi.field_a) {
            return 1;
        }
        if (!(oa.field_y.c(false))) {
            return 1;
        }
        if (ll.field_C == ma.field_d) {
            return 2;
        }
        return -1;
    }

    bh(int param0) {
        ((bh) this).field_u = pe.a(param0, (byte) -2);
        ((bh) this).field_t = 0;
    }

    final String a(boolean param0) {
        ((bh) this).field_t = ((bh) this).field_t + 1;
        int var2 = ((bh) this).field_u[((bh) this).field_t];
        if (0 != var2) {
            throw new IllegalStateException("");
        }
        if (!param0) {
            field_n = null;
        }
        int var3 = ((bh) this).field_t;
        while (true) {
            ((bh) this).field_t = ((bh) this).field_t + 1;
            if (((bh) this).field_u[((bh) this).field_t] == 0) {
                break;
            }
        }
        int var4 = ((bh) this).field_t - var3 - 1;
        if (var4 == 0) {
            return "";
        }
        return cl.a(-1095, var4, ((bh) this).field_u, var3);
    }

    final void a(int param0, boolean param1) {
        if (param1) {
            field_r = false;
        }
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)param0;
    }

    final void a(long param0, boolean param1) {
        if (!param1) {
            field_o = null;
        }
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param0 >> -1025475168);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param0 >> -761625704);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param0 >> 1165797840);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)(param0 >> -189707128);
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[((bh) this).field_t] = (byte)(int)param0;
    }

    final String i(int param0) {
        if (-1 == (((bh) this).field_u[((bh) this).field_t] ^ -1)) {
            ((bh) this).field_t = ((bh) this).field_t + 1;
            return null;
        }
        int var2 = 0 / ((67 - param0) / 42);
        return ((bh) this).g((byte) 81);
    }

    final void a(byte param0, int param1) {
        ((bh) this).field_u[-param1 + (((bh) this).field_t + -2)] = (byte)(param1 >> -1373367064);
        ((bh) this).field_u[-1 + (-param1 + ((bh) this).field_t)] = (byte)param1;
        int var3 = 17 / ((param0 - -37) / 49);
    }

    bh(byte[] param0) {
        ((bh) this).field_t = 0;
        ((bh) this).field_u = param0;
    }

    final int f(int param0) {
        ((bh) this).field_t = ((bh) this).field_t + 4;
        int var2 = 48 % ((-55 - param0) / 52);
        return (((bh) this).field_u[((bh) this).field_t + -1] & 255) + ((-16777216 & ((bh) this).field_u[-4 + ((bh) this).field_t] << 925541464) - (-((((bh) this).field_u[-3 + ((bh) this).field_t] & 255) << 344684720) + -((((bh) this).field_u[((bh) this).field_t + -2] & 255) << -471507544)));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Pause Menu";
        field_r = true;
        field_s = "red";
        field_n = "Click or press F10 to open Quick Chat";
    }
}
