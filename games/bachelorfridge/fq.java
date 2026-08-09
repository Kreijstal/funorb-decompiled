/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends td {
    static wma field_s;
    static String field_r;
    static String field_q;
    static String field_p;

    fq(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_n = param3;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fq.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        if (param0 <= 120) {
            field_s = (wma) null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final static void a(int param0, byte param1) {
        pf var2;
        int var3;
        var2 = sja.field_fb;
        var2.c(param0, (byte) 127);
        var2.field_g = var2.field_g + 1;
        if (param1 > -112) {
          field_r = (String) null;
          var3 = var2.field_g;
          var2.d(2, 0);
          var2.a(0, -125, fia.field_r.length, fia.field_r);
          var2.d(tq.field_h, 0);
          var2.d(ena.field_n, 0);
          var2.a(0, -128, sca.field_c.length, sca.field_c);
          var2.b((byte) 81, var2.field_g - var3);
          return;
        } else {
          var3 = var2.field_g;
          var2.d(2, 0);
          var2.a(0, -125, fia.field_r.length, fia.field_r);
          var2.d(tq.field_h, 0);
          var2.d(ena.field_n, 0);
          var2.a(0, -128, sca.field_c.length, sca.field_c);
          var2.b((byte) 81, var2.field_g - var3);
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (param1 != null) {
              var2_int = param0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!mp.a(true, param1.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!mp.a(true, param1.charAt(-1 + var3))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = var3 - var2_int;
                  if (-2 >= (var4 ^ -1)) {
                    if ((var4 ^ -1) >= -13) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var3 <= var6) {
                          if (-1 != (var5.length() ^ -1)) {
                            stackIn_29_0 = var5.toString();
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            stackIn_27_0 = null;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          L6: {
                            var7 = param1.charAt(var6);
                            if (io.a(true, (char) var7)) {
                              var8 = mq.a(4558, (char) var7);
                              if (var8 == 0) {
                                break L6;
                              } else {
                                discarded$0 = var5.append((char) var8);
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("fq.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_27_0);
          } else {
            return stackIn_29_0;
          }
        }
    }

    final ii a(op param0, int param1) {
        ii stackIn_3_0 = null;
        int stackIn_17_0 = 0;
        int stackIn_20_1 = 0;
        fk stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        fk var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wia var10 = null;
        aga var11 = null;
        int var12 = 0;
        int var13 = 0;
        iv var14 = null;
        int var15 = 0;
        aga var16 = null;
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            if (param1 == 3) {
              var16 = this.field_h.a(107, param0);
              var4 = new fk(this.field_g, new nq(var16), this.field_k, this.field_n);
              var5 = mp.field_q.length - 1;
              var6 = -var5;
              L1: while (true) {
                if (var5 < var6) {
                  stackIn_27_0 = (fk) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = -var5;
                  L2: while (true) {
                    if (var5 < var7) {
                      var6++;
                      continue L1;
                    } else {
                      L3: {
                        var8 = this.field_k - -var6;
                        var9 = var7 + this.field_n;
                        if (var8 < 0) {
                          break L3;
                        } else {
                          if (var8 >= param0.field_z) {
                            break L3;
                          } else {
                            if (-1 < (var9 ^ -1)) {
                              break L3;
                            } else {
                              if (param0.field_B > var9) {
                                var10 = param0.field_a[var8][var9];
                                var11 = var10.field_l;
                                if (var11 == null) {
                                  break L3;
                                } else {
                                  L4: {
                                    if ((var7 ^ -1) > -1) {
                                      stackIn_17_0 = -var7;
                                      break L4;
                                    } else {
                                      stackIn_17_0 = var7;
                                      break L4;
                                    }
                                  }
                                  L5: {


                                    if (var6 < 0) {

                                      stackIn_20_1 = -var6;
                                      break L5;
                                    } else {

                                      stackIn_20_1 = var6;
                                      break L5;
                                    }
                                  }
                                  var12 = stackIn_17_0 + stackIn_20_1;
                                  if (var5 >= var12) {
                                    var13 = mp.field_q[var12];
                                    var14 = new iv(new nq(var11), false, 1, var13, 0);
                                    var4.field_o.a(var14, true);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (ii) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("fq.A(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_27_0);
        }
    }

    static {
        field_r = "<%0>'s game";
        field_q = "Sound: ";
        field_p = "Eating a food will always unlock a new ability. Close the shopping bag by clicking the 'X' in the corner of it to continue.";
    }
}
