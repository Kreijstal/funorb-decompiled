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
        int discarded$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param4 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param5) {
                  break L1;
                } else {
                  var12 = (byte[]) null;
                  discarded$9 = this.a(-19, (byte[]) null, 112, (byte[]) null, -9, true);
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
                    var10 = this.field_d[var7_int];
                    if (0 <= this.field_d[var7_int]) {
                      break L5;
                    } else {
                      incrementValue$10 = param2;
                      param2++;
                      param1[incrementValue$10] = (byte)(var10 ^ -1);
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
                    var10 = this.field_d[var7_int];
                    if (0 > this.field_d[var7_int]) {
                      incrementValue$11 = param2;
                      param2++;
                      param1[incrementValue$11] = (byte)(var10 ^ -1);
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
                    var10 = this.field_d[var7_int];
                    if (-1 < (this.field_d[var7_int] ^ -1)) {
                      incrementValue$12 = param2;
                      param2++;
                      param1[incrementValue$12] = (byte)(var10 ^ -1);
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
                    var10 = this.field_d[var7_int];
                    if (0 <= this.field_d[var7_int]) {
                      break L11;
                    } else {
                      incrementValue$13 = param2;
                      param2++;
                      param1[incrementValue$13] = (byte)(var10 ^ -1);
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
                    var10 = this.field_d[var7_int];
                    if (0 <= this.field_d[var7_int]) {
                      break L13;
                    } else {
                      incrementValue$14 = param2;
                      param2++;
                      param1[incrementValue$14] = (byte)(var10 ^ -1);
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
                    var10 = this.field_d[var7_int];
                    if (this.field_d[var7_int] < 0) {
                      incrementValue$15 = param2;
                      param2++;
                      param1[incrementValue$15] = (byte)(var10 ^ -1);
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
                    var10 = this.field_d[var7_int];
                    if (0 > this.field_d[var7_int]) {
                      incrementValue$16 = param2;
                      param2++;
                      param1[incrementValue$16] = (byte)(var10 ^ -1);
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
                    var10 = this.field_d[var7_int];
                    if (0 > this.field_d[var7_int]) {
                      incrementValue$17 = param2;
                      param2++;
                      param1[incrementValue$17] = (byte)(var10 ^ -1);
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
                stackOut_67_0 = -param0 + (var8 + 1);
                stackIn_68_0 = stackOut_67_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var7);
            stackOut_69_1 = new StringBuilder().append("fh.A(").append(param0).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L20;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L20;
            }
          }
          L21: {
            stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param3 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L21;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L21;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_68_0;
        }
    }

    final static void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            s.field_K = false;
            if (param1 == -1) {
              L1: {
                jd.field_c = false;
                if (ki.field_c == null) {
                  break L1;
                } else {
                  if (!ki.field_c.field_H) {
                    break L1;
                  } else {
                    L2: {
                      var3_int = 1;
                      if (param0 == 8) {
                        L3: {
                          if (!rk.field_f) {
                            param2 = ml.field_b;
                            break L3;
                          } else {
                            param2 = bg.field_e;
                            break L3;
                          }
                        }
                        param0 = 2;
                        om.field_p.a(0, kj.field_c);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L4: {
                      if ((param0 ^ -1) != -11) {
                        break L4;
                      } else {
                        ib.c(false);
                        var3_int = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (var3_int == 0) {
                        break L5;
                      } else {
                        L6: {
                          if (!jd.field_c) {
                            break L6;
                          } else {
                            param2 = b.a(new String[]{param2}, cg.field_c, param1 + 1178);
                            break L6;
                          }
                        }
                        L7: {
                          if (!pc.field_f) {
                            break L7;
                          } else {
                            param2 = gj.field_c;
                            break L7;
                          }
                        }
                        ki.field_c.a(param2, param0, false);
                        break L5;
                      }
                    }
                    if (param0 == 256) {
                      break L1;
                    } else {
                      if (10 != param0) {
                        if (!rk.field_f) {
                          om.field_p.g((byte) -104);
                          break L1;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (runtimeException);
            stackOut_25_1 = new StringBuilder().append("fh.B(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_c = "That name is not available";
        field_e = "Starting controls";
    }
}
