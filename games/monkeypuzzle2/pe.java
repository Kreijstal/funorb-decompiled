/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static le[] field_a;
    private int[] field_b;
    static wg[] field_d;
    static String field_c;

    public static void b(int param0) {
        java.applet.Applet var2;
        if (param0 != 16711680) {
          var2 = (java.applet.Applet) null;
          pe.a((String) null, (byte) -124, (java.applet.Applet) null);
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    private pe() throws Throwable {
        throw new Error();
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_16_1 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
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
                    if (param1 == -108) {
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
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  tf.a((byte) -53, param2);
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var3_ref);

                stackIn_13_1 = new StringBuilder().append("pe.C(");

                if (param0 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L4;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L5;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L5;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var1 = 69 / ((param0 - -50) / 44);
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
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 == 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var7_int = 0;
                param3 = param3 + param1;
                if (param0 == -1) {
                  break L1;
                } else {
                  field_a = (le[]) null;
                  break L1;
                }
              }
              var8 = param2;
              L2: while (true) {
                L3: {
                  var9 = param5[var8];
                  if (-1 >= (var9 ^ -1)) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = this.field_b[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_b[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 < 0) {
                      incrementValue$1 = param1;
                      param1++;
                      param4[incrementValue$1] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_b[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_b[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L7;
                    } else {
                      incrementValue$3 = param1;
                      param1++;
                      param4[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param1 < param3) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if (-1 != (32 & var9 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_b[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L9;
                    } else {
                      incrementValue$5 = param1;
                      param1++;
                      param4[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param3 <= param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (-1 == (var9 & 16 ^ -1)) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_b[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 >= 0) {
                      break L11;
                    } else {
                      incrementValue$7 = param1;
                      param1++;
                      param4[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param3 <= param1) {
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
                      var7_int = this.field_b[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_b[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param1;
                      param1++;
                      param4[incrementValue$9] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_b[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_b[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 >= 0) {
                      break L15;
                    } else {
                      incrementValue$11 = param1;
                      param1++;
                      param4[incrementValue$11] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_b[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_b[var7_int];
                    var10 = dupTemp$12;
                    if (0 > dupTemp$12) {
                      incrementValue$13 = param1;
                      param1++;
                      param4[incrementValue$13] = (byte)(var10 ^ -1);
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
                    if ((var9 & 1) == 0) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L18;
                    }
                  }
                  dupTemp$14 = this.field_b[var7_int];
                  var10 = dupTemp$14;
                  if (-1 >= (dupTemp$14 ^ -1)) {
                    var8++;
                    continue L2;
                  } else {
                    incrementValue$15 = param1;
                    param1++;
                    param4[incrementValue$15] = (byte)(var10 ^ -1);
                    if (param1 < param3) {
                      var7_int = 0;
                      var8++;
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
                stackIn_65_0 = -param2 + var8 - -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var7);

            stackIn_68_1 = new StringBuilder().append("pe.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L19;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');

            if (param5 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L20;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L20;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_69_0), stackIn_72_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_65_0;
        }
    }

    static {
        field_d = new wg[17];
        field_c = "Tips: <%0>";
    }
}
