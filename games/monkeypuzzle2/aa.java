/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    be[] field_c;
    static int field_a;
    static ib field_b;

    final int a(int param0, String param1, int param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        java.applet.Applet var11 = null;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              if (param3 == -79) {
                break L1;
              } else {
                var11 = (java.applet.Applet) null;
                aa.a(71, (java.applet.Applet) null);
                break L1;
              }
            }
            var7 = param1.length();
            var8 = 0;
            L2: while (true) {
              if (var7 <= var8) {
                if (0 < var5_int) {
                  stackIn_20_0 = (-param2 + param0 << 427847240) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackIn_22_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param1.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L3;
                  } else {
                    if (62 == var9) {
                      var6 = 0;
                      break L3;
                    } else {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var8++;
                        continue L2;
                      }
                    }
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("aa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return stackIn_22_0;
        }
    }

    final int b(int param0, int param1) {
        be var4 = null;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var3 = 0;
        if (param1 >= 0) {
            field_b = (ib) null;
        }
        while (var3 < this.field_c.length) {
            var4 = this.field_c[var3];
            if (!(var4.field_c.length <= param0)) {
                return var3;
            }
            param0 = param0 - (-1 + var4.field_c.length);
            var3++;
        }
        return this.field_c.length;
    }

    final static int a(ta param0, int param1, String param2, boolean param3, String[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0.a(param2);
              if (var5_int > param1) {
                break L1;
              } else {
                if (param2.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param4[0] = param2;
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (var5_int - -param1 + -1) / param1;
            if (param3) {
              param1 = var5_int / var6;
              var6 = 0;
              var7 = 0;
              var8 = param2.length();
              var9 = 0;
              L2: while (true) {
                if (var8 <= var9) {
                  L3: {
                    if (var7 >= var8) {
                      break L3;
                    } else {
                      incrementValue$0 = var6;
                      var6++;
                      param4[incrementValue$0] = param2.substring(var7, var8).trim();
                      break L3;
                    }
                  }
                  stackIn_25_0 = var6;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var10 = param2.charAt(var9);
                      if ((var10 ^ -1) == -33) {
                        break L5;
                      } else {
                        if (var10 != 45) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var11 = param2.substring(var7, 1 + var9).trim();
                    var12 = param0.a(var11);
                    if (param1 > var12) {
                      break L4;
                    } else {
                      incrementValue$1 = var6;
                      var6++;
                      param4[incrementValue$1] = var11;
                      var7 = var9 - -1;
                      break L4;
                    }
                  }
                  if (var10 == 62) {
                    if (param2.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param4[incrementValue$2] = param2.substring(var7, -3 + var9).trim();
                      var7 = 1 + var9;
                      var9++;
                      continue L2;
                    } else {
                      var9++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_7_0 = 23;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("aa.B(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_29_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_25_0;
          }
        }
    }

    final int a(int param0, int param1) {
        int var5 = 0;
        be var6 = null;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        be[] var8 = this.field_c;
        be[] var3 = var8;
        int var4 = -95 / ((32 - param0) / 51);
        for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            if (!(param1 >= var6.field_c.length)) {
                return var6.field_c[param1];
            }
            param1 = param1 - (-1 + var6.field_c.length);
        }
        return 0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param0 <= -123) {
                      var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                      param1.getAppletContext().showDocument(uf.a(param1, (byte) 107, var2), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("aa.J(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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

    public static void c(int param0) {
        field_b = null;
        if (param0 != -1) {
            field_a = 39;
        }
    }

    final int b(int param0) {
        String var3;
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 62) {
            break L0;
          } else {
            var3 = (String) null;
            this.a(121, (String) null, 20, (byte) -1);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_c == null) {
              break L2;
            } else {
              if (0 < this.field_c.length) {
                stackIn_7_0 = -this.field_c[0].field_a + this.field_c[-1 + this.field_c.length].field_f;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0;
    }

    final static void a(int param0) {
        if (!(vh.field_B == null)) {
            vh.field_B.b();
        }
        if (null != fc.field_k) {
            fc.field_k.b();
        }
        if (param0 != -11449) {
            aa.c(26);
        }
    }

    final int a(boolean param0) {
        int var2;
        be[] var3;
        int var4;
        be var5;
        int var7;
        int var6;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0) {
          L0: {
            var2 = -1;
            if (this.field_c != null) {
              var3 = this.field_c;
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a(-1);
                    if (var6 > var2) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return -117;
        }
    }

    final int a(int param0, int param1, int param2) {
        be var6 = null;
        int var7 = 0;
        int var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_c == null || this.field_c.length == 0 || this.field_c[0].field_a > param1) {
            return -1;
        }
        if (this.field_c[this.field_c.length + -1].field_f < param1) {
            return -1;
        }
        if ((this.field_c.length ^ -1) == -2) {
            return this.field_c[0].a(0, param0);
        }
        int var4 = 0;
        int var5 = 0;
        if (param2 > -100) {
            aa.a(-27);
        }
        while (var5 < this.field_c.length) {
            var6 = this.field_c[var5];
            if (var6.field_a <= param1) {
                if (!(param1 > var6.field_f)) {
                    var7 = var6.a(0, param0);
                    if ((var7 ^ -1) == 0) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (-1 + var6.field_c.length);
            var5++;
        }
        return -1;
    }

    static {
        field_b = new ib();
    }
}
