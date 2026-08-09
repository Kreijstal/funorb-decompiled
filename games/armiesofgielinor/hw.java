/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw extends mn {
    static String field_z;
    static String field_x;
    private int field_A;
    static int field_B;
    private int field_E;
    static String field_C;
    private int field_v;
    static String field_y;
    static String field_w;
    static String field_D;

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                hw.a((byte) 111);
                break L1;
              }
            }
            stackIn_3_0 = nk.a(false, param0, (byte) -95);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("hw.J(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final String a(String[] param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -50) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(119, param0, "summon");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hw.I(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, byte param1) {
        if (param1 >= -74) {
            field_w = (String) null;
        }
        if (tb.field_e != null) {
            tb.field_e.b(param0, 20);
        }
    }

    public static void a(byte param0) {
        field_y = null;
        if (param0 >= -42) {
            CharSequence var2 = (CharSequence) null;
            hw.a((CharSequence) null, true);
        }
        field_z = null;
        field_D = null;
        field_x = null;
        field_w = null;
        field_C = null;
    }

    final static String a(int param0, Class param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 640) {
                break L1;
              } else {
                hw.a(false, (byte) 44);
                break L1;
              }
            }
            if (param1.isArray()) {
              stackIn_6_0 = hw.a(param0 ^ 0, param1.getComponentType()) + "[]";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = param1.getName().substring(1 + param1.getName().lastIndexOf("."));
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("hw.K(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        wk var5 = null;
        int var6 = 0;
        wk var7 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -1;
              if (null == gv.field_a) {
                break L1;
              } else {
                if (param1 >= gv.field_a.length) {
                  break L1;
                } else {
                  L2: {
                    if (null == gv.field_a[param1]) {
                      break L2;
                    } else {
                      if (gv.field_a[param1].length <= param2) {
                        break L2;
                      } else {
                        L3: {
                          if (param0 == 29) {
                            break L3;
                          } else {
                            hw.a(false);
                            break L3;
                          }
                        }
                        var4 = 0;
                        L4: while (true) {
                          if (gv.field_a[param1][param2].length <= var4) {
                            if (-1 <= (var3_int ^ -1)) {
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var4 = 0;
                              L5: while (true) {
                                if (var4 >= gv.field_a[param1][param2].length) {
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  L6: {
                                    var5 = gv.field_a[param1][param2][var4];
                                    if (var5 != null) {
                                      if (var3_int <= var5.field_A) {
                                        break L6;
                                      } else {
                                        var5.field_w = -var5.field_A + var3_int >> -450827551;
                                        var5.field_A = var3_int;
                                        break L6;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                  var4++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            L7: {
                              var7 = gv.field_a[param1][param2][var4];
                              var5 = var7;
                              if (var7 != null) {
                                if (-1 >= (var7.field_A ^ -1)) {
                                  L8: {
                                    if (-1 < (var3_int ^ -1)) {
                                      break L8;
                                    } else {
                                      if (var7.field_A >= var3_int) {
                                        break L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var3_int = var7.field_A;
                                  break L7;
                                } else {
                                  var4++;
                                  continue L4;
                                }
                              } else {
                                break L7;
                              }
                            }
                            var4++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "hw.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final bd a(int param0, ha param1) {
        String discarded$0 = null;
        String discarded$1 = null;
        String discarded$2 = null;
        Object stackIn_20_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        be stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.d(-114);
              if (-75 != (this.field_v ^ -1)) {
                break L1;
              } else {
                if (param1.field_Bb) {
                  this.field_v = 4;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (-5 != (this.field_v ^ -1)) {
                break L2;
              } else {
                if (-3 != (param1.field_hb ^ -1)) {
                  break L2;
                } else {
                  this.field_v = 81;
                  break L2;
                }
              }
            }
            L3: {
              var3_int = bw.field_m[this.field_v][1];
              if (0 != (var3_int ^ -1)) {
                var4 = 0;
                var5 = param1.field_c[this.field_p];
                var6 = 0;
                L4: while (true) {
                  L5: {
                    if (var6 >= var5.length) {
                      break L5;
                    } else {
                      var7 = var5[var6];
                      if ((var7 ^ -1) == (var3_int ^ -1)) {
                        var4 = 1;
                        break L5;
                      } else {
                        var6++;
                        continue L4;
                      }
                    }
                  }
                  if (var4 == 0) {
                    discarded$0 = this.a(new String[]{"God not selected: ", Integer.toString(var3_int)}, (byte) -62);
                    stackIn_20_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L3;
                  }
                }
              } else {
                var3_int = 12;
                break L3;
              }
            }
            if (0 == (param1.c(this.field_E, -27300, this.field_A, this.field_p) & 1 << var3_int)) {
              discarded$1 = this.a(new String[]{"Can't summon followers of god: ", Integer.toString(var3_int), " at ", ci.c(this.field_E, 0, this.field_A)}, (byte) -111);
              stackIn_24_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (param1.b(this.field_A, -26813, this.field_v, this.field_E, this.field_p)) {
                L6: {
                  if (param0 >= 31) {
                    break L6;
                  } else {
                    field_y = (String) null;
                    break L6;
                  }
                }
                var4 = param1.a(bw.field_m[this.field_v][1], this.field_A, this.field_E, 0, this.field_p, bw.field_m[this.field_v][2]);
                stackIn_31_0 = new be(this.field_E, this.field_A, this.field_v, var4, this.field_p);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                discarded$2 = this.a(new String[]{"Can't afford creature type: ", Integer.toString(this.field_v), " at ", ci.c(this.field_E, 0, this.field_A)}, (byte) -87);
                stackIn_27_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("hw.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L7;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bd) ((Object) stackIn_20_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bd) ((Object) stackIn_24_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (bd) ((Object) stackIn_27_0);
            } else {
              return (bd) ((Object) stackIn_31_0);
            }
          }
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
            field_B = -104;
        }
        return -co.field_f + bm.field_h;
    }

    final static void a(byte param0, int[] param1, int param2) {
        try {
            kr.field_y[param2] = param1;
            rq.field_p[param2] = new ci(param2);
            if (param0 <= 17) {
                field_B = -14;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hw.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    hw(int param0, int param1, int param2, int param3) {
        this.field_v = param3;
        this.field_E = param1;
        this.field_p = param0;
        this.field_A = param2;
    }

    static {
        field_z = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_x = "Plate";
        field_C = "Only show private chat from my friends and opponents";
        field_w = "This coat of arms will be unlocked at <%0>. After collecting <%1> more, you may use any of the parts from it in your own coat of arms.";
        field_y = "You cannot join this game - it is in progress";
        field_D = "Your captured buildings will produce a bonus amount of mana per turn.";
    }
}
