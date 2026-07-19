/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ida extends at {
    static String field_o;
    int field_l;
    int field_j;
    int field_q;
    int field_r;
    int field_k;
    gj field_s;
    int field_n;
    int field_m;
    nq field_p;

    final static String a(int param0, byte[] param1, int param2, int param3) {
        pn discarded$9 = null;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException var4 = null;
        char[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vr var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        String stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_38_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var14 = new char[param0];
              var13 = var14;
              var12 = var13;
              var4_array = var12;
              var5 = 0;
              if (param3 == 258048) {
                break L1;
              } else {
                var11 = (vr) null;
                discarded$9 = ida.a(-52, (vr) null, -120);
                break L1;
              }
            }
            var6 = param2;
            var7 = param2 - -param0;
            L2: while (true) {
              if (var7 <= var6) {
                stackOut_38_0 = new String(var14, 0, var5);
                stackIn_39_0 = stackOut_38_0;
                break L0;
              } else {
                L3: {
                  incrementValue$10 = var6;
                  var6++;
                  var8 = param1[incrementValue$10] & 255;
                  if (var8 >= 128) {
                    if (var8 >= 192) {
                      if (var8 >= 224) {
                        if (240 > var8) {
                          L4: {
                            if (1 + var6 >= var7) {
                              break L4;
                            } else {
                              if (-129 != (192 & param1[var6] ^ -1)) {
                                break L4;
                              } else {
                                if (-129 == (param1[1 + var6] & 192 ^ -1)) {
                                  incrementValue$11 = var6;
                                  var6++;
                                  incrementValue$12 = var6;
                                  var6++;
                                  var9 = param1[incrementValue$11] << 1471130918 & 4032 | var8 << 2034350924 & 61440 | 63 & param1[incrementValue$12];
                                  if ((var9 ^ -1) <= -2049) {
                                    break L3;
                                  } else {
                                    var9 = 65533;
                                    break L3;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var9 = 65533;
                          break L3;
                        } else {
                          if (var8 >= 248) {
                            var9 = 65533;
                            break L3;
                          } else {
                            L5: {
                              if (var6 - -2 >= var7) {
                                break L5;
                              } else {
                                if (128 != (192 & param1[var6])) {
                                  break L5;
                                } else {
                                  if ((param1[1 + var6] & 192) != 128) {
                                    break L5;
                                  } else {
                                    if ((param1[2 + var6] & 192) != 128) {
                                      break L5;
                                    } else {
                                      L6: {
                                        incrementValue$13 = var6;
                                        var6++;
                                        incrementValue$14 = var6;
                                        var6++;
                                        incrementValue$15 = var6;
                                        var6++;
                                        var9 = 258048 & param1[incrementValue$13] << -74573204 | 1835008 & var8 << 1214871954 | 4032 & param1[incrementValue$14] << -886791098 | param1[incrementValue$15] & 63;
                                        if (-65537 < (var9 ^ -1)) {
                                          break L6;
                                        } else {
                                          if (-1114112 > (var9 ^ -1)) {
                                            break L6;
                                          } else {
                                            var9 = 65533;
                                            break L3;
                                          }
                                        }
                                      }
                                      var9 = 65533;
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                            var9 = 65533;
                            break L3;
                          }
                        }
                      } else {
                        L7: {
                          if (var7 <= var6) {
                            break L7;
                          } else {
                            if (128 != (192 & param1[var6])) {
                              break L7;
                            } else {
                              incrementValue$16 = var6;
                              var6++;
                              var9 = (var8 & 31) << 731110502 | 63 & param1[incrementValue$16];
                              if ((var9 ^ -1) > -129) {
                                var9 = 65533;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        var9 = 65533;
                        break L3;
                      }
                    } else {
                      var9 = 65533;
                      break L3;
                    }
                  } else {
                    if (0 != var8) {
                      var9 = var8;
                      break L3;
                    } else {
                      var9 = 65533;
                      break L3;
                    }
                  }
                }
                incrementValue$17 = var5;
                var5++;
                var12[incrementValue$17] = (char)var9;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var4);
            stackOut_40_1 = new StringBuilder().append("ida.G(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L8;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_39_0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_o = null;
    }

    final static kv[] a(int param0, int param1, int param2, int param3) {
        if (param1 > -13) {
            return (kv[]) null;
        }
        return to.a(param0, param2, -25974, 1, param3);
    }

    final static pn a(int param0, vr param1, int param2) {
        RuntimeException var3 = null;
        pn stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        pn stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = vw.field_a[param2];
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ida.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -109) {
          L0: {
            this.field_l = 82;
            if (this.field_n <= this.field_q) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_n <= this.field_q) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        aga var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var4 = this.field_p.a(64, this.field_s.field_h);
        ad discarded$1 = this.field_s.b(var4, -23990);
        if (param2 == 27230) {
          this.field_l = 0;
          this.field_j = 0;
          this.field_n = 0;
          if ((param0 ^ -1) != -3) {
            if (-2 != (param0 ^ -1)) {
              if (4 != param0) {
                if ((param0 ^ -1) != -4) {
                  return;
                } else {
                  this.field_j = param1;
                  return;
                }
              } else {
                this.field_l = param1;
                return;
              }
            } else {
              this.field_j = -param1;
              return;
            }
          } else {
            this.field_l = -param1;
            return;
          }
        } else {
          this.field_n = -76;
          this.field_l = 0;
          this.field_j = 0;
          this.field_n = 0;
          if ((param0 ^ -1) != -3) {
            if (-2 != (param0 ^ -1)) {
              if (4 != param0) {
                if ((param0 ^ -1) != -4) {
                  return;
                } else {
                  this.field_j = param1;
                  return;
                }
              } else {
                this.field_l = param1;
                return;
              }
            } else {
              this.field_j = -param1;
              return;
            }
          } else {
            this.field_l = -param1;
            return;
          }
        }
    }

    final static n a(String param0, int param1) {
        n discarded$2 = null;
        RuntimeException var2 = null;
        String var3 = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        n stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -203) {
                break L1;
              } else {
                var3 = (String) null;
                discarded$2 = ida.a((String) null, -32);
                break L1;
              }
            }
            stackOut_2_0 = new n(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ida.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ida(gj param0, nq param1, int param2, int param3) {
        try {
            this.field_k = param2;
            this.field_s = param0;
            this.field_r = param3;
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ida.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_o = "Actions";
    }
}
