/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    int field_f;
    String field_e;
    String field_b;
    static volatile boolean field_a;
    um field_c;
    static int field_g;
    String field_d;

    final static boolean a(boolean param0, CharSequence param1, int param2, int param3) {
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Chess.field_G;
        try {
          L0: {
            L1: {
              var4_int = 66 / ((param2 - 78) / 40);
              if (2 > param3) {
                break L1;
              } else {
                if (param3 > 36) {
                  break L1;
                } else {
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;
                  var8 = param1.length();
                  var9 = 0;
                  L2: while (true) {
                    if (var8 <= var9) {
                      stackIn_38_0 = var6;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var10 = param1.charAt(var9);
                          if (var9 != 0) {
                            break L4;
                          } else {
                            if (var10 == 45) {
                              var5 = 1;
                              break L3;
                            } else {
                              if (var10 != 43) {
                                break L4;
                              } else {
                                if (!param0) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (var10 < 48) {
                              break L6;
                            } else {
                              if (var10 > 57) {
                                break L6;
                              } else {
                                var10 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var10 < 65) {
                              break L7;
                            } else {
                              if (var10 > 90) {
                                break L7;
                              } else {
                                var10 -= 55;
                                break L5;
                              }
                            }
                          }
                          L8: {
                            if (var10 < 97) {
                              break L8;
                            } else {
                              if (var10 > 122) {
                                break L8;
                              } else {
                                var10 -= 87;
                                break L5;
                              }
                            }
                          }
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (param3 <= var10) {
                          stackIn_28_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L9: {
                            if (var5 == 0) {
                              break L9;
                            } else {
                              var10 = -var10;
                              break L9;
                            }
                          }
                          var11 = var7 * param3 - -var10;
                          if (var11 / param3 == var7) {
                            var6 = 1;
                            var7 = var11;
                            break L3;
                          } else {
                            stackIn_33_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var4);

            stackIn_41_1 = new StringBuilder().append("hf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L10;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L10;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_33_0 != 0;
            } else {
              return stackIn_38_0 != 0;
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        if (param1 != 1022407519) {
          field_a = true;
          var3 = param0 >>> 1022407519;
          return (var3 + param0) / param2 - var3;
        } else {
          var3 = param0 >>> 1022407519;
          return (var3 + param0) / param2 - var3;
        }
    }

    final static String a(int param0, int param1, String param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        Object stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        nk var5 = null;
        CharSequence var6 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param2);
            if (!ed.a(var6, 21257)) {
              stackIn_3_0 = qj.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((ld.field_g ^ -1) != -3) {
                stackIn_7_0 = tf.field_k;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (qd.a((byte) 13, param2)) {
                  stackIn_11_0 = ed.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!ah.a(param2, 54)) {
                    L1: {
                      if (100 > wg.field_w) {
                        break L1;
                      } else {
                        if (-1 > (cl.field_d ^ -1)) {
                          break L1;
                        } else {
                          stackIn_18_0 = df.field_c;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    if ((wg.field_w ^ -1) <= -201) {
                      stackIn_22_0 = df.field_c;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (va.a(param2, -19554)) {
                        stackIn_26_0 = oc.a(uh.field_n, new String[]{param2}, (byte) -42);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        var5 = qn.field_U;
                        var5.f(param0, -88);
                        var5.field_l = var5.field_l + 1;
                        var4 = var5.field_l;
                        if (param1 > 72) {
                          var5.c(0, (byte) -115);
                          var5.a(-113, param2);
                          var5.a(-var4 + var5.field_l, -1);
                          stackIn_31_0 = null;
                          decompiledRegionSelector0 = 8;
                          break L0;
                        } else {
                          stackIn_29_0 = (String) null;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      }
                    }
                  } else {
                    stackIn_14_0 = oc.a(i.field_b, new String[]{param2}, (byte) -108);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("hf.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        return (String) ((Object) stackIn_31_0);
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private hf() throws Throwable {
        throw new Error();
    }

    static {
        field_a = false;
        field_g = 0;
    }
}
