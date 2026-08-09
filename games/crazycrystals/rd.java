/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rd extends oh {
    static boolean field_h;
    static ko field_i;
    static un field_g;
    static int field_f;

    final int a(int param0, int param1) {
        String var4;
        if (param0 != 1843275042) {
          var4 = (String) null;
          rd.a(false, (String) null);
          return q.field_a[ma.field_n[param1]].field_d;
        } else {
          return q.field_a[ma.field_n[param1]].field_d;
        }
    }

    final static jp a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        jp var7 = null;
        int var8 = 0;
        jp stackIn_3_0 = null;
        jp stackIn_8_0 = null;
        jp stackIn_12_0 = null;
        jp stackIn_17_0 = null;
        jp stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_h = false;
                  break L1;
                }
              }
              if ((var2_int ^ -1) >= -256) {
                var3 = ik.a(param1, (byte) -76, '.');
                if ((var3.length ^ -1) > -3) {
                  stackIn_12_0 = ma.field_m;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      stackIn_20_0 = uk.a((byte) 46, var3[var3.length + -1]);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = w.a((byte) -44, var6);
                      if (var7 == null) {
                        var5++;
                        continue L2;
                      } else {
                        stackIn_17_0 = (jp) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                stackIn_8_0 = hk.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = ma.field_m;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("rd.R(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
            field_f = -104;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final int a(byte param0, boolean param1) {
        if (param0 > -53) {
            return 1;
        }
        return 16;
    }

    rd() {
    }

    final static hm[] a(md param0, int param1) {
        hm[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        hm[] var4 = null;
        int var5 = 0;
        hm var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = param0.d((byte) -125, 8);
            if (0 >= var2_int) {
              var3 = param0.d((byte) -62, 12);
              var4 = new hm[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  L2: {
                    if (param1 <= -80) {
                      break L2;
                    } else {
                      field_i = (ko) null;
                      break L2;
                    }
                  }
                  stackIn_14_0 = (hm[]) (var4);
                  break L0;
                } else {
                  L3: {
                    if (fn.a(1, param0)) {
                      var6 = new hm();
                      param0.d((byte) -56, 24);
                      param0.d((byte) -103, 24);
                      var6.field_b = param0.d((byte) -95, 24);
                      param0.d((byte) -98, 9);
                      param0.d((byte) -114, 12);
                      param0.d((byte) -87, 12);
                      param0.d((byte) -70, 12);
                      var4[var5] = var6;
                      break L3;
                    } else {
                      var6_int = param0.d((byte) -61, bd.a(-1 + var5, (byte) 62));
                      var4[var5] = var4[var6_int];
                      break L3;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("rd.K(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_h = false;
    }
}
