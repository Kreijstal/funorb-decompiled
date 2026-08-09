/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends gg implements nk {
    static String field_j;
    static int field_l;
    static String field_k;
    private c field_m;

    public final void a(int param0, c param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -31825) {
                break L1;
              } else {
                this.b((byte) 39);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("r.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(dd param0, int param1) {
        try {
            we.a(-68);
            if (param1 != 45) {
                field_l = 45;
            }
            gb.a(param0.field_B, param0.field_x, param0.field_r);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "r.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_j = null;
        if (param0 != 0) {
            dd var2 = (dd) null;
            r.a((dd) null, -96);
        }
    }

    public final void b(int param0, c param1) {
        try {
            if (param0 != 40) {
                c var4 = (c) null;
                this.b(-35, (c) null);
            }
            this.a(param0 ^ -1323);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "r.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final wd a(byte param0) {
        if (param0 != -8) {
          field_k = (String) null;
          return this.a(160, this.field_m.field_i);
        } else {
          return this.a(160, this.field_m.field_i);
        }
    }

    final String b(byte param0) {
        if (param0 <= 62) {
          field_l = -35;
          return this.a((byte) 109, this.field_m.field_i);
        } else {
          return this.a((byte) 109, this.field_m.field_i);
        }
    }

    final static kc a(boolean param0, long param1, byte param2, String param3, String param4) {
        RuntimeException var6 = null;
        dd var7 = null;
        rg stackIn_5_0 = null;
        rj stackIn_7_0 = null;
        ef stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 != 0L) {
                break L1;
              } else {
                if (param3 != null) {
                  stackIn_7_0 = new rj(param3, param4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param0) {
              L2: {
                if (param2 == 84) {
                  break L2;
                } else {
                  var7 = (dd) null;
                  r.a((dd) null, -52);
                  break L2;
                }
              }
              stackIn_11_0 = new ef(param1, param4);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_5_0 = new rg(param1, param4);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("r.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kc) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (kc) ((Object) stackIn_7_0);
          } else {
            return (kc) ((Object) stackIn_11_0);
          }
        }
    }

    abstract wd a(int param0, String param1);

    public final boolean b(boolean param0) {
        int stackIn_5_0 = 0;
        if (param0) {
          if (null != this.field_m.field_i) {
            if (this.field_m.field_i.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_5_0 = 1;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    abstract String a(byte param0, String param1);

    r(c param0) {
        try {
            this.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "r.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        int var2;
        int stackIn_7_0 = 0;
        var2 = 45 / ((7 - param1) / 50);
        if (param0 != 160) {
          if (param0 != 32) {
            if (param0 != 95) {
              if (param0 == 45) {
                return true;
              } else {
                return false;
              }
            } else {
              stackIn_7_0 = 1;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        field_j = "This game has been updated! Please reload this page.";
        field_k = "Continue";
    }
}
