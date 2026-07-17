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
          field_b = null;
          qk.field_M = null;
          j.field_f = null;
          return;
        } else {
          qk.field_M = null;
          j.field_f = null;
          return;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_65_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param4 != 0) {
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
                    var7_int = ((ff) this).field_a[var7_int];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var10 = ((ff) this).field_a[var7_int];
                    if (((ff) this).field_a[var7_int] >= 0) {
                      break L4;
                    } else {
                      int incrementValue$8 = param2;
                      param2++;
                      param5[incrementValue$8] = (byte)(~var10);
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
                      var7_int = ((ff) this).field_a[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    var10 = ((ff) this).field_a[var7_int];
                    if (((ff) this).field_a[var7_int] < 0) {
                      int incrementValue$9 = param2;
                      param2++;
                      param5[incrementValue$9] = (byte)(~var10);
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
                      var7_int = ((ff) this).field_a[var7_int];
                      break L7;
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    var10 = ((ff) this).field_a[var7_int];
                    if (0 <= ((ff) this).field_a[var7_int]) {
                      break L8;
                    } else {
                      int incrementValue$10 = param2;
                      param2++;
                      param5[incrementValue$10] = (byte)(~var10);
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
                      var7_int = ((ff) this).field_a[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    var10 = ((ff) this).field_a[var7_int];
                    if (((ff) this).field_a[var7_int] < 0) {
                      int incrementValue$11 = param2;
                      param2++;
                      param5[incrementValue$11] = (byte)var10;
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
                    if (-1 == (var9 & 8)) {
                      var7_int++;
                      break L11;
                    } else {
                      var7_int = ((ff) this).field_a[var7_int];
                      break L11;
                    }
                  }
                  L12: {
                    var10 = ((ff) this).field_a[var7_int];
                    if (((ff) this).field_a[var7_int] < 0) {
                      int incrementValue$12 = param2;
                      param2++;
                      param5[incrementValue$12] = (byte)(~var10);
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
                      var7_int = ((ff) this).field_a[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    var10 = ((ff) this).field_a[var7_int];
                    if (((ff) this).field_a[var7_int] >= 0) {
                      break L14;
                    } else {
                      int incrementValue$13 = param2;
                      param2++;
                      param5[incrementValue$13] = (byte)(~var10);
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
                      var7_int = ((ff) this).field_a[var7_int];
                      break L15;
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    var10 = ((ff) this).field_a[var7_int];
                    if (((ff) this).field_a[var7_int] >= 0) {
                      break L16;
                    } else {
                      int incrementValue$14 = param2;
                      param2++;
                      param5[incrementValue$14] = (byte)var10;
                      if (param4 > param2) {
                        var7_int = 0;
                        break L16;
                      } else {
                        return 1 + (var8 - param1);
                      }
                    }
                  }
                  L17: {
                    if (-1 != (var9 & 1)) {
                      var7_int = ((ff) this).field_a[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    var10 = ((ff) this).field_a[var7_int];
                    if (0 > ((ff) this).field_a[var7_int]) {
                      int incrementValue$15 = param2;
                      param2++;
                      param5[incrementValue$15] = (byte)(~var10);
                      if (param2 < param4) {
                        var7_int = 0;
                        var8++;
                        break L18;
                      } else {
                        break L3;
                      }
                    } else {
                      var8++;
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackOut_65_0 = 1 + (var8 - param1);
                stackIn_66_0 = stackOut_65_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("ff.B(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L19;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L19;
            }
          }
          L20: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param5 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L20;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L20;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 41);
        }
        return stackIn_66_0;
    }

    private ff() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
