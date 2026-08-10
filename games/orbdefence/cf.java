/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static int field_c;
    static int[] field_b;
    static String field_g;
    private int[] field_f;
    static eb field_a;
    static int field_d;
    static int[] field_e;

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        if (param0 != 0) {
          field_a = (eb) null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (ml.b(-107)) {
              b.field_n.a(em.field_q, false, true, lc.field_t);
              b.field_n.o(117);
              var1_int = 17 % ((param0 - 53) / 47);
              L1: while (true) {
                if (!nf.e(32722)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  b.field_n.a(od.field_k, true, ob.field_K);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (mg.field_k == null) {
                  break L2;
                } else {
                  if (mg.field_k.field_e) {
                    lb.a(true);
                    b.field_n.b((byte) 74, (pj) (new gg(b.field_n, hh.field_d)));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "cf.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private cf() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, int param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (0 == param5) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var7_int = 0;
                if (param2 == -1) {
                  break L1;
                } else {
                  field_e = (int[]) null;
                  break L1;
                }
              }
              param5 = param5 + param3;
              var8 = param0;
              L2: while (true) {
                L3: {
                  var9 = param4[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = this.field_f[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_f[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 < 0) {
                      incrementValue$1 = param3;
                      param3++;
                      param1[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param3 >= param5) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (-1 == (64 & var9 ^ -1)) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = this.field_f[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_f[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L7;
                    } else {
                      incrementValue$3 = param3;
                      param3++;
                      param1[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param5 > param3) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if ((var9 & 32) == 0) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = this.field_f[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_f[var7_int];
                    var10 = dupTemp$4;
                    if (0 <= dupTemp$4) {
                      break L9;
                    } else {
                      incrementValue$5 = param3;
                      param3++;
                      param1[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param5 > param3) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if (-1 == (16 & var9 ^ -1)) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = this.field_f[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_f[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 < 0) {
                      incrementValue$7 = param3;
                      param3++;
                      param1[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param5 > param3) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-1 == (var9 & 8 ^ -1)) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = this.field_f[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_f[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param3;
                      param3++;
                      param1[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param5 <= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (0 != (4 & var9)) {
                      var7_int = this.field_f[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_f[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 >= 0) {
                      break L15;
                    } else {
                      incrementValue$11 = param3;
                      param3++;
                      param1[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param5 > param3) {
                        var7_int = 0;
                        break L15;
                      } else {
                        return 1 + var8 - param0;
                      }
                    }
                  }
                  L16: {
                    if (-1 == (2 & var9 ^ -1)) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = this.field_f[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_f[var7_int];
                    var10 = dupTemp$12;
                    if (0 <= dupTemp$12) {
                      break L17;
                    } else {
                      incrementValue$13 = param3;
                      param3++;
                      param1[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param3 >= param5) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if ((1 & var9) != 0) {
                      var7_int = this.field_f[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    dupTemp$14 = this.field_f[var7_int];
                    var10 = dupTemp$14;
                    if (-1 < (dupTemp$14 ^ -1)) {
                      incrementValue$15 = param3;
                      param3++;
                      param1[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param5 > param3) {
                        var7_int = 0;
                        break L19;
                      } else {
                        break L4;
                      }
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackIn_68_0 = 1 + var8 - param0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var7);

            stackIn_71_1 = new StringBuilder().append("cf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L20;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L21;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L21;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_72_0), stackIn_75_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_68_0;
        }
    }

    static {
        field_b = new int[8192];
        field_g = "TIME";
        field_e = new int[8192];
    }
}
