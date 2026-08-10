/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ma extends ui implements cc {
    private dj field_l;
    static int field_j;
    static int field_k;

    final static void e(int param0) {
        int fieldTemp$2 = 0;
        pa var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 23) {
                break L1;
              } else {
                field_j = -62;
                break L1;
              }
            }
            var1 = dk.field_s;
            L2: while (true) {
              if (!de.a(-1)) {
                break L0;
              } else {
                var1.d(25, 8);
                fieldTemp$2 = var1.field_q + 1;
                var1.field_q = var1.field_q + 1;
                var2 = fieldTemp$2;
                hb.a(var1, -95);
                dk.field_s.a(var1.field_q - var2, -111);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "ma.T(" + param0 + ')');
        }
    }

    final static vi b(String param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        vi stackIn_3_0 = null;
        vi stackIn_6_0 = null;
        vi stackIn_16_0 = null;
        vi stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var3 = -46 % ((param1 - 62) / 41);
            var2_int = param0.length();
            if (var2_int != 0) {
              if (-64 <= (var2_int ^ -1)) {
                var4 = 0;
                L1: while (true) {
                  if (var4 < var2_int) {
                    L2: {
                      var5 = param0.charAt(var4);
                      if (45 == var5) {
                        L3: {
                          if (var4 == 0) {
                            break L3;
                          } else {
                            if (var4 == -1 + var2_int) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_16_0 = di.field_g;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((bl.field_Q.indexOf(var5) ^ -1) != 0) {
                          break L2;
                        } else {
                          stackIn_19_0 = di.field_g;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_6_0 = uk.field_I;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = dj.field_W;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("ma.V(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    public final void b(dj param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 != 3) {
                field_j = -97;
                this.a(true);
                break L1;
              } else {
                this.a(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ma.M(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final static ka[] a(int param0, int param1, int param2, int param3, boolean param4) {
        if (!param4) {
            return (ka[]) null;
        }
        ka[] var6 = new ka[9];
        ka[] var5 = var6;
        ka dupTemp$0 = e.a(param1, param2, (byte) -113);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        ka dupTemp$1 = e.a(param0, param2, (byte) -100);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(0 == param3)) {
            var6[4] = e.a(param3, 64, (byte) -100);
        }
        return var5;
    }

    ma(dj param0) {
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 6650) {
            break L0;
          } else {
            this.field_l = (dj) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_l.field_v == null) {
              break L2;
            } else {
              if (this.field_l.field_v.length() != 0) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final rj b(byte param0) {
        if (param0 < 79) {
            field_j = 104;
        }
        return this.a((byte) 24, this.field_l.field_v);
    }

    abstract String a(String param0, byte param1);

    public final void a(dj param0, int param1) {
        try {
            if (param1 != 5) {
                this.field_l = (dj) null;
            }
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ma.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract rj a(byte param0, String param1);

    final String d(int param0) {
        if (param0 != 5) {
            return (String) null;
        }
        return this.a(this.field_l.field_v, (byte) -24);
    }

    static {
        field_j = 0;
        field_k = 0;
    }
}
