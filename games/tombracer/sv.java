/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sv extends wv {
    static String field_q;
    private dea field_r;

    final static String a(byte param0, long param1) {
        StringBuilder discarded$0 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var11;
        int var10;
        var11 = TombRacer.field_G ? 1 : 0;
        if (-1L > (param1 ^ -1L)) {
          if ((param1 ^ -1L) > -6582952005840035282L) {
            if (-1L != (param1 % 37L ^ -1L)) {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if ((var4 ^ -1L) == -1L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (0L == param1) {
                      if (param0 != -38) {
                        field_q = (String) null;
                        var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      } else {
                        var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      }
                    } else {
                      L2: {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = fra.field_n[(int)(-(37L * param1) + var7)];
                        if (95 == var9) {
                          var10 = var6.length() + -1;
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      discarded$0 = var6.append((char) var9);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(byte param0, int param1) {
        if (0 == param1) {
            return 0;
        }
        if (param0 < 111) {
            this.g(19, -86);
            if (!(param1 != -1 + this.field_m.length)) {
                return aaa.a(false) - this.field_m[param1].e(-163);
            }
            if (!(param1 >= 3)) {
                return 30 + (20 + aaa.a(false) / 2) - this.field_m[param1].e(-163);
            }
            return aaa.a(false) / 2 + 30;
        }
        if (!(param1 != -1 + this.field_m.length)) {
            return aaa.a(false) - this.field_m[param1].e(-163);
        }
        if (!(param1 >= 3)) {
            return 30 + (20 + aaa.a(false) / 2) - this.field_m[param1].e(-163);
        }
        return aaa.a(false) / 2 + 30;
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        this.field_r.c(param0 ^ -87);
    }

    final void a(byte param0, boolean param1) {
        super.a(param0, param1);
        int var3 = this.field_m[1].field_i + -70 + this.field_r.e(47) + -150;
        tp.field_K.a((aaa.a(false) >> 497193505) - (tp.field_K.a() >> -248090687), var3);
    }

    public static void d(int param0) {
        field_q = null;
        if (param0 > -42) {
            field_q = (String) null;
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          this.g(-74, 3);
          return this.a((byte) 116, param0) + this.field_m[param0].e(-163);
        } else {
          return this.a((byte) 116, param0) + this.field_m[param0].e(-163);
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, param2);
        this.field_r.a((byte) -111, param0, !param1 ? true : false);
    }

    final boolean a(int param0, char param1, int param2) {
        if ((param0 ^ -1) != -14) {
          if (param2 != 1) {
            this.field_r = (dea) null;
            return super.a(param0, param1, 1);
          } else {
            return super.a(param0, param1, 1);
          }
        } else {
          return true;
        }
    }

    final int g(int param0, int param1) {
        int var3;
        if (-1 != (param0 ^ -1)) {
          if (param0 != this.field_m.length - 1) {
            if (3 > param0) {
              var3 = 20;
              return var3 + (this.field_n - -((param0 + -1) * this.field_m[param0].d(11919)) + -this.field_m[0].d(11919));
            } else {
              if (param1 != 30) {
                field_q = (String) null;
                return this.field_n + ((param0 - 3) * this.field_i + -this.field_m[param0].d(11919));
              } else {
                return this.field_n + ((param0 - 3) * this.field_i + -this.field_m[param0].d(11919));
              }
            }
          } else {
            var3 = 60;
            param0 = -1 + this.field_m.length;
            return -var3 + this.field_n - (-(param0 * this.field_i) + this.field_m[param0].d(11919));
          }
        } else {
          var3 = 60;
          param0 = -1 + this.field_m.length;
          return -var3 + this.field_n - (-(param0 * this.field_i) + this.field_m[param0].d(11919));
        }
    }

    final static kg a(cn param0, int param1, cn param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        kg stackIn_5_0 = null;
        kg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (jna.a(false, param4, param1, param2)) {
              if (param3 == 24876) {
                stackIn_7_0 = ci.a(param0.a(false, param1, param4), (byte) -123);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (kg) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("sv.CA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kg) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    sv(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_r = new dea();
    }

    static {
        field_q = "Reject";
    }
}
