/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static kk field_b;
    static String[] field_c;
    private int[] field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -1) {
            ff.a(-90);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void b(int param0) {
        cf.field_p = null;
        ka.field_f = null;
        qe.field_z = null;
        vb.field_a = null;
        if (param0 < 21) {
          field_b = (kk) null;
          qk.field_M = (byte[][]) null;
          j.field_f = null;
          return;
        } else {
          qk.field_M = (byte[][]) null;
          j.field_f = null;
          return;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, int param4, byte[] param5) {
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
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (-1 != (param4 ^ -1)) {
              var7_int = param3;
              param4 = param4 + param2;
              var8 = param1;
              L1: while (true) {
                L2: {
                  var9 = param0[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L2;
                  } else {
                    var7_int = this.field_a[var7_int];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    dupTemp$0 = this.field_a[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L4;
                    } else {
                      incrementValue$1 = param2;
                      param2++;
                      param5[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param4 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if ((var9 & 64) == 0) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = this.field_a[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    dupTemp$2 = this.field_a[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 < 0) {
                      incrementValue$3 = param2;
                      param2++;
                      param5[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param2 < param4) {
                        var7_int = 0;
                        break L6;
                      } else {
                        break L3;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((var9 & 32) != 0) {
                      var7_int = this.field_a[var7_int];
                      break L7;
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    dupTemp$4 = this.field_a[var7_int];
                    var10 = dupTemp$4;
                    if (0 <= dupTemp$4) {
                      break L8;
                    } else {
                      incrementValue$5 = param2;
                      param2++;
                      param5[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param4 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (0 != (16 & var9)) {
                      var7_int = this.field_a[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    dupTemp$6 = this.field_a[var7_int];
                    var10 = dupTemp$6;
                    if (-1 < (dupTemp$6 ^ -1)) {
                      incrementValue$7 = param2;
                      param2++;
                      param5[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param4 > param2) {
                        var7_int = 0;
                        break L10;
                      } else {
                        break L3;
                      }
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (-1 == (var9 & 8 ^ -1)) {
                      var7_int++;
                      break L11;
                    } else {
                      var7_int = this.field_a[var7_int];
                      break L11;
                    }
                  }
                  L12: {
                    dupTemp$8 = this.field_a[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param2;
                      param2++;
                      param5[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param2 >= param4) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (0 != (4 & var9)) {
                      var7_int = this.field_a[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    dupTemp$10 = this.field_a[var7_int];
                    var10 = dupTemp$10;
                    if (-1 >= (dupTemp$10 ^ -1)) {
                      break L14;
                    } else {
                      incrementValue$11 = param2;
                      param2++;
                      param5[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param4 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if ((var9 & 2) != 0) {
                      var7_int = this.field_a[var7_int];
                      break L15;
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    dupTemp$12 = this.field_a[var7_int];
                    var10 = dupTemp$12;
                    if (dupTemp$12 >= 0) {
                      break L16;
                    } else {
                      incrementValue$13 = param2;
                      param2++;
                      param5[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param4 > param2) {
                        var7_int = 0;
                        break L16;
                      } else {
                        return 1 + (var8 - param1);
                      }
                    }
                  }
                  L17: {
                    if (-1 != (var9 & 1 ^ -1)) {
                      var7_int = this.field_a[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    dupTemp$14 = this.field_a[var7_int];
                    var10 = dupTemp$14;
                    if (0 > dupTemp$14) {
                      incrementValue$15 = param2;
                      param2++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param2 < param4) {
                        var7_int = 0;
                        break L18;
                      } else {
                        break L3;
                      }
                    } else {
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackIn_64_0 = 1 + (var8 - param1);
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
          L19: {
            var7 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var7);

            stackIn_67_1 = new StringBuilder().append("ff.B(");

            if (param0 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L19;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L20;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L20;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_68_0), stackIn_71_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_64_0;
        }
    }

    private ff() throws Throwable {
        throw new Error();
    }

    static {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
