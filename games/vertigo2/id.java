/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int field_d;
    private jl field_e;
    static sq field_g;
    static mi field_f;
    private r field_h;
    private r field_b;
    static long field_a;
    private jl field_c;

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4;
        var4 = 0;
        if (!param0) {
          if (!param2) {
            if (!param3) {
              if (param1 != 1342181375) {
                field_g = (sq) null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            } else {
              var4++;
              if (param1 != 1342181375) {
                field_g = (sq) null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            }
          } else {
            var4 += 2;
            if (!param3) {
              if (param1 != 1342181375) {
                field_g = (sq) null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            } else {
              var4++;
              if (param1 != 1342181375) {
                field_g = (sq) null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            }
          }
        } else {
          var4 += 4;
          if (param2) {
            var4 += 2;
            if (param3) {
              var4++;
              if (param1 != 1342181375) {
                field_g = (sq) null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            } else {
              if (param1 != 1342181375) {
                field_g = (sq) null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            }
          } else {
            if (param3) {
              var4++;
              if (param1 == 1342181375) {
                return qn.field_t[var4];
              } else {
                field_g = (sq) null;
                return qn.field_t[var4];
              }
            } else {
              if (param1 != 1342181375) {
                field_g = (sq) null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            }
          }
        }
    }

    final static void a(int param0) {
        int var1;
        if (!sq.field_c) {
          throw new IllegalStateException();
        } else {
          mg.field_O = true;
          pm.a((byte) 52, true);
          var1 = 39 % ((param0 - 88) / 32);
          hn.field_w = 0;
          return;
        }
    }

    final static boolean a(mi param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -31980) {
                break L1;
              } else {
                field_g = (sq) null;
                break L1;
              }
            }
            L2: {
              if (-2 != (param0.c((byte) -109, 1) ^ -1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("id.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final ae a(boolean param0, int[] param1, int param2) {
        ae discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        ae stackIn_3_0 = null;
        ae stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-2 == (this.field_b.c(-1) ^ -1)) {
              stackIn_3_0 = this.a(param1, 120, param2, 0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (1 == this.field_b.b(param2, (byte) -73)) {
                stackIn_7_0 = this.a(param1, 124, 0, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (!param0) {
                    break L1;
                  } else {
                    var5 = (int[]) null;
                    discarded$1 = this.a((int[]) null, 126, -12, -30);
                    break L1;
                  }
                }
                throw new RuntimeException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("id.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static int a(int param0, short param1, short param2, lg param3, boolean param4, short param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        byte stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = param3.field_p[param1] + param3.field_p[param5] >> -1885119935;
            var7 = param3.field_D[param1] + param3.field_D[param5] >> -1566516639;
            var8 = param3.field_i[param1] + param3.field_i[param5] >> -50922463;
            param2 = (short)param3.a(var6_int + (param3.field_p[param2] + -var6_int) * 64 / (-param0 + 64), var7 + 64 * (param3.field_D[param2] + -var7) / (64 + -param0), var8 + 64 * (-var8 + param3.field_i[param2]) / (64 + -param0));
            param1 = (short)param3.a(var6_int + (-var6_int + param3.field_p[param1]) * 64 / (-param0 + 64), var7 + 64 * (param3.field_D[param1] + -var7) / (-param0 + 64), var8 + (-var8 + param3.field_i[param1]) * 64 / (-param0 + 64));
            if (!param4) {
              param5 = (short)param3.a(var6_int + 64 * (param3.field_p[param5] + -var6_int) / (-param0 + 64), var7 + (-var7 + param3.field_D[param5]) * 64 / (-param0 + 64), var8 + 64 * (-var8 + param3.field_i[param5]) / (64 + -param0));
              stackIn_4_0 = param3.a(param2, param1, param5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -5;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("id.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != 76) {
            field_g = (sq) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final ae a(int[] param0, int param1, int param2) {
        ae discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        ae stackIn_3_0 = null;
        ae stackIn_6_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_h.c(-1) == 1) {
              stackIn_3_0 = this.b(param0, 0, -127, param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_h.b(param2, (byte) -94) != 1) {
                L1: {
                  if (param1 == 64) {
                    break L1;
                  } else {
                    var5 = (int[]) null;
                    discarded$1 = this.a((int[]) null, -38, -61, 48);
                    break L1;
                  }
                }
                throw new RuntimeException();
              } else {
                stackIn_6_0 = this.b(param0, param2, -128, 0);
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

            stackIn_12_1 = new StringBuilder().append("id.B(");

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
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final ae a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ae var8 = null;
        hp var9 = null;
        ae var10 = null;
        ae stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        ae stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = (param3 >>> 151026956 | (param3 & 1342181375) << -1945268060) ^ param2;
              var5_int = var5_int | param3 << -1558677712;
              if (param1 > 119) {
                break L1;
              } else {
                this.field_e = (jl) null;
                break L1;
              }
            }
            var6 = (long)var5_int;
            var8 = (ae) ((Object) this.field_c.a(var6, (byte) 64));
            if (var8 != null) {
              stackIn_5_0 = (ae) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  if (-1 > (param0[0] ^ -1)) {
                    break L2;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var9 = hp.a(this.field_b, param3, param2);
              if (var9 != null) {
                L3: {
                  var10 = var9.a();
                  var8 = var10;
                  this.field_c.a(var8, var6, false);
                  if (param0 != null) {
                    param0[0] = param0[0] - var10.field_s.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_17_0 = (ae) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("id.J(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ae) ((Object) stackIn_9_0);
          } else {
            return stackIn_17_0;
          }
        }
    }

    final static qi a(int param0, int param1, byte param2, int param3, jj param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        qi var7 = null;
        java.awt.Frame var8 = null;
        qi stackIn_2_0 = null;
        qi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 94) {
              var8 = oc.a(param5, param1, param0, param4, param3, 54);
              var6 = var8;
              if (var8 != null) {
                var7 = new qi();
                var7.field_c = var8;
                var7.field_c.add((java.awt.Component) ((Object) var7));
                var7.setBounds(0, 0, param3, param5);
                var7.addFocusListener(var7);
                var7.requestFocus();
                stackIn_7_0 = (qi) (var7);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (qi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6_ref);

            stackIn_10_1 = new StringBuilder().append("id.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final ae b(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ae var8 = null;
        vh var9 = null;
        ae stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        ae stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = (param1 >>> 174054220 | (-1879044097 & param1) << 1779724932) ^ param3;
              var5_int = var5_int | param1 << -922099984;
              if (param2 <= -125) {
                break L1;
              } else {
                field_a = 53L;
                break L1;
              }
            }
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (ae) ((Object) this.field_c.a(var6, (byte) 64));
            if (var8 != null) {
              stackIn_5_0 = (ae) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  if (param0[0] > 0) {
                    break L2;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L3: {
                var9 = (vh) ((Object) this.field_e.a(var6, (byte) 64));
                if (var9 == null) {
                  var9 = vh.a(this.field_h, param1, param3);
                  if (var9 != null) {
                    this.field_e.a(var9, var6, false);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8 = var9.a(param0);
              if (var8 != null) {
                var9.c(2);
                this.field_c.a(var8, var6, false);
                stackIn_20_0 = (ae) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("id.I(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ae) ((Object) stackIn_9_0);
          } else {
            return stackIn_20_0;
          }
        }
    }

    id(r param0, r param1) {
        this.field_e = new jl(256);
        this.field_c = new jl(256);
        try {
            this.field_b = param0;
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new sq();
    }
}
