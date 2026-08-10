/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ki extends rc implements oh {
    static int field_C;
    static String field_A;
    nc field_B;

    private final void c(boolean param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ck var2 = new ck(this.field_B);
        if (!param0) {
            ki.d(false);
        }
        rc var3 = (rc) ((Object) var2.a((byte) 114));
        while (var3 != null) {
            var3.d(1);
            var3 = (rc) ((Object) var2.c(124));
        }
    }

    final int f(int param0) {
        int var6 = 0;
        int var7 = SolKnight.field_L ? 1 : 0;
        int var2 = 0;
        ck var3 = new ck(this.field_B);
        rc var4 = (rc) ((Object) var3.a((byte) -59));
        int var5 = 21 / ((param0 - 17) / 43);
        while (var4 != null) {
            var6 = var4.f(74);
            if (!(var2 >= var6)) {
                var2 = var6;
            }
            var4 = (rc) ((Object) var3.c(116));
        }
        return var2;
    }

    ki(int param0, int param1, int param2, int param3, j param4) {
        super(param0, param1, param2, param3, param4, (dg) null);
        this.field_B = new nc();
    }

    final void a(rc param0, int param1) {
        try {
            if (param1 != 5411) {
                Hashtable var4 = (Hashtable) null;
                this.a(24, 112, (StringBuilder) null, (Hashtable) null);
            }
            this.field_B.a(param0, -7044);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ki.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != -1) {
                field_A = (String) null;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(kk.a(param1 ^ -89, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od[] a(int param0, da param1, int param2, int param3) {
        RuntimeException var4 = null;
        java.applet.Applet var5 = null;
        od[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (l.a(87, param2, param3, param1)) {
              L1: {
                if (param0 == 10) {
                  break L1;
                } else {
                  var5 = (java.applet.Applet) null;
                  ki.a((java.applet.Applet) null, 57);
                  break L1;
                }
              }
              stackIn_6_0 = bl.b(false);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ki.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ck var5 = null;
        int var6 = 0;
        rc var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var6 = 26 / ((param1 - 39) / 59);
            var5 = new ck(this.field_B);
            var7 = (rc) ((Object) var5.a((byte) -99));
            L1: while (true) {
              if (var7 == null) {
                break L0;
              } else {
                discarded$3 = param2.append('\n');
                var8 = 0;
                L2: while (true) {
                  if (var8 > param0) {
                    var7.a(-81, param3, param2, param0 - -1);
                    var7 = (rc) ((Object) var5.c(115));
                    continue L1;
                  } else {
                    discarded$4 = param2.append(' ');
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5_ref);

            stackIn_10_1 = new StringBuilder().append("ki.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = SolKnight.field_L ? 1 : 0;
        if (-1 == (param1 ^ -1) && this.field_w != null) {
            this.field_w.a((byte) 116, param0, true, param2, (rc) (this));
        }
        if (param3 != 0) {
            return;
        }
        ck var5 = new ck(this.field_B);
        rc var6 = (rc) ((Object) var5.a(-25119));
        while (var6 != null) {
            var6.a(this.field_j + param0, param1, param2 - -this.field_m, 0);
            var6 = (rc) ((Object) var5.b(640));
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException var8 = null;
        rc var9 = null;
        int var10 = 0;
        ck var11 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var11 = new ck(this.field_B);
            var9 = (rc) ((Object) var11.a((byte) 125));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.a(false)) {
                    break L2;
                  } else {
                    if (!var9.a(param0, param1 - -this.field_m, false, param3, param4, param5 - -this.field_j, param6)) {
                      var9 = (rc) ((Object) var11.c(122));
                      continue L1;
                    } else {
                      stackIn_6_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              if (!param2) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.d((byte) 97);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("ki.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return null != this.d((byte) -48) ? true : false;
    }

    public static void d(boolean param0) {
        field_A = null;
        if (param0) {
            field_C = 53;
        }
    }

    final boolean b(int param0, rc param1) {
        RuntimeException var3 = null;
        rc var4 = null;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        ck var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_B.c(-1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 > 89) {
                  break L1;
                } else {
                  this.field_B = (nc) null;
                  break L1;
                }
              }
              var8 = new ck(this.field_B);
              var4 = (rc) ((Object) var8.a((byte) 112));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.b(true)) {
                      break L3;
                    } else {
                      var5 = new ck(this.field_B);
                      var5.a(26229, var4);
                      var6 = (rc) ((Object) var5.c(121));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(-1463, param1)) {
                            var6 = (rc) ((Object) var5.c(125));
                            continue L4;
                          } else {
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (rc) ((Object) var8.c(115));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ki.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        rc var8 = null;
        ck var9 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var9 = new ck(this.field_B);
            var8 = (rc) ((Object) var9.a((byte) 77));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.a(false)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.b(true)) {
                        break L3;
                      } else {
                        if (var8.a(param0, (byte) 88, param2, param3)) {
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var8 = (rc) ((Object) var9.c(115));
                    continue L1;
                  }
                }
              }
              var6 = param2;
              if (80 == var6) {
                L4: {
                  if (fh.field_d[81]) {
                    stackIn_15_0 = this.a((byte) -105, param3);
                    break L4;
                  } else {
                    stackIn_15_0 = this.b(112, param3);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = 9 / ((param1 - 31) / 56);
                stackIn_17_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("ki.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        rc var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param2, -1, param1, param3)) {
                this.b(param2, -111, param1, param3);
                this.a(param3, -31, param2, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 <= -41) {
                break L2;
              } else {
                var6 = (rc) null;
                this.a('￯', (byte) 103, -3, (rc) null);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ki.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        ck var7 = null;
        rc var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = new ck(this.field_B);
              if (param1 == 0) {
                break L1;
              } else {
                field_A = (String) null;
                break L1;
              }
            }
            var8 = (rc) ((Object) var7.a((byte) 93));
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.a(false)) {
                    break L3;
                  } else {
                    var8.a(param0, param1 + 0, param2, this.field_j + param3, param4, this.field_m + param5);
                    var8 = (rc) ((Object) var7.c(param1 ^ 127));
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("ki.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, rc param1, int param2, int param3, int param4, int param5, byte param6) {
        ck var8 = null;
        RuntimeException var8_ref = null;
        rc var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var8 = new ck(this.field_B);
            var9 = (rc) ((Object) var8.a((byte) 98));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.a(false)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.b(true)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, param2, param3, param4, param5, (byte) 50)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (rc) ((Object) var8.c(118));
                    continue L1;
                  }
                }
              }
              if (param6 > 33) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8_ref);

            stackIn_16_1 = new StringBuilder().append("ki.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final String c(byte param0) {
        ck var2;
        rc var3;
        String var4;
        int var5;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          var2 = new ck(this.field_B);
          if (param0 >= 14) {
            break L0;
          } else {
            this.c((byte) 48);
            break L0;
          }
        }
        var3 = (rc) ((Object) var2.a((byte) -122));
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 106);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (rc) ((Object) var2.c(117));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void g(int param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != 0) {
            rc var5 = (rc) null;
            this.a((byte) 3, (rc) null);
        }
        ck var2 = new ck(this.field_B);
        rc var3 = (rc) ((Object) var2.a((byte) 81));
        while (var3 != null) {
            var3.g(0);
            var3 = (rc) ((Object) var2.c(115));
        }
    }

    final boolean a(int param0, rc param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        rc var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3 = new ck(this.field_B);
            var4 = (rc) ((Object) var3.a((byte) 92));
            L1: while (true) {
              if (var4 == null) {
                if (param0 == -1463) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_B = (nc) null;
                  return false;
                }
              } else {
                if (!var4.a(-1463, param1)) {
                  var4 = (rc) ((Object) var3.c(121));
                  continue L1;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ki.MA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            if (param0 == -27129) {
              var5 = param3;
              L1: while (true) {
                if (param2 <= var5) {
                  var4_int = var4_int ^ -1;
                  stackIn_8_0 = var4_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4_int = var4_int >>> 2021887144 ^ og.field_g[255 & (param1[var5] ^ var4_int)];
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 75;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("ki.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static void a(int param0) {
        ne.field_g = te.field_N.h(92);
        if (param0 > -100) {
            return;
        }
        CharSequence var2 = (CharSequence) ((Object) ne.field_g);
        kf.field_D = jg.a(var2, -2);
    }

    void a(int param0, int param1, int param2, rc param3) {
        RuntimeException runtimeException = null;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new ck(this.field_B);
            var6 = (rc) ((Object) var5.a((byte) 117));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.a(false)) {
                    break L2;
                  } else {
                    var6.a(param0 + this.field_m, 18874, param2 + this.field_j, param3);
                    var6 = (rc) ((Object) var5.c(param1 ^ 18880));
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("ki.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean a(byte param0, rc param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        rc var4 = null;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_B.c(-1)) {
              var3 = new ck(this.field_B);
              if (param0 < -104) {
                var4 = (rc) ((Object) var3.a(-25119));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.b(true)) {
                        break L2;
                      } else {
                        var5 = new ck(this.field_B);
                        var5.a(var4, 118);
                        var6 = (rc) ((Object) var5.b(640));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(-1463, param1)) {
                              stackIn_15_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var6 = (rc) ((Object) var5.b(640));
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (rc) ((Object) var3.b(640));
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 0;
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
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("ki.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.c(true);
    }

    rc d(byte param0) {
        ck var2;
        rc var3;
        int var4;
        L0: {
          var4 = SolKnight.field_L ? 1 : 0;
          if (param0 == -48) {
            break L0;
          } else {
            this.field_B = (nc) null;
            break L0;
          }
        }
        var2 = new ck(this.field_B);
        var3 = (rc) ((Object) var2.a((byte) -119));
        L1: while (true) {
          if (var3 != null) {
            if (var3.b(true)) {
              return var3;
            } else {
              var3 = (rc) ((Object) var2.c(121));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    static {
        field_A = "members-only content";
    }
}
