/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static ne[] field_c;
    static byte[] field_b;
    private int field_g;
    wb field_i;
    private int field_d;
    private int field_h;
    wb[] field_j;
    private boolean field_e;
    private int field_a;
    private int field_f;

    final void a(sm param0, byte param1) {
        try {
            if (param1 < 74) {
                field_b = (byte[]) null;
            }
            param0.field_d = this.field_d;
            param0.field_e = this.field_e;
            param0.field_h = this.field_h;
            param0.field_g = this.field_g;
            param0.field_i = this.field_i;
            param0.field_a = this.field_a;
            param0.field_f = this.field_f;
            param0.field_j = this.field_j;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "sm.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        this.field_d = 0;
        this.field_a = 0;
        this.field_i = null;
        if (!param0) {
            field_c = (ne[]) null;
        }
        this.field_g = 256;
        this.field_f = -1;
        this.field_h = 0;
        this.field_j = null;
    }

    final sm d(int param0, int param1) {
        this.field_f = param0;
        if (param1 != 30149) {
            this.field_g = -30;
        }
        return (sm) (this);
    }

    final sm a(wb[] param0, int param1) {
        RuntimeException var3 = null;
        sm stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 2147483647) {
              this.field_j = param0;
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (sm) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("sm.J(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (sm) (this);
        }
    }

    final static void a(int param0) {
        aa.field_a[0] = (ah) ((Object) new fe(81920, 61440));
        aa.field_a[0].field_I = !rf.a(false) ? 5 : 10;
        aa.field_a[0].field_y = !rf.a(false) ? 5 : 10;
        aa.field_a[0].field_t = rf.a(false) ? 10 : 5;
        if (param0 <= 68) {
            sm.a((byte) 108);
        }
        aa.field_a[0].c((byte) 35);
        fa.field_b = 250;
    }

    final sm a(int param0, int param1) {
        if (param1 != -1) {
            return (sm) null;
        }
        this.field_d = param0;
        return (sm) (this);
    }

    final sm c(int param0, int param1) {
        if (param1 != 17818) {
            this.field_a = 47;
        }
        this.field_a = param0;
        return (sm) (this);
    }

    final sm b(int param0, int param1) {
        this.field_h = param1;
        if (param0 != 1) {
            this.field_h = 21;
        }
        return (sm) (this);
    }

    final static short[] a(short[] param0, pl param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param1.b(param3, (byte) -109);
            if (var4_int != 0) {
              L1: {
                if (param2 < -111) {
                  break L1;
                } else {
                  sm.a((byte) -110);
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (param0 == null) {
                    break L3;
                  } else {
                    if (param0.length != var4_int) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L2;
              }
              L4: {
                var5 = param1.b(4, (byte) -94);
                var6 = (short)param1.b(16, (byte) -119);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param0[var7] = (short)(var6 + param1.b(var5, (byte) -123));
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param0[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (short[]) (param0);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("sm.K(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    final sm a(boolean param0, boolean param1) {
        this.field_e = param0 ? true : false;
        if (!param1) {
            this.d(124, 58);
        }
        return (sm) (this);
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -30) {
            field_c = (ne[]) null;
        }
    }

    sm() {
        this.field_g = -2147483648;
        this.field_i = null;
        this.field_j = null;
        this.field_d = -2147483648;
        this.field_f = -2;
        this.field_h = -2147483648;
        this.field_a = -2;
        this.field_e = false;
    }

    final void a(int param0, fl param1, int param2, int param3, pk param4) {
        vn stackIn_20_0 = null;
        String stackIn_20_1 = null;
        vn stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_27_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        try {
          L0: {
            L1: {
              kn.a(param2 + param4.field_r, this.field_j, (byte) -34, param4.field_v + param0, param4.field_p, param4.field_q);
              var6_int = -128 % ((param3 - -9) / 35);
              if (this.field_i != null) {
                L2: {
                  var7_int = this.field_d + (param2 + param4.field_r);
                  var8 = this.field_h + param4.field_v + param0;
                  if (1 == param1.field_f) {
                    var7_int = var7_int + (param4.field_q + -this.field_i.field_z) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-3 != (param1.field_f ^ -1)) {
                    break L3;
                  } else {
                    var7_int = var7_int + (param4.field_q - this.field_i.field_z);
                    break L3;
                  }
                }
                L4: {
                  if (1 == param1.field_c) {
                    var8 = var8 + (-this.field_i.field_w + param4.field_p) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 == param1.field_c) {
                    var8 = var8 + (-this.field_i.field_w + param4.field_p);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_i.a(var7_int, var8);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              L7: {
                var7 = param1.a(true, param4);
                if (var7 == null) {
                  break L7;
                } else {
                  if (param1.field_e == null) {
                    break L7;
                  } else {
                    if (-1 >= (this.field_a ^ -1)) {
                      L8: {
                        stackIn_20_0 = param1.field_e;

                        stackIn_20_1 = (String) (var7);

                        if (2147483647 == (this.field_d ^ -1)) {
                          stackIn_21_0 = (vn) ((Object) stackIn_20_0);
                          stackIn_21_1 = (String) ((Object) stackIn_20_1);
                          stackIn_21_2 = 0;
                          break L8;
                        } else {
                          stackIn_21_0 = (vn) ((Object) stackIn_20_0);
                          stackIn_21_1 = (String) ((Object) stackIn_20_1);
                          stackIn_21_2 = this.field_d;
                          break L8;
                        }
                      }
                      L9: {




                        stackIn_23_2 = stackIn_21_2 + (param1.field_k + (param4.field_r + param2));

                        stackIn_23_3 = param1.field_a + (param4.field_v + param0);

                        if (2147483647 == (this.field_h ^ -1)) {
                          stackIn_21_0 = (vn) ((Object) stackIn_21_0);
                          stackIn_21_1 = (String) ((Object) stackIn_21_1);
                          stackIn_24_2 = stackIn_23_2;
                          stackIn_24_3 = stackIn_23_3;
                          stackIn_24_4 = 0;
                          break L9;
                        } else {
                          stackIn_21_0 = (vn) ((Object) stackIn_21_0);
                          stackIn_21_1 = (String) ((Object) stackIn_21_1);
                          stackIn_24_2 = stackIn_23_2;
                          stackIn_24_3 = stackIn_23_3;
                          stackIn_24_4 = this.field_h;
                          break L9;
                        }
                      }
                      L10: {






                        stackIn_26_3 = stackIn_24_3 - -stackIn_24_4;

                        stackIn_26_4 = param4.field_q - (param1.field_k - -param1.field_h);

                        stackIn_26_5 = param4.field_p - (param1.field_a + param1.field_m);

                        stackIn_26_6 = this.field_a;

                        stackIn_26_7 = this.field_f;

                        if (2147483647 == (this.field_g ^ -1)) {
                          stackIn_21_0 = (vn) ((Object) stackIn_21_0);
                          stackIn_21_1 = (String) ((Object) stackIn_21_1);

                          stackIn_27_3 = stackIn_26_3;
                          stackIn_27_4 = stackIn_26_4;
                          stackIn_27_5 = stackIn_26_5;
                          stackIn_27_6 = stackIn_26_6;
                          stackIn_27_7 = stackIn_26_7;
                          stackIn_27_8 = 256;
                          break L10;
                        } else {
                          stackIn_21_0 = (vn) ((Object) stackIn_21_0);
                          stackIn_21_1 = (String) ((Object) stackIn_21_1);

                          stackIn_27_3 = stackIn_26_3;
                          stackIn_27_4 = stackIn_26_4;
                          stackIn_27_5 = stackIn_26_5;
                          stackIn_27_6 = stackIn_26_6;
                          stackIn_27_7 = stackIn_26_7;
                          stackIn_27_8 = this.field_g;
                          break L10;
                        }
                      }
                      ((vn) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param1.field_f, param1.field_c, param1.field_j);
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              break L6;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6);

            stackIn_31_1 = new StringBuilder().append("sm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L12;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ')');
        }
    }

    final void a(int param0, pk param1, int param2, fl param3, int param4, sm param5) {
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
        sm var8 = null;
        try {
          L0: {
            L1: {
              if (this.field_e) {
                param5.a(param4, param3, param0, 76, param1);
                param5.a(true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-2147483648 == this.field_h) {
                break L2;
              } else {
                param5.field_h = this.field_h;
                break L2;
              }
            }
            L3: {
              if (0 < (this.field_a ^ -1)) {
                break L3;
              } else {
                param5.field_a = this.field_a;
                break L3;
              }
            }
            L4: {
              if (null != this.field_i) {
                param5.field_i = this.field_i;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 <= this.field_f) {
                param5.field_f = this.field_f;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (this.field_g == -2147483648) {
                break L6;
              } else {
                param5.field_g = this.field_g;
                break L6;
              }
            }
            L7: {
              if (null == this.field_j) {
                break L7;
              } else {
                param5.field_j = this.field_j;
                break L7;
              }
            }
            L8: {
              if (this.field_d != -2147483648) {
                param5.field_d = this.field_d;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param2 <= -1) {
                break L9;
              } else {
                var8 = (sm) null;
                this.a(32, (pk) null, -99, (fl) null, 16, (sm) null);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("sm.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L11;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L12;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L12;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        int var3 = -2 % ((param0 - 62) / 63);
        String var4 = (String) null;
        ea.a(1, param2, (String) null, param1);
    }

    static {
    }
}
