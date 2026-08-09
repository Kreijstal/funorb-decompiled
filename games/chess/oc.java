/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends vm {
    static String field_o;
    private qn field_q;
    static un field_p;
    static String field_r;
    static int[] field_n;
    static jk field_l;
    static String field_m;

    public static void h(int param0) {
        String[] var2;
        field_r = null;
        field_p = null;
        field_n = null;
        field_o = null;
        field_l = null;
        field_m = null;
        if (param0 == 0) {
          return;
        } else {
          var2 = (String[]) null;
          oc.a((String) null, (String[]) null, (byte) 51);
          return;
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
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
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Chess.field_G;
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
                L2: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if ((var8 ^ -1) <= -1) {
                    var5 = 2 + var8;
                    L3: while (true) {
                      L4: {
                        if (var3_int <= var5) {
                          break L4;
                        } else {
                          if (!di.a(-49, param0.charAt(var5))) {
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (lg.a((byte) 74, (CharSequence) ((Object) var9))) {
                        if (var3_int <= var5) {
                          continue L2;
                        } else {
                          if (62 != param0.charAt(var5)) {
                            continue L2;
                          } else {
                            var5++;
                            var10 = fn.a((CharSequence) ((Object) var9), 0);
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
                    L5: {
                      discarded$2 = var6.append(param0.substring(var7));
                      if (param2 < -41) {
                        break L5;
                      } else {
                        field_o = (String) null;
                        break L5;
                      }
                    }
                    stackIn_27_0 = var6.toString();
                    break L0;
                  }
                }
              } else {
                var5 = var6_int - -2;
                L6: while (true) {
                  L7: {
                    if (var3_int <= var5) {
                      break L7;
                    } else {
                      if (!di.a(-49, param0.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int - -2, var5);
                  if (lg.a((byte) 72, (CharSequence) ((Object) var7_ref_String))) {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = fn.a((CharSequence) ((Object) var7_ref_String), 0);
                        var4 = var4 + (var6_int + -var5 + param1[var8].length());
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
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

            stackIn_30_1 = new StringBuilder().append("oc.C(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        return stackIn_27_0;
    }

    final String a(String param0, int param1) {
        vb var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(this.field_q instanceof ee)) {
                break L1;
              } else {
                var3 = ((ee) ((Object) this.field_q)).a(param1 + 9210);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.a(21314) != oa.field_a) {
                      break L2;
                    } else {
                      if (!param0.equals(this.field_q.field_v)) {
                        stackIn_6_0 = gg.field_z;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_8_0 = var3.a(false);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L3: {
              if (param1 == -9316) {
                break L3;
              } else {
                field_r = (String) null;
                break L3;
              }
            }
            if (!param0.equals(this.field_q.field_v)) {
              stackIn_14_0 = gg.field_z;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("oc.D(");

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
          throw fk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        String[] var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param2 = qm.a('_', param2, "", (byte) -51);
              if (param1 < -114) {
                break L1;
              } else {
                var4 = (String[]) null;
                oc.a((String) null, (String[]) null, (byte) -72);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = i.a(0, param2);
                if ((param0.indexOf(param2) ^ -1) != 0) {
                  break L3;
                } else {
                  if (param0.indexOf(var3) == -1) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("oc.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final mk a(byte param0, String param1) {
        vb var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        mk stackIn_5_0 = null;
        mk stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_q instanceof ee) {
                var3 = ((ee) ((Object) this.field_q)).a(-89);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a(21314) == oa.field_a) {
                    break L1;
                  } else {
                    stackIn_5_0 = qk.field_b;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = 125 % ((param0 - -49) / 62);
              if (!param1.equals(this.field_q.field_v)) {
                stackIn_9_0 = qk.field_b;
                break L2;
              } else {
                stackIn_9_0 = oa.field_a;
                break L2;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("oc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    oc(qn param0, qn param1) {
        super(param0);
        try {
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "oc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Enter name of friend to add to list";
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
