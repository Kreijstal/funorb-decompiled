/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    int field_a;
    boolean field_b;
    int field_d;
    static long field_c;

    final static void a(hc param0, int param1, int param2, hc param3) {
        nh.field_c = param0;
        qk.field_g = param1;
        pk.field_e = param3;
        mb.a(vp.field_c / 2, vp.field_i / 2, (byte) 74);
        if (param2 != 24097) {
            return;
        }
        try {
            hh.a(param3.field_C - -param3.field_D, param0.field_D + param0.field_C, -79, param3.field_C, param0.field_C);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "sn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(vu param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = 1;
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
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("sn.D(");

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
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_20_0 = 0;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if ((var6_int ^ -1) <= -1) {
                var5 = var6_int + 2;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3_int) {
                      break L3;
                    } else {
                      if (!oj.a(param0.charAt(var5), (byte) -45)) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(2 + var6_int, var5);
                  if (vl.a(10, (CharSequence) ((Object) var7_ref_String))) {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (62 == param0.charAt(var5)) {
                        var5++;
                        var8 = td.a((CharSequence) ((Object) var7_ref_String), (byte) 38);
                        var4 = var4 + (param2[var8].length() + var6_int + -var5);
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                L4: {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  var7 = 0;
                  if (param1 > 104) {
                    break L4;
                  } else {
                    field_c = 115L;
                    break L4;
                  }
                }
                L5: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (0 <= var8) {
                    stackIn_20_0 = 2 + var8;
                    var5 = stackIn_20_0;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          if (!oj.a(param0.charAt(var5), (byte) -116)) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param0.substring(var8 - -2, var5);
                      if (!vl.a(10, (CharSequence) ((Object) var9))) {
                        continue L5;
                      } else {
                        if ((var5 ^ -1) <= (var3_int ^ -1)) {
                          continue L5;
                        } else {
                          if (param0.charAt(var5) == 62) {
                            var5++;
                            var10 = td.a((CharSequence) ((Object) var9), (byte) 38);
                            discarded$0 = var6.append(param0.substring(var7, var8));
                            var7 = var5;
                            discarded$1 = var6.append(param2[var10]);
                            continue L5;
                          } else {
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param0.substring(var7));
                    stackIn_30_0 = var6.toString();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("sn.C(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L9;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_34_0), stackIn_37_2 + ')');
        }
        return stackIn_30_0;
    }

    public final String toString() {
        return super.toString();
    }

    final boolean a(byte param0, sn param1) {
        RuntimeException var3 = null;
        vu var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -73) {
                break L1;
              } else {
                var4 = (vu) null;
                this.a((vu) null, 115);
                break L1;
              }
            }
            L2: {
              if (this.field_d != param1.field_d) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("sn.B(").append(param0).append(',');

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
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    sn(int param0, int param1) {
        this.field_b = true;
        this.field_d = param0;
        this.field_a = param1;
    }

    static {
    }
}
