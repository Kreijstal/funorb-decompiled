/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc implements ntb {
    static int[] field_e;
    int field_d;
    boa field_f;
    static String field_a;
    private boolean[] field_c;
    static int field_b;

    private final void a(int param0, byte param1, int param2) {
        int[] var4;
        int var5;
        int var6;
        int[] var7;
        L0: {
          var6 = VoidHunters.field_G;
          if (null == this.field_f) {
            break L0;
          } else {
            var7 = this.field_f.field_c;
            var4 = var7;
            if (var7 != null) {
              var5 = 0;
              L1: while (true) {
                if (var7.length <= var5) {
                  break L0;
                } else {
                  if (param2 <= var7[var5]) {
                    var7[var5] = var7[var5] + param0;
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (param1 == 31) {
            break L2;
          } else {
            field_e = (int[]) null;
            break L2;
          }
        }
    }

    final void a(int param0, boolean[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if (this.field_c != null) {
                  var3_int = Math.min(param1.length, this.field_c.length);
                  var4 = 0;
                  L2: while (true) {
                    if (var3_int <= var4) {
                      break L1;
                    } else {
                      param1[var4] = this.field_c[var4];
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
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
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("kc.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void b(faa param0, int param1) {
        tv var4 = null;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              param0.a(-632, this.field_d, 8);
              qla.a(param0, (byte) -15, this.field_c, 8);
              stackIn_2_0 = (faa) (param0);

              stackIn_2_1 = 79;

              if (this.field_f == null) {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              } else {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
                break L1;
              }
            }
            L2: {
              if (!vq.a(stackIn_3_0, stackIn_3_1, stackIn_3_2 != 0)) {
                break L2;
              } else {
                this.field_f.b(param0, -126);
                break L2;
              }
            }
            L3: {
              if (param1 <= -109) {
                break L3;
              } else {
                var4 = (tv) null;
                this.a((byte) 81, (tv) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("kc.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        kc var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 112 % ((22 - param0) / 59);
                var3 = (kc) ((Object) param1);
                if (this.field_d != var3.field_d) {
                  break L2;
                } else {
                  if (it.a(var3.field_c, this.field_c, 32)) {
                    break L2;
                  } else {
                    L3: {
                      if (null != var3.field_f) {
                        stackIn_5_0 = 0;
                        break L3;
                      } else {
                        stackIn_5_0 = 1;
                        break L3;
                      }
                    }
                    L4: {


                      if (null != this.field_f) {

                        stackIn_8_1 = 0;
                        break L4;
                      } else {

                        stackIn_8_1 = 1;
                        break L4;
                      }
                    }
                    if ((stackIn_5_0 ^ stackIn_8_1) != 0) {
                      break L2;
                    } else {
                      L5: {
                        if (this.field_f == null) {
                          break L5;
                        } else {
                          if (!this.field_f.a((byte) 94, var3.field_f)) {
                            break L5;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      break L1;
                    }
                  }
                }
              }
              stackIn_14_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("kc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    public static void a(int param0) {
        if (param0 >= -68) {
            kc.a(10);
        }
        field_a = null;
        field_e = null;
    }

    private final void a(byte param0) {
        if (param0 < 46) {
            return;
        }
        if (!(0 != this.field_d)) {
            this.a(4, (byte) 31, 8);
        }
        this.field_d = 1;
    }

    final static void a(int param0, long[] param1, int param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4 > param2) {
                L2: {
                  var5_int = (param4 + param2) / 2;
                  var6 = param2;
                  var7 = param1[var5_int];
                  param1[var5_int] = param1[param4];
                  param1[param4] = var7;
                  var9 = param3[var5_int];
                  param3[var5_int] = param3[param4];
                  param3[param4] = var9;
                  if (9223372036854775807L != var7) {
                    stackIn_6_0 = 1;
                    break L2;
                  } else {
                    stackIn_6_0 = 0;
                    break L2;
                  }
                }
                var10 = stackIn_6_0;
                var11 = param2;
                L3: while (true) {
                  if (var11 >= param4) {
                    param1[param4] = param1[var6];
                    param1[var6] = var7;
                    param3[param4] = param3[var6];
                    param3[var6] = var9;
                    kc.a(-14677, param1, param2, param3, -1 + var6);
                    kc.a(-14677, param1, var6 - -1, param3, param4);
                    break L1;
                  } else {
                    L4: {
                      if ((param1[var11] ^ -1L) > ((long)(var10 & var11) + var7 ^ -1L)) {
                        var12 = param1[var11];
                        param1[var11] = param1[var6];
                        param1[var6] = var12;
                        var14 = param3[var11];
                        param3[var11] = param3[var6];
                        incrementValue$0 = var6;
                        var6++;
                        param3[incrementValue$0] = var14;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var11++;
                    continue L3;
                  }
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (param0 == -14677) {
                break L5;
              } else {
                field_a = (String) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("kc.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param4 + ')');
        }
    }

    final void a(boolean[] param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_c = param0;
              if (param1 == -28855) {
                break L1;
              } else {
                this.field_d = -112;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kc.E(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public kc() {
        this.field_d = 1;
    }

    public final void b(byte param0, tv param1) {
        kc var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param0 >= 54) {
                break L1;
              } else {
                field_b = 51;
                break L1;
              }
            }
            L2: {
              var3 = (kc) ((Object) param1);
              var3.field_d = this.field_d;
              var3.field_c = sab.a(var3.field_c, -31567, this.field_c);
              if (null == this.field_f) {
                var3.field_f = null;
                break L2;
              } else {
                L3: {
                  if (null == var3.field_f) {
                    var3.field_f = new boa();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_f.b((byte) 72, var3.field_f);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("kc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        kc var5 = null;
        try {
          L0: {
            L1: {
              var5 = (kc) ((Object) param0);
              if (null == this.field_f) {
                break L1;
              } else {
                if (var5.field_f == null) {
                  break L1;
                } else {
                  this.field_f.a(var5.field_f, -28);
                  break L1;
                }
              }
            }
            L2: {
              var4 = 0;
              if (this.field_d != var5.field_d) {
                var4 = 1;
                System.out.println("int version has changed. before=" + var5.field_d + ", now=" + this.field_d);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 < -19) {
                break L3;
              } else {
                this.a((byte) 101);
                break L3;
              }
            }
            L4: {
              if (!uca.a(this.field_c, var5.field_c, -48)) {
                break L4;
              } else {
                System.out.println("boolean[] tips_done has changed. ");
                var4 = 1;
                break L4;
              }
            }
            L5: {
              if (null != var5.field_f) {
                stackIn_13_0 = 0;
                break L5;
              } else {
                stackIn_13_0 = 1;
                break L5;
              }
            }
            L6: {


              if (null != this.field_f) {

                stackIn_16_1 = 0;
                break L6;
              } else {

                stackIn_16_1 = 1;
                break L6;
              }
            }
            L7: {
              L8: {
                if ((stackIn_13_0 ^ stackIn_16_1) != 0) {
                  break L8;
                } else {
                  if (this.field_f == null) {
                    break L7;
                  } else {
                    if (!this.field_f.a((byte) 121, var5.field_f)) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("ShipBlueprint blueprint has changed. before=" + var5.field_f + ", now=" + this.field_f);
              break L7;
            }
            L9: {
              if (var4 == 0) {
                break L9;
              } else {
                System.out.println("This instance of PlayerGameData has changed");
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("kc.F(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            this.field_d = param0.i(0, 8);
            this.field_c = nsa.a(8, param0, 76, this.field_c);
            if (!kv.a(param1, param0)) {
                this.field_f = null;
            } else {
                if (null == this.field_f) {
                    this.field_f = new boa();
                }
                this.field_f.a(param0, false);
            }
            this.a((byte) 58);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Lattice";
        field_b = 0;
    }
}
