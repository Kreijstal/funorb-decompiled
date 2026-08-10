/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek implements ui {
    static int field_g;
    static int[] field_c;
    private kg field_f;
    private int field_b;
    static rc field_a;
    static int field_e;
    private int field_d;

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.equals("B")) {
              if (!param1.equals("I")) {
                L1: {
                  if (param0 == 3249872) {
                    break L1;
                  } else {
                    ek.a(-89);
                    break L1;
                  }
                }
                if (!param1.equals("S")) {
                  if (!param1.equals("J")) {
                    if (!param1.equals("Z")) {
                      if (!param1.equals("F")) {
                        if (param1.equals("D")) {
                          stackIn_23_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (param1.equals("C")) {
                            stackIn_27_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        }
                      } else {
                        stackIn_19_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_16_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("ek.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      return stackIn_27_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -38) {
            field_c = (int[]) null;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0) {
        ck.field_z = wf.field_d.a(de.field_c[12]);
        int var1 = wf.field_d.a(de.field_c[13]);
        if (ck.field_z < var1) {
            ck.field_z = var1;
        }
        int var2 = wf.field_d.field_t + wf.field_d.field_D - -4;
        if (param0 < 88) {
            return;
        }
        fd.field_a[5] = var2 + (wf.field_d.field_t + 130 - -wf.field_d.field_y) - -4;
        fd.field_b[5] = 2 * var2 + jk.field_x.a(true);
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_20_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 0) {
              stackIn_4_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param3 ^ -1) == -2) {
                var10 = param1[param2];
                var4 = var10;
                if (var4 != null) {
                  stackIn_11_0 = var10.toString();
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param3 - -param2;
                var5 = 0;
                var6_int = param2;
                L1: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    if (param0 < -26) {
                      var7 = param2;
                      L2: while (true) {
                        if (var4_int <= var7) {
                          stackIn_28_0 = var6.toString();
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L3: {
                            var8 = param1[var7];
                            if (var8 != null) {
                              discarded$3 = var6.append(var8);
                              break L3;
                            } else {
                              discarded$4 = var6.append("null");
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_20_0 = (String) null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param1[var6_int];
                      if (var7_ref_CharSequence != null) {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      } else {
                        var5 += 4;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var4_ref);

            stackIn_31_1 = new StringBuilder().append("ek.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                return stackIn_28_0;
              }
            }
          }
        }
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param4.field_g) {
                  break L2;
                } else {
                  if (param4.b((byte) -119)) {
                    break L2;
                  } else {
                    stackIn_5_0 = 2188450;
                    break L1;
                  }
                }
              }
              stackIn_5_0 = 3249872;
              break L1;
            }
            L3: {
              var6_int = stackIn_5_0;
              var7 = -107 / ((51 - param3) / 47);
              this.field_f.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_k + "</u>", param0 + param4.field_p, param4.field_n + param1, param4.field_l, param4.field_h, var6_int, -1, this.field_b, this.field_d, this.field_f.field_y - -this.field_f.field_t);
              if (param4.b((byte) 50)) {
                L4: {
                  var8 = this.field_f.a(param4.field_k);
                  var9 = this.field_f.field_t + this.field_f.field_y;
                  var10 = param0 - -param4.field_p;
                  var11 = param1 + param4.field_n;
                  if ((this.field_b ^ -1) != -3) {
                    if (1 == this.field_b) {
                      var10 = var10 + (-var8 + param4.field_l >> -1452902559);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    var10 = var10 + (param4.field_l + -var8);
                    break L4;
                  }
                }
                L5: {
                  if (-3 == (this.field_d ^ -1)) {
                    var11 = var11 + (-var9 + param4.field_h);
                    break L5;
                  } else {
                    if (1 != this.field_d) {
                      break L5;
                    } else {
                      var11 = var11 + (-var9 + param4.field_h >> -90962431);
                      break L5;
                    }
                  }
                }
                ri.a(var8 - -4, -2 + var10, 2 + var11, (byte) -107, var9);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6);

            stackIn_20_1 = new StringBuilder().append("ek.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    public ek() {
        this.field_b = 1;
        this.field_d = 1;
        this.field_f = vd.field_h;
    }

    ek(kg param0, int param1, int param2) {
        try {
            this.field_d = param2;
            this.field_b = param1;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ek.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = 250;
        field_c = new int[256];
        field_a = new rc();
    }
}
