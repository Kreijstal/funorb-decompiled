/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static double field_b;
    static String field_c;
    static int field_d;
    static int field_a;

    final static va a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        va var7 = null;
        int var8 = 0;
        java.awt.Canvas var9 = null;
        va stackIn_5_0 = null;
        va stackIn_9_0 = null;
        va stackIn_12_0 = null;
        va stackIn_18_0 = null;
        va stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 57) {
                break L1;
              } else {
                var9 = (java.awt.Canvas) null;
                ll.a(-57, -32, (java.awt.Canvas) null, 90);
                break L1;
              }
            }
            var2_int = param1.length();
            if (var2_int != 0) {
              if (var2_int > 255) {
                stackIn_9_0 = m.field_g;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = ij.a(0, '.', param1);
                if (-3 >= (var3.length ^ -1)) {
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      stackIn_21_0 = ck.a(var3[var3.length + -1], (byte) 127);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = ik.a((byte) -126, var6);
                      if (var7 != null) {
                        stackIn_18_0 = (va) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  stackIn_12_0 = vf.field_q;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_5_0 = vf.field_q;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("ll.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_21_0;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            if (param3 < -35) {
              try {
                L1: {
                  var4 = param2.getGraphics();
                  pi.field_S.a((byte) 91, var4, param1, param0);
                  var4.dispose();
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var4_ref = (Exception) (Object) decompiledCaughtException;
                  param2.repaint();
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref2);

            stackIn_8_1 = new StringBuilder().append("ll.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        if ((param1 << param0 & i.field_o) != 0) {
            return false;
        }
        pn.field_a.b(hl.field_b, 320, 100, 9805732, -1);
        tf.a((byte) 59, param0, 105, i.field_o);
        return true;
    }

    public static void a(boolean param0) {
        if (param0) {
            ll.a(false);
        }
        field_c = null;
    }

    final static va a(String param0, boolean param1) {
        va stackIn_6_0 = null;
        va stackIn_10_0 = null;
        va stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        va stackIn_29_0 = null;
        va stackIn_43_0 = null;
        va stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var2_int = param0.length();
            if (0 == var2_int) {
              stackIn_6_0 = vf.field_q;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) < -65) {
                stackIn_10_0 = m.field_g;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var4 < var2_int) {
                      L3: {
                        var5 = param0.charAt(var4);
                        if (46 == var5) {
                          L4: {
                            if (-1 == (var4 ^ -1)) {
                              break L4;
                            } else {
                              if (-1 + var2_int == var4) {
                                break L4;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          stackIn_43_0 = ql.field_k;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (ji.field_b.indexOf(var5) != -1) {
                            var3 = 0;
                            break L3;
                          } else {
                            stackIn_47_0 = ql.field_k;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      var4++;
                      continue L2;
                    } else {
                      return null;
                    }
                  }
                } else {
                  if (param0.charAt(-1 + var2_int) != 34) {
                    stackIn_15_0 = ql.field_k;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L5: while (true) {
                      if (-1 + var2_int > var4) {
                        L6: {
                          var5 = param0.charAt(var4);
                          if (var5 == 92) {
                            L7: {
                              if (var3 != 0) {
                                stackIn_24_0 = 0;
                                break L7;
                              } else {
                                stackIn_24_0 = 1;
                                break L7;
                              }
                            }
                            var3 = stackIn_24_0;
                            break L6;
                          } else {
                            L8: {
                              if (var5 != 34) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  stackIn_29_0 = ql.field_k;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var3 = 0;
                            break L6;
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var2);

            stackIn_53_1 = new StringBuilder().append("ll.C(");

            if (param0 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L9;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L9;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_43_0;
                } else {
                  return stackIn_47_0;
                }
              }
            }
          }
        }
    }

    static {
        field_c = "Level";
    }
}
