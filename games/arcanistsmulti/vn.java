/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    static int field_g;
    pg field_e;
    static int field_d;
    static in field_i;
    private pg field_h;
    static int field_c;
    static String field_j;
    static String field_a;
    static qb field_b;
    static String field_f;

    final pg a(boolean param0) {
        if (!param0) {
            return (pg) null;
        }
        pg var2 = this.field_e.field_a;
        if (!(this.field_e != var2)) {
            this.field_h = null;
            return null;
        }
        this.field_h = var2.field_a;
        return var2;
    }

    final pg c(boolean param0) {
        pg var2 = this.field_e.field_b;
        if (var2 == this.field_e) {
            return null;
        }
        var2.a(param0);
        return var2;
    }

    final pg d(boolean param0) {
        pg var2 = this.field_e.field_a;
        if (this.field_e == var2) {
            return null;
        }
        var2.a(param0);
        return var2;
    }

    final static void a(byte param0) {
        if (!(qe.field_p)) {
            throw new IllegalStateException();
        }
        lh.field_n = true;
        tj.a(true, (byte) -125);
        if (param0 != 4) {
            field_d = 12;
        }
        fj.field_j = 0;
    }

    private final void a(vn param0, int param1, pg param2) {
        pg var4 = null;
        pg var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                var5 = (pg) null;
                this.a((pg) null, -100);
                break L1;
              }
            }
            L2: {
              var4 = this.field_e.field_a;
              this.field_e.field_a = param2.field_a;
              param2.field_a.field_b = this.field_e;
              if (this.field_e == param2) {
                break L2;
              } else {
                param2.field_a = param0.field_e.field_a;
                param2.field_a.field_b = param2;
                var4.field_b = param0.field_e;
                param0.field_e.field_a = var4;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("vn.Q(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
    }

    final void a(vn param0, boolean param1) {
        try {
            this.a(param0, 3, this.field_e.field_b);
            if (param1) {
                eg var4 = (eg) null;
                vn.a((eg) null, false, (eg) null, (eg) null);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vn.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final pg a(int param0) {
        if (param0 != 0) {
            field_a = (String) null;
        }
        pg var2 = this.field_h;
        if (!(this.field_e != var2)) {
            this.field_h = null;
            return null;
        }
        this.field_h = var2.field_b;
        return var2;
    }

    final static void a(byte[] param0, int param1, int param2, int param3, int param4, int param5, int param6, byte[] param7, int param8, boolean param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        CharSequence var15 = null;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var11 = -(param1 >> 1836440002);
            param1 = -(param1 & 3);
            var12 = -param6;
            L1: while (true) {
              if (-1 >= (var12 ^ -1)) {
                L2: {
                  if (param3 >= 102) {
                    break L2;
                  } else {
                    var15 = (CharSequence) null;
                    vn.a((CharSequence) null, -78);
                    break L2;
                  }
                }
                break L0;
              } else {
                var13 = var11;
                L3: while (true) {
                  if (var13 >= 0) {
                    var13 = param1;
                    L4: while (true) {
                      if (-1 >= (var13 ^ -1)) {
                        param4 = param4 + param8;
                        param2 = param2 + param5;
                        var12++;
                        continue L1;
                      } else {
                        L5: {
                          L6: {
                            incrementValue$0 = param2;
                            param2++;
                            var10_int = param0[incrementValue$0];
                            if (var10_int == 0) {
                              break L6;
                            } else {
                              L7: {
                                if (param9) {
                                  break L7;
                                } else {
                                  if (-1 == (param7[param4] ^ -1)) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              incrementValue$1 = param4;
                              param4++;
                              param7[incrementValue$1] = (byte)var10_int;
                              break L5;
                            }
                          }
                          param4++;
                          break L5;
                        }
                        var13++;
                        continue L4;
                      }
                    }
                  } else {
                    L8: {
                      L9: {
                        incrementValue$2 = param2;
                        param2++;
                        var10_int = param0[incrementValue$2];
                        if (0 == var10_int) {
                          break L9;
                        } else {
                          L10: {
                            if (param9) {
                              break L10;
                            } else {
                              if (-1 == (param7[param4] ^ -1)) {
                                break L10;
                              } else {
                                break L9;
                              }
                            }
                          }
                          incrementValue$3 = param4;
                          param4++;
                          param7[incrementValue$3] = (byte)var10_int;
                          break L8;
                        }
                      }
                      param4++;
                      break L8;
                    }
                    L11: {
                      L12: {
                        incrementValue$4 = param2;
                        param2++;
                        var10_int = param0[incrementValue$4];
                        if (var10_int == 0) {
                          break L12;
                        } else {
                          L13: {
                            if (param9) {
                              break L13;
                            } else {
                              if (param7[param4] != 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          incrementValue$5 = param4;
                          param4++;
                          param7[incrementValue$5] = (byte)var10_int;
                          break L11;
                        }
                      }
                      param4++;
                      break L11;
                    }
                    L14: {
                      L15: {
                        incrementValue$6 = param2;
                        param2++;
                        var10_int = param0[incrementValue$6];
                        if (var10_int == 0) {
                          break L15;
                        } else {
                          L16: {
                            if (param9) {
                              break L16;
                            } else {
                              if (-1 == (param7[param4] ^ -1)) {
                                break L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                          incrementValue$7 = param4;
                          param4++;
                          param7[incrementValue$7] = (byte)var10_int;
                          break L14;
                        }
                      }
                      param4++;
                      break L14;
                    }
                    L17: {
                      L18: {
                        incrementValue$8 = param2;
                        param2++;
                        var10_int = param0[incrementValue$8];
                        if (var10_int == 0) {
                          break L18;
                        } else {
                          L19: {
                            if (param9) {
                              break L19;
                            } else {
                              if (-1 != (param7[param4] ^ -1)) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          incrementValue$9 = param4;
                          param4++;
                          param7[incrementValue$9] = (byte)var10_int;
                          break L17;
                        }
                      }
                      param4++;
                      break L17;
                    }
                    var13++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var10 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var10);

            stackIn_47_1 = new StringBuilder().append("vn.F(");

            if (param0 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L20;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L21;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L21;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_48_0), stackIn_51_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final pg a(pg param0, int param1) {
        pg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        pg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = this.field_e.field_b;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (this.field_e != var3) {
              this.field_h = var3.field_b;
              var4 = -40 / ((param1 - 22) / 52);
              stackIn_7_0 = (pg) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_h = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("vn.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (pg) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    final void a(pg param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0.field_a == null) {
                break L1;
              } else {
                param0.a(true);
                break L1;
              }
            }
            L2: {
              param0.field_a = this.field_e;
              param0.field_b = this.field_e.field_b;
              param0.field_a.field_b = param0;
              param0.field_b.field_a = param0;
              if (param1 == -58) {
                break L2;
              } else {
                this.field_e = (pg) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("vn.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final pg b(byte param0) {
        if (param0 < 16) {
            field_f = (String) null;
        }
        pg var2 = this.field_h;
        if (!(var2 != this.field_e)) {
            this.field_h = null;
            return null;
        }
        this.field_h = var2.field_a;
        return var2;
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!qc.a(param1 + 640, true, param0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2_int = param1;
              L1: while (true) {
                if (var2_int >= param0.length()) {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!qo.a(param0.charAt(var2_int), 0)) {
                    stackIn_10_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("vn.I(");

            if (param0 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    public vn() {
        this.field_e = new pg();
        this.field_e.field_a = this.field_e;
        this.field_e.field_b = this.field_e;
    }

    final void c(int param0) {
        int var2;
        pg var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 76 / ((-64 - param0) / 59);
        L0: while (true) {
          var3 = this.field_e.field_b;
          if (var3 != this.field_e) {
            var3.a(true);
            continue L0;
          } else {
            this.field_h = null;
            return;
          }
        }
    }

    public static void e(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
            eg var2 = (eg) null;
            vn.a((eg) null, false, (eg) null, (eg) null);
        }
        field_j = null;
        field_i = null;
        field_f = null;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            this.field_h = (pg) null;
        }
        return this.field_e == this.field_e.field_b ? true : false;
    }

    final void b(pg param0, int param1) {
        if (param1 != -1) {
            return;
        }
        try {
            if (null != param0.field_a) {
                param0.a(true);
            }
            param0.field_a = this.field_e.field_a;
            param0.field_b = this.field_e;
            param0.field_a.field_b = param0;
            param0.field_b.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(eg param0, boolean param1, eg param2, eg param3) {
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                vn.e(true);
                break L1;
              }
            }
            L2: {
              if (!param3.c(-10923)) {
                break L2;
              } else {
                if (!param3.a("commonui", -24417)) {
                  break L2;
                } else {
                  if (!param2.c(-10923)) {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (param2.a("commonui", -24417)) {
                      L3: {
                        if (!param0.c(-10923)) {
                          break L3;
                        } else {
                          if (param0.a("button.gif", -24417)) {
                            stackIn_18_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_6_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("vn.E(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    final pg b(int param0) {
        if (param0 != 12623) {
            field_c = -68;
        }
        pg var2 = this.field_e.field_b;
        if (!(var2 != this.field_e)) {
            this.field_h = null;
            return null;
        }
        this.field_h = var2.field_b;
        return var2;
    }

    static {
        field_g = 0;
        field_j = "The Book of Cogs is only available once you have purchased your first prestige hat, after having previously purchased all the other spells. Buy new spells by earning wands in Rated multiplayer games.";
        field_a = "  You summon your familiar by clicking the familiar icon on the game screen.";
    }
}
