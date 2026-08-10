/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class it extends ara implements ntb {
    int field_k;
    static String field_m;
    static int field_j;
    int field_l;
    int field_i;

    public final boolean a(byte param0, tv param1) {
        it var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 10 / ((22 - param0) / 59);
                var3 = (it) ((Object) param1);
                if (super.a((byte) -47, param1)) {
                  break L2;
                } else {
                  if (var3.field_k != this.field_k) {
                    break L2;
                  } else {
                    if (this.field_l != var3.field_l) {
                      break L2;
                    } else {
                      if (this.field_i == var3.field_i) {
                        stackIn_7_0 = 0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_7_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("it.C(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(lta param0, byte param1) {
        try {
            if (param1 >= -91) {
                tv var4 = (tv) null;
                this.b((byte) -77, (tv) null);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "it.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        it var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -71);
              var5 = (it) ((Object) param0);
              var4 = 0;
              if (var5.field_k != this.field_k) {
                System.out.println("int owner has changed. before=" + var5.field_k + ", now=" + this.field_k);
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < -19) {
                break L2;
              } else {
                this.field_i = 98;
                break L2;
              }
            }
            L3: {
              if (var5.field_l != this.field_l) {
                System.out.println("int team has changed. before=" + var5.field_l + ", now=" + this.field_l);
                var4 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var5.field_i == this.field_i) {
                break L4;
              } else {
                var4 = 1;
                System.out.println("int hyperdrive_timer has changed. before=" + var5.field_i + ", now=" + this.field_i);
                break L4;
              }
            }
            L5: {
              if (var4 != 0) {
                System.out.println("This instance of EscapePod has changed, where owner=" + this.field_k);
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("it.F(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
            super.b(param0, -111);
            if (param1 >= -109) {
                field_j = -125;
            }
            param0.a(-632, this.field_k, 32);
            param0.a(-632, this.field_l, 32);
            param0.a(-632, this.field_i, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "it.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean[] param0, boolean[] param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_30_0 = false;
        boolean stackIn_31_0 = false;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param2 == 32) {
              if (param1 == null) {
                L1: {
                  if (param0 == null) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 != null) {
                  if (param1.length != param0.length) {
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var3_int = 0;
                    var4 = -3 + param1.length;
                    L2: while (true) {
                      if (var3_int >= var4) {
                        var4 += 3;
                        L3: while (true) {
                          if (var3_int >= var4) {
                            stackIn_63_0 = 0;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          } else {
                            L4: {
                              if (param0[var3_int]) {
                                stackIn_55_0 = 0;
                                break L4;
                              } else {
                                stackIn_55_0 = 1;
                                break L4;
                              }
                            }
                            L5: {


                              if (param1[var3_int]) {

                                stackIn_58_1 = 0;
                                break L5;
                              } else {

                                stackIn_58_1 = 1;
                                break L5;
                              }
                            }
                            if (stackIn_55_0 == stackIn_58_1) {
                              var3_int++;
                              continue L3;
                            } else {
                              stackIn_60_0 = 1;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        }
                      } else {
                        L6: {
                          if (param1[var3_int]) {
                            stackIn_22_0 = 0;
                            break L6;
                          } else {
                            stackIn_22_0 = 1;
                            break L6;
                          }
                        }
                        L7: {


                          if (param0[var3_int]) {

                            stackIn_25_1 = 0;
                            break L7;
                          } else {

                            stackIn_25_1 = 1;
                            break L7;
                          }
                        }
                        if (stackIn_22_0 == stackIn_25_1) {
                          L8: {
                            var3_int++;
                            stackIn_30_0 = param1[var3_int];

                            if (param0[var3_int]) {
                              stackIn_31_0 = stackIn_30_0;
                              stackIn_31_1 = 0;
                              break L8;
                            } else {
                              stackIn_31_0 = stackIn_30_0;
                              stackIn_31_1 = 1;
                              break L8;
                            }
                          }
                          if ((stackIn_31_0 ? 1 : 0) == stackIn_31_1) {
                            stackIn_34_0 = 1;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3_int++;
                            if (param0[var3_int] != param1[var3_int]) {
                              stackIn_38_0 = 1;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              L9: {
                                var3_int++;
                                if (param1[var3_int]) {
                                  stackIn_42_0 = 0;
                                  break L9;
                                } else {
                                  stackIn_42_0 = 1;
                                  break L9;
                                }
                              }
                              L10: {


                                if (param0[var3_int]) {

                                  stackIn_45_1 = 0;
                                  break L10;
                                } else {

                                  stackIn_45_1 = 1;
                                  break L10;
                                }
                              }
                              if (stackIn_42_0 != stackIn_45_1) {
                                stackIn_48_0 = 1;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              } else {
                                var3_int++;
                                continue L2;
                              }
                            }
                          }
                        } else {
                          stackIn_27_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var3);

            stackIn_66_1 = new StringBuilder().append("it.A(");

            if (param0 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L11;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

            if (param1 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L12;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L12;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_67_0), stackIn_70_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_38_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_48_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_60_0 != 0;
                        } else {
                          return stackIn_63_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    it() {
        this.field_i = 3 * oq.field_l;
    }

    public static void c(int param0) {
        field_m = null;
        if (param0 != 3) {
            field_j = -19;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            this.field_k = param0.i(0, 32);
            this.field_l = param0.i(0, 32);
            this.field_i = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "it.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        it var5 = null;
        it var6 = null;
        super.b((byte) 110, param1);
        if (param0 < 54) {
            return;
        }
        try {
            var5 = (it) ((Object) param1);
            var6 = var5;
            var6.field_l = this.field_l;
            var6.field_i = this.field_i;
            var6.field_k = this.field_k;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "it.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(byte param0) {
        if (this.field_i > 0) {
            this.field_i = this.field_i - 1;
        }
        if (param0 != -7) {
            faa var3 = (faa) null;
            this.a((faa) null, false);
        }
    }

    static {
        field_m = "Please check if address is correct";
    }
}
