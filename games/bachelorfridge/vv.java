/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vv {
    static mfa field_e;
    static String field_b;
    static int field_d;
    mla[] field_a;
    static kv[] field_c;

    final int b(byte param0) {
        int var2;
        mla[] var3;
        int var4;
        mla var5;
        int var7;
        int var6;
        L0: {
          var7 = BachelorFridge.field_y;
          if (param0 > 122) {
            break L0;
          } else {
            this.a(23, -13, 83);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (this.field_a != null) {
            var3 = this.field_a;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(0);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final static int[] a(byte param0) {
        if (param0 <= 101) {
            field_c = (kv[]) null;
        }
        return new int[8];
    }

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 != 0) {
            vv.b(-114);
        }
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        mla var5 = null;
        int var6 = BachelorFridge.field_y;
        if (param1 != -99) {
            field_d = -66;
        }
        mla[] var7 = this.field_a;
        mla[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(param0 >= var5.field_a.length)) {
                return var5.field_a[param0];
            }
            param0 = param0 - (var5.field_a.length - 1);
        }
        return 0;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                if ((var5_int ^ -1) < param0) {
                  stackIn_18_0 = (-param2 + param3 << -630724280) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L2: {
                  var9 = param1.charAt(var8);
                  if (-61 != (var9 ^ -1)) {
                    if (var9 == 62) {
                      var6 = 0;
                      break L2;
                    } else {
                      if (var6 == 0) {
                        if (32 == var9) {
                          var5_int++;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    }
                  } else {
                    var6 = 1;
                    break L2;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("vv.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          return stackIn_20_0;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        mla var4 = null;
        int var5 = BachelorFridge.field_y;
        if (param0 <= 53) {
            return 116;
        }
        for (var3 = 0; var3 < this.field_a.length; var3++) {
            var4 = this.field_a[var3];
            if (param1 < var4.field_a.length) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_a.length);
        }
        return this.field_a.length;
    }

    final int a(boolean param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            this.a(42, (byte) 79);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_a) {
              break L2;
            } else {
              if ((this.field_a.length ^ -1) < -1) {
                stackIn_7_0 = -this.field_a[0].field_c + this.field_a[-1 + this.field_a.length].field_d;
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

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        mla var6 = null;
        int var7 = 0;
        int var8 = BachelorFridge.field_y;
        if (param0 != -14017) {
            field_b = (String) null;
        }
        if (null == this.field_a || -1 == (this.field_a.length ^ -1) || this.field_a[0].field_c > param1) {
            return -1;
        }
        if (!(this.field_a[-1 + this.field_a.length].field_d >= param1)) {
            return -1;
        }
        if (this.field_a.length == 1) {
            return this.field_a[0].a(param2, 0);
        }
        int var4 = 0;
        for (var5 = 0; this.field_a.length > var5; var5++) {
            var6 = this.field_a[var5];
            if (param1 >= var6.field_c) {
                if (!(var6.field_d < param1)) {
                    var7 = var6.a(param2, 0);
                    if (!(-1 != var7)) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (var6.field_a.length + -1);
        }
        return -1;
    }

    final static sna a(int param0) {
        if (param0 != 31185) {
            return (sna) null;
        }
        return qca.e(param0 + -117517072);
    }

    static {
        field_e = new mfa();
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
