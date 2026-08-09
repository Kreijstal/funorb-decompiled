/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    private java.math.BigInteger field_i;
    private wk field_d;
    private lk field_l;
    private java.math.BigInteger field_j;
    static java.awt.Frame field_c;
    private vk field_h;
    private tj[] field_b;
    static String[] field_f;
    private pa field_e;
    static kc field_g;
    static m field_k;
    static String field_a;

    final boolean b(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        wk var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_d == null) {
          L0: {
            if (this.field_h != null) {
              break L0;
            } else {
              if (this.field_l.c((byte) 96)) {
                return false;
              } else {
                this.field_h = this.field_l.a(255, true, 255, (byte) -80, (byte) 0);
                break L0;
              }
            }
          }
          if (!this.field_h.field_p) {
            L1: {
              L2: {
                var10 = new wk(this.field_h.c(-20));
                var10.field_g = 5;
                var3 = var10.e((byte) 103);
                var10.field_g = var10.field_g + var3 * 72;
                var13 = new byte[-var10.field_g + var10.field_j.length];
                var11 = var13;
                var4 = var11;
                var10.a((byte) 74, 0, var4, var13.length);
                if (null == this.field_j) {
                  break L2;
                } else {
                  if (this.field_i == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_j, this.field_i);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            L3: {
              if (param0 == -52) {
                break L3;
              } else {
                this.field_e = (pa) null;
                break L3;
              }
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var15 = nn.a(var10.field_g - (var13.length - -5), (byte) -93, var10.field_j, 5);
              var7 = 0;
              L4: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  this.field_b = new tj[var3];
                  this.field_d = var10;
                  return true;
                } else {
                  if (var15[var7] != var5[1 + var7]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    gk(lk param0, pa param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final tj a(be param0, boolean param1, int param2, be param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        tj var9 = null;
        byte[] var13 = null;
        tj stackIn_10_0 = null;
        tj stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_d == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (0 > param4) {
                  break L1;
                } else {
                  if (this.field_b.length > param4) {
                    if (this.field_b[param4] != null) {
                      stackIn_10_0 = this.field_b[param4];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        this.field_d.field_g = 6 + 72 * param4;
                        if (param2 <= -51) {
                          break L2;
                        } else {
                          field_g = (kc) null;
                          break L2;
                        }
                      }
                      var6_int = this.field_d.d(-10674);
                      var7 = this.field_d.d(-10674);
                      var13 = new byte[64];
                      this.field_d.a((byte) 92, 0, var13, 64);
                      var9 = new tj(param4, param3, param0, this.field_l, this.field_e, var6_int, var13, var7, param1);
                      this.field_b[param4] = var9;
                      stackIn_14_0 = (tj) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("gk.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_c = null;
        field_g = null;
        if (param0 != -90) {
            field_a = (String) null;
        }
        field_f = null;
        field_a = null;
    }

    private gk(lk param0, pa param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_e = param1;
              this.field_i = param3;
              this.field_j = param2;
              this.field_l = param0;
              if (this.field_l.c((byte) -91)) {
                break L1;
              } else {
                this.field_h = this.field_l.a(255, true, 255, (byte) -80, (byte) 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("gk.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        tj stackIn_13_0 = null;
        CharSequence var4;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_b == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (this.field_b.length <= var2) {
              L1: {
                if (param0 == -8456) {
                  break L1;
                } else {
                  var4 = (CharSequence) null;
                  gk.a((CharSequence) null, 112);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (this.field_b.length <= var2) {
                  return;
                } else {
                  stackIn_13_0 = this.field_b[var2];
                  if (stackIn_13_0 != null) {
                    this.field_b[var2].f((byte) 59);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (this.field_b[var2] != null) {
                this.field_b[var2].a(false);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    final static String a(CharSequence param0, int param1) {
        StringBuilder discarded$0 = null;
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
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!rk.a((byte) 120, param0.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: {
                  if (param1 == -13) {
                    break L3;
                  } else {
                    field_g = (kc) null;
                    break L3;
                  }
                }
                L4: while (true) {
                  L5: {
                    if (var2_int >= var3) {
                      break L5;
                    } else {
                      if (!rk.a((byte) -16, param0.charAt(-1 + var3))) {
                        break L5;
                      } else {
                        var3--;
                        continue L4;
                      }
                    }
                  }
                  var4 = var3 + -var2_int;
                  if ((var4 ^ -1) <= -2) {
                    if ((var4 ^ -1) >= -13) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L6: while (true) {
                        if (var6 >= var3) {
                          if (var5.length() != 0) {
                            stackIn_29_0 = var5.toString();
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            stackIn_27_0 = null;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          }
                        } else {
                          L7: {
                            var7 = param0.charAt(var6);
                            if (qo.a((char) var7, param1 ^ -13)) {
                              var8 = af.a((char) var7, (byte) 22);
                              if (var8 == 0) {
                                break L7;
                              } else {
                                discarded$0 = var5.append((char) var8);
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var6++;
                          continue L6;
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
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("gk.C(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_27_0);
        } else {
          return stackIn_29_0;
        }
    }

    static {
        field_f = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = "MOST BOUNCY - ";
    }
}
