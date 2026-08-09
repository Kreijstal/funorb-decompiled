/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    private int field_m;
    static String field_e;
    private boolean field_p;
    private int field_l;
    static boolean field_a;
    static int field_c;
    static jp field_d;
    private int field_b;
    static String field_n;
    static int field_j;
    static int[] field_o;
    private int field_h;
    jp[] field_f;
    jp field_k;
    static int field_g;
    private int field_i;

    public static void b(int param0) {
        if (param0 != 2) {
            return;
        }
        field_n = null;
        field_o = null;
        field_e = null;
        field_d = null;
    }

    final be b(int param0, byte param1) {
        if (param1 != -50) {
            this.a(true, -56);
            this.field_i = param0;
            return (be) (this);
        }
        this.field_i = param0;
        return (be) (this);
    }

    final be a(boolean param0, boolean param1) {
        String var4;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param0) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((be) (this)).field_p = stackIn_3_1 != 0;
        if (param1) {
          var4 = (String) null;
          be.a((mf) null, (String) null, -112, (String) null);
          return (be) (this);
        } else {
          return (be) (this);
        }
    }

    final be a(int param0, byte param1) {
        if (param1 != -69) {
            this.field_h = 10;
            this.field_l = param0;
            return (be) (this);
        }
        this.field_l = param0;
        return (be) (this);
    }

    final static String a(mf param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 94 % ((param2 - 52) / 42);
            if (!param0.a((byte) -127)) {
              stackIn_3_0 = (String) (param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_5_0 = param3 + " - " + param0.b(-4126) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("be.L(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    final void a(int param0, up param1, oc param2, byte param3, int param4) {
        dh stackIn_18_0 = null;
        String stackIn_18_1 = null;
        dh stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_21_5;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              nh.a(param2.field_t, param2.field_s, -40, param2.field_o + param4, this.field_f, param0 - -param2.field_w);
              if (null != this.field_k) {
                L2: {
                  var6_int = this.field_i + param2.field_o + param4;
                  if (param1.field_f != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param2.field_t + -this.field_k.field_x) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = this.field_m + (param0 - -param2.field_w);
                  if ((param1.field_m ^ -1) == -2) {
                    var7 = var7 + (-this.field_k.field_z + param2.field_s) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (2 == param1.field_f) {
                    var6_int = var6_int + (param2.field_t + -this.field_k.field_x);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((param1.field_m ^ -1) != -3) {
                    break L5;
                  } else {
                    var7 = var7 + (param2.field_s + -this.field_k.field_z);
                    break L5;
                  }
                }
                this.field_k.c(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6 = param1.a(param2, true);
              var7 = 3 % ((param3 - 13) / 43);
              if (var6 == null) {
                break L6;
              } else {
                if (param1.field_k == null) {
                  break L6;
                } else {
                  if (0 > this.field_h) {
                    break L6;
                  } else {
                    L7: {
                      stackIn_18_0 = param1.field_k;

                      stackIn_18_1 = (String) (var6);

                      if (2147483647 != (this.field_i ^ -1)) {
                        stackIn_19_0 = (dh) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) ((Object) stackIn_18_1);
                        stackIn_19_2 = this.field_i;
                        break L7;
                      } else {
                        stackIn_19_0 = (dh) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) ((Object) stackIn_18_1);
                        stackIn_19_2 = 0;
                        break L7;
                      }
                    }
                    L8: {




                      stackIn_21_2 = stackIn_19_2 + param1.field_d + (param4 - -param2.field_o);

                      stackIn_21_3 = param0;

                      stackIn_21_4 = -param2.field_w;

                      stackIn_21_5 = -param1.field_q;

                      if ((this.field_m ^ -1) == 2147483647) {
                        stackIn_19_0 = (dh) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = stackIn_21_3;
                        stackIn_22_4 = stackIn_21_4;
                        stackIn_22_5 = stackIn_21_5;
                        stackIn_22_6 = 0;
                        break L8;
                      } else {
                        stackIn_19_0 = (dh) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = stackIn_21_3;
                        stackIn_22_4 = stackIn_21_4;
                        stackIn_22_5 = stackIn_21_5;
                        stackIn_22_6 = this.field_m;
                        break L8;
                      }
                    }
                    L9: {






                      stackIn_24_3 = stackIn_22_3 - (stackIn_22_4 + (stackIn_22_5 - stackIn_22_6));

                      stackIn_24_4 = param2.field_t - param1.field_d + -param1.field_i;

                      stackIn_24_5 = -param1.field_q + (param2.field_s - param1.field_a);

                      stackIn_24_6 = this.field_h;

                      stackIn_24_7 = this.field_l;

                      if ((this.field_b ^ -1) == 2147483647) {
                        stackIn_19_0 = (dh) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);

                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = stackIn_24_6;
                        stackIn_25_7 = stackIn_24_7;
                        stackIn_25_8 = 256;
                        break L9;
                      } else {
                        stackIn_19_0 = (dh) ((Object) stackIn_19_0);
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
                    ((dh) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param1.field_f, param1.field_m, param1.field_h);
                    break L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var6_ref);

            stackIn_29_1 = new StringBuilder().append("be.E(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(be param0, int param1, up param2, oc param3, int param4, int param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_p) {
                break L1;
              } else {
                param0.a(param5, param2, param3, (byte) 99, param4);
                param0.a(-2147483648);
                break L1;
              }
            }
            L2: {
              if ((this.field_i ^ -1) != 2147483647) {
                param0.field_i = this.field_i;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_m == -2147483648) {
                break L3;
              } else {
                param0.field_m = this.field_m;
                break L3;
              }
            }
            L4: {
              if (null == this.field_k) {
                break L4;
              } else {
                param0.field_k = this.field_k;
                break L4;
              }
            }
            L5: {
              if (-1 <= this.field_h) {
                param0.field_h = this.field_h;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((this.field_l ^ -1) > 0) {
                break L6;
              } else {
                param0.field_l = this.field_l;
                break L6;
              }
            }
            L7: {
              if ((this.field_b ^ -1) != param1) {
                param0.field_b = this.field_b;
                break L7;
              } else {
                break L7;
              }
            }
            if (null != this.field_f) {
              param0.field_f = this.field_f;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("be.N(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static byte[] a(boolean param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        tl var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if (!(param1 instanceof byte[])) {
                if (!param0) {
                  if (!(param1 instanceof tl)) {
                    throw new IllegalArgumentException();
                  } else {
                    var4 = (tl) (param1);
                    stackIn_14_0 = var4.b(16616);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_11_0 = (byte[]) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                var3 = (byte[]) (param1);
                if (!param2) {
                  stackIn_8_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_6_0 = ke.a(false, var3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("be.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L1;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    final be a(int param0, int param1) {
        if (param0 != 0) {
            this.field_h = 14;
            this.field_m = param1;
            return (be) (this);
        }
        this.field_m = param1;
        return (be) (this);
    }

    final be a(boolean param0, int param1) {
        this.field_h = param1;
        if (param0) {
            this.a(false, 75);
            return (be) (this);
        }
        return (be) (this);
    }

    final void a(boolean param0, be param1) {
        try {
            if (param0) {
                Object var4 = (Object) null;
                be.a(true, (Object) null, true);
            }
            param1.field_k = this.field_k;
            param1.field_i = this.field_i;
            param1.field_p = this.field_p;
            param1.field_b = this.field_b;
            param1.field_h = this.field_h;
            param1.field_m = this.field_m;
            param1.field_f = this.field_f;
            param1.field_l = this.field_l;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "be.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1 = 47 % ((59 - param0) / 63);
        return tf.field_i;
    }

    final be a(jp[] param0, int param1) {
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
              if (param1 == -2147483648) {
                break L1;
              } else {
                field_o = (int[]) null;
                break L1;
              }
            }
            this.field_f = param0;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("be.J(");

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (be) (this);
    }

    final void a(int param0) {
        this.field_b = 256;
        this.field_h = 0;
        if (param0 != -2147483648) {
          return;
        } else {
          this.field_i = 0;
          this.field_m = 0;
          this.field_l = -1;
          this.field_f = null;
          this.field_k = null;
          return;
        }
    }

    be() {
        this.field_m = -2147483648;
        this.field_p = false;
        this.field_l = -2;
        this.field_b = -2147483648;
        this.field_h = -2;
        this.field_f = null;
        this.field_k = null;
        this.field_i = -2147483648;
    }

    static {
        field_c = 0;
        field_a = true;
        field_e = "Won";
        field_n = "You can ask to join this game";
        field_o = new int[]{20, 21, 36, 6, 8};
    }
}
