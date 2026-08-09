/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static int[] field_d;
    private bc field_c;
    private bc field_e;
    static qr[] field_g;
    static int field_b;
    private ol field_f;
    static qr field_h;
    static int field_a;

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 0) {
            String[] var6 = (String[]) null;
            re.a((String) null, -43, (String[]) null);
        }
        return (int)((double)(-param0 + param3) * wm.a(param2, (byte) 114, param1)) + param0;
    }

    final static void a(java.awt.Canvas param0, boolean param1) {
        RuntimeException runtimeException = null;
        ib stackIn_5_0 = null;
        java.awt.Canvas stackIn_5_1 = null;
        ib stackIn_6_0 = null;
        java.awt.Canvas stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            pr.a((java.awt.Component) ((Object) param0), -9194);
            if (!param1) {
              L1: {
                wk.a((byte) -58, (java.awt.Component) ((Object) param0));
                if (aj.field_b == null) {
                  break L1;
                } else {
                  L2: {
                    stackIn_5_0 = aj.field_b;

                    stackIn_5_1 = (java.awt.Canvas) (param0);

                    if (param1) {
                      stackIn_6_0 = (ib) ((Object) stackIn_5_0);
                      stackIn_6_1 = (java.awt.Canvas) ((Object) stackIn_5_1);
                      stackIn_6_2 = 0;
                      break L2;
                    } else {
                      stackIn_6_0 = (ib) ((Object) stackIn_5_0);
                      stackIn_6_1 = (java.awt.Canvas) ((Object) stackIn_5_1);
                      stackIn_6_2 = 1;
                      break L2;
                    }
                  }
                  ((ib) (Object) stackIn_6_0).a((java.awt.Component) ((Object) stackIn_6_1), stackIn_6_2 != 0);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("re.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
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
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if ((var6_int ^ -1) > -1) {
                L2: {
                  if (param1 == 4371) {
                    break L2;
                  } else {
                    field_g = (qr[]) null;
                    break L2;
                  }
                }
                var6 = new StringBuilder(var4);
                var5 = 0;
                var7 = 0;
                L3: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (-1 >= (var8 ^ -1)) {
                    var5 = 2 + var8;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var5) {
                          break L5;
                        } else {
                          if (!dk.a((byte) 115, param0.charAt(var5))) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param0.substring(var8 - -2, var5);
                      if (go.a(0, (CharSequence) ((Object) var9))) {
                        if (var5 >= var3_int) {
                          continue L3;
                        } else {
                          if (param0.charAt(var5) == 62) {
                            var5++;
                            var10 = ma.a((CharSequence) ((Object) var9), 2);
                            discarded$0 = var6.append(param0.substring(var7, var8));
                            discarded$1 = var6.append(param2[var10]);
                            var7 = var5;
                            continue L3;
                          } else {
                            continue L3;
                          }
                        }
                      } else {
                        continue L3;
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param0.substring(var7));
                    stackIn_30_0 = var6.toString();
                    break L0;
                  }
                }
              } else {
                var5 = var6_int + 2;
                L6: while (true) {
                  L7: {
                    if (var5 >= var3_int) {
                      break L7;
                    } else {
                      if (!dk.a((byte) -83, param0.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(2 + var6_int, var5);
                  if (!go.a(0, (CharSequence) ((Object) var7_ref_String))) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = ma.a((CharSequence) ((Object) var7_ref_String), 2);
                        var4 = var4 + (param2[var8].length() - var5 + var6_int);
                        continue L1;
                      } else {
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
          L8: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("re.C(");

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
          throw r.a((Throwable) ((Object) stackIn_34_0), stackIn_37_2 + ')');
        }
        return stackIn_30_0;
    }

    final dp a(byte param0, int param1) {
        byte[] var4 = null;
        dp var3 = (dp) (this.field_f.a((long)param1, 0));
        if (param0 != 47) {
            return (dp) null;
        }
        if (!(var3 == null)) {
            return var3;
        }
        if (-32769 >= (param1 ^ -1)) {
            var4 = this.field_c.a(1, -1, 32767 & param1);
        } else {
            var4 = this.field_e.a(1, param0 + -48, param1);
        }
        var3 = new dp();
        if (!(var4 == null)) {
            var3.a(new ob(var4), 0);
        }
        if (!(32768 > param1)) {
            var3.e((byte) -117);
        }
        this.field_f.a((long)param1, var3, (byte) -108);
        return var3;
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        if (param0 <= 105) {
            return;
        }
        field_h = null;
    }

    re(int param0, bc param1, bc param2, wr param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_f = new ol(64);
        try {
          L0: {
            L1: {
              this.field_e = param1;
              this.field_c = param2;
              if (null == this.field_e) {
                break L1;
              } else {
                this.field_e.a(1, -26268);
                break L1;
              }
            }
            L2: {
              if (this.field_c == null) {
                break L2;
              } else {
                this.field_c.a(1, -26268);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("re.<init>(").append(param0).append(',');

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
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_15_2 + ')');
        }
    }

    final static bi[] a(bi[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        bi var3 = null;
        int var4 = 0;
        bi[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param0.length <= var2_int) {
                L2: {
                  if (param1 > 32) {
                    break L2;
                  } else {
                    re.a((byte) 21);
                    break L2;
                  }
                }
                stackIn_7_0 = (bi[]) (param0);
                break L0;
              } else {
                var3 = param0[var2_int];
                param0[var2_int].field_x = 0;
                var3.field_t = 0;
                param0[var2_int].field_o = param0[var2_int].field_z;
                param0[var2_int].field_p = param0[var2_int].field_w;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("re.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_a = 64;
    }
}
