/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static le[] field_a;
    private int[] field_b;
    static wg[] field_d;
    static String field_c;

    public static void b(int param0) {
        java.applet.Applet var2 = null;
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
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
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
                    if (param1 == -108) {
                      L2: {
                        L3: {
                          var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                          var5 = var7;
                          var5 = var7;
                          var5 = var7;
                          if (0 != param0.length()) {
                            break L3;
                          } else {
                            var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            if (!MonkeyPuzzle2.field_F) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5 = var5 + "; Expires=" + ha.a((byte) -127, pf.a(0) - -94608000000L) + "; Max-Age=" + 94608000L;
                        break L2;
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
                  L4: {
                    var3 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
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
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) (var3_ref);
                stackOut_11_1 = new StringBuilder().append("pe.C(");
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_77_0 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
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
                  L4: {
                    var9 = param5[var8];
                    if (-1 >= (var9 ^ -1)) {
                      break L4;
                    } else {
                      var7_int = this.field_b[var7_int];
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var7_int++;
                  break L3;
                }
                L5: {
                  L6: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] < 0) {
                      incrementValue$8 = param1;
                      param1++;
                      param4[incrementValue$8] = (byte)(var10 ^ -1);
                      if (param3 <= param1) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if ((64 & var9) != 0) {
                        break L8;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var7_int = this.field_b[var7_int];
                    break L7;
                  }
                  L9: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L9;
                    } else {
                      L10: {
                        incrementValue$9 = param1;
                        param1++;
                        param4[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param1 < param3) {
                          break L10;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var7_int = 0;
                      break L9;
                    }
                  }
                  L11: {
                    L12: {
                      if (-1 != (32 & var9 ^ -1)) {
                        break L12;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var7_int = this.field_b[var7_int];
                    break L11;
                  }
                  L13: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L13;
                    } else {
                      incrementValue$10 = param1;
                      param1++;
                      param4[incrementValue$10] = (byte)(var10 ^ -1);
                      if (param3 <= param1) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (-1 != (var9 & 16 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      if (var11 == 0) {
                        break L14;
                      } else {
                        var7_int++;
                        break L14;
                      }
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L15;
                    } else {
                      incrementValue$11 = param1;
                      param1++;
                      param4[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param3 <= param1) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (-1 != (8 & var9 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      if (var11 == 0) {
                        break L16;
                      } else {
                        var7_int++;
                        break L16;
                      }
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] < 0) {
                      incrementValue$12 = param1;
                      param1++;
                      param4[incrementValue$12] = (byte)(var10 ^ -1);
                      if (param1 >= param3) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((var9 & 4) != 0) {
                      var7_int = this.field_b[var7_int];
                      if (var11 == 0) {
                        break L18;
                      } else {
                        var7_int++;
                        break L18;
                      }
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L19;
                    } else {
                      L20: {
                        incrementValue$13 = param1;
                        param1++;
                        param4[incrementValue$13] = (byte)(var10 ^ -1);
                        if (param3 > param1) {
                          break L20;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L20;
                          }
                        }
                      }
                      var7_int = 0;
                      break L19;
                    }
                  }
                  L21: {
                    if ((2 & var9) != 0) {
                      var7_int = this.field_b[var7_int];
                      if (var11 == 0) {
                        break L21;
                      } else {
                        var7_int++;
                        break L21;
                      }
                    } else {
                      var7_int++;
                      break L21;
                    }
                  }
                  L22: {
                    var10 = this.field_b[var7_int];
                    if (0 > this.field_b[var7_int]) {
                      L23: {
                        incrementValue$14 = param1;
                        param1++;
                        param4[incrementValue$14] = (byte)(var10 ^ -1);
                        if (param1 < param3) {
                          break L23;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var7_int = 0;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L24: {
                    if ((var9 & 1) != 0) {
                      var7_int = this.field_b[var7_int];
                      if (var11 == 0) {
                        break L24;
                      } else {
                        var7_int++;
                        break L24;
                      }
                    } else {
                      var7_int++;
                      break L24;
                    }
                  }
                  L25: {
                    var10 = this.field_b[var7_int];
                    if (-1 >= (this.field_b[var7_int] ^ -1)) {
                      break L25;
                    } else {
                      L26: {
                        incrementValue$15 = param1;
                        param1++;
                        param4[incrementValue$15] = (byte)(var10 ^ -1);
                        if (param1 < param3) {
                          break L26;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L26;
                          }
                        }
                      }
                      var7_int = 0;
                      break L25;
                    }
                  }
                  var8++;
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    break L5;
                  }
                }
                stackOut_77_0 = -param2 + var8 - -1;
                stackIn_78_0 = stackOut_77_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var7 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) (var7);
            stackOut_79_1 = new StringBuilder().append("pe.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param4 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L27;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L27;
            }
          }
          L28: {
            stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param5 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L28;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L28;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_78_0;
        }
    }

    static {
        field_d = new wg[17];
        field_c = "Tips: <%0>";
    }
}
