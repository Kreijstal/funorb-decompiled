/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo {
    private String field_d;
    private boolean field_b;
    private boolean field_c;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            String[] var2 = (String[]) null;
            fo.a(70, (String) null, (String[]) null);
        }
    }

    final String b(boolean param0) {
        if (!param0) {
            field_a = (String) null;
        }
        return this.field_d;
    }

    final boolean a(int param0) {
        if (param0 <= 8) {
            fo.a(true);
        }
        return this.field_c;
    }

    final static String a(int param0, String param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if ((var6_int ^ -1) <= -1) {
                var5 = 2 + var6_int;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3_int) {
                      break L3;
                    } else {
                      if (!mu.a(28799, param1.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(2 + var6_int, var5);
                  if (vv.a(param0 ^ -4846, (CharSequence) ((Object) var7_ref_String))) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param1.charAt(var5) == 62) {
                        var5++;
                        var8 = dq.a(param0 ^ 4761, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (param2[var8].length() - (var5 + -var6_int));
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
                  if (param0 == 4800) {
                    break L4;
                  } else {
                    field_a = (String) null;
                    break L4;
                  }
                }
                var7 = 0;
                L5: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (-1 < (var8 ^ -1)) {
                    discarded$0 = var6.append(param1.substring(var7));
                    stackIn_27_0 = var6.toString();
                    break L0;
                  } else {
                    var5 = 2 + var8;
                    L6: while (true) {
                      L7: {
                        if (var5 >= var3_int) {
                          break L7;
                        } else {
                          if (!mu.a(param0 ^ 25279, param1.charAt(var5))) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param1.substring(var8 - -2, var5);
                      if (!vv.a(-110, (CharSequence) ((Object) var9))) {
                        continue L5;
                      } else {
                        if (var3_int <= var5) {
                          continue L5;
                        } else {
                          if (param1.charAt(var5) != 62) {
                            continue L5;
                          } else {
                            var5++;
                            var10 = dq.a(90, (CharSequence) ((Object) var9));
                            discarded$1 = var6.append(param1.substring(var7, var8));
                            discarded$2 = var6.append(param2[var10]);
                            var7 = var5;
                            continue L5;
                          }
                        }
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
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("fo.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        return stackIn_27_0;
    }

    final void a(boolean param0, boolean param1) {
        this.field_b = param1 ? true : false;
        this.field_c = param0 ? true : false;
    }

    final boolean a(byte param0) {
        int var2 = 91 / ((param0 - 67) / 48);
        return this.field_b;
    }

    fo(String param0) {
        this.field_c = false;
        this.field_b = false;
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Can't reach";
    }
}
