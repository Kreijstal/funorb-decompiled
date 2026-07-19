/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static String field_b;
    static int field_d;
    private int[] field_e;
    static bm field_c;
    static String field_a;
    static String field_f;

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            if (li.a(param0, param2, 18116)) {
              var3_int = param1;
              L1: while (true) {
                if (param2.length() <= var3_int) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (qb.a(param2.charAt(var3_int), (byte) 61)) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("sa.A(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ja var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = (ja) ((Object) vd.field_l.d(9272));
            L1: while (true) {
              if (var4 == null) {
                if (param0 == -336) {
                  break L0;
                } else {
                  field_a = (String) null;
                  return;
                }
              } else {
                eb.a(var4, 0, param1);
                var4 = (ja) ((Object) vd.field_l.e((byte) -119));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "sa.E(" + param0 + ',' + param1 + ')');
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
        java.awt.Color var12 = null;
        int stackIn_3_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_64_0 = 0;
        int stackOut_2_0 = 0;
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
        var11 = Terraphoenix.field_V;
        try {
          L0: {
            if (param1 != 0) {
              L1: {
                var7_int = 0;
                if (param0 < -20) {
                  break L1;
                } else {
                  var12 = (java.awt.Color) null;
                  sa.a(-76, (String) null, 76, (java.awt.Color) null, true);
                  break L1;
                }
              }
              param1 = param1 + param2;
              var8 = param3;
              L2: while (true) {
                L3: {
                  var9 = param5[var8];
                  if (var9 < 0) {
                    var7_int = this.field_e[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = this.field_e[var7_int];
                    if (this.field_e[var7_int] < 0) {
                      incrementValue$8 = param2;
                      param2++;
                      param4[incrementValue$8] = (byte)(var10 ^ -1);
                      if (param2 < param1) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (0 == (64 & var9)) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = this.field_e[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    var10 = this.field_e[var7_int];
                    if (0 > this.field_e[var7_int]) {
                      incrementValue$9 = param2;
                      param2++;
                      param4[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param2 >= param1) {
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
                    if ((var9 & 32) == 0) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = this.field_e[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    var10 = this.field_e[var7_int];
                    if (-1 >= (this.field_e[var7_int] ^ -1)) {
                      break L9;
                    } else {
                      incrementValue$10 = param2;
                      param2++;
                      param4[incrementValue$10] = (byte)(var10 ^ -1);
                      if (param1 > param2) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if (-1 == (var9 & 16 ^ -1)) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = this.field_e[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = this.field_e[var7_int];
                    if (0 <= this.field_e[var7_int]) {
                      break L11;
                    } else {
                      incrementValue$11 = param2;
                      param2++;
                      param4[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param2 >= param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if ((8 & var9) == 0) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = this.field_e[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    var10 = this.field_e[var7_int];
                    if (this.field_e[var7_int] >= 0) {
                      break L13;
                    } else {
                      incrementValue$12 = param2;
                      param2++;
                      param4[incrementValue$12] = (byte)(var10 ^ -1);
                      if (param1 > param2) {
                        var7_int = 0;
                        break L13;
                      } else {
                        return -param3 + (1 + var8);
                      }
                    }
                  }
                  L14: {
                    if ((var9 & 4) != 0) {
                      var7_int = this.field_e[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    var10 = this.field_e[var7_int];
                    if (-1 >= (this.field_e[var7_int] ^ -1)) {
                      break L15;
                    } else {
                      incrementValue$13 = param2;
                      param2++;
                      param4[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param1 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (-1 == (2 & var9 ^ -1)) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = this.field_e[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    var10 = this.field_e[var7_int];
                    if (this.field_e[var7_int] < 0) {
                      incrementValue$14 = param2;
                      param2++;
                      param4[incrementValue$14] = (byte)(var10 ^ -1);
                      if (param1 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (0 != (1 & var9)) {
                      var7_int = this.field_e[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    var10 = this.field_e[var7_int];
                    if (0 > this.field_e[var7_int]) {
                      incrementValue$15 = param2;
                      param2++;
                      param4[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param1 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_64_0 = -param3 + (1 + var8);
                stackIn_65_0 = stackOut_64_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) (var7);
            stackOut_66_1 = new StringBuilder().append("sa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param4 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L20;
            } else {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L20;
            }
          }
          L21: {
            stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param5 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L21;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L21;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_65_0;
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, String param1, int param2, java.awt.Color param3, boolean param4) {
        boolean discarded$1 = false;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = ae.field_G.getGraphics();
                  if (null == t.field_e) {
                    t.field_e = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param4) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, ja.field_j, wc.field_p);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param3 != null) {
                    break L4;
                  } else {
                    param3 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (ag.field_a != null) {
                        break L6;
                      } else {
                        ag.field_a = ae.field_G.createImage(304, 34);
                        break L6;
                      }
                    }
                    var10 = ag.field_a.getGraphics();
                    var10.setColor(param3);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, param2 * 3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(3 * param2 + 2, 2, 300 - 3 * param2, 30);
                    var10.setFont(t.field_e);
                    if (param0 == -26) {
                      var10.setColor(java.awt.Color.white);
                      var10.drawString(param1, (304 - param1.length() * 6) / 2, 22);
                      discarded$1 = var9.drawImage(ag.field_a, -152 + ja.field_j / 2, -18 + wc.field_p / 2, (java.awt.image.ImageObserver) null);
                      decompiledRegionSelector0 = 1;
                      break L5;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + ja.field_j / 2;
                    var8 = wc.field_p / 2 + -18;
                    var9.setColor(param3);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(var7 + 2, var8 + 2, 3 * param2, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var9.fillRect(2 + var7 + 3 * param2, 2 + var8, -(param2 * 3) + 300, 30);
                    var9.setFont(t.field_e);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param1, var7 - -((-(6 * param1.length()) + 304) / 2), 22 + var8);
                    decompiledRegionSelector0 = 1;
                    break L7;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L1;
                } else {
                  if (e.field_o != null) {
                    var9.setFont(t.field_e);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(e.field_o, ja.field_j / 2 + -(6 * e.field_o.length() / 2), -26 + wc.field_p / 2);
                    decompiledRegionSelector1 = 0;
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              ae.field_G.repaint();
              return;
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5_ref);
            stackOut_21_1 = new StringBuilder().append("sa.B(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_b = (String) null;
          field_b = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    static {
        field_a = "M-06";
        field_b = "HTRRG-1";
    }
}
