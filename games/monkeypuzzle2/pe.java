/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static le[] field_a;
    private int[] field_b;
    static wg[] field_d;
    static String field_c;

    public static void b() {
        field_a = null;
        field_c = null;
        field_d = null;
    }

    private pe() throws Throwable {
        throw new Error();
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                e.field_c = param0;
                try {
                  L1: {
                    var6 = param2.getParameter("cookieprefix");
                    var5 = var6;
                    var5 = var6;
                    var4 = param2.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    L2: {
                      var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                      var5 = var7;
                      var5 = var7;
                      if (0 != param0.length()) {
                        var5 = var7 + "; Expires=" + ha.a((byte) -127, pf.a(0) - -94608000000L) + "; Max-Age=" + 94608000L;
                        break L2;
                      } else {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      }
                    }
                    mf.a(true, param2, "document.cookie=\"" + var5 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    break L3;
                  }
                }
                tf.a((byte) -53, param2);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3_ref;
                stackOut_11_1 = new StringBuilder().append("pe.C(");
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              L5: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(-108).append(44);
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a() {
        int var1 = -69;
        if (!(!ok.field_e)) {
            pl.field_e.c("Clearances With Monkeys: " + dc.field_e, 635, 30, 16711680, 1);
            pl.field_e.c("Clearances WithOut Monkeys: " + ek.field_b, 635, 50, 16711680, 1);
            pl.field_e.c("Nuts Fired: " + sc.field_c, 635, 70, 16711680, 1);
            pl.field_e.c("Size of last detatched clump " + ke.field_c, 635, 90, 16711680, 1);
            pl.field_e.c("FPS: " + s.field_T, 635, 110, 16711680, 1);
            pl.field_e.c("LPS: " + jf.field_g, 635, 130, 16711680, 1);
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte[] param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var7_int = 0;
                param3 = param3 + param1;
                if (param0 == -1) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              var8 = param2;
              L2: while (true) {
                L3: {
                  var9 = param5[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = ((pe) this).field_b[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((pe) this).field_b[var7_int];
                    if (((pe) this).field_b[var7_int] < 0) {
                      int incrementValue$8 = param1;
                      param1++;
                      param4[incrementValue$8] = (byte)(~var10);
                      if (param3 <= param1) {
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
                    if ((64 & var9) != 0) {
                      var7_int = ((pe) this).field_b[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((pe) this).field_b[var7_int];
                    if (((pe) this).field_b[var7_int] >= 0) {
                      break L7;
                    } else {
                      int incrementValue$9 = param1;
                      param1++;
                      param4[incrementValue$9] = (byte)var10;
                      if (param1 < param3) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if (-1 != (32 & var9)) {
                      var7_int = ((pe) this).field_b[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((pe) this).field_b[var7_int];
                    if (((pe) this).field_b[var7_int] >= 0) {
                      break L9;
                    } else {
                      int incrementValue$10 = param1;
                      param1++;
                      param4[incrementValue$10] = (byte)var10;
                      if (param3 <= param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (-1 == (var9 & 16)) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = ((pe) this).field_b[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((pe) this).field_b[var7_int];
                    if (((pe) this).field_b[var7_int] >= 0) {
                      break L11;
                    } else {
                      int incrementValue$11 = param1;
                      param1++;
                      param4[incrementValue$11] = (byte)var10;
                      if (param3 <= param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (-1 == (8 & var9)) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = ((pe) this).field_b[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((pe) this).field_b[var7_int];
                    if (((pe) this).field_b[var7_int] < 0) {
                      int incrementValue$12 = param1;
                      param1++;
                      param4[incrementValue$12] = (byte)(~var10);
                      if (param1 >= param3) {
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
                    if ((var9 & 4) == 0) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = ((pe) this).field_b[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((pe) this).field_b[var7_int];
                    if (((pe) this).field_b[var7_int] >= 0) {
                      break L15;
                    } else {
                      int incrementValue$13 = param1;
                      param1++;
                      param4[incrementValue$13] = (byte)(~var10);
                      if (param3 > param1) {
                        var7_int = 0;
                        break L15;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L16: {
                    if ((2 & var9) == 0) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = ((pe) this).field_b[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((pe) this).field_b[var7_int];
                    if (0 > ((pe) this).field_b[var7_int]) {
                      int incrementValue$14 = param1;
                      param1++;
                      param4[incrementValue$14] = (byte)(~var10);
                      if (param1 < param3) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return -param2 + var8 - -1;
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((var9 & 1) == -1) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = ((pe) this).field_b[var7_int];
                      break L18;
                    }
                  }
                  var10 = ((pe) this).field_b[var7_int];
                  if (-1 <= ((pe) this).field_b[var7_int]) {
                    var8++;
                    continue L2;
                  } else {
                    int incrementValue$15 = param1;
                    param1++;
                    param4[incrementValue$15] = (byte)(~var10);
                    if (param1 < param3) {
                      var7_int = 0;
                      var8++;
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_64_0 = -param2 + var8 - -1;
                stackIn_65_0 = stackOut_64_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("pe.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param4 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L19;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L19;
            }
          }
          L20: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param5 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L20;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L20;
            }
          }
          throw la.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 41);
        }
        return stackIn_65_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new wg[17];
        field_c = "Tips: <%0>";
    }
}
