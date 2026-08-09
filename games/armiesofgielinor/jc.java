/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends mn {
    private int field_y;
    static String[] field_v;
    static String field_x;
    static um field_B;
    private int field_A;
    static String field_w;
    private int field_z;

    final static String a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = new char[var2_int];
              if (param1 == 42) {
                break L1;
              } else {
                field_w = (String) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_10_0 = new String(var3);
                break L0;
              } else {
                L3: {
                  var5 = param0.charAt(var4);
                  if (-1 == (var4 ^ -1)) {
                    var5 = hc.a(98, (char) var5);
                    break L3;
                  } else {
                    var5 = Character.toLowerCase((char) var5);
                    break L3;
                  }
                }
                var3[var4] = (char)var5;
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("jc.E(");

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
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final static b b(int param0, int param1) {
        b var2;
        if (param0 != -1) {
          field_w = (String) null;
          var2 = new b();
          ta.field_O.a((byte) -119, (tc) (var2));
          a.a(param1, (byte) -32);
          return var2;
        } else {
          var2 = new b();
          ta.field_O.a((byte) -119, (tc) (var2));
          a.a(param1, (byte) -32);
          return var2;
        }
    }

    private final String a(String[] param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              stackIn_4_0 = this.a(125, param0, "deploy");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jc.F(");

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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_x = null;
        field_B = null;
        int var1 = 117 % ((-27 - param0) / 51);
        field_v = null;
        field_w = null;
    }

    jc(int param0, int param1, int param2, int param3) {
        this.field_p = param0;
        this.field_A = param1;
        this.field_y = param3;
        this.field_z = param2;
    }

    final bd a(int param0, ha param1) {
        String discarded$6 = null;
        String discarded$7 = null;
        String discarded$8 = null;
        String discarded$9 = null;
        String discarded$10 = null;
        String discarded$11 = null;
        RuntimeException var3 = null;
        ne var4 = null;
        jd var5 = null;
        jd var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_19_0 = null;
        bd stackIn_22_0 = null;
        pl stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.d(96);
            var5 = param1.c(this.field_z, true, this.field_A);
            var6 = var5;
            if (var6 != null) {
              if (this.field_p == var6.field_O) {
                if (!var6.field_s) {
                  if (0 < (bw.field_m[var5.field_N][10] & 1024)) {
                    L1: {
                      var4 = param1.field_Eb[var6.field_J - -(var6.field_w * param1.field_v)];
                      if (34 != var6.field_N) {
                        break L1;
                      } else {
                        if (var4.f(19725)) {
                          break L1;
                        } else {
                          discarded$6 = this.a(new String[]{"can't deploy on top of structure at ", ci.c(this.field_A, 0, this.field_z)}, false);
                          stackIn_15_0 = null;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    L2: {
                      if ((var6.field_N ^ -1) != -8) {
                        break L2;
                      } else {
                        if (var4.field_h == 0) {
                          break L2;
                        } else {
                          discarded$7 = this.a(new String[]{"can't deploy on top of structure at ", ci.c(this.field_A, 0, this.field_z)}, false);
                          stackIn_19_0 = null;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                    }
                    if (param0 > 31) {
                      stackIn_24_0 = new pl(this.field_p, var6, this.field_y);
                      decompiledRegionSelector0 = 7;
                      break L0;
                    } else {
                      stackIn_22_0 = (bd) null;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    }
                  } else {
                    discarded$8 = this.a(new String[]{"unit at ", ci.c(this.field_A, 0, this.field_z), " cannot deploy"}, false);
                    stackIn_11_0 = null;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  discarded$9 = this.a(new String[]{"unit at ", ci.c(this.field_A, 0, this.field_z), " has moved"}, false);
                  stackIn_8_0 = null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                discarded$10 = this.a(new String[]{"unit at ", ci.c(this.field_A, 0, this.field_z), "not owned by player ", "" + this.field_p}, false);
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              discarded$11 = this.a(new String[]{"no unit at ", ci.c(this.field_A, 0, this.field_z)}, false);
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("jc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L3;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bd) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bd) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (bd) ((Object) stackIn_8_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (bd) ((Object) stackIn_11_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (bd) ((Object) stackIn_15_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (bd) ((Object) stackIn_19_0);
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_22_0;
                    } else {
                      return (bd) ((Object) stackIn_24_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_w = "Send private Quick Chat to <%0>";
        field_x = "Warning! All your portals are blocked and you haven't moved a unit recently. You have <%0> turns until you fail the mission.";
    }
}
