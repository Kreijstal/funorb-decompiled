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
            int fieldTemp$0 = ((bh) this).field_t;
            ((bh) this).field_t = ((bh) this).field_t + 1;
            if (0 == ((bh) this).field_u[fieldTemp$0]) {
                break;
            }
        }
        int var3 = ((bh) this).field_t + (-var2 - 1);
        if (param0 != 81) {
            return null;
        }
        if (var3 == 0) {
            return "";
        }
        return cl.a(-1095, var3, ((bh) this).field_u, var2);
    }

    final byte g(int param0) {
        if (param0 != -1772093437) {
            ((bh) this).field_t = 119;
        }
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        return ((bh) this).field_u[fieldTemp$0];
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
        ((bh) this).field_u[-4 + (((bh) this).field_t - param0)] = (byte)(param0 >> 24);
        int var3 = 49 / ((param1 - -67) / 45);
        ((bh) this).field_u[((bh) this).field_t + (-param0 - 3)] = (byte)(param0 >> 16);
        ((bh) this).field_u[-2 + (((bh) this).field_t + -param0)] = (byte)(param0 >> 8);
        ((bh) this).field_u[-1 + -param0 + ((bh) this).field_t] = (byte)param0;
    }

    final void b(int param0, byte param1) {
        if (param0 >= 0) {
            if (!(param0 >= 128)) {
                ((bh) this).a(param0, false);
                return;
            }
        }
        if (param1 >= -79) {
            ((bh) this).field_t = -106;
        }
        if (0 <= param0) {
            if (!(param0 >= 32768)) {
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
        return ((255 & ((bh) this).field_u[((bh) this).field_t - 2]) << 8) + (255 & ((bh) this).field_u[((bh) this).field_t + -1]);
    }

    final void b(int param0, int param1) {
        ((bh) this).field_u[-1 + -param0 + ((bh) this).field_t] = (byte)param0;
        if (param1 != -2) {
            String discarded$0 = ((bh) this).i(13);
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var3 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              ec.field_i = ec.field_i + 1;
              if (-1 != sj.field_e) {
                break L1;
              } else {
                if (hl.field_cb != -1) {
                  break L1;
                } else {
                  hl.field_cb = a.field_a;
                  sj.field_e = aa.field_Nb;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 != null) {
                  if (param1.equals((Object) (Object) sc.field_c)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != sc.field_c) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!fl.field_s) {
                  if (ec.field_i >= gd.field_Mb) {
                    if (ej.field_z + gd.field_Mb > ec.field_i) {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_16_0 = stackOut_11_0;
                    break L4;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_16_0 = stackOut_9_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_16_0;
                if (param1 == null) {
                  ec.field_i = 0;
                  break L5;
                } else {
                  L6: {
                    if (fl.field_s) {
                      break L6;
                    } else {
                      if (var2_int == 0) {
                        ec.field_i = 0;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ec.field_i = gd.field_Mb;
                  break L5;
                }
              }
              L7: {
                ph.field_z = hl.field_cb;
                if (param1 == null) {
                  if (var2_int == 0) {
                    break L7;
                  } else {
                    fl.field_s = true;
                    break L7;
                  }
                } else {
                  fl.field_s = false;
                  break L7;
                }
              }
              fi.field_Db = sj.field_e;
              break L2;
            }
            L8: {
              sc.field_c = param1;
              if (fl.field_s) {
                break L8;
              } else {
                if (gd.field_Mb <= ec.field_i) {
                  break L8;
                } else {
                  if (qd.field_T) {
                    fi.field_Db = sj.field_e;
                    ec.field_i = 0;
                    ph.field_z = hl.field_cb;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (!fl.field_s) {
                break L9;
              } else {
                if (co.field_n == ec.field_i) {
                  ec.field_i = 0;
                  fl.field_s = false;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            sj.field_e = -1;
            hl.field_cb = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("bh.UA(").append(-57).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
    }

    final static void a() {
        int var1 = 0;
        if (wb.field_c >= 224) {
            qn.a(256, 128);
        } else {
            var1 = wb.field_c % 32;
            qn.a(wb.field_c - (-32 - -var1), 128);
        }
    }

    final long c(int param0) {
        long var2 = (long)((bh) this).f(param0 + -212) & 4294967295L;
        if (param0 != 255) {
            field_n = null;
        }
        long var4 = (long)((bh) this).f(53) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final void a(int param0, int[] param1, int param2, int param3) {
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
        var13 = TetraLink.field_J;
        try {
          L0: {
            var5_int = ((bh) this).field_t;
            if (param0 == -25351) {
              ((bh) this).field_t = param3;
              var6 = (param2 + -param3) / 8;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var6) {
                  ((bh) this).field_t = var5_int;
                  break L0;
                } else {
                  var8 = ((bh) this).f(param0 + 25442);
                  var9 = ((bh) this).f(-115);
                  var10 = -957401312;
                  var11 = -1640531527;
                  var12 = 32;
                  L2: while (true) {
                    int incrementValue$1 = var12;
                    var12--;
                    if (incrementValue$1 <= 0) {
                      ((bh) this).field_t = ((bh) this).field_t - 8;
                      ((bh) this).d(var8, (byte) -124);
                      ((bh) this).d(var9, (byte) -124);
                      var7++;
                      continue L1;
                    } else {
                      var9 = var9 - (var8 + (var8 << 4 ^ var8 >>> 5) ^ param1[-1772093437 & var10 >>> 11] + var10);
                      var10 = var10 - var11;
                      var8 = var8 - (var10 + param1[3 & var10] ^ var9 + (var9 << 4 ^ var9 >>> 5));
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("bh.HA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void d(int param0, byte param1) {
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$3] = (byte)param0;
        if (param1 != -124) {
            Object var4 = null;
            ((bh) this).a((java.math.BigInteger) null, (java.math.BigInteger) null, -19);
        }
    }

    final void b(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            var5_int = param1;
            var6 = 47 / ((param3 - 66) / 60);
            L1: while (true) {
              if (var5_int >= param1 + param0) {
                break L0;
              } else {
                int fieldTemp$7 = ((bh) this).field_t;
                ((bh) this).field_t = ((bh) this).field_t + 1;
                param2[var5_int] = ((bh) this).field_u[fieldTemp$7];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("bh.L(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final void c(byte param0, int param1) {
        if (!((param1 & -128) == 0)) {
            if ((-16384 & param1) != 0) {
                if (!((-2097152 & param1) == -1)) {
                    if (!(-1 == (-268435456 & param1))) {
                        ((bh) this).a(128 | param1 >>> 28, false);
                    }
                    ((bh) this).a(param1 >>> 21 | 128, false);
                }
                ((bh) this).a(128 | param1 >>> 14, false);
            }
            ((bh) this).a(param1 >>> 7 | 128, false);
        }
        if (param0 >= -98) {
        }
        ((bh) this).a(param1 & 127, false);
    }

    final int d(byte param0) {
        if (param0 != -99) {
            return 117;
        }
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        return 255 & ((bh) this).field_u[fieldTemp$0];
    }

    private final void b(int param0, long param1) {
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$3] = (byte)(int)(param1 >> 24);
        if (param0 != -1427754144) {
            byte discarded$4 = ((bh) this).g(-73);
        }
        int fieldTemp$5 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$7] = (byte)(int)param1;
    }

    final int e(byte param0) {
        int var2 = ((bh) this).field_u[((bh) this).field_t] & 255;
        if (param0 != 82) {
            ((bh) this).field_u = null;
        }
        if (var2 >= 128) {
            return ((bh) this).e(param0 ^ 45) + -49152;
        }
        return -64 + ((bh) this).d((byte) -99);
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$1] = (byte)(param0 >> 8);
        if (param1 > -63) {
            field_p = false;
        }
        int fieldTemp$2 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$2] = (byte)param0;
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = ((bh) this).field_t;
        ((bh) this).field_t = 0;
        byte[] var5 = new byte[var4_int];
        ((bh) this).b(var4_int, 0, var5, -111);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param0, param1);
        byte[] var8 = var7.toByteArray();
        ((bh) this).field_t = 0;
        if (param2 != -25035) {
            return;
        }
        try {
            ((bh) this).b(var8.length, false);
            ((bh) this).a(0, 128, var8, var8.length);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "bh.AB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void c() {
        field_o = null;
        field_n = null;
        field_s = null;
        field_q = null;
    }

    final int b(byte param0) {
        int var4 = TetraLink.field_J;
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        int var2 = ((bh) this).field_u[fieldTemp$0];
        if (param0 != 120) {
            return 14;
        }
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var3 | 127 & var2) << 7;
            int fieldTemp$1 = ((bh) this).field_t;
            ((bh) this).field_t = ((bh) this).field_t + 1;
            var2 = ((bh) this).field_u[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void b(byte param0, int param1) {
        int var4 = TetraLink.field_J;
        while (param1 > ((bh) this).field_t) {
            int fieldTemp$0 = ((bh) this).field_t;
            ((bh) this).field_t = ((bh) this).field_t + 1;
            ((bh) this).field_u[fieldTemp$0] = (byte) 0;
        }
        int var3 = -121 / ((param0 - -7) / 36);
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param0.indexOf((int) (char)param1);
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) (Object) param0;
            ((bh) this).field_t = ((bh) this).field_t + wd.a(var4, param0.length(), 0, ((bh) this).field_u, ((bh) this).field_t, (byte) -82);
            int fieldTemp$0 = ((bh) this).field_t;
            ((bh) this).field_t = ((bh) this).field_t + 1;
            ((bh) this).field_u[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "bh.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            if (param1 != 103) {
                ((bh) this).b(-9, false);
            }
            var3_int = param0.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((bh) this).field_t;
            ((bh) this).field_t = ((bh) this).field_t + 1;
            ((bh) this).field_u[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) (Object) param0;
            ((bh) this).field_t = ((bh) this).field_t + wd.a(var4, param0.length(), 0, ((bh) this).field_u, ((bh) this).field_t, (byte) 125);
            int fieldTemp$1 = ((bh) this).field_t;
            ((bh) this).field_t = ((bh) this).field_t + 1;
            ((bh) this).field_u[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "bh.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$1] = (byte)(int)(param1 >> 48);
        if (param0 != -1) {
            return;
        }
        int fieldTemp$2 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$7] = (byte)(int)param1;
    }

    final void a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 10830) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            var3_int = ((bh) this).field_t / 8;
            ((bh) this).field_t = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = ((bh) this).f(param0 + -10946);
                var6 = ((bh) this).f(param0 + -10945);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  int incrementValue$1 = var9;
                  var9--;
                  if (incrementValue$1 <= 0) {
                    ((bh) this).field_t = ((bh) this).field_t - 8;
                    ((bh) this).d(var5, (byte) -124);
                    ((bh) this).d(var6, (byte) -124);
                    var4++;
                    continue L2;
                  } else {
                    var5 = var5 + (var7 - -param1[3 & var7] ^ (var6 << 4 ^ var6 >>> 5) + var6);
                    var7 = var7 + var8;
                    var6 = var6 + ((var5 << 4 ^ var5 >>> 5) - -var5 ^ var7 - -param1[1656750083 & var7 >>> 11]);
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("bh.Q(").append(param0).append(',');
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
          throw oi.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final void a(byte param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            var5 = 80 % ((52 - param0) / 51);
            var3_long = 0L;
            var6 = 0L;
            var8 = param1.length();
            var9 = 19;
            L1: while (true) {
              if (0 > var9) {
                this.b(-1427754144, var3_long);
                this.b(-1427754144, var6);
                break L0;
              } else {
                L2: {
                  var3_long = var3_long * 38L;
                  if (var8 <= var9) {
                    break L2;
                  } else {
                    L3: {
                      var10 = param1.charAt(var9);
                      if (var10 < 65) {
                        break L3;
                      } else {
                        if (var10 <= 90) {
                          var3_long = var3_long + (long)(-65 + (var10 + 2));
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
                        if (var10 > 122) {
                          break L4;
                        } else {
                          var3_long = var3_long + (long)(-95 + var10);
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (var10 < 48) {
                        break L5;
                      } else {
                        if (var10 <= 57) {
                          var3_long = var3_long + (long)(-20 - -var10);
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L2;
                  }
                }
                L6: {
                  if (var9 != 10) {
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
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("bh.W(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final int d(int param0) {
        ((bh) this).field_t = ((bh) this).field_t + 3;
        if (param0 != -1) {
            field_s = null;
        }
        return (255 & ((bh) this).field_u[-1 + ((bh) this).field_t]) + (((255 & ((bh) this).field_u[-2 + ((bh) this).field_t]) << 8) + ((255 & ((bh) this).field_u[((bh) this).field_t + -3]) << 16));
    }

    final int c(byte param0) {
        if (param0 != -40) {
            return -99;
        }
        if (((bh) this).field_u[((bh) this).field_t] >= 0) {
            return ((bh) this).e(param0 ^ -89);
        }
        return ((bh) this).f(88) & 2147483647;
    }

    final int f(byte param0) {
        if (param0 < 6) {
            int discarded$0 = ((bh) this).e((byte) 89);
        }
        int var2 = 255 & ((bh) this).field_u[((bh) this).field_t];
        if (var2 < 128) {
            return ((bh) this).d((byte) -99);
        }
        return ((bh) this).e(127) - 32768;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
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
        var6 = TetraLink.field_J;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (param3 + param0 <= var5_int) {
                L2: {
                  if (param1 == 128) {
                    break L2;
                  } else {
                    field_q = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$2 = ((bh) this).field_t;
                ((bh) this).field_t = ((bh) this).field_t + 1;
                ((bh) this).field_u[fieldTemp$2] = param2[var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("bh.U(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1) {
            return;
        }
        int fieldTemp$1 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$1] = (byte)param0;
    }

    final static int h() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        var2 = TetraLink.field_J;
        try {
          L0: {
            boolean discarded$12 = mf.field_s.a(TetraLink.field_I, true, mn.field_a, false);
            mf.field_s.j(0);
            L1: while (true) {
              if (!nj.b((byte) 28)) {
                if (fk.field_W == -1) {
                  if (!s.field_f) {
                    if (ll.field_C != pi.field_a) {
                      if (!oa.field_y.c(false)) {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      } else {
                        if (ll.field_C != ma.field_d) {
                          stackOut_20_0 = -1;
                          stackIn_21_0 = stackOut_20_0;
                          break L0;
                        } else {
                          stackOut_18_0 = 2;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      }
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    }
                  } else {
                    stackOut_8_0 = 3;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  var1_int = fk.field_W;
                  t.a(-1, 0);
                  stackOut_5_0 = var1_int;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                boolean discarded$13 = mf.field_s.a(dg.field_e, tb.field_m, -81);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "bh.JA(" + -47 + ')');
        }
        return stackIn_21_0;
    }

    bh(int param0) {
        int discarded$0 = -2;
        ((bh) this).field_u = pe.a(param0);
        ((bh) this).field_t = 0;
    }

    final String a(boolean param0) {
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        int var2 = ((bh) this).field_u[fieldTemp$0];
        if (0 != var2) {
            throw new IllegalStateException("");
        }
        if (!param0) {
            field_n = null;
        }
        int var3 = ((bh) this).field_t;
        while (true) {
            int fieldTemp$1 = ((bh) this).field_t;
            ((bh) this).field_t = ((bh) this).field_t + 1;
            if (((bh) this).field_u[fieldTemp$1] == 0) {
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
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$0] = (byte)param0;
    }

    final void a(long param0, boolean param1) {
        if (!param1) {
            field_o = null;
        }
        int fieldTemp$0 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = ((bh) this).field_t;
        ((bh) this).field_t = ((bh) this).field_t + 1;
        ((bh) this).field_u[fieldTemp$4] = (byte)(int)param0;
    }

    final String i(int param0) {
        if (((bh) this).field_u[((bh) this).field_t] == 0) {
            ((bh) this).field_t = ((bh) this).field_t + 1;
            return null;
        }
        int var2 = 0 / ((67 - param0) / 42);
        return ((bh) this).g((byte) 81);
    }

    final void a(byte param0, int param1) {
        ((bh) this).field_u[-param1 + (((bh) this).field_t + -2)] = (byte)(param1 >> 8);
        ((bh) this).field_u[-1 + (-param1 + ((bh) this).field_t)] = (byte)param1;
        int var3 = 17 / ((param0 - -37) / 49);
    }

    bh(byte[] param0) {
        try {
            ((bh) this).field_t = 0;
            ((bh) this).field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(int param0) {
        ((bh) this).field_t = ((bh) this).field_t + 4;
        int var2 = 48 % ((-55 - param0) / 52);
        return (((bh) this).field_u[((bh) this).field_t + -1] & 255) + ((-16777216 & ((bh) this).field_u[-4 + ((bh) this).field_t] << 24) - (-((((bh) this).field_u[-3 + ((bh) this).field_t] & 255) << 16) + -((((bh) this).field_u[((bh) this).field_t + -2] & 255) << 8)));
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
