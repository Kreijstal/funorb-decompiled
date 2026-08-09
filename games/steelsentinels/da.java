/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    static String field_c;
    static boolean field_d;
    il[] field_h;
    static wk[] field_e;
    static String field_a;
    static vi field_b;
    static wk field_f;
    static String field_i;
    static int field_g;

    final static boolean a(cm param0, cm param1, int param2, cm param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0.a(true)) {
                break L1;
              } else {
                if (!param0.a("commonui", (byte) 90)) {
                  break L1;
                } else {
                  L2: {
                    if (!param3.a(true)) {
                      break L2;
                    } else {
                      if (!param3.a("commonui", (byte) 90)) {
                        break L2;
                      } else {
                        L3: {
                          if (!param1.a(true)) {
                            break L3;
                          } else {
                            if (!param1.a("button.gif", (byte) 90)) {
                              break L3;
                            } else {
                              if (param2 == -1) {
                                stackIn_19_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                stackIn_17_0 = 0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        }
                        stackIn_14_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("da.K(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_19_0 != 0;
              }
            }
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        il var6;
        int var7;
        int var8;
        L0: {
          var8 = SteelSentinels.field_G;
          if (null == this.field_h) {
            break L0;
          } else {
            if (0 == this.field_h.length) {
              break L0;
            } else {
              if (param2 < this.field_h[0].field_h) {
                break L0;
              } else {
                if (this.field_h[-1 + this.field_h.length].field_a >= param2) {
                  if (1 == this.field_h.length) {
                    return this.field_h[0].a((byte) 105, param1);
                  } else {
                    var4 = param0;
                    var5 = 0;
                    L1: while (true) {
                      if (var5 >= this.field_h.length) {
                        return -1;
                      } else {
                        L2: {
                          var6 = this.field_h[var5];
                          if (var6.field_h > param2) {
                            break L2;
                          } else {
                            if (var6.field_a >= param2) {
                              var7 = var6.a((byte) 125, param1);
                              if (0 == (var7 ^ -1)) {
                                return -1;
                              } else {
                                return var7 + var4;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_f.length);
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    final static void a(cm param0, int param1, int param2, wg param3) {
        try {
            if (param1 <= 67) {
                da.a(true, -102);
            }
            vc.field_c = param2 * sj.a((byte) -108) / 1000;
            ea.a(param0, 1728986241);
            nl.a((byte) 90, param0);
            ah.a(77, param0);
            lk.a(true);
            ee.a(true);
            vn.field_h = 0 - vc.field_c;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "da.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(byte param0) {
        int var2;
        il[] var3;
        int var4;
        il var5;
        int var7;
        int var6;
        L0: {
          var7 = SteelSentinels.field_G;
          if (param0 == -100) {
            break L0;
          } else {
            field_g = -5;
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null != this.field_h) {
            var3 = this.field_h;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b(-1);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final static ah a(String param0, byte param1) {
        String var2 = null;
        ah var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        ah stackIn_9_0 = null;
        ah stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != db.field_h) {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var2 = ui.a(param1 ^ -42, var6);
                if (var2 == null) {
                  var2 = param0;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param1 == -41) {
                var3 = (ah) ((Object) db.field_h.a((long)var2.hashCode(), (byte) -81));
                L2: while (true) {
                  if (var3 != null) {
                    L3: {
                      var7 = (CharSequence) ((Object) var3.field_dc);
                      var4 = ui.a(1, var7);
                      if (var4 != null) {
                        break L3;
                      } else {
                        var4 = var3.field_dc;
                        break L3;
                      }
                    }
                    if (!var4.equals(var2)) {
                      var3 = (ah) ((Object) db.field_h.c((byte) 116));
                      continue L2;
                    } else {
                      stackIn_17_0 = (ah) (var3);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_9_0 = (ah) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref);

            stackIn_22_1 = new StringBuilder().append("da.D(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ah) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        il var4 = null;
        int var5 = SteelSentinels.field_G;
        if (param0 != -1) {
            cm var6 = (cm) null;
            da.a((cm) null, (cm) null, -88, (cm) null);
        }
        for (var3 = 0; var3 < this.field_h.length; var3++) {
            var4 = this.field_h[var3];
            if (!(var4.field_f.length <= param1)) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_f.length);
        }
        return this.field_h.length;
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 24) {
            break L0;
          } else {
            this.a(114, 23, 65);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_h == null) {
              break L2;
            } else {
              if ((this.field_h.length ^ -1) < -1) {
                stackIn_7_0 = this.field_h[this.field_h.length + -1].field_a - this.field_h[0].field_h;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(String param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              var7 = param0.length();
              if (param3 >= 94) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              if (var7 <= var8) {
                if ((var5_int ^ -1) >= -1) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_19_0 = (-param2 + param1 << -2127364504) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param0.charAt(var8);
                  if (-61 != (var9 ^ -1)) {
                    if (var9 == 62) {
                      var6 = 0;
                      break L3;
                    } else {
                      if (var6 == 0) {
                        if (32 == var9) {
                          var5_int++;
                          break L3;
                        } else {
                          var8++;
                          continue L2;
                        }
                      } else {
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    var6 = 1;
                    break L3;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("da.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        il var5 = null;
        int var6 = SteelSentinels.field_G;
        if (param0 != 1) {
            field_b = (vi) null;
        }
        il[] var7 = this.field_h;
        il[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_f.length > param1) {
                return var5.field_f[param1];
            }
            param1 = param1 - (var5.field_f.length - 1);
        }
        return 0;
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 25104) {
            return;
        }
        if (jc.a(2)) {
            param0 = false;
        }
        bf.a((byte) -112, param0);
        if (di.field_b) {
            pb.f(fg.field_Tb.field_d.field_Y, fg.field_Tb.field_d.field_eb, fg.field_Tb.field_d.field_zb, fg.field_Tb.field_d.field_Lb);
            fg.field_Tb.field_d.a(param0, (byte) 127);
        }
        il.a(param0, (byte) -125);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        field_i = null;
        field_b = null;
        if (!param0) {
            field_b = (vi) null;
        }
        field_f = null;
        field_c = null;
    }

    static {
        field_c = "This is your RuneScape clan if you have one.";
        field_a = "Invalid date";
        field_i = ", and was finished off by a rock";
    }
}
