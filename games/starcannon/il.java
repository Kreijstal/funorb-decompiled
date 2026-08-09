/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    private int field_l;
    static id[] field_e;
    private boolean field_m;
    static int field_i;
    private int field_j;
    private int field_b;
    static String field_f;
    private int field_h;
    static int field_g;
    private int field_a;
    hl field_d;
    hl[] field_c;
    static tj field_k;

    final void a(il param0, int param1) {
        try {
            param0.field_a = this.field_a;
            param0.field_b = this.field_b;
            param0.field_h = this.field_h;
            param0.field_d = this.field_d;
            param0.field_c = this.field_c;
            param0.field_j = this.field_j;
            param0.field_m = this.field_m;
            if (param1 != -2147483648) {
                this.field_b = 55;
            }
            param0.field_l = this.field_l;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "il.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final il a(int param0, int param1) {
        if (param0 != 256) {
            this.field_d = (hl) null;
            this.field_j = param1;
            return (il) (this);
        }
        this.field_j = param1;
        return (il) (this);
    }

    final void a(il param0, int param1, int param2, uj param3, int param4, w param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (param4 == -1) {
                break L1;
              } else {
                il.b(111);
                break L1;
              }
            }
            L2: {
              if (this.field_m) {
                param0.a(param1, 21, param2, param5, param3);
                param0.a(30644);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (0 < (this.field_a ^ -1)) {
                break L3;
              } else {
                param0.field_a = this.field_a;
                break L3;
              }
            }
            L4: {
              if (2147483647 != (this.field_b ^ -1)) {
                param0.field_b = this.field_b;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((this.field_h ^ -1) == 2147483647) {
                break L5;
              } else {
                param0.field_h = this.field_h;
                break L5;
              }
            }
            L6: {
              if (null != this.field_d) {
                param0.field_d = this.field_d;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (null == this.field_c) {
                break L7;
              } else {
                param0.field_c = this.field_c;
                break L7;
              }
            }
            L8: {
              if (-2147483648 != this.field_j) {
                param0.field_j = this.field_j;
                break L8;
              } else {
                break L8;
              }
            }
            if (0 < (this.field_l ^ -1)) {
              break L0;
            } else {
              param0.field_l = this.field_l;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("il.D(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
    }

    final il a(byte param0, int param1) {
        this.field_l = param1;
        if (param0 > -77) {
            hl[] var4 = (hl[]) null;
            this.a((hl[]) null, (byte) -15);
            return (il) (this);
        }
        return (il) (this);
    }

    final il c(int param0, int param1) {
        if (param1 != 2) {
            return (il) null;
        }
        this.field_a = param0;
        return (il) (this);
    }

    final il a(int param0, boolean param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 > -29) {
          L0: {
            this.a(52, true);
            stackIn_7_0 = this;

            if (!param1) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((il) (this)).field_m = stackIn_8_1 != 0;
          return (il) (this);
        } else {
          L1: {
            stackIn_3_0 = this;

            if (!param1) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((il) (this)).field_m = stackIn_4_1 != 0;
          return (il) (this);
        }
    }

    final void a(int param0, int param1, int param2, w param3, uj param4) {
        qe stackIn_18_0 = null;
        String stackIn_18_1 = null;
        qe stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_25_8;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              ba.a(param4.field_f, this.field_c, (byte) 86, param4.field_s + param0, param4.field_i, param4.field_j + param2);
              if (null == this.field_d) {
                break L1;
              } else {
                L2: {
                  var6_int = param0 + param4.field_s - -this.field_h;
                  if (-2 != (param3.field_h ^ -1)) {
                    break L2;
                  } else {
                    var6_int = var6_int + (-this.field_d.field_x + param4.field_i) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = param2 + param4.field_j - -this.field_j;
                  if ((param3.field_a ^ -1) == -2) {
                    var7 = var7 + (-this.field_d.field_q + param4.field_f) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param3.field_h != 2) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param4.field_i - this.field_d.field_x);
                    break L4;
                  }
                }
                L5: {
                  if (-3 != (param3.field_a ^ -1)) {
                    break L5;
                  } else {
                    var7 = var7 + (-this.field_d.field_q + param4.field_f);
                    break L5;
                  }
                }
                this.field_d.e(var6_int, var7);
                break L1;
              }
            }
            var6 = param3.a(param4, false);
            if (param1 >= 13) {
              L6: {
                if (var6 == null) {
                  break L6;
                } else {
                  if (param3.field_f == null) {
                    break L6;
                  } else {
                    if (-1 < (this.field_a ^ -1)) {
                      break L6;
                    } else {
                      L7: {
                        stackIn_18_0 = param3.field_f;

                        stackIn_18_1 = (String) (var6);

                        if ((this.field_h ^ -1) == 2147483647) {
                          stackIn_19_0 = (qe) ((Object) stackIn_18_0);
                          stackIn_19_1 = (String) ((Object) stackIn_18_1);
                          stackIn_19_2 = 0;
                          break L7;
                        } else {
                          stackIn_19_0 = (qe) ((Object) stackIn_18_0);
                          stackIn_19_1 = (String) ((Object) stackIn_18_1);
                          stackIn_19_2 = this.field_h;
                          break L7;
                        }
                      }
                      L8: {




                        stackIn_21_2 = stackIn_19_2 + (param3.field_d + (param0 - -param4.field_s));

                        if (2147483647 == (this.field_j ^ -1)) {
                          stackIn_19_0 = (qe) ((Object) stackIn_19_0);
                          stackIn_19_1 = (String) ((Object) stackIn_19_1);
                          stackIn_22_2 = stackIn_21_2;
                          stackIn_22_3 = 0;
                          break L8;
                        } else {
                          stackIn_19_0 = (qe) ((Object) stackIn_19_0);
                          stackIn_19_1 = (String) ((Object) stackIn_19_1);
                          stackIn_22_2 = stackIn_21_2;
                          stackIn_22_3 = this.field_j;
                          break L8;
                        }
                      }
                      L9: {






                        stackIn_24_3 = stackIn_22_3 + param3.field_e + (param2 + param4.field_j);

                        stackIn_24_4 = -param3.field_o + -param3.field_d + param4.field_i;

                        stackIn_24_5 = -param3.field_e + param4.field_f + -param3.field_b;

                        stackIn_24_6 = this.field_a;

                        stackIn_24_7 = this.field_l;

                        if ((this.field_b ^ -1) == 2147483647) {
                          stackIn_19_0 = (qe) ((Object) stackIn_19_0);
                          stackIn_19_1 = (String) ((Object) stackIn_19_1);

                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = stackIn_24_5;
                          stackIn_25_6 = stackIn_24_6;
                          stackIn_25_7 = stackIn_24_7;
                          stackIn_25_8 = 256;
                          break L9;
                        } else {
                          stackIn_19_0 = (qe) ((Object) stackIn_19_0);
                          stackIn_19_1 = (String) ((Object) stackIn_19_1);

                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = stackIn_24_5;
                          stackIn_25_6 = stackIn_24_6;
                          stackIn_25_7 = stackIn_24_7;
                          stackIn_25_8 = this.field_b;
                          break L9;
                        }
                      }
                      ((qe) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param3.field_h, param3.field_a, param3.field_k);
                      break L6;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var6_ref);

            stackIn_29_1 = new StringBuilder().append("il.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final il a(hl[] param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -74) {
                break L1;
              } else {
                field_k = (tj) null;
                break L1;
              }
            }
            this.field_c = param0;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("il.K(");

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (il) (this);
    }

    final il b(int param0, int param1) {
        this.field_h = param0;
        int var3 = -45 / ((param1 - 10) / 53);
        return (il) (this);
    }

    public static void b(int param0) {
        if (param0 != 2147483647) {
          field_k = (tj) null;
          field_k = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_k = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final void a(int param0) {
        this.field_l = -1;
        this.field_h = 0;
        this.field_a = 0;
        if (param0 != 30644) {
          this.a(8, true);
          this.field_j = 0;
          this.field_d = null;
          this.field_c = null;
          this.field_b = 256;
          return;
        } else {
          this.field_j = 0;
          this.field_d = null;
          this.field_c = null;
          this.field_b = 256;
          return;
        }
    }

    il() {
        this.field_b = -2147483648;
        this.field_h = -2147483648;
        this.field_j = -2147483648;
        this.field_m = false;
        this.field_c = null;
        this.field_d = null;
        this.field_a = -2;
        this.field_l = -2;
    }

    static {
        field_f = "Please check if address is correct";
    }
}
