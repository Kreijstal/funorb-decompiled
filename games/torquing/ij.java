/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends gf {
    static long field_l;
    private tk field_m;
    static int[] field_o;
    private tk field_n;

    public static void f(int param0) {
        if (param0 > -73) {
            CharSequence var2 = (CharSequence) null;
            ij.a(true, 89, (CharSequence) null, 107);
        }
        field_o = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = this.field_m.field_m.toLowerCase();
            var4 = param1.toLowerCase();
            if (0 != var4.length()) {
              L1: {
                if (param0 == -121) {
                  break L1;
                } else {
                  this.field_n = (tk) null;
                  break L1;
                }
              }
              var5 = var4;
              if (va.b(var5, 25326)) {
                stackIn_8_0 = dj.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (hk.a(true, var5)) {
                  stackIn_12_0 = nh.field_q;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!fm.a((byte) -98, var5)) {
                    if (!this.b((byte) -6, param1)) {
                      if (var6.length() <= 0) {
                        stackIn_33_0 = ci.field_b;
                        decompiledRegionSelector0 = 9;
                        break L0;
                      } else {
                        if (tm.a(true, var5, var6)) {
                          stackIn_23_0 = jn.field_a;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (!rh.a(true, var6, var5)) {
                            if (!vk.a(var6, 4096, var5)) {
                              stackIn_31_0 = dj.field_b;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              stackIn_29_0 = jn.field_a;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          } else {
                            stackIn_26_0 = nh.field_o;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_18_0 = fi.field_f;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_15_0 = jg.field_u;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("ij.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L2;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_31_0;
                        } else {
                          return stackIn_33_0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final boolean b(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = 15 % ((79 - param0) / 43);
              var3 = this.field_n.field_m.toLowerCase();
              var5 = param1.toLowerCase();
              if ((var3.length() ^ -1) >= -1) {
                break L1;
              } else {
                if (var5.length() > 0) {
                  var6 = var3.lastIndexOf("@");
                  if (0 > var6) {
                    break L1;
                  } else {
                    if (-1 + var3.length() <= var6) {
                      break L1;
                    } else {
                      var7 = var3.substring(0, var6);
                      var8 = var3.substring(var6 + 1);
                      if (-1 >= (var5.indexOf(var7) ^ -1)) {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if ((var5.indexOf(var8) ^ -1) > -1) {
                          break L1;
                        } else {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_13_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("ij.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final cd a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        cd stackIn_2_0 = null;
        cd stackIn_6_0 = null;
        cd stackIn_9_0 = null;
        cd stackIn_12_0 = null;
        cd stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_m.field_m.toLowerCase();
            if (param0 > 62) {
              var4 = param1.toLowerCase();
              if (-1 == (var4.length() ^ -1)) {
                stackIn_6_0 = so.field_u;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (cd.a(var4, 18, var3)) {
                  if (!this.b((byte) -56, param1)) {
                    stackIn_14_0 = so.field_s;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_12_0 = so.field_u;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = so.field_u;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = (cd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ij.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_14_0;
              }
            }
          }
        }
    }

    final static void e(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ni var4_ref_ni = null;
        Object var5 = null;
        int var6 = 0;
        qa var9 = null;
        df var10 = null;
        byte[] var14 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var10 = kj.field_d;
              var2 = var10.i((byte) -101);
              if (var2 == 0) {
                var9 = (qa) ((Object) qf.field_a.b(0));
                if (var9 == null) {
                  ih.b(true);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var4 = var10.i((byte) -101);
                    if (var4 != 0) {
                      var14 = new byte[var4];
                      var10.a(48, var4, var14, 0);
                      break L2;
                    } else {
                      var5 = null;
                      break L2;
                    }
                  }
                  var10.field_n = var10.field_n + 4;
                  if (var10.h(-31017)) {
                    var9.f(0);
                    break L1;
                  } else {
                    ih.b(true);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                if (1 == var2) {
                  var3 = var10.c((byte) -59);
                  var4_ref_ni = (ni) ((Object) vb.field_f.b(param0 ^ 10078));
                  L3: while (true) {
                    L4: {
                      if (var4_ref_ni == null) {
                        break L4;
                      } else {
                        if (var3 == var4_ref_ni.field_k) {
                          break L4;
                        } else {
                          var4_ref_ni = (ni) ((Object) vb.field_f.f(-24059));
                          continue L3;
                        }
                      }
                    }
                    if (var4_ref_ni == null) {
                      ih.b(true);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4_ref_ni.f(0);
                      break L1;
                    }
                  }
                } else {
                  nn.a("A1: " + me.a(-1), (Throwable) null, -9958);
                  ih.b(true);
                  break L1;
                }
              }
            }
            L5: {
              if (param0 == 10078) {
                break L5;
              } else {
                field_l = 30L;
                break L5;
              }
            }
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "ij.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    ij(tk param0, tk param1, tk param2) {
        super(param0);
        try {
            this.field_m = param1;
            this.field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
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
        var11 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if (36 >= param1) {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param2.length();
                    if (param3 == -98) {
                      break L2;
                    } else {
                      field_l = -68L;
                      break L2;
                    }
                  }
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      stackIn_40_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param2.charAt(var8);
                          if (0 != var8) {
                            break L5;
                          } else {
                            if (45 != var9) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param0) {
                                  break L5;
                                } else {
                                  var8++;
                                  continue L3;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (48 > var9) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          if (var9 < 97) {
                            stackIn_26_0 = 0;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            if (var9 <= 122) {
                              var9 -= 87;
                              break L6;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (param1 > var9) {
                          L9: {
                            if (var4_int == 0) {
                              break L9;
                            } else {
                              var9 = -var9;
                              break L9;
                            }
                          }
                          var10 = var6 * param1 + var9;
                          if (var10 / param1 != var6) {
                            stackIn_36_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
                        } else {
                          stackIn_30_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("ij.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L10;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L10;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_30_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_36_0 != 0;
            } else {
              return stackIn_40_0 != 0;
            }
          }
        }
    }

    static {
    }
}
