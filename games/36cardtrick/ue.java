/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private int[] field_c;
    static int field_d;
    static bk field_b;
    static qk field_a;

    public static void a(int param0) {
        if (param0 != 4) {
            ue.a(-20);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -2694) {
            field_d = -63;
            s.field_c = param0;
            dl.field_g = param2;
            return;
        }
        s.field_c = param0;
        dl.field_g = param2;
    }

    final int a(int param0, byte[] param1, byte[] param2, int param3, int param4, int param5) {
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
        int stackIn_3_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Main.field_T;
        try {
          L0: {
            if (param0 != 0) {
              L1: {
                var7_int = 0;
                param0 = param0 + param3;
                if (param4 > 95) {
                  break L1;
                } else {
                  field_a = (qk) null;
                  break L1;
                }
              }
              var8 = param5;
              L2: while (true) {
                L3: {
                  var9 = param2[var8];
                  if (0 <= var9) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = this.field_c[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_c[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L5;
                    } else {
                      incrementValue$1 = param3;
                      param3++;
                      param1[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param3 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (0 != (64 & var9)) {
                      var7_int = this.field_c[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_c[var7_int];
                    var10 = dupTemp$2;
                    if (-1 >= (dupTemp$2 ^ -1)) {
                      break L7;
                    } else {
                      incrementValue$3 = param3;
                      param3++;
                      param1[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param3 < param0) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if (-1 == (var9 & 32 ^ -1)) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_c[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 < 0) {
                      incrementValue$5 = param3;
                      param3++;
                      param1[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param0 > param3) {
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
                      var7_int = this.field_c[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_c[var7_int];
                    var10 = dupTemp$6;
                    if (0 <= dupTemp$6) {
                      break L11;
                    } else {
                      incrementValue$7 = param3;
                      param3++;
                      param1[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param3 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (-1 == (8 & var9 ^ -1)) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_c[var7_int];
                    var10 = dupTemp$8;
                    if (-1 >= (dupTemp$8 ^ -1)) {
                      break L13;
                    } else {
                      incrementValue$9 = param3;
                      param3++;
                      param1[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param0 > param3) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (-1 != (var9 & 4 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_c[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 >= 0) {
                      break L15;
                    } else {
                      incrementValue$11 = param3;
                      param3++;
                      param1[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param3 < param0) {
                        var7_int = 0;
                        break L15;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L16: {
                    if ((var9 & 2) == 0) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_c[var7_int];
                    var10 = dupTemp$12;
                    if (dupTemp$12 < 0) {
                      incrementValue$13 = param3;
                      param3++;
                      param1[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param0 > param3) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return 1 + (var8 - param5);
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (0 == (var9 & 1)) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    dupTemp$14 = this.field_c[var7_int];
                    var10 = dupTemp$14;
                    if (-1 >= (dupTemp$14 ^ -1)) {
                      break L19;
                    } else {
                      incrementValue$15 = param3;
                      param3++;
                      param1[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param0 > param3) {
                        var7_int = 0;
                        break L19;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackIn_66_0 = 1 + (var8 - param5);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("ue.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L20;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');

            if (param2 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L21;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L21;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_66_0;
        }
    }

    private ue() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new bk();
    }
}
