/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rg extends ma {
    long field_m;
    static di field_r;
    static String field_l;
    static String field_t;
    rg field_q;
    static boolean field_s;
    rg field_n;
    static boolean field_p;
    static String field_o;
    static boolean field_v;
    static int field_u;

    final long a(int param0) {
        int var2 = -37 / ((-49 - param0) / 48);
        return this.field_m;
    }

    final void a(long param0, int param1) {
        if (param1 != 45) {
            field_o = (String) null;
        }
        if (null != this.field_n) {
            throw new RuntimeException();
        }
        this.field_m = param0;
    }

    public static void c(int param0) {
        field_o = null;
        field_l = null;
        field_r = null;
        if (param0 != -3604) {
            lr var2 = (lr) null;
            rg.a(-30, (String[]) null, (String) null, (lr) null, -45);
        }
        field_t = null;
    }

    final boolean d(int param0) {
        if (null == this.field_n) {
            return false;
        }
        if (param0 < 31) {
            return false;
        }
        return true;
    }

    protected rg() {
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 > -107) {
            rg.a(-20, 53, 78, true, 78, 37, 85);
        }
        return il.a(1, 1, param4, 3, 4, 1, param0, param3, param1);
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        if (!(null != this.field_n)) {
            return;
        }
        this.field_n.field_q = this.field_q;
        this.field_q.field_n = this.field_n;
        this.field_q = null;
        this.field_n = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var7 = null;
        if (param4 != 4010) {
            rg.a(33, -109, 29, false, 1, 26, 48);
        }
        if (hn.field_b != 2) {
            var7 = vd.field_f;
        } else {
            var7 = wb.field_f;
        }
        la.a(-57, param1, param2, param5, var7, param3, param0, param6);
    }

    final static int a(int param0, String[] param1, String param2, lr param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
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
        var13 = Pool.field_O;
        try {
          L0: {
            L1: {
              var5_int = param3.b(param2);
              if (param0 < var5_int) {
                break L1;
              } else {
                if (param2.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param1[0] = param2;
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (-1 + var5_int + param0) / param0;
            param0 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param2.length();
            var9 = param4;
            L2: while (true) {
              if (var9 >= var8) {
                L3: {
                  if (var8 > var7) {
                    incrementValue$0 = var6;
                    var6++;
                    param1[incrementValue$0] = param2.substring(var7, var8).trim();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_24_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  L5: {
                    var10 = param2.charAt(var9);
                    if (32 == var10) {
                      break L5;
                    } else {
                      if (45 != var10) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param2.substring(var7, var9 - -1).trim();
                  var12 = param3.b(var11);
                  if (param0 > var12) {
                    break L4;
                  } else {
                    var7 = var9 - -1;
                    incrementValue$1 = var6;
                    var6++;
                    param1[incrementValue$1] = var11;
                    break L4;
                  }
                }
                if (62 == var10) {
                  L6: {
                    if (param2.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param1[incrementValue$2] = param2.substring(var7, -3 + var9).trim();
                      var7 = var9 - -1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var9++;
                  continue L2;
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("rg.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), stackIn_34_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_24_0;
        }
    }

    static {
        field_l = "Out of lives.";
        field_t = "Open table";
        field_p = true;
        field_s = true;
        field_o = "<%0> and <%1> want to draw.";
    }
}
