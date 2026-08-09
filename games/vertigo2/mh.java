/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static boolean field_a;
    static int[] field_c;
    static String field_b;
    static dd field_d;

    final static void a(boolean param0, byte param1, int param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var7;
        if (null != rc.field_d) {
          var3 = rc.field_d.c(param0, 104);
          if (var3 != 0) {
            if ((var3 ^ -1) == -3) {
              if (rc.field_d.field_S != null) {
                L0: {
                  if (rc.field_d.field_S.equals("")) {
                    break L0;
                  } else {
                    L1: {
                      if (rc.field_d.field_S.charAt(0) != 91) {
                        var7 = (CharSequence) ((Object) rc.field_d.field_S);
                        var4 = rc.a(var7, 320);
                        break L1;
                      } else {
                        var4 = rc.field_d.field_S;
                        break L1;
                      }
                    }
                    L2: {
                      var5 = null;
                      if (hk.field_n != 0) {
                        break L2;
                      } else {
                        var5 = ia.a(-113, param2, var4);
                        break L2;
                      }
                    }
                    L3: {
                      if (-2 != (hk.field_n ^ -1)) {
                        break L3;
                      } else {
                        var5 = lk.a((byte) 96, param2, var4);
                        break L3;
                      }
                    }
                    L4: {
                      if (2 == hk.field_n) {
                        var5 = br.a(var4, param2, 100);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if ((hk.field_n ^ -1) == -4) {
                        var5 = en.a(var4, (byte) -108, var4, param2);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (var5 != null) {
                      var6 = (String) null;
                      dh.a((byte) -59, (String) (var5), 2, (String) null, 0, var4);
                      break L0;
                    } else {
                      rc.field_d = null;
                      hk.field_n = -1;
                      if (param1 > -52) {
                        field_c = (int[]) null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                rc.field_d = null;
                hk.field_n = -1;
                if (param1 > -52) {
                  field_c = (int[]) null;
                  return;
                } else {
                  return;
                }
              } else {
                rc.field_d = null;
                hk.field_n = -1;
                if (param1 > -52) {
                  field_c = (int[]) null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              rc.field_d = null;
              hk.field_n = -1;
              if (param1 > -52) {
                field_c = (int[]) null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 > -52) {
              field_c = (int[]) null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 > -52) {
            field_c = (int[]) null;
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 != -1) {
            field_d = (dd) null;
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            field_c = (int[]) null;
            ch.field_e.a(0, 86, 0);
            return;
        }
        ch.field_e.a(0, 86, 0);
    }

    final static void a(boolean param0, er[][] param1, byte[] param2, int param3, r param4, r param5, boolean param6, int[] param7, String[] param8, String[][] param9, er[][] param10, int param11, String[][] param12, byte[] param13, r param14) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        int[] var16 = null;
        u[] var17 = null;
        try {
          L0: {
            L1: {
              var17 = (u[]) null;
              var16 = (int[]) null;
              wn.a(param8, param13, param7, param9, (u[]) null, param5, param4, (byte) -42, param10, param12, param14, param3, param2, param1, param11, (int[]) null, param6);
              if (param0) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var15);

            stackIn_5_1 = new StringBuilder().append("mh.C(").append(param0).append(',');

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
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param9 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param13 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param14 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_36_2 + ')');
        }
    }

    static {
        field_b = "Email is valid";
    }
}
