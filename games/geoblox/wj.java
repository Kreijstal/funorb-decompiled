/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends sh {
    static String field_C;
    static String field_B;
    int field_D;
    static rh field_F;
    static boolean[] field_G;
    static String field_E;

    public wj() {
        super(0, 0, 0, 0, (dh) null, (bb) null);
        this.field_D = 256;
    }

    final static boolean f(int param0) {
        if (param0 != 7426) {
            field_E = (String) null;
        }
        return 250 < gb.field_f ? true : false;
    }

    wj(el param0) {
        super(param0.field_v, param0.field_m, param0.field_r, param0.field_h, (dh) null, (bb) null);
        try {
            param0.a(this.field_h, this.field_r, (byte) -113, 0, 0);
            this.field_D = 256;
            this.field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_12_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (0 > var6_int) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                if (param2 < -12) {
                  L2: while (true) {
                    var8 = param0.indexOf("<%", var5);
                    if (0 <= var8) {
                      var5 = var8 - -2;
                      L3: while (true) {
                        L4: {
                          if (var5 >= var3_int) {
                            break L4;
                          } else {
                            if (!rc.a(-58, param0.charAt(var5))) {
                              break L4;
                            } else {
                              var5++;
                              continue L3;
                            }
                          }
                        }
                        var9 = param0.substring(2 + var8, var5);
                        if (f.b((byte) -125, (CharSequence) ((Object) var9))) {
                          if (var3_int <= var5) {
                            continue L2;
                          } else {
                            if (param0.charAt(var5) != 62) {
                              continue L2;
                            } else {
                              var5++;
                              var10 = ol.a(false, (CharSequence) ((Object) var9));
                              discarded$0 = var6.append(param0.substring(var7, var8));
                              var7 = var5;
                              discarded$1 = var6.append(param1[var10]);
                              continue L2;
                            }
                          }
                        } else {
                          continue L2;
                        }
                      }
                    } else {
                      discarded$2 = var6.append(param0.substring(var7));
                      stackIn_25_0 = var6.toString();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  stackIn_12_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var5 = var6_int + 2;
                L5: while (true) {
                  L6: {
                    if (var3_int <= var5) {
                      break L6;
                    } else {
                      if (!rc.a(-58, param0.charAt(var5))) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int + 2, var5);
                  if (!f.b((byte) -123, (CharSequence) ((Object) var7_ref_String))) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = ol.a(false, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (-var5 + (var6_int + param1[var8].length()));
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("wj.E(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_25_0;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 16 % ((param2 - 1) / 43);
        if (!(param3 == 0)) {
            return;
        }
        if (null == this.field_A) {
            return;
        }
        if (this.field_D == 0) {
            return;
        }
        if ((this.field_D ^ -1) == -257) {
            this.field_A.a(param0 - -this.field_v, param1 - -this.field_m, (byte) 83, param3);
            return;
        }
        dm var6 = new dm(this.field_A.field_r, this.field_A.field_h);
        Geoblox.a(1, var6);
        this.field_A.a(0, 0, (byte) -115, param3);
        id.a(true);
        var6.d(this.field_v + param0, this.field_m + param1, this.field_D);
    }

    public static void f(byte param0) {
        field_G = null;
        field_B = null;
        field_C = null;
        if (param0 != -60) {
            return;
        }
        field_F = null;
        field_E = null;
    }

    final static void a(d param0, byte param1, Object param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.field_C;
        try {
          L0: {
            if (param0.field_q == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (null == param0.field_q.peekEvent()) {
                      break L2;
                    } else {
                      bc.a(0, 1L);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                var4 = 11 / ((param1 - 2) / 48);
                try {
                  L3: {
                    L4: {
                      if (param2 != null) {
                        param0.field_q.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("wj.G(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static dm[] a(String param0, String param1, rh param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dm[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.a((byte) 126, param1);
              var5 = param2.a(param0, -114, var4_int);
              if (param3 == 0) {
                break L1;
              } else {
                field_G = (boolean[]) null;
                break L1;
              }
            }
            stackIn_3_0 = ll.a(var4_int, (byte) -81, var5, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("wj.C(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_B = "Please check if address is correct";
        field_C = "to keep fullscreen or";
        field_G = new boolean[64];
        field_E = "Player Name: ";
    }
}
