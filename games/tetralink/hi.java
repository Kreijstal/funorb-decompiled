/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hi {
    bk[] field_c;
    static double[] field_d;
    static String field_b;
    static boolean field_a;

    final static sj a(String param0, byte param1) {
        RuntimeException var2 = null;
        sj stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        sj stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -80) {
              if (pi.field_a != ll.field_C) {
                L1: {
                  if (pi.field_a != ik.field_d) {
                    break L1;
                  } else {
                    if (param0.equals(ak.field_b)) {
                      pi.field_a = fk.field_Q;
                      stackIn_12_0 = pm.field_f;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                pi.field_a = ll.field_C;
                pm.field_f = null;
                ak.field_b = param0;
                stackIn_10_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (sj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("hi.M(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (sj) ((Object) stackIn_10_0);
          } else {
            return stackIn_12_0;
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        bk var6;
        int var7;
        int var8;
        L0: {
          var8 = TetraLink.field_J;
          if (this.field_c == null) {
            break L0;
          } else {
            if (0 == this.field_c.length) {
              break L0;
            } else {
              if (this.field_c[0].field_h > param1) {
                break L0;
              } else {
                if (param1 <= this.field_c[this.field_c.length - 1].field_a) {
                  L1: {
                    if (param2 == 12024) {
                      break L1;
                    } else {
                      this.field_c = (bk[]) null;
                      break L1;
                    }
                  }
                  if (1 != this.field_c.length) {
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= this.field_c.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = this.field_c[var5];
                          if (param1 < var6.field_h) {
                            break L3;
                          } else {
                            if (param1 <= var6.field_a) {
                              var7 = var6.a((byte) 118, param0);
                              if (var7 != -1) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (var6.field_j.length - 1);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return this.field_c[0].a((byte) 109, param0);
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

    final int b(byte param0) {
        int var2;
        bk[] var3;
        int var4;
        bk var5;
        int var7;
        int var6;
        L0: {
          var7 = TetraLink.field_J;
          var2 = -1;
          if (param0 >= 29) {
            break L0;
          } else {
            field_d = (double[]) null;
            break L0;
          }
        }
        L1: {
          if (this.field_c == null) {
            break L1;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) -41);
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
          }
        }
        return var2;
    }

    final int a(int param0, boolean param1) {
        int var4 = 0;
        bk var5 = null;
        int var6 = TetraLink.field_J;
        bk[] var8 = this.field_c;
        bk[] var3 = var8;
        if (!param1) {
            String var7 = (String) null;
            hi.a((String) null, 'ﾎ', 23);
        }
        for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            if (!(var5.field_j.length <= param0)) {
                return var5.field_j[param0];
            }
            param0 = param0 - (var5.field_j.length + -1);
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var3;
        bk var4;
        int var5;
        var5 = TetraLink.field_J;
        var3 = 0;
        L0: while (true) {
          if (this.field_c.length <= var3) {
            L1: {
              if (param1 >= 94) {
                break L1;
              } else {
                this.a(-30, -101);
                break L1;
              }
            }
            return this.field_c.length;
          } else {
            var4 = this.field_c[var3];
            if ((param0 ^ -1) > (var4.field_j.length ^ -1)) {
              return var3;
            } else {
              param0 = param0 - (var4.field_j.length - 1);
              var3++;
              continue L0;
            }
          }
        }
    }

    final static String[] a(String param0, char param1, int param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param0);
            var3_int = en.a(param2 + -663, param1, var10);
            var4 = new String[var3_int + 1];
            var5 = 0;
            if (param2 == 783) {
              var6 = 0;
              var7 = 0;
              L1: while (true) {
                if (var3_int <= var7) {
                  var4[var3_int] = param0.substring(var6);
                  stackIn_11_0 = (String[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = var6;
                  L2: while (true) {
                    if (param1 == param0.charAt(var8)) {
                      incrementValue$1 = var5;
                      var5++;
                      var4[incrementValue$1] = param0.substring(var6, var8);
                      var6 = var8 - -1;
                      var7++;
                      continue L1;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (String[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("hi.O(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static void b(int param0) {
        io.field_h.setLength(0);
        sf.field_d = 0;
        if (param0 >= -33) {
            field_d = (double[]) null;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 55) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        int var1 = -124 % ((-60 - param0) / 55);
        kb.a(false, rh.field_F);
    }

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_a = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_c == null) {
              break L2;
            } else {
              if (0 >= this.field_c.length) {
                break L2;
              } else {
                stackIn_6_0 = this.field_c[this.field_c.length + -1].field_a - this.field_c[0].field_h;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, byte param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                if (-1 > (var5_int ^ -1)) {
                  stackIn_18_0 = (-param0 + param2 << -429032664) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (param1 == -126) {
                    stackIn_23_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_21_0 = -18;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                L2: {
                  var9 = param3.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (62 != var9) {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("hi.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0;
          } else {
            return stackIn_23_0;
          }
        }
    }

    static {
        field_b = "Drawn";
        field_a = false;
    }
}
