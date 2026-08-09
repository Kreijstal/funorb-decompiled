/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    private bh field_d;
    private vj field_b;
    static boolean[] field_c;
    static w field_e;
    static w field_a;

    final static w b(int param0) {
        if (param0 > -26) {
            rd.a((byte) -21, 73, 124);
            return df.i(119);
        }
        return df.i(119);
    }

    final bh a(bh param0, boolean param1) {
        bh var3 = null;
        RuntimeException var3_ref = null;
        bh stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        bh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    var3 = param0;
                    if (!client.field_A) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = this.field_b.field_c.field_b;
                break L1;
              }
              if (var3 == this.field_b.field_c) {
                this.field_d = null;
                stackIn_9_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_d = var3.field_b;
                stackIn_11_0 = (bh) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (bh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("rd.J(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bh) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -119) {
            field_c = (boolean[]) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final bh a(int param0) {
        bh var2 = this.field_d;
        if (param0 >= -40) {
            field_c = (boolean[]) null;
            if (!(this.field_b.field_c != var2)) {
                this.field_d = null;
                return null;
            }
            this.field_d = var2.field_b;
            return var2;
        }
        if (!(this.field_b.field_c != var2)) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.field_b;
        return var2;
    }

    final static int a(String param0, int param1, String param2, String param3, int param4, int param5, boolean param6) {
        jg var7 = null;
        RuntimeException var7_ref = null;
        jg var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = new jg(param3);
            if (param4 == 0) {
              var8 = new jg(param2);
              stackIn_4_0 = qb.a(param6, param1, var7, -109, param5, var8, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -75;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7_ref);

            stackIn_7_1 = new StringBuilder().append("rd.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final bh a(boolean param0) {
        bh var2 = this.field_b.field_c.field_a;
        if (!param0) {
            String var3 = (String) null;
            rd.a((String) null, 14, (String) null, (String) null, -52, 96, false);
            if (!(var2 != this.field_b.field_c)) {
                this.field_d = null;
                return null;
            }
            this.field_d = var2.field_a;
            return var2;
        }
        if (!(var2 != this.field_b.field_c)) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.field_a;
        return var2;
    }

    final bh a(bh param0, byte param1) {
        bh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        bh stackIn_8_0 = null;
        bh stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  var3 = param0;
                  if (!client.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = this.field_b.field_c.field_a;
              break L1;
            }
            if (this.field_b.field_c != var3) {
              this.field_d = var3.field_a;
              if (param1 == -88) {
                stackIn_10_0 = (bh) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = (bh) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_d = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("rd.K(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bh) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    rd(vj param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final bh d(int param0) {
        bh var2;
        var2 = this.field_d;
        if (var2 == this.field_b.field_c) {
          this.field_d = null;
          return null;
        } else {
          if (param0 != 2078965185) {
            rd.b(-96);
            this.field_d = var2.field_a;
            return var2;
          } else {
            this.field_d = var2.field_a;
            return var2;
          }
        }
    }

    final bh a(byte param0) {
        bh var2;
        String var3;
        var2 = this.field_b.field_c.field_b;
        if (param0 == 71) {
          if (var2 == this.field_b.field_c) {
            this.field_d = null;
            return null;
          } else {
            this.field_d = var2.field_b;
            return var2;
          }
        } else {
          var3 = (String) null;
          rd.a((String) null, -87, (String) null, (String) null, -5, -114, false);
          if (var2 == this.field_b.field_c) {
            this.field_d = null;
            return null;
          } else {
            this.field_d = var2.field_b;
            return var2;
          }
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                rd.c(-42);
                break L1;
              }
            }
            L2: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L2;
              } else {
                var3 = (CharSequence) ((Object) var2);
                if ((ab.a(120, var3) ^ -1L) != -1L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("rd.H(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 16) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        rd.b(15);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0 >= param1) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = var3_int << 2078965185 | param2 & 1;
                        stackIn_8_0 = param2 >>> 1;
                        stackIn_6_0 = stackIn_8_0;
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param2 = stackIn_6_0;
                        param1--;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = var3_int;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var3), "rd.G(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -27454) {
              stackIn_4_0 = ug.a(param0, false, 100);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("rd.I(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void c(int param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = a.field_r;
                        var1 = var5;
                        var2 = param0;
                        var3 = var5.length;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 >= var3) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$8 = var2;
                        var2++;
                        var5[incrementValue$8] = 0;
                        incrementValue$9 = var2;
                        var2++;
                        var5[incrementValue$9] = 0;
                        incrementValue$10 = var2;
                        var2++;
                        var5[incrementValue$10] = 0;
                        incrementValue$11 = var2;
                        var2++;
                        var5[incrementValue$11] = 0;
                        incrementValue$12 = var2;
                        var2++;
                        var5[incrementValue$12] = 0;
                        incrementValue$13 = var2;
                        var2++;
                        var5[incrementValue$13] = 0;
                        incrementValue$14 = var2;
                        var2++;
                        var5[incrementValue$14] = 0;
                        incrementValue$15 = var2;
                        var2++;
                        var5[incrementValue$15] = 0;
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1_ref), "rd.M(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
