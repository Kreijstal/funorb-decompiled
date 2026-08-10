/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static byte[][][] field_a;
    private int[] field_d;
    static String field_e;
    static String field_c;
    static bi field_b;

    public static void a(boolean param0) {
        if (!param0) {
          field_b = (bi) null;
          field_b = null;
          field_c = null;
          field_e = null;
          field_a = (byte[][][]) null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_e = null;
          field_a = (byte[][][]) null;
          return;
        }
    }

    private fh() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, boolean param5) {
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
        byte[] var12 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param4 == 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param5) {
                  break L1;
                } else {
                  var12 = (byte[]) null;
                  this.a(-19, (byte[]) null, 112, (byte[]) null, -9, true);
                  break L1;
                }
              }
              var7_int = 0;
              param4 = param4 + param2;
              var8 = param0;
              L2: while (true) {
                L3: {
                  var9 = param3[var8];
                  if (-1 < (var9 ^ -1)) {
                    var7_int = this.field_d[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_d[var7_int];
                    var10 = dupTemp$0;
                    if (0 <= dupTemp$0) {
                      break L5;
                    } else {
                      incrementValue$1 = param2;
                      param2++;
                      param1[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param2 < param4) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if ((var9 & 64) != 0) {
                      var7_int = this.field_d[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_d[var7_int];
                    var10 = dupTemp$2;
                    if (0 > dupTemp$2) {
                      incrementValue$3 = param2;
                      param2++;
                      param1[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param2 >= param4) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (0 != (var9 & 32)) {
                      var7_int = this.field_d[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_d[var7_int];
                    var10 = dupTemp$4;
                    if (-1 < (dupTemp$4 ^ -1)) {
                      incrementValue$5 = param2;
                      param2++;
                      param1[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param2 < param4) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var9 & 16) != 0) {
                      var7_int = this.field_d[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_d[var7_int];
                    var10 = dupTemp$6;
                    if (0 <= dupTemp$6) {
                      break L11;
                    } else {
                      incrementValue$7 = param2;
                      param2++;
                      param1[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param4 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if ((var9 & 8) != 0) {
                      var7_int = this.field_d[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_d[var7_int];
                    var10 = dupTemp$8;
                    if (0 <= dupTemp$8) {
                      break L13;
                    } else {
                      incrementValue$9 = param2;
                      param2++;
                      param1[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param4 > param2) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (-1 != (4 & var9 ^ -1)) {
                      var7_int = this.field_d[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_d[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 < 0) {
                      incrementValue$11 = param2;
                      param2++;
                      param1[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param4 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (0 == (var9 & 2)) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = this.field_d[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_d[var7_int];
                    var10 = dupTemp$12;
                    if (0 > dupTemp$12) {
                      incrementValue$13 = param2;
                      param2++;
                      param1[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param2 < param4) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return -param0 + (var8 + 1);
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((1 & var9) == 0) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = this.field_d[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    dupTemp$14 = this.field_d[var7_int];
                    var10 = dupTemp$14;
                    if (0 > dupTemp$14) {
                      incrementValue$15 = param2;
                      param2++;
                      param1[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param2 < param4) {
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
                stackIn_68_0 = -param0 + (var8 + 1);
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

            stackIn_71_1 = new StringBuilder().append("fh.A(").append(param0).append(',');

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


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_72_0), stackIn_75_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_68_0;
        }
    }

    final static void a(int param0, byte param1, String param2) {
        int var3_int = 0;
        s.field_K = false;
        if (param1 != -1) {
            return;
        }
        try {
            jd.field_c = false;
            if (ki.field_c != null && ki.field_c.field_H) {
                var3_int = 1;
                if (param0 != 8) {
                } else {
                    if (rk.field_f) {
                        param2 = bg.field_e;
                    } else {
                        param2 = ml.field_b;
                    }
                    param0 = 2;
                    om.field_p.a(0, kj.field_c);
                }
                if ((param0 ^ -1) == -11) {
                    ib.c(false);
                    var3_int = 0;
                }
                if (var3_int != 0) {
                    if (jd.field_c) {
                        param2 = b.a(new String[]{param2}, cg.field_c, param1 + 1178);
                    }
                    if (pc.field_f) {
                        param2 = gj.field_c;
                    }
                    ki.field_c.a(param2, param0, false);
                }
                if (param0 != 256) {
                    if (10 == param0) {
                        return;
                    }
                    if (rk.field_f) {
                        return;
                    }
                    om.field_p.g((byte) -104);
                }
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "fh.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "That name is not available";
        field_e = "Starting controls";
    }
}
