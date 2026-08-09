/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static String field_e;
    static int field_c;
    static int[] field_b;
    double field_f;
    double field_a;
    static bd field_d;

    final void a(int param0, byte param1, double param2) {
        oc var6;
        param2 = param2 * 0.02454369260617026;
        if (param1 != 94) {
          var6 = (oc) null;
          og.a((byte) 120, (oc) null);
          this.field_f = this.field_f + (double)(-param0) * Math.sin(param2) / 20.0;
          this.field_a = this.field_a + Math.cos(param2) * (double)(-param0) / 20.0;
          return;
        } else {
          this.field_f = this.field_f + (double)(-param0) * Math.sin(param2) / 20.0;
          this.field_a = this.field_a + Math.cos(param2) * (double)(-param0) / 20.0;
          return;
        }
    }

    final boolean[] a(int param0, double param1, oc param2, boolean param3, id param4) {
        RuntimeException var7 = null;
        boolean[] stackIn_2_0 = null;
        boolean[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param3) {
              stackIn_4_0 = this.a(25302, false, param1, param0, param4, 1, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (boolean[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("og.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean[] a(double param0, oc param1, int param2, id param3, byte param4) {
        RuntimeException var7 = null;
        boolean[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 < -63) {
                break L1;
              } else {
                this.field_f = 2.317784439522071;
                break L1;
              }
            }
            stackIn_3_0 = this.a(25302, false, param0, param2, param3, 0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("og.K(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final void a(og param0, int param1) {
        try {
            this.field_f = param0.field_f;
            this.field_a = param0.field_a;
            if (param1 != -28860) {
                field_e = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "og.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ne var4 = null;
        de var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = (ne) ((Object) n.field_v.g(-97));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 == -22248) {
                    break L2;
                  } else {
                    og.a(-73, 61);
                    break L2;
                  }
                }
                var5 = (de) ((Object) ke.field_B.g(-47));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    km.a(var5, -19746, param1);
                    var5 = (de) ((Object) ke.field_B.a(12684));
                    continue L3;
                  }
                }
              } else {
                bl.a(1, var4, param1);
                var4 = (ne) ((Object) n.field_v.a(12684));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "og.A(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean[] a(oc param0, double param1, int param2, int param3, id param4) {
        RuntimeException var7 = null;
        boolean[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                this.a(-128, (byte) 30, 0.14322233202140824);
                break L1;
              }
            }
            stackIn_3_0 = this.a(25302, true, param1, param3, param4, 1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("og.I(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(double param0, double param1, int param2) {
        this.field_a = param0;
        if (param2 != 1) {
            og.a(47, -122);
            this.field_f = param1;
            return;
        }
        this.field_f = param1;
    }

    final static void a(byte param0, oc param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            vi.field_p = new oj[17];
            vi.field_p[0] = new oj(param1, 8, rl.field_c);
            vi.field_p[0].field_I = 1000;
            var2_int = 1;
            var3 = -18 % ((param0 - -14) / 46);
            L1: while (true) {
              if (vi.field_p.length <= var2_int) {
                var2_int = -1 + vi.field_p.length;
                L2: while (true) {
                  if (var2_int < 0) {
                    break L0;
                  } else {
                    mm.field_m[el.field_j] = vi.field_p[var2_int];
                    el.field_j = el.field_j + 1;
                    var2_int--;
                    continue L2;
                  }
                }
              } else {
                vi.field_p[var2_int] = new oj(param1, 231, rl.field_c);
                vi.field_p[var2_int].field_I = 200;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("og.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final boolean[] a(int param0, boolean param1, double param2, int param3, id param4, int param5, oc param6) {
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        boolean[] stackIn_62_0 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9_double = 0.0;
        RuntimeException var9 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        int var24_int = 0;
        double var24 = 0.0;
        int var25 = 0;
        int var26_int = 0;
        double var26 = 0.0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        id var33 = null;
        var32 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_double = 3.141592653589793 * param2 / 128.0;
              if (param0 == 25302) {
                break L1;
              } else {
                var33 = (id) null;
                this.a(-112, 0.23920950584503275, (oc) null, true, (id) null);
                break L1;
              }
            }
            L2: {
              var11 = Math.sin(var9_double) * (double)(-param3) / 40.0;
              if (var11 <= -0.01) {
                break L2;
              } else {
                if (var11 < 0.01) {
                  var11 = 0.0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var13 = Math.cos(var9_double) * (double)(-param3) / 40.0;
              if (var13 <= -0.01) {
                break L3;
              } else {
                if (0.01 > var13) {
                  var13 = 0.0;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var15 = var11;
              var17 = var13;
              var19 = param6.b(-4);
              var20 = var11;
              if (var11 * (this.field_f - 0.5) <= 0.0) {
                var20 = 0.0;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var22 = var13;
              if (var13 * (this.field_a - 0.5) <= 0.0) {
                var22 = 0.0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              L7: {
                if (var20 != 0.0) {
                  break L7;
                } else {
                  if (var22 != 0.0) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                if (0.0 <= var20) {
                  if (var20 > 0.0) {
                    stackIn_25_0 = 1;
                    break L8;
                  } else {
                    stackIn_25_0 = 0;
                    break L8;
                  }
                } else {
                  stackIn_25_0 = -1;
                  break L8;
                }
              }
              L9: {
                var24_int = stackIn_25_0;
                if (var22 >= 0.0) {
                  if (0.0 >= var22) {
                    stackIn_30_0 = 0;
                    break L9;
                  } else {
                    stackIn_30_0 = param4.field_d;
                    break L9;
                  }
                } else {
                  stackIn_30_0 = -param4.field_d;
                  break L9;
                }
              }
              L10: {
                var25 = stackIn_30_0;
                var26_int = var19 - -var24_int;
                var27 = var26_int - -var25;
                var28 = var25 + var19;
                if (param1) {
                  stackIn_33_0 = param4.b(param5, 5857, var27);
                  break L10;
                } else {
                  stackIn_33_0 = param4.c(param5, -2, var27);
                  break L10;
                }
              }
              L11: {
                var29 = stackIn_33_0;
                if (param1) {
                  stackIn_36_0 = param4.b(param5, param0 ^ 29751, var26_int);
                  break L11;
                } else {
                  stackIn_36_0 = param4.c(param5, param0 ^ -25304, var26_int);
                  break L11;
                }
              }
              L12: {
                var30 = stackIn_36_0;
                if (param1) {
                  stackIn_39_0 = param4.b(param5, 5857, var28);
                  break L12;
                } else {
                  stackIn_39_0 = param4.c(param5, -2, var28);
                  break L12;
                }
              }
              var31 = stackIn_39_0;
              if ((var29 ^ -1) < -2) {
                if (1 >= var30) {
                  var22 = 0.0;
                  var13 = 0.0;
                  break L6;
                } else {
                  if ((var31 ^ -1) < -2) {
                    var20 = 0.0;
                    var22 = 0.0;
                    var11 = 0.0;
                    var13 = 0.0;
                    break L6;
                  } else {
                    var20 = 0.0;
                    var11 = 0.0;
                    break L6;
                  }
                }
              } else {
                L13: {
                  if (-2 <= (var30 ^ -1)) {
                    break L13;
                  } else {
                    var20 = 0.0;
                    var11 = 0.0;
                    break L13;
                  }
                }
                if (1 < var31) {
                  var13 = 0.0;
                  var22 = 0.0;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L14: {
              this.field_a = this.field_a + var13;
              this.field_f = this.field_f + var11;
              var24 = var11 - var15;
              if (0.0 > var24) {
                var24 = -var24;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var26 = -var17 + var13;
              if (0.0 <= var26) {
                break L15;
              } else {
                var26 = -var26;
                break L15;
              }
            }
            L16: {
              if (0.01 >= var24) {
                stackIn_58_0 = 0;
                break L16;
              } else {
                stackIn_58_0 = 1;
                break L16;
              }
            }
            L17: {
              var28 = stackIn_58_0;
              if (0.01 >= var26) {
                stackIn_61_0 = 0;
                break L17;
              } else {
                stackIn_61_0 = 1;
                break L17;
              }
            }
            var29 = stackIn_61_0;
            stackIn_62_0 = new boolean[]{var28 != 0, var29 != 0};
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackIn_65_0 = (RuntimeException) (var9);

            stackIn_65_1 = new StringBuilder().append("og.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L18;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_68_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L19;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L19;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_66_0), stackIn_69_2 + ')');
        }
        return stackIn_62_0;
    }

    public final String toString() {
        return "(" + oc.a(-1, this.field_f) + "," + oc.a(-1, this.field_a) + ")";
    }

    final void b(double param0, double param1, int param2) {
        if (param2 <= 92) {
          this.a(41, (byte) -101, 1.4898316096248228);
          param1 = param1 * 0.02454369260617026;
          this.field_f = this.field_f + Math.sin(param1) * -param0 / 20.0;
          this.field_a = this.field_a + Math.cos(param1) * -param0 / 20.0;
          return;
        } else {
          param1 = param1 * 0.02454369260617026;
          this.field_f = this.field_f + Math.sin(param1) * -param0 / 20.0;
          this.field_a = this.field_a + Math.cos(param1) * -param0 / 20.0;
          return;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        if (param0 == -50) {
            return;
        }
        field_c = -117;
    }

    og() {
        this.field_f = 0.0;
        this.field_a = 0.0;
    }

    og(og param0) {
        try {
            this.field_f = param0.field_f;
            this.field_a = param0.field_a;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Vengeance";
        og discarded$0 = new og();
    }
}
