/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oa extends wf {
    static String field_i;
    int field_h;
    static tf field_l;
    static int field_j;
    byte[] field_g;
    static qj field_k;
    static we[] field_m;

    final int i(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        byte stackOut_3_0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    if (param0 != 17783) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    fieldTemp$2 = this.field_h;
                    this.field_h = this.field_h + 1;
                    var2 = this.field_g[fieldTemp$2];
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (0 <= var2) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3 = (var3 | 127 & var2) << 167517607;
                    fieldTemp$3 = this.field_h;
                    this.field_h = this.field_h + 1;
                    stackOut_3_0 = this.field_g[fieldTemp$3];
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var2 = stackIn_4_0;
                    if (var4 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = var3 | var2;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    return 60;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, byte[] param1, int param2, int param3) {
        int fieldTemp$1 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 < -3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_k = (qj) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = param3;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 + param3 <= var5_int) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fieldTemp$1 = this.field_h;
                        this.field_h = this.field_h + 1;
                        this.field_g[fieldTemp$1] = param1[var5_int];
                        var5_int++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var5);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("oa.V(").append(param0).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param1 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(long param0, boolean param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param0 >> 961312032);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param0 >> 1904920);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param0 >> 440426320);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param0 >> 140584136);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$4] = (byte)(int)param0;
        if (!param1) {
            this.c((byte) 104);
        }
    }

    final void a(byte param0, int param1) {
        this.field_g[this.field_h - (param1 - -1)] = (byte)param1;
        if (param0 != -42) {
            this.b(-65, 48L);
        }
    }

    final long e(byte param0) {
        long var2 = 4294967295L & (long)this.c((byte) -128);
        int var6 = -53 % ((param0 - 16) / 55);
        long var4 = (long)this.c((byte) -104) & 4294967295L;
        return (var2 << -1329379616) + var4;
    }

    final void h(int param0, int param1) {
        int fieldTemp$1 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param1 <= this.field_h) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    fieldTemp$1 = this.field_h;
                    this.field_h = this.field_h + 1;
                    this.field_g[fieldTemp$1] = (byte) 0;
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 == -30190) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_h = -28;
                    return;
                }
                case 7: {
                    return;
                }
                case 9: {
                    if (param0 != -30190) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    this.field_h = -28;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean f(byte param0) {
        int var1 = -82 % ((param0 - -57) / 51);
        return vh.a(ha.b(81), 0);
    }

    final void g(int param0, int param1) {
        if ((param1 ^ -1) <= -65) {
          if (param0 == -21770) {
            if (-16385 < (param1 ^ -1)) {
              if (-16384 > param1) {
                throw new IllegalArgumentException();
              } else {
                this.c(param1 + 49152, -159688920);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            this.h(64);
            if (-16385 < (param1 ^ -1)) {
              if (-16384 > param1) {
                throw new IllegalArgumentException();
              } else {
                this.c(param1 + 49152, -159688920);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } else {
          if (63 < (param1 ^ -1)) {
            if (param0 != -21770) {
              this.h(64);
              if (-16385 < (param1 ^ -1)) {
                if (-16384 <= param1) {
                  this.c(param1 + 49152, -159688920);
                  return;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              if (-16385 < (param1 ^ -1)) {
                if (-16384 > param1) {
                  throw new IllegalArgumentException();
                } else {
                  this.c(param1 + 49152, -159688920);
                  return;
                }
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            this.f(6389, 64 + param1);
            return;
          }
        }
    }

    final static mi a(int param0, ci param1, ci param2, int param3, int param4) {
        RuntimeException var5 = null;
        mi stackIn_2_0 = null;
        mi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -123) {
              if (rl.a(param4, 0, param3, param2)) {
                stackIn_7_0 = ea.a(param1.a((byte) -93, param4, param3), 0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (mi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("oa.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$1 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.d(97, 26);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = param3;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param3 - -param0 <= var5_int) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fieldTemp$1 = this.field_h;
                        this.field_h = this.field_h + 1;
                        param2[var5_int] = this.field_g[fieldTemp$1];
                        var5_int++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var5);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("oa.T(").append(param0).append(',').append(param1).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param2 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int h(int param0) {
        if (param0 == -16777216) {
          if (this.field_g[this.field_h] >= 0) {
            return this.a((byte) -111);
          } else {
            return 2147483647 & this.c((byte) -104);
          }
        } else {
          oa.f((byte) -10);
          if (this.field_g[this.field_h] >= 0) {
            return this.a((byte) -111);
          } else {
            return 2147483647 & this.c((byte) -104);
          }
        }
    }

    final String e(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        var2 = this.field_g[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        } else {
          if (param0 >= 25) {
            var3 = this.field_h;
            L0: while (true) {
              fieldTemp$1 = this.field_h;
              this.field_h = this.field_h + 1;
              if (this.field_g[fieldTemp$1] == 0) {
                var4 = -var3 + this.field_h - 1;
                if (var4 == 0) {
                  return "";
                } else {
                  return cc.a(var3, 15923, var4, this.field_g);
                }
              } else {
                continue L0;
              }
            }
          } else {
            this.g(-108, 29);
            var3 = this.field_h;
            L1: while (true) {
              fieldTemp$2 = this.field_h;
              this.field_h = this.field_h + 1;
              if (this.field_g[fieldTemp$2] == 0) {
                var4 = -var3 + this.field_h - 1;
                if (var4 == 0) {
                  return "";
                } else {
                  return cc.a(var3, 15923, var4, this.field_g);
                }
              } else {
                continue L1;
              }
            }
          }
        }
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            if (param1 < 122) {
                this.c(18, 97);
            }
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) ((Object) param0);
            this.field_h = this.field_h + rb.a(this.field_h, var4, this.field_g, param0.length(), (byte) -116, 0);
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oa.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        int var4_int = this.field_h;
        this.field_h = 0;
        if (param1 > -115) {
            return;
        }
        try {
            var5 = new byte[var4_int];
            this.a(var4_int, 2, var5, 0);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param2);
            var8 = var7.toByteArray();
            this.field_h = 0;
            this.c(var8.length, -159688920);
            this.a((byte) -11, var8, var8.length, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oa.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, String param1) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (0 > var8) {
                      break L4;
                    } else {
                      var3_long = var3_long * 38L;
                      var12 = var7;
                      var11 = var8;
                      if (var10 != 0) {
                        if (var11 > var12) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var11 >= var12) {
                            break L5;
                          } else {
                            L6: {
                              var9 = param1.charAt(var8);
                              if (var9 < 65) {
                                break L6;
                              } else {
                                if (var9 > 90) {
                                  break L6;
                                } else {
                                  var3_long = var3_long + (long)(var9 + 2 + -65);
                                  if (var10 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L7: {
                              if (var9 < 97) {
                                break L7;
                              } else {
                                if (var9 > 122) {
                                  break L7;
                                } else {
                                  var3_long = var3_long + (long)(-97 + (2 - -var9));
                                  if (var10 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L8: {
                              L9: {
                                if (var9 < 48) {
                                  break L9;
                                } else {
                                  if (var9 <= 57) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var3_long = var3_long + 1L;
                              if (var10 == 0) {
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                            var3_long = var3_long + (long)(-48 + (28 - -var9));
                            break L5;
                          }
                        }
                        L10: {
                          if (var8 != 10) {
                            break L10;
                          } else {
                            var5 = var3_long;
                            var3_long = 0L;
                            break L10;
                          }
                        }
                        var8--;
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  this.a(1543687520, var3_long);
                  this.a(1543687520, var5);
                  if (param0 > 105) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                field_j = -123;
                return;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("oa.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L11;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final void a(int param0, String param1) {
        int var4 = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
            int var3_int = 64 / ((param0 - -47) / 60);
            var4 = param1.indexOf(' ');
            if ((var4 ^ -1) <= -1) {
                throw new IllegalArgumentException("");
            }
            var5 = (CharSequence) ((Object) param1);
            this.field_h = this.field_h + rb.a(this.field_h, var5, this.field_g, param1.length(), (byte) -116, 0);
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oa.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int k(int param0) {
        int var2;
        var2 = 255 & this.field_g[this.field_h];
        if (param0 > var2) {
          return -64 + this.d((byte) 47);
        } else {
          return this.a((byte) -93) - 49152;
        }
    }

    final int g(byte param0) {
        java.math.BigInteger var3;
        if (param0 != 124) {
          var3 = (java.math.BigInteger) null;
          this.a((java.math.BigInteger) null, -98, (java.math.BigInteger) null);
          this.field_h = this.field_h + 3;
          return (this.field_g[-2 + this.field_h] << 101173128 & 65280) + ((this.field_g[-3 + this.field_h] << 1579972176 & 16711680) - -(this.field_g[-1 + this.field_h] & 255));
        } else {
          this.field_h = this.field_h + 3;
          return (this.field_g[-2 + this.field_h] << 101173128 & 65280) + ((this.field_g[-3 + this.field_h] << 1579972176 & 16711680) - -(this.field_g[-1 + this.field_h] & 255));
        }
    }

    final void a(int[] param0, int param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = this.field_h / 8;
                        this.field_h = 0;
                        if (param1 > 98) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3_int <= var4) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = this.c((byte) -123);
                        var6 = this.c((byte) -116);
                        var7 = 0;
                        var8 = -1640531527;
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = 32;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        incrementValue$0 = var9;
                        var9--;
                        if (-1 <= (incrementValue$0 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = var5 + ((var6 >>> -394158011 ^ var6 << 2137441572) + var6 ^ param0[3 & var7] + var7);
                        var7 = var7 + var8;
                        var6 = var6 + (var7 - -param0[(7221 & var7) >>> 2077766123] ^ (var5 << -1025387036 ^ var5 >>> 2099239589) + var5);
                        if (var10 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var10 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_h = this.field_h - 8;
                        this.a(-126, var5);
                        this.a(-105, var6);
                        var4++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var3);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("oa.FA(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte b(boolean param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (!param0) {
          this.c(125, -50);
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_g[fieldTemp$2];
        } else {
          fieldTemp$3 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_g[fieldTemp$3];
        }
    }

    final String g(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        int var3;
        if (param0 == 12248) {
          var2 = this.field_h;
          L0: while (true) {
            fieldTemp$2 = this.field_h;
            this.field_h = this.field_h + 1;
            if (this.field_g[fieldTemp$2] == 0) {
              var3 = -var2 + this.field_h - 1;
              if (var3 == 0) {
                return "";
              } else {
                return cc.a(var2, 15923, var3, this.field_g);
              }
            } else {
              continue L0;
            }
          }
        } else {
          this.field_g = (byte[]) null;
          var2 = this.field_h;
          L1: while (true) {
            fieldTemp$3 = this.field_h;
            this.field_h = this.field_h + 1;
            if (this.field_g[fieldTemp$3] == 0) {
              var3 = -var2 + this.field_h - 1;
              if (var3 == 0) {
                return "";
              } else {
                return cc.a(var2, 15923, var3, this.field_g);
              }
            } else {
              continue L1;
            }
          }
        }
    }

    final int f(int param0) {
        int var2;
        var2 = 255 & this.field_g[this.field_h];
        if (param0 < -24) {
          if ((var2 ^ -1) > -129) {
            return this.d((byte) 115);
          } else {
            return -32768 + this.a((byte) -99);
          }
        } else {
          this.f(75);
          if ((var2 ^ -1) > -129) {
            return this.d((byte) 115);
          } else {
            return -32768 + this.a((byte) -99);
          }
        }
    }

    final void i(int param0, int param1) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int[] var4;
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$5] = (byte)(param0 >> -88933744);
        if (param1 <= 43) {
          var4 = (int[]) null;
          this.a((int[]) null, false, -55, 109);
          fieldTemp$6 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$6] = (byte)(param0 >> -148624184);
          fieldTemp$7 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$7] = (byte)param0;
          return;
        } else {
          fieldTemp$8 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$8] = (byte)(param0 >> -148624184);
          fieldTemp$9 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$9] = (byte)param0;
          return;
        }
    }

    final void j(int param0, int param1) {
        this.field_g[-param1 + this.field_h + -4] = (byte)(param1 >> 428612344);
        this.field_g[-3 + (-param1 + this.field_h)] = (byte)(param1 >> -1049755824);
        this.field_g[-2 + -param1 + this.field_h] = (byte)(param1 >> 422772360);
        this.field_g[this.field_h + -param1 - 1] = (byte)param1;
        if (param0 != 567) {
            field_i = (String) null;
        }
    }

    final int a(byte param0) {
        this.field_h = this.field_h + 2;
        if (param0 >= -84) {
          this.b(-26, -89L);
          return ((this.field_g[-2 + this.field_h] & 255) << -1066071352) - -(255 & this.field_g[this.field_h - 1]);
        } else {
          return ((this.field_g[-2 + this.field_h] & 255) << -1066071352) - -(255 & this.field_g[this.field_h - 1]);
        }
    }

    final boolean d(int param0) {
        int var2;
        int var3;
        byte[] var4;
        if (param0 == 5432) {
          this.field_h = this.field_h - 4;
          var2 = sg.a(0, (byte) -22, this.field_h, this.field_g);
          var3 = this.c((byte) -106);
          if (var2 == var3) {
            return true;
          } else {
            return false;
          }
        } else {
          var4 = (byte[]) null;
          this.a((byte) -26, (byte[]) null, -22, -93);
          this.field_h = this.field_h - 4;
          var2 = sg.a(0, (byte) -22, this.field_h, this.field_g);
          var3 = this.c((byte) -106);
          if (var2 == var3) {
            return true;
          } else {
            return false;
          }
        }
    }

    final int d(byte param0) {
        if (param0 < 21) {
            return 90;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return 255 & this.field_g[fieldTemp$0];
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)param1;
        if (param0 != 6389) {
            this.field_h = 49;
        }
    }

    final void e(int param0, int param1) {
        L0: {
          if (0 != (-128 & param0)) {
            L1: {
              if ((-16384 & param0) != 0) {
                L2: {
                  if ((-2097152 & param0) == 0) {
                    break L2;
                  } else {
                    L3: {
                      if ((param0 & -268435456) != 0) {
                        this.f(param1 ^ -268429067, param0 >>> -137343620 | 128);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.f(param1 ^ -268429067, (269616035 | param0) >>> -1128531339);
                    break L2;
                  }
                }
                this.f(6389, (2098829 | param0) >>> 1232303982);
                break L1;
              } else {
                break L1;
              }
            }
            this.f(param1 + 268441845, (16481 | param0) >>> -1088123385);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -268435456) {
          field_j = -120;
          this.f(6389, 127 & param0);
          return;
        } else {
          this.f(6389, 127 & param0);
          return;
        }
    }

    final int c(byte param0) {
        if (param0 >= -103) {
          return 54;
        } else {
          this.field_h = this.field_h + 4;
          return (65280 & this.field_g[this.field_h + -2] << -1323322296) + (this.field_g[this.field_h - 4] << -917446472 & -16777216) + ((this.field_g[this.field_h + -3] << -948108528 & 16711680) - -(this.field_g[-1 + this.field_h] & 255));
        }
    }

    oa(int param0) {
        this.field_g = vk.a(param0, -86);
        this.field_h = 0;
    }

    final void c(int param0, int param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)(param0 >> -159688920);
        if (param1 != -159688920) {
          field_l = (tf) null;
          fieldTemp$4 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$4] = (byte)param0;
          return;
        } else {
          fieldTemp$5 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$5] = (byte)param0;
          return;
        }
    }

    final void a(int param0, int param1) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$7 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$7] = (byte)(param1 >> 58604728);
        if (param0 >= -94) {
          field_k = (qj) null;
          fieldTemp$8 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$8] = (byte)(param1 >> 430958640);
          fieldTemp$9 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$9] = (byte)(param1 >> -1189075352);
          fieldTemp$10 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$10] = (byte)param1;
          return;
        } else {
          fieldTemp$11 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$11] = (byte)(param1 >> 430958640);
          fieldTemp$12 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$12] = (byte)(param1 >> -1189075352);
          fieldTemp$13 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$13] = (byte)param1;
          return;
        }
    }

    final int d(int param0, int param1) {
        int var3;
        int[] var4;
        if (param1 != -1323322296) {
          var4 = (int[]) null;
          this.a((int[]) null, 127);
          var3 = sg.a(param0, (byte) -103, this.field_h, this.field_g);
          this.a(-127, var3);
          return var3;
        } else {
          var3 = sg.a(param0, (byte) -103, this.field_h, this.field_g);
          this.a(-127, var3);
          return var3;
        }
    }

    final String j(int param0) {
        if (param0 != -1640531527) {
            field_j = 89;
            if (!(0 != this.field_g[this.field_h])) {
                this.field_h = this.field_h + 1;
                return null;
            }
            return this.g(12248);
        }
        if (!(0 != this.field_g[this.field_h])) {
            this.field_h = this.field_h + 1;
            return null;
        }
        return this.g(12248);
    }

    final void b(int param0, int param1) {
        this.field_g[-2 + this.field_h + -param1] = (byte)(param1 >> 1811228936);
        this.field_g[this.field_h + (-param1 + -1)] = (byte)param1;
        if (param0 >= -108) {
            byte[] var4 = (byte[]) null;
            this.a(15, 46, (byte[]) null, -117);
        }
    }

    final void a(int[] param0, boolean param1, int param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_k = (qj) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = this.field_h;
                        this.field_h = param2;
                        var6 = (-param2 + param3) / 8;
                        var7 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 >= var6) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = this.c((byte) -127);
                        var9 = this.c((byte) -113);
                        var10 = -957401312;
                        var11 = -1640531527;
                        if (var13 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var12 = 32;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        incrementValue$0 = var12;
                        var12--;
                        if ((incrementValue$0 ^ -1) >= -1) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = var9 - (var8 + (var8 >>> -295479739 ^ var8 << 292611812) ^ var10 + param0[(6389 & var10) >>> 504546795]);
                        var10 = var10 - var11;
                        var8 = var8 - ((var9 >>> -1683859387 ^ var9 << 52167588) - -var9 ^ param0[3 & var10] + var10);
                        if (var13 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var13 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_h = this.field_h - 8;
                        this.a(-118, var8);
                        this.a(-121, var9);
                        var7++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var13 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_h = var5_int;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var5);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("oa.N(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    oa(byte[] param0) {
        try {
            this.field_h = 0;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$11 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$11] = (byte)(int)(param1 >> 971457584);
        int fieldTemp$12 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$12] = (byte)(int)(param1 >> -1871182616);
        int fieldTemp$13 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$13] = (byte)(int)(param1 >> 1543687520);
        if (param0 != 1543687520) {
          this.a((byte) -86, -99);
          fieldTemp$14 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$14] = (byte)(int)(param1 >> 760543192);
          fieldTemp$15 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$15] = (byte)(int)(param1 >> -1702723440);
          fieldTemp$16 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$16] = (byte)(int)(param1 >> -2013778296);
          fieldTemp$17 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$17] = (byte)(int)param1;
          return;
        } else {
          fieldTemp$18 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$18] = (byte)(int)(param1 >> 760543192);
          fieldTemp$19 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$19] = (byte)(int)(param1 >> -1702723440);
          fieldTemp$20 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$20] = (byte)(int)(param1 >> -2013778296);
          fieldTemp$21 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$21] = (byte)(int)param1;
          return;
        }
    }

    final void b(int param0, long param1) {
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int fieldTemp$24 = 0;
        int fieldTemp$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        if (param0 != 1908720528) {
          field_i = (String) null;
          fieldTemp$16 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$16] = (byte)(int)(param1 >> 1487112184);
          fieldTemp$17 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$17] = (byte)(int)(param1 >> -1963141968);
          fieldTemp$18 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$18] = (byte)(int)(param1 >> -397010456);
          fieldTemp$19 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$19] = (byte)(int)(param1 >> -1103030560);
          fieldTemp$20 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$20] = (byte)(int)(param1 >> 683328856);
          fieldTemp$21 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$21] = (byte)(int)(param1 >> 1908720528);
          fieldTemp$22 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$22] = (byte)(int)(param1 >> 398182344);
          fieldTemp$23 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$23] = (byte)(int)param1;
          return;
        } else {
          fieldTemp$24 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$24] = (byte)(int)(param1 >> 1487112184);
          fieldTemp$25 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$25] = (byte)(int)(param1 >> -1963141968);
          fieldTemp$26 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$26] = (byte)(int)(param1 >> -397010456);
          fieldTemp$27 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$27] = (byte)(int)(param1 >> -1103030560);
          fieldTemp$28 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$28] = (byte)(int)(param1 >> 683328856);
          fieldTemp$29 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$29] = (byte)(int)(param1 >> 1908720528);
          fieldTemp$30 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$30] = (byte)(int)(param1 >> 398182344);
          fieldTemp$31 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$31] = (byte)(int)param1;
          return;
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_m = null;
        field_l = null;
        int var1 = -75 % ((6 - param0) / 40);
        field_i = null;
    }

    static {
        field_i = "Account created successfully!";
        field_j = 0;
        field_l = new tf(2, 4, 4, 0);
    }
}
