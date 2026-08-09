/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    private rh field_b;
    static dd[] field_h;
    private rh field_d;
    static String[] field_g;
    static int field_c;
    private hc field_e;
    static int[] field_a;
    private hc field_f;

    final sf a(int param0, boolean param1, int[] param2) {
        RuntimeException var4 = null;
        sf stackIn_3_0 = null;
        sf stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_b.d((byte) -111) ^ -1) == -2) {
              stackIn_3_0 = this.a(0, param0, (byte) 85, param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_c = 28;
                  break L1;
                }
              }
              if ((this.field_b.a(param0, (byte) -105) ^ -1) == -2) {
                stackIn_9_0 = this.a(param0, 0, (byte) 79, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ng.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    private final sf a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sf var8 = null;
        qf var9 = null;
        sf var10 = null;
        sf stackIn_2_0 = null;
        sf stackIn_6_0 = null;
        sf stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 > 7) {
              var5_int = (param1 >>> -1977810868 | (-1879044097 & param1) << 1294747940) ^ param0;
              var5_int = var5_int | param1 << 712350960;
              var6 = (long)var5_int;
              var8 = (sf) ((Object) this.field_f.a(var6, -1110));
              if (var8 != null) {
                stackIn_6_0 = (sf) (var8);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 == null) {
                    break L1;
                  } else {
                    if ((param2[0] ^ -1) < -1) {
                      break L1;
                    } else {
                      return null;
                    }
                  }
                }
                var9 = qf.a(this.field_d, param1, param0);
                if (var9 != null) {
                  L2: {
                    var10 = var9.b();
                    var8 = var10;
                    this.field_f.a(var8, true, var6);
                    if (param2 == null) {
                      break L2;
                    } else {
                      param2[0] = param2[0] - var10.field_l.length;
                      break L2;
                    }
                  }
                  stackIn_17_0 = (sf) (var8);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              stackIn_2_0 = (sf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("ng.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 7) {
              var3 = (CharSequence) ((Object) param0);
              stackIn_4_0 = ma.field_a.equals(uk.a(98, var3));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ng.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final sf a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        sf stackIn_3_0 = null;
        sf stackIn_6_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-2 == (this.field_d.d((byte) 60) ^ -1)) {
              stackIn_3_0 = this.a(param1, 0, param0, 95);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (1 != this.field_d.a(param1, (byte) -116)) {
                L1: {
                  if (param2 == 29037) {
                    break L1;
                  } else {
                    ng.a(-126);
                    break L1;
                  }
                }
                throw new RuntimeException();
              } else {
                stackIn_6_0 = this.a(0, param1, param0, param2 ^ 29055);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("ng.E(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_g = null;
        if (param0 != 0) {
            ng.a(110);
        }
    }

    private final sf a(int param0, int param1, byte param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sf var8 = null;
        hk var9 = null;
        sf stackIn_2_0 = null;
        Object stackIn_17_0 = null;
        sf stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = ((-1879044097 & param0) << -1326494716 | param0 >>> 1964415948) ^ param1;
            var5_int = var5_int | param0 << -1572942736;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (sf) ((Object) this.field_f.a(var6, -1110));
            if (var8 == null) {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (param3[0] > 0) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                if (param2 >= 59) {
                  break L2;
                } else {
                  field_c = 19;
                  break L2;
                }
              }
              L3: {
                var9 = (hk) ((Object) this.field_e.a(var6, -1110));
                if (var9 == null) {
                  var9 = hk.a(this.field_b, param0, param1);
                  if (var9 != null) {
                    this.field_e.a(var9, true, var6);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8 = var9.a(param3);
              if (var8 != null) {
                var9.c(-1);
                this.field_f.a(var8, true, var6);
                stackIn_19_0 = (sf) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_17_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (sf) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("ng.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (sf) ((Object) stackIn_17_0);
          } else {
            return stackIn_19_0;
          }
        }
    }

    ng(rh param0, rh param1) {
        this.field_e = new hc(256);
        this.field_f = new hc(256);
        try {
            this.field_d = param0;
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = new int[4];
    }
}
