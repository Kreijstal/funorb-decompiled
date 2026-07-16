/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class am {
    static dd[] field_c;
    static String field_d;
    static String field_a;
    static String field_b;

    final static boolean a(int param0, char param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (!la.a(0, param1)) {
                L1: {
                  if ((param1 ^ -1) == -46) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) == -161) {
                      break L1;
                    } else {
                      if (param1 == 32) {
                        break L1;
                      } else {
                        if ((param1 ^ -1) != -96) {
                          var2_int = -76 % ((75 - param0) / 40);
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                stackOut_18_0 = 1;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "am.E(" + param0 + 44 + param1 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final static String a(p param0, int param1, byte param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        Object stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          try {
            L0: {
              var3_int = param0.j(111);
              if ((param1 ^ -1) > (var3_int ^ -1)) {
                var3_int = param1;
                break L0;
              } else {
                break L0;
              }
            }
            var4 = new byte[var3_int];
            param0.field_l = param0.field_l + cg.field_c.a((byte) 115, param0.field_o, var3_int, param0.field_l, 0, var4);
            var5 = gh.a(var4, 0, -161, var3_int);
            if (param2 >= 54) {
              stackOut_7_0 = (String) var5;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (String) (Object) stackIn_6_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_9_0 = "Cabbage";
            stackIn_10_0 = stackOut_9_0;
            return stackIn_10_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("am.D(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (!kn.field_L) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              L2: {
                if (vk.field_g != 2) {
                  break L2;
                } else {
                  if (ec.field_f == null) {
                    break L2;
                  } else {
                    if (!ec.field_f.equals((Object) (Object) ad.a((CharSequence) (Object) param1, -2))) {
                      break L2;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    }
                  }
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              return stackIn_18_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("am.A(").append(param0).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param2 < 0) {
              var3_int = -1 + param1 & param0 >> -1915138465;
              stackOut_3_0 = var3_int + ((param0 >>> -1533319873) + param0) % param1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -114;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "am.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_d = null;
              field_a = null;
              field_c = null;
              if (param0 >= 2) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "am.F(" + param0 + 41);
        }
    }

    final static String b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        try {
          L0: {
            var1_int = -65 % ((8 - param0) / 34);
            if (ci.field_J != null) {
              stackOut_3_0 = ci.field_J;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = "";
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "am.C(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        nk var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ve var6 = null;
        String var7 = null;
        ve var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var9 = Chess.field_G;
        try {
          L0: {
            L1: {
              var1_ref = tk.field_h;
              var2 = var1_ref.i(param0 ^ -22);
              if (param0 == 115) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            if (var2 == 0) {
              L2: {
                if (null != r.field_Ib) {
                  break L2;
                } else {
                  r.field_Ib = new dk(128);
                  wc.field_v = 0;
                  break L2;
                }
              }
              L3: {
                if (var1_ref.i(param0 ^ -40) != 1) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var3_int = stackIn_14_0;
                  var4_ref_String = var1_ref.d(0);
                  if (var3_int == 0) {
                    break L5;
                  } else {
                    var5 = var1_ref.d(0);
                    if (var9 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = var4_ref_String;
                break L4;
              }
              L6: {
                var6 = hh.a(param0 ^ -15069, var4_ref_String);
                var7 = var1_ref.d(0);
                var8 = ad.a((CharSequence) (Object) var4_ref_String, param0 ^ -115);
                if (var8 == null) {
                  var8 = var4_ref_String;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var6 == null) {
                  var6 = hh.a(-15024, var7);
                  if (var6 == null) {
                    break L7;
                  } else {
                    r.field_Ib.a(true, (l) (Object) var6, (long)var8.hashCode());
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (null == var6) {
                  var6 = new ve();
                  r.field_Ib.a(true, (l) (Object) var6, (long)var8.hashCode());
                  int fieldTemp$2 = wc.field_v;
                  wc.field_v = wc.field_v + 1;
                  var6.field_Ib = fieldTemp$2;
                  cl.field_e.a((o) (Object) var6, (byte) 127);
                  break L8;
                } else {
                  break L8;
                }
              }
              var6.field_Ob = var7;
              var6.field_Kb = var5;
              var6.field_Fb = var4_ref_String;
              return;
            } else {
              if ((var2 ^ -1) != -2) {
                if ((var2 ^ -1) != -3) {
                  if (var2 != 3) {
                    if (-5 != (var2 ^ -1)) {
                      fg.a((Throwable) null, (byte) -77, "F1: " + tm.b((byte) -128));
                      si.d(65280);
                      break L0;
                    } else {
                      ld.field_g = 1;
                      var3 = var1_ref.d(0);
                      f.field_a = var3.intern();
                      var4 = var1_ref.i(-82);
                      mh.a(2, var4);
                      return;
                    }
                  } else {
                    L9: {
                      if (-3 == (ld.field_g ^ -1)) {
                        ld.field_g = 1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  L10: {
                    if (-2 == (ld.field_g ^ -1)) {
                      ld.field_g = 2;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  return;
                }
              } else {
                L11: {
                  if (bf.field_M != null) {
                    break L11;
                  } else {
                    bf.field_M = new dk(128);
                    wg.field_w = 0;
                    break L11;
                  }
                }
                L12: {
                  var3 = var1_ref.d(0);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  var4_ref_String = var1_ref.d(param0 ^ 115);
                  var5 = var1_ref.d(param0 + -115);
                  var6 = mn.a(-1, var4_ref_String);
                  if (null == var6) {
                    var6 = mn.a(-1, var5);
                    if (null == var6) {
                      break L13;
                    } else {
                      bf.field_M.a(true, (l) (Object) var6, (long)ad.a((CharSequence) (Object) var4_ref_String, -2).hashCode());
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (null != var6) {
                    break L14;
                  } else {
                    var6 = new ve();
                    bf.field_M.a(true, (l) (Object) var6, (long)ad.a((CharSequence) (Object) var4_ref_String, -2).hashCode());
                    int fieldTemp$3 = wg.field_w;
                    wg.field_w = wg.field_w + 1;
                    var6.field_Ib = fieldTemp$3;
                    me.field_e.a((o) (Object) var6, (byte) 126);
                    break L14;
                  }
                }
                L15: {
                  if (null != var3) {
                    var3 = var3.intern();
                    break L15;
                  } else {
                    break L15;
                  }
                }
                var6.field_Lb = var3;
                var6.field_Fb = var4_ref_String;
                var6.field_Ob = var5;
                var6.c(-2193);
                var7_ref = (ve) (Object) me.field_e.g(-18110);
                L16: while (true) {
                  L17: {
                    if (var7_ref == null) {
                      break L17;
                    } else {
                      if (!pd.a((byte) -15, var6, var7_ref)) {
                        break L17;
                      } else {
                        var7_ref = (ve) (Object) me.field_e.a((byte) -105);
                        if (var9 == 0) {
                          continue L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  L18: {
                    L19: {
                      if (null != var7_ref) {
                        break L19;
                      } else {
                        me.field_e.a((o) (Object) var6, (byte) -102);
                        if (var9 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    he.a((o) (Object) var6, (o) (Object) var7_ref, true);
                    break L18;
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "am.G(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names cannot start or end with space or underscore";
        field_b = "Kick <%0> from this game";
    }
}
